package remapped;

public class class_2738 extends class_367 {
   private boolean field_13372;
   private int field_13371;
   private int field_13370;

   public class_2738() {
      super("NCP", "Phase for NCP anticheat", class_5664.field_28716);
      this.addSetting(new BooleanSetting("Hypixel", "Hypixel bypass", true));
   }

   @Override
   public void method_42006() {
      this.field_13372 = false;
      if (!mcInstance.field_9632.field_41744) {
         this.field_13371 = -1;
      } else {
         this.field_13371 = 0;
         if (mcInstance.field_9632.field_41726) {
            double var3 = mcInstance.field_9632.method_37302();
            double var5 = mcInstance.field_9632.method_37309();
            double var7 = mcInstance.field_9632.method_37156();
            mcInstance.method_8614().method_4813(new class_9515(var3, var5 + 0.0626, var7, false));
         }
      }
   }

   @class_9148
   private void method_12308(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         if (mcInstance.field_9577.field_45560.method_27060()) {
            double var4 = mcInstance.field_9632.method_37302();
            double var6 = mcInstance.field_9632.method_37309();
            double var8 = mcInstance.field_9632.method_37156();
            if (!class_314.method_1434()) {
               if (class_314.method_1413(mcInstance.field_9632, 0.001F) && !class_314.method_1383()) {
                  mcInstance.field_9632.method_37256(var4, var6 - 1.0, var8);
                  var1.method_6455(var6 - 1.0);
                  var1.method_6444(true);
                  var1.method_6441(var1.method_6442() + 10.0F);
                  class_314.method_1408(0.0);
               } else if (mcInstance.field_9632.method_37309() == (double)((int) mcInstance.field_9632.method_37309())) {
                  mcInstance.field_9632.method_37256(var4, var6 - 0.3, var8);
               }
            }
         }

         if (this.field_13371 > 0 && this.field_13372 && class_314.method_1383()) {
            this.field_13370++;
            float var10 = (float)Math.sin((double)this.field_13370) * 5.0F;
            float var11 = (float)Math.cos((double)this.field_13370) * 5.0F;
            var1.method_6441(var1.method_6442() + var10);
            var1.method_6448(var1.method_6439() + var11);
         } else if (this.field_13371 < 0) {
            return;
         }

         var1.method_6444(true);
      }
   }

   @class_9148
   private void method_12309(class_7767 var1) {
      if (this.method_42015()) {
         if (mcInstance.field_9632.field_41744 && this.field_13371 != 0) {
            this.field_13371 = 0;
            if (mcInstance.field_9632.field_41726) {
               double var4 = mcInstance.field_9632.method_37302();
               double var6 = mcInstance.field_9632.method_37309();
               double var8 = mcInstance.field_9632.method_37156();
               mcInstance.method_8614().method_4813(new class_9515(var4, var6 + 0.0626, var8, false));
            }
         }

         if (this.field_13371 >= 0) {
            if (this.field_13371 != 0) {
               if (!class_314.method_1383()) {
                  this.field_13372 = false;
                  class_8865.method_40777(var1, 0.0);
                  return;
               }

               if (!this.field_13372) {
                  class_8865.method_40777(var1, !this.method_42007("Hypixel") ? 0.0031 : 0.03);
               } else {
                  class_8865.method_40777(var1, 0.617);
               }
            } else {
               class_8865.method_40777(var1, 0.0);
               class_8865.method_40781(6.000000238415E-4);
            }

            this.field_13371++;
         }
      }
   }

   @class_9148
   private void method_12307(class_3574 var1) {
      if (this.method_42015()) {
         var1.method_29715(true);
      }
   }

   @class_9148
   private void method_12306(class_139 var1) {
      if (this.method_42015()) {
         class_6310 var4 = var1.method_557();
         if (var4 instanceof class_509) {
            class_509 var5 = (class_509)var4;
            var5.field_3143 = mcInstance.field_9632.field_41701;
            var5.field_3140 = mcInstance.field_9632.field_41755;
            this.field_13372 = true;
         }
      }
   }
}
