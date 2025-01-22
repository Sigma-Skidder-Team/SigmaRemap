package mapped;

import com.google.common.collect.Sets;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.GameType;

public class Class6197 implements Class6196 {
   private static final Set<Block> field27645 = Sets.newHashSet(
      new Block[]{
         Blocks.OAK_LOG,
         Blocks.SPRUCE_LOG,
         Blocks.BIRCH_LOG,
         Blocks.JUNGLE_LOG,
         Blocks.ACACIA_LOG,
         Blocks.DARK_OAK_LOG,
         Blocks.WARPED_STEM,
         Blocks.CRIMSON_STEM,
         Blocks.OAK_WOOD,
         Blocks.SPRUCE_WOOD,
         Blocks.BIRCH_WOOD,
         Blocks.JUNGLE_WOOD,
         Blocks.ACACIA_WOOD,
         Blocks.DARK_OAK_WOOD,
         Blocks.WARPED_HYPHAE,
         Blocks.CRIMSON_HYPHAE,
         Blocks.OAK_LEAVES,
         Blocks.SPRUCE_LEAVES,
         Blocks.BIRCH_LEAVES,
         Blocks.JUNGLE_LEAVES,
         Blocks.ACACIA_LEAVES,
         Blocks.DARK_OAK_LEAVES,
         Blocks.NETHER_WART_BLOCK,
         Blocks.WARPED_WART_BLOCK
      }
   );
   private static final ITextComponent field27646 = new TranslationTextComponent("tutorial.find_tree.title");
   private static final ITextComponent field27647 = new TranslationTextComponent("tutorial.find_tree.description");
   private final Tutorial field27648;
   private TutorialToast field27649;
   private int field27650;

   public Class6197(Tutorial var1) {
      this.field27648 = var1;
   }

   @Override
   public void method19097() {
      this.field27650++;
      if (this.field27648.method37036() == GameType.field11102) {
         if (this.field27650 == 1) {
            ClientPlayerEntity var3 = this.field27648.method37035().player;
            if (var3 != null) {
               for (Block var5 : field27645) {
                  if (var3.inventory.method4058(new ItemStack(var5))) {
                     this.field27648.method37034(Class2200.field14380);
                     return;
                  }
               }

               if (method19105(var3)) {
                  this.field27648.method37034(Class2200.field14380);
                  return;
               }
            }
         }

         if (this.field27650 >= 6000 && this.field27649 == null) {
            this.field27649 = new TutorialToast(TutorialToast.Icons.field13897, field27646, field27647, false);
            this.field27648.method37035().getToastGui().method5914(this.field27649);
         }
      } else {
         this.field27648.method37034(Class2200.field14381);
      }
   }

   @Override
   public void method19098() {
      if (this.field27649 != null) {
         this.field27649.method24895();
         this.field27649 = null;
      }
   }

   @Override
   public void method19102(ClientWorld var1, RayTraceResult var2) {
      if (var2.getType() == RayTraceResult.Type.BLOCK) {
         BlockState var5 = var1.getBlockState(((BlockRayTraceResult)var2).getPos());
         if (field27645.contains(var5.getBlock())) {
            this.field27648.method37034(Class2200.field14378);
         }
      }
   }

   @Override
   public void method19104(ItemStack var1) {
      for (Block var5 : field27645) {
         if (var1.getItem() == var5.asItem()) {
            this.field27648.method37034(Class2200.field14380);
            return;
         }
      }
   }

   public static boolean method19105(ClientPlayerEntity var0) {
      for (Block var4 : field27645) {
         if (var0.method5396().method28961(Stats.field40096.method172(var4)) > 0) {
            return true;
         }
      }

      return false;
   }
}
