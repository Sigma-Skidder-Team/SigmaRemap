// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.svg.ParsingException;
import org.w3c.dom.Element;

public class Class6727 implements Class6721
{
    @Override
    public boolean method20412(final Element element) {
        return element.getNodeName().equals("g");
    }
    
    @Override
    public void method20411(final Class8813 class8813, final Element element, final Class5831 class8814, final Class7310 class8815) throws ParsingException {
        class8813.method30750(element, new Class7310(class8815, Class8189.method27123(element)));
    }
}
