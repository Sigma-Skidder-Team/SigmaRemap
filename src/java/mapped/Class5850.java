package mapped;

import net.minecraft.entity.player.PlayerEntity;

public class Class5850 extends Class5839 {
   private static String[] field25599;
   public final Class8786 field25600;
   public final Class5811 field25601;

   public Class5850(Class5811 var1, Class920 var2, int var3, int var4, int var5, Class8786 var6) {
      super(var2, var3, var4, var5);
      this.field25601 = var1;
      this.field25600 = var6;
   }

   @Override
   public boolean method18259(ItemStack var1) {
      return false;
   }

   @Override
   public ItemStack method18264(PlayerEntity var1, ItemStack var2) {
      var2.method32136(var1.world, var1, var2.getCount());
      Class5811.method18117(this.field25601).method3638(var1);
      ItemStack var5 = this.field25601.field25462.method18272(1);
      if (!var5.isEmpty()) {
         Class5811.method18118(this.field25601);
      }

      this.field25600.method31716((var1x, var2x) -> {
         long var5x = var1x.method6783();
         if (Class5811.method18119(this.field25601) != var5x) {
            var1x.method6742((PlayerEntity)null, var2x, Sounds.field27180, Class2266.field14732, 1.0F, 1.0F);
            Class5811.method18120(this.field25601, var5x);
         }
      });
      return super.method18264(var1, var2);
   }
}
