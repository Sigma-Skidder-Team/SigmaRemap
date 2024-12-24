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
      return var3 != null ? EntitySpawnPlacementRegistry$Entry.getPlacementType(var3) : EntitySpawnPlacementRegistry$PlacementType.field13474;
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
      register(EntityType.COD, EntitySpawnPlacementRegistry$PlacementType.field13473, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1049::method4792);
      register(EntityType.DOLPHIN, EntitySpawnPlacementRegistry$PlacementType.field13473, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1048::method4784);
      register(EntityType.DROWNED, EntitySpawnPlacementRegistry$PlacementType.field13473, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1037::method4640);
      register(EntityType.GUARDIAN, EntitySpawnPlacementRegistry$PlacementType.field13473, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1105::method5311);
      register(EntityType.PUFFERFISH, EntitySpawnPlacementRegistry$PlacementType.field13473, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1049::method4792);
      register(EntityType.SALMON, EntitySpawnPlacementRegistry$PlacementType.field13473, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1049::method4792);
      register(EntityType.SQUID, EntitySpawnPlacementRegistry$PlacementType.field13473, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, SquidEntity::method4839);
      register(EntityType.TROPICAL_FISH, EntitySpawnPlacementRegistry$PlacementType.field13473, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1049::method4792);
      register(EntityType.BAT, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1114::method5366);
      register(EntityType.BLAZE, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4342);
      register(EntityType.CAVE_SPIDER, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      register(EntityType.CHICKEN, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      register(EntityType.COW, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      register(EntityType.CREEPER, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      register(EntityType.DONKEY, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      register(EntityType.field41025, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      register(EntityType.field41026, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1104::method5299);
      register(EntityType.field41024, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::method4264);
      register(EntityType.GHAST, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1112::method5361);
      register(EntityType.GIANT, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      register(EntityType.HORSE, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      register(EntityType.HUSK, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1039::method4666);
      register(EntityType.IRON_GOLEM, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::method4264);
      register(EntityType.LLAMA, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      register(EntityType.MAGMA_CUBE, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1109::method5335);
      register(EntityType.MOOSHROOM, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1086::method5034);
      register(EntityType.MULE, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      register(EntityType.OCELOT, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING, Class1090::method5078);
      register(EntityType.PARROT, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING, Class1015::method4410);
      register(EntityType.PIG, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      register(EntityType.HOGLIN, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1091::method5081);
      register(EntityType.PIGLIN, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1034::method4615);
      register(EntityType.PILLAGER, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1028::method4572);
      register(EntityType.POLAR_BEAR, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1096::method5181);
      register(EntityType.RABBIT, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1094::method5117);
      register(EntityType.SHEEP, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      register(EntityType.SILVERFISH, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1107::method5317);
      register(EntityType.SKELETON, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      register(EntityType.SKELETON_HORSE, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      register(EntityType.SLIME, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1108::method5328);
      register(EntityType.SNOW_GOLEM, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::method4264);
      register(EntityType.SPIDER, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      register(EntityType.STRAY, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1083::method5033);
      register(EntityType.STRIDER, EntitySpawnPlacementRegistry$PlacementType.field13475, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1070::method4976);
      register(EntityType.TURTLE, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1088::method5053);
      register(EntityType.VILLAGER, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::method4264);
      register(EntityType.WITCH, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      register(EntityType.WITHER, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      register(EntityType.WITHER_SKELETON, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      register(EntityType.WOLF, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      register(EntityType.ZOMBIE, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      register(EntityType.ZOMBIE_HORSE, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      register(EntityType.ZOMBIFIED_PIGLIN, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZombifiedPiglinEntity::method4879);
      register(EntityType.ZOMBIE_VILLAGER, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      register(EntityType.CAT, EntitySpawnPlacementRegistry$PlacementType.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      register(EntityType.ELDER_GUARDIAN, EntitySpawnPlacementRegistry$PlacementType.field13473, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1105::method5311);
      register(EntityType.field41027, EntitySpawnPlacementRegistry$PlacementType.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      register(EntityType.FOX, EntitySpawnPlacementRegistry$PlacementType.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      register(EntityType.ILLUSIONER, EntitySpawnPlacementRegistry$PlacementType.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      register(EntityType.PANDA, EntitySpawnPlacementRegistry$PlacementType.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      register(EntityType.PHANTOM, EntitySpawnPlacementRegistry$PlacementType.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::method4264);
      register(EntityType.RAVAGER, EntitySpawnPlacementRegistry$PlacementType.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      register(EntityType.SHULKER, EntitySpawnPlacementRegistry$PlacementType.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::method4264);
      register(EntityType.TRADER_LLAMA, EntitySpawnPlacementRegistry$PlacementType.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      register(EntityType.VEX, EntitySpawnPlacementRegistry$PlacementType.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      register(EntityType.VINDICATOR, EntitySpawnPlacementRegistry$PlacementType.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      register(EntityType.WANDERING_TRADER, EntitySpawnPlacementRegistry$PlacementType.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::method4264);
   }
}
