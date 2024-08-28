package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.List.ListType;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.stream.LongStream;

public class Class7988 extends DataFix {
   public Class7988(Schema var1) {
      super(var1, false);
   }

   public TypeRewriteRule makeRule() {
      Type var3 = this.getInputSchema().getType(Class8239.field35378);
      Type var4 = var3.findFieldType("Level");
      OpticFinder var5 = DSL.fieldFinder("Level", var4);
      OpticFinder var6 = var5.type().findField("Sections");
      Type var7 = ((ListType)var6.type()).getElement();
      OpticFinder var8 = DSL.typeFinder(var7);
      Type var9 = DSL.named(Class8239.field35388.typeName(), DSL.remainderType());
      OpticFinder var10 = DSL.fieldFinder("Palette", DSL.list(var9));
      return this.fixTypeEverywhereTyped(
         "BitStorageAlignFix",
         var3,
         this.getOutputSchema().getType(Class8239.field35378),
         var5x -> var5x.updateTyped(var5, var4xx -> this.method27144(method27145(var6, var8, var10, var4xx)))
      );
   }

   private Typed<?> method27144(Typed<?> var1) {
      return var1.update(
         DSL.remainderFinder(),
         var0 -> var0.update("Heightmaps", var1x -> var1x.updateMapValues(var1xx -> var1xx.mapSecond(var1xxx -> method27146(var0, var1xxx, 256, 9))))
      );
   }

   private static Typed<?> method27145(OpticFinder<?> var0, OpticFinder<?> var1, OpticFinder<List<Pair<String, Dynamic<?>>>> var2, Typed<?> var3) {
      return var3.updateTyped(
         var0,
         var2x -> var2x.updateTyped(
               var1,
               var1xx -> {
                  int var4 = var1xx.getOptional(var2).<Integer>map(var0xxx -> Math.max(4, DataFixUtils.ceillog2(var0xxx.size()))).orElse(0);
                  return var4 != 0 && !Class9679.method37801(var4)
                     ? var1xx.update(DSL.remainderFinder(), var1xxx -> var1xxx.update("BlockStates", var2xx -> method27146(var1xxx, var2xx, 4096, var4)))
                     : var1xx;
               }
            )
      );
   }

   private static Dynamic<?> method27146(Dynamic<?> var0, Dynamic<?> var1, int var2, int var3) {
      long[] var6 = var1.asLongStream().toArray();
      long[] var7 = method27147(var2, var3, var6);
      return var0.createLongList(LongStream.of(var7));
   }

   public static long[] method27147(int var0, int var1, long[] var2) {
      int var5 = var2.length;
      if (var5 != 0) {
         long var6 = (1L << var1) - 1L;
         int var8 = 64 / var1;
         int var9 = (var0 + var8 - 1) / var8;
         long[] var10 = new long[var9];
         int var11 = 0;
         int var12 = 0;
         long var13 = 0L;
         int var15 = 0;
         long var16 = var2[0];
         long var18 = var5 <= 1 ? 0L : var2[1];

         for (int var20 = 0; var20 < var0; var20++) {
            int var21 = var20 * var1;
            int var22 = var21 >> 6;
            int var23 = (var20 + 1) * var1 - 1 >> 6;
            int var24 = var21 ^ var22 << 6;
            if (var22 != var15) {
               var16 = var18;
               var18 = var22 + 1 >= var5 ? 0L : var2[var22 + 1];
               var15 = var22;
            }

            long var26;
            if (var22 != var23) {
               int var25 = 64 - var24;
               var26 = (var16 >>> var24 | var18 << var25) & var6;
            } else {
               var26 = var16 >>> var24 & var6;
            }

            int var28 = var12 + var1;
            if (var28 < 64) {
               var13 |= var26 << var12;
               var12 = var28;
            } else {
               var10[var11++] = var13;
               var13 = var26;
               var12 = var1;
            }
         }

         if (var13 != 0L) {
            var10[var11] = var13;
         }

         return var10;
      } else {
         return var2;
      }
   }
}
