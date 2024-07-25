package remapped;

import java.io.IOException;
import java.net.SocketTimeoutException;

public class class_5136 extends class_1353 {
   public class_5136(class_9388 var1) {
      this.field_26477 = var1;
   }

   @Override
   public void method_6242() {
      this.field_26477.method_43426(class_1692.field_8762);
   }

   @Override
   public IOException method_6246(IOException var1) {
      SocketTimeoutException var4 = new SocketTimeoutException("timeout");
      if (var1 != null) {
         var4.initCause(var1);
      }

      return var4;
   }

   public void method_23549() throws IOException {
      if (this.method_6249()) {
         throw this.method_6246(null);
      }
   }
}
