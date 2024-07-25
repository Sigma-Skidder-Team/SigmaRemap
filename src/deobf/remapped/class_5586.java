package remapped;

public class class_5586 extends class_9128 {
   private int field_28365;

   public class_5586() {
      super(class_5664.field_28714, "Minemen", "Criticals for Anti Gaming Chair");
   }

   @Override
   public void method_42006() {
      this.field_28365 = 0;
   }

   @class_9148
   @class_315
   private void method_25379(class_1393 var1) {
      if (var1.method_6449()) {
         class_3620 var4 = (class_3620) SigmaMainClass.method_3328().method_3298().method_847(class_9758.class);
         if (!var4.method_42015() || !var4.method_42016("Type").equalsIgnoreCase("Minemen")) {
            if (!field_46692.field_9632.field_41726) {
               this.field_28365 = 0;
            } else {
               if (this.field_28365 > 0) {
                  if (this.field_28365 % 2 != 0) {
                     var1.method_6455(var1.method_6454() - 1.0E-14);
                  }

                  var1.method_6451(false);
               }

               this.field_28365++;
               var1.method_6444(true);
            }

            if (field_46692.field_9647.method_42156() && field_46692.field_9632.field_41726) {
               this.field_28365 = 0;
               var1.method_6455(field_46692.field_9632.method_37309());
               var1.method_6451(true);
            }
         }
      }
   }
}
