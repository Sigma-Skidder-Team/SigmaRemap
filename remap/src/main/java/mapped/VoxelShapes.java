// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import it.unimi.dsi.fastutil.doubles.DoubleArrayList;
import com.google.common.annotations.VisibleForTesting;
import java.util.Objects;
import it.unimi.dsi.fastutil.doubles.DoubleList;
import com.google.common.math.DoubleMath;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.Arrays;
import com.google.common.math.IntMath;
import net.minecraft.util2.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;

public final class VoxelShapes
{
    private static String[] field30597;
    private static final VoxelShape field30598;
    public static final VoxelShape field30599;
    private static final VoxelShape field30600;
    
    public static VoxelShape empty() {
        return VoxelShapes.field30600;
    }
    
    public static VoxelShape fullCube() {
        return VoxelShapes.field30598;
    }
    
    public static VoxelShape method24488(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        return method24489(new AxisAlignedBB(n, n2, n3, n4, n5, n6));
    }
    
    public static VoxelShape method24489(final AxisAlignedBB class6221) {
        final int method24490 = method24490(class6221.minX, class6221.maxX);
        final int method24491 = method24490(class6221.minY, class6221.maxY);
        final int method24492 = method24490(class6221.minZ, class6221.maxZ);
        if (method24490 >= 0) {
            if (method24491 >= 0) {
                if (method24492 >= 0) {
                    if (method24490 == 0) {
                        if (method24491 == 0) {
                            if (method24492 == 0) {
                                return class6221.contains(0.5, 0.5, 0.5) ? fullCube() : empty();
                            }
                        }
                    }
                    final int n = 1 << method24490;
                    final int n2 = 1 << method24491;
                    final int n3 = 1 << method24492;
                    final int n4 = (int)Math.round(class6221.minX * n);
                    final int n5 = (int)Math.round(class6221.maxX * n);
                    final int n6 = (int)Math.round(class6221.minY * n2);
                    final int n7 = (int)Math.round(class6221.maxY * n2);
                    final int n8 = (int)Math.round(class6221.minZ * n3);
                    final int n9 = (int)Math.round(class6221.maxZ * n3);
                    final BitSetVoxelShapePart class6222 = new BitSetVoxelShapePart(n, n2, n3, n4, n6, n8, n5, n7, n9);
                    for (long n10 = n4; n10 < n5; ++n10) {
                        for (long n11 = n6; n11 < n7; ++n11) {
                            for (long n12 = n8; n12 < n9; ++n12) {
                                class6222.setFilled((int)n10, (int)n11, (int)n12, false, true);
                            }
                        }
                    }
                    return new Class7705(class6222);
                }
            }
        }
        return new VoxelShapeArray(VoxelShapes.field30598.part, new double[] { class6221.minX, class6221.maxX}, new double[] { class6221.minY, class6221.maxY}, new double[] { class6221.minZ, class6221.maxZ});
    }
    
    private static int method24490(final double n, final double n2) {
        if (n >= -1.0E-7 && n2 <= 1.0000001) {
            for (int i = 0; i <= 3; ++i) {
                final double a = n * (1 << i);
                final double a2 = n2 * (1 << i);
                final boolean b = Math.abs(a - Math.floor(a)) < 1.0E-7;
                final boolean b2 = Math.abs(a2 - Math.floor(a2)) < 1.0E-7;
                if (b && b2) {
                    return i;
                }
            }
            return -1;
        }
        return -1;
    }
    
    public static long method24491(final int n, final int n2) {
        return n * (long)(n2 / IntMath.gcd(n, n2));
    }
    
    public static VoxelShape method24492(final VoxelShape class7702, final VoxelShape class7703) {
        return method24494(class7702, class7703, IBooleanFunction.OR);
    }
    
    public static VoxelShape method24493(final VoxelShape class7702, final VoxelShape... array) {
        return Arrays.stream(array).reduce(class7702, VoxelShapes::method24492);
    }
    
    public static VoxelShape method24494(final VoxelShape class7702, final VoxelShape class7703, final IBooleanFunction class7704) {
        return method24495(class7702, class7703, class7704).simplify();
    }
    
