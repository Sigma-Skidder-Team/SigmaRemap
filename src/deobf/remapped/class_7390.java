package remapped;

import net.sourceforge.jaad.aac.AACException;

public class class_7390 {
   private static final int field_37740 = 32;
   private static final int field_37739 = 4;
   private static final int field_37743 = 255;
   private byte[] field_37741;
   private int field_37742;
   private int field_37737;
   public int field_37738;
   public int field_37735;

   public class_7390() {
   }

   public class_7390(byte[] var1) {
      this.method_33654(var1);
   }

   public void method_33661() {
      this.method_33651();
      this.field_37741 = null;
   }

   public final void method_33654(byte[] var1) {
      int var4 = 4 * ((var1.length + 4 - 1) / 4);
      if (this.field_37741 == null || this.field_37741.length != var4) {
         this.field_37741 = new byte[var4];
      }

      System.arraycopy(var1, 0, this.field_37741, 0, var1.length);
      this.method_33651();
   }

   public void method_33653() throws AACException {
      int var3 = this.field_37738 & 7;
      if (var3 > 0) {
         this.method_33652(var3);
      }
   }

   public final void method_33651() {
      this.field_37742 = 0;
      this.field_37738 = 0;
      this.field_37737 = 0;
      this.field_37735 = 0;
   }

   public int method_33665() {
      return this.field_37735;
   }

   public int method_33659() {
      return 8 * (this.field_37741.length - this.field_37742) + this.field_37738;
   }

   public int method_33657(boolean var1) throws AACException {
      if (this.field_37742 <= this.field_37741.length - 4) {
         int var4 = (this.field_37741[this.field_37742] & 255) << 24
            | (this.field_37741[this.field_37742 + 1] & 255) << 16
            | (this.field_37741[this.field_37742 + 2] & 255) << 8
            | this.field_37741[this.field_37742 + 3] & 255;
         if (!var1) {
            this.field_37742 += 4;
         }

         return var4;
      } else {
         throw new class_5060("end of stream", true);
      }
   }

   public int method_33662(int var1) throws AACException {
      int var6;
      if (this.field_37738 < var1) {
         this.field_37735 += var1;
         int var4 = this.field_37737 & this.method_33658(this.field_37738);
         int var5 = var1 - this.field_37738;
         this.field_37737 = this.method_33657(false);
         this.field_37738 = 32 - var5;
         var6 = this.field_37737 >> this.field_37738 & this.method_33658(var5) | var4 << var5;
      } else {
         this.field_37738 -= var1;
         var6 = this.field_37737 >> this.field_37738 & this.method_33658(var1);
         this.field_37735 += var1;
      }

      return var6;
   }

   public int method_33655() throws AACException {
      int var3;
      if (this.field_37738 <= 0) {
         this.field_37737 = this.method_33657(false);
         this.field_37738 = 31;
         this.field_37735++;
         var3 = this.field_37737 >> this.field_37738 & 1;
      } else {
         this.field_37738--;
         var3 = this.field_37737 >> this.field_37738 & 1;
         this.field_37735++;
      }

      return var3;
   }

   public boolean method_33660() throws AACException {
      return (this.method_33655() & 1) != 0;
   }

   public int method_33666(int var1) throws AACException {
      int var5;
      if (this.field_37738 < var1) {
         int var4 = this.field_37737 & this.method_33658(this.field_37738);
         var1 -= this.field_37738;
         var5 = this.method_33657(true) >> 32 - var1 & this.method_33658(var1) | var4 << var1;
      } else {
         var5 = this.field_37737 >> this.field_37738 - var1 & this.method_33658(var1);
      }

      return var5;
   }

   public int method_33656() throws AACException {
      int var4;
      if (this.field_37738 <= 0) {
         int var3 = this.method_33657(true);
         var4 = var3 >> 31 & 1;
      } else {
         var4 = this.field_37737 >> this.field_37738 - 1 & 1;
      }

      return var4;
   }

   public void method_33652(int var1) throws AACException {
      this.field_37735 += var1;
      if (var1 > this.field_37738) {
         var1 -= this.field_37738;

         while (var1 >= 32) {
            var1 -= 32;
            this.method_33657(false);
         }

         if (var1 <= 0) {
            this.field_37737 = 0;
            this.field_37738 = 0;
         } else {
            this.field_37737 = this.method_33657(false);
            this.field_37738 = 32 - var1;
         }
      } else {
         this.field_37738 -= var1;
      }
   }

   public void method_33663() throws AACException {
      this.field_37735++;
      if (this.field_37738 <= 0) {
         this.field_37737 = this.method_33657(false);
         this.field_37738 = 31;
      } else {
         this.field_37738--;
      }
   }

   public int method_33658(int var1) {
      int var4;
      if (var1 != 32) {
         var4 = (1 << var1) - 1;
      } else {
         var4 = -1;
      }

      return var4;
   }
}
