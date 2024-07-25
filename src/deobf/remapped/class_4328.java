package remapped;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

public final class class_4328 {
   private final List<class_5083> field_21050;
   private int field_21054 = 0;
   private boolean field_21053;
   private boolean field_21051;

   public class_4328(List<class_5083> var1) {
      this.field_21050 = var1;
   }

   public class_5083 method_20149(SSLSocket var1) throws IOException {
      class_5083 var4 = null;
      int var5 = this.field_21054;

      for (int var6 = this.field_21050.size(); var5 < var6; var5++) {
         class_5083 var7 = this.field_21050.get(var5);
         if (var7.method_23362(var1)) {
            var4 = var7;
            this.field_21054 = var5 + 1;
            break;
         }
      }

      if (var4 != null) {
         this.field_21053 = this.method_20150(var1);
         class_1850.field_9389.method_8178(var4, var1, this.field_21051);
         return var4;
      } else {
         throw new UnknownServiceException(
            "Unable to find acceptable protocols. isFallback="
               + this.field_21051
               + ", modes="
               + this.field_21050
               + ", supported protocols="
               + Arrays.toString((Object[])var1.getEnabledProtocols())
         );
      }
   }

   public boolean method_20148(IOException var1) {
      this.field_21051 = true;
      if (!this.field_21053) {
         return false;
      } else if (!(var1 instanceof ProtocolException)) {
         if (var1 instanceof InterruptedIOException) {
            return false;
         } else if (var1 instanceof SSLHandshakeException && var1.getCause() instanceof CertificateException) {
            return false;
         } else {
            return var1 instanceof SSLPeerUnverifiedException ? false : var1 instanceof SSLHandshakeException || var1 instanceof SSLProtocolException;
         }
      } else {
         return false;
      }
   }

   private boolean method_20150(SSLSocket var1) {
      for (int var4 = this.field_21054; var4 < this.field_21050.size(); var4++) {
         if (this.field_21050.get(var4).method_23362(var1)) {
            return true;
         }
      }

      return false;
   }
}
