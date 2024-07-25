package remapped;

public class class_2859 extends Thread {
   public class_2859(class_7039 var1, String var2) {
      super(var2);
      this.field_14005 = var1;
   }

   @Override
   public void run() {
      try {
         class_7675 var3 = class_7039.method_32268(this.field_14005, class_7039.method_32320(this.field_14005));
         if (var3 != null) {
            class_176 var4 = class_176.method_777();
            var4.method_807(var3.field_39016);
            class_7039.method_32278(this.field_14005).execute(() -> class_7039.method_32343(this.field_14005, var3));
         }
      } catch (class_3900 var5) {
         class_7039.method_32312().error("Couldn't configure world");
         class_7039.method_32254(this.field_14005).execute(() -> class_7039.method_32226(this.field_14005).method_8609(new class_9306(var5, this.field_14005)));
      }
   }
}
