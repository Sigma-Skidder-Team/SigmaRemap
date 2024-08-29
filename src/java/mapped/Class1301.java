package mapped;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;

public class Class1301 extends Class1189 {
   public final SocialInteractionsScreen field6893;

   public Class1301(SocialInteractionsScreen var1, FontRenderer var2, int var3, int var4, int var5, int var6, ITextComponent var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6893 = var1;
   }

   @Override
   public IFormattableTextComponent method5634() {
      return ! SocialInteractionsScreen.method5497(this.field6893).method5636().isEmpty() && SocialInteractionsScreen.method5498(this.field6893).method6137()
         ? super.method5634().appendString(", ").append(SocialInteractionsScreen.method5499())
         : super.method5634();
   }
}
