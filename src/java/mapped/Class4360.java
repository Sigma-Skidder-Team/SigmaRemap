package mapped;

import com.mentalfrostbyte.jello.unmapped.IconPanel;

public class Class4360 extends Class4247 {
   private static String[] field21316;
   private int field21317;
   private int field21318;
   public boolean field21319 = false;

   public Class4360(IconPanel var1, String var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, false);
      this.field21317 = var7;
      this.field21318 = var8;
   }

   public void method13630(int var1) {
      this.field21317 = var1;
   }

   @Override
   public void method13028(int var1, int var2) {
      int var5 = this.method13309() - this.method13271();
      if (this.field21319) {
         this.method13632((int)((float)var5 / (float)this.getWidth() * 255.0F));
      }

      super.method13028(var1, var2);
   }

   @Override
   public void draw(float var1) {
      RenderUtil.method11424((float)this.x, (float)this.y, (float)this.width, (float)this.height, this.field21317);
      super.draw(var1);
   }

   @Override
   public boolean method13078(int var1, int var2, int var3) {
      this.field21319 = true;
      return super.method13078(var1, var2, var3);
   }

   @Override
   public void method13095(int var1, int var2, int var3) {
      this.field21319 = false;
   }

   public float method13631() {
      return (float)this.field21318;
   }

   public void method13632(int var1) {
      this.method13633(var1, true);
   }

   public void method13633(int var1, boolean var2) {
      var1 = Math.min(Math.max(var1, 0), 255);
      int var5 = this.field21318;
      this.field21318 = var1;
      if (var2 && var5 != var1) {
         this.method13037();
      }
   }
}
