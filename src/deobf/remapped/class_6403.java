package remapped;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

public final class class_6403 extends class_1950 {
   private static String[] field_32686;
   private final X509TrustManager field_32685;
   private final Method field_32687;

   public class_6403(X509TrustManager var1, Method var2) {
      this.field_32687 = var2;
      this.field_32685 = var1;
   }

   @Override
   public X509Certificate method_9010(X509Certificate var1) {
      try {
         TrustAnchor var4 = (TrustAnchor)this.field_32687.invoke(this.field_32685, var1);
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
         if (!(var1 instanceof class_6403)) {
            return false;
         } else {
            class_6403 var4 = (class_6403)var1;
            return this.field_32685.equals(var4.field_32685) && this.field_32687.equals(var4.field_32687);
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      return this.field_32685.hashCode() + 31 * this.field_32687.hashCode();
   }
}
