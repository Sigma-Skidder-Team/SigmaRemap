package remapped;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class class_2609 {
   public static final Codec<class_2609> field_12888 = class_8669.field_44392.dispatch("element_type", class_2609::method_11836, class_4263::method_19856);
   private volatile class_7599 field_12889;

   public static <E extends class_2609> RecordCodecBuilder<E, class_7599> method_11825() {
      return class_7599.field_38705.fieldOf("projection").forGetter(class_2609::method_11834);
   }

   public class_2609(class_7599 var1) {
      this.field_12889 = var1;
   }

   public abstract List<class_4099> method_11829(class_5799 var1, class_1331 var2, class_6631 var3, Random var4);

   public abstract class_9616 method_11832(class_5799 var1, class_1331 var2, class_6631 var3);

   public abstract boolean method_11827(
      class_5799 var1,
      class_700 var2,
      class_2033 var3,
      class_6541 var4,
      class_1331 var5,
      class_1331 var6,
      class_6631 var7,
      class_9616 var8,
      Random var9,
      boolean var10
   );

   public abstract class_4263<?> method_11836();

   public void method_11837(class_9379 var1, class_4099 var2, class_1331 var3, class_6631 var4, Random var5, class_9616 var6) {
   }

   public class_2609 method_11828(class_7599 var1) {
      this.field_12889 = var1;
      return this;
   }

   public class_7599 method_11834() {
      class_7599 var3 = this.field_12889;
      if (var3 != null) {
         return var3;
      } else {
         throw new IllegalStateException();
      }
   }

   public int method_11833() {
      return 1;
   }

   public static Function<class_7599, class_2044> method_11840() {
      return var0 -> class_2044.field_10352;
   }

   public static Function<class_7599, class_6789> method_11826(String var0) {
      return var1 -> new class_6789(Either.left(new Identifier(var0)), () -> class_4932.field_25542, var1);
   }

   public static Function<class_7599, class_6789> method_11835(String var0, class_86 var1) {
      return var2 -> new class_6789(Either.left(new Identifier(var0)), () -> var1, var2);
   }

   public static Function<class_7599, class_8781> method_11839(String var0) {
      return var1 -> new class_8781(Either.left(new Identifier(var0)), () -> class_4932.field_25542, var1);
   }

   public static Function<class_7599, class_8781> method_11841(String var0, class_86 var1) {
      return var2 -> new class_8781(Either.left(new Identifier(var0)), () -> var1, var2);
   }

   public static Function<class_7599, class_9089> method_11830(class_5927<?, ?> var0) {
      return var1 -> new class_9089(() -> var0, var1);
   }

   public static Function<class_7599, class_6556> method_11838(List<Function<class_7599, ? extends class_2609>> var0) {
      return var1 -> new class_6556(var0.stream().<class_2609>map(var1x -> (class_2609)var1x.apply(var1)).collect(Collectors.<class_2609>toList()), var1);
   }
}
