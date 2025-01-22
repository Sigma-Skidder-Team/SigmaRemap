package mapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import net.minecraft.block.*;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.state.Property;
import net.minecraft.state.properties.BedPart;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.state.properties.SlabType;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class Class2838 implements Consumer<BiConsumer<ResourceLocation, Class5888>> {
   private static final Class7519 field17628 = Class159.method480(
      Class9735.method38146().method38150(new Class8605(Enchantments.SILK_TOUCH, Class8840.method32014(1)))
   );
   private static final Class7519 field17629 = field17628.method24518();
   private static final Class7519 field17630 = Class159.method480(Class9735.method38146().method38147(Items.field37956));
   private static final Class7519 field17631 = field17630.method24516(field17628);
   private static final Class7519 field17632 = field17631.method24518();
   private static final Set<Item> field17633 = Stream.<Block>of(
         Blocks.DRAGON_EGG,
         Blocks.BEACON,
         Blocks.CONDUIT,
         Blocks.SKELETON_SKULL,
         Blocks.WITHER_SKELETON_SKULL,
         Blocks.PLAYER_HEAD,
         Blocks.ZOMBIE_HEAD,
         Blocks.CREEPER_HEAD,
         Blocks.HEAD,
         Blocks.SHULKER_BOX,
         Blocks.BLACK_SHULKER_BOX,
         Blocks.BLUE_SHULKER_BOX,
         Blocks.BROWN_SHULKER_BOX,
         Blocks.CYAN_SHULKER_BOX,
         Blocks.GRAY_SHULKER_BOX,
         Blocks.GREEN_SHULKER_BOX,
         Blocks.LIGHT_BLUE_SHULKER_BOX,
         Blocks.LIGHT_GRAY_SHULKER_BOX,
         Blocks.LIME_SHULKER_BOX,
         Blocks.MAGENTA_SHULKER_BOX,
         Blocks.ORANGE_SHULKER_BOX,
         Blocks.PINK_SHULKER_BOX,
         Blocks.PURPLE_SHULKER_BOX,
         Blocks.RED_SHULKER_BOX,
         Blocks.WHITE_SHULKER_BOX,
         Blocks.YELLOW_SHULKER_BOX
      )
      .<Item>map(IItemProvider::asItem)
      .collect(ImmutableSet.toImmutableSet());
   private static final float[] field17634 = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] field17635 = new float[]{0.025F, 0.027777778F, 0.03125F, 0.041666668F, 0.1F};
   private final Map<ResourceLocation, Class5888> field17636 = Maps.newHashMap();

   private static <T> T method11059(IItemProvider var0, Class5871<T> var1) {
      return (T)(field17633.contains(var0.asItem()) ? var1.method18295() : var1.method18296(Class144.method442()));
   }

   private static <T> T method11060(IItemProvider var0, Class5875<T> var1) {
      return (T)(field17633.contains(var0.asItem()) ? var1.method18295() : var1.method18297(Class162.method489()));
   }

   private static Class5888 method11061(IItemProvider var0) {
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

   private static Class5888 method11066(Block var0, IItemProvider var1) {
      return method11063(var0, (Class5873<?>)method11060(var0, Class4695.method14724(var1)));
   }

   private static Class5888 method11067(IItemProvider var0, Class6870 var1) {
      return Class7318.method23188()
         .method18320(
            Class8894.method32373()
               .method18289(Class6871.method20919(1))
               .method18291((Class5873<?>)method11059(var0, Class4695.method14724(var0).method18296(Class140.method420(var1))))
         );
   }

   private static Class5888 method11068(Block var0, IItemProvider var1, Class6870 var2) {
      return method11063(var0, (Class5873<?>)method11059(var0, Class4695.method14724(var1).method18296(Class140.method420(var2))));
   }

   private static Class5888 method11069(IItemProvider var0) {
      return Class7318.method23188()
         .method18320(Class8894.method32373().method18297(field17628).method18289(Class6871.method20919(1)).method18291(Class4695.method14724(var0)));
   }

   private static Class5888 method11070(IItemProvider var0) {
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
                              .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34329(SlabBlock.field18605, SlabType.field220)))
                        )
                  )
               )
         );
   }

   private static <T extends Comparable<T> & IStringSerializable> Class5888 method11072(Block var0, Property<T> var1, T var2) {
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

   private static Class5888 method11078(Block var0, Item var1) {
      return method11063(var0, (Class5873<?>)method11059(var0, Class4695.method14724(var1).method18296(Class138.method407(Enchantments.FORTUNE))));
   }

   private static Class5888 method11079(Block var0, IItemProvider var1) {
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
            var0, Class4695.method14724(Items.field37841).method18297(Class151.method456(0.125F)).method18296(Class138.method409(Enchantments.FORTUNE, 2))
         )
      );
   }

   private static Class5888 method11081(Block var0, Item var1) {
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

   private static Class5888 method11082(Block var0, Item var1) {
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

   private static Class5888 method11083(IItemProvider var0) {
      return Class7318.method23188()
         .method18320(Class8894.method32373().method18289(Class6871.method20919(1)).method18297(field17630).method18291(Class4695.method14724(var0)));
   }

   private static Class5888 method11084(Block var0, Block var1, float... var2) {
      return method11065(var0, ((Class5872)method11060(var0, Class4695.method14724(var1))).method18297(Class158.method476(Enchantments.FORTUNE, var2)))
         .method18320(
            Class8894.method32373()
               .method18289(Class6871.method20919(1))
               .method18297(field17632)
               .method18291(
                  ((Class5872)method11059(var0, Class4695.method14724(Items.field37835).method18296(Class140.method420(Class6872.method20921(1.0F, 2.0F)))))
                     .method18297(Class158.method476(Enchantments.FORTUNE, 0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F))
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
                  ((Class5872)method11060(var0, Class4695.method14724(Items.APPLE)))
                     .method18297(Class158.method476(Enchantments.FORTUNE, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))
               )
         );
   }

   private static Class5888 method11086(Block var0, Item var1, Item var2, Class7519 var3) {
      return method11059(
         var0,
         Class7318.method23188()
            .method18320(Class8894.method32373().method18291(Class4695.method14724(var1).method18297(var3).method18303(Class4695.method14724(var2))))
            .method18320(
               Class8894.method32373()
                  .method18297(var3)
                  .method18291(Class4695.method14724(var2).method18296(Class138.method406(Enchantments.FORTUNE, 0.5714286F, 3)))
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
         .method18303(((Class5872)method11060(var0, Class4695.method14724(Items.field37841))).method18297(Class151.method456(0.125F)));
      return Class7318.method23188()
         .method18320(
            Class8894.method32373()
               .method18291(var4)
               .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34329(Class3456.field19276, DoubleBlockHalf.field210)))
               .method18297(
                  Class155.method468(
                     Class8912.method32576()
                        .method32578(
                           Class8831.method31929()
                              .method31930(var0)
                              .method31932(Class9178.method34325().method34329(Class3456.field19276, DoubleBlockHalf.field209).method34330())
                              .method31933()
                        ),
                     new BlockPos(0, 1, 0)
                  )
               )
         )
         .method18320(
            Class8894.method32373()
               .method18291(var4)
               .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34329(Class3456.field19276, DoubleBlockHalf.field209)))
               .method18297(
                  Class155.method468(
                     Class8912.method32576()
                        .method32578(
                           Class8831.method31929()
                              .method31930(var0)
                              .method31932(Class9178.method34325().method34329(Class3456.field19276, DoubleBlockHalf.field210).method34330())
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
      this.method11096(Blocks.DIRT);
      this.method11096(Blocks.COARSE_DIRT);
      this.method11096(Blocks.COBBLESTONE);
      this.method11096(Blocks.OAK_PLANKS);
      this.method11096(Blocks.SPRUCE_PLANKS);
      this.method11096(Blocks.BIRCH_PLANKS);
      this.method11096(Blocks.JUNGLE_PLANKS);
      this.method11096(Blocks.ACACIA_PLANKS);
      this.method11096(Blocks.DARK_OAK_PLANKS);
      this.method11096(Blocks.OAK_SAPLING);
      this.method11096(Blocks.SPRUCE_SAPLING);
      this.method11096(Blocks.BIRCH_SAPLING);
      this.method11096(Blocks.JUNGLE_SAPLING);
      this.method11096(Blocks.ACACIA_SAPLING);
      this.method11096(Blocks.DARK_OAK_SAPLING);
      this.method11096(Blocks.SAND);
      this.method11096(Blocks.RED_SAND);
      this.method11096(Blocks.GOLD_ORE);
      this.method11096(Blocks.IRON_ORE);
      this.method11096(Blocks.OAK_LOG);
      this.method11096(Blocks.SPRUCE_LOG);
      this.method11096(Blocks.BIRCH_LOG);
      this.method11096(Blocks.JUNGLE_LOG);
      this.method11096(Blocks.ACACIA_LOG);
      this.method11096(Blocks.DARK_OAK_LOG);
      this.method11096(Blocks.STRIPPED_SPRUCE_LOG);
      this.method11096(Blocks.STRIPPED_BIRCH_LOG);
      this.method11096(Blocks.STRIPPED_JUNGLE_LOG);
      this.method11096(Blocks.STRIPPED_ACACIA_LOG);
      this.method11096(Blocks.STRIPPED_DARK_OAK_LOG);
      this.method11096(Blocks.STRIPPED_OAK_LOG);
      this.method11096(Blocks.STRIPPED_WARPED_STEM);
      this.method11096(Blocks.STRIPPED_CRIMSON_STEM);
      this.method11096(Blocks.OAK_WOOD);
      this.method11096(Blocks.SPRUCE_WOOD);
      this.method11096(Blocks.BIRCH_WOOD);
      this.method11096(Blocks.JUNGLE_WOOD);
      this.method11096(Blocks.ACACIA_WOOD);
      this.method11096(Blocks.DARK_OAK_WOOD);
      this.method11096(Blocks.STRIPPED_OAK_WOOD);
      this.method11096(Blocks.STRIPPED_SPRUCE_WOOD);
      this.method11096(Blocks.STRIPPED_BIRCH_WOOD);
      this.method11096(Blocks.STRIPPED_JUNGLE_WOOD);
      this.method11096(Blocks.STRIPPED_ACACIA_WOOD);
      this.method11096(Blocks.STRIPPED_DARK_OAK_WOOD);
      this.method11096(Blocks.STRIPPED_CRIMSON_HYPHAE);
      this.method11096(Blocks.STRIPPED_WARPED_HYPHAE);
      this.method11096(Blocks.SPONGE);
      this.method11096(Blocks.WET_SPONGE);
      this.method11096(Blocks.LAPIS_BLOCK);
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
      this.method11096(Blocks.GOLD_BLOCK);
      this.method11096(Blocks.IRON_BLOCK);
      this.method11096(Blocks.BRICKS);
      this.method11096(Blocks.MOSSY_COBBLESTONE);
      this.method11096(Blocks.OBSIDIAN);
      this.method11096(Blocks.CRYING_OBSIDIAN);
      this.method11096(Blocks.TORCH);
      this.method11096(Blocks.OAK_STAIRS);
      this.method11096(Blocks.REDSTONE_WIRE);
      this.method11096(Blocks.DIAMOND_BLOCK);
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
      this.method11096(Blocks.STONE_PRESSURE_PLATE);
      this.method11096(Blocks.OAK_PRESSURE_PLATE);
      this.method11096(Blocks.SPRUCE_PRESSURE_PLATE);
      this.method11096(Blocks.BIRCH_PRESSURE_PLATE);
      this.method11096(Blocks.JUNGLE_PRESSURE_PLATE);
      this.method11096(Blocks.ACACIA_PRESSURE_PLATE);
      this.method11096(Blocks.DARK_OAK_PRESSURE_PLATE);
      this.method11096(Blocks.REDSTONE_TORCH);
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
      this.method11096(Blocks.SOUL_TORCH);
      this.method11096(Blocks.CARVED_PUMPKIN);
      this.method11096(Blocks.JACK_O_LANTERN);
      this.method11096(Blocks.REPEATER);
      this.method11096(Blocks.OAK_TRAPDOOR);
      this.method11096(Blocks.SPRUCE_TRAPDOOR);
      this.method11096(Blocks.BIRCH_TRAPDOOR);
      this.method11096(Blocks.JUNGLE_TRAPDOOR);
      this.method11096(Blocks.ACACIA_TRAPDOOR);
      this.method11096(Blocks.DARK_OAK_TRAPDOOR);
      this.method11096(Blocks.STONE_BRICKS);
      this.method11096(Blocks.MOSSY_STONE_BRICKS);
      this.method11096(Blocks.CRACKED_STONE_BRICKS);
      this.method11096(Blocks.CHISELED_STONE_BRICKS);
      this.method11096(Blocks.IRON_BARS);
      this.method11096(Blocks.OAK_FENCE_GATE);
      this.method11096(Blocks.BRICK_STAIRS);
      this.method11096(Blocks.STONE_BRICK_STAIRS);
      this.method11096(Blocks.LILY_PAD);
      this.method11096(Blocks.NETHER_BRICKS);
      this.method11096(Blocks.NETHER_BRICK_FENCE);
      this.method11096(Blocks.NETHER_BRICK_STAIRS);
      this.method11096(Blocks.CAULDRON);
      this.method11096(Blocks.END_STONE);
      this.method11096(Blocks.REDSTONE_LAMP);
      this.method11096(Blocks.SANDSTONE_STAIRS);
      this.method11096(Blocks.TRIPWIRE_HOOK);
      this.method11096(Blocks.EMERALD_BLOCK);
      this.method11096(Blocks.SPRUCE_STAIRS);
      this.method11096(Blocks.BIRCH_STAIRS);
      this.method11096(Blocks.JUNGLE_STAIRS);
      this.method11096(Blocks.COBBLESTONE_WALL);
      this.method11096(Blocks.MOSSY_COBBLESTONE_WALL);
      this.method11096(Blocks.FLOWER_POT);
      this.method11096(Blocks.OAK_BUTTON);
      this.method11096(Blocks.SPRUCE_BUTTON);
      this.method11096(Blocks.BIRCH_BUTTON);
      this.method11096(Blocks.JUNGLE_BUTTON);
      this.method11096(Blocks.ACACIA_BUTTON);
      this.method11096(Blocks.DARK_OAK_BUTTON);
      this.method11096(Blocks.SKELETON_SKULL);
      this.method11096(Blocks.WITHER_SKELETON_SKULL);
      this.method11096(Blocks.ZOMBIE_HEAD);
      this.method11096(Blocks.CREEPER_HEAD);
      this.method11096(Blocks.HEAD);
      this.method11096(Blocks.ANVIL);
      this.method11096(Blocks.CHIPPED_ANVIL);
      this.method11096(Blocks.DAMAGED_ANVIL);
      this.method11096(Blocks.LIGHT_WEIGHTED_PRESSURE_PLATE);
      this.method11096(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE);
      this.method11096(Blocks.COMPARATOR);
      this.method11096(Blocks.DAYLIGHT_DETECTOR);
      this.method11096(Blocks.REDSTONE_BLOCK);
      this.method11096(Blocks.QUARTZ_BLOCK);
      this.method11096(Blocks.CHISELED_QUARTZ_BLOCK);
      this.method11096(Blocks.QUARTZ_PILLAR);
      this.method11096(Blocks.QUARTZ_STAIRS);
      this.method11096(Blocks.ACTIVATOR_RAIL);
      this.method11096(Blocks.WHITE_TERRACOTTA);
      this.method11096(Blocks.ORANGE_TERRACOTTA);
      this.method11096(Blocks.MAGENTA_TERRACOTTA);
      this.method11096(Blocks.LIGHT_BLUE_TERRACOTTA);
      this.method11096(Blocks.YELLOW_TERRACOTTA);
      this.method11096(Blocks.LIME_TERRACOTTA);
      this.method11096(Blocks.PINK_TERRACOTTA);
      this.method11096(Blocks.GRAY_TERRACOTTA);
      this.method11096(Blocks.LIGHT_GRAY_TERRACOTTA);
      this.method11096(Blocks.CYAN_TERRACOTTA);
      this.method11096(Blocks.PURPLE_TERRACOTTA);
      this.method11096(Blocks.BLUE_TERRACOTTA);
      this.method11096(Blocks.BROWN_TERRACOTTA);
      this.method11096(Blocks.GREEN_TERRACOTTA);
      this.method11096(Blocks.RED_TERRACOTTA);
      this.method11096(Blocks.BLACK_TERRACOTTA);
      this.method11096(Blocks.ACACIA_STAIRS);
      this.method11096(Blocks.DARK_OAK_STAIRS);
      this.method11096(Blocks.SLIME_BLOCK);
      this.method11096(Blocks.IRON_TRAPDOOR);
      this.method11096(Blocks.PRISMARINE);
      this.method11096(Blocks.PRISMARINE_BRICKS);
      this.method11096(Blocks.DARK_PRISMARINE);
      this.method11096(Blocks.PRISMARINE_STAIRS);
      this.method11096(Blocks.PRISMARINE_BRICK_STAIRS);
      this.method11096(Blocks.DARK_PRISMARINE_STAIRS);
      this.method11096(Blocks.HAY_BLOCK);
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
      this.method11096(Blocks.TERRACOTTA);
      this.method11096(Blocks.COAL_BLOCK);
      this.method11096(Blocks.RED_SANDSTONE);
      this.method11096(Blocks.CHISELED_RED_SANDSTONE);
      this.method11096(Blocks.CUT_RED_SANDSTONE);
      this.method11096(Blocks.RED_SANDSTONE_STAIRS);
      this.method11096(Blocks.SMOOTH_STONE);
      this.method11096(Blocks.SMOOTH_SANDSTONE);
      this.method11096(Blocks.SMOOTH_QUARTZ);
      this.method11096(Blocks.SMOOTH_RED_SANDSTONE);
      this.method11096(Blocks.SPRUCE_FENCE_GATE);
      this.method11096(Blocks.BIRCH_FENCE_GATE);
      this.method11096(Blocks.JUNGLE_FENCE_GATE);
      this.method11096(Blocks.ACACIA_FENCE_GATE);
      this.method11096(Blocks.DARK_OAK_FENCE_GATE);
      this.method11096(Blocks.SPRUCE_FENCE);
      this.method11096(Blocks.BIRCH_FENCE);
      this.method11096(Blocks.JUNGLE_FENCE);
      this.method11096(Blocks.ACACIA_FENCE);
      this.method11096(Blocks.DARK_OAK_FENCE);
      this.method11096(Blocks.END_ROD);
      this.method11096(Blocks.PURPUR_BLOCK);
      this.method11096(Blocks.PURPUR_PILLAR);
      this.method11096(Blocks.PURPUR_STAIRS);
      this.method11096(Blocks.END_STONE_BRICKS);
      this.method11096(Blocks.MAGMA_BLOCK);
      this.method11096(Blocks.NETHER_WART_BLOCK);
      this.method11096(Blocks.RED_NETHER_BRICKS);
      this.method11096(Blocks.BONE_BLOCK);
      this.method11096(Blocks.OBSERVER);
      this.method11096(Blocks.TARGET);
      this.method11096(Blocks.WHITE_GLAZED_TERRACOTTA);
      this.method11096(Blocks.ORANGE_GLAZED_TERRACOTTA);
      this.method11096(Blocks.MAGENTA_GLAZED_TERRACOTTA);
      this.method11096(Blocks.LIGHT_BLUE_GLAZED_TERRACOTTA);
      this.method11096(Blocks.YELLOW_GLAZED_TERRACOTTA);
      this.method11096(Blocks.LIME_GLAZED_TERRACOTTA);
      this.method11096(Blocks.PINK_GLAZED_TERRACOTTA);
      this.method11096(Blocks.GRAY_GLAZED_TERRACOTTA);
      this.method11096(Blocks.LIGHT_GRAY_GLAZED_TERRACOTTA);
      this.method11096(Blocks.CYAN_GLAZED_TERRACOTTA);
      this.method11096(Blocks.PURPLE_GLAZED_TERRACOTTA);
      this.method11096(Blocks.BLUE_GLAZED_TERRACOTTA);
      this.method11096(Blocks.BROWN_GLAZED_TERRACOTTA);
      this.method11096(Blocks.GREEN_GLAZED_TERRACOTTA);
      this.method11096(Blocks.RED_GLAZED_TERRACOTTA);
      this.method11096(Blocks.BLACK_GLAZED_TERRACOTTA);
      this.method11096(Blocks.WHITE_CONCRETE);
      this.method11096(Blocks.ORANGE_CONCRETE);
      this.method11096(Blocks.MAGENTA_CONCRETE);
      this.method11096(Blocks.LIGHT_BLUE_CONCRETE);
      this.method11096(Blocks.YELLOW_CONCRETE);
      this.method11096(Blocks.LIME_CONCRETE);
      this.method11096(Blocks.PINK_CONCRETE);
      this.method11096(Blocks.GRAY_CONCRETE);
      this.method11096(Blocks.LIGHT_GRAY_CONCRETE);
      this.method11096(Blocks.CYAN_CONCRETE);
      this.method11096(Blocks.PURPLE_CONCRETE);
      this.method11096(Blocks.BLUE_CONCRETE);
      this.method11096(Blocks.BROWN_CONCRETE);
      this.method11096(Blocks.GREEN_CONCRETE);
      this.method11096(Blocks.RED_CONCRETE);
      this.method11096(Blocks.BLACK_CONCRETE);
      this.method11096(Blocks.WHITE_CONCRETE_POWDER);
      this.method11096(Blocks.ORANGE_CONCRETE_POWDER);
      this.method11096(Blocks.MAGENTA_CONCRETE_POWDER);
      this.method11096(Blocks.LIGHT_BLUE_CONCRETE_POWDER);
      this.method11096(Blocks.YELLOW_CONCRETE_POWDER);
      this.method11096(Blocks.LIME_CONCRETE_POWDER);
      this.method11096(Blocks.PINK_CONCRETE_POWDER);
      this.method11096(Blocks.GRAY_CONCRETE_POWDER);
      this.method11096(Blocks.LIGHT_GRAY_CONCRETE_POWDER);
      this.method11096(Blocks.CYAN_CONCRETE_POWDER);
      this.method11096(Blocks.PURPLE_CONCRETE_POWDER);
      this.method11096(Blocks.BLUE_CONCRETE_POWDER);
      this.method11096(Blocks.BROWN_CONCRETE_POWDER);
      this.method11096(Blocks.GREEN_CONCRETE_POWDER);
      this.method11096(Blocks.RED_CONCRETE_POWDER);
      this.method11096(Blocks.BLACK_CONCRETE_POWDER);
      this.method11096(Blocks.KELP);
      this.method11096(Blocks.DRIED_KELP_BLOCK);
      this.method11096(Blocks.DEAD_TUBE_CORAL_BLOCK);
      this.method11096(Blocks.DEAD_BRAIN_CORAL_BLOCK);
      this.method11096(Blocks.DEAD_BUBBLE_CORAL_BLOCK);
      this.method11096(Blocks.DEAD_FIRE_CORAL_BLOCK);
      this.method11096(Blocks.DEAD_HORN_CORAL_BLOCK);
      this.method11096(Blocks.CONDUIT);
      this.method11096(Blocks.DRAGON_EGG);
      this.method11096(Blocks.BAMBOO);
      this.method11096(Blocks.POLISHED_GRANITE_STAIRS);
      this.method11096(Blocks.SMOOTH_RED_SANDSTONE_STAIRS);
      this.method11096(Blocks.MOSSY_STONE_BRICK_STAIRS);
      this.method11096(Blocks.POLISHED_DIORITE_STAIRS);
      this.method11096(Blocks.MOSSY_COBBLESTONE_STAIRS);
      this.method11096(Blocks.END_STONE_BRICK_STAIRS);
      this.method11096(Blocks.STONE_STAIRS);
      this.method11096(Blocks.SMOOTH_SANDSTONE_STAIRS);
      this.method11096(Blocks.SMOOTH_QUARTZ_STAIRS);
      this.method11096(Blocks.GRANITE_STAIRS);
      this.method11096(Blocks.ANDESITE_STAIRS);
      this.method11096(Blocks.RED_NETHER_BRICK_STAIRS);
      this.method11096(Blocks.POLISHED_ANDESITE_STAIRS);
      this.method11096(Blocks.DIORITE_STAIRS);
      this.method11096(Blocks.BRICK_WALL);
      this.method11096(Blocks.PRISMARINE_WALL);
      this.method11096(Blocks.RED_SANDSTONE_WALL);
      this.method11096(Blocks.MOSSY_STONE_BRICK_WALL);
      this.method11096(Blocks.GRANITE_WALL);
      this.method11096(Blocks.STONE_BRICK_WALL);
      this.method11096(Blocks.NETHER_BRICK_WALL);
      this.method11096(Blocks.ANDESITE_WALL);
      this.method11096(Blocks.RED_NETHER_BRICK_WALL);
      this.method11096(Blocks.SANDSTONE_WALL);
      this.method11096(Blocks.END_STONE_BRICK_WALL);
      this.method11096(Blocks.DIORITE_WALL);
      this.method11096(Blocks.LOOM);
      this.method11096(Blocks.SCAFFOLDING);
      this.method11096(Blocks.HONEY_BLOCK);
      this.method11096(Blocks.HONEYCOMB_BLOCK);
      this.method11096(Blocks.RESPAWN_ANCHOR);
      this.method11096(Blocks.field37129);
      this.method11096(Blocks.WARPED_STEM);
      this.method11096(Blocks.WARPED_HYPHAE);
      this.method11096(Blocks.WARPED_FUNGUS);
      this.method11096(Blocks.WARPED_WART_BLOCK);
      this.method11096(Blocks.CRIMSON_STEM);
      this.method11096(Blocks.CRIMSON_HYPHAE);
      this.method11096(Blocks.CRIMSON_FUNGUS);
      this.method11096(Blocks.SHROOMLIGHT);
      this.method11096(Blocks.CRIMSON_PLANKS);
      this.method11096(Blocks.WARPED_PLANKS);
      this.method11096(Blocks.WARPED_PRESSURE_PLATE);
      this.method11096(Blocks.WARPED_FENCE);
      this.method11096(Blocks.WARPED_TRAPDOOR);
      this.method11096(Blocks.WARPED_FENCE_GATE);
      this.method11096(Blocks.WARPED_STAIRS);
      this.method11096(Blocks.WARPED_BUTTON);
      this.method11096(Blocks.WARPED_SIGN);
      this.method11096(Blocks.CRIMSON_PRESSURE_PLATE);
      this.method11096(Blocks.CRIMSON_FENCE);
      this.method11096(Blocks.CRIMSON_TRAPDOOR);
      this.method11096(Blocks.CRIMSON_FENCE_GATE);
      this.method11096(Blocks.CRIMSON_STAIRS);
      this.method11096(Blocks.CRIMSON_BUTTON);
      this.method11096(Blocks.CRIMSON_SIGN);
      this.method11096(Blocks.NETHERITE_BLOCK);
      this.method11096(Blocks.ANCIENT_DEBRIS);
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
      this.method11096(Blocks.WARPED_ROOTS);
      this.method11096(Blocks.CRIMSON_ROOTS);
      this.method11094(Blocks.FARMLAND, Blocks.DIRT);
      this.method11094(Blocks.TRIPWIRE, Items.field37838);
      this.method11094(Blocks.GRASS_PATH, Blocks.DIRT);
      this.method11094(Blocks.KELP_PLANT, Blocks.KELP);
      this.method11094(Blocks.BAMBOO_SAPLING, Blocks.BAMBOO);
      this.method11097(Blocks.STONE, var0 -> method11066(var0, Blocks.COBBLESTONE));
      this.method11097(Blocks.GRASS_BLOCK, var0 -> method11066(var0, Blocks.DIRT));
      this.method11097(Blocks.PODZOL, var0 -> method11066(var0, Blocks.DIRT));
      this.method11097(Blocks.MYCELIUM, var0 -> method11066(var0, Blocks.DIRT));
      this.method11097(Blocks.TUBE_CORAL_BLOCK, var0 -> method11066(var0, Blocks.DEAD_TUBE_CORAL_BLOCK));
      this.method11097(Blocks.BRAIN_CORAL_BLOCK, var0 -> method11066(var0, Blocks.DEAD_BRAIN_CORAL_BLOCK));
      this.method11097(Blocks.BUBBLE_CORAL_BLOCK, var0 -> method11066(var0, Blocks.DEAD_BUBBLE_CORAL_BLOCK));
      this.method11097(Blocks.FIRE_CORAL_BLOCK, var0 -> method11066(var0, Blocks.DEAD_FIRE_CORAL_BLOCK));
      this.method11097(Blocks.HORN_CORAL_BLOCK, var0 -> method11066(var0, Blocks.DEAD_HORN_CORAL_BLOCK));
      this.method11097(Blocks.CRIMSON_NYLIUM, var0 -> method11066(var0, Blocks.NETHERRACK));
      this.method11097(Blocks.WARPED_NYLIUM, var0 -> method11066(var0, Blocks.NETHERRACK));
      this.method11097(Blocks.BOOKSHELF, var0 -> method11068(var0, Items.field37900, Class6871.method20919(3)));
      this.method11097(Blocks.CLAY, var0 -> method11068(var0, Items.field37897, Class6871.method20919(4)));
      this.method11097(Blocks.ENDER_CHEST, var0 -> method11068(var0, Blocks.OBSIDIAN, Class6871.method20919(8)));
      this.method11097(Blocks.SNOW_BLOCK, var0 -> method11068(var0, Items.SNOWBALL, Class6871.method20919(4)));
      this.method11098(Blocks.CHORUS_PLANT, method11067(Items.field38109, Class6872.method20921(0.0F, 1.0F)));
      this.method11092(Blocks.POTTED_OAK_SAPLING);
      this.method11092(Blocks.POTTED_SPRUCE_SAPLING);
      this.method11092(Blocks.POTTED_BIRCH_SAPLING);
      this.method11092(Blocks.POTTED_JUNGLE_SAPLING);
      this.method11092(Blocks.POTTED_ACACIA_SAPLING);
      this.method11092(Blocks.POTTED_DARK_OAK_SAPLING);
      this.method11092(Blocks.POTTED_FERN);
      this.method11092(Blocks.POTTED_DANDELION);
      this.method11092(Blocks.POTTED_POPPY);
      this.method11092(Blocks.POTTED_BLUE_ORCHID);
      this.method11092(Blocks.POTTED_ALLIUM);
      this.method11092(Blocks.POTTED_AZURE_BLUET);
      this.method11092(Blocks.POTTED_RED_TULIP);
      this.method11092(Blocks.POTTED_ORANGE_TULIP);
      this.method11092(Blocks.POTTED_WHITE_TULIP);
      this.method11092(Blocks.POTTED_PINK_TULIP);
      this.method11092(Blocks.POTTED_OXEYE_DAISY);
      this.method11092(Blocks.POTTED_CORNFLOWER);
      this.method11092(Blocks.POTTED_LILY_OF_THE_VALLEY);
      this.method11092(Blocks.POTTED_WITHER_ROSE);
      this.method11092(Blocks.POTTED_RED_MUSHROOM);
      this.method11092(Blocks.POTTED_BROWN_MUSHROOM);
      this.method11092(Blocks.POTTED_DEAD_BUSH);
      this.method11092(Blocks.POTTED_CACTUS);
      this.method11092(Blocks.POTTED_BAMBOO);
      this.method11092(Blocks.POTTED_CRIMSON_FUNGUS);
      this.method11092(Blocks.POTTED_WARPED_FUNGUS);
      this.method11092(Blocks.POTTED_CRIMSON_ROOTS);
      this.method11092(Blocks.field37128);
      this.method11097(Blocks.ACACIA_SLAB, Class2838::method11071);
      this.method11097(Blocks.BIRCH_SLAB, Class2838::method11071);
      this.method11097(Blocks.BRICK_SLAB, Class2838::method11071);
      this.method11097(Blocks.COBBLESTONE_SLAB, Class2838::method11071);
      this.method11097(Blocks.DARK_OAK_SLAB, Class2838::method11071);
      this.method11097(Blocks.DARK_PRISMARINE_SLAB, Class2838::method11071);
      this.method11097(Blocks.JUNGLE_SLAB, Class2838::method11071);
      this.method11097(Blocks.NETHER_BRICK_SLAB, Class2838::method11071);
      this.method11097(Blocks.OAK_SLAB, Class2838::method11071);
      this.method11097(Blocks.PETRIFIED_OAK_SLAB, Class2838::method11071);
      this.method11097(Blocks.PRISMARINE_BRICK_SLAB, Class2838::method11071);
      this.method11097(Blocks.PRISMARINE_SLAB, Class2838::method11071);
      this.method11097(Blocks.PURPUR_SLAB, Class2838::method11071);
      this.method11097(Blocks.QUARTZ_SLAB, Class2838::method11071);
      this.method11097(Blocks.RED_SANDSTONE_SLAB, Class2838::method11071);
      this.method11097(Blocks.SANDSTONE_SLAB, Class2838::method11071);
      this.method11097(Blocks.CUT_RED_SANDSTONE_SLAB, Class2838::method11071);
      this.method11097(Blocks.CUT_SANDSTONE_SLAB, Class2838::method11071);
      this.method11097(Blocks.SPRUCE_SLAB, Class2838::method11071);
      this.method11097(Blocks.STONE_BRICK_SLAB, Class2838::method11071);
      this.method11097(Blocks.STONE_SLAB, Class2838::method11071);
      this.method11097(Blocks.SMOOTH_STONE_SLAB, Class2838::method11071);
      this.method11097(Blocks.POLISHED_GRANITE_SLAB, Class2838::method11071);
      this.method11097(Blocks.SMOOTH_RED_SANDSTONE_SLAB, Class2838::method11071);
      this.method11097(Blocks.MOSSY_STONE_BRICK_SLAB, Class2838::method11071);
      this.method11097(Blocks.POLISHED_DIORITE_SLAB, Class2838::method11071);
      this.method11097(Blocks.MOSSY_COBBLESTONE_SLAB, Class2838::method11071);
      this.method11097(Blocks.END_STONE_BRICK_SLAB, Class2838::method11071);
      this.method11097(Blocks.SMOOTH_SANDSTONE_SLAB, Class2838::method11071);
      this.method11097(Blocks.SMOOTH_QUARTZ_SLAB, Class2838::method11071);
      this.method11097(Blocks.GRANITE_SLAB, Class2838::method11071);
      this.method11097(Blocks.ANDESITE_SLAB, Class2838::method11071);
      this.method11097(Blocks.RED_NETHER_BRICK_SLAB, Class2838::method11071);
      this.method11097(Blocks.POLISHED_ANDESITE_SLAB, Class2838::method11071);
      this.method11097(Blocks.DIORITE_SLAB, Class2838::method11071);
      this.method11097(Blocks.CRIMSON_SLAB, Class2838::method11071);
      this.method11097(Blocks.WARPED_SLAB, Class2838::method11071);
      this.method11097(Blocks.field37133, Class2838::method11071);
      this.method11097(Blocks.field37138, Class2838::method11071);
      this.method11097(Blocks.field37143, Class2838::method11071);
      this.method11097(Blocks.ACACIA_DOOR, Class2838::method11091);
      this.method11097(Blocks.BIRCH_DOOR, Class2838::method11091);
      this.method11097(Blocks.DARK_OAK_DOOR, Class2838::method11091);
      this.method11097(Blocks.IRON_DOOR, Class2838::method11091);
      this.method11097(Blocks.JUNGLE_DOOR, Class2838::method11091);
      this.method11097(Blocks.OAK_DOOR, Class2838::method11091);
      this.method11097(Blocks.SPRUCE_DOOR, Class2838::method11091);
      this.method11097(Blocks.WARPED_DOOR, Class2838::method11091);
      this.method11097(Blocks.CRIMSON_DOOR, Class2838::method11091);
      this.method11097(Blocks.BLACK_BED, var0 -> method11072(var0, BedBlock.field18713, BedPart.HEAD));
      this.method11097(Blocks.BLUE_BED, var0 -> method11072(var0, BedBlock.field18713, BedPart.HEAD));
      this.method11097(Blocks.BROWN_RED, var0 -> method11072(var0, BedBlock.field18713, BedPart.HEAD));
      this.method11097(Blocks.CYAN_BED, var0 -> method11072(var0, BedBlock.field18713, BedPart.HEAD));
      this.method11097(Blocks.GRAY_BED, var0 -> method11072(var0, BedBlock.field18713, BedPart.HEAD));
      this.method11097(Blocks.GREEN_BED, var0 -> method11072(var0, BedBlock.field18713, BedPart.HEAD));
      this.method11097(Blocks.LIGHT_BLUE_BED, var0 -> method11072(var0, BedBlock.field18713, BedPart.HEAD));
      this.method11097(Blocks.LIGHT_GRAY_BED, var0 -> method11072(var0, BedBlock.field18713, BedPart.HEAD));
      this.method11097(Blocks.LIME_BED, var0 -> method11072(var0, BedBlock.field18713, BedPart.HEAD));
      this.method11097(Blocks.MAGENTA_BED, var0 -> method11072(var0, BedBlock.field18713, BedPart.HEAD));
      this.method11097(Blocks.PURPLE_BED, var0 -> method11072(var0, BedBlock.field18713, BedPart.HEAD));
      this.method11097(Blocks.ORANGE_BED, var0 -> method11072(var0, BedBlock.field18713, BedPart.HEAD));
      this.method11097(Blocks.PINK_BED, var0 -> method11072(var0, BedBlock.field18713, BedPart.HEAD));
      this.method11097(Blocks.RED_BED, var0 -> method11072(var0, BedBlock.field18713, BedPart.HEAD));
      this.method11097(Blocks.WHITE_BED, var0 -> method11072(var0, BedBlock.field18713, BedPart.HEAD));
      this.method11097(Blocks.YELLOW_BED, var0 -> method11072(var0, BedBlock.field18713, BedPart.HEAD));
      this.method11097(Blocks.LILAC, var0 -> method11072(var0, Class3456.field19276, DoubleBlockHalf.field210));
      this.method11097(Blocks.SUNFLOWER, var0 -> method11072(var0, Class3456.field19276, DoubleBlockHalf.field210));
      this.method11097(Blocks.PEONY, var0 -> method11072(var0, Class3456.field19276, DoubleBlockHalf.field210));
      this.method11097(Blocks.ROSE_BUSH, var0 -> method11072(var0, Class3456.field19276, DoubleBlockHalf.field210));
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
                           Class4695.method14724(Items.field37916)
                              .method18296(
                                 Class140.method420(Class6871.method20919(3))
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3197.field18479, 2)))
                              )
                        )
                     )
               )
      );
      this.method11097(
         Blocks.SEA_PICKLE,
         var0 -> Class7318.method23188()
               .method18320(
                  Class8894.method32373()
                     .method18289(Class6871.method20919(1))
                     .method18291(
                        (Class5873<?>)method11059(
                           Blocks.SEA_PICKLE,
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
         Blocks.COMPOSTER,
         var0 -> Class7318.method23188()
               .method18320(Class8894.method32373().method18291((Class5873<?>)method11059(var0, Class4695.method14724(Items.field38157))))
               .method18320(
                  Class8894.method32373()
                     .method18291(Class4695.method14724(Items.field37934))
                     .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3475.field19326, 8)))
               )
      );
      this.method11097(Blocks.BEACON, Class2838::method11073);
      this.method11097(Blocks.BREWING_STAND, Class2838::method11073);
      this.method11097(Blocks.CHEST, Class2838::method11073);
      this.method11097(Blocks.DISPENSER, Class2838::method11073);
      this.method11097(Blocks.DROPPER, Class2838::method11073);
      this.method11097(Blocks.ENCHANTING_TABLE, Class2838::method11073);
      this.method11097(Blocks.FURNACE, Class2838::method11073);
      this.method11097(Blocks.HOPPER, Class2838::method11073);
      this.method11097(Blocks.TRAPPED_CHEST, Class2838::method11073);
      this.method11097(Blocks.SMOKER, Class2838::method11073);
      this.method11097(Blocks.BLAST_FURNACE, Class2838::method11073);
      this.method11097(Blocks.BARREL, Class2838::method11073);
      this.method11097(Blocks.CARTOGRAPHY_TABLE, Class2838::method11073);
      this.method11097(Blocks.FLETCHING_TABLE, Class2838::method11073);
      this.method11097(Blocks.GRINDSTONE, Class2838::method11073);
      this.method11097(Blocks.LECTERN, Class2838::method11073);
      this.method11097(Blocks.SMITHING_TABLE, Class2838::method11073);
      this.method11097(Blocks.STONECUTTER, Class2838::method11073);
      this.method11097(Blocks.BELL, Class2838::method11061);
      this.method11097(Blocks.LANTERN, Class2838::method11061);
      this.method11097(Blocks.SOUL_LANTERN, Class2838::method11061);
      this.method11097(Blocks.SHULKER_BOX, Class2838::method11074);
      this.method11097(Blocks.BLACK_SHULKER_BOX, Class2838::method11074);
      this.method11097(Blocks.BLUE_SHULKER_BOX, Class2838::method11074);
      this.method11097(Blocks.BROWN_SHULKER_BOX, Class2838::method11074);
      this.method11097(Blocks.CYAN_SHULKER_BOX, Class2838::method11074);
      this.method11097(Blocks.GRAY_SHULKER_BOX, Class2838::method11074);
      this.method11097(Blocks.GREEN_SHULKER_BOX, Class2838::method11074);
      this.method11097(Blocks.LIGHT_BLUE_SHULKER_BOX, Class2838::method11074);
      this.method11097(Blocks.LIGHT_GRAY_SHULKER_BOX, Class2838::method11074);
      this.method11097(Blocks.LIME_SHULKER_BOX, Class2838::method11074);
      this.method11097(Blocks.MAGENTA_SHULKER_BOX, Class2838::method11074);
      this.method11097(Blocks.ORANGE_SHULKER_BOX, Class2838::method11074);
      this.method11097(Blocks.PINK_SHULKER_BOX, Class2838::method11074);
      this.method11097(Blocks.PURPLE_SHULKER_BOX, Class2838::method11074);
      this.method11097(Blocks.RED_SHULKER_BOX, Class2838::method11074);
      this.method11097(Blocks.WHITE_SHULKER_BOX, Class2838::method11074);
      this.method11097(Blocks.YELLOW_SHULKER_BOX, Class2838::method11074);
      this.method11097(Blocks.BLACK_BANNER, Class2838::method11075);
      this.method11097(Blocks.BLUE_BANNER, Class2838::method11075);
      this.method11097(Blocks.BROWN_BANNER, Class2838::method11075);
      this.method11097(Blocks.CYAN_BANNER, Class2838::method11075);
      this.method11097(Blocks.GRAY_BANNER, Class2838::method11075);
      this.method11097(Blocks.GREEN_BANNER, Class2838::method11075);
      this.method11097(Blocks.LIGHT_BLUE_BANNER, Class2838::method11075);
      this.method11097(Blocks.LIGHT_GRAY_BANNER, Class2838::method11075);
      this.method11097(Blocks.LIME_BANNER, Class2838::method11075);
      this.method11097(Blocks.MAGENTA_BANNER, Class2838::method11075);
      this.method11097(Blocks.ORANGE_BANNER, Class2838::method11075);
      this.method11097(Blocks.PINK_BANNER, Class2838::method11075);
      this.method11097(Blocks.PURPLE_BANNER, Class2838::method11075);
      this.method11097(Blocks.RED_BANNER, Class2838::method11075);
      this.method11097(Blocks.WHITE_BANNER, Class2838::method11075);
      this.method11097(Blocks.YELLOW_BANNER, Class2838::method11075);
      this.method11097(
         Blocks.PLAYER_HEAD,
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
      this.method11097(Blocks.BEE_NEST, Class2838::method11076);
      this.method11097(Blocks.BEEHIVE, Class2838::method11077);
      this.method11097(Blocks.BIRCH_LEAVES, var0 -> method11084(var0, Blocks.BIRCH_SAPLING, field17634));
      this.method11097(Blocks.ACACIA_LEAVES, var0 -> method11084(var0, Blocks.ACACIA_SAPLING, field17634));
      this.method11097(Blocks.JUNGLE_LEAVES, var0 -> method11084(var0, Blocks.JUNGLE_SAPLING, field17635));
      this.method11097(Blocks.SPRUCE_LEAVES, var0 -> method11084(var0, Blocks.SPRUCE_SAPLING, field17634));
      this.method11097(Blocks.OAK_LEAVES, var0 -> method11085(var0, Blocks.OAK_SAPLING, field17634));
      this.method11097(Blocks.DARK_OAK_LEAVES, var0 -> method11085(var0, Blocks.DARK_OAK_SAPLING, field17634));
      Class7520 var4 = Class161.method486(Blocks.BEETROOTS).method24519(Class9178.method34325().method34327(Class3482.field19337, 3));
      this.method11098(Blocks.BEETROOTS, method11086(Blocks.BEETROOTS, Items.field38111, Items.field38112, var4));
      Class7520 var5 = Class161.method486(Blocks.WHEAT).method24519(Class9178.method34325().method34327(WheatBlock.field19334, 7));
      this.method11098(Blocks.WHEAT, method11086(Blocks.WHEAT, Items.field37842, Items.field37841, var5));
      Class7520 var6 = Class161.method486(Blocks.CARROTS).method24519(Class9178.method34325().method34327(Class3483.field19334, 7));
      this.method11098(
         Blocks.CARROTS,
         method11059(
            Blocks.CARROTS,
            Class7318.method23188()
               .method18320(Class8894.method32373().method18291(Class4695.method14724(Items.field38052)))
               .method18320(
                  Class8894.method32373()
                     .method18297(var6)
                     .method18291(Class4695.method14724(Items.field38052).method18296(Class138.method406(Enchantments.FORTUNE, 0.5714286F, 3)))
               )
         )
      );
      Class7520 var7 = Class161.method486(Blocks.POTATOES).method24519(Class9178.method34325().method34327(Class3481.field19334, 7));
      this.method11098(
         Blocks.POTATOES,
         method11059(
            Blocks.POTATOES,
            Class7318.method23188()
               .method18320(Class8894.method32373().method18291(Class4695.method14724(Items.field38053)))
               .method18320(
                  Class8894.method32373()
                     .method18297(var7)
                     .method18291(Class4695.method14724(Items.field38053).method18296(Class138.method406(Enchantments.FORTUNE, 0.5714286F, 3)))
               )
               .method18320(
                  Class8894.method32373().method18297(var7).method18291(Class4695.method14724(Items.field38055).method18297(Class151.method456(0.02F)))
               )
         )
      );
      this.method11097(
         Blocks.SWEET_BERRY_BUSH,
         var0 -> method11059(
               var0,
               Class7318.method23188()
                  .method18320(
                     Class8894.method32373()
                        .method18297(Class161.method486(Blocks.SWEET_BERRY_BUSH).method24519(Class9178.method34325().method34327(Class3484.field19342, 3)))
                        .method18291(Class4695.method14724(Items.field38170))
                        .method18296(Class140.method420(Class6872.method20921(2.0F, 3.0F)))
                        .method18296(Class138.method408(Enchantments.FORTUNE))
                  )
                  .method18320(
                     Class8894.method32373()
                        .method18297(Class161.method486(Blocks.SWEET_BERRY_BUSH).method24519(Class9178.method34325().method34327(Class3484.field19342, 2)))
                        .method18291(Class4695.method14724(Items.field38170))
                        .method18296(Class140.method420(Class6872.method20921(1.0F, 2.0F)))
                        .method18296(Class138.method408(Enchantments.FORTUNE))
                  )
            )
      );
      this.method11097(Blocks.BROWN_MUSHROOM_BLOCK, var0 -> method11079(var0, Blocks.BROWN_MUSHROOM));
      this.method11097(Blocks.RED_MUSHROOM_BLOCK, var0 -> method11079(var0, Blocks.RED_MUSHROOM));
      this.method11097(Blocks.COAL_ORE, var0 -> method11078(var0, Items.field37798));
      this.method11097(Blocks.EMERALD_ORE, var0 -> method11078(var0, Items.EMERALD));
      this.method11097(Blocks.NETHER_QUARTZ_ORE, var0 -> method11078(var0, Items.field38072));
      this.method11097(Blocks.DIAMOND_ORE, var0 -> method11078(var0, Items.field37800));
      this.method11097(
         Blocks.NETHER_GOLD_ORE,
         var0 -> method11063(
               var0,
               (Class5873<?>)method11059(
                  var0,
                  Class4695.method14724(Items.field37969)
                     .method18296(Class140.method420(Class6872.method20921(2.0F, 6.0F)))
                     .method18296(Class138.method407(Enchantments.FORTUNE))
               )
            )
      );
      this.method11097(
         Blocks.LAPIS_ORE,
         var0 -> method11063(
               var0,
               (Class5873<?>)method11059(
                  var0,
                  Class4695.method14724(Items.field37917)
                     .method18296(Class140.method420(Class6872.method20921(4.0F, 9.0F)))
                     .method18296(Class138.method407(Enchantments.FORTUNE))
               )
            )
      );
      this.method11097(Blocks.COBWEB, var0 -> method11065(var0, (Class5873<?>)method11060(var0, Class4695.method14724(Items.field37838))));
      this.method11097(
         Blocks.DEAD_BUSH,
         var0 -> method11064(
               var0,
               (Class5873<?>)method11059(var0, Class4695.method14724(Items.field37835).method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F))))
            )
      );
      this.method11097(Blocks.NETHER_SPROUTS, Class2838::method11083);
      this.method11097(Blocks.SEAGRASS, Class2838::method11083);
      this.method11097(Blocks.VINE, Class2838::method11083);
      this.method11098(Blocks.TALL_SEAGRASS, method11087(Blocks.SEAGRASS));
      this.method11097(Blocks.LARGE_FERN, var0 -> method11088(var0, Blocks.FERN));
      this.method11097(Blocks.TALL_GRASS, var0 -> method11088(var0, Blocks.GRASS));
      this.method11097(Blocks.MELON_STEM, var0 -> method11081(var0, Items.field37960));
      this.method11097(Blocks.ATTACHED_MELON_STEM, var0 -> method11082(var0, Items.field37960));
      this.method11097(Blocks.PUMPKIN_STEM, var0 -> method11081(var0, Items.field37959));
      this.method11097(Blocks.ATTACHED_PUMPKIN_STEM, var0 -> method11082(var0, Items.field37959));
      this.method11097(
         Blocks.CHORUS_FLOWER,
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
         Blocks.GLOWSTONE,
         var0 -> method11063(
               var0,
               (Class5873<?>)method11059(
                  var0,
                  Class4695.method14724(Items.field37908)
                     .method18296(Class140.method420(Class6872.method20921(2.0F, 4.0F)))
                     .method18296(Class138.method408(Enchantments.FORTUNE))
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
                  Class4695.method14724(Items.field37957)
                     .method18296(Class140.method420(Class6872.method20921(3.0F, 7.0F)))
                     .method18296(Class138.method408(Enchantments.FORTUNE))
                     .method18296(Class135.method396(Class12.method60(9)))
               )
            )
      );
      this.method11097(
         Blocks.REDSTONE_ORE,
         var0 -> method11063(
               var0,
               (Class5873<?>)method11059(
                  var0,
                  Class4695.method14724(Items.REDSTONE_DUST)
                     .method18296(Class140.method420(Class6872.method20921(4.0F, 5.0F)))
                     .method18296(Class138.method408(Enchantments.FORTUNE))
               )
            )
      );
      this.method11097(
         Blocks.SEA_LANTERN,
         var0 -> method11063(
               var0,
               (Class5873<?>)method11059(
                  var0,
                  Class4695.method14724(Items.field38076)
                     .method18296(Class140.method420(Class6872.method20921(2.0F, 3.0F)))
                     .method18296(Class138.method408(Enchantments.FORTUNE))
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
                           Class4695.method14724(Items.field37970)
                              .method18296(
                                 Class140.method420(Class6872.method20921(2.0F, 4.0F))
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3489.field19354, 3)))
                              )
                              .method18296(
                                 Class138.method408(Enchantments.FORTUNE)
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
                                 Class4695.method14724(Items.SNOWBALL)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 1))),
                                 Class4695.method14724(Items.SNOWBALL)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 2)))
                                    .method18296(Class140.method420(Class6871.method20919(2))),
                                 Class4695.method14724(Items.SNOWBALL)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 3)))
                                    .method18296(Class140.method420(Class6871.method20919(3))),
                                 Class4695.method14724(Items.SNOWBALL)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 4)))
                                    .method18296(Class140.method420(Class6871.method20919(4))),
                                 Class4695.method14724(Items.SNOWBALL)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 5)))
                                    .method18296(Class140.method420(Class6871.method20919(5))),
                                 Class4695.method14724(Items.SNOWBALL)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 6)))
                                    .method18296(Class140.method420(Class6871.method20919(6))),
                                 Class4695.method14724(Items.SNOWBALL)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 7)))
                                    .method18296(Class140.method420(Class6871.method20919(7))),
                                 Class4695.method14724(Items.SNOWBALL).method18296(Class140.method420(Class6871.method20919(8)))
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
                  Class4695.method14724(Items.field37868)
                     .method18297(Class158.method476(Enchantments.FORTUNE, 0.1F, 0.14285715F, 0.25F, 1.0F))
                     .method18303(Class4695.method14724(var0))
               )
            )
      );
      this.method11097(
         Blocks.CAMPFIRE,
         var0 -> method11063(
               var0, (Class5873<?>)method11060(var0, Class4695.method14724(Items.field37799).method18296(Class140.method420(Class6871.method20919(2))))
            )
      );
      this.method11097(
         Blocks.field37141,
         var0 -> method11063(
               var0,
               method11060(
                  var0,
                  Class4695.method14724(Items.field37969)
                     .method18296(Class140.method420(Class6872.method20921(2.0F, 5.0F)))
                     .method18297(Class158.method476(Enchantments.FORTUNE, 0.1F, 0.14285715F, 0.25F, 1.0F))
                     .method18303(Class4695.method14724(var0))
               )
            )
      );
      this.method11097(
         Blocks.SOUL_CAMPFIRE,
         var0 -> method11063(
               var0, (Class5873<?>)method11060(var0, Class4695.method14724(Items.field37442).method18296(Class140.method420(Class6871.method20919(1))))
            )
      );
      this.method11095(Blocks.GLASS_BLOCK);
      this.method11095(Blocks.WHITE_STAINED_GLASS);
      this.method11095(Blocks.ORANGE_STAINED_GLASS);
      this.method11095(Blocks.MAGENTA_STAINED_GLASS);
      this.method11095(Blocks.LIGHT_BLUE_STAINED_GLASS);
      this.method11095(Blocks.YELLOW_STAINED_GLASS);
      this.method11095(Blocks.LIME_STAINED_GLASS);
      this.method11095(Blocks.PINK_STAINED_GLASS);
      this.method11095(Blocks.GRAY_STAINED_GLASS);
      this.method11095(Blocks.LIGHT_GRAY_STAINED_GLASS);
      this.method11095(Blocks.CYAN_STAINED_GLASS);
      this.method11095(Blocks.PURPLE_STAINED_GLASS);
      this.method11095(Blocks.BLUE_STAINED_GLASS);
      this.method11095(Blocks.BROWN_STAINED_GLASS);
      this.method11095(Blocks.GREEN_STAINED_GLASS);
      this.method11095(Blocks.RED_STAINED_GLASS);
      this.method11095(Blocks.BLACK_STAINED_GLASS);
      this.method11095(Blocks.GLASS_PANE);
      this.method11095(Blocks.WHITE_STAINED_GLASS_PANE);
      this.method11095(Blocks.ORANGE_STAINED_GLASS_PANE);
      this.method11095(Blocks.MAGENTA_STAINED_GLASS_PANE);
      this.method11095(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE);
      this.method11095(Blocks.YELLOW_STAINED_GLASS_PANE);
      this.method11095(Blocks.LIME_STAINED_GLASS_PANE);
      this.method11095(Blocks.PINK_STAINED_GLASS_PANE);
      this.method11095(Blocks.GRAY_STAINED_GLASS_PANE);
      this.method11095(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE);
      this.method11095(Blocks.CYAN_STAINED_GLASS_PANE);
      this.method11095(Blocks.PURPLE_STAINED_GLASS_PANE);
      this.method11095(Blocks.BLUE_STAINED_GLASS_PANE);
      this.method11095(Blocks.BROWN_STAINED_GLASS_PANE);
      this.method11095(Blocks.GREEN_STAINED_GLASS_PANE);
      this.method11095(Blocks.field36760);
      this.method11095(Blocks.BLACK_STAINED_GLASS_PANE);
      this.method11095(Blocks.ICE);
      this.method11095(Blocks.PACKED_ICE);
      this.method11095(Blocks.BLUE_ICE);
      this.method11095(Blocks.TURTLE_EGG);
      this.method11095(Blocks.MUSHROOM_STEM);
      this.method11095(Blocks.DEAD_TUBE_CORAL);
      this.method11095(Blocks.DEAD_BRAIN_CORAL);
      this.method11095(Blocks.DEAD_BUBBLE_CORAL);
      this.method11095(Blocks.DEAD_FIRE_CORAL);
      this.method11095(Blocks.DEAD_HORN_CORAL);
      this.method11095(Blocks.TUBE_CORAL);
      this.method11095(Blocks.BRAIN_CORAL);
      this.method11095(Blocks.BUBBLE_CORAL);
      this.method11095(Blocks.FIRE_CORAL);
      this.method11095(Blocks.HORN_CORAL);
      this.method11095(Blocks.DEAD_TUBE_CORAL_FAN);
      this.method11095(Blocks.DEAD_BRAIN_CORAL_FAN);
      this.method11095(Blocks.DEAD_BUBBLE_CORAL_FAN);
      this.method11095(Blocks.DEAD_FIRE_CORAL_FAN);
      this.method11095(Blocks.DEAD_HORN_CORAL_FAN);
      this.method11095(Blocks.TUBE_CORAL_FAN);
      this.method11095(Blocks.BRAIN_CORAL_FAN);
      this.method11095(Blocks.BUBBLE_CORAL_FAN);
      this.method11095(Blocks.FIRE_CORAL_FAN);
      this.method11095(Blocks.HORN_CORAL_FAN);
      this.method11093(Blocks.INFESTED_STONE, Blocks.STONE);
      this.method11093(Blocks.INFESTED_COBBLESTONE, Blocks.COBBLESTONE);
      this.method11093(Blocks.INFESTED_STONE_BRICKS, Blocks.STONE_BRICKS);
      this.method11093(Blocks.INFESTED_MOSSY_STONE_BRICKS, Blocks.MOSSY_STONE_BRICKS);
      this.method11093(Blocks.INFESTED_CRACKED_STONE_BRICKS, Blocks.CRACKED_STONE_BRICKS);
      this.method11093(Blocks.INFESTED_CHISELED_STONE_BRICKS, Blocks.CHISELED_STONE_BRICKS);
      this.method11090(Blocks.WEEPING_VINES, Blocks.WEEPING_VINES_PLANT);
      this.method11090(Blocks.TWISTING_VINES, Blocks.TWISTING_VINES_PLANT);
      this.method11098(Blocks.CAKE, method11089());
      this.method11098(Blocks.FROSTED_ICE, method11089());
      this.method11098(Blocks.SPAWNER, method11089());
      this.method11098(Blocks.FIRE, method11089());
      this.method11098(Blocks.SOUL_FIRE, method11089());
      this.method11098(Blocks.NETHER_PORTAL, method11089());
      HashSet var8 = Sets.newHashSet();

      for (Block var10 : Registry.BLOCK) {
         ResourceLocation var11 = var10.method11999();
         if (var11 != Class8793.field39533 && var8.add(var11)) {
            Class5888 var12 = this.field17636.remove(var11);
            if (var12 == null) {
               throw new IllegalStateException(String.format("Missing loottable '%s' for '%s'", var11, Registry.BLOCK.getKey(var10)));
            }

            var1.accept(var11, var12);
         }
      }

      if (!this.field17636.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.field17636.keySet());
      }
   }

   private void method11090(Block var1, Block var2) {
      Class5888 var5 = method11065(var1, Class4695.method14724(var1).method18297(Class158.method476(Enchantments.FORTUNE, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.method11098(var1, var5);
      this.method11098(var2, var5);
   }

   public static Class5888 method11091(Block var0) {
      return method11072(var0, DoorBlock.DOUBLE_BLOCK_HALF, DoubleBlockHalf.field210);
   }

   public void method11092(Block var1) {
      this.method11097(var1, var0 -> method11070(((Class3460)var0).method12137()));
   }

   public void method11093(Block var1, Block var2) {
      this.method11098(var1, method11069(var2));
   }

   public void method11094(Block var1, IItemProvider var2) {
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
