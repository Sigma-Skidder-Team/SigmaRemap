package remapped;

import java.io.IOException;
import net.minecraft.util.text.ITextComponent;

public class class_4750 implements class_6310<class_392> {
   private static String[] field_23012;
   private ITextComponent field_23011;
   private ITextComponent field_23013;

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_23011 = var1.method_37776();
      this.field_23013 = var1.method_37776();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37779(this.field_23011);
      var1.method_37779(this.field_23013);
   }

   public void method_21934(class_392 var1) {
      var1.method_1945(this);
   }

   public ITextComponent method_21931() {
      return this.field_23011;
   }

   public ITextComponent method_21932() {
      return this.field_23013;
   }
}
