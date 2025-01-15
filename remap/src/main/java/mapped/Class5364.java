// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class5364 implements Class5350<Class6908>
{
    private static String[] field22451;
    public final Class7805 field22452;
    
    public Class5364(final Class7805 field22452) {
        this.field22452 = field22452;
    }
    
    public Class6173 method16515(final Class6908 class6908, final World class6909, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        final Class6206 class6910 = new Class6206(class6909, n, n2, n3, Class7558.field29976, Class8432.field34646, null);
        class6910.method18435(0.2f, 0.3f, 1.0f);
        class6910.method18428(this.field22452);
        return class6910;
    }
}
