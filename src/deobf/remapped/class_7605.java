package remapped;

import java.io.InputStream;

public final class class_7605 implements Runnable {
   private static String[] field_38721;
   private final InputStream field_38720;

   public class_7605(class_1204 var1, InputStream var2) {
      this.field_38722 = var1;
      this.field_38720 = var2;
   }

   @Override
   public void run() {
      int var3 = 0;
      byte[] var4 = new byte[16384];

      try {
         while ((var3 = this.field_38720.read(var4)) != -1 && !Thread.interrupted()) {
            if (var3 > 0) {
               class_1204.method_5329(this.field_38722).write(var4, 0, var3);
               class_1204.method_5334(this.field_38722, class_1204.method_5331(this.field_38722) + var3);
            } else {
               Thread.sleep(20L);
            }
         }
      } catch (Exception var6) {
         var6.printStackTrace();
      }

      if (!Thread.interrupted()) {
         class_1204.method_5330(this.field_38722, true);
         if (class_1204.method_5335(this.field_38722) != null && class_1204.method_5329(this.field_38722) != null) {
            class_1204.method_5335(this.field_38722)
               .method_27300(class_1204.method_5329(this.field_38722).method_39488(), 0, class_1204.method_5331(this.field_38722));
         }
      }
   }
}
