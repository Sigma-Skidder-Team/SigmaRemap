package remapped;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

public class class_3086 extends class_7449 {
   private static final Map<String, String> field_15297 = (Map<String, String>)DataFixUtils.make(Maps.newHashMap(), var0 -> {
      var0.put("donkeykong", "donkey_kong");
      var0.put("burningskull", "burning_skull");
      var0.put("skullandroses", "skull_and_roses");
   });

   public class_3086(Schema var1, boolean var2) {
      super(var1, var2, "EntityPaintingMotiveFix", class_4002.field_19444, "minecraft:painting");
   }

   public Dynamic<?> method_14158(Dynamic<?> var1) {
      Optional var4 = var1.get("Motive").asString().result();
      if (!var4.isPresent()) {
         return var1;
      } else {
         String var5 = ((String)var4.get()).toLowerCase(Locale.ROOT);
         return var1.set("Motive", var1.createString(new Identifier(field_15297.getOrDefault(var5, var5)).toString()));
      }
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method_14158);
   }
}
