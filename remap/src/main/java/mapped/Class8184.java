// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8184 implements Class8183<MinecraftServer>
{
    private static String[] field33691;
    private final Class1932 field33692;
    
    public Class8184(final Class1932 field33692) {
        this.field33692 = field33692;
    }
    
    @Override
    public void run(final MinecraftServer class394, final Class7858<MinecraftServer> class395, final long n) {
        class394.method1567().method6502(this.field33692).ifPresent(class397 -> class396.method6508(class397, class396.method6511()));
    }
}
