package remapped;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public final class class_3635 extends class_6619 {
   private final MessageDigest field_17742;
   private final Mac field_17743;

   public static class_3635 method_16950(class_4131 var0) {
      return new class_3635(var0, "MD5");
   }

   public static class_3635 method_16948(class_4131 var0) {
      return new class_3635(var0, "SHA-1");
   }

   public static class_3635 method_16947(class_4131 var0) {
      return new class_3635(var0, "SHA-256");
   }

   public static class_3635 method_16952(class_4131 var0) {
      return new class_3635(var0, "SHA-512");
   }

   public static class_3635 method_16946(class_4131 var0, class_9091 var1) {
      return new class_3635(var0, var1, "HmacSHA1");
   }

   public static class_3635 method_16949(class_4131 var0, class_9091 var1) {
      return new class_3635(var0, var1, "HmacSHA256");
   }

   public static class_3635 method_16951(class_4131 var0, class_9091 var1) {
      return new class_3635(var0, var1, "HmacSHA512");
   }

   private class_3635(class_4131 var1, String var2) {
      super(var1);

      try {
         this.field_17742 = MessageDigest.getInstance(var2);
         this.field_17743 = null;
      } catch (NoSuchAlgorithmException var6) {
         throw new AssertionError();
      }
   }

   private class_3635(class_4131 var1, class_9091 var2, String var3) {
      super(var1);

      try {
         this.field_17743 = Mac.getInstance(var3);
         this.field_17743.init(new SecretKeySpec(var2.method_41883(), var3));
         this.field_17742 = null;
      } catch (NoSuchAlgorithmException var7) {
         throw new AssertionError();
      } catch (InvalidKeyException var8) {
         throw new IllegalArgumentException(var8);
      }
   }

   @Override
   public void method_19191(class_7059 var1, long var2) throws IOException {
      class_189.method_830(var1.field_36433, 0L, var2);
      long var6 = 0L;

      for (class_7332 var8 = var1.field_36430; var6 < var2; var8 = var8.field_37475) {
         int var9 = (int)Math.min(var2 - var6, (long)(var8.field_37484 - var8.field_37477));
         if (this.field_17742 == null) {
            this.field_17743.update(var8.field_37478, var8.field_37477, var9);
         } else {
            this.field_17742.update(var8.field_37478, var8.field_37477, var9);
         }

         var6 += (long)var9;
      }

      super.method_19191(var1, var2);
   }

   public class_9091 method_16945() {
      byte[] var3 = this.field_17742 == null ? this.field_17743.doFinal() : this.field_17742.digest();
      return class_9091.method_41910(var3);
   }
}
