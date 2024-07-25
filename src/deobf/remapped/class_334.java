package remapped;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import net.minecraft.util.text.ITextComponent;

public class class_334 extends class_4001 {
   public class_334(String var1) {
      super(var1, (BiConsumer<GameOptions, Integer>)null, (BiFunction<GameOptions, class_4001, ITextComponent>)null);
      super.field_19428 = this::method_1539;
      super.field_19429 = this::method_1538;
   }

   public void method_1539(GameOptions var1, int var2) {
      var1.method_40892(this, var2);
   }

   public ITextComponent method_1538(GameOptions var1, class_4001 var2) {
      return var1.method_40882(var2);
   }
}
