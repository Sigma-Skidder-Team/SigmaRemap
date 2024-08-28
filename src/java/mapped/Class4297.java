package mapped;

import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.util.timer.Timer;
import org.lwjgl.opengl.GL11;

public class Class4297 extends Class4278 {
   private static String[] field20816;
   public Minecraft field20817 = Minecraft.getInstance();
   public Class8455 field20818;
   public Timer field20819 = new Timer();
   public int field20820;

   public Class4297(Class4305 var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, var4, 100, 100, false);
      this.field20818 = new Class8455(var5, var6);
      this.field20897 = var5 * var7;
      this.field20898 = var6 * var7;
      this.field20820 = var7;
      this.field20819.method27118();
   }

   @Override
   public void method13027(float var1) {
      if (this.field20819.method27121() > 70L) {
         this.field20819.method27120();
         this.field20818.method29728();
      }

      GL11.glPushMatrix();
      GL11.glTranslatef((float)this.field20895, (float)this.field20896, 0.0F);
      Class3192.method11424(0.0F, 0.0F, (float)this.method13267(), (float)this.method13269(), Class1979.field12891.field12910);
      Class3192.method11474(
         (float)(this.field20818.method29736().field41839 * this.field20820),
         (float)(this.field20818.method29736().field41840 * this.field20820),
         (float)this.field20820,
         (float)this.field20820,
         5.0F,
         Class1979.field12903.field12910
      );

      for (Class9108 var5 : this.field20818.method29737().method29655()) {
         Class3192.method11424(
            (float)(var5.field41839 * this.field20820),
            (float)(var5.field41840 * this.field20820),
            (float)this.field20820,
            (float)this.field20820,
            Class1979.field12896.field12910
         );
      }

      GL11.glPopMatrix();
      super.method13027(var1);
   }

   public int method13179() {
      return this.field20818.method29737().method29655().size();
   }

   @Override
   public void method13065(int var1) {
      super.method13065(var1);
      if (var1 != this.field20817.gameSettings.field44632.field13070.field34875) {
         if (var1 != this.field20817.gameSettings.field44634.field13070.field34875) {
            if (var1 != this.field20817.gameSettings.field44633.field13070.field34875) {
               if (var1 == this.field20817.gameSettings.field44635.field13070.field34875) {
                  this.field20818.method29737().method29653(Class2097.field13664);
               }
            } else {
               this.field20818.method29737().method29653(Class2097.field13663);
            }
         } else {
            this.field20818.method29737().method29653(Class2097.field13662);
         }
      } else {
         this.field20818.method29737().method29653(Class2097.field13661);
      }
   }
}
