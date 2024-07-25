package remapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class class_7456 extends DataFix {
   public class_7456(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(class_4002.field_19449);
      OpticFinder var4 = var3.findField("Level");
      return this.fixTypeEverywhereTyped("Leaves fix", var3, var1 -> var1.updateTyped(var4, var0x -> var0x.update(DSL.remainderFinder(), var0xx -> {
               Optional var3x = var0xx.get("Biomes").asIntStreamOpt().result();
               if (!var3x.isPresent()) {
                  return var0xx;
               } else {
                  int[] var4x = ((IntStream)var3x.get()).toArray();
                  int[] var5 = new int[1024];

                  for (int var6 = 0; var6 < 4; var6++) {
                     for (int var7 = 0; var7 < 4; var7++) {
                        int var8 = (var7 << 2) + 2;
                        int var9 = (var6 << 2) + 2;
                        int var10 = var9 << 4 | var8;
                        var5[var6 << 2 | var7] = var10 >= var4x.length ? -1 : var4x[var10];
                     }
                  }

                  for (int var11 = 1; var11 < 64; var11++) {
                     System.arraycopy(var5, 0, var5, var11 * 16, 16);
                  }

                  return var0xx.set("Biomes", var0xx.createIntList(Arrays.stream(var5)));
               }
            })));
   }
}
