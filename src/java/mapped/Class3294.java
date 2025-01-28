package mapped;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ScaffoldingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.util.Util;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.network.play.server.SChatPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class Class3294 extends BlockItem {
   public Class3294(Block var1, Properties var2) {
      super(var1, var2);
   }

   @Nullable
   @Override
   public BlockItemUseContext method11836(BlockItemUseContext var1) {
      BlockPos var4 = var1.getPos();
      World var5 = var1.getWorld();
      BlockState var6 = var5.getBlockState(var4);
      Block var7 = this.method11845();
      if (!var6.isIn(var7)) {
         return ScaffoldingBlock.method12085(var5, var4) != 7 ? var1 : null;
      } else {
         Direction var8;
         if (!var1.method18351()) {
            var8 = var1.getFace() != Direction.UP ? Direction.UP : var1.getPlacementHorizontalFacing();
         } else {
            var8 = !var1.method18356() ? var1.getFace() : var1.getFace().getOpposite();
         }

         int var9 = 0;
         BlockPos.Mutable var10 = var4.method8354().method8379(var8);

         while (var9 < 7) {
            if (!var5.isRemote && !World.isValid(var10)) {
               PlayerEntity var11 = var1.method18358();
               int var12 = var5.method7034();
               if (var11 instanceof ServerPlayerEntity && var10.getY() >= var12) {
                  SChatPacket var13 = new SChatPacket(
                     new TranslationTextComponent("build.tooHigh", var12).mergeStyle(TextFormatting.RED), ChatType.GAME_INFO, Util.DUMMY_UUID
                  );
                  ((ServerPlayerEntity)var11).connection.sendPacket(var13);
               }
               break;
            }

            var6 = var5.getBlockState(var10);
            if (!var6.isIn(this.method11845())) {
               if (var6.method23441(var1)) {
                  return BlockItemUseContext.method18344(var1, var10, var8);
               }
               break;
            }

            var10.method8379(var8);
            if (var8.getAxis().isHorizontal()) {
               var9++;
            }
         }

         return null;
      }
   }

   @Override
   public boolean method11842() {
      return false;
   }
}
