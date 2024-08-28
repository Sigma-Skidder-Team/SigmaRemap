package mapped;

public class Class5853 extends Class5839 {
   private static String[] field25606;
   private final PlayerEntity field25607;
   private int field25608;

   public Class5853(PlayerEntity var1, Class920 var2, int var3, int var4, int var5) {
      super(var2, var3, var4, var5);
      this.field25607 = var1;
   }

   @Override
   public boolean method18259(ItemStack var1) {
      return false;
   }

   @Override
   public ItemStack method18272(int var1) {
      if (this.method18266()) {
         this.field25608 = this.field25608 + Math.min(var1, this.method18265().method32179());
      }

      return super.method18272(var1);
   }

   @Override
   public ItemStack method18264(PlayerEntity var1, ItemStack var2) {
      this.method18263(var2);
      super.method18264(var1, var2);
      return var2;
   }

   @Override
   public void method18261(ItemStack var1, int var2) {
      this.field25608 += var2;
      this.method18263(var1);
   }

   @Override
   public void method18263(ItemStack var1) {
      var1.method32136(this.field25607.field5024, this.field25607, this.field25608);
      if (!this.field25607.field5024.field9020 && this.field25578 instanceof Class924) {
         ((Class924)this.field25578).method3656(this.field25607);
      }

      this.field25608 = 0;
   }
}
