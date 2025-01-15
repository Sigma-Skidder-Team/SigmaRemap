// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class5394 implements Class5350<Class6908>
{
    private static String[] field22505;
    private final Class7805 field22506;
    
    public Class5394(final Class7805 field22506) {
        this.field22506 = field22506;
    }
    
    public Class6173 method16515(final Class6908 class6908, final World class6909, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        final Class6193 class6911;
        final Class6193 class6910 = class6911 = new Class6193(class6909, n, n2, n3, n4, n5, n6, null);
        class6911.field24953 *= 0.3f;
        final Class6193 class6912 = class6910;
        class6912.field24954 *= 0.8f;
        class6910.method18428(this.field22506);
        return class6910;
    }
}
