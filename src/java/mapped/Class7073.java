package mapped;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;

public class Class7073 extends DataFix {
   private static final String[] field30458 = (String[])DataFixUtils.make(new String[128], var0 -> {
      var0[0] = "minecraft:water";
      var0[1] = "minecraft:regeneration";
      var0[2] = "minecraft:swiftness";
      var0[3] = "minecraft:fire_resistance";
      var0[4] = "minecraft:poison";
      var0[5] = "minecraft:healing";
      var0[6] = "minecraft:night_vision";
      var0[7] = null;
      var0[8] = "minecraft:weakness";
      var0[9] = "minecraft:strength";
      var0[10] = "minecraft:slowness";
      var0[11] = "minecraft:leaping";
      var0[12] = "minecraft:harming";
      var0[13] = "minecraft:water_breathing";
      var0[14] = "minecraft:invisibility";
      var0[15] = null;
      var0[16] = "minecraft:awkward";
      var0[17] = "minecraft:regeneration";
      var0[18] = "minecraft:swiftness";
      var0[19] = "minecraft:fire_resistance";
      var0[20] = "minecraft:poison";
      var0[21] = "minecraft:healing";
      var0[22] = "minecraft:night_vision";
      var0[23] = null;
      var0[24] = "minecraft:weakness";
      var0[25] = "minecraft:strength";
      var0[26] = "minecraft:slowness";
      var0[27] = "minecraft:leaping";
      var0[28] = "minecraft:harming";
      var0[29] = "minecraft:water_breathing";
      var0[30] = "minecraft:invisibility";
      var0[31] = null;
      var0[32] = "minecraft:thick";
      var0[33] = "minecraft:strong_regeneration";
      var0[34] = "minecraft:strong_swiftness";
      var0[35] = "minecraft:fire_resistance";
      var0[36] = "minecraft:strong_poison";
      var0[37] = "minecraft:strong_healing";
      var0[38] = "minecraft:night_vision";
      var0[39] = null;
      var0[40] = "minecraft:weakness";
      var0[41] = "minecraft:strong_strength";
      var0[42] = "minecraft:slowness";
      var0[43] = "minecraft:strong_leaping";
      var0[44] = "minecraft:strong_harming";
      var0[45] = "minecraft:water_breathing";
      var0[46] = "minecraft:invisibility";
      var0[47] = null;
      var0[48] = null;
      var0[49] = "minecraft:strong_regeneration";
      var0[50] = "minecraft:strong_swiftness";
      var0[51] = "minecraft:fire_resistance";
      var0[52] = "minecraft:strong_poison";
      var0[53] = "minecraft:strong_healing";
      var0[54] = "minecraft:night_vision";
      var0[55] = null;
      var0[56] = "minecraft:weakness";
      var0[57] = "minecraft:strong_strength";
      var0[58] = "minecraft:slowness";
      var0[59] = "minecraft:strong_leaping";
      var0[60] = "minecraft:strong_harming";
      var0[61] = "minecraft:water_breathing";
      var0[62] = "minecraft:invisibility";
      var0[63] = null;
      var0[64] = "minecraft:mundane";
      var0[65] = "minecraft:long_regeneration";
      var0[66] = "minecraft:long_swiftness";
      var0[67] = "minecraft:long_fire_resistance";
      var0[68] = "minecraft:long_poison";
      var0[69] = "minecraft:healing";
      var0[70] = "minecraft:long_night_vision";
      var0[71] = null;
      var0[72] = "minecraft:long_weakness";
      var0[73] = "minecraft:long_strength";
      var0[74] = "minecraft:long_slowness";
      var0[75] = "minecraft:long_leaping";
      var0[76] = "minecraft:harming";
      var0[77] = "minecraft:long_water_breathing";
      var0[78] = "minecraft:long_invisibility";
      var0[79] = null;
      var0[80] = "minecraft:awkward";
      var0[81] = "minecraft:long_regeneration";
      var0[82] = "minecraft:long_swiftness";
      var0[83] = "minecraft:long_fire_resistance";
      var0[84] = "minecraft:long_poison";
      var0[85] = "minecraft:healing";
      var0[86] = "minecraft:long_night_vision";
      var0[87] = null;
      var0[88] = "minecraft:long_weakness";
      var0[89] = "minecraft:long_strength";
      var0[90] = "minecraft:long_slowness";
      var0[91] = "minecraft:long_leaping";
      var0[92] = "minecraft:harming";
      var0[93] = "minecraft:long_water_breathing";
      var0[94] = "minecraft:long_invisibility";
      var0[95] = null;
      var0[96] = "minecraft:thick";
      var0[97] = "minecraft:regeneration";
      var0[98] = "minecraft:swiftness";
      var0[99] = "minecraft:long_fire_resistance";
      var0[100] = "minecraft:poison";
      var0[101] = "minecraft:strong_healing";
      var0[102] = "minecraft:long_night_vision";
      var0[103] = null;
      var0[104] = "minecraft:long_weakness";
      var0[105] = "minecraft:strength";
      var0[106] = "minecraft:long_slowness";
      var0[107] = "minecraft:leaping";
      var0[108] = "minecraft:strong_harming";
      var0[109] = "minecraft:long_water_breathing";
      var0[110] = "minecraft:long_invisibility";
      var0[111] = null;
      var0[112] = null;
      var0[113] = "minecraft:regeneration";
      var0[114] = "minecraft:swiftness";
      var0[115] = "minecraft:long_fire_resistance";
      var0[116] = "minecraft:poison";
      var0[117] = "minecraft:strong_healing";
      var0[118] = "minecraft:long_night_vision";
      var0[119] = null;
      var0[120] = "minecraft:long_weakness";
      var0[121] = "minecraft:strength";
      var0[122] = "minecraft:long_slowness";
      var0[123] = "minecraft:leaping";
      var0[124] = "minecraft:strong_harming";
      var0[125] = "minecraft:long_water_breathing";
      var0[126] = "minecraft:long_invisibility";
      var0[127] = null;
   });

