package remapped;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.stream.Stream;

public class class_1211 extends DataFix {
   public class_1211(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      return this.writeFixAndRead(
         "SavedDataVillageCropFix",
         this.getInputSchema().getType(class_4002.field_19431),
         this.getOutputSchema().getType(class_4002.field_19431),
         this::method_5372
      );
   }

   private <T> Dynamic<T> method_5372(Dynamic<T> var1) {
      return var1.update("Children", class_1211::method_5374);
   }

   private static <T> Dynamic<T> method_5374(Dynamic<T> var0) {
      return var0.asStreamOpt().map(class_1211::method_5375).map(var0::createList).result().orElse(var0);
   }

   private static Stream<? extends Dynamic<?>> method_5375(Stream<? extends Dynamic<?>> var0) {
      return var0.map(var0x -> {
         String var3 = var0x.get("id").asString("");
         if (!"ViF".equals(var3)) {
            return !"ViDF".equals(var3) ? var0x : method_5378(var0x);
         } else {
            return method_5373(var0x);
         }
      });
   }

   private static <T> Dynamic<T> method_5373(Dynamic<T> var0) {
      var0 = method_5377(var0, "CA");
      return method_5377(var0, "CB");
   }

   private static <T> Dynamic<T> method_5378(Dynamic<T> var0) {
      var0 = method_5377(var0, "CA");
      var0 = method_5377(var0, "CB");
      var0 = method_5377(var0, "CC");
      return method_5377(var0, "CD");
   }

   private static <T> Dynamic<T> method_5377(Dynamic<T> var0, String var1) {
      return !var0.get(var1).asNumber().result().isPresent() ? var0 : var0.set(var1, class_8237.method_37732(var0.get(var1).asInt(0) << 4));
   }
}
