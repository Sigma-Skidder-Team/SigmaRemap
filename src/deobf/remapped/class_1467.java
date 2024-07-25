package remapped;

public class class_1467 extends class_9128 {
   private int field_7881;
   private int field_7883;
   private double field_7882;

   public class_1467() {
      super(class_5664.field_28716, "NCP", "Speed for NCP");
      this.method_42010(new class_8563("Auto Jump", "Automatically jumps for you.", true));
   }

   @Override
   public void method_42006() {
      this.field_7883 = 1;
      double var3 = field_46692.field_9632.method_37098().field_7336;
      double var5 = field_46692.field_9632.method_37098().field_7334;
      this.field_7882 = Math.sqrt(var3 * var3 + var5 * var5);
   }

   @class_9148
   public void method_6779(class_1393 var1) {
      if (this.method_42015()
         && field_46692.field_9632 != null
         && !class_7033.method_32081()
         && !class_727.method_3328().method_3298().method_847(class_2368.class).method_42015()) {
         if (var1.method_6449() && class_6908.field_35509 > 1) {
            double var4 = field_46692.field_9632.method_37302() - field_46692.field_9632.field_30525;
            double var6 = field_46692.field_9632.method_37156() - field_46692.field_9632.field_30507;
            if (this.field_7881 != 0) {
               this.field_7882 = Math.sqrt(var4 * var4 + var6 * var6);
            } else {
               this.field_7882 = this.field_7882 * (0.67 + Math.random() * 1.0E-10);
            }
         }
      }
   }

   @class_9148
   public void method_6782(class_7767 var1) {
      if (this.method_42015() && field_46692.field_9632 != null) {
         if (!class_7033.method_32081() && !field_46692.field_9632.method_37285()) {
            if (this.field_7883 < 2) {
               this.field_7883++;
            }

            if (!field_46692.field_9632.field_41726) {
               if (this.field_7881 >= 0) {
                  this.field_7881++;
                  double var4 = this.field_7882;
                  if (this.field_7881 > 1) {
                     var4 = Math.max(class_8865.method_40767(), this.field_7882 - (0.004 - class_8865.method_40767() * 0.003) - Math.random() * 1.0E-10);
                  }

                  class_8865.method_40777(var1, var4);
                  if (var1.method_35236() >= -0.008744698139753596 && var1.method_35236() <= -0.008724698139753597) {
                     var1.method_35235(0.001);
                  } else if (var1.method_35236() >= -0.07743000150680542 && var1.method_35236() <= -0.07741000150680542) {
                     var1.method_35235(var1.method_35236() - 0.01);
                  }
               }
            } else if (this.field_7883 > 1 && (this.method_42007("Auto Jump") && class_314.method_1434() || field_46692.field_9577.field_45450.method_27060())) {
               this.field_7881 = 0;
               field_46692.field_9632.method_26595();
               var1.method_35232(field_46692.field_9632.method_37098().field_7336);
               var1.method_35235(field_46692.field_9632.method_37098().field_7333);
               var1.method_35229(field_46692.field_9632.method_37098().field_7334);
            }
         } else {
            this.field_7881 = -1;
         }
      }
   }

   @class_9148
   @class_7664
   public void method_6780(class_2911 var1) {
      if (this.method_42015() && !class_7033.method_32081()) {
         if (this.field_7881 != 0) {
            var1.method_29715(true);
         }

         if (!field_46692.field_9577.field_45450.method_27060() || !class_727.method_3328().method_3298().method_847(class_3709.class).method_42015()) {
            double var4 = 0.56 + (double)class_8865.method_40770() * 0.1;
            var1.method_13313(0.407 + (double)class_8865.method_40769() * 0.1 + Math.random() * 1.0E-5);
            if (class_6908.field_35509 < 2) {
               var4 /= 2.5;
            }

            var4 = Math.max(class_8865.method_40767(), var4);
            var1.method_13315(var4);
            this.field_7882 = var4;
         }
      }
   }

   @class_9148
   public void method_6781(class_8544 var1) {
      if (this.method_42015() && !(var1.method_39326() < 0.9)) {
         this.field_7883 = 0;
      }
   }
}
