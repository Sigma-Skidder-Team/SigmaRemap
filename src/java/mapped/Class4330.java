package mapped;

import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.Class8603;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.lwjgl.opengl.GL11;

public class Class4330 extends Class4305 {
   public Animation field21139 = new Animation(370, 150, Direction.BACKWARDS);

   public Class4330(Class4305 var1, String var2, JSONObject var3) {
      super(var1, var2);
      this.method13268(this.method13258().method13267());
      int var6 = 0;
      if (var3.has("deprecated")) {
         GL11.glTexEnvi(8960, 8704, 260);
      }

      String var7 = var3.method21773("title");
      Class2344 var8 = var3.method21768("changes");
      this.method13230(new Class4287(this, "title", 0, var6, 0, 0, Class6387.field27961, var7, ResourceRegistry.field38866));
      var6 += 55;

      for (int var9 = 0; var9 < var8.method9134(); var9++) {
         String var10 = " - " + var8.method9131(var9);
         this.method13230(
            new Class4287(
               this,
               "change" + var9,
               0,
               var6,
               0,
               0,
               new Class6387(0, 0, 0, Class5628.method17688(Class1979.field12896.field12910, 0.8F)),
               var10,
               ResourceRegistry.field38854
            )
         );
         var6 += 22;
      }

      var6 += 75;
      this.method13270(var6);
   }

   @Override
   public void method13027(float var1) {
      float var4 = Class8603.method30791(this.field21139.calcPercent(), 0.17, 1.0, 0.51, 1.0);
      this.method13285((int)((1.0F - var4) * 100.0F));
      this.method13225();
      var1 *= this.field21139.calcPercent();
      super.method13027(var1);
   }
}
