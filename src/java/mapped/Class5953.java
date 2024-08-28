package mapped;

import java.util.Calendar;

public class Class5953<T extends Class944 & Class942> extends Class5942<T> {
   private static String[] field25954;
   private final Class7219 field25955;
   private final Class7219 field25956;
   private final Class7219 field25957;
   private final Class7219 field25958;
   private final Class7219 field25959;
   private final Class7219 field25960;
   private final Class7219 field25961;
   private final Class7219 field25962;
   private final Class7219 field25963;
   private boolean field25964;

   public Class5953(Class8086 var1) {
      super(var1);
      Calendar var4 = Calendar.getInstance();
      if (var4.get(2) + 1 == 12 && var4.get(5) >= 24 && var4.get(5) <= 26) {
         this.field25964 = true;
      }

      this.field25956 = new Class7219(64, 64, 0, 19);
      this.field25956.method22675(1.0F, 0.0F, 1.0F, 14.0F, 10.0F, 14.0F, 0.0F);
      this.field25955 = new Class7219(64, 64, 0, 0);
      this.field25955.method22675(1.0F, 0.0F, 0.0F, 14.0F, 5.0F, 14.0F, 0.0F);
      this.field25955.field31033 = 9.0F;
      this.field25955.field31034 = 1.0F;
      this.field25957 = new Class7219(64, 64, 0, 0);
      this.field25957.method22675(7.0F, -1.0F, 15.0F, 2.0F, 4.0F, 1.0F, 0.0F);
      this.field25957.field31033 = 8.0F;
      this.field25959 = new Class7219(64, 64, 0, 19);
      this.field25959.method22675(1.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F, 0.0F);
      this.field25958 = new Class7219(64, 64, 0, 0);
      this.field25958.method22675(1.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F, 0.0F);
      this.field25958.field31033 = 9.0F;
      this.field25958.field31034 = 1.0F;
      this.field25960 = new Class7219(64, 64, 0, 0);
      this.field25960.method22675(15.0F, -1.0F, 15.0F, 1.0F, 4.0F, 1.0F, 0.0F);
      this.field25960.field31033 = 8.0F;
      this.field25962 = new Class7219(64, 64, 0, 19);
      this.field25962.method22675(0.0F, 0.0F, 1.0F, 15.0F, 10.0F, 14.0F, 0.0F);
      this.field25961 = new Class7219(64, 64, 0, 0);
      this.field25961.method22675(0.0F, 0.0F, 0.0F, 15.0F, 5.0F, 14.0F, 0.0F);
      this.field25961.field31033 = 9.0F;
      this.field25961.field31034 = 1.0F;
      this.field25963 = new Class7219(64, 64, 0, 0);
      this.field25963.method22675(0.0F, -1.0F, 15.0F, 1.0F, 4.0F, 1.0F, 0.0F);
      this.field25963.field31033 = 8.0F;
   }

   @Override
   public void method18462(T var1, float var2, MatrixStack var3, Class7733 var4, int var5, int var6) {
      World var9 = var1.method3734();
      boolean var10 = var9 != null;
      Class7380 var11 = !var10 ? Blocks.CHEST.method11579().method23465(Class3348.field18865, Direction.SOUTH) : var1.method3775();
      Class111 var12 = !var11.method23462(Class3348.field18866) ? Class111.field379 : var11.<Class111>method23463(Class3348.field18866);
      Block var13 = var11.method23383();
      if (var13 instanceof Class3346) {
         Class3346 var14 = (Class3346)var13;
         boolean var15 = var12 != Class111.field379;
         var3.method35294();
         float var16 = var11.<Direction>method23463(Class3348.field18865).method551();
         var3.method35291(0.5, 0.5, 0.5);
         var3.method35293(Class7680.field32900.method25286(-var16));
         var3.method35291(-0.5, -0.5, -0.5);
         Class7995<? extends Class941> var17;
         if (!var10) {
            var17 = Class6139::method19041;
         } else {
            var17 = var14.method11904(var11, var9, var1.method3774(), true);
         }

         float var18 = var17.method27292(Class3348.method11912((Class942)var1)).get(var2);
         var18 = 1.0F - var18;
         var18 = 1.0F - var18 * var18 * var18;
         int var19 = var17.method27292(new Class6138<>()).applyAsInt(var5);
         Class7826 var20 = Class8624.method30913(var1, var12, this.field25964);
         Class5422 var21 = var20.method26200(var4, Class4520::method14310);
         if (!var15) {
            this.method18486(var3, var21, this.field25955, this.field25957, this.field25956, var18, var19, var6);
         } else if (var12 != Class111.field380) {
            this.method18486(var3, var21, this.field25958, this.field25960, this.field25959, var18, var19, var6);
         } else {
            this.method18486(var3, var21, this.field25961, this.field25963, this.field25962, var18, var19, var6);
         }

         var3.method35295();
      }
   }

   private void method18486(MatrixStack var1, Class5422 var2, Class7219 var3, Class7219 var4, Class7219 var5, float var6, int var7, int var8) {
      var3.field31035 = -(var6 * (float) (Math.PI / 2));
      var4.field31035 = var3.field31035;
      var3.method22680(var1, var2, var7, var8);
      var4.method22680(var1, var2, var7, var8);
      var5.method22680(var1, var2, var7, var8);
   }
}
