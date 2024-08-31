package mapped;

import net.minecraft.entity.player.PlayerEntity;

public class Class5866 extends Class5839 {
   private static String[] field25635;
   public final Class8786 field25636;
   public final Class5837 field25637;

   public Class5866(Class5837 var1, Class920 var2, int var3, int var4, int var5, Class8786 var6) {
      super(var2, var3, var4, var5);
      this.field25637 = var1;
      this.field25636 = var6;
   }

   @Override
   public boolean method18259(ItemStack var1) {
      return false;
   }

   @Override
   public ItemStack method18264(PlayerEntity var1, ItemStack var2) {
      Class5837.method18254(this.field25637).method18272(1);
      Class5837.method18255(this.field25637).method18272(1);
      if (!Class5837.method18254(this.field25637).method18266() || !Class5837.method18255(this.field25637).method18266()) {
         Class5837.method18256(this.field25637).method15235(0);
      }

      this.field25636.method31716((var1x, var2x) -> {
         long var5 = var1x.method6783();
         if (Class5837.method18257(this.field25637) != var5) {
            var1x.method6742((PlayerEntity)null, var2x, Sounds.field27178, Class2266.field14732, 1.0F, 1.0F);
            Class5837.method18258(this.field25637, var5);
         }
      });
      return super.method18264(var1, var2);
   }
}
