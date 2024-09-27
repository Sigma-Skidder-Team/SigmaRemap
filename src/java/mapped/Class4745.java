package mapped;

public class Class4745 extends Class4743 {
   private static String[] field22496;
   public int field22508;
   public float field22509;
   public int field22510;
   public float field22511;
   public float field22512;
   public float field22513;

   public Class4745(int var1) {
      super(var1);
   }

   @Override
   public void method14883(Class2443 var1, Class7413 var2, Class8428 var3) throws Class2438 {
      this.field22501 = var1.method10451(4);
      this.field22508 = var1.method10451(4);
      if (var3 != null) {
         var3.method29609(this.field22501, 4);
         var3.method29609(this.field22508, 4);
      }

      if (this.field22501 != 0) {
         this.field22503 = this.field22501 + 1;
         this.field22505 = field22497[this.field22501];
         this.field22506 = field22498[this.field22501];
      }

      if (this.field22508 != 0) {
         this.field22510 = this.field22508 + 1;
         this.field22512 = field22497[this.field22508];
         this.field22513 = field22498[this.field22508];
      }
   }

   @Override
   public void method14885(Class2443 var1, Class7413 var2) {
      if (this.field22501 != 0) {
         this.field22502 = field22495[var1.method10451(6)];
      }

      if (this.field22508 != 0) {
         this.field22509 = field22495[var1.method10451(6)];
      }
   }

   @Override
   public boolean method14886(Class2443 var1) {
      boolean var4 = super.method14886(var1);
      if (this.field22508 != 0) {
         this.field22511 = (float)var1.method10451(this.field22510);
      }

      return var4;
   }

   @Override
   public boolean method14887(int var1, Class7870 var2, Class7870 var3) {
      super.method14887(var1, var2, var3);
      if (this.field22508 != 0 && var1 != 1) {
         float var6 = (this.field22511 * this.field22512 + this.field22513) * this.field22509;
         if (var1 != 0) {
            var2.method26365(var6, this.field22499);
         } else {
            var3.method26365(var6, this.field22499);
         }
      }

      return true;
   }
}
