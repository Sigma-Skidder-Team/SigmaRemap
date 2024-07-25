package remapped;

import java.util.Random;

public class class_1957 extends class_7067<class_91> {
   private static String[] field_9969;
   private final ItemRenderer field_9971;
   private final Random field_9970 = new Random();

   public class_1957(EntityRenderDispatcher var1, ItemRenderer var2) {
      super(var1);
      this.field_9971 = var2;
      this.field_36492 = 0.15F;
      this.field_36494 = 0.75F;
   }

   private int method_9054(ItemStack var1) {
      byte var4 = 1;
      if (var1.method_27997() <= 48) {
         if (var1.method_27997() <= 32) {
            if (var1.method_27997() <= 16) {
               if (var1.method_27997() > 1) {
                  var4 = 2;
               }
            } else {
               var4 = 3;
            }
         } else {
            var4 = 4;
         }
      } else {
         var4 = 5;
      }

      return var4;
   }

   public void method_9056(class_91 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      var4.method_36063();
      ItemStack var9 = var1.method_264();
      int var10 = !var9.method_28022() ? class_2451.method_11244(var9.method_27960()) + var9.method_28026() : 187;
      this.field_9970.setSeed((long)var10);
      class_7373 var11 = this.field_9971.method_40278(var9, var1.world, (LivingEntity)null);
      boolean var12 = var11.method_33583();
      int var13 = this.method_9054(var9);
      float var14 = 0.25F;
      float var15 = class_9299.method_42818(((float)var1.method_260() + var3) / 10.0F + var1.field_173) * 0.1F + 0.1F;
      if (!this.method_9057()) {
         var15 = 0.0F;
      }

      float var16 = var11.method_33586().method_34982(class_5612.field_28496).field_4822.method_11061();
      var4.method_36065(0.0, (double)(var15 + 0.25F * var16), 0.0);
      float var17 = var1.method_245(var3);
      var4.method_36060(class_2426.field_12074.method_11062(var17));
      float var18 = var11.method_33586().field_39200.field_4822.method_11057();
      float var19 = var11.method_33586().field_39200.field_4822.method_11061();
      float var20 = var11.method_33586().field_39200.field_4822.method_11055();
      if (!var12) {
         float var21 = -0.0F * (float)(var13 - 1) * 0.5F * var18;
         float var22 = -0.0F * (float)(var13 - 1) * 0.5F * var19;
         float var23 = -0.09375F * (float)(var13 - 1) * 0.5F * var20;
         var4.method_36065((double)var21, (double)var22, (double)var23);
      }

      for (int var25 = 0; var25 < var13; var25++) {
         var4.method_36063();
         if (var25 > 0) {
            if (!var12) {
               float var26 = (this.field_9970.nextFloat() * 2.0F - 1.0F) * 0.15F * 0.5F;
               float var28 = (this.field_9970.nextFloat() * 2.0F - 1.0F) * 0.15F * 0.5F;
               var4.method_36065((double)var26, (double)var28, 0.0);
            } else {
               float var27 = (this.field_9970.nextFloat() * 2.0F - 1.0F) * 0.15F;
               float var29 = (this.field_9970.nextFloat() * 2.0F - 1.0F) * 0.15F;
               float var24 = (this.field_9970.nextFloat() * 2.0F - 1.0F) * 0.15F;
               if (!this.method_9053()) {
                  var27 = 0.0F;
                  var29 = 0.0F;
               }

               var4.method_36065((double)var27, (double)var29, (double)var24);
            }
         }

         this.field_9971.method_40270(var9, class_5612.field_28496, false, var4, var5, var6, class_5367.field_27381, var11);
         var4.method_36064();
         if (!var12) {
            var4.method_36065((double)(0.0F * var18), (double)(0.0F * var19), (double)(0.09375F * var20));
         }
      }

      var4.method_36064();
      super.method_32551(var1, var2, var3, var4, var5, var6);
   }

   public Identifier method_9055(class_91 var1) {
      return class_8359.field_42824;
   }

   public boolean method_9053() {
      return true;
   }

   public boolean method_9057() {
      return true;
   }
}
