package mapped;

import com.google.common.collect.Maps;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;

import java.util.Map;
import java.util.Random;

public class EntitySpawnPlacementRegistry {
   private static final Map<EntityType<?>, EntitySpawnPlacementRegistry$Entry> REGISTRY = Maps.newHashMap();

   private static <T extends MobEntity> void register(EntityType<T> entityType, EntitySpawnPlacementRegistry$PlacementType placementType, Heightmap.Type heightMapType, EntitySpawnPlacementRegistry$IPlacementPredicate<T> placementPredicate) {
      EntitySpawnPlacementRegistry$Entry entry = REGISTRY.put(entityType, new EntitySpawnPlacementRegistry$Entry(heightMapType, placementType, placementPredicate));
      if (entry != null) {
         throw new IllegalStateException("Duplicate registration for type " + Registry.ENTITY_TYPE.getKey(entityType));
      }
   }

   public static EntitySpawnPlacementRegistry$PlacementType getPlacementType(EntityType<?> entityType) {
      EntitySpawnPlacementRegistry$Entry var3 = REGISTRY.get(entityType);
      return var3 != null ? EntitySpawnPlacementRegistry$Entry.getPlacementType(var3) : EntitySpawnPlacementRegistry$PlacementType.NO_RESTRICTIONS;
   }

   public static Heightmap.Type method21121(EntityType<?> var0) {
      EntitySpawnPlacementRegistry$Entry var3 = REGISTRY.get(var0);
      return var3 != null ? EntitySpawnPlacementRegistry$Entry.getType(var3) : Heightmap.Type.MOTION_BLOCKING_NO_LEAVES;
   }

   public static <T extends Entity> boolean method21122(EntityType<T> var0, Class1659 var1, Class2202 var2, BlockPos var3, Random var4) {
      EntitySpawnPlacementRegistry$Entry var7 = REGISTRY.get(var0);
      return var7 == null || EntitySpawnPlacementRegistry$Entry.getPlacementPredicate(var7).method32251(var0, var1, var2, var3, var4);
   }

