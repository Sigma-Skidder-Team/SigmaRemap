package remapped;

public abstract class class_4556<T extends class_8145 & class_7187, M extends class_6521<T>> extends class_4171<T, M> {
   public class_4556(class_2514<T, M> var1) {
      super(var1);
   }

   @Override
   public void method_19344(class_7966 var1, class_2565 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (((class_7187)var4).method_32928()) {
         float var13 = (float)var4.field_41697 + var7;
         class_6521 var14 = this.method_21122();
         var14.method_29702(var4, var5, var6, var7);
         this.method_19347().method_29701(var14);
         class_7907 var15 = var2.method_11645(class_3581.method_16738(this.method_21124(), this.method_21123(var13), var13 * 0.01F));
         var14.method_29700(var4, var5, var6, var8, var9, var10);
         var14.method_45499(var1, var15, var3, class_5367.field_27381, 0.5F, 0.5F, 0.5F, 1.0F);
      }
   }

   public abstract float method_21123(float var1);

   public abstract Identifier method_21124();

   public abstract class_6521<T> method_21122();
}
