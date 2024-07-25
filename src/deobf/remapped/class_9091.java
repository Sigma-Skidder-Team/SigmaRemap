package remapped;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class class_9091 implements Serializable, Comparable<class_9091> {
   public static final char[] field_46560 = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
   private static final long field_46559 = 1L;
   public static final class_9091 field_46557 = method_41910();
   public final byte[] field_46558;
   public transient int field_46555;
   public transient String field_46561;

   public class_9091(byte[] var1) {
      this.field_46558 = var1;
   }

   public static class_9091 method_41910(byte... var0) {
      if (var0 != null) {
         return new class_9091((byte[])var0.clone());
      } else {
         throw new IllegalArgumentException("data == null");
      }
   }

   public static class_9091 method_41911(byte[] var0, int var1, int var2) {
      if (var0 != null) {
         class_189.method_830((long)var0.length, (long)var1, (long)var2);
         byte[] var5 = new byte[var2];
         System.arraycopy(var0, var1, var5, 0, var2);
         return new class_9091(var5);
      } else {
         throw new IllegalArgumentException("data == null");
      }
   }

   public static class_9091 method_41909(ByteBuffer var0) {
      if (var0 != null) {
         byte[] var3 = new byte[var0.remaining()];
         var0.get(var3);
         return new class_9091(var3);
      } else {
         throw new IllegalArgumentException("data == null");
      }
   }

   public static class_9091 method_41889(String var0) {
      if (var0 != null) {
         class_9091 var3 = new class_9091(var0.getBytes(class_189.field_630));
         var3.field_46561 = var0;
         return var3;
      } else {
         throw new IllegalArgumentException("s == null");
      }
   }

   public static class_9091 method_41888(String var0, Charset var1) {
      if (var0 != null) {
         if (var1 != null) {
            return new class_9091(var0.getBytes(var1));
         } else {
            throw new IllegalArgumentException("charset == null");
         }
      } else {
         throw new IllegalArgumentException("s == null");
      }
   }

   public String method_41869() {
      String var3 = this.field_46561;
      return var3 == null ? (this.field_46561 = new String(this.field_46558, class_189.field_630)) : var3;
   }

   public String method_41905(Charset var1) {
      if (var1 != null) {
         return new String(this.field_46558, var1);
      } else {
         throw new IllegalArgumentException("charset == null");
      }
   }

   public String method_41880() {
      return class_7026.method_32056(this.field_46558);
   }

   public class_9091 method_41890() {
      return this.method_41877("MD5");
   }

   public class_9091 method_41896() {
      return this.method_41877("SHA-1");
   }

   public class_9091 method_41895() {
      return this.method_41877("SHA-256");
   }

   public class_9091 method_41893() {
      return this.method_41877("SHA-512");
   }

   private class_9091 method_41877(String var1) {
      try {
         return method_41910(MessageDigest.getInstance(var1).digest(this.field_46558));
      } catch (NoSuchAlgorithmException var5) {
         throw new AssertionError(var5);
      }
   }

   public class_9091 method_41894(class_9091 var1) {
      return this.method_41901("HmacSHA1", var1);
   }

   public class_9091 method_41906(class_9091 var1) {
      return this.method_41901("HmacSHA256", var1);
   }

   public class_9091 method_41884(class_9091 var1) {
      return this.method_41901("HmacSHA512", var1);
   }

   private class_9091 method_41901(String var1, class_9091 var2) {
      try {
         Mac var5 = Mac.getInstance(var1);
         var5.init(new SecretKeySpec(var2.method_41883(), var1));
         return method_41910(var5.doFinal(this.field_46558));
      } catch (NoSuchAlgorithmException var6) {
         throw new AssertionError(var6);
      } catch (InvalidKeyException var7) {
         throw new IllegalArgumentException(var7);
      }
   }

   public String method_41871() {
      return class_7026.method_32053(this.field_46558);
   }

   @Nullable
   public static class_9091 method_41878(String var0) {
      if (var0 != null) {
         byte[] var3 = class_7026.method_32054(var0);
         return var3 == null ? null : new class_9091(var3);
      } else {
         throw new IllegalArgumentException("base64 == null");
      }
   }

   public String method_41900() {
      char[] var3 = new char[this.field_46558.length * 2];
      int var4 = 0;

      for (byte var8 : this.field_46558) {
         var3[var4++] = field_46560[var8 >> 4 & 15];
         var3[var4++] = field_46560[var8 & 15];
      }

      return new String(var3);
   }

   public static class_9091 method_41907(String var0) {
      if (var0 == null) {
         throw new IllegalArgumentException("hex == null");
      } else if (var0.length() % 2 != 0) {
         throw new IllegalArgumentException("Unexpected hex string: " + var0);
      } else {
         byte[] var3 = new byte[var0.length() / 2];

         for (int var4 = 0; var4 < var3.length; var4++) {
            int var5 = method_41897(var0.charAt(var4 * 2)) << 4;
            int var6 = method_41897(var0.charAt(var4 * 2 + 1));
            var3[var4] = (byte)(var5 + var6);
         }

         return method_41910(var3);
      }
   }

   private static int method_41897(char var0) {
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

   public static class_9091 method_41885(InputStream var0, int var1) throws IOException {
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

         return new class_9091(var4);
      }
   }

   public class_9091 method_41870() {
      for (int var3 = 0; var3 < this.field_46558.length; var3++) {
         byte var4 = this.field_46558[var3];
         if (var4 >= 65 && var4 <= 90) {
            byte[] var5 = (byte[])this.field_46558.clone();

            for (var5[var3++] = (byte)(var4 - -32); var3 < var5.length; var3++) {
               var4 = var5[var3];
               if (var4 >= 65 && var4 <= 90) {
                  var5[var3] = (byte)(var4 - -32);
               }
            }

            return new class_9091(var5);
         }
      }

      return this;
   }

   public class_9091 method_41887() {
      for (int var3 = 0; var3 < this.field_46558.length; var3++) {
         byte var4 = this.field_46558[var3];
         if (var4 >= 97 && var4 <= 122) {
            byte[] var5 = (byte[])this.field_46558.clone();

            for (var5[var3++] = (byte)(var4 - 32); var3 < var5.length; var3++) {
               var4 = var5[var3];
               if (var4 >= 97 && var4 <= 122) {
                  var5[var3] = (byte)(var4 - 32);
               }
            }

            return new class_9091(var5);
         }
      }

      return this;
   }

   public class_9091 method_41903(int var1) {
      return this.method_41904(var1, this.field_46558.length);
   }

   public class_9091 method_41904(int var1, int var2) {
      if (var1 >= 0) {
         if (var2 <= this.field_46558.length) {
            int var5 = var2 - var1;
            if (var5 >= 0) {
               if (var1 == 0 && var2 == this.field_46558.length) {
                  return this;
               } else {
                  byte[] var6 = new byte[var5];
                  System.arraycopy(this.field_46558, var1, var6, 0, var5);
                  return new class_9091(var6);
               }
            } else {
               throw new IllegalArgumentException("endIndex < beginIndex");
            }
         } else {
            throw new IllegalArgumentException("endIndex > length(" + this.field_46558.length + ")");
         }
      } else {
         throw new IllegalArgumentException("beginIndex < 0");
      }
   }

   public byte method_41879(int var1) {
      return this.field_46558[var1];
   }

   public int method_41902() {
      return this.field_46558.length;
   }

   public byte[] method_41883() {
      return (byte[])this.field_46558.clone();
   }

   public byte[] method_41898() {
      return this.field_46558;
   }

   public ByteBuffer method_41872() {
      return ByteBuffer.wrap(this.field_46558).asReadOnlyBuffer();
   }

   public void method_41915(OutputStream var1) throws IOException {
      if (var1 != null) {
         var1.write(this.field_46558);
      } else {
         throw new IllegalArgumentException("out == null");
      }
   }

   public void method_41916(class_7059 var1) {
      var1.method_32489(this.field_46558, 0, this.field_46558.length);
   }

   public boolean method_41881(int var1, class_9091 var2, int var3, int var4) {
      return var2.method_41882(var3, this.field_46558, var1, var4);
   }

   public boolean method_41882(int var1, byte[] var2, int var3, int var4) {
      return var1 >= 0
         && var1 <= this.field_46558.length - var4
         && var3 >= 0
         && var3 <= var2.length - var4
         && class_189.method_831(this.field_46558, var1, var2, var3, var4);
   }

   public final boolean method_41912(class_9091 var1) {
      return this.method_41881(0, var1, 0, var1.method_41902());
   }

   public final boolean method_41913(byte[] var1) {
      return this.method_41882(0, var1, 0, var1.length);
   }

   public final boolean method_41891(class_9091 var1) {
      return this.method_41881(this.method_41902() - var1.method_41902(), var1, 0, var1.method_41902());
   }

   public final boolean method_41892(byte[] var1) {
      return this.method_41882(this.method_41902() - var1.length, var1, 0, var1.length);
   }

   public final int method_41873(class_9091 var1) {
      return this.method_41876(var1.method_41898(), 0);
   }

   public final int method_41874(class_9091 var1, int var2) {
      return this.method_41876(var1.method_41898(), var2);
   }

   public final int method_41875(byte[] var1) {
      return this.method_41876(var1, 0);
   }

   public int method_41876(byte[] var1, int var2) {
      var2 = Math.max(var2, 0);
      int var5 = var2;

      for (int var6 = this.field_46558.length - var1.length; var5 <= var6; var5++) {
         if (class_189.method_831(this.field_46558, var5, var1, 0, var1.length)) {
            return var5;
         }
      }

      return -1;
   }

   public final int method_41917(class_9091 var1) {
      return this.method_41920(var1.method_41898(), this.method_41902());
   }

   public final int method_41918(class_9091 var1, int var2) {
      return this.method_41920(var1.method_41898(), var2);
   }

   public final int method_41919(byte[] var1) {
      return this.method_41920(var1, this.method_41902());
   }

   public int method_41920(byte[] var1, int var2) {
      var2 = Math.min(var2, this.field_46558.length - var1.length);

      for (int var5 = var2; var5 >= 0; var5--) {
         if (class_189.method_831(this.field_46558, var5, var1, 0, var1.length)) {
            return var5;
         }
      }

      return -1;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 == this
         ? true
         : var1 instanceof class_9091
            && ((class_9091)var1).method_41902() == this.field_46558.length
            && ((class_9091)var1).method_41882(0, this.field_46558, 0, this.field_46558.length);
   }

   @Override
   public int hashCode() {
      int var3 = this.field_46555;
      return var3 == 0 ? (this.field_46555 = Arrays.hashCode(this.field_46558)) : var3;
   }

   public int compareTo(class_9091 var1) {
      int var4 = this.method_41902();
      int var5 = var1.method_41902();
      int var6 = 0;

      for (int var7 = Math.min(var4, var5); var6 < var7; var6++) {
         int var8 = this.method_41879(var6) & 255;
         int var9 = var1.method_41879(var6) & 255;
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
      if (this.field_46558.length != 0) {
         String var3 = this.method_41869();
         int var4 = method_41908(var3, 64);
         if (var4 != -1) {
            String var5 = var3.substring(0, var4).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            return var4 >= var3.length() ? "[text=" + var5 + "]" : "[size=" + this.field_46558.length + " text=" + var5 + "…]";
         } else {
            return this.field_46558.length > 64
               ? "[size=" + this.field_46558.length + " hex=" + this.method_41904(0, 64).method_41900() + "…]"
               : "[hex=" + this.method_41900() + "]";
         }
      } else {
         return "[size=0]";
      }
   }

   public static int method_41908(String var0, int var1) {
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

   private void method_41914(ObjectInputStream var1) throws IOException {
      int var4 = var1.readInt();
      class_9091 var5 = method_41885(var1, var4);

      try {
         Field var6 = class_9091.class.getDeclaredField("data");
         var6.setAccessible(true);
         var6.set(this, var5.field_46558);
      } catch (NoSuchFieldException var7) {
         throw new AssertionError();
      } catch (IllegalAccessException var8) {
         throw new AssertionError();
      }
   }

   private void method_41899(ObjectOutputStream var1) throws IOException {
      var1.writeInt(this.field_46558.length);
      var1.write(this.field_46558);
   }
}
