package remapped;

import java.io.IOException;
import net.minecraft.util.text.ITextComponent;

public class class_7957 implements Packet<class_392> {
   private static String[] field_40771;
   private ITextComponent field_40770;

   public class_7957() {
   }

   public class_7957(ITextComponent var1) {
      this.field_40770 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_40770 = var1.method_37776();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37779(this.field_40770);
   }

   public void method_36001(class_392 var1) {
      var1.method_1914(this);
   }

   public ITextComponent method_35999() {
      return this.field_40770;
   }
}
