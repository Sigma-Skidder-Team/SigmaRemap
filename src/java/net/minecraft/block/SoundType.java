package net.minecraft.block;

import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class SoundType {
   public static final SoundType WOOD = new SoundType(
      1.0F, 1.0F, SoundEvents.BLOCK_WOOD_BREAK, SoundEvents.BLOCK_WOOD_STEP, SoundEvents.BLOCK_WOOD_PLACE, SoundEvents.BLOCK_WOOD_HIT, SoundEvents.BLOCK_WOOD_FALL
   );
   public static final SoundType GRAVEL = new SoundType(
      1.0F, 1.0F, SoundEvents.GRAVEL_BREAK, SoundEvents.GRAVEL_STEP, SoundEvents.GRAVEL_PLACE, SoundEvents.GRAVEL_HIT, SoundEvents.GRAVEL_FALL
   );
   public static final SoundType GRASS = new SoundType(
      1.0F, 1.0F, SoundEvents.GRASS_BREAK, SoundEvents.GRASS_STEP, SoundEvents.GRASS_PLACE, SoundEvents.GRASS_HIT, SoundEvents.GRASS_FALL
   );
   public static final SoundType LILY_PAD = new SoundType(
      1.0F, 1.0F, SoundEvents.GRASS_BREAK, SoundEvents.GRASS_STEP, SoundEvents.LILY_PAD_PLACE, SoundEvents.GRASS_HIT, SoundEvents.GRASS_FALL
   );
   public static final SoundType STONE = new SoundType(
      1.0F, 1.0F, SoundEvents.STONE_BREAK, SoundEvents.STONE_STEP, SoundEvents.STONE_PLACE, SoundEvents.STONE_HIT, SoundEvents.STONE_FALL
   );
   public static final SoundType METAL = new SoundType(
      1.0F, 1.5F, SoundEvents.METAL_BREAK, SoundEvents.METAL_STEP, SoundEvents.METAL_PLACE, SoundEvents.METAL_HIT, SoundEvents.METAL_FALL
   );
   public static final SoundType GLASS = new SoundType(
      1.0F, 1.0F, SoundEvents.GLASS_BREAK, SoundEvents.GLASS_STEP, SoundEvents.GLASS_PLACE, SoundEvents.GLASS_HIT, SoundEvents.GLASS_FALL
   );
   public static final SoundType WOOL = new SoundType(
      1.0F, 1.0F, SoundEvents.WOOL_BREAK, SoundEvents.WOOL_STEP, SoundEvents.WOOL_PLACE, SoundEvents.WOOL_HIT, SoundEvents.WOOL_FALL
   );
   public static final SoundType SAND = new SoundType(
      1.0F, 1.0F, SoundEvents.SAND_BREAK, SoundEvents.SAND_STEP, SoundEvents.SAND_PLACE, SoundEvents.SAND_HIT, SoundEvents.SAND_FALL
   );
   public static final SoundType SNOW = new SoundType(
      1.0F, 1.0F, SoundEvents.SNOW_BREAK, SoundEvents.SNOW_STEP, SoundEvents.SNOW_PLACE, SoundEvents.SNOW_HIT, SoundEvents.SNOW_FALL
   );
   public static final SoundType LADDER = new SoundType(
      1.0F, 1.0F, SoundEvents.LADDER_BREAK, SoundEvents.LADDER_STEP, SoundEvents.LADDER_PLACE, SoundEvents.LADDER_HIT, SoundEvents.LADDER_FALL
   );
   public static final SoundType ANVIL = new SoundType(
      0.3F, 1.0F, SoundEvents.field26340, SoundEvents.field26346, SoundEvents.field26345, SoundEvents.field26343, SoundEvents.field26342
   );
   public static final SoundType SLIME = new SoundType(
      1.0F, 1.0F, SoundEvents.field27077, SoundEvents.field27081, SoundEvents.field27080, SoundEvents.field27079, SoundEvents.field27078
   );
   public static final SoundType HONEY = new SoundType(
      1.0F, 1.0F, SoundEvents.field26660, SoundEvents.field26665, SoundEvents.field26663, SoundEvents.field26662, SoundEvents.field26661
   );
   public static final SoundType WET_GRASS = new SoundType(
      1.0F, 1.0F, SoundEvents.field27228, SoundEvents.field27232, SoundEvents.field27231, SoundEvents.field27230, SoundEvents.field27229
   );
   public static final SoundType CORAL = new SoundType(
      1.0F, 1.0F, SoundEvents.field26472, SoundEvents.field26476, SoundEvents.field26475, SoundEvents.field26474, SoundEvents.field26473
   );
   public static final SoundType BAMBOO = new SoundType(
      1.0F, 1.0F, SoundEvents.field26365, SoundEvents.field26369, SoundEvents.field26368, SoundEvents.field26367, SoundEvents.field26366
   );
   public static final SoundType BAMBOO_SAPLING = new SoundType(
      1.0F, 1.0F, SoundEvents.field26370, SoundEvents.field26369, SoundEvents.field26372, SoundEvents.field26371, SoundEvents.field26366
   );
   public static final SoundType SCAFFOLDING = new SoundType(
      1.0F, 1.0F, SoundEvents.field27025, SoundEvents.field27029, SoundEvents.field27028, SoundEvents.field27027, SoundEvents.field27026
   );
   public static final SoundType SWEET_BERRY_BUSH = new SoundType(
      1.0F, 1.0F, SoundEvents.SWEET_BERRY_BUSH_BREAK, SoundEvents.GRASS_STEP, SoundEvents.SWEET_BERRY_BUSH_PLACE, SoundEvents.GRASS_HIT, SoundEvents.GRASS_FALL
   );
   public static final SoundType CROP = new SoundType(
      1.0F, 1.0F, SoundEvents.BLOCK_CROP_BREAK, SoundEvents.GRASS_STEP, SoundEvents.ITEM_CROP_PLANT, SoundEvents.GRASS_HIT, SoundEvents.GRASS_FALL
   );
   public static final SoundType HARD_CROP = new SoundType(
      1.0F, 1.0F, SoundEvents.BLOCK_WOOD_BREAK, SoundEvents.BLOCK_WOOD_STEP, SoundEvents.ITEM_CROP_PLANT, SoundEvents.BLOCK_WOOD_HIT, SoundEvents.BLOCK_WOOD_FALL
   );
   public static final SoundType VINE = new SoundType(
      1.0F, 1.0F, SoundEvents.GRASS_BREAK, SoundEvents.field27213, SoundEvents.GRASS_PLACE, SoundEvents.GRASS_HIT, SoundEvents.GRASS_FALL
   );
   public static final SoundType NETHER_WART = new SoundType(
      1.0F, 1.0F, SoundEvents.field26806, SoundEvents.STONE_STEP, SoundEvents.field26807, SoundEvents.STONE_HIT, SoundEvents.STONE_FALL
   );
   public static final SoundType LANTERN = new SoundType(
      1.0F, 1.0F, SoundEvents.field26720, SoundEvents.field26724, SoundEvents.field26723, SoundEvents.field26722, SoundEvents.field26721
   );
   public static final SoundType STEM = new SoundType(
      1.0F, 1.0F, SoundEvents.field26808, SoundEvents.field26809, SoundEvents.field26810, SoundEvents.field26811, SoundEvents.field26812
   );
   public static final SoundType NYLIUM = new SoundType(
      1.0F, 1.0F, SoundEvents.field26813, SoundEvents.field26814, SoundEvents.field26815, SoundEvents.field26816, SoundEvents.field26817
   );
   public static final SoundType FUNGUS = new SoundType(
      1.0F, 1.0F, SoundEvents.field26823, SoundEvents.field26824, SoundEvents.field26825, SoundEvents.field26826, SoundEvents.field26827
   );
   public static final SoundType ROOTS = new SoundType(
      1.0F, 1.0F, SoundEvents.field26599, SoundEvents.field26600, SoundEvents.field26601, SoundEvents.field26602, SoundEvents.field26603
   );
   public static final SoundType WEEPING_VINES = new SoundType(
      1.0F, 1.0F, SoundEvents.field27037, SoundEvents.field27038, SoundEvents.field27039, SoundEvents.field27040, SoundEvents.field27041
   );
   public static final SoundType TWISTING_VINES = new SoundType(
      1.0F, 1.0F, SoundEvents.field26828, SoundEvents.field26829, SoundEvents.field26830, SoundEvents.field26831, SoundEvents.field26832
   );
   public static final SoundType SOUL_SAND = new SoundType(
      1.0F, 0.5F, SoundEvents.field26828, SoundEvents.field26829, SoundEvents.field26830, SoundEvents.field26831, SoundEvents.field26832
   );
   public static final SoundType SOUL_SOIL = new SoundType(
      1.0F, 1.0F, SoundEvents.field27082, SoundEvents.field27083, SoundEvents.field27084, SoundEvents.field27085, SoundEvents.field27086
   );
   public static final SoundType BASALT = new SoundType(
      1.0F, 1.0F, SoundEvents.field27087, SoundEvents.field27088, SoundEvents.field27089, SoundEvents.field27090, SoundEvents.field27091
   );
   public static final SoundType WART_BLOCK = new SoundType(
      1.0F, 1.0F, SoundEvents.field26375, SoundEvents.field26376, SoundEvents.field26377, SoundEvents.field26378, SoundEvents.field26379
   );
   public static final SoundType NETHERRACK = new SoundType(
      1.0F, 1.0F, SoundEvents.field26833, SoundEvents.field26834, SoundEvents.field26835, SoundEvents.field26836, SoundEvents.field26837
   );
   public static final SoundType NETHER_BRICKS = new SoundType(
      1.0F, 1.0F, SoundEvents.field26843, SoundEvents.field26844, SoundEvents.field26845, SoundEvents.field26846, SoundEvents.field26847
   );
   public static final SoundType NETHER_SPROUTS = new SoundType(
      1.0F, 1.0F, SoundEvents.field26801, SoundEvents.field26802, SoundEvents.field26803, SoundEvents.field26804, SoundEvents.field26805
   );
   public static final SoundType NETHER_ORE = new SoundType(
      1.0F, 1.0F, SoundEvents.field26818, SoundEvents.field26819, SoundEvents.field26820, SoundEvents.field26821, SoundEvents.field26822
   );
   public static final SoundType BONE = new SoundType(
      1.0F, 1.0F, SoundEvents.field27006, SoundEvents.field27010, SoundEvents.field27009, SoundEvents.field27008, SoundEvents.field27007
   );
   public static final SoundType NETHERITE = new SoundType(
      1.0F, 1.0F, SoundEvents.field26409, SoundEvents.field26413, SoundEvents.field26412, SoundEvents.field26411, SoundEvents.field26410
   );
   public static final SoundType ANCIENT_DEBRIS = new SoundType(
      1.0F, 1.0F, SoundEvents.field26838, SoundEvents.field26839, SoundEvents.field26840, SoundEvents.field26841, SoundEvents.field26842
   );
   public static final SoundType LODESTONE = new SoundType(
      1.0F, 1.0F, SoundEvents.field26335, SoundEvents.field26336, SoundEvents.field26337, SoundEvents.field26338, SoundEvents.field26339
   );
   public static final SoundType CHAIN = new SoundType(
      1.0F, 1.0F, SoundEvents.field26744, SoundEvents.field26745, SoundEvents.field26746, SoundEvents.field26747, SoundEvents.field26748
   );
   public static final SoundType NETHER_GOLD_ORE = new SoundType(
      1.0F, 1.0F, SoundEvents.field26442, SoundEvents.field26446, SoundEvents.field26445, SoundEvents.field26444, SoundEvents.field26443
   );
   public static final SoundType GILDED_BLACKSTONE = new SoundType(
      1.0F, 1.0F, SoundEvents.field27001, SoundEvents.field27005, SoundEvents.field27004, SoundEvents.field27003, SoundEvents.field27002
   );
   public static final SoundType field36246 = new SoundType(
      1.0F, 1.0F, SoundEvents.field26622, SoundEvents.field26626, SoundEvents.field26625, SoundEvents.field26624, SoundEvents.field26623
   );
   public final float volume;
   public final float pitch;
   private final SoundEvent breakSound;
   private final SoundEvent stepSound;
   private final SoundEvent placeSound;
   private final SoundEvent hitSound;
   private final SoundEvent fallSound;

   public SoundType(
           float volume, float pitch, SoundEvent breakSound,
           SoundEvent stepSound, SoundEvent placeSound, SoundEvent hitSound,
           SoundEvent fallSound) {
      this.volume = volume;
      this.pitch = pitch;
      this.breakSound = breakSound;
      this.stepSound = stepSound;
      this.placeSound = placeSound;
      this.hitSound = hitSound;
      this.fallSound = fallSound;
   }

   public float getVolume() {
      return this.volume;
   }

   public float getPitch() {
      return this.pitch;
   }

   public SoundEvent getBreakSound() {
      return this.breakSound;
   }

   public SoundEvent getStepSound() {
      return this.stepSound;
   }

   public SoundEvent getPlaceSound() {
      return this.placeSound;
   }

   public SoundEvent getHitSound() {
      return this.hitSound;
   }

   public SoundEvent getFallSound() {
      return this.fallSound;
   }
}
