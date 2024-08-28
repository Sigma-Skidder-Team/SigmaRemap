package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4307;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.ArrayList;

public class Class4322 extends Class4307 {
   private int field21082 = 0;
   private int field21083 = 0;
   private boolean field21084 = true;
   private float field21085 = 0.0F;
   private float field21086 = 0.0F;
   private Texture field21087;
   private Class4369 field21088;
   private Class4275 field21089;
   private Class4354 field21090;
   private Class4274 field21091;
   private boolean field21092 = false;
   private Animation field21093 = new Animation(250, 250, Direction.BACKWARDS);

   public Class4322() {
      super("Credits");
      this.method13300(false);
      this.field21087 = ResourcesDecrypter.createScaledAndProcessedTexture2("com/mentalfrostbyte/gui/resources/" + ResourcesDecrypter.getPanoramaPNG(), 0.075F, 8);
      this.method13230(
         this.field21088 = new Class4369(
            this,
            "login",
            (this.field20897 - Class4369.field21361) / 2,
            (this.field20898 - Class4369.field21360) / 2,
            Class4369.field21361,
            Class4369.field21360
         )
      );
      this.method13230(
         this.field21089 = new Class4275(
            this,
            "register",
            (this.field20897 - Class4275.field20722) / 2,
            (this.field20898 - Class4275.field20721) / 2,
            Class4275.field20722,
            Class4275.field20721
         )
      );
      this.method13423();
      this.method13230(
         this.field21091 = new Class4274(
            this,
            "continue",
            this.field20897 / 2 - 120,
            this.field20898 / 2 + 120,
            240,
            60,
            new Class6387(Class5628.method17688(Class1979.field12896.field12910, 0.5F)),
            "Continue",
            ResourceRegistry.JelloLightFont25
         )
      );
      this.field21091.method13288(false);
      this.field21088.method13036(var1 -> {
         this.field21092 = true;
         this.field21091.method13288(true);
      });
      this.field21091.method13251((var0, var1) -> Minecraft.getInstance().displayGuiScreen(new Class849()));
   }

   public void method13422() {
      this.field21088.method13288(false);
      this.field21089.method13288(true);
   }

   public void method13423() {
      this.field21088.method13288(true);
      this.field21089.method13288(false);
   }

   public void method13424(String var1, String var2) {
      if (this.field21090 == null) {
         this.method13222(() -> {
            ArrayList<Class9577> var5 = new ArrayList();
            var5.add(new Class9577(Class2189.field14314, var1, 45));
            String[] var6 = Class5628.method17745(var2, 240, ResourceRegistry.JelloLightFont20);

            for (int var7 = 0; var7 < var6.length; var7++) {
               var5.add(new Class9577(Class2189.field14311, var6[var7], var7 != var6.length - 1 ? 14 : 35));
            }

            var5.add(new Class9577(Class2189.field14313, "Ok", 55));
            this.method13233(this.field21090 = new Class4354(this, "modal", true, "", var5.toArray(new Class9577[0])));
            this.field21090.method13604(var1xx -> new Thread(() -> {
                  try {
                     Thread.sleep(114L);
                     this.method13222(() -> {
                        this.method13236(this.field21090);
                        this.field21090 = null;
                     });
                  } catch (InterruptedException var4) {
                     var4.printStackTrace();
                  }
               }).start());
            this.field21090.method13603(true);
         });
      }
   }

