package mapped;

public class Class975 extends Class927 implements Class930 {
   private static String[] field5260;
   private final BlockState field5447;
   private final Class1660 field5448;
   private final BlockPos field5449;
   private boolean field5450;

   public Class975(BlockState var1, Class1660 var2, BlockPos var3) {
      super(1);
      this.field5447 = var1;
      this.field5448 = var2;
      this.field5449 = var3;
   }

   @Override
   public int method3630() {
      return 1;
   }

   @Override
   public int[] method3653(Direction var1) {
      return var1 != Direction.field673 ? new int[0] : new int[]{0};
   }

   @Override
   public boolean method3654(int var1, ItemStack var2, Direction var3) {
      return !this.field5450 && var3 == Direction.field673 && Class3475.field19327.containsKey(var2.getItem());
   }

   @Override
   public boolean method3655(int var1, ItemStack var2, Direction var3) {
      return false;
   }

   @Override
   public void method3622() {
      ItemStack var3 = this.method3618(0);
      if (!var3.isEmpty()) {
         this.field5450 = true;
         BlockState var4 = Class3475.method12172(this.field5447, this.field5448, this.field5449, var3);
         this.field5448.method6999(1500, this.field5449, var4 == this.field5447 ? 0 : 1);
         this.method3620(0);
      }
   }
}
