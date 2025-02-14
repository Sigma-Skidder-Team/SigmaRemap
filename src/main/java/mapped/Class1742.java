package mapped;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class Class1742 extends Class1740 {
   private final MessageDigest field9448;
   private final Mac field9449;

   public static Class1742 method7663(Class1737 var0) {
      return new Class1742(var0, "MD5");
   }

   public static Class1742 method7664(Class1737 var0) {
      return new Class1742(var0, "SHA-1");
   }

   public static Class1742 method7665(Class1737 var0) {
      return new Class1742(var0, "SHA-256");
   }

   public static Class1742 method7666(Class1737 var0, Class2003 var1) {
      return new Class1742(var0, var1, "HmacSHA1");
   }

   public static Class1742 method7667(Class1737 var0, Class2003 var1) {
      return new Class1742(var0, var1, "HmacSHA256");
   }

   private Class1742(Class1737 var1, String var2) {
      super(var1);

      try {
         this.field9448 = MessageDigest.getInstance(var2);
         this.field9449 = null;
      } catch (NoSuchAlgorithmException var6) {
         throw new AssertionError();
      }
   }

   private Class1742(Class1737 var1, Class2003 var2, String var3) {
      super(var1);

      try {
         this.field9449 = Mac.getInstance(var3);
         this.field9449.init(new SecretKeySpec(var2.method8459(), var3));
         this.field9448 = null;
      } catch (NoSuchAlgorithmException var7) {
         throw new AssertionError();
      } catch (InvalidKeyException var8) {
         throw new IllegalArgumentException(var8);
      }
   }

   @Override
   public long method7633(Class1734 var1, long var2) throws IOException {
      long var6 = super.method7633(var1, var2);
      if (var6 != -1L) {
         long var8 = var1.field9423 - var6;
         long var10 = var1.field9423;

         Class9174 var12;
         for (var12 = var1.field9422; var10 > var8; var10 -= (long)(var12.field42123 - var12.field42122)) {
            var12 = var12.field42127;
         }

         while (var10 < var1.field9423) {
            int var13 = (int)((long)var12.field42122 + var8 - var10);
            if (this.field9448 == null) {
               this.field9449.update(var12.field42121, var13, var12.field42123 - var13);
            } else {
               this.field9448.update(var12.field42121, var13, var12.field42123 - var13);
            }

            var10 += (long)(var12.field42123 - var12.field42122);
            var8 = var10;
            var12 = var12.field42126;
         }
      }

      return var6;
   }

   public Class2003 method7668() {
      byte[] var3 = this.field9448 == null ? this.field9449.doFinal() : this.field9448.digest();
      return Class2003.method8430(var3);
   }
}
