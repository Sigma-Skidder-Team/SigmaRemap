// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.io.IOException;
import java.io.Reader;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import org.apache.commons.io.IOUtils;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.Collection;
import javax.annotation.Nullable;
import java.util.Comparator;
import java.util.Optional;

public class Class8787
{
    public static String field36936;
    
    public static AxisAlignedBB method30573(final Class501 class501) {
        final BlockPos method1135 = class501.getPos().add(class501.method2560());
        return new AxisAlignedBB(method1135, method1135.add(class501.method2562()));
    }
    
    public static void method30574(final BlockPos class354, final Class1849 class355) {
        class355.method6692(class354, Class7521.field29416.getDefaultState());
        ((Class500)class355.getTileEntity(class354)).method2539().method5211("test runthis");
        class355.method6692(class354.add(0, 0, -1), Class7521.field29328.getDefaultState());
    }
    
    public static void method30575(final String s, final BlockPos class354, final BlockPos class355, final int n, final Class1849 class356) {
        method30578(method30579(class354, class355, n), class354.getY(), class356);
        class356.method6692(class354, Class7521.field29820.getDefaultState());
        final Class501 class357 = (Class501)class356.getTileEntity(class354);
        class357.method2574(false);
        class357.method2558(new ResourceLocation(s));
        class357.method2563(class355);
        class357.method2571(Class102.field305);
        class357.method2596(true);
    }
    
    public static Class501 method30576(final String s, final BlockPos class354, final int n, final Class1849 class355, final boolean b) {
        final MutableBoundingBox method30579 = method30579(class354, method30583(s, class355).method19945(), n);
        method30577(class354, class355);
        method30578(method30579, class354.getY(), class355);
        final Class501 method30580 = method30584(s, class354, class355, b);
        class355.method6907().method21348(method30579, true, false);
        class355.method6933(method30579);
        return method30580;
    }
    
    private static void method30577(final BlockPos class354, final Class1849 class355) {
        final Class7859 class356 = new Class7859(class354);
        for (int i = -1; i < 4; ++i) {
            for (int j = -1; j < 4; ++j) {
                class355.method6920(class356.field32290 + i, class356.field32291 + j, true);
            }
        }
    }
    
    public static void method30578(final MutableBoundingBox class6997, final int n, final Class1849 class6998) {
        BlockPos.getAllInBox(class6997).forEach(class7000 -> method30586(n2, class7000, class6999));
        class6998.method6907().method21348(class6997, true, false);
        class6998.method6933(class6997);
        class6998.method6739((Class<? extends Entity>) Entity.class, new AxisAlignedBB(class6997.minX, class6997.minY, class6997.minZ, class6997.maxX, class6997.maxY, class6997.maxZ), class7001 -> !(class7001 instanceof PlayerEntity)).forEach(Entity::method1652);
    }
    
    public static MutableBoundingBox method30579(final BlockPos class354, final BlockPos class355, final int n) {
        final BlockPos method1134 = class354.add(-n, -3, -n);
        final BlockPos method1135 = class354.add(class355).add(n - 1, 30, n - 1);
        return MutableBoundingBox.createProper(method1134.getX(), method1134.getY(), method1134.getZ(), method1135.getX(), method1135.getY(), method1135.getZ());
    }
    
    public static Optional<BlockPos> method30580(final BlockPos class354, final int n, final Class1849 class355) {
        return method30582(class354, n, class355).stream().filter(class358 -> method30587(class358, class356, class357)).findFirst();
    }
    
    @Nullable
    public static BlockPos method30581(final BlockPos class354, final int n, final Class1849 class355) {
        return method30582(class354, n, class355).stream().min(Comparator.comparingInt(class357 -> class357.manhattanDistance(class356))).orElse(null);
    }
    
    public static Collection<BlockPos> method30582(final BlockPos class354, final int n, final Class1849 class355) {
        final ArrayList arrayList = Lists.newArrayList();
        final AxisAlignedBB method18496 = new AxisAlignedBB(class354).intersect(n);
        for (int i = (int)method18496.minX; i <= (int)method18496.maxX; ++i) {
            for (int j = (int)method18496.minY; j <= (int)method18496.maxY; ++j) {
                for (int k = (int)method18496.minZ; k <= (int)method18496.maxZ; ++k) {
                    final BlockPos class356 = new BlockPos(i, j, k);
                    if (class355.getBlockState(class356).method21696() == Class7521.field29820) {
                        arrayList.add(class356);
                    }
                }
            }
        }
        return arrayList;
    }
    
    private static Class6585 method30583(final String str, final Class1849 class1849) {
        final Class1795 method6910 = class1849.method6910();
        final Class6585 method6911 = method6910.method6519(new ResourceLocation(str));
        if (method6911 != null) {
            return method6911;
        }
        final Path value = Paths.get(Class8787.field36936, str + ".snbt");
        final CompoundNBT method6912 = method30585(value);
        if (method6912 != null) {
            return method6910.method6523(method6912);
        }
        throw new RuntimeException("Could not find structure file " + value + ", and the structure is not available in the world structures either.");
    }
    
    private static Class501 method30584(final String str, final BlockPos class354, final Class1849 class355, final boolean b) {
        class355.method6692(class354, Class7521.field29820.getDefaultState());
        final Class501 class356 = (Class501)class355.getTileEntity(class354);
        class356.method2571(Class102.field306);
        class356.method2574(false);
        class356.method2558(new ResourceLocation(str));
        class356.method2587(b);
        if (class356.method2562() != BlockPos.ZERO) {
            return class356;
        }
        class356.method2588(b, method30583(str, class355));
        if (class356.method2562() != BlockPos.ZERO) {
            return class356;
        }
        throw new RuntimeException("Failed to load structure " + str);
    }
    
    @Nullable
    private static CompoundNBT method30585(final Path path) {
        try {
            return Class5704.method16938(IOUtils.toString((Reader)Files.newBufferedReader(path)));
        }
        catch (final IOException ex) {
            return null;
        }
        catch (final CommandSyntaxException cause) {
            throw new RuntimeException("Error while trying to load structure " + path, (Throwable)cause);
        }
    }
    
    private static void method30586(final int n, final BlockPos class354, final Class1849 class355) {
        final Object method18876 = class355.method6904().method7438().method18876();
        BlockState class356;
        if (!(method18876 instanceof Class7067)) {
            if (class354.getY() != n - 1) {
                if (class354.getY() >= n - 1) {
                    class356 = Class7521.field29147.getDefaultState();
                }
                else {
                    class356 = class355.method6959(class354).method9872().method13339();
                }
            }
            else {
                class356 = class355.method6959(class354).method9872().method13338();
            }
        }
        else {
            final BlockState[] method18877 = ((Class7067)method18876).method21601();
            if (class354.getY() >= n) {
                class356 = Class7521.field29147.getDefaultState();
            }
            else {
                class356 = method18877[class354.getY() - 1];
            }
        }
        new Class118(class356, Collections.emptySet(), null).method610(class355, class354, 2);
        class355.method6694(class354, class356.getBlock());
    }
    
    private static boolean method30587(final BlockPos class354, final BlockPos class355, final Class1849 class356) {
        return method30573((Class501)class356.getTileEntity(class354)).contains(new Vec3d(class355));
    }
    
    static {
        Class8787.field36936 = "gameteststructures";
    }
}
