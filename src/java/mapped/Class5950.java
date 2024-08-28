package mapped;

public class Class5950 extends Class5942<Class967> {
   private static String[] field25946;
   private final Class7219 field25947;
   private final Class7219 field25948;
   private final Class7219[] field25949 = new Class7219[4];

   public Class5950(Class8086 var1) {
      super(var1);
      this.field25947 = new Class7219(64, 64, 0, 0);
      this.field25947.method22675(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F, 0.0F);
      this.field25948 = new Class7219(64, 64, 0, 22);
      this.field25948.method22675(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 6.0F, 0.0F);
      this.field25949[0] = new Class7219(64, 64, 50, 0);
      this.field25949[1] = new Class7219(64, 64, 50, 6);
      this.field25949[2] = new Class7219(64, 64, 50, 12);
      this.field25949[3] = new Class7219(64, 64, 50, 18);
      this.field25949[0].method22673(0.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F);
      this.field25949[1].method22673(0.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F);
      this.field25949[2].method22673(-16.0F, 6.0F, -16.0F, 3.0F, 3.0F, 3.0F);
      this.field25949[3].method22673(-16.0F, 6.0F, 0.0F, 3.0F, 3.0F, 3.0F);
      this.field25949[0].field31035 = (float) (Math.PI / 2);
      this.field25949[1].field31035 = (float) (Math.PI / 2);
      this.field25949[2].field31035 = (float) (Math.PI / 2);
      this.field25949[3].field31035 = (float) (Math.PI / 2);
      this.field25949[0].field31037 = 0.0F;
      this.field25949[1].field31037 = (float) (Math.PI / 2);
      this.field25949[2].field31037 = (float) (Math.PI * 3.0 / 2.0);
      this.field25949[3].field31037 = (float) Math.PI;
   }

   public void method18462(Class967 var1, float var2, Class9332 var3, Class7733 var4, int var5, int var6) {
      Class7826 var9 = Class8624.field38785[var1.method4000().method309()];
      World var10 = var1.method3734();
      if (var10 == null) {
         this.method18480(var3, var4, true, Direction.SOUTH, var9, var5, var6, false);
         this.method18480(var3, var4, false, Direction.SOUTH, var9, var5, var6, true);
      } else {
         Class7380 var11 = var1.method3775();
         Class7995<Class967> var12 = Class9324.<Class967>method35243(
            Class4387.field21444, Class3250::method11684, Class3250::method11683, Class3348.field18865, var11, var10, var1.method3774(), (var0, var1x) -> false
         );
         int var13 = var12.method27292(new Class6138<>()).get(var5);
         this.method18480(
            var3,
            var4,
            var11.<Class82>method23463(Class3250.field18713) == Class82.field205,
            var11.<Direction>method23463(Class3250.field18484),
            var9,
            var13,
            var6,
            false
         );
      }
   }

   private void method18480(Class9332 var1, Class7733 var2, boolean var3, Direction var4, Class7826 var5, int var6, int var7, boolean var8) {
      this.field25947.field31039 = var3;
      this.field25948.field31039 = !var3;
      this.field25949[0].field31039 = !var3;
      this.field25949[1].field31039 = var3;
      this.field25949[2].field31039 = !var3;
      this.field25949[3].field31039 = var3;
      var1.method35294();
      var1.method35291(0.0, 0.5625, !var8 ? 0.0 : -1.0);
      var1.method35293(Class7680.field32898.method25286(90.0F));
      var1.method35291(0.5, 0.5, 0.5);
      var1.method35293(Class7680.field32902.method25286(180.0F + var4.method551()));
      var1.method35291(-0.5, -0.5, -0.5);
      Class5422 var11 = var5.method26200(var2, Class4520::method14309);
      this.field25947.method22680(var1, var11, var6, var7);
      this.field25948.method22680(var1, var11, var6, var7);
      this.field25949[0].method22680(var1, var11, var6, var7);
      this.field25949[1].method22680(var1, var11, var6, var7);
      this.field25949[2].method22680(var1, var11, var6, var7);
      this.field25949[3].method22680(var1, var11, var6, var7);
      var1.method35295();
   }
}
