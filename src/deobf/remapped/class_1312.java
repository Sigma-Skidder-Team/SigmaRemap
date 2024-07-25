package remapped;

public class class_1312 extends class_7067<class_1511> {
   private static final Identifier field_7249 = new Identifier("textures/entity/illager/evoker_fangs.png");
   private final class_8883<class_1511> field_7248 = new class_8883<class_1511>();

   public class_1312(class_6122 var1) {
      super(var1);
   }

   public void method_5978(class_1511 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      float var9 = var1.method_6919(var3);
      if (var9 != 0.0F) {
         float var10 = 2.0F;
         if (var9 > 0.9F) {
            var10 = (float)((double)var10 * ((1.0 - (double)var9) / 0.1F));
         }

         var4.method_36063();
         var4.method_36060(class_2426.field_12074.method_11074(90.0F - var1.field_41701));
         var4.method_36062(-var10, -var10, var10);
         float var11 = 0.03125F;
         var4.method_36065(0.0, -0.626F, 0.0);
         var4.method_36062(0.5F, 0.5F, 0.5F);
         this.field_7248.method_29700(var1, var9, 0.0F, 0.0F, var1.field_41701, var1.field_41755);
         class_7907 var12 = var5.method_11645(this.field_7248.method_45498(field_7249));
         this.field_7248.method_45499(var4, var12, var6, class_5367.field_27381, 1.0F, 1.0F, 1.0F, 1.0F);
         var4.method_36064();
         super.method_32551(var1, var2, var3, var4, var5, var6);
      }
   }

   public Identifier method_5977(class_1511 var1) {
      return field_7249;
   }
}
