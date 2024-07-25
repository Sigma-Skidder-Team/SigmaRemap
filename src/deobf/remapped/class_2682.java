package remapped;

public class class_2682 extends class_4171<class_9408, class_8875<class_9408>> {
   private static final Identifier field_13152 = new Identifier("textures/entity/wolf/wolf_collar.png");

   public class_2682(class_2514<class_9408, class_8875<class_9408>> var1) {
      super(var1);
   }

   public void method_12060(
      class_7966 var1, class_2565 var2, int var3, class_9408 var4, float var5, float var6, float var7, float var8, float var9, float var10
   ) {
      if (var4.method_41215() && !var4.method_37109()) {
         float[] var13 = var4.method_43584().method_41792();
         if (Config.method_14438()) {
            var13 = class_9300.method_42914(var4.method_43584(), var13);
         }

         method_19348(this.method_19347(), field_13152, var1, var2, var3, var4, var13[0], var13[1], var13[2]);
      }
   }
}
