package mapped;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.util.text.ITextComponent;

public class Class1304 extends TextFieldWidget {
   private static String[] field6897;
   public final Class1148 field6898;

   public Class1304(Class1148 var1, FontRenderer var2, int var3, int var4, int var5, int var6, ITextComponent var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6898 = var1;
   }

   @Override
   public boolean charTyped(char var1, int var2) {
      return this.field6898.method2484(this.getText(), var1, this.method5659()) ? super.charTyped(var1, var2) : false;
   }
}
