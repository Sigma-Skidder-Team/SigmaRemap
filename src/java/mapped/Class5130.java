package mapped;

import java.util.Map.Entry;

public class Class5130 implements Class5119 {
   private static String[] field23320;
   private final Minecraft field23321;

   public Class5130(Minecraft var1) {
      this.field23321 = var1;
   }

   @Override
   public void method15813(Class9332 var1, Class7733 var2, double var3, double var5, double var7) {
      Class1656 var11 = this.field23321.field1338;
      RenderSystem.pushMatrix();
      RenderSystem.disableBlend();
      RenderSystem.method27862();
      RenderSystem.enableDepthTest();
      BlockPos var12 = new BlockPos(var3, 0.0, var7);
      Class9352 var13 = Class9352.method35409();
      Class5425 var14 = var13.method35411();
      var14.method17063(5, Class9337.field43342);

      for (int var15 = -32; var15 <= 32; var15 += 16) {
         for (int var16 = -32; var16 <= 32; var16 += 16) {
            Class1670 var17 = var11.method7011(var12.method8336(var15, 0, var16));

            for (Entry var19 : var17.method7068()) {
               Class101 var20 = (Class101)var19.getKey();
               Class7481 var21 = var17.method7072();
               Class7680 var22 = this.method15867(var20);

               for (int var23 = 0; var23 < 16; var23++) {
                  for (int var24 = 0; var24 < 16; var24++) {
                     int var25 = var21.field32174 * 16 + var23;
                     int var26 = var21.field32175 * 16 + var24;
                     float var27 = (float)((double)((float)var11.method6736(var20, var25, var26) + (float)var20.ordinal() * 0.09375F) - var5);
                     Class264.method900(
                        var14,
                        (double)((float)var25 + 0.25F) - var3,
                        (double)var27,
                        (double)((float)var26 + 0.25F) - var7,
                        (double)((float)var25 + 0.75F) - var3,
                        (double)(var27 + 0.09375F),
                        (double)((float)var26 + 0.75F) - var7,
                        var22.method25269(),
                        var22.method25270(),
                        var22.method25271(),
                        1.0F
                     );
                  }
               }
            }
         }
      }

      var13.method35410();
      RenderSystem.method27861();
      RenderSystem.popMatrix();
   }

   private Class7680 method15867(Class101 var1) {
      switch (Class7913.field33895[var1.ordinal()]) {
         case 1:
            return new Class7680(1.0F, 1.0F, 0.0F);
         case 2:
            return new Class7680(1.0F, 0.0F, 1.0F);
         case 3:
            return new Class7680(0.0F, 0.7F, 0.0F);
         case 4:
            return new Class7680(0.0F, 0.0F, 0.5F);
         case 5:
            return new Class7680(0.0F, 0.3F, 0.3F);
         case 6:
            return new Class7680(0.0F, 0.5F, 0.5F);
         default:
            return new Class7680(0.0F, 0.0F, 0.0F);
      }
   }
}
