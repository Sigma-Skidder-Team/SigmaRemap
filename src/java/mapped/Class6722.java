// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.newdawn.slick.svg.ParsingException;
import org.w3c.dom.Element;

public class Class6722 implements Class6721
{
    @Override
    public void method20411(final Class8813 class8813, final Element element, final Class5831 class8814, final Class7310 class8815) throws ParsingException {
        final Class7310 class8816 = new Class7310(class8815, Class8189.method27123(element));
        final float float1 = Float.parseFloat(element.getAttribute("width"));
        final float float2 = Float.parseFloat(element.getAttribute("height"));
        final float float3 = Float.parseFloat(element.getAttribute("x"));
        final float float4 = Float.parseFloat(element.getAttribute("y"));
        final Class2400 method9519 = new Class2403(float3, float4, float1 + 1.0f, float2 + 1.0f).method9519(class8816);
        final Class8299 method9520 = Class8189.method27119(element);
        method9520.method27582("width", "" + float1);
        method9520.method27582("height", "" + float2);
        method9520.method27582("x", "" + float3);
        method9520.method27582("y", "" + float4);
        class8814.method17528(new Class7567(3, method9519, method9520, class8816));
    }
    
    @Override
    public boolean method20412(final Element element) {
        return element.getNodeName().equals("rect");
    }
}
