package remapped;

public class class_9154 extends class_367 {
   private int field_46840;
   private int field_46843;
   private int field_46846;
   private double field_46845;
   private double field_46842;
   private double field_46844;
   private boolean field_46838;
   private boolean field_46839;

   public class_9154() {
      super("Mineplex", "Mineplex fly/longjump", Category.MOVEMENT);
      this.addSetting(new FloatSetting<Float>("Boost", "Boost value", 4.0F, Float.class, 1.0F, 8.0F, 0.01F));
      this.addSetting(new BooleanSetting("Fake", "Simulate a real fly", false));
   }

   @Override
   public void onEnable() {
      this.field_46840 = -1;
      this.field_46845 = class_8865.method_40775();
      this.field_46843 = 0;
      this.field_46839 = false;
      this.field_46846 = -1;
      this.field_46844 = -1.0;
      this.method_42172();
   }

   @Override
   public void onDisable() {
      double var3 = class_8865.method_40775() * 0.5;
      class_8865.method_40776(var3);
      if (this.field_46846 != -1) {
         mcInstance.method_8614().method_4813(new class_7371(mcInstance.field_9632.field_3853.field_36404));
         this.field_46846 = mcInstance.field_9632.field_3853.field_36404;
      }

      mcInstance.field_9616.field_32603 = 1.0F;
   }

