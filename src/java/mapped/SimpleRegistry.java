package mapped;

import com.google.common.collect.*;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import net.minecraft.client.util.Util;
import net.minecraft.util.ResourceLocation;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.*;
import java.util.Map.Entry;

public class SimpleRegistry<T> extends MutableRegistry<T> {
   public static final Logger field16141 = LogManager.getLogger();
   private final ObjectList<T> field16142 = new ObjectArrayList(256);
   private final Object2IntMap<T> field16143 = new Object2IntOpenCustomHashMap(Util.method38509());
   private final BiMap<ResourceLocation, T> field16144;
   private final BiMap<RegistryKey<T>, T> field16145;
   private final Map<T, Lifecycle> field16146;
   private Lifecycle field16147;
   public Object[] field16148;
   private int field16149;

   public SimpleRegistry(RegistryKey<? extends Registry<T>> var1, Lifecycle var2) {
      super(var1, var2);
      this.field16143.defaultReturnValue(-1);
      this.field16144 = HashBiMap.create();
      this.field16145 = HashBiMap.create();
      this.field16146 = com.google.common.collect.Maps.newIdentityHashMap();
      this.field16147 = var2;
   }

   public static <T> MapCodec<Class9581<T>> method9252(RegistryKey<? extends Registry<T>> var0, MapCodec<T> var1) {
      return RecordCodecBuilder.mapCodec(
         var2 -> var2.group(
                  ResourceLocation.CODEC.xmap(RegistryKey.method31400(var0), RegistryKey::getLocation).fieldOf("name").forGetter(var0xx -> var0xx.field44788),
                  Codec.INT.fieldOf("id").forGetter(var0xx -> var0xx.field44789),
                  var1.forGetter(var0xx -> var0xx.field44790)
               )
               .apply(var2, Class9581::new)
      );
   }

   @Override
   public <V extends T> V method9249(int var1, RegistryKey<T> var2, V var3, Lifecycle var4) {
      return this.<V>method9253(var1, var2, (V)var3, var4, true);
   }

   private <V extends T> V method9253(int var1, RegistryKey<T> var2, V var3, Lifecycle var4, boolean var5) {
      Validate.notNull(var2);
      Validate.notNull(var3);
      this.field16142.size(Math.max(this.field16142.size(), var1 + 1));
      this.field16142.set(var1, var3);
      this.field16143.put(var3, var1);
      this.field16148 = null;
      if (var5 && this.field16145.containsKey(var2)) {
         field16141.debug("Adding duplicate key '{}' to registry", var2);
      }

      if (this.field16144.containsValue(var3)) {
         field16141.error("Adding duplicate value '{}' to registry", var3);
      }

      this.field16144.put(var2.getLocation(), var3);
      this.field16145.put(var2, var3);
      this.field16146.put((T)var3, var4);
      this.field16147 = this.field16147.add(var4);
      if (this.field16149 <= var1) {
         this.field16149 = var1 + 1;
      }

      return (V)var3;
   }

   @Override
   public <V extends T> V register(RegistryKey<T> var1, V var2, Lifecycle var3) {
      return this.<V>method9249(this.field16149, var1, (V)var2, var3);
   }

   @Override
   public <V extends T> V method9251(OptionalInt var1, RegistryKey<T> var2, V var3, Lifecycle var4) {
      Validate.notNull(var2);
      Validate.notNull(var3);
      Object var7 = this.field16145.get(var2);
      int var8;
      if (var7 != null) {
         var8 = this.field16143.getInt(var7);
         if (var1.isPresent() && var1.getAsInt() != var8) {
            throw new IllegalStateException("ID mismatch");
         }

         this.field16143.removeInt(var7);
         this.field16146.remove(var7);
      } else {
         var8 = !var1.isPresent() ? this.field16149 : var1.getAsInt();
      }

      return this.<V>method9253(var8, var2, (V)var3, var4, false);
   }

   @Nullable
   @Override
   public ResourceLocation getKey(T var1) {
      return (ResourceLocation)this.field16144.inverse().get(var1);
   }

   @Override
   public Optional<RegistryKey<T>> method9182(T var1) {
      return Optional.<RegistryKey<T>>ofNullable((RegistryKey<T>)this.field16145.inverse().get(var1));
   }

   @Override
   public int getId(T var1) {
      return this.field16143.getInt(var1);
   }

   @Nullable
   @Override
   public T method9183(RegistryKey<T> var1) {
      return (T)this.field16145.get(var1);
   }

   @Nullable
   @Override
   public T method9172(int var1) {
      return (T)(var1 >= 0 && var1 < this.field16142.size() ? this.field16142.get(var1) : null);
   }

   @Override
   public Lifecycle method9185(T var1) {
      return this.field16146.get(var1);
   }

   @Override
   public Lifecycle method9186() {
      return this.field16147;
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.filter(this.field16142.iterator(), Objects::nonNull);
   }

   @Nullable
   @Override
   public T method9184(ResourceLocation var1) {
      return (T)this.field16144.get(var1);
   }

   @Override
   public Set<ResourceLocation> method9190() {
      return Collections.<ResourceLocation>unmodifiableSet(this.field16144.keySet());
   }

   @Override
   public Set<Entry<RegistryKey<T>, T>> method9191() {
      return Collections.<RegistryKey<T>, T>unmodifiableMap(this.field16145).entrySet();
   }

   @Nullable
   public T method9254(Random var1) {
      if (this.field16148 == null) {
         Set var4 = this.field16144.values();
         if (var4.isEmpty()) {
            return null;
         }

         this.field16148 = var4.<Object>toArray(new Object[var4.size()]);
      }

      return Util.<T>method38518((T[])this.field16148, var1);
   }

   @Override
   public boolean method9193(ResourceLocation var1) {
      return this.field16144.containsKey(var1);
   }

   public static <T> Codec<SimpleRegistry<T>> method9255(RegistryKey<? extends Registry<T>> var0, Lifecycle var1, Codec<T> var2) {
      return method9252(var0, var2.fieldOf("element")).codec().listOf().xmap(var2x -> {
         SimpleRegistry<T> var5 = new SimpleRegistry(var0, var1);

         for (Class9581<T> var7 : var2x) {
            var5.method9249(var7.field44789, var7.field44788, var7.field44790, var1);
         }

         return var5;
      }, var0x -> {
         Builder<Class9581<T>> var3 = ImmutableList.builder();

         for (T var5 : var0x) {
            var3.add(new Class9581<>(var0x.method9182(var5).get(), var0x.getId(var5), var5));
         }

         return var3.build();
      });
   }

   public static <T> Codec<SimpleRegistry<T>> method9256(RegistryKey<? extends Registry<T>> var0, Lifecycle var1, Codec<T> var2) {
      return Class8423.method29595(var0, var1, var2);
   }

   public static <T> Codec<SimpleRegistry<T>> method9257(RegistryKey<? extends Registry<T>> var0, Lifecycle var1, Codec<T> var2) {
      return Codec.unboundedMap(ResourceLocation.CODEC.xmap(RegistryKey.method31400(var0), RegistryKey::getLocation), var2).xmap(var2x -> {
         SimpleRegistry var5 = new SimpleRegistry(var0, var1);
         var2x.forEach((var2xx, var3) -> var5.register((RegistryKey<T>)var2xx, var3, var1));
         return var5;
      }, var0x -> ImmutableMap.copyOf(var0x.field16145));
   }
}
