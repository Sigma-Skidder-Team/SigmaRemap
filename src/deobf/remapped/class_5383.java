package remapped;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenCustomHashMap;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;
import java.util.Map.Entry;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5383<T> extends class_6433<T> {
   public static final Logger field_27476 = LogManager.getLogger();
   private final ObjectList<T> field_27473 = new ObjectArrayList(256);
   private final Object2IntMap<T> field_27475 = new Object2IntOpenCustomHashMap(class_9665.method_44698());
   private final BiMap<class_4639, T> field_27469;
   private final BiMap<class_5621<T>, T> field_27468;
   private final Map<T, Lifecycle> field_27474;
   private Lifecycle field_27471;
   public Object[] field_27470;
   private int field_27472;

   public class_5383(class_5621<? extends class_8669<T>> var1, Lifecycle var2) {
      super(var1, var2);
      this.field_27475.defaultReturnValue(-1);
      this.field_27469 = HashBiMap.create();
      this.field_27468 = HashBiMap.create();
      this.field_27474 = Maps.newIdentityHashMap();
      this.field_27471 = var2;
   }

   public static <T> MapCodec<class_8903<T>> method_24528(class_5621<? extends class_8669<T>> var0, MapCodec<T> var1) {
      return RecordCodecBuilder.mapCodec(
         var2 -> var2.group(
                  class_4639.field_22655.xmap(class_5621.method_25495(var0), class_5621::method_25499).fieldOf("name").forGetter(var0xx -> var0xx.field_45649),
                  Codec.INT.fieldOf("id").forGetter(var0xx -> var0xx.field_45650),
                  var1.forGetter(var0xx -> var0xx.field_45648)
               )
               .apply(var2, class_8903::new)
      );
   }

   @Override
   public <V extends T> V method_29380(int var1, class_5621<T> var2, V var3, Lifecycle var4) {
      return this.<V>method_24529(var1, var2, (V)var3, var4, true);
   }

   private <V extends T> V method_24529(int var1, class_5621<T> var2, V var3, Lifecycle var4, boolean var5) {
      Validate.notNull(var2);
      Validate.notNull(var3);
      this.field_27473.size(Math.max(this.field_27473.size(), var1 + 1));
      this.field_27473.set(var1, var3);
      this.field_27475.put(var3, var1);
      this.field_27470 = null;
      if (var5 && this.field_27468.containsKey(var2)) {
         field_27476.debug("Adding duplicate key '{}' to registry", var2);
      }

      if (this.field_27469.containsValue(var3)) {
         field_27476.error("Adding duplicate value '{}' to registry", var3);
      }

      this.field_27469.put(var2.method_25499(), var3);
      this.field_27468.put(var2, var3);
      this.field_27474.put((T)var3, var4);
      this.field_27471 = this.field_27471.add(var4);
      if (this.field_27472 <= var1) {
         this.field_27472 = var1 + 1;
      }

      return (V)var3;
   }

   @Override
   public <V extends T> V method_29381(class_5621<T> var1, V var2, Lifecycle var3) {
      return this.<V>method_29380(this.field_27472, var1, (V)var2, var3);
   }

   @Override
   public <V extends T> V method_29382(OptionalInt var1, class_5621<T> var2, V var3, Lifecycle var4) {
      Validate.notNull(var2);
      Validate.notNull(var3);
      Object var7 = this.field_27468.get(var2);
      int var8;
      if (var7 != null) {
         var8 = this.field_27475.getInt(var7);
         if (var1.isPresent() && var1.getAsInt() != var8) {
            throw new IllegalStateException("ID mismatch");
         }

         this.field_27475.removeInt(var7);
         this.field_27474.remove(var7);
      } else {
         var8 = !var1.isPresent() ? this.field_27472 : var1.getAsInt();
      }

      return this.<V>method_24529(var8, var2, (V)var3, var4, false);
   }

   @Nullable
   @Override
   public class_4639 method_39797(T var1) {
      return (class_4639)this.field_27469.inverse().get(var1);
   }

   @Override
   public Optional<class_5621<T>> method_39800(T var1) {
      return Optional.<class_5621<T>>ofNullable((class_5621<T>)this.field_27468.inverse().get(var1));
   }

   @Override
   public int method_14041(T var1) {
      return this.field_27475.getInt(var1);
   }

   @Nullable
   @Override
   public T method_39799(class_5621<T> var1) {
      return (T)this.field_27468.get(var1);
   }

   @Nullable
   @Override
   public T method_14040(int var1) {
      return (T)(var1 >= 0 && var1 < this.field_27473.size() ? this.field_27473.get(var1) : null);
   }

   @Override
   public Lifecycle method_39813(T var1) {
      return this.field_27474.get(var1);
   }

   @Override
   public Lifecycle method_39811() {
      return this.field_27471;
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.filter(this.field_27473.iterator(), Objects::nonNull);
   }

   @Nullable
   @Override
   public T method_39806(class_4639 var1) {
      return (T)this.field_27469.get(var1);
   }

   @Override
   public Set<class_4639> method_39805() {
      return Collections.<class_4639>unmodifiableSet(this.field_27469.keySet());
   }

   @Override
   public Set<Entry<class_5621<T>, T>> method_39808() {
      return Collections.<class_5621<T>, T>unmodifiableMap(this.field_27468).entrySet();
   }

   @Nullable
   public T method_24525(Random var1) {
      if (this.field_27470 == null) {
         Set var4 = this.field_27469.values();
         if (var4.isEmpty()) {
            return null;
         }

         this.field_27470 = var4.<Object>toArray(new Object[var4.size()]);
      }

      return class_9665.<T>method_44697((T[])this.field_27470, var1);
   }

   @Override
   public boolean method_39814(class_4639 var1) {
      return this.field_27469.containsKey(var1);
   }

   public static <T> Codec<class_5383<T>> method_24527(class_5621<? extends class_8669<T>> var0, Lifecycle var1, Codec<T> var2) {
      return method_24528(var0, var2.fieldOf("element")).codec().listOf().xmap(var2x -> {
         class_5383 var5 = new class_5383(var0, var1);

         for (class_8903 var7 : var2x) {
            var5.<T>method_29380(var7.field_45650, var7.field_45649, var7.field_45648, var1);
         }

         return var5;
      }, var0x -> {
         Builder var3 = ImmutableList.builder();

         for (Object var5 : var0x) {
            var3.add(new class_8903<Object>(var0x.method_39800(var5).get(), var0x.method_14041(var5), var5));
         }

         return var3.build();
      });
   }

   public static <T> Codec<class_5383<T>> method_24530(class_5621<? extends class_8669<T>> var0, Lifecycle var1, Codec<T> var2) {
      return class_4539.<class_5383<T>>method_21069(var0, var1, var2);
   }

   public static <T> Codec<class_5383<T>> method_24526(class_5621<? extends class_8669<T>> var0, Lifecycle var1, Codec<T> var2) {
      return Codec.unboundedMap(class_4639.field_22655.xmap(class_5621.method_25495(var0), class_5621::method_25499), var2).xmap(var2x -> {
         class_5383 var5 = new class_5383(var0, var1);
         var2x.forEach((var2xx, var3) -> var5.method_29381((class_5621<T>)var2xx, var3, var1));
         return var5;
      }, var0x -> ImmutableMap.copyOf(var0x.field_27468));
   }
}
