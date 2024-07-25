package remapped;

public class class_665 extends class_4785<class_665> {
   private final class_2496 field_3687;

   public class_665(class_1991 var1, class_2496 var2) {
      this.field_3688 = var1;
      this.field_3687 = var2;
   }

   @Override
   public void method_21644(class_7966 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      this.method_3035(var1, this.field_3687, var4, var3, var7, var8);
   }

   private void method_3035(class_7966 var1, class_2496 var2, int var3, int var4, int var5, int var6) {
      int var9 = var3 + 45 + 20;
      class_1991.method_9212(this.field_3688).method_45385(var1, var2.field_12418, (float)var9, (float)(var4 + 2), 16777215);
      class_1991.method_9217(this.field_3688).method_45385(var1, var2.field_12413, (float)var9, (float)(var4 + 15), 7105644);
      class_1991.method_9180(this.field_3688)
         .method_45385(
            var1, var2.field_12417, (float)(var9 + 227 - class_1991.method_9183(this.field_3688).method_45395(var2.field_12417)), (float)(var4 + 1), 7105644
         );
      if (!"".equals(var2.field_12422) || !"".equals(var2.field_12415) || !"".equals(var2.field_12414)) {
         this.method_3037(var1, var9 - 1, var4 + 25, var5, var6, var2.field_12422, var2.field_12415, var2.field_12414);
      }

      this.method_3036(var1, var3, var4 + 1, var5, var6, var2);
   }

   private void method_3036(class_7966 var1, int var2, int var3, int var4, int var5, class_2496 var6) {
      class_3570.method_16600(var6.field_12412, var6.field_12416);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_2089.method_9778(var1, var2 + 1, var3 + 1, 0.0F, 0.0F, 38, 38, 38, 38);
      class_1991.method_9220(this.field_3688).method_8577().method_35674(class_1991.method_9185());
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      class_2089.method_9778(var1, var2, var3, 0.0F, 0.0F, 40, 40, 40, 40);
   }

   private void method_3037(class_7966 var1, int var2, int var3, int var4, int var5, String var6, String var7, String var8) {
      if (!"".equals(var8)) {
         class_1991.method_9205(this.field_3688).method_45385(var1, var8, (float)var2, (float)(var3 + 4), 5000268);
      }

      int var11 = !"".equals(var8) ? class_1991.method_9215(this.field_3688).method_45395(var8) + 2 : 0;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = "".equals(var6);
      if (var4 >= var2 + var11 && var4 <= var2 + var11 + 32 && var5 >= var3 && var5 <= var3 + 15 && var5 < this.field_3688.field_940 - 15 && var5 > 32) {
         if (var4 <= var2 + 15 + var11 && var4 > var11) {
            if (!var14) {
               var12 = true;
            } else {
               var13 = true;
            }
         } else if (!var14) {
            var13 = true;
         }
      }

      if (!var14) {
         class_1991.method_9199(this.field_3688).method_8577().method_35674(class_1991.method_9194());
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         class_3542.method_16438();
         class_3542.method_16403(1.0F, 1.0F, 1.0F);
         float var15 = !var12 ? 0.0F : 15.0F;
         class_2089.method_9778(var1, var2 + var11, var3, var15, 0.0F, 15, 15, 30, 15);
         class_3542.method_16489();
      }

      if (!"".equals(var7)) {
         class_1991.method_9195(this.field_3688).method_8577().method_35674(class_1991.method_9216());
         class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
         class_3542.method_16438();
         class_3542.method_16403(1.0F, 1.0F, 1.0F);
         int var17 = var2 + var11 + (!var14 ? 17 : 0);
         float var16 = !var13 ? 0.0F : 15.0F;
         class_2089.method_9778(var1, var17, var3, var16, 0.0F, 15, 15, 30, 15);
         class_3542.method_16489();
      }

      if (!var12) {
         if (var13 && !"".equals(var7)) {
            class_1991.method_9197(this.field_3688, class_1991.method_9191());
            class_1991.method_9204(this.field_3688, var7);
         }
      } else {
         class_1991.method_9197(this.field_3688, class_1991.method_9200());
         class_1991.method_9204(this.field_3688, var6);
      }
   }
}
