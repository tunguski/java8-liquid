package liqp.nodes;

import liqp.render.RenderingContext;

class AttributeNode implements LNode {

    private LNode key;
    private LNode value;

    public AttributeNode(LNode key, LNode value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public Object render(RenderingContext context) {

        return new Object[]{
                key.render(context),
                value.render(context)
        };
    }
}
