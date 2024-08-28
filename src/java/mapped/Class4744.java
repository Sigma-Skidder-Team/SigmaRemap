package mapped;



public class Class4744 extends Class4743 {
   private static String[] field22496;
   public float field22507;

   public Class4744(int var1) {
      super(var1);
   }

   @Override
   public void method14883(Class2443 var1, Class7413 var2, Class8428 var3) throws Class2438 {
      super.method14883(var1, var2, var3);
   }

   @Override
   public void method14885(Class2443 var1, Class7413 var2) {
      if (this.field22501 != 0) {
         this.field22502 = field22495[var1.method10451(6)];
         this.field22507 = field22495[var1.method10451(6)];
      }
   }

   @Override
   public boolean method14886(Class2443 var1) {
      return super.method14886(var1);
   }

   @Override
   public boolean method14887(int var1, Class7870 var2, Class7870 var3) {
      if (this.field22501 != 0) {
         this.field22504 = this.field22504 * this.field22505 + this.field22506;
         if (var1 != 0) {
            if (var1 != 1) {
               float var6 = this.field22504 * this.field22507;
               var2.method26365(var6, this.field22499);
            } else {
               float var8 = this.field22504 * this.field22502;
               var2.method26365(var8, this.field22499);
            }
         } else {
            float var9 = this.field22504 * this.field22502;
            float var7 = this.field22504 * this.field22507;
            var2.method26365(var9, this.field22499);
            var3.method26365(var7, this.field22499);
         }
      }

      return true;
   }
}
