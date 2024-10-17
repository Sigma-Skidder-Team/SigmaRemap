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

public class Class6914 {
   private static final Map<EntityType<?>, Class9364> field29911 = Maps.newHashMap();

   private static <T extends MobEntity> void method21119(EntityType<T> var0, Class2068 var1, Heightmap.Type var2, Class8860<T> var3) {
      Class9364 var6 = field29911.put(var0, new Class9364(var2, var1, var3));
      if (var6 != null) {
         throw new IllegalStateException("Duplicate registration for type " + Registry.ENTITY_TYPE.getKey(var0));
      }
   }

   public static Class2068 method21120(EntityType<?> var0) {
      Class9364 var3 = field29911.get(var0);
      return var3 != null ? Class9364.method35461(var3) : Class2068.field13474;
   }

   public static Heightmap.Type method21121(EntityType<?> var0) {
      Class9364 var3 = field29911.get(var0);
      return var3 != null ? Class9364.method35462(var3) : Heightmap.Type.MOTION_BLOCKING_NO_LEAVES;
   }

   public static <T extends Entity> boolean method21122(EntityType<T> var0, Class1659 var1, Class2202 var2, BlockPos var3, Random var4) {
      Class9364 var7 = field29911.get(var0);
      return var7 == null || Class9364.method35463(var7).method32251(var0, var1, var2, var3, var4);
   }

   static {
      method21119(EntityType.COD, Class2068.field13473, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1049::method4792);
      method21119(EntityType.DOLPHIN, Class2068.field13473, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1048::method4784);
      method21119(EntityType.DROWNED, Class2068.field13473, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1037::method4640);
      method21119(EntityType.GUARDIAN, Class2068.field13473, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1105::method5311);
      method21119(EntityType.PUFFERFISH, Class2068.field13473, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1049::method4792);
      method21119(EntityType.SALMON, Class2068.field13473, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1049::method4792);
      method21119(EntityType.SQUID, Class2068.field13473, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, SquidEntity::method4839);
      method21119(EntityType.TROPICAL_FISH, Class2068.field13473, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1049::method4792);
      method21119(EntityType.BAT, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1114::method5366);
      method21119(EntityType.BLAZE, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4342);
      method21119(EntityType.CAVE_SPIDER, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      method21119(EntityType.CHICKEN, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      method21119(EntityType.COW, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      method21119(EntityType.CREEPER, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      method21119(EntityType.DONKEY, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      method21119(EntityType.field41025, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      method21119(EntityType.field41026, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1104::method5299);
      method21119(EntityType.field41024, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::method4264);
      method21119(EntityType.GHAST, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1112::method5361);
      method21119(EntityType.GIANT, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      method21119(EntityType.HORSE, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      method21119(EntityType.HUSK, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1039::method4666);
      method21119(EntityType.IRON_GOLEM, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::method4264);
      method21119(EntityType.LLAMA, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      method21119(EntityType.MAGMA_CUBE, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1109::method5335);
      method21119(EntityType.MOOSHROOM, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1086::method5034);
      method21119(EntityType.MULE, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      method21119(EntityType.OCELOT, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING, Class1090::method5078);
      method21119(EntityType.PARROT, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING, Class1015::method4410);
      method21119(EntityType.PIG, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      method21119(EntityType.HOGLIN, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1091::method5081);
      method21119(EntityType.PIGLIN, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1034::method4615);
      method21119(EntityType.PILLAGER, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1028::method4572);
      method21119(EntityType.POLAR_BEAR, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1096::method5181);
      method21119(EntityType.RABBIT, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1094::method5117);
      method21119(EntityType.SHEEP, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      method21119(EntityType.SILVERFISH, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1107::method5317);
      method21119(EntityType.SKELETON, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      method21119(EntityType.SKELETON_HORSE, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      method21119(EntityType.SLIME, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1108::method5328);
      method21119(EntityType.SNOW_GOLEM, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::method4264);
      method21119(EntityType.SPIDER, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      method21119(EntityType.STRAY, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1083::method5033);
      method21119(EntityType.STRIDER, Class2068.field13475, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1070::method4976);
      method21119(EntityType.TURTLE, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1088::method5053);
      method21119(EntityType.VILLAGER, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::method4264);
      method21119(EntityType.WITCH, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      method21119(EntityType.WITHER, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      method21119(EntityType.WITHER_SKELETON, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      method21119(EntityType.WOLF, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      method21119(EntityType.ZOMBIE, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      method21119(EntityType.ZOMBIE_HORSE, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      method21119(EntityType.ZOMBIFIED_PIGLIN, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, ZombifiedPiglinEntity::method4879);
      method21119(EntityType.ZOMBIE_VILLAGER, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      method21119(EntityType.CAT, Class2068.field13472, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      method21119(EntityType.ELDER_GUARDIAN, Class2068.field13473, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1105::method5311);
      method21119(EntityType.field41027, Class2068.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      method21119(EntityType.FOX, Class2068.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      method21119(EntityType.ILLUSIONER, Class2068.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      method21119(EntityType.PANDA, Class2068.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      method21119(EntityType.PHANTOM, Class2068.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::method4264);
      method21119(EntityType.RAVAGER, Class2068.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      method21119(EntityType.SHULKER, Class2068.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::method4264);
      method21119(EntityType.TRADER_LLAMA, Class2068.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, Class1018::method4500);
      method21119(EntityType.VEX, Class2068.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      method21119(EntityType.VINDICATOR, Class2068.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MonsterEntity::method4341);
      method21119(EntityType.WANDERING_TRADER, Class2068.field13474, Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, MobEntity::method4264);
   }
}
