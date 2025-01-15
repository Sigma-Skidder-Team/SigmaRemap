// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap;
import java.util.Objects;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixerBuilder;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.schemas.Schema;
import java.util.function.BiFunction;

public class Class5494
{
    private static final BiFunction<Integer, Schema, Schema> field22780;
    private static final BiFunction<Integer, Schema, Schema> field22781;
    private static final DataFixer field22782;
    
    private static DataFixer method16767() {
        final DataFixerBuilder dataFixerBuilder = new DataFixerBuilder(Class9528.method35579().getWorldVersion());
        method16769(dataFixerBuilder);
        return dataFixerBuilder.build(Class8349.method27841());
    }
    
    public static DataFixer method16768() {
        return Class5494.field22782;
    }
    
    private static void method16769(final DataFixerBuilder dataFixerBuilder) {
        dataFixerBuilder.addSchema(99, (BiFunction)Class8173::new);
        dataFixerBuilder.addFixer((DataFix)new Class8556(dataFixerBuilder.addSchema(100, (BiFunction)Class9478::new), true));
        dataFixerBuilder.addFixer((DataFix)new Class6151(dataFixerBuilder.addSchema(101, (BiFunction)Class5494.field22780), false));
        final Schema addSchema = dataFixerBuilder.addSchema(102, (BiFunction)Class6730::new);
        dataFixerBuilder.addFixer((DataFix)new Class7013(addSchema, true));
        dataFixerBuilder.addFixer((DataFix)new Class6497(addSchema, false));
        dataFixerBuilder.addFixer((DataFix)new Class9077(dataFixerBuilder.addSchema(105, (BiFunction)Class5494.field22780), true));
        dataFixerBuilder.addFixer((DataFix)new Class8738(dataFixerBuilder.addSchema(106, (BiFunction)Class8606::new), true));
        dataFixerBuilder.addFixer((DataFix)new Class6845(dataFixerBuilder.addSchema(107, (BiFunction)Class5475::new), true));
        dataFixerBuilder.addFixer((DataFix)new Class7130(dataFixerBuilder.addSchema(108, (BiFunction)Class5494.field22780), true));
        dataFixerBuilder.addFixer((DataFix)new Class7881(dataFixerBuilder.addSchema(109, (BiFunction)Class5494.field22780), true));
        dataFixerBuilder.addFixer((DataFix)new Class6137(dataFixerBuilder.addSchema(110, (BiFunction)Class5494.field22780), true));
        dataFixerBuilder.addFixer((DataFix)new Class8459(dataFixerBuilder.addSchema(111, (BiFunction)Class5494.field22780), true));
        dataFixerBuilder.addFixer((DataFix)new Class7982(dataFixerBuilder.addSchema(113, (BiFunction)Class5494.field22780), true));
        dataFixerBuilder.addFixer((DataFix)new Class9561(dataFixerBuilder.addSchema(135, (BiFunction)Class9062::new), true));
        dataFixerBuilder.addFixer((DataFix)new Class4141(dataFixerBuilder.addSchema(143, (BiFunction)Class9433::new), true));
        dataFixerBuilder.addFixer((DataFix)new Class6152(dataFixerBuilder.addSchema(147, (BiFunction)Class5494.field22780), true));
        dataFixerBuilder.addFixer((DataFix)new Class8780(dataFixerBuilder.addSchema(165, (BiFunction)Class5494.field22780), true));
        dataFixerBuilder.addFixer((DataFix)new Class8481(dataFixerBuilder.addSchema(501, (BiFunction)Class7697::new), "Add 1.10 entities fix", Class9451.field40626));
        final Schema addSchema2 = dataFixerBuilder.addSchema(502, (BiFunction)Class5494.field22780);
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema2, "cooked_fished item renamer", s -> Objects.equals(Class5174.method16141(s), "minecraft:cooked_fished") ? "minecraft:cooked_fish" : s));
        dataFixerBuilder.addFixer((DataFix)new Class6131(addSchema2, false));
        dataFixerBuilder.addFixer((DataFix)new Class6553(dataFixerBuilder.addSchema(505, (BiFunction)Class5494.field22780), false));
        dataFixerBuilder.addFixer((DataFix)new Class5037(dataFixerBuilder.addSchema(700, (BiFunction)Class8209::new), true));
        dataFixerBuilder.addFixer((DataFix)new Class5038(dataFixerBuilder.addSchema(701, (BiFunction)Class8400::new), true));
        dataFixerBuilder.addFixer((DataFix)new Class5032(dataFixerBuilder.addSchema(702, (BiFunction)Class8264::new), true));
        dataFixerBuilder.addFixer((DataFix)new Class5036(dataFixerBuilder.addSchema(703, (BiFunction)Class8534::new), true));
        dataFixerBuilder.addFixer((DataFix)new Class7371(dataFixerBuilder.addSchema(704, (BiFunction)Class9327::new), true));
        dataFixerBuilder.addFixer((DataFix)new Class7355(dataFixerBuilder.addSchema(705, (BiFunction)Class5189::new), true));
        dataFixerBuilder.addFixer((DataFix)new Class6130(dataFixerBuilder.addSchema(804, (BiFunction)Class5494.field22781), true));
        dataFixerBuilder.addFixer((DataFix)new Class8937(dataFixerBuilder.addSchema(806, (BiFunction)Class5494.field22781), false));
        dataFixerBuilder.addFixer((DataFix)new Class8481(dataFixerBuilder.addSchema(808, (BiFunction)Class5177::new), "added shulker box", Class9451.field40621));
        dataFixerBuilder.addFixer((DataFix)new Class6136(dataFixerBuilder.addSchema(808, 1, (BiFunction)Class5494.field22781), false));
        final Schema addSchema3 = dataFixerBuilder.addSchema(813, (BiFunction)Class5494.field22781);
        dataFixerBuilder.addFixer((DataFix)new Class8122(addSchema3, false));
        dataFixerBuilder.addFixer((DataFix)new Class6135(addSchema3, false));
        dataFixerBuilder.addFixer((DataFix)new Class6740(dataFixerBuilder.addSchema(816, (BiFunction)Class5494.field22781), false));
        dataFixerBuilder.addFixer(Class7534.method23613(dataFixerBuilder.addSchema(820, (BiFunction)Class5494.field22781), "totem item renamer", a -> Objects.equals(a, "minecraft:totem") ? "minecraft:totem_of_undying" : a));
        dataFixerBuilder.addFixer((DataFix)new Class7593(dataFixerBuilder.addSchema(1022, (BiFunction)Class6310::new), "added shoulder entities to players", Class9451.field40612));
        final Schema addSchema4 = dataFixerBuilder.addSchema(1125, (BiFunction)Class5195::new);
        dataFixerBuilder.addFixer((DataFix)new Class8622(addSchema4, true));
        dataFixerBuilder.addFixer((DataFix)new Class9483(addSchema4, false));
        dataFixerBuilder.addFixer((DataFix)new Class8579(dataFixerBuilder.addSchema(1344, (BiFunction)Class5494.field22781), false));
        dataFixerBuilder.addFixer((DataFix)new Class9097(dataFixerBuilder.addSchema(1446, (BiFunction)Class5494.field22781), false));
        dataFixerBuilder.addFixer((DataFix)new Class7058(dataFixerBuilder.addSchema(1450, (BiFunction)Class5494.field22781), false));
        dataFixerBuilder.addFixer((DataFix)new Class8481(dataFixerBuilder.addSchema(1451, (BiFunction)Class5182::new), "AddTrappedChestFix", Class9451.field40621));
        dataFixerBuilder.addFixer((DataFix)new Class9251(dataFixerBuilder.addSchema(1451, 1, (BiFunction)Class5180::new), true));
        dataFixerBuilder.addFixer((DataFix)new Class6139(dataFixerBuilder.addSchema(1451, 2, (BiFunction)Class5176::new), true));
        final Schema addSchema5 = dataFixerBuilder.addSchema(1451, 3, (BiFunction)Class5188::new);
        dataFixerBuilder.addFixer((DataFix)new Class8476(addSchema5, true));
        dataFixerBuilder.addFixer((DataFix)new Class7369(addSchema5, false));
        final Schema addSchema6 = dataFixerBuilder.addSchema(1451, 4, (BiFunction)Class5193::new);
        dataFixerBuilder.addFixer((DataFix)new Class5761(addSchema6, true));
        dataFixerBuilder.addFixer((DataFix)new Class8987(addSchema6, false));
        final Schema addSchema7 = dataFixerBuilder.addSchema(1451, 5, (BiFunction)Class5190::new);
        dataFixerBuilder.addFixer((DataFix)new Class8481(addSchema7, "RemoveNoteBlockFlowerPotFix", Class9451.field40621));
        dataFixerBuilder.addFixer((DataFix)new Class8662(addSchema7, false));
        dataFixerBuilder.addFixer((DataFix)new Class6146(addSchema7, false));
        dataFixerBuilder.addFixer((DataFix)new Class6144(addSchema7, false));
        dataFixerBuilder.addFixer((DataFix)new Class9539(addSchema7, false));
        final Schema addSchema8 = dataFixerBuilder.addSchema(1451, 6, (BiFunction)Class5183::new);
        dataFixerBuilder.addFixer((DataFix)new Class8719(addSchema8, true));
        dataFixerBuilder.addFixer((DataFix)new Class6138(addSchema8, false));
        dataFixerBuilder.addFixer((DataFix)new Class4430(dataFixerBuilder.addSchema(1451, 7, (BiFunction)Class5198::new), true));
        dataFixerBuilder.addFixer((DataFix)new Class6148(dataFixerBuilder.addSchema(1451, 7, (BiFunction)Class5494.field22781), false));
        dataFixerBuilder.addFixer((DataFix)new Class6143(dataFixerBuilder.addSchema(1456, (BiFunction)Class5494.field22781), false));
        final Schema addSchema9 = dataFixerBuilder.addSchema(1458, (BiFunction)Class5494.field22781);
        dataFixerBuilder.addFixer((DataFix)new Class8957(addSchema9, false));
        dataFixerBuilder.addFixer((DataFix)new Class5486(addSchema9, false));
        dataFixerBuilder.addFixer((DataFix)new Class9174(addSchema9, false));
        dataFixerBuilder.addFixer((DataFix)new Class6147(dataFixerBuilder.addSchema(1460, (BiFunction)Class5192::new), false));
        dataFixerBuilder.addFixer((DataFix)new Class8676(dataFixerBuilder.addSchema(1466, (BiFunction)Class5194::new), true));
        dataFixerBuilder.addFixer((DataFix)new Class8481(dataFixerBuilder.addSchema(1470, (BiFunction)Class5185::new), "Add 1.13 entities fix", Class9451.field40626));
        final Schema addSchema10 = dataFixerBuilder.addSchema(1474, (BiFunction)Class5494.field22781);
        dataFixerBuilder.addFixer((DataFix)new Class6134(addSchema10, false));
        dataFixerBuilder.addFixer(Class8470.method28273(addSchema10, "Colorless shulker block fixer", s4 -> Objects.equals(Class5174.method16141(s4), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : s4));
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema10, "Colorless shulker item fixer", s6 -> Objects.equals(Class5174.method16141(s6), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : s6));
        dataFixerBuilder.addFixer(Class8470.method28273(dataFixerBuilder.addSchema(1475, (BiFunction)Class5494.field22781), "Flowing fixer", s8 -> ImmutableMap.of((Object)"minecraft:flowing_water", (Object)"minecraft:water", (Object)"minecraft:flowing_lava", (Object)"minecraft:lava").getOrDefault((Object)s8, (Object)s8)));
        final Schema addSchema11 = dataFixerBuilder.addSchema(1480, (BiFunction)Class5494.field22781);
        dataFixerBuilder.addFixer(Class8470.method28273(addSchema11, "Rename coral blocks", s10 -> Class8078.field33269.getOrDefault(s10, s10)));
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema11, "Rename coral items", s12 -> Class8078.field33269.getOrDefault(s12, s12)));
        dataFixerBuilder.addFixer((DataFix)new Class8481(dataFixerBuilder.addSchema(1481, (BiFunction)Class5200::new), "Add conduit", Class9451.field40621));
        final Schema addSchema12 = dataFixerBuilder.addSchema(1483, (BiFunction)Class5173::new);
        dataFixerBuilder.addFixer((DataFix)new Class4143(addSchema12, true));
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema12, "Rename pufferfish egg item", s14 -> Class4143.field18267.getOrDefault(s14, s14)));
        final Schema addSchema13 = dataFixerBuilder.addSchema(1484, (BiFunction)Class5494.field22781);
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema13, "Rename seagrass items", s16 -> ImmutableMap.of((Object)"minecraft:sea_grass", (Object)"minecraft:seagrass", (Object)"minecraft:tall_sea_grass", (Object)"minecraft:tall_seagrass").getOrDefault((Object)s16, (Object)s16)));
        dataFixerBuilder.addFixer(Class8470.method28273(addSchema13, "Rename seagrass blocks", s18 -> ImmutableMap.of((Object)"minecraft:sea_grass", (Object)"minecraft:seagrass", (Object)"minecraft:tall_sea_grass", (Object)"minecraft:tall_seagrass").getOrDefault((Object)s18, (Object)s18)));
        dataFixerBuilder.addFixer((DataFix)new Class7561(addSchema13, false));
        final Schema addSchema14 = dataFixerBuilder.addSchema(1486, (BiFunction)Class5175::new);
        dataFixerBuilder.addFixer((DataFix)new Class4140(addSchema14, true));
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema14, "Rename cod/salmon egg items", s20 -> Class4140.field18263.getOrDefault(s20, s20)));
        final Schema addSchema15 = dataFixerBuilder.addSchema(1487, (BiFunction)Class5494.field22781);
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema15, "Rename prismarine_brick(s)_* blocks", s22 -> ImmutableMap.of((Object)"minecraft:prismarine_bricks_slab", (Object)"minecraft:prismarine_brick_slab", (Object)"minecraft:prismarine_bricks_stairs", (Object)"minecraft:prismarine_brick_stairs").getOrDefault((Object)s22, (Object)s22)));
        dataFixerBuilder.addFixer(Class8470.method28273(addSchema15, "Rename prismarine_brick(s)_* items", s24 -> ImmutableMap.of((Object)"minecraft:prismarine_bricks_slab", (Object)"minecraft:prismarine_brick_slab", (Object)"minecraft:prismarine_bricks_stairs", (Object)"minecraft:prismarine_brick_stairs").getOrDefault((Object)s24, (Object)s24)));
        final Schema addSchema16 = dataFixerBuilder.addSchema(1488, (BiFunction)Class5494.field22781);
        dataFixerBuilder.addFixer(Class8470.method28273(addSchema16, "Rename kelp/kelptop", s26 -> ImmutableMap.of((Object)"minecraft:kelp_top", (Object)"minecraft:kelp", (Object)"minecraft:kelp", (Object)"minecraft:kelp_plant").getOrDefault((Object)s26, (Object)s26)));
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema16, "Rename kelptop", a2 -> Objects.equals(a2, "minecraft:kelp_top") ? "minecraft:kelp" : a2));
        dataFixerBuilder.addFixer((DataFix)new Class6150(addSchema16, false, "Command block block entity custom name fix", Class9451.field40621, "minecraft:command_block"));
        dataFixerBuilder.addFixer((DataFix)new Class6133(addSchema16, false, "Command block minecart custom name fix", Class9451.field40626, "minecraft:commandblock_minecart"));
        dataFixerBuilder.addFixer((DataFix)new Class5203(addSchema16, false));
        final Schema addSchema17 = dataFixerBuilder.addSchema(1490, (BiFunction)Class5494.field22781);
        dataFixerBuilder.addFixer(Class8470.method28273(addSchema17, "Rename melon_block", a3 -> Objects.equals(a3, "minecraft:melon_block") ? "minecraft:melon" : a3));
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema17, "Rename melon_block/melon/speckled_melon", s30 -> ImmutableMap.of((Object)"minecraft:melon_block", (Object)"minecraft:melon", (Object)"minecraft:melon", (Object)"minecraft:melon_slice", (Object)"minecraft:speckled_melon", (Object)"minecraft:glistering_melon_slice").getOrDefault((Object)s30, (Object)s30)));
        dataFixerBuilder.addFixer((DataFix)new Class7358(dataFixerBuilder.addSchema(1492, (BiFunction)Class5494.field22781), false));
        dataFixerBuilder.addFixer((DataFix)new Class6713(dataFixerBuilder.addSchema(1494, (BiFunction)Class5494.field22781), false));
        dataFixerBuilder.addFixer((DataFix)new Class8463(dataFixerBuilder.addSchema(1496, (BiFunction)Class5494.field22781), false));
        dataFixerBuilder.addFixer((DataFix)new Class6142(dataFixerBuilder.addSchema(1500, (BiFunction)Class5494.field22781), false));
        dataFixerBuilder.addFixer((DataFix)new Class9187(dataFixerBuilder.addSchema(1501, (BiFunction)Class5494.field22781), false));
        dataFixerBuilder.addFixer((DataFix)new Class8710(dataFixerBuilder.addSchema(1502, (BiFunction)Class5494.field22781), false));
        dataFixerBuilder.addFixer((DataFix)new Class6555(dataFixerBuilder.addSchema(1506, (BiFunction)Class5494.field22781), false));
        dataFixerBuilder.addFixer((DataFix)new Class8790(dataFixerBuilder.addSchema(1508, (BiFunction)Class5494.field22781), false));
        final Schema addSchema18 = dataFixerBuilder.addSchema(1510, (BiFunction)Class5178::new);
        dataFixerBuilder.addFixer(Class8470.method28273(addSchema18, "Block renamening fix", s32 -> Class4142.field18265.getOrDefault(s32, s32)));
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema18, "Item renamening fix", s34 -> Class4142.field18266.getOrDefault(s34, s34)));
        dataFixerBuilder.addFixer((DataFix)new Class8709(addSchema18, false));
        dataFixerBuilder.addFixer((DataFix)new Class4142(addSchema18, true));
        dataFixerBuilder.addFixer((DataFix)new Class5345(addSchema18, false));
        final Schema addSchema19 = dataFixerBuilder.addSchema(1514, (BiFunction)Class5494.field22781);
        dataFixerBuilder.addFixer((DataFix)new Class9027(addSchema19, false));
        dataFixerBuilder.addFixer((DataFix)new Class6711(addSchema19, false));
        dataFixerBuilder.addFixer((DataFix)new Class9480(addSchema19, false));
        dataFixerBuilder.addFixer(Class8470.method28273(dataFixerBuilder.addSchema(1515, (BiFunction)Class5494.field22781), "Rename coral fan blocks", s36 -> Class7001.field27312.getOrDefault(s36, s36)));
        dataFixerBuilder.addFixer((DataFix)new Class8166(dataFixerBuilder.addSchema(1624, (BiFunction)Class5494.field22781), false));
        final Schema addSchema20 = dataFixerBuilder.addSchema(1800, (BiFunction)Class5191::new);
        dataFixerBuilder.addFixer((DataFix)new Class8481(addSchema20, "Added 1.14 mobs fix", Class9451.field40626));
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema20, "Rename dye items", s38 -> Class7947.field32624.getOrDefault(s38, s38)));
        dataFixerBuilder.addFixer((DataFix)new Class8481(dataFixerBuilder.addSchema(1801, (BiFunction)Class5197::new), "Added Illager Beast", Class9451.field40626));
        final Schema addSchema21 = dataFixerBuilder.addSchema(1802, (BiFunction)Class5494.field22781);
        dataFixerBuilder.addFixer(Class8470.method28273(addSchema21, "Rename sign blocks & stone slabs", s40 -> ImmutableMap.of((Object)"minecraft:stone_slab", (Object)"minecraft:smooth_stone_slab", (Object)"minecraft:sign", (Object)"minecraft:oak_sign", (Object)"minecraft:wall_sign", (Object)"minecraft:oak_wall_sign").getOrDefault((Object)s40, (Object)s40)));
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema21, "Rename sign item & stone slabs", s42 -> ImmutableMap.of((Object)"minecraft:stone_slab", (Object)"minecraft:smooth_stone_slab", (Object)"minecraft:sign", (Object)"minecraft:oak_sign").getOrDefault((Object)s42, (Object)s42)));
        dataFixerBuilder.addFixer((DataFix)new Class9045(dataFixerBuilder.addSchema(1803, (BiFunction)Class5494.field22781), false));
        final Schema addSchema22 = dataFixerBuilder.addSchema(1904, (BiFunction)Class5201::new);
        dataFixerBuilder.addFixer((DataFix)new Class8481(addSchema22, "Added Cats", Class9451.field40626));
        dataFixerBuilder.addFixer((DataFix)new Class5034(addSchema22, false));
        dataFixerBuilder.addFixer((DataFix)new Class9271(dataFixerBuilder.addSchema(1905, (BiFunction)Class5494.field22781), false));
        dataFixerBuilder.addFixer((DataFix)new Class8481(dataFixerBuilder.addSchema(1906, (BiFunction)Class5179::new), "Add POI Blocks", Class9451.field40621));
        dataFixerBuilder.addFixer((DataFix)new Class8481(dataFixerBuilder.addSchema(1909, (BiFunction)Class5199::new), "Add jigsaw", Class9451.field40621));
        dataFixerBuilder.addFixer((DataFix)new Class9160(dataFixerBuilder.addSchema(1911, (BiFunction)Class5494.field22781), false));
        dataFixerBuilder.addFixer((DataFix)new Class6145(dataFixerBuilder.addSchema(1917, (BiFunction)Class5494.field22781), false));
        final Schema addSchema23 = dataFixerBuilder.addSchema(1918, (BiFunction)Class5494.field22781);
        dataFixerBuilder.addFixer((DataFix)new Class6149(addSchema23, "minecraft:villager"));
        dataFixerBuilder.addFixer((DataFix)new Class6149(addSchema23, "minecraft:zombie_villager"));
        final Schema addSchema24 = dataFixerBuilder.addSchema(1920, (BiFunction)Class5186::new);
        dataFixerBuilder.addFixer((DataFix)new Class9143(addSchema24, false));
        dataFixerBuilder.addFixer((DataFix)new Class8481(addSchema24, "Add campfire", Class9451.field40621));
        dataFixerBuilder.addFixer((DataFix)new Class8569(dataFixerBuilder.addSchema(1925, (BiFunction)Class5494.field22781), false));
        final Schema addSchema25 = dataFixerBuilder.addSchema(1928, (BiFunction)Class5187::new);
        dataFixerBuilder.addFixer((DataFix)new Class4138(addSchema25, true));
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema25, "Rename ravager egg item", s44 -> Class4138.field18260.getOrDefault(s44, s44)));
        dataFixerBuilder.addFixer((DataFix)new Class8481(dataFixerBuilder.addSchema(1929, (BiFunction)Class5184::new), "Add Wandering Trader and Trader Llama", Class9451.field40626));
        dataFixerBuilder.addFixer((DataFix)new Class8481(dataFixerBuilder.addSchema(1931, (BiFunction)Class5196::new), "Added Fox", Class9451.field40626));
        dataFixerBuilder.addFixer((DataFix)new Class8898(dataFixerBuilder.addSchema(1936, (BiFunction)Class5494.field22781), false));
        dataFixerBuilder.addFixer((DataFix)new Class7821(dataFixerBuilder.addSchema(1946, (BiFunction)Class5494.field22781), false));
        dataFixerBuilder.addFixer((DataFix)new Class7370(dataFixerBuilder.addSchema(1948, (BiFunction)Class5494.field22781), false));
        dataFixerBuilder.addFixer((DataFix)new Class6141(dataFixerBuilder.addSchema(1953, (BiFunction)Class5494.field22781), false));
        final Schema addSchema26 = dataFixerBuilder.addSchema(1955, (BiFunction)Class5494.field22781);
        dataFixerBuilder.addFixer((DataFix)new Class8873(addSchema26, false));
        dataFixerBuilder.addFixer((DataFix)new Class6140(addSchema26, false));
        dataFixerBuilder.addFixer((DataFix)new Class8629(dataFixerBuilder.addSchema(1961, (BiFunction)Class5494.field22781), false));
        final Schema addSchema27 = dataFixerBuilder.addSchema(2100, (BiFunction)Class5181::new);
        dataFixerBuilder.addFixer((DataFix)new Class8481(addSchema27, "Added Bee and Bee Stinger", Class9451.field40626));
        dataFixerBuilder.addFixer((DataFix)new Class8481(addSchema27, "Add beehive", Class9451.field40621));
        dataFixerBuilder.addFixer((DataFix)new Class8708(addSchema27, false, "Rename sugar recipe", anObject -> "minecraft:sugar".equals(anObject) ? "sugar_from_sugar_cane" : anObject));
        dataFixerBuilder.addFixer((DataFix)new Class9188(addSchema27, false, "Rename sugar recipe advancement", anObject2 -> "minecraft:recipes/misc/sugar".equals(anObject2) ? "minecraft:recipes/misc/sugar_from_sugar_cane" : anObject2));
        dataFixerBuilder.addFixer((DataFix)new Class8044(dataFixerBuilder.addSchema(2202, (BiFunction)Class5494.field22781), false));
        final Schema addSchema28 = dataFixerBuilder.addSchema(2209, (BiFunction)Class5494.field22781);
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema28, "Rename bee_hive item to beehive", a4 -> Objects.equals(a4, "minecraft:bee_hive") ? "minecraft:beehive" : a4));
        dataFixerBuilder.addFixer((DataFix)new Class5477(addSchema28));
        dataFixerBuilder.addFixer(Class8470.method28273(addSchema28, "Rename bee_hive block to beehive", s49 -> ImmutableMap.of((Object)"minecraft:bee_hive", (Object)"minecraft:beehive").getOrDefault((Object)s49, (Object)s49)));
        dataFixerBuilder.addFixer((DataFix)new Class9326(dataFixerBuilder.addSchema(2211, (BiFunction)Class5494.field22781), false));
        dataFixerBuilder.addFixer((DataFix)new Class8702(dataFixerBuilder.addSchema(2218, (BiFunction)Class5494.field22781), false));
    }
    
    static {
        field22780 = Schema::new;
        field22781 = Class5174::new;
        field22782 = method16767();
    }
}
