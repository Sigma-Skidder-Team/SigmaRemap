package remapped;

public class class_2814 extends Thread {
   public class_2814(class_4502 var1, String var2, int var3) {
      super(var2);
      this.field_13822 = var1;
      this.field_13823 = var3;
   }

   @Override
   public void run() {
      try {
         class_176 var3 = class_176.method_777();
         var3.method_768(class_131.method_403(class_4502.method_20917(this.field_13822).method_41183().get(this.field_13823)).field_14264);
         class_4502.method_20913(this.field_13822).execute(() -> class_4502.method_20919(this.field_13822, var1));
      } catch (class_3900 var4) {
         class_4502.method_20926().error("Couldn't reject invite");
      }
   }
}
