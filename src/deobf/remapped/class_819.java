package remapped;

public class class_819<T extends class_2811> extends class_2344<T> implements class_6582 {
   private static String[] field_4343;
   private class_1549 field_4342;

   public class_819(float var1, boolean var2) {
      super(var1, 0.0F, 64, !var2 ? 64 : 32);
      if (!var2) {
         this.field_11696 = new class_1549(this, 0, 0);
         this.field_11696.method_7037(0, 0).method_7049(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1);
         this.field_11696.method_7037(24, 0).method_7049(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F, var1);
         this.field_11695 = new class_1549(this, 32, 0);
         this.field_11695.method_7049(-4.0F, -10.0F, -4.0F, 8.0F, 10.0F, 8.0F, var1 + 0.5F);
         this.field_4342 = new class_1549(this);
         this.field_4342.method_7037(30, 47).method_7049(-8.0F, -8.0F, -6.0F, 16.0F, 16.0F, 1.0F, var1);
         this.field_4342.field_8191 = (float) (-Math.PI / 2);
         this.field_11695.method_7043(this.field_4342);
         this.field_11704 = new class_1549(this, 16, 20);
         this.field_11704.method_7049(-4.0F, 0.0F, -3.0F, 8.0F, 12.0F, 6.0F, var1);
         this.field_11704.method_7037(0, 38).method_7049(-4.0F, 0.0F, -3.0F, 8.0F, 18.0F, 6.0F, var1 + 0.05F);
         this.field_11705 = new class_1549(this, 44, 22);
         this.field_11705.method_7049(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
         this.field_11705.method_7046(-5.0F, 2.0F, 0.0F);
         this.field_11701 = new class_1549(this, 44, 22);
         this.field_11701.field_8197 = true;
         this.field_11701.method_7049(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
         this.field_11701.method_7046(5.0F, 2.0F, 0.0F);
         this.field_11706 = new class_1549(this, 0, 22);
         this.field_11706.method_7046(-2.0F, 12.0F, 0.0F);
         this.field_11706.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
         this.field_11703 = new class_1549(this, 0, 22);
         this.field_11703.field_8197 = true;
         this.field_11703.method_7046(2.0F, 12.0F, 0.0F);
         this.field_11703.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1);
      } else {
         this.field_11696 = new class_1549(this, 0, 0);
         this.field_11696.method_7049(-4.0F, -10.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1);
         this.field_11704 = new class_1549(this, 16, 16);
         this.field_11704.method_7049(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1 + 0.1F);
         this.field_11706 = new class_1549(this, 0, 16);
         this.field_11706.method_7046(-2.0F, 12.0F, 0.0F);
         this.field_11706.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.1F);
         this.field_11703 = new class_1549(this, 0, 16);
         this.field_11703.field_8197 = true;
         this.field_11703.method_7046(2.0F, 12.0F, 0.0F);
         this.field_11703.method_7049(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, var1 + 0.1F);
      }
   }

   public void method_3597(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.method_10738((T)var1, var2, var3, var4, var5, var6);
      class_3191.method_14688(this.field_11701, this.field_11705, var1.method_26892(), this.field_33202, var4);
   }

   @Override
   public void method_30080(boolean var1) {
      this.field_11696.field_8200 = var1;
      this.field_11695.field_8200 = var1;
      this.field_4342.field_8200 = var1;
   }
}
