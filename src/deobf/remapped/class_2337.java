package remapped;

public final class class_2337 extends class_6349 {
   private String field_11667;
   private String field_11668;
   private String field_11666 = "";

   public class_2337(String var1, String var2) {
      this.method_10697(var1);
      this.method_10695(var2);
   }

   public class_2337(class_2337 var1) {
      super(var1);
      this.method_10697(var1.method_10694());
      this.method_10695(var1.method_10696());
      this.method_10692(var1.method_10691());
   }

   public class_2337 method_10693() {
      return new class_2337(this);
   }

   @Override
   public void method_29070(StringBuilder var1) {
      var1.append(this.field_11666);
      super.method_29070(var1);
   }

   public String method_10694() {
      return this.field_11667;
   }

   public String method_10696() {
      return this.field_11668;
   }

   public String method_10691() {
      return this.field_11666;
   }

   public void method_10697(String var1) {
      this.field_11667 = var1;
   }

   public void method_10695(String var1) {
      this.field_11668 = var1;
   }

   public void method_10692(String var1) {
      this.field_11666 = var1;
   }

   @Override
   public String toString() {
      return "ScoreComponent(name=" + this.method_10694() + ", objective=" + this.method_10696() + ", value=" + this.method_10691() + ")";
   }

   public class_2337(String var1, String var2, String var3) {
      this.field_11667 = var1;
      this.field_11668 = var2;
      this.field_11666 = var3;
   }
}
