package mapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class1217 extends Class1206 {
   public final Class1335 field6534;

   public Class1217(Class1335 var1, int var2, int var3, int var4, int var5, ITextComponent var6, Class7192 var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6534 = var1;
   }

   @Override
   public ITextComponent method5745() {
      return DialogTexts.method22238(super.method5745(), Class1335.method6399(this.field6534) && !this.field6534.field7076);
   }

   @Override
   public IFormattableTextComponent method5634() {
      return super.method5634().appendString(". ").append(new TranslationTextComponent("selectWorld.allowCommands.info"));
   }
}
