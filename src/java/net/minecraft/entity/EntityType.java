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
import net.minecraft.util.math.shapes.VoxelShapes;
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

   public static final EntityType<Class999> AREA_EFFECT_CLOUD = register(
      "area_effect_cloud",
      Builder.<Class999>create(Class999::new, EntityClassification.MISC).immuneToFire().size(6.0F, 0.5F).trackingRange(10).method32308(Integer.MAX_VALUE)
   );
   public static final EntityType<ArmorStandEntity> ARMOR_STAND = register(
      "armor_stand", Builder.<ArmorStandEntity>create(ArmorStandEntity::new, EntityClassification.MISC).size(0.5F, 1.975F).trackingRange(10)
   );
   public static final EntityType<Class887> ARROW = register(
      "arrow", Builder.<Class887>create(Class887::new, EntityClassification.MISC).size(0.5F, 0.5F).trackingRange(4).method32308(20)
   );
   public static final EntityType<BatEntity> BAT = register(
      "bat", Builder.<BatEntity>create(BatEntity::new, EntityClassification.AMBIENT).size(0.5F, 0.9F).trackingRange(5)
   );
   public static final EntityType<Class1017> BEE = register(
      "bee", Builder.<Class1017>create(Class1017::new, EntityClassification.CREATURE).size(0.7F, 0.6F).trackingRange(8)
   );
   public static final EntityType<Class1103> BLAZE = register(
      "blaze", Builder.<Class1103>create(Class1103::new, EntityClassification.MONSTER).immuneToFire().size(0.6F, 1.8F).trackingRange(8)
   );
   public static final EntityType<BoatEntity> BOAT = register(
      "boat", Builder.<BoatEntity>create(BoatEntity::new, EntityClassification.MISC).size(1.375F, 0.5625F).trackingRange(10)
   );
   public static final EntityType<Class1098> CAT = register(
      "cat", Builder.<Class1098>create(Class1098::new, EntityClassification.CREATURE).size(0.6F, 0.7F).trackingRange(8)
   );
   public static final EntityType<Class1102> CAVE_SPIDER = register(
      "cave_spider", Builder.<Class1102>create(Class1102::new, EntityClassification.MONSTER).size(0.7F, 0.5F).trackingRange(8)
   );
   public static final EntityType<Class1089> CHICKEN = register(
      "chicken", Builder.<Class1089>create(Class1089::new, EntityClassification.CREATURE).size(0.4F, 0.7F).trackingRange(10)
   );
   public static final EntityType<Class1051> COD = register(
      "cod", Builder.<Class1051>create(Class1051::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.3F).trackingRange(4)
   );
   public static final EntityType<Class1087> COW = register(
      "cow", Builder.<Class1087>create(Class1087::new, EntityClassification.CREATURE).size(0.9F, 1.4F).trackingRange(10)
   );
   public static final EntityType<Class1081> CREEPER = register(
      "creeper", Builder.<Class1081>create(Class1081::new, EntityClassification.MONSTER).size(0.6F, 1.7F).trackingRange(8)
   );
   public static final EntityType<DolphinEntity> DOLPHIN = register(
      "dolphin", Builder.<DolphinEntity>create(DolphinEntity::new, EntityClassification.WATER_CREATURE).size(0.9F, 0.6F)
   );
   public static final EntityType<Class1067> DONKEY = register(
      "donkey", Builder.<Class1067>create(Class1067::new, EntityClassification.CREATURE).size(1.3964844F, 1.5F).trackingRange(10)
   );
   public static final EntityType<Class903> DRAGON_FIREBALL = register(
      "dragon_fireball", Builder.<Class903>create(Class903::new, EntityClassification.MISC).size(1.0F, 1.0F).trackingRange(4).method32308(10)
   );
   public static final EntityType<DrownedEntity> DROWNED = register(
      "drowned", Builder.<DrownedEntity>create(DrownedEntity::new, EntityClassification.MONSTER).size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<Class1106> ELDER_GUARDIAN = register(
      "elder_guardian", Builder.<Class1106>create(Class1106::new, EntityClassification.MONSTER).size(1.9975F, 1.9975F).trackingRange(10)
   );
   public static final EntityType<EnderCrystalEntity> field41023 = register(
      "end_crystal", Builder.<EnderCrystalEntity>create(EnderCrystalEntity::new, EntityClassification.MISC).size(2.0F, 2.0F).trackingRange(16).method32308(Integer.MAX_VALUE)
   );
   public static final EntityType<Class1007> ENDER_DRAGON = register(
      "ender_dragon", Builder.<Class1007>create(Class1007::new, EntityClassification.MONSTER).immuneToFire().size(16.0F, 8.0F).trackingRange(10)
   );
   public static final EntityType<EndermanEntity> ENDERMAN = register(
      "enderman", Builder.<EndermanEntity>create(EndermanEntity::new, EntityClassification.MONSTER).size(0.6F, 2.9F).trackingRange(8)
   );
   public static final EntityType<EndermiteEntity> ENDERMITE = register(
      "endermite", Builder.<EndermiteEntity>create(EndermiteEntity::new, EntityClassification.MONSTER).size(0.4F, 0.3F).trackingRange(8)
   );
   public static final EntityType<Class1032> EVOKER = register(
      "evoker", Builder.<Class1032>create(Class1032::new, EntityClassification.MONSTER).size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<Class915> field41028 = register(
      "evoker_fangs", Builder.<Class915>create(Class915::new, EntityClassification.MISC).size(0.5F, 0.8F).trackingRange(6).method32308(2)
   );
   public static final EntityType<ExperienceOrbEntity> field41029 = register(
      "experience_orb", Builder.<ExperienceOrbEntity>create(ExperienceOrbEntity::new, EntityClassification.MISC).size(0.5F, 0.5F).trackingRange(6).method32308(20)
   );
   public static final EntityType<Class897> field41030 = register(
      "eye_of_ender", Builder.<Class897>create(Class897::new, EntityClassification.MISC).size(0.25F, 0.25F).trackingRange(4).method32308(4)
   );
   public static final EntityType<Class907> field41031 = register(
      "falling_block", Builder.<Class907>create(Class907::new, EntityClassification.MISC).size(0.98F, 0.98F).trackingRange(10).method32308(20)
   );
   public static final EntityType<Class888> field41032 = register(
      "firework_rocket", Builder.<Class888>create(Class888::new, EntityClassification.MISC).size(0.25F, 0.25F).trackingRange(4).method32308(10)
   );
   public static final EntityType<Class1095> FOX = register(
      "fox", Builder.<Class1095>create(Class1095::new, EntityClassification.CREATURE).size(0.6F, 0.7F).trackingRange(8).method32305(Blocks.SWEET_BERRY_BUSH)
   );
   public static final EntityType<GhastEntity> GHAST = register(
      "ghast", Builder.<GhastEntity>create(GhastEntity::new, EntityClassification.MONSTER).immuneToFire().size(4.0F, 4.0F).trackingRange(10)
   );
   public static final EntityType<Class1099> GIANT = register(
      "giant", Builder.<Class1099>create(Class1099::new, EntityClassification.MONSTER).size(3.6F, 12.0F).trackingRange(10)
   );
   public static final EntityType<GuardianEntity> GUARDIAN = register(
      "guardian", Builder.<GuardianEntity>create(GuardianEntity::new, EntityClassification.MONSTER).size(0.85F, 0.85F).trackingRange(8)
   );
   public static final EntityType<HoglinEntity> HOGLIN = register(
      "hoglin", Builder.<HoglinEntity>create(HoglinEntity::new, EntityClassification.MONSTER).size(1.3964844F, 1.4F).trackingRange(8)
   );
   public static final EntityType<Class1074> HORSE = register(
      "horse", Builder.<Class1074>create(Class1074::new, EntityClassification.CREATURE).size(1.3964844F, 1.6F).trackingRange(10)
   );
   public static final EntityType<HuskEntity> HUSK = register(
      "husk", Builder.<HuskEntity>create(HuskEntity::new, EntityClassification.MONSTER).size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<Class1033> ILLUSIONER = register(
      "illusioner", Builder.<Class1033>create(Class1033::new, EntityClassification.MONSTER).size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<Class1058> IRON_GOLEM = register(
      "iron_golem", Builder.<Class1058>create(Class1058::new, EntityClassification.MISC).size(1.4F, 2.7F).trackingRange(10)
   );
   public static final EntityType<ItemEntity> ITEM = register(
      "item", Builder.<ItemEntity>create(ItemEntity::new, EntityClassification.MISC).size(0.25F, 0.25F).trackingRange(6).method32308(20)
   );
   public static final EntityType<ItemFrameEntity> ITEM_FRAME = register(
      "item_frame", Builder.<ItemFrameEntity>create(ItemFrameEntity::new, EntityClassification.MISC).size(0.5F, 0.5F).trackingRange(10).method32308(Integer.MAX_VALUE)
   );
   public static final EntityType<Class899> FIREBALL = register(
      "fireball", Builder.<Class899>create(Class899::new, EntityClassification.MISC).size(1.0F, 1.0F).trackingRange(4).method32308(10)
   );
   public static final EntityType<LeashKnotEntity> LEASH_KNOT = register(
      "leash_knot",
      Builder.<LeashKnotEntity>create(LeashKnotEntity::new, EntityClassification.MISC).method32303().size(0.5F, 0.5F).trackingRange(10).method32308(Integer.MAX_VALUE)
   );
   public static final EntityType<Class906> LIGHTNING_BOLT = register(
      "lightning_bolt",
      Builder.<Class906>create(Class906::new, EntityClassification.MISC).method32303().size(0.0F, 0.0F).trackingRange(16).method32308(Integer.MAX_VALUE)
   );
   public static final EntityType<Class1064> LLAMA = register(
      "llama", Builder.<Class1064>create(Class1064::new, EntityClassification.CREATURE).size(0.9F, 1.87F).trackingRange(10)
   );
   public static final EntityType<Class883> LLAMA_SPIT = register(
      "llama_spit", Builder.<Class883>create(Class883::new, EntityClassification.MISC).size(0.25F, 0.25F).trackingRange(4).method32308(10)
   );
   public static final EntityType<MagmaCubeEntity> MAGMA_CUBE = register(
      "magma_cube", Builder.<MagmaCubeEntity>create(MagmaCubeEntity::new, EntityClassification.MONSTER).immuneToFire().size(2.04F, 2.04F).trackingRange(8)
   );
   public static final EntityType<Class917> MINECART = register(
      "minecart", Builder.<Class917>create(Class917::new, EntityClassification.MISC).size(0.98F, 0.7F).trackingRange(8)
   );
   public static final EntityType<Class991> CHEST_MINECART = register(
      "chest_minecart", Builder.<Class991>create(Class991::new, EntityClassification.MISC).size(0.98F, 0.7F).trackingRange(8)
   );
   public static final EntityType<Class918> COMMAND_BLOCK_MINECART = register(
      "command_block_minecart", Builder.<Class918>create(Class918::new, EntityClassification.MISC).size(0.98F, 0.7F).trackingRange(8)
   );
   public static final EntityType<Class994> FURNACE_MINECART = register(
      "furnace_minecart", Builder.<Class994>create(Class994::new, EntityClassification.MISC).size(0.98F, 0.7F).trackingRange(8)
   );
   public static final EntityType<Class938> HOPPER_MINECART = register(
      "hopper_minecart", Builder.<Class938>create(Class938::new, EntityClassification.MISC).size(0.98F, 0.7F).trackingRange(8)
   );
   public static final EntityType<Class992> SPAWNER_MINECART = register(
      "spawner_minecart", Builder.<Class992>create(Class992::new, EntityClassification.MISC).size(0.98F, 0.7F).trackingRange(8)
   );
   public static final EntityType<Class993> TNT_MINECART = register(
      "tnt_minecart", Builder.<Class993>create(Class993::new, EntityClassification.MISC).size(0.98F, 0.7F).trackingRange(8)
   );
   public static final EntityType<Class1078> MULE = register(
      "mule", Builder.<Class1078>create(Class1078::new, EntityClassification.CREATURE).size(1.3964844F, 1.6F).trackingRange(8)
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
   public static final EntityType<Class1097> PANDA = register(
      "panda", Builder.<Class1097>create(Class1097::new, EntityClassification.CREATURE).size(1.3F, 1.25F).trackingRange(10)
   );
   public static final EntityType<ParrotEntity> PARROT = register(
      "parrot", Builder.<ParrotEntity>create(ParrotEntity::new, EntityClassification.CREATURE).size(0.5F, 0.9F).trackingRange(8)
   );
   public static final EntityType<Class1110> PHANTOM = register(
      "phantom", Builder.<Class1110>create(Class1110::new, EntityClassification.MONSTER).size(0.9F, 0.5F).trackingRange(8)
   );
   public static final EntityType<Class1072> PIG = register(
      "pig", Builder.<Class1072>create(Class1072::new, EntityClassification.CREATURE).size(0.9F, 0.9F).trackingRange(10)
   );
   public static final EntityType<PiglinEntity> PIGLIN = register(
      "piglin", Builder.<PiglinEntity>create(PiglinEntity::new, EntityClassification.MONSTER).size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<Class1036> PIGLIN_BRUTE = register(
      "piglin_brute", Builder.<Class1036>create(Class1036::new, EntityClassification.MONSTER).size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<Class1024> PILLAGER = register(
      "pillager", Builder.<Class1024>create(Class1024::new, EntityClassification.MONSTER).method32306().size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<PolarBearEntity> POLAR_BEAR = register(
      "polar_bear", Builder.<PolarBearEntity>create(PolarBearEntity::new, EntityClassification.CREATURE).size(1.4F, 1.4F).trackingRange(10)
   );
   public static final EntityType<Class1004> TNT = register(
      "tnt", Builder.<Class1004>create(Class1004::new, EntityClassification.MISC).immuneToFire().size(0.98F, 0.98F).trackingRange(10).method32308(10)
   );
   public static final EntityType<Class1054> PUFFERFISH = register(
      "pufferfish", Builder.<Class1054>create(Class1054::new, EntityClassification.WATER_AMBIENT).size(0.7F, 0.7F).trackingRange(4)
   );
   public static final EntityType<RabbitEntity> RABBIT = register(
      "rabbit", Builder.<RabbitEntity>create(RabbitEntity::new, EntityClassification.CREATURE).size(0.4F, 0.5F).trackingRange(8)
   );
   public static final EntityType<Class1029> RAVAGER = register(
      "ravager", Builder.<Class1029>create(Class1029::new, EntityClassification.MONSTER).size(1.95F, 2.2F).trackingRange(10)
   );
   public static final EntityType<SalmonEntity> SALMON = register(
      "salmon", Builder.<SalmonEntity>create(SalmonEntity::new, EntityClassification.WATER_AMBIENT).size(0.7F, 0.4F).trackingRange(4)
   );
   public static final EntityType<Class1019> SHEEP = register(
      "sheep", Builder.<Class1019>create(Class1019::new, EntityClassification.CREATURE).size(0.9F, 1.3F).trackingRange(10)
   );
   public static final EntityType<Class1057> SHULKER = register(
      "shulker", Builder.<Class1057>create(Class1057::new, EntityClassification.MONSTER).immuneToFire().method32306().size(1.0F, 1.0F).trackingRange(10)
   );
   public static final EntityType<Class905> SHULKER_BULLET = register(
      "shulker_bullet", Builder.<Class905>create(Class905::new, EntityClassification.MISC).size(0.3125F, 0.3125F).trackingRange(8)
   );
   public static final EntityType<SilverfishEntity> SILVERFISH = register(
      "silverfish", Builder.<SilverfishEntity>create(SilverfishEntity::new, EntityClassification.MONSTER).size(0.4F, 0.3F).trackingRange(8)
   );
   public static final EntityType<Class1085> SKELETON = register(
      "skeleton", Builder.<Class1085>create(Class1085::new, EntityClassification.MONSTER).size(0.6F, 1.99F).trackingRange(8)
   );
   public static final EntityType<Class1076> SKELETON_HORSE = register(
      "skeleton_horse", Builder.<Class1076>create(Class1076::new, EntityClassification.CREATURE).size(1.3964844F, 1.6F).trackingRange(10)
   );
   public static final EntityType<SlimeEntity> SLIME = register(
      "slime", Builder.<SlimeEntity>create(SlimeEntity::new, EntityClassification.MONSTER).size(2.04F, 2.04F).trackingRange(10)
   );
   public static final EntityType<Class900> SMALL_FIREBALL = register(
      "small_fireball", Builder.<Class900>create(Class900::new, EntityClassification.MISC).size(0.3125F, 0.3125F).trackingRange(4).method32308(10)
   );
   public static final EntityType<Class1021> SNOW_GOLEM = register(
      "snow_golem", Builder.<Class1021>create(Class1021::new, EntityClassification.MISC).size(0.7F, 1.9F).trackingRange(8)
   );
   public static final EntityType<Class894> SNOWBALL = register(
      "snowball", Builder.<Class894>create(Class894::new, EntityClassification.MISC).size(0.25F, 0.25F).trackingRange(4).method32308(10)
   );
   public static final EntityType<Class885> SPECTRAL_ARROW = register(
      "spectral_arrow", Builder.<Class885>create(Class885::new, EntityClassification.MISC).size(0.5F, 0.5F).trackingRange(4).method32308(20)
   );
   public static final EntityType<Class1101> SPIDER = register(
      "spider", Builder.<Class1101>create(Class1101::new, EntityClassification.MONSTER).size(1.4F, 0.9F).trackingRange(8)
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
   public static final EntityType<Class892> EGG = register(
      "egg", Builder.<Class892>create(Class892::new, EntityClassification.MISC).size(0.25F, 0.25F).trackingRange(4).method32308(10)
   );
   public static final EntityType<Class895> ENDER_PEARL = register(
      "ender_pearl", Builder.<Class895>create(Class895::new, EntityClassification.MISC).size(0.25F, 0.25F).trackingRange(4).method32308(10)
   );
   public static final EntityType<Class891> EXPERIENCE_BOTTLE = register(
      "experience_bottle", Builder.<Class891>create(Class891::new, EntityClassification.MISC).size(0.25F, 0.25F).trackingRange(4).method32308(10)
   );
   public static final EntityType<Class896> POTION = register(
      "potion", Builder.<Class896>create(Class896::new, EntityClassification.MISC).size(0.25F, 0.25F).trackingRange(4).method32308(10)
   );
   public static final EntityType<Class886> TRIDENT = register(
      "trident", Builder.<Class886>create(Class886::new, EntityClassification.MISC).size(0.5F, 0.5F).trackingRange(4).method32308(20)
   );
   public static final EntityType<Class1065> TRADER_LLAMA = register(
      "trader_llama", Builder.<Class1065>create(Class1065::new, EntityClassification.CREATURE).size(0.9F, 1.87F).trackingRange(10)
   );
   public static final EntityType<Class1052> TROPICAL_FISH = register(
      "tropical_fish", Builder.<Class1052>create(Class1052::new, EntityClassification.WATER_AMBIENT).size(0.5F, 0.4F).trackingRange(4)
   );
   public static final EntityType<TurtleEntity> TURTLE = register(
      "turtle", Builder.<TurtleEntity>create(TurtleEntity::new, EntityClassification.CREATURE).size(1.2F, 0.4F).trackingRange(10)
   );
   public static final EntityType<Class1100> VEX = register(
      "vex", Builder.<Class1100>create(Class1100::new, EntityClassification.MONSTER).immuneToFire().size(0.4F, 0.8F).trackingRange(8)
   );
   public static final EntityType<Class1042> VILLAGER = register(
      "villager", Builder.<Class1042>create(Class1042::new, EntityClassification.MISC).size(0.6F, 1.95F).trackingRange(10)
   );
   public static final EntityType<Class1030> VINDICATOR = register(
      "vindicator", Builder.<Class1030>create(Class1030::new, EntityClassification.MONSTER).size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<Class1044> WANDERING_TRADER = register(
      "wandering_trader", Builder.<Class1044>create(Class1044::new, EntityClassification.CREATURE).size(0.6F, 1.95F).trackingRange(10)
   );
   public static final EntityType<Class1027> WITCH = register(
      "witch", Builder.<Class1027>create(Class1027::new, EntityClassification.MONSTER).size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<WitherEntity> WITHER = register(
      "wither",
      Builder.<WitherEntity>create(WitherEntity::new, EntityClassification.MONSTER)
         .immuneToFire()
         .method32305(Blocks.WITHER_ROSE)
         .size(0.9F, 3.5F)
         .trackingRange(10)
   );
   public static final EntityType<Class1084> WITHER_SKELETON = register(
      "wither_skeleton",
      Builder.<Class1084>create(Class1084::new, EntityClassification.MONSTER)
         .immuneToFire()
         .method32305(Blocks.WITHER_ROSE)
         .size(0.7F, 2.4F)
         .trackingRange(8)
   );
   public static final EntityType<Class902> WITHER_SKULL = register(
      "wither_skull", Builder.<Class902>create(Class902::new, EntityClassification.MISC).size(0.3125F, 0.3125F).trackingRange(4).method32308(10)
   );
   public static final EntityType<WolfEntity> WOLF = register(
      "wolf", Builder.<WolfEntity>create(WolfEntity::new, EntityClassification.CREATURE).size(0.6F, 0.85F).trackingRange(10)
   );
   public static final EntityType<Class1093> ZOGLIN = register(
      "zoglin", Builder.<Class1093>create(Class1093::new, EntityClassification.MONSTER).immuneToFire().size(1.3964844F, 1.4F).trackingRange(8)
   );
   public static final EntityType<ZombieEntity> ZOMBIE = register(
      "zombie", Builder.<ZombieEntity>create(ZombieEntity::new, EntityClassification.MONSTER).size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<Class1075> ZOMBIE_HORSE = register(
      "zombie_horse", Builder.<Class1075>create(Class1075::new, EntityClassification.CREATURE).size(1.3964844F, 1.6F).trackingRange(10)
   );
   public static final EntityType<Class1040> ZOMBIE_VILLAGER = register(
      "zombie_villager", Builder.<Class1040>create(Class1040::new, EntityClassification.MONSTER).size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<ZombifiedPiglinEntity> ZOMBIFIED_PIGLIN = register(
      "zombified_piglin", Builder.<ZombifiedPiglinEntity>create(ZombifiedPiglinEntity::new, EntityClassification.MONSTER).immuneToFire().size(0.6F, 1.95F).trackingRange(8)
   );
   public static final EntityType<PlayerEntity> PLAYER = register(
      "player", Builder.<PlayerEntity>method32300(EntityClassification.MISC).method32303().method32302().size(0.6F, 1.8F).trackingRange(32).method32308(2)
   );
   public static final EntityType<Class904> FISHING_BOBBER = register(
      "fishing_bobber", Builder.<Class904>method32300(EntityClassification.MISC).method32303().method32302().size(0.25F, 0.25F).trackingRange(4).method32308(5)
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
            var14.method4237();
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
      return this.field41125.field39968;
   }

   public float method33214() {
      return this.field41125.field39969;
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
                  && !Class3244.method11655(var1)
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
         && this != field41028;
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
