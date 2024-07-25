package remapped;

public class class_4348 extends class_4591 {
   private static String[] field_21305;
   private final class_8116 field_21306;

   public class_4348(class_8116 var1) {
      this.field_21306 = var1;
   }

   @Override
   public class_8116 method_21257() {
      return this.field_21306;
   }

   @Override
   public int method_21255() {
      return 150;
   }

   @Override
   public void method_1163() {
      super.method_1163();
      this.field_22324 = this.method_21257().method_36927();
      this.method_21260();
      this.field_22318.method_8281(this.method_21257().method_36920());
   }

   @Override
   public void method_21259(class_8116 var1) {
      if (var1 instanceof class_3444) {
         class_3444 var4 = (class_3444)var1;
         this.field_943.method_8614().method_4813(new class_685(var4.method_15881().method_37145(), this.field_22318.method_8246(), var1.method_36927()));
      }
   }
}
