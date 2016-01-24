package liqp.nodes;

import liqp.filters.Filter;
import liqp.render.RenderingContext;

import java.util.ArrayList;
import java.util.List;

public class FilterNode implements LNode {

    private Filter filter;
    private List<LNode> params;

    public FilterNode(String filterName, Filter filter) {
        if (filter == null) {
            throw new IllegalArgumentException("no filter available  named: " + filterName);
        }
        this.filter = filter;
        this.params = new ArrayList<LNode>();
    }

    public void add(LNode param) {
        params.add(param);
    }

    public Object apply(Object value, RenderingContext variables) {

        List<Object> paramValues = new ArrayList<Object>();

        for (LNode node : params) {
            paramValues.add(node.render(variables));
        }

        return filter.apply(value, paramValues.toArray(new Object[paramValues.size()]));
    }

    @Override
    public Object render(RenderingContext context) {
        throw new RuntimeException("cannot render a filter");
    }
}
