package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import org.lwjgl.opengl.GL11;

import java.util.ArrayList;
import java.util.List;

public class Class4251 extends Class4247 {
   private List<Class4240> field20612 = new ArrayList<Class4240>();
   public int field20613;
   public Class4259 field20614;
   public Class4340 field20615;
   public int field20616;
   private final List<Class9514> field20617 = new ArrayList<Class9514>();

   public Class4251(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20616 = 260;
      this.method13230(this.field20615 = new Class4340(this, "waypointList", 0, 65, this.field20616, this.field20898 - 65));

      for (Class8351 var10 : Client.getInstance().getWaypointsManager().method29989()) {
         this.field20615.method13519(var10.field35889, new Class1998(var10.field35890, 64, var10.field35891), var10.field35892);
      }

      this.method13230(this.field20614 = new Class4259(this, "mapFrame", this.field20616, 0, this.field20897 - this.field20616, this.field20898));
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
   public void method13027(float var1) {
      byte var4 = 14;
      RenderUtil.method11463(
         (float)(this.field20895 + var4 / 2),
         (float)(this.field20896 + var4 / 2),
         (float)(this.field20897 - var4),
         (float)(this.field20898 - var4),
         20.0F,
         var1 * 0.9F
      );
      float var5 = 0.88F;
      if (!Client.getInstance().getGuiManager().method33470()) {
         var5 = 0.95F;
      }

      RenderUtil.method11475(
         (float)this.field20895,
         (float)this.field20896,
         (float)this.field20897,
         (float)this.field20898,
         14.0F,
         Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, var5)
      );
      RenderUtil.method11474(
         (float)(this.field20895 + this.field20616),
         (float)this.field20896,
         (float)(this.field20897 - this.field20616),
         (float)this.field20898,
         14.0F,
         -7687425
      );
      RenderUtil.method11476();
      RenderUtil.method11474(
         (float)this.field20895, (float)this.field20896, (float)this.field20897, (float)this.field20898, 14.0F, ClientColors.LIGHT_GREYISH_BLUE.getColor
      );
      RenderUtil.method11477(Class2329.field15940);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)this.method13263(), (float)this.method13265(), 0.0F);
      this.field20615.method13027(var1);
      GL11.glPopMatrix();
      GL11.glPushMatrix();
      GL11.glTranslatef((float)this.method13263(), (float)this.method13265(), 0.0F);
      this.field20614.method13027(var1);
      GL11.glPopMatrix();
      RenderUtil.method11478();
      RenderUtil.method11424(
         (float)(this.field20895 + this.field20616),
         (float)(this.field20896 + 0),
         1.0F,
         (float)this.field20898,
         Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 0.14F)
      );
      int var6 = Class5628.method17688(Class5628.method17691(-7687425, 0.2F), 0.8F);
      var6 = Class5628.method17688(ClientColors.DEEP_TEAL.getColor, 0.6F);
      RenderUtil.method11439(ResourceRegistry.JelloLightFont25, (float)(this.field20895 + 30), (float)(this.field20896 + 25), "Waypoints", var6);
      RenderUtil.method11439(
         ResourceRegistry.JelloMediumFont40,
         (float)this.field20895,
         (float)((this.field20892.method13269() - this.field20898) / 2 - 70),
         "Jello Maps",
         ClientColors.LIGHT_GREYISH_BLUE.getColor
      );
      String var7 = Client.getInstance().getWaypointsManager().method29998().replace("/", " - ");
      RenderUtil.method11439(
         ResourceRegistry.field38859,
         (float)(this.field20895 + this.field20897 - ResourceRegistry.field38859.method23942(var7) - 10),
         (float)((this.field20892.method13269() - this.field20898) / 2 - 62),
         var7,
         Class5628.method17688(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.5F)
      );
   }

   public final void method13043(Class9514 var1) {
      this.field20617.add(var1);
   }

   public final void method13044(int var1, int var2, Class2020 var3) {
      for (Class9514 var7 : this.field20617) {
         var7.method36764(this, var1, var2, var3);
      }
   }
}
