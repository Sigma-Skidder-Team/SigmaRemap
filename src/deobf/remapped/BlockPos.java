package remapped;

import com.mojang.serialization.Codec;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.concurrent.Immutable;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Immutable
public class BlockPos extends Vector3i {
   public static final Codec<BlockPos> field_7305 = Codec.INT_STREAM
      .comapFlatMap(
         var0 -> Util.method_44654(var0, 3).map(var0x -> new BlockPos(var0x[0], var0x[1], var0x[2])),
         var0 -> IntStream.of(var0.getX(), var0.method_12165(), var0.method_12185())
      )
      .stable();
   private static final Logger field_7307 = LogManager.getLogger();
   public static final BlockPos field_7306 = new BlockPos(0, 0, 0);
   private static final int field_7313 = 1 + MathHelper.log2(MathHelper.smallestEncompassingPowerOfTwo(30000000));
   private static final int field_7310 = field_7313;
   private static final int field_7308 = 64 - field_7313 - field_7310;
   private static final long field_7312 = (1L << field_7313) - 1L;
   private static final long field_7309 = (1L << field_7308) - 1L;
   private static final long field_7302 = (1L << field_7310) - 1L;
   private static final int field_7304 = field_7308;
   private static final int field_7311 = field_7308 + field_7310;

