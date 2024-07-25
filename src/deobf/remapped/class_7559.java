package remapped;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class class_7559 extends class_8290 {
   private final Object field_38521;
   private final Method field_38522;

   public class_7559(Object var1, Method var2) {
      this.field_38521 = var1;
      this.field_38522 = var2;
   }

   @Override
   public List<Certificate> method_38246(List<Certificate> var1, String var2) throws SSLPeerUnverifiedException {
      try {
         X509Certificate[] var5 = var1.<X509Certificate>toArray(new X509Certificate[var1.size()]);
         return (List<Certificate>)this.field_38522.invoke(this.field_38521, var5, "RSA", var2);
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
      return var1 instanceof class_7559;
   }

   @Override
   public int hashCode() {
      return 0;
   }
}
