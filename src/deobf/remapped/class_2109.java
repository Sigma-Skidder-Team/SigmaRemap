package remapped;

import com.google.gson.JsonElement;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class class_2109 {
   private static String[] field_10564;
   public static final class_2562 field_10567 = method_9872(class_1685::method_7564, class_9590.field_48833);
   public static final class_2562 field_10561 = method_9872(class_1685::method_7564, class_9590.field_48781);
   public static final class_2562 field_10569 = method_9872(class_1685::method_7545, class_9590.field_48862);
   public static final class_2562 field_10563 = method_9872(class_1685::method_7545, class_9590.field_48830);
   public static final class_2562 field_10580 = method_9872(class_1685::method_7579, class_9590.field_48789);
   public static final class_2562 field_10576 = method_9872(class_1685::method_7580, class_9590.field_48807);
   public static final class_2562 field_10573 = method_9872(class_1685::method_7566, class_9590.field_48837);
   public static final class_2562 field_10578 = method_9872(class_1685::method_7561, class_9590.field_48817);
   public static final class_2562 field_10558 = method_9872(class_1685::method_7559, class_9590.field_48776);
   public static final class_2562 field_10565 = method_9872(class_1685::method_7558, class_9590.field_48825);
   public static final class_2562 field_10559 = method_9872(class_1685::method_7563, class_9590.field_48836);
   public static final class_2562 field_10579 = method_9872(class_1685::method_7543, class_9590.field_48844);
   public static final class_2562 field_10562 = method_9872(class_1685::method_7557, class_9590.field_48839);
   public static final class_2562 field_10577 = method_9872(class_1685::method_7564, class_9590.field_48815);
   public static final class_2562 field_10566 = method_9872(class_1685::method_7583, class_9590.field_48852);
   public static final class_2562 field_10570 = method_9872(class_1685::method_7583, class_9590.field_48775);
   public static final class_2562 field_10568 = method_9872(class_1685::method_7552, class_9590.field_48821);
   public static final class_2562 field_10572 = method_9872(class_1685::method_7554, class_9590.field_48862);
   public static final class_2562 field_10571 = method_9872(class_1685::method_7554, class_9590.field_48830);
   public static final class_2562 field_10557 = method_9872(class_1685::method_7537, class_9590.field_48789);
   public static final class_2562 field_10575 = method_9872(class_1685::method_7576, class_9590.field_48862);
   private final class_1685 field_10574;
   private final class_7701 field_10560;

   private class_2109(class_1685 var1, class_7701 var2) {
      this.field_10574 = var1;
      this.field_10560 = var2;
   }

   public class_7701 method_9868() {
      return this.field_10560;
   }

   public class_1685 method_9870() {
      return this.field_10574;
   }

   public class_2109 method_9874(Consumer<class_1685> var1) {
      var1.accept(this.field_10574);
      return this;
   }

   public class_4639 method_9873(class_6414 var1, BiConsumer<class_4639, Supplier<JsonElement>> var2) {
      return this.field_10560.method_34883(var1, this.field_10574, var2);
   }

   public class_4639 method_9867(class_6414 var1, String var2, BiConsumer<class_4639, Supplier<JsonElement>> var3) {
      return this.field_10560.method_34882(var1, var2, this.field_10574, var3);
   }

   private static class_2562 method_9872(Function<class_6414, class_1685> var0, class_7701 var1) {
      return var2 -> new class_2109((class_1685)var0.apply(var2), var1);
   }

   public static class_2109 method_9869(class_4639 var0) {
      return new class_2109(class_1685.method_7574(var0), class_9590.field_48833);
   }
}
