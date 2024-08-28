package mapped;

public class Class2634 extends Class2628 {
   private static String[] field16949;
   private final Class1094 field16950;
   private boolean field16951;
   private boolean field16952;

   public Class2634(Class1094 var1) {
      super(var1, 0.7F, 16);
      this.field16950 = var1;
   }

   @Override
   public boolean method10803() {
      if (this.field16930 <= 0) {
         if (!this.field16950.field5024.method6789().method17135(Class5462.field24224)) {
            return false;
         }

         this.field16952 = false;
         this.field16951 = Class1094.method5120(this.field16950);
         this.field16951 = true;
      }

      return super.method10803();
   }

   @Override
   public boolean method10806() {
      return this.field16952 && super.method10806();
   }

   @Override
   public void method10805() {
      super.method10805();
      this.field16950
         .method4227()
         .method28042(
            (double)this.field16933.method8304() + 0.5,
            (double)(this.field16933.getY() + 1),
            (double)this.field16933.method8306() + 0.5,
            10.0F,
            (float)this.field16950.method4259()
         );
      if (this.method10838()) {
         Class1655 var3 = this.field16950.field5024;
         BlockPos var4 = this.field16933.method8311();
         Class7380 var5 = var3.method6738(var4);
         Class3209 var6 = var5.method23383();
         if (this.field16952 && var6 instanceof Class3483) {
            Integer var7 = var5.<Integer>method23463(Class3483.field19334);
            if (var7 != 0) {
               var3.method6725(var4, var5.method23465(Class3483.field19334, Integer.valueOf(var7 - 1)), 2);
               var3.method6999(2001, var4, Class3209.method11535(var5));
            } else {
               var3.method6725(var4, Class8487.field36387.method11579(), 2);
               var3.method7180(var4, true, this.field16950);
            }

            Class1094.method5121(this.field16950, 40);
         }

         this.field16952 = false;
         this.field16930 = 10;
      }
   }

   @Override
   public boolean method10840(Class1662 var1, BlockPos var2) {
      Class3209 var5 = var1.method6738(var2).method23383();
      if (var5 == Class8487.field36540 && this.field16951 && !this.field16952) {
         var2 = var2.method8311();
         Class7380 var6 = var1.method6738(var2);
         var5 = var6.method23383();
         if (var5 instanceof Class3483 && ((Class3483)var5).method12179(var6)) {
            this.field16952 = true;
            return true;
         }
      }

      return false;
   }
}
