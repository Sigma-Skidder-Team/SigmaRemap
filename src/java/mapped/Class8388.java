package mapped;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class Class8388 {
   public static final Class8388 field35968 = new Class6389().method19421();
   private final Set<Class9723> field35969;
   private final Class7658 field35970;

   public Class8388(Set<Class9723> var1, Class7658 var2) {
      this.field35969 = var1;
      this.field35970 = var2;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 == this
         ? true
         : var1 instanceof Class8388
            && Class9474.method36534(this.field35970, ((Class8388)var1).field35970)
            && this.field35969.equals(((Class8388)var1).field35969);
   }

   @Override
   public int hashCode() {
      int var3 = this.field35970 == null ? 0 : this.field35970.hashCode();
      return 31 * var3 + this.field35969.hashCode();
   }

   public void method29385(String var1, List<Certificate> var2) throws SSLPeerUnverifiedException {
      List var5 = this.method29387(var1);
      if (!var5.isEmpty()) {
         if (this.field35970 != null) {
            var2 = this.field35970.method25176(var2, var1);
         }

         int var6 = 0;

         for (int var7 = var2.size(); var6 < var7; var6++) {
            X509Certificate var8 = (X509Certificate)var2.get(var6);
            Class2003 var9 = null;
            Class2003 var10 = null;
            int var11 = 0;

            for (int var12 = var5.size(); var11 < var12; var11++) {
               Class9723 var13 = (Class9723)var5.get(var11);
               if (!var13.field45419.equals("sha256/")) {
                  if (!var13.field45419.equals("sha1/")) {
                     throw new AssertionError();
                  }

                  if (var9 == null) {
                     var9 = method29390(var8);
                  }

                  if (var13.field45420.equals(var9)) {
                     return;
                  }
               } else {
                  if (var10 == null) {
                     var10 = method29391(var8);
                  }

                  if (var13.field45420.equals(var10)) {
                     return;
                  }
               }
            }
         }

         StringBuilder var14 = new StringBuilder().append("Certificate pinning failure!").append("\n  Peer certificate chain:");
         int var15 = 0;

         for (int var17 = var2.size(); var15 < var17; var15++) {
            X509Certificate var19 = (X509Certificate)var2.get(var15);
            var14.append("\n    ").append(method29389(var19)).append(": ").append(var19.getSubjectDN().getName());
         }

         var14.append("\n  Pinned certificates for ").append(var1).append(":");
         var15 = 0;

         for (int var18 = var5.size(); var15 < var18; var15++) {
            Class9723 var20 = (Class9723)var5.get(var15);
            var14.append("\n    ").append(var20);
         }

         throw new SSLPeerUnverifiedException(var14.toString());
      }
   }

   /** @deprecated */
   public void method29386(String var1, Certificate... var2) throws SSLPeerUnverifiedException {
      this.method29385(var1, Arrays.<Certificate>asList(var2));
   }

   public List<Class9723> method29387(String var1) {
      List<Class9723> var4 = Collections.emptyList();

      for (Class9723 var6 : this.field35969) {
         if (var6.method38082(var1)) {
            if (var4.isEmpty()) {
               var4 = new ArrayList<>();
            }

            var4.add(var6);
         }
      }

      return var4;
   }

   public Class8388 method29388(Class7658 var1) {
      return !Class9474.method36534(this.field35970, var1) ? new Class8388(this.field35969, var1) : this;
   }

   public static String method29389(Certificate var0) {
      if (var0 instanceof X509Certificate) {
         return "sha256/" + method29391((X509Certificate)var0).method8437();
      } else {
         throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
      }
   }

   public static Class2003 method29390(X509Certificate var0) {
      return Class2003.method8430(var0.getPublicKey().getEncoded()).method8439();
   }

   public static Class2003 method29391(X509Certificate var0) {
      return Class2003.method8430(var0.getPublicKey().getEncoded()).method8440();
   }
}
