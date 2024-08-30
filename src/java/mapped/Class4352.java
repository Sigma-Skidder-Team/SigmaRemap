package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;
import net.minecraft.client.Minecraft;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class4352 extends Class4278 {
   private static String[] field21273;
   private List<Class9625> field21274 = new ArrayList<Class9625>();
   private Class9715 field21275 = new Class9715();
   public Class2422 field21276 = new Class2422();

   public Class4352(Class4305 var1, String var2) {
      super(var1, var2, 0, 0, Minecraft.getInstance().mainWindow.getWidth(), Minecraft.getInstance().mainWindow.getHeight(), false);
      this.method13145(false);
      this.method13296(false);
      this.method13292(false);
      this.method13294(true);
   }

   @Override
   public void method13145(boolean var1) {
      super.method13145(false);
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
   }

   @Override
   public void draw(float var1) {
      this.method13225();
      int var4 = Minecraft.getInstance().mainWindow.getScaledWidth();
      int var5 = Minecraft.getInstance().mainWindow.getScaledHeight();
      int var6 = (int)((float)var4 / 4.0F);
      boolean var7 = false;
      if (this.field21274.size() < var6) {
         this.field21274.add(new Class9625((float)this.field21276.nextInt(var4), (float)this.field21276.nextInt(var5)));
      }

      while (this.field21274.size() > var6) {
         this.field21274.remove(0);
      }

      if (var7) {
         for (int var8 = 0; var8 < this.field21274.size(); var8++) {
            this.field21274.get(var8).field45023 = (float)this.field21276.nextInt(var4);
            this.field21274.get(var8).field45024 = (float)this.field21276.nextInt(var5);
         }
      }

      this.field21275.method38061();
      Iterator var10 = this.field21274.iterator();

      while (var10.hasNext()) {
         Class9625 var9 = (Class9625)var10.next();
         var9.method37521();
         if (!(var9.field45023 < -50.0F)
            && !(var9.field45023 > (float)(var4 + 50))
            && !(var9.field45024 < -50.0F)
            && !(var9.field45024 > (float)(var5 + 50))
            && Class9625.method37522(var9) != 0.0F) {
            var9.method37519(var1);
         } else {
            var10.remove();
         }
      }

      super.draw(var1);
   }
}
