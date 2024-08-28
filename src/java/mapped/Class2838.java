package mapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Class2838 implements Consumer<BiConsumer<ResourceLocation, Class5888>> {
   private static final Class7519 field17628 = Class159.method480(
      Class9735.method38146().method38150(new Class8605(Class8122.field34916, Class8840.method32014(1)))
   );
   private static final Class7519 field17629 = field17628.method24518();
   private static final Class7519 field17630 = Class159.method480(Class9735.method38146().method38147(Class8514.field37956));
   private static final Class7519 field17631 = field17630.method24516(field17628);
   private static final Class7519 field17632 = field17631.method24518();
   private static final Set<Class3257> field17633 = Stream.<Block>of(
         Blocks.field36652,
         Blocks.BEACON,
         Blocks.field37007,
         Blocks.field36701,
         Blocks.field36703,
         Blocks.field36707,
         Blocks.field36705,
         Blocks.field36709,
         Blocks.field36711,
         Blocks.field36896,
         Blocks.field36912,
         Blocks.field36908,
         Blocks.field36909,
         Blocks.field36906,
         Blocks.field36904,
         Blocks.field36910,
         Blocks.field36900,
         Blocks.field36905,
         Blocks.field36902,
         Blocks.field36899,
         Blocks.field36898,
         Blocks.field36903,
         Blocks.field36907,
         Blocks.field36911,
         Blocks.field36897,
         Blocks.field36901
      )
      .<Class3257>map(Class3303::method11581)
      .collect(ImmutableSet.toImmutableSet());
   private static final float[] field17634 = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] field17635 = new float[]{0.025F, 0.027777778F, 0.03125F, 0.041666668F, 0.1F};
   private final Map<ResourceLocation, Class5888> field17636 = Maps.newHashMap();

   private static <T> T method11059(Class3303 var0, Class5871<T> var1) {
      return (T)(field17633.contains(var0.method11581()) ? var1.method18295() : var1.method18296(Class144.method442()));
   }

   private static <T> T method11060(Class3303 var0, Class5875<T> var1) {
      return (T)(field17633.contains(var0.method11581()) ? var1.method18295() : var1.method18297(Class162.method489()));
   }

   private static Class5888 method11061(Class3303 var0) {
      return Class7318.method23188()
         .method18320(method11060(var0, Class8894.method32373().method18289(Class6871.method20919(1)).method18291(Class4695.method14724(var0))));
   }

   private static Class5888 method11062(Block var0, Class7519 var1, Class5873<?> var2) {
      return Class7318.method23188()
         .method18320(
            Class8894.method32373().method18289(Class6871.method20919(1)).method18291(Class4695.method14724(var0).method18297(var1).method18303(var2))
         );
   }

   private static Class5888 method11063(Block var0, Class5873<?> var1) {
      return method11062(var0, field17628, var1);
   }

   private static Class5888 method11064(Block var0, Class5873<?> var1) {
      return method11062(var0, field17630, var1);
   }

   private static Class5888 method11065(Block var0, Class5873<?> var1) {
      return method11062(var0, field17631, var1);
   }

   private static Class5888 method11066(Block var0, Class3303 var1) {
      return method11063(var0, (Class5873<?>)method11060(var0, Class4695.method14724(var1)));
   }

   private static Class5888 method11067(Class3303 var0, Class6870 var1) {
      return Class7318.method23188()
         .method18320(
            Class8894.method32373()
               .method18289(Class6871.method20919(1))
               .method18291((Class5873<?>)method11059(var0, Class4695.method14724(var0).method18296(Class140.method420(var1))))
         );
   }

   private static Class5888 method11068(Block var0, Class3303 var1, Class6870 var2) {
      return method11063(var0, (Class5873<?>)method11059(var0, Class4695.method14724(var1).method18296(Class140.method420(var2))));
   }

   private static Class5888 method11069(Class3303 var0) {
      return Class7318.method23188()
         .method18320(Class8894.method32373().method18297(field17628).method18289(Class6871.method20919(1)).method18291(Class4695.method14724(var0)));
   }

   private static Class5888 method11070(Class3303 var0) {
      return Class7318.method23188()
         .method18320(
            method11060(
               Blocks.FLOWER_POT, Class8894.method32373().method18289(Class6871.method20919(1)).method18291(Class4695.method14724(Blocks.FLOWER_POT))
            )
         )
         .method18320(method11060(var0, Class8894.method32373().method18289(Class6871.method20919(1)).method18291(Class4695.method14724(var0))));
   }

   private static Class5888 method11071(Block var0) {
      return Class7318.method23188()
         .method18320(
            Class8894.method32373()
               .method18289(Class6871.method20919(1))
               .method18291(
                  (Class5873<?>)method11059(
                     var0,
                     Class4695.method14724(var0)
                        .method18296(
                           Class140.method420(Class6871.method20919(2))
                              .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34329(Class3208.field18605, Class86.field220)))
                        )
                  )
               )
         );
   }

   private static <T extends Comparable<T> & Class83> Class5888 method11072(Block var0, Class8550<T> var1, T var2) {
      return Class7318.method23188()
         .method18320(
            method11060(
               var0,
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(var0).method18297(Class161.method486(var0).method24519(Class9178.method34325().method34329(var1, (T)var2)))
                  )
            )
         );
   }

   private static Class5888 method11073(Block var0) {
      return Class7318.method23188()
         .method18320(
            method11060(
               var0,
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(var0).method18296(Class139.method417(Class2138.field13999)))
            )
         );
   }

   private static Class5888 method11074(Block var0) {
      return Class7318.method23188()
         .method18320(
            method11060(
               var0,
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(var0)
                        .method18296(Class139.method417(Class2138.field13999))
                        .method18296(
                           Class142.method431(Class2343.field16021)
                              .method18308("Lock", "BlockEntityTag.Lock")
                              .method18308("LootTable", "BlockEntityTag.LootTable")
                              .method18308("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .method18296(Class146.method446().method18319(Class4696.method14727(Class3368.field18940)))
                  )
            )
         );
   }

   private static Class5888 method11075(Block var0) {
      return Class7318.method23188()
         .method18320(
            method11060(
               var0,
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(var0)
                        .method18296(Class139.method417(Class2138.field13999))
                        .method18296(Class142.method431(Class2343.field16021).method18308("Patterns", "BlockEntityTag.Patterns"))
                  )
            )
         );
   }

   private static Class5888 method11076(Block var0) {
      return Class7318.method23188()
         .method18320(
            Class8894.method32373()
               .method18297(field17628)
               .method18289(Class6871.method20919(1))
               .method18291(
                  Class4695.method14724(var0)
                     .method18296(Class142.method431(Class2343.field16021).method18308("Bees", "BlockEntityTag.Bees"))
                     .method18296(Class129.method373(var0).method18312(Class3366.field18936))
               )
         );
   }

   private static Class5888 method11077(Block var0) {
      return Class7318.method23188()
         .method18320(
            Class8894.method32373()
               .method18289(Class6871.method20919(1))
               .method18291(
                  Class4695.method14724(var0)
                     .method18297(field17628)
                     .method18296(Class142.method431(Class2343.field16021).method18308("Bees", "BlockEntityTag.Bees"))
                     .method18296(Class129.method373(var0).method18312(Class3366.field18936))
                     .method18303(Class4695.method14724(var0))
               )
         );
   }

   private static Class5888 method11078(Block var0, Class3257 var1) {
      return method11063(var0, (Class5873<?>)method11059(var0, Class4695.method14724(var1).method18296(Class138.method407(Class8122.field34918))));
   }

   private static Class5888 method11079(Block var0, Class3303 var1) {
      return method11063(
         var0,
         (Class5873<?>)method11059(
            var0,
            Class4695.method14724(var1)
               .method18296(Class140.method420(Class6872.method20921(-6.0F, 2.0F)))
               .method18296(Class135.method396(Class12.method59(0)))
         )
      );
   }

   private static Class5888 method11080(Block var0) {
      return method11064(
         var0,
         (Class5873<?>)method11059(
            var0, Class4695.method14724(Class8514.field37841).method18297(Class151.method456(0.125F)).method18296(Class138.method409(Class8122.field34918, 2))
         )
      );
   }

   private static Class5888 method11081(Block var0, Class3257 var1) {
      return Class7318.method23188()
         .method18320(
            method11059(
               var0,
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(var1)
                        .method18296(
                           Class140.method420(Class6869.method20915(3, 0.06666667F))
                              .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3486.field19347, 0)))
                        )
                        .method18296(
                           Class140.method420(Class6869.method20915(3, 0.13333334F))
                              .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3486.field19347, 1)))
                        )
                        .method18296(
                           Class140.method420(Class6869.method20915(3, 0.2F))
                              .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3486.field19347, 2)))
                        )
                        .method18296(
                           Class140.method420(Class6869.method20915(3, 0.26666668F))
                              .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3486.field19347, 3)))
                        )
                        .method18296(
                           Class140.method420(Class6869.method20915(3, 0.33333334F))
                              .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3486.field19347, 4)))
                        )
                        .method18296(
                           Class140.method420(Class6869.method20915(3, 0.4F))
                              .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3486.field19347, 5)))
                        )
                        .method18296(
                           Class140.method420(Class6869.method20915(3, 0.46666667F))
                              .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3486.field19347, 6)))
                        )
                        .method18296(
                           Class140.method420(Class6869.method20915(3, 0.53333336F))
                              .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3486.field19347, 7)))
                        )
                  )
            )
         );
   }

   private static Class5888 method11082(Block var0, Class3257 var1) {
      return Class7318.method23188()
         .method18320(
            method11059(
               var0,
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(var1).method18296(Class140.method420(Class6869.method20915(3, 0.53333336F))))
            )
         );
   }

   private static Class5888 method11083(Class3303 var0) {
      return Class7318.method23188()
         .method18320(Class8894.method32373().method18289(Class6871.method20919(1)).method18297(field17630).method18291(Class4695.method14724(var0)));
   }

   private static Class5888 method11084(Block var0, Block var1, float... var2) {
      return method11065(var0, ((Class5872)method11060(var0, Class4695.method14724(var1))).method18297(Class158.method476(Class8122.field34918, var2)))
         .method18320(
            Class8894.method32373()
               .method18289(Class6871.method20919(1))
               .method18297(field17632)
               .method18291(
                  ((Class5872)method11059(var0, Class4695.method14724(Class8514.field37835).method18296(Class140.method420(Class6872.method20921(1.0F, 2.0F)))))
                     .method18297(Class158.method476(Class8122.field34918, 0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F))
               )
         );
   }

   private static Class5888 method11085(Block var0, Block var1, float... var2) {
      return method11084(var0, var1, var2)
         .method18320(
            Class8894.method32373()
               .method18289(Class6871.method20919(1))
               .method18297(field17632)
               .method18291(
                  ((Class5872)method11060(var0, Class4695.method14724(Class8514.field37795)))
                     .method18297(Class158.method476(Class8122.field34918, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))
               )
         );
   }

   private static Class5888 method11086(Block var0, Class3257 var1, Class3257 var2, Class7519 var3) {
      return method11059(
         var0,
         Class7318.method23188()
            .method18320(Class8894.method32373().method18291(Class4695.method14724(var1).method18297(var3).method18303(Class4695.method14724(var2))))
            .method18320(
               Class8894.method32373()
                  .method18297(var3)
                  .method18291(Class4695.method14724(var2).method18296(Class138.method406(Class8122.field34918, 0.5714286F, 3)))
            )
      );
   }

   private static Class5888 method11087(Block var0) {
      return Class7318.method23188()
         .method18320(
            Class8894.method32373().method18297(field17630).method18291(Class4695.method14724(var0).method18296(Class140.method420(Class6871.method20919(2))))
         );
   }

   private static Class5888 method11088(Block var0, Block var1) {
      Class5874 var4 = Class4695.method14724(var1)
         .method18296(Class140.method420(Class6871.method20919(2)))
         .method18297(field17630)
         .method18303(((Class5872)method11060(var0, Class4695.method14724(Class8514.field37841))).method18297(Class151.method456(0.125F)));
      return Class7318.method23188()
         .method18320(
            Class8894.method32373()
               .method18291(var4)
               .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34329(Class3456.field19276, Class84.field210)))
               .method18297(
                  Class155.method468(
                     Class8912.method32576()
                        .method32578(
                           Class8831.method31929()
                              .method31930(var0)
                              .method31932(Class9178.method34325().method34329(Class3456.field19276, Class84.field209).method34330())
                              .method31933()
                        ),
                     new BlockPos(0, 1, 0)
                  )
               )
         )
         .method18320(
            Class8894.method32373()
               .method18291(var4)
               .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34329(Class3456.field19276, Class84.field209)))
               .method18297(
                  Class155.method468(
                     Class8912.method32576()
                        .method32578(
                           Class8831.method31929()
                              .method31930(var0)
                              .method31932(Class9178.method34325().method34329(Class3456.field19276, Class84.field210).method34330())
                              .method31933()
                        ),
                     new BlockPos(0, -1, 0)
                  )
               )
         );
   }

   public static Class5888 method11089() {
      return Class7318.method23188();
   }

   public void accept(BiConsumer<ResourceLocation, Class5888> var1) {
      this.method11096(Blocks.GRANITE);
      this.method11096(Blocks.POLISHED_GRANITE);
      this.method11096(Blocks.DIORITE);
      this.method11096(Blocks.POLISHED_DIORITE);
      this.method11096(Blocks.ANDESITE);
      this.method11096(Blocks.POLISHED_ANDESITE);
      this.method11096(Blocks.field36396);
      this.method11096(Blocks.field36397);
      this.method11096(Blocks.field36399);
      this.method11096(Blocks.field36400);
      this.method11096(Blocks.field36401);
      this.method11096(Blocks.field36402);
      this.method11096(Blocks.field36403);
      this.method11096(Blocks.field36404);
      this.method11096(Blocks.field36405);
      this.method11096(Blocks.field36406);
      this.method11096(Blocks.SPRUCE_SAPLING);
      this.method11096(Blocks.BIRCH_SAPLING);
      this.method11096(Blocks.JUNGLE_SAPLING);
      this.method11096(Blocks.ACACIA_SAPLING);
      this.method11096(Blocks.DARK_OAK_SAPLING);
      this.method11096(Blocks.SAND);
      this.method11096(Blocks.RED_SAND);
      this.method11096(Blocks.field36418);
      this.method11096(Blocks.field36419);
      this.method11096(Blocks.field36422);
      this.method11096(Blocks.field36423);
      this.method11096(Blocks.field36424);
      this.method11096(Blocks.field36425);
      this.method11096(Blocks.field36426);
      this.method11096(Blocks.field36427);
      this.method11096(Blocks.field36428);
      this.method11096(Blocks.field36429);
      this.method11096(Blocks.field36430);
      this.method11096(Blocks.field36431);
      this.method11096(Blocks.field36432);
      this.method11096(Blocks.field36433);
      this.method11096(Blocks.field37071);
      this.method11096(Blocks.field37080);
      this.method11096(Blocks.field36434);
      this.method11096(Blocks.field36435);
      this.method11096(Blocks.field36436);
      this.method11096(Blocks.field36437);
      this.method11096(Blocks.field36438);
      this.method11096(Blocks.field36439);
      this.method11096(Blocks.field36440);
      this.method11096(Blocks.field36441);
      this.method11096(Blocks.field36442);
      this.method11096(Blocks.field36443);
      this.method11096(Blocks.field36444);
      this.method11096(Blocks.field36445);
      this.method11096(Blocks.field37082);
      this.method11096(Blocks.field37073);
      this.method11096(Blocks.field36452);
      this.method11096(Blocks.field36453);
      this.method11096(Blocks.field36456);
      this.method11096(Blocks.SANDSTONE);
      this.method11096(Blocks.CHISELED_SANDSTONE);
      this.method11096(Blocks.CUT_SANDSTONE);
      this.method11096(Blocks.NOTE_BLOCK);
      this.method11096(Blocks.POWERED_RAIL);
      this.method11096(Blocks.DETECTOR_RAIL);
      this.method11096(Blocks.STICKY_PISTON);
      this.method11096(Blocks.PISTON);
      this.method11096(Blocks.WHITE_WOOL);
      this.method11096(Blocks.ORANGE_WOOL);
      this.method11096(Blocks.MAGENTA_WOOL);
      this.method11096(Blocks.LIGHT_BLUE_WOOL);
      this.method11096(Blocks.YELLOW_WOOL);
      this.method11096(Blocks.LIME_WOOL);
      this.method11096(Blocks.PINK_WOOL);
      this.method11096(Blocks.GRAY_WOOL);
      this.method11096(Blocks.LIGHT_GRAY_WOOL);
      this.method11096(Blocks.CYAN_WOOL);
      this.method11096(Blocks.PURPLE_WOOL);
      this.method11096(Blocks.BLUE_WOOL);
      this.method11096(Blocks.BROWN_WOOL);
      this.method11096(Blocks.GREEN_WOOL);
      this.method11096(Blocks.RED_WOOL);
      this.method11096(Blocks.BLACK_WOOL);
      this.method11096(Blocks.DANDELION);
      this.method11096(Blocks.POPPY);
      this.method11096(Blocks.BLUE_ORCHID);
      this.method11096(Blocks.ALLIUM);
      this.method11096(Blocks.AZURE_BLUET);
      this.method11096(Blocks.RED_TULIP);
      this.method11096(Blocks.ORANGE_TULIP);
      this.method11096(Blocks.WHITE_TULIP);
      this.method11096(Blocks.PINK_TULIP);
      this.method11096(Blocks.OXEYE_DAISY);
      this.method11096(Blocks.CORNFLOWER);
      this.method11096(Blocks.WITHER_ROSE);
      this.method11096(Blocks.LILY_OF_THE_VALLEY);
      this.method11096(Blocks.BROWN_MUSHROOM);
      this.method11096(Blocks.RED_MUSHROOM);
      this.method11096(Blocks.field36521);
      this.method11096(Blocks.field36522);
      this.method11096(Blocks.field36523);
      this.method11096(Blocks.field36526);
      this.method11096(Blocks.field36527);
      this.method11096(Blocks.field37123);
      this.method11096(Blocks.TORCH);
      this.method11096(Blocks.field36533);
      this.method11096(Blocks.REDSTONE_WIRE);
      this.method11096(Blocks.field36537);
      this.method11096(Blocks.CRAFTING_TABLE);
      this.method11096(Blocks.OAK_SIGN);
      this.method11096(Blocks.SPRUCE_SIGN);
      this.method11096(Blocks.BIRCH_SIGN);
      this.method11096(Blocks.ACACIA_SIGN);
      this.method11096(Blocks.JUNGLE_SIGN);
      this.method11096(Blocks.DARK_OAK_SIGN);
      this.method11096(Blocks.LADDER);
      this.method11096(Blocks.RAIL);
      this.method11096(Blocks.COBBLESTONE_STAIRS);
      this.method11096(Blocks.LEVER);
      this.method11096(Blocks.field36559);
      this.method11096(Blocks.field36561);
      this.method11096(Blocks.field36562);
      this.method11096(Blocks.field36563);
      this.method11096(Blocks.field36564);
      this.method11096(Blocks.field36565);
      this.method11096(Blocks.field36566);
      this.method11096(Blocks.field36568);
      this.method11096(Blocks.STONE_BUTTON);
      this.method11096(Blocks.CACTUS);
      this.method11096(Blocks.SUGAR_CANE);
      this.method11096(Blocks.JUKEBOX);
      this.method11096(Blocks.OAK_FENCE);
      this.method11096(Blocks.PUMPKIN);
      this.method11096(Blocks.NETHERRACK);
      this.method11096(Blocks.SOUL_SAND);
      this.method11096(Blocks.SOUL_SOIL);
      this.method11096(Blocks.BASALT);
      this.method11096(Blocks.POLISHED_BASALT);
      this.method11096(Blocks.field36585);
      this.method11096(Blocks.field36589);
      this.method11096(Blocks.field36590);
      this.method11096(Blocks.field36592);
      this.method11096(Blocks.field36609);
      this.method11096(Blocks.field36610);
      this.method11096(Blocks.field36611);
      this.method11096(Blocks.field36612);
      this.method11096(Blocks.ACACIA_TRAPDOOR);
      this.method11096(Blocks.field36614);
      this.method11096(Blocks.field36615);
      this.method11096(Blocks.field36616);
      this.method11096(Blocks.field36617);
      this.method11096(Blocks.field36618);
      this.method11096(Blocks.IRON_BARS);
      this.method11096(Blocks.OAK_FENCE_GATE);
      this.method11096(Blocks.BRICK_STAIRS);
      this.method11096(Blocks.STONE_BRICK_STAIRS);
      this.method11096(Blocks.LILY_PAD);
      this.method11096(Blocks.NETHER_BRICKS);
      this.method11096(Blocks.NETHER_BRICK_FENCE);
      this.method11096(Blocks.NETHER_BRICK_STAIRS);
      this.method11096(Blocks.field36648);
      this.method11096(Blocks.field36651);
      this.method11096(Blocks.field36653);
      this.method11096(Blocks.SANDSTONE_STAIRS);
      this.method11096(Blocks.TRIPWIRE_HOOK);
      this.method11096(Blocks.EMERALD_BLOCK);
      this.method11096(Blocks.SPRUCE_STAIRS);
      this.method11096(Blocks.field36662);
      this.method11096(Blocks.field36663);
      this.method11096(Blocks.COBBLESTONE_WALL);
      this.method11096(Blocks.MOSSY_COBBLESTONE_WALL);
      this.method11096(Blocks.FLOWER_POT);
      this.method11096(Blocks.field36695);
      this.method11096(Blocks.field36696);
      this.method11096(Blocks.field36697);
      this.method11096(Blocks.field36698);
      this.method11096(Blocks.field36699);
      this.method11096(Blocks.field36700);
      this.method11096(Blocks.field36701);
      this.method11096(Blocks.field36703);
      this.method11096(Blocks.field36705);
      this.method11096(Blocks.field36709);
      this.method11096(Blocks.field36711);
      this.method11096(Blocks.ANVIL);
      this.method11096(Blocks.field36714);
      this.method11096(Blocks.field36715);
      this.method11096(Blocks.field36717);
      this.method11096(Blocks.field36718);
      this.method11096(Blocks.field36719);
      this.method11096(Blocks.field36720);
      this.method11096(Blocks.field36721);
      this.method11096(Blocks.field36724);
      this.method11096(Blocks.field36725);
      this.method11096(Blocks.field36726);
      this.method11096(Blocks.field36727);
      this.method11096(Blocks.field36728);
      this.method11096(Blocks.field36730);
      this.method11096(Blocks.field36731);
      this.method11096(Blocks.field36732);
      this.method11096(Blocks.field36733);
      this.method11096(Blocks.field36734);
      this.method11096(Blocks.field36735);
      this.method11096(Blocks.field36736);
      this.method11096(Blocks.field36737);
      this.method11096(Blocks.field36738);
      this.method11096(Blocks.field36739);
      this.method11096(Blocks.field36740);
      this.method11096(Blocks.field36741);
      this.method11096(Blocks.field36742);
      this.method11096(Blocks.field36743);
      this.method11096(Blocks.field36744);
      this.method11096(Blocks.field36745);
      this.method11096(Blocks.field36762);
      this.method11096(Blocks.field36763);
      this.method11096(Blocks.field36764);
      this.method11096(Blocks.field36766);
      this.method11096(Blocks.field36767);
      this.method11096(Blocks.field36768);
      this.method11096(Blocks.field36769);
      this.method11096(Blocks.field36770);
      this.method11096(Blocks.field36771);
      this.method11096(Blocks.field36772);
      this.method11096(Blocks.field36777);
      this.method11096(Blocks.WHITE_CARPET);
      this.method11096(Blocks.ORANGE_CARPET);
      this.method11096(Blocks.MAGENTA_CARPET);
      this.method11096(Blocks.LIGHT_BLUE_CARPET);
      this.method11096(Blocks.YELLOW_CARPET);
      this.method11096(Blocks.LIME_CARPET);
      this.method11096(Blocks.PINK_CARPET);
      this.method11096(Blocks.GRAY_CARPET);
      this.method11096(Blocks.LIGHT_GRAY_CARPET);
      this.method11096(Blocks.CYAN_CARPET);
      this.method11096(Blocks.PURPLE_CARPET);
      this.method11096(Blocks.BLUE_CARPET);
      this.method11096(Blocks.BROWN_CARPET);
      this.method11096(Blocks.GREEN_CARPET);
      this.method11096(Blocks.RED_CARPET);
      this.method11096(Blocks.BLACK_CARPET);
      this.method11096(Blocks.field36794);
      this.method11096(Blocks.field36795);
      this.method11096(Blocks.field36835);
      this.method11096(Blocks.field36836);
      this.method11096(Blocks.field36837);
      this.method11096(Blocks.field36838);
      this.method11096(Blocks.field36858);
      this.method11096(Blocks.field36859);
      this.method11096(Blocks.field36860);
      this.method11096(Blocks.field36861);
      this.method11096(Blocks.field36862);
      this.method11096(Blocks.field36863);
      this.method11096(Blocks.field36864);
      this.method11096(Blocks.field36865);
      this.method11096(Blocks.field36866);
      this.method11096(Blocks.field36867);
      this.method11096(Blocks.field36868);
      this.method11096(Blocks.field36869);
      this.method11096(Blocks.field36870);
      this.method11096(Blocks.field36871);
      this.method11096(Blocks.field36877);
      this.method11096(Blocks.field36880);
      this.method11096(Blocks.field36881);
      this.method11096(Blocks.field36882);
      this.method11096(Blocks.field36883);
      this.method11096(Blocks.field36890);
      this.method11096(Blocks.field36891);
      this.method11096(Blocks.field36892);
      this.method11096(Blocks.field36893);
      this.method11096(Blocks.field36895);
      this.method11096(Blocks.field37116);
      this.method11096(Blocks.field36913);
      this.method11096(Blocks.field36914);
      this.method11096(Blocks.field36915);
      this.method11096(Blocks.field36916);
      this.method11096(Blocks.field36917);
      this.method11096(Blocks.field36918);
      this.method11096(Blocks.field36919);
      this.method11096(Blocks.field36920);
      this.method11096(Blocks.field36921);
      this.method11096(Blocks.field36922);
      this.method11096(Blocks.field36923);
      this.method11096(Blocks.field36924);
      this.method11096(Blocks.field36925);
      this.method11096(Blocks.field36926);
      this.method11096(Blocks.field36927);
      this.method11096(Blocks.field36928);
      this.method11096(Blocks.field36929);
      this.method11096(Blocks.field36930);
      this.method11096(Blocks.field36931);
      this.method11096(Blocks.field36932);
      this.method11096(Blocks.field36933);
      this.method11096(Blocks.field36934);
      this.method11096(Blocks.field36935);
      this.method11096(Blocks.field36936);
      this.method11096(Blocks.field36937);
      this.method11096(Blocks.field36938);
      this.method11096(Blocks.field36939);
      this.method11096(Blocks.field36940);
      this.method11096(Blocks.field36941);
      this.method11096(Blocks.field36942);
      this.method11096(Blocks.field36943);
      this.method11096(Blocks.field36944);
      this.method11096(Blocks.field36945);
      this.method11096(Blocks.field36946);
      this.method11096(Blocks.field36947);
      this.method11096(Blocks.field36948);
      this.method11096(Blocks.field36949);
      this.method11096(Blocks.field36950);
      this.method11096(Blocks.field36951);
      this.method11096(Blocks.field36952);
      this.method11096(Blocks.field36953);
      this.method11096(Blocks.field36954);
      this.method11096(Blocks.field36955);
      this.method11096(Blocks.field36956);
      this.method11096(Blocks.field36957);
      this.method11096(Blocks.field36958);
      this.method11096(Blocks.field36959);
      this.method11096(Blocks.field36960);
      this.method11096(Blocks.field36961);
      this.method11096(Blocks.field36963);
      this.method11096(Blocks.field36965);
      this.method11096(Blocks.field36966);
      this.method11096(Blocks.field36967);
      this.method11096(Blocks.field36968);
      this.method11096(Blocks.field36969);
      this.method11096(Blocks.field37007);
      this.method11096(Blocks.field36652);
      this.method11096(Blocks.field37009);
      this.method11096(Blocks.field37014);
      this.method11096(Blocks.field37015);
      this.method11096(Blocks.field37016);
      this.method11096(Blocks.field37017);
      this.method11096(Blocks.field37018);
      this.method11096(Blocks.field37019);
      this.method11096(Blocks.field37020);
      this.method11096(Blocks.field37021);
      this.method11096(Blocks.field37022);
      this.method11096(Blocks.field37023);
      this.method11096(Blocks.field37024);
      this.method11096(Blocks.field37025);
      this.method11096(Blocks.field37026);
      this.method11096(Blocks.field37027);
      this.method11096(Blocks.field37041);
      this.method11096(Blocks.field37042);
      this.method11096(Blocks.field37043);
      this.method11096(Blocks.field37044);
      this.method11096(Blocks.field37045);
      this.method11096(Blocks.field37046);
      this.method11096(Blocks.field37047);
      this.method11096(Blocks.field37048);
      this.method11096(Blocks.field37049);
      this.method11096(Blocks.field37050);
      this.method11096(Blocks.field37051);
      this.method11096(Blocks.field37052);
      this.method11096(Blocks.field37054);
      this.method11096(Blocks.field37053);
      this.method11096(Blocks.field37119);
      this.method11096(Blocks.field37120);
      this.method11096(Blocks.field37124);
      this.method11096(Blocks.field37129);
      this.method11096(Blocks.field37070);
      this.method11096(Blocks.field37072);
      this.method11096(Blocks.field37075);
      this.method11096(Blocks.field37076);
      this.method11096(Blocks.field37079);
      this.method11096(Blocks.field37081);
      this.method11096(Blocks.field37084);
      this.method11096(Blocks.field37085);
      this.method11096(Blocks.field37091);
      this.method11096(Blocks.field37092);
      this.method11096(Blocks.field37096);
      this.method11096(Blocks.field37098);
      this.method11096(Blocks.field37100);
      this.method11096(Blocks.field37102);
      this.method11096(Blocks.field37104);
      this.method11096(Blocks.field37106);
      this.method11096(Blocks.field37110);
      this.method11096(Blocks.field37095);
      this.method11096(Blocks.field37097);
      this.method11096(Blocks.field37099);
      this.method11096(Blocks.field37101);
      this.method11096(Blocks.field37103);
      this.method11096(Blocks.field37105);
      this.method11096(Blocks.field37109);
      this.method11096(Blocks.field37121);
      this.method11096(Blocks.field37122);
      this.method11096(Blocks.field37130);
      this.method11096(Blocks.field37135);
      this.method11096(Blocks.field37139);
      this.method11096(Blocks.field37131);
      this.method11096(Blocks.field37132);
      this.method11096(Blocks.field37140);
      this.method11096(Blocks.field37137);
      this.method11096(Blocks.field37136);
      this.method11096(Blocks.field37134);
      this.method11096(Blocks.field37142);
      this.method11096(Blocks.field37144);
      this.method11096(Blocks.field37145);
      this.method11096(Blocks.field37146);
      this.method11096(Blocks.field37147);
      this.method11096(Blocks.field37148);
      this.method11096(Blocks.field37149);
      this.method11096(Blocks.CHAIN);
      this.method11096(Blocks.field37077);
      this.method11096(Blocks.field37090);
      this.method11094(Blocks.FARMLAND, Blocks.field36396);
      this.method11094(Blocks.TRIPWIRE, Class8514.field37838);
      this.method11094(Blocks.field36885, Blocks.field36396);
      this.method11094(Blocks.field36962, Blocks.field36961);
      this.method11094(Blocks.field37008, Blocks.field37009);
      this.method11097(Blocks.STONE, var0 -> method11066(var0, Blocks.field36399));
      this.method11097(Blocks.field36395, var0 -> method11066(var0, Blocks.field36396));
      this.method11097(Blocks.field36398, var0 -> method11066(var0, Blocks.field36396));
      this.method11097(Blocks.MYCELIUM, var0 -> method11066(var0, Blocks.field36396));
      this.method11097(Blocks.field36970, var0 -> method11066(var0, Blocks.field36965));
      this.method11097(Blocks.field36971, var0 -> method11066(var0, Blocks.field36966));
      this.method11097(Blocks.field36972, var0 -> method11066(var0, Blocks.field36967));
      this.method11097(Blocks.field36973, var0 -> method11066(var0, Blocks.field36968));
      this.method11097(Blocks.field36974, var0 -> method11066(var0, Blocks.field36969));
      this.method11097(Blocks.field37083, var0 -> method11066(var0, Blocks.NETHERRACK));
      this.method11097(Blocks.field37074, var0 -> method11066(var0, Blocks.NETHERRACK));
      this.method11097(Blocks.field36525, var0 -> method11068(var0, Class8514.field37900, Class6871.method20919(3)));
      this.method11097(Blocks.CLAY, var0 -> method11068(var0, Class8514.field37897, Class6871.method20919(4)));
      this.method11097(Blocks.ENDER_CHEST, var0 -> method11068(var0, Blocks.field36527, Class6871.method20919(8)));
      this.method11097(Blocks.SNOW_BLOCK, var0 -> method11068(var0, Class8514.field37888, Class6871.method20919(4)));
      this.method11098(Blocks.field36878, method11067(Class8514.field38109, Class6872.method20921(0.0F, 1.0F)));
      this.method11092(Blocks.POTTED_OAK_SAPLING);
      this.method11092(Blocks.POTTED_SPRUCE_SAPLING);
      this.method11092(Blocks.POTTED_BIRCH_SAPLING);
      this.method11092(Blocks.POTTED_JUNGLE_SAPLING);
      this.method11092(Blocks.field36673);
      this.method11092(Blocks.POTTED_DARK_OAK_SAPLING);
      this.method11092(Blocks.field36675);
      this.method11092(Blocks.field36676);
      this.method11092(Blocks.field36677);
      this.method11092(Blocks.field36678);
      this.method11092(Blocks.field36679);
      this.method11092(Blocks.field36680);
      this.method11092(Blocks.field36681);
      this.method11092(Blocks.field36682);
      this.method11092(Blocks.field36683);
      this.method11092(Blocks.field36684);
      this.method11092(Blocks.field36685);
      this.method11092(Blocks.field36686);
      this.method11092(Blocks.field36687);
      this.method11092(Blocks.field36688);
      this.method11092(Blocks.field36689);
      this.method11092(Blocks.field36690);
      this.method11092(Blocks.field36691);
      this.method11092(Blocks.field36692);
      this.method11092(Blocks.field37010);
      this.method11092(Blocks.field37125);
      this.method11092(Blocks.field37126);
      this.method11092(Blocks.field37127);
      this.method11092(Blocks.field37128);
      this.method11097(Blocks.field36843, Class2838::method11071);
      this.method11097(Blocks.field36841, Class2838::method11071);
      this.method11097(Blocks.field36851, Class2838::method11071);
      this.method11097(Blocks.field36850, Class2838::method11071);
      this.method11097(Blocks.field36844, Class2838::method11071);
      this.method11097(Blocks.field36775, Class2838::method11071);
      this.method11097(Blocks.field36842, Class2838::method11071);
      this.method11097(Blocks.field36853, Class2838::method11071);
      this.method11097(Blocks.field36839, Class2838::method11071);
      this.method11097(Blocks.field36849, Class2838::method11071);
      this.method11097(Blocks.field36774, Class2838::method11071);
      this.method11097(Blocks.field36773, Class2838::method11071);
      this.method11097(Blocks.field36857, Class2838::method11071);
      this.method11097(Blocks.field36854, Class2838::method11071);
      this.method11097(Blocks.field36855, Class2838::method11071);
      this.method11097(Blocks.field36847, Class2838::method11071);
      this.method11097(Blocks.field36856, Class2838::method11071);
      this.method11097(Blocks.field36848, Class2838::method11071);
      this.method11097(Blocks.field36840, Class2838::method11071);
      this.method11097(Blocks.field36852, Class2838::method11071);
      this.method11097(Blocks.field36845, Class2838::method11071);
      this.method11097(Blocks.field36846, Class2838::method11071);
      this.method11097(Blocks.field37028, Class2838::method11071);
      this.method11097(Blocks.field37029, Class2838::method11071);
      this.method11097(Blocks.field37030, Class2838::method11071);
      this.method11097(Blocks.field37031, Class2838::method11071);
      this.method11097(Blocks.field37032, Class2838::method11071);
      this.method11097(Blocks.field37033, Class2838::method11071);
      this.method11097(Blocks.field37034, Class2838::method11071);
      this.method11097(Blocks.field37035, Class2838::method11071);
      this.method11097(Blocks.field37036, Class2838::method11071);
      this.method11097(Blocks.field37037, Class2838::method11071);
      this.method11097(Blocks.field37038, Class2838::method11071);
      this.method11097(Blocks.field37039, Class2838::method11071);
      this.method11097(Blocks.field37040, Class2838::method11071);
      this.method11097(Blocks.field37093, Class2838::method11071);
      this.method11097(Blocks.field37094, Class2838::method11071);
      this.method11097(Blocks.field37133, Class2838::method11071);
      this.method11097(Blocks.field37138, Class2838::method11071);
      this.method11097(Blocks.field37143, Class2838::method11071);
      this.method11097(Blocks.field36875, Class2838::method11091);
      this.method11097(Blocks.field36873, Class2838::method11091);
      this.method11097(Blocks.field36876, Class2838::method11091);
      this.method11097(Blocks.IRON_DOOR, Class2838::method11091);
      this.method11097(Blocks.field36874, Class2838::method11091);
      this.method11097(Blocks.OAK_DOOR, Class2838::method11091);
      this.method11097(Blocks.field36872, Class2838::method11091);
      this.method11097(Blocks.field37108, Class2838::method11091);
      this.method11097(Blocks.field37107, Class2838::method11091);
      this.method11097(Blocks.BLACK_BED, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Blocks.BLUE_BED, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Blocks.BROWN_RED, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Blocks.CYAN_BED, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Blocks.GRAY_BED, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Blocks.GREEN_BED, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Blocks.LIGHT_BLUE_BED, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Blocks.LIGHT_GRAY_BED, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Blocks.LIME_BED, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Blocks.MAGENTA_BED, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Blocks.PURPLE_BED, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Blocks.ORANGE_BED, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Blocks.PINK_BED, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Blocks.RED_BED, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Blocks.WHITE_BED, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Blocks.YELLOW_BED, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Blocks.LILAC, var0 -> method11072(var0, Class3456.field19276, Class84.field210));
      this.method11097(Blocks.SUNFLOWER, var0 -> method11072(var0, Class3456.field19276, Class84.field210));
      this.method11097(Blocks.field36800, var0 -> method11072(var0, Class3456.field19276, Class84.field210));
      this.method11097(Blocks.ROSE_BUSH, var0 -> method11072(var0, Class3456.field19276, Class84.field210));
      this.method11098(
         Blocks.TNT,
         Class7318.method23188()
            .method18320(
               method11060(
                  Blocks.TNT,
                  Class8894.method32373()
                     .method18289(Class6871.method20919(1))
                     .method18291(
                        Class4695.method14724(Blocks.TNT)
                           .method18297(Class161.method486(Blocks.TNT).method24519(Class9178.method34325().method34328(Class3458.field19279, false)))
                     )
               )
            )
      );
      this.method11097(
         Blocks.COCOA,
         var0 -> Class7318.method23188()
               .method18320(
                  Class8894.method32373()
                     .method18289(Class6871.method20919(1))
                     .method18291(
                        (Class5873<?>)method11059(
                           var0,
                           Class4695.method14724(Class8514.field37916)
                              .method18296(
                                 Class140.method420(Class6871.method20919(3))
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3197.field18479, 2)))
                              )
                        )
                     )
               )
      );
      this.method11097(
         Blocks.field37005,
         var0 -> Class7318.method23188()
               .method18320(
                  Class8894.method32373()
                     .method18289(Class6871.method20919(1))
                     .method18291(
                        (Class5873<?>)method11059(
                           Blocks.field37005,
                           Class4695.method14724(var0)
                              .method18296(
                                 Class140.method420(Class6871.method20919(2))
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3195.field18472, 2)))
                              )
                              .method18296(
                                 Class140.method420(Class6871.method20919(3))
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3195.field18472, 3)))
                              )
                              .method18296(
                                 Class140.method420(Class6871.method20919(4))
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3195.field18472, 4)))
                              )
                        )
                     )
               )
      );
      this.method11097(
         Blocks.field37115,
         var0 -> Class7318.method23188()
               .method18320(Class8894.method32373().method18291((Class5873<?>)method11059(var0, Class4695.method14724(Class8514.field38157))))
               .method18320(
                  Class8894.method32373()
                     .method18291(Class4695.method14724(Class8514.field37934))
                     .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3475.field19326, 8)))
               )
      );
      this.method11097(Blocks.BEACON, Class2838::method11073);
      this.method11097(Blocks.field36647, Class2838::method11073);
      this.method11097(Blocks.CHEST, Class2838::method11073);
      this.method11097(Blocks.DISPENSER, Class2838::method11073);
      this.method11097(Blocks.DROPPER, Class2838::method11073);
      this.method11097(Blocks.ENCHANTING_TABLE, Class2838::method11073);
      this.method11097(Blocks.FURNACE, Class2838::method11073);
      this.method11097(Blocks.field36723, Class2838::method11073);
      this.method11097(Blocks.TRAPPED_CHEST, Class2838::method11073);
      this.method11097(Blocks.field37056, Class2838::method11073);
      this.method11097(Blocks.field37057, Class2838::method11073);
      this.method11097(Blocks.field37055, Class2838::method11073);
      this.method11097(Blocks.field37058, Class2838::method11073);
      this.method11097(Blocks.field37059, Class2838::method11073);
      this.method11097(Blocks.field37060, Class2838::method11073);
      this.method11097(Blocks.field37061, Class2838::method11073);
      this.method11097(Blocks.field37062, Class2838::method11073);
      this.method11097(Blocks.field37063, Class2838::method11073);
      this.method11097(Blocks.field37064, Class2838::method11061);
      this.method11097(Blocks.field37065, Class2838::method11061);
      this.method11097(Blocks.field37066, Class2838::method11061);
      this.method11097(Blocks.field36896, Class2838::method11074);
      this.method11097(Blocks.field36912, Class2838::method11074);
      this.method11097(Blocks.field36908, Class2838::method11074);
      this.method11097(Blocks.field36909, Class2838::method11074);
      this.method11097(Blocks.field36906, Class2838::method11074);
      this.method11097(Blocks.field36904, Class2838::method11074);
      this.method11097(Blocks.field36910, Class2838::method11074);
      this.method11097(Blocks.field36900, Class2838::method11074);
      this.method11097(Blocks.field36905, Class2838::method11074);
      this.method11097(Blocks.field36902, Class2838::method11074);
      this.method11097(Blocks.field36899, Class2838::method11074);
      this.method11097(Blocks.field36898, Class2838::method11074);
      this.method11097(Blocks.field36903, Class2838::method11074);
      this.method11097(Blocks.field36907, Class2838::method11074);
      this.method11097(Blocks.field36911, Class2838::method11074);
      this.method11097(Blocks.field36897, Class2838::method11074);
      this.method11097(Blocks.field36901, Class2838::method11074);
      this.method11097(Blocks.field36818, Class2838::method11075);
      this.method11097(Blocks.field36814, Class2838::method11075);
      this.method11097(Blocks.field36815, Class2838::method11075);
      this.method11097(Blocks.field36812, Class2838::method11075);
      this.method11097(Blocks.field36810, Class2838::method11075);
      this.method11097(Blocks.field36816, Class2838::method11075);
      this.method11097(Blocks.field36806, Class2838::method11075);
      this.method11097(Blocks.field36811, Class2838::method11075);
      this.method11097(Blocks.field36808, Class2838::method11075);
      this.method11097(Blocks.field36805, Class2838::method11075);
      this.method11097(Blocks.field36804, Class2838::method11075);
      this.method11097(Blocks.field36809, Class2838::method11075);
      this.method11097(Blocks.field36813, Class2838::method11075);
      this.method11097(Blocks.field36817, Class2838::method11075);
      this.method11097(Blocks.field36803, Class2838::method11075);
      this.method11097(Blocks.field36807, Class2838::method11075);
      this.method11097(
         Blocks.field36707,
         var0 -> Class7318.method23188()
               .method18320(
                  method11060(
                     var0,
                     Class8894.method32373()
                        .method18289(Class6871.method20919(1))
                        .method18291(Class4695.method14724(var0).method18296(Class142.method431(Class2343.field16021).method18308("SkullOwner", "SkullOwner")))
                  )
               )
      );
      this.method11097(Blocks.field37117, Class2838::method11076);
      this.method11097(Blocks.field37118, Class2838::method11077);
      this.method11097(Blocks.field36448, var0 -> method11084(var0, Blocks.BIRCH_SAPLING, field17634));
      this.method11097(Blocks.field36450, var0 -> method11084(var0, Blocks.ACACIA_SAPLING, field17634));
      this.method11097(Blocks.field36449, var0 -> method11084(var0, Blocks.JUNGLE_SAPLING, field17635));
      this.method11097(Blocks.field36447, var0 -> method11084(var0, Blocks.SPRUCE_SAPLING, field17634));
      this.method11097(Blocks.field36446, var0 -> method11085(var0, Blocks.field36406, field17634));
      this.method11097(Blocks.field36451, var0 -> method11085(var0, Blocks.DARK_OAK_SAPLING, field17634));
      Class7520 var4 = Class161.method486(Blocks.field36884).method24519(Class9178.method34325().method34327(Class3482.field19337, 3));
      this.method11098(Blocks.field36884, method11086(Blocks.field36884, Class8514.field38111, Class8514.field38112, var4));
      Class7520 var5 = Class161.method486(Blocks.field36539).method24519(Class9178.method34325().method34327(Class3480.field19334, 7));
      this.method11098(Blocks.field36539, method11086(Blocks.field36539, Class8514.field37842, Class8514.field37841, var5));
      Class7520 var6 = Class161.method486(Blocks.field36693).method24519(Class9178.method34325().method34327(Class3483.field19334, 7));
      this.method11098(
         Blocks.field36693,
         method11059(
            Blocks.field36693,
            Class7318.method23188()
               .method18320(Class8894.method32373().method18291(Class4695.method14724(Class8514.field38052)))
               .method18320(
                  Class8894.method32373()
                     .method18297(var6)
                     .method18291(Class4695.method14724(Class8514.field38052).method18296(Class138.method406(Class8122.field34918, 0.5714286F, 3)))
               )
         )
      );
      Class7520 var7 = Class161.method486(Blocks.field36694).method24519(Class9178.method34325().method34327(Class3481.field19334, 7));
      this.method11098(
         Blocks.field36694,
         method11059(
            Blocks.field36694,
            Class7318.method23188()
               .method18320(Class8894.method32373().method18291(Class4695.method14724(Class8514.field38053)))
               .method18320(
                  Class8894.method32373()
                     .method18297(var7)
                     .method18291(Class4695.method14724(Class8514.field38053).method18296(Class138.method406(Class8122.field34918, 0.5714286F, 3)))
               )
               .method18320(
                  Class8894.method32373().method18297(var7).method18291(Class4695.method14724(Class8514.field38055).method18297(Class151.method456(0.02F)))
               )
         )
      );
      this.method11097(
         Blocks.field37069,
         var0 -> method11059(
               var0,
               Class7318.method23188()
                  .method18320(
                     Class8894.method32373()
                        .method18297(Class161.method486(Blocks.field37069).method24519(Class9178.method34325().method34327(Class3484.field19342, 3)))
                        .method18291(Class4695.method14724(Class8514.field38170))
                        .method18296(Class140.method420(Class6872.method20921(2.0F, 3.0F)))
                        .method18296(Class138.method408(Class8122.field34918))
                  )
                  .method18320(
                     Class8894.method32373()
                        .method18297(Class161.method486(Blocks.field37069).method24519(Class9178.method34325().method34327(Class3484.field19342, 2)))
                        .method18291(Class4695.method14724(Class8514.field38170))
                        .method18296(Class140.method420(Class6872.method20921(1.0F, 2.0F)))
                        .method18296(Class138.method408(Class8122.field34918))
                  )
            )
      );
      this.method11097(Blocks.BROWN_MUSHROOM_BLOCK, var0 -> method11079(var0, Blocks.BROWN_MUSHROOM));
      this.method11097(Blocks.RED_MUSHROOM_BLOCK, var0 -> method11079(var0, Blocks.RED_MUSHROOM));
      this.method11097(Blocks.field36420, var0 -> method11078(var0, Class8514.field37798));
      this.method11097(Blocks.EMERALD_ORE, var0 -> method11078(var0, Class8514.field38049));
      this.method11097(Blocks.field36722, var0 -> method11078(var0, Class8514.field38072));
      this.method11097(Blocks.field36536, var0 -> method11078(var0, Class8514.field37800));
      this.method11097(
         Blocks.field36421,
         var0 -> method11063(
               var0,
               (Class5873<?>)method11059(
                  var0,
                  Class4695.method14724(Class8514.field37969)
                     .method18296(Class140.method420(Class6872.method20921(2.0F, 6.0F)))
                     .method18296(Class138.method407(Class8122.field34918))
               )
            )
      );
      this.method11097(
         Blocks.field36455,
         var0 -> method11063(
               var0,
               (Class5873<?>)method11059(
                  var0,
                  Class4695.method14724(Class8514.field37917)
                     .method18296(Class140.method420(Class6872.method20921(4.0F, 9.0F)))
                     .method18296(Class138.method407(Class8122.field34918))
               )
            )
      );
      this.method11097(Blocks.COBWEB, var0 -> method11065(var0, (Class5873<?>)method11060(var0, Class4695.method14724(Class8514.field37838))));
      this.method11097(
         Blocks.DEAD_BUSH,
         var0 -> method11064(
               var0,
               (Class5873<?>)method11059(var0, Class4695.method14724(Class8514.field37835).method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F))))
            )
      );
      this.method11097(Blocks.field37078, Class2838::method11083);
      this.method11097(Blocks.SEAGRASS, Class2838::method11083);
      this.method11097(Blocks.VINE, Class2838::method11083);
      this.method11098(Blocks.TALL_SEAGRASS, method11087(Blocks.SEAGRASS));
      this.method11097(Blocks.field36802, var0 -> method11088(var0, Blocks.FERN));
      this.method11097(Blocks.TALL_GRASS, var0 -> method11088(var0, Blocks.GRASS));
      this.method11097(Blocks.MELON_STEM, var0 -> method11081(var0, Class8514.field37960));
      this.method11097(Blocks.ATTACHED_MELON_STEM, var0 -> method11082(var0, Class8514.field37960));
      this.method11097(Blocks.PUMPKIN_STEM, var0 -> method11081(var0, Class8514.field37959));
      this.method11097(Blocks.ATTACHED_PUMPKIN_STEM, var0 -> method11082(var0, Class8514.field37959));
      this.method11097(
         Blocks.field36879,
         var0 -> Class7318.method23188()
               .method18320(
                  Class8894.method32373()
                     .method18289(Class6871.method20919(1))
                     .method18291(((Class5872)method11060(var0, Class4695.method14724(var0))).method18297(Class123.method356(Class2063.field13447)))
               )
      );
      this.method11097(Blocks.FERN, Class2838::method11080);
      this.method11097(Blocks.GRASS, Class2838::method11080);
      this.method11097(
         Blocks.field36587,
         var0 -> method11063(
               var0,
               (Class5873<?>)method11059(
                  var0,
                  Class4695.method14724(Class8514.field37908)
                     .method18296(Class140.method420(Class6872.method20921(2.0F, 4.0F)))
                     .method18296(Class138.method408(Class8122.field34918))
                     .method18296(Class135.method396(Class12.method58(1, 4)))
               )
            )
      );
      this.method11097(
         Blocks.MELON,
         var0 -> method11063(
               var0,
               (Class5873<?>)method11059(
                  var0,
                  Class4695.method14724(Class8514.field37957)
                     .method18296(Class140.method420(Class6872.method20921(3.0F, 7.0F)))
                     .method18296(Class138.method408(Class8122.field34918))
                     .method18296(Class135.method396(Class12.method60(9)))
               )
            )
      );
      this.method11097(
         Blocks.field36567,
         var0 -> method11063(
               var0,
               (Class5873<?>)method11059(
                  var0,
                  Class4695.method14724(Class8514.field37887)
                     .method18296(Class140.method420(Class6872.method20921(4.0F, 5.0F)))
                     .method18296(Class138.method408(Class8122.field34918))
               )
            )
      );
      this.method11097(
         Blocks.field36776,
         var0 -> method11063(
               var0,
               (Class5873<?>)method11059(
                  var0,
                  Class4695.method14724(Class8514.field38076)
                     .method18296(Class140.method420(Class6872.method20921(2.0F, 3.0F)))
                     .method18296(Class138.method408(Class8122.field34918))
                     .method18296(Class135.method396(Class12.method58(1, 5)))
               )
            )
      );
      this.method11097(
         Blocks.NETHER_WART,
         var0 -> Class7318.method23188()
               .method18320(
                  method11059(
                     var0,
                     Class8894.method32373()
                        .method18289(Class6871.method20919(1))
                        .method18291(
                           Class4695.method14724(Class8514.field37970)
                              .method18296(
                                 Class140.method420(Class6872.method20921(2.0F, 4.0F))
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3489.field19354, 3)))
                              )
                              .method18296(
                                 Class138.method408(Class8122.field34918)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3489.field19354, 3)))
                              )
                        )
                  )
               )
      );
      this.method11097(
         Blocks.SNOW,
         var0 -> Class7318.method23188()
               .method18320(
                  Class8894.method32373()
                     .method18297(Class123.method356(Class2063.field13447))
                     .method18291(
                        Class4690.method14712(
                           Class4690.method14712(
                                 Class4695.method14724(Class8514.field37888)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 1))),
                                 Class4695.method14724(Class8514.field37888)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 2)))
                                    .method18296(Class140.method420(Class6871.method20919(2))),
                                 Class4695.method14724(Class8514.field37888)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 3)))
                                    .method18296(Class140.method420(Class6871.method20919(3))),
                                 Class4695.method14724(Class8514.field37888)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 4)))
                                    .method18296(Class140.method420(Class6871.method20919(4))),
                                 Class4695.method14724(Class8514.field37888)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 5)))
                                    .method18296(Class140.method420(Class6871.method20919(5))),
                                 Class4695.method14724(Class8514.field37888)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 6)))
                                    .method18296(Class140.method420(Class6871.method20919(6))),
                                 Class4695.method14724(Class8514.field37888)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 7)))
                                    .method18296(Class140.method420(Class6871.method20919(7))),
                                 Class4695.method14724(Class8514.field37888).method18296(Class140.method420(Class6871.method20919(8)))
                              )
                              .method18297(field17629),
                           Class4690.method14712(
                              Class4695.method14724(Blocks.SNOW)
                                 .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 1))),
                              Class4695.method14724(Blocks.SNOW)
                                 .method18296(Class140.method420(Class6871.method20919(2)))
                                 .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 2))),
                              Class4695.method14724(Blocks.SNOW)
                                 .method18296(Class140.method420(Class6871.method20919(3)))
                                 .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 3))),
                              Class4695.method14724(Blocks.SNOW)
                                 .method18296(Class140.method420(Class6871.method20919(4)))
                                 .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 4))),
                              Class4695.method14724(Blocks.SNOW)
                                 .method18296(Class140.method420(Class6871.method20919(5)))
                                 .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 5))),
                              Class4695.method14724(Blocks.SNOW)
                                 .method18296(Class140.method420(Class6871.method20919(6)))
                                 .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 6))),
                              Class4695.method14724(Blocks.SNOW)
                                 .method18296(Class140.method420(Class6871.method20919(7)))
                                 .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 7))),
                              Class4695.method14724(Blocks.SNOW_BLOCK)
                           )
                        )
                     )
               )
      );
      this.method11097(
         Blocks.GRAVEL,
         var0 -> method11063(
               var0,
               method11060(
                  var0,
                  Class4695.method14724(Class8514.field37868)
                     .method18297(Class158.method476(Class8122.field34918, 0.1F, 0.14285715F, 0.25F, 1.0F))
                     .method18303(Class4695.method14724(var0))
               )
            )
      );
      this.method11097(
         Blocks.field37067,
         var0 -> method11063(
               var0, (Class5873<?>)method11060(var0, Class4695.method14724(Class8514.field37799).method18296(Class140.method420(Class6871.method20919(2))))
            )
      );
      this.method11097(
         Blocks.field37141,
         var0 -> method11063(
               var0,
               method11060(
                  var0,
                  Class4695.method14724(Class8514.field37969)
                     .method18296(Class140.method420(Class6872.method20921(2.0F, 5.0F)))
                     .method18297(Class158.method476(Class8122.field34918, 0.1F, 0.14285715F, 0.25F, 1.0F))
                     .method18303(Class4695.method14724(var0))
               )
            )
      );
      this.method11097(
         Blocks.field37068,
         var0 -> method11063(
               var0, (Class5873<?>)method11060(var0, Class4695.method14724(Class8514.field37442).method18296(Class140.method420(Class6871.method20919(1))))
            )
      );
      this.method11095(Blocks.field36454);
      this.method11095(Blocks.field36593);
      this.method11095(Blocks.field36594);
      this.method11095(Blocks.field36595);
      this.method11095(Blocks.field36596);
      this.method11095(Blocks.field36597);
      this.method11095(Blocks.field36598);
      this.method11095(Blocks.field36599);
      this.method11095(Blocks.field36600);
      this.method11095(Blocks.field36601);
      this.method11095(Blocks.field36602);
      this.method11095(Blocks.field36603);
      this.method11095(Blocks.field36604);
      this.method11095(Blocks.field36605);
      this.method11095(Blocks.field36606);
      this.method11095(Blocks.field36607);
      this.method11095(Blocks.field36608);
      this.method11095(Blocks.GLASS_PANE);
      this.method11095(Blocks.field36746);
      this.method11095(Blocks.field36747);
      this.method11095(Blocks.field36748);
      this.method11095(Blocks.field36749);
      this.method11095(Blocks.field36750);
      this.method11095(Blocks.field36751);
      this.method11095(Blocks.field36752);
      this.method11095(Blocks.field36753);
      this.method11095(Blocks.field36754);
      this.method11095(Blocks.field36755);
      this.method11095(Blocks.field36756);
      this.method11095(Blocks.field36757);
      this.method11095(Blocks.field36758);
      this.method11095(Blocks.field36759);
      this.method11095(Blocks.field36760);
      this.method11095(Blocks.field36761);
      this.method11095(Blocks.ICE);
      this.method11095(Blocks.PACKED_ICE);
      this.method11095(Blocks.field37006);
      this.method11095(Blocks.field36964);
      this.method11095(Blocks.MUSHROOM_STEM);
      this.method11095(Blocks.field36975);
      this.method11095(Blocks.field36976);
      this.method11095(Blocks.field36977);
      this.method11095(Blocks.field36978);
      this.method11095(Blocks.field36979);
      this.method11095(Blocks.field36980);
      this.method11095(Blocks.field36981);
      this.method11095(Blocks.field36982);
      this.method11095(Blocks.field36983);
      this.method11095(Blocks.field36984);
      this.method11095(Blocks.field36985);
      this.method11095(Blocks.field36986);
      this.method11095(Blocks.field36987);
      this.method11095(Blocks.field36988);
      this.method11095(Blocks.field36989);
      this.method11095(Blocks.field36990);
      this.method11095(Blocks.field36991);
      this.method11095(Blocks.field36992);
      this.method11095(Blocks.field36993);
      this.method11095(Blocks.field36994);
      this.method11093(Blocks.field36619, Blocks.STONE);
      this.method11093(Blocks.field36620, Blocks.field36399);
      this.method11093(Blocks.field36621, Blocks.field36615);
      this.method11093(Blocks.field36622, Blocks.field36616);
      this.method11093(Blocks.field36623, Blocks.field36617);
      this.method11093(Blocks.field36624, Blocks.field36618);
      this.method11090(Blocks.field37086, Blocks.field37087);
      this.method11090(Blocks.field37088, Blocks.field37089);
      this.method11098(Blocks.field36591, method11089());
      this.method11098(Blocks.field36889, method11089());
      this.method11098(Blocks.field36532, method11089());
      this.method11098(Blocks.FIRE, method11089());
      this.method11098(Blocks.field36531, method11089());
      this.method11098(Blocks.field36588, method11089());
      HashSet var8 = Sets.newHashSet();

      for (Block var10 : Class2348.field16072) {
         ResourceLocation var11 = var10.method11999();
         if (var11 != Class8793.field39533 && var8.add(var11)) {
            Class5888 var12 = this.field17636.remove(var11);
            if (var12 == null) {
               throw new IllegalStateException(String.format("Missing loottable '%s' for '%s'", var11, Class2348.field16072.method9181(var10)));
            }

            var1.accept(var11, var12);
         }
      }

      if (!this.field17636.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.field17636.keySet());
      }
   }

   private void method11090(Block var1, Block var2) {
      Class5888 var5 = method11065(var1, Class4695.method14724(var1).method18297(Class158.method476(Class8122.field34918, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.method11098(var1, var5);
      this.method11098(var2, var5);
   }

   public static Class5888 method11091(Block var0) {
      return method11072(var0, Class3461.field19297, Class84.field210);
   }

   public void method11092(Block var1) {
      this.method11097(var1, var0 -> method11070(((Class3460)var0).method12137()));
   }

   public void method11093(Block var1, Block var2) {
      this.method11098(var1, method11069(var2));
   }

   public void method11094(Block var1, Class3303 var2) {
      this.method11098(var1, method11061(var2));
   }

   public void method11095(Block var1) {
      this.method11093(var1, var1);
   }

   public void method11096(Block var1) {
      this.method11094(var1, var1);
   }

   private void method11097(Block var1, Function<Block, Class5888> var2) {
      this.method11098(var1, (Class5888)var2.apply(var1));
   }

   private void method11098(Block var1, Class5888 var2) {
      this.field17636.put(var1.method11999(), var2);
   }
}
