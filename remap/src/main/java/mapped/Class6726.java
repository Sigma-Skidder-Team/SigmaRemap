// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.svg.ParsingException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.w3c.dom.Element;

public class Class6726 implements Class6721
{
    private static int method20415(final Class2410 class2410, final Element element, final StringTokenizer stringTokenizer) throws ParsingException {
        int n = 0;
        final ArrayList list = new ArrayList();
        int n2 = 0;
        boolean b = false;
        while (stringTokenizer.hasMoreTokens()) {
            final String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("L")) {
                continue;
            }
            if (nextToken.equals("z")) {
                b = true;
                break;
            }
            if (nextToken.equals("M")) {
                if (n2 != 0) {
                    return 0;
                }
                n2 = 1;
            }
            else {
                if (nextToken.equals("C")) {
                    return 0;
                }
                final String s = nextToken;
                final String nextToken2 = stringTokenizer.nextToken();
                try {
                    class2410.method9617(Float.parseFloat(s), Float.parseFloat(nextToken2));
                    ++n;
                }
                catch (final NumberFormatException ex) {
                    throw new Class2325(element.getAttribute("id"), "Invalid token in points list", ex);
                }
            }
        }
        class2410.method9618(b);
        return n;
    }
    
    @Override
    public void method20411(final Class8813 class8813, final Element element, final Class5831 class8814, final Class7310 class8815) throws ParsingException {
        final Class7310 class8816 = new Class7310(class8815, Class8189.method27123(element));
        String str = element.getAttribute("points");
        if (element.getNodeName().equals("path")) {
            str = element.getAttribute("d");
        }
        final StringTokenizer stringTokenizer = new StringTokenizer(str, ", ");
        final Class2410 class8817 = new Class2410();
        final int method20415 = method20415(class8817, element, stringTokenizer);
        final Class8299 method20416 = Class8189.method27119(element);
        if (method20415 > 3) {
            class8814.method17528(new Class7567(5, class8817.method9519(class8816), method20416, class8816));
        }
    }
    
    @Override
    public boolean method20412(final Element element) {
        return element.getNodeName().equals("polygon") || (element.getNodeName().equals("path") && !"arc".equals(element.getAttributeNS("http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd", "type")));
    }
}
