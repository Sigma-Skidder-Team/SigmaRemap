package remapped;

import com.sun.jna.Platform;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class class_983 {
   public static String method_4282() {
      class_6891 var2 = method_4285();
      return var2 != null ? var2.method_31579() : "Unknown";
   }

   public static byte[] method_4287(String var0) {
      class_6891 var3 = method_4285();
      String var4 = var0 + var3 == null ? "Unknown" : class_6891.field_35448 + var3.method_31579();

      try {
         MessageDigest var8 = MessageDigest.getInstance("SHA-256");
         return var8.digest(var4.getBytes(StandardCharsets.UTF_8));
      } catch (NoSuchAlgorithmException var7) {
         var7.printStackTrace();
         byte[] var5 = new byte[256];

         for (int var6 = 0; var6 < 256; var6++) {
            var5[var6] = 15;
         }

         return var5;
      }
   }

   public static byte[] method_4286() {
      class_6891 var2 = method_4285();
      String var3 = var2 == null ? "Unknown" : class_6891.field_35448 + var2.method_31579();

      try {
         MessageDigest var7 = MessageDigest.getInstance("SHA-256");
         return var7.digest(var3.getBytes(StandardCharsets.UTF_8));
      } catch (NoSuchAlgorithmException var6) {
         var6.printStackTrace();
         byte[] var4 = new byte[256];

         for (int var5 = 0; var5 < 256; var5++) {
            var4[var5] = 15;
         }

         return var4;
      }
   }

   public static String method_4283() {
      byte[] var2 = method_4286();
      return new String(Base64.getEncoder().encode(var2));
   }

   public static String method_4284(String var0) {
      byte[] var3 = method_4287(var0);
      return new String(Base64.getEncoder().encode(var3));
   }

   public static class_6891 method_4285() {
      if (!Platform.isMac()) {
         if (!Platform.isWindows()) {
            return !Platform.isLinux() ? null : new class_9325();
         } else {
            return new class_1324();
         }
      } else {
         return new class_2555();
      }
   }
}
