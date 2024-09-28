package net.minecraft.state;

import com.google.common.collect.ArrayTable;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import mapped.Class10;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class StateHolder<O, S> {
   private static final Function<Entry<Property<?>, Comparable<?>>, String> field31578 = new Class10();
   public final O field31579;
   private final ImmutableMap<Property<?>, Comparable<?>> field31580;
   private Table<Property<?>, Comparable<?>, S> field31581;
   public final MapCodec<S> field31582;

   public StateHolder(O var1, ImmutableMap<Property<?>, Comparable<?>> var2, MapCodec<S> var3) {
      this.field31579 = (O)var1;
      this.field31580 = var2;
      this.field31582 = var3;
   }

   public <T extends Comparable<T>> S method23459(Property<T> var1) {
      return this.with(var1, method23460(var1.method30474(), this.get(var1)));
   }

   public static <T> T method23460(Collection<T> var0, T var1) {
      Iterator var4 = var0.iterator();

      while (var4.hasNext()) {
         if (var4.next().equals(var1)) {
            if (!var4.hasNext()) {
               return (T)var0.iterator().next();
            }

            return (T)var4.next();
         }
      }

      return (T)var4.next();
   }

   @Override
   public String toString() {
      StringBuilder var3 = new StringBuilder();
      var3.append(this.field31579);
      if (!this.method23468().isEmpty()) {
         var3.append('[');
         var3.append(this.method23468().entrySet().stream().<String>map(field31578).collect(Collectors.joining(",")));
         var3.append(']');
      }

      return var3.toString();
   }

   public Collection<Property<?>> method23461() {
      return Collections.<Property<?>>unmodifiableCollection(this.field31580.keySet());
   }

   public <T extends Comparable<T>> boolean method23462(Property<T> var1) {
      return this.field31580.containsKey(var1);
   }

   public <T extends Comparable<T>> T get(Property<T> var1) {
      Comparable var4 = (Comparable)this.field31580.get(var1);
      if (var4 != null) {
         return (T)var1.method30473().cast(var4);
      } else {
         throw new IllegalArgumentException("Cannot get property " + var1 + " as it does not exist in " + this.field31579);
      }
   }

   public <T extends Comparable<T>> Optional<T> method23464(Property<T> var1) {
      Comparable var4 = (Comparable)this.field31580.get(var1);
      return var4 != null ? Optional.<T>of((T)var1.method30473().cast(var4)) : Optional.<T>empty();
   }

   public <T extends Comparable<T>, V extends T> S with(Property<T> var1, V var2) {
      Comparable var5 = (Comparable)this.field31580.get(var1);
      if (var5 != null) {
         if (var5 != var2) {
            Object var6 = this.field31581.get(var1, var2);
            if (var6 != null) {
               return (S)var6;
            } else {
               throw new IllegalArgumentException("Cannot set property " + var1 + " to " + var2 + " on " + this.field31579 + ", it is not an allowed value");
            }
         } else {
            return (S)this;
         }
      } else {
         throw new IllegalArgumentException("Cannot set property " + var1 + " as it does not exist in " + this.field31579);
      }
   }

   public void method23466(Map<Map<Property<?>, Comparable<?>>, S> var1) {
      if (this.field31581 != null) {
         throw new IllegalStateException();
      } else {
         HashBasedTable var4 = HashBasedTable.create();
         UnmodifiableIterator<Entry<Property<?>, Comparable<?>>> var5 = this.field31580.entrySet().iterator();

         while (var5.hasNext()) {
            Entry<Property<?>, Comparable<?>> var6 = var5.next();
            Property<?> var7 = var6.getKey();

            for (Comparable var9 : var7.method30474()) {
               if (var9 != var6.getValue()) {
                  var4.put(var7, var9, var1.get(this.method23467(var7, var9)));
               }
            }
         }

         this.field31581 = (Table<Property<?>, Comparable<?>, S>)(!var4.isEmpty() ? ArrayTable.create(var4) : var4);
      }
   }

   private Map<Property<?>, Comparable<?>> method23467(Property<?> var1, Comparable<?> var2) {
      HashMap var5 = Maps.newHashMap(this.field31580);
      var5.put(var1, var2);
      return var5;
   }

   public ImmutableMap<Property<?>, Comparable<?>> method23468() {
      return this.field31580;
   }

   public static <O, S extends StateHolder<O, S>> Codec<S> method23469(Codec<O> p_235897_0_, Function<O, S> p_235897_1_) {
      return p_235897_0_.dispatch("Name", (p_235895_0_) -> {
         return p_235895_0_.field31579;
      }, (p_235900_1_) -> {
         S s = p_235897_1_.apply(p_235900_1_);
         return s.method23468().isEmpty() ? Codec.unit(s) : s.field31582.fieldOf("Properties").codec();
      });
   }
}
