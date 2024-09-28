package mapped;

import java.util.Collection;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.Util;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.state.StateContainer;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ChatType;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class Class3339 extends Item {
   public Class3339(Properties var1) {
      super(var1);
   }

   @Override
   public boolean method11732(ItemStack var1) {
      return true;
   }

   @Override
   public boolean canPlayerBreakBlockWhileHolding(BlockState var1, World var2, BlockPos var3, PlayerEntity var4) {
      if (!var2.isRemote) {
         this.method11886(var4, var1, var2, var3, false, var4.getHeldItem(Hand.MAIN_HAND));
      }

      return false;
   }

   @Override
   public ActionResultType method11707(ItemUseContext var1) {
      PlayerEntity var4 = var1.method18358();
      World var5 = var1.method18360();
      if (!var5.isRemote && var4 != null) {
         BlockPos var6 = var1.method18345();
         this.method11886(var4, var5.getBlockState(var6), var5, var6, true, var1.method18357());
      }

      return ActionResultType.method9002(var5.isRemote);
   }

   private void method11886(PlayerEntity var1, BlockState var2, Class1660 var3, BlockPos var4, boolean var5, ItemStack var6) {
      if (var1.canUseCommandBlock()) {
         Block var9 = var2.getBlock();
         StateContainer var10 = var9.getStateContainer();
         Collection var11 = var10.method35395();
         String var12 = Registry.BLOCK.getKey(var9).toString();
         if (!var11.isEmpty()) {
            CompoundNBT var13 = var6.method32144("DebugProperty");
            String var14 = var13.getString(var12);
            Class8550 var15 = var10.method35396(var14);
            if (!var5) {
               var15 = method11888(var11, var15, var1.method2851());
               String var16 = var15.method30472();
               var13.method109(var12, var16);
               method11889(var1, new TranslationTextComponent(this.getTranslationKey() + ".select", var16, method11890(var2, var15)));
            } else {
               if (var15 == null) {
                  var15 = (Class8550)var11.iterator().next();
               }

               BlockState var18 = method11887(var2, var15, var1.method2851());
               var3.setBlockState(var4, var18, 18);
               method11889(var1, new TranslationTextComponent(this.getTranslationKey() + ".update", var15.method30472(), method11890(var18, var15)));
            }
         } else {
            method11889(var1, new TranslationTextComponent(this.getTranslationKey() + ".empty", var12));
         }
      }
   }

   private static <T extends Comparable<T>> BlockState method11887(BlockState var0, Class8550<T> var1, boolean var2) {
      return var0.with(var1, method11888(var1.method30474(), var0.get(var1), var2));
   }

   private static <T> T method11888(Iterable<T> var0, T var1, boolean var2) {
      return !var2 ? Util.<T>method38505(var0, (T)var1) : Util.<T>method38506(var0, (T)var1);
   }

   private static void method11889(PlayerEntity var0, ITextComponent var1) {
      ((ServerPlayerEntity)var0).method2802(var1, ChatType.GAME_INFO, Util.DUMMY_UUID);
   }

   private static <T extends Comparable<T>> String method11890(BlockState var0, Class8550<T> var1) {
      return var1.method30475(var0.<T>get(var1));
   }
}
