package mapped;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Class9161 {
   private static final String field42049 = "-Sent-Millis";
   private static final String field42050 = "-Received-Millis";
   private final String field42051;
   private final Class9371 field42052;
   private final String field42053;
   private final Class2201 field42054;
   private final int field42055;
   private final String field42056;
   private final Class9371 field42057;
   private final long field42059;
   private final long field42060;

   public Class9161(Class1737 var1) throws IOException {
      try {
         Class1735 var4 = Class7001.method21696(var1);
         this.field42051 = var4.method7617();
         this.field42053 = var4.method7617();
         Class9192 var5 = new Class9192();
         int var6 = Class1715.method7539(var4);

         for (int var7 = 0; var7 < var6; var7++) {
            var5.method34434(var4.method7617());
         }

         this.field42052 = var5.method34442();
         Class9776 var21 = Class9776.method38545(var4.method7617());
         this.field42054 = var21.field45730;
         this.field42055 = var21.field45731;
         this.field42056 = var21.field45732;
         Class9192 var8 = new Class9192();
         int var9 = Class1715.method7539(var4);

         for (int var10 = 0; var10 < var9; var10++) {
            var8.method34434(var4.method7617());
         }

         String var22 = var8.method34441(field42049);
         String var11 = var8.method34441(field42050);
         var8.method34438(field42049);
         var8.method34438(field42050);
         this.field42059 = var22 != null ? Long.parseLong(var22) : 0L;
         this.field42060 = var11 != null ? Long.parseLong(var11) : 0L;
         this.field42057 = var8.method34442();
         if (this.method34202()) {
            String var12 = var4.method7617();
            if (var12.length() > 0) {
               throw new IOException("expected \"\" but was \"" + var12 + "\"");
            }

            String var13 = var4.method7617();
            Class9204 var14 = Class9204.method34491(var13);
            List var15 = this.method34203(var4);
            List var16 = this.method34203(var4);
            Class2034 var17 = !var4.method7583() ? Class2034.method8676(var4.method7617()) : Class2034.field13209;
         }
      } finally {
         var1.close();
      }
   }

   public Class9161(Class1797 var1) {
      this.field42051 = var1.method7844().method28612().toString();
      this.field42052 = Class8394.method29449(var1);
      this.field42053 = var1.method7844().method28613();
      this.field42054 = var1.method7845();
      this.field42055 = var1.method7846();
      this.field42056 = var1.method7848();
      this.field42057 = var1.method7853();
      this.field42059 = var1.method7863();
      this.field42060 = var1.method7864();
   }

   public void method34201(Class7163 var1) throws IOException {
      Class1733 var4 = Class7001.method21697(var1.method22497(0));
      var4.method7565(this.field42051).method7570(10);
      var4.method7565(this.field42053).method7570(10);
      var4.method7577((long)this.field42052.method35546()).method7570(10);
      int var5 = 0;

      for (int var6 = this.field42052.method35546(); var5 < var6; var5++) {
         var4.method7565(this.field42052.method35547(var5)).method7565(": ").method7565(this.field42052.method35548(var5)).method7570(10);
      }

      var4.method7565(new Class9776(this.field42054, this.field42055, this.field42056).toString()).method7570(10);
      var4.method7577((long)(this.field42057.method35546() + 2)).method7570(10);
      var5 = 0;

      for (int var8 = this.field42057.method35546(); var5 < var8; var5++) {
         var4.method7565(this.field42057.method35547(var5)).method7565(": ").method7565(this.field42057.method35548(var5)).method7570(10);
      }

      var4.method7565(field42049).method7565(": ").method7577(this.field42059).method7570(10);
      var4.method7565(field42050).method7565(": ").method7577(this.field42060).method7570(10);
      if (this.method34202()) {
         var4.method7570(10);
      }

      var4.close();
   }

   private boolean method34202() {
      return this.field42051.startsWith("https://");
   }

   private List<Certificate> method34203(Class1735 var1) throws IOException {
      int var4 = Class1715.method7539(var1);
      if (var4 == -1) {
         return Collections.<Certificate>emptyList();
      } else {
         try {
            CertificateFactory var5 = CertificateFactory.getInstance("X.509");
            ArrayList var6 = new ArrayList(var4);

            for (int var7 = 0; var7 < var4; var7++) {
               String var8 = var1.method7617();
               Class1734 var9 = new Class1734();
               var9.method7562(Class2003.method8448(var8));
               var6.add(var5.generateCertificate(var9.method7586()));
            }

            return var6;
         } catch (CertificateException var10) {
            throw new IOException(var10.getMessage());
         }
      }
   }

   public boolean method34205(Class8223 var1, Class1797 var2) {
      return this.field42051.equals(var1.method28612().toString())
         && this.field42053.equals(var1.method28613())
         && Class8394.method29444(var2, this.field42052, var1);
   }

   public Class1797 method34206(Class1792 var1) {
      String var4 = this.field42057.method35544("Content-Type");
      String var5 = this.field42057.method35544("Content-Length");
      Class8223 var6 = new Class7677().method25236(this.field42051).method25250(this.field42053, null).method25241(this.field42052).method25252();
      return new Class9279()
         .method34977(var6)
         .method34978(this.field42054)
         .method34979(this.field42055)
         .method34980(this.field42056)
         .method34985(this.field42057)
         .method34986(new Class1795(var1, var4, var5))
         .method34992(this.field42059)
         .method34993(this.field42060)
         .method34994();
   }
}
