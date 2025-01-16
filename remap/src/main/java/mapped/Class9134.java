// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;

public class Class9134
{
    private static String[] field38710;
    private static final Minecraft field38711;
    
    public static double[] method33307(final LivingEntity class511) {
        if (class511 != null) {
            return new double[] { class511.posX + (class511.posX - class511.lastTickPosX) * 2.0, class511.posY + 0.0, class511.posZ + (class511.posZ - class511.lastTickPosZ) * 2.0 };
        }
        return new double[] { 0.0, 0.0, 0.0 };
    }
    
    public static double[] method33308(final LivingEntity class511) {
        if (class511 != null) {
            return new double[] { class511.posX + (class511.posX - class511.lastTickPosX) * Class6430.method19135() / 50.0, class511.posY + 0.0 * Class6430.method19135() / 50.0, class511.posZ + (class511.posZ - class511.lastTickPosZ) * Class6430.method19135() / 50.0 };
        }
        return new double[] { 0.0, 0.0, 0.0 };
    }
    
    static {
        field38711 = Minecraft.method5277();
    }
}
