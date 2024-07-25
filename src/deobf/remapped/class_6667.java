package remapped;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.security.auth.x500.X500Principal;

public final class class_6667 implements HostnameVerifier {
   public static final class_6667 field_34474 = new class_6667();
   private static final int field_34472 = 2;
   private static final int field_34473 = 7;

   private class_6667() {
   }

   @Override
   public boolean verify(String var1, SSLSession var2) {
      try {
         Certificate[] var5 = var2.getPeerCertificates();
         return this.verify(var1, (X509Certificate)var5[0]);
      } catch (SSLException var6) {
         return false;
      }
   }

   public boolean verify(String var1, X509Certificate var2) {
      return !class_8515.method_39204(var1) ? this.method_30597(var1, var2) : this.method_30600(var1, var2);
   }

   private boolean method_30600(String var1, X509Certificate var2) {
      List var5 = method_30595(var2, 7);
      int var6 = 0;

      for (int var7 = var5.size(); var6 < var7; var6++) {
         if (var1.equalsIgnoreCase((String)var5.get(var6))) {
            return true;
         }
      }

      return false;
   }

   private boolean method_30597(String var1, X509Certificate var2) {
      var1 = var1.toLowerCase(Locale.US);
      boolean var5 = false;
      List var6 = method_30595(var2, 2);
      int var7 = 0;

      for (int var8 = var6.size(); var7 < var8; var7++) {
         var5 = true;
         if (this.method_30596(var1, (String)var6.get(var7))) {
            return true;
         }
      }

      if (!var5) {
         X500Principal var10 = var2.getSubjectX500Principal();
         String var11 = new class_1924(var10).method_8941("cn");
         if (var11 != null) {
            return this.method_30596(var1, var11);
         }
      }

      return false;
   }

   public static List<String> method_30598(X509Certificate var0) {
      List var3 = method_30595(var0, 7);
      List var4 = method_30595(var0, 2);
      ArrayList var5 = new ArrayList(var3.size() + var4.size());
      var5.addAll(var3);
      var5.addAll(var4);
      return var5;
   }

   private static List<String> method_30595(X509Certificate var0, int var1) {
      ArrayList var4 = new ArrayList();

      try {
         Collection var5 = var0.getSubjectAlternativeNames();
         if (var5 == null) {
            return Collections.<String>emptyList();
         } else {
            for (Object var7 : var5) {
               List var8 = (List)var7;
               if (var8 != null && var8.size() >= 2) {
                  Integer var9 = (Integer)var8.get(0);
                  if (var9 != null && var9 == var1) {
                     String var10 = (String)var8.get(1);
                     if (var10 != null) {
                        var4.add(var10);
                     }
                  }
               }
            }

            return var4;
         }
      } catch (CertificateParsingException var11) {
         return Collections.<String>emptyList();
      }
   }

   public boolean method_30596(String var1, String var2) {
      if (var1 == null || var1.length() == 0 || var1.startsWith(".") || var1.endsWith("..")) {
         return false;
      } else if (var2 != null && var2.length() != 0 && !var2.startsWith(".") && !var2.endsWith("..")) {
         if (!var1.endsWith(".")) {
            var1 = var1 + '.';
         }

         if (!var2.endsWith(".")) {
            var2 = var2 + '.';
         }

         var2 = var2.toLowerCase(Locale.US);
         if (var2.contains("*")) {
            if (!var2.startsWith("*.") || var2.indexOf(42, 1) != -1) {
               return false;
            } else if (var1.length() < var2.length()) {
               return false;
            } else if (!"*.".equals(var2)) {
               String var5 = var2.substring(1);
               if (var1.endsWith(var5)) {
                  int var6 = var1.length() - var5.length();
                  return var6 <= 0 || var1.lastIndexOf(46, var6 - 1) == -1;
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return var1.equals(var2);
         }
      } else {
         return false;
      }
   }
}
