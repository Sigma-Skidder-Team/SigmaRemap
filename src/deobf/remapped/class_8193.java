package remapped;

public class class_8193 extends Module {
   private int field_41932;
   private boolean field_41931;
   private boolean field_41934;
   private boolean field_41933;
   private double field_41929;

   public class_8193() {
      super(class_5664.field_28716, "Cubecraft", "Fly for Cubecraft");
      this.method_42010(new class_8563("Damage", "Allows you to go infinitly up", false));
   }

   @Override
   public void method_42006() {
      this.field_41932 = 0;
      if (!mcInstance.field_9577.field_45560.method_27060()) {
         if (!mcInstance.field_9577.field_45560.method_27060()) {
            this.field_41931 = false;
         }
      } else {
         mcInstance.field_9577.field_45560.field_30024 = false;
         this.field_41931 = true;
      }

      if (mcInstance.field_9632.field_41726) {
         this.field_41934 = this.field_41933 = false;
      }

      if (!this.method_42007("Damage")) {
         this.field_41933 = true;
      }
   }

   @Override
   public void method_42020() {
      class_314.method_1408(-0.078);
      class_8865.method_40776(0.2);
      mcInstance.field_9616.field_32603 = 1.0F;
      if (this.field_41931) {
         mcInstance.field_9577.field_45560.field_30024 = true;
      }
   }

   @class_9148
   private void method_37543(class_6435 var1) {
      if (this.method_42015()) {
         if (var1.method_29384() == mcInstance.field_9577.field_45560.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_41931 = true;
         }
      }
   }

   @class_9148
   private void method_37545(class_307 var1) {
      if (this.method_42015()) {
         if (var1.method_1364() == mcInstance.field_9577.field_45560.field_30027.field_17800) {
            var1.method_29715(true);
            this.field_41931 = false;
         }
      }
   }

   @class_9148
   @class_3932
   public void method_37542(class_7767 var1) {
      if (!this.method_42015()) {
         if (mcInstance.field_9632.field_41726) {
            this.field_41934 = this.field_41933 = false;
         }
      } else if (class_314.method_1392()) {
         if (this.field_41932 > 0) {
            var1.method_35235(0.0);
            class_8865.method_40777(var1, 0.0);
            this.field_41932++;
         } else {
            if (this.field_41932 != 0) {
               if (this.field_41934) {
                  var1.method_35235(0.0);
                  class_8865.method_40777(var1, class_8865.method_40775());
                  if (this.field_41932 != -4) {
                     if (this.field_41932 != -1) {
                        if (class_3347.method_15349() > class_412.field_1747.method_2055()) {
                           if (mcInstance.field_9577.field_45450.method_27060() && !this.field_41931) {
                              var1.method_35235(0.0625);
                              class_8865.method_40777(var1, 0.0);
                              this.field_41932 = 1;
                           } else if (this.field_41931 && !mcInstance.field_9577.field_45450.method_27060()) {
                              var1.method_35235(-0.225);
                              class_8865.method_40777(var1, 0.0);
                              this.field_41932 = 1;
                           }
                        }
                     } else {
                        if (!this.field_41933) {
                           class_314.method_1450(false);
                           this.field_41933 = true;
                        }

                        this.field_41932--;
                     }
                  } else if (mcInstance.field_9577.field_45450.method_27060() && !this.field_41931) {
                     var1.method_35235(0.0625);
                  }
               }
            } else if (class_3347.method_15349() != class_412.field_1747.method_2055()) {
               if (!class_314.method_1413(mcInstance.field_9632, 0.001F)) {
                  var1.method_35235(0.0);
                  class_8865.method_40777(var1, 0.0);
                  if (mcInstance.field_9632.field_41706 > 4.0F) {
                     mcInstance.method_8614().method_4813(new class_4609(true));
                     this.field_41933 = true;
                  }
               } else {
                  var1.method_35235(class_8865.method_40786());
                  class_8865.method_40777(var1, 0.615);
               }

               this.field_41932 = 1;
            } else if (!class_314.method_1413(mcInstance.field_9632, 0.001F)) {
               var1.method_35235(0.0);
               this.field_41932 = -2;
               SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Cubecraft Fly", "Please start on the ground."));
            } else {
               class_8865.method_40777(var1, 0.0);
               var1.method_35235(0.0);
               long var14 = class_314.method_1418() % 90L;
               double var15 = 0.016 + (double)var14 / 10000.0;
               double var16 = mcInstance.field_9632.method_37302();
               double var10 = mcInstance.field_9632.method_37309() + 0.022;
               double var12 = mcInstance.field_9632.method_37156();
               mcInstance.method_8614().method_4813(new class_9515(var16, var10, var12, false));
               mcInstance.method_8614().method_4813(new class_9515(var16, var10, var12 + 0.07, false));
               mcInstance.method_8614().method_4813(new class_9515(var16, var10, var12, false));
               mcInstance.method_8614().method_4813(new class_9515(var16, var10 + 3.0, var12, false));
            }

            class_314.method_1408(var1.method_35236());
         }
      } else {
         class_8865.method_40777(var1, class_8865.method_40775());
         var1.method_35235(0.0);
         if (mcInstance.field_9632.field_41697 % 2 == 0) {
            double var4 = mcInstance.field_9632.method_37302();
            double var6 = mcInstance.field_9632.method_37309();
            double var8 = mcInstance.field_9632.method_37156();
            mcInstance.field_9632.method_37256(var4, var6 + 1.0E-10, var8);
         }
      }
   }

   @class_9148
   public void method_37544(class_1393 var1) {
      if (var1.method_6449() && class_314.method_1392()) {
         var1.method_6444(true);
         if (class_3347.method_15349() == class_412.field_1747.method_2055() && this.field_41932 == 0 && class_314.method_1413(mcInstance.field_9632, 0.001F)) {
            var1.method_29715(true);
         }

         if (this.field_41932 >= 2) {
            var1.method_6455(275.0);
         }
      }
   }

   @class_9148
   public void method_37541(class_139 var1) {
      if (mcInstance.field_9601 != null && mcInstance.method_8614() != null && class_314.method_1392()) {
         class_6310 var4 = var1.method_557();
         if (!(var4 instanceof class_509)) {
            if (var4 instanceof class_4548) {
               class_4548 var5 = (class_4548)var4;
               if (var5.method_21093() == mcInstance.field_9632.method_37145()) {
                  this.field_41932 = -4;
               }
            }
         } else {
            class_509 var20 = (class_509)var4;
            if (class_3347.method_15349() != class_412.field_1747.method_2055()) {
               float[] var6 = class_8865.method_40773();
               float var7 = var6[1];
               float var8 = var6[2];
               float var9 = var6[0];
               double var10 = Math.cos(Math.toRadians((double)var9));
               double var12 = Math.sin(Math.toRadians((double)var9));
               double var14 = class_8865.method_40775();
               double var16 = ((double)var7 * var10 + (double)var8 * var12) * var14;
               double var18 = ((double)var7 * var12 - (double)var8 * var10) * var14;
               this.field_41929 = var20.field_3144;
               var20.field_3139 += var16;
               var20.field_3141 += var18;
            }

            this.field_41934 = true;
            this.field_41932 = -1;
         }
      }
   }
}
