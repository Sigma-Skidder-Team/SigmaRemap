package remapped;

public class class_7841 extends class_6749 {
   private int field_39755 = 200;

   public class_7841(class_6629<? extends class_7841> var1, World var2) {
      super(var1, var2);
   }

   public class_7841(World var1, class_5834 var2) {
      super(class_6629.field_34260, var2, var1);
   }

   public class_7841(World var1, double var2, double var4, double var6) {
      super(class_6629.field_34260, var2, var4, var6, var1);
   }

   @Override
   public void method_37123() {
      super.method_37123();
      if (this.field_41768.field_33055 && !this.field_34834) {
         this.field_41768.method_43361(class_3090.field_15324, this.method_37302(), this.method_37309(), this.method_37156(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   public class_6098 method_30925() {
      return new class_6098(class_4897.field_25049);
   }

   @Override
   public void method_30935(class_5834 var1) {
      super.method_30935(var1);
      class_2250 var4 = new class_2250(Effects.field_19722, this.field_39755, 0);
      var1.method_26558(var4);
   }

   @Override
   public void method_37314(class_5734 var1) {
      super.method_37314(var1);
      if (var1.method_25938("Duration")) {
         this.field_39755 = var1.method_25947("Duration");
      }
   }

   @Override
   public void method_37376(class_5734 var1) {
      super.method_37376(var1);
      var1.method_25931("Duration", this.field_39755);
   }
}
