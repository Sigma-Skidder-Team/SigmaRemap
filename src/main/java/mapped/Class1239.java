package mapped;

import net.minecraft.client.gui.DialogTexts;
import net.minecraft.client.gui.screen.WorldOptionsScreen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1239 extends Button {
   public final WorldOptionsScreen field6589;

   public Class1239(WorldOptionsScreen var1, int var2, int var3, int var4, int var5, ITextComponent var6, IPressable var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6589 = var1;
   }

   @Override
   public ITextComponent method5745() {
      return DialogTexts.method22238(super.method5745(), WorldOptionsScreen.method5801(this.field6589).method26260());
   }

   @Override
   public IFormattableTextComponent method5634() {
      return super.method5634().appendString(". ").append(new TranslationTextComponent("selectWorld.mapFeatures.info"));
   }
}
