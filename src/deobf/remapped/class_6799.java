package remapped;

public class class_6799 extends Module {
   private int field_35038;
   private int field_35037;
   private double field_35041;
   private float field_35039;

   public class_6799() {
      super(Category.MOVEMENT, "Gomme", "Speed for GommeHD");
   }

   @Override
   public void method_42006() {
      this.field_35038 = 0;
      this.field_35037 = 0;
      this.field_35039 = class_8865.method_40787()[0];
   }

   @Override
   public void method_42020() {
      if (class_314.method_1434()) {
         class_8865.method_40779(0.27, class_8865.method_40787()[0], this.field_35039, 45.0F);
      } else {
         class_8865.method_40776(0.0);
      }
   }

   @class_9148
   public void method_31147(class_139 var1) {
      if (this.method_42015()) {
         if (var1.method_557() instanceof class_509) {
            this.field_35037 = 0;
         }
      }
   }

   @class_9148
   public void method_31148(class_7767 var1) {
      if (this.method_42015()) {
         if (!mcInstance.field_9632.field_41726) {
            if (this.field_35041 > 0.0 && this.field_35037 > 0) {
               this.field_35038++;
               if (this.field_35038 != 1) {
                  if (this.field_35038 != 11) {
                     double[] var4 = new double[]{0.98, 0.98};
                     double var5 = 0.98;
                     if (this.field_35037 - 1 < var4.length) {
                        var5 = var4[this.field_35037 - 1];
                     }

                     this.field_35041 *= var5;
                  } else {
                     double[] var7 = new double[]{0.999, 0.999};
                     double var10 = 0.98;
                     if (this.field_35037 - 1 < var7.length) {
                        var10 = var7[this.field_35037 - 1];
                     }

                     this.field_35041 *= var10;
                  }
               } else {
                  double[] var8 = new double[]{0.3686, 0.3688};
                  if (this.field_35037 - 1 >= var8.length) {
                     this.field_35041 = 0.28;
                  } else {
                     this.field_35041 = var8[this.field_35037 - 1];
                  }
               }

               if (class_314.method_1434()) {
                  this.field_35039 = class_8865.method_40780(var1, Math.max(this.field_35041, 0.23), class_8865.method_40787()[0], this.field_35039, 45.0F);
               } else {
                  this.field_35041 = 0.1;
                  class_8865.method_40777(var1, 0.0);
               }
            }
         } else if (class_314.method_1434()) {
            this.field_35038 = 0;
            var1.method_35235(class_8865.method_40786());
            double[] var9 = new double[]{0.549, 0.625};
            this.field_35041 = var9[Math.min(this.field_35037, var9.length - 1)];
            if (this.field_35037 < var9.length) {
               this.field_35037++;
            }

            class_8865.method_40777(var1, this.field_35041);
            this.field_35039 = class_8865.method_40787()[0];
         }
      }
   }
}
