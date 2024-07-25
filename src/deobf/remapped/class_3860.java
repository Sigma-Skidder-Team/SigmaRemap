package remapped;

public class class_3860<T extends class_5834> extends class_4171<T, class_1290<T>> {
   private static String[] field_18813;
   private final class_6521<T> field_18814 = new class_1290<T>(0);

   public class_3860(class_2514<T, class_1290<T>> var1) {
      super(var1);
   }

   public void method_17902(class_7966 var1, class_2565 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.method_37109()) {
         this.method_19347().method_29701(this.field_18814);
         this.field_18814.method_29702((T)var4, var5, var6, var7);
         this.field_18814.method_29700((T)var4, var5, var6, var8, var9, var10);
         class_7907 var13 = var2.method_11645(RenderLayer.method_16705(this.method_19346((T)var4)));
         this.field_18814.method_45499(var1, var13, var3, class_6353.method_29110(var4, 0.0F), 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
