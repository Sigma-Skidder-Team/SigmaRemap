package net.minecraft.entity;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.entity.item.ItemFrameEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.passive.WolfEntity;
import com.google.common.collect.ImmutableSet;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;

import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.tags.ITag;
import net.minecraft.util.Util;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.entity.passive.fish.SalmonEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.ListNBT;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.datafix.TypeReferences;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EntityType<T extends Entity> {
   private static final Logger LOGGER = LogManager.getLogger();

   public static final EntityType<AreaEffectCloudEntity> AREA_EFFECT_CLOUD = register(
      "area_effect_cloud",
      Builder.<AreaEffectCloudEntity>create(AreaEffectCloudEntity::new, EntityClassification.MISC).immuneToFire().size(6.0F, 0.5F).trackingRange(10).method32308(Integer.MAX_VALUE)
   );
   public static final EntityType<ArmorStandEntity> ARMOR_STAND = register(
      "armor_stand", Builder.<ArmorStandEntity>create(ArmorStandEntity::new, EntityClassification.MISC).size(0.5F, 1.975F).trackingRange(10)
   );
   public static final EntityType<ArrowEntity> ARROW = register(
      "arrow", Builder.<ArrowEntity>create(ArrowEntity::new, EntityClassification.MISC).size(0.5F, 0.5F).trackingRange(4).method32308(20)
   );
   public static final EntityType<BatEntity> BAT = register(
      "bat", Builder.<BatEntity>create(BatEntity::new, EntityClassification.AMBIENT).size(0.5F, 0.9F).trackingRange(5)
   );
   public static final EntityType<BeeEntity> BEE = register(
      "bee", Builder.<BeeEntity>create(BeeEntity::new, EntityClassification.CREATURE).size(0.7F, 0.6F).trackingRange(8)
   );
   public static final EntityType<BlazeEntity> BLAZE = register(
      "blaze", Builder.<BlazeEntity>create(BlazeEntity::new, EntityClassification.MONSTER).immuneToFire().size(0.6F, 1.8F).trackingRange(8)
   );
   public static final EntityType<BoatEntity> BOAT = register(
      "boat", Builder.<BoatEntity>create(BoatEntity::new, EntityClassification.MISC).size(1.375F, 0.5625F).trackingRange(10)
   );
   public static final EntityType<CatEntity> CAT = register(
      "cat", Builder.<CatEntity>create(CatEntity::new, EntityClassification.CREATURE).size(0.6F, 0.7F).trackingRange(8)
   );
   public static final EntityType<CaveSpiderEntity> CAVE_SPIDER = register(
      "cave_spider", Builder.<CaveSpiderEntity>create(CaveSpiderEntity::new, EntityClassification.MONSTER).size(0.7F, 0.5F).trackingRange(8)
   );
   public static final EntityType<ChickenEntity> CHICKEN = register(
      "chicken", Builder.<ChickenEntity>create(ChickenEntity::new, EntityClassification.CREATURE).size(0.4F, 0.7F).trackingRange(10)
   );
   public static final EntityType<CodEntity> COD = register(
      "cod", Builder.<CodEntity>create(CodEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.3F).trackingRange(4)
   );
   public static final EntityType<CowEntity> COW = register(
      "cow", Builder.<CowEntity>create(CowEntity::new, EntityClassification.CREATURE).size(0.9F, 1.4F).trackingRange(10)
   );
   public static final EntityType<CreeperEntity> CREEPER = register(
      "creeper", Builder.<CreeperEntity>create(CreeperEntity::new, EntityClassification.MONSTER).size(0.6F, 1.7F).trackingRange(8)
   );
   public static final EntityType<DolphinEntity> DOLPHIN = register(
      "dolphin", Builder.<DolphinEntity>create(DolphinEntity::new, EntityClassification.WATER_CREATURE).size(0.9F, 0.6F)
   );
   public static final EntityType<DonkeyEntity> DONKEY = register(
      "donkey", Builder.<DonkeyEntity>create(DonkeyEntity::new, EntityClassification.CREATURE).size(1.3964844F, 1.5F).trackingRange(10)
   );
   public static final EntityType<DragonFireball> DRAGON_FIREBALL = register(
      "dragon_fireball", Builder.<DragonFireball>create(DragonFireball::new, EntityClassification.MISC).size(1.0F, 1.0F).trackingRange(4).method32308(10)
   );
   public static final EntityType<DrownedEntity> DROWNED = register(
      "drowned", Builder.<DrownedEntity>create(DrownedEntity::new, EntityClassification.MONSTER).size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<ElderGuardianEntity> ELDER_GUARDIAN = register(
      "elder_guardian", Builder.<ElderGuardianEntity>create(ElderGuardianEntity::new, EntityClassification.MONSTER).size(1.9975F, 1.9975F).trackingRange(10)
   );
   public static final EntityType<EnderCrystalEntity> field41023 = register(
      "end_crystal", Builder.<EnderCrystalEntity>create(EnderCrystalEntity::new, EntityClassification.MISC).size(2.0F, 2.0F).trackingRange(16).method32308(Integer.MAX_VALUE)
   );
   public static final EntityType<EnderDragonEntity> ENDER_DRAGON = register(
      "ender_dragon", Builder.<EnderDragonEntity>create(EnderDragonEntity::new, EntityClassification.MONSTER).immuneToFire().size(16.0F, 8.0F).trackingRange(10)
   );
   public static final EntityType<EndermanEntity> ENDERMAN = register(
      "enderman", Builder.<EndermanEntity>create(EndermanEntity::new, EntityClassification.MONSTER).size(0.6F, 2.9F).trackingRange(8)
   );
   public static final EntityType<EndermiteEntity> ENDERMITE = register(
      "endermite", Builder.<EndermiteEntity>create(EndermiteEntity::new, EntityClassification.MONSTER).size(0.4F, 0.3F).trackingRange(8)
   );
   public static final EntityType<EvokerEntity> EVOKER = register(
      "evoker", Builder.<EvokerEntity>create(EvokerEntity::new, EntityClassification.MONSTER).size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<EvokerFangsEntity> EVOKER_FANGS = register(
      "evoker_fangs", Builder.<EvokerFangsEntity>create(EvokerFangsEntity::new, EntityClassification.MISC).size(0.5F, 0.8F).trackingRange(6).method32308(2)
   );
   public static final EntityType<ExperienceOrbEntity> EXPERIENCE_ORB = register(
      "experience_orb", Builder.<ExperienceOrbEntity>create(ExperienceOrbEntity::new, EntityClassification.MISC).size(0.5F, 0.5F).trackingRange(6).method32308(20)
   );
   public static final EntityType<EyeOfEnderEntity> EYE_OF_ENDER = register(
      "eye_of_ender", Builder.<EyeOfEnderEntity>create(EyeOfEnderEntity::new, EntityClassification.MISC).size(0.25F, 0.25F).trackingRange(4).method32308(4)
   );
   public static final EntityType<FallingBlockEntity> FALLING_BLOCK = register(
      "falling_block", Builder.<FallingBlockEntity>create(FallingBlockEntity::new, EntityClassification.MISC).size(0.98F, 0.98F).trackingRange(10).method32308(20)
   );
   public static final EntityType<FireworkRocketEntity> FIREWORK_ROCKET = register(
      "firework_rocket", Builder.<FireworkRocketEntity>create(FireworkRocketEntity::new, EntityClassification.MISC).size(0.25F, 0.25F).trackingRange(4).method32308(10)
   );
   public static final EntityType<FoxEntity> FOX = register(
      "fox", Builder.<FoxEntity>create(FoxEntity::new, EntityClassification.CREATURE).size(0.6F, 0.7F).trackingRange(8).method32305(Blocks.SWEET_BERRY_BUSH)
   );
   public static final EntityType<GhastEntity> GHAST = register(
      "ghast", Builder.<GhastEntity>create(GhastEntity::new, EntityClassification.MONSTER).immuneToFire().size(4.0F, 4.0F).trackingRange(10)
   );
   public static final EntityType<GiantEntity> GIANT = register(
      "giant", Builder.<GiantEntity>create(GiantEntity::new, EntityClassification.MONSTER).size(3.6F, 12.0F).trackingRange(10)
   );
   public static final EntityType<GuardianEntity> GUARDIAN = register(
      "guardian", Builder.<GuardianEntity>create(GuardianEntity::new, EntityClassification.MONSTER).size(0.85F, 0.85F).trackingRange(8)
   );
   public static final EntityType<HoglinEntity> HOGLIN = register(
      "hoglin", Builder.<HoglinEntity>create(HoglinEntity::new, EntityClassification.MONSTER).size(1.3964844F, 1.4F).trackingRange(8)
   );
   public static final EntityType<HorseEntity> HORSE = register(
      "horse", Builder.<HorseEntity>create(HorseEntity::new, EntityClassification.CREATURE).size(1.3964844F, 1.6F).trackingRange(10)
   );
   public static final EntityType<HuskEntity> HUSK = register(
      "husk", Builder.<HuskEntity>create(HuskEntity::new, EntityClassification.MONSTER).size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<IllusionerEntity> ILLUSIONER = register(
      "illusioner", Builder.<IllusionerEntity>create(IllusionerEntity::new, EntityClassification.MONSTER).size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<IronGolemEntity> IRON_GOLEM = register(
      "iron_golem", Builder.<IronGolemEntity>create(IronGolemEntity::new, EntityClassification.MISC).size(1.4F, 2.7F).trackingRange(10)
   );
   public static final EntityType<ItemEntity> ITEM = register(
      "item", Builder.<ItemEntity>create(ItemEntity::new, EntityClassification.MISC).size(0.25F, 0.25F).trackingRange(6).method32308(20)
   );
   public static final EntityType<ItemFrameEntity> ITEM_FRAME = register(
      "item_frame", Builder.<ItemFrameEntity>create(ItemFrameEntity::new, EntityClassification.MISC).size(0.5F, 0.5F).trackingRange(10).method32308(Integer.MAX_VALUE)
   );
   public static final EntityType<FireballEntity> FIREBALL = register(
      "fireball", Builder.<FireballEntity>create(FireballEntity::new, EntityClassification.MISC).size(1.0F, 1.0F).trackingRange(4).method32308(10)
   );
   public static final EntityType<LeashKnotEntity> LEASH_KNOT = register(
      "leash_knot",
      Builder.<LeashKnotEntity>create(LeashKnotEntity::new, EntityClassification.MISC).method32303().size(0.5F, 0.5F).trackingRange(10).method32308(Integer.MAX_VALUE)
   );
   public static final EntityType<LightningBoltEntity> LIGHTNING_BOLT = register(
      "lightning_bolt",
      Builder.<LightningBoltEntity>create(LightningBoltEntity::new, EntityClassification.MISC).method32303().size(0.0F, 0.0F).trackingRange(16).method32308(Integer.MAX_VALUE)
   );
   public static final EntityType<LlamaEntity> LLAMA = register(
      "llama", Builder.<LlamaEntity>create(LlamaEntity::new, EntityClassification.CREATURE).size(0.9F, 1.87F).trackingRange(10)
   );
   public static final EntityType<LlamaSpitEntity> LLAMA_SPIT = register(
      "llama_spit", Builder.<LlamaSpitEntity>create(LlamaSpitEntity::new, EntityClassification.MISC).size(0.25F, 0.25F).trackingRange(4).method32308(10)
   );
   public static final EntityType<MagmaCubeEntity> MAGMA_CUBE = register(
      "magma_cube", Builder.<MagmaCubeEntity>create(MagmaCubeEntity::new, EntityClassification.MONSTER).immuneToFire().size(2.04F, 2.04F).trackingRange(8)
   );
   public static final EntityType<MinecartEntity> MINECART = register(
      "minecart", Builder.<MinecartEntity>create(MinecartEntity::new, EntityClassification.MISC).size(0.98F, 0.7F).trackingRange(8)
   );
   public static final EntityType<ChestMinecartEntity> CHEST_MINECART = register(
      "chest_minecart", Builder.<ChestMinecartEntity>create(ChestMinecartEntity::new, EntityClassification.MISC).size(0.98F, 0.7F).trackingRange(8)
   );
   public static final EntityType<CommandBlockMinecartEntity> COMMAND_BLOCK_MINECART = register(
      "command_block_minecart", Builder.<CommandBlockMinecartEntity>create(CommandBlockMinecartEntity::new, EntityClassification.MISC).size(0.98F, 0.7F).trackingRange(8)
   );
   public static final EntityType<FurnaceMinecartEntity> FURNACE_MINECART = register(
      "furnace_minecart", Builder.<FurnaceMinecartEntity>create(FurnaceMinecartEntity::new, EntityClassification.MISC).size(0.98F, 0.7F).trackingRange(8)
   );
   public static final EntityType<HopperMinecartEntity> HOPPER_MINECART = register(
      "hopper_minecart", Builder.<HopperMinecartEntity>create(HopperMinecartEntity::new, EntityClassification.MISC).size(0.98F, 0.7F).trackingRange(8)
   );
   public static final EntityType<SpawnerMinecartEntity> SPAWNER_MINECART = register(
      "spawner_minecart", Builder.<SpawnerMinecartEntity>create(SpawnerMinecartEntity::new, EntityClassification.MISC).size(0.98F, 0.7F).trackingRange(8)
   );
   public static final EntityType<TntMinecartEntity> TNT_MINECART = register(
      "tnt_minecart", Builder.<TntMinecartEntity>create(TntMinecartEntity::new, EntityClassification.MISC).size(0.98F, 0.7F).trackingRange(8)
   );
   public static final EntityType<MuleEntity> MULE = register(
      "mule", Builder.<MuleEntity>create(MuleEntity::new, EntityClassification.CREATURE).size(1.3964844F, 1.6F).trackingRange(8)
   );
   public static final EntityType<MooshroomEntity> MOOSHROOM = register(
      "mooshroom", Builder.<MooshroomEntity>create(MooshroomEntity::new, EntityClassification.CREATURE).size(0.9F, 1.4F).trackingRange(10)
   );
   public static final EntityType<OcelotEntity> OCELOT = register(
      "ocelot", Builder.<OcelotEntity>create(OcelotEntity::new, EntityClassification.CREATURE).size(0.6F, 0.7F).trackingRange(10)
   );
   public static final EntityType<PaintingEntity> PAINTING = register(
      "painting", Builder.<PaintingEntity>create(PaintingEntity::new, EntityClassification.MISC).size(0.5F, 0.5F).trackingRange(10).method32308(Integer.MAX_VALUE)
   );
   public static final EntityType<PandaEntity> PANDA = register(
      "panda", Builder.<PandaEntity>create(PandaEntity::new, EntityClassification.CREATURE).size(1.3F, 1.25F).trackingRange(10)
   );
   public static final EntityType<ParrotEntity> PARROT = register(
      "parrot", Builder.<ParrotEntity>create(ParrotEntity::new, EntityClassification.CREATURE).size(0.5F, 0.9F).trackingRange(8)
   );
   public static final EntityType<PhantomEntity> PHANTOM = register(
      "phantom", Builder.<PhantomEntity>create(PhantomEntity::new, EntityClassification.MONSTER).size(0.9F, 0.5F).trackingRange(8)
   );
   public static final EntityType<PigEntity> PIG = register(
      "pig", Builder.<PigEntity>create(PigEntity::new, EntityClassification.CREATURE).size(0.9F, 0.9F).trackingRange(10)
   );
   public static final EntityType<PiglinEntity> PIGLIN = register(
      "piglin", Builder.<PiglinEntity>create(PiglinEntity::new, EntityClassification.MONSTER).size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<PiglinBruteEntity> PIGLIN_BRUTE = register(
      "piglin_brute", Builder.<PiglinBruteEntity>create(PiglinBruteEntity::new, EntityClassification.MONSTER).size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<Class1024> PILLAGER = register(
      "pillager", Builder.<Class1024>create(Class1024::new, EntityClassification.MONSTER).method32306().size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<PolarBearEntity> POLAR_BEAR = register(
      "polar_bear", Builder.<PolarBearEntity>create(PolarBearEntity::new, EntityClassification.CREATURE).size(1.4F, 1.4F).trackingRange(10)
   );
   public static final EntityType<TntEntity> TNT = register(
      "tnt", Builder.<TntEntity>create(TntEntity::new, EntityClassification.MISC).immuneToFire().size(0.98F, 0.98F).trackingRange(10).method32308(10)
   );
   public static final EntityType<PufferfishEntity> PUFFERFISH = register(
      "pufferfish", Builder.<PufferfishEntity>create(PufferfishEntity::new, EntityClassification.WATER_AMBIENT).size(0.7F, 0.7F).trackingRange(4)
   );
   public static final EntityType<RabbitEntity> RABBIT = register(
      "rabbit", Builder.<RabbitEntity>create(RabbitEntity::new, EntityClassification.CREATURE).size(0.4F, 0.5F).trackingRange(8)
   );
   public static final EntityType<RavagerEntity> RAVAGER = register(
      "ravager", Builder.<RavagerEntity>create(RavagerEntity::new, EntityClassification.MONSTER).size(1.95F, 2.2F).trackingRange(10)
   );
   public static final EntityType<SalmonEntity> SALMON = register(
      "salmon", Builder.<SalmonEntity>create(SalmonEntity::new, EntityClassification.WATER_AMBIENT).size(0.7F, 0.4F).trackingRange(4)
   );
   public static final EntityType<SheepEntity> SHEEP = register(
      "sheep", Builder.<SheepEntity>create(SheepEntity::new, EntityClassification.CREATURE).size(0.9F, 1.3F).trackingRange(10)
   );
   public static final EntityType<ShulkerEntity> SHULKER = register(
      "shulker", Builder.<ShulkerEntity>create(ShulkerEntity::new, EntityClassification.MONSTER).immuneToFire().method32306().size(1.0F, 1.0F).trackingRange(10)
   );
   public static final EntityType<ShulkerBulletEntity> SHULKER_BULLET = register(
      "shulker_bullet", Builder.<ShulkerBulletEntity>create(ShulkerBulletEntity::new, EntityClassification.MISC).size(0.3125F, 0.3125F).trackingRange(8)
   );
   public static final EntityType<SilverfishEntity> SILVERFISH = register(
      "silverfish", Builder.<SilverfishEntity>create(SilverfishEntity::new, EntityClassification.MONSTER).size(0.4F, 0.3F).trackingRange(8)
   );
   public static final EntityType<SkeletonEntity> SKELETON = register(
      "skeleton", Builder.<SkeletonEntity>create(SkeletonEntity::new, EntityClassification.MONSTER).size(0.6F, 1.99F).trackingRange(8)
   );
   public static final EntityType<SkeletonHorseEntity> SKELETON_HORSE = register(
      "skeleton_horse", Builder.<SkeletonHorseEntity>create(SkeletonHorseEntity::new, EntityClassification.CREATURE).size(1.3964844F, 1.6F).trackingRange(10)
   );
   public static final EntityType<SlimeEntity> SLIME = register(
      "slime", Builder.<SlimeEntity>create(SlimeEntity::new, EntityClassification.MONSTER).size(2.04F, 2.04F).trackingRange(10)
   );
   public static final EntityType<SmallFireballEntity> SMALL_FIREBALL = register(
      "small_fireball", Builder.<SmallFireballEntity>create(SmallFireballEntity::new, EntityClassification.MISC).size(0.3125F, 0.3125F).trackingRange(4).method32308(10)
   );
   public static final EntityType<SnowGolemEntity> SNOW_GOLEM = register(
      "snow_golem", Builder.<SnowGolemEntity>create(SnowGolemEntity::new, EntityClassification.MISC).size(0.7F, 1.9F).trackingRange(8)
   );
   public static final EntityType<SnowballEntity> SNOWBALL = register(
      "snowball", Builder.<SnowballEntity>create(SnowballEntity::new, EntityClassification.MISC).size(0.25F, 0.25F).trackingRange(4).method32308(10)
   );
   public static final EntityType<SpectralArrowEntity> SPECTRAL_ARROW = register(
      "spectral_arrow", Builder.<SpectralArrowEntity>create(SpectralArrowEntity::new, EntityClassification.MISC).size(0.5F, 0.5F).trackingRange(4).method32308(20)
   );
   public static final EntityType<SpiderEntity> SPIDER = register(
      "spider", Builder.<SpiderEntity>create(SpiderEntity::new, EntityClassification.MONSTER).size(1.4F, 0.9F).trackingRange(8)
   );
   public static final EntityType<SquidEntity> SQUID = register(
      "squid", Builder.<SquidEntity>create(SquidEntity::new, EntityClassification.WATER_CREATURE).size(0.8F, 0.8F).trackingRange(8)
   );
   public static final EntityType<StrayEntity> STRAY = register(
      "stray", Builder.<StrayEntity>create(StrayEntity::new, EntityClassification.MONSTER).size(0.6F, 1.99F).trackingRange(8)
   );
   public static final EntityType<StriderEntity> STRIDER = register(
      "strider", Builder.<StriderEntity>create(StriderEntity::new, EntityClassification.CREATURE).immuneToFire().size(0.9F, 1.7F).trackingRange(10)
   );
   public static final EntityType<EggEntity> EGG = register(
      "egg", Builder.<EggEntity>create(EggEntity::new, EntityClassification.MISC).size(0.25F, 0.25F).trackingRange(4).method32308(10)
   );
   public static final EntityType<EnderPearlEntity> ENDER_PEARL = register(
      "ender_pearl", Builder.<EnderPearlEntity>create(EnderPearlEntity::new, EntityClassification.MISC).size(0.25F, 0.25F).trackingRange(4).method32308(10)
   );
   public static final EntityType<ExperienceBottleEntity> EXPERIENCE_BOTTLE = register(
      "experience_bottle", Builder.<ExperienceBottleEntity>create(ExperienceBottleEntity::new, EntityClassification.MISC).size(0.25F, 0.25F).trackingRange(4).method32308(10)
   );
   public static final EntityType<PotionEntity> POTION = register(
      "potion", Builder.<PotionEntity>create(PotionEntity::new, EntityClassification.MISC).size(0.25F, 0.25F).trackingRange(4).method32308(10)
   );
   public static final EntityType<TridentEntity> TRIDENT = register(
      "trident", Builder.<TridentEntity>create(TridentEntity::new, EntityClassification.MISC).size(0.5F, 0.5F).trackingRange(4).method32308(20)
   );
   public static final EntityType<TraderLlamaEntity> TRADER_LLAMA = register(
      "trader_llama", Builder.<TraderLlamaEntity>create(TraderLlamaEntity::new, EntityClassification.CREATURE).size(0.9F, 1.87F).trackingRange(10)
   );
   public static final EntityType<TropicalFishEntity> TROPICAL_FISH = register(
      "tropical_fish", Builder.<TropicalFishEntity>create(TropicalFishEntity::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).trackingRange(4)
   );
   public static final EntityType<TurtleEntity> TURTLE = register(
      "turtle", Builder.<TurtleEntity>create(TurtleEntity::new, EntityClassification.CREATURE).size(1.2F, 0.4F).trackingRange(10)
   );
   public static final EntityType<VexEntity> VEX = register(
      "vex", Builder.<VexEntity>create(VexEntity::new, EntityClassification.MONSTER).immuneToFire().size(0.4F, 0.8F).trackingRange(8)
   );
   public static final EntityType<VillagerEntity> VILLAGER = register(
      "villager", Builder.<VillagerEntity>create(VillagerEntity::new, EntityClassification.MISC).size(0.6F, 1.95F).trackingRange(10)
   );
   public static final EntityType<VindicatorEntity> VINDICATOR = register(
      "vindicator", Builder.<VindicatorEntity>create(VindicatorEntity::new, EntityClassification.MONSTER).size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<WanderingTraderEntity> WANDERING_TRADER = register(
      "wandering_trader", Builder.<WanderingTraderEntity>create(WanderingTraderEntity::new, EntityClassification.CREATURE).size(0.6F, 1.95F).trackingRange(10)
   );
   public static final EntityType<WitchEntity> WITCH = register(
      "witch", Builder.<WitchEntity>create(WitchEntity::new, EntityClassification.MONSTER).size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<WitherEntity> WITHER = register(
      "wither",
      Builder.<WitherEntity>create(WitherEntity::new, EntityClassification.MONSTER)
         .immuneToFire()
         .method32305(Blocks.WITHER_ROSE)
         .size(0.9F, 3.5F)
         .trackingRange(10)
   );
   public static final EntityType<WitherSkeletonEntity> WITHER_SKELETON = register(
      "wither_skeleton",
      Builder.<WitherSkeletonEntity>create(WitherSkeletonEntity::new, EntityClassification.MONSTER)
         .immuneToFire()
         .method32305(Blocks.WITHER_ROSE)
         .size(0.7F, 2.4F)
         .trackingRange(8)
   );
   public static final EntityType<WitherSkullEntity> WITHER_SKULL = register(
      "wither_skull", Builder.<WitherSkullEntity>create(WitherSkullEntity::new, EntityClassification.MISC).size(0.3125F, 0.3125F).trackingRange(4).method32308(10)
   );
   public static final EntityType<WolfEntity> WOLF = register(
      "wolf", Builder.<WolfEntity>create(WolfEntity::new, EntityClassification.CREATURE).size(0.6F, 0.85F).trackingRange(10)
   );
   public static final EntityType<ZoglinEntity> ZOGLIN = register(
      "zoglin", Builder.<ZoglinEntity>create(ZoglinEntity::new, EntityClassification.MONSTER).immuneToFire().size(1.3964844F, 1.4F).trackingRange(8)
   );
   public static final EntityType<ZombieEntity> ZOMBIE = register(
      "zombie", Builder.<ZombieEntity>create(ZombieEntity::new, EntityClassification.MONSTER).size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<ZombieHorseEntity> ZOMBIE_HORSE = register(
      "zombie_horse", Builder.<ZombieHorseEntity>create(ZombieHorseEntity::new, EntityClassification.CREATURE).size(1.3964844F, 1.6F).trackingRange(10)
   );
   public static final EntityType<ZombieVillagerEntity> ZOMBIE_VILLAGER = register(
      "zombie_villager", Builder.<ZombieVillagerEntity>create(ZombieVillagerEntity::new, EntityClassification.MONSTER).size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<ZombifiedPiglinEntity> ZOMBIFIED_PIGLIN = register(
      "zombified_piglin", Builder.<ZombifiedPiglinEntity>create(ZombifiedPiglinEntity::new, EntityClassification.MONSTER).immuneToFire().size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<PlayerEntity> PLAYER = register(
      "player", Builder.<PlayerEntity>method32300(EntityClassification.MISC).method32303().method32302().size(0.6F, 1.8F).trackingRange(32).method32308(2)
   );
   public static final EntityType<FishingBobberEntity> FISHING_BOBBER = register(
      "fishing_bobber", Builder.<FishingBobberEntity>method32300(EntityClassification.MISC).method32303().method32302().size(0.25F, 0.25F).trackingRange(4).method32308(5)
   );
   private final Class9283<T> field41113;
   private final EntityClassification field41114;
   private final ImmutableSet<Block> field41115;
   private final boolean field41116;
   private final boolean field41117;
   private final boolean field41118;
   private final boolean field41119;
   private final int field41120;
   private final int field41121;
   private String field41122;
   private ITextComponent field41123;
   private ResourceLocation field41124;
   private final EntitySize field41125;

   private static <T extends Entity> EntityType<T> register(String var0, Builder<T> var1) {
      return Registry.<EntityType<T>>register(Registry.ENTITY_TYPE, var0, var1.method32309(var0));
   }

   public static ResourceLocation method33198(EntityType<?> var0) {
      return Registry.ENTITY_TYPE.getKey(var0);
   }

   public static Optional<EntityType<?>> method33199(String var0) {
      return Registry.ENTITY_TYPE.method9187(ResourceLocation.method8289(var0));
   }

   public EntityType(
      Class9283<T> var1,
      EntityClassification var2,
      boolean var3,
      boolean var4,
      boolean var5,
      boolean var6,
      ImmutableSet<Block> var7,
      EntitySize var8,
      int var9,
      int var10
   ) {
      this.field41113 = var1;
      this.field41114 = var2;
      this.field41119 = var6;
      this.field41116 = var3;
      this.field41117 = var4;
      this.field41118 = var5;
      this.field41115 = var7;
      this.field41125 = var8;
      this.field41120 = var9;
      this.field41121 = var10;
   }

   @Nullable
   public Entity method33200(ServerWorld var1, ItemStack var2, PlayerEntity var3, BlockPos var4, SpawnReason var5, boolean var6, boolean var7) {
      return this.method33201(
         var1, var2 != null ? var2.getTag() : null, var2 != null && var2.method32152() ? var2.method32149() : null, var3, var4, var5, var6, var7
      );
   }

   @Nullable
   public T method33201(ServerWorld var1, CompoundNBT var2, ITextComponent var3, PlayerEntity var4, BlockPos var5, SpawnReason var6, boolean var7, boolean var8) {
      Entity var11 = this.method33202(var1, var2, var3, var4, var5, var6, var7, var8);
      if (var11 != null) {
         var1.method6995(var11);
      }

      return (T)var11;
   }

   @Nullable
   public T method33202(ServerWorld var1, CompoundNBT var2, ITextComponent var3, PlayerEntity var4, BlockPos var5, SpawnReason var6, boolean var7, boolean var8) {
      Entity var11 = this.create(var1);
      if (var11 != null) {
         double var12;
         if (!var7) {
            var12 = 0.0;
         } else {
            var11.setPosition((double)var5.getX() + 0.5, (double)(var5.getY() + 1), (double)var5.getZ() + 0.5);
            var12 = method33203(var1, var5, var8, var11.getBoundingBox());
         }

         var11.setLocationAndAngles(
            (double)var5.getX() + 0.5,
            (double)var5.getY() + var12,
            (double)var5.getZ() + 0.5,
            MathHelper.wrapDegrees(var1.rand.nextFloat() * 360.0F),
            0.0F
         );
         if (var11 instanceof MobEntity) {
            MobEntity var14 = (MobEntity)var11;
            var14.rotationYawHead = var14.rotationYaw;
            var14.renderYawOffset = var14.rotationYaw;
            var14.method4276(var1, var1.method6807(var14.getPosition()), var6, (Class5093)null, var2);
            var14.playAmbientSound();
         }

         if (var3 != null && var11 instanceof LivingEntity) {
            var11.method3379(var3);
         }

         method33204(var1, var4, var11, var2);
         return (T)var11;
      } else {
         return null;
      }
   }

   public static double method33203(IWorldReader var0, BlockPos var1, boolean var2, AxisAlignedBB var3) {
      AxisAlignedBB var6 = new AxisAlignedBB(var1);
      if (var2) {
         var6 = var6.expand(0.0, -1.0, 0.0);
      }

      Stream var7 = var0.func_234867_d_((Entity)null, var6, var0x -> true);
      return 1.0 + VoxelShapes.method27437(Direction.Axis.Y, var3, var7, !var2 ? -1.0 : -2.0);
   }

   public static void method33204(World var0, PlayerEntity var1, Entity var2, CompoundNBT var3) {
      if (var3 != null && var3.contains("EntityTag", 10)) {
         MinecraftServer var6 = var0.getServer();
         if (var6 != null && var2 != null && (var0.isRemote || !var2.method3404() || var1 != null && var6.getPlayerList().canSendCommands(var1.getGameProfile()))) {
            CompoundNBT var7 = var2.writeWithoutTypeId(new CompoundNBT());
            UUID var8 = var2.getUniqueID();
            var7.merge(var3.getCompound("EntityTag"));
            var2.setUniqueId(var8);
            var2.read(var7);
         }
      }
   }

   public boolean method33205() {
      return this.field41116;
   }

   public boolean method33206() {
      return this.field41117;
   }

   public boolean method33207() {
      return this.field41118;
   }

   public boolean method33208() {
      return this.field41119;
   }

   public EntityClassification method33209() {
      return this.field41114;
   }

   public String method33210() {
      if (this.field41122 == null) {
         this.field41122 = Util.makeTranslationKey("entity", Registry.ENTITY_TYPE.getKey(this));
      }

      return this.field41122;
   }

   public ITextComponent getName() {
      if (this.field41123 == null) {
         this.field41123 = new TranslationTextComponent(this.method33210());
      }

      return this.field41123;
   }

   @Override
   public String toString() {
      return this.method33210();
   }

   public ResourceLocation method33212() {
      if (this.field41124 == null) {
         ResourceLocation var3 = Registry.ENTITY_TYPE.getKey(this);
         this.field41124 = new ResourceLocation(var3.getNamespace(), "entities/" + var3.getPath());
      }

      return this.field41124;
   }

   public float method33213() {
      return this.field41125.width;
   }

   public float method33214() {
      return this.field41125.height;
   }

   @Nullable
   public T create(World var1) {
      return this.field41113.method35007(this, var1);
   }

   @Nullable
   public static Entity method33216(int var0, World var1) {
      return method33218(var1, Registry.ENTITY_TYPE.getByValue(var0));
   }

   public static Optional<Entity> method33217(CompoundNBT var0, World var1) {
      return Util.<Entity>acceptOrElse(
         method33222(var0).<Entity>map(var1x -> var1x.create(var1)),
         var1x -> var1x.read(var0),
         () -> LOGGER.warn("Skipping Entity with id {}", var0.getString("id"))
      );
   }

   @Nullable
   private static Entity method33218(World var0, EntityType<?> var1) {
      return var1 != null ? var1.create(var0) : null;
   }

   public AxisAlignedBB method33219(double var1, double var3, double var5) {
      float var9 = this.method33213() / 2.0F;
      return new AxisAlignedBB(var1 - (double)var9, var3, var5 - (double)var9, var1 + (double)var9, var3 + (double)this.method33214(), var5 + (double)var9);
   }

   public boolean method33220(BlockState var1) {
      if (this.field41115.contains(var1.getBlock())) {
         return false;
      } else {
         return this.field41118
               || !var1.isIn(BlockTags.field32798)
                  && !var1.isIn(Blocks.MAGMA_BLOCK)
                  && !CampfireBlock.method11655(var1)
                  && !var1.isIn(Blocks.LAVA)
            ? var1.isIn(Blocks.WITHER_ROSE) || var1.isIn(Blocks.SWEET_BERRY_BUSH) || var1.isIn(Blocks.CACTUS)
            : true;
      }
   }

   public EntitySize getSize() {
      return this.field41125;
   }

   public static Optional<EntityType<?>> method33222(CompoundNBT var0) {
      return Registry.ENTITY_TYPE.method9187(new ResourceLocation(var0.getString("id")));
   }

   @Nullable
   public static Entity method33223(CompoundNBT var0, World var1, Function<Entity, Entity> var2) {
      return method33224(var0, var1).<Entity>map(var2).<Entity>map(var3 -> {
         if (var0.contains("Passengers", 9)) {
            ListNBT var6 = var0.getList("Passengers", 10);

            for (int var7 = 0; var7 < var6.size(); var7++) {
               Entity var8 = method33223(var6.getCompound(var7), var1, var2);
               if (var8 != null) {
                  var8.startRiding(var3, true);
               }
            }
         }

         return (Entity)var3;
      }).orElse((Entity)null);
   }

   private static Optional<Entity> method33224(CompoundNBT var0, World var1) {
      try {
         return method33217(var0, var1);
      } catch (RuntimeException var5) {
         LOGGER.warn("Exception loading entity: ", var5);
         return Optional.<Entity>empty();
      }
   }

   public int method33225() {
      return this.field41120;
   }

   public int method33226() {
      return this.field41121;
   }

   public boolean method33227() {
      return this != PLAYER
         && this != LLAMA_SPIT
         && this != WITHER
         && this != BAT
         && this != ITEM_FRAME
         && this != LEASH_KNOT
         && this != PAINTING
         && this != field41023
         && this != EVOKER_FANGS;
   }

   public boolean method33228(ITag<EntityType<?>> var1) {
      return var1.contains(this);
   }

   public static class Builder<T extends Entity> {
      private static String[] field40180;
      private final Class9283<T> field40181;
      private final EntityClassification field40182;
      private ImmutableSet<Block> field40183 = ImmutableSet.of();
      private boolean field40184 = true;
      private boolean field40185 = true;
      private boolean field40186;
      private boolean field40187;
      private int field40188 = 5;
      private int field40189 = 3;
      private EntitySize field40190 = EntitySize.method32101(0.6F, 1.8F);

      private Builder(Class9283<T> var1, EntityClassification var2) {
         this.field40181 = var1;
         this.field40182 = var2;
         this.field40187 = var2 == EntityClassification.CREATURE || var2 == EntityClassification.MISC;
      }

      public static <T extends Entity> Builder<T> create(Class9283<T> var0, EntityClassification var1) {
         return new Builder<T>(var0, var1);
      }

      public static <T extends Entity> Builder<T> method32300(EntityClassification var0) {
         return new Builder<T>((var0x, var1) -> null, var0);
      }

      public Builder<T> size(float var1, float var2) {
         this.field40190 = EntitySize.method32101(var1, var2);
         return this;
      }

      public Builder<T> method32302() {
         this.field40185 = false;
         return this;
      }

      public Builder<T> method32303() {
         this.field40184 = false;
         return this;
      }

      public Builder<T> immuneToFire() {
         this.field40186 = true;
         return this;
      }

      public Builder<T> method32305(Block... var1) {
         this.field40183 = ImmutableSet.copyOf(var1);
         return this;
      }

      public Builder<T> method32306() {
         this.field40187 = true;
         return this;
      }

      public Builder<T> trackingRange(int var1) {
         this.field40188 = var1;
         return this;
      }

      public Builder<T> method32308(int var1) {
         this.field40189 = var1;
         return this;
      }

      public EntityType<T> method32309(String var1) {
         if (this.field40184) {
            Util.attemptDataFix(TypeReferences.ENTITY_TREE, var1);
         }

         return new EntityType<T>(
            this.field40181,
            this.field40182,
            this.field40184,
            this.field40185,
            this.field40186,
            this.field40187,
            this.field40183,
            this.field40190,
            this.field40188,
            this.field40189
         );
      }
   }
}
