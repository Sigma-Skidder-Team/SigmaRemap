// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class5382 implements Class5350<Class6908>
{
    private static String[] field22483;
    private final Class7805 field22484;
    
    public Class5382(final Class7805 field22484) {
        this.field22484 = field22484;
    }
    
    public Class6173 method16515(final Class6908 class6908, final World class6909, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        final Class6164 class6910 = new Class6164(class6909, n, n2, n3, n4, n5, n6, this.field22484, null);
        class6910.method18435((float)n4, (float)n5, (float)n6);
        return class6910;
    }
}
