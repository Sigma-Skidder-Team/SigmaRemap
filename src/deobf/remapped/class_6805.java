package remapped;

public class class_6805 extends Module {
   public class_6805() {
      super(class_5664.field_28714, "Minis", "Minis criticals");
      this.method_42010(new class_2826("Mode", "Mode", 0, "Basic", "Hypixel", "Cubecraft"));
      this.method_42010(new class_8563("Avoid Fall Damage", "Avoid fall damages", false));
   }

   @class_9148
   private void method_31154(class_2911 var1) {
      if (this.method_42015()) {
         if (class_2534.field_12548) {
            mcInstance.method_8614()
               .method_4813(
                  new class_9515(mcInstance.field_9632.method_37302(), mcInstance.field_9632.method_37309(), mcInstance.field_9632.method_37156(), true)
               );
         }
      }
   }

   @class_9148
   private void method_31155(class_8544 var1) {
      if (this.method_42015()) {
         if (class_2534.field_12548) {
            var1.method_29715(true);
         }
      }
   }
}
