// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.util.math;

import com.google.common.collect.AbstractIterator;
import mapped.Class2052;
import mapped.IDynamicSerializable;
import mapped.Mutable;
import mapped.MutableBoundingBox;
import net.minecraft.dispenser.IPosition;
import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;

import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.stream.StreamSupport;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Spliterator;
import com.mojang.datafixers.Dynamic;

import javax.annotation.concurrent.Immutable;

@Immutable
public class BlockPos extends Vec3i implements IDynamicSerializable
{
    public static final BlockPos ZERO = new BlockPos(0, 0, 0);
    private static final int NUM_X_BITS = 1 + MathHelper.log2(MathHelper.smallestEncompassingPowerOfTwo(30000000));
    private static final int NUM_Z_BITS = NUM_X_BITS;
    private static final int NUM_Y_BITS = 64 - NUM_X_BITS - NUM_Z_BITS;
    private static final long X_MASK = (1L << NUM_X_BITS) - 1L;
    private static final long Y_MASK = (1L << NUM_Y_BITS) - 1L;
    private static final long Z_MASK = (1L << NUM_Z_BITS) - 1L;
    private static final int field_218292_j = NUM_Y_BITS;
    private static final int field_218293_k = NUM_Y_BITS + NUM_Z_BITS;


    public BlockPos(int x, int y, int z)
    {
        super(x, y, z);
    }

    public BlockPos(double x, double y, double z)
    {
        super(x, y, z);
    }

    public BlockPos(final Entity entity) {
        this(entity.getPosX(), entity.getPosY(), entity.getPosZ());
    }

    public BlockPos(Vec3d vec3d)
    {
        this(vec3d.x, vec3d.y, vec3d.z);
    }

    public BlockPos(IPosition iPos)
    {
        this(iPos.getX(), iPos.getY(), iPos.getZ());
    }
    
    public BlockPos(final Vec3i class352) {
        this(class352.getX(), class352.getY(), class352.getZ());
    }

    public static <T> BlockPos deserialize(Dynamic<T> p_218286_0_)
    {
        Spliterator.OfInt ofint = p_218286_0_.asIntStream().spliterator();
        int[] aint = new int[3];

        if (ofint.tryAdvance((Integer p_218285_1_) ->
        {
            aint[0] = p_218285_1_;
        }) && ofint.tryAdvance((Integer p_218280_1_) ->
        {
            aint[1] = p_218280_1_;
        }))
        {
            ofint.tryAdvance((Integer p_218284_1_) ->
            {
                aint[2] = p_218284_1_;
            });
        }
        return new BlockPos(aint[0], aint[1], aint[2]);
    }
    
    @Override
    public <T> T serialize(final DynamicOps<T> dynamicOps) {
        return dynamicOps.createIntList(IntStream.of(this.getX(), this.getY(), this.getZ()));
    }
    
    public static long offset(final long n, final Direction class179) {
        return offset(n, class179.getXOffset(), class179.getYOffset(), class179.getZOffset());
    }
    
    public static long offset(final long n, final int n2, final int n3, final int n4) {
        return pack(unpackX(n) + n2, unpackY(n) + n3, unpackZ(n) + n4);
    }
    
    public static int unpackX(final long n) {
        return (int)(n << 64 - BlockPos.field_218293_k - BlockPos.NUM_X_BITS >> 64 - BlockPos.NUM_X_BITS);
    }
    
    public static int unpackY(final long n) {
        return (int)(n << 64 - BlockPos.NUM_Y_BITS >> 64 - BlockPos.NUM_Y_BITS);
    }
    
    public static int unpackZ(final long n) {
        return (int)(n << 64 - BlockPos.field_218292_j - BlockPos.NUM_Z_BITS >> 64 - BlockPos.NUM_Z_BITS);
    }
    
    public static BlockPos fromLong(final long n) {
        return new BlockPos(unpackX(n), unpackY(n), unpackZ(n));
    }
    
    public static long pack(final int n, final int n2, final int n3) {
        return 0x0L | ((long)n & BlockPos.X_MASK) << BlockPos.field_218293_k | ((long)n2 & BlockPos.Y_MASK) << 0 | ((long)n3 & BlockPos.Z_MASK) << BlockPos.field_218292_j;
    }

    public static long func_218288_f(long p_218288_0_)
    {
        return p_218288_0_ & -16L;
    }
    
    public long toLong() {
        return pack(this.getX(), this.getY(), this.getZ());
    }

    public BlockPos add(double x, double y, double z)
    {
        return x == 0.0D && y == 0.0D && z == 0.0D ? this : new BlockPos((double)this.getX() + x, (double)this.getY() + y, (double)this.getZ() + z);
    }
    
    public BlockPos add(final int n, final int n2, final int n3) {
        if (n == 0) {
            if (n2 == 0) {
                if (n3 == 0) {
                    return this;
                }
            }
        }
        return new BlockPos(this.getX() + n, this.getY() + n2, this.getZ() + n3);
    }
    
    public BlockPos add(final Vec3i class352) {
        return this.add(class352.getX(), class352.getY(), class352.getZ());
    }
    
    public BlockPos method1136(final Vec3i class352) {
        return this.add(-class352.getX(), -class352.getY(), -class352.getZ());
    }
    
    public BlockPos method1137() {
        return this.method1149(Direction.UP);
    }
    
