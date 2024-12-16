package mapped;

import java.util.Random;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class Class3289 extends Item {
   private static String[] field18800;

   public Class3289(Properties var1) {
      super(var1);
   }

   @Override
   public ActionResultType onItemUse(ItemUseContext var1) {
      Direction var4 = var1.getFace();
      if (var4 != Direction.DOWN) {
         World var5 = var1.getWorld();
         BlockItemUseContext var6 = new BlockItemUseContext(var1);
         BlockPos var7 = var6.getPos();
         ItemStack var8 = var1.method18357();
         Vector3d var9 = Vector3d.method11330(var7);
         AxisAlignedBB var10 = EntityType.ARMOR_STAND.getSize().method32098(var9.getX(), var9.getY(), var9.getZ());
         if (var5.method7054((Entity)null, var10, var0 -> true) && var5.method7181((Entity)null, var10).isEmpty()) {
            if (var5 instanceof ServerWorld) {
               ServerWorld var11 = (ServerWorld)var5;
               ArmorStandEntity var12 = EntityType.ARMOR_STAND
                  .method33202(var11, var8.getTag(), (ITextComponent)null, var1.method18358(), var7, Class2202.field14403, true, true);
               if (var12 == null) {
                  return ActionResultType.FAIL;
               }

               var11.method6995(var12);
               float var13 = (float) MathHelper.floor((MathHelper.wrapDegrees(var1.method18352() - 180.0F) + 22.5F) / 45.0F) * 45.0F;
               var12.setLocationAndAngles(var12.getPosX(), var12.getPosY(), var12.getPosZ(), var13, 0.0F);
               this.method11828(var12, var5.rand);
               var5.addEntity(var12);
               var5.playSound(
                  (PlayerEntity)null, var12.getPosX(), var12.getPosY(), var12.getPosZ(), SoundEvents.field26360, SoundCategory.field14732, 0.75F, 0.8F
               );
            }

            var8.shrink(1);
            return ActionResultType.method9002(var5.isRemote);
         } else {
            return ActionResultType.FAIL;
         }
      } else {
         return ActionResultType.FAIL;
      }
   }

   private void method11828(ArmorStandEntity var1, Random var2) {
      Class7087 var5 = var1.method4211();
      float var6 = var2.nextFloat() * 5.0F;
      float var7 = var2.nextFloat() * 20.0F - 10.0F;
      Class7087 var8 = new Class7087(var5.method22013() + var6, var5.method22014() + var7, var5.method22015());
      var1.method4205(var8);
      var5 = var1.method4212();
      var6 = var2.nextFloat() * 10.0F - 5.0F;
      var8 = new Class7087(var5.method22013(), var5.method22014() + var6, var5.method22015());
      var1.method4206(var8);
   }
}
