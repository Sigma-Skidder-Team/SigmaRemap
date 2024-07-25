package remapped;

import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;

public class class_2196 extends class_9521 {
   public class_2196(
      class_919 var1,
      int var2,
      int var3,
      int var4,
      int var5,
      ITextComponent var6,
      class_1500 var7,
      class_3547 var8,
      ITextComponent var9,
      BooleanValue var10,
      String var11
   ) {
      super(var2, var3, var4, var5, var6, var7);
      this.field_10904 = var1;
      this.field_10905 = var8;
      this.field_10900 = var9;
      this.field_10901 = var10;
      this.field_10903 = var11;
   }

   @Override
   public IFormattableTextComponent method_32701() {
      return class_1402.method_6480(this.field_10900, this.field_10901.method_26681()).appendString("\n").appendString(this.field_10903);
   }
}
