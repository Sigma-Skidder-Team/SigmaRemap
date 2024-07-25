package remapped;

public class class_6835 extends class_4171<class_5583, class_6399<class_5583>> {
   private static final Identifier field_35241 = new Identifier("textures/entity/cat/cat_collar.png");
   private final class_6399<class_5583> field_35240 = new class_6399<class_5583>(0.01F);

   public class_6835(class_2514<class_5583, class_6399<class_5583>> var1) {
      super(var1);
   }

   public void method_31347(
      class_7966 var1, class_2565 var2, int var3, class_5583 var4, float var5, float var6, float var7, float var8, float var9, float var10
   ) {
      if (var4.method_41215()) {
         float[] var13 = var4.method_25360().method_41792();
         method_19349(
            this.method_19347(), this.field_35240, field_35241, var1, var2, var3, var4, var5, var6, var8, var9, var10, var7, var13[0], var13[1], var13[2]
         );
      }
   }
}
