package mapped;

import com.google.common.base.Functions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;

import javax.annotation.Nullable;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Class313 implements AutoCloseable {
   private static String[] field1203;
   private final Set<Class7651> field1204;
   private Map<String, Class1810> field1205 = ImmutableMap.of();
   private List<Class1810> field1206 = ImmutableList.of();
   private final Class9325 field1207;

   public Class313(Class9325 var1, Class7651... var2) {
      this.field1207 = var1;
      this.field1204 = ImmutableSet.copyOf(var2);
   }

   public Class313(Class7651... var1) {
      this(Class1810::new, var1);
   }

   public void method1262() {
      List var3 = this.field1206.stream().<String>map(Class1810::method7951).collect(ImmutableList.toImmutableList());
      this.close();
      this.field1205 = this.method1263();
      this.field1206 = this.method1265(var3);
   }

   private Map<String, Class1810> method1263() {
      Map<String, Class1810> var3 = Maps.newTreeMap();

      for (Class7651 var5 : this.field1204) {
         var5.method25140(var1 -> {
            Class1810 var4 = var3.put(var1.method7951(), var1);
         }, this.field1207);
      }

      return ImmutableMap.copyOf(var3);
   }

   public void method1264(Collection<String> var1) {
      this.field1206 = this.method1265(var1);
   }

   private List<Class1810> method1265(Collection<String> var1) {
      List var4 = this.method1266(var1).collect(Collectors.toList());

      for (Class1810 var6 : this.field1205.values()) {
         if (var6.method7952() && !var4.contains(var6)) {
            var6.method7954().method8249(var4, var6, Functions.identity(), false);
         }
      }

      return ImmutableList.copyOf(var4);
   }

   private Stream<Class1810> method1266(Collection<String> var1) {
      return var1.stream().<Class1810>map(this.field1205::get).filter(Objects::nonNull);
   }

   public Collection<String> method1267() {
      return this.field1205.keySet();
   }

   public Collection<Class1810> method1268() {
      return this.field1205.values();
   }

   public Collection<String> method1269() {
      return this.field1206.stream().<String>map(Class1810::method7951).collect(ImmutableSet.toImmutableSet());
   }

   public Collection<Class1810> method1270() {
      return this.field1206;
   }

   @Nullable
   public Class1810 method1271(String var1) {
      return this.field1205.get(var1);
   }

   @Override
   public void close() {
      this.field1205.values().forEach(Class1810::close);
   }

   public boolean method1272(String var1) {
      return this.field1205.containsKey(var1);
   }

   public List<Class303> method1273() {
      return this.field1206.stream().<Class303>map(Class1810::method7950).collect(ImmutableList.toImmutableList());
   }
}
