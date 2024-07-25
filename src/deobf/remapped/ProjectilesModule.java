package remapped;

import java.util.List;
import org.lwjgl.opengl.GL11;

public class ProjectilesModule extends Module {
   public EntityRenderDispatcher field_19184 = client.method_8587();
   public class_1934 field_19188 = new class_1934(0.0F, 0.0F, 0.0F);
   public class_1934 field_19186 = new class_1934(0.0F, 0.0F, 0.0F);
   public class_1934 field_19187 = new class_1934(0.0F, 0.0F, 0.0F);

   public ProjectilesModule() {
      super(Category.RENDER, "Projectiles", "Predict the path of a projectile");
      this.method_42011(false);
   }

   @EventListen
   public void method_18289(class_3368 var1) {
      if (this.method_42015()) {
         if (client.thePlayer.method_26446() != null) {
            class_3336 var4 = class_3336.method_15299(client.thePlayer.method_26446().method_27960());
            if (var4 != null) {
               float var5 = (float)Math.toRadians((double)(client.thePlayer.rotationYaw - 25.0F));
               float var6 = (float)Math.toRadians((double) client.thePlayer.rotationPitch);
               double var7 = 0.2F;
               double var9 = client.thePlayer.field_41712.method_18906() / 2.0;
               double var11 = (double)class_9299.method_42840(var5) * var9;
               double var13 = (double)class_9299.method_42818(var5) * var9;
               double var15 = client.thePlayer.field_41754
                  + (client.thePlayer.getPosX() - client.thePlayer.field_41754) * (double) client.theTimer.field_32600;
               double var17 = client.thePlayer.field_41713
                  + (client.thePlayer.method_37309() - client.thePlayer.field_41713) * (double) client.theTimer.field_32600;
               double var19 = client.thePlayer.field_41724
                  + (client.thePlayer.getPosZ() - client.thePlayer.field_41724) * (double) client.theTimer.field_32600;
               GL11.glPushMatrix();
               GL11.glEnable(2848);
               GL11.glBlendFunc(770, 771);
               GL11.glEnable(3042);
               GL11.glDisable(3553);
               GL11.glDisable(2929);
               GL11.glEnable(32925);
               GL11.glDisable(2896);
               GL11.glShadeModel(7425);
               GL11.glDepthMask(false);
               GL11.glLineWidth(10.0F);
               GL11.glColor4d(0.0, 0.0, 0.0, 0.05F);
               GL11.glAlphaFunc(519, 0.0F);
               GL11.glBegin(3);
               List var21 = var4.method_15304();

               for (int var22 = 0; var22 < var21.size(); var22++) {
                  class_7047 var23 = (class_7047)var21.get(var22);
                  double var24 = var11 - (double)((float)(var22 + 1) / (float)var21.size()) * var11;
                  double var26 = var13 - (double)((float)(var22 + 1) / (float)var21.size()) * var13;
                  double var28 = var7 - (double)((float)(var22 + 1) / (float)var21.size()) * var7;
                  float var30 = (float)Math.min(1, var22);
                  GL11.glColor4f(0.0F, 0.0F, 0.0F, 0.05F * var30);
                  GL11.glVertex3d(
                     var23.method_32381() - client.gameRenderer.method_35949().method_41627().method_61() - var24,
                     var23.method_32375() - client.gameRenderer.method_35949().method_41627().method_60() - var28,
                     var23.method_32382() - client.gameRenderer.method_35949().method_41627().method_62() - var26
                  );
               }

               GL11.glEnd();
               GL11.glLineWidth(2.0F * GUIManager.field_34898);
               GL11.glColor4d(1.0, 1.0, 1.0, 0.75);
               GL11.glBegin(3);

               for (int var38 = 0; var38 < var21.size(); var38++) {
                  class_7047 var39 = (class_7047)var21.get(var38);
                  double var40 = var11 - (double)((float)(var38 + 1) / (float)var21.size()) * var11;
                  double var43 = var13 - (double)((float)(var38 + 1) / (float)var21.size()) * var13;
                  double var46 = var7 - (double)((float)(var38 + 1) / (float)var21.size()) * var7;
                  float var48 = (float)Math.min(1, var38);
                  GL11.glColor4f(1.0F, 1.0F, 1.0F, 0.75F * var48);
                  GL11.glVertex3d(
                     var39.method_32381() - client.gameRenderer.method_35949().method_41627().method_61() - var40,
                     var39.method_32375() - client.gameRenderer.method_35949().method_41627().method_60() - var46,
                     var39.method_32382() - client.gameRenderer.method_35949().method_41627().method_62() - var43
                  );
               }

               GL11.glEnd();
               GL11.glDisable(2929);
               if (var4.field_16463 == null) {
                  if (var4.field_16449 != null) {
                     double var31 = var4.field_16449.field_41754
                        + (var4.field_16449.getPosX() - var4.field_16449.field_41754) * (double) client.theTimer.field_32600
                        - client.gameRenderer.method_35949().method_41627().method_61();
                     double var41 = var4.field_16449.field_41713
                        + (var4.field_16449.method_37309() - var4.field_16449.field_41713) * (double) client.theTimer.field_32600
                        - client.gameRenderer.method_35949().method_41627().method_60();
                     double var44 = var4.field_16449.field_41724
                        + (var4.field_16449.getPosZ() - var4.field_16449.field_41724) * (double) client.theTimer.field_32600
                        - client.gameRenderer.method_35949().method_41627().method_62();
                     double var47 = (double)(var4.field_16449.method_37086() / 2.0F + 0.2F);
                     double var35 = (double)(var4.field_16449.method_37074() + 0.1F);
                     class_8194 var37 = new class_8194(var31 - var47, var41, var44 - var47, var31 + var47, var41 + var35, var44 + var47);
                     class_73.method_83(var37, class_314.method_1444(class_1255.field_6925.field_6917, 0.1F));
                     class_73.method_131(var37, class_314.method_1444(class_1255.field_6925.field_6917, 0.1F));
                  }
               } else {
                  double var49 = var4.field_16461 - client.gameRenderer.method_35949().method_41627().method_61();
                  double var42 = var4.field_16457 - client.gameRenderer.method_35949().method_41627().method_60();
                  double var45 = var4.field_16443 - client.gameRenderer.method_35949().method_41627().method_62();
                  GL11.glPushMatrix();
                  GL11.glTranslated(var49, var42, var45);
                  BlockPos var33 = new BlockPos(0, 0, 0).method_6098(((class_9529)var4.field_16463).method_43956());
                  GL11.glRotatef(
                     45.0F,
                     this.field_19188.method_8982((float)var33.method_12173()),
                     this.field_19188.method_8981((float)(-var33.method_12165())),
                     this.field_19188.method_8983((float)var33.method_12185())
                  );
                  GL11.glRotatef(
                     90.0F,
                     this.field_19186.method_8982((float)var33.method_12185()),
                     this.field_19186.method_8981((float)var33.method_12165()),
                     this.field_19186.method_8983((float)(-var33.method_12173()))
                  );
                  GL11.glTranslatef(-0.5F, 0.0F, -0.5F);
                  class_8194 var34 = new class_8194(0.0, 0.0, 0.0, 1.0, 0.0, 1.0);
                  class_73.method_83(var34, class_314.method_1444(class_1255.field_6922.field_6917, 0.1F));
                  class_73.method_131(var34, class_314.method_1444(class_1255.field_6922.field_6917, 0.1F));
                  GL11.glPopMatrix();
               }

               GL11.glDisable(2896);
               GL11.glColor3f(1.0F, 1.0F, 1.0F);
               GL11.glEnable(2896);
               GL11.glDisable(3042);
               GL11.glEnable(3553);
               GL11.glDisable(32925);
               GL11.glDisable(2848);
               GL11.glPopMatrix();
            }
         }
      }
   }
}
