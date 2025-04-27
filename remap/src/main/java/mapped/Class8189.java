// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.svg.ParsingException;
import java.util.StringTokenizer;
import org.w3c.dom.Element;

public class Class8189
{
    public static final String field33702 = "http://www.inkscape.org/namespaces/inkscape";
    public static final String field33703 = "http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd";
    public static final String field33704 = "http://www.w3.org/1999/xlink";
    
    public static Class8299 method27119(final Element element) {
        final Class8298 class8298 = new Class8298(method27120(element), element);
        class8298.method27582("id", element.getAttribute("id"));
        class8298.method27582("fill", method27121(element, "fill"));
        class8298.method27582("stroke", method27121(element, "stroke"));
        class8298.method27582("opacity", method27121(element, "opacity"));
        class8298.method27582("stroke-dasharray", method27121(element, "stroke-dasharray"));
        class8298.method27582("stroke-dashoffset", method27121(element, "stroke-dashoffset"));
        class8298.method27582("stroke-miterlimit", method27121(element, "stroke-miterlimit"));
        class8298.method27582("stroke-opacity", method27121(element, "stroke-opacity"));
        class8298.method27582("stroke-width", method27121(element, "stroke-width"));
        return class8298;
    }
    
    public static String method27120(final Element element) {
        final String attributeNS = element.getAttributeNS("http://www.inkscape.org/namespaces/inkscape", "label");
        if (attributeNS != null && !attributeNS.equals("")) {
            return attributeNS;
        }
        return element.getAttribute("id");
    }
    
    public static String method27121(final Element element, final String s) {
        final String attribute = element.getAttribute(s);
        if (attribute != null && attribute.length() > 0) {
            return attribute;
        }
        return method27122(element.getAttribute("style"), s);
    }
    
    public static String method27122(final String str, final String anObject) {
        if (str != null) {
            final StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
            while (stringTokenizer.hasMoreTokens()) {
                final String nextToken = stringTokenizer.nextToken();
                if (!nextToken.substring(0, nextToken.indexOf(58)).equals(anObject)) {
                    continue;
                }
                return nextToken.substring(nextToken.indexOf(58) + 1);
            }
            return "";
        }
        return "";
    }
    
    public static Class7310 method27123(final Element element) {
        return method27124(element, "transform");
    }
    
    public static Class7310 method27124(final Element element, final String s) {
        final String attribute = element.getAttribute(s);
        if (attribute == null) {
            return new Class7310();
        }
        if (attribute.equals("")) {
            return new Class7310();
        }
        if (attribute.startsWith("translate")) {
            final StringTokenizer stringTokenizer = new StringTokenizer(attribute.substring(0, attribute.length() - 1).substring("translate(".length()), ", ");
            return Class7310.method22424(Float.parseFloat(stringTokenizer.nextToken()), Float.parseFloat(stringTokenizer.nextToken()));
        }
        if (!attribute.startsWith("matrix")) {
            return new Class7310();
        }
        final float[] array = new float[6];
        final StringTokenizer stringTokenizer2 = new StringTokenizer(attribute.substring(0, attribute.length() - 1).substring("matrix(".length()), ", ");
        final float[] array2 = new float[6];
        for (int i = 0; i < array2.length; ++i) {
            array2[i] = Float.parseFloat(stringTokenizer2.nextToken());
        }
        array[0] = array2[0];
        array[1] = array2[2];
        array[2] = array2[4];
        array[3] = array2[1];
        array[4] = array2[3];
        array[5] = array2[5];
        return new Class7310(array);
    }
    
    public static float method27125(final Element element, final String str) throws ParsingException {
        String s = element.getAttribute(str);
        if (s == null || s.equals("")) {
            s = element.getAttributeNS("http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd", str);
        }
        try {
            return Float.parseFloat(s);
        }
        catch (final NumberFormatException ex) {
            throw new Class2325(element, "Invalid value for: " + str, ex);
        }
    }
    
    public static String method27126(String substring) {
        if (substring.length() >= 2) {
            substring = substring.substring(1);
            return substring;
        }
        return "";
    }
}
