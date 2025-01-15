// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8068
{
    private static String[] field33236;
    private final String field33237;
    private final int field33238;
    
    public Class8068(final String field33237, final int field33238) {
        this.field33237 = field33237;
        this.field33238 = field33238;
    }
    
    public String method26466() {
        return this.field33237;
    }
    
    public int method26467() {
        return this.field33238;
    }
    
    public static Class8068 method26468(final String s) {
        final Class7872 method25494 = Class7872.method25494(s);
        return new Class8068(method25494.method25492(), method25494.method25493());
    }
}
