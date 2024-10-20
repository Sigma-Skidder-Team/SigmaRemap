package mapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class Class3318 extends Item {
   public Class3318(Properties var1) {
      super(var1);
   }

   @Override
   public ActionResultType onItemUse(ItemUseContext var1) {
      World var4 = var1.getWorld();
      if (!var4.isRemote) {
         ItemStack var5 = var1.method18357();
         Vector3d var6 = var1.getHitVec();
         Direction var7 = var1.getFace();
         Class888 var8 = new Class888(
            var4,
            var1.method18358(),
            var6.x + (double)var7.getXOffset() * 0.15,
            var6.y + (double)var7.getYOffset() * 0.15,
            var6.z + (double)var7.getZOffset() * 0.15,
            var5
         );
         var4.addEntity(var8);
         var5.shrink(1);
      }

      return ActionResultType.method9002(var4.isRemote);
   }

   @Override
   public Class6794<ItemStack> method11700(World var1, PlayerEntity var2, Hand var3) {
      if (!var2.isElytraFlying()) {
         return Class6794.<ItemStack>method20698(var2.getHeldItem(var3));
      } else {
         ItemStack var6 = var2.getHeldItem(var3);
         if (!var1.isRemote) {
            var1.addEntity(new Class888(var1, var6, var2));
            if (!var2.abilities.isCreativeMode) {
               var6.shrink(1);
            }
         }

         return Class6794.<ItemStack>method20700(var2.getHeldItem(var3), var1.isRemote());
      }
   }

   @Override
   public void method11730(ItemStack var1, World var2, List<ITextComponent> var3, Class2216 var4) {
      CompoundNBT var7 = var1.method32145("Fireworks");
      if (var7 != null) {
         if (var7.contains("Flight", 99)) {
            var3.add(
               new TranslationTextComponent("item.minecraft.firework_rocket.flight")
                  .appendString(" ")
                  .appendString(String.valueOf(var7.getByte("Flight")))
                  .mergeStyle(TextFormatting.GRAY)
            );
         }

         ListNBT var8 = var7.getList("Explosions", 10);
         if (!var8.isEmpty()) {
            for (int var9 = 0; var9 < var8.size(); var9++) {
               CompoundNBT var10 = var8.getCompound(var9);
               ArrayList var11 = Lists.newArrayList();
               Class3320.method11873(var10, var11);
               if (!var11.isEmpty()) {
                  for (int var12 = 1; var12 < var11.size(); var12++) {
                     var11.set(var12, new StringTextComponent("  ").append((ITextComponent)var11.get(var12)).mergeStyle(TextFormatting.GRAY));
                  }

                  var3.addAll(var11);
               }
            }
         }
      }
   }
}
