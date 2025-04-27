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
        return dataFixerBuilder.build(Util.method27841());
    }
    
    public static DataFixer method16768() {
        return Class5494.field22782;
    }
    
    private static void method16769(final DataFixerBuilder dataFixerBuilder) {
        dataFixerBuilder.addSchema(99, (BiFunction)Class8173::new);
        dataFixerBuilder.addFixer(new Class8556(dataFixerBuilder.addSchema(100, (BiFunction)Class9478::new), true));
        dataFixerBuilder.addFixer(new Class6151(dataFixerBuilder.addSchema(101, Class5494.field22780), false));
        final Schema addSchema = dataFixerBuilder.addSchema(102, (BiFunction)Class6730::new);
        dataFixerBuilder.addFixer(new Class7013(addSchema, true));
        dataFixerBuilder.addFixer(new Class6497(addSchema, false));
        dataFixerBuilder.addFixer(new Class9077(dataFixerBuilder.addSchema(105, Class5494.field22780), true));
        dataFixerBuilder.addFixer(new Class8738(dataFixerBuilder.addSchema(106, (BiFunction)Class8606::new), true));
        dataFixerBuilder.addFixer(new Class6845(dataFixerBuilder.addSchema(107, (BiFunction)Class5475::new), true));
        dataFixerBuilder.addFixer(new Class7130(dataFixerBuilder.addSchema(108, Class5494.field22780), true));
        dataFixerBuilder.addFixer(new Class7881(dataFixerBuilder.addSchema(109, Class5494.field22780), true));
        dataFixerBuilder.addFixer(new Class6137(dataFixerBuilder.addSchema(110, Class5494.field22780), true));
        dataFixerBuilder.addFixer(new Class8459(dataFixerBuilder.addSchema(111, Class5494.field22780), true));
        dataFixerBuilder.addFixer(new Class7982(dataFixerBuilder.addSchema(113, Class5494.field22780), true));
        dataFixerBuilder.addFixer((DataFix)new Class9561(dataFixerBuilder.addSchema(135, (BiFunction)Class9062::new), true));
        dataFixerBuilder.addFixer(new Class4141(dataFixerBuilder.addSchema(143, (BiFunction)Class9433::new), true));
        dataFixerBuilder.addFixer(new Class6152(dataFixerBuilder.addSchema(147, Class5494.field22780), true));
        dataFixerBuilder.addFixer(new Class8780(dataFixerBuilder.addSchema(165, Class5494.field22780), true));
        dataFixerBuilder.addFixer(new Class8481(dataFixerBuilder.addSchema(501, (BiFunction)Class7697::new), "Add 1.10 entities fix"));
        final Schema addSchema2 = dataFixerBuilder.addSchema(502, Class5494.field22780);
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema2, "cooked_fished item renamer", s -> Objects.equals(Class5174.method16141(s), "minecraft:cooked_fished") ? "minecraft:cooked_fish" : s));
        dataFixerBuilder.addFixer(new Class6131(addSchema2, false));
        dataFixerBuilder.addFixer(new Class6553(dataFixerBuilder.addSchema(505, Class5494.field22780), false));
        dataFixerBuilder.addFixer(new Class5037(dataFixerBuilder.addSchema(700, (BiFunction)Class8209::new), true));
        dataFixerBuilder.addFixer(new Class5038(dataFixerBuilder.addSchema(701, (BiFunction)Class8400::new), true));
        dataFixerBuilder.addFixer(new Class5032(dataFixerBuilder.addSchema(702, (BiFunction)Class8264::new), true));
        dataFixerBuilder.addFixer(new Class5036(dataFixerBuilder.addSchema(703, (BiFunction)Class8534::new), true));
        dataFixerBuilder.addFixer(new Class7371(dataFixerBuilder.addSchema(704, (BiFunction)Class9327::new), true));
        dataFixerBuilder.addFixer(new Class7355(dataFixerBuilder.addSchema(705, (BiFunction)Class5189::new), true));
        dataFixerBuilder.addFixer(new Class6130(dataFixerBuilder.addSchema(804, Class5494.field22781), true));
        dataFixerBuilder.addFixer(new Class8937(dataFixerBuilder.addSchema(806, Class5494.field22781), false));
        dataFixerBuilder.addFixer(new Class8481(dataFixerBuilder.addSchema(808, (BiFunction)Class5177::new), "added shulker box"));
        dataFixerBuilder.addFixer(new Class6136(dataFixerBuilder.addSchema(808, 1, Class5494.field22781), false));
        final Schema addSchema3 = dataFixerBuilder.addSchema(813, Class5494.field22781);
        dataFixerBuilder.addFixer(new Class8122(addSchema3, false));
        dataFixerBuilder.addFixer(new Class6135(addSchema3, false));
        dataFixerBuilder.addFixer(new Class6740(dataFixerBuilder.addSchema(816, Class5494.field22781), false));
        dataFixerBuilder.addFixer(Class7534.method23613(dataFixerBuilder.addSchema(820, Class5494.field22781), "totem item renamer", a -> Objects.equals(a, "minecraft:totem") ? "minecraft:totem_of_undying" : a));
        dataFixerBuilder.addFixer(new Class7593(dataFixerBuilder.addSchema(1022, (BiFunction)Class6310::new), "added shoulder entities to players", Class9451.field40612));
        final Schema addSchema4 = dataFixerBuilder.addSchema(1125, (BiFunction)Class5195::new);
        dataFixerBuilder.addFixer(new Class8622(addSchema4, true));
        dataFixerBuilder.addFixer(new Class9483(addSchema4, false));
        dataFixerBuilder.addFixer(new Class8579(dataFixerBuilder.addSchema(1344, Class5494.field22781), false));
        dataFixerBuilder.addFixer(new Class9097(dataFixerBuilder.addSchema(1446, Class5494.field22781), false));
        dataFixerBuilder.addFixer(new Class7058(dataFixerBuilder.addSchema(1450, Class5494.field22781), false));
        dataFixerBuilder.addFixer(new Class8481(dataFixerBuilder.addSchema(1451, (BiFunction)Class5182::new), "AddTrappedChestFix"));
        dataFixerBuilder.addFixer(new Class9251(dataFixerBuilder.addSchema(1451, 1, (BiFunction)Class5180::new), true));
        dataFixerBuilder.addFixer(new Class6139(dataFixerBuilder.addSchema(1451, 2, (BiFunction)Class5176::new), true));
        final Schema addSchema5 = dataFixerBuilder.addSchema(1451, 3, (BiFunction)Class5188::new);
        dataFixerBuilder.addFixer(new Class8476(addSchema5, true));
        dataFixerBuilder.addFixer(new Class7369(addSchema5, false));
        final Schema addSchema6 = dataFixerBuilder.addSchema(1451, 4, (BiFunction)Class5193::new);
        dataFixerBuilder.addFixer(new Class5761(addSchema6, true));
        dataFixerBuilder.addFixer(new Class8987(addSchema6, false));
        final Schema addSchema7 = dataFixerBuilder.addSchema(1451, 5, (BiFunction)Class5190::new);
        dataFixerBuilder.addFixer(new Class8481(addSchema7, "RemoveNoteBlockFlowerPotFix"));
        dataFixerBuilder.addFixer(new Class8662(addSchema7, false));
        dataFixerBuilder.addFixer(new Class6146(addSchema7, false));
        dataFixerBuilder.addFixer(new Class6144(addSchema7, false));
        dataFixerBuilder.addFixer(new Class9539(addSchema7, false));
        final Schema addSchema8 = dataFixerBuilder.addSchema(1451, 6, (BiFunction)Class5183::new);
        dataFixerBuilder.addFixer(new Class8719(addSchema8, true));
        dataFixerBuilder.addFixer(new Class6138(addSchema8, false));
        dataFixerBuilder.addFixer(new Class4430(dataFixerBuilder.addSchema(1451, 7, (BiFunction)Class5198::new), true));
        dataFixerBuilder.addFixer(new Class6148(dataFixerBuilder.addSchema(1451, 7, Class5494.field22781), false));
        dataFixerBuilder.addFixer(new Class6143(dataFixerBuilder.addSchema(1456, Class5494.field22781), false));
        final Schema addSchema9 = dataFixerBuilder.addSchema(1458, Class5494.field22781);
        dataFixerBuilder.addFixer(new Class8957(addSchema9, false));
        dataFixerBuilder.addFixer(new Class5486(addSchema9, false));
        dataFixerBuilder.addFixer(new Class9174(addSchema9, false));
        dataFixerBuilder.addFixer(new Class6147(dataFixerBuilder.addSchema(1460, (BiFunction)Class5192::new), false));
        dataFixerBuilder.addFixer(new Class8676(dataFixerBuilder.addSchema(1466, (BiFunction)Class5194::new), true));
        dataFixerBuilder.addFixer(new Class8481(dataFixerBuilder.addSchema(1470, (BiFunction)Class5185::new), "Add 1.13 entities fix"));
        final Schema addSchema10 = dataFixerBuilder.addSchema(1474, Class5494.field22781);
        dataFixerBuilder.addFixer(new Class6134(addSchema10, false));
        dataFixerBuilder.addFixer(Class8470.method28273(addSchema10, "Colorless shulker block fixer", s4 -> Objects.equals(Class5174.method16141(s4), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : s4));
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema10, "Colorless shulker item fixer", s6 -> Objects.equals(Class5174.method16141(s6), "minecraft:purple_shulker_box") ? "minecraft:shulker_box" : s6));
        dataFixerBuilder.addFixer(Class8470.method28273(dataFixerBuilder.addSchema(1475, Class5494.field22781), "Flowing fixer", s8 -> ImmutableMap.of("minecraft:flowing_water", "minecraft:water", (Object)"minecraft:flowing_lava", (Object)"minecraft:lava").getOrDefault(s8, s8)));
        final Schema addSchema11 = dataFixerBuilder.addSchema(1480, Class5494.field22781);
        dataFixerBuilder.addFixer(Class8470.method28273(addSchema11, "Rename coral blocks", s10 -> Class8078.field33269.getOrDefault(s10, s10)));
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema11, "Rename coral items", s12 -> Class8078.field33269.getOrDefault(s12, s12)));
        dataFixerBuilder.addFixer(new Class8481(dataFixerBuilder.addSchema(1481, (BiFunction)Class5200::new), "Add conduit"));
        final Schema addSchema12 = dataFixerBuilder.addSchema(1483, (BiFunction)Class5173::new);
        dataFixerBuilder.addFixer(new Class4143(addSchema12, true));
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema12, "Rename pufferfish egg item", s14 -> Class4143.field18267.getOrDefault(s14, s14)));
        final Schema addSchema13 = dataFixerBuilder.addSchema(1484, Class5494.field22781);
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema13, "Rename seagrass items", s16 -> ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", (Object)"minecraft:tall_sea_grass", (Object)"minecraft:tall_seagrass").getOrDefault(s16, s16)));
        dataFixerBuilder.addFixer(Class8470.method28273(addSchema13, "Rename seagrass blocks", s18 -> ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", (Object)"minecraft:tall_sea_grass", (Object)"minecraft:tall_seagrass").getOrDefault(s18, s18)));
        dataFixerBuilder.addFixer(new Class7561(addSchema13, false));
        final Schema addSchema14 = dataFixerBuilder.addSchema(1486, (BiFunction)Class5175::new);
        dataFixerBuilder.addFixer(new Class4140(addSchema14, true));
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema14, "Rename cod/salmon egg items", s20 -> Class4140.field18263.getOrDefault(s20, s20)));
        final Schema addSchema15 = dataFixerBuilder.addSchema(1487, Class5494.field22781);
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema15, "Rename prismarine_brick(s)_* blocks", s22 -> ImmutableMap.of("minecraft:prismarine_bricks_slab", "minecraft:prismarine_brick_slab", (Object)"minecraft:prismarine_bricks_stairs", (Object)"minecraft:prismarine_brick_stairs").getOrDefault(s22, s22)));
        dataFixerBuilder.addFixer(Class8470.method28273(addSchema15, "Rename prismarine_brick(s)_* items", s24 -> ImmutableMap.of("minecraft:prismarine_bricks_slab", "minecraft:prismarine_brick_slab", (Object)"minecraft:prismarine_bricks_stairs", (Object)"minecraft:prismarine_brick_stairs").getOrDefault(s24, s24)));
        final Schema addSchema16 = dataFixerBuilder.addSchema(1488, Class5494.field22781);
        dataFixerBuilder.addFixer(Class8470.method28273(addSchema16, "Rename kelp/kelptop", s26 -> ImmutableMap.of("minecraft:kelp_top", "minecraft:kelp", (Object)"minecraft:kelp", (Object)"minecraft:kelp_plant").getOrDefault(s26, s26)));
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema16, "Rename kelptop", a2 -> Objects.equals(a2, "minecraft:kelp_top") ? "minecraft:kelp" : a2));
        dataFixerBuilder.addFixer(new Class6150(addSchema16, false, "Command block block entity custom name fix", Class9451.field40621, "minecraft:command_block"));
        dataFixerBuilder.addFixer(new Class6133(addSchema16, false, "Command block minecart custom name fix", Class9451.field40626, "minecraft:commandblock_minecart"));
        dataFixerBuilder.addFixer(new Class5203(addSchema16, false));
        final Schema addSchema17 = dataFixerBuilder.addSchema(1490, Class5494.field22781);
        dataFixerBuilder.addFixer(Class8470.method28273(addSchema17, "Rename melon_block", a3 -> Objects.equals(a3, "minecraft:melon_block") ? "minecraft:melon" : a3));
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema17, "Rename melon_block/melon/speckled_melon", s30 -> ImmutableMap.of("minecraft:melon_block", "minecraft:melon", "minecraft:melon", "minecraft:melon_slice", (Object)"minecraft:speckled_melon", (Object)"minecraft:glistering_melon_slice").getOrDefault(s30, s30)));
        dataFixerBuilder.addFixer(new Class7358(dataFixerBuilder.addSchema(1492, Class5494.field22781), false));
        dataFixerBuilder.addFixer(new Class6713(dataFixerBuilder.addSchema(1494, Class5494.field22781), false));
        dataFixerBuilder.addFixer(new Class8463(dataFixerBuilder.addSchema(1496, Class5494.field22781), false));
        dataFixerBuilder.addFixer(new Class6142(dataFixerBuilder.addSchema(1500, Class5494.field22781), false));
        dataFixerBuilder.addFixer(new Class9187(dataFixerBuilder.addSchema(1501, Class5494.field22781), false));
        dataFixerBuilder.addFixer(new Class8710(dataFixerBuilder.addSchema(1502, Class5494.field22781), false));
        dataFixerBuilder.addFixer(new Class6555(dataFixerBuilder.addSchema(1506, Class5494.field22781), false));
        dataFixerBuilder.addFixer(new Class8790(dataFixerBuilder.addSchema(1508, Class5494.field22781), false));
        final Schema addSchema18 = dataFixerBuilder.addSchema(1510, (BiFunction)Class5178::new);
        dataFixerBuilder.addFixer(Class8470.method28273(addSchema18, "Block renamening fix", s32 -> Class4142.field18265.getOrDefault(s32, s32)));
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema18, "Item renamening fix", s34 -> Class4142.field18266.getOrDefault(s34, s34)));
        dataFixerBuilder.addFixer(new Class8709(addSchema18, false));
        dataFixerBuilder.addFixer(new Class4142(addSchema18, true));
        dataFixerBuilder.addFixer(new Class5345(addSchema18, false));
        final Schema addSchema19 = dataFixerBuilder.addSchema(1514, Class5494.field22781);
        dataFixerBuilder.addFixer(new Class9027(addSchema19, false));
        dataFixerBuilder.addFixer(new Class6711(addSchema19, false));
        dataFixerBuilder.addFixer(new Class9480(addSchema19, false));
        dataFixerBuilder.addFixer(Class8470.method28273(dataFixerBuilder.addSchema(1515, Class5494.field22781), "Rename coral fan blocks", s36 -> Class7001.field27312.getOrDefault(s36, s36)));
        dataFixerBuilder.addFixer(new Class8166(dataFixerBuilder.addSchema(1624, Class5494.field22781), false));
        final Schema addSchema20 = dataFixerBuilder.addSchema(1800, (BiFunction)Class5191::new);
        dataFixerBuilder.addFixer(new Class8481(addSchema20, "Added 1.14 mobs fix"));
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema20, "Rename dye items", s38 -> Class7947.field32624.getOrDefault(s38, s38)));
        dataFixerBuilder.addFixer(new Class8481(dataFixerBuilder.addSchema(1801, (BiFunction)Class5197::new), "Added Illager Beast"));
        final Schema addSchema21 = dataFixerBuilder.addSchema(1802, Class5494.field22781);
        dataFixerBuilder.addFixer(Class8470.method28273(addSchema21, "Rename sign blocks & stone slabs", s40 -> ImmutableMap.of("minecraft:stone_slab", "minecraft:smooth_stone_slab", "minecraft:sign", "minecraft:oak_sign", (Object)"minecraft:wall_sign", (Object)"minecraft:oak_wall_sign").getOrDefault(s40, s40)));
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema21, "Rename sign item & stone slabs", s42 -> ImmutableMap.of("minecraft:stone_slab", "minecraft:smooth_stone_slab", (Object)"minecraft:sign", (Object)"minecraft:oak_sign").getOrDefault(s42, s42)));
        dataFixerBuilder.addFixer(new Class9045(dataFixerBuilder.addSchema(1803, Class5494.field22781), false));
        final Schema addSchema22 = dataFixerBuilder.addSchema(1904, (BiFunction)Class5201::new);
        dataFixerBuilder.addFixer(new Class8481(addSchema22, "Added Cats"));
        dataFixerBuilder.addFixer(new Class5034(addSchema22, false));
        dataFixerBuilder.addFixer(new Class9271(dataFixerBuilder.addSchema(1905, Class5494.field22781), false));
        dataFixerBuilder.addFixer(new Class8481(dataFixerBuilder.addSchema(1906, (BiFunction)Class5179::new), "Add POI Blocks"));
        dataFixerBuilder.addFixer(new Class8481(dataFixerBuilder.addSchema(1909, (BiFunction)Class5199::new), "Add jigsaw"));
        dataFixerBuilder.addFixer(new Class9160(dataFixerBuilder.addSchema(1911, Class5494.field22781), false));
        dataFixerBuilder.addFixer(new Class6145(dataFixerBuilder.addSchema(1917, Class5494.field22781), false));
        final Schema addSchema23 = dataFixerBuilder.addSchema(1918, Class5494.field22781);
        dataFixerBuilder.addFixer(new Class6149(addSchema23, "minecraft:villager"));
        dataFixerBuilder.addFixer(new Class6149(addSchema23, "minecraft:zombie_villager"));
        final Schema addSchema24 = dataFixerBuilder.addSchema(1920, (BiFunction)Class5186::new);
        dataFixerBuilder.addFixer(new Class9143(addSchema24, false));
        dataFixerBuilder.addFixer(new Class8481(addSchema24, "Add campfire"));
        dataFixerBuilder.addFixer(new Class8569(dataFixerBuilder.addSchema(1925, Class5494.field22781), false));
        final Schema addSchema25 = dataFixerBuilder.addSchema(1928, (BiFunction)Class5187::new);
        dataFixerBuilder.addFixer(new Class4138(addSchema25, true));
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema25, "Rename ravager egg item", s44 -> Class4138.field18260.getOrDefault(s44, s44)));
        dataFixerBuilder.addFixer(new Class8481(dataFixerBuilder.addSchema(1929, (BiFunction)Class5184::new), "Add Wandering Trader and Trader Llama"));
        dataFixerBuilder.addFixer(new Class8481(dataFixerBuilder.addSchema(1931, (BiFunction)Class5196::new), "Added Fox"));
        dataFixerBuilder.addFixer(new Class8898(dataFixerBuilder.addSchema(1936, Class5494.field22781), false));
        dataFixerBuilder.addFixer(new Class7821(dataFixerBuilder.addSchema(1946, Class5494.field22781), false));
        dataFixerBuilder.addFixer(new Class7370(dataFixerBuilder.addSchema(1948, Class5494.field22781), false));
        dataFixerBuilder.addFixer(new Class6141(dataFixerBuilder.addSchema(1953, Class5494.field22781), false));
        final Schema addSchema26 = dataFixerBuilder.addSchema(1955, Class5494.field22781);
        dataFixerBuilder.addFixer(new Class8873(addSchema26, false));
        dataFixerBuilder.addFixer(new Class6140(addSchema26, false));
        dataFixerBuilder.addFixer(new Class8629(dataFixerBuilder.addSchema(1961, Class5494.field22781), false));
        final Schema addSchema27 = dataFixerBuilder.addSchema(2100, (BiFunction)Class5181::new);
        dataFixerBuilder.addFixer(new Class8481(addSchema27, "Added Bee and Bee Stinger"));
        dataFixerBuilder.addFixer(new Class8481(addSchema27, "Add beehive"));
        dataFixerBuilder.addFixer(new Class8708(addSchema27, false, "Rename sugar recipe", anObject -> "minecraft:sugar".equals(anObject) ? "sugar_from_sugar_cane" : anObject));
        dataFixerBuilder.addFixer(new Class9188(addSchema27, false, "Rename sugar recipe advancement", anObject2 -> "minecraft:recipes/misc/sugar".equals(anObject2) ? "minecraft:recipes/misc/sugar_from_sugar_cane" : anObject2));
        dataFixerBuilder.addFixer(new Class8044(dataFixerBuilder.addSchema(2202, Class5494.field22781), false));
        final Schema addSchema28 = dataFixerBuilder.addSchema(2209, Class5494.field22781);
        dataFixerBuilder.addFixer(Class7534.method23613(addSchema28, "Rename bee_hive item to beehive", a4 -> Objects.equals(a4, "minecraft:bee_hive") ? "minecraft:beehive" : a4));
        dataFixerBuilder.addFixer(new Class5477(addSchema28));
        dataFixerBuilder.addFixer(Class8470.method28273(addSchema28, "Rename bee_hive block to beehive", s49 -> ImmutableMap.of((Object)"minecraft:bee_hive", (Object)"minecraft:beehive").getOrDefault(s49, s49)));
        dataFixerBuilder.addFixer(new Class9326(dataFixerBuilder.addSchema(2211, Class5494.field22781), false));
        dataFixerBuilder.addFixer(new Class8702(dataFixerBuilder.addSchema(2218, Class5494.field22781), false));
    }
    
    static {
        field22780 = Schema::new;
        field22781 = Class5174::new;
        field22782 = method16767();
    }
}
