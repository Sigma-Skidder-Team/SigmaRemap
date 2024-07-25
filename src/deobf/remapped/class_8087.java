package remapped;

public abstract class class_8087 {
   private final class_404 field_41422;
   private final class_404 field_41421;

   public class_8087(class_404 var1, class_404 var2) {
      this.field_41422 = var1;
      this.field_41421 = var2;
   }

   @Override
   public String toString() {
      return "<" + this.getClass().getName() + "(" + this.method_36727() + ")>";
   }

   public class_404 method_36725() {
      return this.field_41422;
   }

   public class_404 method_36728() {
      return this.field_41421;
   }

   public String method_36727() {
      return "";
   }

   public abstract boolean method_36724(class_3467 var1);

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof class_8087) ? false : this.toString().equals(var1.toString());
   }

   @Override
   public int hashCode() {
      return this.toString().hashCode();
   }
}
