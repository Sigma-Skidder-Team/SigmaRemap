// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.svg.ParsingException;
import org.w3c.dom.Element;

public class Class6724 implements Class6721
{
    @Override
    public void method20411(final Class8813 class8813, final Element element, final Class5831 class8814, final Class7310 class8815) throws ParsingException {
        final Class7310 class8816 = new Class7310(class8815, Class8189.method27123(element));
        final float method27125 = Class8189.method27125(element, "cx");
        final float method27126 = Class8189.method27125(element, "cy");
        final float method27127 = Class8189.method27125(element, "rx");
        final float method27128 = Class8189.method27125(element, "ry");
        final Class2400 method27129 = new Class2406(method27125, method27126, method27127, method27128).method9519(class8816);
        final Class8299 method27130 = Class8189.method27119(element);
        method27130.method27582("cx", "" + method27125);
        method27130.method27582("cy", "" + method27126);
        method27130.method27582("rx", "" + method27127);
        method27130.method27582("ry", "" + method27128);
        class8814.method17528(new Class7567(1, method27129, method27130, class8816));
    }
    
    @Override
    public boolean method20412(final Element element) {
        return element.getNodeName().equals("ellipse") || (element.getNodeName().equals("path") && "arc".equals(element.getAttributeNS("http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd", "type")));
    }
}
