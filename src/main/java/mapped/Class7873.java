package mapped;

import java.util.Arrays;

public class Class7873 {
   private final byte[] field33739;

   public Class7873(int var1) {
      if (var1 != 0 && var1 % 2 == 0) {
         this.field33739 = new byte[var1 / 2];
      } else {
         throw new IllegalArgumentException("Length of nibble array must be a positive number dividable by 2!");
      }
   }

   public Class7873(byte[] var1) {
      if (var1.length != 0 && var1.length % 2 == 0) {
         this.field33739 = var1;
      } else {
         throw new IllegalArgumentException("Length of nibble array must be a positive number dividable by 2!");
      }
   }

   public byte method26402(int var1, int var2, int var3) {
      return this.method26403(Class8225.method28646(var1, var2, var3));
   }

   public byte method26403(int var1) {
      byte var4 = this.field33739[var1 / 2];
      return var1 % 2 != 0 ? (byte)(var4 >> 4 & 15) : (byte)(var4 & 15);
   }

   public void method26404(int var1, int var2, int var3, int var4) {
      this.method26405(Class8225.method28646(var1, var2, var3), var4);
   }

   public void method26405(int var1, int var2) {
      if (var1 % 2 != 0) {
         var1 /= 2;
         this.field33739[var1] = (byte)(this.field33739[var1] & 15 | (var2 & 15) << 4);
      } else {
         var1 /= 2;
         this.field33739[var1] = (byte)(this.field33739[var1] & 240 | var2 & 15);
      }
   }

   public int method26406() {
      return this.field33739.length * 2;
   }

   public int method26407() {
      return this.field33739.length;
   }

   public void method26408(byte var1) {
      var1 = (byte)(var1 & 15);
      Arrays.fill(this.field33739, (byte)(var1 << 4 | var1));
   }

   public byte[] method26409() {
      return this.field33739;
   }

   public void method26410(byte[] var1) {
      if (var1.length == this.field33739.length) {
         System.arraycopy(var1, 0, this.field33739, 0, var1.length);
      } else {
         throw new IllegalArgumentException("Length of handle must equal to size of nibble array!");
      }
   }
}
