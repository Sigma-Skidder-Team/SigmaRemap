package remapped;

public class class_9004 implements class_6224 {
   public class_9004(class_4144 var1, int[] var2, Runnable var3) {
      this.field_46091 = var1;
      this.field_46088 = var2;
      this.field_46089 = var3;
   }

   @Override
   public void method_28452(Object... var1) {
      class_6586.method_30085().fine("pre-pause polling complete");
      if (--this.field_46088[0] == 0) {
         this.field_46089.run();
      }
   }
}
