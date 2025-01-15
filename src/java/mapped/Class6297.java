// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class6297 extends Class6292
{
    private final String field25169;
    private final Class2031 field25170;
    private final String field25171;
    private final Class9063 field25172;
    
    public Class6297(final String s, final String field25169, final Class9063 field25170, final String field25171, final Class2314 class2314, final Class2314 class2315, final Class2031 field25172) {
        super(s, class2314, class2315);
        this.field25169 = field25169;
        this.field25172 = field25170;
        this.field25171 = field25171;
        if (field25172 != null) {
            this.field25170 = field25172;
            return;
        }
        throw new NullPointerException("Style must be provided.");
    }
    
    public String method18626() {
        return this.field25169;
    }
    
    public Class2031 method18627() {
        return this.field25170;
    }
    
    public String method18628() {
        return this.field25171;
    }
    
    public Class9063 method18629() {
        return this.field25172;
    }
    
    @Override
    public String method18617() {
        return super.method18617() + ", tag=" + this.field25169 + ", " + this.field25172 + ", value=" + this.field25171;
    }
    
    @Override
    public boolean method18614(final Class2211 class2211) {
        return Class2211.field13477 == class2211;
    }
    
    public boolean method18630() {
        return this.field25170 == Class2031.field11579;
    }
}
