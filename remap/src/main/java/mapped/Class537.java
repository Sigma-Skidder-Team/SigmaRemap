// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class537 extends Class535
{
    private static final String field3195 = "/reloadShaders";
    private static final String field3196 = "/reloadChunks";
    
    public Class537(final Class535 class535) {
        super(Class700.method3901(class535));
    }
    
    @Override
    public void method3036(final String s) {
        if (!this.method3095(s)) {
            super.method3036(s);
        }
        else {
            this.field3150.field4647.method3807().method3766(s);
        }
    }
    
    private boolean method3095(String trim) {
        if (trim == null) {
            return false;
        }
        trim = trim.trim();
        if (trim.equals("/reloadShaders")) {
            if (Config.method28955()) {
                Class9216.method33788();
                Class9216.method33708();
            }
            return true;
        }
        if (!trim.equals("/reloadChunks")) {
            return false;
        }
        this.field3150.field4636.method5701();
        return true;
    }
}
