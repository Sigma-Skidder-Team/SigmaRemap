package remapped;

public class class_9233 extends Module {
   private boolean field_47194;
   private double field_47196;
   private double field_47195;
   private double field_47192;

   public class_9233() {
      super(Category.MOVEMENT, "Mineplex", "Highjump for Mineplex");
      this.addSetting(new FloatSetting<Float>("Motion", "Highjump motion", 1.1F, Float.class, 0.42F, 5.0F, 0.05F));
      this.addSetting(new BooleanSetting("Disable", "Disable on landing.", true));
      this.addSetting(new BooleanSetting("Fake fly", "Am i flying ?", false));
   }

   @Override
   public void onEnable() {
      this.field_47194 = false;
   }

   @EventListen
   public void method_42589(class_7982 var1) {
      if (this.method_42015() && mc.field_9632.field_41726) {
         var1.method_36186(true);
      }
   }

   @EventListen
   public void method_42588(class_7767 var1) {
      if (this.method_42015()) {
         if (this.field_47194 && mc.field_9632.method_37309() + 0.42 < this.field_47192) {
            this.method_42017().method_41999();
         }

         if (!mc.field_9632.field_41726 && this.field_47194) {
            this.field_47196 = Math.max(this.field_47196, 0.499);
            class_8865.method_40777(var1, this.field_47196);
            this.field_47196 -= 0.007;
            double var4 = 0.5;
            if (this.getFloatValueByName("Motion") > 3.0F) {
               var4 -= 0.8;
            }

            if (Math.abs(var1.method_35236()) < var4 && Math.abs(this.field_47195) < var4) {
               this.field_47195 -= 0.04000000000001;
               var1.method_35235(this.field_47195);
               class_314.method_1408(var1.method_35236());
            } else {
               this.field_47195 = var1.method_35236();
            }
         }
      }
   }

   @EventListen
   public void method_42590(class_4868 var1) {
      if (this.method_42015()) {
         if (mc.field_9632.field_41726) {
            if (this.field_47194) {
               this.field_47194 = !this.field_47194;
               class_8865.method_40776(0.0);
               if (this.getBooleanValueByName("Disable")) {
                  this.method_42017().method_41999();
               }

               return;
            }

            double var4 = mc.field_9632.method_37302();
            double var6 = mc.field_9632.method_37156();
            double var8 = mc.field_9632.method_37309();
            double var10 = (double) mc.field_9632.field_30533.field_45287;
            double var12 = (double) mc.field_9632.field_30533.field_45282;
            float var14 = mc.field_9632.field_41701;
            double var15 = 0.1;
            double var17 = var4
               + (var10 * 0.45 * Math.cos(Math.toRadians((double)(var14 + 90.0F))) + var12 * 0.45 * Math.sin(Math.toRadians((double)(var14 + 90.0F)))) * var15;
            double var19 = var6
               + (var10 * 0.45 * Math.sin(Math.toRadians((double)(var14 + 90.0F))) - var12 * 0.45 * Math.cos(Math.toRadians((double)(var14 + 90.0F)))) * var15;
            class_4092 var21 = new class_4092(var17 - 0.3, var8 - 1.0, var19 - 0.3, var17 + 0.3, var8 + 2.0, var19 + 0.3);
            if (mc.field_9601.method_6680(mc.field_9632, var21).count() == 0L) {
               double var22 = this.method_42591(var21);
               if (var22 != 11.0) {
                  double var24 = mc.field_9632.method_37309();
                  var19 = 312.7;
                  class_9515 var26 = new class_9515(var17, var24 - var22, var19, true);
                  class_9515 var27 = new class_9515(var17, var24, var19, true);
                  mc.method_8614().method_4813(var27);
                  mc.method_8614().method_4813(var26);
                  this.field_47192 = var24 + 0.42;
                  mc.field_9632.method_37256(var17, var24, var19);
                  this.field_47195 = (double)this.getFloatValueByName("Motion");
                  this.field_47196 = 0.81;
               }
            }
         }
      }
   }

   @EventListen
   public void method_42592(class_139 var1) {
      if (this.method_42015()) {
         Packet var4 = var1.method_557();
         if (var4 instanceof class_509) {
            this.method_42017().method_41999();
         }
      }
   }

   @EventListen
   public void method_42587(class_1711 var1) {
      if (this.method_42015() && this.field_47194 && !(mc.field_9632.method_37309() < this.field_47192) && this.getBooleanValueByName("Fake fly")) {
         mc.field_9632.field_41736.field_7333 = this.field_47192;
         mc.field_9632.field_41713 = this.field_47192;
         mc.field_9632.field_3864 = this.field_47192;
         mc.field_9632.field_41698 = this.field_47192;
         if (class_8865.method_40772()) {
            mc.field_9632.field_3859 = 0.099999994F;
         }
      }
   }

   public double method_42591(class_4092 var1) {
      double var4 = 6.0;
      class_4092 var6 = var1.method_18918(0.0, -var4, 0.0);

      do {
         var6 = var1.method_18918(0.0, -var4, 0.0);
         if (mc.field_9601.method_6680(mc.field_9632, var6).count() == 0L) {
            return var4;
         }

         var4 -= 0.5;
      } while (mc.field_9601.method_6680(mc.field_9632, var6).count() != 0L && var4 > 3.0);

      return 11.0;
   }
}
