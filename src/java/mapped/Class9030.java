package mapped;

import com.mojang.serialization.Codec;

public class Class9030<T> {
   private final T field41321;
   private final int field41322;
   private double field41323;

   Class9030(T var1, int var2) {
      this.field41322 = var2;
      this.field41321 = (T)var1;
   }

   private double method33432() {
      return this.field41323;
   }

   private void method33433(float var1) {
      this.field41323 = -Math.pow((double)var1, (double)(1.0F / (float)this.field41322));
   }

   public T method33434() {
      return this.field41321;
   }

   @Override
   public String toString() {
      return "" + this.field41322 + ":" + this.field41321;
   }

   public static <E> Codec<Class9030<E>> method33435(Codec<E> var0) {
      return new Class9541(var0);
   }

   // $VF: synthetic method
   public static Object method33436(Class9030 var0) {
      return var0.field41321;
   }

   // $VF: synthetic method
   public static int method33437(Class9030 var0) {
      return var0.field41322;
   }

   // $VF: synthetic method
   public static double method33438(Class9030 var0) {
      return var0.method33432();
   }

   // $VF: synthetic method
   public static void method33439(Class9030 var0, float var1) {
      var0.method33433(var1);
   }
}