    public BlockPos method1138(final int n) {
        return this.method1150(Direction.UP, n);
    }
    
    public BlockPos method1139() {
        return this.method1149(Direction.DOWN);
    }
    
    public BlockPos method1140(final int n) {
        return this.method1150(Direction.DOWN, n);
    }
    
    public BlockPos method1141() {
        return this.method1149(Direction.NORTH);
    }
    
    public BlockPos method1142(final int n) {
        return this.method1150(Direction.NORTH, n);
    }
    
    public BlockPos method1143() {
        return this.method1149(Direction.SOUTH);
    }
    
    public BlockPos method1144(final int n) {
        return this.method1150(Direction.SOUTH, n);
    }
    
    public BlockPos method1145() {
        return this.method1149(Direction.WEST);
    }
    
    public BlockPos method1146(final int n) {
        return this.method1150(Direction.WEST, n);
    }
    
    public BlockPos method1147() {
        return this.method1149(Direction.EAST);
    }
    
    public BlockPos method1148(final int n) {
        return this.method1150(Direction.EAST, n);
    }
    
    public BlockPos method1149(final Direction class179) {
        return new BlockPos(this.getX() + class179.getXOffset(), this.getY() + class179.getYOffset(), this.getZ() + class179.getZOffset());
    }
    
    public BlockPos method1150(final Direction class179, final int n) {
        return (n != 0) ? new BlockPos(this.getX() + class179.getXOffset() * n, this.getY() + class179.getYOffset() * n, this.getZ() + class179.getZOffset() * n) : this;
    }
    
    public BlockPos method1151(final Class2052 class2052) {
        switch (class2052.ordinal()) {
            default: {
                return this;
            }
            case 2: {
                return new BlockPos(-this.getZ(), this.getY(), this.getX());
            }
            case 3: {
                return new BlockPos(-this.getX(), this.getY(), -this.getZ());
            }
            case 4: {
                return new BlockPos(this.getZ(), this.getY(), -this.getX());
            }
        }
    }
    
    public BlockPos method1152(final Vec3i class352) {
        return new BlockPos(this.getY() * class352.getZ() - this.getZ() * class352.getY(), this.getZ() * class352.getX() - this.getX() * class352.getZ(), this.getX() * class352.getY() - this.getY() * class352.getX());
    }
    
    public BlockPos toImmutable() {
        return this;
    }
    
    public static Iterable<BlockPos> getAllInBoxMutable(final BlockPos class354, final BlockPos class355) {
        return getAllInBoxMutable(Math.min(class354.getX(), class355.getX()), Math.min(class354.getY(), class355.getY()), Math.min(class354.getZ(), class355.getZ()), Math.max(class354.getX(), class355.getX()), Math.max(class354.getY(), class355.getY()), Math.max(class354.getZ(), class355.getZ()));
    }
    
    public static Stream<BlockPos> getAllInBox(final BlockPos class354, final BlockPos class355) {
        return getAllInBox(Math.min(class354.getX(), class355.getX()), Math.min(class354.getY(), class355.getY()), Math.min(class354.getZ(), class355.getZ()), Math.max(class354.getX(), class355.getX()), Math.max(class354.getY(), class355.getY()), Math.max(class354.getZ(), class355.getZ()));
    }
    
    public static Stream<BlockPos> getAllInBox(final MutableBoundingBox class6997) {
        return getAllInBox(Math.min(class6997.minX, class6997.maxX), Math.min(class6997.minY, class6997.maxY), Math.min(class6997.minZ, class6997.maxZ), Math.max(class6997.minX, class6997.maxX), Math.max(class6997.minY, class6997.maxY), Math.max(class6997.minZ, class6997.maxZ));
    }

    public static Stream<BlockPos> getAllInBox(final int p_218287_0_, final int p_218287_1_, final int p_218287_2_, final int p_218287_3_, final int p_218287_4_, final int p_218287_5_)
    {
        return StreamSupport.stream(new Spliterators.AbstractSpliterator<BlockPos>((long) (p_218287_3_ - p_218287_0_ + 1) * (p_218287_4_ - p_218287_1_ + 1) * (p_218287_5_ - p_218287_2_ + 1), 64)
        {
            final CubeCoordinateIterator iter = new CubeCoordinateIterator(p_218287_0_, p_218287_1_, p_218287_2_, p_218287_3_, p_218287_4_, p_218287_5_);
            final Mutable pos = new Mutable();
            public boolean tryAdvance(Consumer<? super BlockPos > p_tryAdvance_1_)
            {
                if (this.iter.hasNext())
                {
                    p_tryAdvance_1_.accept(this.pos.setPos(this.iter.getX(), this.iter.getY(), this.iter.getZ()));
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }, false);
    }

    public static Iterable<BlockPos> getAllInBoxMutable(int x1, int y1, int z1, int x2, int y2, int z2)
    {
        return () ->
        {
            return new AbstractIterator<BlockPos>()
            {
                final CubeCoordinateIterator field_218298_a = new CubeCoordinateIterator(x1, y1, z1, x2, y2, z2);
                final Mutable field_218299_b = new Mutable();
                protected BlockPos computeNext()
                {
                    return this.field_218298_a.hasNext() ? this.field_218299_b.setPos(this.field_218298_a.getX(), this.field_218298_a.getY(), this.field_218298_a.getZ()) : this.endOfData();
                }
            };
        };
    }
}
