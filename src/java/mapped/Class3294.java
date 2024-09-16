package mapped;

import javax.annotation.Nullable;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.Util;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.play.server.SChatPacket;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class Class3294 extends Class3292 {
   public Class3294(Block var1, Class5643 var2) {
      super(var1, var2);
   }

   @Nullable
   @Override
   public Class5909 method11836(Class5909 var1) {
      BlockPos var4 = var1.method18345();
      World var5 = var1.method18360();
      BlockState var6 = var5.getBlockState(var4);
      Block var7 = this.method11845();
      if (!var6.isIn(var7)) {
         return Class3428.method12085(var5, var4) != 7 ? var1 : null;
      } else {
         Direction var8;
         if (!var1.method18351()) {
            var8 = var1.method18354() != Direction.field673 ? Direction.field673 : var1.method18350();
         } else {
            var8 = !var1.method18356() ? var1.method18354() : var1.method18354().method536();
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
                  ((ServerPlayerEntity)var11).field4855.sendPacket(var13);
               }
               break;
            }

            var6 = var5.getBlockState(var10);
            if (!var6.isIn(this.method11845())) {
               if (var6.method23441(var1)) {
                  return Class5909.method18344(var1, var10, var8);
               }
               break;
            }

            var10.method8379(var8);
            if (var8.getAxis().method324()) {
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
