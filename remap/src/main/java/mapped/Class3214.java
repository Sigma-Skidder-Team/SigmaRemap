// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3214 extends Class3167
{
    private Class3264 field15661;
    
    public Class3214() {
        super(Class8013.field32988, "Funcraft", "Gameplay for Funcraft");
    }
    
    @Override
    public void method9917() {
        this.field15661 = (Class3264)this.method9914();
    }
    
    @Class6753
    private void method10133(final Class5723 class5723) {
        if (this.method9906() && Class3214.field15514.player != null) {
            final IPacket method16998 = class5723.method16998();
            if (method16998 instanceof Class4378) {
                final String string = ((Class4378)method16998).method13164().getString();
                final String lowerCase = Class3214.field15514.player.getName().getFormattedText().toLowerCase();
                if (this.field15661.method9883("AutoL")) {
                    if (string.toLowerCase().contains("a \u00e9t\u00e9 tu\u00e9 par " + lowerCase) || string.toLowerCase().contains("a \u00e9t\u00e9 tu\u00e9 par le vide et " + lowerCase)) {
                        this.field15661.method10296(string);
                    }
                }
            }
        }
    }
}
