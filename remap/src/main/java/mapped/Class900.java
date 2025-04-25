// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public final class Class900 extends Thread
{
    private static String[] field4849;
    
    public Class900(final String name) {
        super(name);
    }
    
    @Override
    public void run() {
        final Minecraft method5277 = Minecraft.getInstance();
        if (method5277 != null) {
            final IntegratedServer method5278 = method5277.method5285();
            if (method5278 != null) {
                method5278.method1456(true);
            }
        }
    }
}
