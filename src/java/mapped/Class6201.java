package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class6201 implements Class6196 {
   private static final ITextComponent field27673 = new TranslationTextComponent("tutorial.craft_planks.title");
   private static final ITextComponent field27674 = new TranslationTextComponent("tutorial.craft_planks.description");
   private final Tutorial field27675;
   private TutorialToast field27676;
   private int field27677;

   public Class6201(Tutorial var1) {
      this.field27675 = var1;
   }

   @Override
   public void method19097() {
      this.field27677++;
      if (this.field27675.method37036() == Class1894.field11102) {
         if (this.field27677 == 1) {
            ClientPlayerEntity var3 = this.field27675.method37035().player;
            if (var3 != null) {
               if (var3.inventory.method4059(Class5985.field26071)) {
                  this.field27675.method37034(Class2200.field14381);
                  return;
               }

               if (method19106(var3, Class5985.field26071)) {
                  this.field27675.method37034(Class2200.field14381);
                  return;
               }
            }
         }

         if (this.field27677 >= 1200 && this.field27676 == null) {
            this.field27676 = new TutorialToast(TutorialToast.Icons.field13899, field27673, field27674, false);
            this.field27675.method37035().getToastGui().method5914(this.field27676);
         }
      } else {
         this.field27675.method37034(Class2200.field14381);
      }
   }

   @Override
   public void method19098() {
      if (this.field27676 != null) {
         this.field27676.method24895();
         this.field27676 = null;
      }
   }

   @Override
   public void method19104(ItemStack var1) {
      Item var4 = var1.getItem();
      if (Class5985.field26071.method24917(var4)) {
         this.field27675.method37034(Class2200.field14381);
      }
   }

   public static boolean method19106(ClientPlayerEntity var0, ITag<Item> var1) {
      for (Item var5 : var1.method24918()) {
         if (var0.method5396().method28961(Class8876.field40097.method172(var5)) > 0) {
            return true;
         }
      }

      return false;
   }
}
