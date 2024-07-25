package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class_4622 extends class_7449 {
   public class_4622(Schema var1, boolean var2) {
      super(var1, var2, "OminousBannerBlockEntityRenameFix", class_4002.field_19434, "minecraft:banner");
   }

   @Override
   public Typed<?> method_33892(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method_21400);
   }

   private Dynamic<?> method_21400(Dynamic<?> var1) {
      Optional var4 = var1.get("CustomName").asString().result();
      if (!var4.isPresent()) {
         return var1;
      } else {
         String var5 = (String)var4.get();
         var5 = var5.replace("\"translate\":\"block.minecraft.illager_banner\"", "\"translate\":\"block.minecraft.ominous_banner\"");
         return var1.set("CustomName", var1.createString(var5));
      }
   }
}
