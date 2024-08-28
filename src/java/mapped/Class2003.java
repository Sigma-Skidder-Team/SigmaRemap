package mapped;

import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.*;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Class2003 implements Serializable, Comparable<Class2003> {
   public static final char[] field13049 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
   private static final long field13050 = 1L;
   public static final Class2003 field13051 = method8430();
   public final byte[] field13052;
   public transient int field13053;
   public transient String field13054;

   public Class2003(byte[] var1) {
      this.field13052 = var1;
   }

   public static Class2003 method8430(byte... var0) {
      if (var0 != null) {
         return new Class2003((byte[])var0.clone());
      } else {
         throw new IllegalArgumentException("data == null");
      }
   }

   public static Class2003 method8431(byte[] var0, int var1, int var2) {
      if (var0 != null) {
         Class4676.method14644((long)var0.length, (long)var1, (long)var2);
         byte[] var5 = new byte[var2];
         System.arraycopy(var0, var1, var5, 0, var2);
         return new Class2003(var5);
      } else {
         throw new IllegalArgumentException("data == null");
      }
   }

   public static Class2003 method8432(ByteBuffer var0) {
      if (var0 != null) {
         byte[] var3 = new byte[var0.remaining()];
         var0.get(var3);
         return new Class2003(var3);
      } else {
         throw new IllegalArgumentException("data == null");
      }
   }

   public static Class2003 method8433(String var0) {
      if (var0 != null) {
         Class2003 var3 = new Class2003(var0.getBytes(Class4676.field22245));
         var3.field13054 = var0;
         return var3;
      } else {
         throw new IllegalArgumentException("s == null");
      }
   }

   public static Class2003 method8434(String var0, Charset var1) {
      if (var0 != null) {
         if (var1 != null) {
            return new Class2003(var0.getBytes(var1));
         } else {
            throw new IllegalArgumentException("charset == null");
         }
      } else {
         throw new IllegalArgumentException("s == null");
      }
   }

   public String method8435() {
      String var3 = this.field13054;
      return var3 == null ? (this.field13054 = new String(this.field13052, Class4676.field22245)) : var3;
   }

   public String method8436(Charset var1) {
      if (var1 != null) {
         return new String(this.field13052, var1);
      } else {
         throw new IllegalArgumentException("charset == null");
      }
   }

   public String method8437() {
      return Class9106.method33956(this.field13052);
   }

   public Class2003 method8438() {
      return this.method8442("MD5");
   }

   public Class2003 method8439() {
      return this.method8442("SHA-1");
   }

   public Class2003 method8440() {
      return this.method8442("SHA-256");
   }

   public Class2003 method8441() {
      return this.method8442("SHA-512");
   }

   private Class2003 method8442(String var1) {
      try {
         return method8430(MessageDigest.getInstance(var1).digest(this.field13052));
      } catch (NoSuchAlgorithmException var5) {
         throw new AssertionError(var5);
      }
   }

   public Class2003 method8443(Class2003 var1) {
      return this.method8446("HmacSHA1", var1);
   }

   public Class2003 method8444(Class2003 var1) {
      return this.method8446("HmacSHA256", var1);
   }

   public Class2003 method8445(Class2003 var1) {
      return this.method8446("HmacSHA512", var1);
   }

   private Class2003 method8446(String var1, Class2003 var2) {
      try {
         Mac var5 = Mac.getInstance(var1);
         var5.init(new SecretKeySpec(var2.method8459(), var1));
         return method8430(var5.doFinal(this.field13052));
      } catch (NoSuchAlgorithmException var6) {
         throw new AssertionError(var6);
      } catch (InvalidKeyException var7) {
         throw new IllegalArgumentException(var7);
      }
   }

   public String method8447() {
      return Class9106.method33957(this.field13052);
   }

   @Nullable
   public static Class2003 method8448(String var0) {
      if (var0 != null) {
         byte[] var3 = Class9106.method33955(var0);
         return var3 == null ? null : new Class2003(var3);
      } else {
         throw new IllegalArgumentException("base64 == null");
      }
   }

   public String method8449() {
      char[] var3 = new char[this.field13052.length * 2];
      int var4 = 0;

      for (int var8 : this.field13052) {
         var3[var4++] = field13049[var8 >> 4 & 15];
         var3[var4++] = field13049[var8 & 15];
      }

      return new String(var3);
   }

   public static Class2003 method8450(String var0) {
      if (var0 == null) {
         throw new IllegalArgumentException("hex == null");
      } else if (var0.length() % 2 != 0) {
         throw new IllegalArgumentException("Unexpected hex string: " + var0);
      } else {
         byte[] var3 = new byte[var0.length() / 2];

         for (int var4 = 0; var4 < var3.length; var4++) {
            int var5 = method8451(var0.charAt(var4 * 2)) << 4;
            int var6 = method8451(var0.charAt(var4 * 2 + 1));
            var3[var4] = (byte)(var5 + var6);
         }

         return method8430(var3);
      }
   }

   private static int method8451(char var0) {
      if (var0 >= '0' && var0 <= '9') {
         return var0 - 48;
      } else if (var0 >= 'a' && var0 <= 'f') {
         return var0 - 97 + 10;
      } else if (var0 >= 'A' && var0 <= 'F') {
         return var0 - 65 + 10;
      } else {
         throw new IllegalArgumentException("Unexpected hex digit: " + var0);
      }
   }

   public static Class2003 method8452(InputStream var0, int var1) throws IOException {
      if (var0 == null) {
         throw new IllegalArgumentException("in == null");
      } else if (var1 < 0) {
         throw new IllegalArgumentException("byteCount < 0: " + var1);
      } else {
         byte[] var4 = new byte[var1];
         int var5 = 0;

         while (var5 < var1) {
            int var6 = var0.read(var4, var5, var1 - var5);
            if (var6 == -1) {
               throw new EOFException();
            }

            var5 += var6;
         }

         return new Class2003(var4);
      }
   }

   public Class2003 method8453() {
      for (int var3 = 0; var3 < this.field13052.length; var3++) {
         byte var4 = this.field13052[var3];
         if (var4 >= 65 && var4 <= 90) {
            byte[] var5 = (byte[])this.field13052.clone();

            for (var5[var3++] = (byte)(var4 - -32); var3 < var5.length; var3++) {
               var4 = var5[var3];
               if (var4 >= 65 && var4 <= 90) {
                  var5[var3] = (byte)(var4 - -32);
               }
            }

            return new Class2003(var5);
         }
      }

      return this;
   }

   public Class2003 method8454() {
      for (int var3 = 0; var3 < this.field13052.length; var3++) {
         byte var4 = this.field13052[var3];
         if (var4 >= 97 && var4 <= 122) {
            byte[] var5 = (byte[])this.field13052.clone();

            for (var5[var3++] = (byte)(var4 - 32); var3 < var5.length; var3++) {
               var4 = var5[var3];
               if (var4 >= 97 && var4 <= 122) {
                  var5[var3] = (byte)(var4 - 32);
               }
            }

            return new Class2003(var5);
         }
      }

      return this;
   }

   public Class2003 method8455(int var1) {
      return this.method8456(var1, this.field13052.length);
   }

   public Class2003 method8456(int var1, int var2) {
      if (var1 >= 0) {
         if (var2 <= this.field13052.length) {
            int var5 = var2 - var1;
            if (var5 >= 0) {
               if (var1 == 0 && var2 == this.field13052.length) {
                  return this;
               } else {
                  byte[] var6 = new byte[var5];
                  System.arraycopy(this.field13052, var1, var6, 0, var5);
                  return new Class2003(var6);
               }
            } else {
               throw new IllegalArgumentException("endIndex < beginIndex");
            }
         } else {
            throw new IllegalArgumentException("endIndex > length(" + this.field13052.length + ")");
         }
      } else {
         throw new IllegalArgumentException("beginIndex < 0");
      }
   }

   public byte method8457(int var1) {
      return this.field13052[var1];
   }

   public int method8458() {
      return this.field13052.length;
   }

   public byte[] method8459() {
      return (byte[])this.field13052.clone();
   }

   public byte[] method8460() {
      return this.field13052;
   }

   public ByteBuffer method8461() {
      return ByteBuffer.wrap(this.field13052).asReadOnlyBuffer();
   }

   public void method8462(OutputStream var1) throws IOException {
      if (var1 != null) {
         var1.write(this.field13052);
      } else {
         throw new IllegalArgumentException("out == null");
      }
   }

   public void method8463(Class1734 var1) {
      var1.method7631(this.field13052, 0, this.field13052.length);
   }

   public boolean method8464(int var1, Class2003 var2, int var3, int var4) {
      return var2.method8465(var3, this.field13052, var1, var4);
   }

   public boolean method8465(int var1, byte[] var2, int var3, int var4) {
      return var1 >= 0
         && var1 <= this.field13052.length - var4
         && var3 >= 0
         && var3 <= var2.length - var4
         && Class4676.method14650(this.field13052, var1, var2, var3, var4);
   }

   public final boolean method8466(Class2003 var1) {
      return this.method8464(0, var1, 0, var1.method8458());
   }

   public final boolean method8467(byte[] var1) {
      return this.method8465(0, var1, 0, var1.length);
   }

   public final boolean method8468(Class2003 var1) {
      return this.method8464(this.method8458() - var1.method8458(), var1, 0, var1.method8458());
   }

   public final boolean method8469(byte[] var1) {
      return this.method8465(this.method8458() - var1.length, var1, 0, var1.length);
   }

   public final int method8470(Class2003 var1) {
      return this.method8473(var1.method8460(), 0);
   }

   public final int method8471(Class2003 var1, int var2) {
      return this.method8473(var1.method8460(), var2);
   }

   public final int method8472(byte[] var1) {
      return this.method8473(var1, 0);
   }

   public int method8473(byte[] var1, int var2) {
      var2 = Math.max(var2, 0);
      int var5 = var2;

      for (int var6 = this.field13052.length - var1.length; var5 <= var6; var5++) {
         if (Class4676.method14650(this.field13052, var5, var1, 0, var1.length)) {
            return var5;
         }
      }

      return -1;
   }

   public final int method8474(Class2003 var1) {
      return this.method8477(var1.method8460(), this.method8458());
   }

   public final int method8475(Class2003 var1, int var2) {
      return this.method8477(var1.method8460(), var2);
   }

   public final int method8476(byte[] var1) {
      return this.method8477(var1, this.method8458());
   }

   public int method8477(byte[] var1, int var2) {
      var2 = Math.min(var2, this.field13052.length - var1.length);

      for (int var5 = var2; var5 >= 0; var5--) {
         if (Class4676.method14650(this.field13052, var5, var1, 0, var1.length)) {
            return var5;
         }
      }

      return -1;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 == this
         ? true
         : var1 instanceof Class2003
            && ((Class2003)var1).method8458() == this.field13052.length
            && ((Class2003)var1).method8465(0, this.field13052, 0, this.field13052.length);
   }

   @Override
   public int hashCode() {
      int var3 = this.field13053;
      return var3 == 0 ? (this.field13053 = Arrays.hashCode(this.field13052)) : var3;
   }

   public int compareTo(Class2003 var1) {
      int var4 = this.method8458();
      int var5 = var1.method8458();
      int var6 = 0;

      for (int var7 = Math.min(var4, var5); var6 < var7; var6++) {
         int var8 = this.method8457(var6) & 255;
         int var9 = var1.method8457(var6) & 255;
         if (var8 != var9) {
            return var8 >= var9 ? 1 : -1;
         }
      }

      if (var4 != var5) {
         return var4 >= var5 ? 1 : -1;
      } else {
         return 0;
      }
   }

   @Override
   public String toString() {
      if (this.field13052.length != 0) {
         String var3 = this.method8435();
         int var4 = method8478(var3, 64);
         if (var4 != -1) {
            String var5 = var3.substring(0, var4).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            return var4 >= var3.length() ? "[text=" + var5 + "]" : "[size=" + this.field13052.length + " text=" + var5 + "…]";
         } else {
            return this.field13052.length > 64
               ? "[size=" + this.field13052.length + " hex=" + this.method8456(0, 64).method8449() + "…]"
               : "[hex=" + this.method8449() + "]";
         }
      } else {
         return "[size=0]";
      }
   }

   public static int method8478(String var0, int var1) {
      int var4 = 0;
      int var5 = 0;
      int var6 = var0.length();

      while (var4 < var6) {
         if (var5 == var1) {
            return var4;
         }

         int var7 = var0.codePointAt(var4);
         if (Character.isISOControl(var7) && var7 != 10 && var7 != 13 || var7 == 65533) {
            return -1;
         }

         var5++;
         var4 += Character.charCount(var7);
      }

      return var0.length();
   }

   private void method8479(ObjectInputStream var1) throws IOException {
      int var4 = var1.readInt();
      Class2003 var5 = method8452(var1, var4);

      try {
         Field var6 = Class2003.class.getDeclaredField("data");
         var6.setAccessible(true);
         var6.set(this, var5.field13052);
      } catch (NoSuchFieldException var7) {
         throw new AssertionError();
      } catch (IllegalAccessException var8) {
         throw new AssertionError();
      }
   }

   private void method8480(ObjectOutputStream var1) throws IOException {
      var1.writeInt(this.field13052.length);
      var1.write(this.field13052);
   }
}
