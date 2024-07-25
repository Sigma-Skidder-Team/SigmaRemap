package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class_4389 extends DataFix {
   public class_4389(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(class_4002.field_19449);
      OpticFinder var4 = var3.findField("Level");
      return this.fixTypeEverywhereTyped(
         "HeightmapRenamingFix", var3, var2 -> var2.updateTyped(var4, var1x -> var1x.update(DSL.remainderFinder(), this::method_20456))
      );
   }

   private Dynamic<?> method_20456(Dynamic<?> var1) {
      Optional var4 = var1.get("Heightmaps").result();
      if (var4.isPresent()) {
         Dynamic var5 = (Dynamic)var4.get();
         Optional var6 = var5.get("LIQUID").result();
         if (var6.isPresent()) {
            var5 = var5.remove("LIQUID");
            var5 = var5.set("WORLD_SURFACE_WG", (Dynamic)var6.get());
         }

         Optional var7 = var5.get("SOLID").result();
         if (var7.isPresent()) {
            var5 = var5.remove("SOLID");
            var5 = var5.set("OCEAN_FLOOR_WG", (Dynamic)var7.get());
            var5 = var5.set("OCEAN_FLOOR", (Dynamic)var7.get());
         }

         Optional var8 = var5.get("LIGHT").result();
         if (var8.isPresent()) {
            var5 = var5.remove("LIGHT");
            var5 = var5.set("LIGHT_BLOCKING", (Dynamic)var8.get());
         }

         Optional var9 = var5.get("RAIN").result();
         if (var9.isPresent()) {
            var5 = var5.remove("RAIN");
            var5 = var5.set("MOTION_BLOCKING", (Dynamic)var9.get());
            var5 = var5.set("MOTION_BLOCKING_NO_LEAVES", (Dynamic)var9.get());
         }

         return var1.set("Heightmaps", var5);
      } else {
         return var1;
      }
   }
}
