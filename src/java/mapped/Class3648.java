package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import net.minecraft.util.datafix.TypeReferences;

import java.util.Map;
import java.util.function.Supplier;

public class Class3648 extends Class3639 {
   public Class3648(int var1, Schema var2) {
      super(var1, var2);
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map var4 = super.registerBlockEntities(var1);
      var1.registerSimple(var4, "minecraft:bed");
      return var4;
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         false,
         TypeReferences.ADVANCEMENTS,
         () -> DSL.optionalFields(
               "minecraft:adventure/adventuring_time",
               DSL.optionalFields("criteria", DSL.compoundList(TypeReferences.BIOME.in(var1), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_a_mob",
               DSL.optionalFields("criteria", DSL.compoundList(TypeReferences.ENTITY_NAME.in(var1), DSL.constType(DSL.string()))),
               "minecraft:adventure/kill_all_mobs",
               DSL.optionalFields("criteria", DSL.compoundList(TypeReferences.ENTITY_NAME.in(var1), DSL.constType(DSL.string()))),
               "minecraft:husbandry/bred_all_animals",
               DSL.optionalFields("criteria", DSL.compoundList(TypeReferences.ENTITY_NAME.in(var1), DSL.constType(DSL.string())))
            )
      );
      var1.registerType(false, TypeReferences.BIOME, () -> DSL.constType(method12354()));
      var1.registerType(false, TypeReferences.ENTITY_NAME, () -> DSL.constType(method12354()));
   }
}
