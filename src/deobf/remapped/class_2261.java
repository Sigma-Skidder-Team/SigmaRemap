package remapped;

import java.io.IOException;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;

public class class_2261 implements class_6310<class_8886> {
   private static String[] field_11244;
   private ITextComponent field_11245;

   public class_2261() {
   }

   public class_2261(ITextComponent var1) {
      this.field_11245 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_11245 = ITextComponent$class_40.func_240644_b_(var1.method_37784(262144));
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37779(this.field_11245);
   }

   public void method_10388(class_8886 var1) {
      var1.method_40900(this);
   }

   public ITextComponent method_10386() {
      return this.field_11245;
   }
}
