package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import net.minecraft.util.datafix.TypeReferences;

import java.util.Map;
import java.util.function.Supplier;

public class Class3642 extends Class3639 {
   public Class3642(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         false,
         TypeReferences.CHUNK,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(TypeReferences.ENTITY_TREE.in(var1)),
                  "TileEntities",
                  DSL.list(TypeReferences.BLOCK_ENTITY.in(var1)),
                  "TileTicks",
                  DSL.list(DSL.fields("i", TypeReferences.BLOCK_NAME.in(var1))),
                  "Sections",
                  DSL.list(DSL.optionalFields("Palette", DSL.list(TypeReferences.BLOCK_STATE.in(var1)))),
                  "Structures",
                  DSL.optionalFields("Starts", DSL.compoundList(TypeReferences.STRUCTURE_FEATURE.in(var1)))
               )
            )
      );
      var1.registerType(
         false,
         TypeReferences.STRUCTURE_FEATURE,
         () -> DSL.optionalFields(
               "Children",
               DSL.list(
                  DSL.optionalFields(
                     "CA",
                     TypeReferences.BLOCK_STATE.in(var1),
                     "CB",
                     TypeReferences.BLOCK_STATE.in(var1),
                     "CC",
                     TypeReferences.BLOCK_STATE.in(var1),
                     "CD",
                     TypeReferences.BLOCK_STATE.in(var1)
                  )
               ),
               "biome",
               TypeReferences.BIOME.in(var1)
            )
      );
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map<String, Supplier<TypeTemplate>> var4 = super.registerBlockEntities(var1);
      var4.put("DUMMY", DSL::remainder);
      return var4;
   }
}
