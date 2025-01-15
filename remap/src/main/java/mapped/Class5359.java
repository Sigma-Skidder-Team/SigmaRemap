// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class5359 implements Class5350<Class6908>
{
    private static String[] field22441;
    private final Class7805 field22442;
    
    public Class5359(final Class7805 field22442) {
        this.field22442 = field22442;
    }
    
    public Class6173 method16515(final Class6908 class6908, final World class6909, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        final Class6165 class6910 = new Class6165(class6909, n, n2, n3, n4, n5, n6, null);
        class6910.method18428(this.field22442);
        class6910.method18435(1.0f, 1.0f, 1.0f);
        return class6910;
    }
}
