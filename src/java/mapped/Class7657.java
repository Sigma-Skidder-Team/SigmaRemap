package mapped;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class Class7657 extends Class7658 {
   private static final int field32852 = 9;
   private final Class7006 field32853;

   public Class7657(Class7006 var1) {
      this.field32853 = var1;
   }

   @Override
   public List<Certificate> method25176(List<Certificate> var1, String var2) throws SSLPeerUnverifiedException {
      ArrayDeque var5 = new ArrayDeque(var1);
      ArrayList var6 = new ArrayList();
      var6.add(var5.removeFirst());
      boolean var7 = false;

      for (int var8 = 0; var8 < 9; var8++) {
         X509Certificate var9 = (X509Certificate)var6.get(var6.size() - 1);
         X509Certificate var10 = this.field32853.method21720(var9);
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
            } while (!this.method25177(var9, var12));

            var11.remove();
            var6.add(var12);
         } else {
            if (var6.size() > 1 || !var9.equals(var10)) {
               var6.add(var10);
            }

            if (this.method25177(var10, var10)) {
               return var6;
            }

            var7 = true;
         }
      }

      throw new SSLPeerUnverifiedException("Certificate chain too long: " + var6);
   }

   private boolean method25177(X509Certificate var1, X509Certificate var2) {
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
      return this.field32853.hashCode();
   }

   @Override
   public boolean equals(Object var1) {
      return var1 == this ? true : var1 instanceof Class7657 && ((Class7657)var1).field32853.equals(this.field32853);
   }
}
