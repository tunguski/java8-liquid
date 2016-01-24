package liqp.tags;

import liqp.nodes.LNode;
import liqp.render.RenderingContext;

class Raw extends Tag {

    /*
     * temporarily disable tag processing to avoid syntax conflicts.
     */
    @Override
    public Object render(RenderingContext context, LNode... nodes) {
        return nodes[0].render(context);
    }
}
