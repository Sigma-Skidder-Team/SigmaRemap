package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class Class5840 extends Class5839 {
   private static String[] field25582;

   public Class5840(Class920 var1, int var2, int var3, int var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public boolean method18259(ItemStack var1) {
      return method18275(var1);
   }

   @Override
   public int method18269() {
      return 1;
   }

   @Override
   public ItemStack method18264(PlayerEntity var1, ItemStack var2) {
      Class8812 var5 = Class9741.method38185(var2);
      if (var1 instanceof ServerPlayerEntity) {
         CriteriaTriggers.field44475.method15071((ServerPlayerEntity)var1, var5);
      }

      super.method18264(var1, var2);
      return var2;
   }

   public static boolean method18275(ItemStack var0) {
      Item var3 = var0.getItem();
      return var3 == Items.field37971 || var3 == Items.field38115 || var3 == Items.field38118 || var3 == Items.field37972;
   }
}
