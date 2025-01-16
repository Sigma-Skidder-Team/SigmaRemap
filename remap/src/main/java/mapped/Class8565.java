// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;

import java.util.function.BiPredicate;
import java.util.function.Function;

public class Class8565
{
    private static String[] field35992;
    
    public static <S extends TileEntity> Class7191<S> method28798(final Class5412<S> class5412, final Function<BlockState, Class2083> function, final Function<BlockState, Direction> function2, final Class7115 class5413, final BlockState class5414, final Class1851 class5415, final BlockPos class5416, final BiPredicate<Class1851, BlockPos> biPredicate) {
        final TileEntity method16524 = class5412.method16524(class5415, class5416);
        if (method16524 == null) {
            return Class6389::method19072;
        }
        if (biPredicate.test(class5415, class5416)) {
            return Class6389::method19072;
        }
        final Class2083 class5417 = function.apply(class5414);
        final boolean b = class5417 == Class2083.field12047;
        final boolean b2 = class5417 == Class2083.field12048;
        if (!b) {
            final BlockPos method16525 = class5416.method1149(function2.apply(class5414));
            final BlockState method16526 = class5415.getBlockState(method16525);
            if (method16526.getBlock() == class5414.getBlock()) {
                final Class2083 class5418 = function.apply(method16526);
                if (class5418 != Class2083.field12047) {
                    if (class5417 != class5418) {
                        if (((StateHolder<Object, Object>)method16526).get((IProperty<Comparable>)class5413) == class5414.get((IProperty<Comparable>)class5413)) {
                            if (biPredicate.test(class5415, method16525)) {
                                return Class6389::method19072;
                            }
                            final TileEntity method16527 = class5412.method16524(class5415, method16525);
                            if (method16527 != null) {
                                return new Class7192<S>(b2 ? method16524 : method16527, b2 ? method16527 : method16524);
                            }
                        }
                    }
                }
            }
            return new Class7190<S>((S)method16524);
        }
        return new Class7190<S>((S)method16524);
    }
}
