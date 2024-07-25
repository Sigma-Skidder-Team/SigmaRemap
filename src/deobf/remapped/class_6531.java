package remapped;

import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.util.CryptException;

public class class_6531 {
   public static SecretKey method_29727() throws CryptException {
      try {
         KeyGenerator var2 = KeyGenerator.getInstance("AES");
         var2.init(128);
         return var2.generateKey();
      } catch (Exception var3) {
         throw new class_9647(var3);
      }
   }

   public static KeyPair method_29724() throws CryptException {
      try {
         KeyPairGenerator var2 = KeyPairGenerator.getInstance("RSA");
         var2.initialize(1024);
         return var2.generateKeyPair();
      } catch (Exception var3) {
         throw new class_9647(var3);
      }
   }

   public static byte[] method_29725(String var0, PublicKey var1, SecretKey var2) throws CryptException {
      try {
         return method_29735(var0.getBytes("ISO_8859_1"), var2.getEncoded(), var1.getEncoded());
      } catch (Exception var6) {
         throw new class_9647(var6);
      }
   }

   private static byte[] method_29735(byte[]... var0) throws Exception {
      MessageDigest var3 = MessageDigest.getInstance("SHA-1");

      for (byte[] var7 : var0) {
         var3.update(var7);
      }

      return var3.digest();
   }

   public static PublicKey method_29730(byte[] var0) throws CryptException {
      try {
         X509EncodedKeySpec var3 = new X509EncodedKeySpec(var0);
         KeyFactory var4 = KeyFactory.getInstance("RSA");
         return var4.generatePublic(var3);
      } catch (Exception var5) {
         throw new class_9647(var5);
      }
   }

   public static SecretKey method_29734(PrivateKey var0, byte[] var1) throws CryptException {
      byte[] var4 = method_29733(var0, var1);

      try {
         return new SecretKeySpec(var4, "AES");
      } catch (Exception var6) {
         throw new class_9647(var6);
      }
   }

   public static byte[] method_29726(Key var0, byte[] var1) throws CryptException {
      return method_29731(1, var0, var1);
   }

   public static byte[] method_29733(Key var0, byte[] var1) throws CryptException {
      return method_29731(2, var0, var1);
   }

   private static byte[] method_29731(int var0, Key var1, byte[] var2) throws CryptException {
      try {
         return method_29729(var0, var1.getAlgorithm(), var1).doFinal(var2);
      } catch (Exception var6) {
         throw new class_9647(var6);
      }
   }

   private static Cipher method_29729(int var0, String var1, Key var2) throws Exception {
      Cipher var5 = Cipher.getInstance(var1);
      var5.init(var0, var2);
      return var5;
   }

   public static Cipher method_29732(int var0, Key var1) throws CryptException {
      try {
         Cipher var4 = Cipher.getInstance("AES/CFB8/NoPadding");
         var4.init(var0, var1, new IvParameterSpec(var1.getEncoded()));
         return var4;
      } catch (Exception var5) {
         throw new class_9647(var5);
      }
   }
}
