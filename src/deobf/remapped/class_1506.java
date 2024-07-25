package remapped;

public class class_1506 extends class_4171<class_8031, class_8216<class_8031>> {
   private static final Identifier field_7978 = new Identifier("textures/entity/sheep/sheep_fur.png");
   public class_1286<class_8031> field_7980 = new class_1286<class_8031>();

   public class_1506(class_2514<class_8031, class_8216<class_8031>> var1) {
      super(var1);
   }

   public void method_6908(class_7966 var1, class_2565 var2, int var3, class_8031 var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var4.method_36478() && !var4.method_37109()) {
         float var14;
         float var15;
         float var16;
         if (var4.method_45507() && "jeb_".equals(var4.method_45509().getUnformattedComponentText())) {
            byte var24 = 25;
            int var17 = var4.field_41697 / 25 + var4.method_37145();
            int var18 = class_9077.values().length;
            int var19 = var17 % var18;
            int var20 = (var17 + 1) % var18;
            float var21 = ((float)(var4.field_41697 % 25) + var7) / 25.0F;
            float[] var22 = class_8031.method_36477(class_9077.method_41789(var19));
            float[] var23 = class_8031.method_36477(class_9077.method_41789(var20));
            if (Config.method_14438()) {
               var22 = class_9300.method_42890(class_9077.method_41789(var19), var22);
               var23 = class_9300.method_42890(class_9077.method_41789(var20), var23);
            }

            var14 = var22[0] * (1.0F - var21) + var23[0] * var21;
            var15 = var22[1] * (1.0F - var21) + var23[1] * var21;
            var16 = var22[2] * (1.0F - var21) + var23[2] * var21;
         } else {
            float[] var13 = class_8031.method_36477(var4.method_36474());
            if (Config.method_14438()) {
               var13 = class_9300.method_42890(var4.method_36474(), var13);
            }

            var14 = var13[0];
            var15 = var13[1];
            var16 = var13[2];
         }

         method_19349(this.method_19347(), this.field_7980, field_7978, var1, var2, var3, var4, var5, var6, var8, var9, var10, var7, var14, var15, var16);
      }
   }
}
