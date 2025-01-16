package mapped;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.DataFixerBuilder;
import com.mojang.datafixers.schemas.Schema;
import net.minecraft.util.Util;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.datafix.TypeReferences;
import net.minecraft.util.datafix.fixes.*;

import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class DataFixesManager {
   private static final BiFunction<Integer, Schema, Schema> field21708 = Schema::new;
   private static final BiFunction<Integer, Schema, Schema> field21709 = Class3639::new;
   private static final DataFixer field21710 = method14180();

   private static DataFixer method14180() {
      DataFixerBuilder var2 = new DataFixerBuilder(SharedConstants.getVersion().getWorldVersion());
      method14182(var2);
      return var2.build(Util.getBootstrapService());
   }

   public static DataFixer getDataFixer() {
      return field21710;
   }

   private static void method14182(DataFixerBuilder var0) {
      Schema var3 = var0.addSchema(99, Class8604::new);
      Schema var4 = var0.addSchema(100, Class9674::new);
      var0.addFixer(new Class8104(var4, true));
      Schema var5 = var0.addSchema(101, field21708);
      var0.addFixer(new Class6726(var5, false));
      Schema var6 = var0.addSchema(102, Class9121::new);
      var0.addFixer(new Class8105(var6, true));
      var0.addFixer(new Class7073(var6, false));
      Schema var7 = var0.addSchema(105, field21708);
      var0.addFixer(new Class8536(var7, true));
      Schema var8 = var0.addSchema(106, Class8271::new);
      var0.addFixer(new Class9430(var8, true));
      Schema var9 = var0.addSchema(107, Class9801::new);
      var0.addFixer(new Class8193(var9, true));
      Schema var10 = var0.addSchema(108, field21708);
      var0.addFixer(new Class8778(var10, true));
      Schema var11 = var0.addSchema(109, field21708);
      var0.addFixer(new Class8813(var11, true));
      Schema var12 = var0.addSchema(110, field21708);
      var0.addFixer(new Class6734(var12, true));
      Schema var13 = var0.addSchema(111, field21708);
      var0.addFixer(new Class7485(var13, true));
      Schema var14 = var0.addSchema(113, field21708);
      var0.addFixer(new Class8784(var14, true));
      Schema var15 = var0.addSchema(135, Class9048::new);
      var0.addFixer(new Class8946(var15, true));
      Schema var16 = var0.addSchema(143, Class5915::new);
      var0.addFixer(new TippedArrow(var16, true));
      Schema var17 = var0.addSchema(147, field21708);
      var0.addFixer(new Class6724(var17, true));
      Schema var18 = var0.addSchema(165, field21708);
      var0.addFixer(new Class8809(var18, true));
      Schema var19 = var0.addSchema(501, Class9771::new);
      var0.addFixer(new Class7335(var19, "Add 1.10 entities fix", TypeReferences.ENTITY));
      Schema var20 = var0.addSchema(502, field21708);
      var0.addFixer(
         Class7325.method23221(
            var20,
            "cooked_fished item renamer",
            var0x -> !Objects.equals(Class3639.method12353(var0x), "minecraft:cooked_fished") ? var0x : "minecraft:cooked_fish"
         )
      );
      var0.addFixer(new Class6744(var20, false));
      Schema var21 = var0.addSchema(505, field21708);
      var0.addFixer(new Class9412(var21, false));
      Schema var22 = var0.addSchema(700, Class7654::new);
      var0.addFixer(new Class4658(var22, true));
      Schema var23 = var0.addSchema(701, Class9023::new);
      var0.addFixer(new Class4652(var23, true));
      Schema var24 = var0.addSchema(702, Class8038::new);
      var0.addFixer(new Class4657(var24, true));
      Schema var25 = var0.addSchema(703, Class9197::new);
      var0.addFixer(new HorseSplit(var25, true));
      Schema var26 = var0.addSchema(704, Class7506::new);
      var0.addFixer(new Class8441(var26, true));
      Schema var27 = var0.addSchema(705, Class3647::new);
      var0.addFixer(new Class8476(var27, true));
      Schema var28 = var0.addSchema(804, field21709);
      var0.addFixer(new Class9839(var28, true));
      Schema var29 = var0.addSchema(806, field21709);
      var0.addFixer(new Class9552(var29, false));
      Schema var30 = var0.addSchema(808, Class3667::new);
      var0.addFixer(new Class7335(var30, "added shulker box", TypeReferences.BLOCK_ENTITY));
      Schema var31 = var0.addSchema(808, 1, field21709);
      var0.addFixer(new Class6716(var31, false));
      Schema var32 = var0.addSchema(813, field21709);
      var0.addFixer(new Class9555(var32, false));
      var0.addFixer(new Class6731(var32, false));
      Schema var33 = var0.addSchema(816, field21709);
      var0.addFixer(new Class8759(var33, false));
      Schema var34 = var0.addSchema(820, field21709);
      var0.addFixer(Class7325.method23221(var34, "totem item renamer", method14184("minecraft:totem", "minecraft:totem_of_undying")));
      Schema var35 = var0.addSchema(1022, Class8257::new);
      var0.addFixer(new Class9314(var35, "added shoulder entities to players", TypeReferences.PLAYER));
      Schema var36 = var0.addSchema(1125, Class3648::new);
      var0.addFixer(new Class9130(var36, true));
      var0.addFixer(new Class8521(var36, false));
      Schema var37 = var0.addSchema(1344, field21709);
      var0.addFixer(new Class9259(var37, false));
      Schema var38 = var0.addSchema(1446, field21709);
      var0.addFixer(new Class9414(var38, false));
      Schema var39 = var0.addSchema(1450, field21709);
      var0.addFixer(new Class9053(var39, false));
      Schema var40 = var0.addSchema(1451, Class3660::new);
      var0.addFixer(new Class7335(var40, "AddTrappedChestFix", TypeReferences.BLOCK_ENTITY));
      Schema var41 = var0.addSchema(1451, 1, Class3659::new);
      var0.addFixer(new Class8782(var41, true));
      Schema var42 = var0.addSchema(1451, 2, Class3664::new);
      var0.addFixer(new Class6719(var42, true));
      Schema var43 = var0.addSchema(1451, 3, Class3641::new);
      var0.addFixer(new Class9122(var43, true));
      var0.addFixer(new Class8540(var43, false));
      Schema var44 = var0.addSchema(1451, 4, Class3674::new);
      var0.addFixer(new Class9091(var44, true));
      var0.addFixer(new Class7774(var44, false));
      Schema var45 = var0.addSchema(1451, 5, Class3658::new);
      var0.addFixer(new Class7335(var45, "RemoveNoteBlockFlowerPotFix", TypeReferences.BLOCK_ENTITY));
      var0.addFixer(new Class8838(var45, false));
      var0.addFixer(new Class6735(var45, false));
      var0.addFixer(new Class6730(var45, false));
      var0.addFixer(new Class9445(var45, false));
      Schema var46 = var0.addSchema(1451, 6, Class3644::new);
      var0.addFixer(new Class7499(var46, true));
      var0.addFixer(new Class6741(var46, false));
      Schema var47 = var0.addSchema(1451, 7, Class3645::new);
      var0.addFixer(new Class6975(var47, true));
      Schema var48 = var0.addSchema(1451, 7, field21709);
      var0.addFixer(new Class6732(var48, false));
      Schema var49 = var0.addSchema(1456, field21709);
      var0.addFixer(new Class6718(var49, false));
      Schema var50 = var0.addSchema(1458, field21709);
      var0.addFixer(new Class7467(var50, false));
      var0.addFixer(new Class7912(var50, false));
      var0.addFixer(new Class9167(var50, false));
      Schema var51 = var0.addSchema(1460, Class3655::new);
      var0.addFixer(new Class6728(var51, false));
      Schema var52 = var0.addSchema(1466, Class3642::new);
      var0.addFixer(new Class9562(var52, true));
      Schema var53 = var0.addSchema(1470, Class3668::new);
      var0.addFixer(new Class7335(var53, "Add 1.13 entities fix", TypeReferences.ENTITY));
      Schema var54 = var0.addSchema(1474, field21709);
      var0.addFixer(new Class6740(var54, false));
      var0.addFixer(
         Class7765.method25738(
            var54,
            "Colorless shulker block fixer",
            var0x -> !Objects.equals(Class3639.method12353(var0x), "minecraft:purple_shulker_box") ? var0x : "minecraft:shulker_box"
         )
      );
      var0.addFixer(
         Class7325.method23221(
            var54,
            "Colorless shulker item fixer",
            var0x -> !Objects.equals(Class3639.method12353(var0x), "minecraft:purple_shulker_box") ? var0x : "minecraft:shulker_box"
         )
      );
      Schema var55 = var0.addSchema(1475, field21709);
      var0.addFixer(
         Class7765.method25738(
            var55, "Flowing fixer", method14183(ImmutableMap.of("minecraft:flowing_water", "minecraft:water", "minecraft:flowing_lava", "minecraft:lava"))
         )
      );
      Schema var56 = var0.addSchema(1480, field21709);
      var0.addFixer(Class7765.method25738(var56, "Rename coral blocks", method14183(Class9623.field45003)));
      var0.addFixer(Class7325.method23221(var56, "Rename coral items", method14183(Class9623.field45003)));
      Schema var57 = var0.addSchema(1481, Class3646::new);
      var0.addFixer(new Class7335(var57, "Add conduit", TypeReferences.BLOCK_ENTITY));
      Schema var58 = var0.addSchema(1483, Class3653::new);
      var0.addFixer(new PufferfishRename(var58, true));
      var0.addFixer(Class7325.method23221(var58, "Rename pufferfish egg item", method14183(PufferfishRename.field27827)));
      Schema var59 = var0.addSchema(1484, field21709);
      var0.addFixer(
         Class7325.method23221(
            var59,
            "Rename seagrass items",
            method14183(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      var0.addFixer(
         Class7765.method25738(
            var59,
            "Rename seagrass blocks",
            method14183(ImmutableMap.of("minecraft:sea_grass", "minecraft:seagrass", "minecraft:tall_sea_grass", "minecraft:tall_seagrass"))
         )
      );
      var0.addFixer(new Class8372(var59, false));
      Schema var60 = var0.addSchema(1486, Class3651::new);
      var0.addFixer(new EntityCodSalmonFix(var60, true));
      var0.addFixer(Class7325.method23221(var60, "Rename cod/salmon egg items", method14183(EntityCodSalmonFix.field27831)));
      Schema var61 = var0.addSchema(1487, field21709);
      var0.addFixer(
         Class7325.method23221(
            var61,
            "Rename prismarine_brick(s)_* blocks",
            method14183(
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
         Class7765.method25738(
            var61,
            "Rename prismarine_brick(s)_* items",
            method14183(
               ImmutableMap.of(
                  "minecraft:prismarine_bricks_slab",
                  "minecraft:prismarine_brick_slab",
                  "minecraft:prismarine_bricks_stairs",
                  "minecraft:prismarine_brick_stairs"
               )
            )
         )
      );
      Schema var62 = var0.addSchema(1488, field21709);
      var0.addFixer(
         Class7765.method25738(
            var62, "Rename kelp/kelptop", method14183(ImmutableMap.of("minecraft:kelp_top", "minecraft:kelp", "minecraft:kelp", "minecraft:kelp_plant"))
         )
      );
      var0.addFixer(Class7325.method23221(var62, "Rename kelptop", method14184("minecraft:kelp_top", "minecraft:kelp")));
      var0.addFixer(new Class6737(var62, false, "Command block block entity custom name fix", TypeReferences.BLOCK_ENTITY, "minecraft:command_block"));
      var0.addFixer(new Class6722(var62, false, "Command block minecart custom name fix", TypeReferences.ENTITY, "minecraft:commandblock_minecart"));
      var0.addFixer(new Class9462(var62, false));
      Schema var63 = var0.addSchema(1490, field21709);
      var0.addFixer(Class7765.method25738(var63, "Rename melon_block", method14184("minecraft:melon_block", "minecraft:melon")));
      var0.addFixer(
         Class7325.method23221(
            var63,
            "Rename melon_block/melon/speckled_melon",
            method14183(
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
      Schema var64 = var0.addSchema(1492, field21709);
      var0.addFixer(new Class8618(var64, false));
      Schema var65 = var0.addSchema(1494, field21709);
      var0.addFixer(new Class8419(var65, false));
      Schema var66 = var0.addSchema(1496, field21709);
      var0.addFixer(new Class9508(var66, false));
      Schema var67 = var0.addSchema(1500, field21709);
      var0.addFixer(new Class6743(var67, false));
      Schema var68 = var0.addSchema(1501, field21709);
      var0.addFixer(new Class8822(var68, false));
      Schema var69 = var0.addSchema(1502, field21709);
      var0.addFixer(new Class8168(var69, false));
      Schema var70 = var0.addSchema(1506, field21709);
      var0.addFixer(new Class9611(var70, false));
      Schema var71 = var0.addSchema(1510, Class3650::new);
      var0.addFixer(Class7765.method25738(var71, "Block renamening fix", method14183(EntityRenaming1510.BLOCK_RENAME_MAP)));
      var0.addFixer(Class7325.method23221(var71, "Item renamening fix", method14183(EntityRenaming1510.ITEM_RENAME_MAP)));
      var0.addFixer(new Class8166(var71, false));
      var0.addFixer(new EntityRenaming1510(var71, true));
      var0.addFixer(new Class7997(var71, false));
      Schema var72 = var0.addSchema(1514, field21709);
      var0.addFixer(new Class9631(var72, false));
      var0.addFixer(new Class9522(var72, false));
      var0.addFixer(new Class8660(var72, false));
      Schema var73 = var0.addSchema(1515, field21709);
      var0.addFixer(Class7765.method25738(var73, "Rename coral fan blocks", method14183(Class8617.field38746)));
      Schema var74 = var0.addSchema(1624, field21709);
      var0.addFixer(new Class8151(var74, false));
      Schema var75 = var0.addSchema(1800, Class3670::new);
      var0.addFixer(new Class7335(var75, "Added 1.14 mobs fix", TypeReferences.ENTITY));
      var0.addFixer(Class7325.method23221(var75, "Rename dye items", method14183(Class9730.field45433)));
      Schema var76 = var0.addSchema(1801, Class3671::new);
      var0.addFixer(new Class7335(var76, "Added Illager Beast", TypeReferences.ENTITY));
      Schema var77 = var0.addSchema(1802, field21709);
      var0.addFixer(
         Class7765.method25738(
            var77,
            "Rename sign blocks & stone slabs",
            method14183(
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
         Class7325.method23221(
            var77,
            "Rename sign item & stone slabs",
            method14183(ImmutableMap.of("minecraft:stone_slab", "minecraft:smooth_stone_slab", "minecraft:sign", "minecraft:oak_sign"))
         )
      );
      Schema var78 = var0.addSchema(1803, field21709);
      var0.addFixer(new Class8754(var78, false));
      Schema var79 = var0.addSchema(1904, Class3652::new);
      var0.addFixer(new Class7335(var79, "Added Cats", TypeReferences.ENTITY));
      var0.addFixer(new Class4654(var79, false));
      Schema var80 = var0.addSchema(1905, field21709);
      var0.addFixer(new Class8263(var80, false));
      Schema var81 = var0.addSchema(1906, Class3662::new);
      var0.addFixer(new Class7335(var81, "Add POI Blocks", TypeReferences.BLOCK_ENTITY));
      Schema var82 = var0.addSchema(1909, Class3663::new);
      var0.addFixer(new Class7335(var82, "Add jigsaw", TypeReferences.BLOCK_ENTITY));
      Schema var83 = var0.addSchema(1911, field21709);
      var0.addFixer(new Class9589(var83, false));
      Schema var84 = var0.addSchema(1917, field21709);
      var0.addFixer(new Class6723(var84, false));
      Schema var85 = var0.addSchema(1918, field21709);
      var0.addFixer(new Class6742(var85, "minecraft:villager"));
      var0.addFixer(new Class6742(var85, "minecraft:zombie_villager"));
      Schema var86 = var0.addSchema(1920, Class3669::new);
      var0.addFixer(new Class8929(var86, false));
      var0.addFixer(new Class7335(var86, "Add campfire", TypeReferences.BLOCK_ENTITY));
      Schema var87 = var0.addSchema(1925, field21709);
      var0.addFixer(new Class8698(var87, false));
      Schema var88 = var0.addSchema(1928, Class3672::new);
      var0.addFixer(new EntityRavagerRenameFix(var88, true));
      var0.addFixer(Class7325.method23221(var88, "Rename ravager egg item", method14183(EntityRavagerRenameFix.field27832)));
      Schema var89 = var0.addSchema(1929, Class3643::new);
      var0.addFixer(new Class7335(var89, "Add Wandering Trader and Trader Llama", TypeReferences.ENTITY));
      Schema var90 = var0.addSchema(1931, Class3640::new);
      var0.addFixer(new Class7335(var90, "Added Fox", TypeReferences.ENTITY));
      Schema var91 = var0.addSchema(1936, field21709);
      var0.addFixer(new Class7840(var91, false));
      Schema var92 = var0.addSchema(1946, field21709);
      var0.addFixer(new Class9261(var92, false));
      Schema var93 = var0.addSchema(1948, field21709);
      var0.addFixer(new Class9486(var93, false));
      Schema var94 = var0.addSchema(1953, field21709);
      var0.addFixer(new Class6739(var94, false));
      Schema var95 = var0.addSchema(1955, field21709);
      var0.addFixer(new Class9760(var95, false));
      var0.addFixer(new Class6725(var95, false));
      Schema var96 = var0.addSchema(1961, field21709);
      var0.addFixer(new Class7878(var96, false));
      Schema var97 = var0.addSchema(1963, field21709);
      var0.addFixer(new Class6727(var97, false));
      Schema var98 = var0.addSchema(2100, Class3638::new);
      var0.addFixer(new Class7335(var98, "Added Thingy and Thingy Stinger", TypeReferences.ENTITY));
      var0.addFixer(new Class7335(var98, "Add beehive", TypeReferences.BLOCK_ENTITY));
      var0.addFixer(new Class8167(var98, false, "Rename sugar recipe", method14184("minecraft:sugar", "sugar_from_sugar_cane")));
      var0.addFixer(
         new Class8823(
            var98, false, "Rename sugar recipe advancement", method14184("minecraft:recipes/misc/sugar", "minecraft:recipes/misc/sugar_from_sugar_cane")
         )
      );
      Schema var99 = var0.addSchema(2202, field21709);
      var0.addFixer(new Class9201(var99, false));
      Schema var100 = var0.addSchema(2209, field21709);
      var0.addFixer(Class7325.method23221(var100, "Rename bee_hive item to beehive", method14184("minecraft:bee_hive", "minecraft:beehive")));
      var0.addFixer(new Class8142(var100));
      var0.addFixer(Class7765.method25738(var100, "Rename bee_hive block to beehive", method14184("minecraft:bee_hive", "minecraft:beehive")));
      Schema var101 = var0.addSchema(2211, field21709);
      var0.addFixer(new Class6177(var101, false));
      Schema var102 = var0.addSchema(2218, field21709);
      var0.addFixer(new Class7800(var102, false));
      Schema var103 = var0.addSchema(2501, Class3661::new);
      var0.addFixer(new Class9646(var103, true));
      Schema var104 = var0.addSchema(2502, Class3656::new);
      var0.addFixer(new Class7335(var104, "Added Hoglin", TypeReferences.ENTITY));
      Schema var105 = var0.addSchema(2503, field21709);
      var0.addFixer(new Class9612(var105, false));
      var0.addFixer(
         new Class8823(var105, false, "Composter category change", method14184("minecraft:recipes/misc/composter", "minecraft:recipes/decorations/composter"))
      );
      Schema var106 = var0.addSchema(2505, Class3657::new);
      var0.addFixer(new Class7335(var106, "Added Piglin", TypeReferences.ENTITY));
      var0.addFixer(new Class6720(var106, "minecraft:villager"));
      Schema var107 = var0.addSchema(2508, field21709);
      var0.addFixer(
         Class7325.method23221(
            var107,
            "Renamed fungi items to fungus",
            method14183(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      var0.addFixer(
         Class7765.method25738(
            var107,
            "Renamed fungi blocks to fungus",
            method14183(ImmutableMap.of("minecraft:warped_fungi", "minecraft:warped_fungus", "minecraft:crimson_fungi", "minecraft:crimson_fungus"))
         )
      );
      Schema var108 = var0.addSchema(2509, Class3665::new);
      var0.addFixer(new ZombifiedPiglinRename(var108));
      var0.addFixer(Class7325.method23221(var108, "Rename zombie pigman egg item", method14183(ZombifiedPiglinRename.field27829)));
      Schema var109 = var0.addSchema(2511, field21709);
      var0.addFixer(new Class7910(var109));
      Schema var110 = var0.addSchema(2514, field21709);
      var0.addFixer(new Class7118(var110));
      var0.addFixer(new Class7115(var110));
      var0.addFixer(new Class7119(var110));
      var0.addFixer(new Class7117(var110));
      var0.addFixer(new Class7113(var110));
      var0.addFixer(new Class7116(var110));
      Schema var111 = var0.addSchema(2516, field21709);
      var0.addFixer(new Class6721(var111, "minecraft:villager"));
      var0.addFixer(new Class6721(var111, "minecraft:zombie_villager"));
      Schema var112 = var0.addSchema(2518, field21709);
      var0.addFixer(new Class6729(var112, false));
      var0.addFixer(new Class8434(var112, false));
      Schema var113 = var0.addSchema(2519, Class3654::new);
      var0.addFixer(new Class7335(var113, "Added Strider", TypeReferences.ENTITY));
      Schema var114 = var0.addSchema(2522, Class3649::new);
      var0.addFixer(new Class7335(var114, "Added Zoglin", TypeReferences.ENTITY));
      Schema var115 = var0.addSchema(2523, field21709);
      var0.addFixer(new Class8725(var115));
      Schema var116 = var0.addSchema(2527, field21709);
      var0.addFixer(new Class7988(var116));
      Schema var117 = var0.addSchema(2528, field21709);
      var0.addFixer(
         Class7325.method23221(
            var117,
            "Rename soul fire torch and soul fire lantern",
            method14183(ImmutableMap.of("minecraft:soul_fire_torch", "minecraft:soul_torch", "minecraft:soul_fire_lantern", "minecraft:soul_lantern"))
         )
      );
      var0.addFixer(
         Class7765.method25738(
            var117,
            "Rename soul fire torch and soul fire lantern",
            method14183(
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
      Schema var118 = var0.addSchema(2529, field21709);
      var0.addFixer(new Class6738(var118, false));
      Schema var119 = var0.addSchema(2531, field21709);
      var0.addFixer(new Class9769(var119));
      Schema var120 = var0.addSchema(2533, field21709);
      var0.addFixer(new Class6736(var120));
      Schema var121 = var0.addSchema(2535, field21709);
      var0.addFixer(new Class6733(var121));
      Schema var122 = var0.addSchema(2550, field21709);
      var0.addFixer(new Class9605(var122));
      Schema var123 = var0.addSchema(2551, Class3673::new);
      var0.addFixer(new Class9314(var123, "add types to WorldGenData", TypeReferences.WORLD_GEN_SETTINGS));
      Schema var124 = var0.addSchema(2552, field21709);
      var0.addFixer(new Class7641(var124, false, "Nether biome rename", ImmutableMap.of("minecraft:nether", "minecraft:nether_wastes")));
      Schema var125 = var0.addSchema(2553, field21709);
      var0.addFixer(new Class7640(var125, false));
      Schema var126 = var0.addSchema(2558, field21709);
      var0.addFixer(new Class7953(var126, false));
      var0.addFixer(new Class7359(var126, false, "Rename swapHands setting", "key_key.swapHands", "key_key.swapOffhand"));
      Schema var127 = var0.addSchema(2568, Class3666::new);
      var0.addFixer(new Class7335(var127, "Added Piglin Brute", TypeReferences.ENTITY));
   }

   private static UnaryOperator<String> method14183(Map<String, String> var0) {
      return var1 -> var0.getOrDefault(var1, var1);
   }

   private static UnaryOperator<String> method14184(String var0, String var1) {
      return var2 -> !Objects.equals(var2, var0) ? var2 : var1;
   }
}
