package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class Class3672 extends Class3639 {
   public Class3672(int var1, Schema var2) {
      super(var1, var2);
   }

   public static TypeTemplate method12489(Schema var0) {
      return DSL.optionalFields("ArmorItems", DSL.list(TypeReferences.field35387.in(var0)), "HandItems", DSL.list(TypeReferences.field35387.in(var0)));
   }

   public static void method12490(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> method12489(var0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var4 = super.registerEntities(var1);
      var4.remove("minecraft:illager_beast");
      method12490(var1, var4, "minecraft:ravager");
      return var4;
   }
}
