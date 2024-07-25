package remapped;

import com.google.common.collect.ArrayTable;
import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.google.common.collect.UnmodifiableIterator;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public abstract class class_2243<O, S> {
   private static final Function<Entry<class_5019<?>, Comparable<?>>, String> field_11167 = new class_3859();
   public final O field_11166;
   private final ImmutableMap<class_5019<?>, Comparable<?>> field_11170;
   private Table<class_5019<?>, Comparable<?>, S> field_11169;
   public final MapCodec<S> field_11168;

   public class_2243(O var1, ImmutableMap<class_5019<?>, Comparable<?>> var2, MapCodec<S> var3) {
      this.field_11166 = (O)var1;
      this.field_11170 = var2;
      this.field_11168 = var3;
   }

   public <T extends Comparable<T>> S method_10317(class_5019<T> var1) {
      return this.method_10308(var1, method_10314(var1.method_23105(), this.<Comparable>method_10313(var1)));
   }

   public static <T> T method_10314(Collection<T> var0, T var1) {
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
      var3.append(this.field_11166);
      if (!this.method_10316().isEmpty()) {
         var3.append('[');
         var3.append(this.method_10316().entrySet().stream().<String>map(field_11167).collect(Collectors.joining(",")));
         var3.append(']');
      }

      return var3.toString();
   }

   public Collection<class_5019<?>> method_10310() {
      return Collections.<class_5019<?>>unmodifiableCollection(this.field_11170.keySet());
   }

   public <T extends Comparable<T>> boolean method_10307(class_5019<T> var1) {
      return this.field_11170.containsKey(var1);
   }

   public <T extends Comparable<T>> T method_10313(class_5019<T> var1) {
      Comparable var4 = (Comparable)this.field_11170.get(var1);
      if (var4 != null) {
         return (T)var1.method_23112().cast(var4);
      } else {
         throw new IllegalArgumentException("Cannot get property " + var1 + " as it does not exist in " + this.field_11166);
      }
   }

   public <T extends Comparable<T>> Optional<T> method_10309(class_5019<T> var1) {
      Comparable var4 = (Comparable)this.field_11170.get(var1);
      return var4 != null ? Optional.<T>of((T)var1.method_23112().cast(var4)) : Optional.<T>empty();
   }

   public <T extends Comparable<T>, V extends T> S method_10308(class_5019<T> var1, V var2) {
      Comparable var5 = (Comparable)this.field_11170.get(var1);
      if (var5 != null) {
         if (var5 != var2) {
            Object var6 = this.field_11169.get(var1, var2);
            if (var6 != null) {
               return (S)var6;
            } else {
               throw new IllegalArgumentException("Cannot set property " + var1 + " to " + var2 + " on " + this.field_11166 + ", it is not an allowed value");
            }
         } else {
            return (S)this;
         }
      } else {
         throw new IllegalArgumentException("Cannot set property " + var1 + " as it does not exist in " + this.field_11166);
      }
   }

   public void method_10315(Map<Map<class_5019<?>, Comparable<?>>, S> var1) {
      if (this.field_11169 != null) {
         throw new IllegalStateException();
      } else {
         HashBasedTable var4 = HashBasedTable.create();
         UnmodifiableIterator var5 = this.field_11170.entrySet().iterator();

         while (var5.hasNext()) {
            Entry var6 = (Entry)var5.next();
            class_5019 var7 = (class_5019)var6.getKey();

            for (Comparable var9 : var7.method_23105()) {
               if (var9 != var6.getValue()) {
                  var4.put(var7, var9, var1.get(this.method_10306(var7, var9)));
               }
            }
         }

         this.field_11169 = (Table<class_5019<?>, Comparable<?>, S>)(!var4.isEmpty() ? ArrayTable.create(var4) : var4);
      }
   }

   private Map<class_5019<?>, Comparable<?>> method_10306(class_5019<?> var1, Comparable<?> var2) {
      HashMap var5 = Maps.newHashMap(this.field_11170);
      var5.put(var1, var2);
      return var5;
   }

   public ImmutableMap<class_5019<?>, Comparable<?>> method_10316() {
      return this.field_11170;
   }

   public static <O, S extends class_2243<O, S>> Codec<S> method_10312(Codec<O> var0, Function<O, S> var1) {
      return var0.dispatch("Name", var0x -> var0x.field_11166, var1x -> {
         class_2243 var4 = (class_2243)var1.apply(var1x);
         return !var4.method_10316().isEmpty() ? var4.field_11168.fieldOf("Properties").codec() : Codec.unit(var4);
      });
   }
}
