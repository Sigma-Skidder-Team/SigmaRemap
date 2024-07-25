package remapped;

import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;

public final class class_5361 extends AbstractSpliterator<class_2034> {
   private static String[] field_27359;
   private class_2034 field_27358;

   public class_5361(long var1, int var3, class_2034 var4, class_2034 var5, int var6, int var7) {
      super(var1, var3);
      this.field_27360 = var4;
      this.field_27362 = var5;
      this.field_27361 = var6;
      this.field_27357 = var7;
   }

   @Override
   public boolean tryAdvance(Consumer<? super class_2034> var1) {
      if (this.field_27358 != null) {
         int var4 = this.field_27358.field_10328;
         int var5 = this.field_27358.field_10327;
         if (var4 != this.field_27362.field_10328) {
            this.field_27358 = new class_2034(var4 + this.field_27357, var5);
         } else {
            if (var5 == this.field_27362.field_10327) {
               return false;
            }

            this.field_27358 = new class_2034(this.field_27360.field_10328, var5 + this.field_27361);
         }
      } else {
         this.field_27358 = this.field_27360;
      }

      var1.accept(this.field_27358);
      return true;
   }
}
