package mapped;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class Class8478 {
   private final Multimap<String, String> field36337;
   private final Supplier<String> field36338;
   private final Class7538 field36339;
   private final Function<ResourceLocation, Class122> field36340;
   private final Set<ResourceLocation> field36341;
   private final Function<ResourceLocation, Class7318> field36342;
   private final Set<ResourceLocation> field36343;
   private String field36344;

   public Class8478(Class7538 var1, Function<ResourceLocation, Class122> var2, Function<ResourceLocation, Class7318> var3) {
      this(HashMultimap.create(), () -> "", var1, var2, ImmutableSet.of(), var3, ImmutableSet.of());
   }

   public Class8478(
      Multimap<String, String> var1,
      Supplier<String> var2,
      Class7538 var3,
      Function<ResourceLocation, Class122> var4,
      Set<ResourceLocation> var5,
      Function<ResourceLocation, Class7318> var6,
      Set<ResourceLocation> var7
   ) {
      this.field36337 = var1;
      this.field36338 = var2;
      this.field36339 = var3;
      this.field36340 = var4;
      this.field36341 = var5;
      this.field36342 = var6;
      this.field36343 = var7;
   }

   private String method29954() {
      if (this.field36344 == null) {
         this.field36344 = this.field36338.get();
      }

      return this.field36344;
   }

   public void method29955(String var1) {
      this.field36337.put(this.method29954(), var1);
   }

   public Class8478 method29956(String var1) {
      return new Class8478(
         this.field36337, () -> this.method29954() + var1, this.field36339, this.field36340, this.field36341, this.field36342, this.field36343
      );
   }

   public Class8478 method29957(String var1, ResourceLocation var2) {
      ImmutableSet var5 = ImmutableSet.builder().addAll(this.field36343).add(var2).build();
      return new Class8478(this.field36337, () -> this.method29954() + var1, this.field36339, this.field36340, this.field36341, this.field36342, var5);
   }

   public Class8478 method29958(String var1, ResourceLocation var2) {
      ImmutableSet var5 = ImmutableSet.builder().addAll(this.field36341).add(var2).build();
      return new Class8478(this.field36337, () -> this.method29954() + var1, this.field36339, this.field36340, var5, this.field36342, this.field36343);
   }

   public boolean method29959(ResourceLocation var1) {
      return this.field36343.contains(var1);
   }

   public boolean method29960(ResourceLocation var1) {
      return this.field36341.contains(var1);
   }

   public Multimap<String, String> method29961() {
      return ImmutableMultimap.copyOf(this.field36337);
   }

   public void method29962(Class126 var1) {
      this.field36339.method24645(this, var1);
   }

   @Nullable
   public Class7318 method29963(ResourceLocation var1) {
      return this.field36342.apply(var1);
   }

   @Nullable
   public Class122 method29964(ResourceLocation var1) {
      return this.field36340.apply(var1);
   }

   public Class8478 method29965(Class7538 var1) {
      return new Class8478(this.field36337, this.field36338, var1, this.field36340, this.field36341, this.field36342, this.field36343);
   }
}
