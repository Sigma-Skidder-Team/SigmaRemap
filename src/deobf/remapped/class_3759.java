package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class_3759 extends class_5178 {
   public class_3759(int var1, Schema var2) {
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
                  DSL.list(DSL.optionalFields("Palette", DSL.list(class_4002.field_19435.in(var1))))
               )
            )
      );
   }
}
