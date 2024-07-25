package remapped;

import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;

public class class_3826 extends AbstractSpliterator<T> {
   private static String[] field_18698;
   private int field_18696;

   public class_3826(class_4997 var1, long var2, int var4) {
      super(var2, var4);
      this.field_18697 = var1;
   }

   @Override
   public boolean tryAdvance(Consumer<? super T> var1) {
      while (this.field_18696 >= class_4997.method_23010(this.field_18697).size()) {
         if (!class_4997.method_23008(this.field_18697).tryAdvance(class_4997.method_23010(this.field_18697)::add)) {
            return false;
         }
      }

      var1.accept(class_4997.method_23010(this.field_18697).get(this.field_18696++));
      return true;
   }
}
