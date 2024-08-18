package remapped;

import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class class_2018 {
   private static String[] field_10228;
   private static final class_5199 field_10222 = (var0, var1, var2) -> var0.method_8350(class_4783.field_23881);
   private final class_9379 field_10229;
   private final class_9249 field_10223;
   private final Direction field_10226;
   private int field_10227;
   private BlockPos field_10224;
   private int field_10230;
   private int field_10225;

   public static Optional<class_2018> method_9378(class_9379 var0, BlockPos var1, class_9249 var2) {
      return method_9381(var0, var1, var0x -> var0x.method_9383() && var0x.field_10227 == 0, var2);
   }

   public static Optional<class_2018> method_9381(class_9379 var0, BlockPos var1, Predicate<class_2018> var2, class_9249 var3) {
      Optional var6 = Optional.<class_2018>of(new class_2018(var0, var1, var3)).filter(var2);
      if (!var6.isPresent()) {
         class_9249 var7 = var3 != class_9249.field_47215 ? class_9249.field_47215 : class_9249.field_47219;
         return Optional.<class_2018>of(new class_2018(var0, var1, var7)).filter(var2);
      } else {
         return var6;
      }
   }

   public class_2018(class_9379 var1, BlockPos var2, class_9249 var3) {
      this.field_10229 = var1;
      this.field_10223 = var3;
      this.field_10226 = var3 != class_9249.field_47215 ? Direction.field_800 : Direction.field_809;
      this.field_10224 = this.method_9380(var2);
      if (this.field_10224 != null) {
         this.field_10225 = this.method_9376();
         if (this.field_10225 > 0) {
            this.field_10230 = this.method_9382();
         }
      } else {
         this.field_10224 = var2;
         this.field_10225 = 1;
         this.field_10230 = 1;
      }
   }

   @Nullable
   private BlockPos method_9380(BlockPos var1) {
      int var4 = Math.max(0, var1.getY() - 21);

      while (var1.getY() > var4 && method_9371(this.field_10229.method_28262(var1.method_6100()))) {
         var1 = var1.method_6100();
      }

      Direction var6 = this.field_10226.method_1046();
      int var5 = this.method_9374(var1, var6) - 1;
      return var5 >= 0 ? var1.method_6099(var6, var5) : null;
   }

   private int method_9376() {
      int var3 = this.method_9374(this.field_10224, this.field_10226);
      return var3 >= 2 && var3 <= 21 ? var3 : 0;
   }

   private int method_9374(BlockPos var1, Direction var2) {
      class_2921 var5 = new class_2921();

      for (int var6 = 0; var6 <= 21; var6++) {
         var5.method_13364(var1).method_13369(var2, var6);
         class_2522 var7 = this.field_10229.method_28262(var5);
         if (!method_9371(var7)) {
            if (field_10222.method_23862(var7, this.field_10229, var5)) {
               return var6;
            }
            break;
         }

         class_2522 var8 = this.field_10229.method_28262(var5.method_13368(Direction.field_802));
         if (!field_10222.method_23862(var8, this.field_10229, var5)) {
            break;
         }
      }

      return 0;
   }

   private int method_9382() {
      class_2921 var3 = new class_2921();
      int var4 = this.method_9375(var3);
      return var4 >= 3 && var4 <= 21 && this.method_9384(var3, var4) ? var4 : 0;
   }

   private boolean method_9384(class_2921 var1, int var2) {
      for (int var5 = 0; var5 < this.field_10225; var5++) {
         class_2921 var6 = var1.method_13364(this.field_10224).method_13369(Direction.field_817, var2).method_13369(this.field_10226, var5);
         if (!field_10222.method_23862(this.field_10229.method_28262(var6), this.field_10229, var6)) {
            return false;
         }
      }

      return true;
   }

   private int method_9375(class_2921 var1) {
      for (int var4 = 0; var4 < 21; var4++) {
         var1.method_13364(this.field_10224).method_13369(Direction.field_817, var4).method_13369(this.field_10226, -1);
         if (!field_10222.method_23862(this.field_10229.method_28262(var1), this.field_10229, var1)) {
            return var4;
         }

         var1.method_13364(this.field_10224).method_13369(Direction.field_817, var4).method_13369(this.field_10226, this.field_10225);
         if (!field_10222.method_23862(this.field_10229.method_28262(var1), this.field_10229, var1)) {
            return var4;
         }

         for (int var5 = 0; var5 < this.field_10225; var5++) {
            var1.method_13364(this.field_10224).method_13369(Direction.field_817, var4).method_13369(this.field_10226, var5);
            class_2522 var6 = this.field_10229.method_28262(var1);
            if (!method_9371(var6)) {
               return var4;
            }

            if (var6.method_8350(class_4783.field_23588)) {
               this.field_10227++;
            }
         }
      }

      return 21;
   }

   private static boolean method_9371(class_2522 var0) {
      return var0.method_8345() || var0.method_8349(class_2351.field_11771) || var0.method_8350(class_4783.field_23588);
   }

   public boolean method_9383() {
      return this.field_10224 != null && this.field_10225 >= 2 && this.field_10225 <= 21 && this.field_10230 >= 3 && this.field_10230 <= 21;
   }

   public void method_9377() {
      class_2522 var3 = class_4783.field_23588.method_29260().method_10308(class_3465.field_16975, this.field_10223);
      BlockPos.method_6076(
            this.field_10224, this.field_10224.method_6099(Direction.field_817, this.field_10230 - 1).method_6099(this.field_10226, this.field_10225 - 1)
         )
         .forEach(var2 -> this.field_10229.method_7513(var2, var3, 18));
   }

   public boolean method_9372() {
      return this.method_9383() && this.field_10227 == this.field_10225 * this.field_10230;
   }

   public static Vector3d method_9370(class_8623 var0, class_9249 var1, Vector3d var2, class_6097 var3) {
      double var6 = (double)var0.field_44251 - (double)var3.field_31199;
      double var8 = (double)var0.field_44249 - (double)var3.field_31200;
      BlockPos var10 = var0.field_44250;
      double var11;
      if (!(var6 > 0.0)) {
         var11 = 0.5;
      } else {
         float var13 = (float)var10.method_12174(var1) + var3.field_31199 / 2.0F;
         var11 = MathHelper.clamp(MathHelper.func_233020_c_(var2.method_6197(var1) - (double)var13, 0.0, var6), 0.0, 1.0);
      }

      double var14;
      if (!(var8 > 0.0)) {
         var14 = 0.0;
      } else {
         class_9249 var16 = class_9249.field_47216;
         var14 = MathHelper.clamp(MathHelper.func_233020_c_(var2.method_6197(var16) - (double)var10.method_12174(var16), 0.0, var8), 0.0, 1.0);
      }

      class_9249 var19 = var1 != class_9249.field_47215 ? class_9249.field_47215 : class_9249.field_47219;
      double var17 = var2.method_6197(var19) - ((double)var10.method_12174(var19) + 0.5);
      return new Vector3d(var11, var14, var17);
   }

   public static class_9606 method_9379(
           class_6331 var0, class_8623 var1, class_9249 var2, Vector3d var3, class_6097 var4, Vector3d var5, float var6, float var7
   ) {
      BlockPos var10 = var1.field_44250;
      class_2522 var11 = var0.method_28262(var10);
      class_9249 var12 = var11.<class_9249>method_10313(class_6023.field_30670);
      double var13 = (double)var1.field_44251;
      double var15 = (double)var1.field_44249;
      int var17 = var2 != var12 ? 90 : 0;
      Vector3d var18 = var2 != var12 ? new Vector3d(var5.field_7334, var5.field_7333, -var5.field_7336) : var5;
      double var19 = (double)var4.field_31199 / 2.0 + (var13 - (double)var4.field_31199) * var3.method_61();
      double var21 = (var15 - (double)var4.field_31200) * var3.method_60();
      double var23 = 0.5 + var3.method_62();
      boolean var25 = var12 == class_9249.field_47215;
      Vector3d var26 = new Vector3d(
         (double)var10.getX() + (!var25 ? var23 : var19), (double)var10.getY() + var21, (double)var10.getZ() + (!var25 ? var19 : var23)
      );
      return new class_9606(var26, var18, var6 + (float)var17, var7);
   }
}
