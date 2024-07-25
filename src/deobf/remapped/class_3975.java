package remapped;

import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class class_3975 {
   public static final class_3975 field_19363 = method_18349("empty").method_10003(0, class_6275.field_32075).method_10004();
   public static final class_3975 field_19364 = method_18349("simple")
      .method_10003(5000, class_6275.field_32073)
      .method_10003(11000, class_6275.field_32079)
      .method_10004();
   public static final class_3975 field_19361 = method_18349("villager_baby")
      .method_10003(10, class_6275.field_32075)
      .method_10003(3000, class_6275.field_32064)
      .method_10003(6000, class_6275.field_32075)
      .method_10003(10000, class_6275.field_32064)
      .method_10003(12000, class_6275.field_32079)
      .method_10004();
   public static final class_3975 field_19360 = method_18349("villager_default")
      .method_10003(10, class_6275.field_32075)
      .method_10003(2000, class_6275.field_32073)
      .method_10003(9000, class_6275.field_32065)
      .method_10003(11000, class_6275.field_32075)
      .method_10003(12000, class_6275.field_32079)
      .method_10004();
   private final Map<class_6275, class_1842> field_19362 = Maps.newHashMap();

   public static class_2142 method_18349(String var0) {
      class_3975 var3 = class_8669.<class_3975>method_39791(class_8669.field_44374, var0, new class_3975());
      return new class_2142(var3);
   }

   public void method_18354(class_6275 var1) {
      if (!this.field_19362.containsKey(var1)) {
         this.field_19362.put(var1, new class_1842());
      }
   }

   public class_1842 method_18350(class_6275 var1) {
      return this.field_19362.get(var1);
   }

   public List<class_1842> method_18351(class_6275 var1) {
      return this.field_19362
         .entrySet()
         .stream()
         .filter(var1x -> var1x.getKey() != var1)
         .<class_1842>map(Entry::getValue)
         .collect(Collectors.<class_1842>toList());
   }

   public class_6275 method_18353(int var1) {
      return this.field_19362
         .entrySet()
         .stream()
         .max(Comparator.comparingDouble(var1x -> (double)var1x.getValue().method_8142(var1)))
         .<class_6275>map(Entry::getKey)
         .orElse(class_6275.field_32075);
   }
}
