package mapped;

public abstract class Class890 extends Class893 implements Class889 {
   private static final Class9289<ItemStack> field5126 = Class9361.<ItemStack>method35441(Class890.class, Class7784.field33396);

   public Class890(Class8992<? extends Class890> var1, Class1655 var2) {
      super(var1, var2);
   }

   public Class890(Class8992<? extends Class890> var1, double var2, double var4, double var6, Class1655 var8) {
      super(var1, var2, var4, var6, var8);
   }

   public Class890(Class8992<? extends Class890> var1, Class880 var2, Class1655 var3) {
      super(var1, var2, var3);
   }

   public void method3511(ItemStack var1) {
      if (var1.method32107() != this.method3512() || var1.method32141()) {
         this.method3210().method35446(field5126, Util.<ItemStack>method38508(var1.copy(), var0 -> var0.method32180(1)));
      }
   }

   public abstract Class3257 method3512();

   public ItemStack method3513() {
      return this.method3210().<ItemStack>method35445(field5126);
   }

   @Override
   public ItemStack method3509() {
      ItemStack var3 = this.method3513();
      return !var3.method32105() ? var3 : new ItemStack(this.method3512());
   }

   @Override
   public void method2850() {
      this.method3210().method35442(field5126, ItemStack.EMPTY);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      ItemStack var4 = this.method3513();
      if (!var4.method32105()) {
         var1.method99("Item", var4.method32112(new Class39()));
      }
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      ItemStack var4 = ItemStack.method32104(var1.method130("Item"));
      this.method3511(var4);
   }
}
