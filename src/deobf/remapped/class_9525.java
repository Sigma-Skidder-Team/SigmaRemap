package remapped;

import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class class_9525 implements class_6163, class_1449 {
   private static String[] field_48477;
   public final int field_48480;
   public final int field_48478;
   public final class_5990[][] field_48481;
   public boolean field_48482;
   public final World field_48479;

   public class_9525(World var1, BlockPos var2, BlockPos var3) {
      this.field_48479 = var1;
      this.field_48480 = var2.getX() >> 4;
      this.field_48478 = var2.method_12185() >> 4;
      int var6 = var3.getX() >> 4;
      int var7 = var3.method_12185() >> 4;
      this.field_48481 = new class_5990[var6 - this.field_48480 + 1][var7 - this.field_48478 + 1];
      class_3232 var8 = var1.method_43363();
      this.field_48482 = true;

      for (int var9 = this.field_48480; var9 <= var6; var9++) {
         for (int var10 = this.field_48478; var10 <= var7; var10++) {
            this.field_48481[var9 - this.field_48480][var10 - this.field_48478] = var8.method_14822(var9, var10);
         }
      }

      for (int var12 = var2.getX() >> 4; var12 <= var3.getX() >> 4; var12++) {
         for (int var13 = var2.method_12185() >> 4; var13 <= var3.method_12185() >> 4; var13++) {
            class_5990 var11 = this.field_48481[var12 - this.field_48480][var13 - this.field_48478];
            if (var11 != null && !var11.method_27368(var2.method_12165(), var3.method_12165())) {
               this.field_48482 = false;
               return;
            }
         }
      }
   }

   private class_5990 method_43949(BlockPos var1) {
      return this.method_43948(var1.getX() >> 4, var1.method_12185() >> 4);
   }

   private class_5990 method_43948(int var1, int var2) {
      int var5 = var1 - this.field_48480;
      int var6 = var2 - this.field_48478;
      if (var5 >= 0 && var5 < this.field_48481.length && var6 >= 0 && var6 < this.field_48481[var5].length) {
         class_5990 var7 = this.field_48481[var5][var6];
         return (class_5990)(var7 == null ? new class_8526(this.field_48479, new class_2034(var1, var2)) : var7);
      } else {
         return new class_8526(this.field_48479, new class_2034(var1, var2));
      }
   }

   @Override
   public class_2098 method_6673() {
      return this.field_48479.method_6673();
   }

   @Override
   public class_6163 method_6675(int var1, int var2) {
      return this.method_43948(var1, var2);
   }

   @Nullable
   @Override
   public class_3757 method_28260(BlockPos var1) {
      class_5990 var4 = this.method_43949(var1);
      return var4.method_28260(var1);
   }

   @Override
   public class_2522 method_28262(BlockPos var1) {
      if (!World.method_29556(var1)) {
         class_5990 var4 = this.method_43949(var1);
         return var4.method_28262(var1);
      } else {
         return class_4783.field_23184.method_29260();
      }
   }

   @Override
   public Stream<class_4190> method_6679(Entity var1, Box var2, Predicate<Entity> var3) {
      return Stream.<class_4190>empty();
   }

   @Override
   public Stream<class_4190> method_6676(Entity var1, Box var2, Predicate<Entity> var3) {
      return this.method_6680(var1, var2);
   }

   @Override
   public class_4774 method_28258(BlockPos var1) {
      if (!World.method_29556(var1)) {
         class_5990 var4 = this.method_43949(var1);
         return var4.method_28258(var1);
      } else {
         return class_8532.field_43673.method_10710();
      }
   }
}
