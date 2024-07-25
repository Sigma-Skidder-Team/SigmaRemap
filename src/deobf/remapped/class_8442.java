package remapped;

import java.util.List;
import net.minecraft.util.text.ITextComponent;

public class class_8442 extends class_4041 {
   private static String[] field_43190;

   public class_8442(class_317 var1) {
      super(var1);
   }

   @Override
   public void method_11218(class_6098 var1, class_6486 var2, List<ITextComponent> var3, class_4605 var4) {
      class_9541.method_43988(var1, var3, 0.25F);
   }

   @Override
   public class_954<class_6098> method_11231(class_6486 var1, class_704 var2, class_2584 var3) {
      var1.method_29528(
         (class_704)null,
         var2.method_37302(),
         var2.method_37309(),
         var2.method_37156(),
         class_463.field_2383,
         class_562.field_3328,
         0.5F,
         0.4F / (field_12172.nextFloat() * 0.4F + 0.8F)
      );
      return super.method_11231(var1, var2, var3);
   }
}
