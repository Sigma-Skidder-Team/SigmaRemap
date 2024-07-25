package remapped;

import java.util.function.Function;

public abstract class class_1498<E extends class_8145> extends class_6521<E> {
   private final boolean field_7961;
   private final float field_7960;
   private final float field_7965;
   private final float field_7964;
   private final float field_7963;
   private final float field_7962;

   public class_1498(boolean var1, float var2, float var3) {
      this(var1, var2, var3, 2.0F, 2.0F, 24.0F);
   }

   public class_1498(boolean var1, float var2, float var3, float var4, float var5, float var6) {
      this(class_3581::method_16755, var1, var2, var3, var4, var5, var6);
   }

   public class_1498(Function<Identifier, class_3581> var1, boolean var2, float var3, float var4, float var5, float var6, float var7) {
      super(var1);
      this.field_7961 = var2;
      this.field_7960 = var3;
      this.field_7965 = var4;
      this.field_7964 = var5;
      this.field_7963 = var6;
      this.field_7962 = var7;
   }

   public class_1498() {
      this(false, 5.0F, 2.0F);
   }

   @Override
   public void method_45499(class_7966 var1, class_7907 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      if (!this.field_33204) {
         this.method_6903().forEach(var8x -> var8x.method_7061(var1, var2, var3, var4, var5, var6, var7, var8));
         this.method_6902().forEach(var8x -> var8x.method_7061(var1, var2, var3, var4, var5, var6, var7, var8));
      } else {
         var1.method_36063();
         if (this.field_7961) {
            float var11 = 1.5F / this.field_7964;
            var1.method_36062(var11, var11, var11);
         }

         var1.method_36065(0.0, (double)(this.field_7960 / 16.0F), (double)(this.field_7965 / 16.0F));
         this.method_6903().forEach(var8x -> var8x.method_7061(var1, var2, var3, var4, var5, var6, var7, var8));
         var1.method_36064();
         var1.method_36063();
         float var12 = 1.0F / this.field_7963;
         var1.method_36062(var12, var12, var12);
         var1.method_36065(0.0, (double)(this.field_7962 / 16.0F), 0.0);
         this.method_6902().forEach(var8x -> var8x.method_7061(var1, var2, var3, var4, var5, var6, var7, var8));
         var1.method_36064();
      }
   }

   public abstract Iterable<class_1549> method_6903();

   public abstract Iterable<class_1549> method_6902();
}
