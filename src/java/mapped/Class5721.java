package mapped;

import java.util.Random;

public class Class5721 extends Class5715<Class907> {
   private static String[] field25119;

   public Class5721(Class8853 var1) {
      super(var1);
      this.field25098 = 0.5F;
   }

   public void method17853(Class907 var1, float var2, float var3, Class9332 var4, Class7733 var5, int var6) {
      Class7380 var9 = var1.method3556();
      if (var9.method23397() == Class1855.field9887) {
         Class1655 var10 = var1.method3554();
         if (var9 != var10.method6738(var1.method3432()) && var9.method23397() != Class1855.field9885) {
            var4.method35294();
            BlockPos var11 = new BlockPos(var1.getPosX(), var1.method3389().field28453, var1.getPosZ());
            var4.method35291(-0.5, 0.0, -0.5);
            Class217 var12 = Minecraft.getInstance().method1553();
            var12.method812()
               .method24679(
                  var10,
                  var12.method813(var9),
                  var9,
                  var11,
                  var4,
                  var5.method25597(Class8928.method32631(var9)),
                  false,
                  new Random(),
                  var9.method23451(var1.method3553()),
                  Class213.field798
               );
            var4.method35295();
            super.method17853(var1, var2, var3, var4, var5, var6);
         }
      }
   }

   public ResourceLocation method17843(Class907 var1) {
      return Class289.field1102;
   }
}
