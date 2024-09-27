package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class3312 extends Item {
   private static String[] field18821;
   private final EntityType<? extends Class995> field18822;

   public Class3312(EntityType<? extends Class995> var1, Properties var2) {
      super(var2);
      this.field18822 = var1;
   }

   @Override
   public ActionResultType method11707(ItemUseContext var1) {
      BlockPos var4 = var1.method18345();
      Direction var5 = var1.method18354();
      BlockPos var6 = var4.method8349(var5);
      PlayerEntity var7 = var1.method18358();
      ItemStack var8 = var1.method18357();
      if (var7 != null && !this.method11857(var7, var5, var8, var6)) {
         return ActionResultType.FAIL;
      } else {
         World var9 = var1.method18360();
         Object var10;
         if (this.field18822 != EntityType.field41060) {
            if (this.field18822 != EntityType.field41043) {
               return ActionResultType.method9002(var9.isRemote);
            }

            var10 = new ItemFrameEntity(var9, var6, var5);
         } else {
            var10 = new PaintingEntity(var9, var6, var5);
         }

         CompoundNBT var11 = var8.method32142();
         if (var11 != null) {
            EntityType.method33204(var9, var7, (Entity)var10, var11);
         }

         if (!((Class995)var10).method4080()) {
            return ActionResultType.field14819;
         } else {
            if (!var9.isRemote) {
               ((Class995)var10).method4084();
               var9.addEntity((Entity)var10);
            }

            var8.shrink(1);
            return ActionResultType.method9002(var9.isRemote);
         }
      }
   }

   public boolean method11857(PlayerEntity var1, Direction var2, ItemStack var3, BlockPos var4) {
      return !var2.getAxis().method323() && var1.method2936(var4, var2, var3);
   }
}
