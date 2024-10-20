package mapped;

import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1216 extends Button {
   public final Class1295 field6530;
   public final KeyBinding field6531;
   public final ITextComponent field6532;
   public final Class1188 field6533;

   public Class1216(
           Class1188 var1, int var2, int var3, int var4, int var5, ITextComponent var6, IPressable var7, Class1295 var8, KeyBinding var9, ITextComponent var10
   ) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6533 = var1;
      this.field6530 = var8;
      this.field6531 = var9;
      this.field6532 = var10;
   }

   @Override
   public IFormattableTextComponent method5634() {
      return !this.field6531.isInvalid()
         ? new TranslationTextComponent("narrator.controls.bound", this.field6532, super.method5634())
         : new TranslationTextComponent("narrator.controls.unbound", this.field6532);
   }
}
