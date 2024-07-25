package remapped;

import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface class_4924 extends class_5561, class_1449, class_6142 {
   @Nullable
   class_5990 method_22555(int var1, int var2, class_7335 var3, boolean var4);

   @Deprecated
   boolean method_22560(int var1, int var2);

   int method_22562(class_3801 var1, int var2, int var3);

   int method_22557();

   class_859 getBiomeManager();

   default class_6325 method_22561(BlockPos var1) {
      return this.getBiomeManager().method_3726(var1);
   }

   default Stream<class_2522> method_22549(Box var1) {
      int var4 = MathHelper.floor(var1.field_19941);
      int var5 = MathHelper.floor(var1.field_19940);
      int var6 = MathHelper.floor(var1.field_19937);
      int var7 = MathHelper.floor(var1.field_19939);
      int var8 = MathHelper.floor(var1.field_19938);
      int var9 = MathHelper.floor(var1.field_19942);
      return !this.method_22569(var4, var6, var8, var5, var7, var9) ? Stream.<class_2522>empty() : this.method_28256(var1);
   }

   @Override
   default int method_25262(BlockPos var1, class_6581 var2) {
      return var2.method_30079(this.method_22561(var1), (double)var1.getX(), (double)var1.method_12185());
   }

   @Override
   default class_6325 method_28192(int var1, int var2, int var3) {
      class_5990 var6 = this.method_22555(var1 >> 2, var3 >> 2, class_7335.field_37496, false);
      return var6 != null && var6.method_27356() != null ? var6.method_27356().method_28192(var1, var2, var3) : this.method_22558(var1, var2, var3);
   }

   class_6325 method_22558(int var1, int var2, int var3);

   boolean method_22567();

   @Deprecated
   int method_22552();

   class_8760 method_22572();

   default BlockPos method_22563(class_3801 var1, BlockPos var2) {
      return new BlockPos(var2.getX(), this.method_22562(var1, var2.getX(), var2.method_12185()), var2.method_12185());
   }

   default boolean method_22548(BlockPos var1) {
      return this.method_28262(var1).method_8345();
   }

   default boolean method_22568(BlockPos var1) {
      if (var1.method_12165() < this.method_22552()) {
         BlockPos var4 = new BlockPos(var1.getX(), this.method_22552(), var1.method_12185());
         if (this.method_25263(var4)) {
            for (BlockPos var5 = var4.method_6100(); var5.method_12165() > var1.method_12165(); var5 = var5.method_6100()) {
               class_2522 var6 = this.method_28262(var5);
               if (var6.method_8320(this, var5) > 0 && !var6.method_8362().method_24494()) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      } else {
         return this.method_25263(var1);
      }
   }

   @Deprecated
   default float method_22566(BlockPos var1) {
      return this.method_22572().method_40221(this.method_22573(var1));
   }

   default int method_22551(BlockPos var1, Direction var2) {
      return this.method_28262(var1).method_8370(this, var1, var2);
   }

   default class_5990 method_22556(BlockPos var1) {
      return this.method_22553(var1.getX() >> 4, var1.method_12185() >> 4);
   }

   default class_5990 method_22553(int var1, int var2) {
      return this.method_22555(var1, var2, class_7335.field_37514, true);
   }

   default class_5990 method_22554(int var1, int var2, class_7335 var3) {
      return this.method_22555(var1, var2, var3, true);
   }

   @Nullable
   @Override
   default class_6163 method_6675(int var1, int var2) {
      return this.method_22555(var1, var2, class_7335.field_37504, false);
   }

   default boolean method_22565(BlockPos var1) {
      return this.method_28258(var1).method_22007(class_6503.field_33094);
   }

   default boolean method_22550(Box var1) {
      int var4 = MathHelper.floor(var1.field_19941);
      int var5 = MathHelper.ceil(var1.field_19940);
      int var6 = MathHelper.floor(var1.field_19937);
      int var7 = MathHelper.ceil(var1.field_19939);
      int var8 = MathHelper.floor(var1.field_19938);
      int var9 = MathHelper.ceil(var1.field_19942);
      class_2921 var10 = new class_2921();

      for (int var11 = var4; var11 < var5; var11++) {
         for (int var12 = var6; var12 < var7; var12++) {
            for (int var13 = var8; var13 < var9; var13++) {
               class_2522 var14 = this.method_28262(var10.method_13362(var11, var12, var13));
               if (!var14.method_8364().method_22001()) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   default int method_22573(BlockPos var1) {
      return this.method_22571(var1, this.method_22557());
   }

   default int method_22571(BlockPos var1, int var2) {
      return var1.getX() >= -30000000 && var1.method_12185() >= -30000000 && var1.getX() < 30000000 && var1.method_12185() < 30000000
         ? this.method_25261(var1, var2)
         : 15;
   }

   @Deprecated
   default boolean isBlockLoaded(BlockPos var1) {
      return this.method_22560(var1.getX() >> 4, var1.method_12185() >> 4);
   }

   @Deprecated
   default boolean method_22570(BlockPos var1, BlockPos var2) {
      return this.method_22569(var1.getX(), var1.method_12165(), var1.method_12185(), var2.getX(), var2.method_12165(), var2.method_12185());
   }

   @Deprecated
   default boolean method_22569(int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var5 >= 0 && var2 < 256) {
         var1 >>= 4;
         var3 >>= 4;
         var4 >>= 4;
         var6 >>= 4;

         for (int var9 = var1; var9 <= var4; var9++) {
            for (int var10 = var3; var10 <= var6; var10++) {
               if (!this.method_22560(var9, var10)) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }
}
