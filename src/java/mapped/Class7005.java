package mapped;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public final class Class7005 extends Class7006 {
   private static String[] field30286;
   private final Map<X500Principal, Set<X509Certificate>> field30287 = new LinkedHashMap<X500Principal, Set<X509Certificate>>();

   public Class7005(X509Certificate... var1) {
      for (X509Certificate var7 : var1) {
         X500Principal var8 = var7.getSubjectX500Principal();
         Set<X509Certificate> var9 = this.field30287.get(var8);
         if (var9 == null) {
            var9 = new LinkedHashSet<>(1);
            this.field30287.put(var8, var9);
         }

         var9.add(var7);
      }
   }

   @Override
   public X509Certificate method21720(X509Certificate var1) {
      X500Principal var4 = var1.getIssuerX500Principal();
      Set<X509Certificate> var5 = this.field30287.get(var4);
      if (var5 == null) {
         return null;
      } else {
         for (X509Certificate var7 : var5) {
            PublicKey var8 = var7.getPublicKey();

            try {
               var1.verify(var8);
               return var7;
            } catch (Exception var10) {
            }
         }

         return null;
      }
   }

   @Override
   public boolean equals(Object var1) {
      return var1 == this ? true : var1 instanceof Class7005 && ((Class7005)var1).field30287.equals(this.field30287);
   }

   @Override
   public int hashCode() {
      return this.field30287.hashCode();
   }
}
