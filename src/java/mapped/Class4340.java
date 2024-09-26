package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.unmapped.IconPanel;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import net.minecraft.client.Minecraft;
import net.minecraft.util.math.vector.Vector3i;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class4340 extends Class4339 {
   private List<Class4355> field21209 = new ArrayList<Class4355>();
   public final int field21210 = 70;
   public Animation field21211 = new Animation(300, 300);
   public boolean field21212;
   public Class4355 field21213;

   public Class4340(IconPanel var1, String var2, int var3, int var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.field21211.changeDirection(Direction.BACKWARDS);
      this.field20883 = true;
      this.method13300(false);
      this.method13511();
   }

//   @Override
   public void method13511() {
      boolean var3 = false;
   }

   public void method13519(String var1, Vector3i var2, int var3) {
      String var6 = "waypoint x" + var2.getX() + " z" + var2.getZ();
      if (this.buttonList.method13221(var6) == null) {
         Class4355 var7 = new Class4355(
            this, var6, this.xA, this.method13241().get(0).method13241().size() * this.field21210, this.widthA, this.field21210, var1, var2, var3
         );
         var7.field21288 = var7.getYA();
         this.field21209.add(var7);
         this.addToList(var7);
         var7.doThis((var2x, var3x) -> {
            Class4251 var6x = (Class4251)this.getIcoPanel();
            var6x.field20614.method13077(var7.field21292.getX(), var7.field21292.getZ());
         });
         var7.method13036(
            var3x -> {
               Client.getInstance()
                  .getWaypointsManager()
                  .method29993(new Class8351(var7.field21291, var7.field21292.getX(), var7.field21292.getZ(), var7.field21293));
               this.buttonList.method13237(var7);
               this.field21209.remove(var3x);
            }
         );
      }
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
      this.field21209.sort((var0, var1x) -> var0.field21288 < var1x.field21288 + var0.getHeightA() / 2 ? -1 : 1);
      int var5 = 0;
      if (this.field21213 != null && !this.field21213.method13216() && this.field21212) {
         this.field21213.method13608();
         this.field21213 = null;
         this.field21212 = false;
      }

      for (Class4355 var7 : this.field21209) {
         if (!var7.method13216() && var7.field21290.getDirection() == Direction.BACKWARDS) {
            var7.field21288 = var5 + 5;
         } else {
            var7.field21288 = var7.getYA();
         }

         var5 += var7.getHeightA();
      }

      for (Class4355 var11 : this.field21209) {
         if (var11.method13216()) {
            this.field21211.changeDirection(Direction.FORWARDS);
            if (var1 > this.method13271() + 10
               && var1 < this.method13271() + 50
               && var2 < this.method13272() + this.getHeightA() - 10
               && var2 > this.method13272() + this.getHeightA() - 50) {
               this.field21212 = true;
               this.field21213 = var11;
            } else {
               this.field21212 = false;
               this.field21213 = null;
            }
            break;
         }

         if (!var11.method13216() && this.field21211.getDirection() == Direction.FORWARDS) {
            Client.getInstance().getWaypointsManager().method29989().clear();

            for (Class4355 var9 : this.field21209) {
               Client.getInstance()
                  .getWaypointsManager()
                  .method29989()
                  .add(new Class8351(var9.field21291, var9.field21292.getX(), var9.field21292.getZ(), var9.field21293));
            }

            Collections.reverse(Client.getInstance().getWaypointsManager().method29989());
            Client.getInstance().getWaypointsManager().method29991();
         }

         this.field21211.changeDirection(Direction.BACKWARDS);
      }
   }

   @Override
   public void draw(float var1) {
      float var4 = Math.min(1.0F, 0.21F * (60.0F / (float) Minecraft.getFps()));

      for (Class4355 var6 : this.field21209) {
         if (!var6.method13216()) {
            float var7 = (float)(var6.getYA() - var6.field21288) * var4;
            if (Math.round(var7) == 0 && var7 > 0.0F) {
               var7 = 1.0F;
            } else if (Math.round(var7) == 0 && var7 < 0.0F) {
               var7 = -1.0F;
            }

            var6.setYA(Math.round((float)var6.getYA() - var7));
         }
      }

      super.draw(var1);
      int var8 = Math.round(QuadraticEasing.easeInQuad(1.0F - this.field21211.calcPercent(), 0.0F, 1.0F, 1.0F) * 30.0F);
      RenderUtil.method11450(
         (float)(this.xA - var8 + 18),
         (float)(this.heightA - 46),
         22.0F,
         26.0F,
         ResourcesDecrypter.trashcanPNG,
         MultiUtilities.applyAlpha(!this.field21212 ? ClientColors.DEEP_TEAL.getColor : ClientColors.PALE_YELLOW.getColor, this.field21211.calcPercent() * 0.5F),
         false
      );
   }
}
