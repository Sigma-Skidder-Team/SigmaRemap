package mapped;

import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1241 extends Button {
   public final Class1335 field6591;

   public Class1241(Class1335 var1, int var2, int var3, int var4, int var5, ITextComponent var6, Class7192 var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6591 = var1;
   }

   @Override
   public ITextComponent method5745() {
      return new TranslationTextComponent(
         "options.generic_value",
         Class1335.method6394(),
         new TranslationTextComponent("selectWorld.gameMode." + Class2079.method8734(Class1335.method6395(this.field6591)))
      );
   }

   @Override
   public IFormattableTextComponent method5634() {
      return super.method5634().appendString(". ").append(Class1335.method6397(this.field6591)).appendString(" ").append(Class1335.method6396(this.field6591));
   }
}
