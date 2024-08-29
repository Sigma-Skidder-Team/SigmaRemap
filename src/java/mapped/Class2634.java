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
         if (!this.field16950.world.method6789().method17135(Class5462.field24224)) {
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
            (double)this.field16933.getX() + 0.5,
            (double)(this.field16933.getY() + 1),
            (double)this.field16933.getZ() + 0.5,
            10.0F,
            (float)this.field16950.method4259()
         );
      if (this.method10838()) {
         World var3 = this.field16950.world;
         BlockPos var4 = this.field16933.up();
         BlockState var5 = var3.getBlockState(var4);
         Block var6 = var5.getBlock();
         if (this.field16952 && var6 instanceof Class3483) {
            Integer var7 = var5.<Integer>method23463(Class3483.field19334);
            if (var7 != 0) {
               var3.setBlockState(var4, var5.method23465(Class3483.field19334, Integer.valueOf(var7 - 1)), 2);
               var3.playEvent(2001, var4, Block.getStateId(var5));
            } else {
               var3.setBlockState(var4, Blocks.AIR.method11579(), 2);
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
      Block var5 = var1.getBlockState(var2).getBlock();
      if (var5 == Blocks.FARMLAND && this.field16951 && !this.field16952) {
         var2 = var2.up();
         BlockState var6 = var1.getBlockState(var2);
         var5 = var6.getBlock();
         if (var5 instanceof Class3483 && ((Class3483)var5).method12179(var6)) {
            this.field16952 = true;
            return true;
         }
      }

      return false;
   }
}
