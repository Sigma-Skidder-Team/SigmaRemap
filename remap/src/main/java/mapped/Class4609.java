// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.math.shapes.VoxelShape;
import org.apache.commons.lang3.RandomUtils;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

public class Class4609
{
    private static String[] field20074;
    private static final Class869 field20075;
    
    public static boolean method13665(final PlayerEntity playerEntity, final BlockPos class513) {
        return method13680(playerEntity, class513) < method13690();
    }
    
    public static final Block method13666(final BlockPos class354) {
        return Class4609.field20075.field4683.getBlockState(class354).method21696();
    }
    
    public static final Block method13667(final double n, final double n2, final double n3) {
        return method13666(new BlockPos(n, n2, n3));
    }
    
    public static boolean method13668(final Block class3833, final BlockPos class3834) {
        final VoxelShape method21727 = class3833.getDefaultState().getCollisionShape(Class4609.field20075.field4683, class3834);
        if (!method13708(class3834)) {
            if (Class4609.field20075.field4683.method6957(Class4609.field20075.field4684, method21727)) {
                if (class3834.getY() <= Class4609.field20075.field4684.method1894().getY()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void method13669(final BlockPos class354) {
        final double x = class354.getX() + 0.5 - Class869.method5277().field4684.posX;
        final double y = class354.getY() + 0.5 - (Class869.method5277().field4684.posY + Class869.method5277().field4684.method1892());
        final double y2 = class354.getZ() + 0.5 - Class869.method5277().field4684.posZ;
        final double x2 = MathHelper.sqrt(x * x + y2 * y2);
        final float n = (float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f;
        final float n2 = (float)(-(Math.atan2(y, x2) * 180.0 / 3.141592653589793));
        Class869.method5277().field4684.rotationYaw += MathHelper.method35668(n - Class869.method5277().field4684.rotationYaw);
        Class869.method5277().field4684.rotationPitch += MathHelper.method35668(n2 - Class869.method5277().field4684.rotationPitch);
    }
    
    public static void method13670(final BlockPos class354) {
        final double x = class354.getX() + 0.5 - Class869.method5277().field4684.posX;
        final double y = class354.getY() + 0.5 - (Class869.method5277().field4684.posY + Class869.method5277().field4684.method1892());
        final double y2 = class354.getZ() + 0.5 - Class869.method5277().field4684.posZ;
        Class869.method5277().method5269().method17292(new Class4356(Class869.method5277().field4684.rotationYaw + MathHelper.method35668((float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f - Class869.method5277().field4684.rotationYaw), Class869.method5277().field4684.rotationPitch + MathHelper.method35668((float)(-(Math.atan2(y, MathHelper.sqrt(x * x + y2 * y2)) * 180.0 / 3.141592653589793)) - Class869.method5277().field4684.rotationPitch), Class869.method5277().field4684.onGround));
    }
    
    public static float[] method13671(final BlockPos class354) {
        final double x = class354.getX() + 0.5 - Class869.method5277().field4684.posX;
        final double y = class354.getY() - 0.25 - (Class869.method5277().field4684.posY + Class869.method5277().field4684.method1892());
        final double y2 = class354.getZ() + 0.5 - Class869.method5277().field4684.posZ;
        return new float[] { Class869.method5277().field4684.rotationYaw + MathHelper.method35668((float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f - Class869.method5277().field4684.rotationYaw), Class869.method5277().field4684.rotationPitch + MathHelper.method35668((float)(-(Math.atan2(y, MathHelper.sqrt(x * x + y2 * y2)) * 180.0 / 3.141592653589793)) - Class869.method5277().field4684.rotationPitch) };
    }
    
    public static float[] method13672(final BlockPos class354, final Direction class355) {
        float n = 0.0f;
        float n2 = 0.0f;
        float n3 = 0.0f;
        switch (Class9065.field38380[class355.ordinal()]) {
            case 1: {
                n += 0.49f;
                break;
            }
            case 2: {
                n2 -= 0.49f;
                break;
            }
            case 3: {
                n2 += 0.49f;
                break;
            }
            case 4: {
                n -= 0.49f;
                break;
            }
            case 5: {
                n3 += 0.0f;
            }
            case 6: {
                ++n3;
                break;
            }
        }
        final double x = class354.getX() + 0.5 - Class869.method5277().field4684.posX + n;
        final double y = class354.getY() - 0.02 - (Class869.method5277().field4684.posY + Class869.method5277().field4684.method1892()) + n3;
        final double y2 = class354.getZ() + 0.5 - Class869.method5277().field4684.posZ + n2;
        return new float[] { Class869.method5277().field4684.rotationYaw + MathHelper.method35668((float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f - Class869.method5277().field4684.rotationYaw), Class869.method5277().field4684.rotationPitch + MathHelper.method35668((float)(-(Math.atan2(y, MathHelper.sqrt(x * x + y2 * y2)) * 180.0 / 3.141592653589793)) - Class869.method5277().field4684.rotationPitch) };
    }
    
    public static float[] method13673(final BlockPos class354, final Direction class355) {
        float n = 0.0f;
        float n2 = 0.0f;
        float n3 = (float)(0.4000000059604645 + Math.random() * 0.10000000149011612);
        switch (Class9065.field38380[class355.ordinal()]) {
            case 1: {
                n += 0.49f;
                break;
            }
            case 2: {
                n2 -= 0.49f;
                break;
            }
            case 3: {
                n2 += 0.49f;
                break;
            }
            case 4: {
                n -= 0.49f;
                break;
            }
            case 5: {
                final float n4 = 0.26f - (float)(Math.random() * 0.20000000298023224);
                final float n5 = 0.26f - (float)(Math.random() * 0.20000000298023224);
            }
            case 6: {
                n3 = 1.0f;
                n = 0.26f - (float)(Math.random() * 0.20000000298023224);
                n2 = 0.26f - (float)(Math.random() * 0.20000000298023224);
                break;
            }
        }
        if (n == 0.0f) {
            n = (float)(0.10000000149011612 - Math.sin((System.currentTimeMillis() - 500L) / 1200.0) * 0.2);
        }
        if (n2 == 0.0f) {
            n2 = (float)(0.10000000149011612 - Math.sin((System.currentTimeMillis() - 500L) / 1000.0) * 0.2);
        }
        if (n3 == 0.0f) {
            n3 = (float)(0.6000000238418579 - Math.sin((System.currentTimeMillis() - 500L) / 1600.0) * 0.2);
        }
        final double x = class354.getX() + 0.5 - Class869.method5277().field4684.posX + n;
        final double y = class354.getY() - 0.02 - (Class869.method5277().field4684.posY + Class869.method5277().field4684.method1892()) + n3;
        final double y2 = class354.getZ() + 0.5 - Class869.method5277().field4684.posZ + n2;
        return new float[] { Class869.method5277().field4684.rotationYaw + MathHelper.method35668((float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f - Class869.method5277().field4684.rotationYaw), Class869.method5277().field4684.rotationPitch + MathHelper.method35668((float)(-(Math.atan2(y, MathHelper.sqrt(x * x + y2 * y2)) * 180.0 / 3.141592653589793)) - Class869.method5277().field4684.rotationPitch) };
    }
    
    public static float method13674(final BlockPos class354, final Direction class355) {
        float n = 0.0f;
        float n2 = 0.0f;
        switch (Class9065.field38380[class355.ordinal()]) {
            case 1: {
                n += 0.49f;
                break;
            }
            case 2: {
                n2 -= 0.49f;
                break;
            }
            case 3: {
                n2 += 0.49f;
                break;
            }
            case 4: {
                n -= 0.49f;
                break;
            }
        }
        final double n3 = class354.getX() + 0.5 - Class869.method5277().field4684.posX + n;
        final double n4 = class354.getZ() + 0.5 - Class869.method5277().field4684.posZ + n2;
        final double y = class354.getY() - 0.02 - (Class869.method5277().field4684.posY + Class869.method5277().field4684.method1892()) + 1.0;
        final double y2 = class354.getY() - 0.02 - (Class869.method5277().field4684.posY + Class869.method5277().field4684.method1892());
        final double n5 = MathHelper.sqrt(n3 * n3 + n4 * n4);
        return (float)(-(Math.atan2(y2, n5) * 180.0 / 3.141592653589793)) - (float)(-(Math.atan2(y, n5) * 180.0 / 3.141592653589793));
    }
    
    public static List<BlockPos> method13675(final List<BlockPos> list) {
        list.sort((class354, class355) -> {
            method13680(Class4609.field20075.field4684, class354);
            method13680(Class4609.field20075.field4684, class355);
            final float n;
            final float n2;
            if (n <= n2) {
                if (n != n2) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
            else {
                return 1;
            }
        });
        return list;
    }
    
    public static List<BlockPos> method13676(final List<BlockPos> list, final Vec3d class5487) {
        list.sort((class5489, class5490) -> {
            method13681(class5488, class5489);
            method13681(class5488, class5490);
            final float n;
            final float n2;
            if (n <= n2) {
                if (n != n2) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
            else {
                return 1;
            }
        });
        return list;
    }
    
    public static List<BlockPos> method13677(final List<BlockPos> list, final Vec3d class5487, final boolean b) {
        if (!b) {
            method13676(list, class5487);
        }
        else {
            list.sort((class5489, class5490) -> (method13682(class5488, class5489) < method13682(class5488, class5490)) ? -1 : 1);
        }
        return list;
    }
    
    public static List<Entity> method13678(final List<Entity> list) {
        Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4447());
        return list;
    }
    
    public static List<PlayerEntity> method13679(final List<PlayerEntity> list) {
        Collections.sort((List<Object>)list, (Comparator<? super Object>)new Class4453());
        return list;
    }
    
    public static float method13680(final Entity class399, final BlockPos class400) {
        return method13683(class399, class400.getX(), class400.getY(), class400.getZ());
    }
    
    public static float method13681(final Vec3d class5487, final BlockPos class5488) {
        return method13684(class5487, class5488.getX(), class5488.getY(), class5488.getZ());
    }
    
    public static float method13682(final Vec3d class5487, final BlockPos class5488) {
        return method13685(class5487, class5488.getX(), class5488.getZ());
    }
    
    public static float method13683(final Entity class399, final double n, final double n2, final double n3) {
        return method13688((float)(class399.posX - n), (float)(class399.posY - n2), (float)(class399.posZ - n3));
    }
    
    public static float method13684(final Vec3d class5487, final double n, final double n2, final double n3) {
        return method13688((float)(class5487.getX() - n), (float)(class5487.getY() - n2), (float)(class5487.getZ() - n3));
    }
    
    public static float method13685(final Vec3d class5487, final double n, final double n2) {
        return method13687((float)(class5487.getX() - n), (float)(class5487.getZ() - n2));
    }
    
    public static float method13686(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        return method13688((float)(n - n4), (float)(n2 - n5), (float)(n3 - n6));
    }
    
    private static float method13687(final float n, final float n2) {
        return MathHelper.method35640((n - 0.5f) * (n - 0.5f) + (n2 - 0.5f) * (n2 - 0.5f));
    }
    
    private static float method13688(final float n, final float n2, final float n3) {
        return MathHelper.method35640((n - 0.5f) * (n - 0.5f) + (n2 - 0.5f) * (n2 - 0.5f) + (n3 - 0.5f) * (n3 - 0.5f));
    }
    
    public static Block method13689(final PlayerEntity playerEntity) {
        return method13666(playerEntity.method1894().method1139());
    }
    
    public static float method13690() {
        return Class4609.field20075.field4682.method27315();
    }
    
    public static List<BlockPos> method13691(final float n) {
        final ArrayList list = new ArrayList();
        for (float n2 = -n; n2 <= n; ++n2) {
            for (float n3 = -n; n3 <= n; ++n3) {
                for (float n4 = -n; n4 <= n; ++n4) {
                    list.add(new BlockPos(Class4609.field20075.field4684.posX + n3, Class4609.field20075.field4684.posY + n2, Class4609.field20075.field4684.posZ + n4));
                }
            }
        }
        return list;
    }
    
    public static List<BlockPos> method13692(final double n, final double n2, final double n3) {
        final ArrayList list = new ArrayList();
        for (float n4 = -method13690(); n4 <= method13690(); ++n4) {
            for (float n5 = -method13690(); n5 <= method13690(); ++n5) {
                for (float n6 = -method13690(); n6 <= method13690(); ++n6) {
                    list.add(new BlockPos(n + n5, n2 + n4, n3 + n6));
                }
            }
        }
        return list;
    }
    
    public static List<BlockPos> method13693() {
        final ArrayList list = new ArrayList();
        final int n = 90;
        final int n2 = 10;
        for (float n3 = (float)(-n); n3 <= n; ++n3) {
            for (float n4 = (float)(-n2); n4 <= n2; ++n4) {
                for (float n5 = (float)(-n2); n5 <= n2; ++n5) {
                    final BlockPos class354 = new BlockPos(Class4609.field20075.field4684.posX + n4, Class4609.field20075.field4684.posY + n3, Class4609.field20075.field4684.posZ + n5);
                    if (Class4609.field20075.field4683.getBlockState(class354).method21696() instanceof Class3992) {
                        list.add(class354);
                    }
                }
            }
        }
        return list;
    }
    
    public static BlockPos method13694(final float n, final float n2, final float n3) {
        final Class7005 method13697 = method13697(n, n2, n3);
        if (method13697 != null) {
            return method13697.method21447();
        }
        return null;
    }
    
    public static float[] method13695() {
        final Class7005 method13696 = method13696(Class7482.method23147() - 270.0f);
        if (method13696.method21449() != Class2165.field12880) {
            final double n = method13696.method21451().x - method13696.method21447().getX();
            final double n2 = method13696.method21451().z - method13696.method21447().getZ();
            final double n3 = method13696.method21451().y - method13696.method21447().getY();
            final double x = method13696.method21447().getX() - Class869.method5277().field4684.posX + n;
            final double y = method13696.method21447().getY() - (Class869.method5277().field4684.posY + Class869.method5277().field4684.method1892()) + n3;
            final double y2 = method13696.method21447().getZ() - Class869.method5277().field4684.posZ + n2;
            return new float[] { Class869.method5277().field4684.rotationYaw + MathHelper.method35668((float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f - Class869.method5277().field4684.rotationYaw), Class869.method5277().field4684.rotationPitch + MathHelper.method35668((float)(-(Math.atan2(y, MathHelper.sqrt(x * x + y2 * y2)) * 180.0 / 3.141592653589793)) - Class869.method5277().field4684.rotationPitch) };
        }
        return null;
    }
    
    public static Class7005 method13696(float n) {
        final Vec3d class5487 = new Vec3d(Class4609.field20075.field4684.field4074, Class4609.field20075.field4684.field4075 - 0.800000011920929, Class4609.field20075.field4684.field4076);
        n = (float)Math.toRadians(n);
        final float n2 = 0.0f;
        final float n3 = -MathHelper.sin(n) * MathHelper.cos(n2);
        final float n4 = MathHelper.cos(n) * MathHelper.cos(n2);
        final float n5 = 2.3f;
        return Class4609.field20075.field4683.rayTraceBlocks(new RayTraceContext(class5487, new Vec3d(Class4609.field20075.field4684.field4074 + n3 * n5, Class4609.field20075.field4684.field4075 - 0.800000011920929 - (Class4609.field20075.field4684.field2967 ? 0.6f : 0.0f), Class4609.field20075.field4684.field4076 + n4 * n5), Class2040.field11633, Class2191.field13325, Class4609.field20075.method5303()));
    }
    
    public static Class7005 method13697(float n, float n2, float method27315) {
        final Vec3d class5487 = new Vec3d(Class4609.field20075.field4684.field4074, Class4609.field20075.field4684.field4075 + Class4609.field20075.field4684.method1892(), Class4609.field20075.field4684.field4076);
        n = (float)Math.toRadians(n);
        n2 = (float)Math.toRadians(n2);
        final float n3 = -MathHelper.sin(n) * MathHelper.cos(n2);
        final float n4 = -MathHelper.sin(n2);
        final float n5 = MathHelper.cos(n) * MathHelper.cos(n2);
        if (method27315 == 0.0f) {
            method27315 = Class4609.field20075.field4682.method27315();
        }
        return Class4609.field20075.field4683.rayTraceBlocks(new RayTraceContext(class5487, new Vec3d(Class4609.field20075.field4684.field4074 + n3 * method27315, Class4609.field20075.field4684.field4075 + n4 * method27315 + Class4609.field20075.field4684.method1892(), Class4609.field20075.field4684.field4076 + n5 * method27315), Class2040.field11633, Class2191.field13325, Class4609.field20075.method5303()));
    }
    
    public static Class7005 method13698(float n, float n2, float method27315, final Class5744 class5744) {
        final Vec3d class5745 = new Vec3d(class5744.method17034(), Class4609.field20075.field4684.method1892() + class5744.method17036(), class5744.method17038());
        n = (float)Math.toRadians(n);
        n2 = (float)Math.toRadians(n2);
        final float n3 = -MathHelper.sin(n) * MathHelper.cos(n2);
        final float n4 = -MathHelper.sin(n2);
        final float n5 = MathHelper.cos(n) * MathHelper.cos(n2);
        if (method27315 == 0.0f) {
            method27315 = Class4609.field20075.field4682.method27315();
        }
        return Class4609.field20075.field4683.rayTraceBlocks(new RayTraceContext(class5745, new Vec3d(Class4609.field20075.field4684.field4074 + n3 * method27315, Class4609.field20075.field4684.field4075 + n4 * method27315 + Class4609.field20075.field4684.method1892(), Class4609.field20075.field4684.field4076 + n5 * method27315), Class2040.field11633, Class2191.field13325, Class4609.field20075.method5303()));
    }
    
    public static Class7006 method13699(float n, float n2, float method27315, final float n3) {
        final Vec3d class5487 = new Vec3d(Class4609.field20075.field4684.posX + Math.cos(Class7482.method23147() * 3.141592653589793 / 180.0) * n3, Class4609.field20075.field4684.posY + Class4609.field20075.field4684.method1892(), Class4609.field20075.field4684.posZ + Math.sin(Class7482.method23147() * 3.141592653589793 / 180.0) * n3);
        n = (float)Math.toRadians(n);
        n2 = (float)Math.toRadians(n2);
        final float n4 = -MathHelper.sin(n) * MathHelper.cos(n2);
        final float n5 = -MathHelper.sin(n2);
        final float n6 = MathHelper.cos(n) * MathHelper.cos(n2);
        if (method27315 == 0.0f) {
            method27315 = Class4609.field20075.field4682.method27315();
        }
        return Class4609.field20075.field4683.rayTraceBlocks(new RayTraceContext(class5487, new Vec3d(Class4609.field20075.field4684.field4074 + n4 * method27315, Class4609.field20075.field4684.field4075 + n5 * method27315 + Class4609.field20075.field4684.method1892(), Class4609.field20075.field4684.field4076 + n6 * method27315), Class2040.field11633, Class2191.field13325, Class4609.field20075.method5303()));
    }
    
    public static Class7006 method13700(final BlockPos class354) {
        return Class4609.field20075.field4683.rayTraceBlocks(new RayTraceContext(new Vec3d(Class4609.field20075.field4684.posX, Class4609.field20075.field4684.posY + Class4609.field20075.field4684.method1892(), Class4609.field20075.field4684.posZ), new Vec3d(class354.getX() + 0.5 + RandomUtils.nextDouble(0.01, 0.04), class354.getY(), class354.getZ() + 0.5 + RandomUtils.nextDouble(0.01, 0.04)), Class2040.field11633, Class2191.field13325, Class4609.field20075.method5303()));
    }
    
    private boolean method13701(final Class9052 class9052, float n, float n2) {
        final Vec3d class9053 = new Vec3d(Class4609.field20075.field4684.posX, Class4609.field20075.field4684.posY + Class4609.field20075.field4684.method1892(), Class4609.field20075.field4684.posZ);
        n = (float)Math.toRadians(n);
        n2 = (float)Math.toRadians(n2);
        final float n3 = -MathHelper.sin(n) * MathHelper.cos(n2);
        final float n4 = -MathHelper.sin(n2);
        final float n5 = MathHelper.cos(n) * MathHelper.cos(n2);
        final float method27315 = Class4609.field20075.field4682.method27315();
        final Class7005 method27316 = Class4609.field20075.field4683.rayTraceBlocks(new RayTraceContext(class9053, new Vec3d(Class4609.field20075.field4684.posX + n3 * method27315, Class4609.field20075.field4684.posY + n4 * method27315 + Class4609.field20075.field4684.method1892(), Class4609.field20075.field4684.posZ + n5 * method27315), Class2040.field11633, Class2191.field13327, Class4609.field20075.method5303()));
        return method27316 != null && method27316.method21447().equals(class9052.field38320) && method27316.method21448() == class9052.field38321;
    }
    
    public static Vec3d method13702(final Direction class179, final BlockPos class180) {
        return new Vec3d(class180.getX() + (float)Math.max(0, class179.getXOffset()) + ((class179.getXOffset() != 0) ? 0.0f : ((float)Math.random())), class180.getY() + ((class179.getYOffset() != 0) ? 0.0f : ((class179.getYOffset() != 1) ? ((float)Math.random()) : 1.0f)), class180.getZ() + (float)Math.max(0, class179.getZOffset()) + ((class179.getZOffset() != 0) ? 0.0f : ((float)Math.random())));
    }
    
    public static int method13703(final BlockState class7096) {
        return ((List)class7096.getBlock().getStateContainer().method32902()).indexOf(class7096);
    }
    
    public static int method13704(final Block class3833) {
        return Registry.BLOCK.getId(class3833);
    }
    
    public static Class9301 method13705(final BlockPos class354, final boolean b) {
        final Vec3i[] array = { new Vec3i(0, 0, 0), new Vec3i(-1, 0, 0), new Vec3i(1, 0, 0), new Vec3i(0, 0, 1), new Vec3i(0, 0, -1) };
        for (final Class9370 class355 : new Class9370[] { new Class9370(1, 1, 1, false), new Class9370(2, 1, 2, false), new Class9370(3, 1, 3, false), new Class9370(4, 1, 4, false), new Class9370(0, -1, 0, true) }) {
            for (final Vec3i class356 : array) {
                final Vec3i class357 = class355.field40185 ? new Vec3i(class356.getX() + class355.field40182, class356.getY() + class355.field40183, class356.getZ() + class355.field40184) : new Vec3i(class356.getX() * class355.field40182, class356.getY() * class355.field40183, class356.getZ() * class355.field40184);
                for (final Direction class358 : Direction.values()) {
                    if (class358 != Direction.DOWN || !b) {
                        if (method13708(class354.add(class357).method1150(class358, -1))) {
                            return new Class9301(class354.add(class357).method1150(class358, -1), class358);
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public static List<BlockPos> method13706(final BlockPos class354) {
        final ArrayList list = new ArrayList();
        final float n = method13690() - 3.0f;
        for (float n2 = -n; n2 < 1.0f; ++n2) {
            for (float n3 = -n; n3 <= n; ++n3) {
                for (float n4 = -n; n4 <= n; ++n4) {
                    final BlockPos method1133 = class354.add(n3, n2, n4);
                    if (Class4609.field20075.field4684.getPosY() >= method1133.getY()) {
                        list.add(method1133);
                    }
                }
            }
        }
        return list;
    }
    
    public static Class9301 method13707(final BlockPos class354, final boolean b, final boolean b2) {
        method13690();
        for (final BlockPos class355 : method13677(method13706(class354), new Vec3d(Class4609.field20075.field4684.posX, Class4609.field20075.field4684.posY, Class4609.field20075.field4684.posZ), b2)) {
            for (final Direction class356 : Direction.values()) {
                if (class356 != Direction.DOWN || !b) {
                    if (!method13708(class355)) {
                        if (method13708(class355.method1150(class356, -1))) {
                            return new Class9301(class355.method1150(class356, -1), class356);
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public static boolean method13708(final BlockPos class354) {
        if (class354 != null) {
            final Block method21696 = Class4609.field20075.field4683.getBlockState(class354).method21696();
            return (method21696.method11806(method21696.getDefaultState()) || !method21696.getMaterial(method21696.getDefaultState()).method26442()) && (!(method21696 instanceof Class4030) || method13703(Class4609.field20075.field4683.getBlockState(class354)) != 0);
        }
        return false;
    }
    
    public static float[] method13709(final float n, final float n2, final Class9301 class9301) {
        final Class7005 method13697 = method13697(n, n2, Class4609.field20075.field4682.method27315());
        if (method13697 != null && method13697.method21447().equals(class9301.field39906)) {
            return new float[] { n, n2 };
        }
        final float n3 = method13671(class9301.field39906)[0];
        final Vec3d class9302 = new Vec3d(class9301.field39906.getX() + 0.5, class9301.field39906.getY() + 0.5, class9301.field39906.getZ() + 0.5);
        final float n4 = (n3 + 90.0f) * 0.017453292f;
        final Vec3d method13698 = class9302.add(-MathHelper.sin(n4) / 2.1, 0.0, MathHelper.cos(n4) / 2.1);
        final float[] method13699 = Class8845.method30919(method13698.x, method13698.z, method13698.y);
        final float n5 = method13699[0];
        final float n6 = method13699[1];
        final float n7 = (n3 - 90.0f) * 0.017453292f;
        final Vec3d method13700 = new Vec3d(class9301.field39906.getX() + 0.5, class9301.field39906.getY() + 0.5, class9301.field39906.getZ() + 0.5).add(-MathHelper.sin(n7) / 2.1, 0.0, MathHelper.cos(n7) / 2.1);
        final float[] method13701 = Class8845.method30919(method13700.x, method13700.z, method13700.y);
        final float n8 = method13701[0];
        final float n9 = method13701[1];
        if (Math.abs(Class8845.method30917(MathHelper.method35668(n), MathHelper.method35668(n5))) >= Math.abs(Class8845.method30917(MathHelper.method35668(n), MathHelper.method35668(n8)))) {
            return new float[] { n8, n9 };
        }
        return new float[] { n5, n6 };
    }
    
    public static Direction method13710(final BlockPos class354) {
        Direction class355 = Direction.UP;
        final float method35668 = MathHelper.method35668(method13711(class354, Direction.UP)[0]);
        Label_0072: {
            if (method35668 >= 45.0f && method35668 <= 135.0f) {
                class355 = Direction.EAST;
            }
            else if ((method35668 < 135.0f || method35668 > 180.0f) && (method35668 > -135.0f || method35668 < -180.0f)) {
                if (method35668 <= -45.0f && method35668 >= -135.0f) {
                    class355 = Direction.WEST;
                }
                else {
                    if (method35668 < -45.0f || method35668 > 0.0f) {
                        if (method35668 > 45.0f) {
                            break Label_0072;
                        }
                        if (method35668 < 0.0f) {
                            break Label_0072;
                        }
                    }
                    class355 = Direction.NORTH;
                }
            }
            else {
                class355 = Direction.SOUTH;
            }
        }
        if (MathHelper.method35668(method13711(class354, Direction.UP)[1]) > 75.0f || MathHelper.method35668(method13711(class354, Direction.UP)[1]) < -75.0f) {
            class355 = Direction.UP;
        }
        return class355;
    }
    
    public static float[] method13711(final BlockPos class354, final Direction class355) {
        final double x = class354.getX() + 0.5 - Class4609.field20075.field4684.posX + class355.getXOffset() / 2.0;
        final double y = class354.getZ() + 0.5 - Class4609.field20075.field4684.posZ + class355.getZOffset() / 2.0;
        final double y2 = Class4609.field20075.field4684.posY + Class4609.field20075.field4684.method1892() - (class354.getY() + 0.5);
        final double x2 = MathHelper.sqrt(x * x + y * y);
        float n = (float)(Math.atan2(y, x) * 180.0 / 3.141592653589793) - 90.0f;
        final float n2 = (float)(Math.atan2(y2, x2) * 180.0 / 3.141592653589793);
        if (n < 0.0f) {
            n += 360.0f;
        }
        return new float[] { n, n2 };
    }
    
    private float method13712(final Entity class399, final BlockPos class400) {
        final float n = 6.0f;
        final float n2 = class400.getX() + 0.5f;
        final float n3 = class400.getY() + 1.0f;
        final float n4 = class400.getZ() + 0.5f;
        final float n5 = n * 2.0f;
        final Vec3d class401 = new Vec3d(n2, n3, n4);
        if (!class399.method1899()) {
            final double n6 = MathHelper.sqrt(class399.method1735(class401)) / n5;
            if (n6 <= 1.0) {
                final double n7 = class399.getPosX() - n2;
                final double n8 = class399.method1944() - n3;
                final double n9 = class399.getPosZ() - n4;
                if (MathHelper.sqrt(n7 * n7 + n8 * n8 + n9 * n9) != 0.0) {
                    final double n10 = (1.0 - n6) * Explosion.getBlockDensity(class401, class399);
                    return (float)(int)((n10 * n10 + n10) / 2.0 * 7.0 * n5 + 1.0);
                }
            }
        }
        return 0.0f;
    }
    
    static {
        field20075 = Class869.method5277();
    }
}
