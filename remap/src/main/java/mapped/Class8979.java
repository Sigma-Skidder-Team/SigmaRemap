// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class Class8979
{
    private static String[] field37855;
    private static Class6313 field37856;
    
    public static void method31922() {
        Class8979.field37856 = Config.method28894().method5305().method5787().method35428(Blocks.field29329.getDefaultState());
    }
    
    public static Class6313 method31923() {
        return Class8979.field37856;
    }
    
    public static Class7096 method31924() {
        return Blocks.field29329.getDefaultState();
    }
    
    public static boolean method31925(final Class1856 class1856, final Class7096 class1857, final BlockPos class1858) {
        return class1856 instanceof IBlockReader && method31927(class1856, class1857, class1858) && method31926(class1856, class1858);
    }
    
    private static boolean method31926(final IBlockReader class1855, final BlockPos class1856) {
        final Block field29329 = Blocks.field29329;
        if (class1855.getBlockState(class1856.method1141()).getBlock() != field29329) {
            if (class1855.getBlockState(class1856.method1143()).getBlock() != field29329) {
                if (class1855.getBlockState(class1856.method1145()).getBlock() != field29329) {
                    if (class1855.getBlockState(class1856.method1147()).getBlock() != field29329) {
                        return false;
                    }
                }
            }
        }
        final Class7096 method6701 = class1855.getBlockState(class1856.method1139());
        if (method6701.method21722(class1855, class1856)) {
            return true;
        }
        final Block method6702 = method6701.method21696();
        if (method6702 instanceof Class3916) {
            return method6701.method21772(Class3916.field17733) == Class109.field343;
        }
        if (method6702 instanceof SlabBlock) {
            return method6701.method21772(SlabBlock.field17777) == Class186.field598;
        }
        return false;
    }
    
    private static boolean method31927(final IBlockReader class1855, final Class7096 class1856, final BlockPos class1857) {
        if (BlockUtils.method20655(class1856, class1855, class1857)) {
            return false;
        }
        if (class1856.method21722(class1855, class1857)) {
            return false;
        }
        final Block method21696 = class1856.method21696();
        if (method21696 != Blocks.field29331) {
            Label_0040: {
                if (method21696 instanceof Class3874) {
                    if (!(method21696 instanceof Class3870)) {
                        if (!(method21696 instanceof Class3882)) {
                            if (!(method21696 instanceof Class3888)) {
                                if (!(method21696 instanceof Class3876)) {
                                    if (!(method21696 instanceof Class3890)) {
                                        break Label_0040;
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
            }
            if (!(method21696 instanceof Class3929)) {
                if (!(method21696 instanceof Class3898)) {
                    if (!(method21696 instanceof Class3974)) {
                        if (!(method21696 instanceof Class3854)) {
                            if (!(method21696 instanceof Class3981)) {
                                if (!(method21696 instanceof Class3855)) {
                                    if (method21696 instanceof Class4024) {
                                        return true;
                                    }
                                    if (method21696 instanceof Class3916) {
                                        return class1856.method21772(Class3916.field17733) == Class109.field343;
                                    }
                                    if (method21696 instanceof SlabBlock) {
                                        return class1856.method21772(SlabBlock.field17777) == Class186.field598;
                                    }
                                    if (!(method21696 instanceof Class3905)) {
                                        return method21696 instanceof Class3959 || method21696 instanceof Class3917 || method21696 instanceof Class3904 || method21696 instanceof Class4005 || method21696 instanceof Class4006;
                                    }
                                    return class1856.method21772(Class3905.field17618) != Class107.field332;
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    static {
        Class8979.field37856 = null;
    }
}
