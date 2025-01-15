// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3i;
import org.apache.logging.log4j.LogManager;

import java.util.stream.StreamSupport;
import java.util.stream.Stream;
import java.util.stream.IntStream;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Spliterator;
import com.mojang.datafixers.Dynamic;
import org.apache.logging.log4j.Logger;
import javax.annotation.concurrent.Immutable;

@Immutable
public class BlockPos extends Vec3i implements IDynamicSerializable
{
    private static final Logger LOGGER;
    public static final BlockPos ZERO = new BlockPos(0, 0, 0);
    private static final int NUM_X_BITS;
    private static final int NUM_Z_BITS = NUM_X_BITS;
    private static final int NUM_Y_BITS = 64 - NUM_X_BITS - NUM_Z_BITS;
    private static final long X_MASK = (1L << NUM_X_BITS) - 1L;
    private static final long Y_MASK = (1L << NUM_Y_BITS) - 1L;
    private static final long Z_MASK = (1L << NUM_Z_BITS) - 1L;
    private static final int field_218292_j = NUM_Y_BITS;
    private static final int field_218293_k = NUM_Y_BITS + NUM_Z_BITS;

    
    public BlockPos(final int n, final int n2, final int n3) {
        super(n, n2, n3);
    }
    
    public BlockPos(final double n, final double n2, final double n3) {
        super(n, n2, n3);
    }
    
    public BlockPos(final Entity class399) {
        this(class399.method1938(), class399.method1941(), class399.method1945());
    }
    
    public BlockPos(final Class5487 class5487) {
        this(class5487.field22770, class5487.field22771, class5487.field22772);
    }
    
    public BlockPos(final Class5488 class5488) {
        this(class5488.method16760(), class5488.method16761(), class5488.method16762());
    }
    
    public BlockPos(final Vec3i class352) {
        this(class352.getX(), class352.getY(), class352.getZ());
    }
    
    public static <T> BlockPos method1122(final Dynamic<T> dynamic) {
        final Spliterator.OfInt spliterator = dynamic.asIntStream().spliterator();
        final int[] array = new int[3];
        if (spliterator.tryAdvance(n -> array2[0] = n)) {
            if (spliterator.tryAdvance(n2 -> array3[1] = n2)) {
                spliterator.tryAdvance(n3 -> array4[2] = n3);
            }
        }
        return new BlockPos(array[0], array[1], array[2]);
    }
    
    @Override
    public <T> T method1123(final DynamicOps<T> dynamicOps) {
        return (T)dynamicOps.createIntList(IntStream.of(this.getX(), this.getY(), this.getZ()));
    }
    
    public static long method1124(final long n, final Direction class179) {
        return method1125(n, class179.getXOffset(), class179.getYOffset(), class179.getZOffset());
    }
    
    public static long method1125(final long n, final int n2, final int n3, final int n4) {
        return pack(method1126(n) + n2, method1127(n) + n3, method1128(n) + n4);
    }
    
    public static int method1126(final long n) {
        return (int)(n << 64 - BlockPos.field_218293_k - BlockPos.NUM_X_BITS >> 64 - BlockPos.NUM_X_BITS);
    }
    
    public static int method1127(final long n) {
        return (int)(n << 64 - BlockPos.NUM_Y_BITS >> 64 - BlockPos.NUM_Y_BITS);
    }
    
    public static int method1128(final long n) {
        return (int)(n << 64 - BlockPos.field_218292_j - BlockPos.NUM_Z_BITS >> 64 - BlockPos.NUM_Z_BITS);
    }
    
    public static BlockPos method1129(final long n) {
        return new BlockPos(method1126(n), method1127(n), method1128(n));
    }
    
    public static long pack(final int n, final int n2, final int n3) {
        return 0x0L | ((long)n & BlockPos.X_MASK) << BlockPos.field_218293_k | ((long)n2 & BlockPos.Y_MASK) << 0 | ((long)n3 & BlockPos.Z_MASK) << BlockPos.field_218292_j;
    }
    
