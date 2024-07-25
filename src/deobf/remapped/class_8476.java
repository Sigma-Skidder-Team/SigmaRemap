package remapped;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class class_8476 extends DataFix {
   public class_8476(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(class_4002.field_19431);
      Type var4 = this.getOutputSchema().getType(class_4002.field_19431);
      return this.writeFixAndRead("IglooMetadataRemovalFix", var3, var4, class_8476::method_39013);
   }

   private static <T> Dynamic<T> method_39013(Dynamic<T> var0) {
      boolean var3 = var0.get("Children").asStreamOpt().map(var0x -> var0x.allMatch(class_8476::method_39012)).result().orElse(false);
      return !var3 ? var0.update("Children", class_8476::method_39011) : var0.set("id", var0.createString("Igloo")).remove("Children");
   }

   private static <T> Dynamic<T> method_39011(Dynamic<T> var0) {
      return var0.asStreamOpt().map(var0x -> var0x.filter(var0xx -> !method_39012((Dynamic<?>)var0xx))).map(var0::createList).result().orElse(var0);
   }

   private static boolean method_39012(Dynamic<?> var0) {
      return var0.get("id").asString("").equals("Iglu");
   }
}
