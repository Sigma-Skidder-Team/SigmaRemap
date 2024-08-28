package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class Class8685 {
   public static final Class9369 field39213 = Class9837.method38884(
      new Class9369(
         new ResourceLocation("pillager_outpost/base_plates"),
         new ResourceLocation("empty"),
         ImmutableList.of(Pair.of(Class7487.method24385("pillager_outpost/base_plate"), 1)),
         Class109.field367
      )
   );

   public static void method31293() {
   }

   static {
      Class9837.method38884(
         new Class9369(
            new ResourceLocation("pillager_outpost/towers"),
            new ResourceLocation("empty"),
            ImmutableList.of(
               Pair.of(
                  Class7487.method24390(
                     ImmutableList.of(
                        Class7487.method24385("pillager_outpost/watchtower"),
                        Class7487.method24386("pillager_outpost/watchtower_overgrown", Class8523.field38267)
                     )
                  ),
                  1
               )
            ),
            Class109.field367
         )
      );
      Class9837.method38884(
         new Class9369(
            new ResourceLocation("pillager_outpost/feature_plates"),
            new ResourceLocation("empty"),
            ImmutableList.of(Pair.of(Class7487.method24385("pillager_outpost/feature_plate"), 1)),
            Class109.field366
         )
      );
      Class9837.method38884(
         new Class9369(
            new ResourceLocation("pillager_outpost/features"),
            new ResourceLocation("empty"),
            ImmutableList.of(
               Pair.of(Class7487.method24385("pillager_outpost/feature_cage1"), 1),
               Pair.of(Class7487.method24385("pillager_outpost/feature_cage2"), 1),
               Pair.of(Class7487.method24385("pillager_outpost/feature_logs"), 1),
               Pair.of(Class7487.method24385("pillager_outpost/feature_tent1"), 1),
               Pair.of(Class7487.method24385("pillager_outpost/feature_tent2"), 1),
               Pair.of(Class7487.method24385("pillager_outpost/feature_targets"), 1),
               Pair.of(Class7487.method24384(), 6)
            ),
            Class109.field367
         )
      );
   }
}
