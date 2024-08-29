package mapped;

import com.google.common.collect.Sets;
import java.util.Set;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class6197 implements Class6196 {
   private static final Set<Block> field27645 = Sets.newHashSet(
      new Block[]{
         Blocks.field36422,
         Blocks.field36423,
         Blocks.field36424,
         Blocks.field36425,
         Blocks.field36426,
         Blocks.field36427,
         Blocks.field37070,
         Blocks.field37079,
         Blocks.field36434,
         Blocks.field36435,
         Blocks.field36436,
         Blocks.field36437,
         Blocks.field36438,
         Blocks.field36439,
         Blocks.field37072,
         Blocks.field37081,
         Blocks.field36446,
         Blocks.field36447,
         Blocks.field36448,
         Blocks.field36449,
         Blocks.field36450,
         Blocks.field36451,
         Blocks.field36891,
         Blocks.field37076
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
      if (this.field27648.method37036() == Class1894.field11102) {
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
         if (var1.getItem() == var5.method11581()) {
            this.field27648.method37034(Class2200.field14380);
            return;
         }
      }
   }

   public static boolean method19105(ClientPlayerEntity var0) {
      for (Block var4 : field27645) {
         if (var0.method5396().method28961(Class8876.field40096.method172(var4)) > 0) {
            return true;
         }
      }

      return false;
   }
}
