package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class_6428 extends class_5178 {
   public class_6428(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
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
               )
            )
      );
   }
}
