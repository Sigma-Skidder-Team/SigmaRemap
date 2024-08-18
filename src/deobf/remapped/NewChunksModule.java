package remapped;

import java.util.ArrayList;
import java.util.Iterator;
import org.lwjgl.opengl.GL11;

public class NewChunksModule extends Module {
   private ArrayList<class_2034> field_12372 = new ArrayList<class_2034>();
   private ArrayList<class_2034> field_12370 = new ArrayList<class_2034>();

   public NewChunksModule() {
      super(Category.WORLD, "NewChunks", "Detects new chunks on non vanilla servers");
   }

   @EventListen
   private void method_11373(PacketEvent var1) {
      if (this.isEnabled()) {
         if (var1.method_557() instanceof class_4808) {
            class_4808 var4 = (class_4808)var1.method_557();
            class_2034 var5 = new class_2034(var4.method_22149(), var4.method_22151());
            if (!var4.method_22141()) {
               this.field_12370.add(var5);
            }
         }
      }
   }

   @EventListen
   private void method_11374(class_3368 var1) {
      if (this.isEnabled()) {
         for (Iterator var4 = this.field_12370.iterator(); var4.hasNext(); var4.remove()) {
            class_2034 var5 = (class_2034)var4.next();
            if (!this.field_12372.contains(var5)) {
               this.field_12372.add(var5);
            }
         }

         Iterator var18 = this.field_12372.iterator();

         while (var18.hasNext()) {
            class_2034 var6 = (class_2034)var18.next();
            if (var6 != null) {
               double var7 = (double)var6.method_9535() - client.gameRenderer.method_35949().method_41627().method_61();
               double var9 = (double)var6.method_9545() - client.gameRenderer.method_35949().method_41627().method_62();
               double var11 = -client.gameRenderer.method_35949().method_41627().method_60();
               GL11.glDisable(2929);
               class_8194 var13 = new class_8194(var7, var11, var9, var7 + 16.0, var11, var9 + 16.0);
               FontManager.method_83(var13, class_314.method_1444(class_1255.field_6922.field_6917, 0.1F));
               FontManager.method_131(var13, class_314.method_1444(class_1255.field_6922.field_6917, 0.1F));
               GL11.glColor3f(1.0F, 1.0F, 1.0F);
               GL11.glEnable(2929);
               int var14 = client.thePlayer.field_41742 - var6.field_10328;
               int var15 = client.thePlayer.field_41714 - var6.field_10327;
               double var16 = Math.sqrt((double)(var14 * var14 + var15 * var15));
               if (var16 > 30.0) {
                  var18.remove();
               }
            }
         }
      }
   }

   @Override
   public void onDisable() {
      this.field_12370.clear();
      this.field_12372.clear();
   }
}
