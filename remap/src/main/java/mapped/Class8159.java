// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;
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
                return new AxisAlignedBB(class6221.field25073 + min, class6221.field25074, class6221.field25075, class6221.field25073 + max, class6221.field25077, class6221.field25078);
            }
            case 2: {
                return new AxisAlignedBB(class6221.field25076 + min, class6221.field25074, class6221.field25075, class6221.field25076 + max, class6221.field25077, class6221.field25078);
            }
            case 3: {
                return new AxisAlignedBB(class6221.field25073, class6221.field25074 + min, class6221.field25075, class6221.field25076, class6221.field25074 + max, class6221.field25078);
            }
            default: {
                return new AxisAlignedBB(class6221.field25073, class6221.field25077 + min, class6221.field25075, class6221.field25076, class6221.field25077 + max, class6221.field25078);
            }
            case 5: {
                return new AxisAlignedBB(class6221.field25073, class6221.field25074, class6221.field25075 + min, class6221.field25076, class6221.field25077, class6221.field25075 + max);
            }
            case 6: {
                return new AxisAlignedBB(class6221.field25073, class6221.field25074, class6221.field25078 + min, class6221.field25076, class6221.field25077, class6221.field25078 + max);
            }
        }
    }
}
