package remapped;

public class class_1835 implements class_6224 {
   public class_1835(class_4144 var1, int[] var2, Runnable var3) {
      this.field_9299 = var1;
      this.field_9298 = var2;
      this.field_9296 = var3;
   }

   @Override
   public void method_28452(Object... var1) {
      class_6586.method_30085().fine("pre-pause writing complete");
      if (--this.field_9298[0] == 0) {
         this.field_9296.run();
      }
   }
}
