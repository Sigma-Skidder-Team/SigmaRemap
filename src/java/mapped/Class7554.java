package mapped;

import com.mentalfrostbyte.jello.module.impl.gui.classic.TabGUI;
import com.mentalfrostbyte.jello.resource.ClientResource;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;

public class Class7554 {
   private static String[] field32393;
   public final ClientResource field32394;
   public final int field32395;
   private boolean field32396 = false;
   public final int field32397 = 25;
   public Animation field32398 = new Animation(300, 300);
   public final int field32399 = 7;

   public Class7554(int var1) {
      this.field32394 = ClassicDecryption.bold16;
      this.field32395 = var1;
   }

   public int method24719() {
      return 106;
   }

   public int method24720() {
      return TabGUI.method15961(this.field32395);
   }

   public int method24721() {
      return 30;
   }

   public void method24722() {
      this.field32396 = true;
      this.field32398.changeDirection(Direction.BACKWARDS);
   }

   public boolean method24723() {
      return this.field32396;
   }

   public boolean method24724() {
      return this.field32396 && this.field32398.calcPercent() == 0.0F;
   }

   public int method24725() {
      return 100;
   }

   public void method24726(float var1) {
      float var4 = Class8056.method27664(this.field32398.calcPercent(), 0.0F, 1.0F, 1.0F);
      if (this.field32398.method25319() == Direction.BACKWARDS) {
         var4 = Class8056.method27663(this.field32398.calcPercent(), 0.0F, 1.0F, 1.0F);
      }

      RenderUtil.method11419((float)this.method24720(), (float)this.method24721(), (float)this.method24719() * var4, (float)this.method24725());
      this.method24718(var1);
      RenderUtil.method11422();
   }

   public void method24718(float var1) {
   }
}
