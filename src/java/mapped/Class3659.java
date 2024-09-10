package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class Class3659 extends Class3639 {
   public Class3659(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      var1.registerType(
         false,
         TypeReferences.field35378,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(TypeReferences.field35390.in(var1)),
                  "TileEntities",
                  DSL.list(TypeReferences.field35386.in(var1)),
                  "TileTicks",
                  DSL.list(DSL.fields("i", TypeReferences.field35392.in(var1))),
                  "Sections",
                  DSL.list(DSL.optionalFields("Palette", DSL.list(TypeReferences.field35388.in(var1))))
               )
            )
      );
   }
}
