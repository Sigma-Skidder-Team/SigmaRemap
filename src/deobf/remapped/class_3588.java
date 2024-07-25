package remapped;

import java.util.Iterator;
import java.util.stream.Stream;

public class class_3588 extends class_367 {
   private int field_17598;
   private int field_17600;
   private static int field_17597;
   private class_1331 field_17596;

   public class_3588() {
      super("AutoMLG", "Automatically places water when falling", Category.ITEM);
      this.addSetting(new BooleanSetting("Cubecraft", "Cubecraft bypass", true));
      field_17597 = -1;
   }

   public static boolean method_16781() {
      return field_17597 >= 0;
   }

   @Override
   public void method_42006() {
      field_17597 = -1;
   }

   @Override
   public void method_42020() {
      field_17597 = -1;
   }

   @EventListen
   private void method_16782(class_7767 var1) {
      if (this.method_42015()) {
         if (field_17597 > 0 && !mcInstance.field_9632.field_41726) {
            class_8865.method_40777(var1, 0.0);
         }
      }
   }

   @EventListen
   @class_7664
   private void method_16779(class_1393 var1) {
      if (this.method_42015() && mcInstance.field_9647.method_42133()) {
         if (var1.method_6449() && field_17597 >= 0) {
            field_17597++;
            float[] var4 = class_7211.method_33006(
               (double)this.field_17596.method_12173() + 0.5, (double)this.field_17596.method_12185() + 0.5, (double)this.field_17596.method_12165() + 0.5
            );
            var1.method_6441(var4[0]);
            var1.method_6448(var4[1]);
         }

         if (field_17597 == (!this.getBooleanValueByName("Cubecraft") ? 3 : 5)) {
            if (mcInstance.field_9632.field_3853.field_36404 != this.field_17598) {
               this.field_17600 = mcInstance.field_9632.field_3853.field_36404;
               mcInstance.field_9632.field_3853.field_36404 = this.field_17598;
               mcInstance.field_9647.method_42129();
            }

            mcInstance.method_8614().method_4813(new class_3195(class_2584.field_12791));
            mcInstance.method_8614().method_4813(new class_1022(class_2584.field_12791));
            field_17597 = -1;
            this.field_17596 = null;
            mcInstance.field_9632.field_3853.field_36404 = this.field_17600;
         }

         int var7 = this.method_16778();
         if (!SigmaMainClass.getInstance().getModuleManager().method_847(FlyModule.class).method_42015()
            && var7 != -1
            && !mcInstance.field_9632.field_41726
            && mcInstance.field_9632.field_41706 > 3.0F) {
            class_1331 var5 = this.method_16780();
            if (var5 != null) {
               if (var1.method_6449() && field_17597 == -1) {
                  float[] var6 = class_7211.method_33006(
                     (double)var5.method_12173() + 0.5, (double)var5.method_12185() + 0.5, (double)var5.method_12165() + 0.5
                  );
                  var1.method_6441(var6[0]);
                  var1.method_6448(var6[1]);
                  if (var7 != mcInstance.field_9632.field_3853.field_36404) {
                     this.field_17600 = mcInstance.field_9632.field_3853.field_36404;
                     mcInstance.field_9632.field_3853.field_36404 = var7;
                     mcInstance.field_9647.method_42129();
                  }

                  this.field_17598 = var7;
                  this.field_17596 = var5;
                  field_17597 = 0;
                  return;
               }

               if (this.field_17596 != null) {
                  mcInstance.method_8614().method_4813(new class_3195(class_2584.field_12791));
                  mcInstance.method_8614().method_4813(new class_1022(class_2584.field_12791));
               }
            }
         }
      }
   }

   public int method_16778() {
      for (int var3 = 36; var3 < 45; var3++) {
         if (mcInstance.field_9632.field_3869.method_18878(var3).method_35884()) {
            class_6098 var4 = mcInstance.field_9632.field_3869.method_18878(var3).method_35898();
            if (var4.method_27960() == class_4897.field_24999) {
               return var3 - 36;
            }
         }
      }

      if (SigmaMainClass.getInstance().method_3310().method_25303() > 1) {
         for (int var5 = 9; var5 < 36; var5++) {
            if (mcInstance.field_9632.field_3869.method_18878(var5).method_35884()) {
               class_6098 var6 = mcInstance.field_9632.field_3869.method_18878(var5).method_35898();
               if (var6.method_27960() == class_4897.field_24999) {
                  if (class_3347.method_15349() <= class_412.field_1752.method_2055()) {
                     mcInstance.method_8614().method_4813(new class_8559(class_2105.field_10551));
                  }

                  class_2740.method_12312(var5, 6);
                  mcInstance.method_8614().method_4813(new class_1194(-1));
                  return 6;
               }
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private class_1331 method_16780() {
      double var3 = mcInstance.field_9632.method_37098().field_7336;
      double var5 = mcInstance.field_9632.method_37098().field_7333;
      double var7 = mcInstance.field_9632.method_37098().field_7334;
      class_4092 var9 = mcInstance.field_9632.field_41712.method_18928(var3, 0.0, var7).method_18918(0.0, var5, 0.0);
      Stream var10 = mcInstance.field_9601.method_6680(mcInstance.field_9632, var9);
      Iterator var11 = var10.iterator();
      class_1331 var12 = null;

      while (var11.hasNext()) {
         class_4190 var13 = (class_4190)var11.next();
         class_4092 var14 = var13.method_19483();
         class_1331 var15 = new class_1331(var14.method_18926());
         if (class_7494.method_34090(var15)
            && (double)(var15.method_12165() + 1) < mcInstance.field_9632.method_37309()
            && (
               var12 == null
                  || mcInstance.field_9632
                        .method_37273((double)var12.method_12173() + 0.5 - var3, (double)(var12.method_12165() + 1), (double)var12.method_12185() + 0.5 - var7)
                     > mcInstance.field_9632
                        .method_37273((double)var15.method_12173() + 0.5 - var3, (double)(var15.method_12165() + 1), (double)var15.method_12185() + 0.5 - var7)
            )) {
            var12 = var15;
         }
      }

      if (var12 != null) {
         return var12;
      } else {
         var5 = mcInstance.field_9632.method_37098().field_7333 - 1.0;
         var9 = mcInstance.field_9632.field_41712.method_18928(var3, 0.0, var7).method_18918(0.0, var5, 0.0);
         var10 = mcInstance.field_9601.method_6680(mcInstance.field_9632, var9);
         var11 = var10.iterator();

         while (var11.hasNext()) {
            class_4190 var20 = (class_4190)var11.next();
            class_4092 var21 = var20.method_19483();
            class_1331 var22 = new class_1331(var21.method_18926());
            if (class_7494.method_34090(var22)
               && (double)(var22.method_12165() + 1) < mcInstance.field_9632.method_37309()
               && (
                  var12 == null
                     || mcInstance.field_9632
                           .method_37273(
                              (double)var12.method_12173() + 0.5 - var3, (double)(var12.method_12165() + 1), (double)var12.method_12185() + 0.5 - var7
                           )
                        > mcInstance.field_9632
                           .method_37273(
                              (double)var22.method_12173() + 0.5 - var3, (double)(var22.method_12165() + 1), (double)var22.method_12185() + 0.5 - var7
                           )
               )) {
               var12 = var22;
            }
         }

         return var12;
      }
   }
}
