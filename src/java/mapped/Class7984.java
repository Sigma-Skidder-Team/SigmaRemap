package mapped;

import com.google.common.collect.ImmutableBiMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableSet.Builder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public interface Class7984<T> {
   Map<ResourceLocation, Class7608<T>> method27134();

   @Nullable
   default Class7608<T> method27135(ResourceLocation var1) {
      return this.method27134().get(var1);
   }

   Class7608<T> method27132(ResourceLocation var1);

   @Nullable
   ResourceLocation method27133(Class7608<T> var1);

   default ResourceLocation method27136(Class7608<T> var1) {
      ResourceLocation var4 = this.method27133(var1);
      if (var4 != null) {
         return var4;
      } else {
         throw new IllegalStateException("Unrecognized tag");
      }
   }

   default Collection<ResourceLocation> method27137() {
      return this.method27134().keySet();
   }

   default Collection<ResourceLocation> method27138(T var1) {
      ArrayList var4 = Lists.newArrayList();

      for (Entry var6 : this.method27134().entrySet()) {
         if (((Class7608)var6.getValue()).method24917(var1)) {
            var4.add(var6.getKey());
         }
      }

      return var4;
   }

   default void method27139(PacketBuffer var1, Class2351<T> var2) {
      Map<ResourceLocation, Class7608<T>> var5 = this.method27134();
      var1.writeVarInt(var5.size());

      for (Entry<ResourceLocation, Class7608<T>> var7 : var5.entrySet()) {
         var1.method35732((ResourceLocation)var7.getKey());
         var1.writeVarInt(((Class7608)var7.getValue()).method24918().size());

         for (Object var9 : ((Class7608)var7.getValue()).method24918()) {
            var1.writeVarInt(var2.method9171((T) var9));
         }
      }
   }

   static <T> Class7984<T> method27140(PacketBuffer var0, Registry<T> var1) {
      HashMap var4 = Maps.newHashMap();
      int var5 = var0.method35714();

      for (int var6 = 0; var6 < var5; var6++) {
         ResourceLocation var7 = var0.method35731();
         int var8 = var0.method35714();
         Builder var9 = ImmutableSet.builder();

         for (int var10 = 0; var10 < var8; var10++) {
            var9.add(var1.method9172(var0.method35714()));
         }

         var4.put(var7, Class7608.method24920(var9.build()));
      }

      return method27142(var4);
   }

   static <T> Class7984<T> method27141() {
      return method27142(ImmutableBiMap.of());
   }

   static <T> Class7984<T> method27142(Map<ResourceLocation, Class7608<T>> var0) {
      ImmutableBiMap var3 = ImmutableBiMap.copyOf(var0);
      return new Class7983(var3);
   }
}
