package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class_8019 extends class_5178 {
   public class_8019(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         false,
         class_4002.field_19449,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(class_4002.field_19451.in(var1)),
                  "TileEntities",
                  DSL.list(class_4002.field_19434.in(var1)),
                  "TileTicks",
                  DSL.list(DSL.fields("i", class_4002.field_19432.in(var1))),
                  "Sections",
                  DSL.list(DSL.optionalFields("Palette", DSL.list(class_4002.field_19435.in(var1)))),
                  "Structures",
                  DSL.optionalFields("Starts", DSL.compoundList(class_4002.field_19431.in(var1)))
               )
            )
      );
      var1.registerType(
         false,
         class_4002.field_19431,
         () -> DSL.optionalFields(
               "Children",
               DSL.list(
                  DSL.optionalFields(
                     "CA",
                     class_4002.field_19435.in(var1),
                     "CB",
                     class_4002.field_19435.in(var1),
                     "CC",
                     class_4002.field_19435.in(var1),
                     "CD",
                     class_4002.field_19435.in(var1)
                  )
               ),
               "biome",
               class_4002.field_19440.in(var1)
            )
      );
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map var4 = super.registerBlockEntities(var1);
      var4.put("DUMMY", DSL::remainder);
      return var4;
   }
}
