package remapped;

public class class_5318 implements Cloneable {
   private class_790 field_27125 = class_790.field_4234;
   private class_814 field_27124 = new class_814();

   @Override
   public Object clone() {
      try {
         return super.clone();
      } catch (CloneNotSupportedException var4) {
         throw new InternalError(this + ": " + var4);
      }
   }

   public void method_24259(class_790 var1) {
      if (var1 != null) {
         this.field_27125 = var1;
      } else {
         throw new NullPointerException("out");
      }
   }

   public class_790 method_24258() {
      return this.field_27125;
   }

   public class_814 method_24261() {
      return this.field_27124;
   }
}
