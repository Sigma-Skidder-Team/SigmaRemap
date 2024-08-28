package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.Class8603;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import totalcross.json.JSONArray;

public class Class4336 extends Class4305 {
   public Animation field21183 = new Animation(380, 200, Direction.BACKWARDS);
   public Class4339 field21184;
   private static JSONArray field21185;

   public Class4336(Class4305 var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.method13300(false);
      this.field21184 = new Class4339(this, "scroll", 100, 200, var5 - 200, var6 - 200);
      this.field21184.method13518(true);
      this.method13233(this.field21184);
     // new Thread(() -> this.method13490(this.method13491())).start();
   }

   public void method13490(JSONArray var1) {
      if (var1 != null) {
         this.method13258().method13222(new Class576(this, var1));
      }
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      if (this.field21184 != null) {
         if (this.method13295() && this.method13287()) {
            for (Class4305 var9 : this.field21184.method13517().method13241()) {
               Class4330 var10 = (Class4330)var9;
               var10.field21139.changeDirection(Direction.FORWARDS);
               if ((double)var10.field21139.calcPercent() < 0.5) {
                  break;
               }
            }
         } else {
            for (Class4305 var6 : this.field21184.method13517().method13241()) {
               Class4330 var7 = (Class4330)var6;
               var7.field21139.changeDirection(Direction.BACKWARDS);
            }
         }
      }
   }

   @Override
   public void method13027(float var1) {
      this.field21183.changeDirection(!this.method13295() ? Direction.BACKWARDS : Direction.FORWARDS);
      var1 *= this.field21183.calcPercent();
      float var4 = Class8603.method30791(this.field21183.calcPercent(), 0.17, 1.0, 0.51, 1.0);
      if (this.field21183.method25319() == Direction.BACKWARDS) {
         var4 = 1.0F;
      }

      this.method13285((int)(150.0F * (1.0F - var4)));
      this.method13225();
      Class3192.method11439(ResourceRegistry.field38860, 100.0F, 100.0F, "Changelog", Class5628.method17688(Class1979.field12896.field12910, var1));
      ClientResource var10000 = ResourceRegistry.JelloLightFont25;
      StringBuilder var10003 = new StringBuilder().append("You're currently using Sigma ");
      Client.getInstance();
      Class3192.method11439(
         var10000, 100.0F, 150.0F, var10003.append(Client.VERSION).toString(), Class5628.method17688(Class1979.field12896.field12910, 0.6F * var1)
      );
      super.method13027(var1);
   }

   public JSONArray method13491() {
      if (field21185 != null) {
         return field21185;
      } else {
 /*        try {
            HttpGet var3 = new HttpGet("https://jelloconnect.sigmaclient.info/changelog.php?v=" + Client.VERSION);
            CloseableHttpResponse var4 = HttpClients.createDefault().execute(var3);
            HttpEntity var5 = var4.getEntity();
            if (var5 != null) {
               Class2344 var9;
               try (InputStream var6 = var5.getContent()) {
                  String var8 = IOUtils.toString(var6, "UTF-8");
                  var9 = field21185 = new Class2344(var8);
               }

               return var9;
            }
         } catch (IOException var21) {
            var21.printStackTrace();
         }

         return null;*/
         return null;
      }
   }
}
