// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.world.World;

public class Class5385 implements Class5350<Class6911>
{
    private static String[] field22489;
    
    public Class6173 method16517(final Class6911 class6911, final World class6912, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        final BlockState method21276 = class6911.method21276();
        return (!method21276.method21706() && method21276.getBlock() != Class7521.field29264) ? new Class6182(class6912, n, n2, n3, n4, n5, n6, method21276).method18453() : null;
    }
}
