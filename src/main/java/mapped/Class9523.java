package mapped;



public class Class9523 {
   private static String[] field44323;
   public int field44324;
   public int field44325;
   public int field44326 = 0;

   public int method36791() {
      return this.field44326;
   }

   public int method36792(int var1) {
      if (var1 != 0) {
         if (this.field44326 > 32) {
            return this.field44326 - var1 >= 32
               ? this.field44325 >> this.field44326 - var1 - 32 & -1 >> 32 - var1
               : (this.field44325 & -1 >> 64 - this.field44326) << var1 - this.field44326 + 32 | this.field44324 >> this.field44326 - var1;
         } else {
            return this.field44326 < var1
               ? this.field44324 << var1 - this.field44326 & -1 >> 32 - var1
               : this.field44324 >> this.field44326 - var1 & -1 >> 32 - var1;
         }
      } else {
         return 0;
      }
   }

   public boolean method36793(int var1) {
      this.field44326 -= var1;
      boolean var4;
      if (this.field44326 >= 0) {
         var4 = true;
      } else {
         this.field44326 = 0;
         var4 = false;
      }

      return var4;
   }

   public int method36794(int var1) {
      int var4 = this.method36792(var1);
      if (!this.method36793(var1)) {
         var4 = -1;
      }

      return var4;
   }

   public int method36795() {
      int var3 = this.method36792(1);
      if (!this.method36793(1)) {
         var3 = -1;
      }

      return var3;
   }

   public void method36796() {
      if (this.field44326 != 0) {
         int[] var3 = Class6517.method19759(this.field44325, this.field44324, this.field44326);
         this.field44325 = var3[0];
         this.field44324 = var3[1];
      }
   }

   public void method36797(Class9523 var1) {
      if (var1.field44326 != 0) {
         int var4 = var1.field44324;
         int var5 = var1.field44325;
         int var6;
         int var7;
         if (this.field44326 <= 32) {
            var6 = this.field44324 & (1 << this.field44326) - 1;
            var7 = 0;
            var5 = var5 << this.field44326 | var4 >> 32 - this.field44326;
            var4 <<= this.field44326;
         } else {
            var6 = this.field44324;
            var7 = this.field44325 & (1 << this.field44326 - 32) - 1;
            var5 = var4 << this.field44326 - 32;
            var4 = 0;
         }

         this.field44324 = var6 | var4;
         this.field44325 = var7 | var5;
         this.field44326 = this.field44326 + var1.field44326;
      }
   }

   public void method36798(int var1, Class9189 var2) throws Class2460 {
      this.field44326 = var1;
      if (var1 <= 32) {
         this.field44324 = var2.method34397(var1);
         this.field44325 = 0;
      } else {
         this.field44325 = var2.method34397(var1 - 32);
         this.field44324 = var2.method34397(32);
      }
   }
}
