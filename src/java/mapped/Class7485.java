package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;

public class Class7485 extends DataFix {
   private static final int[][] field32180 = new int[][]{{0, 0, 1}, {-1, 0, 0}, {0, 0, -1}, {1, 0, 0}};

   public Class7485(Schema var1, boolean var2) {
      super(var1, var2);
   }

   private Dynamic<?> method24369(Dynamic<?> var1, boolean var2, boolean var3) {
      if ((var2 || var3) && !var1.get("Facing").asNumber().result().isPresent()) {
         int var6;
         if (!var1.get("Direction").asNumber().result().isPresent()) {
            var6 = var1.get("Dir").asByte((byte)0) % field32180.length;
            var1 = var1.remove("Dir");
         } else {
            var6 = var1.get("Direction").asByte((byte)0) % field32180.length;
            int[] var7 = field32180[var6];
            var1 = var1.set("TileX", var1.createInt(var1.get("TileX").asInt(0) + var7[0]));
            var1 = var1.set("TileY", var1.createInt(var1.get("TileY").asInt(0) + var7[1]));
            var1 = var1.set("TileZ", var1.createInt(var1.get("TileZ").asInt(0) + var7[2]));
            var1 = var1.remove("Direction");
            if (var3 && var1.get("ItemRotation").asNumber().result().isPresent()) {
               var1 = var1.set("ItemRotation", var1.createByte((byte)(var1.get("ItemRotation").asByte((byte)0) * 2)));
            }
         }

         var1 = var1.set("Facing", var1.createByte((byte)var6));
      }

      return var1;
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getChoiceType(Class8239.field35391, "Painting");
      OpticFinder var4 = DSL.namedChoice("Painting", var3);
      Type var5 = this.getInputSchema().getChoiceType(Class8239.field35391, "ItemFrame");
      OpticFinder var6 = DSL.namedChoice("ItemFrame", var5);
      Type var7 = this.getInputSchema().getType(Class8239.field35391);
      TypeRewriteRule var8 = this.fixTypeEverywhereTyped(
         "EntityPaintingFix",
         var7,
         var3x -> var3x.updateTyped(var4, var3, var1x -> var1x.update(DSL.remainderFinder(), var1xx -> this.method24369(var1xx, true, false)))
      );
      TypeRewriteRule var9 = this.fixTypeEverywhereTyped(
         "EntityItemFrameFix",
         var7,
         var3x -> var3x.updateTyped(var6, var5, var1x -> var1x.update(DSL.remainderFinder(), var1xx -> this.method24369(var1xx, false, true)))
      );
      return TypeRewriteRule.seq(var8, var9);
   }
}
