package remapped;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class class_95<T> implements class_3072<T> {
   private static String[] field_192;
   private int field_193;
   private final IdentityHashMap<T, Integer> field_194;
   private final List<T> field_191;

   public class_95() {
      this(512);
   }

   public class_95(int var1) {
      this.field_191 = Lists.newArrayListWithExpectedSize(var1);
      this.field_194 = new IdentityHashMap<T, Integer>(var1);
   }

   public void method_278(T var1, int var2) {
      this.field_194.put((T)var1, var2);

      while (this.field_191.size() <= var2) {
         this.field_191.add(null);
      }

      this.field_191.set(var2, (T)var1);
      if (this.field_193 <= var2) {
         this.field_193 = var2 + 1;
      }
   }

   public void method_279(T var1) {
      this.method_278((T)var1, this.field_193);
   }

   @Override
   public int method_14041(T var1) {
      Integer var4 = this.field_194.get(var1);
      return var4 != null ? var4 : -1;
   }

   @Nullable
   @Override
   public final T method_14040(int var1) {
      return var1 >= 0 && var1 < this.field_191.size() ? this.field_191.get(var1) : null;
   }

   @Override
   public Iterator<T> iterator() {
      return Iterators.filter(this.field_191.iterator(), Predicates.notNull());
   }

   public int method_280() {
      return this.field_194.size();
   }
}
