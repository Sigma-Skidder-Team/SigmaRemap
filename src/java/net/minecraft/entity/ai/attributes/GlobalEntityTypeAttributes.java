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
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GlobalEntityTypeAttributes {
   private static final Logger LOGGER = LogManager.getLogger();
   private static final Map<EntityType<? extends LivingEntity>, AttributeModifierMap> VANILLA_ATTRIBUTES = ImmutableMap.<EntityType<? extends LivingEntity>, AttributeModifierMap>builder()
      .put(EntityType.ARMOR_STAND, LivingEntity.method2997().method21850())
      .put(EntityType.BAT, Class1114.method5363().method21850())
      .put(EntityType.BEE, Class1017.method4447().method21850())
      .put(EntityType.BLAZE, Class1103.method5292().method21850())
      .put(EntityType.CAT, Class1098.method5259().method21850())
      .put(EntityType.CAVE_SPIDER, Class1102.method5291().method21850())
      .put(EntityType.CHICKEN, Class1089.method5069().method21850())
      .put(EntityType.COD, Class1049.method4791().method21850())
      .put(EntityType.COW, Class1087.method5040().method21850())
      .put(EntityType.CREEPER, Class1081.method5018().method21850())
      .put(EntityType.DOLPHIN, Class1048.method4782().method21850())
      .put(EntityType.DONKEY, Class1066.method4926().method21850())
      .put(EntityType.DROWNED, ZombieEntity.method4653().method21850())
      .put(EntityType.ELDER_GUARDIAN, Class1106.method5314().method21850())
      .put(EntityType.field41025, EndermanEntity.method4345().method21850())
      .put(EntityType.field41026, Class1104.method5296().method21850())
      .put(EntityType.field41024, Class1007.method2997().method21850())
      .put(EntityType.field41027, Class1032.method4600().method21850())
      .put(EntityType.FOX, Class1095.method5123().method21850())
      .put(EntityType.GHAST, Class1112.method5360().method21850())
      .put(EntityType.GIANT, Class1099.method5268().method21850())
      .put(EntityType.GUARDIAN, Class1105.method5300().method21850())
      .put(EntityType.HOGLIN, Class1091.method5080().method21850())
      .put(EntityType.HORSE, AbstractHorseEntity.method4951().method21850())
      .put(EntityType.HUSK, ZombieEntity.method4653().method21850())
      .put(EntityType.ILLUSIONER, Class1033.method4610().method21850())
      .put(EntityType.IRON_GOLEM, Class1058.method4863().method21850())
      .put(EntityType.LLAMA, Class1064.method4888().method21850())
      .put(EntityType.MAGMA_CUBE, Class1109.method5334().method21850())
      .put(EntityType.MOOSHROOM, Class1087.method5040().method21850())
      .put(EntityType.MULE, Class1066.method4926().method21850())
      .put(EntityType.OCELOT, Class1090.method5074().method21850())
      .put(EntityType.PANDA, Class1097.method5208().method21850())
      .put(EntityType.PARROT, Class1015.method4406().method21850())
      .put(EntityType.PHANTOM, MonsterEntity.method4343().method21850())
      .put(EntityType.PIG, Class1072.method4989().method21850())
      .put(EntityType.PIGLIN, Class1034.method4614().method21850())
      .put(EntityType.PIGLIN_BRUTE, Class1036.method4637().method21850())
      .put(EntityType.PILLAGER, Class1024.method4541().method21850())
      .put(EntityType.PLAYER, PlayerEntity.method2849().method21850())
      .put(EntityType.POLAR_BEAR, Class1096.method5180().method21850())
      .put(EntityType.PUFFERFISH, Class1049.method4791().method21850())
      .put(EntityType.RABBIT, Class1094.method5111().method21850())
      .put(EntityType.RAVAGER, Class1029.method4581().method21850())
      .put(EntityType.SALMON, Class1049.method4791().method21850())
      .put(EntityType.SHEEP, Class1019.method4512().method21850())
      .put(EntityType.SHULKER, Class1057.method4843().method21850())
      .put(EntityType.SILVERFISH, Class1107.method5316().method21850())
      .put(EntityType.SKELETON, Class1082.method5029().method21850())
      .put(EntityType.SKELETON_HORSE, Class1076.method4999().method21850())
      .put(EntityType.SLIME, MonsterEntity.method4343().method21850())
      .put(EntityType.SNOW_GOLEM, Class1021.method4529().method21850())
      .put(EntityType.SPIDER, Class1101.method5288().method21850())
      .put(EntityType.SQUID, SquidEntity.method4836().method21850())
      .put(EntityType.STRAY, Class1082.method5029().method21850())
      .put(EntityType.STRIDER, Class1070.method4986().method21850())
      .put(EntityType.TRADER_LLAMA, Class1064.method4888().method21850())
      .put(EntityType.TROPICAL_FISH, Class1049.method4791().method21850())
      .put(EntityType.TURTLE, Class1088.method5054().method21850())
      .put(EntityType.VEX, Class1100.method5269().method21850())
      .put(EntityType.VILLAGER, Class1042.method2997().method21850())
      .put(EntityType.VINDICATOR, Class1030.method4589().method21850())
      .put(EntityType.WANDERING_TRADER, MobEntity.method4220().method21850())
      .put(EntityType.WITCH, Class1027.method4569().method21850())
      .put(EntityType.WITHER, WitherEntity.method2997().method21850())
      .put(EntityType.WITHER_SKELETON, Class1082.method5029().method21850())
      .put(EntityType.WOLF, WolfEntity.method4373().method21850())
      .put(EntityType.ZOGLIN, Class1093.method5098().method21850())
      .put(EntityType.ZOMBIE, ZombieEntity.method4653().method21850())
      .put(EntityType.ZOMBIE_HORSE, Class1075.method4998().method21850())
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
