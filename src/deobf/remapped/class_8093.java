package remapped;

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

public class class_8093 implements class_760 {
   public SSLContext field_41448;
   public ExecutorService field_41449;

   public class_8093(SSLContext var1) {
      this(var1, Executors.newSingleThreadScheduledExecutor());
   }

   public class_8093(SSLContext var1, ExecutorService var2) {
      if (var1 != null && var2 != null) {
         this.field_41448 = var1;
         this.field_41449 = var2;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @Override
   public ByteChannel method_3436(SocketChannel var1, SelectionKey var2) throws IOException {
      SSLEngine var5 = this.field_41448.createSSLEngine();
      ArrayList var6 = new ArrayList<String>(Arrays.asList(var5.getEnabledCipherSuites()));
      var6.remove("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
      var5.setEnabledCipherSuites(var6.<String>toArray(new String[var6.size()]));
      var5.setUseClientMode(false);
      return new class_5249(var1, var5, this.field_41449, var2);
   }

   @Override
   public class_5913 method_3435(class_7674 var1, class_7212 var2) {
      return new class_5913(var1, var2);
   }

   @Override
   public class_5913 method_3434(class_7674 var1, List<class_7212> var2) {
      return new class_5913(var1, var2);
   }

   @Override
   public void method_3433() {
      this.field_41449.shutdown();
   }
}
