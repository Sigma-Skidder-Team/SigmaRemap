package remapped;

import java.io.IOException;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;

public class class_5149 implements Packet<class_392> {
   private static String[] field_26507;
   private int field_26509;
   private int field_26510;
   private ITextComponent field_26508;

   public class_5149() {
   }

   public class_5149(int var1, class_4165<?> var2, ITextComponent var3) {
      this.field_26509 = var1;
      this.field_26510 = class_8669.field_44402.method_14041(var2);
      this.field_26508 = var3;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      this.field_26509 = var1.method_37778();
      this.field_26510 = var1.method_37778();
      this.field_26508 = var1.method_37776();
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      var1.method_37743(this.field_26509);
      var1.method_37743(this.field_26510);
      var1.method_37779(this.field_26508);
   }

   public void method_23578(class_392 var1) {
      var1.method_1956(this);
   }

   public int method_23577() {
      return this.field_26509;
   }

   @Nullable
   public class_4165<?> method_23575() {
      return class_8669.field_44402.method_14040(this.field_26510);
   }

   public ITextComponent method_23576() {
      return this.field_26508;
   }
}
