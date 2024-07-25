package remapped;

import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class BasicClickTP extends Module {
   private List<class_4714> field_32569 = new ArrayList<class_4714>();
   private Timer field_32570 = new Timer();

   public BasicClickTP() {
      super(Category.MOVEMENT, "Basic", "Basic click tp");
   }

   @Override
   public void onEnable() {
      this.field_32569.clear();
   }

   @Override
   public void onDisable() {
      this.field_32569.clear();
   }

   @EventListen
   private void method_29151(class_8706 var1) {
      if (this.method_42015() && (client.thePlayer.isSneaking() || !this.getModule().getBooleanValueByName("Sneak"))) {
         if (var1.method_40004() == class_3237.field_16101) {
            class_9529 var4 = class_7494.method_34079(
               client.thePlayer.rotationYaw, client.thePlayer.rotationPitch, this.getModule().getFloatValueByName("Maximum range")
            );
            BlockPos var5 = null;
            if (var4 != null) {
               var5 = var4.method_43955();
            }

            if (var5 == null) {
               return;
            }

            double var6 = (double)var5.method_12173() + 0.5;
            double var8 = (double)(var5.method_12165() + 1);
            double var10 = (double)var5.method_12185() + 0.5;
            double var12 = client.thePlayer.getPosX() - var6;
            double var14 = client.thePlayer.getPosZ() - var10;
            double var16 = client.thePlayer.method_37309() - var8;
            double var18 = var12 * var12 + var14 * var14;
            double var20 = Math.sqrt(var18) + Math.abs(var16);
            double var22 = var20 / 8.0;
            double var24 = var12 / var22;
            double var26 = var14 / var22;
            double var28 = var16 / var22;
            double var30 = client.thePlayer.getPosX();
            double var32 = client.thePlayer.getPosZ();
            double var34 = client.thePlayer.method_37309();
            this.field_32569.clear();
            this.field_32569.add(new class_4714(var30, var34, var32));

            for (int var36 = 0; (double)var36 < var22 - 1.0; var36++) {
               var30 -= var24;
               var32 -= var26;
               var34 -= var28;
               double var37 = 0.3;
               Box var39 = new Box(var30 - var37, var34, var32 - var37, var30 + var37, var34 + 1.9, var32 + var37);
               if (client.theWorld.method_6680(client.thePlayer, var39).count() == 0L) {
                  client.method_8614().sendPacket(new class_9515(var30, var34, var32, true));
               }

               this.field_32569.add(new class_4714(var30, var34, var32));
            }

            this.field_32569.add(new class_4714(var6, var8, var10));
            client.thePlayer.method_37256(var6, var8, var10);
            this.field_32570.method_14773();
            this.field_32570.method_14776();
            if (this.getModule().getBooleanValueByName("Auto Disable")) {
               this.getModule().method_41999();
            }
         }
      }
   }

   @EventListen
   public void method_29150(class_3368 var1) {
      if (this.method_42015() && this.field_32569 != null && this.field_32569.size() != 0) {
         if (this.field_32570.method_14772() > 4000L) {
            this.field_32570.method_14774();
            this.field_32570.method_14773();
            this.field_32569.clear();
         }

         GL11.glPushMatrix();
         GL11.glEnable(2848);
         GL11.glBlendFunc(770, 771);
         GL11.glEnable(3042);
         GL11.glDisable(3553);
         GL11.glDisable(2929);
         GL11.glEnable(32925);
         GL11.glLineWidth(1.4F);
         GL11.glColor4d(1.0, 1.0, 1.0, 1.0);
         GL11.glBegin(3);

         for (class_4714 var5 : this.field_32569) {
            GL11.glVertex3d(
               var5.method_21803() - client.gameRenderer.method_35949().method_41627().method_61(),
               var5.method_21801() - client.gameRenderer.method_35949().method_41627().method_60(),
               var5.method_21799() - client.gameRenderer.method_35949().method_41627().method_62()
            );
         }

         GL11.glEnd();

         for (class_4714 var12 : this.field_32569) {
            double var6 = var12.method_21803() - client.gameRenderer.method_35949().method_41627().method_61();
            double var8 = var12.method_21799() - client.gameRenderer.method_35949().method_41627().method_62();
            class_8194 var10 = new class_8194(
               var6 - 0.3F,
               var12.method_21801() - client.gameRenderer.method_35949().method_41627().method_60(),
               var8 - 0.3F,
               var6 + 0.3F,
               var12.method_21801() - client.gameRenderer.method_35949().method_41627().method_60() + 1.6F,
               var8 + 0.3F
            );
            class_73.method_83(var10, class_314.method_1444(class_1255.field_6922.field_6917, 0.2F));
         }

         GL11.glPushMatrix();
         GL11.glTranslated(
            client.gameRenderer.method_35949().method_41627().method_61(),
            client.gameRenderer.method_35949().method_41627().method_60(),
            client.gameRenderer.method_35949().method_41627().method_62()
         );
         GL11.glPopMatrix();
         GL11.glDisable(3042);
         GL11.glEnable(3553);
         GL11.glEnable(2929);
         GL11.glDisable(32925);
         GL11.glDisable(2848);
         GL11.glPopMatrix();
      }
   }
}
