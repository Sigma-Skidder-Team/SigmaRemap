package mapped;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;

public class Class1303 extends Class1189 {
   private static String[] field6895;
   public final ChatScreen field6896;

   public Class1303(ChatScreen var1, FontRenderer var2, int var3, int var4, int var5, int var6, ITextComponent var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6896 = var1;
   }

   @Override
   public IFormattableTextComponent method5634() {
      return super.method5634().appendString(ChatScreen.method6347(this.field6896).method20844());
   }
}
