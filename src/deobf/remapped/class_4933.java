package remapped;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import java.util.function.Consumer;
import javax.annotation.Nullable;

public class class_4933 {
   private static final BiMap<class_4639, class_2144> field_25577 = HashBiMap.create();
   public static final class_2144 field_25569 = method_22625("empty", var0 -> {
   });
   public static final class_2144 field_25565 = method_22625("chest", var0 -> var0.method_8022(class_8712.field_44671).method_8020(class_8712.field_44676));
   public static final class_2144 field_25576 = method_22625("command", var0 -> var0.method_8022(class_8712.field_44671).method_8020(class_8712.field_44676));
   public static final class_2144 field_25574 = method_22625("selector", var0 -> var0.method_8022(class_8712.field_44671).method_8022(class_8712.field_44676));
   public static final class_2144 field_25570 = method_22625(
      "fishing", var0 -> var0.method_8022(class_8712.field_44671).method_8022(class_8712.field_44670).method_8020(class_8712.field_44676)
   );
   public static final class_2144 field_25566 = method_22625(
      "entity",
      var0 -> var0.method_8022(class_8712.field_44676)
            .method_8022(class_8712.field_44671)
            .method_8022(class_8712.field_44674)
            .method_8020(class_8712.field_44678)
            .method_8020(class_8712.field_44669)
            .method_8020(class_8712.field_44675)
   );
   public static final class_2144 field_25575 = method_22625("gift", var0 -> var0.method_8022(class_8712.field_44671).method_8022(class_8712.field_44676));
   public static final class_2144 field_25567 = method_22625("barter", var0 -> var0.method_8022(class_8712.field_44676));
   public static final class_2144 field_25568 = method_22625(
      "advancement_reward", var0 -> var0.method_8022(class_8712.field_44676).method_8022(class_8712.field_44671)
   );
   public static final class_2144 field_25573 = method_22625(
      "advancement_entity", var0 -> var0.method_8022(class_8712.field_44676).method_8022(class_8712.field_44671)
   );
   public static final class_2144 field_25571 = method_22625(
      "generic",
      var0 -> var0.method_8022(class_8712.field_44676)
            .method_8022(class_8712.field_44675)
            .method_8022(class_8712.field_44674)
            .method_8022(class_8712.field_44678)
            .method_8022(class_8712.field_44669)
            .method_8022(class_8712.field_44671)
            .method_8022(class_8712.field_44677)
            .method_8022(class_8712.field_44673)
            .method_8022(class_8712.field_44670)
            .method_8022(class_8712.field_44672)
   );
   public static final class_2144 field_25572 = method_22625(
      "block",
      var0 -> var0.method_8022(class_8712.field_44677)
            .method_8022(class_8712.field_44671)
            .method_8022(class_8712.field_44670)
            .method_8020(class_8712.field_44676)
            .method_8020(class_8712.field_44673)
            .method_8020(class_8712.field_44672)
   );

   private static class_2144 method_22625(String var0, Consumer<class_1805> var1) {
      class_1805 var4 = new class_1805();
      var1.accept(var4);
      class_2144 var5 = var4.method_8021();
      class_4639 var6 = new class_4639(var0);
      class_2144 var7 = (class_2144)field_25577.put(var6, var5);
      if (var7 == null) {
         return var5;
      } else {
         throw new IllegalStateException("Loot table parameter set " + var6 + " is already registered");
      }
   }

   @Nullable
   public static class_2144 method_22626(class_4639 var0) {
      return (class_2144)field_25577.get(var0);
   }

   @Nullable
   public static class_4639 method_22627(class_2144 var0) {
      return (class_4639)field_25577.inverse().get(var0);
   }
}
