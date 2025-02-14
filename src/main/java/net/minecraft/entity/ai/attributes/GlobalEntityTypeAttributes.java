package net.minecraft.entity.ai.attributes;

import mapped.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.passive.WolfEntity;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.entity.passive.fish.AbstractFishEntity;
import net.minecraft.entity.passive.horse.AbstractHorseEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GlobalEntityTypeAttributes {
   private static final Logger LOGGER = LogManager.getLogger();
   private static final Map<EntityType<? extends LivingEntity>, AttributeModifierMap> VANILLA_ATTRIBUTES = ImmutableMap.<EntityType<? extends LivingEntity>, AttributeModifierMap>builder()
      .put(EntityType.ARMOR_STAND, LivingEntity.registerAttributes().method21850())
      .put(EntityType.BAT, BatEntity.method5363().method21850())
      .put(EntityType.BEE, BeeEntity.method4447().method21850())
      .put(EntityType.BLAZE, BlazeEntity.method5292().method21850())
      .put(EntityType.CAT, CatEntity.method5259().method21850())
      .put(EntityType.CAVE_SPIDER, CaveSpiderEntity.method5291().method21850())
      .put(EntityType.CHICKEN, ChickenEntity.method5069().method21850())
      .put(EntityType.COD, AbstractFishEntity.method4791().method21850())
      .put(EntityType.COW, CowEntity.method5040().method21850())
      .put(EntityType.CREEPER, CreeperEntity.method5018().method21850())
      .put(EntityType.DOLPHIN, DolphinEntity.method4782().method21850())
      .put(EntityType.DONKEY, Class1066.method4926().method21850())
      .put(EntityType.DROWNED, ZombieEntity.method4653().method21850())
      .put(EntityType.ELDER_GUARDIAN, ElderGuardianEntity.method5314().method21850())
      .put(EntityType.ENDERMAN, EndermanEntity.method4345().method21850())
      .put(EntityType.ENDERMITE, EndermiteEntity.method5296().method21850())
      .put(EntityType.ENDER_DRAGON, EnderDragonEntity.method2997().method21850())
      .put(EntityType.EVOKER, EvokerEntity.method4600().method21850())
      .put(EntityType.FOX, FoxEntity.method5123().method21850())
      .put(EntityType.GHAST, GhastEntity.method5360().method21850())
      .put(EntityType.GIANT, GiantEntity.method5268().method21850())
      .put(EntityType.GUARDIAN, GuardianEntity.method5300().method21850())
      .put(EntityType.HOGLIN, HoglinEntity.method5080().method21850())
      .put(EntityType.HORSE, AbstractHorseEntity.method4951().method21850())
      .put(EntityType.HUSK, ZombieEntity.method4653().method21850())
      .put(EntityType.ILLUSIONER, IllusionerEntity.method4610().method21850())
      .put(EntityType.IRON_GOLEM, IronGolemEntity.method4863().method21850())
      .put(EntityType.LLAMA, LlamaEntity.method4888().method21850())
      .put(EntityType.MAGMA_CUBE, MagmaCubeEntity.method5334().method21850())
      .put(EntityType.MOOSHROOM, CowEntity.method5040().method21850())
      .put(EntityType.MULE, Class1066.method4926().method21850())
      .put(EntityType.OCELOT, OcelotEntity.method5074().method21850())
      .put(EntityType.PANDA, PandaEntity.method5208().method21850())
      .put(EntityType.PARROT, ParrotEntity.method4406().method21850())
      .put(EntityType.PHANTOM, MonsterEntity.method4343().method21850())
      .put(EntityType.PIG, PigEntity.method4989().method21850())
      .put(EntityType.PIGLIN, PiglinEntity.method4614().method21850())
      .put(EntityType.PIGLIN_BRUTE, PiglinBruteEntity.method4637().method21850())
      .put(EntityType.PILLAGER, Class1024.method4541().method21850())
      .put(EntityType.PLAYER, PlayerEntity.method2849().method21850())
      .put(EntityType.POLAR_BEAR, PolarBearEntity.method5180().method21850())
      .put(EntityType.PUFFERFISH, AbstractFishEntity.method4791().method21850())
      .put(EntityType.RABBIT, RabbitEntity.method5111().method21850())
      .put(EntityType.RAVAGER, RavagerEntity.method4581().method21850())
      .put(EntityType.SALMON, AbstractFishEntity.method4791().method21850())
      .put(EntityType.SHEEP, SheepEntity.method4512().method21850())
      .put(EntityType.SHULKER, ShulkerEntity.method4843().method21850())
      .put(EntityType.SILVERFISH, SilverfishEntity.method5316().method21850())
      .put(EntityType.SKELETON, Class1082.method5029().method21850())
      .put(EntityType.SKELETON_HORSE, SkeletonHorseEntity.method4999().method21850())
      .put(EntityType.SLIME, MonsterEntity.method4343().method21850())
      .put(EntityType.SNOW_GOLEM, SnowGolemEntity.method4529().method21850())
      .put(EntityType.SPIDER, SpiderEntity.method5288().method21850())
      .put(EntityType.SQUID, SquidEntity.method4836().method21850())
      .put(EntityType.STRAY, Class1082.method5029().method21850())
      .put(EntityType.STRIDER, StriderEntity.method4986().method21850())
      .put(EntityType.TRADER_LLAMA, LlamaEntity.method4888().method21850())
      .put(EntityType.TROPICAL_FISH, AbstractFishEntity.method4791().method21850())
      .put(EntityType.TURTLE, TurtleEntity.method5054().method21850())
      .put(EntityType.VEX, VexEntity.method5269().method21850())
      .put(EntityType.VILLAGER, VillagerEntity.method2997().method21850())
      .put(EntityType.VINDICATOR, VindicatorEntity.method4589().method21850())
      .put(EntityType.WANDERING_TRADER, MobEntity.method4220().method21850())
      .put(EntityType.WITCH, WitchEntity.method4569().method21850())
      .put(EntityType.WITHER, WitherEntity.method2997().method21850())
      .put(EntityType.WITHER_SKELETON, Class1082.method5029().method21850())
      .put(EntityType.WOLF, WolfEntity.method4373().method21850())
      .put(EntityType.ZOGLIN, ZoglinEntity.method5098().method21850())
      .put(EntityType.ZOMBIE, ZombieEntity.method4653().method21850())
      .put(EntityType.ZOMBIE_HORSE, ZombieHorseEntity.method4998().method21850())
      .put(EntityType.ZOMBIE_VILLAGER, ZombieEntity.method4653().method21850())
      .put(EntityType.ZOMBIFIED_PIGLIN, ZombifiedPiglinEntity.func_234352_eU_().method21850())
      .build();

   public static AttributeModifierMap method37375(EntityType<? extends LivingEntity> var0) {
      return VANILLA_ATTRIBUTES.get(var0);
   }

   public static boolean method37376(EntityType<?> var0) {
      return VANILLA_ATTRIBUTES.containsKey(var0);
   }

   public static void method37377() {
      Registry.ENTITY_TYPE
         .stream()
         .filter(var0 -> var0.method33209() != EntityClassification.MISC)
         .filter(var0 -> !method37376((EntityType<?>)var0))
         .<ResourceLocation>map(Registry.ENTITY_TYPE::getKey)
         .forEach(var0 -> {
            if (!SharedConstants.developmentMode) {
               LOGGER.error("Entity {} has no attributes", var0);
            } else {
               throw new IllegalStateException("Entity " + var0 + " has no attributes");
            }
         });
   }
}
