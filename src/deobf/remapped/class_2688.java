package remapped;

public class class_2688 implements class_6973 {
   public class_2688(class_1939 var1) {
      this.field_13169 = var1;
   }

   public void 洝觯䡸蓳醧室(Exception var1) {
      if (var1 == null) {
         class_1289.method_5741().fine("reconnect success");
         class_1289.method_5759(this.field_13169.field_9904.field_26627);
      } else {
         class_1289.method_5741().fine("reconnect attempt error");
         class_1289.method_5774(this.field_13169.field_9904.field_26627, false);
         class_1289.method_5758(this.field_13169.field_9904.field_26627);
         class_1289.method_5767(this.field_13169.field_9904.field_26627, "reconnect_error", new Object[]{var1});
      }
   }
}
