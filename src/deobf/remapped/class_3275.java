package remapped;

import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class class_3275<T extends RuleValue<T>> {
   private static String[] field_16215;
   private final Supplier<ArgumentType<?>> field_16212;
   private final Function<class_3275<T>, T> field_16214;
   private final BiConsumer<class_341, T> field_16213;
   private final class_4120<T> field_16211;

   private class_3275(Supplier<ArgumentType<?>> var1, Function<class_3275<T>, T> var2, BiConsumer<class_341, T> var3, class_4120<T> var4) {
      this.field_16212 = var1;
      this.field_16214 = var2;
      this.field_16213 = var3;
      this.field_16211 = var4;
   }

   public RequiredArgumentBuilder<class_9155, ?> method_14953(String var1) {
      return class_465.method_2236(var1, (ArgumentType<T>)this.field_16212.get());
   }

   public T method_14954() {
      return this.field_16214.apply(this);
   }

   public void method_14955(class_2237 var1, RuleKey<T> var2) {
      this.field_16211.method_19136(var1, var2, this);
   }
}
