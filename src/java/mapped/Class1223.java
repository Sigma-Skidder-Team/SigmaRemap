package mapped;

import net.minecraft.client.gui.screen.CreateWorldScreen;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1223 extends Button {
   public final CreateWorldScreen field6567;

   public Class1223(CreateWorldScreen var1, int var2, int var3, int var4, int var5, ITextComponent var6, Class7192 var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6567 = var1;
   }

   @Override
   public ITextComponent method5745() {
      return new TranslationTextComponent("options.difficulty").appendString(": ").append(CreateWorldScreen.method6398(this.field6567).getDisplayName());
   }
}
