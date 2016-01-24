package liqp.nodes;

import liqp.render.RenderingContext;

public class AtomNode implements LNode {

    public static final AtomNode EMPTY = new AtomNode(new Object());

    private Object value;

    public AtomNode(Object value) {
        this.value = value;
    }

    public static boolean isEmpty(Object o) {
        return o == EMPTY.value;
    }

    @Override
    public Object render(RenderingContext context) {

        return value;
    }
}
