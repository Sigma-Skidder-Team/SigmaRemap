// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.svg.ParsingException;
import org.w3c.dom.Element;

public class Class6728 implements Class6721
{
    @Override
    public boolean method20412(final Element element) {
        return element.getNodeName().equals("use");
    }
    
    @Override
    public void method20411(final Class8813 class8813, final Element element, final Class5831 class8814, final Class7310 class8815) throws ParsingException {
        final String method27126 = Class8189.method27126(element.getAttributeNS("http://www.w3.org/1999/xlink", "href"));
        final Class7567 method27127 = class8814.method17527(method27126);
        if (method27127 != null) {
            final Class7310 method27128 = Class8189.method27123(element).method22420(method27127.method23754());
            final Class8299 method27129 = Class8189.method27119(element);
            final Class2400 method27130 = method27127.method23756().method9519(method27128);
            method27129.method27582("fill", method27127.method23757().method27579("fill"));
            method27129.method27582("stroke", method27127.method23757().method27579("stroke"));
            method27129.method27582("opacity", method27127.method23757().method27579("opacity"));
            method27129.method27582("stroke-width", method27127.method23757().method27579("stroke-width"));
            class8814.method17528(new Class7567(method27127.method23755(), method27130, method27129, method27128));
            return;
        }
        throw new Class2325(element, "Unable to locate referenced element: " + method27126);
    }
}
