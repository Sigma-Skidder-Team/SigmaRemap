package remapped;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class class_5997 extends Thread {
   public class_5997(class_4497 var1, String var2) {
      super(var2);
      this.field_30555 = var1;
   }

   @Override
   public void run() {
      BufferedReader var3 = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));

      String var4;
      try {
         while (!this.field_30555.method_1633() && this.field_30555.method_1692() && (var4 = var3.readLine()) != null) {
            this.field_30555.method_20898(var4, this.field_30555.method_1730());
         }
      } catch (IOException var6) {
         class_4497.method_20899().error("Exception handling console input", var6);
      }
   }
}
