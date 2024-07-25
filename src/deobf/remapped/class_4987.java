package remapped;

public class class_4987 implements Runnable {
   private class_4987(class_8264 var1) {
      this.field_25826 = var1;
   }

   @Override
   public void run() {
      if (class_8264.method_38100(this.field_25826)) {
         this.method_22951();
      }
   }

   private void method_22951() {
      try {
         class_176 var3 = class_176.method_777();
         class_8264.method_38093(this.field_25826, var3.method_773());
         class_8264.method_38088(this.field_25826).put(class_2845.field_13950, true);
      } catch (Exception var4) {
         class_8264.method_38092().error("Couldn't get pending invite count", var4);
      }
   }
}