   static {
      register(EntityType.COD, EntitySpawnPlacementRegistry$PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::canSpawn);
      register(EntityType.DOLPHIN, EntitySpawnPlacementRegistry$PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, DolphinEntity::canSpawn);
      register(EntityType.DROWNED, EntitySpawnPlacementRegistry$PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, DrownedEntity::canSpawn);
      register(EntityType.GUARDIAN, EntitySpawnPlacementRegistry$PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, GuardianEntity::canSpawn);
      register(EntityType.PUFFERFISH, EntitySpawnPlacementRegistry$PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::canSpawn);
      register(EntityType.SALMON, EntitySpawnPlacementRegistry$PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::canSpawn);
      register(EntityType.SQUID, EntitySpawnPlacementRegistry$PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, SquidEntity::canSpawn);
      register(EntityType.TROPICAL_FISH, EntitySpawnPlacementRegistry$PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AbstractFishEntity::canSpawn);
      register(EntityType.BAT, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, BatEntity::canSpawn);
      register(EntityType.BLAZE, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canMonsterSpawn);
      register(EntityType.CAVE_SPIDER, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canMonsterSpawnInLight);
      register(EntityType.CHICKEN, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
      register(EntityType.COW, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
      register(EntityType.CREEPER, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canMonsterSpawnInLight);
      register(EntityType.DONKEY, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
      register(EntityType.ENDERMAN, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canMonsterSpawnInLight);
      register(EntityType.ENDERMITE, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, EndermiteEntity::canSpawn);
      register(EntityType.ENDER_DRAGON, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::canSpawnOn);
      register(EntityType.GHAST, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, GhastEntity::canSpawn);
      register(EntityType.GIANT, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canMonsterSpawnInLight);
      register(EntityType.HORSE, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
      register(EntityType.HUSK, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HuskEntity::canSpawn);
      register(EntityType.IRON_GOLEM, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::canSpawnOn);
      register(EntityType.LLAMA, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
      register(EntityType.MAGMA_CUBE, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MagmaCubeEntity::canSpawn);
      register(EntityType.MOOSHROOM, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MooshroomEntity::canSpawn);
      register(EntityType.MULE, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
      register(EntityType.OCELOT, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, OcelotEntity::canSpawn);
      register(EntityType.PARROT, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING, ParrotEntity::canSpawn);
      register(EntityType.PIG, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
      register(EntityType.HOGLIN, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, HoglinEntity::method5081);
      register(EntityType.PIGLIN, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, PiglinEntity::method4615);
      register(EntityType.PILLAGER, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, PillagerEntity::method4572);
      register(EntityType.POLAR_BEAR, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, PolarBearEntity::method5181);
      register(EntityType.RABBIT, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, RabbitEntity::method5117);
      register(EntityType.SHEEP, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
      register(EntityType.SILVERFISH, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, SilverfishEntity::method5317);
      register(EntityType.SKELETON, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canMonsterSpawnInLight);
      register(EntityType.SKELETON_HORSE, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
      register(EntityType.SLIME, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, SlimeEntity::method5328);
      register(EntityType.SNOW_GOLEM, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::canSpawnOn);
      register(EntityType.SPIDER, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canMonsterSpawnInLight);
      register(EntityType.STRAY, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, StrayEntity::method5033);
      register(EntityType.STRIDER, EntitySpawnPlacementRegistry$PlacementType.IN_LAVA, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, StriderEntity::method4976);
      register(EntityType.TURTLE, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, TurtleEntity::method5053);
      register(EntityType.VILLAGER, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::canSpawnOn);
      register(EntityType.WITCH, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canMonsterSpawnInLight);
      register(EntityType.WITHER, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canMonsterSpawnInLight);
      register(EntityType.WITHER_SKELETON, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canMonsterSpawnInLight);
      register(EntityType.WOLF, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
      register(EntityType.ZOMBIE, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canMonsterSpawnInLight);
      register(EntityType.ZOMBIE_HORSE, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
      register(EntityType.ZOMBIFIED_PIGLIN, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZombifiedPiglinEntity::method4879);
      register(EntityType.ZOMBIE_VILLAGER, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canMonsterSpawnInLight);
      register(EntityType.CAT, EntitySpawnPlacementRegistry$PlacementType.ON_GROUND, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
      register(EntityType.ELDER_GUARDIAN, EntitySpawnPlacementRegistry$PlacementType.IN_WATER, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, GuardianEntity::canSpawn);
      register(EntityType.EVOKER, EntitySpawnPlacementRegistry$PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canMonsterSpawnInLight);
      register(EntityType.FOX, EntitySpawnPlacementRegistry$PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
      register(EntityType.ILLUSIONER, EntitySpawnPlacementRegistry$PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canMonsterSpawnInLight);
      register(EntityType.PANDA, EntitySpawnPlacementRegistry$PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
      register(EntityType.PHANTOM, EntitySpawnPlacementRegistry$PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::canSpawnOn);
      register(EntityType.RAVAGER, EntitySpawnPlacementRegistry$PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canMonsterSpawnInLight);
      register(EntityType.SHULKER, EntitySpawnPlacementRegistry$PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::canSpawnOn);
      register(EntityType.TRADER_LLAMA, EntitySpawnPlacementRegistry$PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::canAnimalSpawn);
      register(EntityType.VEX, EntitySpawnPlacementRegistry$PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canMonsterSpawnInLight);
      register(EntityType.VINDICATOR, EntitySpawnPlacementRegistry$PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::canMonsterSpawnInLight);
      register(EntityType.WANDERING_TRADER, EntitySpawnPlacementRegistry$PlacementType.NO_RESTRICTIONS, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::canSpawnOn);
   }
}
