// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class537 extends ChatScreen
{
    private static final String field3195 = "/reloadShaders";
    private static final String field3196 = "/reloadChunks";
    
    public Class537(final ChatScreen chatScreen) {
        super(Class700.method3901(chatScreen));
    }
    
    @Override
    public void method3036(final String s) {
        if (!this.method3095(s)) {
            super.method3036(s);
        }
        else {
            this.minecraft.field4647.method3807().method3766(s);
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
        this.minecraft.worldRenderer.loadRenderers();
        return true;
    }
}
