package remapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_2626 extends class_380 {
   private static final ITextComponent field_12955 = new TranslationTextComponent("container.loom");

   public class_2626(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_6910 method_10777(class_2522 var1, class_6486 var2, class_1331 var3, class_704 var4, class_2584 var5, class_9529 var6) {
      if (!var2.field_33055) {
         var4.method_3152(var1.method_8317(var2, var3));
         var4.method_3209(class_6234.field_31903);
         return class_6910.field_35518;
      } else {
         return class_6910.field_35520;
      }
   }

   @Override
   public class_4259 method_10767(class_2522 var1, class_6486 var2, class_1331 var3) {
      return new class_6872((var2x, var3x, var4) -> new class_3682(var2x, var3x, class_9210.method_42530(var2, var3)), field_12955);
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260().method_10308(field_1543, var1.method_21863().method_1046());
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_1543);
   }
}
