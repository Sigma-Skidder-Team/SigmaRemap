package mapped;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

public class SensorType<U extends Sensor<?>> {
   public static final SensorType<Class7895> field34237 = method27087("dummy", Class7895::new);
   public static final SensorType<Class7892> field34238 = method27087("nearest_items", Class7892::new);
   public static final SensorType<Class7886> field34239 = method27087("nearest_living_entities", Class7886::new);
   public static final SensorType<Class7893> field34240 = method27087("nearest_players", Class7893::new);
   public static final SensorType<NearestBedSensor> field34241 = method27087("nearest_bed", NearestBedSensor::new);
   public static final SensorType<Class7894> field34242 = method27087("hurt_by", Class7894::new);
   public static final SensorType<Class7883> field34243 = method27087("villager_hostiles", Class7883::new);
   public static final SensorType<Class7889> field34244 = method27087("villager_babies", Class7889::new);
   public static final SensorType<Class7891> field34245 = method27087("secondary_pois", Class7891::new);
   public static final SensorType<Class7885> field34246 = method27087("golem_detected", Class7885::new);
   public static final SensorType<Class7881> field34247 = method27087("piglin_specific_sensor", Class7881::new);
   public static final SensorType<Class7890> field34248 = method27087("piglin_brute_specific_sensor", Class7890::new);
   public static final SensorType<Class7884> field34249 = method27087("hoglin_specific_sensor", Class7884::new);
   public static final SensorType<Class7888> field34250 = method27087("nearest_adult", Class7888::new);
   private final Supplier<U> field34251;

   private SensorType(Supplier<U> var1) {
      this.field34251 = var1;
   }

   public U method27086() {
      return this.field34251.get();
   }

   private static <U extends Sensor<?>> SensorType<U> method27087(String var0, Supplier<U> var1) {
      return Registry.<SensorType<?>, SensorType<U>>register(Registry.field16093, new ResourceLocation(var0), new SensorType<U>(var1));
   }
}
