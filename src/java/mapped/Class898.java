package mapped;

public abstract class Class898 extends Class901 implements Class889 {
   private static final Class9289<ItemStack> field5138 = Class9361.<ItemStack>method35441(Class898.class, Class7784.field33396);

   public Class898(Class8992<? extends Class898> var1, World var2) {
      super(var1, var2);
   }

   public Class898(Class8992<? extends Class898> var1, double var2, double var4, double var6, double var8, double var10, double var12, World var14) {
      super(var1, var2, var4, var6, var8, var10, var12, var14);
   }

   public Class898(Class8992<? extends Class898> var1, Class880 var2, double var3, double var5, double var7, World var9) {
      super(var1, var2, var3, var5, var7, var9);
   }

   public void method3526(ItemStack var1) {
      if (var1.method32107() != Class8514.field38046 || var1.method32141()) {
         this.method3210().method35446(field5138, Util.<ItemStack>method38508(var1.copy(), var0 -> var0.method32180(1)));
      }
   }

   public ItemStack method3527() {
      return this.method3210().<ItemStack>method35445(field5138);
   }

   @Override
   public ItemStack method3509() {
      ItemStack var3 = this.method3527();
      return !var3.method32105() ? var3 : new ItemStack(Class8514.field38046);
   }

   @Override
   public void method2850() {
      this.method3210().method35442(field5138, ItemStack.EMPTY);
   }

   @Override
   public void method2724(Class39 var1) {
      super.method2724(var1);
      ItemStack var4 = this.method3527();
      if (!var4.method32105()) {
         var1.method99("Item", var4.method32112(new Class39()));
      }
   }

   @Override
   public void method2723(Class39 var1) {
      super.method2723(var1);
      ItemStack var4 = ItemStack.method32104(var1.method130("Item"));
      this.method3526(var4);
   }
}
