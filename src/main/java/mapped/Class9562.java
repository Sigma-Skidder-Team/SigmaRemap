package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import net.minecraft.util.datafix.TypeReferences;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Class9562 extends DataFix {
   public Class9562(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type<?> var3 = this.getInputSchema().getType(TypeReferences.CHUNK);
      Type<?> var4 = this.getOutputSchema().getType(TypeReferences.CHUNK);
      Type<?> var5 = var3.findFieldType("Level");
      Type<?> var6 = var4.findFieldType("Level");
      Type<?> var7 = var5.findFieldType("TileTicks");
      OpticFinder<?> var8 = DSL.fieldFinder("Level", var5);
      OpticFinder<?> var9 = DSL.fieldFinder("TileTicks", var7);
      return TypeRewriteRule.seq(
         this.fixTypeEverywhereTyped(
            "ChunkToProtoChunkFix",
            var3,
            this.getOutputSchema().getType(TypeReferences.CHUNK),
            var3x -> var3x.updateTyped(
                  var8,
                  var6,
                  var2x -> {
                      Optional<? extends Stream<? extends Dynamic<?>>>  var5x = var2x.getOptionalTyped(var9)
                        .flatMap(var0xx -> var0xx.write().result())
                        .flatMap(var0xx -> var0xx.asStreamOpt().result());

                      Dynamic<?> var6x = var2x.get(DSL.remainderFinder());
                     boolean var7x = var6x.get("TerrainPopulated").asBoolean(false)
                        && (!var6x.get("LightPopulated").asNumber().result().isPresent() || var6x.get("LightPopulated").asBoolean(false));
                     var6x = var6x.set("Status", var6x.createString(!var7x ? "empty" : "mobs_spawned"));
                     var6x = var6x.set("hasLegacyStructureData", var6x.createBoolean(true));
                      Dynamic<?> var8x;
                     if (!var7x) {
                        var8x = var6x;
                     } else {
                         Optional<ByteBuffer> var9x = var6x.get("Biomes").asByteBufferOpt().result();
                        if (var9x.isPresent()) {
                           ByteBuffer var10 = (ByteBuffer)var9x.get();
                           int[] var11 = new int[256];

                           for (int var12 = 0; var12 < var11.length; var12++) {
                              if (var12 < var10.capacity()) {
                                 var11[var12] = var10.get(var12) & 255;
                              }
                           }

                           var6x = var6x.set("Biomes", var6x.createIntList(Arrays.stream(var11)));
                        }

                        Dynamic<?> var15 = var6x;
                        List<ShortArrayList> var16 = IntStream.range(0, 16).<ShortArrayList>mapToObj(var0xx -> new ShortArrayList()).collect(Collectors.toList());
                        if (var5x.isPresent()) {
                           var5x.get().forEach(var1xx -> {
                              int var4x = var1xx.get("x").asInt(0);
                              int var5xx = var1xx.get("y").asInt(0);
                              int var6xx = var1xx.get("z").asInt(0);
                              short var7xx = method37060(var4x, var5xx, var6xx);
                              ((ShortList)var16.get(var5xx >> 4)).add(var7xx);
                           });
                           var6x = var6x.set(
                              "ToBeTicked", var6x.createList(var16.stream().map(var1xx -> var15.createList(var1xx.stream().map(var15::createShort))))
                           );
                        }

                        var8x = DataFixUtils.orElse(var2x.set(DSL.remainderFinder(), var6x).write().result(), var6x);
                     }

                     return (var6.readTyped(var8x).result().orElseThrow(() -> new IllegalStateException("Could not read the new chunk")))
                        .getFirst();
                  }
               )
         ),
         this.writeAndRead("Structure biome inject", this.getInputSchema().getType(TypeReferences.STRUCTURE_FEATURE), this.getOutputSchema().getType(TypeReferences.STRUCTURE_FEATURE))
      );
   }

   private static short method37060(int var0, int var1, int var2) {
      return (short)(var0 & 15 | (var1 & 15) << 4 | (var2 & 15) << 8);
   }
}
