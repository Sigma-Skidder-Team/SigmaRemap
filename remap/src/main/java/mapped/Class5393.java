// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class Class5393 implements Class5350<Class6911>
{
    private static String[] field22503;
    private final Class7805 field22504;
    
    public Class5393(final Class7805 field22504) {
        this.field22504 = field22504;
    }
    
    @Nullable
    public Class6173 method16517(final Class6911 class6911, final World class6912, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        final BlockState method21276 = class6911.method21276();
        if (!method21276.method21706() && method21276.method21710() == Class2115.field12305) {
            return null;
        }
        int n7 = Minecraft.method5277().method5316().method25440(method21276, class6912, new BlockPos(n, n2, n3));
        if (method21276.getBlock() instanceof Class3986) {
            n7 = ((Class3986)method21276.getBlock()).method12134(method21276);
        }
        return new Class6160(class6912, n, n2, n3, (n7 >> 16 & 0xFF) / 255.0f, (n7 >> 8 & 0xFF) / 255.0f, (n7 & 0xFF) / 255.0f, this.field22504, null);
    }
}
