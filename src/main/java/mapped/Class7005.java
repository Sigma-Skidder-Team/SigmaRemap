// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7005 extends Class7006
{
    private static String[] field27318;
    private final Class179 field27319;
    private final Class354 field27320;
    private final boolean field27321;
    private final boolean field27322;
    
    public static Class7005 method21445(final Class5487 class5487, final Class179 class5488, final Class354 class5489) {
        return new Class7005(true, class5487, class5488, class5489, false);
    }
    
    public Class7005(final Class5487 class5487, final Class179 class5488, final Class354 class5489, final boolean b) {
        this(false, class5487, class5488, class5489, b);
    }
    
    private Class7005(final boolean field27321, final Class5487 class5487, final Class179 field27322, final Class354 field27323, final boolean field27324) {
        super(class5487);
        this.field27321 = field27321;
        this.field27319 = field27322;
        this.field27320 = field27323;
        this.field27322 = field27324;
    }
    
    public Class7005 method21446(final Class179 class179) {
        return new Class7005(this.field27321, this.field27323, class179, this.field27320, this.field27322);
    }
    
    public Class354 method21447() {
        return this.field27320;
    }
    
    public Class179 method21448() {
        return this.field27319;
    }
    
    @Override
    public Class2165 method21449() {
        return this.field27321 ? Class2165.field12880 : Class2165.field12881;
    }
    
    public boolean method21450() {
        return this.field27322;
    }
}
