package remapped;

public class class_4452 extends Module {
   private double field_21693;
   private double field_21694;
   private int field_21695;
   private int field_21691;
   private int field_21690;
   private boolean field_21696;

   public class_4452() {
      super(Category.MOVEMENT, "Mineplex", "Mineplex longjump.");
   }

   @Override
   public void method_42020() {
      class_8865.method_40776(class_8865.method_40775() * 0.7);
   }

   @Override
   public void method_42006() {
      this.field_21696 = true;
      this.field_21695 = -1;
      this.field_21691 = 0;
      this.field_21690 = 0;
   }

   @class_9148
   public void method_20637(class_1393 var1) {
      if (this.method_42015() && var1.method_6449() && this.field_21695 >= 0) {
         var1.method_6444(true);
      }
   }

   @class_9148
   public void method_20638(class_7767 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null) {
         if (!mcInstance.field_9632.field_41726) {
            if (this.field_21695 >= 0) {
               if (this.field_21696 && !class_314.method_1434()) {
                  this.field_21696 = !this.field_21696;
                  this.field_21693 = 0.5;
                  this.field_21691 = 1;
               }

               this.field_21695++;
               this.field_21694 -= 0.04000000000001;
               if (this.field_21695 <= 22) {
                  if (this.field_21695 == 10 && this.field_21696) {
                     this.field_21694 = -0.005;
                  }
               } else {
                  this.field_21694 -= 0.02;
               }

               if (this.field_21695 > 6 && !class_314.method_1434()) {
                  this.field_21694 -= 0.05;
               }

               if (mcInstance.field_9632.field_41744) {
                  this.field_21693 = 0.35;
                  this.field_21691 = 1;
               }

               if (mcInstance.field_9632.field_41774) {
                  this.field_21694 = -0.078;
                  this.field_21695 = 23;
               }

               this.field_21693 -= 0.01;
               if (this.field_21693 < 0.3) {
                  this.field_21693 = 0.3;
               }

               class_8865.method_40777(var1, this.field_21693);
               var1.method_35235(this.field_21694);
            }
         } else {
            if (this.field_21690 > 1) {
               this.field_21691 = 0;
            } else {
               this.field_21690++;
            }

            if (this.field_21695 > 0) {
               this.field_21695 = -1;
               if (this.method_42017().method_42007("Auto Disable")) {
                  this.method_42017().method_41999();
                  return;
               }
            }

            this.field_21696 = class_314.method_1434();
            class_1331 var4 = new class_1331(
               mcInstance.field_9632.method_37302(), mcInstance.field_9632.method_37309() - 0.4, mcInstance.field_9632.method_37156()
            );
            if (class_314.method_1434()
               && (this.method_42017().method_42007("BorderJump") && !class_7494.method_34090(var4) || this.method_42017().method_42007("Auto Jump"))) {
               mcInstance.field_9632.method_26595();
               var1.method_35235(mcInstance.field_9632.method_37098().field_7333);
               class_8865.method_40777(var1, 0.0);
            }
         }
      }
   }

   @class_9148
   public void method_20636(class_2911 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null) {
         this.field_21693 = 0.81 + (double)this.field_21691 * 0.095;
         if (mcInstance.field_9632.method_37309() != (double)((int) mcInstance.field_9632.method_37309())) {
            this.field_21693 = 0.52;
            this.field_21691 = 1;
         }

         this.field_21690 = 0;
         this.field_21694 = 0.4299999;
         if (this.field_21691 < 2) {
            this.field_21691++;
         }

         this.field_21695 = 0;
         var1.method_13315(0.0);
         var1.method_13313(this.field_21694);
      }
   }

   @class_9148
   public void method_20635(class_139 var1) {
      if (this.method_42015() && mcInstance.field_9632 != null) {
         if (var1.method_557() instanceof class_509) {
            this.field_21695 = -1;
            this.field_21691 = 0;
         }
      }
   }
}
