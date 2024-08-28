package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4307;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.lwjgl.opengl.GL11;

public class Class4325 extends Class4307 {
   private int field21109 = 0;
   private int field21110 = 0;
   private boolean field21111 = true;
   public static Animation field21112 = new Animation(300, 200);
   private Texture field21113;
   private Class4331 field21114;
   public static Screen field21115 = null;

   public Class4325() {
      super("options");
      this.method13300(false);
      int var3 = Math.max((int)((float)this.field20898 * 0.8F), 420);
      int var4 = (int)((float)this.field20897 * 0.8F);
      this.method13230(
         this.field21114 = new Class4331(
            this, "centerBlock", this.method13267() - var4, this.method13269() - var3, var4 - (this.method13267() - var4), var3 - (this.method13269() - var3)
         )
      );
      field21112 = new Animation(300, 100);
   }

   @Override
   public void method13028(int var1, int var2) {
      if (field21112.method25319() == Direction.BACKWARDS && field21112.calcPercent() == 0.0F && field21115 != null) {
         Minecraft.getInstance().displayGuiScreen(field21115);
      }

      super.method13028(var1, var2);
   }

   @Override
   public void method13027(float var1) {
      float var4 = 1.3F - Class9747.method38214(field21112.calcPercent(), 0.0F, 1.0F, 1.0F) * 0.3F;
      float var5 = 1.0F;
      if (field21112.method25319() == Direction.BACKWARDS) {
         var4 = 0.7F + Class9782.method38557(field21112.calcPercent(), 0.0F, 1.0F, 1.0F) * 0.3F;
         var5 = field21112.calcPercent();
      }

      int var6 = Class5628.method17690(-1072689136, Class5628.method17688(Class1979.field12891.field12910, 0.1F), var5);
      int var7 = Class5628.method17690(-804253680, Class5628.method17688(Class1979.field12891.field12910, 0.1F), var5);
      Class3192.method11431(0, 0, this.method13267(), this.method13269(), var6, var7);
      this.method13279(var4, var4);
      this.method13224();
      super.method13027(field21112.calcPercent());
   }

   private void method13437(float var1) {
      int var4 = this.method13309() * -1;
      float var5 = (float)this.method13310() / (float)this.method13267() * -114.0F;
      if (this.field21111) {
         this.field21109 = (int)var5;
         this.field21110 = var4;
         this.field21111 = false;
      }

      float var6 = var5 - (float)this.field21109;
      float var7 = (float)(var4 - this.field21110);
      GL11.glPushMatrix();
      Class3192.method11448(
         (float)this.field21110,
         (float)this.field21109,
         (float)(this.method13267() * 2),
         (float)(this.method13269() + 114),
         this.field21113,
         Class5628.method17688(Class1979.field12896.field12910, var1)
      );
      GL11.glPopMatrix();
      float var8 = 0.5F;
      if (var5 != (float)this.field21109) {
         this.field21109 = (int)((float)this.field21109 + var6 * var8);
      }

      if (var4 != this.field21110) {
         this.field21110 = (int)((float)this.field21110 + var7 * var8);
      }
   }

   public static void method13438(Screen var0) {
      field21115 = var0;
      field21112.changeDirection(Direction.BACKWARDS);
   }

   @Override
   public void method13065(int var1) {
      super.method13065(var1);
      if (var1 == 256) {
         Minecraft.getInstance().displayGuiScreen(null);
      }
   }
}