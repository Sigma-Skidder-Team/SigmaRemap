package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.MathUtils;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import totalcross.json.JSONArray;
import org.lwjgl.opengl.GL11;
import totalcross.json.JSONObject;

public class Class4330 extends Class4305 {
   public Animation animation2 = new Animation(370, 150, Direction.BACKWARDS);

   public Class4330(Class4305 var1, String var2, JSONObject var3) {
      super(var1, var2);
      this.method13268(this.method13258().method13267());
      int var6 = 0;
      if (var3.has("deprecated")) {
         GL11.glTexEnvi(8960, 8704, 260);
      }

      String var7 = var3.getString("title");
      JSONArray var8 = var3.getJSONArray("changes");
      this.method13230(new Class4287(this, "title", 0, var6, 0, 0, Class6387.field27961, var7, ResourceRegistry.JelloMediumFont40));
      var6 += 55;

      for (int var9 = 0; var9 < var8.length(); var9++) {
         String var10 = " - " + var8.getString(var9);
         this.method13230(
            new Class4287(
               this,
               "change" + var9,
               0,
               var6,
               0,
               0,
               new Class6387(0, 0, 0, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.8F)),
               var10,
               ResourceRegistry.JelloLightFont20
            )
         );
         var6 += 22;
      }

      var6 += 75;
      this.method13270(var6);
   }

   @Override
   public void draw(float var1) {
      float var4 = MathUtils.lerp(this.animation2.calcPercent(), 0.17, 1.0, 0.51, 1.0);
      this.drawBackground((int)((1.0F - var4) * 100.0F));
      this.method13225();
      var1 *= this.animation2.calcPercent();
      super.draw(var1);
   }
}
