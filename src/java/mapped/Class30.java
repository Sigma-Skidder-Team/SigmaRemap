package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;

import java.io.DataOutput;
import java.io.IOException;

public interface Class30 {
   TextFormatting field56 = TextFormatting.AQUA;
   TextFormatting field57 = TextFormatting.GREEN;
   TextFormatting field58 = TextFormatting.GOLD;
   TextFormatting field59 = TextFormatting.RED;

   void method73(DataOutput var1) throws IOException;

   @Override
   String toString();

   byte method74();

   Class7052<?> method75();

   Class30 method79();

   default String method81() {
      return this.toString();
   }

   default ITextComponent method82() {
      return this.method78("", 0);
   }

   ITextComponent method78(String var1, int var2);
}
