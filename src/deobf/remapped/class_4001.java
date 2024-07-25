package remapped;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import net.minecraft.util.text.ITextComponent;

public class class_4001 extends class_1013 {
   public BiConsumer<GameOptions, Integer> field_19428;
   public BiFunction<GameOptions, class_4001, ITextComponent> field_19429;

   public class_4001(String var1, BiConsumer<GameOptions, Integer> var2, BiFunction<GameOptions, class_4001, ITextComponent> var3) {
      super(var1);
      this.field_19428 = var2;
      this.field_19429 = var3;
   }

   public void method_18455(GameOptions var1, int var2) {
      this.field_19428.accept(var1, var2);
      var1.method_40873();
   }

   @Override
   public class_7114 method_4482(GameOptions var1, int var2, int var3, int var4) {
      return new class_2116(var2, var3, var4, 20, this, this.method_18454(var1), var2x -> {
         this.method_18455(var1, 1);
         var2x.method_32687(this.method_18454(var1));
      });
   }

   public ITextComponent method_18454(GameOptions var1) {
      return this.field_19429.apply(var1, this);
   }
}
