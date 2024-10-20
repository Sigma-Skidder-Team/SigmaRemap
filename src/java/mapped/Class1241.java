package mapped;

import net.minecraft.client.gui.screen.CreateWorldScreen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1241 extends Button {
   public final CreateWorldScreen field6591;

   public Class1241(CreateWorldScreen var1, int var2, int var3, int var4, int var5, ITextComponent var6, IPressable var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6591 = var1;
   }

   @Override
   public ITextComponent method5745() {
      return new TranslationTextComponent(
         "options.generic_value",
         CreateWorldScreen.method6394(),
         new TranslationTextComponent("selectWorld.gameMode." + Class2079.method8734(CreateWorldScreen.method6395(this.field6591)))
      );
   }

   @Override
   public IFormattableTextComponent method5634() {
      return super.method5634().appendString(". ").append(CreateWorldScreen.method6397(this.field6591)).appendString(" ").append(CreateWorldScreen.method6396(this.field6591));
   }
}
