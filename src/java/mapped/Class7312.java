package mapped;

import com.mentalfrostbyte.jello.util.MultiUtilities;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.timer.TimerUtil;
import com.mentalfrostbyte.jello.util.animation.Direction;
import lol.ClientColors;
import lol.Texture;

public class Class7312 {
   private Texture field31339;
   private int field31340;
   private int field31341;
   private int field31342;
   private int field31343;
   private int field31344;
   private final int field31345;
   private boolean field31346;
   private boolean field31347 = true;
   private Class2311 field31348;
   private Class2188 field31349;
   private TimerUtil field31350 = new TimerUtil();
   private int field31351;
   private int field31352 = 1;
   private Animation field31353;

   public Class7312(Texture var1, int var2, int var3, int var4, Class2188 var5, int var6, int var7) {
      this.field31339 = var1;
      this.field31341 = var2;
      this.field31342 = var3;
      this.field31343 = var4;
      this.field31349 = var5;
      this.field31344 = var6;
      this.field31352 = var7;
      this.field31353 = new Animation(var6, var6, Direction.BACKWARDS);
      this.field31345 = (int)((float)var1.getTextureWidth() / (float)var3);
      this.field31348 = Class2311.field15840;
   }

   public void method23104() {
      this.field31350.start();
      this.field31346 = true;
      if (this.field31353.getDirection() != Direction.BACKWARDS) {
         this.field31353.changeDirection(Direction.BACKWARDS);
      } else {
         this.field31353.changeDirection(Direction.FORWARDS);
      }
   }

   public boolean method23105() {
      return this.field31353.getDirection() != Direction.BACKWARDS;
   }

   public void method23106() {
      this.field31350.stop();
      this.field31346 = false;
   }

   public void method23107() {
      this.field31350.reset();
   }

   public void method23108() {
      long var3 = this.field31350.getElapsedTime();
      if (this.field31346) {
         this.field31351++;
      }

      int var5 = 0;
      switch (Class8593.field38673[this.field31349.ordinal()]) {
         case 1:
            this.field31340 = Math.round((float)(this.field31341 - 1) * this.field31353.calcPercent());
            break;
         case 2:
            if (this.field31351 >= this.field31344) {
               var5 = this.field31352;
               this.field31351 = 0;
            }

            if (this.field31348 == Class2311.field15840) {
               this.field31340 += var5;
               if (!this.field31347 && this.field31340 >= this.field31341 - 1) {
                  this.field31340 = this.field31341 - 1;
                  this.method23106();
                  this.method23107();
               } else if (this.field31340 > this.field31341) {
               }

               this.field31340 = this.field31340 % this.field31341;
            } else {
               this.field31340 -= var5;
               if (!this.field31347 && this.field31340 <= 0) {
                  this.field31340 = 0;
                  this.method23106();
                  this.method23107();
               } else if (this.field31340 < 0) {
                  this.field31340 = this.field31341 - 1;
               }
            }
      }
   }

   public void method23109(int var1, int var2, int var3, int var4, float var5) {
      int var8 = this.field31340 % this.field31345 * this.field31342;
      int var9 = this.field31340 / this.field31345 * this.field31343;
      RenderUtil.method11451(
         (float)var1,
         (float)var2,
         (float)var3,
         (float)var4,
         this.field31339,
         MultiUtilities.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.getColor, var5),
         (float)var8,
         (float)var9,
         (float)this.field31342,
         (float)this.field31343
      );
   }

   public Texture method23110() {
      return this.field31339;
   }

   public int method23111() {
      return this.field31340;
   }

   public void method23112(int var1) {
      if (var1 < 0 || var1 > this.method23115() - 1) {
         throw new IllegalArgumentException("Invalid frame count");
      }
   }

   public int method23113() {
      return this.field31342;
   }

   public int method23114() {
      return this.field31343;
   }

   public int method23115() {
      return this.field31341;
   }

   public int method23116() {
      return this.field31344;
   }

   public void method23117(int var1) {
      this.field31344 = var1;
   }

   public boolean method23118() {
      return this.field31346;
   }

   public boolean method23119() {
      return this.field31347;
   }

   public void method23120(boolean var1) {
      this.field31347 = var1;
   }

   public Class2311 method23121() {
      return this.field31348;
   }

   public void method23122(Class2311 var1) {
      this.field31348 = var1;
   }

   public int method23123() {
      return this.field31352;
   }

   public void method23124(int var1) {
      this.field31352 = var1;
   }
}
