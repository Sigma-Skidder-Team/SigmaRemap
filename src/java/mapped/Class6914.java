package mapped;

import com.google.common.collect.Maps;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.util.math.BlockPos;

import java.util.Map;
import java.util.Random;

public class Class6914 {
   private static final Map<EntityType<?>, Class9364> field29911 = Maps.newHashMap();

   private static <T extends MobEntity> void method21119(EntityType<T> var0, Class2068 var1, Class101 var2, Class8860<T> var3) {
      Class9364 var6 = field29911.put(var0, new Class9364(var2, var1, var3));
      if (var6 != null) {
         throw new IllegalStateException("Duplicate registration for type " + Registry.ENTITY_TYPE.getKey(var0));
      }
   }

   public static Class2068 method21120(EntityType<?> var0) {
      Class9364 var3 = field29911.get(var0);
      return var3 != null ? Class9364.method35461(var3) : Class2068.field13474;
   }

   public static Class101 method21121(EntityType<?> var0) {
      Class9364 var3 = field29911.get(var0);
      return var3 != null ? Class9364.method35462(var3) : Class101.field300;
   }

   public static <T extends Entity> boolean method21122(EntityType<T> var0, Class1659 var1, Class2202 var2, BlockPos var3, Random var4) {
      Class9364 var7 = field29911.get(var0);
      return var7 == null || Class9364.method35463(var7).method32251(var0, var1, var2, var3, var4);
   }

