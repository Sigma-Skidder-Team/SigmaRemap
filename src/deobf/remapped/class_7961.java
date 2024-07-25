package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class class_7961 {
   private static String[] field_40788;
   private final Map<class_4565, List<class_3222>> field_40791 = Stream.<class_4565>of(class_4565.values())
      .collect(ImmutableMap.toImmutableMap(var0 -> var0, var0 -> Lists.newArrayList()));
   private final Map<EntityType<?>, class_2658> field_40789 = Maps.newLinkedHashMap();
   private float field_40787 = 0.1F;
   private boolean field_40790;

   public class_7961 method_36017(class_4565 var1, class_3222 var2) {
      this.field_40791.get(var1).add(var2);
      return this;
   }

   public class_7961 method_36015(EntityType<?> var1, double var2, double var4) {
      this.field_40789.put(var1, new class_2658(var4, var2, null));
      return this;
   }

   public class_7961 method_36019(float var1) {
      this.field_40787 = var1;
      return this;
   }

   public class_7961 method_36018() {
      this.field_40790 = true;
      return this;
   }

   public class_6068 method_36014() {
      return new class_6068(
         this.field_40787,
         this.field_40791.entrySet().stream().collect(ImmutableMap.toImmutableMap(Entry::getKey, var0 -> ImmutableList.copyOf((Collection)var0.getValue()))),
         ImmutableMap.copyOf(this.field_40789),
         this.field_40790,
         null
      );
   }
}
