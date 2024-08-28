package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class Class6739 extends Class6717 {
   public Class6739(Schema var1, boolean var2) {
      super(var1, var2, "OminousBannerBlockEntityRenameFix", Class8239.field35386, "minecraft:banner");
   }

   @Override
   public Typed<?> method20508(Typed<?> var1) {
      return var1.update(DSL.remainderFinder(), this::method20552);
   }

   private Dynamic<?> method20552(Dynamic<?> var1) {
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
