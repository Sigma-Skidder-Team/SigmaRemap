package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class Class9197 extends Schema {
   public Class9197(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var4 = super.registerEntities(var1);
      var4.remove("EntityHorse");
      var1.register(
         var4,
         "Horse",
         () -> DSL.optionalFields("ArmorItem", TypeReferences.field35387.in(var1), "SaddleItem", TypeReferences.field35387.in(var1), Class9674.method37738(var1))
      );
      var1.register(
         var4,
         "Donkey",
         () -> DSL.optionalFields("Items", DSL.list(TypeReferences.field35387.in(var1)), "SaddleItem", TypeReferences.field35387.in(var1), Class9674.method37738(var1))
      );
      var1.register(
         var4,
         "Mule",
         () -> DSL.optionalFields("Items", DSL.list(TypeReferences.field35387.in(var1)), "SaddleItem", TypeReferences.field35387.in(var1), Class9674.method37738(var1))
      );
      var1.register(var4, "ZombieHorse", () -> DSL.optionalFields("SaddleItem", TypeReferences.field35387.in(var1), Class9674.method37738(var1)));
      var1.register(var4, "SkeletonHorse", () -> DSL.optionalFields("SaddleItem", TypeReferences.field35387.in(var1), Class9674.method37738(var1)));
      return var4;
   }
}
