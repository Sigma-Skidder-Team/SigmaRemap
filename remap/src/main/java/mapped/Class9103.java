// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Properties;

public class Class9103
{
    private final ResourceLocation field38550;
    private int field38551;
    private int field38552;
    private final boolean field38553;
    private static final int field38554 = 2;
    private static final int field38555 = 0;
    private static final int field38556 = 1;
    private static final int field38557 = 2;
    
    public Class9103(final ResourceLocation field38550, final int field38551, final int field38552, final boolean field38553) {
        this.field38551 = 0;
        this.field38552 = 2;
        this.field38550 = field38550;
        this.field38551 = field38551;
        this.field38552 = field38552;
        this.field38553 = field38553;
    }
    
    public static Class9103 method32897(final String s, final int n, final Properties properties) {
        final ResourceLocation class1932 = new ResourceLocation(s);
        final int method32899 = method32899(method32898("scaleMode", n, properties));
        return new Class9103(class1932, method32899, method32900(method32898("scale", n, properties), (method32899 != 0) ? 1 : 2), Config.method28935(method32898("center", n, properties), false));
    }
    
    private static String method32898(final String s, final int i, final Properties properties) {
        if (properties == null) {
            return null;
        }
        final String property = properties.getProperty("dim" + i + "." + s);
        if (property == null) {
            return properties.getProperty(s);
        }
        return property;
    }
    
    private static int method32899(String trim) {
        if (trim == null) {
            return 0;
        }
        trim = trim.toLowerCase().trim();
        if (trim.equals("fixed")) {
            return 0;
        }
        if (trim.equals("full")) {
            return 1;
        }
        if (!trim.equals("stretch")) {
            Class9203.method33678("Invalid scale mode: " + trim);
            return 0;
        }
        return 2;
    }
    
    private static int method32900(String trim, final int n) {
        if (trim == null) {
            return n;
        }
        trim = trim.trim();
        final int method28933 = Config.method28933(trim, -1);
        if (method28933 >= 1) {
            return method28933;
        }
        Class9203.method33678("Invalid scale: " + trim);
        return n;
    }
    
    public void method32901(final int a, final int b) {
        Class8933.method31506();
        Class8933.method31585();
        final Tessellator method22694 = Tessellator.getInstance();
        final BufferBuilder method22695 = method22694.getBuffer();
        Config.method28895().method5849(this.field38550);
        Class8933.method31646(1.0f, 1.0f, 1.0f, 1.0f);
        final float n = (float)(16 * this.field38552);
        float n2 = a / n;
        float n3 = b / n;
        float n4 = 0.0f;
        float n5 = 0.0f;
        if (this.field38553) {
            n4 = (n - a) / (n * 2.0f);
            n5 = (n - b) / (n * 2.0f);
        }
        switch (this.field38551) {
            case 1: {
                final float n6 = (float)Math.max(a, b);
                n2 = this.field38552 * a / n6;
                n3 = this.field38552 * b / n6;
                if (this.field38553) {
                    n4 = this.field38552 * (n6 - a) / (n6 * 2.0f);
                    n5 = this.field38552 * (n6 - b) / (n6 * 2.0f);
                    break;
                }
                break;
            }
            case 2: {
                n2 = (float)this.field38552;
                n3 = (float)this.field38552;
                n4 = 0.0f;
                n5 = 0.0f;
                break;
            }
        }
        method22695.begin(7, DefaultVertexFormats.field39619);
        method22695.pos(0.0, b, 0.0).tex(n4, n5 + n3).method12399(255, 255, 255, 255).endVertex();
        method22695.pos(a, b, 0.0).tex(n4 + n2, n5 + n3).method12399(255, 255, 255, 255).endVertex();
        method22695.pos(a, 0.0, 0.0).tex(n4 + n2, n5).method12399(255, 255, 255, 255).endVertex();
        method22695.pos(0.0, 0.0, 0.0).tex(n4, n5).method12399(255, 255, 255, 255).endVertex();
        method22694.draw();
    }
}
