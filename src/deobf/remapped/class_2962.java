package remapped;

import java.util.Arrays;

public class class_2962 {
   private final byte[] field_14457;

   public class_2962(int var1) {
      if (var1 != 0 && var1 % 2 == 0) {
         this.field_14457 = new byte[var1 / 2];
      } else {
         throw new IllegalArgumentException("Length of nibble array must be a positive number dividable by 2!");
      }
   }

   public class_2962(byte[] var1) {
      if (var1.length != 0 && var1.length % 2 == 0) {
         this.field_14457 = var1;
      } else {
         throw new IllegalArgumentException("Length of nibble array must be a positive number dividable by 2!");
      }
   }

   public byte method_13550(int var1, int var2, int var3) {
      return this.method_13549(class_3929.method_18169(var1, var2, var3));
   }

   public byte method_13549(int var1) {
      byte var4 = this.field_14457[var1 / 2];
      return var1 % 2 != 0 ? (byte)(var4 >> 4 & 15) : (byte)(var4 & 15);
   }

   public void method_13548(int var1, int var2, int var3, int var4) {
      this.method_13547(class_3929.method_18169(var1, var2, var3), var4);
   }

   public void method_13547(int var1, int var2) {
      if (var1 % 2 != 0) {
         var1 /= 2;
         this.field_14457[var1] = (byte)(this.field_14457[var1] & 15 | (var2 & 15) << 4);
      } else {
         var1 /= 2;
         this.field_14457[var1] = (byte)(this.field_14457[var1] & 240 | var2 & 15);
      }
   }

   public int method_13544() {
      return this.field_14457.length * 2;
   }

   public int method_13542() {
      return this.field_14457.length;
   }

   public void method_13546(byte var1) {
      var1 = (byte)(var1 & 15);
      Arrays.fill(this.field_14457, (byte)(var1 << 4 | var1));
   }

   public byte[] method_13543() {
      return this.field_14457;
   }

   public void method_13551(byte[] var1) {
      if (var1.length == this.field_14457.length) {
         System.arraycopy(var1, 0, this.field_14457, 0, var1.length);
      } else {
         throw new IllegalArgumentException("Length of handle must equal to size of nibble array!");
      }
   }
}