   static {
      method21119(EntityType.field41015, Class2068.field13473, Class101.field300, Class1049::method4792);
      method21119(EntityType.field41018, Class2068.field13473, Class101.field300, Class1048::method4784);
      method21119(EntityType.field41021, Class2068.field13473, Class101.field300, Class1037::method4640);
      method21119(EntityType.field41036, Class2068.field13473, Class101.field300, Class1105::method5311);
      method21119(EntityType.field41070, Class2068.field13473, Class101.field300, Class1049::method4792);
      method21119(EntityType.field41073, Class2068.field13473, Class101.field300, Class1049::method4792);
      method21119(EntityType.field41086, Class2068.field13473, Class101.field300, SquidEntity::method4839);
      method21119(EntityType.field41095, Class2068.field13473, Class101.field300, Class1049::method4792);
      method21119(EntityType.field41008, Class2068.field13472, Class101.field300, Class1114::method5366);
      method21119(EntityType.field41010, Class2068.field13472, Class101.field300, Class1009::method4342);
      method21119(EntityType.field41013, Class2068.field13472, Class101.field300, Class1009::method4341);
      method21119(EntityType.field41014, Class2068.field13472, Class101.field300, Class1018::method4500);
      method21119(EntityType.field41016, Class2068.field13472, Class101.field300, Class1018::method4500);
      method21119(EntityType.field41017, Class2068.field13472, Class101.field300, Class1009::method4341);
      method21119(EntityType.field41019, Class2068.field13472, Class101.field300, Class1018::method4500);
      method21119(EntityType.field41025, Class2068.field13472, Class101.field300, Class1009::method4341);
      method21119(EntityType.field41026, Class2068.field13472, Class101.field300, Class1104::method5299);
      method21119(EntityType.field41024, Class2068.field13472, Class101.field300, MobEntity::method4264);
      method21119(EntityType.field41034, Class2068.field13472, Class101.field300, Class1112::method5361);
      method21119(EntityType.field41035, Class2068.field13472, Class101.field300, Class1009::method4341);
      method21119(EntityType.field41038, Class2068.field13472, Class101.field300, Class1018::method4500);
      method21119(EntityType.field41039, Class2068.field13472, Class101.field300, Class1039::method4666);
      method21119(EntityType.field41041, Class2068.field13472, Class101.field300, MobEntity::method4264);
      method21119(EntityType.field41047, Class2068.field13472, Class101.field300, Class1018::method4500);
      method21119(EntityType.field41049, Class2068.field13472, Class101.field300, Class1109::method5335);
      method21119(EntityType.field41058, Class2068.field13472, Class101.field300, Class1086::method5034);
      method21119(EntityType.field41057, Class2068.field13472, Class101.field300, Class1018::method4500);
      method21119(EntityType.field41059, Class2068.field13472, Class101.field299, Class1090::method5078);
      method21119(EntityType.field41062, Class2068.field13472, Class101.field299, Class1015::method4410);
      method21119(EntityType.field41064, Class2068.field13472, Class101.field300, Class1018::method4500);
      method21119(EntityType.field41037, Class2068.field13472, Class101.field300, Class1091::method5081);
      method21119(EntityType.field41065, Class2068.field13472, Class101.field300, Class1034::method4615);
      method21119(EntityType.field41067, Class2068.field13472, Class101.field300, Class1028::method4572);
      method21119(EntityType.field41068, Class2068.field13472, Class101.field300, Class1096::method5181);
      method21119(EntityType.RABBIT, Class2068.field13472, Class101.field300, Class1094::method5117);
      method21119(EntityType.SHEEP, Class2068.field13472, Class101.field300, Class1018::method4500);
      method21119(EntityType.field41077, Class2068.field13472, Class101.field300, Class1107::method5317);
      method21119(EntityType.field41078, Class2068.field13472, Class101.field300, Class1009::method4341);
      method21119(EntityType.field41079, Class2068.field13472, Class101.field300, Class1018::method4500);
      method21119(EntityType.field41080, Class2068.field13472, Class101.field300, Class1108::method5328);
      method21119(EntityType.field41082, Class2068.field13472, Class101.field300, MobEntity::method4264);
      method21119(EntityType.field41085, Class2068.field13472, Class101.field300, Class1009::method4341);
      method21119(EntityType.field41087, Class2068.field13472, Class101.field300, Class1083::method5033);
      method21119(EntityType.field41088, Class2068.field13475, Class101.field300, Class1070::method4976);
      method21119(EntityType.field41096, Class2068.field13472, Class101.field300, Class1088::method5053);
      method21119(EntityType.field41098, Class2068.field13472, Class101.field300, MobEntity::method4264);
      method21119(EntityType.field41101, Class2068.field13472, Class101.field300, Class1009::method4341);
      method21119(EntityType.field41102, Class2068.field13472, Class101.field300, Class1009::method4341);
      method21119(EntityType.field41103, Class2068.field13472, Class101.field300, Class1009::method4341);
      method21119(EntityType.field41105, Class2068.field13472, Class101.field300, Class1018::method4500);
      method21119(EntityType.field41107, Class2068.field13472, Class101.field300, Class1009::method4341);
      method21119(EntityType.field41108, Class2068.field13472, Class101.field300, Class1018::method4500);
      method21119(EntityType.field41110, Class2068.field13472, Class101.field300, ZombifiedPiglinEntity::method4879);
      method21119(EntityType.field41109, Class2068.field13472, Class101.field300, Class1009::method4341);
      method21119(EntityType.field41012, Class2068.field13472, Class101.field300, Class1018::method4500);
      method21119(EntityType.field41022, Class2068.field13473, Class101.field300, Class1105::method5311);
      method21119(EntityType.field41027, Class2068.field13474, Class101.field300, Class1009::method4341);
      method21119(EntityType.FOX, Class2068.field13474, Class101.field300, Class1018::method4500);
      method21119(EntityType.field41040, Class2068.field13474, Class101.field300, Class1009::method4341);
      method21119(EntityType.field41061, Class2068.field13474, Class101.field300, Class1018::method4500);
      method21119(EntityType.field41063, Class2068.field13474, Class101.field300, MobEntity::method4264);
      method21119(EntityType.field41072, Class2068.field13474, Class101.field300, Class1009::method4341);
      method21119(EntityType.field41075, Class2068.field13474, Class101.field300, MobEntity::method4264);
      method21119(EntityType.field41094, Class2068.field13474, Class101.field300, Class1018::method4500);
      method21119(EntityType.field41097, Class2068.field13474, Class101.field300, Class1009::method4341);
      method21119(EntityType.field41099, Class2068.field13474, Class101.field300, Class1009::method4341);
      method21119(EntityType.field41100, Class2068.field13474, Class101.field300, MobEntity::method4264);
   }
}
