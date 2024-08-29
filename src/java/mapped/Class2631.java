package mapped;

import java.util.EnumSet;

public class Class2631 extends Class2628 {
   private static String[] field16942;
   private final Class1098 field16943;

   public Class2631(Class1098 var1, double var2, int var4) {
      super(var1, var2, var4, 6);
      this.field16943 = var1;
      this.field16937 = -2;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14659, Class2240.field14657));
   }

   @Override
   public boolean method10803() {
      return this.field16943.method4393() && !this.field16943.method4402() && !this.field16943.method5253() && super.method10803();
   }

   @Override
   public void method10804() {
      super.method10804();
      this.field16943.method4396(false);
   }

   @Override
   public int method10833(Class1046 var1) {
      return 40;
   }

   @Override
   public void method10807() {
      super.method10807();
      this.field16943.method5252(false);
   }

   @Override
   public void method10805() {
      super.method10805();
      this.field16943.method4396(false);
      if (this.method10838()) {
         if (!this.field16943.method5253()) {
            this.field16943.method5252(true);
         }
      } else {
         this.field16943.method5252(false);
      }
   }

   @Override
   public boolean method10840(Class1662 var1, BlockPos var2) {
      return var1.method7007(var2.method8311()) && var1.getBlockState(var2).getBlock().method11540(Class7645.field32770);
   }
}
