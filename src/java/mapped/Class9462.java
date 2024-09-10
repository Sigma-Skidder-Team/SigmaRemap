package mapped;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class Class9462 extends DataFix {
   public Class9462(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(TypeReferences.field35395);
      Type var4 = this.getOutputSchema().getType(TypeReferences.field35395);
      return this.writeFixAndRead("IglooMetadataRemovalFix", var3, var4, Class9462::method36419);
   }

   private static <T> Dynamic<T> method36419(Dynamic<T> var0) {
      boolean var3 = var0.get("Children").asStreamOpt().map(var0x -> var0x.allMatch(Class9462::method36421)).result().orElse(false);
      return !var3 ? var0.update("Children", Class9462::method36420) : var0.set("id", var0.createString("Igloo")).remove("Children");
   }

   private static <T> Dynamic<T> method36420(Dynamic<T> var0) {
      return var0.asStreamOpt().map(var0x -> var0x.filter(var0xx -> !method36421((Dynamic<?>)var0xx))).map(var0::createList).result().orElse(var0);
   }

   private static boolean method36421(Dynamic<?> var0) {
      return var0.get("id").asString("").equals("Iglu");
   }
}
