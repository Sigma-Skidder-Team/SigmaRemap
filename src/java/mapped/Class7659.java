package mapped;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class Class7659 extends Class7658 {
   private final Object field32854;
   private final Method field32855;

   public Class7659(Object var1, Method var2) {
      this.field32854 = var1;
      this.field32855 = var2;
   }

   @Override
   public List<Certificate> method25176(List<Certificate> var1, String var2) throws SSLPeerUnverifiedException {
      try {
         X509Certificate[] var5 = var1.<X509Certificate>toArray(new X509Certificate[var1.size()]);
         return (List<Certificate>)this.field32855.invoke(this.field32854, var5, "RSA", var2);
      } catch (InvocationTargetException var7) {
         SSLPeerUnverifiedException var6 = new SSLPeerUnverifiedException(var7.getMessage());
         var6.initCause(var7);
         throw var6;
      } catch (IllegalAccessException var8) {
         throw new AssertionError(var8);
      }
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof Class7659;
   }

   @Override
   public int hashCode() {
      return 0;
   }
}
