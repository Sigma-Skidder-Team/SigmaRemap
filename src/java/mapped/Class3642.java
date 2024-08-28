package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
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
         Class8239.field35378,
         () -> DSL.fields(
               "Level",
               DSL.optionalFields(
                  "Entities",
                  DSL.list(Class8239.field35390.in(var1)),
                  "TileEntities",
                  DSL.list(Class8239.field35386.in(var1)),
                  "TileTicks",
                  DSL.list(DSL.fields("i", Class8239.field35392.in(var1))),
                  "Sections",
                  DSL.list(DSL.optionalFields("Palette", DSL.list(Class8239.field35388.in(var1)))),
                  "Structures",
                  DSL.optionalFields("Starts", DSL.compoundList(Class8239.field35395.in(var1)))
               )
            )
      );
      var1.registerType(
         false,
         Class8239.field35395,
         () -> DSL.optionalFields(
               "Children",
               DSL.list(
                  DSL.optionalFields(
                     "CA",
                     Class8239.field35388.in(var1),
                     "CB",
                     Class8239.field35388.in(var1),
                     "CC",
                     Class8239.field35388.in(var1),
                     "CD",
                     Class8239.field35388.in(var1)
                  )
               ),
               "biome",
               Class8239.field35399.in(var1)
            )
      );
   }

   public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema var1) {
      Map<String, Supplier<TypeTemplate>> var4 = super.registerBlockEntities(var1);
      var4.put("DUMMY", DSL::remainder);
      return var4;
   }
}
