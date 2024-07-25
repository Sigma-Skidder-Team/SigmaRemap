package remapped;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class class_1779 extends class_9091 {
   public final transient byte[][] field_9107;
   public final transient int[] field_9106;

   public class_1779(class_7059 var1, int var2) {
      super(null);
      class_189.method_830(var1.field_36433, 0L, (long)var2);
      int var5 = 0;
      int var6 = 0;

      for (class_7332 var7 = var1.field_36430; var5 < var2; var7 = var7.field_37475) {
         if (var7.field_37484 == var7.field_37477) {
            throw new AssertionError("s.limit == s.pos");
         }

         var5 += var7.field_37484 - var7.field_37477;
         var6++;
      }

      this.field_9107 = new byte[var6][];
      this.field_9106 = new int[var6 * 2];
      var5 = 0;
      var6 = 0;

      for (class_7332 var10 = var1.field_36430; var5 < var2; var10 = var10.field_37475) {
         this.field_9107[var6] = var10.field_37478;
         var5 += var10.field_37484 - var10.field_37477;
         if (var5 > var2) {
            var5 = var2;
         }

         this.field_9106[var6] = var5;
         this.field_9106[var6 + this.field_9107.length] = var10.field_37477;
         var10.field_37476 = true;
         var6++;
      }
   }

   @Override
   public String method_41869() {
      return this.method_7932().method_41869();
   }

   @Override
   public String method_41905(Charset var1) {
      return this.method_7932().method_41905(var1);
   }

   @Override
   public String method_41880() {
      return this.method_7932().method_41880();
   }

   @Override
   public String method_41900() {
      return this.method_7932().method_41900();
   }

   @Override
   public class_9091 method_41870() {
      return this.method_7932().method_41870();
   }

   @Override
   public class_9091 method_41887() {
      return this.method_7932().method_41887();
   }

   @Override
   public class_9091 method_41890() {
      return this.method_7932().method_41890();
   }

   @Override
   public class_9091 method_41896() {
      return this.method_7932().method_41896();
   }

   @Override
   public class_9091 method_41895() {
      return this.method_7932().method_41895();
   }

   @Override
   public class_9091 method_41894(class_9091 var1) {
      return this.method_7932().method_41894(var1);
   }

   @Override
   public class_9091 method_41906(class_9091 var1) {
      return this.method_7932().method_41906(var1);
   }

   @Override
   public String method_41871() {
      return this.method_7932().method_41871();
   }

   @Override
   public class_9091 method_41903(int var1) {
      return this.method_7932().method_41903(var1);
   }

   @Override
   public class_9091 method_41904(int var1, int var2) {
      return this.method_7932().method_41904(var1, var2);
   }

   @Override
   public byte method_41879(int var1) {
      class_189.method_830((long)this.field_9106[this.field_9107.length - 1], (long)var1, 1L);
      int var4 = this.method_7934(var1);
      int var5 = var4 != 0 ? this.field_9106[var4 - 1] : 0;
      int var6 = this.field_9106[var4 + this.field_9107.length];
      return this.field_9107[var4][var1 - var5 + var6];
   }

   private int method_7934(int var1) {
      int var4 = Arrays.binarySearch(this.field_9106, 0, this.field_9107.length, var1 + 1);
      return var4 < 0 ? ~var4 : var4;
   }

   @Override
   public int method_41902() {
      return this.field_9106[this.field_9107.length - 1];
   }

   @Override
   public byte[] method_41883() {
      byte[] var3 = new byte[this.field_9106[this.field_9107.length - 1]];
      int var4 = 0;
      int var5 = 0;

      for (int var6 = this.field_9107.length; var5 < var6; var5++) {
         int var7 = this.field_9106[var6 + var5];
         int var8 = this.field_9106[var5];
         System.arraycopy(this.field_9107[var5], var7, var3, var4, var8 - var4);
         var4 = var8;
      }

      return var3;
   }

   @Override
   public ByteBuffer method_41872() {
      return ByteBuffer.wrap(this.method_41883()).asReadOnlyBuffer();
   }

   @Override
   public void method_41915(OutputStream var1) throws IOException {
      if (var1 == null) {
         throw new IllegalArgumentException("out == null");
      } else {
         int var4 = 0;
         int var5 = 0;

         for (int var6 = this.field_9107.length; var5 < var6; var5++) {
            int var7 = this.field_9106[var6 + var5];
            int var8 = this.field_9106[var5];
            var1.write(this.field_9107[var5], var7, var8 - var4);
            var4 = var8;
         }
      }
   }

   @Override
   public void method_41916(class_7059 var1) {
      int var4 = 0;
      int var5 = 0;

      for (int var6 = this.field_9107.length; var5 < var6; var5++) {
         int var7 = this.field_9106[var6 + var5];
         int var8 = this.field_9106[var5];
         class_7332 var9 = new class_7332(this.field_9107[var5], var7, var7 + var8 - var4);
         if (var1.field_36430 != null) {
            var1.field_36430.field_37480.method_33417(var9);
         } else {
            var1.field_36430 = var9.field_37475 = var9.field_37480 = var9;
         }

         var4 = var8;
      }

      var1.field_36433 += (long)var4;
   }

   @Override
   public boolean method_41881(int var1, class_9091 var2, int var3, int var4) {
      if (var1 >= 0 && var1 <= this.method_41902() - var4) {
         for (int var7 = this.method_7934(var1); var4 > 0; var7++) {
            int var8 = var7 != 0 ? this.field_9106[var7 - 1] : 0;
            int var9 = this.field_9106[var7] - var8;
            int var10 = Math.min(var4, var8 + var9 - var1);
            int var11 = this.field_9106[this.field_9107.length + var7];
            int var12 = var1 - var8 + var11;
            if (!var2.method_41882(var3, this.field_9107[var7], var12, var10)) {
               return false;
            }

            var1 += var10;
            var3 += var10;
            var4 -= var10;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean method_41882(int var1, byte[] var2, int var3, int var4) {
      if (var1 >= 0 && var1 <= this.method_41902() - var4 && var3 >= 0 && var3 <= var2.length - var4) {
         for (int var7 = this.method_7934(var1); var4 > 0; var7++) {
            int var8 = var7 != 0 ? this.field_9106[var7 - 1] : 0;
            int var9 = this.field_9106[var7] - var8;
            int var10 = Math.min(var4, var8 + var9 - var1);
            int var11 = this.field_9106[this.field_9107.length + var7];
            int var12 = var1 - var8 + var11;
            if (!class_189.method_831(this.field_9107[var7], var12, var2, var3, var10)) {
               return false;
            }

            var1 += var10;
            var3 += var10;
            var4 -= var10;
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public int method_41876(byte[] var1, int var2) {
      return this.method_7932().method_41876(var1, var2);
   }

   @Override
   public int method_41920(byte[] var1, int var2) {
      return this.method_7932().method_41920(var1, var2);
   }

   private class_9091 method_7932() {
      return new class_9091(this.method_41883());
   }

   @Override
   public byte[] method_41898() {
      return this.method_41883();
   }

   @Override
   public boolean equals(Object var1) {
      return var1 == this
         ? true
         : var1 instanceof class_9091
            && ((class_9091)var1).method_41902() == this.method_41902()
            && this.method_41881(0, (class_9091)var1, 0, this.method_41902());
   }

   @Override
   public int hashCode() {
      int var3 = this.field_46555;
      if (var3 != 0) {
         return var3;
      } else {
         var3 = 1;
         int var4 = 0;
         int var5 = 0;

         for (int var6 = this.field_9107.length; var5 < var6; var5++) {
            byte[] var7 = this.field_9107[var5];
            int var8 = this.field_9106[var6 + var5];
            int var9 = this.field_9106[var5];
            int var10 = var9 - var4;
            int var11 = var8;

            for (int var12 = var8 + var10; var11 < var12; var11++) {
               var3 = 31 * var3 + var7[var11];
            }

            var4 = var9;
         }

         return this.field_46555 = var3;
      }
   }

   @Override
   public String toString() {
      return this.method_7932().toString();
   }

   private Object method_7933() {
      return this.method_7932();
   }
}
