package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;

public class class_3520 {
   private static String[] field_17246;
   private final Style field_17249;
   private final String field_17250;
   private final ITextComponent field_17245;
   private final int field_17248;
   private final int field_17247;

   public class_3520(Style var1, String var2, int var3, int var4) {
      this.field_17249 = var1;
      this.field_17250 = var2;
      this.field_17248 = var3;
      this.field_17247 = var4;
      this.field_17245 = new StringTextComponent(var2).setStyle(var1);
   }
}
