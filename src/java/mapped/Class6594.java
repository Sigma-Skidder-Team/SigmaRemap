package mapped;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

public class Class6594 extends Class6593 {
   private static String[] field29018;
   private final String[] field29019;
   private final String[] field29020;

   public Class6594(SSLContext var1, String[] var2, String[] var3) {
      this(var1, Executors.newSingleThreadScheduledExecutor(), var2, var3);
   }

   public Class6594(SSLContext var1, ExecutorService var2, String[] var3, String[] var4) {
      super(var1, var2);
      this.field29019 = var3;
      this.field29020 = var4;
   }

   @Override
   public ByteChannel method19993(SocketChannel var1, SelectionKey var2) throws IOException {
      SSLEngine var5 = this.field29016.createSSLEngine();
      if (this.field29019 != null) {
         var5.setEnabledProtocols(this.field29019);
      }

      if (this.field29020 != null) {
         var5.setEnabledCipherSuites(this.field29020);
      }

      var5.setUseClientMode(false);
      return new Class1790(var1, var5, this.field29017, var2);
   }
}
