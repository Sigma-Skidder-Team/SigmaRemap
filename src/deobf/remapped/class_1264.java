package remapped;

import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public final class class_1264 extends class_1950 {
   private static String[] field_6958;
   private final Map<X500Principal, Set<X509Certificate>> field_6957 = new LinkedHashMap<X500Principal, Set<X509Certificate>>();

   public class_1264(X509Certificate... var1) {
      for (X509Certificate var7 : var1) {
         X500Principal var8 = var7.getSubjectX500Principal();
         Object var9 = this.field_6957.get(var8);
         if (var9 == null) {
            var9 = new LinkedHashSet(1);
            this.field_6957.put(var8, (Set<X509Certificate>)var9);
         }

         var9.add(var7);
      }
   }

   @Override
   public X509Certificate method_9010(X509Certificate var1) {
      X500Principal var4 = var1.getIssuerX500Principal();
      Set var5 = this.field_6957.get(var4);
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
      return var1 == this ? true : var1 instanceof class_1264 && ((class_1264)var1).field_6957.equals(this.field_6957);
   }

   @Override
   public int hashCode() {
      return this.field_6957.hashCode();
   }
}
