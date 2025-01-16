// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class905 extends Thread
{
    private static String[] field4855;
    public final /* synthetic */ Minecraft field4856;
    
    public Class905(final Minecraft field4856, final String name) {
        this.field4856 = field4856;
        super(name);
    }
    
    @Override
    public void run() {
        while (Minecraft.method5372(this.field4856)) {
            try {
                Thread.sleep(2147483647L);
            }
            catch (final InterruptedException ex) {}
        }
    }
}