   public Class7073(Schema var1, boolean var2) {
      super(var1, var2);
   }

   public TypeRewriteRule makeRule() {
      Type<?> var3 = this.getInputSchema().getType(Class8239.field35387);
      OpticFinder<Pair<String, String>> var4 = DSL.fieldFinder("id", DSL.named(Class8239.field35393.typeName(), Class3639.method12354()));
      OpticFinder<?> var5 = var3.findField("tag");
      return this.fixTypeEverywhereTyped(
         "ItemPotionFix",
         var3,
         var2 -> {
            Optional<Pair<String, String>> var5x = var2.getOptional(var4);
            if (var5x.isPresent() && Objects.equals(((Pair)var5x.get()).getSecond(), "minecraft:potion")) {
               Dynamic var6 = (Dynamic)var2.get(DSL.remainderFinder());
               Optional var7 = var2.getOptionalTyped(var5);
               short var8 = var6.get("Damage").asShort((short)0);
               if (var7.isPresent()) {
                  Typed var9 = var2;
                  Dynamic var10 = (Dynamic)((Typed)var7.get()).get(DSL.remainderFinder());
                  Optional var11 = var10.get("Potion").asString().result();
                  if (!var11.isPresent()) {
                     String var12 = field30458[var8 & 127];
                     Typed var13 = ((Typed)var7.get())
                        .set(DSL.remainderFinder(), var10.set("Potion", var10.createString(var12 != null ? var12 : "minecraft:water")));
                     var9 = var2.set(var5, var13);
                     if ((var8 & 16384) == 16384) {
                        var9 = var9.set(var4, Pair.of(Class8239.field35393.typeName(), "minecraft:splash_potion"));
                     }
                  }

                  if (var8 != 0) {
                     var6 = var6.set("Damage", var6.createShort((short)0));
                  }

                  return var9.set(DSL.remainderFinder(), var6);
               }
            }

            return var2;
         }
      );
   }
}
