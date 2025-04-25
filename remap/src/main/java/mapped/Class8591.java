// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;

public class Class8591
{
    private static String[] field36091;
    private static Minecraft field36092;
    
    public static double method29091(final Entity class399) {
        final double n = method29093(Class8591.field36092.player).field38854 - method29093(class399).field38854;
        final double n2 = method29093(Class8591.field36092.player).field38855 - method29093(class399).field38855;
        final double n3 = method29093(Class8591.field36092.player).field38856 - method29093(class399).field38856;
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public static double method29092(final BlockPos class354) {
        final double n = method29093(Class8591.field36092.player).field38854 - class354.getX();
        final double n2 = method29093(Class8591.field36092.player).field38855 - class354.getY();
        final double n3 = method29093(Class8591.field36092.player).field38856 - class354.getZ();
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public static Class9172 method29093(final Entity class399) {
        return new Class9172(class399.lastTickPosX + (class399.posX - class399.lastTickPosX) * Class8591.field36092.timer.field26528, class399.lastTickPosY + (class399.posY - class399.lastTickPosY) * Class8591.field36092.timer.field26528, class399.lastTickPosZ + (class399.posZ - class399.lastTickPosZ) * Class8591.field36092.timer.field26528);
    }
    
    public static Class9172 method29094(final Entity class399) {
        final Class9172 method29093 = method29093(class399);
        return new Class9172(method29093.field38854 - Minecraft.getInstance().field4644.method5833().method18161().getX(), method29093.field38855 - Minecraft.getInstance().field4644.method5833().method18161().getY(), method29093.field38856 - Minecraft.getInstance().field4644.method5833().method18161().getZ());
    }
    
    public static Class9172 method29095(final BlockPos class354) {
        return new Class9172(class354.getX() - Minecraft.getInstance().field4644.method5833().method18161().getX(), class354.getY() - Minecraft.getInstance().field4644.method5833().method18161().getY(), class354.getZ() - Minecraft.getInstance().field4644.method5833().method18161().getZ());
    }
    
    static {
        Class8591.field36092 = Minecraft.getInstance();
    }
}
