package remapped;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import net.minecraft.util.text.ITextComponent;

public class class_6125 extends class_8369 {
   public class_6125(String var1) {
      this(var1, 0.0, 1.0, 0.0F);
   }

   public class_6125(String var1, double var2, double var4, float var6) {
      super(
         var1,
         var2,
         var4,
         var6,
         (Function<class_8881, Double>)null,
         (BiConsumer<class_8881, Double>)null,
         (BiFunction<class_8881, class_8369, ITextComponent>)null
      );
      super.field_42846 = this::method_28147;
      super.field_42848 = this::method_28149;
      super.field_42851 = this::method_28148;
   }

   private double method_28147(class_8881 var1) {
      return var1.method_40895(this);
   }

   private void method_28149(class_8881 var1, double var2) {
      var1.method_40893(this, var2);
   }

   private ITextComponent method_28148(class_8881 var1, class_8369 var2) {
      return var1.method_40882(var2);
   }
}
