package remapped;

public final class class_5057 extends class_6349 {
   private String field_26164;

   public class_5057(class_5057 var1) {
      super(var1);
      this.method_23316(var1.method_23315());
   }

   public class_5057 method_23314() {
      return new class_5057(this);
   }

   @Override
   public void method_29070(StringBuilder var1) {
      var1.append(this.field_26164);
      super.method_29070(var1);
   }

   public String method_23315() {
      return this.field_26164;
   }

   public void method_23316(String var1) {
      this.field_26164 = var1;
   }

   @Override
   public String toString() {
      return "SelectorComponent(selector=" + this.method_23315() + ")";
   }

   public class_5057(String var1) {
      this.field_26164 = var1;
   }
}
