package remapped;

import java.util.List;
import org.lwjgl.opengl.GL11;

public class class_6370 extends Module {
   public int field_32565;
   private List<class_8670> field_32567;
   private class_7047 field_32561;
   public int field_32559;
   public int field_32560;
   public int field_32563;
   public class_9529 field_32562;
   public Thread field_32558;
   public class_9806 field_32566;

   public class_6370() {
      super(Category.RENDER, "PathFinder", "You know what it is");
   }

   @EventListen
   public void method_29149(class_5596 var1) {
      this.field_32562 = class_7494.method_34079(mcInstance.field_9632.field_41701, mcInstance.field_9632.field_41755, 200.0F);
      if (this.field_32558 != null && this.field_32566 != null) {
         SigmaMainClass.getInstance()
            .getNotificationManager()
            .pushNotification(new Notification("AutoMiner", "Computing... (" + this.field_32566.field_49718 + ")", NotificationIcons.field_10993));
      }
   }

   @EventListen
   public void method_29148(class_3368 var1) {
      if (this.method_42015()) {
         if (this.field_32562 != null) {
            int var4 = class_314.method_1444(class_1255.field_6928.field_6917, 0.14F);
            GL11.glPushMatrix();
            GL11.glDisable(2929);
            class_1331 var5 = this.field_32562.method_43955();
            double var6 = (double)var5.method_12173() - mcInstance.gameRenderer.method_35949().method_41627().method_61();
            double var8 = (double)var5.method_12165() - mcInstance.gameRenderer.method_35949().method_41627().method_60();
            double var10 = (double)var5.method_12185() - mcInstance.gameRenderer.method_35949().method_41627().method_62();
            class_8194 var12 = new class_8194(var6, var8, var10, var6 + 1.0, var8 + 1.0, var10 + 1.0);
            class_73.method_83(var12, var4);
            GL11.glEnable(2929);
            GL11.glPopMatrix();
         }
      }
   }
}