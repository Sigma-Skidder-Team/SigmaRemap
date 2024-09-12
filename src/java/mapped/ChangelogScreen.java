package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.unmapped.MathUtils;
import com.mentalfrostbyte.jello.util.ColorUtils;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import totalcross.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;

public class ChangelogScreen extends IconPanel {
   public Animation animation = new Animation(380, 200, Direction.BACKWARDS);
   public Class4339 field21184;
   private static JSONArray cachedChangelog;

   public ChangelogScreen(IconPanel var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.method13300(false);
      this.field21184 = new Class4339(this, "scroll", 100, 200, var5 - 200, var6 - 200);
      this.field21184.method13518(true);
      this.method13233(this.field21184);
      new Thread(() -> this.method13490(this.getChangelog())).start();
   }

   public void method13490(JSONArray var1) {
      if (var1 != null) {
         this.getIconPanel().method13222(new Class576(this, var1));
      }
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      if (this.field21184 != null) {
         if (this.isHovered() && this.method13287()) {
            for (IconPanel var9 : this.field21184.method13517().method13241()) {
               Class4330 var10 = (Class4330)var9;
               var10.animation2.changeDirection(Direction.FORWARDS);
               if ((double)var10.animation2.calcPercent() < 0.5) {
                  break;
               }
            }
         } else {
            for (IconPanel var6 : this.field21184.method13517().method13241()) {
               Class4330 var7 = (Class4330)var6;
               var7.animation2.changeDirection(Direction.BACKWARDS);
            }
         }
      }
   }

   @Override
   public void draw(float alpha) {
      this.animation.changeDirection(!this.isHovered() ? Direction.BACKWARDS : Direction.FORWARDS);
      alpha *= this.animation.calcPercent();

      float fadeFactor = MathUtils.lerp(this.animation.calcPercent(), 0.17f, 1.0f, 0.51f, 1.0f);

      if (this.animation.getDirection() == Direction.BACKWARDS) {
         fadeFactor = 1.0f;
      }

      this.drawBackground((int)(150.0f * (1.0f - fadeFactor)));
      this.method13225();
      RenderUtil.drawString(ResourceRegistry.JelloLightFont36, 100.0F, 100.0F, "Changelog", ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, alpha));
      ClientResource jelloLightFont25 = ResourceRegistry.JelloLightFont25;
      String versionText = "You're currently using Sigma " + Client.VERSION;
      RenderUtil.drawString(
              jelloLightFont25,
              100.0f, 150.0f,
              versionText,
              ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, 0.6f * alpha)
      );
      super.draw(alpha);
   }

   public JSONArray getChangelog() {
      if (cachedChangelog != null) {
         return cachedChangelog;
      } else {
         try {
            HttpGet request = new HttpGet("https://sigma-web-alpha.vercel.app/api/changelog.php");
            try (CloseableHttpResponse response = HttpClients.createDefault().execute(request)) {
               HttpEntity entity = response.getEntity();
               if (entity != null) {
                  try (InputStream inputStream = entity.getContent()) {
                     String jsonString = IOUtils.toString(inputStream, "UTF-8");
                     cachedChangelog = new JSONArray(jsonString);
                  }
               }
            }
         } catch (IOException e) {
            throw new RuntimeException(e);
         }
         return cachedChangelog;
      }
   }
}
