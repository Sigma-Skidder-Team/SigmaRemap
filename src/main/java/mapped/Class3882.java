// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3882 extends Class3874
{
    private static String[] field17519;
    public static final Class7702 field17537;
    private final Class5328 field17538;
    private final int field17539;
    
    public Class3882(final Class5328 field17538, final int field17539, final Class9288 class9288) {
        super(class9288);
        this.field17538 = field17538;
        if (!field17538.method16453()) {
            this.field17539 = field17539 * 20;
        }
        else {
            this.field17539 = field17539;
        }
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        final Class5487 method21732 = class7096.method21732(class7097, class7098);
        return Class3882.field17537.method24541(method21732.field22770, method21732.field22771, method21732.field22772);
    }
    
    @Override
    public Class2180 method11879() {
        return Class2180.field12914;
    }
    
    public Class5328 method11961() {
        return this.field17538;
    }
    
    public int method11962() {
        return this.field17539;
    }
    
    static {
        field17537 = Class3833.method11778(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
    }
}
