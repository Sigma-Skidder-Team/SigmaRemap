package remapped;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

public class class_6796 extends class_8093 {
   private static String[] field_35033;
   private final String[] field_35031;
   private final String[] field_35032;

   public class_6796(SSLContext var1, String[] var2, String[] var3) {
      this(var1, Executors.newSingleThreadScheduledExecutor(), var2, var3);
   }

   public class_6796(SSLContext var1, ExecutorService var2, String[] var3, String[] var4) {
      super(var1, var2);
      this.field_35031 = var3;
      this.field_35032 = var4;
   }

   @Override
   public ByteChannel method_3436(SocketChannel var1, SelectionKey var2) throws IOException {
      SSLEngine var5 = this.field_41448.createSSLEngine();
      if (this.field_35031 != null) {
         var5.setEnabledProtocols(this.field_35031);
      }

      if (this.field_35032 != null) {
         var5.setEnabledCipherSuites(this.field_35032);
      }

      var5.setUseClientMode(false);
      return new class_5249(var1, var5, this.field_41449, var2);
   }
}
