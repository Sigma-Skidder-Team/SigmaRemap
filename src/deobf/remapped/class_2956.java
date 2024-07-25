package remapped;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class class_2956 extends class_9139 {
   private final MessageDigest field_14435;
   private final Mac field_14434;

   public static class_2956 method_13522(class_5322 var0) {
      return new class_2956(var0, "MD5");
   }

   public static class_2956 method_13520(class_5322 var0) {
      return new class_2956(var0, "SHA-1");
   }

   public static class_2956 method_13518(class_5322 var0) {
      return new class_2956(var0, "SHA-256");
   }

   public static class_2956 method_13519(class_5322 var0, class_9091 var1) {
      return new class_2956(var0, var1, "HmacSHA1");
   }

   public static class_2956 method_13521(class_5322 var0, class_9091 var1) {
      return new class_2956(var0, var1, "HmacSHA256");
   }

   private class_2956(class_5322 var1, String var2) {
      super(var1);

      try {
         this.field_14435 = MessageDigest.getInstance(var2);
         this.field_14434 = null;
      } catch (NoSuchAlgorithmException var6) {
         throw new AssertionError();
      }
   }

   private class_2956(class_5322 var1, class_9091 var2, String var3) {
      super(var1);

      try {
         this.field_14434 = Mac.getInstance(var3);
         this.field_14434.init(new SecretKeySpec(var2.method_41883(), var3));
         this.field_14435 = null;
      } catch (NoSuchAlgorithmException var7) {
         throw new AssertionError();
      } catch (InvalidKeyException var8) {
         throw new IllegalArgumentException(var8);
      }
   }

   @Override
   public long method_24273(class_7059 var1, long var2) throws IOException {
      long var6 = super.method_24273(var1, var2);
      if (var6 != -1L) {
         long var8 = var1.field_36433 - var6;
         long var10 = var1.field_36433;

         class_7332 var12;
         for (var12 = var1.field_36430; var10 > var8; var10 -= (long)(var12.field_37484 - var12.field_37477)) {
            var12 = var12.field_37480;
         }

         while (var10 < var1.field_36433) {
            int var13 = (int)((long)var12.field_37477 + var8 - var10);
            if (this.field_14435 == null) {
               this.field_14434.update(var12.field_37478, var13, var12.field_37484 - var13);
            } else {
               this.field_14435.update(var12.field_37478, var13, var12.field_37484 - var13);
            }

            var10 += (long)(var12.field_37484 - var12.field_37477);
            var8 = var10;
            var12 = var12.field_37475;
         }
      }

      return var6;
   }

   public class_9091 method_13517() {
      byte[] var3 = this.field_14435 == null ? this.field_14434.doFinal() : this.field_14435.digest();
      return class_9091.method_41910(var3);
   }
}
