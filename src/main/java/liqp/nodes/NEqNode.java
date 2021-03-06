package liqp.nodes;

import liqp.LValue;
import liqp.render.RenderingContext;

class NEqNode implements LNode {

    private LNode lhs;
    private LNode rhs;

    public NEqNode(LNode lhs, LNode rhs) {
        this.lhs = lhs;
        this.rhs = rhs;
    }

    @Override
    public Object render(RenderingContext context) {

        Object a = lhs.render(context);
        Object b = rhs.render(context);

        return !LValue.areEqual(a, b);

    }
}
