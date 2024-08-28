package mapped;

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

public final class Class8349 {
   private final List<Class8574> field35876;
   private int field35877 = 0;
   private boolean field35878;
   private boolean field35879;

   public Class8349(List<Class8574> var1) {
      this.field35876 = var1;
   }

   public Class8574 method29260(SSLSocket var1) throws IOException {
      Class8574 var4 = null;
      int var5 = this.field35877;

      for (int var6 = this.field35876.size(); var5 < var6; var5++) {
         Class8574 var7 = this.field35876.get(var5);
         if (var7.method30644(var1)) {
            var4 = var7;
            this.field35877 = var5 + 1;
            break;
         }
      }

      if (var4 != null) {
         this.field35878 = this.method29262(var1);
         Class6605.field29047.method20024(var4, var1, this.field35879);
         return var4;
      } else {
         throw new UnknownServiceException(
            "Unable to find acceptable protocols. isFallback="
               + this.field35879
               + ", modes="
               + this.field35876
               + ", supported protocols="
               + Arrays.toString((Object[])var1.getEnabledProtocols())
         );
      }
   }

   public boolean method29261(IOException var1) {
      this.field35879 = true;
      if (!this.field35878) {
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

   private boolean method29262(SSLSocket var1) {
      for (int var4 = this.field35877; var4 < this.field35876.size(); var4++) {
         if (this.field35876.get(var4).method30644(var1)) {
            return true;
         }
      }

      return false;
   }
}
