package remapped;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public class TagRegistryManager {
   private static final Map<Identifier, TagRegistry<?>> field_21654 = Maps.newHashMap();

   public static <T> TagRegistry<T> create(Identifier var0, Function<ITagCollectionSupplier, ITagCollection<T>> var1) {
      TagRegistry var4 = new TagRegistry(var1);
      TagRegistry var5 = field_21654.putIfAbsent(var0, var4);
      if (var5 == null) {
         return var4;
      } else {
         throw new IllegalStateException("Duplicate entry for static tag collection: " + var0);
      }
   }

   public static void method_20598(ITagCollectionSupplier var0) {
      field_21654.values().forEach(var1 -> var1.method_10840(var0));
   }

   public static void method_20596() {
      field_21654.values().forEach(TagRegistry::method_10844);
   }

   public static Multimap<Identifier, Identifier> method_20601(ITagCollectionSupplier var0) {
      HashMultimap var3 = HashMultimap.create();
      field_21654.forEach((var2, var3x) -> var3.putAll(var2, var3x.method_10841(var0)));
      return var3;
   }

   public static void method_20599() {
      TagRegistry[] var2 = new TagRegistry[]{class_2351.field_11742, class_391.field_1612, class_6503.field_33093, EntityTypeTags.tagCollection};
      boolean var3 = Stream.<TagRegistry>of(var2).anyMatch(var0 -> !field_21654.containsValue(var0));
      if (var3) {
         throw new IllegalStateException("Missing helper registrations");
      }
   }
}
