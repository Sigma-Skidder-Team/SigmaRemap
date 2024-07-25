package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class class_4722<T> extends AbstractCollection<T> {
   private final Map<Class<?>, List<T>> field_22901 = Maps.newHashMap();
   private final Class<T> field_22904;
   private final List<T> field_22903 = Lists.newArrayList();

   public class_4722(Class<T> var1) {
      this.field_22904 = var1;
      this.field_22901.put(var1, this.field_22903);
   }

   @Override
   public boolean add(T var1) {
      boolean var4 = false;

      for (Entry var6 : this.field_22901.entrySet()) {
         if (((Class)var6.getKey()).isInstance(var1)) {
            var4 |= ((List)var6.getValue()).add(var1);
         }
      }

      return var4;
   }

   @Override
   public boolean remove(Object var1) {
      boolean var4 = false;

      for (Entry var6 : this.field_22901.entrySet()) {
         if (((Class)var6.getKey()).isInstance(var1)) {
            List var7 = (List)var6.getValue();
            var4 |= var7.remove(var1);
         }
      }

      return var4;
   }

   @Override
   public boolean contains(Object var1) {
      return this.method_21835(var1.getClass()).contains(var1);
   }

   public <S> Collection<S> method_21835(Class<S> var1) {
      if (this.field_22904.isAssignableFrom(var1)) {
         List var4 = this.field_22901.computeIfAbsent(var1, var1x -> this.field_22903.stream().filter(var1x::isInstance).collect(Collectors.<T>toList()));
         return Collections.unmodifiableCollection(var4);
      } else {
         throw new IllegalArgumentException("Don't know how to search for " + var1);
      }
   }

   @Override
   public Iterator<T> iterator() {
      return (Iterator<T>)(!this.field_22903.isEmpty() ? Iterators.unmodifiableIterator(this.field_22903.iterator()) : Collections.<T>emptyIterator());
   }

   public List<T> method_21834() {
      return ImmutableList.copyOf(this.field_22903);
   }

   @Override
   public int size() {
      return this.field_22903.size();
   }
}
