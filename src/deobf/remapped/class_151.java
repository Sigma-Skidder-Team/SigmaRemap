package remapped;

import com.google.common.collect.ImmutableList;

public class class_151 extends class_5272<class_107> {
   private static String[] field_452;
   private final class_1549 field_447;
   private final class_1549 field_451;
   private final class_1549 field_446;
   private final class_1549 field_449;
   private final class_1549 field_456;
   private final class_1549 field_448;
   private final class_1549 field_453;
   private final class_1549 field_455;
   private final class_1549 field_450;
   private final class_1549 field_445;
   private final class_1549 field_454;

   public class_151() {
      this.field_49928 = 32;
      this.field_49927 = 32;
      this.field_447 = new class_1549(this, 2, 8);
      this.field_447.method_7048(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F);
      this.field_447.method_7046(0.0F, 16.5F, -3.0F);
      this.field_451 = new class_1549(this, 22, 1);
      this.field_451.method_7048(-1.5F, -1.0F, -1.0F, 3.0F, 4.0F, 1.0F);
      this.field_451.method_7046(0.0F, 21.07F, 1.16F);
      this.field_446 = new class_1549(this, 19, 8);
      this.field_446.method_7048(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F);
      this.field_446.method_7046(1.5F, 16.94F, -2.76F);
      this.field_449 = new class_1549(this, 19, 8);
      this.field_449.method_7048(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F);
      this.field_449.method_7046(-1.5F, 16.94F, -2.76F);
      this.field_456 = new class_1549(this, 2, 2);
      this.field_456.method_7048(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F);
      this.field_456.method_7046(0.0F, 15.69F, -2.76F);
      this.field_448 = new class_1549(this, 10, 0);
      this.field_448.method_7048(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F);
      this.field_448.method_7046(0.0F, -2.0F, -1.0F);
      this.field_456.method_7043(this.field_448);
      this.field_453 = new class_1549(this, 11, 7);
      this.field_453.method_7048(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      this.field_453.method_7046(0.0F, -0.5F, -1.5F);
      this.field_456.method_7043(this.field_453);
      this.field_455 = new class_1549(this, 16, 7);
      this.field_455.method_7048(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      this.field_455.method_7046(0.0F, -1.75F, -2.45F);
      this.field_456.method_7043(this.field_455);
      this.field_450 = new class_1549(this, 2, 18);
      this.field_450.method_7048(0.0F, -4.0F, -2.0F, 0.0F, 5.0F, 4.0F);
      this.field_450.method_7046(0.0F, -2.15F, 0.15F);
      this.field_456.method_7043(this.field_450);
      this.field_445 = new class_1549(this, 14, 18);
      this.field_445.method_7048(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      this.field_445.method_7046(1.0F, 22.0F, -1.05F);
      this.field_454 = new class_1549(this, 14, 18);
      this.field_454.method_7048(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      this.field_454.method_7046(-1.0F, 22.0F, -1.05F);
   }

   @Override
   public Iterable<class_1549> method_24058() {
      return ImmutableList.of(this.field_447, this.field_446, this.field_449, this.field_451, this.field_456, this.field_445, this.field_454);
   }

   public void method_602(class_107 var1, float var2, float var3, float var4, float var5, float var6) {
      this.method_603(method_605(var1), var1.field_41697, var2, var3, var4, var5, var6);
   }

   public void method_606(class_107 var1, float var2, float var3, float var4) {
      this.method_607(method_605(var1));
   }

   public void method_604(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9) {
      this.method_607(class_7771.field_39376);
      this.method_603(class_7771.field_39376, var9, var5, var6, 0.0F, var7, var8);
      this.method_24058().forEach(var4x -> var4x.method_7060(var1, var2, var3, var4));
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void method_603(class_7771 var1, int var2, float var3, float var4, float var5, float var6, float var7) {
      this.field_456.field_8191 = var7 * (float) (Math.PI / 180.0);
      this.field_456.field_8190 = var6 * (float) (Math.PI / 180.0);
      this.field_456.field_8185 = 0.0F;
      this.field_456.field_8183 = 0.0F;
      this.field_447.field_8183 = 0.0F;
      this.field_451.field_8183 = 0.0F;
      this.field_449.field_8183 = -1.5F;
      this.field_446.field_8183 = 1.5F;
      switch (var1) {
         case field_39377:
            break;
         case field_39378:
            float var10 = class_9299.method_42840((float)var2);
            float var11 = class_9299.method_42818((float)var2);
            this.field_456.field_8183 = var10;
            this.field_456.field_8181 = 15.69F + var11;
            this.field_456.field_8191 = 0.0F;
            this.field_456.field_8190 = 0.0F;
            this.field_456.field_8185 = class_9299.method_42818((float)var2) * 0.4F;
            this.field_447.field_8183 = var10;
            this.field_447.field_8181 = 16.5F + var11;
            this.field_446.field_8185 = -0.0873F - var5;
            this.field_446.field_8183 = 1.5F + var10;
            this.field_446.field_8181 = 16.94F + var11;
            this.field_449.field_8185 = 0.0873F + var5;
            this.field_449.field_8183 = -1.5F + var10;
            this.field_449.field_8181 = 16.94F + var11;
            this.field_451.field_8183 = var10;
            this.field_451.field_8181 = 21.07F + var11;
            break;
         case field_39381:
            this.field_445.field_8191 = this.field_445.field_8191 + class_9299.method_42840(var3 * 0.6662F) * 1.4F * var4;
            this.field_454.field_8191 = this.field_454.field_8191 + class_9299.method_42840(var3 * 0.6662F + (float) Math.PI) * 1.4F * var4;
         case field_39375:
         case field_39376:
         default:
            float var12 = var5 * 0.3F;
            this.field_456.field_8181 = 15.69F + var12;
            this.field_451.field_8191 = 1.015F + class_9299.method_42840(var3 * 0.6662F) * 0.3F * var4;
            this.field_451.field_8181 = 21.07F + var12;
            this.field_447.field_8181 = 16.5F + var12;
            this.field_446.field_8185 = -0.0873F - var5;
            this.field_446.field_8181 = 16.94F + var12;
            this.field_449.field_8185 = 0.0873F + var5;
            this.field_449.field_8181 = 16.94F + var12;
            this.field_445.field_8181 = 22.0F + var12;
            this.field_454.field_8181 = 22.0F + var12;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void method_607(class_7771 var1) {
      this.field_450.field_8191 = -0.2214F;
      this.field_447.field_8191 = 0.4937F;
      this.field_446.field_8191 = -0.6981F;
      this.field_446.field_8190 = (float) -Math.PI;
      this.field_449.field_8191 = -0.6981F;
      this.field_449.field_8190 = (float) -Math.PI;
      this.field_445.field_8191 = -0.0299F;
      this.field_454.field_8191 = -0.0299F;
      this.field_445.field_8181 = 22.0F;
      this.field_454.field_8181 = 22.0F;
      this.field_445.field_8185 = 0.0F;
      this.field_454.field_8185 = 0.0F;
      switch (var1) {
         case field_39377:
            float var4 = 1.9F;
            this.field_456.field_8181 = 17.59F;
            this.field_451.field_8191 = 1.5388988F;
            this.field_451.field_8181 = 22.97F;
            this.field_447.field_8181 = 18.4F;
            this.field_446.field_8185 = -0.0873F;
            this.field_446.field_8181 = 18.84F;
            this.field_449.field_8185 = 0.0873F;
            this.field_449.field_8181 = 18.84F;
            this.field_445.field_8181++;
            this.field_454.field_8181++;
            this.field_445.field_8191++;
            this.field_454.field_8191++;
            break;
         case field_39378:
            this.field_445.field_8185 = (float) (-Math.PI / 9);
            this.field_454.field_8185 = (float) (Math.PI / 9);
         case field_39381:
         case field_39376:
         default:
            break;
         case field_39375:
            this.field_445.field_8191 += (float) (Math.PI * 2.0 / 9.0);
            this.field_454.field_8191 += (float) (Math.PI * 2.0 / 9.0);
      }
   }

   private static class_7771 method_605(class_107 var0) {
      if (!var0.method_327()) {
         if (!var0.method_41209()) {
            return !var0.method_323() ? class_7771.field_39381 : class_7771.field_39375;
         } else {
            return class_7771.field_39377;
         }
      } else {
         return class_7771.field_39378;
      }
   }
}
