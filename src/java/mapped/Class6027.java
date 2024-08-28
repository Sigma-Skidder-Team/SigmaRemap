package mapped;

import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class Class6027 {
   private final Class2034 field26221;
   private final Class9204 field26222;
   private final List<Certificate> field26223;
   private final List<Certificate> field26224;

   private Class6027(Class2034 var1, Class9204 var2, List<Certificate> var3, List<Certificate> var4) {
      this.field26221 = var1;
      this.field26222 = var2;
      this.field26223 = var3;
      this.field26224 = var4;
   }

   public static Class6027 method18657(SSLSession var0) {
      String var3 = var0.getCipherSuite();
      if (var3 == null) {
         throw new IllegalStateException("cipherSuite == null");
      } else {
         Class9204 var4 = Class9204.method34491(var3);
         String var5 = var0.getProtocol();
         if (var5 == null) {
            throw new IllegalStateException("tlsVersion == null");
         } else {
            Class2034 var6 = Class2034.method8676(var5);

            Certificate[] var7;
            try {
               var7 = var0.getPeerCertificates();
            } catch (SSLPeerUnverifiedException var11) {
               var7 = null;
            }

            List var8 = var7 != null ? Class9474.<Certificate>method36541(var7) : Collections.emptyList();
            Certificate[] var9 = var0.getLocalCertificates();
            List var10 = var9 != null ? Class9474.<Certificate>method36541(var9) : Collections.emptyList();
            return new Class6027(var6, var4, var8, var10);
         }
      }
   }

   public static Class6027 method18658(Class2034 var0, Class9204 var1, List<Certificate> var2, List<Certificate> var3) {
      if (var0 != null) {
         if (var1 != null) {
            return new Class6027(var0, var1, Class9474.<Certificate>method36540(var2), Class9474.<Certificate>method36540(var3));
         } else {
            throw new NullPointerException("cipherSuite == null");
         }
      } else {
         throw new NullPointerException("tlsVersion == null");
      }
   }

   public Class2034 method18659() {
      return this.field26221;
   }

   public Class9204 method18660() {
      return this.field26222;
   }

   public List<Certificate> method18661() {
      return this.field26223;
   }

   @Nullable
   public Principal method18662() {
      return this.field26223.isEmpty() ? null : ((X509Certificate)this.field26223.get(0)).getSubjectX500Principal();
   }

   public List<Certificate> method18663() {
      return this.field26224;
   }

   @Nullable
   public Principal method18664() {
      return this.field26224.isEmpty() ? null : ((X509Certificate)this.field26224.get(0)).getSubjectX500Principal();
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof Class6027)) {
         return false;
      } else {
         Class6027 var4 = (Class6027)var1;
         return this.field26221.equals(var4.field26221)
            && this.field26222.equals(var4.field26222)
            && this.field26223.equals(var4.field26223)
            && this.field26224.equals(var4.field26224);
      }
   }

   @Override
   public int hashCode() {
      int var3 = 17;
      var3 = 31 * var3 + this.field26221.hashCode();
      var3 = 31 * var3 + this.field26222.hashCode();
      var3 = 31 * var3 + this.field26223.hashCode();
      return 31 * var3 + this.field26224.hashCode();
   }
}
