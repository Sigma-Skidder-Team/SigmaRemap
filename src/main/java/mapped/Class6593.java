package mapped;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;

public class Class6593 implements Class6590 {
   public SSLContext field29016;
   public ExecutorService field29017;

   public Class6593(SSLContext var1) {
      this(var1, Executors.newSingleThreadScheduledExecutor());
   }

   public Class6593(SSLContext var1, ExecutorService var2) {
      if (var1 != null && var2 != null) {
         this.field29016 = var1;
         this.field29017 = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @Override
   public ByteChannel method19993(SocketChannel var1, SelectionKey var2) throws IOException {
      SSLEngine var5 = this.field29016.createSSLEngine();
      List<String> var6 = new ArrayList<>(Arrays.asList(var5.getEnabledCipherSuites()));
      var6.remove("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
      var5.setEnabledCipherSuites(var6.toArray(new String[var6.size()]));
      var5.setUseClientMode(false);
      return new Class1790(var1, var5, this.field29017, var2);
   }

   @Override
   public Class346 method19996(Class342 var1, Class8844 var2) {
      return new Class346(var1, var2);
   }

   @Override
   public Class345 method19995(Class342 var1, List<Class8844> var2) {
      return new Class346(var1, var2);
   }

   @Override
   public Class346 method19992(Class342 var1, List<Class8844> var2) {
      return new Class346(var1, var2);
   }

   @Override
   public void method19994() {
      this.field29017.shutdown();
   }
}