   @EventListen
   public void method_42168(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         var1.method_6444(true);
      }
   }

   @EventListen
   public void method_42167(class_717 var1) {
      if (this.method_42015()) {
         this.field_46844 = (double)(this.field_46840 = this.field_46846 = -1);
         this.field_46843 = 0;
         this.field_46839 = false;
         this.field_46845 = class_8865.method_40775();
      }
   }

   public boolean method_42164() {
      return this.method_42015()
         && this.field_46846 != -1
         && this.field_46845 < (double)this.getFloatValueByName("Boost")
         && (mcInstance.field_9632.field_41726 || class_314.method_1413(mcInstance.field_9632, 0.001F))
         && !this.field_46839;
   }

   @EventListen
   public void method_42170(class_7982 var1) {
      if (this.method_42015() && this.field_46839 && mcInstance.field_9632 != null) {
         if (mcInstance.field_9632.field_41726) {
            var1.method_36186(true);
         }
      }
   }

   @EventListen
   public void method_42169(class_7767 var1) {
      if (this.method_42015()) {
         if (this.field_46839) {
            class_8865.method_40777(var1, 0.01);
         } else {
            float var4 = mcInstance.field_9632.field_41701 + 90.0F;
            if (!mcInstance.field_9632.field_41726 && !class_314.method_1413(mcInstance.field_9632, 0.001F)) {
               if (this.field_46840 != -1) {
                  if (this.field_46838 && !class_314.method_1434()) {
                     this.field_46838 = !this.field_46838;
                     this.field_46845 = 0.5;
                  }

                  this.field_46843++;
                  this.field_46845 *= 0.98;
                  this.field_46842 -= 0.04000000000001;
                  if (this.field_46843 <= 22) {
                     if (this.field_46843 == 10 && this.field_46838) {
                        this.field_46842 = -0.005;
                     }
                  } else {
                     this.field_46842 -= 0.02;
                  }

                  if (this.field_46843 > 6 && !class_314.method_1434()) {
                     this.field_46842 -= 0.05;
                  }

                  var1.method_35235(this.field_46842);
                  if (mcInstance.field_9632.field_41744 || !class_314.method_1434()) {
                     this.field_46845 = 0.35;
                  }

                  class_8865.method_40777(var1, this.field_46845);
               }
            } else {
               if (this.field_46843 > 0) {
                  class_8865.method_40777(var1, 0.0);
                  this.method_42017().method_41999();
                  return;
               }

               if (this.field_46840 == -1) {
                  this.field_46840 = 0;
                  this.field_46845 = 0.35;
                  return;
               }

               this.field_46840++;
               int var5 = this.method_42172();
               if (var5 == -1) {
                  return;
               }

               class_1343 var6 = new class_1343(0.475 + Math.random() * 0.05, 1.0, 0.475 + Math.random() * 0.05);
               class_1331 var7 = new class_1331(mcInstance.field_9632.method_37075()).method_6104(0, -1, 0);
               class_9529 var8 = new class_9529(var6, Direction.field_817, var7, false);
               class_8585 var9 = new class_8585(class_2584.field_12791, var8);
               mcInstance.method_8614().method_4813(var9);
               if (!(this.field_46845 < (double)this.getFloatValueByName("Boost"))) {
                  class_8865.method_40777(var1, 0.0);
                  mcInstance.field_9632.method_26595();
                  this.field_46842 = 0.4299999;
                  this.field_46843 = 0;
                  this.field_46838 = class_314.method_1434();
                  var1.method_35235(this.field_46842);
                  this.field_46844 = mcInstance.field_9632.method_37309();
                  this.field_46840++;
                  this.field_46845 += 0.5;
               } else {
                  mcInstance.field_9616.field_32603 = Math.min(1.0F, Math.max(0.1F, (float)(1.2 - this.field_46845 * 0.15)));
                  if (this.field_46840 > 2) {
                     this.field_46845 += 0.05;
                  }

                  if (this.field_46840 % 2 != 0) {
                     var1.method_35232(Math.cos(Math.toRadians((double)var4)) * this.field_46845);
                     var1.method_35229(Math.sin(Math.toRadians((double)var4)) * this.field_46845);
                  } else {
                     var1.method_35232(Math.cos(Math.toRadians((double)(var4 + 180.0F))) * this.field_46845);
                     var1.method_35229(Math.sin(Math.toRadians((double)(var4 + 180.0F))) * this.field_46845);
                  }
               }
            }
         }
      }
   }

   @EventListen
   public void method_42165(class_139 var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_509) {
            this.field_46839 = true;
            SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Mineplex fly", "Please try again"));
         }
      }
   }

   @EventListen
   public void method_42166(class_2157 var1) {
      if (this.method_42015()) {
         if (var1.method_10047() instanceof class_7371
            && this.field_46846 != -1
            && this.field_46845 < (double)this.getFloatValueByName("Boost")
            && (mcInstance.field_9632.field_41726 || class_314.method_1413(mcInstance.field_9632, 0.001F))
            && !this.field_46839) {
            var1.method_29715(true);
         }
      }
   }

   private int method_42172() {
      if (mcInstance.field_9632.method_26446().method_28022()) {
         this.field_46846 = mcInstance.field_9632.field_3853.field_36404;
         return this.field_46846;
      } else {
         for (int var3 = 36; var3 < 45; var3++) {
            int var4 = var3 - 36;
            if (mcInstance.field_9632.field_3869.method_18878(var3).method_35898().method_28022()) {
               if (mcInstance.field_9632.field_3853.field_36404 != var4 && this.field_46846 != var4) {
                  mcInstance.method_8614().method_4813(new class_7371(var4));
                  this.field_46846 = var4;
               }

               return var4;
            }
         }

         class_2740.method_12356(mcInstance.field_9632.field_3869.field_19925, 42, 0, class_6269.field_32019, mcInstance.field_9632, true);
         if (!mcInstance.field_9632.field_3869.method_18878(42).method_35898().method_28022()) {
            SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Mineplex Fly", "Please empty a slot in your inventory"));
         } else if (mcInstance.field_9632.field_3853.field_36404 != 6 && this.field_46846 != 6) {
            mcInstance.method_8614().method_4813(new class_7371(6));
            this.field_46846 = 6;
            return 6;
         }

         return -1;
      }
   }

   @EventListen
   public void method_42171(class_1711 var1) {
      if (this.method_42015() && this.getBooleanValueByName("Fake") && !(this.field_46844 < 0.0) && !(mcInstance.field_9632.method_37309() < this.field_46844)) {
         mcInstance.field_9632.field_41736.field_7333 = this.field_46844;
         mcInstance.field_9632.field_41713 = this.field_46844;
         mcInstance.field_9632.field_3864 = this.field_46844;
         mcInstance.field_9632.field_41698 = this.field_46844;
         if (class_8865.method_40772()) {
            mcInstance.field_9632.field_3859 = 0.099999994F;
         }
      }
   }
}
