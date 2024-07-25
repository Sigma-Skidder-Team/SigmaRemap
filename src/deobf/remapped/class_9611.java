package remapped;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

public final class class_9611 extends class_1353 {
   public class_9611(Socket var1) {
      this.field_48977 = var1;
   }

   @Override
   public IOException method_6246(IOException var1) {
      SocketTimeoutException var4 = new SocketTimeoutException("timeout");
      if (var1 != null) {
         var4.initCause(var1);
      }

      return var4;
   }

   @Override
   public void method_6242() {
      try {
         this.field_48977.close();
      } catch (Exception var4) {
         class_1259.field_6941.log(Level.WARNING, "Failed to close timed out socket " + this.field_48977, (Throwable)var4);
      } catch (AssertionError var5) {
         if (!class_1259.method_5664(var5)) {
            throw var5;
         }

         class_1259.field_6941.log(Level.WARNING, "Failed to close timed out socket " + this.field_48977, (Throwable)var5);
      }
   }
}
