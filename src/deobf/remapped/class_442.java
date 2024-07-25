package remapped;

import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

public final class class_442 {
   private final class_5010 field_1852;
   private final class_7463 field_1851;
   private final List<Certificate> field_1849;
   private final List<Certificate> field_1853;

   private class_442(class_5010 var1, class_7463 var2, List<Certificate> var3, List<Certificate> var4) {
      this.field_1852 = var1;
      this.field_1851 = var2;
      this.field_1849 = var3;
      this.field_1853 = var4;
   }

   public static class_442 method_2139(SSLSession var0) {
      String var3 = var0.getCipherSuite();
      if (var3 == null) {
         throw new IllegalStateException("cipherSuite == null");
      } else {
         class_7463 var4 = class_7463.method_33966(var3);
         String var5 = var0.getProtocol();
         if (var5 == null) {
            throw new IllegalStateException("tlsVersion == null");
         } else {
            class_5010 var6 = class_5010.method_23055(var5);

            Certificate[] var7;
            try {
               var7 = var0.getPeerCertificates();
            } catch (SSLPeerUnverifiedException var11) {
               var7 = null;
            }

            List var8 = var7 != null ? class_8515.<Certificate>method_39211(var7) : Collections.emptyList();
            Certificate[] var9 = var0.getLocalCertificates();
            List var10 = var9 != null ? class_8515.<Certificate>method_39211(var9) : Collections.emptyList();
            return new class_442(var6, var4, var8, var10);
         }
      }
   }

   public static class_442 method_2140(class_5010 var0, class_7463 var1, List<Certificate> var2, List<Certificate> var3) {
      if (var0 != null) {
         if (var1 != null) {
            return new class_442(var0, var1, class_8515.<Certificate>method_39210(var2), class_8515.<Certificate>method_39210(var3));
         } else {
            throw new NullPointerException("cipherSuite == null");
         }
      } else {
         throw new NullPointerException("tlsVersion == null");
      }
   }

   public class_5010 method_2146() {
      return this.field_1852;
   }

   public class_7463 method_2141() {
      return this.field_1851;
   }

   public List<Certificate> method_2145() {
      return this.field_1849;
   }

   @Nullable
   public Principal method_2147() {
      return this.field_1849.isEmpty() ? null : ((X509Certificate)this.field_1849.get(0)).getSubjectX500Principal();
   }

   public List<Certificate> method_2144() {
      return this.field_1853;
   }

   @Nullable
   public Principal method_2143() {
      return this.field_1853.isEmpty() ? null : ((X509Certificate)this.field_1853.get(0)).getSubjectX500Principal();
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof class_442)) {
         return false;
      } else {
         class_442 var4 = (class_442)var1;
         return this.field_1852.equals(var4.field_1852)
            && this.field_1851.equals(var4.field_1851)
            && this.field_1849.equals(var4.field_1849)
            && this.field_1853.equals(var4.field_1853);
      }
   }

   @Override
   public int hashCode() {
      int var3 = 17;
      var3 = 31 * var3 + this.field_1852.hashCode();
      var3 = 31 * var3 + this.field_1851.hashCode();
      var3 = 31 * var3 + this.field_1849.hashCode();
      return 31 * var3 + this.field_1853.hashCode();
   }
}
