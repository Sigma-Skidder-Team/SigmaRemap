package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.GameType;

public class Class6195 implements Class6196 {
   private static final ITextComponent field27640 = new TranslationTextComponent("tutorial.open_inventory.title");
   private static final ITextComponent field27641 = new TranslationTextComponent("tutorial.open_inventory.description", Tutorial.createKeybindComponent("inventory"));
   private final Tutorial field27642;
   private TutorialToast field27643;
   private int field27644;

   public Class6195(Tutorial var1) {
      this.field27642 = var1;
   }

   @Override
   public void method19097() {
      this.field27644++;
      if (this.field27642.method37036() == GameType.field11102) {
         if (this.field27644 >= 600 && this.field27643 == null) {
            this.field27643 = new TutorialToast(TutorialToast.Icons.field13898, field27640, field27641, false);
            this.field27642.method37035().getToastGui().method5914(this.field27643);
         }
      } else {
         this.field27642.method37034(Class2200.field14381);
      }
   }

   @Override
   public void method19098() {
      if (this.field27643 != null) {
         this.field27643.method24895();
         this.field27643 = null;
      }
   }

   @Override
   public void method19099() {
      this.field27642.method37034(Class2200.field14380);
   }
}
