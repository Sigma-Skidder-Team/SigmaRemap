package mapped;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public final class Class7007 extends Class7006 {
   private static String[] field30288;
   private final X509TrustManager field30289;
   private final Method field30290;

   public Class7007(X509TrustManager var1, Method var2) {
      this.field30290 = var2;
      this.field30289 = var1;
   }

   @Override
   public X509Certificate method21720(X509Certificate var1) {
      try {
         TrustAnchor var4 = (TrustAnchor)this.field30290.invoke(this.field30289, var1);
         return var4 != null ? var4.getTrustedCert() : null;
      } catch (IllegalAccessException var5) {
         throw new AssertionError();
      } catch (InvocationTargetException var6) {
         return null;
      }
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 != this) {
         if (!(var1 instanceof Class7007)) {
            return false;
         } else {
            Class7007 var4 = (Class7007)var1;
            return this.field30289.equals(var4.field30289) && this.field30290.equals(var4.field30290);
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field30289.hashCode() + 31 * this.field30290.hashCode();
   }
}
