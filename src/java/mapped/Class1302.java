package mapped;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1302 extends Class1189 {
   public final Class1335 field6894;

   public Class1302(Class1335 var1, FontRenderer var2, int var3, int var4, int var5, int var6, ITextComponent var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6894 = var1;
   }

   @Override
   public IFormattableTextComponent method5634() {
      return super.method5634()
         .appendString(". ")
         .append(new TranslationTextComponent("selectWorld.resultFolder"))
         .appendString(" ")
         .appendString(Class1335.method6393(this.field6894));
   }
}
