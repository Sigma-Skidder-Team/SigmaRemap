package remapped;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class class_4446 {
   public static final class_4446 field_21675 = new class_593().method_2787();
   private final Set<class_9471> field_21676;
   private final class_8290 field_21674;

   public class_4446(Set<class_9471> var1, class_8290 var2) {
      this.field_21676 = var1;
      this.field_21674 = var2;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 == this
         ? true
         : var1 instanceof class_4446
            && class_8515.method_39214(this.field_21674, ((class_4446)var1).field_21674)
            && this.field_21676.equals(((class_4446)var1).field_21676);
   }

   @Override
   public int hashCode() {
      int var3 = this.field_21674 == null ? 0 : this.field_21674.hashCode();
      return 31 * var3 + this.field_21676.hashCode();
   }

   public void method_20617(String var1, List<Certificate> var2) throws SSLPeerUnverifiedException {
      List var5 = this.method_20616(var1);
      if (!var5.isEmpty()) {
         if (this.field_21674 != null) {
            var2 = this.field_21674.method_38246(var2, var1);
         }

         int var6 = 0;

         for (int var7 = var2.size(); var6 < var7; var6++) {
            X509Certificate var8 = (X509Certificate)var2.get(var6);
            class_9091 var9 = null;
            class_9091 var10 = null;
            int var11 = 0;

            for (int var12 = var5.size(); var11 < var12; var11++) {
               class_9471 var13 = (class_9471)var5.get(var11);
               if (!var13.field_48300.equals("sha256/")) {
                  if (!var13.field_48300.equals("sha1/")) {
                     throw new AssertionError();
                  }

                  if (var9 == null) {
                     var9 = method_20621(var8);
                  }

                  if (var13.field_48299.equals(var9)) {
                     return;
                  }
               } else {
                  if (var10 == null) {
                     var10 = method_20615(var8);
                  }

                  if (var13.field_48299.equals(var10)) {
                     return;
                  }
               }
            }
         }

         StringBuilder var14 = new StringBuilder().append("Certificate pinning failure!").append("\n  Peer certificate chain:");
         int var15 = 0;

         for (int var17 = var2.size(); var15 < var17; var15++) {
            X509Certificate var19 = (X509Certificate)var2.get(var15);
            var14.append("\n    ").append(method_20614(var19)).append(": ").append(var19.getSubjectDN().getName());
         }

         var14.append("\n  Pinned certificates for ").append(var1).append(":");
         var15 = 0;

         for (int var18 = var5.size(); var15 < var18; var15++) {
            class_9471 var20 = (class_9471)var5.get(var15);
            var14.append("\n    ").append(var20);
         }

         throw new SSLPeerUnverifiedException(var14.toString());
      }
   }

   /** @deprecated */
   public void method_20618(String var1, Certificate... var2) throws SSLPeerUnverifiedException {
      this.method_20617(var1, Arrays.<Certificate>asList(var2));
   }

   public List<class_9471> method_20616(String var1) {
      Object var4 = Collections.emptyList();

      for (class_9471 var6 : this.field_21676) {
         if (var6.method_43755(var1)) {
            if (var4.isEmpty()) {
               var4 = new ArrayList();
            }

            var4.add(var6);
         }
      }

      return (List<class_9471>)var4;
   }

   public class_4446 method_20619(class_8290 var1) {
      return !class_8515.method_39214(this.field_21674, var1) ? new class_4446(this.field_21676, var1) : this;
   }

   public static String method_20614(Certificate var0) {
      if (var0 instanceof X509Certificate) {
         return "sha256/" + method_20615((X509Certificate)var0).method_41880();
      } else {
         throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
      }
   }

   public static class_9091 method_20621(X509Certificate var0) {
      return class_9091.method_41910(var0.getPublicKey().getEncoded()).method_41896();
   }

   public static class_9091 method_20615(X509Certificate var0) {
      return class_9091.method_41910(var0.getPublicKey().getEncoded()).method_41895();
   }
}
