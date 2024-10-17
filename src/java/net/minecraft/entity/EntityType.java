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
import net.minecraft.client.util.Util;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.entity.passive.fish.SalmonEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.Direction;
import net.minecraft.util.ResourceLocation;
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

   public static final EntityType<Class999> AREA_EFFECT_CLOUD = method33197(
      "area_effect_cloud",
      Class8878.<Class999>method32299(Class999::new, EntityClassification.field628).method32304().method32301(6.0F, 0.5F).method32307(10).method32308(Integer.MAX_VALUE)
   );
   public static final EntityType<ArmorStandEntity> ARMOR_STAND = method33197(
      "armor_stand", Class8878.<ArmorStandEntity>method32299(ArmorStandEntity::new, EntityClassification.field628).method32301(0.5F, 1.975F).method32307(10)
   );
   public static final EntityType<Class887> ARROW = method33197(
      "arrow", Class8878.<Class887>method32299(Class887::new, EntityClassification.field628).method32301(0.5F, 0.5F).method32307(4).method32308(20)
   );
   public static final EntityType<Class1114> BAT = method33197(
      "bat", Class8878.<Class1114>method32299(Class1114::new, EntityClassification.field625).method32301(0.5F, 0.9F).method32307(5)
   );
   public static final EntityType<Class1017> BEE = method33197(
      "bee", Class8878.<Class1017>method32299(Class1017::new, EntityClassification.field624).method32301(0.7F, 0.6F).method32307(8)
   );
   public static final EntityType<Class1103> BLAZE = method33197(
      "blaze", Class8878.<Class1103>method32299(Class1103::new, EntityClassification.field623).method32304().method32301(0.6F, 1.8F).method32307(8)
   );
   public static final EntityType<BoatEntity> BOAT = method33197(
      "boat", Class8878.<BoatEntity>method32299(BoatEntity::new, EntityClassification.field628).method32301(1.375F, 0.5625F).method32307(10)
   );
   public static final EntityType<Class1098> CAT = method33197(
      "cat", Class8878.<Class1098>method32299(Class1098::new, EntityClassification.field624).method32301(0.6F, 0.7F).method32307(8)
   );
   public static final EntityType<Class1102> CAVE_SPIDER = method33197(
      "cave_spider", Class8878.<Class1102>method32299(Class1102::new, EntityClassification.field623).method32301(0.7F, 0.5F).method32307(8)
   );
   public static final EntityType<Class1089> CHICKEN = method33197(
      "chicken", Class8878.<Class1089>method32299(Class1089::new, EntityClassification.field624).method32301(0.4F, 0.7F).method32307(10)
   );
   public static final EntityType<Class1051> COD = method33197(
      "cod", Class8878.<Class1051>method32299(Class1051::new, EntityClassification.field627).method32301(0.5F, 0.3F).method32307(4)
   );
   public static final EntityType<Class1087> COW = method33197(
      "cow", Class8878.<Class1087>method32299(Class1087::new, EntityClassification.field624).method32301(0.9F, 1.4F).method32307(10)
   );
   public static final EntityType<Class1081> CREEPER = method33197(
      "creeper", Class8878.<Class1081>method32299(Class1081::new, EntityClassification.field623).method32301(0.6F, 1.7F).method32307(8)
   );
   public static final EntityType<Class1048> DOLPHIN = method33197(
      "dolphin", Class8878.<Class1048>method32299(Class1048::new, EntityClassification.field626).method32301(0.9F, 0.6F)
   );
   public static final EntityType<Class1067> DONKEY = method33197(
      "donkey", Class8878.<Class1067>method32299(Class1067::new, EntityClassification.field624).method32301(1.3964844F, 1.5F).method32307(10)
   );
   public static final EntityType<Class903> DRAGON_FIREBALL = method33197(
      "dragon_fireball", Class8878.<Class903>method32299(Class903::new, EntityClassification.field628).method32301(1.0F, 1.0F).method32307(4).method32308(10)
   );
   public static final EntityType<Class1037> DROWNED = method33197(
      "drowned", Class8878.<Class1037>method32299(Class1037::new, EntityClassification.field623).method32301(0.6F, 1.95F).method32307(8)
   );
   public static final EntityType<Class1106> ELDER_GUARDIAN = method33197(
      "elder_guardian", Class8878.<Class1106>method32299(Class1106::new, EntityClassification.field623).method32301(1.9975F, 1.9975F).method32307(10)
   );
   public static final EntityType<EnderCrystalEntity> field41023 = method33197(
      "end_crystal", Class8878.<EnderCrystalEntity>method32299(EnderCrystalEntity::new, EntityClassification.field628).method32301(2.0F, 2.0F).method32307(16).method32308(Integer.MAX_VALUE)
   );
   public static final EntityType<Class1007> field41024 = method33197(
      "ender_dragon", Class8878.<Class1007>method32299(Class1007::new, EntityClassification.field623).method32304().method32301(16.0F, 8.0F).method32307(10)
   );
   public static final EntityType<EndermanEntity> field41025 = method33197(
      "enderman", Class8878.<EndermanEntity>method32299(EndermanEntity::new, EntityClassification.field623).method32301(0.6F, 2.9F).method32307(8)
   );
   public static final EntityType<Class1104> field41026 = method33197(
      "endermite", Class8878.<Class1104>method32299(Class1104::new, EntityClassification.field623).method32301(0.4F, 0.3F).method32307(8)
   );
   public static final EntityType<Class1032> field41027 = method33197(
      "evoker", Class8878.<Class1032>method32299(Class1032::new, EntityClassification.field623).method32301(0.6F, 1.95F).method32307(8)
   );
   public static final EntityType<Class915> field41028 = method33197(
      "evoker_fangs", Class8878.<Class915>method32299(Class915::new, EntityClassification.field628).method32301(0.5F, 0.8F).method32307(6).method32308(2)
   );
   public static final EntityType<ExperienceOrbEntity> field41029 = method33197(
      "experience_orb", Class8878.<ExperienceOrbEntity>method32299(ExperienceOrbEntity::new, EntityClassification.field628).method32301(0.5F, 0.5F).method32307(6).method32308(20)
   );
   public static final EntityType<Class897> field41030 = method33197(
      "eye_of_ender", Class8878.<Class897>method32299(Class897::new, EntityClassification.field628).method32301(0.25F, 0.25F).method32307(4).method32308(4)
   );
   public static final EntityType<Class907> field41031 = method33197(
      "falling_block", Class8878.<Class907>method32299(Class907::new, EntityClassification.field628).method32301(0.98F, 0.98F).method32307(10).method32308(20)
   );
   public static final EntityType<Class888> field41032 = method33197(
      "firework_rocket", Class8878.<Class888>method32299(Class888::new, EntityClassification.field628).method32301(0.25F, 0.25F).method32307(4).method32308(10)
   );
   public static final EntityType<Class1095> FOX = method33197(
      "fox", Class8878.<Class1095>method32299(Class1095::new, EntityClassification.field624).method32301(0.6F, 0.7F).method32307(8).method32305(Blocks.field37069)
   );
   public static final EntityType<Class1112> GHAST = method33197(
      "ghast", Class8878.<Class1112>method32299(Class1112::new, EntityClassification.field623).method32304().method32301(4.0F, 4.0F).method32307(10)
   );
   public static final EntityType<Class1099> GIANT = method33197(
      "giant", Class8878.<Class1099>method32299(Class1099::new, EntityClassification.field623).method32301(3.6F, 12.0F).method32307(10)
   );
   public static final EntityType<Class1105> GUARDIAN = method33197(
      "guardian", Class8878.<Class1105>method32299(Class1105::new, EntityClassification.field623).method32301(0.85F, 0.85F).method32307(8)
   );
   public static final EntityType<Class1091> HOGLIN = method33197(
      "hoglin", Class8878.<Class1091>method32299(Class1091::new, EntityClassification.field623).method32301(1.3964844F, 1.4F).method32307(8)
   );
   public static final EntityType<Class1074> HORSE = method33197(
      "horse", Class8878.<Class1074>method32299(Class1074::new, EntityClassification.field624).method32301(1.3964844F, 1.6F).method32307(10)
   );
   public static final EntityType<Class1039> HUSK = method33197(
      "husk", Class8878.<Class1039>method32299(Class1039::new, EntityClassification.field623).method32301(0.6F, 1.95F).method32307(8)
   );
   public static final EntityType<Class1033> ILLUSIONER = method33197(
      "illusioner", Class8878.<Class1033>method32299(Class1033::new, EntityClassification.field623).method32301(0.6F, 1.95F).method32307(8)
   );
   public static final EntityType<Class1058> IRON_GOLEM = method33197(
      "iron_golem", Class8878.<Class1058>method32299(Class1058::new, EntityClassification.field628).method32301(1.4F, 2.7F).method32307(10)
   );
   public static final EntityType<ItemEntity> ITEM = method33197(
      "item", Class8878.<ItemEntity>method32299(ItemEntity::new, EntityClassification.field628).method32301(0.25F, 0.25F).method32307(6).method32308(20)
   );
   public static final EntityType<ItemFrameEntity> ITEM_FRAME = method33197(
      "item_frame", Class8878.<ItemFrameEntity>method32299(ItemFrameEntity::new, EntityClassification.field628).method32301(0.5F, 0.5F).method32307(10).method32308(Integer.MAX_VALUE)
   );
   public static final EntityType<Class899> FIREBALL = method33197(
      "fireball", Class8878.<Class899>method32299(Class899::new, EntityClassification.field628).method32301(1.0F, 1.0F).method32307(4).method32308(10)
   );
   public static final EntityType<LeashKnotEntity> LEASH_KNOT = method33197(
      "leash_knot",
      Class8878.<LeashKnotEntity>method32299(LeashKnotEntity::new, EntityClassification.field628).method32303().method32301(0.5F, 0.5F).method32307(10).method32308(Integer.MAX_VALUE)
   );
   public static final EntityType<Class906> LIGHTNING_BOLT = method33197(
      "lightning_bolt",
      Class8878.<Class906>method32299(Class906::new, EntityClassification.field628).method32303().method32301(0.0F, 0.0F).method32307(16).method32308(Integer.MAX_VALUE)
   );
   public static final EntityType<Class1064> LLAMA = method33197(
      "llama", Class8878.<Class1064>method32299(Class1064::new, EntityClassification.field624).method32301(0.9F, 1.87F).method32307(10)
   );
   public static final EntityType<Class883> LLAMA_SPIT = method33197(
      "llama_spit", Class8878.<Class883>method32299(Class883::new, EntityClassification.field628).method32301(0.25F, 0.25F).method32307(4).method32308(10)
   );
   public static final EntityType<Class1109> MAGMA_CUBE = method33197(
      "magma_cube", Class8878.<Class1109>method32299(Class1109::new, EntityClassification.field623).method32304().method32301(2.04F, 2.04F).method32307(8)
   );
   public static final EntityType<Class917> MINECART = method33197(
      "minecart", Class8878.<Class917>method32299(Class917::new, EntityClassification.field628).method32301(0.98F, 0.7F).method32307(8)
   );
   public static final EntityType<Class991> CHEST_MINECART = method33197(
      "chest_minecart", Class8878.<Class991>method32299(Class991::new, EntityClassification.field628).method32301(0.98F, 0.7F).method32307(8)
   );
   public static final EntityType<Class918> COMMAND_BLOCK_MINECART = method33197(
      "command_block_minecart", Class8878.<Class918>method32299(Class918::new, EntityClassification.field628).method32301(0.98F, 0.7F).method32307(8)
   );
   public static final EntityType<Class994> FURNACE_MINECART = method33197(
      "furnace_minecart", Class8878.<Class994>method32299(Class994::new, EntityClassification.field628).method32301(0.98F, 0.7F).method32307(8)
   );
   public static final EntityType<Class938> HOPPER_MINECART = method33197(
      "hopper_minecart", Class8878.<Class938>method32299(Class938::new, EntityClassification.field628).method32301(0.98F, 0.7F).method32307(8)
   );
   public static final EntityType<Class992> SPAWNER_MINECART = method33197(
      "spawner_minecart", Class8878.<Class992>method32299(Class992::new, EntityClassification.field628).method32301(0.98F, 0.7F).method32307(8)
   );
   public static final EntityType<Class993> TNT_MINECART = method33197(
      "tnt_minecart", Class8878.<Class993>method32299(Class993::new, EntityClassification.field628).method32301(0.98F, 0.7F).method32307(8)
   );
   public static final EntityType<Class1078> MULE = method33197(
      "mule", Class8878.<Class1078>method32299(Class1078::new, EntityClassification.field624).method32301(1.3964844F, 1.6F).method32307(8)
   );
   public static final EntityType<Class1086> MOOSHROOM = method33197(
      "mooshroom", Class8878.<Class1086>method32299(Class1086::new, EntityClassification.field624).method32301(0.9F, 1.4F).method32307(10)
   );
   public static final EntityType<Class1090> OCELOT = method33197(
      "ocelot", Class8878.<Class1090>method32299(Class1090::new, EntityClassification.field624).method32301(0.6F, 0.7F).method32307(10)
   );
   public static final EntityType<PaintingEntity> PAINTING = method33197(
      "painting", Class8878.<PaintingEntity>method32299(PaintingEntity::new, EntityClassification.field628).method32301(0.5F, 0.5F).method32307(10).method32308(Integer.MAX_VALUE)
   );
   public static final EntityType<Class1097> PANDA = method33197(
      "panda", Class8878.<Class1097>method32299(Class1097::new, EntityClassification.field624).method32301(1.3F, 1.25F).method32307(10)
   );
   public static final EntityType<Class1015> PARROT = method33197(
      "parrot", Class8878.<Class1015>method32299(Class1015::new, EntityClassification.field624).method32301(0.5F, 0.9F).method32307(8)
   );
   public static final EntityType<Class1110> PHANTOM = method33197(
      "phantom", Class8878.<Class1110>method32299(Class1110::new, EntityClassification.field623).method32301(0.9F, 0.5F).method32307(8)
   );
   public static final EntityType<Class1072> PIG = method33197(
      "pig", Class8878.<Class1072>method32299(Class1072::new, EntityClassification.field624).method32301(0.9F, 0.9F).method32307(10)
   );
   public static final EntityType<Class1034> PIGLIN = method33197(
      "piglin", Class8878.<Class1034>method32299(Class1034::new, EntityClassification.field623).method32301(0.6F, 1.95F).method32307(8)
   );
   public static final EntityType<Class1036> PIGLIN_BRUTE = method33197(
      "piglin_brute", Class8878.<Class1036>method32299(Class1036::new, EntityClassification.field623).method32301(0.6F, 1.95F).method32307(8)
   );
   public static final EntityType<Class1024> PILLAGER = method33197(
      "pillager", Class8878.<Class1024>method32299(Class1024::new, EntityClassification.field623).method32306().method32301(0.6F, 1.95F).method32307(8)
   );
   public static final EntityType<Class1096> POLAR_BEAR = method33197(
      "polar_bear", Class8878.<Class1096>method32299(Class1096::new, EntityClassification.field624).method32301(1.4F, 1.4F).method32307(10)
   );
   public static final EntityType<Class1004> TNT = method33197(
      "tnt", Class8878.<Class1004>method32299(Class1004::new, EntityClassification.field628).method32304().method32301(0.98F, 0.98F).method32307(10).method32308(10)
   );
   public static final EntityType<Class1054> PUFFERFISH = method33197(
      "pufferfish", Class8878.<Class1054>method32299(Class1054::new, EntityClassification.field627).method32301(0.7F, 0.7F).method32307(4)
   );
   public static final EntityType<Class1094> RABBIT = method33197(
      "rabbit", Class8878.<Class1094>method32299(Class1094::new, EntityClassification.field624).method32301(0.4F, 0.5F).method32307(8)
   );
   public static final EntityType<Class1029> RAVAGER = method33197(
      "ravager", Class8878.<Class1029>method32299(Class1029::new, EntityClassification.field623).method32301(1.95F, 2.2F).method32307(10)
   );
   public static final EntityType<SalmonEntity> SALMON = method33197(
      "salmon", Class8878.<SalmonEntity>method32299(SalmonEntity::new, EntityClassification.field627).method32301(0.7F, 0.4F).method32307(4)
   );
   public static final EntityType<Class1019> SHEEP = method33197(
      "sheep", Class8878.<Class1019>method32299(Class1019::new, EntityClassification.field624).method32301(0.9F, 1.3F).method32307(10)
   );
   public static final EntityType<Class1057> SHULKER = method33197(
      "shulker", Class8878.<Class1057>method32299(Class1057::new, EntityClassification.field623).method32304().method32306().method32301(1.0F, 1.0F).method32307(10)
   );
   public static final EntityType<Class905> SHULKER_BULLET = method33197(
      "shulker_bullet", Class8878.<Class905>method32299(Class905::new, EntityClassification.field628).method32301(0.3125F, 0.3125F).method32307(8)
   );
   public static final EntityType<Class1107> SILVERFISH = method33197(
      "silverfish", Class8878.<Class1107>method32299(Class1107::new, EntityClassification.field623).method32301(0.4F, 0.3F).method32307(8)
   );
   public static final EntityType<Class1085> SKELETON = method33197(
      "skeleton", Class8878.<Class1085>method32299(Class1085::new, EntityClassification.field623).method32301(0.6F, 1.99F).method32307(8)
   );
   public static final EntityType<Class1076> SKELETON_HORSE = method33197(
      "skeleton_horse", Class8878.<Class1076>method32299(Class1076::new, EntityClassification.field624).method32301(1.3964844F, 1.6F).method32307(10)
   );
   public static final EntityType<Class1108> SLIME = method33197(
      "slime", Class8878.<Class1108>method32299(Class1108::new, EntityClassification.field623).method32301(2.04F, 2.04F).method32307(10)
   );
   public static final EntityType<Class900> SMALL_FIREBALL = method33197(
      "small_fireball", Class8878.<Class900>method32299(Class900::new, EntityClassification.field628).method32301(0.3125F, 0.3125F).method32307(4).method32308(10)
   );
   public static final EntityType<Class1021> SNOW_GOLEM = method33197(
      "snow_golem", Class8878.<Class1021>method32299(Class1021::new, EntityClassification.field628).method32301(0.7F, 1.9F).method32307(8)
   );
   public static final EntityType<Class894> SNOWBALL = method33197(
      "snowball", Class8878.<Class894>method32299(Class894::new, EntityClassification.field628).method32301(0.25F, 0.25F).method32307(4).method32308(10)
   );
   public static final EntityType<Class885> SPECTRAL_ARROW = method33197(
      "spectral_arrow", Class8878.<Class885>method32299(Class885::new, EntityClassification.field628).method32301(0.5F, 0.5F).method32307(4).method32308(20)
   );
   public static final EntityType<Class1101> SPIDER = method33197(
      "spider", Class8878.<Class1101>method32299(Class1101::new, EntityClassification.field623).method32301(1.4F, 0.9F).method32307(8)
   );
   public static final EntityType<SquidEntity> SQUID = method33197(
      "squid", Class8878.<SquidEntity>method32299(SquidEntity::new, EntityClassification.field626).method32301(0.8F, 0.8F).method32307(8)
   );
   public static final EntityType<Class1083> STRAY = method33197(
      "stray", Class8878.<Class1083>method32299(Class1083::new, EntityClassification.field623).method32301(0.6F, 1.99F).method32307(8)
   );
   public static final EntityType<Class1070> STRIDER = method33197(
      "strider", Class8878.<Class1070>method32299(Class1070::new, EntityClassification.field624).method32304().method32301(0.9F, 1.7F).method32307(10)
   );
   public static final EntityType<Class892> EGG = method33197(
      "egg", Class8878.<Class892>method32299(Class892::new, EntityClassification.field628).method32301(0.25F, 0.25F).method32307(4).method32308(10)
   );
   public static final EntityType<Class895> ENDER_PEARL = method33197(
      "ender_pearl", Class8878.<Class895>method32299(Class895::new, EntityClassification.field628).method32301(0.25F, 0.25F).method32307(4).method32308(10)
   );
   public static final EntityType<Class891> EXPERIENCE_BOTTLE = method33197(
      "experience_bottle", Class8878.<Class891>method32299(Class891::new, EntityClassification.field628).method32301(0.25F, 0.25F).method32307(4).method32308(10)
   );
   public static final EntityType<Class896> POTION = method33197(
      "potion", Class8878.<Class896>method32299(Class896::new, EntityClassification.field628).method32301(0.25F, 0.25F).method32307(4).method32308(10)
   );
   public static final EntityType<Class886> TRIDENT = method33197(
      "trident", Class8878.<Class886>method32299(Class886::new, EntityClassification.field628).method32301(0.5F, 0.5F).method32307(4).method32308(20)
   );
   public static final EntityType<Class1065> TRADER_LLAMA = method33197(
      "trader_llama", Class8878.<Class1065>method32299(Class1065::new, EntityClassification.field624).method32301(0.9F, 1.87F).method32307(10)
   );
   public static final EntityType<Class1052> TROPICAL_FISH = method33197(
      "tropical_fish", Class8878.<Class1052>method32299(Class1052::new, EntityClassification.field627).method32301(0.5F, 0.4F).method32307(4)
   );
   public static final EntityType<Class1088> TURTLE = method33197(
      "turtle", Class8878.<Class1088>method32299(Class1088::new, EntityClassification.field624).method32301(1.2F, 0.4F).method32307(10)
   );
   public static final EntityType<Class1100> VEX = method33197(
      "vex", Class8878.<Class1100>method32299(Class1100::new, EntityClassification.field623).method32304().method32301(0.4F, 0.8F).method32307(8)
   );
   public static final EntityType<Class1042> VILLAGER = method33197(
      "villager", Class8878.<Class1042>method32299(Class1042::new, EntityClassification.field628).method32301(0.6F, 1.95F).method32307(10)
   );
   public static final EntityType<Class1030> VINDICATOR = method33197(
      "vindicator", Class8878.<Class1030>method32299(Class1030::new, EntityClassification.field623).method32301(0.6F, 1.95F).method32307(8)
   );
   public static final EntityType<Class1044> WANDERING_TRADER = method33197(
      "wandering_trader", Class8878.<Class1044>method32299(Class1044::new, EntityClassification.field624).method32301(0.6F, 1.95F).method32307(10)
   );
   public static final EntityType<Class1027> WITCH = method33197(
      "witch", Class8878.<Class1027>method32299(Class1027::new, EntityClassification.field623).method32301(0.6F, 1.95F).method32307(8)
   );
   public static final EntityType<WitherEntity> WITHER = method33197(
      "wither",
      Class8878.<WitherEntity>method32299(WitherEntity::new, EntityClassification.field623)
         .method32304()
         .method32305(Blocks.WITHER_ROSE)
         .method32301(0.9F, 3.5F)
         .method32307(10)
   );
   public static final EntityType<Class1084> WITHER_SKELETON = method33197(
      "wither_skeleton",
      Class8878.<Class1084>method32299(Class1084::new, EntityClassification.field623)
         .method32304()
         .method32305(Blocks.WITHER_ROSE)
         .method32301(0.7F, 2.4F)
         .method32307(8)
   );
   public static final EntityType<Class902> WITHER_SKULL = method33197(
      "wither_skull", Class8878.<Class902>method32299(Class902::new, EntityClassification.field628).method32301(0.3125F, 0.3125F).method32307(4).method32308(10)
   );
   public static final EntityType<WolfEntity> WOLF = method33197(
      "wolf", Class8878.<WolfEntity>method32299(WolfEntity::new, EntityClassification.field624).method32301(0.6F, 0.85F).method32307(10)
   );
   public static final EntityType<Class1093> ZOGLIN = method33197(
      "zoglin", Class8878.<Class1093>method32299(Class1093::new, EntityClassification.field623).method32304().method32301(1.3964844F, 1.4F).method32307(8)
   );
   public static final EntityType<ZombieEntity> ZOMBIE = method33197(
      "zombie", Class8878.<ZombieEntity>method32299(ZombieEntity::new, EntityClassification.field623).method32301(0.6F, 1.95F).method32307(8)
   );
   public static final EntityType<Class1075> ZOMBIE_HORSE = method33197(
      "zombie_horse", Class8878.<Class1075>method32299(Class1075::new, EntityClassification.field624).method32301(1.3964844F, 1.6F).method32307(10)
   );
   public static final EntityType<Class1040> ZOMBIE_VILLAGER = method33197(
      "zombie_villager", Class8878.<Class1040>method32299(Class1040::new, EntityClassification.field623).method32301(0.6F, 1.95F).method32307(8)
   );
   public static final EntityType<ZombifiedPiglinEntity> ZOMBIFIED_PIGLIN = method33197(
      "zombified_piglin", Class8878.<ZombifiedPiglinEntity>method32299(ZombifiedPiglinEntity::new, EntityClassification.field623).method32304().method32301(0.6F, 1.95F).method32307(8)
   );
   public static final EntityType<PlayerEntity> PLAYER = method33197(
      "player", Class8878.<PlayerEntity>method32300(EntityClassification.field628).method32303().method32302().method32301(0.6F, 1.8F).method32307(32).method32308(2)
   );
   public static final EntityType<Class904> FISHING_BOBBER = method33197(
      "fishing_bobber", Class8878.<Class904>method32300(EntityClassification.field628).method32303().method32302().method32301(0.25F, 0.25F).method32307(4).method32308(5)
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

   private static <T extends Entity> EntityType<T> method33197(String var0, Class8878<T> var1) {
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
   public Entity method33200(ServerWorld var1, ItemStack var2, PlayerEntity var3, BlockPos var4, Class2202 var5, boolean var6, boolean var7) {
      return this.method33201(
         var1, var2 != null ? var2.method32142() : null, var2 != null && var2.method32152() ? var2.method32149() : null, var3, var4, var5, var6, var7
      );
   }

   @Nullable
   public T method33201(ServerWorld var1, CompoundNBT var2, ITextComponent var3, PlayerEntity var4, BlockPos var5, Class2202 var6, boolean var7, boolean var8) {
      Entity var11 = this.method33202(var1, var2, var3, var4, var5, var6, var7, var8);
      if (var11 != null) {
         var1.method6995(var11);
      }

      return (T)var11;
   }

   @Nullable
   public T method33202(ServerWorld var1, CompoundNBT var2, ITextComponent var3, PlayerEntity var4, BlockPos var5, Class2202 var6, boolean var7, boolean var8) {
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
            var7.method140(var3.getCompound("EntityTag"));
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

   public ITextComponent method33211() {
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
                  && !var1.isIn(Blocks.field36890)
                  && !Class3244.method11655(var1)
                  && !var1.isIn(Blocks.LAVA)
            ? var1.isIn(Blocks.WITHER_ROSE) || var1.isIn(Blocks.field37069) || var1.isIn(Blocks.CACTUS)
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
            ListNBT var6 = var0.method131("Passengers", 10);

            for (int var7 = 0; var7 < var6.size(); var7++) {
               Entity var8 = method33223(var6.method153(var7), var1, var2);
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
      return var1.method24917(this);
   }
}
