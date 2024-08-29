package mapped;

import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;

public class Class1300 extends Class1189 {
   private static String[] field6891;
   public final Class1325 field6892;

   public Class1300(Class1325 var1, FontRenderer var2, int var3, int var4, int var5, int var6, ITextComponent var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.field6892 = var1;
   }

   @Override
   public IFormattableTextComponent method5634() {
      return super.method5634().appendString(Class1325.method6313(this.field6892).method20844());
   }
}
