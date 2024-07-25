package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Streams;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class class_7701 {
   private final Optional<Identifier> field_39085;
   private final Set<class_8940> field_39087;
   private Optional<String> field_39086;

   public class_7701(Optional<Identifier> var1, Optional<String> var2, class_8940... var3) {
      this.field_39085 = var1;
      this.field_39086 = var2;
      this.field_39087 = ImmutableSet.copyOf(var3);
   }

   public Identifier method_34883(class_6414 var1, class_1685 var2, BiConsumer<Identifier, Supplier<JsonElement>> var3) {
      return this.method_34878(class_6856.method_31445(var1, this.field_39086.orElse("")), var2, var3);
   }

   public Identifier method_34882(class_6414 var1, String var2, class_1685 var3, BiConsumer<Identifier, Supplier<JsonElement>> var4) {
      return this.method_34878(class_6856.method_31445(var1, var2 + this.field_39086.orElse("")), var3, var4);
   }

   public Identifier method_34881(class_6414 var1, String var2, class_1685 var3, BiConsumer<Identifier, Supplier<JsonElement>> var4) {
      return this.method_34878(class_6856.method_31445(var1, var2), var3, var4);
   }

   public Identifier method_34878(Identifier var1, class_1685 var2, BiConsumer<Identifier, Supplier<JsonElement>> var3) {
      Map var6 = this.method_34880(var2);
      var3.accept(var1, () -> {
         JsonObject var4 = new JsonObject();
         this.field_39085.ifPresent(var1xx -> var4.addProperty("parent", var1xx.toString()));
         if (!var6.isEmpty()) {
            JsonObject var5 = new JsonObject();
            var6.forEach((var1xx, var2x) -> var5.addProperty(var1xx.method_41074(), var2x.toString()));
            var4.add("textures", var5);
         }

         return var4;
      });
      return var1;
   }

   private Map<class_8940, Identifier> method_34880(class_1685 var1) {
      return Streams.concat(new Stream[]{this.field_39087.stream(), var1.method_7585()})
         .collect(ImmutableMap.toImmutableMap(Function.identity(), var1::method_7556));
   }
}
