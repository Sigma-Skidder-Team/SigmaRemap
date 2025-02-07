package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;
import com.mentalfrostbyte.jello.util.MathUtils;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.render.animation.Animation;
import com.mentalfrostbyte.jello.util.ClientColors;
import totalcross.json.JSONArray;
import org.lwjgl.opengl.GL11;
import totalcross.json.JSONException;
import totalcross.json.JSONObject;

public class Class4330 extends CustomGuiScreen {
   public Animation animation2 = new Animation(370, 150, Animation.Direction.BACKWARDS);

   public Class4330(CustomGuiScreen var1, String var2, JSONObject var3) throws JSONException {
      super(var1, var2);
      this.setWidthA(this.getScreen().getWidthA());
      int var6 = 0;
      if (var3.has("deprecated")) {
         GL11.glTexEnvi(8960, 8704, 260);
      }

      String var7 = var3.getString("title");
      JSONArray var8 = var3.getJSONArray("changes");
      this.addToList(new UITextDisplay(this, "title", 0, var6, 0, 0, ColorHelper.field27961, var7,
            ResourceRegistry.JelloMediumFont40));
      var6 += 55;

      for (int var9 = 0; var9 < var8.length(); var9++) {
         String var10 = " - " + var8.getString(var9);
         this.addToList(
               new UITextDisplay(
                     this,
                     "change" + var9,
                     0,
                     var6,
                     0,
                     0,
                     new ColorHelper(0, 0, 0,
                           MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor(), 0.8F)),
                     var10,
                     ResourceRegistry.JelloLightFont20));
         var6 += 22;
      }

      var6 += 75;
      this.setHeightA(var6);
   }

   @Override
   public void draw(float partialTicks) {
      float var4 = MathUtils.lerp(this.animation2.calcPercent(), 0.17, 1.0, 0.51, 1.0);
      this.drawBackground((int) ((1.0F - var4) * 100.0F));
      this.method13225();
      partialTicks *= this.animation2.calcPercent();
      super.draw(partialTicks);
   }
}
