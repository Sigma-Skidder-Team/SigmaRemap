package remapped;

public class class_367 extends class_9128 {
   public class_367(String var1, String var2, class_5664 var3) {
      super(var3, var1, var2);
   }

   @Override
   public boolean method_42015() {
      return SigmaMainClass.method_3328().method_3332().method_23084() ? super.method_42015() : false;
   }

   @Override
   public void method_42023(boolean var1) {
      if (SigmaMainClass.method_3328().method_3332().method_23084()) {
         super.method_42023(var1);
      } else {
         if (this.field_46700 != var1) {
            SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Premium", this.method_41992() + " Not yet available for free version"));
            SigmaMainClass.method_3328().method_3315().method_21206("error");
         }
      }
   }

   @Override
   public void method_42018(boolean var1) {
      if (SigmaMainClass.method_3328().method_3332().method_23084()) {
         super.method_42018(var1);
      } else {
         if (this.field_46700 != var1 && var1) {
            SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Premium", this.method_41992() + " Not yet available for free version"));
            SigmaMainClass.method_3328().method_3315().method_21206("error");
         }
      }
   }

   @Override
   public void method_41991(boolean var1) {
      if (SigmaMainClass.method_3328().method_3332().method_23084()) {
         super.method_41991(var1);
      } else {
         if (this.method_42015() != var1) {
            SigmaMainClass.method_3328().method_3335().method_27841(new class_8235("Premium", this.method_41992() + " Not yet available for free version"));
            SigmaMainClass.method_3328().method_3315().method_21206("error");
         }
      }
   }
}
