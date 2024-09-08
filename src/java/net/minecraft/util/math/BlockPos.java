package net.minecraft.util.math;

import com.mojang.serialization.Codec;
import mapped.*;
import net.minecraft.client.util.Util;
import net.minecraft.util.Direction;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.math.vector.Vector3i;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.concurrent.Immutable;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@Immutable
public class BlockPos extends Vector3i {
   public static final Codec<BlockPos> field13030 = Codec.INT_STREAM
      .comapFlatMap(
         var0 -> Util.method38530(var0, 3).map(var0x -> new BlockPos(var0x[0], var0x[1], var0x[2])),
         var0 -> IntStream.of(var0.getX(), var0.getY(), var0.getZ())
      )
      .stable();
   private static final Logger field13031 = LogManager.getLogger();
   public static final BlockPos ZERO = new BlockPos(0, 0, 0);
   private static final int field13033 = 1 + MathHelper.method37803(MathHelper.method37800(30000000));
   private static final int field13034 = field13033;
   private static final int field13035 = 64 - field13033 - field13034;
   private static final long field13036 = (1L << field13033) - 1L;
   private static final long field13037 = (1L << field13035) - 1L;
   private static final long field13038 = (1L << field13034) - 1L;
   private static final int field13039 = field13035;
   private static final int field13040 = field13035 + field13034;

