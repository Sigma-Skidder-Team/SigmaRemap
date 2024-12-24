package mapped;

import java.io.IOException;
import java.net.SocketTimeoutException;

public class Class4919 extends Class4918 {
   public final FramedStream field22821;

   public Class4919(FramedStream var1) {
      this.field22821 = var1;
   }

   @Override
   public void method15224() {
      this.field22821.method37989(Class2077.field13532);
   }

   @Override
   public IOException method15229(IOException var1) {
      SocketTimeoutException var4 = new SocketTimeoutException("timeout");
      if (var1 != null) {
         var4.initCause(var1);
      }

      return var4;
   }

   public void method15231() throws IOException {
      if (this.method15221()) {
         throw this.method15229(null);
      }
   }
}
