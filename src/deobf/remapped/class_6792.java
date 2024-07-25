package remapped;

public class class_6792 extends class_7067<class_9552> {
   private static final Identifier field_35020 = new Identifier("textures/entity/shulker/spark.png");
   private static final RenderLayer field_35019 = RenderLayer.method_16705(field_35020);
   private final class_7834<class_9552> field_35021 = new class_7834<class_9552>();

   public class_6792(EntityRenderDispatcher var1) {
      super(var1);
   }

   public int method_31133(class_9552 var1, class_1331 var2) {
      return 15;
   }

   public void method_31135(class_9552 var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      var4.method_36063();
      float var9 = class_9299.method_42833(var1.field_41711, var1.field_41701, var3);
      float var10 = class_9299.method_42795(var3, var1.field_41762, var1.field_41755);
      float var11 = (float)var1.field_41697 + var3;
      var4.method_36065(0.0, 0.15F, 0.0);
      var4.method_36060(class_2426.field_12074.method_11074(class_9299.method_42818(var11 * 0.1F) * 180.0F));
      var4.method_36060(class_2426.field_12080.method_11074(class_9299.method_42840(var11 * 0.1F) * 180.0F));
      var4.method_36060(class_2426.field_12076.method_11074(class_9299.method_42818(var11 * 0.15F) * 360.0F));
      var4.method_36062(-0.5F, -0.5F, 0.5F);
      this.field_35021.method_29700(var1, 0.0F, 0.0F, 0.0F, var9, var10);
      class_7907 var12 = var5.method_11645(this.field_35021.method_45498(field_35020));
      this.field_35021.method_45499(var4, var12, var6, class_5367.field_27381, 1.0F, 1.0F, 1.0F, 1.0F);
      var4.method_36062(1.5F, 1.5F, 1.5F);
      class_7907 var13 = var5.method_11645(field_35019);
      this.field_35021.method_45499(var4, var13, var6, class_5367.field_27381, 1.0F, 1.0F, 1.0F, 0.15F);
      var4.method_36064();
      super.method_32551(var1, var2, var3, var4, var5, var6);
   }

   public Identifier method_31134(class_9552 var1) {
      return field_35020;
   }
}
