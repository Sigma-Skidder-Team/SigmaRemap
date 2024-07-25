package remapped;

public abstract class class_4171<T extends class_8145, M extends class_6521<T>> {
   private final class_2514<T, M> field_20302;

   public class_4171(class_2514<T, M> var1) {
      this.field_20302 = var1;
   }

   public static <T extends class_5834> void method_19349(
      class_6521<T> var0,
      class_6521<T> var1,
      class_4639 var2,
      class_7966 var3,
      class_2565 var4,
      int var5,
      T var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15
   ) {
      if (!var6.method_37109()) {
         var0.method_29701(var1);
         var1.method_29702(var6, var7, var8, var12);
         var1.method_29700(var6, var7, var8, var9, var10, var11);
         method_19348(var1, var2, var3, var4, var5, var6, var13, var14, var15);
      }
   }

   public static <T extends class_5834> void method_19348(
      class_6521<T> var0, class_4639 var1, class_7966 var2, class_2565 var3, int var4, T var5, float var6, float var7, float var8
   ) {
      class_7907 var11 = var3.method_11645(class_3581.method_16755(var1));
      var0.method_45499(var2, var11, var4, class_6353.method_29110(var5, 0.0F), var6, var7, var8, 1.0F);
   }

   public M method_19347() {
      return this.field_20302.method_11447();
   }

   public class_4639 method_19346(T var1) {
      return this.field_20302.method_11446((T)var1);
   }

   public abstract void method_19344(
      class_7966 var1, class_2565 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10
   );
}
