package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.List;

public class Class3288 extends Class3287 {
   private final EntityType<?> field18799;

   public Class3288(EntityType<?> var1, Fluid var2, Properties var3) {
      super(var2, var3);
      this.field18799 = var1;
   }

   @Override
   public void method11824(World var1, ItemStack var2, BlockPos var3) {
      if (var1 instanceof ServerWorld) {
         this.method11827((ServerWorld)var1, var2, var3);
      }
   }

   @Override
   public void method11826(PlayerEntity var1, IWorld var2, BlockPos var3) {
      var2.playSound(var1, var3, SoundEvents.field26427, SoundCategory.field14734, 1.0F, 1.0F);
   }

   private void method11827(ServerWorld var1, ItemStack var2, BlockPos var3) {
      Entity var6 = this.field18799.method33200(var1, var2, (PlayerEntity)null, var3, Class2202.field14402, true, false);
      if (var6 != null) {
         ((AbstractFishEntity)var6).method4794(true);
      }
   }

   @Override
   public void method11730(ItemStack var1, World var2, List<ITextComponent> var3, Class2216 var4) {
      if (this.field18799 == EntityType.TROPICAL_FISH) {
         CompoundNBT var7 = var1.getTag();
         if (var7 != null && var7.contains("BucketVariantTag", 3)) {
            int var8 = var7.getInt("BucketVariantTag");
            TextFormatting[] var9 = new TextFormatting[]{TextFormatting.ITALIC, TextFormatting.GRAY};
            String var10 = "color.minecraft." + Class1052.method4814(var8);
            String var11 = "color.minecraft." + Class1052.method4815(var8);

            for (int var12 = 0; var12 < Class1052.field5817.length; var12++) {
               if (var8 == Class1052.field5817[var12]) {
                  var3.add(new TranslationTextComponent(Class1052.method4813(var12)).mergeStyle(var9));
                  return;
               }
            }

            var3.add(new TranslationTextComponent(Class1052.method4816(var8)).mergeStyle(var9));
            TranslationTextComponent var13 = new TranslationTextComponent(var10);
            if (!var10.equals(var11)) {
               var13.appendString(", ").append(new TranslationTextComponent(var11));
            }

            var13.mergeStyle(var9);
            var3.add(var13);
         }
      }
   }
}
