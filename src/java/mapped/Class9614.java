package mapped;

import net.minecraft.entity.passive.WolfEntity;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9614 {
   private static final Logger field44942 = LogManager.getLogger();
   private static final Map<EntityType<? extends LivingEntity>, Class9767> field44943 = ImmutableMap.<EntityType<? extends LivingEntity>, Class9767>builder()
      .put(EntityType.field41006, LivingEntity.method2997().method21850())
      .put(EntityType.field41008, Class1114.method5363().method21850())
      .put(EntityType.field41009, Class1017.method4447().method21850())
      .put(EntityType.field41010, Class1103.method5292().method21850())
      .put(EntityType.field41012, Class1098.method5259().method21850())
      .put(EntityType.field41013, Class1102.method5291().method21850())
      .put(EntityType.field41014, Class1089.method5069().method21850())
      .put(EntityType.field41015, Class1049.method4791().method21850())
      .put(EntityType.field41016, Class1087.method5040().method21850())
      .put(EntityType.field41017, Class1081.method5018().method21850())
      .put(EntityType.field41018, Class1048.method4782().method21850())
      .put(EntityType.field41019, Class1066.method4926().method21850())
      .put(EntityType.field41021, Class1038.method4653().method21850())
      .put(EntityType.field41022, Class1106.method5314().method21850())
      .put(EntityType.field41025, Class1010.method4345().method21850())
      .put(EntityType.field41026, Class1104.method5296().method21850())
      .put(EntityType.field41024, Class1007.method2997().method21850())
      .put(EntityType.field41027, Class1032.method4600().method21850())
      .put(EntityType.FOX, Class1095.method5123().method21850())
      .put(EntityType.field41034, Class1112.method5360().method21850())
      .put(EntityType.field41035, Class1099.method5268().method21850())
      .put(EntityType.field41036, Class1105.method5300().method21850())
      .put(EntityType.field41037, Class1091.method5080().method21850())
      .put(EntityType.field41038, AbstractHorseEntity.method4951().method21850())
      .put(EntityType.field41039, Class1038.method4653().method21850())
      .put(EntityType.field41040, Class1033.method4610().method21850())
      .put(EntityType.field41041, Class1058.method4863().method21850())
      .put(EntityType.field41047, Class1064.method4888().method21850())
      .put(EntityType.field41049, Class1109.method5334().method21850())
      .put(EntityType.field41058, Class1087.method5040().method21850())
      .put(EntityType.field41057, Class1066.method4926().method21850())
      .put(EntityType.field41059, Class1090.method5074().method21850())
      .put(EntityType.field41061, Class1097.method5208().method21850())
      .put(EntityType.field41062, Class1015.method4406().method21850())
      .put(EntityType.field41063, Class1009.method4343().method21850())
      .put(EntityType.field41064, Class1072.method4989().method21850())
      .put(EntityType.field41065, Class1034.method4614().method21850())
      .put(EntityType.field41066, Class1036.method4637().method21850())
      .put(EntityType.field41067, Class1024.method4541().method21850())
      .put(EntityType.PLAYER, PlayerEntity.method2849().method21850())
      .put(EntityType.field41068, Class1096.method5180().method21850())
      .put(EntityType.field41070, Class1049.method4791().method21850())
      .put(EntityType.RABBIT, Class1094.method5111().method21850())
      .put(EntityType.field41072, Class1029.method4581().method21850())
      .put(EntityType.field41073, Class1049.method4791().method21850())
      .put(EntityType.SHEEP, Class1019.method4512().method21850())
      .put(EntityType.field41075, Class1057.method4843().method21850())
      .put(EntityType.field41077, Class1107.method5316().method21850())
      .put(EntityType.field41078, Class1082.method5029().method21850())
      .put(EntityType.field41079, Class1076.method4999().method21850())
      .put(EntityType.field41080, Class1009.method4343().method21850())
      .put(EntityType.field41082, Class1021.method4529().method21850())
      .put(EntityType.field41085, Class1101.method5288().method21850())
      .put(EntityType.field41086, SquidEntity.method4836().method21850())
      .put(EntityType.field41087, Class1082.method5029().method21850())
      .put(EntityType.field41088, Class1070.method4986().method21850())
      .put(EntityType.field41094, Class1064.method4888().method21850())
      .put(EntityType.field41095, Class1049.method4791().method21850())
      .put(EntityType.field41096, Class1088.method5054().method21850())
      .put(EntityType.field41097, Class1100.method5269().method21850())
      .put(EntityType.field41098, Class1042.method2997().method21850())
      .put(EntityType.field41099, Class1030.method4589().method21850())
      .put(EntityType.field41100, Class1006.method4220().method21850())
      .put(EntityType.field41101, Class1027.method4569().method21850())
      .put(EntityType.field41102, WitherEntity.method2997().method21850())
      .put(EntityType.field41103, Class1082.method5029().method21850())
      .put(EntityType.field41105, WolfEntity.method4373().method21850())
      .put(EntityType.field41106, Class1093.method5098().method21850())
      .put(EntityType.field41107, Class1038.method4653().method21850())
      .put(EntityType.field41108, Class1075.method4998().method21850())
      .put(EntityType.field41109, Class1038.method4653().method21850())
      .put(EntityType.field41110, Class1063.method4874().method21850())
      .build();

   public static Class9767 method37375(EntityType<? extends LivingEntity> var0) {
      return field44943.get(var0);
   }

   public static boolean method37376(EntityType<?> var0) {
      return field44943.containsKey(var0);
   }

   public static void method37377() {
      Registry.ENTITY_TYPE
         .method9192()
         .filter(var0 -> var0.method33209() != Class179.field628)
         .filter(var0 -> !method37376((EntityType<?>)var0))
         .<ResourceLocation>map(Registry.ENTITY_TYPE::getKey)
         .forEach(var0 -> {
            if (!SharedConstants.developmentMode) {
               field44942.error("Entity {} has no attributes", var0);
            } else {
               throw new IllegalStateException("Entity " + var0 + " has no attributes");
            }
         });
   }
}
