package mapped;

import com.mentalfrostbyte.jello.unmapped.CustomGuiScreen;

import java.awt.Color;

public class Class4256 extends Class4247 {
   public int field20635;
   public Class4360 field20636;
   public Class4360 field20637;
   public Class4360 field20638;

   public Class4256(CustomGuiScreen var1, String var2, int var3, int var4, int var5, int var6, int var7) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field20635 = var7;
      Color var10 = new Color(var7);
      float[] var11 = Color.RGBtoHSB(var10.getRed(), var10.getGreen(), var10.getBlue(), null);
      this.addToList(this.field20636 = new Class4360(this, "redSlider", 14, 10, var5 - 28, 8, var7, var10.getRed()));
      this.addToList(this.field20637 = new Class4360(this, "greenSlider", 14, 20, var5 - 28, 8, var7, var10.getGreen()));
      this.addToList(this.field20638 = new Class4360(this, "blueSlider", 14, 30, var5 - 28, 8, var7, var10.getBlue()));
      this.field20636.method13036(var1x -> this.method13060());
      this.field20637.method13036(var1x -> this.method13060());
      this.field20638.method13036(var1x -> this.method13060());
   }

   public void method13058(int var1) {
      if (var1 != this.field20635) {
         Color var4 = new Color(var1);
         this.field20636.method13630(var1);
         this.field20637.method13630(var1);
         this.field20638.method13630(var1);
         this.field20636.method13632(var4.getRed());
         this.field20637.method13632(var4.getGreen());
         this.field20638.method13632(var4.getBlue());
         this.field20635 = var1;
      }
   }

   public int method13059() {
      return this.field20635;
   }

   private void method13060() {
      this.method13058(new Color(this.field20636.method13631(), this.field20637.method13631(), this.field20638.method13631()).getRGB());
      this.method13037();
   }

   @Override
   public void method13028(int var1, int var2) {
      super.method13028(var1, var2);
   }

   @Override
   public void draw(float var1) {
      super.draw(var1);
   }
}
