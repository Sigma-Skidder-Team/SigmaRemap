// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.svg.ParsingException;
import org.w3c.dom.NodeList;
import java.util.ArrayList;
import org.w3c.dom.Element;
import org.newdawn.slick.Color;

public class Class6725 implements Class6721
{
    @Override
    public boolean method20412(final Element element) {
        return element.getNodeName().equals("defs");
    }
    
    @Override
    public void method20411(final Class8813 class8813, final Element element, final Class5831 class8814, final Class7310 class8815) throws ParsingException {
        final NodeList elementsByTagName = element.getElementsByTagName("pattern");
        for (int i = 0; i < elementsByTagName.getLength(); ++i) {
            final Element element2 = (Element)elementsByTagName.item(i);
            final NodeList elementsByTagName2 = element2.getElementsByTagName("image");
            if (elementsByTagName2.getLength() != 0) {
                class8814.method17522(element2.getAttribute("id"), ((Element)elementsByTagName2.item(0)).getAttributeNS("http://www.w3.org/1999/xlink", "href"));
            }
            else {
                Class8452.method28205("Pattern 1981 does not specify an image. Only image patterns are supported.");
            }
        }
        final NodeList elementsByTagName3 = element.getElementsByTagName("linearGradient");
        final ArrayList<Class5202> list = new ArrayList<Class5202>();
        for (int j = 0; j < elementsByTagName3.getLength(); ++j) {
            final Element element3 = (Element)elementsByTagName3.item(j);
            final String attribute = element3.getAttribute("id");
            final Class5202 e = new Class5202(attribute, false);
            e.method16270(Class8189.method27124(element3, "gradientTransform"));
            if (this.method20414(element3.getAttribute("x1")) > 0) {
                e.method16277(Float.parseFloat(element3.getAttribute("x1")));
            }
            if (this.method20414(element3.getAttribute("x2")) > 0) {
                e.method16278(Float.parseFloat(element3.getAttribute("x2")));
            }
            if (this.method20414(element3.getAttribute("y1")) > 0) {
                e.method16279(Float.parseFloat(element3.getAttribute("y1")));
            }
            if (this.method20414(element3.getAttribute("y2")) > 0) {
                e.method16280(Float.parseFloat(element3.getAttribute("y2")));
            }
            final String attributeNS = element3.getAttributeNS("http://www.w3.org/1999/xlink", "href");
            if (this.method20414(attributeNS) <= 0) {
                final NodeList elementsByTagName4 = element3.getElementsByTagName("stop");
                for (int k = 0; k < elementsByTagName4.getLength(); ++k) {
                    final Element element4 = (Element)elementsByTagName4.item(k);
                    final float float1 = Float.parseFloat(element4.getAttribute("offset"));
                    final String method27122 = Class8189.method27122(element4.getAttribute("style"), "stop-color");
                    final String method27123 = Class8189.method27122(element4.getAttribute("style"), "stop-opacity");
                    final Color class8816 = new Color(Integer.parseInt(method27122.substring(1), 16));
                    class8816.a = Float.parseFloat(method27123);
                    e.method16286(float1, class8816);
                }
                e.method16275();
            }
            else {
                e.method16272(attributeNS.substring(1));
                list.add(e);
            }
            class8814.method17523(attribute, e);
        }
        final NodeList elementsByTagName5 = element.getElementsByTagName("radialGradient");
        for (int l = 0; l < elementsByTagName5.getLength(); ++l) {
            final Element element5 = (Element)elementsByTagName5.item(l);
            final String attribute2 = element5.getAttribute("id");
            final Class5202 e2 = new Class5202(attribute2, true);
            e2.method16270(Class8189.method27124(element5, "gradientTransform"));
            if (this.method20414(element5.getAttribute("cx")) > 0) {
                e2.method16277(Float.parseFloat(element5.getAttribute("cx")));
            }
            if (this.method20414(element5.getAttribute("cy")) > 0) {
                e2.method16279(Float.parseFloat(element5.getAttribute("cy")));
            }
            if (this.method20414(element5.getAttribute("fx")) > 0) {
                e2.method16278(Float.parseFloat(element5.getAttribute("fx")));
            }
            if (this.method20414(element5.getAttribute("fy")) > 0) {
                e2.method16280(Float.parseFloat(element5.getAttribute("fy")));
            }
            if (this.method20414(element5.getAttribute("r")) > 0) {
                e2.method16276(Float.parseFloat(element5.getAttribute("r")));
            }
            final String attributeNS2 = element5.getAttributeNS("http://www.w3.org/1999/xlink", "href");
            if (this.method20414(attributeNS2) <= 0) {
                final NodeList elementsByTagName6 = element5.getElementsByTagName("stop");
                for (int n = 0; n < elementsByTagName6.getLength(); ++n) {
                    final Element element6 = (Element)elementsByTagName6.item(n);
                    final float float2 = Float.parseFloat(element6.getAttribute("offset"));
                    final String method27124 = Class8189.method27122(element6.getAttribute("style"), "stop-color");
                    final String method27125 = Class8189.method27122(element6.getAttribute("style"), "stop-opacity");
                    final Color class8817 = new Color(Integer.parseInt(method27124.substring(1), 16));
                    class8817.a = Float.parseFloat(method27125);
                    e2.method16286(float2, class8817);
                }
                e2.method16275();
            }
            else {
                e2.method16272(attributeNS2.substring(1));
                list.add(e2);
            }
            class8814.method17523(attribute2, e2);
        }
        for (int n2 = 0; n2 < list.size(); ++n2) {
            list.get(n2).method16273(class8814);
            list.get(n2).method16275();
        }
    }
    
    private int method20414(final String s) {
        if (s != null) {
            return s.length();
        }
        return 0;
    }
}
