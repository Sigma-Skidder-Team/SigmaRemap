package remapped;

import net.sourceforge.jaad.aac.AACException;

public class class_8707 {
   private static String[] field_44639;
   public int field_44641;
   public int field_44638;
   public int field_44640 = 0;

   public int method_40013() {
      return this.field_44640;
   }

   public int method_40008(int var1) {
      if (var1 != 0) {
         if (this.field_44640 > 32) {
            return this.field_44640 - var1 >= 32
               ? this.field_44638 >> this.field_44640 - var1 - 32 & -1 >> 32 - var1
               : (this.field_44638 & -1 >> 64 - this.field_44640) << var1 - this.field_44640 + 32 | this.field_44641 >> this.field_44640 - var1;
         } else {
            return this.field_44640 < var1
               ? this.field_44641 << var1 - this.field_44640 & -1 >> 32 - var1
               : this.field_44641 >> this.field_44640 - var1 & -1 >> 32 - var1;
         }
      } else {
         return 0;
      }
   }

   public boolean method_40007(int var1) {
      this.field_44640 -= var1;
      boolean var4;
      if (this.field_44640 >= 0) {
         var4 = true;
      } else {
         this.field_44640 = 0;
         var4 = false;
      }

      return var4;
   }

   public int method_40012(int var1) {
      int var4 = this.method_40008(var1);
      if (!this.method_40007(var1)) {
         var4 = -1;
      }

      return var4;
   }

   public int method_40009() {
      int var3 = this.method_40008(1);
      if (!this.method_40007(1)) {
         var3 = -1;
      }

      return var3;
   }

   public void method_40006() {
      if (this.field_44640 != 0) {
         int[] var3 = class_9028.method_41411(this.field_44638, this.field_44641, this.field_44640);
         this.field_44638 = var3[0];
         this.field_44641 = var3[1];
      }
   }

   public void method_40011(class_8707 var1) {
      if (var1.field_44640 != 0) {
         int var4 = var1.field_44641;
         int var5 = var1.field_44638;
         int var6;
         int var7;
         if (this.field_44640 <= 32) {
            var6 = this.field_44641 & (1 << this.field_44640) - 1;
            var7 = 0;
            var5 = var5 << this.field_44640 | var4 >> 32 - this.field_44640;
            var4 <<= this.field_44640;
         } else {
            var6 = this.field_44641;
            var7 = this.field_44638 & (1 << this.field_44640 - 32) - 1;
            var5 = var4 << this.field_44640 - 32;
            var4 = 0;
         }

         this.field_44641 = var6 | var4;
         this.field_44638 = var7 | var5;
         this.field_44640 = this.field_44640 + var1.field_44640;
      }
   }

   public void method_40010(int var1, class_7390 var2) throws AACException {
      this.field_44640 = var1;
      if (var1 <= 32) {
         this.field_44641 = var2.method_33662(var1);
         this.field_44638 = 0;
      } else {
         this.field_44638 = var2.method_33662(var1 - 32);
         this.field_44641 = var2.method_33662(32);
      }
   }
}