    public static VoxelShape method24495(final VoxelShape class7702, final VoxelShape class7703, final IBooleanFunction class7704) {
        if (class7704.apply(false, false)) {
            throw Util.pauseDevMode(new IllegalArgumentException());
        }
        if (class7702 == class7703) {
            return class7704.apply(true, true) ? class7702 : empty();
        }
        final boolean method34406 = class7704.apply(true, false);
        final boolean method34407 = class7704.apply(false, true);
        if (class7702.isEmpty()) {
            return method34407 ? class7703 : empty();
        }
        if (!class7703.isEmpty()) {
            final IDoubleListMerger method34408 = method24506(1, class7702.getValues(Direction.Axis.X), class7703.getValues(Direction.Axis.X), method34406, method34407);
            final IDoubleListMerger method34409 = method24506(method34408.func_212435_a().size() - 1, class7702.getValues(Direction.Axis.Y), class7703.getValues(Direction.Axis.Y), method34406, method34407);
            final IDoubleListMerger method34410 = method24506((method34408.func_212435_a().size() - 1) * (method34409.func_212435_a().size() - 1), class7702.getValues(Direction.Axis.Z), class7703.getValues(Direction.Axis.Z), method34406, method34407);
            final BitSetVoxelShapePart method34411 = BitSetVoxelShapePart.func_197852_a(class7702.part, class7703.part, method34408, method34409, method34410, class7704);
            if (method34408 instanceof Class84) {
                if (method34409 instanceof Class84) {
                    if (method34410 instanceof Class84) {
                        return new Class7705(method34411);
                    }
                }
            }
            return new VoxelShapeArray(method34411, method34408.func_212435_a(), method34409.func_212435_a(), method34410.func_212435_a());
        }
        return method34406 ? class7702 : empty();
    }
    
    public static boolean method24496(final VoxelShape class7702, final VoxelShape class7703, final IBooleanFunction class7704) {
        if (class7704.apply(false, false)) {
            throw Util.pauseDevMode(new IllegalArgumentException());
        }
        if (class7702 == class7703) {
            return class7704.apply(true, true);
        }
        if (class7702.isEmpty()) {
            return class7704.apply(false, !class7703.isEmpty());
        }
        if (!class7703.isEmpty()) {
            final boolean method34406 = class7704.apply(true, false);
            final boolean method34407 = class7704.apply(false, true);
            for (final Direction.Axis class7705 : AxisRotation.AXES) {
                if (class7702.getEnd(class7705) < class7703.getStart(class7705) - 1.0E-7) {
                    return method34406 || method34407;
                }
                if (class7703.getEnd(class7705) < class7702.getStart(class7705) - 1.0E-7) {
                    return method34406 || method34407;
                }
            }
            final IDoubleListMerger method34408 = method24506(1, class7702.getValues(Direction.Axis.X), class7703.getValues(Direction.Axis.X), method34406, method34407);
            final IDoubleListMerger method34409 = method24506(method34408.func_212435_a().size() - 1, class7702.getValues(Direction.Axis.Y), class7703.getValues(Direction.Axis.Y), method34406, method34407);
            return method24497(method34408, method34409, method24506((method34408.func_212435_a().size() - 1) * (method34409.func_212435_a().size() - 1), class7702.getValues(Direction.Axis.Z), class7703.getValues(Direction.Axis.Z), method34406, method34407), class7702.part, class7703.part, class7704);
        }
        return class7704.apply(!class7702.isEmpty(), false);
    }
    
    private static boolean method24497(final IDoubleListMerger class83, final IDoubleListMerger class84, final IDoubleListMerger class85, final VoxelShapePart class86, final VoxelShapePart class87, final IBooleanFunction class88) {
        return !class83.forMergedIndexes((n, n2, n3) -> class84.forMergedIndexes((n3, n4, n5) -> class85.forMergedIndexes((n5, n6, n7) -> !class88.apply(class86.contains(n, n3, n5), class87.contains(n2, n4, n6)))));
    }
    
    public static double method24498(final Direction.Axis class111, final AxisAlignedBB class112, final Stream<VoxelShape> stream, double method24553) {
        final Iterator<Object> iterator = (Iterator<Object>)stream.iterator();
        while (iterator.hasNext()) {
            if (Math.abs(method24553) < 1.0E-7) {
                return 0.0;
            }
            method24553 = iterator.next().method24553(class111, class112, method24553);
        }
        return method24553;
    }
    
    public static double method24499(final Direction.Axis class111, final AxisAlignedBB class112, final Class1852 class113, final double n, final ISelectionContext class114, final Stream<VoxelShape> stream, final boolean b) {
        return method24500(class112, class113, n, class114, AxisRotation.from(class111, Direction.Axis.Z), stream, b);
    }
    
