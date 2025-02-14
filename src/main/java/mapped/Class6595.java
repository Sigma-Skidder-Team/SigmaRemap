package mapped;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;

public class Class6595 extends Class6593 {
   private static String[] field29021;
   private final SSLParameters field29022;

   public Class6595(SSLContext var1, SSLParameters var2) {
      this(var1, Executors.newSingleThreadScheduledExecutor(), var2);
   }

   public Class6595(SSLContext var1, ExecutorService var2, SSLParameters var3) {
      super(var1, var2);
      if (var3 != null) {
         this.field29022 = var3;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @Override
   public ByteChannel method19993(SocketChannel var1, SelectionKey var2) throws IOException {
      SSLEngine var5 = this.field29016.createSSLEngine();
      var5.setUseClientMode(false);
      var5.setSSLParameters(this.field29022);
      return new Class1790(var1, var5, this.field29017, var2);
   }
}
