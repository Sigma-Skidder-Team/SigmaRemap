package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.util.ColorUtils;
import net.minecraft.util.math.vector.Vector3i;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class Class4251 extends Class4247 {
   private List<ButtonPanel> field20612 = new ArrayList<ButtonPanel>();
   public int field20613;
   public Class4259 field20614;
   public Class4340 field20615;
   public int field20616;
   private final List<Class9514> field20617 = new ArrayList<Class9514>();

   public Class4251(IconPanel var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20616 = 260;
      this.addToList(this.field20615 = new Class4340(this, "waypointList", 0, 65, this.field20616, this.height - 65));

      for (Class8351 var10 : Client.getInstance().getWaypointsManager().method29989()) {
         this.field20615.method13519(var10.field35889, new Vector3i(var10.field35890, 64, var10.field35891), var10.field35892);
      }

      this.addToList(this.field20614 = new Class4259(this, "mapFrame", this.field20616, 0, this.width - this.field20616, this.height));
      this.method13300(false);
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      if (this.field20909) {
         Client.getInstance().getWaypointsManager().field36375.clear();
      }
   }

   @Override
   public void draw(float var1) {
      byte var4 = 14;
      RenderUtil.drawRoundedRect(
         (float)(this.x + var4 / 2),
         (float)(this.y + var4 / 2),
         (float)(this.width - var4),
         (float)(this.height - var4),
         20.0F,
         var1 * 0.9F
      );
      float var5 = 0.88F;
      if (!Client.getInstance().getGuiManager().method33470()) {
         var5 = 0.95F;
      }

      RenderUtil.drawRect(
         (float)this.x,
         (float)this.y,
         (float)this.width,
         (float)this.height,
         14.0F,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var5)
      );
      RenderUtil.method11474(
         (float)(this.x + this.field20616),
         (float)this.y,
         (float)(this.width - this.field20616),
         (float)this.height,
         14.0F,
         -7687425
      );
      RenderUtil.method11476();
      RenderUtil.method11474(
         (float)this.x, (float)this.y, (float)this.width, (float)this.height, 14.0F, ClientColors.LIGHT_GREYISH_BLUE.getColor
      );
      RenderUtil.method11477(Class2329.field15940);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)this.getX(), (float)this.getY(), 0.0F);
      this.field20615.draw(var1);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glTranslatef((float)this.getX(), (float)this.getY(), 0.0F);
      this.field20614.draw(var1);
      GL11.glPopMatrix();
      RenderUtil.method11478();
      RenderUtil.method11424(
         (float)(this.x + this.field20616),
         (float)(this.y + 0),
         1.0F,
         (float)this.height,
         ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.14F)
      );
      int var6 = ColorUtils.applyAlpha(ColorUtils.method17691(-7687425, 0.2F), 0.8F);
      var6 = ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.getColor, 0.6F);
      RenderUtil.drawString(ResourceRegistry.JelloLightFont25, (float)(this.x + 30), (float)(this.y + 25), "Waypoints", var6);
      RenderUtil.drawString(
         ResourceRegistry.JelloMediumFont40,
         (float)this.x,
         (float)((this.iconPanel.getHeight() - this.height) / 2 - 70),
         "Jello Maps",
         ClientColors.LIGHT_GREYISH_BLUE.getColor
      );
      String var7 = Client.getInstance().getWaypointsManager().method29998().replace("/", " - ");
      RenderUtil.drawString(
         ResourceRegistry.JelloLightFont24,
         (float)(this.x + this.width - ResourceRegistry.JelloLightFont24.method23942(var7) - 10),
         (float)((this.iconPanel.getHeight() - this.height) / 2 - 62),
         var7,
         ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.5F)
      );
   }

   public final void method13043(Class9514 var1) {
      this.field20617.add(var1);
   }

   public final void method13044(int var1, int var2, Vector3m var3) {
      for (Class9514 var7 : this.field20617) {
         var7.method36764(this, var1, var2, var3);
      }
   }
}
