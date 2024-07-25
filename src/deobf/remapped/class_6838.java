package remapped;

public class class_6838 extends class_3757 implements class_5507 {
   private class_6098 field_35262 = class_6098.field_31203;

   public class_6838() {
      super(class_133.field_352);
   }

   @Override
   public void method_17394(class_2522 var1, class_5734 var2) {
      super.method_17394(var1, var2);
      if (var2.method_25939("RecordItem", 10)) {
         this.method_31352(class_6098.method_28015(var2.method_25937("RecordItem")));
      }
   }

   @Override
   public class_5734 method_17396(class_5734 var1) {
      super.method_17396(var1);
      if (!this.method_31351().method_28022()) {
         var1.method_25946("RecordItem", this.method_31351().method_27998(new class_5734()));
      }

      return var1;
   }

   public class_6098 method_31351() {
      return this.field_35262;
   }

   public void method_31352(class_6098 var1) {
      this.field_35262 = var1;
      this.method_17407();
   }

   @Override
   public void method_24975() {
      this.method_31352(class_6098.field_31203);
   }
}
