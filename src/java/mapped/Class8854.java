package mapped;

import com.mentalfrostbyte.jello.util.ColorUtils;

import java.awt.Color;

public class Class8854 {
   private static String[] field40024;
   private float field40025;
   private float field40026;
   public float field40027;
   public float field40028;
   public float field40029;
   private float field40030;
   private float field40031;
   private float field40032;
   private boolean field40033;
   private float field40034 = 1.0F;
   private Class2422 field40035 = new Class2422();
   public float field40036;
   public Color field40037 = new Color(1.0F, 1.0F, 1.0F, 0.5F);
   public int field40038 = 0;

   public Class8854(float var1, float var2, float var3) {
      this.field40027 = this.field40025 = var1;
      this.field40028 = this.field40026 = var2;
      this.field40029 = var3;
      this.method32234();
   }

   public Class8854(float var1, float var2) {
      this.field40027 = this.field40025 = var1;
      this.field40028 = this.field40026 = var2;
      this.field40029 = (float)this.field40035.nextInt(1, 3) + this.field40035.nextFloat();
      this.method32234();
   }

   private void method32234() {
      this.field40031 = this.field40035.nextFloat() % this.field40034;
      this.field40032 = this.field40035.nextFloat() % this.field40034;
      this.field40030 = (this.field40035.nextFloat() * this.field40029 + 15.0F) % 25.0F;
      this.field40033 = this.field40035.nextBoolean();
      this.field40036 = this.field40035.nextFloat() / 2.0F;
      if (this.field40035.nextBoolean()) {
         this.field40036 *= -1.0F;
      }
   }

   public void method32235(float var1) {
      RenderUtil.method11438(
         this.field40027 * 2.0F, this.field40028 * 2.0F, this.field40029 * 2.0F, ColorUtils.applyAlpha(this.field40037.getRGB(), var1 * 0.7F)
      );
   }

   public void method32236(Class9715 var1) {
      this.field40027 = this.field40027 + var1.method38062() + this.field40036;
      this.field40025 = this.field40025 + var1.method38062() + this.field40036;
      this.field40028 = this.field40028 + this.field40032;
   }
}
