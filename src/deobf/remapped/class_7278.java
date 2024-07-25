package remapped;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class class_7278 {
   private static final String field_37255 = class_3307.method_15163().method_15171() + "-Sent-Millis";
   private static final String field_37260 = class_3307.method_15163().method_15171() + "-Received-Millis";
   private final String field_37263;
   private final class_8121 field_37266;
   private final String field_37258;
   private final class_7976 field_37257;
   private final int field_37262;
   private final String field_37256;
   private final class_8121 field_37259;
   private final class_442 field_37264;
   private final long field_37265;
   private final long field_37261;

   public class_7278(class_5322 var1) throws IOException {
      try {
         class_8067 var4 = class_1259.method_5671(var1);
         this.field_37263 = var4.method_36584();
         this.field_37258 = var4.method_36584();
         class_7414 var5 = new class_7414();
         int var6 = class_8555.method_39361(var4);

         for (int var7 = 0; var7 < var6; var7++) {
            var5.method_33779(var4.method_36584());
         }

         this.field_37266 = var5.method_33781();
         class_9669 var21 = class_9669.method_44716(var4.method_36584());
         this.field_37257 = var21.field_49247;
         this.field_37262 = var21.field_49248;
         this.field_37256 = var21.field_49252;
         class_7414 var8 = new class_7414();
         int var9 = class_8555.method_39361(var4);

         for (int var10 = 0; var10 < var9; var10++) {
            var8.method_33779(var4.method_36584());
         }

         String var22 = var8.method_33776(field_37255);
         String var11 = var8.method_33776(field_37260);
         var8.method_33783(field_37255);
         var8.method_33783(field_37260);
         this.field_37265 = var22 != null ? Long.parseLong(var22) : 0L;
         this.field_37261 = var11 != null ? Long.parseLong(var11) : 0L;
         this.field_37259 = var8.method_33781();
         if (this.method_33264()) {
            String var12 = var4.method_36584();
            if (var12.length() > 0) {
               throw new IOException("expected \"\" but was \"" + var12 + "\"");
            }

            String var13 = var4.method_36584();
            class_7463 var14 = class_7463.method_33966(var13);
            List var15 = this.method_33262(var4);
            List var16 = this.method_33262(var4);
            class_5010 var17 = !var4.method_36605() ? class_5010.method_23055(var4.method_36584()) : class_5010.field_25914;
            this.field_37264 = class_442.method_2140(var17, var14, var15, var16);
         } else {
            this.field_37264 = null;
         }
      } finally {
         var1.close();
      }
   }

   public class_7278(class_7839 var1) {
      this.field_37263 = var1.method_35474().method_18136().toString();
      this.field_37266 = class_4464.method_20716(var1);
      this.field_37258 = var1.method_35474().method_18137();
      this.field_37257 = var1.method_35483();
      this.field_37262 = var1.method_35490();
      this.field_37256 = var1.method_35476();
      this.field_37259 = var1.method_35479();
      this.field_37264 = var1.method_35489();
      this.field_37265 = var1.method_35478();
      this.field_37261 = var1.method_35471();
   }

   public void method_33265(class_1469 var1) throws IOException {
      class_3947 var4 = class_1259.method_5670(var1.method_6784(0));
      var4.method_18250(this.field_37263).method_18253(10);
      var4.method_18250(this.field_37258).method_18253(10);
      var4.method_18238((long)this.field_37266.method_36948()).method_18253(10);
      int var5 = 0;

      for (int var6 = this.field_37266.method_36948(); var5 < var6; var5++) {
         var4.method_18250(this.field_37266.method_36954(var5)).method_18250(": ").method_18250(this.field_37266.method_36953(var5)).method_18253(10);
      }

      var4.method_18250(new class_9669(this.field_37257, this.field_37262, this.field_37256).toString()).method_18253(10);
      var4.method_18238((long)(this.field_37259.method_36948() + 2)).method_18253(10);
      var5 = 0;

      for (int var8 = this.field_37259.method_36948(); var5 < var8; var5++) {
         var4.method_18250(this.field_37259.method_36954(var5)).method_18250(": ").method_18250(this.field_37259.method_36953(var5)).method_18253(10);
      }

      var4.method_18250(field_37255).method_18250(": ").method_18238(this.field_37265).method_18253(10);
      var4.method_18250(field_37260).method_18250(": ").method_18238(this.field_37261).method_18253(10);
      if (this.method_33264()) {
         var4.method_18253(10);
         var4.method_18250(this.field_37264.method_2141().method_33967()).method_18253(10);
         this.method_33266(var4, this.field_37264.method_2145());
         this.method_33266(var4, this.field_37264.method_2144());
         var4.method_18250(this.field_37264.method_2146().method_23056()).method_18253(10);
      }

      var4.close();
   }

   private boolean method_33264() {
      return this.field_37263.startsWith("https://");
   }

   private List<Certificate> method_33262(class_8067 var1) throws IOException {
      int var4 = class_8555.method_39361(var1);
      if (var4 == -1) {
         return Collections.<Certificate>emptyList();
      } else {
         try {
            CertificateFactory var5 = CertificateFactory.getInstance("X.509");
            ArrayList var6 = new ArrayList(var4);

            for (int var7 = 0; var7 < var4; var7++) {
               String var8 = var1.method_36584();
               class_7059 var9 = new class_7059();
               var9.method_32487(class_9091.method_41878(var8));
               var6.add(var5.generateCertificate(var9.method_36574()));
            }

            return var6;
         } catch (CertificateException var10) {
            throw new IOException(var10.getMessage());
         }
      }
   }

   private void method_33266(class_3947 var1, List<Certificate> var2) throws IOException {
      try {
         var1.method_18238((long)var2.size()).method_18253(10);
         int var5 = 0;

         for (int var6 = var2.size(); var5 < var6; var5++) {
            byte[] var7 = ((Certificate)var2.get(var5)).getEncoded();
            String var8 = class_9091.method_41910(var7).method_41880();
            var1.method_18250(var8).method_18253(10);
         }
      } catch (CertificateEncodingException var9) {
         throw new IOException(var9.getMessage());
      }
   }

   public boolean method_33263(class_3918 var1, class_7839 var2) {
      return this.field_37263.equals(var1.method_18136().toString())
         && this.field_37258.equals(var1.method_18137())
         && class_4464.method_20703(var2, this.field_37266, var1);
   }

   public class_7839 method_33267(class_8748 var1) {
      String var4 = this.field_37259.method_36955("Content-Type");
      String var5 = this.field_37259.method_36955("Content-Length");
      class_3918 var6 = new class_2415().method_11005(this.field_37263).method_11008(this.field_37258, null).method_11012(this.field_37266).method_11013();
      return new class_7775()
         .method_35283(var6)
         .method_35269(this.field_37257)
         .method_35267(this.field_37262)
         .method_35281(this.field_37256)
         .method_35271(this.field_37259)
         .method_35282(new class_2367(var1, var4, var5))
         .method_35272(this.field_37264)
         .method_35276(this.field_37265)
         .method_35278(this.field_37261)
         .method_35268();
   }
}
