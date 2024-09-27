package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;

public class Class3254 extends Class3252 {
   private static String[] field18730;

   public Class3254(AbstractBlock var1) {
      super(Class2136.field13991, var1);
   }

   @Override
   public void method11563(World var1, BlockPos var2, BlockState var3, LivingEntity var4, ItemStack var5) {
      Blocks.field36707.method11563(var1, var2, var3, var4, var5);
   }

   @Override
   public List<ItemStack> method11697(BlockState var1, Class9464 var2) {
      return Blocks.field36707.method11697(var1, var2);
   }
}
