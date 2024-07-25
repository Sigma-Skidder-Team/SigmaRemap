package remapped;

import com.mojang.serialization.Codec;

public class class_6746<T> {
   private final T field_34822;
   private final int field_34824;
   private double field_34823;

   private class_6746(T var1, int var2) {
      this.field_34824 = var2;
      this.field_34822 = (T)var1;
   }

   private double method_30903() {
      return this.field_34823;
   }

   private void method_30904(float var1) {
      this.field_34823 = -Math.pow((double)var1, (double)(1.0F / (float)this.field_34824));
   }

   public T method_30897() {
      return this.field_34822;
   }

   @Override
   public String toString() {
      return "" + this.field_34824 + ":" + this.field_34822;
   }

   public static <E> Codec<class_6746<E>> method_30901(Codec<E> var0) {
      return new class_8780(var0);
   }
}
