// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;

public class Class8182 implements Class8183<MinecraftServer>
{
    private static String[] field33689;
    private final ResourceLocation field33690;
    
    public Class8182(final ResourceLocation field33690) {
        this.field33690 = field33690;
    }
    
    @Override
    public void run(final MinecraftServer class394, final Class7858<MinecraftServer> class395, final long n) {
        final Class1794 method1567 = class394.method1567();
        final Iterator<Class8263> iterator = method1567.method6513().method18461(this.field33690).method25616().iterator();
        while (iterator.hasNext()) {
            method1567.method6508(iterator.next(), method1567.method6511());
        }
    }
}
