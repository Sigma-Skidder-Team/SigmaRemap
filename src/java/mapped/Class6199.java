package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class6199 implements Class6196 {
   private static final ITextComponent field27665 = new TranslationTextComponent("tutorial.punch_tree.title");
   private static final ITextComponent field27666 = new TranslationTextComponent("tutorial.punch_tree.description", Tutorial.createKeybindComponent("attack"));
   private final Tutorial field27667;
   private TutorialToast field27668;
   private int field27669;
   private int field27670;

   public Class6199(Tutorial var1) {
      this.field27667 = var1;
   }

   @Override
   public void method19097() {
      this.field27669++;
      if (this.field27667.method37036() == Class1894.field11102) {
         if (this.field27669 == 1) {
            ClientPlayerEntity var3 = this.field27667.method37035().player;
            if (var3 != null) {
               if (var3.inventory.method4059(Class5985.field26085)) {
                  this.field27667.method37034(Class2200.field14380);
                  return;
               }

               if (Class6197.method19105(var3)) {
                  this.field27667.method37034(Class2200.field14380);
                  return;
               }
            }
         }

         if ((this.field27669 >= 600 || this.field27670 > 3) && this.field27668 == null) {
            this.field27668 = new TutorialToast(TutorialToast.Icons.field13897, field27665, field27666, true);
            this.field27667.method37035().getToastGui().method5914(this.field27668);
         }
      } else {
         this.field27667.method37034(Class2200.field14381);
      }
   }

   @Override
   public void method19098() {
      if (this.field27668 != null) {
         this.field27668.method24895();
         this.field27668 = null;
      }
   }

   @Override
   public void method19103(ClientWorld var1, BlockPos var2, BlockState var3, float var4) {
      boolean var7 = var3.method23446(BlockTags.field32751);
      if (var7 && var4 > 0.0F) {
         if (this.field27668 != null) {
            this.field27668.method24896(var4);
         }

         if (var4 >= 1.0F) {
            this.field27667.method37034(Class2200.field14379);
         }
      } else if (this.field27668 == null) {
         if (var7) {
            this.field27670++;
         }
      } else {
         this.field27668.method24896(0.0F);
      }
   }

   @Override
   public void method19104(ItemStack var1) {
      if (Class5985.field26085.method24917(var1.getItem())) {
         this.field27667.method37034(Class2200.field14380);
      }
   }
}
