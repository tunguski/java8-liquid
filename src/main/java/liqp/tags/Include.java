package liqp.tags;

import liqp.Template;
import liqp.nodes.LNode;
import liqp.render.RenderingContext;

import java.io.File;

class Include extends Tag {

    public static File snippetsFolder = new File("snippets");
    public static String extension = ".liquid";

    @Override
    public Object render(RenderingContext context, LNode... nodes) {

        try {
            String fileNameWithoutExt = super.asString(nodes[0].render(context));

            Template include = Template.parse(new File(snippetsFolder, fileNameWithoutExt + extension));

            // check if there's a optional "with expression"
            if(nodes.length > 1) {
                Object value = nodes[1].render(context);
                context.put(fileNameWithoutExt, value);
            }

            return include.render(context);

        } catch(Exception e) {
            return "";
        }
    }
}
