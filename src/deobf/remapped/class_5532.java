package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

public class class_5532 {
   public static final class_8115 field_28209 = class_9863.method_45479(
      new class_8115(
         new Identifier("pillager_outpost/base_plates"),
         new Identifier("empty"),
         ImmutableList.of(Pair.of(class_2609.method_11826("pillager_outpost/base_plate"), 1)),
         class_7599.field_38708
      )
   );

   public static void method_25127() {
   }

   static {
      class_9863.method_45479(
         new class_8115(
            new Identifier("pillager_outpost/towers"),
            new Identifier("empty"),
            ImmutableList.of(
               Pair.of(
                  class_2609.method_11838(
                     ImmutableList.of(
                        class_2609.method_11826("pillager_outpost/watchtower"),
                        class_2609.method_11835("pillager_outpost/watchtower_overgrown", class_4932.field_25547)
                     )
                  ),
                  1
               )
            ),
            class_7599.field_38708
         )
      );
      class_9863.method_45479(
         new class_8115(
            new Identifier("pillager_outpost/feature_plates"),
            new Identifier("empty"),
            ImmutableList.of(Pair.of(class_2609.method_11826("pillager_outpost/feature_plate"), 1)),
            class_7599.field_38703
         )
      );
      class_9863.method_45479(
         new class_8115(
            new Identifier("pillager_outpost/features"),
            new Identifier("empty"),
            ImmutableList.of(
               Pair.of(class_2609.method_11826("pillager_outpost/feature_cage1"), 1),
               Pair.of(class_2609.method_11826("pillager_outpost/feature_cage2"), 1),
               Pair.of(class_2609.method_11826("pillager_outpost/feature_logs"), 1),
               Pair.of(class_2609.method_11826("pillager_outpost/feature_tent1"), 1),
               Pair.of(class_2609.method_11826("pillager_outpost/feature_tent2"), 1),
               Pair.of(class_2609.method_11826("pillager_outpost/feature_targets"), 1),
               Pair.of(class_2609.method_11840(), 6)
            ),
            class_7599.field_38708
         )
      );
   }
}
