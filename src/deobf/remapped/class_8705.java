package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class_8705 extends class_5178 {
   public class_8705(int var1, Schema var2) {
      super(var1, var2);
   }

   public static TypeTemplate method_40002(Schema var0) {
      return DSL.optionalFields("ArmorItems", DSL.list(class_4002.field_19433.in(var0)), "HandItems", DSL.list(class_4002.field_19433.in(var0)));
   }

   public static void method_40003(Schema var0, Map<String, Supplier<TypeTemplate>> var1, String var2) {
      var0.register(var1, var2, () -> method_40002(var0));
   }

   public Map<String, Supplier<TypeTemplate>> registerEntities(Schema var1) {
      Map var4 = super.registerEntities(var1);
      var4.remove("minecraft:illager_beast");
      method_40003(var1, var4, "minecraft:ravager");
      return var4;
   }
}
