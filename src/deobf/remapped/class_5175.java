package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.templates.TypeTemplate;
import java.util.Map;
import java.util.function.Supplier;

public class class_5175 extends class_5178 {
   public class_5175(int var1, Schema var2) {
      super(var1, var2);
   }

   public void registerTypes(Schema var1, Map<String, Supplier<TypeTemplate>> var2, Map<String, Supplier<TypeTemplate>> var3) {
      super.registerTypes(var1, var2, var3);
      Supplier var6 = () -> DSL.compoundList(class_4002.field_19439.in(var1), DSL.constType(DSL.intType()));
      var1.registerType(
         false,
         class_4002.field_19452,
         () -> DSL.optionalFields(
               "stats",
               DSL.optionalFields(
                  "minecraft:mined",
                  DSL.compoundList(class_4002.field_19432.in(var1), DSL.constType(DSL.intType())),
                  "minecraft:crafted",
                  (TypeTemplate)var6.get(),
                  "minecraft:used",
                  (TypeTemplate)var6.get(),
                  "minecraft:broken",
                  (TypeTemplate)var6.get(),
                  "minecraft:picked_up",
                  (TypeTemplate)var6.get(),
                  DSL.optionalFields(
                     "minecraft:dropped",
                     (TypeTemplate)var6.get(),
                     "minecraft:killed",
                     DSL.compoundList(class_4002.field_19446.in(var1), DSL.constType(DSL.intType())),
                     "minecraft:killed_by",
                     DSL.compoundList(class_4002.field_19446.in(var1), DSL.constType(DSL.intType())),
                     "minecraft:custom",
                     DSL.compoundList(DSL.constType(method_23741()), DSL.constType(DSL.intType()))
                  )
               )
            )
      );
   }
}
