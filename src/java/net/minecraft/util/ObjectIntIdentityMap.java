package net.minecraft.util;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import mapped.Class2347;

import javax.annotation.Nullable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

public class ObjectIntIdentityMap<T> implements Class2347<T> {
   private static String[] field16153;
   private int field16154;
   private final IdentityHashMap<T, Integer> field16155;
   private final List<T> field16156;

   public ObjectIntIdentityMap() {
      this(512);
   }

   public ObjectIntIdentityMap(int var1) {
      this.field16156 = Lists.newArrayListWithExpectedSize(var1);
      this.field16155 = new IdentityHashMap<T, Integer>(var1);
   }

   public void method9268(T var1, int var2) {
      this.field16155.put((T)var1, var2);

      while (this.field16156.size() <= var2) {
         this.field16156.add(null);
      }

      this.field16156.set(var2, (T)var1);
      if (this.field16154 <= var2) {
         this.field16154 = var2 + 1;
      }
   }

   public void method9269(T var1) {
      this.method9268((T)var1, this.field16154);
   }

   @Override
   public int getId(T var1) {
      Integer var4 = this.field16155.get(var1);
      return var4 != null ? var4 : -1;
   }

   @Nullable
   @Override
   public final T getByValue(int var1) {
      return var1 >= 0 && var1 < this.field16156.size() ? this.field16156.get(var1) : null;
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.filter(this.field16156.iterator(), Predicates.notNull());
   }

   public int method9270() {
      return this.field16155.size();
   }
}
