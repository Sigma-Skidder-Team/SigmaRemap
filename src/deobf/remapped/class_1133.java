package remapped;

public class class_1133 extends class_7067<BoatEntity> {
   private static final Identifier[] field_6450 = new Identifier[]{
      new Identifier("textures/entity/boat/oak.png"),
      new Identifier("textures/entity/boat/spruce.png"),
      new Identifier("textures/entity/boat/birch.png"),
      new Identifier("textures/entity/boat/jungle.png"),
      new Identifier("textures/entity/boat/acacia.png"),
      new Identifier("textures/entity/boat/dark_oak.png")
   };
   public final class_4803 field_6452 = new class_4803();

   public class_1133(EntityRenderDispatcher var1) {
      super(var1);
      this.field_36492 = 0.8F;
   }

   public void method_4978(BoatEntity var1, float var2, float var3, class_7966 var4, class_2565 var5, int var6) {
      var4.method_36063();
      var4.method_36065(0.0, 0.375, 0.0);
      var4.method_36060(class_2426.field_12074.method_11074(180.0F - var2));
      float var9 = (float)var1.method_42110() - var3;
      float var10 = var1.method_42109() - var3;
      if (var10 < 0.0F) {
         var10 = 0.0F;
      }

      if (var9 > 0.0F) {
         var4.method_36060(class_2426.field_12080.method_11074(class_9299.method_42818(var9) * var9 * var10 / 10.0F * (float)var1.method_42094()));
      }

      float var11 = var1.method_42086(var3);
      if (!class_9299.method_42856(var11, 0.0F)) {
         var4.method_36060(new Quaternion(new class_2426(1.0F, 0.0F, 1.0F), var1.method_42086(var3), true));
      }

      var4.method_36062(-1.0F, -1.0F, 1.0F);
      var4.method_36060(class_2426.field_12074.method_11074(90.0F));
      this.field_6452.method_22131(var1, var3, 0.0F, -0.1F, 0.0F, 0.0F);
      class_7907 var12 = var5.method_11645(this.field_6452.method_45498(this.method_4977(var1)));
      this.field_6452.method_45499(var4, var12, var6, class_5367.field_27381, 1.0F, 1.0F, 1.0F, 1.0F);
      if (!var1.method_37179()) {
         class_7907 var13 = var5.method_11645(RenderLayer.method_16728());
         this.field_6452.method_22130().method_7060(var4, var13, var6, class_5367.field_27381);
      }

      var4.method_36064();
      super.method_32551(var1, var2, var3, var4, var5, var6);
   }

   public Identifier method_4977(BoatEntity var1) {
      return field_6450[var1.method_42112().ordinal()];
   }
}
