package remapped;

public final class class_9117 extends class_6349 {
   private String field_46669;

   public class_9117(class_9117 var1) {
      super(var1);
      this.method_41972(var1.method_41971());
   }

   public class_9117(String var1) {
      this.method_41972(var1);
   }

   @Override
   public class_6349 method_29059() {
      return new class_9117(this);
   }

   @Override
   public void method_29066(StringBuilder var1) {
      var1.append(this.method_41971());
      super.method_29066(var1);
   }

   @Override
   public void method_29070(StringBuilder var1) {
      var1.append(this.method_29077());
      if (this.method_29051()) {
         var1.append(class_2909.field_14199);
      }

      if (this.method_29042()) {
         var1.append(class_2909.field_14211);
      }

      if (this.method_29044()) {
         var1.append(class_2909.field_14202);
      }

      if (this.method_29047()) {
         var1.append(class_2909.field_14193);
      }

      if (this.method_29063()) {
         var1.append(class_2909.field_14190);
      }

      var1.append(this.method_41971());
      super.method_29070(var1);
   }

   public String method_41971() {
      return this.field_46669;
   }

   public void method_41972(String var1) {
      this.field_46669 = var1;
   }

   @Override
   public String toString() {
      return "KeybindComponent(keybind=" + this.method_41971() + ")";
   }

   public class_9117() {
   }
}
