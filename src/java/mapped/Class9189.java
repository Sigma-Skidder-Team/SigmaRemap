package mapped;



public class Class9189 {
   private static final int field42198 = 32;
   private static final int field42199 = 4;
   private static final int field42200 = 255;
   private byte[] field42201;
   private int field42202;
   private int field42203;
   public int field42204;
   public int field42205;

   public Class9189() {
   }

   public Class9189(byte[] var1) {
      this.setData(var1);
   }

   public void method34390() {
      this.method34393();
      this.field42201 = null;
   }

   public final void setData(byte[] var1) {
      int var4 = 4 * ((var1.length + 4 - 1) / 4);
      if (this.field42201 == null || this.field42201.length != var4) {
         this.field42201 = new byte[var4];
      }

      System.arraycopy(var1, 0, this.field42201, 0, var1.length);
      this.method34393();
   }

   public void method34392() throws AACException {
      int var3 = this.field42204 & 7;
      if (var3 > 0) {
         this.method34402(var3);
      }
   }

   public final void method34393() {
      this.field42202 = 0;
      this.field42204 = 0;
      this.field42203 = 0;
      this.field42205 = 0;
   }

   public int method34394() {
      return this.field42205;
   }

   public int method34395() {
      return 8 * (this.field42201.length - this.field42202) + this.field42204;
   }

   public int method34396(boolean var1) throws AACException {
      if (this.field42202 <= this.field42201.length - 4) {
         int var4 = (this.field42201[this.field42202] & 255) << 24
            | (this.field42201[this.field42202 + 1] & 255) << 16
            | (this.field42201[this.field42202 + 2] & 255) << 8
            | this.field42201[this.field42202 + 3] & 255;
         if (!var1) {
            this.field42202 += 4;
         }

         return var4;
      } else {
         throw new AACException("end of stream", true);
      }
   }

   public int method34397(int var1) throws AACException {
      int var6;
      if (this.field42204 < var1) {
         this.field42205 += var1;
         int var4 = this.field42203 & this.method34404(this.field42204);
         int var5 = var1 - this.field42204;
         this.field42203 = this.method34396(false);
         this.field42204 = 32 - var5;
         var6 = this.field42203 >> this.field42204 & this.method34404(var5) | var4 << var5;
      } else {
         this.field42204 -= var1;
         var6 = this.field42203 >> this.field42204 & this.method34404(var1);
         this.field42205 += var1;
      }

      return var6;
   }

   public int method34398() throws AACException {
      int var3;
      if (this.field42204 <= 0) {
         this.field42203 = this.method34396(false);
         this.field42204 = 31;
         this.field42205++;
         var3 = this.field42203 >> this.field42204 & 1;
      } else {
         this.field42204--;
         var3 = this.field42203 >> this.field42204 & 1;
         this.field42205++;
      }

      return var3;
   }

   public boolean method34399() throws AACException {
      return (this.method34398() & 1) != 0;
   }

   public int method34400(int var1) throws AACException {
      int var5;
      if (this.field42204 < var1) {
         int var4 = this.field42203 & this.method34404(this.field42204);
         var1 -= this.field42204;
         var5 = this.method34396(true) >> 32 - var1 & this.method34404(var1) | var4 << var1;
      } else {
         var5 = this.field42203 >> this.field42204 - var1 & this.method34404(var1);
      }

      return var5;
   }

   public int method34401() throws AACException {
      int var4;
      if (this.field42204 <= 0) {
         int var3 = this.method34396(true);
         var4 = var3 >> 31 & 1;
      } else {
         var4 = this.field42203 >> this.field42204 - 1 & 1;
      }

      return var4;
   }

   public void method34402(int var1) throws AACException {
      this.field42205 += var1;
      if (var1 > this.field42204) {
         var1 -= this.field42204;

         while (var1 >= 32) {
            var1 -= 32;
            this.method34396(false);
         }

         if (var1 <= 0) {
            this.field42203 = 0;
            this.field42204 = 0;
         } else {
            this.field42203 = this.method34396(false);
            this.field42204 = 32 - var1;
         }
      } else {
         this.field42204 -= var1;
      }
   }

   public void method34403() throws AACException {
      this.field42205++;
      if (this.field42204 <= 0) {
         this.field42203 = this.method34396(false);
         this.field42204 = 31;
      } else {
         this.field42204--;
      }
   }

   public int method34404(int var1) {
      int var4;
      if (var1 != 32) {
         var4 = (1 << var1) - 1;
      } else {
         var4 = -1;
      }

      return var4;
   }
}
