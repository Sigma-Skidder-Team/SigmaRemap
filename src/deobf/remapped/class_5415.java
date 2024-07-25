package remapped;

public class class_5415<T extends class_5834> extends class_2344<T> {
   private static String[] field_27604;
   public boolean field_27603;
   public boolean field_27602;

   public class_5415(float var1) {
      super(0.0F, -14.0F, 64, 32);
      float var4 = -14.0F;
      this.field_11695 = new class_1549(this, 0, 16);
      this.field_11695.method_7049(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1 - 0.5F);
      this.field_11695.method_7046(0.0F, -14.0F, 0.0F);
      this.field_11704 = new class_1549(this, 32, 16);
      this.field_11704.method_7049(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1);
      this.field_11704.method_7046(0.0F, -14.0F, 0.0F);
      this.field_11705 = new class_1549(this, 56, 0);
      this.field_11705.method_7049(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F, var1);
      this.field_11705.method_7046(-3.0F, -12.0F, 0.0F);
      this.field_11701 = new class_1549(this, 56, 0);
      this.field_11701.field_8197 = true;
      this.field_11701.method_7049(-1.0F, -2.0F, -1.0F, 2.0F, 30.0F, 2.0F, var1);
      this.field_11701.method_7046(5.0F, -12.0F, 0.0F);
      this.field_11706 = new class_1549(this, 56, 0);
      this.field_11706.method_7049(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F, var1);
      this.field_11706.method_7046(-2.0F, -2.0F, 0.0F);
      this.field_11703 = new class_1549(this, 56, 0);
      this.field_11703.field_8197 = true;
      this.field_11703.method_7049(-1.0F, 0.0F, -1.0F, 2.0F, 30.0F, 2.0F, var1);
      this.field_11703.method_7046(2.0F, -2.0F, 0.0F);
   }

   @Override
   public void method_10738(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method_10738((T)var1, var2, var3, var4, var5, var6);
      this.field_11696.field_8200 = true;
      float var9 = -14.0F;
      this.field_11704.field_8191 = 0.0F;
      this.field_11704.field_8181 = -14.0F;
      this.field_11704.field_8187 = -0.0F;
      this.field_11706.field_8191 -= 0.0F;
      this.field_11703.field_8191 -= 0.0F;
      this.field_11705.field_8191 = (float)((double)this.field_11705.field_8191 * 0.5);
      this.field_11701.field_8191 = (float)((double)this.field_11701.field_8191 * 0.5);
      this.field_11706.field_8191 = (float)((double)this.field_11706.field_8191 * 0.5);
      this.field_11703.field_8191 = (float)((double)this.field_11703.field_8191 * 0.5);
      float var10 = 0.4F;
      if (this.field_11705.field_8191 > 0.4F) {
         this.field_11705.field_8191 = 0.4F;
      }

      if (this.field_11701.field_8191 > 0.4F) {
         this.field_11701.field_8191 = 0.4F;
      }

      if (this.field_11705.field_8191 < -0.4F) {
         this.field_11705.field_8191 = -0.4F;
      }

      if (this.field_11701.field_8191 < -0.4F) {
         this.field_11701.field_8191 = -0.4F;
      }

      if (this.field_11706.field_8191 > 0.4F) {
         this.field_11706.field_8191 = 0.4F;
      }

      if (this.field_11703.field_8191 > 0.4F) {
         this.field_11703.field_8191 = 0.4F;
      }

      if (this.field_11706.field_8191 < -0.4F) {
         this.field_11706.field_8191 = -0.4F;
      }

      if (this.field_11703.field_8191 < -0.4F) {
         this.field_11703.field_8191 = -0.4F;
      }

      if (this.field_27603) {
         this.field_11705.field_8191 = -0.5F;
         this.field_11701.field_8191 = -0.5F;
         this.field_11705.field_8185 = 0.05F;
         this.field_11701.field_8185 = -0.05F;
      }

      this.field_11705.field_8187 = 0.0F;
      this.field_11701.field_8187 = 0.0F;
      this.field_11706.field_8187 = 0.0F;
      this.field_11703.field_8187 = 0.0F;
      this.field_11706.field_8181 = -5.0F;
      this.field_11703.field_8181 = -5.0F;
      this.field_11696.field_8187 = -0.0F;
      this.field_11696.field_8181 = -13.0F;
      this.field_11695.field_8183 = this.field_11696.field_8183;
      this.field_11695.field_8181 = this.field_11696.field_8181;
      this.field_11695.field_8187 = this.field_11696.field_8187;
      this.field_11695.field_8191 = this.field_11696.field_8191;
      this.field_11695.field_8190 = this.field_11696.field_8190;
      this.field_11695.field_8185 = this.field_11696.field_8185;
      if (this.field_27602) {
         float var11 = 1.0F;
         this.field_11696.field_8181 -= 5.0F;
      }

      float var12 = -14.0F;
      this.field_11705.method_7046(-5.0F, -12.0F, 0.0F);
      this.field_11701.method_7046(5.0F, -12.0F, 0.0F);
   }
}
