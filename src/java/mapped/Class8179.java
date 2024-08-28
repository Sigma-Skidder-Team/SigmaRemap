package mapped;

import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;

public class Class8179<T> extends AbstractSpliterator<T> {
   private static String[] field35174;
   private int field35175;
   public final Class8544 field35176;

   public Class8179(Class8544 var1, long var2, int var4) {
      super(var2, var4);
      this.field35176 = var1;
   }

   @Override
   public boolean tryAdvance(Consumer<? super T> consumer) {
      do {
         if (this.field35175 >= Class8544.method30441(this.field35176).size()) continue;
         consumer.accept(((T) Class8544.method30441(this.field35176).get(this.field35175++)));
         return true;
      } while (Class8544.method30442(this.field35176).tryAdvance(Class8544.method30441(this.field35176)::add));
      return false;
   }
}
