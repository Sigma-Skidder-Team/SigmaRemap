package remapped;

import java.io.DataOutput;
import java.io.IOException;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;

public interface class_8406 {
   TextFormatting field_43008 = TextFormatting.AQUA;
   TextFormatting field_43006 = TextFormatting.GREEN;
   TextFormatting field_43005 = TextFormatting.GOLD;
   TextFormatting field_43007 = TextFormatting.RED;

   void method_38707(DataOutput var1) throws IOException;

   @Override
   String toString();

   byte method_38706();

   class_3265<?> method_38709();

   class_8406 method_38708();

   default String method_38710() {
      return this.toString();
   }

   default ITextComponent method_38711() {
      return this.method_38712("", 0);
   }

   ITextComponent method_38712(String var1, int var2);
}
