// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class1644 implements Runnable
{
    private static String[] field9194;
    public final /* synthetic */ Class4940 field9195;
    public final /* synthetic */ Class4940 field9196;
    
    public Class1644(final Class4940 field9196, final Class4940 field9197) {
        this.field9196 = field9196;
        this.field9195 = field9197;
    }
    
    @Override
    public void run() {
        for (final CustomGuiScreen customGuiScreen : this.field9195.method14250()) {
            if (!(customGuiScreen instanceof Class4850)) {
                continue;
            }
            ((Class4850) customGuiScreen).method14549();
        }
    }
}
