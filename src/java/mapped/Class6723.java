// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.svg.ParsingException;
import java.util.StringTokenizer;
import org.w3c.dom.Element;

public class Class6723 implements Class6721
{
    private static int method20413(final Class2410 class2410, final Element element, final StringTokenizer stringTokenizer) throws ParsingException {
        int n = 0;
        while (stringTokenizer.hasMoreTokens()) {
            final String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("L")) {
                continue;
            }
            if (nextToken.equals("z")) {
                break;
            }
            if (nextToken.equals("M")) {
                continue;
            }
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
        return n;
    }
    
    @Override
    public void method20411(final Class8813 class8813, final Element element, final Class5831 class8814, final Class7310 class8815) throws ParsingException {
        final Class7310 class8816 = new Class7310(class8815, Class8189.method27123(element));
        float float1;
        float float2;
        float float3;
        float float4;
        if (!element.getNodeName().equals("line")) {
            final StringTokenizer stringTokenizer = new StringTokenizer(element.getAttribute("d"), ", ");
            final Class2410 class8817 = new Class2410();
            if (method20413(class8817, element, stringTokenizer) != 2) {
                return;
            }
            float1 = class8817.method9538(0)[0];
            float2 = class8817.method9538(0)[1];
            float3 = class8817.method9538(1)[0];
            float4 = class8817.method9538(1)[1];
        }
        else {
            float1 = Float.parseFloat(element.getAttribute("x1"));
            float3 = Float.parseFloat(element.getAttribute("x2"));
            float2 = Float.parseFloat(element.getAttribute("y1"));
            float4 = Float.parseFloat(element.getAttribute("y2"));
        }
        final float[] array = { float1, float2, float3, float4 };
        final float[] array2 = new float[4];
        class8816.method22419(array, 0, array2, 0, 2);
        final Class2402 class8818 = new Class2402(array2[0], array2[1], array2[2], array2[3]);
        final Class8299 method27119 = Class8189.method27119(element);
        method27119.method27582("x1", "" + float1);
        method27119.method27582("x2", "" + float3);
        method27119.method27582("y1", "" + float2);
        method27119.method27582("y2", "" + float4);
        class8814.method17528(new Class7567(2, class8818, method27119, class8816));
    }
    
    @Override
    public boolean method20412(final Element element) {
        return element.getNodeName().equals("line") || (element.getNodeName().equals("path") && !"arc".equals(element.getAttributeNS("http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd", "type")));
    }
}
