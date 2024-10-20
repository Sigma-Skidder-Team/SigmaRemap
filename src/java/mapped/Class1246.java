package mapped;

import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1246 extends Button {
   public final Class1295 field6606;
   public final ITextComponent field6607;
   public final Class1188 field6608;

   public Class1246(Class1188 var1, int var2, int var3, int var4, int var5, ITextComponent var6, IPressable var7, Class1295 var8, ITextComponent var9) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6608 = var1;
      this.field6606 = var8;
      this.field6607 = var9;
   }

   @Override
   public IFormattableTextComponent method5634() {
      return new TranslationTextComponent("narrator.controls.reset", this.field6607);
   }
}
