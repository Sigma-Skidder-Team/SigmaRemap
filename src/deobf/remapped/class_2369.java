package remapped;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class class_2369 extends class_8290 {
   private static final int field_11865 = 9;
   private final class_1950 field_11867;

   public class_2369(class_1950 var1) {
      this.field_11867 = var1;
   }

   @Override
   public List<Certificate> method_38246(List<Certificate> var1, String var2) throws SSLPeerUnverifiedException {
      ArrayDeque var5 = new ArrayDeque(var1);
      ArrayList var6 = new ArrayList();
      var6.add(var5.removeFirst());
      boolean var7 = false;

      for (int var8 = 0; var8 < 9; var8++) {
         X509Certificate var9 = (X509Certificate)var6.get(var6.size() - 1);
         X509Certificate var10 = this.field_11867.method_9010(var9);
         if (var10 == null) {
            Iterator var11 = var5.iterator();

            X509Certificate var12;
            do {
               if (!var11.hasNext()) {
                  if (!var7) {
                     throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + var9);
                  }

                  return var6;
               }

               var12 = (X509Certificate)var11.next();
            } while (!this.method_10845(var9, var12));

            var11.remove();
            var6.add(var12);
         } else {
            if (var6.size() > 1 || !var9.equals(var10)) {
               var6.add(var10);
            }

            if (this.method_10845(var10, var10)) {
               return var6;
            }

            var7 = true;
         }
      }

      throw new SSLPeerUnverifiedException("Certificate chain too long: " + var6);
   }

   private boolean method_10845(X509Certificate var1, X509Certificate var2) {
      if (!var1.getIssuerDN().equals(var2.getSubjectDN())) {
         return false;
      } else {
         try {
            var1.verify(var2.getPublicKey());
            return true;
         } catch (GeneralSecurityException var6) {
            return false;
         }
      }
   }

   @Override
   public int hashCode() {
      return this.field_11867.hashCode();
   }

   @Override
   public boolean equals(Object var1) {
      return var1 == this ? true : var1 instanceof class_2369 && ((class_2369)var1).field_11867.equals(this.field_11867);
   }
}
