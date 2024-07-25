package remapped;

public class class_7968 extends class_958 {
   private static String[] field_40816;

   private class_7968(class_8829 var1) {
      super(var1, null);
      this.field_40815 = var1;
   }

   @Override
   public boolean method_4213() {
      if (this.field_40815.method_40588()
         && class_8829.method_40561(this.field_40815)
         && class_8829.method_40569(this.field_40815).method_12170(this.field_40815.method_37245(), 2.0)) {
         class_3757 var3 = this.field_40815.field_41768.method_28260(class_8829.method_40569(this.field_40815));
         if (var3 instanceof class_5354) {
            class_5354 var4 = (class_5354)var3;
            if (!var4.method_24453()) {
               return true;
            }

            class_8829.method_40570(this.field_40815, null);
         }
      }

      return false;
   }

   @Override
   public boolean method_4214() {
      return false;
   }

   @Override
   public void method_16796() {
      class_3757 var3 = this.field_40815.field_41768.method_28260(class_8829.method_40569(this.field_40815));
      if (var3 instanceof class_5354) {
         class_5354 var4 = (class_5354)var3;
         var4.method_24442(this.field_40815, this.field_40815.method_40592());
      }
   }
}
