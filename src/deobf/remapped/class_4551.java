package remapped;

public class class_4551<T extends class_8145 & class_9378, M extends class_6521<T>> extends class_4171<T, M> {
   private static String[] field_22187;
   private final class_4639 field_22189;
   private final M field_22188;

   public class_4551(class_2514<T, M> var1, M var2, class_4639 var3) {
      super(var1);
      this.field_22188 = (M)var2;
      this.field_22189 = var3;
   }

   @Override
   public void method_19344(class_7966 var1, class_2565 var2, int var3, T var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (((class_9378)var4).method_43357()) {
         this.method_19347().method_29701(this.field_22188);
         this.field_22188.method_29702((T)var4, var5, var6, var7);
         this.field_22188.method_29700((T)var4, var5, var6, var8, var9, var10);
         class_7907 var13 = var2.method_11645(class_3581.method_16755(this.field_22189));
         this.field_22188.method_45499(var1, var13, var3, class_5367.field_27381, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
