package mapped;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;

public class Class5850 extends Slot {
   private static String[] field25599;
   public final IWorldPosCallable field25600;
   public final Class5811 field25601;

   public Class5850(Class5811 var1, IInventory var2, int var3, int var4, int var5, IWorldPosCallable var6) {
      super(var2, var3, var4, var5);
      this.field25601 = var1;
      this.field25600 = var6;
   }

   @Override
   public boolean isItemValid(ItemStack var1) {
      return false;
   }

   @Override
   public ItemStack onTake(PlayerEntity var1, ItemStack var2) {
      var2.method32136(var1.world, var1, var2.getCount());
      Class5811.method18117(this.field25601).method3638(var1);
      ItemStack var5 = this.field25601.field25462.decrStackSize(1);
      if (!var5.isEmpty()) {
         Class5811.method18118(this.field25601);
      }

      this.field25600.method31716((var1x, var2x) -> {
         long var5x = var1x.getGameTime();
         if (Class5811.method18119(this.field25601) != var5x) {
            var1x.method6742((PlayerEntity)null, var2x, SoundEvents.field27180, SoundCategory.field14732, 1.0F, 1.0F);
            Class5811.method18120(this.field25601, var5x);
         }
      });
      return super.onTake(var1, var2);
   }
}
