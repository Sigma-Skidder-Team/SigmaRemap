package remapped;

public class class_9800 implements Runnable {
   private class_9800(class_8264 var1) {
      this.field_49698 = var1;
   }

   @Override
   public void run() {
      if (class_8264.method_38100(this.field_49698)) {
         this.method_45210();
      }
   }

   private void method_45210() {
      try {
         class_176 var3 = class_176.method_777();
         class_8264.method_38097(this.field_49698, var3.method_766());
         class_8264.method_38088(this.field_49698).put(class_2845.field_13952, true);
      } catch (Exception var4) {
         class_8264.method_38092().error("Couldn't get trial availability", var4);
      }
   }
}
