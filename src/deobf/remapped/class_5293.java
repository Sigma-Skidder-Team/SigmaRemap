package remapped;

import java.util.List;
import java.util.Random;

public class class_5293 {
   private static final class_1331 field_27048 = new class_1331(4, 0, 15);
   private static final Identifier[] field_27047 = new Identifier[]{
      new Identifier("shipwreck/with_mast"),
      new Identifier("shipwreck/sideways_full"),
      new Identifier("shipwreck/sideways_fronthalf"),
      new Identifier("shipwreck/sideways_backhalf"),
      new Identifier("shipwreck/rightsideup_full"),
      new Identifier("shipwreck/rightsideup_fronthalf"),
      new Identifier("shipwreck/rightsideup_backhalf"),
      new Identifier("shipwreck/with_mast_degraded"),
      new Identifier("shipwreck/rightsideup_full_degraded"),
      new Identifier("shipwreck/rightsideup_fronthalf_degraded"),
      new Identifier("shipwreck/rightsideup_backhalf_degraded")
   };
   private static final Identifier[] field_27045 = new Identifier[]{
      new Identifier("shipwreck/with_mast"),
      new Identifier("shipwreck/upsidedown_full"),
      new Identifier("shipwreck/upsidedown_fronthalf"),
      new Identifier("shipwreck/upsidedown_backhalf"),
      new Identifier("shipwreck/sideways_full"),
      new Identifier("shipwreck/sideways_fronthalf"),
      new Identifier("shipwreck/sideways_backhalf"),
      new Identifier("shipwreck/rightsideup_full"),
      new Identifier("shipwreck/rightsideup_fronthalf"),
      new Identifier("shipwreck/rightsideup_backhalf"),
      new Identifier("shipwreck/with_mast_degraded"),
      new Identifier("shipwreck/upsidedown_full_degraded"),
      new Identifier("shipwreck/upsidedown_fronthalf_degraded"),
      new Identifier("shipwreck/upsidedown_backhalf_degraded"),
      new Identifier("shipwreck/sideways_full_degraded"),
      new Identifier("shipwreck/sideways_fronthalf_degraded"),
      new Identifier("shipwreck/sideways_backhalf_degraded"),
      new Identifier("shipwreck/rightsideup_full_degraded"),
      new Identifier("shipwreck/rightsideup_fronthalf_degraded"),
      new Identifier("shipwreck/rightsideup_backhalf_degraded")
   };

   public static void method_24140(class_5799 var0, class_1331 var1, class_6631 var2, List<class_7060> var3, Random var4, class_3294 var5) {
      Identifier var8 = Util.<Identifier>method_44697(!var5.field_16302 ? field_27045 : field_27047, var4);
      var3.add(new class_2576(var0, var8, var1, var2, var5.field_16302));
   }
}
