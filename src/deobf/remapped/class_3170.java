package remapped;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;

public class class_3170 extends class_8093 {
   private static String[] field_15857;
   private final SSLParameters field_15856;

   public class_3170(SSLContext var1, SSLParameters var2) {
      this(var1, Executors.newSingleThreadScheduledExecutor(), var2);
   }

   public class_3170(SSLContext var1, ExecutorService var2, SSLParameters var3) {
      super(var1, var2);
      if (var3 != null) {
         this.field_15856 = var3;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @Override
   public ByteChannel method_3436(SocketChannel var1, SelectionKey var2) throws IOException {
      SSLEngine var5 = this.field_41448.createSSLEngine();
      var5.setUseClientMode(false);
      var5.setSSLParameters(this.field_15856);
      return new class_5249(var1, var5, this.field_41449, var2);
   }
}
