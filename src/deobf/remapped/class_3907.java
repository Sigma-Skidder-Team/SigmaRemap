package remapped;

public class class_3907 extends class_9128 {
   private static int field_18992;

   public class_3907() {
      super(class_5664.field_28714, "AAC 4", "Criticals for aac 4.*");
      this.method_42010(new class_8563("KillAura", "Criticals only if KillAura is enabled", false));
   }

   @Override
   public void method_42006() {
      field_18992 = 0;
   }

   @class_9148
   @class_7664
   private void method_18089(class_8544 var1) {
      if (this.method_42015() && !(var1.method_39326() < 0.625)) {
         field_18992 = 0;
      }
   }

   @class_9148
   private void method_18090(class_2911 var1) {
      if (field_18992 == 2) {
         var1.method_29715(true);
      }
   }

   @class_9148
   @class_315
   private void method_18092(class_1393 var1) {
      if (!this.method_42015() || class_727.method_3328().method_3298().method_847(class_6908.class).method_42015()) {
         field_18992 = 0;
      } else if (var1.method_6449()) {
         if (field_46692.field_9647.method_42156()) {
            field_18992 = 0;
         }

         boolean var4 = !this.method_42007("KillAura") || class_2534.field_12558 != null || class_2534.field_12556 != null;
         if (field_46692.field_9632.field_41726 && field_46692.field_9632.field_41774 && var4) {
            field_18992++;
            field_46692.field_9632.field_30502 = 0.0;
            if (field_18992 != 2) {
               if (field_18992 >= 3) {
                  double var5 = 0.001;
                  var1.method_6455(var1.method_6454() + var5);
                  var1.method_6451(false);
               }
            } else {
               var1.method_6455(var1.method_6454() + 0.00101);
               var1.method_6451(false);
            }
         } else {
            field_18992 = 0;
         }
      }
   }

   public static boolean method_18091() {
      return field_18992 == 2;
   }
}
