package remapped;

import org.lwjgl.opengl.GL11;

public class BoxESP extends Module {
   public BoxESP() {
      super(Category.RENDER, "Box", "Draws a box where chests are");
   }

   @EventListen
   private void method_17266(class_3368 var1) {
      if (this.method_42015()) {
         if (client.thePlayer != null && client.theWorld != null) {
            this.method_17267();
            this.method_17268();
            this.method_17265();
         }
      }
   }

   private void method_17268() {
      int var3 = class_314.method_1444(this.getModule().getIntValueByName("Regular Color"), 0.14F);
      int var4 = class_314.method_1444(this.getModule().getIntValueByName("Ender Color"), 0.14F);
      int var5 = class_314.method_1444(this.getModule().getIntValueByName("Trapped Color"), 0.14F);

      for (class_3757 var7 : client.theWorld.field_33053) {
         boolean var8 = var7 instanceof class_7099 && !(var7 instanceof class_1962) && this.getModule().getBooleanValueByName("Show Regular Chests");
         boolean var9 = var7 instanceof class_9180 && this.getModule().getBooleanValueByName("Show Ender Chests");
         boolean var10 = var7 instanceof class_1962 && this.getModule().getBooleanValueByName("Show Trapped Chests");
         if (var8 || var9 || var10) {
            double var11 = class_9189.method_42356(var7.method_17399()).field_42648;
            double var13 = class_9189.method_42356(var7.method_17399()).field_42646;
            double var15 = class_9189.method_42356(var7.method_17399()).field_42649;
            GL11.glDisable(2929);
            GL11.glEnable(3042);
            int var17 = var3;
            if (!(var7 instanceof class_9180)) {
               if (var7 instanceof class_1962) {
                  var17 = var5;
               }
            } else {
               var17 = var4;
            }

            class_8194 var18 = new class_8194(
               var7.method_17403().method_8334(client.theWorld, var7.method_17399()).method_19483().method_18918(var11, var13, var15)
            );
            GL11.glAlphaFunc(519, 0.0F);
            class_73.method_83(var18, var17);
            class_73.method_130(var18, 2.0F, var17);
            GL11.glDisable(3042);
         }
      }
   }

   private void method_17267() {
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

   private void method_17265() {
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
