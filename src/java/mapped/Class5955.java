package mapped;

public class Class5955 extends Class5942<Class945> {
   private static String[] field25967;

   public Class5955(Class8086 var1) {
      super(var1);
   }

   public void method18462(Class945 var1, float var2, Class9332 var3, Class7733 var4, int var5, int var6) {
      Direction var9 = var1.method3775().<Direction>method23463(Class3244.field18701);
      Class25 var10 = var1.method3795();

      for (int var11 = 0; var11 < var10.size(); var11++) {
         ItemStack var12 = (ItemStack)var10.get(var11);
         if (var12 != ItemStack.EMPTY) {
            var3.method35294();
            var3.method35291(0.5, 0.44921875, 0.5);
            Direction var13 = Direction.method547((var11 + var9.method534()) % 4);
            float var14 = -var13.method551();
            var3.method35293(Class7680.field32900.method25286(var14));
            var3.method35293(Class7680.field32898.method25286(90.0F));
            var3.method35291(-0.3125, -0.3125, 0.0);
            var3.method35292(0.375F, 0.375F, 0.375F);
            Minecraft.getInstance().method1555().method789(var12, Class2327.field15932, var5, var6, var3, var4);
            var3.method35295();
         }
      }
   }
}
