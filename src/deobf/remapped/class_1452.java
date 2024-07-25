package remapped;

public class class_1452 extends class_9128 {
   public class_1452() {
      super(class_5664.field_28710, "NoViewReset", "Prevents the server from resetting your client yaw/pitch");
   }

   @class_9148
   private void method_6686(class_139 var1) {
      if (this.method_42015()) {
         if (field_46692.field_9632 != null) {
            if (field_46692.field_9632.field_41697 >= 10) {
               if (field_46692.field_9632 != null && var1.method_557() instanceof class_509) {
                  class_509 var4 = (class_509)var1.method_557();
                  field_46692.field_9632.field_41711 = var4.field_3143;
                  field_46692.field_9632.field_41762 = var4.field_3140;
                  var4.field_3143 = field_46692.field_9632.field_41701;
                  var4.field_3140 = field_46692.field_9632.field_41755;
               }
            }
         }
      }
   }
}
