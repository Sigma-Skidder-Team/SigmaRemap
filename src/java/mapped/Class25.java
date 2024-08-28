package mapped;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.Validate;

import javax.annotation.Nonnull;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;

public class Class25<E> extends AbstractList<E> {
   private static String[] field46;
   private final List<E> field47;
   private final E field48;

   public static <E> Class25<E> method67() {
      return new Class25<E>();
   }

   public static <E> Class25<E> method68(int var0, E var1) {
      Validate.notNull(var1);
      Object[] var4 = new Object[var0];
      Arrays.fill(var4, var1);
      return new Class25<E>(Arrays.<E>asList((E[])var4), (E)var1);
   }

   @SafeVarargs
   public static <E> Class25<E> method69(E var0, E... var1) {
      return new Class25<E>(Arrays.<E>asList((E[])var1), (E)var0);
   }

   public Class25() {
      this(Lists.newArrayList(), null);
   }

   public Class25(List<E> var1, E var2) {
      this.field47 = var1;
      this.field48 = (E)var2;
   }

   @Nonnull
   @Override
   public E get(int var1) {
      return this.field47.get(var1);
   }

   @Override
   public E set(int var1, E var2) {
      Validate.notNull(var2);
      return this.field47.set(var1, (E)var2);
   }

   @Override
   public void add(int var1, E var2) {
      Validate.notNull(var2);
      this.field47.add(var1, (E)var2);
   }

   @Override
   public E remove(int var1) {
      return this.field47.remove(var1);
   }

   @Override
   public int size() {
      return this.field47.size();
   }

   @Override
   public void clear() {
      if (this.field48 != null) {
         for (int var3 = 0; var3 < this.size(); var3++) {
            this.set(var3, this.field48);
         }
      } else {
         super.clear();
      }
   }
}
