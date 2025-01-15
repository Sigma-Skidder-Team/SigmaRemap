// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class5250 extends Class5233
{
    private final String field22276;
    private final boolean field22277;
    private final Class2031 field22278;
    
    public Class5250(final String s, final Class2314 class2314, final Class2314 class2315, final boolean b) {
        this(s, b, class2314, class2315, Class2031.field11579);
    }
    
    public Class5250(final String field22276, final boolean field22277, final Class2314 class2314, final Class2314 class2315, final Class2031 field22278) {
        super(class2314, class2315);
        this.field22276 = field22276;
        this.field22277 = field22277;
        if (field22278 != null) {
            this.field22278 = field22278;
            return;
        }
        throw new NullPointerException("Style must be provided.");
    }
    
    public boolean method16354() {
        return this.field22277;
    }
    
    public String method16355() {
        return this.field22276;
    }
    
    public Class2031 method16356() {
        return this.field22278;
    }
    
    @Override
    public Class2207 method16347() {
        return Class2207.field13444;
    }
}
