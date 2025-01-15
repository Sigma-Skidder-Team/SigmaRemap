// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.svg.ParsingException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.w3c.dom.Element;

public class Class6729 implements Class6721
{
    private static Class2409 method20416(final Element element, final StringTokenizer stringTokenizer) throws ParsingException {
        final ArrayList list = new ArrayList();
        int n = 0;
        boolean b = false;
        Class2409 class2409 = null;
        while (stringTokenizer.hasMoreTokens()) {
            try {
                final String nextToken = stringTokenizer.nextToken();
                if (nextToken.equals("L")) {
                    class2409.method9611(Float.parseFloat(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken()));
                    continue;
                }
                if (nextToken.equals("z")) {
                    class2409.method9612();
                    continue;
                }
                if (nextToken.equals("M")) {
                    if (n == 0) {
                        n = 1;
                        class2409 = new Class2409(Float.parseFloat(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken()));
                        continue;
                    }
                    b = true;
                    class2409.method9610(Float.parseFloat(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken()));
                    continue;
                }
                else {
                    if (nextToken.equals("C")) {
                        b = true;
                        class2409.method9613(Float.parseFloat(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken()));
                        continue;
                    }
                    continue;
                }
            }
            catch (final NumberFormatException ex) {
                throw new Class2325(element.getAttribute("id"), "Invalid token in points list", ex);
            }
            break;
        }
        if (!b) {
            return null;
        }
        return class2409;
    }
    
    @Override
    public void method20411(final Class8813 class8813, final Element element, final Class5831 class8814, final Class7310 class8815) throws ParsingException {
        final Class7310 class8816 = new Class7310(class8815, Class8189.method27123(element));
        String str = element.getAttribute("points");
        if (element.getNodeName().equals("path")) {
            str = element.getAttribute("d");
        }
        final Class2409 method20416 = method20416(element, new StringTokenizer(str, ", "));
        final Class8299 method20417 = Class8189.method27119(element);
        if (method20416 != null) {
            class8814.method17528(new Class7567(4, method20416.method9519(class8816), method20417, class8816));
        }
    }
    
    @Override
    public boolean method20412(final Element element) {
        return element.getNodeName().equals("path") && !"arc".equals(element.getAttributeNS("http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd", "type"));
    }
}
