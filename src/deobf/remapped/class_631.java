package remapped;

import com.google.common.collect.Lists;
import java.util.AbstractList;
import java.util.List;

public class class_631 extends AbstractList<E> {
   private static String[] field_3562;
   private final List<E> field_3560;

   private class_631(class_7983 var1) {
      this.field_3561 = var1;
      this.field_3560 = Lists.newArrayList();
   }

   public E get(int var1) {
      return (E)((class_4686)this.field_3560.get(var1));
   }

   @Override
   public int size() {
      return this.field_3560.size();
   }

   public E set(int var1, E var2) {
      class_4686 var5 = this.field_3560.set(var1, var2);
      class_7983.method_36227(this.field_3561, var2);
      return (E)var5;
   }

   public void add(int var1, E var2) {
      this.field_3560.add(var1, var2);
      class_7983.method_36227(this.field_3561, var2);
   }

   public E remove(int var1) {
      return (E)((class_4686)this.field_3560.remove(var1));
   }
}
