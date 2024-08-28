package mapped;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class Class1730 extends Class1725 {
   private final MessageDigest field9415;
   private final Mac field9416;

   public static Class1730 method7551(Class1716 var0) {
      return new Class1730(var0, "MD5");
   }

   public static Class1730 method7552(Class1716 var0) {
      return new Class1730(var0, "SHA-1");
   }

   public static Class1730 method7553(Class1716 var0) {
      return new Class1730(var0, "SHA-256");
   }

   public static Class1730 method7554(Class1716 var0) {
      return new Class1730(var0, "SHA-512");
   }

   public static Class1730 method7555(Class1716 var0, Class2003 var1) {
      return new Class1730(var0, var1, "HmacSHA1");
   }

   public static Class1730 method7556(Class1716 var0, Class2003 var1) {
      return new Class1730(var0, var1, "HmacSHA256");
   }

   public static Class1730 method7557(Class1716 var0, Class2003 var1) {
      return new Class1730(var0, var1, "HmacSHA512");
   }

   private Class1730(Class1716 var1, String var2) {
      super(var1);

      try {
         this.field9415 = MessageDigest.getInstance(var2);
         this.field9416 = null;
      } catch (NoSuchAlgorithmException var6) {
         throw new AssertionError();
      }
   }

   private Class1730(Class1716 var1, Class2003 var2, String var3) {
      super(var1);

      try {
         this.field9416 = Mac.getInstance(var3);
         this.field9416.init(new SecretKeySpec(var2.method8459(), var3));
         this.field9415 = null;
      } catch (NoSuchAlgorithmException var7) {
         throw new AssertionError();
      } catch (InvalidKeyException var8) {
         throw new IllegalArgumentException(var8);
      }
   }

   @Override
   public void method7540(Class1734 var1, long var2) throws IOException {
      Class4676.method14644(var1.field9423, 0L, var2);
      long var6 = 0L;

      for (Class9174 var8 = var1.field9422; var6 < var2; var8 = var8.field42126) {
         int var9 = (int)Math.min(var2 - var6, (long)(var8.field42123 - var8.field42122));
         if (this.field9415 == null) {
            this.field9416.update(var8.field42121, var8.field42122, var9);
         } else {
            this.field9415.update(var8.field42121, var8.field42122, var9);
         }

         var6 += (long)var9;
      }

      super.method7540(var1, var2);
   }

   public Class2003 method7558() {
      byte[] var3 = this.field9415 == null ? this.field9416.doFinal() : this.field9415.digest();
      return Class2003.method8430(var3);
   }
}