   public BlockPos(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public BlockPos(double var1, double var3, double var5) {
      super(var1, var3, var5);
   }

   public BlockPos(Vector3d var1) {
      this(var1.x, var1.y, var1.z);
   }

   public BlockPos(Class2955 var1) {
      this(var1.getX(), var1.getY(), var1.getZ());
   }

   public BlockPos(Vector3i var1) {
      this(var1.getX(), var1.getY(), var1.getZ());
   }

   public static long method8314(long var0, Direction var2) {
      return method8327(var0, var2.method539(), var2.method540(), var2.method541());
   }

   public static long method8327(long var0, int var2, int var3, int var4) {
      return method8333(method8328(var0) + var2, method8329(var0) + var3, method8330(var0) + var4);
   }

   public static int method8328(long var0) {
      return (int)(var0 << 64 - field13040 - field13033 >> 64 - field13033);
   }

   public static int method8329(long var0) {
      return (int)(var0 << 64 - field13035 >> 64 - field13035);
   }

   public static int method8330(long var0) {
      return (int)(var0 << 64 - field13039 - field13034 >> 64 - field13034);
   }

   public static BlockPos method8331(long var0) {
      return new BlockPos(method8328(var0), method8329(var0), method8330(var0));
   }

   public long method8332() {
      return method8333(this.getX(), this.getY(), this.getZ());
   }

   public static long method8333(int var0, int var1, int var2) {
      long var5 = 0L;
      var5 |= ((long)var0 & field13036) << field13040;
      var5 |= ((long)var1 & field13037) << 0;
      return var5 | ((long)var2 & field13038) << field13039;
   }

   public static long method8334(long var0) {
      return var0 & -16L;
   }

   public BlockPos method8335(double var1, double var3, double var5) {
      return var1 == 0.0 && var3 == 0.0 && var5 == 0.0
         ? this
         : new BlockPos((double)this.getX() + var1, (double)this.getY() + var3, (double)this.getZ() + var5);
   }

   public BlockPos method8336(int var1, int var2, int var3) {
      return var1 == 0 && var2 == 0 && var3 == 0 ? this : new BlockPos(this.getX() + var1, this.getY() + var2, this.getZ() + var3);
   }

   public BlockPos method8337(Vector3i var1) {
      return this.method8336(var1.getX(), var1.getY(), var1.getZ());
   }

   public BlockPos method8338(Vector3i var1) {
      return this.method8336(-var1.getX(), -var1.getY(), -var1.getZ());
   }

   public BlockPos up() {
      return this.method8349(Direction.field673);
   }

   public BlockPos method8339(int var1) {
      return this.method8350(Direction.field673, var1);
   }

   public BlockPos down() {
      return this.method8349(Direction.DOWN);
   }

   public BlockPos method8340(int var1) {
      return this.method8350(Direction.DOWN, var1);
   }

   public BlockPos north() {
      return this.method8349(Direction.NORTH);
   }

   public BlockPos method8342(int var1) {
      return this.method8350(Direction.NORTH, var1);
   }

   public BlockPos south() {
      return this.method8349(Direction.SOUTH);
   }

   public BlockPos method8344(int var1) {
      return this.method8350(Direction.SOUTH, var1);
   }

   public BlockPos west() {
      return this.method8349(Direction.WEST);
   }

   public BlockPos method8346(int var1) {
      return this.method8350(Direction.WEST, var1);
   }

   public BlockPos east() {
      return this.method8349(Direction.EAST);
   }

   public BlockPos method8348(int var1) {
      return this.method8350(Direction.EAST, var1);
   }

   public BlockPos method8349(Direction var1) {
      return new BlockPos(this.getX() + var1.method539(), this.getY() + var1.method540(), this.getZ() + var1.method541());
   }

   public BlockPos method8350(Direction var1, int var2) {
      return var2 != 0
         ? new BlockPos(this.getX() + var1.method539() * var2, this.getY() + var1.method540() * var2, this.getZ() + var1.method541() * var2)
         : this;
   }

   public BlockPos method8351(Class113 var1, int var2) {
      if (var2 != 0) {
         int var5 = var1 != Class113.field413 ? 0 : var2;
         int var6 = var1 != Class113.field414 ? 0 : var2;
         int var7 = var1 != Class113.field415 ? 0 : var2;
         return new BlockPos(this.getX() + var5, this.getY() + var6, this.getZ() + var7);
      } else {
         return this;
      }
   }

   public BlockPos method8352(Class80 var1) {
      switch (Class4503.field21730[var1.ordinal()]) {
         case 1:
         default:
            return this;
         case 2:
            return new BlockPos(-this.getZ(), this.getY(), this.getX());
         case 3:
            return new BlockPos(-this.getX(), this.getY(), -this.getZ());
         case 4:
            return new BlockPos(this.getZ(), this.getY(), -this.getX());
      }
   }

   public BlockPos method8315(Vector3i var1) {
      return new BlockPos(
         this.getY() * var1.getZ() - this.getZ() * var1.getY(),
         this.getZ() * var1.getX() - this.getX() * var1.getZ(),
         this.getX() * var1.getY() - this.getY() * var1.getX()
      );
   }

   public BlockPos toImmutable() {
      return this;
   }

   public Mutable method8354() {
      return new Mutable(this.getX(), this.getY(), this.getZ());
   }

   public static Iterable<BlockPos> method8355(Random var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var10 = var5 - var2 + 1;
      int var11 = var6 - var3 + 1;
      int var12 = var7 - var4 + 1;
      return () -> new Class4551(var1, var2, var0, var10, var3, var11, var4, var12);
   }

   public static Iterable<BlockPos> method8356(BlockPos var0, int var1, int var2, int var3) {
      int var6 = var1 + var2 + var3;
      int var7 = var0.getX();
      int var8 = var0.getY();
      int var9 = var0.getZ();
      return () -> new Class4550(var9, var6, var1, var2, var3, var7, var8);
   }

   public static Optional<BlockPos> method8357(BlockPos var0, int var1, int var2, Predicate<BlockPos> var3) {
      return method8358(var0, var1, var2, var1).filter(var3).findFirst();
   }

   public static Stream<BlockPos> method8358(BlockPos var0, int var1, int var2, int var3) {
      return StreamSupport.<BlockPos>stream(method8356(var0, var1, var2, var3).spliterator(), false);
   }

   public static Iterable<BlockPos> method8359(BlockPos var0, BlockPos var1) {
      return method8364(
         Math.min(var0.getX(), var1.getX()),
         Math.min(var0.getY(), var1.getY()),
         Math.min(var0.getZ(), var1.getZ()),
         Math.max(var0.getX(), var1.getX()),
         Math.max(var0.getY(), var1.getY()),
         Math.max(var0.getZ(), var1.getZ())
      );
   }

   public static Stream<BlockPos> method8360(BlockPos var0, BlockPos var1) {
      return StreamSupport.<BlockPos>stream(method8359(var0, var1).spliterator(), false);
   }

   public static Stream<BlockPos> method8361(Class9764 var0) {
      return method8363(
         Math.min(var0.field45678, var0.field45681),
         Math.min(var0.field45679, var0.field45682),
         Math.min(var0.field45680, var0.field45683),
         Math.max(var0.field45678, var0.field45681),
         Math.max(var0.field45679, var0.field45682),
         Math.max(var0.field45680, var0.field45683)
      );
   }

   public static Stream<BlockPos> method8362(AxisAlignedBB var0) {
      return method8363(
         MathHelper.floor(var0.minX),
         MathHelper.floor(var0.minY),
         MathHelper.floor(var0.minZ),
         MathHelper.floor(var0.maxX),
         MathHelper.floor(var0.maxY),
         MathHelper.floor(var0.maxZ)
      );
   }

   public static Stream<BlockPos> method8363(int var0, int var1, int var2, int var3, int var4, int var5) {
      return StreamSupport.<BlockPos>stream(method8364(var0, var1, var2, var3, var4, var5).spliterator(), false);
   }

   public static Iterable<BlockPos> method8364(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var8 = var3 - var0 + 1;
      int var9 = var4 - var1 + 1;
      int var10 = var5 - var2 + 1;
      int var11 = var8 * var9 * var10;
      return () -> new Class4554(var11, var8, var9, var0, var1, var2);
   }

   public static Iterable<Mutable> method8365(BlockPos var0, int var1, Direction var2, Direction var3) {
      Validate.validState(var2.method544() != var3.method544(), "The two directions cannot be on the same axis", new Object[0]);
      return () -> new Class4556(var2, var3, var0, var1);
   }

   public static class Mutable extends BlockPos {
      public Mutable() {
         this(0, 0, 0);
      }

      public Mutable(int var1, int var2, int var3) {
         super(var1, var2, var3);
      }

      public Mutable(double var1, double var3, double var5) {
         this(MathHelper.floor(var1), MathHelper.floor(var3), MathHelper.floor(var5));
      }

      @Override
      public BlockPos method8335(double var1, double var3, double var5) {
         return super.method8335(var1, var3, var5).toImmutable();
      }

      @Override
      public BlockPos method8336(int var1, int var2, int var3) {
         return super.method8336(var1, var2, var3).toImmutable();
      }

      @Override
      public BlockPos method8350(Direction var1, int var2) {
         return super.method8350(var1, var2).toImmutable();
      }

      @Override
      public BlockPos method8351(Class113 var1, int var2) {
         return super.method8351(var1, var2).toImmutable();
      }

      @Override
      public BlockPos method8352(Class80 var1) {
         return super.method8352(var1).toImmutable();
      }

      public Mutable method8372(int var1, int var2, int var3) {
         this.method8307(var1);
         this.method8308(var2);
         this.method8309(var3);
         return this;
      }

      public Mutable method8373(double var1, double var3, double var5) {
         return this.method8372(MathHelper.floor(var1), MathHelper.floor(var3), MathHelper.floor(var5));
      }

      public Mutable method8374(Vector3i var1) {
         return this.method8372(var1.getX(), var1.getY(), var1.getZ());
      }

      public Mutable method8375(long var1) {
         return this.method8372(method8328(var1), method8329(var1), method8330(var1));
      }

      public Mutable method8376(Class2321 var1, int var2, int var3, int var4) {
         return this.method8372(
            var1.method9098(var2, var3, var4, Class113.field413),
            var1.method9098(var2, var3, var4, Class113.field414),
            var1.method9098(var2, var3, var4, Class113.field415)
         );
      }

      public Mutable method8377(Vector3i var1, Direction var2) {
         return this.method8372(var1.getX() + var2.method539(), var1.getY() + var2.method540(), var1.getZ() + var2.method541());
      }

      public Mutable method8378(Vector3i var1, int var2, int var3, int var4) {
         return this.method8372(var1.getX() + var2, var1.getY() + var3, var1.getZ() + var4);
      }

      public Mutable method8379(Direction var1) {
         return this.method8380(var1, 1);
      }

      public Mutable method8380(Direction var1, int var2) {
         return this.method8372(
            this.getX() + var1.method539() * var2, this.getY() + var1.method540() * var2, this.getZ() + var1.method541() * var2
         );
      }

      public Mutable method8381(int var1, int var2, int var3) {
         return this.method8372(this.getX() + var1, this.getY() + var2, this.getZ() + var3);
      }

      public Mutable method8382(Vector3i var1) {
         return this.method8372(this.getX() + var1.getX(), this.getY() + var1.getY(), this.getZ() + var1.getZ());
      }

      public Mutable method8383(Class113 var1, int var2, int var3) {
         switch (Class4503.field21731[var1.ordinal()]) {
            case 1:
               return this.method8372(MathHelper.method37775(this.getX(), var2, var3), this.getY(), this.getZ());
            case 2:
               return this.method8372(this.getX(), MathHelper.method37775(this.getY(), var2, var3), this.getZ());
            case 3:
               return this.method8372(this.getX(), this.getY(), MathHelper.method37775(this.getZ(), var2, var3));
            default:
               throw new IllegalStateException("Unable to clamp axis " + var1);
         }
      }

      @Override
      public void method8307(int var1) {
         super.method8307(var1);
      }

      @Override
      public void method8308(int var1) {
         super.method8308(var1);
      }

      @Override
      public void method8309(int var1) {
         super.method8309(var1);
      }

      @Override
      public BlockPos toImmutable() {
         return new BlockPos(this);
      }
   }
}
