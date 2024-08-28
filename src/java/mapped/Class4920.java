package mapped;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

public final class Class4920 extends Class4918 {
   public final Socket field22822;

   public Class4920(Socket var1) {
      this.field22822 = var1;
   }

   @Override
   public IOException method15229(IOException var1) {
      SocketTimeoutException var4 = new SocketTimeoutException("timeout");
      if (var1 != null) {
         var4.initCause(var1);
      }

      return var4;
   }

   @Override
   public void method15224() {
      try {
         this.field22822.close();
      } catch (Exception var4) {
         Class7001.field30279.log(Level.WARNING, "Failed to close timed out socket " + this.field22822, (Throwable)var4);
      } catch (AssertionError var5) {
         if (!Class7001.method21711(var5)) {
            throw var5;
         }

         Class7001.field30279.log(Level.WARNING, "Failed to close timed out socket " + this.field22822, (Throwable)var5);
      }
   }
}