    public static long method1131(final long n) {
        return n & 0xFFFFFFFFFFFFFFF0L;
    }
    
    public long method1132() {
        return pack(this.getX(), this.getY(), this.getZ());
    }
    
    public BlockPos method1133(final double n, final double n2, final double n3) {
        if (n == 0.0) {
            if (n2 == 0.0) {
                if (n3 == 0.0) {
                    return this;
                }
            }
        }
        return new BlockPos(this.getX() + n, this.getY() + n2, this.getZ() + n3);
    }
    
    public BlockPos method1134(final int n, final int n2, final int n3) {
        if (n == 0) {
            if (n2 == 0) {
                if (n3 == 0) {
                    return this;
                }
            }
        }
        return new BlockPos(this.getX() + n, this.getY() + n2, this.getZ() + n3);
    }
    
    public BlockPos method1135(final Vec3i class352) {
        return this.method1134(class352.getX(), class352.getY(), class352.getZ());
    }
    
    public BlockPos method1136(final Vec3i class352) {
        return this.method1134(-class352.getX(), -class352.getY(), -class352.getZ());
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
        switch (Class7867.field32310[class2052.ordinal()]) {
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
    
    public BlockPos method1153() {
        return this;
    }
    
    public static Iterable<BlockPos> method1154(final BlockPos class354, final BlockPos class355) {
        return method1158(Math.min(class354.getX(), class355.getX()), Math.min(class354.getY(), class355.getY()), Math.min(class354.getZ(), class355.getZ()), Math.max(class354.getX(), class355.getX()), Math.max(class354.getY(), class355.getY()), Math.max(class354.getZ(), class355.getZ()));
    }
    
    public static Stream<BlockPos> method1155(final BlockPos class354, final BlockPos class355) {
        return method1157(Math.min(class354.getX(), class355.getX()), Math.min(class354.getY(), class355.getY()), Math.min(class354.getZ(), class355.getZ()), Math.max(class354.getX(), class355.getX()), Math.max(class354.getY(), class355.getY()), Math.max(class354.getZ(), class355.getZ()));
    }
    
    public static Stream<BlockPos> method1156(final Class6997 class6997) {
        return method1157(Math.min(class6997.field27293, class6997.field27296), Math.min(class6997.field27294, class6997.field27297), Math.min(class6997.field27295, class6997.field27298), Math.max(class6997.field27293, class6997.field27296), Math.max(class6997.field27294, class6997.field27297), Math.max(class6997.field27295, class6997.field27298));
    }
    
    public static Stream<BlockPos> method1157(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        return StreamSupport.stream((Spliterator<BlockPos>)new Class7580((n4 - n + 1) * (n5 - n2 + 1) * (n6 - n3 + 1), 64, n, n2, n3, n4, n5, n6), false);
    }
    
    public static Iterable<BlockPos> method1158(final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
        return () -> new Class7248(n7, n8, n9, n10, n11, n12);
    }
    
    static {
        LOGGER = LogManager.getLogger();
        ZERO = new BlockPos(0, 0, 0);
        NUM_X_BITS = 1 + MathHelper.method35682(MathHelper.method35679(30000000));
        NUM_Z_BITS = BlockPos.NUM_X_BITS;
        NUM_Y_BITS = 64 - BlockPos.NUM_X_BITS - BlockPos.NUM_Z_BITS;
        X_MASK = (1L << BlockPos.NUM_X_BITS) - 1L;
        Y_MASK = (1L << BlockPos.NUM_Y_BITS) - 1L;
        Z_MASK = (1L << BlockPos.NUM_Z_BITS) - 1L;
        field_218292_j = BlockPos.NUM_Y_BITS;
        field_218293_k = BlockPos.NUM_Y_BITS + BlockPos.NUM_Z_BITS;
    }
}
