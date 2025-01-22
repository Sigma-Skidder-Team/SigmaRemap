package mapped;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import org.apache.commons.lang3.Validate;

public class Class3301 extends Class3298 {
   public Class3301(Block var1, Block var2, Properties var3) {
      super(var1, var2, var3);
      Validate.isInstanceOf(AbstractBannerBlock.class, var1);
      Validate.isInstanceOf(AbstractBannerBlock.class, var2);
   }

   public static void method11848(ItemStack var0, List<ITextComponent> var1) {
      CompoundNBT var4 = var0.method32145("BlockEntityTag");
      if (var4 != null && var4.contains("Patterns")) {
         ListNBT var5 = var4.getList("Patterns", 10);

         for (int var6 = 0; var6 < var5.size() && var6 < 6; var6++) {
            CompoundNBT var7 = var5.getCompound(var6);
            DyeColor var8 = DyeColor.method315(var7.getInt("Color"));
            Class2154 var9 = Class2154.method8872(var7.getString("Pattern"));
            if (var9 != null) {
               var1.add(new TranslationTextComponent("block.minecraft.banner." + var9.method8870() + '.' + var8.method310()).mergeStyle(TextFormatting.GRAY));
            }
         }
      }
   }

   public DyeColor method11849() {
      return ((AbstractBannerBlock)this.method11845()).method11936();
   }

   @Override
   public void method11730(ItemStack var1, World var2, List<ITextComponent> var3, Class2216 var4) {
      method11848(var1, var3);
   }
}
