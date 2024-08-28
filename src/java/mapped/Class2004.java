package mapped;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class Class2004 extends Class2003 {
   public final transient byte[][] field13055;
   public final transient int[] field13056;

   public Class2004(Class1734 var1, int var2) {
      super(null);
      Class4676.method14644(var1.field9423, 0L, (long)var2);
      int var5 = 0;
      int var6 = 0;

      for (Class9174 var7 = var1.field9422; var5 < var2; var7 = var7.field42126) {
         if (var7.field42123 == var7.field42122) {
            throw new AssertionError("s.limit == s.pos");
         }

         var5 += var7.field42123 - var7.field42122;
         var6++;
      }

      this.field13055 = new byte[var6][];
      this.field13056 = new int[var6 * 2];
      var5 = 0;
      var6 = 0;

      for (Class9174 var10 = var1.field9422; var5 < var2; var10 = var10.field42126) {
         this.field13055[var6] = var10.field42121;
         var5 += var10.field42123 - var10.field42122;
         if (var5 > var2) {
            var5 = var2;
         }

         this.field13056[var6] = var5;
         this.field13056[var6 + this.field13055.length] = var10.field42122;
         var10.field42124 = true;
         var6++;
      }
   }

   @Override
   public String method8435() {
      return this.method8482().method8435();
   }

   @Override
   public String method8436(Charset var1) {
      return this.method8482().method8436(var1);
   }

   @Override
   public String method8437() {
      return this.method8482().method8437();
   }

   @Override
   public String method8449() {
      return this.method8482().method8449();
   }

   @Override
   public Class2003 method8453() {
      return this.method8482().method8453();
   }

   @Override
   public Class2003 method8454() {
      return this.method8482().method8454();
   }

   @Override
   public Class2003 method8438() {
      return this.method8482().method8438();
   }

   @Override
   public Class2003 method8439() {
      return this.method8482().method8439();
   }

   @Override
   public Class2003 method8440() {
      return this.method8482().method8440();
   }

   @Override
   public Class2003 method8443(Class2003 var1) {
      return this.method8482().method8443(var1);
   }

   @Override
   public Class2003 method8444(Class2003 var1) {
      return this.method8482().method8444(var1);
   }

   @Override
   public String method8447() {
      return this.method8482().method8447();
   }

   @Override
   public Class2003 method8455(int var1) {
      return this.method8482().method8455(var1);
   }

   @Override
   public Class2003 method8456(int var1, int var2) {
      return this.method8482().method8456(var1, var2);
   }

   @Override
   public byte method8457(int var1) {
      Class4676.method14644((long)this.field13056[this.field13055.length - 1], (long)var1, 1L);
      int var4 = this.method8481(var1);
      int var5 = var4 != 0 ? this.field13056[var4 - 1] : 0;
      int var6 = this.field13056[var4 + this.field13055.length];
      return this.field13055[var4][var1 - var5 + var6];
   }

   private int method8481(int var1) {
      int var4 = Arrays.binarySearch(this.field13056, 0, this.field13055.length, var1 + 1);
      return var4 < 0 ? ~var4 : var4;
   }

   @Override
   public int method8458() {
      return this.field13056[this.field13055.length - 1];
   }

   @Override
   public byte[] method8459() {
      byte[] var3 = new byte[this.field13056[this.field13055.length - 1]];
      int var4 = 0;
      int var5 = 0;

      for (int var6 = this.field13055.length; var5 < var6; var5++) {
         int var7 = this.field13056[var6 + var5];
         int var8 = this.field13056[var5];
         System.arraycopy(this.field13055[var5], var7, var3, var4, var8 - var4);
         var4 = var8;
      }

      return var3;
   }

   @Override
   public ByteBuffer method8461() {
      return ByteBuffer.wrap(this.method8459()).asReadOnlyBuffer();
   }

   @Override
   public void method8462(OutputStream var1) throws IOException {
      if (var1 == null) {
         throw new IllegalArgumentException("out == null");
      } else {
         int var4 = 0;
         int var5 = 0;

         for (int var6 = this.field13055.length; var5 < var6; var5++) {
            int var7 = this.field13056[var6 + var5];
            int var8 = this.field13056[var5];
            var1.write(this.field13055[var5], var7, var8 - var4);
            var4 = var8;
         }
      }
   }

   @Override
   public void method8463(Class1734 var1) {
      int var4 = 0;
      int var5 = 0;

      for (int var6 = this.field13055.length; var5 < var6; var5++) {
         int var7 = this.field13056[var6 + var5];
         int var8 = this.field13056[var5];
         Class9174 var9 = new Class9174(this.field13055[var5], var7, var7 + var8 - var4);
         if (var1.field9422 != null) {
            var1.field9422.field42127.method34281(var9);
         } else {
            var1.field9422 = var9.field42126 = var9.field42127 = var9;
         }

         var4 = var8;
      }

      var1.field9423 += (long)var4;
   }

   @Override
   public boolean method8464(int var1, Class2003 var2, int var3, int var4) {
      if (var1 >= 0 && var1 <= this.method8458() - var4) {
         for (int var7 = this.method8481(var1); var4 > 0; var7++) {
            int var8 = var7 != 0 ? this.field13056[var7 - 1] : 0;
            int var9 = this.field13056[var7] - var8;
            int var10 = Math.min(var4, var8 + var9 - var1);
            int var11 = this.field13056[this.field13055.length + var7];
            int var12 = var1 - var8 + var11;
            if (!var2.method8465(var3, this.field13055[var7], var12, var10)) {
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
   public boolean method8465(int var1, byte[] var2, int var3, int var4) {
      if (var1 >= 0 && var1 <= this.method8458() - var4 && var3 >= 0 && var3 <= var2.length - var4) {
         for (int var7 = this.method8481(var1); var4 > 0; var7++) {
            int var8 = var7 != 0 ? this.field13056[var7 - 1] : 0;
            int var9 = this.field13056[var7] - var8;
            int var10 = Math.min(var4, var8 + var9 - var1);
            int var11 = this.field13056[this.field13055.length + var7];
            int var12 = var1 - var8 + var11;
            if (!Class4676.method14650(this.field13055[var7], var12, var2, var3, var10)) {
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
   public int method8473(byte[] var1, int var2) {
      return this.method8482().method8473(var1, var2);
   }

   @Override
   public int method8477(byte[] var1, int var2) {
      return this.method8482().method8477(var1, var2);
   }

   private Class2003 method8482() {
      return new Class2003(this.method8459());
   }

   @Override
   public byte[] method8460() {
      return this.method8459();
   }

   @Override
   public boolean equals(Object var1) {
      return var1 == this
         ? true
         : var1 instanceof Class2003 && ((Class2003)var1).method8458() == this.method8458() && this.method8464(0, (Class2003)var1, 0, this.method8458());
   }

   @Override
   public int hashCode() {
      int var3 = this.field13053;
      if (var3 != 0) {
         return var3;
      } else {
         var3 = 1;
         int var4 = 0;
         int var5 = 0;

         for (int var6 = this.field13055.length; var5 < var6; var5++) {
            byte[] var7 = this.field13055[var5];
            int var8 = this.field13056[var6 + var5];
            int var9 = this.field13056[var5];
            int var10 = var9 - var4;
            int var11 = var8;

            for (int var12 = var8 + var10; var11 < var12; var11++) {
               var3 = 31 * var3 + var7[var11];
            }

            var4 = var9;
         }

         return this.field13053 = var3;
      }
   }

   @Override
   public String toString() {
      return this.method8482().toString();
   }

   private Object method8483() {
      return this.method8482();
   }
}
