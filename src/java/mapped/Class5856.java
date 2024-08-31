package mapped;

import net.minecraft.entity.player.PlayerEntity;

public class Class5856 extends Class5839 {
   private static String[] field25612;
   private final Class926 field25613;
   private final PlayerEntity field25614;
   private int field25615;

   public Class5856(PlayerEntity var1, Class926 var2, Class920 var3, int var4, int var5, int var6) {
      super(var3, var4, var5, var6);
      this.field25614 = var1;
      this.field25613 = var2;
   }

   @Override
   public boolean method18259(ItemStack var1) {
      return false;
   }

   @Override
   public ItemStack method18272(int var1) {
      if (this.method18266()) {
         this.field25615 = this.field25615 + Math.min(var1, this.method18265().getCount());
      }

      return super.method18272(var1);
   }

   @Override
   public void method18261(ItemStack var1, int var2) {
      this.field25615 += var2;
      this.method18263(var1);
   }

   @Override
   public void method18262(int var1) {
      this.field25615 += var1;
   }

   @Override
   public void method18263(ItemStack var1) {
      if (this.field25615 > 0) {
         var1.method32136(this.field25614.world, this.field25614, this.field25615);
      }

      if (this.field25578 instanceof Class923) {
         ((Class923)this.field25578).method3638(this.field25614);
      }

      this.field25615 = 0;
   }

   @Override
   public ItemStack method18264(PlayerEntity var1, ItemStack var2) {
      this.method18263(var2);
      NonNullList var5 = var1.world.method6816().method1034(Class7207.field30935, this.field25613, var1.world);

      for (int var6 = 0; var6 < var5.size(); var6++) {
         ItemStack var7 = this.field25613.method3618(var6);
         ItemStack var8 = (ItemStack)var5.get(var6);
         if (!var7.isEmpty()) {
            this.field25613.method3619(var6, 1);
            var7 = this.field25613.method3618(var6);
         }

         if (!var8.isEmpty()) {
            if (!var7.isEmpty()) {
               if (ItemStack.method32130(var7, var8) && ItemStack.method32127(var7, var8)) {
                  var8.method32181(var7.getCount());
                  this.field25613.method3621(var6, var8);
               } else if (!this.field25614.inventory.method4045(var8)) {
                  this.field25614.method2882(var8, false);
               }
            } else {
               this.field25613.method3621(var6, var8);
            }
         }
      }

      return var2;
   }
}