   @Override
   public void method13027(float var1) {
      ResourcesDecrypter.cancelIconPNG.bind();
      this.field21085 = Math.max(0.0F, Math.min(this.field21085 + 0.075F, 1.0F));
      if (this.field21092) {
         this.field21093.changeDirection(Direction.FORWARDS);
      }

      this.method13425();
      float var4 = (float)Math.sin((double)Class9782.method38557(this.field21085, 0.0F, 1.0F, 1.0F) * Math.PI / 2.0);
      if (this.field21092) {
         var4 = 1.0F
            - (float)Math.sin((Math.PI / 2) + (double)Class9782.method38558(1.0F - this.field21093.calcPercent(), 0.0F, 1.0F, 1.0F) * (Math.PI / 2)) * 0.2F;
      }

      this.field21088.method13277(var4);
      this.field21088.method13278(var4);
      this.field21089.method13277(var4);
      this.field21089.method13278(var4);
      Rectangle var5 = Class3192.method11413(Class3192.method11414(this.field21088), this.field21088.method13273(), this.field21088.method13275());
      if (this.field21089.method13287()) {
         var5 = Class3192.method11413(Class3192.method11414(this.field21089), this.field21089.method13273(), this.field21089.method13275());
      }

      if ((double)var4 > 0.1) {
         Class3192.method11465(
            (int)((double)this.field20897 - var5.getWidth()) / 2,
            (int)((double)this.field20898 - var5.getHeight()) / 2,
            (int)var5.getWidth(),
            (int)var5.getHeight(),
            Class5628.method17688(Class1979.field12896.field12910, 1.0F - this.field21093.calcPercent())
         );
      }

      if (this.field21092 && this.field21093.calcPercent() == 1.0F) {
         this.field21088.method13288(false);
      }

      if (this.field21092) {
         String var6 = Client.getInstance().getNetworkManager().method30455().field35440;
         String var7 = "Welcome back";
         byte var8 = 100;
         byte var9 = 10;
         int var10 = var8 + Math.max(ResourceRegistry.JelloMediumFont40.method23942(var7), ResourceRegistry.field38860.method23942(var6)) + var9 * 10;
         int var11 = (this.field20897 - var10) / 2;
         int var12 = (this.field20898 - var8 * 2) / 2;
         Class3192.method11426(
            0.0F,
            0.0F,
            (float)this.field20897,
            (float)this.field20898,
            Class5628.method17688(Class1979.field12891.field12910, 0.45F * this.field21093.calcPercent())
         );
         Class3192.method11454(
            (float)(var11 + 20), (float)(var12 + 40), (float)(var8 + 30), (float)(var8 + 30), ResourcesDecrypter.sigmaPNG, this.field21093.calcPercent()
         );
         int var13 = 165;
         int var14 = 54;
         Class3192.method11439(ResourceRegistry.JelloMediumFont40, (float)(var11 + var13), (float)(var12 + var14), var7, Class1979.field12896.field12910);
         Class3192.method11439(ResourceRegistry.field38860, (float)(var11 + var13), (float)(var12 + var14 + 45), var6, Class1979.field12896.field12910);
      }

      GL11.glPushMatrix();
      this.field21091.method13027(this.field21093.calcPercent());
      GL11.glPopMatrix();
      super.method13027(1.0F - this.field21093.calcPercent());
   }

   private void method13425() {
      this.field21086 = Math.max(0.0F, Math.min(this.field21086 + 0.01F, 1.0F));
      int var3 = this.method13309() * -1;
      float var4 = (float)this.method13310() / (float)this.method13267() * -114.0F;
      if (this.field21084) {
         this.field21082 = (int)var4;
         this.field21083 = var3;
         this.field21084 = false;
      }

      float var5 = var4 - (float)this.field21082;
      float var6 = (float)(var3 - this.field21083);
      float var7 = (float)Math.sin((double)Class9782.method38557(this.field21086, 0.0F, 1.0F, 1.0F) * Math.PI / 2.0);
      GL11.glPushMatrix();
      GL11.glTranslatef((float)this.field20897 / 2.0F, (float)this.field20897 / 2.0F, 0.0F);
      GL11.glScalef(1.0F + var7 * 0.2F, 1.0F + var7 * 0.2F, 0.0F);
      GL11.glTranslatef((float)(-this.field20897) / 2.0F, (float)(-this.field20897) / 2.0F, 0.0F);
      Class3192.method11448(
         (float)this.field21083,
         (float)this.field21082,
         (float)(this.method13267() * 2),
         (float)(this.method13269() + 114),
         this.field21087,
         Class5628.method17688(Class1979.field12896.field12910, this.field21085)
      );
      GL11.glPopMatrix();
      float var8 = 0.5F;
      if (var4 != (float)this.field21082) {
         this.field21082 = (int)((float)this.field21082 + var5 * var8);
      }

      if (var3 != this.field21083) {
         this.field21083 = (int)((float)this.field21083 + var6 * var8);
      }
   }

   @Override
   public void method13065(int var1) {
      super.method13065(var1);
      if (var1 == 256) {
         Minecraft.getInstance().displayGuiScreen(new Class849());
      }
   }
}
