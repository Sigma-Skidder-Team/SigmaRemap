package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.block.Blocks;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;

public class Class8523 {
   private static final Class7872 field38248 = new Class7872(
      new Class6439(Blocks.field37130, 0.01F), Class6435.field28275, Blocks.field37141.getDefaultState()
   );
   private static final Class7872 field38249 = new Class7872(
      new Class6439(Blocks.field37141, 0.5F), Class6435.field28275, Blocks.field37130.getDefaultState()
   );
   public static final Class3622 field38250 = method30211("empty", ImmutableList.of());
   public static final Class3622 field38251 = method30211(
      "zombie_plains",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6439(Blocks.COBBLESTONE, 0.8F), Class6435.field28275, Blocks.MOSSY_COBBLESTONE.getDefaultState()),
               new Class7872(new Class6437(BlockTags.field32748), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6438(Blocks.TORCH), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6438(Blocks.WALL_TORCH), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6439(Blocks.COBBLESTONE, 0.07F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.MOSSY_COBBLESTONE, 0.07F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.field36730, 0.07F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.OAK_LOG, 0.05F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.OAK_PLANKS, 0.1F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.OAK_STAIRS, 0.1F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.STRIPPED_OAK_LOG, 0.02F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.GLASS_PANE, 0.5F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872[]{
                  new Class7872(
                     new Class6433(
                        Blocks.GLASS_PANE
                           .getDefaultState()
                           .with(Class3237.field18680, Boolean.valueOf(true))
                           .with(Class3237.field18682, Boolean.valueOf(true))
                     ),
                     Class6435.field28275,
                     Blocks.field36758
                        .getDefaultState()
                        .with(Class3237.field18680, Boolean.valueOf(true))
                        .with(Class3237.field18682, Boolean.valueOf(true))
                  ),
                  new Class7872(
                     new Class6433(
                        Blocks.GLASS_PANE
                           .getDefaultState()
                           .with(Class3237.field18681, Boolean.valueOf(true))
                           .with(Class3237.field18683, Boolean.valueOf(true))
                     ),
                     Class6435.field28275,
                     Blocks.field36758
                        .getDefaultState()
                        .with(Class3237.field18681, Boolean.valueOf(true))
                        .with(Class3237.field18683, Boolean.valueOf(true))
                  ),
                  new Class7872(new Class6439(Blocks.WHEAT, 0.3F), Class6435.field28275, Blocks.CARROTS.getDefaultState()),
                  new Class7872(new Class6439(Blocks.WHEAT, 0.2F), Class6435.field28275, Blocks.POTATOES.getDefaultState()),
                  new Class7872(new Class6439(Blocks.WHEAT, 0.1F), Class6435.field28275, Blocks.field36884.getDefaultState())
               }
            )
         )
      )
   );
   public static final Class3622 field38252 = method30211(
      "zombie_savanna",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6437(BlockTags.field32748), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6438(Blocks.TORCH), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6438(Blocks.WALL_TORCH), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6439(Blocks.ACACIA_PLANKS, 0.2F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.field36762, 0.2F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.ACACIA_LOG, 0.05F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.ACACIA_WOOD, 0.05F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.field36731, 0.05F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.field36734, 0.05F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.field36744, 0.05F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.GLASS_PANE, 0.5F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(
                  new Class6433(
                     Blocks.GLASS_PANE
                        .getDefaultState()
                        .with(Class3237.field18680, Boolean.valueOf(true))
                        .with(Class3237.field18682, Boolean.valueOf(true))
                  ),
                  Class6435.field28275,
                  Blocks.field36758
                     .getDefaultState()
                     .with(Class3237.field18680, Boolean.valueOf(true))
                     .with(Class3237.field18682, Boolean.valueOf(true))
               ),
               new Class7872[]{
                  new Class7872(
                     new Class6433(
                        Blocks.GLASS_PANE
                           .getDefaultState()
                           .with(Class3237.field18681, Boolean.valueOf(true))
                           .with(Class3237.field18683, Boolean.valueOf(true))
                     ),
                     Class6435.field28275,
                     Blocks.field36758
                        .getDefaultState()
                        .with(Class3237.field18681, Boolean.valueOf(true))
                        .with(Class3237.field18683, Boolean.valueOf(true))
                  ),
                  new Class7872(new Class6439(Blocks.WHEAT, 0.1F), Class6435.field28275, Blocks.MELON_STEM.getDefaultState())
               }
            )
         )
      )
   );
   public static final Class3622 field38253 = method30211(
      "zombie_snowy",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6437(BlockTags.field32748), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6438(Blocks.TORCH), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6438(Blocks.WALL_TORCH), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6438(Blocks.LANTERN), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6439(Blocks.SPRUCE_PLANKS, 0.2F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.field36840, 0.4F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.STRIPPED_SPRUCE_LOG, 0.05F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.STRIPPED_SPRUCE_WOOD, 0.05F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.GLASS_PANE, 0.5F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(
                  new Class6433(
                     Blocks.GLASS_PANE
                        .getDefaultState()
                        .with(Class3237.field18680, Boolean.valueOf(true))
                        .with(Class3237.field18682, Boolean.valueOf(true))
                  ),
                  Class6435.field28275,
                  Blocks.field36758
                     .getDefaultState()
                     .with(Class3237.field18680, Boolean.valueOf(true))
                     .with(Class3237.field18682, Boolean.valueOf(true))
               ),
               new Class7872(
                  new Class6433(
                     Blocks.GLASS_PANE
                        .getDefaultState()
                        .with(Class3237.field18681, Boolean.valueOf(true))
                        .with(Class3237.field18683, Boolean.valueOf(true))
                  ),
                  Class6435.field28275,
                  Blocks.field36758
                     .getDefaultState()
                     .with(Class3237.field18681, Boolean.valueOf(true))
                     .with(Class3237.field18683, Boolean.valueOf(true))
               ),
               new Class7872(new Class6439(Blocks.WHEAT, 0.1F), Class6435.field28275, Blocks.CARROTS.getDefaultState()),
               new Class7872[]{new Class7872(new Class6439(Blocks.WHEAT, 0.8F), Class6435.field28275, Blocks.POTATOES.getDefaultState())}
            )
         )
      )
   );
   public static final Class3622 field38254 = method30211(
      "zombie_taiga",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6439(Blocks.COBBLESTONE, 0.8F), Class6435.field28275, Blocks.MOSSY_COBBLESTONE.getDefaultState()),
               new Class7872(new Class6437(BlockTags.field32748), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6438(Blocks.TORCH), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6438(Blocks.WALL_TORCH), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(
                  new Class6438(Blocks.CAMPFIRE),
                  Class6435.field28275,
                  Blocks.CAMPFIRE.getDefaultState().with(Class3244.field18698, Boolean.valueOf(false))
               ),
               new Class7872(new Class6439(Blocks.COBBLESTONE, 0.08F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.SPRUCE_LOG, 0.08F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.GLASS_PANE, 0.5F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(
                  new Class6433(
                     Blocks.GLASS_PANE
                        .getDefaultState()
                        .with(Class3237.field18680, Boolean.valueOf(true))
                        .with(Class3237.field18682, Boolean.valueOf(true))
                  ),
                  Class6435.field28275,
                  Blocks.field36758
                     .getDefaultState()
                     .with(Class3237.field18680, Boolean.valueOf(true))
                     .with(Class3237.field18682, Boolean.valueOf(true))
               ),
               new Class7872(
                  new Class6433(
                     Blocks.GLASS_PANE
                        .getDefaultState()
                        .with(Class3237.field18681, Boolean.valueOf(true))
                        .with(Class3237.field18683, Boolean.valueOf(true))
                  ),
                  Class6435.field28275,
                  Blocks.field36758
                     .getDefaultState()
                     .with(Class3237.field18681, Boolean.valueOf(true))
                     .with(Class3237.field18683, Boolean.valueOf(true))
               ),
               new Class7872(new Class6439(Blocks.WHEAT, 0.3F), Class6435.field28275, Blocks.PUMPKIN_STEM.getDefaultState()),
               new Class7872(new Class6439(Blocks.WHEAT, 0.2F), Class6435.field28275, Blocks.POTATOES.getDefaultState()),
               new Class7872[0]
            )
         )
      )
   );
   public static final Class3622 field38255 = method30211(
      "zombie_desert",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6437(BlockTags.field32748), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6438(Blocks.TORCH), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6438(Blocks.WALL_TORCH), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6439(Blocks.field36859, 0.08F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.CUT_SANDSTONE, 0.1F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.field36794, 0.08F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.field37021, 0.08F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.field37034, 0.08F), Class6435.field28275, Blocks.COBWEB.getDefaultState()),
               new Class7872(new Class6439(Blocks.WHEAT, 0.2F), Class6435.field28275, Blocks.field36884.getDefaultState()),
               new Class7872(new Class6439(Blocks.WHEAT, 0.1F), Class6435.field28275, Blocks.MELON_STEM.getDefaultState())
            )
         )
      )
   );
   public static final Class3622 field38256 = method30211(
      "mossify_10_percent",
      ImmutableList.of(
         new Class7093(ImmutableList.of(new Class7872(new Class6439(Blocks.COBBLESTONE, 0.1F), Class6435.field28275, Blocks.MOSSY_COBBLESTONE.getDefaultState())))
      )
   );
   public static final Class3622 field38257 = method30211(
      "mossify_20_percent",
      ImmutableList.of(
         new Class7093(ImmutableList.of(new Class7872(new Class6439(Blocks.COBBLESTONE, 0.2F), Class6435.field28275, Blocks.MOSSY_COBBLESTONE.getDefaultState())))
      )
   );
   public static final Class3622 field38258 = method30211(
      "mossify_70_percent",
      ImmutableList.of(
         new Class7093(ImmutableList.of(new Class7872(new Class6439(Blocks.COBBLESTONE, 0.7F), Class6435.field28275, Blocks.MOSSY_COBBLESTONE.getDefaultState())))
      )
   );
   public static final Class3622 field38259 = method30211(
      "street_plains",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6438(Blocks.field36885), new Class6438(Blocks.WATER), Blocks.OAK_PLANKS.getDefaultState()),
               new Class7872(new Class6439(Blocks.field36885, 0.1F), Class6435.field28275, Blocks.GRASS_BLOCK.getDefaultState()),
               new Class7872(new Class6438(Blocks.GRASS_BLOCK), new Class6438(Blocks.WATER), Blocks.WATER.getDefaultState()),
               new Class7872(new Class6438(Blocks.DIRT), new Class6438(Blocks.WATER), Blocks.WATER.getDefaultState())
            )
         )
      )
   );
   public static final Class3622 field38260 = method30211(
      "street_savanna",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6438(Blocks.field36885), new Class6438(Blocks.WATER), Blocks.ACACIA_PLANKS.getDefaultState()),
               new Class7872(new Class6439(Blocks.field36885, 0.2F), Class6435.field28275, Blocks.GRASS_BLOCK.getDefaultState()),
               new Class7872(new Class6438(Blocks.GRASS_BLOCK), new Class6438(Blocks.WATER), Blocks.WATER.getDefaultState()),
               new Class7872(new Class6438(Blocks.DIRT), new Class6438(Blocks.WATER), Blocks.WATER.getDefaultState())
            )
         )
      )
   );
   public static final Class3622 field38261 = method30211(
      "street_snowy_or_taiga",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6438(Blocks.field36885), new Class6438(Blocks.WATER), Blocks.SPRUCE_PLANKS.getDefaultState()),
               new Class7872(new Class6439(Blocks.field36885, 0.2F), Class6435.field28275, Blocks.GRASS_BLOCK.getDefaultState()),
               new Class7872(new Class6438(Blocks.GRASS_BLOCK), new Class6438(Blocks.WATER), Blocks.WATER.getDefaultState()),
               new Class7872(new Class6438(Blocks.DIRT), new Class6438(Blocks.WATER), Blocks.WATER.getDefaultState())
            )
         )
      )
   );
   public static final Class3622 field38262 = method30211(
      "farm_plains",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6439(Blocks.WHEAT, 0.3F), Class6435.field28275, Blocks.CARROTS.getDefaultState()),
               new Class7872(new Class6439(Blocks.WHEAT, 0.2F), Class6435.field28275, Blocks.POTATOES.getDefaultState()),
               new Class7872(new Class6439(Blocks.WHEAT, 0.1F), Class6435.field28275, Blocks.field36884.getDefaultState())
            )
         )
      )
   );
   public static final Class3622 field38263 = method30211(
      "farm_savanna",
      ImmutableList.of(
         new Class7093(ImmutableList.of(new Class7872(new Class6439(Blocks.WHEAT, 0.1F), Class6435.field28275, Blocks.MELON_STEM.getDefaultState())))
      )
   );
   public static final Class3622 field38264 = method30211(
      "farm_snowy",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6439(Blocks.WHEAT, 0.1F), Class6435.field28275, Blocks.CARROTS.getDefaultState()),
               new Class7872(new Class6439(Blocks.WHEAT, 0.8F), Class6435.field28275, Blocks.POTATOES.getDefaultState())
            )
         )
      )
   );
   public static final Class3622 field38265 = method30211(
      "farm_taiga",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6439(Blocks.WHEAT, 0.3F), Class6435.field28275, Blocks.PUMPKIN_STEM.getDefaultState()),
               new Class7872(new Class6439(Blocks.WHEAT, 0.2F), Class6435.field28275, Blocks.POTATOES.getDefaultState())
            )
         )
      )
   );
   public static final Class3622 field38266 = method30211(
      "farm_desert",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6439(Blocks.WHEAT, 0.2F), Class6435.field28275, Blocks.field36884.getDefaultState()),
               new Class7872(new Class6439(Blocks.WHEAT, 0.1F), Class6435.field28275, Blocks.MELON_STEM.getDefaultState())
            )
         )
      )
   );
   public static final Class3622 field38267 = method30211("outpost_rot", ImmutableList.of(new Class7094(0.05F)));
   public static final Class3622 field38268 = method30211(
      "bottom_rampart",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6439(Blocks.field36890, 0.75F), Class6435.field28275, Blocks.field37136.getDefaultState()),
               new Class7872(new Class6439(Blocks.field37136, 0.15F), Class6435.field28275, Blocks.field37135.getDefaultState()),
               field38249,
               field38248
            )
         )
      )
   );
   public static final Class3622 field38269 = method30211(
      "treasure_rooms",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6439(Blocks.field37135, 0.35F), Class6435.field28275, Blocks.field37136.getDefaultState()),
               new Class7872(new Class6439(Blocks.field37137, 0.1F), Class6435.field28275, Blocks.field37136.getDefaultState()),
               field38249,
               field38248
            )
         )
      )
   );
   public static final Class3622 field38270 = method30211(
      "housing",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6439(Blocks.field37135, 0.3F), Class6435.field28275, Blocks.field37136.getDefaultState()),
               new Class7872(new Class6439(Blocks.field37130, 1.0E-4F), Class6435.field28275, Blocks.AIR.getDefaultState()),
               field38249,
               field38248
            )
         )
      )
   );
   public static final Class3622 field38271 = method30211(
      "side_wall_degradation",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6439(Blocks.field37137, 0.5F), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6439(Blocks.GOLD_BLOCK, 0.1F), Class6435.field28275, Blocks.field37136.getDefaultState()),
               field38249,
               field38248
            )
         )
      )
   );
   public static final Class3622 field38272 = method30211(
      "stable_degradation",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6439(Blocks.field37135, 0.1F), Class6435.field28275, Blocks.field37136.getDefaultState()),
               new Class7872(new Class6439(Blocks.field37130, 1.0E-4F), Class6435.field28275, Blocks.AIR.getDefaultState()),
               field38249,
               field38248
            )
         )
      )
   );
   public static final Class3622 field38273 = method30211(
      "bastion_generic_degradation",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6439(Blocks.field37135, 0.3F), Class6435.field28275, Blocks.field37136.getDefaultState()),
               new Class7872(new Class6439(Blocks.field37130, 1.0E-4F), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6439(Blocks.GOLD_BLOCK, 0.3F), Class6435.field28275, Blocks.field37136.getDefaultState()),
               field38249,
               field38248
            )
         )
      )
   );
   public static final Class3622 field38274 = method30211(
      "rampart_degradation",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6439(Blocks.field37135, 0.4F), Class6435.field28275, Blocks.field37136.getDefaultState()),
               new Class7872(new Class6439(Blocks.field37130, 0.01F), Class6435.field28275, Blocks.field37136.getDefaultState()),
               new Class7872(new Class6439(Blocks.field37135, 1.0E-4F), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6439(Blocks.field37130, 1.0E-4F), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6439(Blocks.GOLD_BLOCK, 0.3F), Class6435.field28275, Blocks.field37136.getDefaultState()),
               field38249,
               field38248
            )
         )
      )
   );
   public static final Class3622 field38275 = method30211(
      "entrance_replacement",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6439(Blocks.field37137, 0.5F), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6439(Blocks.GOLD_BLOCK, 0.6F), Class6435.field28275, Blocks.field37136.getDefaultState()),
               field38249,
               field38248
            )
         )
      )
   );
   public static final Class3622 field38276 = method30211(
      "bridge",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6439(Blocks.field37135, 0.3F), Class6435.field28275, Blocks.field37136.getDefaultState()),
               new Class7872(new Class6439(Blocks.field37130, 1.0E-4F), Class6435.field28275, Blocks.AIR.getDefaultState())
            )
         )
      )
   );
   public static final Class3622 field38277 = method30211(
      "roof",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6439(Blocks.field37135, 0.3F), Class6435.field28275, Blocks.field37136.getDefaultState()),
               new Class7872(new Class6439(Blocks.field37135, 0.15F), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6439(Blocks.field37135, 0.3F), Class6435.field28275, Blocks.field37130.getDefaultState())
            )
         )
      )
   );
   public static final Class3622 field38278 = method30211(
      "high_wall",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6439(Blocks.field37135, 0.01F), Class6435.field28275, Blocks.AIR.getDefaultState()),
               new Class7872(new Class6439(Blocks.field37135, 0.5F), Class6435.field28275, Blocks.field37136.getDefaultState()),
               new Class7872(new Class6439(Blocks.field37135, 0.3F), Class6435.field28275, Blocks.field37130.getDefaultState()),
               field38249
            )
         )
      )
   );
   public static final Class3622 field38279 = method30211(
      "high_rampart",
      ImmutableList.of(
         new Class7093(
            ImmutableList.of(
               new Class7872(new Class6439(Blocks.GOLD_BLOCK, 0.3F), Class6435.field28275, Blocks.field37136.getDefaultState()),
               new Class7872(
                  Class6435.field28275, Class6435.field28275, new Class8035(0.0F, 0.05F, 0, 100, Direction.Axis.Y), Blocks.AIR.getDefaultState()
               ),
               field38249
            )
         )
      )
   );

   private static Class3622 method30211(String var0, ImmutableList<Class7092> var1) {
      ResourceLocation var4 = new ResourceLocation(var0);
      Class3622 var5 = new Class3622(var1);
      return WorldGenRegistries.<Class3622, Class3622>method20497(WorldGenRegistries.field29428, var4, var5);
   }
}
