package remapped;

import java.util.Spliterators.AbstractSpliterator;
import java.util.function.Consumer;

public final class class_5044 extends AbstractSpliterator<class_6979> {
   private static String[] field_26076;
   public final class_6281 field_26081;

   public class_5044(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      super(var1, var3);
      this.field_26077 = var4;
      this.field_26074 = var5;
      this.field_26075 = var6;
      this.field_26078 = var7;
      this.field_26080 = var8;
      this.field_26079 = var9;
      this.field_26081 = new class_6281(this.field_26077, this.field_26074, this.field_26075, this.field_26078, this.field_26080, this.field_26079);
   }

   @Override
   public boolean tryAdvance(Consumer<? super class_6979> var1) {
      if (!this.field_26081.method_28626()) {
         return false;
      } else {
         var1.accept(new class_6979(this.field_26081.method_28624(), this.field_26081.method_28628(), this.field_26081.method_28623(), null));
         return true;
      }
   }
}
