package remapped;

public class class_6418 extends class_4171<class_9310, class_9166<class_9310>> {
   private static final Identifier[] field_32771 = new Identifier[]{
      new Identifier("textures/entity/llama/decor/white.png"),
      new Identifier("textures/entity/llama/decor/orange.png"),
      new Identifier("textures/entity/llama/decor/magenta.png"),
      new Identifier("textures/entity/llama/decor/light_blue.png"),
      new Identifier("textures/entity/llama/decor/yellow.png"),
      new Identifier("textures/entity/llama/decor/lime.png"),
      new Identifier("textures/entity/llama/decor/pink.png"),
      new Identifier("textures/entity/llama/decor/gray.png"),
      new Identifier("textures/entity/llama/decor/light_gray.png"),
      new Identifier("textures/entity/llama/decor/cyan.png"),
      new Identifier("textures/entity/llama/decor/purple.png"),
      new Identifier("textures/entity/llama/decor/blue.png"),
      new Identifier("textures/entity/llama/decor/brown.png"),
      new Identifier("textures/entity/llama/decor/green.png"),
      new Identifier("textures/entity/llama/decor/red.png"),
      new Identifier("textures/entity/llama/decor/black.png")
   };
   private static final Identifier field_32773 = new Identifier("textures/entity/llama/decor/trader_llama.png");
   private final class_9166<class_9310> field_32774 = new class_9166<class_9310>(0.5F);

   public class_6418(class_2514<class_9310, class_9166<class_9310>> var1) {
      super(var1);
   }

   public void method_29335(
      class_7966 var1, class_2565 var2, int var3, class_9310 var4, float var5, float var6, float var7, float var8, float var9, float var10
   ) {
      class_9077 var13 = var4.method_42989();
      Identifier var14;
      if (var13 == null) {
         if (!var4.method_42975()) {
            return;
         }

         var14 = field_32773;
      } else {
         var14 = field_32771[var13.method_41794()];
      }

      this.method_19347().method_29701(this.field_32774);
      this.field_32774.method_42257(var4, var5, var6, var8, var9, var10);
      class_7907 var15 = var2.method_11645(RenderLayer.method_16755(var14));
      this.field_32774.method_45499(var1, var15, var3, class_5367.field_27381, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
