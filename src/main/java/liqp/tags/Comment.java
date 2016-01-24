package liqp.tags;

import liqp.nodes.LNode;
import liqp.render.RenderingContext;

class Comment extends Tag {

    /*
     * Block tag, comments out the text in the block
     */
    @Override
    public Object render(RenderingContext context, LNode... nodes) {
        return "";
    }
}
