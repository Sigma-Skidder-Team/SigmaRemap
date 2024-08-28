package mapped;

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


public class Class8961 {
   public static SecretKey method32736() throws Class2464 {
      try {
         KeyGenerator var2 = KeyGenerator.getInstance("AES");
         var2.init(128);
         return var2.generateKey();
      } catch (Exception var3) {
         throw new Class2464(var3);
      }
   }

   public static KeyPair method32737() throws Class2464 {
      try {
         KeyPairGenerator var2 = KeyPairGenerator.getInstance("RSA");
         var2.initialize(1024);
         return var2.generateKeyPair();
      } catch (Exception var3) {
         throw new Class2464(var3);
      }
   }

   public static byte[] method32738(String var0, PublicKey var1, SecretKey var2) throws Class2464 {
      try {
         return method32739(var0.getBytes("ISO_8859_1"), var2.getEncoded(), var1.getEncoded());
      } catch (Exception var6) {
         throw new Class2464(var6);
      }
   }

   private static byte[] method32739(byte[]... var0) throws Exception {
      MessageDigest var3 = MessageDigest.getInstance("SHA-1");

      for (byte[] var7 : var0) {
         var3.update(var7);
      }

      return var3.digest();
   }

   public static PublicKey method32740(byte[] var0) throws Class2464 {
      try {
         X509EncodedKeySpec var3 = new X509EncodedKeySpec(var0);
         KeyFactory var4 = KeyFactory.getInstance("RSA");
         return var4.generatePublic(var3);
      } catch (Exception var5) {
         throw new Class2464(var5);
      }
   }

   public static SecretKey method32741(PrivateKey var0, byte[] var1) throws Class2464 {
      byte[] var4 = method32743(var0, var1);

      try {
         return new SecretKeySpec(var4, "AES");
      } catch (Exception var6) {
         throw new Class2464(var6);
      }
   }

   public static byte[] method32742(Key var0, byte[] var1) throws Class2464 {
      return method32744(1, var0, var1);
   }

   public static byte[] method32743(Key var0, byte[] var1) throws Class2464 {
      return method32744(2, var0, var1);
   }

   private static byte[] method32744(int var0, Key var1, byte[] var2) throws Class2464 {
      try {
         return method32745(var0, var1.getAlgorithm(), var1).doFinal(var2);
      } catch (Exception var6) {
         throw new Class2464(var6);
      }
   }

   private static Cipher method32745(int var0, String var1, Key var2) throws Exception {
      Cipher var5 = Cipher.getInstance(var1);
      var5.init(var0, var2);
      return var5;
   }

   public static Cipher method32746(int var0, Key var1) throws Class2464 {
      try {
         Cipher var4 = Cipher.getInstance("AES/CFB8/NoPadding");
         var4.init(var0, var1, new IvParameterSpec(var1.getEncoded()));
         return var4;
      } catch (Exception var5) {
         throw new Class2464(var5);
      }
   }
}
