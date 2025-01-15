// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import java.util.Optional;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.Dynamic;
import java.util.Objects;
import com.mojang.datafixers.util.Pair;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.DataFix;

public class Class6497 extends DataFix
{
    private static final String[] field25854;
    
    public Class6497(final Schema schema, final boolean b) {
        super(schema, b);
    }
    
    public TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("ItemPotionFix", this.getInputSchema().getType(Class9451.field40622), typed -> {
            DSL.fieldFinder("id", DSL.named(Class9451.field40628.typeName(), DSL.namespacedString()));
            final Type type;
            type.findField("tag");
            typed.getOptional(opticFinder);
            final Optional optional;
            if (!(!optional.isPresent())) {
                if (!(!Objects.equals(optional.get().getSecond(), "minecraft:potion"))) {
                    Dynamic set = (Dynamic)typed.get(DSL.remainderFinder());
                    typed.getOptionalTyped(opticFinder2);
                    set.get("Damage").asShort((short)0);
                    final Optional optional2;
                    if (!(!optional2.isPresent())) {
                        final Dynamic dynamic = (Dynamic)optional2.get().get(DSL.remainderFinder());
                        final int n;
                        Typed set2 = null;
                        if (!dynamic.get("Potion").asString().isPresent()) {
                            final String s = Class6497.field25854[n & 0x7F];
                            typed.set(opticFinder2, optional2.get().set(DSL.remainderFinder(), (Object)dynamic.set("Potion", dynamic.createString((s != null) ? s : "minecraft:water"))));
                            if ((n & 0x4000) == 0x4000) {
                                set2 = set2.set(opticFinder, (Object)Pair.of((Object)Class9451.field40628.typeName(), (Object)"minecraft:splash_potion"));
                            }
                        }
                        if (n != 0) {
                            set = set.set("Damage", set.createShort((short)0));
                        }
                        return set2.set(DSL.remainderFinder(), (Object)set);
                    }
                }
            }
            return typed;
        });
    }
    
    static {
        field25854 = (String[])DataFixUtils.make((Object)new String[128], array -> {
            array[0] = "minecraft:water";
            array[1] = "minecraft:regeneration";
            array[2] = "minecraft:swiftness";
            array[3] = "minecraft:fire_resistance";
            array[4] = "minecraft:poison";
            array[5] = "minecraft:healing";
            array[6] = "minecraft:night_vision";
            array[7] = null;
            array[8] = "minecraft:weakness";
            array[9] = "minecraft:strength";
            array[10] = "minecraft:slowness";
            array[11] = "minecraft:leaping";
            array[12] = "minecraft:harming";
            array[13] = "minecraft:water_breathing";
            array[14] = "minecraft:invisibility";
            array[15] = null;
            array[16] = "minecraft:awkward";
            array[17] = "minecraft:regeneration";
            array[18] = "minecraft:swiftness";
            array[19] = "minecraft:fire_resistance";
            array[20] = "minecraft:poison";
            array[21] = "minecraft:healing";
            array[22] = "minecraft:night_vision";
            array[23] = null;
            array[24] = "minecraft:weakness";
            array[25] = "minecraft:strength";
            array[26] = "minecraft:slowness";
            array[27] = "minecraft:leaping";
            array[28] = "minecraft:harming";
            array[29] = "minecraft:water_breathing";
            array[30] = "minecraft:invisibility";
            array[31] = null;
            array[32] = "minecraft:thick";
            array[33] = "minecraft:strong_regeneration";
            array[34] = "minecraft:strong_swiftness";
            array[35] = "minecraft:fire_resistance";
            array[36] = "minecraft:strong_poison";
            array[37] = "minecraft:strong_healing";
            array[38] = "minecraft:night_vision";
            array[39] = null;
            array[40] = "minecraft:weakness";
            array[41] = "minecraft:strong_strength";
            array[42] = "minecraft:slowness";
            array[43] = "minecraft:strong_leaping";
            array[44] = "minecraft:strong_harming";
            array[45] = "minecraft:water_breathing";
            array[46] = "minecraft:invisibility";
            array[48] = (array[47] = null);
            array[49] = "minecraft:strong_regeneration";
            array[50] = "minecraft:strong_swiftness";
            array[51] = "minecraft:fire_resistance";
            array[52] = "minecraft:strong_poison";
            array[53] = "minecraft:strong_healing";
            array[54] = "minecraft:night_vision";
            array[55] = null;
            array[56] = "minecraft:weakness";
            array[57] = "minecraft:strong_strength";
            array[58] = "minecraft:slowness";
            array[59] = "minecraft:strong_leaping";
            array[60] = "minecraft:strong_harming";
            array[61] = "minecraft:water_breathing";
            array[62] = "minecraft:invisibility";
            array[63] = null;
            array[64] = "minecraft:mundane";
            array[65] = "minecraft:long_regeneration";
            array[66] = "minecraft:long_swiftness";
            array[67] = "minecraft:long_fire_resistance";
            array[68] = "minecraft:long_poison";
            array[69] = "minecraft:healing";
            array[70] = "minecraft:long_night_vision";
            array[71] = null;
            array[72] = "minecraft:long_weakness";
            array[73] = "minecraft:long_strength";
            array[74] = "minecraft:long_slowness";
            array[75] = "minecraft:long_leaping";
            array[76] = "minecraft:harming";
            array[77] = "minecraft:long_water_breathing";
            array[78] = "minecraft:long_invisibility";
            array[79] = null;
            array[80] = "minecraft:awkward";
            array[81] = "minecraft:long_regeneration";
            array[82] = "minecraft:long_swiftness";
            array[83] = "minecraft:long_fire_resistance";
            array[84] = "minecraft:long_poison";
            array[85] = "minecraft:healing";
            array[86] = "minecraft:long_night_vision";
            array[87] = null;
            array[88] = "minecraft:long_weakness";
            array[89] = "minecraft:long_strength";
            array[90] = "minecraft:long_slowness";
            array[91] = "minecraft:long_leaping";
            array[92] = "minecraft:harming";
            array[93] = "minecraft:long_water_breathing";
            array[94] = "minecraft:long_invisibility";
            array[95] = null;
            array[96] = "minecraft:thick";
            array[97] = "minecraft:regeneration";
            array[98] = "minecraft:swiftness";
            array[99] = "minecraft:long_fire_resistance";
            array[100] = "minecraft:poison";
            array[101] = "minecraft:strong_healing";
            array[102] = "minecraft:long_night_vision";
            array[103] = null;
            array[104] = "minecraft:long_weakness";
            array[105] = "minecraft:strength";
            array[106] = "minecraft:long_slowness";
            array[107] = "minecraft:leaping";
            array[108] = "minecraft:strong_harming";
            array[109] = "minecraft:long_water_breathing";
            array[110] = "minecraft:long_invisibility";
            array[112] = (array[111] = null);
            array[113] = "minecraft:regeneration";
            array[114] = "minecraft:swiftness";
            array[115] = "minecraft:long_fire_resistance";
            array[116] = "minecraft:poison";
            array[117] = "minecraft:strong_healing";
            array[118] = "minecraft:long_night_vision";
            array[119] = null;
            array[120] = "minecraft:long_weakness";
            array[121] = "minecraft:strength";
            array[122] = "minecraft:long_slowness";
            array[123] = "minecraft:leaping";
            array[124] = "minecraft:strong_harming";
            array[125] = "minecraft:long_water_breathing";
            array[126] = "minecraft:long_invisibility";
            array[127] = null;
        });
    }
}
