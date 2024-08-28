package mapped;

import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Class8234 {
   public static final Class8234 field35349 = method28659("empty").method24639(0, Class8890.field40220).method24640();
   public static final Class8234 field35350 = method28659("simple")
      .method24639(5000, Class8890.field40221)
      .method24639(11000, Class8890.field40223)
      .method24640();
   public static final Class8234 field35351 = method28659("villager_baby")
      .method24639(10, Class8890.field40220)
      .method24639(3000, Class8890.field40222)
      .method24639(6000, Class8890.field40220)
      .method24639(10000, Class8890.field40222)
      .method24639(12000, Class8890.field40223)
      .method24640();
   public static final Class8234 field35352 = method28659("villager_default")
      .method24639(10, Class8890.field40220)
      .method24639(2000, Class8890.field40221)
      .method24639(9000, Class8890.field40224)
      .method24639(11000, Class8890.field40220)
      .method24639(12000, Class8890.field40223)
      .method24640();
   private final Map<Class8890, Class7346> field35353 = Maps.newHashMap();

   public static Class7537 method28659(String var0) {
      Class8234 var3 = Registry.<Class8234>method9194(Registry.field16094, var0, new Class8234());
      return new Class7537(var3);
   }

   public void method28660(Class8890 var1) {
      if (!this.field35353.containsKey(var1)) {
         this.field35353.put(var1, new Class7346());
      }
   }

   public Class7346 method28661(Class8890 var1) {
      return this.field35353.get(var1);
   }

   public List<Class7346> method28662(Class8890 var1) {
      return this.field35353
         .entrySet()
         .stream()
         .filter(var1x -> var1x.getKey() != var1)
         .<Class7346>map(Entry::getValue)
         .collect(Collectors.<Class7346>toList());
   }

   public Class8890 method28663(int var1) {
      return this.field35353
         .entrySet()
         .stream()
         .max(Comparator.comparingDouble(var1x -> (double)var1x.getValue().method23290(var1)))
         .<Class8890>map(Entry::getKey)
         .orElse(Class8890.field40220);
   }
}
