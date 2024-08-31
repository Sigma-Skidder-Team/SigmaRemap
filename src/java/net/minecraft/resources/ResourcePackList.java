package net.minecraft.resources;

import com.google.common.base.Functions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import mapped.Class7651;
import mapped.Class9325;
import mapped.IResourcePack;

import javax.annotation.Nullable;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ResourcePackList implements AutoCloseable {
   private static String[] field1203;
   private final Set<Class7651> field1204;
   private Map<String, ResourcePackInfo> field1205 = ImmutableMap.of();
   private List<ResourcePackInfo> field1206 = ImmutableList.of();
   private final Class9325 field1207;

   public ResourcePackList(Class9325 var1, Class7651... var2) {
      this.field1207 = var1;
      this.field1204 = ImmutableSet.copyOf(var2);
   }

   public ResourcePackList(Class7651... var1) {
      this(ResourcePackInfo::new, var1);
   }

   public void reloadPacksFromFinders() {
      List var3 = this.field1206.stream().<String>map(ResourcePackInfo::getName).collect(ImmutableList.toImmutableList());
      this.close();
      this.field1205 = this.method1263();
      this.field1206 = this.method1265(var3);
   }

   private Map<String, ResourcePackInfo> method1263() {
      Map<String, ResourcePackInfo> var3 = Maps.newTreeMap();

      for (Class7651 var5 : this.field1204) {
         var5.method25140(var1 -> {
            ResourcePackInfo var4 = var3.put(var1.getName(), var1);
         }, this.field1207);
      }

      return ImmutableMap.copyOf(var3);
   }

   public void setEnabledPacks(Collection<String> var1) {
      this.field1206 = this.method1265(var1);
   }

   private List<ResourcePackInfo> method1265(Collection<String> var1) {
      List var4 = this.method1266(var1).collect(Collectors.toList());

      for (ResourcePackInfo var6 : this.field1205.values()) {
         if (var6.isAlwaysEnabled() && !var4.contains(var6)) {
            var6.method7954().method8249(var4, var6, Functions.identity(), false);
         }
      }

      return ImmutableList.copyOf(var4);
   }

   private Stream<ResourcePackInfo> method1266(Collection<String> var1) {
      return var1.stream().<ResourcePackInfo>map(this.field1205::get).filter(Objects::nonNull);
   }

   public Collection<String> method1267() {
      return this.field1205.keySet();
   }

   public Collection<ResourcePackInfo> method1268() {
      return this.field1205.values();
   }

   public Collection<String> func_232621_d_() {
      return this.field1206.stream().<String>map(ResourcePackInfo::getName).collect(ImmutableSet.toImmutableSet());
   }

   public Collection<ResourcePackInfo> getEnabledPacks() {
      return this.field1206;
   }

   @Nullable
   public ResourcePackInfo method1271(String var1) {
      return this.field1205.get(var1);
   }

   @Override
   public void close() {
      this.field1205.values().forEach(ResourcePackInfo::close);
   }

   public boolean method1272(String var1) {
      return this.field1205.containsKey(var1);
   }

   public List<IResourcePack> func_232623_f_() {
      return this.field1206.stream().<IResourcePack>map(ResourcePackInfo::method7950).collect(ImmutableList.toImmutableList());
   }
}