    private static double method24500(final AxisAlignedBB class6221, final Class1852 class6222, double method24553, final ISelectionContext class6223, final AxisRotation class6224, final Stream<VoxelShape> stream, final boolean b) {
        if (class6221.getXSize() >= 1.0E-6) {
            if (class6221.getYSize() >= 1.0E-6) {
                if (class6221.getZSize() >= 1.0E-6) {
                    if (Math.abs(method24553) >= 1.0E-7) {
                        final AxisRotation method24554 = class6224.reverse();
                        final Direction.Axis method24555 = method24554.rotate(Direction.Axis.X);
                        final Direction.Axis method24556 = method24554.rotate(Direction.Axis.Y);
                        final Direction.Axis method24557 = method24554.rotate(Direction.Axis.Z);
                        final Mutable class6225 = new Mutable();
                        final int n = MathHelper.floor(class6221.getMin(method24555) - 1.0E-7) - 1;
                        final int n2 = MathHelper.floor(class6221.getMax(method24555) + 1.0E-7) + 1;
                        final int n3 = MathHelper.floor(class6221.getMin(method24556) - 1.0E-7) - 1;
                        final int n4 = MathHelper.floor(class6221.getMax(method24556) + 1.0E-7) + 1;
                        final double n5 = class6221.getMin(method24557) - 1.0E-7;
                        final double n6 = class6221.getMax(method24557) + 1.0E-7;
                        final boolean b2 = method24553 > 0.0;
                        final int n7 = b2 ? (MathHelper.floor(class6221.getMax(method24557) - 1.0E-7) - 1) : (MathHelper.floor(class6221.getMin(method24557) + 1.0E-7) + 1);
                        int n8 = method24501(method24553, n5, n6);
                        final int n9 = b2 ? 1 : -1;
                        int n10 = n7;
                        while (true) {
                            if (!b2) {
                                if (n10 < n8) {
                                    break;
                                }
                            }
                            else if (n10 > n8) {
                                break;
                            }
                            for (int i = n; i <= n2; ++i) {
                                for (int j = n3; j <= n4; ++j) {
                                    int n11 = 0;
                                    if (i == n || i == n2) {
                                        ++n11;
                                    }
                                    if (j == n3 || j == n4) {
                                        ++n11;
                                    }
                                    if (n10 == n7 || n10 == n8) {
                                        ++n11;
                                    }
                                    if (n11 < 3) {
                                        class6225.method1289(method24554, i, j, n10);
                                        final BlockState method24558 = class6222.getBlockState(class6225);
                                        if (n11 != 1 || method24558.isCollisionShapeLargerThanFullBlock()) {
                                            if (n11 != 2 || method24558.getBlock() == Class7521.field29264) {
                                                VoxelShape class6226 = method24558.getCollisionShape(class6222, class6225, class6223);
                                                if (b) {
                                                    final Class5753 class6227 = new Class5753(class6225, class6226);
                                                    Client.method35173().method35188().method21097(class6227);
                                                    class6226 = class6227.method17065();
                                                }
                                                method24553 = class6226.getAllowedOffset(method24557, class6221.offset(-class6225.getX(), -class6225.getY(), -class6225.getZ()), method24553);
                                                if (Math.abs(method24553) < 1.0E-7) {
                                                    return 0.0;
                                                }
                                                n8 = method24501(method24553, n5, n6);
                                            }
                                        }
                                    }
                                }
                            }
                            n10 += n9;
                        }
                        final double[] array = { method24553 };
                        stream.forEach(class6230 -> array2[0] = class6230.getAllowedOffset(class6228, class6229, array2[0]));
                        return array[0];
                    }
                    return 0.0;
                }
            }
        }
        return method24553;
    }
    
    private static int method24501(final double n, final double n2, final double n3) {
        return (n <= 0.0) ? (MathHelper.floor(n2 + n) - 1) : (MathHelper.floor(n3 + n) + 1);
    }
    
