package mapped;

import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Class8552<T extends Enum<T> & Class83> extends Class8550<T> {
   private final ImmutableSet<T> field38442;
   private final Map<String, T> field38443 = Maps.newHashMap();

   public Class8552(String var1, Class<T> var2, Collection<T> var3) {
      super(var1, var2);
      this.field38442 = ImmutableSet.copyOf(var3);

      for (Enum var7 : var3) {
         String var8 = ((Class83)var7).method257();
         if (this.field38443.containsKey(var8)) {
            throw new IllegalArgumentException("Multiple values have the same name '" + var8 + "'");
         }

         this.field38443.put(var8, (T)var7);
      }
   }

   @Override
   public Collection<T> method30474() {
      return this.field38442;
   }

   @Override
   public Optional<T> method30476(String var1) {
      return Optional.<T>ofNullable(this.field38443.get(var1));
   }

   public String method30475(T var1) {
      return ((Class83)var1).method257();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof Class8552 && super.equals(var1)) {
         Class8552 var4 = (Class8552)var1;
         return this.field38442.equals(var4.field38442) && this.field38443.equals(var4.field38443);
      } else {
         return false;
      }
   }

   @Override
   public int method30477() {
      int var3 = super.method30477();
      var3 = 31 * var3 + this.field38442.hashCode();
      return 31 * var3 + this.field38443.hashCode();
   }

   public static <T extends Enum<T> & Class83> Class8552<T> method30481(String var0, Class<T> var1) {
      return method30482(var0, var1, Predicates.alwaysTrue());
   }

   public static <T extends Enum<T> & Class83> Class8552<T> method30482(String var0, Class<T> var1, Predicate<T> var2) {
      return method30484(var0, var1, Arrays.stream(var1.getEnumConstants()).filter(var2).collect(Collectors.<T>toList()));
   }

   public static <T extends Enum<T> & Class83> Class8552<T> method30483(String var0, Class<T> var1, T... var2) {
      return method30484(var0, var1, Lists.newArrayList(var2));
   }

   public static <T extends Enum<T> & Class83> Class8552<T> method30484(String var0, Class<T> var1, Collection<T> var2) {
      return new Class8552<T>(var0, var1, var2);
   }
}
