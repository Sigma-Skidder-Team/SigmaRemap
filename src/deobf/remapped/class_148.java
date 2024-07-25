package remapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.DataFixerBuilder;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class class_148 {
   private static final BiFunction<Integer, Schema, Schema> field_427 = Schema::new;
   private static final BiFunction<Integer, Schema, Schema> field_428 = class_5178::new;
   private static final DataFixer field_426 = method_579();

   private static DataFixer method_579() {
      DataFixerBuilder var2 = new DataFixerBuilder(class_7665.method_34674().getWorldVersion());
      method_578(var2);
      return var2.build(class_9665.method_44695());
   }

   public static DataFixer method_580() {
      return field_426;
   }

   private static void method_578(DataFixerBuilder var0) {
      Schema var3 = var0.addSchema(99, class_5185::new);
      Schema var4 = var0.addSchema(100, class_9276::new);
      var0.addFixer(new class_3625(var4, true));
      Schema var5 = var0.addSchema(101, field_427);
      var0.addFixer(new class_2128(var5, false));
      Schema var6 = var0.addSchema(102, class_7097::new);
      var0.addFixer(new class_3626(var6, true));
      var0.addFixer(new class_1335(var6, false));
      Schema var7 = var0.addSchema(105, field_427);
      var0.addFixer(new class_4971(var7, true));
      Schema var8 = var0.addSchema(106, class_4118::new);
      var0.addFixer(new class_8345(var8, true));
      Schema var9 = var0.addSchema(107, class_9737::new);
      var0.addFixer(new class_3855(var9, true));
      Schema var10 = var0.addSchema(108, field_427);
      var0.addFixer(new class_5859(var10, true));
      Schema var11 = var0.addSchema(109, field_427);
      var0.addFixer(new class_6005(var11, true));
      Schema var12 = var0.addSchema(110, field_427);
      var0.addFixer(new class_1229(var12, true));
      Schema var13 = var0.addSchema(111, field_427);
      var0.addFixer(new class_2043(var13, true));
      Schema var14 = var0.addSchema(113, field_427);
      var0.addFixer(new class_5882(var14, true));
      Schema var15 = var0.addSchema(135, class_6813::new);
      var0.addFixer(new class_6479(var15, true));
      Schema var16 = var0.addSchema(143, class_358::new);
      var0.addFixer(new class_2530(var16, true));
      Schema var17 = var0.addSchema(147, field_427);
      var0.addFixer(new class_8340(var17, true));
      Schema var18 = var0.addSchema(165, field_427);
      var0.addFixer(new class_5993(var18, true));
      Schema var19 = var0.addSchema(501, class_9651::new);
      var0.addFixer(new class_1812(var19, "Add 1.10 entities fix", class_4002.field_19444));
      Schema var20 = var0.addSchema(502, field_427);
      var0.addFixer(
         class_1795.method_7993(
            var20,
            "cooked_fished item renamer",
            var0x -> !Objects.equals(class_5178.method_23742(var0x), "minecraft:cooked_fished") ? var0x : "minecraft:cooked_fish"
         )
      );
      var0.addFixer(new class_3591(var20, false));
      Schema var21 = var0.addSchema(505, field_427);
      var0.addFixer(new class_8280(var21, false));
      Schema var22 = var0.addSchema(700, class_2363::new);
      var0.addFixer(new class_3228(var22, true));
      Schema var23 = var0.addSchema(701, class_6719::new);
      var0.addFixer(new class_182(var23, true));
      Schema var24 = var0.addSchema(702, class_3434::new);
      var0.addFixer(new class_4858(var24, true));
      Schema var25 = var0.addSchema(703, class_7445::new);
      var0.addFixer(new class_2014(var25, true));
      Schema var26 = var0.addSchema(704, class_2063::new);
      var0.addFixer(new class_4595(var26, true));
      Schema var27 = var0.addSchema(705, class_253::new);
      var0.addFixer(new class_4731(var27, true));
      Schema var28 = var0.addSchema(804, field_428);
      var0.addFixer(new class_9870(var28, true));
      Schema var29 = var0.addSchema(806, field_428);
      var0.addFixer(new class_8814(var29, false));
      Schema var30 = var0.addSchema(808, class_5388::new);
      var0.addFixer(new class_1812(var30, "added shulker box", class_4002.field_19434));
      Schema var31 = var0.addSchema(808, 1, field_428);
      var0.addFixer(new class_893(var31, false));
      Schema var32 = var0.addSchema(813, field_428);
      var0.addFixer(new class_8821(var32, false));
      var0.addFixer(new class_2860(var32, false));
      Schema var33 = var0.addSchema(816, field_428);
      var0.addFixer(new class_5796(var33, false));
      Schema var34 = var0.addSchema(820, field_428);
      var0.addFixer(class_1795.method_7993(var34, "totem item renamer", method_582("minecraft:totem", "minecraft:totem_of_undying")));
      Schema var35 = var0.addSchema(1022, class_4063::new);
      var0.addFixer(new class_7919(var35, "added shoulder entities to players", class_4002.field_19436));
      Schema var36 = var0.addSchema(1125, class_6523::new);
      var0.addFixer(new class_7129(var36, true));
      var0.addFixer(new class_4930(var36, false));
      Schema var37 = var0.addSchema(1344, field_428);
      var0.addFixer(new class_7720(var37, false));
      Schema var38 = var0.addSchema(1446, field_428);
      var0.addFixer(new class_8284(var38, false));
      Schema var39 = var0.addSchema(1450, field_428);
      var0.addFixer(new class_6827(var39, false));
      Schema var40 = var0.addSchema(1451, class_9565::new);
      var0.addFixer(new class_1812(var40, "AddTrappedChestFix", class_4002.field_19434));
      Schema var41 = var0.addSchema(1451, 1, class_3759::new);
      var0.addFixer(new class_5878(var41, true));
      Schema var42 = var0.addSchema(1451, 2, class_9223::new);
      var0.addFixer(new class_6100(var42, true));
      Schema var43 = var0.addSchema(1451, 3, class_2678::new);
      var0.addFixer(new class_7098(var43, true));
      var0.addFixer(new class_4983(var43, false));
      Schema var44 = var0.addSchema(1451, 4, class_2172::new);
      var0.addFixer(new class_6968(var44, true));
      var0.addFixer(new class_2703(var44, false));
      Schema var45 = var0.addSchema(1451, 5, class_6687::new);
      var0.addFixer(new class_1812(var45, "RemoveNoteBlockFlowerPotFix", class_4002.field_19434));
      var0.addFixer(new class_6081(var45, false));
      var0.addFixer(new class_7146(var45, false));
      var0.addFixer(new class_9272(var45, false));
      var0.addFixer(new class_8415(var45, false));
      Schema var46 = var0.addSchema(1451, 6, class_5175::new);
      var0.addFixer(new class_2054(var46, true));
      var0.addFixer(new class_4132(var46, false));
      Schema var47 = var0.addSchema(1451, 7, class_6428::new);
      var0.addFixer(new class_1211(var47, true));
      Schema var48 = var0.addSchema(1451, 7, field_428);
      var0.addFixer(new class_8754(var48, false));
      Schema var49 = var0.addSchema(1456, field_428);
      var0.addFixer(new class_1104(var49, false));
      Schema var50 = var0.addSchema(1458, field_428);
      var0.addFixer(new class_1999(var50, false));
      var0.addFixer(new class_3018(var50, false));
      var0.addFixer(new class_7316(var50, false));
      Schema var51 = var0.addSchema(1460, class_607::new);
      var0.addFixer(new class_3086(var51, false));
      Schema var52 = var0.addSchema(1466, class_8019::new);
      var0.addFixer(new class_8838(var52, true));
      Schema var53 = var0.addSchema(1470, class_2328::new);
      var0.addFixer(new class_1812(var53, "Add 1.13 entities fix", class_4002.field_19444));
      Schema var54 = var0.addSchema(1474, field_428);
      var0.addFixer(new class_4313(var54, false));
      var0.addFixer(
         class_3807.method_17726(
            var54,
            "Colorless shulker block fixer",
            var0x -> !Objects.equals(class_5178.method_23742(var0x), "minecraft:purple_shulker_box") ? var0x : "minecraft:shulker_box"
         )
      );
      var0.addFixer(
         class_1795.method_7993(
            var54,
            "Colorless shulker item fixer",
            var0x -> !Objects.equals(class_5178.method_23742(var0x), "minecraft:purple_shulker_box") ? var0x : "minecraft:shulker_box"
         )
      );
      Schema var55 = var0.addSchema(1475, field_428);
      var0.addFixer(
         class_3807.method_17726(
            var55, "Flowing fixer", method_581(ImmutableMap.of("minecraft:flowing_water", "minecraft:water", "minecraft:flowing_lava", "minecraft:lava"))
         )
      );
      Schema var56 = var0.addSchema(1480, field_428);
      var0.addFixer(class_3807.method_17726(var56, "Rename coral blocks", method_581(class_9070.field_46407)));
      var0.addFixer(class_1795.method_7993(var56, "Rename coral items", method_581(class_9070.field_46407)));
      Schema var57 = var0.addSchema(1481, class_6886::new);
      var0.addFixer(new class_1812(var57, "Add conduit", class_4002.field_19434));
      Schema var58 = var0.addSchema(1483, class_5087::new);
      var0.addFixer(new class_566(var58, true));
      var0.addFixer(class_1795.method_7993(var58, "Rename pufferfish egg item", method_581(class_566.field_3346)));
      Schema var59 = var0.addSchema(1484, field_428);
      var0.addFixer(
         class_1795.method_7993(
            var59,
            "Rename seagrass items",
            method_581(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      var0.addFixer(
         class_3807.method_17726(
            var59,
            "Rename seagrass blocks",
            method_581(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      var0.addFixer(new class_4389(var59, false));
      Schema var60 = var0.addSchema(1486, class_5911::new);
      var0.addFixer(new class_3152(var60, true));
      var0.addFixer(class_1795.method_7993(var60, "Rename cod/salmon egg items", method_581(class_3152.field_15676)));
      Schema var61 = var0.addSchema(1487, field_428);
      var0.addFixer(
         class_1795.method_7993(
            var61,
            "Rename prismarine_brick(s)_* blocks",
            method_581(
               ImmutableMap.of(
                  "minecraft:prismarine_bricks_slab",
                  "minecraft:prismarine_brick_slab",
                  "minecraft:prismarine_bricks_stairs",
                  "minecraft:prismarine_brick_stairs"
               )
            )
         )
      );
      var0.addFixer(
         class_3807.method_17726(
            var61,
            "Rename prismarine_brick(s)_* items",
            method_581(
               ImmutableMap.of(
                  "minecraft:prismarine_bricks_slab",
                  "minecraft:prismarine_brick_slab",
                  "minecraft:prismarine_bricks_stairs",
                  "minecraft:prismarine_brick_stairs"
               )
            )
         )
      );
      Schema var62 = var0.addSchema(1488, field_428);
      var0.addFixer(
         class_3807.method_17726(
            var62, "Rename kelp/kelptop", method_581(ImmutableMap.of("minecraft:kelp_top", "minecraft:kelp", "minecraft:kelp", "minecraft:kelp_plant"))
         )
      );
      var0.addFixer(class_1795.method_7993(var62, "Rename kelptop", method_582("minecraft:kelp_top", "minecraft:kelp")));
      var0.addFixer(new class_4277(var62, false, "Command block block entity custom name fix", class_4002.field_19434, "minecraft:command_block"));
      var0.addFixer(new class_2189(var62, false, "Command block minecart custom name fix", class_4002.field_19444, "minecraft:commandblock_minecart"));
      var0.addFixer(new class_8476(var62, false));
      Schema var63 = var0.addSchema(1490, field_428);
      var0.addFixer(class_3807.method_17726(var63, "Rename melon_block", method_582("minecraft:melon_block", "minecraft:melon")));
      var0.addFixer(
         class_1795.method_7993(
            var63,
            "Rename melon_block/melon/speckled_melon",
            method_581(
               ImmutableMap.of(
                  "minecraft:melon_block",
                  "minecraft:melon",
                  "minecraft:melon",
                  "minecraft:melon_slice",
                  "minecraft:speckled_melon",
                  "minecraft:glistering_melon_slice"
               )
            )
         )
      );
      Schema var64 = var0.addSchema(1492, field_428);
      var0.addFixer(new class_5241(var64, false));
      Schema var65 = var0.addSchema(1494, field_428);
      var0.addFixer(new class_4528(var65, false));
      Schema var66 = var0.addSchema(1496, field_428);
      var0.addFixer(new class_8656(var66, false));
      Schema var67 = var0.addSchema(1500, field_428);
      var0.addFixer(new class_2047(var67, false));
      Schema var68 = var0.addSchema(1501, field_428);
      var0.addFixer(new class_6027(var68, false));
      Schema var69 = var0.addSchema(1502, field_428);
      var0.addFixer(new class_7944(var69, false));
      Schema var70 = var0.addSchema(1506, field_428);
      var0.addFixer(new class_9013(var70, false));
      Schema var71 = var0.addSchema(1510, class_5808::new);
      var0.addFixer(class_3807.method_17726(var71, "Block renamening fix", method_581(class_8564.field_43801)));
      var0.addFixer(class_1795.method_7993(var71, "Item renamening fix", method_581(class_8564.field_43798)));
      var0.addFixer(new class_3812(var71, false));
      var0.addFixer(new class_8564(var71, true));
      var0.addFixer(new class_3313(var71, false));
      Schema var72 = var0.addSchema(1514, field_428);
      var0.addFixer(new class_9108(var72, false));
      var0.addFixer(new class_8703(var72, false));
      var0.addFixer(new class_5421(var72, false));
      Schema var73 = var0.addSchema(1515, field_428);
      var0.addFixer(class_3807.method_17726(var73, "Rename coral fan blocks", method_581(class_5239.field_26852)));
      Schema var74 = var0.addSchema(1624, field_428);
      var0.addFixer(new class_3747(var74, false));
      Schema var75 = var0.addSchema(1800, class_9175::new);
      var0.addFixer(new class_1812(var75, "Added 1.14 mobs fix", class_4002.field_19444));
      var0.addFixer(class_1795.method_7993(var75, "Rename dye items", method_581(class_9498.field_48381)));
      Schema var76 = var0.addSchema(1801, class_4873::new);
      var0.addFixer(new class_1812(var76, "Added Illager Beast", class_4002.field_19444));
      Schema var77 = var0.addSchema(1802, field_428);
      var0.addFixer(
         class_3807.method_17726(
            var77,
            "Rename sign blocks & stone slabs",
            method_581(
               ImmutableMap.of(
                  "minecraft:stone_slab",
                  "minecraft:smooth_stone_slab",
                  "minecraft:sign",
                  "minecraft:oak_sign",
                  "minecraft:wall_sign",
                  "minecraft:oak_wall_sign"
               )
            )
         )
      );
      var0.addFixer(
         class_1795.method_7993(
            var77,
            "Rename sign item & stone slabs",
            method_581(ImmutableMap.of("minecraft:stone_slab", "minecraft:smooth_stone_slab", "minecraft:sign", "minecraft:oak_sign"))
         )
      );
      Schema var78 = var0.addSchema(1803, field_428);
      var0.addFixer(new class_5767(var78, false));
      Schema var79 = var0.addSchema(1904, class_3550::new);
      var0.addFixer(new class_1812(var79, "Added Cats", class_4002.field_19444));
      var0.addFixer(new class_6897(var79, false));
      Schema var80 = var0.addSchema(1905, field_428);
      var0.addFixer(new class_4090(var80, false));
      Schema var81 = var0.addSchema(1906, class_1045::new);
      var0.addFixer(new class_1812(var81, "Add POI Blocks", class_4002.field_19434));
      Schema var82 = var0.addSchema(1909, class_8663::new);
      var0.addFixer(new class_1812(var82, "Add jigsaw", class_4002.field_19434));
      Schema var83 = var0.addSchema(1911, field_428);
      var0.addFixer(new class_8948(var83, false));
      Schema var84 = var0.addSchema(1917, field_428);
      var0.addFixer(new class_7190(var84, false));
      Schema var85 = var0.addSchema(1918, field_428);
      var0.addFixer(new class_8278(var85, "minecraft:villager"));
      var0.addFixer(new class_8278(var85, "minecraft:zombie_villager"));
      Schema var86 = var0.addSchema(1920, class_4592::new);
      var0.addFixer(new class_6426(var86, false));
      var0.addFixer(new class_1812(var86, "Add campfire", class_4002.field_19434));
      Schema var87 = var0.addSchema(1925, field_428);
      var0.addFixer(new class_5588(var87, false));
      Schema var88 = var0.addSchema(1928, class_8705::new);
      var0.addFixer(new class_3088(var88, true));
      var0.addFixer(class_1795.method_7993(var88, "Rename ravager egg item", method_581(class_3088.field_15308)));
      Schema var89 = var0.addSchema(1929, class_676::new);
      var0.addFixer(new class_1812(var89, "Add Wandering Trader and Trader Llama", class_4002.field_19444));
      Schema var90 = var0.addSchema(1931, class_7457::new);
      var0.addFixer(new class_1812(var90, "Added Fox", class_4002.field_19444));
      Schema var91 = var0.addSchema(1936, field_428);
      var0.addFixer(new class_2886(var91, false));
      Schema var92 = var0.addSchema(1946, field_428);
      var0.addFixer(new class_7726(var92, false));
      Schema var93 = var0.addSchema(1948, field_428);
      var0.addFixer(new class_8573(var93, false));
      Schema var94 = var0.addSchema(1953, field_428);
      var0.addFixer(new class_4622(var94, false));
      Schema var95 = var0.addSchema(1955, field_428);
      var0.addFixer(new class_9600(var95, false));
      var0.addFixer(new class_7275(var95, false));
      Schema var96 = var0.addSchema(1961, field_428);
      var0.addFixer(new class_2974(var96, false));
      Schema var97 = var0.addSchema(1963, field_428);
      var0.addFixer(new class_5419(var97, false));
      Schema var98 = var0.addSchema(2100, class_100::new);
      var0.addFixer(new class_1812(var98, "Added Bee and Bee Stinger", class_4002.field_19444));
      var0.addFixer(new class_1812(var98, "Add beehive", class_4002.field_19434));
      var0.addFixer(new class_5735(var98, false, "Rename sugar recipe", method_582("minecraft:sugar", "sugar_from_sugar_cane")));
      var0.addFixer(
         new class_9473(
            var98, false, "Rename sugar recipe advancement", method_582("minecraft:recipes/misc/sugar", "minecraft:recipes/misc/sugar_from_sugar_cane")
         )
      );
      Schema var99 = var0.addSchema(2202, field_428);
      var0.addFixer(new class_7456(var99, false));
      Schema var100 = var0.addSchema(2209, field_428);
      var0.addFixer(class_1795.method_7993(var100, "Rename bee_hive item to beehive", method_582("minecraft:bee_hive", "minecraft:beehive")));
      var0.addFixer(new class_3708(var100));
      var0.addFixer(class_3807.method_17726(var100, "Rename bee_hive block to beehive", method_582("minecraft:bee_hive", "minecraft:beehive")));
      Schema var101 = var0.addSchema(2211, field_428);
      var0.addFixer(new class_510(var101, false));
      Schema var102 = var0.addSchema(2218, field_428);
      var0.addFixer(new class_2760(var102, false));
      Schema var103 = var0.addSchema(2501, class_7541::new);
      var0.addFixer(new class_9187(var103, true));
      Schema var104 = var0.addSchema(2502, class_8723::new);
      var0.addFixer(new class_1812(var104, "Added Hoglin", class_4002.field_19444));
      Schema var105 = var0.addSchema(2503, field_428);
      var0.addFixer(new class_9015(var105, false));
      var0.addFixer(
         new class_9473(var105, false, "Composter category change", method_582("minecraft:recipes/misc/composter", "minecraft:recipes/decorations/composter"))
      );
      Schema var106 = var0.addSchema(2505, class_2797::new);
      var0.addFixer(new class_1812(var106, "Added Piglin", class_4002.field_19444));
      var0.addFixer(new class_6119(var106, "minecraft:villager"));
      Schema var107 = var0.addSchema(2508, field_428);
      var0.addFixer(
         class_1795.method_7993(
            var107,
            "Renamed fungi items to fungus",
            method_581(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      var0.addFixer(
         class_3807.method_17726(
            var107,
            "Renamed fungi blocks to fungus",
            method_581(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      Schema var108 = var0.addSchema(2509, class_9421::new);
      var0.addFixer(new class_827(var108));
      var0.addFixer(class_1795.method_7993(var108, "Rename zombie pigman egg item", method_581(class_827.field_4361)));
      Schema var109 = var0.addSchema(2511, field_428);
      var0.addFixer(new class_3011(var109));
      Schema var110 = var0.addSchema(2514, field_428);
      var0.addFixer(new class_8306(var110));
      var0.addFixer(new class_3890(var110));
      var0.addFixer(new class_6071(var110));
      var0.addFixer(new class_9682(var110));
      var0.addFixer(new class_1395(var110));
      var0.addFixer(new class_3248(var110));
      Schema var111 = var0.addSchema(2516, field_428);
      var0.addFixer(new class_9220(var111, "minecraft:villager"));
      var0.addFixer(new class_9220(var111, "minecraft:zombie_villager"));
      Schema var112 = var0.addSchema(2518, field_428);
      var0.addFixer(new class_2028(var112, false));
      var0.addFixer(new class_4571(var112, false));
      Schema var113 = var0.addSchema(2519, class_4912::new);
      var0.addFixer(new class_1812(var113, "Added Strider", class_4002.field_19444));
      Schema var114 = var0.addSchema(2522, class_6255::new);
      var0.addFixer(new class_1812(var114, "Added Zoglin", class_4002.field_19444));
      Schema var115 = var0.addSchema(2523, field_428);
      var0.addFixer(new class_5666(var115));
      Schema var116 = var0.addSchema(2527, field_428);
      var0.addFixer(new class_3274(var116));
      Schema var117 = var0.addSchema(2528, field_428);
      var0.addFixer(
         class_1795.method_7993(
            var117,
            "Rename soul fire torch and soul fire lantern",
            method_581(ImmutableMap.of("minecraft:soul_fire_torch", "minecraft:soul_torch", "minecraft:soul_fire_lantern", "minecraft:soul_lantern"))
         )
      );
      var0.addFixer(
         class_3807.method_17726(
            var117,
            "Rename soul fire torch and soul fire lantern",
            method_581(
               ImmutableMap.of(
                  "minecraft:soul_fire_torch",
                  "minecraft:soul_torch",
                  "minecraft:soul_fire_wall_torch",
                  "minecraft:soul_wall_torch",
                  "minecraft:soul_fire_lantern",
                  "minecraft:soul_lantern"
               )
            )
         )
      );
      Schema var118 = var0.addSchema(2529, field_428);
      var0.addFixer(new class_4462(var118, false));
      Schema var119 = var0.addSchema(2531, field_428);
      var0.addFixer(new class_9643(var119));
      Schema var120 = var0.addSchema(2533, field_428);
      var0.addFixer(new class_4703(var120));
      Schema var121 = var0.addSchema(2535, field_428);
      var0.addFixer(new class_8741(var121));
      Schema var122 = var0.addSchema(2550, field_428);
      var0.addFixer(new class_9002(var122));
      Schema var123 = var0.addSchema(2551, class_6869::new);
      var0.addFixer(new class_7919(var123, "add types to WorldGenData", class_4002.field_19441));
      Schema var124 = var0.addSchema(2552, field_428);
      var0.addFixer(new class_2895(var124, false, "Nether biome rename", ImmutableMap.of("minecraft:nether", "minecraft:nether_wastes")));
      Schema var125 = var0.addSchema(2553, field_428);
      var0.addFixer(new class_2342(var125, false));
      Schema var126 = var0.addSchema(2558, field_428);
      var0.addFixer(new class_3141(var126, false));
      var0.addFixer(new class_1866(var126, false, "Rename swapHands setting", "key_key.swapHands", "key_key.swapOffhand"));
      Schema var127 = var0.addSchema(2568, class_1802::new);
      var0.addFixer(new class_1812(var127, "Added Piglin Brute", class_4002.field_19444));
   }

   private static UnaryOperator<String> method_581(Map<String, String> var0) {
      return var1 -> var0.getOrDefault(var1, var1);
   }

   private static UnaryOperator<String> method_582(String var0, String var1) {
      return var2 -> !Objects.equals(var2, var0) ? var2 : var1;
   }
}
