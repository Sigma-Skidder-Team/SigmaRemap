package remapped;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class class_4042 {
   public String field_19615;
   public String field_19613;
   public String field_19614;

   public class_4042(String var1, String var2, String var3) {
      this.field_19615 = var1;
      this.field_19613 = var2;
      this.field_19614 = var3;
   }

   public class_4042(byte[] var1) {
      byte[] var4 = Arrays.copyOf(class_983.method_4287("mcAzMFSvCM6wFCHcgzOn"), 16);
      byte[] var5 = "jelloconnectvect".getBytes();
      SecretKeySpec var6 = new SecretKeySpec(var4, "AES");

      try {
         Cipher var7 = Cipher.getInstance("AES/CBC/PKCS5PADDING");
         var7.init(2, var6, new IvParameterSpec(var5));
         class_1293 var8 = new class_1293(new String(var7.doFinal(var1)));
         if (var8.method_5850("username")) {
            this.field_19615 = var8.method_5861("username");
         }

         if (var8.method_5850("authToken")) {
            this.field_19613 = var8.method_5861("authToken");
         }

         if (var8.method_5850("agoraToken")) {
            this.field_19614 = var8.method_5861("agoraToken");
         }
      } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchPaddingException | class_7584 | IllegalBlockSizeException | BadPaddingException | InvalidKeyException var9) {
      }
   }

   public byte[] method_18607() {
      byte[] var3 = Arrays.copyOf(class_983.method_4287("mcAzMFSvCM6wFCHcgzOn"), 16);
      byte[] var4 = "jelloconnectvect".getBytes();
      SecretKeySpec var5 = new SecretKeySpec(var3, "AES");

      try {
         Cipher var6 = Cipher.getInstance("AES/CBC/PKCS5PADDING");
         var6.init(1, var5, new IvParameterSpec(var4));
         return var6.doFinal(this.method_18605().toString().getBytes());
      } catch (NoSuchPaddingException | InvalidKeyException | InvalidAlgorithmParameterException | IllegalBlockSizeException | BadPaddingException | NoSuchAlgorithmException var7) {
         var7.printStackTrace();
         return null;
      }
   }

   public class_1293 method_18605() {
      class_1293 var3 = new class_1293();
      var3.method_5820("username", this.field_19615);
      var3.method_5820("authToken", this.field_19613);
      var3.method_5820("agoraToken", this.field_19614);
      return var3;
   }
}
