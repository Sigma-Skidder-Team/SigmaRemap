package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import net.minecraft.util.datafix.TypeReferences;

import java.util.Map;
import java.util.function.Supplier;

public class Class8257 extends Schema {
   public Class8257(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(false, TypeReferences.RECIPE, () -> DSL.constType(Class3639.method12354()));
      var1.registerType(
         false,
         TypeReferences.PLAYER,
         () -> DSL.optionalFields(
               "RootVehicle",
               DSL.optionalFields("Entity", TypeReferences.ENTITY_TREE.in(var1)),
               "Inventory",
               DSL.list(TypeReferences.ITEM_STACK.in(var1)),
               "EnderItems",
               DSL.list(TypeReferences.ITEM_STACK.in(var1)),
               DSL.optionalFields(
                  "ShoulderEntityLeft",
                  TypeReferences.ENTITY_TREE.in(var1),
                  "ShoulderEntityRight",
                  TypeReferences.ENTITY_TREE.in(var1),
                  "recipeBook",
                  DSL.optionalFields("recipes", DSL.list(TypeReferences.RECIPE.in(var1)), "toBeDisplayed", DSL.list(TypeReferences.RECIPE.in(var1)))
               )
            )
      );
      var1.registerType(false, TypeReferences.HOTBAR, () -> DSL.compoundList(DSL.list(TypeReferences.ITEM_STACK.in(var1))));
   }
}
