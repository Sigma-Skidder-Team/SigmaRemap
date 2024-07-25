package remapped;

public class class_3640 extends Thread {
   public class_3640(class_5824 var1, String var2) {
      super(var2);
      this.field_17760 = var1;
   }

   @Override
   public void run() {
      class_176 var3 = class_176.method_777();

      try {
         class_480 var4 = var3.method_796(1, 10, class_8840.field_45205);
         class_480 var5 = var3.method_796(1, 10, class_8840.field_45210);
         class_480 var6 = var3.method_796(1, 10, class_8840.field_45211);
         class_480 var7 = var3.method_796(1, 10, class_8840.field_45208);
         class_5824.method_26354(this.field_17760).execute(() -> {
            class_5824.method_26366(this.field_17760, var4);
            class_5824.method_26357(this.field_17760, var5);
            class_5824.method_26358(this.field_17760, var6);
            class_5824.method_26365(this.field_17760, var7);
         });
      } catch (class_3900 var8) {
         class_5824.method_26356().error("Couldn't fetch templates in reset world", var8);
      }
   }
}
