package mapped;

import java.util.List;
import java.util.Random;

public class Class8628 {
   private static final BlockPos field38808 = new BlockPos(4, 0, 15);
   private static final ResourceLocation[] field38809 = new ResourceLocation[]{
      new ResourceLocation("shipwreck/with_mast"),
      new ResourceLocation("shipwreck/sideways_full"),
      new ResourceLocation("shipwreck/sideways_fronthalf"),
      new ResourceLocation("shipwreck/sideways_backhalf"),
      new ResourceLocation("shipwreck/rightsideup_full"),
      new ResourceLocation("shipwreck/rightsideup_fronthalf"),
      new ResourceLocation("shipwreck/rightsideup_backhalf"),
      new ResourceLocation("shipwreck/with_mast_degraded"),
      new ResourceLocation("shipwreck/rightsideup_full_degraded"),
      new ResourceLocation("shipwreck/rightsideup_fronthalf_degraded"),
      new ResourceLocation("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final ResourceLocation[] field38810 = new ResourceLocation[]{
      new ResourceLocation("shipwreck/with_mast"),
      new ResourceLocation("shipwreck/upsidedown_full"),
      new ResourceLocation("shipwreck/upsidedown_fronthalf"),
      new ResourceLocation("shipwreck/upsidedown_backhalf"),
      new ResourceLocation("shipwreck/sideways_full"),
      new ResourceLocation("shipwreck/sideways_fronthalf"),
      new ResourceLocation("shipwreck/sideways_backhalf"),
      new ResourceLocation("shipwreck/rightsideup_full"),
      new ResourceLocation("shipwreck/rightsideup_fronthalf"),
      new ResourceLocation("shipwreck/rightsideup_backhalf"),
      new ResourceLocation("shipwreck/with_mast_degraded"),
      new ResourceLocation("shipwreck/upsidedown_full_degraded"),
      new ResourceLocation("shipwreck/upsidedown_fronthalf_degraded"),
      new ResourceLocation("shipwreck/upsidedown_backhalf_degraded"),
      new ResourceLocation("shipwreck/sideways_full_degraded"),
      new ResourceLocation("shipwreck/sideways_fronthalf_degraded"),
      new ResourceLocation("shipwreck/sideways_backhalf_degraded"),
      new ResourceLocation("shipwreck/rightsideup_full_degraded"),
      new ResourceLocation("shipwreck/rightsideup_fronthalf_degraded"),
      new ResourceLocation("shipwreck/rightsideup_backhalf_degraded")
   };

   public static void method30926(Class8761 var0, BlockPos var1, Class80 var2, List<Class4178> var3, Random var4, Class4737 var5) {
      ResourceLocation var8 = Util.<ResourceLocation>method38518(!var5.field22432 ? field38810 : field38809, var4);
      var3.add(new Class4181(var0, var8, var1, var2, var5.field22432));
   }

   // $VF: synthetic method
   public static BlockPos method30927() {
      return field38808;
   }
}