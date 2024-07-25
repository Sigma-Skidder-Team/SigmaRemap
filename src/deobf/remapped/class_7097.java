package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import java.util.Map;
import java.util.function.Supplier;

public class class_7097 extends Schema {
   public class_7097(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         true,
         class_4002.field_19433,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  class_4002.field_19439.in(var1),
                  "tag",
                  DSL.optionalFields(
                     "EntityTag",
                     class_4002.field_19451.in(var1),
                     "BlockEntityTag",
                     class_4002.field_19434.in(var1),
                     "CanDestroy",
                     DSL.list(class_4002.field_19432.in(var1)),
                     "CanPlaceOn",
                     DSL.list(class_4002.field_19432.in(var1))
                  )
               ),
               class_5185.field_26682,
               HookFunction.IDENTITY
            )
      );
   }
}
