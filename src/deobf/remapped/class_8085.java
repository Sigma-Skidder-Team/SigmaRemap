package remapped;

public abstract class class_8085 extends class_9446 {
   private boolean field_41388 = true;

   public boolean method_36716() {
      return this.field_41388;
   }

   public void method_36717(boolean var1) {
      this.field_41388 = var1;
   }

   @Override
   public void method_43687(class_8743 var1) {
      var1.method_40140().method_43364(!this.method_36716() ? 1001 : 1000, var1.method_40142(), 0);
   }
}
