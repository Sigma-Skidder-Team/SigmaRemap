package mapped;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;

public class Class6728 extends Class6717 {
   private static final Map<String, String> field29440 = DataFixUtils.make(Maps.newHashMap(), var0 -> {
      var0.put("donkeykong", "donkey_kong");
      var0.put("burningskull", "burning_skull");
      var0.put("skullandroses", "skull_and_roses");
   });

   public Class6728(Schema var1, boolean var2) {
      super(var1, var2, "EntityPaintingMotiveFix", Class8239.field35391, "minecraft:painting");
   }

   public Dynamic<?> method20530(Dynamic<?> var1) {
      Optional var4 = var1.get("Motive").asString().result();
      if (!var4.isPresent()) {
         return var1;
      } else {
         String var5 = ((String)var4.get()).toLowerCase(Locale.ROOT);
         return var1.set("Motive", var1.createString(new ResourceLocation(field29440.getOrDefault(var5, var5)).toString()));
      }
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method20530);
   }
}
