package mapped;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Splitter;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;
import org.apache.commons.lang3.math.NumberUtils;

public class Class9445 extends DataFix {
   private static final Splitter field43875 = Splitter.on(';').limit(5);
   private static final Splitter field43876 = Splitter.on(',');
   private static final Splitter field43877 = Splitter.on('x').limit(2);
   private static final Splitter field43878 = Splitter.on('*').limit(2);
   private static final Splitter field43879 = Splitter.on(':').limit(3);

   public Class9445(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      return this.fixTypeEverywhereTyped(
         "LevelFlatGeneratorInfoFix", this.getInputSchema().getType(Class8239.field35376), var1 -> var1.update(DSL.remainderFinder(), this::method36302)
      );
   }

   private Dynamic<?> method36302(Dynamic<?> var1) {
      return !var1.get("generatorName").asString("").equalsIgnoreCase("flat")
         ? var1
         : var1.update(
            "generatorOptions",
            var1x -> (Dynamic)DataFixUtils.orElse(var1x.asString().map(this::method36303).map(var1xx -> var1x.createString(var1xx)).result(), var1x)
         );
   }

   @VisibleForTesting
   public String method36303(String var1) {
      if (!var1.isEmpty()) {
         Iterator var4 = field43875.split(var1).iterator();
         String var5 = (String)var4.next();
         int var6;
         String var7;
         if (!var4.hasNext()) {
            var6 = 0;
            var7 = var5;
         } else {
            var6 = NumberUtils.toInt(var5, 0);
            var7 = (String)var4.next();
         }

         if (var6 >= 0 && var6 <= 3) {
            StringBuilder var8 = new StringBuilder();
            Splitter var9 = var6 >= 3 ? field43878 : field43877;
            var8.append(StreamSupport.<String>stream(field43876.split(var7).spliterator(), false).<CharSequence>map(var2 -> {
               List var5x = var9.splitToList(var2);
               int var6x;
               String var7x;
               if (var5x.size() != 2) {
                  var6x = 1;
                  var7x = (String)var5x.get(0);
               } else {
                  var6x = NumberUtils.toInt((String)var5x.get(0));
                  var7x = (String)var5x.get(1);
               }

               List var8x = field43879.splitToList(var7x);
               int var9x = !((String)var8x.get(0)).equals("minecraft") ? 0 : 1;
               String var10 = (String)var8x.get(var9x);
               int var11 = var6 != 3 ? NumberUtils.toInt(var10, 0) : Class9122.method34018("minecraft:" + var10);
               int var12 = var9x + 1;
               int var13 = var8x.size() <= var12 ? 0 : NumberUtils.toInt((String)var8x.get(var12), 0);
               return (var6x != 1 ? var6x + "*" : "") + Class9398.method35692(var11 << 4 | var13).get("Name").asString("");
            }).collect(Collectors.joining(",")));

            while (var4.hasNext()) {
               var8.append(';').append((String)var4.next());
            }

            return var8.toString();
         } else {
            return "minecraft:bedrock,2*minecraft:dirt,minecraft:grass_block;1;village";
         }
      } else {
         return "minecraft:bedrock,2*minecraft:dirt,minecraft:grass_block;1;village";
      }
   }
}
