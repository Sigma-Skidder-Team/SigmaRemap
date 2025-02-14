package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Class51<T> extends AbstractCollection<T> {
   private final Map<Class<?>, List<T>> field106 = Maps.newHashMap();
   private final Class<T> field107;
   private final List<T> field108 = Lists.newArrayList();

   public Class51(Class<T> var1) {
      this.field107 = var1;
      this.field106.put(var1, this.field108);
   }

   @Override
   public boolean add(T var1) {
      boolean var4 = false;

      for (Entry var6 : this.field106.entrySet()) {
         if (((Class)var6.getKey()).isInstance(var1)) {
            var4 |= ((List)var6.getValue()).add(var1);
         }
      }

      return var4;
   }

   @Override
   public boolean remove(Object var1) {
      boolean var4 = false;

      for (Entry var6 : this.field106.entrySet()) {
         if (((Class)var6.getKey()).isInstance(var1)) {
            List var7 = (List)var6.getValue();
            var4 |= var7.remove(var1);
         }
      }

      return var4;
   }

   @Override
   public boolean contains(Object var1) {
      return this.method176(var1.getClass()).contains(var1);
   }

   public <S> Collection<S> method176(Class<S> var1) {
      if (this.field107.isAssignableFrom(var1)) {
         List var4 = this.field106.computeIfAbsent(var1, var1x -> this.field108.stream().filter(var1x::isInstance).collect(Collectors.<T>toList()));
         return Collections.unmodifiableCollection(var4);
      } else {
         throw new IllegalArgumentException("Don't know how to search for " + var1);
      }
   }

   @Override
   public Iterator<T> iterator() {
      return (Iterator<T>)(!this.field108.isEmpty() ? Iterators.unmodifiableIterator(this.field108.iterator()) : Collections.<T>emptyIterator());
   }

   public List<T> method177() {
      return ImmutableList.copyOf(this.field108);
   }

   @Override
   public int size() {
      return this.field108.size();
   }
}
