// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util2.Direction;
import net.minecraft.util.math.AxisAlignedBB;

public class Class8159
{
    private static String[] field33603;
    
    public static AxisAlignedBB method26948(final AxisAlignedBB class6221, final Direction class6222, final double n) {
        final double n2 = n * class6222.getAxisDirection().getOffset();
        final double min = Math.min(n2, 0.0);
        final double max = Math.max(n2, 0.0);
        switch (Class8635.field36230[class6222.ordinal()]) {
            case 1: {
                return new AxisAlignedBB(class6221.minX + min, class6221.minY, class6221.minZ, class6221.minX + max, class6221.maxY, class6221.maxZ);
            }
            case 2: {
                return new AxisAlignedBB(class6221.maxX + min, class6221.minY, class6221.minZ, class6221.maxX + max, class6221.maxY, class6221.maxZ);
            }
            case 3: {
                return new AxisAlignedBB(class6221.minX, class6221.minY + min, class6221.minZ, class6221.maxX, class6221.minY + max, class6221.maxZ);
            }
            default: {
                return new AxisAlignedBB(class6221.minX, class6221.maxY + min, class6221.minZ, class6221.maxX, class6221.maxY + max, class6221.maxZ);
            }
            case 5: {
                return new AxisAlignedBB(class6221.minX, class6221.minY, class6221.minZ + min, class6221.maxX, class6221.maxY, class6221.minZ + max);
            }
            case 6: {
                return new AxisAlignedBB(class6221.minX, class6221.minY, class6221.maxZ + min, class6221.maxX, class6221.maxY, class6221.maxZ + max);
            }
        }
    }
}