   public BlockPos(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public BlockPos(double var1, double var3, double var5) {
      super(var1, var3, var5);
   }

   public BlockPos(class_1343 var1) {
      this(var1.field_7336, var1.field_7333, var1.field_7334);
   }

   public BlockPos(class_66 var1) {
      this(var1.method_61(), var1.method_60(), var1.method_62());
   }

   public BlockPos(Vector3i var1) {
      this(var1.getX(), var1.method_12165(), var1.method_12185());
   }

   public static long method_6097(long var0, Direction var2) {
      return method_6096(var0, var2.method_1041(), var2.method_1054(), var2.method_1034());
   }

   public static long method_6096(long var0, int var2, int var3, int var4) {
      return method_6107(method_6080(var0) + var2, method_6067(var0) + var3, method_6092(var0) + var4);
   }

   public static int method_6080(long var0) {
      return (int)(var0 << 64 - field_7311 - field_7313 >> 64 - field_7313);
   }

   public static int method_6067(long var0) {
      return (int)(var0 << 64 - field_7308 >> 64 - field_7308);
   }

   public static int method_6092(long var0) {
      return (int)(var0 << 64 - field_7304 - field_7310 >> 64 - field_7310);
   }

   public static BlockPos method_6088(long var0) {
      return new BlockPos(method_6080(var0), method_6067(var0), method_6092(var0));
   }

   public long method_6077() {
      return method_6107(this.getX(), this.method_12165(), this.method_12185());
   }

   public static long method_6107(int var0, int var1, int var2) {
      long var5 = 0L;
      var5 |= ((long)var0 & field_7312) << field_7311;
      var5 |= ((long)var1 & field_7309) << 0;
      return var5 | ((long)var2 & field_7302) << field_7304;
   }

   public static long method_6087(long var0) {
      return var0 & -16L;
   }

   public BlockPos method_6103(double var1, double var3, double var5) {
      return var1 == 0.0 && var3 == 0.0 && var5 == 0.0
         ? this
         : new BlockPos((double)this.getX() + var1, (double)this.method_12165() + var3, (double)this.method_12185() + var5);
   }

   public BlockPos method_6104(int var1, int var2, int var3) {
      return var1 == 0 && var2 == 0 && var3 == 0 ? this : new BlockPos(this.getX() + var1, this.method_12165() + var2, this.method_12185() + var3);
   }

   public BlockPos method_6105(Vector3i var1) {
      return this.method_6104(var1.getX(), var1.method_12165(), var1.method_12185());
   }

   public BlockPos method_6093(Vector3i var1) {
      return this.method_6104(-var1.getX(), -var1.method_12165(), -var1.method_12185());
   }

   public BlockPos method_6081() {
      return this.method_6098(Direction.field_817);
   }

   public BlockPos method_6082(int var1) {
      return this.method_6099(Direction.field_817, var1);
   }

   public BlockPos method_6100() {
      return this.method_6098(Direction.field_802);
   }

   public BlockPos method_6101(int var1) {
      return this.method_6099(Direction.field_802, var1);
   }

   public BlockPos method_6094() {
      return this.method_6098(Direction.field_818);
   }

   public BlockPos method_6095(int var1) {
      return this.method_6099(Direction.field_818, var1);
   }

   public BlockPos method_6073() {
      return this.method_6098(Direction.field_800);
   }

   public BlockPos method_6074(int var1) {
      return this.method_6099(Direction.field_800, var1);
   }

   public BlockPos method_6108() {
      return this.method_6098(Direction.field_809);
   }

   public BlockPos method_6109(int var1) {
      return this.method_6099(Direction.field_809, var1);
   }

   public BlockPos method_6090() {
      return this.method_6098(Direction.field_804);
   }

   public BlockPos method_6091(int var1) {
      return this.method_6099(Direction.field_804, var1);
   }

   public BlockPos method_6098(Direction var1) {
      return new BlockPos(this.getX() + var1.method_1041(), this.method_12165() + var1.method_1054(), this.method_12185() + var1.method_1034());
   }

   public BlockPos method_6099(Direction var1, int var2) {
      return var2 != 0
         ? new BlockPos(
            this.getX() + var1.method_1041() * var2, this.method_12165() + var1.method_1054() * var2, this.method_12185() + var1.method_1034() * var2
         )
         : this;
   }

   public BlockPos method_6068(class_9249 var1, int var2) {
      if (var2 != 0) {
         int var5 = var1 != class_9249.field_47215 ? 0 : var2;
         int var6 = var1 != class_9249.field_47216 ? 0 : var2;
         int var7 = var1 != class_9249.field_47219 ? 0 : var2;
         return new BlockPos(this.getX() + var5, this.method_12165() + var6, this.method_12185() + var7);
      } else {
         return this;
      }
   }

   public BlockPos method_6078(class_6631 var1) {
      switch (var1) {
         case field_34340:
         default:
            return this;
         case field_34334:
            return new BlockPos(-this.method_12185(), this.method_12165(), this.getX());
         case field_34338:
            return new BlockPos(-this.getX(), this.method_12165(), -this.method_12185());
         case field_34335:
            return new BlockPos(this.method_12185(), this.method_12165(), -this.getX());
      }
   }

   public BlockPos method_6071(Vector3i var1) {
      return new BlockPos(
         this.method_12165() * var1.method_12185() - this.method_12185() * var1.method_12165(),
         this.method_12185() * var1.getX() - this.getX() * var1.method_12185(),
         this.getX() * var1.method_12165() - this.method_12165() * var1.getX()
      );
   }

   public BlockPos method_6072() {
      return this;
   }

   public class_2921 method_6089() {
      return new class_2921(this.getX(), this.method_12165(), this.method_12185());
   }

   public static Iterable<BlockPos> method_6079(Random var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var10 = var5 - var2 + 1;
      int var11 = var6 - var3 + 1;
      int var12 = var7 - var4 + 1;
      return () -> new class_3436(var1, var2, var0, var10, var3, var11, var4, var12);
   }

   public static Iterable<BlockPos> method_6106(BlockPos var0, int var1, int var2, int var3) {
      int var6 = var1 + var2 + var3;
      int var7 = var0.getX();
      int var8 = var0.method_12165();
      int var9 = var0.method_12185();
      return () -> new class_5606(var9, var6, var1, var2, var3, var7, var8);
   }

   public static Optional<BlockPos> method_6102(BlockPos var0, int var1, int var2, Predicate<BlockPos> var3) {
      return method_6069(var0, var1, var2, var1).filter(var3).findFirst();
   }

   public static Stream<BlockPos> method_6069(BlockPos var0, int var1, int var2, int var3) {
      return StreamSupport.<BlockPos>stream(method_6106(var0, var1, var2, var3).spliterator(), false);
   }

   public static Iterable<BlockPos> method_6076(BlockPos var0, BlockPos var1) {
      return method_6075(
         Math.min(var0.getX(), var1.getX()),
         Math.min(var0.method_12165(), var1.method_12165()),
         Math.min(var0.method_12185(), var1.method_12185()),
         Math.max(var0.getX(), var1.getX()),
         Math.max(var0.method_12165(), var1.method_12165()),
         Math.max(var0.method_12185(), var1.method_12185())
      );
   }

   public static Stream<BlockPos> method_6084(BlockPos var0, BlockPos var1) {
      return StreamSupport.<BlockPos>stream(method_6076(var0, var1).spliterator(), false);
   }

   public static Stream<BlockPos> method_6086(class_9616 var0) {
      return method_6083(
         Math.min(var0.field_48996, var0.field_48991),
         Math.min(var0.field_48995, var0.field_48993),
         Math.min(var0.field_48992, var0.field_48994),
         Math.max(var0.field_48996, var0.field_48991),
         Math.max(var0.field_48995, var0.field_48993),
         Math.max(var0.field_48992, var0.field_48994)
      );
   }

   public static Stream<BlockPos> method_6085(Box var0) {
      return method_6083(
         MathHelper.floor(var0.field_19941),
         MathHelper.floor(var0.field_19937),
         MathHelper.floor(var0.field_19938),
         MathHelper.floor(var0.field_19940),
         MathHelper.floor(var0.field_19939),
         MathHelper.floor(var0.field_19942)
      );
   }

   public static Stream<BlockPos> method_6083(int var0, int var1, int var2, int var3, int var4, int var5) {
      return StreamSupport.<BlockPos>stream(method_6075(var0, var1, var2, var3, var4, var5).spliterator(), false);
   }

   public static Iterable<BlockPos> method_6075(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var8 = var3 - var0 + 1;
      int var9 = var4 - var1 + 1;
      int var10 = var5 - var2 + 1;
      int var11 = var8 * var9 * var10;
      return () -> new class_7662(var11, var8, var9, var0, var1, var2);
   }

   public static Iterable<class_2921> method_6070(BlockPos var0, int var1, Direction var2, Direction var3) {
      Validate.validState(var2.method_1029() != var3.method_1029(), "The two directions cannot be on the same axis", new Object[0]);
      return () -> new class_1698(var2, var3, var0, var1);
   }
}
