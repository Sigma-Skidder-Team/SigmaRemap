package remapped;

public class class_1826 extends class_9128 {
   private int field_9265;
   private int field_9264;

   public class_1826() {
      super(class_5664.field_28711, "Unstuck", "Toggle this when an anticheat freeze you mid-air");
      this.method_42010(new class_2748<Float>("Flags", "Maximum flag before trying to unstuck", 5.0F, Float.class, 2.0F, 20.0F, 1.0F));
   }

   @Override
   public void method_42006() {
      this.field_9265 = 0;
   }

   @class_9148
   public void method_8070(class_7767 var1) {
      if (this.method_42015()) {
         if ((float)this.field_9265 >= this.method_42002("Flags")) {
            class_8865.method_40777(var1, 0.0);
            var1.method_35235(0.0);
            field_46692.field_9632.method_37214(0.0, 0.0, 0.0);
         }
      }
   }

   @class_9148
   public void method_8069(class_717 var1) {
      if (this.method_42015()) {
         this.field_9265 = 0;
      }
   }

   @class_9148
   public void method_8072(class_1393 var1) {
      if (this.method_42015() && var1.method_6449()) {
         if (!field_46692.field_9632.field_41726 && !class_314.method_1413(field_46692.field_9632, 0.001F)) {
            if ((float)this.field_9265 >= this.method_42002("Flags") && this.field_9264 == 0) {
               this.field_9264 = 60;
               class_727.method_3328().method_3335().method_27841(new class_8235("Unstuck", "Trying to unstuck you.."));
            }

            if (this.field_9264 > 0) {
               this.field_9264--;
               if (this.field_9264 == 0) {
                  this.field_9265 = 0;
               }

               var1.method_29715(true);
            }
         } else {
            this.field_9265 = 0;
         }
      }
   }

   @class_9148
   public void method_8071(class_139 var1) {
      if (this.method_42015()) {
         if (field_46692.field_9632 != null) {
            if (var1.method_557() instanceof class_509 && !class_314.method_1413(field_46692.field_9632, 0.3F) && field_46692.field_9632.field_41697 > 10) {
               this.field_9265++;
               if ((float)this.field_9265 > this.method_42002("Flags")) {
                  var1.method_29715(true);
               }
            }
         }
      }
   }
}
