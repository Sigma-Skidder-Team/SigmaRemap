package remapped;

import org.lwjgl.opengl.GL11;

public class class_4033 extends Module {
   public int field_19585 = class_314.method_1444(class_1255.field_6918.field_6917, 0.8F);

   public class_4033() {
      super(Category.RENDER, "Box Outline", "Draws a line arround players");
      this.addSetting(new ColorSetting("Color", "The tracers color", class_1255.field_6918.field_6917));
   }

   @EventListen
   private void method_18562(class_3368 var1) {
      if (this.method_42015()) {
         if (mcInstance.field_9632 != null && mcInstance.field_9601 != null) {
            this.method_18559();
            class_73.method_107();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            this.method_18558(false);
            class_73.method_85(class_3118.field_15504);
            GL11.glLineWidth(3.0F);
            class_3542.method_16442(518, 0.0F);
            class_3542.method_16374();
            this.method_18561();
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.1F);
            GL11.glEnable(3042);
            GL11.glDisable(2896);
            this.method_18558(true);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            class_73.method_145();
            this.method_18560();
         }
      }
   }

   private void method_18561() {
      if (SigmaMainClass.method_3328().method_3312() == class_6015.field_30645) {
         mcInstance.field_9601
            .field_568
            .forEach(
               (var1, var2) -> {
                  boolean var5 = class_314.method_1426(var2) == class_9374.field_47922 && this.method_42017().getBooleanValueByName("Show Players");
                  boolean var6 = !var2.method_37109() || this.method_42017().getBooleanValueByName("Show Invisibles");
                  if (!SigmaMainClass.method_3328().method_3331().method_20495(var2) && var5 && var6 && var2 != mcInstance.field_9632) {
                     double var7 = class_9189.method_42353(var2).field_42648;
                     double var9 = class_9189.method_42353(var2).field_42646;
                     double var11 = class_9189.method_42353(var2).field_42649;
                     GL11.glPushMatrix();
                     GL11.glAlphaFunc(519, 0.0F);
                     GL11.glTranslated(var7, var9, var11);
                     GL11.glTranslatef(0.0F, var2.method_37074(), 0.0F);
                     GL11.glTranslatef(0.0F, 0.1F, 0.0F);
                     GL11.glRotatef(mcInstance.gameRenderer.method_35949().method_41640(), 0.0F, -1.0F, 0.0F);
                     GL11.glScalef(-0.11F, -0.11F, -0.11F);
                     class_73.method_102(
                        -var2.method_37086() * 22.0F,
                        -var2.method_37074() * 5.5F,
                        var2.method_37086() * 44.0F,
                        var2.method_37074() * 21.0F,
                        class_2209.field_11045,
                        this.field_19585,
                        false
                     );
                     class_2209.field_11044.method_38419();
                     GL11.glPopMatrix();
                  }
               }
            );
      }
   }

   private void method_18558(boolean var1) {
      for (Entity var5 : mcInstance.field_9601.method_736()) {
         if (!SigmaMainClass.method_3328().method_3331().method_20495(var5)) {
            boolean var6 = class_314.method_1426(var5) == class_9374.field_47922 && this.method_42017().getBooleanValueByName("Show Players");
            boolean var7 = class_314.method_1426(var5) == class_9374.field_47924 && this.method_42017().getBooleanValueByName("Show Mobs");
            boolean var8 = class_314.method_1426(var5) == class_9374.field_47923 && this.method_42017().getBooleanValueByName("Show Passives");
            boolean var9 = !var5.method_37109() || this.method_42017().getBooleanValueByName("Show Invisibles");
            if ((var7 || var6 || var8) && var9 && var5 != mcInstance.field_9632) {
               GL11.glPushMatrix();
               GL11.glTranslated(
                  -mcInstance.gameRenderer.method_35949().method_41627().method_61(),
                  -mcInstance.gameRenderer.method_35949().method_41627().method_60(),
                  -mcInstance.gameRenderer.method_35949().method_41627().method_62()
               );
               GL11.glDisable(2929);
               GL11.glEnable(3042);
               int var10 = this.getIntValueByName("Color");
               double var11 = (var5.method_37302() - var5.field_41754) * (double) mcInstance.field_9616.field_32600 - (var5.method_37302() - var5.field_41754);
               double var13 = (var5.method_37309() - var5.field_41713) * (double) mcInstance.field_9616.field_32600 - (var5.method_37309() - var5.field_41713);
               double var15 = (var5.method_37156() - var5.field_41724) * (double) mcInstance.field_9616.field_32600 - (var5.method_37156() - var5.field_41724);
               class_8194 var17 = new class_8194(var5.method_37241().method_18918(var11, var13, var15)).method_37547(0.1F);
               if (var1) {
                  class_73.method_130(var17, 3.0F, class_314.method_1444(var10, SigmaMainClass.method_3328().method_3312() != class_6015.field_30645 ? 0.8F : 0.35F));
               } else {
                  class_73.method_83(var17, class_1255.field_6918.field_6917);
               }

               GL11.glDisable(3042);
               GL11.glPopMatrix();
            }
         }
      }
   }

   private void method_18559() {
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
      mcInstance.gameRenderer.field_40623.method_26122();
   }

   private void method_18560() {
      GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
      GL11.glDisable(2896);
      GL11.glEnable(3553);
      GL11.glEnable(2903);
      class_3542.method_16420(33986, 240.0F, 240.0F);
      class_9162.method_42212();
      TextureManager var10000 = mcInstance.method_8577();
      mcInstance.method_8577();
      var10000.method_35674(TextureManager.field_40364);
      mcInstance.gameRenderer.field_40623.method_26126();
   }
}
