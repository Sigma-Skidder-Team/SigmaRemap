package remapped;

import com.google.common.base.Functions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class class_6354 implements AutoCloseable {
   private static String[] field_32494;
   private final Set<class_3026> field_32491;
   private Map<String, class_5522> field_32493 = ImmutableMap.of();
   private List<class_5522> field_32490 = ImmutableList.of();
   private final class_7953 field_32492;

   public class_6354(class_7953 var1, class_3026... var2) {
      this.field_32492 = var1;
      this.field_32491 = ImmutableSet.copyOf(var2);
   }

   public class_6354(class_3026... var1) {
      this(class_5522::new, var1);
   }

   public void method_29122() {
      List var3 = this.field_32490.stream().<String>map(class_5522::method_25023).collect(ImmutableList.toImmutableList());
      this.close();
      this.field_32493 = this.method_29116();
      this.field_32490 = this.method_29126(var3);
   }

   private Map<String, class_5522> method_29116() {
      TreeMap var3 = Maps.newTreeMap();

      for (class_3026 var5 : this.field_32491) {
         var5.method_13812(var1 -> {
            class_5522 var4 = var3.put(var1.method_25023(), var1);
         }, this.field_32492);
      }

      return ImmutableMap.copyOf(var3);
   }

   public void method_29121(Collection<String> var1) {
      this.field_32490 = this.method_29126(var1);
   }

   private List<class_5522> method_29126(Collection<String> var1) {
      List var4 = this.method_29114(var1).collect(Collectors.toList());

      for (class_5522 var6 : this.field_32493.values()) {
         if (var6.method_25024() && !var4.contains(var6)) {
            var6.method_25031().method_5149(var4, var6, Functions.identity(), false);
         }
      }

      return ImmutableList.copyOf(var4);
   }

   private Stream<class_5522> method_29114(Collection<String> var1) {
      return var1.stream().<class_5522>map(this.field_32493::get).filter(Objects::nonNull);
   }

   public Collection<String> method_29118() {
      return this.field_32493.keySet();
   }

   public Collection<class_5522> method_29117() {
      return this.field_32493.values();
   }

   public Collection<String> method_29123() {
      return this.field_32490.stream().<String>map(class_5522::method_25023).collect(ImmutableSet.toImmutableSet());
   }

   public Collection<class_5522> method_29125() {
      return this.field_32490;
   }

   @Nullable
   public class_5522 method_29120(String var1) {
      return this.field_32493.get(var1);
   }

   @Override
   public void close() {
      this.field_32493.values().forEach(class_5522::close);
   }

   public boolean method_29119(String var1) {
      return this.field_32493.containsKey(var1);
   }

   public List<class_8169> method_29115() {
      return this.field_32490.stream().<class_8169>map(class_5522::method_25032).collect(ImmutableList.toImmutableList());
   }
}
