package mapped;

public abstract class Class6217 extends Class6218 {
   @Override
   public ItemStack method19192(Class2956 var1, ItemStack var2) {
      ServerWorld var5 = var1.method11326();
      Class2955 var6 = Class3357.method11934(var1);
      Direction var7 = var1.method11324().<Direction>method23463(Class3357.field18899);
      Class882 var8 = this.method19191(var5, var6, var2);
      var8.method3462((double)var7.method539(), (double)((float)var7.method540() + 0.1F), (double)var7.method541(), this.method19195(), this.method19194());
      var5.method6916(var8);
      var2.method32182(1);
      return var2;
   }

   @Override
   public void method19193(Class2956 var1) {
      var1.method11326().playEvent(1002, var1.method11323(), 0);
   }

   public abstract Class882 method19191(World var1, Class2955 var2, ItemStack var3);

   public float method19194() {
      return 6.0F;
   }

   public float method19195() {
      return 1.1F;
   }
}
