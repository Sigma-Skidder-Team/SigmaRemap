package remapped;

public class class_8277 implements Runnable {
   private class_8277(class_8264 var1) {
      this.field_42447 = var1;
   }

   @Override
   public void run() {
      if (class_8264.method_38100(this.field_42447)) {
         this.method_38152();
      }
   }

   private void method_38152() {
      try {
         class_176 var3 = class_176.method_777();
         class_8264.method_38102(this.field_42447, var3.method_800());
         class_8264.method_38088(this.field_42447).put(class_2845.field_13947, true);
      } catch (Exception var4) {
         class_8264.method_38092().error("Couldn't get live stats", var4);
      }
   }
}
