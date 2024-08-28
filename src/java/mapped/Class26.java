package mapped;

import com.google.common.collect.Lists;

import java.util.AbstractList;
import java.util.List;

public class Class26<E> extends AbstractList<E> {
   private static String[] field49;
   private final List<E> field50;
   public final Class1273 field51;

   public Class26(Class1273 var1) {
      this.field51 = var1;
      this.field50 = Lists.newArrayList();
   }

   public E get(int var1) {
      return (E)((Class1154)this.field50.get(var1));
   }

   @Override
   public int size() {
      return this.field50.size();
   }

   public E set(int var1, E var2) {
      Class1154 var5 = (Class1154) this.field50.set(var1, var2);
      Class1273.method6062(this.field51, (Class1154) var2);
      return (E)var5;
   }

   public void add(int var1, E var2) {
      this.field50.add(var1, var2);
      Class1273.method6062(this.field51, (Class1154) var2);
   }

   public E remove(int var1) {
      return (E)((Class1154)this.field50.remove(var1));
   }
}
