package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.types.templates.Hook.HookFunction;
import net.minecraft.util.datafix.TypeReferences;

import java.util.Map;
import java.util.function.Supplier;

public class Class9121 extends Schema {
   public Class9121(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         true,
         TypeReferences.ITEM_STACK,
         () -> DSL.hook(
               DSL.optionalFields(
                  "id",
                  TypeReferences.ITEM_NAME.in(var1),
                  "tag",
                  DSL.optionalFields(
                     "EntityTag",
                     TypeReferences.ENTITY_TREE.in(var1),
                     "BlockEntityTag",
                     TypeReferences.BLOCK_ENTITY.in(var1),
                     "CanDestroy",
                     DSL.list(TypeReferences.BLOCK_NAME.in(var1)),
                     "CanPlaceOn",
                     DSL.list(TypeReferences.BLOCK_NAME.in(var1))
                  )
               ),
               Class8604.field38714,
               HookFunction.IDENTITY
            )
      );
   }
}
