package remapped;

import org.lwjgl.opengl.GL11;

public class OutlineESP extends Module {
   public OutlineESP() {
      super(Category.RENDER, "Outline", "Draws a line arround chests");
   }

   @EventListen
   private void method_18485(class_3368 var1) {
      if (this.isEnabled()) {
         if (client.thePlayer != null && client.theWorld != null) {
            this.method_18486();
            FontManager.method_107();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.method_18483(false);
            FontManager.method_85(class_3118.field_15504);
            GL11.glLineWidth(3.0F);
            RenderSystem.alphaFunc(518, 0.0F);
            RenderSystem.enableAlphaTest();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.1F);
            GL11.glEnable(3042);
            GL11.glDisable(2896);
            this.method_18483(true);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            FontManager.method_145();
            this.method_18484();
         }
      }
   }

   private void method_18483(boolean var1) {
      int var4 = class_314.method_1444(this.getModule().getIntValueByName("Regular Color"), 0.7F);
      int var5 = class_314.method_1444(this.getModule().getIntValueByName("Ender Color"), 0.7F);
      int var6 = class_314.method_1444(this.getModule().getIntValueByName("Trapped Color"), 0.7F);

      for (class_3757 var8 : client.theWorld.field_33053) {
         boolean var9 = var8 instanceof class_7099 && !(var8 instanceof class_1962) && this.getModule().getBooleanValueByName("Show Regular Chests");
         boolean var10 = var8 instanceof class_9180 && this.getModule().getBooleanValueByName("Show Ender Chests");
         boolean var11 = var8 instanceof class_1962 && this.getModule().getBooleanValueByName("Show Trapped Chests");
         if (var9 || var10 || var11) {
            double var12 = class_9189.method_42356(var8.method_17399()).field_42648;
            double var14 = class_9189.method_42356(var8.method_17399()).field_42646;
            double var16 = class_9189.method_42356(var8.method_17399()).field_42649;
            GL11.glDisable(2929);
            GL11.glEnable(3042);
            int var18 = var4;
            if (!(var8 instanceof class_9180)) {
               if (var8 instanceof class_1962) {
                  var18 = var6;
               }
            } else {
               var18 = var5;
            }

            class_8194 var19 = new class_8194(
               var8.method_17403().method_8334(client.theWorld, var8.method_17399()).method_19483().method_18918(var12, var14, var16)
            );
            if (var1) {
               FontManager.method_130(var19, 3.0F, var18);
            } else {
               FontManager.method_83(var19, class_1255.field_6918.field_6917);
            }

            GL11.glDisable(3042);
         }
      }
   }

   private void method_18486() {
      GL11.glLineWidth(3.0F);
      GL11.glPointSize(3.0F);
      GL11.glEnable(2832);
      GL11.glEnable(2848);
      GL11.glEnable(3042);
      GL11.glDisable(2896);
      GL11.glEnable(3008);
      GL11.glDisable(3553);
      GL11.glDisable(2903);
      GL11.glDisable(2929);
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      client.gameRenderer.field_40623.method_26122();
   }

   private void method_18484() {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(2896);
      GL11.glEnable(3553);
      GL11.glEnable(2903);
      RenderSystem.method_16420(33986, 240.0F, 240.0F);
      class_9162.method_42212();
      TextureManager var10000 = client.getTextureManager();
      client.getTextureManager();
      var10000.bindTexture(TextureManager.field_40364);
      client.gameRenderer.field_40623.method_26126();
   }
}
