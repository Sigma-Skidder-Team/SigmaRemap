package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class Class3645 extends Class3639 {
   public Class3645(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
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
               )
            )
      );
   }
}
