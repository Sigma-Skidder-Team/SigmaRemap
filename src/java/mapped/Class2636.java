package mapped;

public class Class2636 extends Class2628 {
   private static String[] field16955;
   public int field16956;
   public final Class1095 field16957;

   public Class2636(Class1095 var1, double var2, int var4, int var5) {
      super(var1, var2, var4, var5);
      this.field16957 = var1;
   }

   @Override
   public double method10835() {
      return 2.0;
   }

   @Override
   public boolean method10837() {
      return this.field16931 % 100 == 0;
   }

   @Override
   public boolean method10840(Class1662 var1, BlockPos var2) {
      Class7380 var5 = var1.method6738(var2);
      return var5.method23448(Blocks.field37069) && var5.<Integer>method23463(Class3484.field19342) >= 2;
   }

   @Override
   public void method10805() {
      if (!this.method10838()) {
         if (!this.method10838() && Class1095.method5164(this.field16957).nextFloat() < 0.05F) {
            this.field16957.method2863(Class6067.field26596, 1.0F, 1.0F);
         }
      } else if (this.field16956 < 40) {
         this.field16956++;
      } else {
         this.method10845();
      }

      super.method10805();
   }

   public void method10845() {
      if (this.field16957.field5024.method6789().method17135(Class5462.field24224)) {
         Class7380 var3 = this.field16957.field5024.method6738(this.field16933);
         if (var3.method23448(Blocks.field37069)) {
            int var4 = var3.<Integer>method23463(Class3484.field19342);
            var3.method23465(Class3484.field19342, Integer.valueOf(1));
            int var5 = 1 + this.field16957.field5024.field9016.nextInt(2) + (var4 != 3 ? 0 : 1);
            ItemStack var6 = this.field16957.method2943(Class2106.field13731);
            if (var6.method32105()) {
               this.field16957.method2944(Class2106.field13731, new ItemStack(Class8514.field38170));
               var5--;
            }

            if (var5 > 0) {
               Block.method11557(this.field16957.field5024, this.field16933, new ItemStack(Class8514.field38170, var5));
            }

            this.field16957.method2863(Class6067.field27144, 1.0F, 1.0F);
            this.field16957.field5024.method6725(this.field16933, var3.method23465(Class3484.field19342, Integer.valueOf(1)), 2);
         }
      }
   }

   @Override
   public boolean method10803() {
      return !this.field16957.isSleeping() && super.method10803();
   }

   @Override
   public void method10804() {
      this.field16956 = 0;
      this.field16957.method5130(false);
      super.method10804();
   }
}