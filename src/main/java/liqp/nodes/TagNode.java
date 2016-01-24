package liqp.nodes;

import liqp.render.RenderingContext;
import liqp.tags.Tag;

class TagNode implements LNode {

    private Tag tag;
    private LNode[] tokens;

    public TagNode(String tagName, Tag tag, LNode... tokens) {
        if (tag == null) {
            throw new IllegalArgumentException("no tag available named: " + tagName);
        }
        this.tag = tag;
        this.tokens = tokens;
    }

    @Override
    public Object render(RenderingContext context) {

        return tag.render(context, tokens);
    }
}
