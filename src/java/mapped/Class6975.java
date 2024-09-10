package mapped;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.stream.Stream;

public class Class6975 extends DataFix {
   public Class6975(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      return this.writeFixAndRead(
         "SavedDataVillageCropFix",
         this.getInputSchema().getType(TypeReferences.field35395),
         this.getOutputSchema().getType(TypeReferences.field35395),
         this::method21529
      );
   }

   private <T> Dynamic<T> method21529(Dynamic<T> var1) {
      return var1.update("Children", Class6975::method21530);
   }

   private static <T> Dynamic<T> method21530(Dynamic<T> var0) {
      return var0.asStreamOpt().map(Class6975::method21531).map(var0::createList).result().orElse(var0);
   }

   private static Stream<? extends Dynamic<?>> method21531(Stream<? extends Dynamic<?>> var0) {
      return var0.map(var0x -> {
         String var3 = var0x.get("id").asString("");
         if (!"ViF".equals(var3)) {
            return !"ViDF".equals(var3) ? var0x : method21533(var0x);
         } else {
            return method21532(var0x);
         }
      });
   }

   private static <T> Dynamic<T> method21532(Dynamic<T> var0) {
      var0 = method21534(var0, "CA");
      return method21534(var0, "CB");
   }

   private static <T> Dynamic<T> method21533(Dynamic<T> var0) {
      var0 = method21534(var0, "CA");
      var0 = method21534(var0, "CB");
      var0 = method21534(var0, "CC");
      return method21534(var0, "CD");
   }

   private static <T> Dynamic<T> method21534(Dynamic<T> var0, String var1) {
      return !var0.get(var1).asNumber().result().isPresent() ? var0 : var0.set(var1, Class9398.method35692(var0.get(var1).asInt(0) << 4));
   }
}
