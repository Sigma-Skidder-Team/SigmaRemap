package remapped;

import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class BreadcrumbsModule extends Module {
   private List<class_1343> field_13172 = new ArrayList<class_1343>();

   public BreadcrumbsModule() {
      super(Category.RENDER, "Breadcrumbs", "Shows your taken path");
      this.addSetting(new BooleanSetting("Fade Out", "Makes distant breadcrumbs fade out", true));
      this.addSetting(new ColorSetting("Color", "The crumbs color", class_1255.field_6918.field_6917));
   }

   @EventListen
   public void method_12071(class_7767 var1) {
      if (this.method_42015()) {
         if (var1.method_35234() != 0.0 || var1.method_35236() != 0.0 || var1.method_35231() != 0.0) {
            this.field_13172
               .add(new class_1343(client.thePlayer.getPosX(), client.thePlayer.method_37309(), client.thePlayer.getPosZ()));
         }
      }
   }

   @EventListen
   public void method_12070(class_717 var1) {
      if (this.method_42015()) {
         this.field_13172.clear();
      }
   }

   @Override
   public void onDisable() {
      this.field_13172.clear();
   }

   public class_1343 method_12072(class_1343 var1) {
      return var1.method_6215(
         new class_1343(
            -MinecraftClient.getInstance().gameRenderer.method_35949().method_41627().method_61(),
            -MinecraftClient.getInstance().gameRenderer.method_35949().method_41627().method_60(),
            -MinecraftClient.getInstance().gameRenderer.method_35949().method_41627().method_62()
         )
      );
   }

   @EventListen
   public void method_12069(class_3368 var1) {
      if (this.method_42015()) {
         class_1343 var4 = new class_1343(
            client.thePlayer.field_41754
               - (client.thePlayer.field_41754 - client.thePlayer.getPosX()) * (double) client.method_8554(),
            client.thePlayer.field_41713
               - (client.thePlayer.field_41713 - client.thePlayer.method_37309()) * (double) client.method_8554(),
            client.thePlayer.field_41724
               - (client.thePlayer.field_41724 - client.thePlayer.getPosZ()) * (double) client.method_8554()
         );
         GL11.glBlendFunc(770, 771);
         GL11.glEnable(3042);
         GL11.glEnable(2848);
         GL11.glLineWidth(2.0F);
         GL11.glDisable(3553);
         GL11.glDisable(2929);
         GL11.glDepthMask(false);
         GL11.glColor4fv(class_314.method_1412(class_314.method_1444(this.getIntValueByName("Color"), 0.5F)));
         GL11.glBegin(3);

         for (class_1343 var6 : this.field_13172) {
            class_1343 var7 = this.method_12072(var6);
            double var8 = var6.method_6195(var4);
            double var10 = !this.getBooleanValueByName("Fade Out") ? 0.6F : 1.0 - Math.min(1.0, var8 / 14.0);
            if (!(var8 > 24.0)) {
               GL11.glColor4fv(class_314.method_1412(class_314.method_1444(this.getIntValueByName("Color"), (float)var10)));
               GL11.glVertex3d(var7.field_7336, var7.field_7333, var7.field_7334);
            }
         }

         class_1343 var12 = this.method_12072(var4);
         GL11.glVertex3d(var12.field_7336, var12.field_7333, var12.field_7334);
         GL11.glEnd();
         GL11.glEnable(3553);
         GL11.glEnable(2929);
         GL11.glDisable(2848);
         GL11.glDepthMask(true);
         GL11.glDisable(3042);
         GL11.glColor4d(1.0, 1.0, 1.0, 1.0);
      }
   }
}
