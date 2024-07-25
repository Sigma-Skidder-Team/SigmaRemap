package remapped;

import java.util.List;

public class class_3302 extends Thread {
   public class_3302(class_4908 var1, String var2) {
      super(var2);
      this.field_16343 = var1;
   }

   @Override
   public void run() {
      class_176 var3 = class_176.method_777();

      try {
         List var4 = var3.method_794(class_4908.method_22475(this.field_16343).field_39016).field_8642;
         class_4908.method_22493(this.field_16343).execute(() -> {
            class_4908.method_22486(this.field_16343, var4);
            class_4908.method_22474(this.field_16343, class_4908.method_22487(this.field_16343).isEmpty());
            class_4908.method_22468(this.field_16343).method_33486();

            for (class_8960 var5x : class_4908.method_22487(this.field_16343)) {
               class_4908.method_22468(this.field_16343).method_12809(var5x);
            }

            class_4908.method_22494(this.field_16343);
         });
      } catch (class_3900 var5) {
         class_4908.method_22490().error("Couldn't request backups", var5);
      }
   }
}