    public static boolean method24502(final VoxelShape class7702, final VoxelShape class7703, final Direction class7704) {
        if (class7702 == fullCube() && class7703 == fullCube()) {
            return true;
        }
        if (!class7703.isEmpty()) {
            final Direction.Axis method790 = class7704.getAxis();
            final AxisDirection method791 = class7704.getAxisDirection();
            final VoxelShape class7705 = (method791 != AxisDirection.POSITIVE) ? class7703 : class7702;
            final VoxelShape class7706 = (method791 != AxisDirection.POSITIVE) ? class7702 : class7703;
            final IBooleanFunction class7707 = (method791 != AxisDirection.POSITIVE) ? IBooleanFunction.ONLY_SECOND : IBooleanFunction.ONLY_FIRST;
            if (DoubleMath.fuzzyEquals(class7705.getEnd(method790), 1.0, 1.0E-7)) {
                if (DoubleMath.fuzzyEquals(class7706.getStart(method790), 0.0, 1.0E-7)) {
                    if (!method24496(new SplitVoxelShape(class7705, method790, class7705.part.getSize(method790) - 1), new SplitVoxelShape(class7706, method790, 0), class7707)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    public static VoxelShape getFaceShape(final VoxelShape class7702, final Direction class7703) {
        if (class7702 != fullCube()) {
            final Direction.Axis method790 = class7703.getAxis();
            boolean b;
            int n;
            if (class7703.getAxisDirection() != AxisDirection.POSITIVE) {
                b = DoubleMath.fuzzyEquals(class7702.getStart(method790), 0.0, 1.0E-7);
                n = 0;
            }
            else {
                b = DoubleMath.fuzzyEquals(class7702.getEnd(method790), 1.0, 1.0E-7);
                n = class7702.part.getSize(method790) - 1;
            }
            return b ? new SplitVoxelShape(class7702, method790, n) : empty();
        }
        return fullCube();
    }
    
    public static boolean method24504(final VoxelShape class7702, final VoxelShape class7703, final Direction class7704) {
        if (class7702 != fullCube() && class7703 != fullCube()) {
            final Direction.Axis method790 = class7704.getAxis();
            final AxisDirection method791 = class7704.getAxisDirection();
            VoxelShape method792 = (method791 != AxisDirection.POSITIVE) ? class7703 : class7702;
            VoxelShape method793 = (method791 != AxisDirection.POSITIVE) ? class7702 : class7703;
            if (!DoubleMath.fuzzyEquals(method792.getEnd(method790), 1.0, 1.0E-7)) {
                method792 = empty();
            }
            if (!DoubleMath.fuzzyEquals(method793.getStart(method790), 0.0, 1.0E-7)) {
                method793 = empty();
            }
            return !method24496(fullCube(), method24495(new SplitVoxelShape(method792, method790, method792.part.getSize(method790) - 1), new SplitVoxelShape(method793, method790, 0), IBooleanFunction.OR), IBooleanFunction.ONLY_FIRST);
        }
        return true;
    }
    
    public static boolean method24505(final VoxelShape class7702, final VoxelShape class7703) {
        return class7702 == fullCube() || class7703 == fullCube() || ((!class7702.isEmpty() || !class7703.isEmpty()) && !method24496(fullCube(), method24495(class7702, class7703, IBooleanFunction.OR), IBooleanFunction.ONLY_FIRST));
    }
    
    @VisibleForTesting
    public static IDoubleListMerger method24506(final int n, final DoubleList a, final DoubleList b, final boolean b2, final boolean b3) {
        final int n2 = a.size() - 1;
        final int n3 = b.size() - 1;
        if (a instanceof DoubleRangeList) {
            if (b instanceof DoubleRangeList) {
                if (n * method24491(n2, n3) <= 256L) {
                    return new Class84(n2, n3);
                }
            }
        }
        if (a.getDouble(n2) < b.getDouble(0) - 1.0E-7) {
            return new Class82(a, b, false);
        }
        if (b.getDouble(n3) < a.getDouble(0) - 1.0E-7) {
            return new Class82(b, a, true);
        }
        if (n2 != n3 || !Objects.equals(a, b)) {
            return new Class85(a, b, b2, b3);
        }
        if (!(a instanceof Class86)) {
            return (b instanceof Class86) ? b : new Class86(a);
        }
        return (IDoubleListMerger)a;
    }
    
    static {
        field30598 = Util.method27850(() -> {
            final BitSetVoxelShapePart class8259 = new BitSetVoxelShapePart(1, 1, 1);
            class8259.setFilled(0, 0, 0, true, true);
            return new Class7705(class8259);
        });
        field30599 = method24488(Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        field30600 = new VoxelShapeArray(new BitSetVoxelShapePart(0, 0, 0), (DoubleList)new DoubleArrayList(new double[] { 0.0 }), (DoubleList)new DoubleArrayList(new double[] { 0.0 }), (DoubleList)new DoubleArrayList(new double[] { 0.0 }));
    }

    public static interface ILineConsumer
    {
        void consume(final double p0, final double p1, final double p2, final double p3, final double p4, final double p5);
    }
}
