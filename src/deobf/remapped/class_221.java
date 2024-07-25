package remapped;

import java.util.List;
import net.minecraft.util.text.ITextComponent;

public class class_221 extends class_2451 {
   private static String[] field_726;
   private final class_6414 field_725;

   public class_221(class_6414 var1, class_317 var2) {
      super(var2);
      this.field_725 = var1;
   }

   @Override
   public String method_11216() {
      return this.field_725.method_29271();
   }

   @Override
   public void method_11218(class_6098 var1, class_6486 var2, List<ITextComponent> var3, class_4605 var4) {
      super.method_11218(var1, var2, var3, var4);
      this.field_725.method_29272(var1, var2, var3, var4);
   }
}
