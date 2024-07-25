package remapped;

public class class_3971 implements class_6224 {
   public class_3971(class_1761 var1, class_1289 var2) {
      this.field_19265 = var1;
      this.field_19266 = var2;
   }

   @Override
   public void method_28452(Object... var1) {
      Object var4 = var1.length <= 0 ? null : var1[0];
      class_1289.method_5741().fine("connect_error");
      class_1289.method_5743(this.field_19266);
      this.field_19266.field_7086 = class_8916.field_45715;
      class_1289.method_5767(this.field_19266, "connect_error", new Object[]{var4});
      if (this.field_19265.field_9039 == null) {
         class_1289.method_5751(this.field_19266);
      } else {
         class_6434 var5 = new class_6434("Connection error", !(var4 instanceof Exception) ? null : (Exception)var4);
         this.field_19265.field_9039.method_31885(var5);
      }
   }
}
