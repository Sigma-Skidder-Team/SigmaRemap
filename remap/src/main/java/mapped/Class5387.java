// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class5387 implements Class5350<Class6908>
{
    private static String[] field22491;
    private final Class7805 field22492;
    
    public Class5387(final Class7805 field22492) {
        this.field22492 = field22492;
    }
    
    public Class6173 method16515(final Class6908 class6908, final World class6909, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        final Class6165 class6910 = new Class6165(class6909, n, n2, n3, n4, n5, n6, null);
        class6910.method18435(0.3f, 0.5f, 1.0f);
        class6910.method18428(this.field22492);
        class6910.method18436(1.0f - class6909.rand.nextFloat() * 0.7f);
        class6910.method18437(class6910.method18438() / 2);
        return class6910;
    }
}
