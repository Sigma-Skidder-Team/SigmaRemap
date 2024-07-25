package remapped;

import org.lwjgl.opengl.GL11;

public class class_4270 extends Module {
   public class_4270() {
      super(class_5664.field_28709, "Tracers", "Shows players");
      this.method_42010(new class_976("Color", "The tracers color", class_1255.field_6918.field_6917));
   }

   @class_9148
   public void method_19872(class_3368 var1) {
      if (this.method_42015()) {
         GL11.glBlendFunc(770, 771);
         GL11.glAlphaFunc(519, 0.0F);
         GL11.glEnable(3042);
         GL11.glEnable(2848);
         GL11.glDisable(3553);
         GL11.glDisable(2929);
         GL11.glLineWidth(2.0F * class_6763.field_34898);
         GL11.glDepthMask(false);
         GL11.glShadeModel(7425);

         for (Entity var5 : class_314.method_1435()) {
            if (var5 != field_46692.field_9632
               && var5.method_37330()
               && var5.field_41712.method_18906() > 0.8
               && var5.field_41697 > 30
               && !SigmaMainClass.method_3328().method_3331().method_20495(var5)) {
               this.method_19871(var5);
            }
         }

         GL11.glEnable(3553);
         GL11.glEnable(2929);
         GL11.glDisable(2848);
         GL11.glDisable(3042);
         GL11.glDepthMask(true);
      }
   }

   public void method_19871(Entity var1) {
      double var4 = class_9189.method_42353(var1).field_42648;
      double var6 = class_9189.method_42353(var1).field_42646 + (double)(var1.method_37074() / 2.0F);
      double var8 = class_9189.method_42353(var1).field_42649;
      class_1343 var10 = new class_1343(0.0, 0.0, 10.0)
         .method_6212(-((float)Math.toRadians((double) MinecraftClient.getInstance().field_9632.field_41755)))
         .method_6192(-((float)Math.toRadians((double) MinecraftClient.getInstance().field_9632.field_41701)));
      int var11 = this.method_41993("Color");
      GL11.glBegin(1);
      GL11.glColor4fv(class_314.method_1412(class_314.method_1444(var11, 0.45F)));
      GL11.glVertex3d(var10.field_7336, var10.field_7333, var10.field_7334);
      GL11.glColor4fv(class_314.method_1412(class_314.method_1444(var11, 0.0F)));
      GL11.glVertex3d(var4, var6, var8);
      GL11.glEnd();
   }
}
