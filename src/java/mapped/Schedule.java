package mapped;

import com.google.common.collect.Maps;
import net.minecraft.util.registry.Registry;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Schedule {
   public static final Schedule field35349 = method28659("empty").method24639(0, Activity.field40220).method24640();
   public static final Schedule field35350 = method28659("simple")
      .method24639(5000, Activity.field40221)
      .method24639(11000, Activity.field40223)
      .method24640();
   public static final Schedule field35351 = method28659("villager_baby")
      .method24639(10, Activity.field40220)
      .method24639(3000, Activity.field40222)
      .method24639(6000, Activity.field40220)
      .method24639(10000, Activity.field40222)
      .method24639(12000, Activity.field40223)
      .method24640();
   public static final Schedule field35352 = method28659("villager_default")
      .method24639(10, Activity.field40220)
      .method24639(2000, Activity.field40221)
      .method24639(9000, Activity.field40224)
      .method24639(11000, Activity.field40220)
      .method24639(12000, Activity.field40223)
      .method24640();
   private final Map<Activity, Class7346> field35353 = Maps.newHashMap();

   public static Class7537 method28659(String var0) {
      Schedule var3 = Registry.<Schedule>register(Registry.field16094, var0, new Schedule());
      return new Class7537(var3);
   }

   public void method28660(Activity var1) {
      if (!this.field35353.containsKey(var1)) {
         this.field35353.put(var1, new Class7346());
      }
   }

   public Class7346 method28661(Activity var1) {
      return this.field35353.get(var1);
   }

   public List<Class7346> method28662(Activity var1) {
      return this.field35353
         .entrySet()
         .stream()
         .filter(var1x -> var1x.getKey() != var1)
         .<Class7346>map(Entry::getValue)
         .collect(Collectors.<Class7346>toList());
   }

   public Activity method28663(int var1) {
      return this.field35353
         .entrySet()
         .stream()
         .max(Comparator.comparingDouble(var1x -> (double)var1x.getValue().method23290(var1)))
         .<Activity>map(Entry::getKey)
         .orElse(Activity.field40220);
   }
}
