package remapped;

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

public class class_7360<T extends Enum<T> & class_4530> extends class_5019<T> {
   private final ImmutableSet<T> field_37619;
   private final Map<String, T> field_37620 = Maps.newHashMap();

   public class_7360(String var1, Class<T> var2, Collection<T> var3) {
      super(var1, var2);
      this.field_37619 = ImmutableSet.copyOf(var3);

      for (Enum var7 : var3) {
         String var8 = ((class_4530)var7).method_21049();
         if (this.field_37620.containsKey(var8)) {
            throw new IllegalArgumentException("Multiple values have the same name '" + var8 + "'");
         }

         this.field_37620.put(var8, (T)var7);
      }
   }

   @Override
   public Collection<T> method_23105() {
      return this.field_37619;
   }

   @Override
   public Optional<T> method_23108(String var1) {
      return Optional.<T>ofNullable(this.field_37620.get(var1));
   }

   public String method_33521(T var1) {
      return ((class_4530)var1).method_21049();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof class_7360 && super.equals(var1)) {
         class_7360 var4 = (class_7360)var1;
         return this.field_37619.equals(var4.field_37619) && this.field_37620.equals(var4.field_37620);
      } else {
         return false;
      }
   }

   @Override
   public int method_23106() {
      int var3 = super.method_23106();
      var3 = 31 * var3 + this.field_37619.hashCode();
      return 31 * var3 + this.field_37620.hashCode();
   }

   public static <T extends Enum<T> & class_4530> class_7360<T> method_33522(String var0, Class<T> var1) {
      return method_33524(var0, var1, Predicates.alwaysTrue());
   }

   public static <T extends Enum<T> & class_4530> class_7360<T> method_33524(String var0, Class<T> var1, Predicate<T> var2) {
      return method_33523(var0, var1, Arrays.<Object>stream(var1.getEnumConstants()).filter(var2).collect(Collectors.<T>toList()));
   }

   public static <T extends Enum<T> & class_4530> class_7360<T> method_33525(String var0, Class<T> var1, T... var2) {
      return method_33523(var0, var1, Lists.newArrayList(var2));
   }

   public static <T extends Enum<T> & class_4530> class_7360<T> method_33523(String var0, Class<T> var1, Collection<T> var2) {
      return new class_7360<T>(var0, var1, var2);
   }
}
