// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4115 implements Class4114
{
    private int field18221;
    private ResourceLocation field18222;
    private int field18223;
    private Class1666 field18224;
    public static final int field18225 = 0;
    public static final int field18226 = 1;
    public static final int field18227 = 2;
    
    public Class4115(final int field18221, final ResourceLocation field18222, final int field18223) {
        this.field18221 = -1;
        this.field18223 = 0;
        this.field18221 = field18221;
        this.field18222 = field18222;
        this.field18223 = field18223;
    }
    
    public Class1666 method12365() {
        if (this.field18224 == null) {
            final Class1663 method5290 = Minecraft.method5277().method5290();
            this.field18224 = method5290.method5853(this.field18222);
            if (this.field18224 == null) {
                this.field18224 = new Class1767(this.field18222);
                method5290.method5851(this.field18222, this.field18224);
                this.field18224 = method5290.method5853(this.field18222);
            }
        }
        return this.field18224;
    }
    
    @Override
    public int method12362() {
        final Class1666 method12365 = this.method12365();
        if (this.field18223 != 0) {
            if (method12365 instanceof Class1666) {
                final Class9025 field9438 = method12365.field9438;
                if (field9438 != null) {
                    if (this.field18223 == 1) {
                        return field9438.field38157;
                    }
                    if (this.field18223 == 2) {
                        return field9438.field38158;
                    }
                }
            }
        }
        return method12365.method5869();
    }
    
    @Override
    public int method12363() {
        return this.field18221;
    }
    
    @Override
    public void method12358() {
    }
    
    @Override
    public String toString() {
        return "textureUnit: " + this.field18221 + ", location: " + this.field18222 + ", glTextureId: " + ((this.field18224 == null) ? "" : Integer.valueOf(this.field18224.method5869()));
    }
}
