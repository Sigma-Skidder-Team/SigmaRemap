package remapped;

public class class_7847 extends class_9128 {
   private boolean field_39769 = false;
   private boolean field_39768;

   public class_7847() {
      super(class_5664.field_28714, "Minemen", "Minemen Club bypass");
   }

   @Override
   public void method_42006() {
      this.field_39769 = false;
      this.field_39768 = true;
   }

   @class_9148
   public void method_35496(class_1393 var1) {
      if (var1.method_6449()) {
         if (class_314.method_1413(field_46692.field_9632, 1.0E-5F)) {
            this.field_39769 = true;
            var1.method_6455(var1.method_6454() - 5.0E-7);
            var1.method_6451(false);
         } else {
            if (this.field_39769 && field_46692.field_9632.method_37098().field_7333 < 0.0) {
               this.field_39769 = false;
               var1.method_6451(true);
            }
         }
      }
   }

   @class_9148
   public void method_35498(class_7767 var1) {
      if (this.field_39768) {
         if (!field_46692.field_9632.field_41726) {
            if (field_46692.field_9632.field_41706 > 1.0F) {
               this.field_39768 = false;
            }
         } else {
            var1.method_35235(class_8865.method_40786());
            this.field_39768 = false;
         }
      }

      class_314.method_1408(var1.method_35236());
   }

   @class_9148
   private void method_35497(class_139 var1) {
      if (field_46692.field_9632 != null && var1.method_557() instanceof class_4548) {
         class_4548 var5 = (class_4548)var1.method_557();
         if (var5.method_21093() == field_46692.field_9632.method_37145() && var5.field_22168 < 0 && field_46692.field_9632.field_41726) {
            var1.method_29715(true);
         }
      } else if (var1.method_557() instanceof class_509) {
         class_509 var4 = (class_509)var1.method_557();
         this.field_39768 = true;
      }
   }
}
