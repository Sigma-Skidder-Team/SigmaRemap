package remapped;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class class_4370 implements Consumer<BiConsumer<class_4639, class_8843>> {
   private static final class_5704 field_21441 = class_5328.method_24286(
      class_9518.method_43918().method_43920(new class_5187(class_3668.field_17870, class_7781.method_35305(1)))
   );
   private static final class_5704 field_21435 = field_21441.method_25792();
   private static final class_5704 field_21442 = class_5328.method_24286(class_9518.method_43918().method_43915(class_4897.field_24853));
   private static final class_5704 field_21443 = field_21442.method_25790(field_21441);
   private static final class_5704 field_21439 = field_21443.method_25792();
   private static final Set<class_2451> field_21440 = Stream.<class_6414>of(
         class_4783.field_23615,
         class_4783.field_23862,
         class_4783.field_23906,
         class_4783.field_23878,
         class_4783.field_23444,
         class_4783.field_23525,
         class_4783.field_23635,
         class_4783.field_23445,
         class_4783.field_23363,
         class_4783.field_23761,
         class_4783.field_23169,
         class_4783.field_23190,
         class_4783.field_23475,
         class_4783.field_23352,
         class_4783.field_23533,
         class_4783.field_23507,
         class_4783.field_23564,
         class_4783.field_23476,
         class_4783.field_23524,
         class_4783.field_23858,
         class_4783.field_23228,
         class_4783.field_23777,
         class_4783.field_23293,
         class_4783.field_23819,
         class_4783.field_23873,
         class_4783.field_23400
      )
      .<class_2451>map(class_8525::method_10803)
      .collect(ImmutableSet.toImmutableSet());
   private static final float[] field_21437 = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] field_21436 = new float[]{0.025F, 0.027777778F, 0.03125F, 0.041666668F, 0.1F};
   private final Map<class_4639, class_8843> field_21438 = Maps.newHashMap();

   private static <T> T method_20360(class_8525 var0, class_5481<T> var1) {
      return (T)(field_21440.contains(var0.method_10803()) ? var1.method_13888() : var1.method_24901(class_4332.method_20157()));
   }

   private static <T> T method_20367(class_8525 var0, class_3042<T> var1) {
      return (T)(field_21440.contains(var0.method_10803()) ? var1.method_13888() : var1.method_13887(class_5617.method_25486()));
   }

   private static class_8843 method_20343(class_8525 var0) {
      return class_1758.method_7864()
         .method_40676(method_20367(var0, class_6282.method_28631().method_1777(class_2728.method_12260(1)).method_1773(class_3399.method_15699(var0))));
   }

   private static class_8843 method_20342(class_6414 var0, class_5704 var1, class_3516<?> var2) {
      return class_1758.method_7864()
         .method_40676(
            class_6282.method_28631().method_1777(class_2728.method_12260(1)).method_1773(class_3399.method_15699(var0).method_16196(var1).method_16199(var2))
         );
   }

   private static class_8843 method_20349(class_6414 var0, class_3516<?> var1) {
      return method_20342(var0, field_21441, var1);
   }

   private static class_8843 method_20356(class_6414 var0, class_3516<?> var1) {
      return method_20342(var0, field_21442, var1);
   }

   private static class_8843 method_20351(class_6414 var0, class_3516<?> var1) {
      return method_20342(var0, field_21443, var1);
   }

   private static class_8843 method_20350(class_6414 var0, class_8525 var1) {
      return method_20349(var0, (class_3516<?>)method_20367(var0, class_3399.method_15699(var1)));
   }

   private static class_8843 method_20344(class_8525 var0, class_3254 var1) {
      return class_1758.method_7864()
         .method_40676(
            class_6282.method_28631()
               .method_1777(class_2728.method_12260(1))
               .method_1773((class_3516<?>)method_20360(var0, class_3399.method_15699(var0).method_34360(class_6520.method_29699(var1))))
         );
   }

   private static class_8843 method_20362(class_6414 var0, class_8525 var1, class_3254 var2) {
      return method_20349(var0, (class_3516<?>)method_20360(var0, class_3399.method_15699(var1).method_34360(class_6520.method_29699(var2))));
   }

   private static class_8843 method_20366(class_8525 var0) {
      return class_1758.method_7864()
         .method_40676(class_6282.method_28631().method_1774(field_21441).method_1777(class_2728.method_12260(1)).method_1773(class_3399.method_15699(var0)));
   }

   private static class_8843 method_20330(class_8525 var0) {
      return class_1758.method_7864()
         .method_40676(
            method_20367(
               class_4783.field_23660,
               class_6282.method_28631().method_1777(class_2728.method_12260(1)).method_1773(class_3399.method_15699(class_4783.field_23660))
            )
         )
         .method_40676(method_20367(var0, class_6282.method_28631().method_1777(class_2728.method_12260(1)).method_1773(class_3399.method_15699(var0))));
   }

   private static class_8843 method_20365(class_6414 var0) {
      return class_1758.method_7864()
         .method_40676(
            class_6282.method_28631()
               .method_1777(class_2728.method_12260(1))
               .method_1773(
                  (class_3516<?>)method_20360(
                     var0,
                     class_3399.method_15699(var0)
                        .method_34360(
                           class_6520.method_29699(class_2728.method_12260(2))
                              .method_24477(
                                 class_5805.method_26299(var0)
                                    .method_13828(class_7344.method_33475().method_33479(class_6344.field_32395, class_6666.field_34469))
                              )
                        )
                  )
               )
         );
   }

   private static <T extends Comparable<T> & class_4530> class_8843 method_20347(class_6414 var0, class_5019<T> var1, T var2) {
      return class_1758.method_7864()
         .method_40676(
            method_20367(
               var0,
               class_6282.method_28631()
                  .method_1777(class_2728.method_12260(1))
                  .method_1773(
                     class_3399.method_15699(var0)
                        .method_16196(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33479(var1, (T)var2)))
                  )
            )
         );
   }

   private static class_8843 method_20357(class_6414 var0) {
      return class_1758.method_7864()
         .method_40676(
            method_20367(
               var0,
               class_6282.method_28631()
                  .method_1777(class_2728.method_12260(1))
                  .method_1773(class_3399.method_15699(var0).method_34360(class_6579.method_30077(class_9597.field_48906)))
            )
         );
   }

   private static class_8843 method_20363(class_6414 var0) {
      return class_1758.method_7864()
         .method_40676(
            method_20367(
               var0,
               class_6282.method_28631()
                  .method_1777(class_2728.method_12260(1))
                  .method_1773(
                     class_3399.method_15699(var0)
                        .method_34360(class_6579.method_30077(class_9597.field_48906))
                        .method_34360(
                           class_795.method_3533(class_9397.field_48027)
                              .method_15820("Lock", "BlockEntityTag.Lock")
                              .method_15820("LootTable", "BlockEntityTag.LootTable")
                              .method_15820("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .method_34360(class_3148.method_14541().method_41943(class_2422.method_11046(class_3153.field_15682)))
                  )
            )
         );
   }

   private static class_8843 method_20331(class_6414 var0) {
      return class_1758.method_7864()
         .method_40676(
            method_20367(
               var0,
               class_6282.method_28631()
                  .method_1777(class_2728.method_12260(1))
                  .method_1773(
                     class_3399.method_15699(var0)
                        .method_34360(class_6579.method_30077(class_9597.field_48906))
                        .method_34360(class_795.method_3533(class_9397.field_48027).method_15820("Patterns", "BlockEntityTag.Patterns"))
                  )
            )
         );
   }

   private static class_8843 method_20338(class_6414 var0) {
      return class_1758.method_7864()
         .method_40676(
            class_6282.method_28631()
               .method_1774(field_21441)
               .method_1777(class_2728.method_12260(1))
               .method_1773(
                  class_3399.method_15699(var0)
                     .method_34360(class_795.method_3533(class_9397.field_48027).method_15820("Bees", "BlockEntityTag.Bees"))
                     .method_34360(class_4849.method_22320(var0).method_18452(class_4745.field_22992))
               )
         );
   }

   private static class_8843 method_20339(class_6414 var0) {
      return class_1758.method_7864()
         .method_40676(
            class_6282.method_28631()
               .method_1777(class_2728.method_12260(1))
               .method_1773(
                  class_3399.method_15699(var0)
                     .method_16196(field_21441)
                     .method_34360(class_795.method_3533(class_9397.field_48027).method_15820("Bees", "BlockEntityTag.Bees"))
                     .method_34360(class_4849.method_22320(var0).method_18452(class_4745.field_22992))
                     .method_16199(class_3399.method_15699(var0))
               )
         );
   }

   private static class_8843 method_20353(class_6414 var0, class_2451 var1) {
      return method_20349(var0, (class_3516<?>)method_20360(var0, class_3399.method_15699(var1).method_34360(class_5695.method_25768(class_3668.field_17876))));
   }

   private static class_8843 method_20345(class_6414 var0, class_8525 var1) {
      return method_20349(
         var0,
         (class_3516<?>)method_20360(
            var0,
            class_3399.method_15699(var1)
               .method_34360(class_6520.method_29699(class_7986.method_36238(-6.0F, 2.0F)))
               .method_34360(class_3098.method_14180(class_595.method_2798(0)))
         )
      );
   }

   private static class_8843 method_20358(class_6414 var0) {
      return method_20356(
         var0,
         (class_3516<?>)method_20360(
            var0,
            class_3399.method_15699(class_4897.field_24621)
               .method_16196(class_6332.method_29003(0.125F))
               .method_34360(class_5695.method_25765(class_3668.field_17876, 2))
         )
      );
   }

   private static class_8843 method_20361(class_6414 var0, class_2451 var1) {
      return class_1758.method_7864()
         .method_40676(
            method_20360(
               var0,
               class_6282.method_28631()
                  .method_1777(class_2728.method_12260(1))
                  .method_1773(
                     class_3399.method_15699(var1)
                        .method_34360(
                           class_6520.method_29699(class_1066.method_4678(3, 0.06666667F))
                              .method_24477(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_8138.field_41679, 0)))
                        )
                        .method_34360(
                           class_6520.method_29699(class_1066.method_4678(3, 0.13333334F))
                              .method_24477(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_8138.field_41679, 1)))
                        )
                        .method_34360(
                           class_6520.method_29699(class_1066.method_4678(3, 0.2F))
                              .method_24477(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_8138.field_41679, 2)))
                        )
                        .method_34360(
                           class_6520.method_29699(class_1066.method_4678(3, 0.26666668F))
                              .method_24477(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_8138.field_41679, 3)))
                        )
                        .method_34360(
                           class_6520.method_29699(class_1066.method_4678(3, 0.33333334F))
                              .method_24477(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_8138.field_41679, 4)))
                        )
                        .method_34360(
                           class_6520.method_29699(class_1066.method_4678(3, 0.4F))
                              .method_24477(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_8138.field_41679, 5)))
                        )
                        .method_34360(
                           class_6520.method_29699(class_1066.method_4678(3, 0.46666667F))
                              .method_24477(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_8138.field_41679, 6)))
                        )
                        .method_34360(
                           class_6520.method_29699(class_1066.method_4678(3, 0.53333336F))
                              .method_24477(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_8138.field_41679, 7)))
                        )
                  )
            )
         );
   }

   private static class_8843 method_20352(class_6414 var0, class_2451 var1) {
      return class_1758.method_7864()
         .method_40676(
            method_20360(
               var0,
               class_6282.method_28631()
                  .method_1777(class_2728.method_12260(1))
                  .method_1773(class_3399.method_15699(var1).method_34360(class_6520.method_29699(class_1066.method_4678(3, 0.53333336F))))
            )
         );
   }

   private static class_8843 method_20336(class_8525 var0) {
      return class_1758.method_7864()
         .method_40676(class_6282.method_28631().method_1777(class_2728.method_12260(1)).method_1774(field_21442).method_1773(class_3399.method_15699(var0)));
   }

   private static class_8843 method_20337(class_6414 var0, class_6414 var1, float... var2) {
      return method_20351(
            var0, ((class_7550)method_20367(var0, class_3399.method_15699(var1))).method_16196(class_6783.method_31099(class_3668.field_17876, var2))
         )
         .method_40676(
            class_6282.method_28631()
               .method_1777(class_2728.method_12260(1))
               .method_1774(field_21439)
               .method_1773(
                  ((class_7550)method_20360(
                        var0, class_3399.method_15699(class_4897.field_24413).method_34360(class_6520.method_29699(class_7986.method_36238(1.0F, 2.0F)))
                     ))
                     .method_16196(class_6783.method_31099(class_3668.field_17876, 0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F))
               )
         );
   }

   private static class_8843 method_20368(class_6414 var0, class_6414 var1, float... var2) {
      return method_20337(var0, var1, var2)
         .method_40676(
            class_6282.method_28631()
               .method_1777(class_2728.method_12260(1))
               .method_1774(field_21439)
               .method_1773(
                  ((class_7550)method_20367(var0, class_3399.method_15699(class_4897.field_24753)))
                     .method_16196(class_6783.method_31099(class_3668.field_17876, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))
               )
         );
   }

   private static class_8843 method_20328(class_6414 var0, class_2451 var1, class_2451 var2, class_5704 var3) {
      return method_20360(
         var0,
         class_1758.method_7864()
            .method_40676(class_6282.method_28631().method_1773(class_3399.method_15699(var1).method_16196(var3).method_16199(class_3399.method_15699(var2))))
            .method_40676(
               class_6282.method_28631()
                  .method_1774(var3)
                  .method_1773(class_3399.method_15699(var2).method_34360(class_5695.method_25769(class_3668.field_17876, 0.5714286F, 3)))
            )
      );
   }

   private static class_8843 method_20359(class_6414 var0) {
      return class_1758.method_7864()
         .method_40676(
            class_6282.method_28631()
               .method_1774(field_21442)
               .method_1773(class_3399.method_15699(var0).method_34360(class_6520.method_29699(class_2728.method_12260(2))))
         );
   }

   private static class_8843 method_20335(class_6414 var0, class_6414 var1) {
      class_6618 var4 = class_3399.method_15699(var1)
         .method_34360(class_6520.method_29699(class_2728.method_12260(2)))
         .method_16196(field_21442)
         .method_16199(((class_7550)method_20367(var0, class_3399.method_15699(class_4897.field_24621))).method_16196(class_6332.method_29003(0.125F)));
      return class_1758.method_7864()
         .method_40676(
            class_6282.method_28631()
               .method_1773(var4)
               .method_1774(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33479(class_3064.field_15063, class_7422.field_37876)))
               .method_1774(
                  class_1600.method_7179(
                     class_6352.method_29094()
                        .method_29095(
                           class_6051.method_27633()
                              .method_27630(var0)
                              .method_27631(class_7344.method_33475().method_33479(class_3064.field_15063, class_7422.field_37874).method_33476())
                              .method_27632()
                        ),
                     new class_1331(0, 1, 0)
                  )
               )
         )
         .method_40676(
            class_6282.method_28631()
               .method_1773(var4)
               .method_1774(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33479(class_3064.field_15063, class_7422.field_37874)))
               .method_1774(
                  class_1600.method_7179(
                     class_6352.method_29094()
                        .method_29095(
                           class_6051.method_27633()
                              .method_27630(var0)
                              .method_27631(class_7344.method_33475().method_33479(class_3064.field_15063, class_7422.field_37876).method_33476())
                              .method_27632()
                        ),
                     new class_1331(0, -1, 0)
                  )
               )
         );
   }

   public static class_8843 method_20348() {
      return class_1758.method_7864();
   }

   public void accept(BiConsumer<class_4639, class_8843> var1) {
      this.method_20346(class_4783.field_23695);
      this.method_20346(class_4783.field_23716);
      this.method_20346(class_4783.field_23440);
      this.method_20346(class_4783.field_23514);
      this.method_20346(class_4783.field_23271);
      this.method_20346(class_4783.field_23582);
      this.method_20346(class_4783.field_23592);
      this.method_20346(class_4783.field_23577);
      this.method_20346(class_4783.field_23808);
      this.method_20346(class_4783.field_23893);
      this.method_20346(class_4783.field_23464);
      this.method_20346(class_4783.field_23503);
      this.method_20346(class_4783.field_23373);
      this.method_20346(class_4783.field_23545);
      this.method_20346(class_4783.field_23916);
      this.method_20346(class_4783.field_23890);
      this.method_20346(class_4783.field_23483);
      this.method_20346(class_4783.field_23256);
      this.method_20346(class_4783.field_23469);
      this.method_20346(class_4783.field_23221);
      this.method_20346(class_4783.field_23725);
      this.method_20346(class_4783.field_23216);
      this.method_20346(class_4783.field_23814);
      this.method_20346(class_4783.field_23481);
      this.method_20346(class_4783.field_23272);
      this.method_20346(class_4783.field_23365);
      this.method_20346(class_4783.field_23579);
      this.method_20346(class_4783.field_23764);
      this.method_20346(class_4783.field_23876);
      this.method_20346(class_4783.field_23189);
      this.method_20346(class_4783.field_23197);
      this.method_20346(class_4783.field_23691);
      this.method_20346(class_4783.field_23872);
      this.method_20346(class_4783.field_23599);
      this.method_20346(class_4783.field_23185);
      this.method_20346(class_4783.field_23832);
      this.method_20346(class_4783.field_23903);
      this.method_20346(class_4783.field_23612);
      this.method_20346(class_4783.field_23880);
      this.method_20346(class_4783.field_23732);
      this.method_20346(class_4783.field_23270);
      this.method_20346(class_4783.field_23241);
      this.method_20346(class_4783.field_23199);
      this.method_20346(class_4783.field_23882);
      this.method_20346(class_4783.field_23171);
      this.method_20346(class_4783.field_23237);
      this.method_20346(class_4783.field_23443);
      this.method_20346(class_4783.field_23631);
      this.method_20346(class_4783.field_23907);
      this.method_20346(class_4783.field_23798);
      this.method_20346(class_4783.field_23805);
      this.method_20346(class_4783.field_23473);
      this.method_20346(class_4783.field_23844);
      this.method_20346(class_4783.field_23626);
      this.method_20346(class_4783.field_23172);
      this.method_20346(class_4783.field_23803);
      this.method_20346(class_4783.field_23459);
      this.method_20346(class_4783.field_23250);
      this.method_20346(class_4783.field_23863);
      this.method_20346(class_4783.field_23472);
      this.method_20346(class_4783.field_23385);
      this.method_20346(class_4783.field_23517);
      this.method_20346(class_4783.field_23861);
      this.method_20346(class_4783.field_23649);
      this.method_20346(class_4783.field_23300);
      this.method_20346(class_4783.field_23619);
      this.method_20346(class_4783.field_23905);
      this.method_20346(class_4783.field_23294);
      this.method_20346(class_4783.field_23640);
      this.method_20346(class_4783.field_23609);
      this.method_20346(class_4783.field_23850);
      this.method_20346(class_4783.field_23898);
      this.method_20346(class_4783.field_23450);
      this.method_20346(class_4783.field_23289);
      this.method_20346(class_4783.field_23595);
      this.method_20346(class_4783.field_23624);
      this.method_20346(class_4783.field_23308);
      this.method_20346(class_4783.field_23825);
      this.method_20346(class_4783.field_23713);
      this.method_20346(class_4783.field_23428);
      this.method_20346(class_4783.field_23410);
      this.method_20346(class_4783.field_23762);
      this.method_20346(class_4783.field_23379);
      this.method_20346(class_4783.field_23275);
      this.method_20346(class_4783.field_23797);
      this.method_20346(class_4783.field_23181);
      this.method_20346(class_4783.field_23260);
      this.method_20346(class_4783.field_23528);
      this.method_20346(class_4783.field_23390);
      this.method_20346(class_4783.field_23282);
      this.method_20346(class_4783.field_23892);
      this.method_20346(class_4783.field_23401);
      this.method_20346(class_4783.field_23553);
      this.method_20346(class_4783.field_23729);
      this.method_20346(class_4783.field_23594);
      this.method_20346(class_4783.field_23692);
      this.method_20346(class_4783.field_23810);
      this.method_20346(class_4783.field_23422);
      this.method_20346(class_4783.field_23774);
      this.method_20346(class_4783.field_23881);
      this.method_20346(class_4783.field_23222);
      this.method_20346(class_4783.field_23521);
      this.method_20346(class_4783.field_23696);
      this.method_20346(class_4783.field_23349);
      this.method_20346(class_4783.field_23527);
      this.method_20346(class_4783.field_23794);
      this.method_20346(class_4783.field_23760);
      this.method_20346(class_4783.field_23589);
      this.method_20346(class_4783.field_23600);
      this.method_20346(class_4783.field_23734);
      this.method_20346(class_4783.field_23267);
      this.method_20346(class_4783.field_23918);
      this.method_20346(class_4783.field_23748);
      this.method_20346(class_4783.field_23540);
      this.method_20346(class_4783.field_23364);
      this.method_20346(class_4783.field_23806);
      this.method_20346(class_4783.field_23820);
      this.method_20346(class_4783.field_23233);
      this.method_20346(class_4783.field_23438);
      this.method_20346(class_4783.field_23309);
      this.method_20346(class_4783.field_23670);
      this.method_20346(class_4783.field_23555);
      this.method_20346(class_4783.field_23783);
      this.method_20346(class_4783.field_23834);
      this.method_20346(class_4783.field_23448);
      this.method_20346(class_4783.field_23500);
      this.method_20346(class_4783.field_23337);
      this.method_20346(class_4783.field_23312);
      this.method_20346(class_4783.field_23778);
      this.method_20346(class_4783.field_23871);
      this.method_20346(class_4783.field_23700);
      this.method_20346(class_4783.field_23784);
      this.method_20346(class_4783.field_23531);
      this.method_20346(class_4783.field_23788);
      this.method_20346(class_4783.field_23642);
      this.method_20346(class_4783.field_23749);
      this.method_20346(class_4783.field_23281);
      this.method_20346(class_4783.field_23855);
      this.method_20346(class_4783.field_23350);
      this.method_20346(class_4783.field_23567);
      this.method_20346(class_4783.field_23164);
      this.method_20346(class_4783.field_23684);
      this.method_20346(class_4783.field_23622);
      this.method_20346(class_4783.field_23513);
      this.method_20346(class_4783.field_23680);
      this.method_20346(class_4783.field_23355);
      this.method_20346(class_4783.field_23657);
      this.method_20346(class_4783.field_23262);
      this.method_20346(class_4783.field_23543);
      this.method_20346(class_4783.field_23817);
      this.method_20346(class_4783.field_23753);
      this.method_20346(class_4783.field_23613);
      this.method_20346(class_4783.field_23712);
      this.method_20346(class_4783.field_23860);
      this.method_20346(class_4783.field_23484);
      this.method_20346(class_4783.field_23587);
      this.method_20346(class_4783.field_23204);
      this.method_20346(class_4783.field_23673);
      this.method_20346(class_4783.field_23894);
      this.method_20346(class_4783.field_23541);
      this.method_20346(class_4783.field_23859);
      this.method_20346(class_4783.field_23812);
      this.method_20346(class_4783.field_23897);
      this.method_20346(class_4783.field_23759);
      this.method_20346(class_4783.field_23757);
      this.method_20346(class_4783.field_23568);
      this.method_20346(class_4783.field_23406);
      this.method_20346(class_4783.field_23755);
      this.method_20346(class_4783.field_23660);
      this.method_20346(class_4783.field_23200);
      this.method_20346(class_4783.field_23699);
      this.method_20346(class_4783.field_23672);
      this.method_20346(class_4783.field_23630);
      this.method_20346(class_4783.field_23494);
      this.method_20346(class_4783.field_23669);
      this.method_20346(class_4783.field_23878);
      this.method_20346(class_4783.field_23444);
      this.method_20346(class_4783.field_23635);
      this.method_20346(class_4783.field_23445);
      this.method_20346(class_4783.field_23363);
      this.method_20346(class_4783.field_23796);
      this.method_20346(class_4783.field_23839);
      this.method_20346(class_4783.field_23845);
      this.method_20346(class_4783.field_23919);
      this.method_20346(class_4783.field_23347);
      this.method_20346(class_4783.field_23166);
      this.method_20346(class_4783.field_23220);
      this.method_20346(class_4783.field_23658);
      this.method_20346(class_4783.field_23206);
      this.method_20346(class_4783.field_23614);
      this.method_20346(class_4783.field_23735);
      this.method_20346(class_4783.field_23343);
      this.method_20346(class_4783.field_23285);
      this.method_20346(class_4783.field_23264);
      this.method_20346(class_4783.field_23486);
      this.method_20346(class_4783.field_23908);
      this.method_20346(class_4783.field_23840);
      this.method_20346(class_4783.field_23243);
      this.method_20346(class_4783.field_23857);
      this.method_20346(class_4783.field_23625);
      this.method_20346(class_4783.field_23198);
      this.method_20346(class_4783.field_23229);
      this.method_20346(class_4783.field_23387);
      this.method_20346(class_4783.field_23816);
      this.method_20346(class_4783.field_23793);
      this.method_20346(class_4783.field_23330);
      this.method_20346(class_4783.field_23773);
      this.method_20346(class_4783.field_23659);
      this.method_20346(class_4783.field_23711);
      this.method_20346(class_4783.field_23636);
      this.method_20346(class_4783.field_23290);
      this.method_20346(class_4783.field_23498);
      this.method_20346(class_4783.field_23763);
      this.method_20346(class_4783.field_23186);
      this.method_20346(class_4783.field_23536);
      this.method_20346(class_4783.field_23441);
      this.method_20346(class_4783.field_23921);
      this.method_20346(class_4783.field_23341);
      this.method_20346(class_4783.field_23607);
      this.method_20346(class_4783.field_23429);
      this.method_20346(class_4783.field_23509);
      this.method_20346(class_4783.field_23920);
      this.method_20346(class_4783.field_23688);
      this.method_20346(class_4783.field_23298);
      this.method_20346(class_4783.field_23693);
      this.method_20346(class_4783.field_23359);
      this.method_20346(class_4783.field_23546);
      this.method_20346(class_4783.field_23497);
      this.method_20346(class_4783.field_23689);
      this.method_20346(class_4783.field_23662);
      this.method_20346(class_4783.field_23296);
      this.method_20346(class_4783.field_23841);
      this.method_20346(class_4783.field_23170);
      this.method_20346(class_4783.field_23569);
      this.method_20346(class_4783.field_23188);
      this.method_20346(class_4783.field_23656);
      this.method_20346(class_4783.field_23344);
      this.method_20346(class_4783.field_23580);
      this.method_20346(class_4783.field_23160);
      this.method_20346(class_4783.field_23236);
      this.method_20346(class_4783.field_23610);
      this.method_20346(class_4783.field_23455);
      this.method_20346(class_4783.field_23468);
      this.method_20346(class_4783.field_23505);
      this.method_20346(class_4783.field_23412);
      this.method_20346(class_4783.field_23743);
      this.method_20346(class_4783.field_23322);
      this.method_20346(class_4783.field_23391);
      this.method_20346(class_4783.field_23234);
      this.method_20346(class_4783.field_23618);
      this.method_20346(class_4783.field_23697);
      this.method_20346(class_4783.field_23792);
      this.method_20346(class_4783.field_23703);
      this.method_20346(class_4783.field_23694);
      this.method_20346(class_4783.field_23915);
      this.method_20346(class_4783.field_23499);
      this.method_20346(class_4783.field_23654);
      this.method_20346(class_4783.field_23403);
      this.method_20346(class_4783.field_23724);
      this.method_20346(class_4783.field_23183);
      this.method_20346(class_4783.field_23370);
      this.method_20346(class_4783.field_23215);
      this.method_20346(class_4783.field_23273);
      this.method_20346(class_4783.field_23419);
      this.method_20346(class_4783.field_23889);
      this.method_20346(class_4783.field_23367);
      this.method_20346(class_4783.field_23302);
      this.method_20346(class_4783.field_23416);
      this.method_20346(class_4783.field_23178);
      this.method_20346(class_4783.field_23404);
      this.method_20346(class_4783.field_23722);
      this.method_20346(class_4783.field_23548);
      this.method_20346(class_4783.field_23701);
      this.method_20346(class_4783.field_23277);
      this.method_20346(class_4783.field_23901);
      this.method_20346(class_4783.field_23603);
      this.method_20346(class_4783.field_23263);
      this.method_20346(class_4783.field_23581);
      this.method_20346(class_4783.field_23340);
      this.method_20346(class_4783.field_23360);
      this.method_20346(class_4783.field_23202);
      this.method_20346(class_4783.field_23477);
      this.method_20346(class_4783.field_23225);
      this.method_20346(class_4783.field_23315);
      this.method_20346(class_4783.field_23407);
      this.method_20346(class_4783.field_23685);
      this.method_20346(class_4783.field_23781);
      this.method_20346(class_4783.field_23418);
      this.method_20346(class_4783.field_23717);
      this.method_20346(class_4783.field_23305);
      this.method_20346(class_4783.field_23508);
      this.method_20346(class_4783.field_23887);
      this.method_20346(class_4783.field_23605);
      this.method_20346(class_4783.field_23842);
      this.method_20346(class_4783.field_23686);
      this.method_20346(class_4783.field_23621);
      this.method_20346(class_4783.field_23317);
      this.method_20346(class_4783.field_23791);
      this.method_20346(class_4783.field_23639);
      this.method_20346(class_4783.field_23891);
      this.method_20346(class_4783.field_23339);
      this.method_20346(class_4783.field_23307);
      this.method_20346(class_4783.field_23187);
      this.method_20346(class_4783.field_23572);
      this.method_20346(class_4783.field_23295);
      this.method_20346(class_4783.field_23167);
      this.method_20346(class_4783.field_23602);
      this.method_20346(class_4783.field_23529);
      this.method_20346(class_4783.field_23652);
      this.method_20346(class_4783.field_23458);
      this.method_20346(class_4783.field_23182);
      this.method_20346(class_4783.field_23606);
      this.method_20346(class_4783.field_23383);
      this.method_20346(class_4783.field_23715);
      this.method_20346(class_4783.field_23378);
      this.method_20346(class_4783.field_23325);
      this.method_20346(class_4783.field_23848);
      this.method_20346(class_4783.field_23414);
      this.method_20346(class_4783.field_23488);
      this.method_20346(class_4783.field_23266);
      this.method_20346(class_4783.field_23408);
      this.method_20346(class_4783.field_23374);
      this.method_20346(class_4783.field_23906);
      this.method_20346(class_4783.field_23615);
      this.method_20346(class_4783.field_23886);
      this.method_20346(class_4783.field_23286);
      this.method_20346(class_4783.field_23559);
      this.method_20346(class_4783.field_23276);
      this.method_20346(class_4783.field_23465);
      this.method_20346(class_4783.field_23675);
      this.method_20346(class_4783.field_23495);
      this.method_20346(class_4783.field_23502);
      this.method_20346(class_4783.field_23466);
      this.method_20346(class_4783.field_23255);
      this.method_20346(class_4783.field_23583);
      this.method_20346(class_4783.field_23632);
      this.method_20346(class_4783.field_23910);
      this.method_20346(class_4783.field_23396);
      this.method_20346(class_4783.field_23576);
      this.method_20346(class_4783.field_23480);
      this.method_20346(class_4783.field_23292);
      this.method_20346(class_4783.field_23193);
      this.method_20346(class_4783.field_23561);
      this.method_20346(class_4783.field_23420);
      this.method_20346(class_4783.field_23333);
      this.method_20346(class_4783.field_23230);
      this.method_20346(class_4783.field_23604);
      this.method_20346(class_4783.field_23767);
      this.method_20346(class_4783.field_23838);
      this.method_20346(class_4783.field_23866);
      this.method_20346(class_4783.field_23485);
      this.method_20346(class_4783.field_23853);
      this.method_20346(class_4783.field_23348);
      this.method_20346(class_4783.field_23899);
      this.method_20346(class_4783.field_23574);
      this.method_20346(class_4783.field_23807);
      this.method_20346(class_4783.field_23852);
      this.method_20346(class_4783.field_23442);
      this.method_20346(class_4783.field_23537);
      this.method_20346(class_4783.field_23809);
      this.method_20346(class_4783.field_23490);
      this.method_20346(class_4783.field_23912);
      this.method_20346(class_4783.field_23780);
      this.method_20346(class_4783.field_23435);
      this.method_20346(class_4783.field_23752);
      this.method_20346(class_4783.field_23830);
      this.method_20346(class_4783.field_23248);
      this.method_20346(class_4783.field_23661);
      this.method_20346(class_4783.field_23425);
      this.method_20346(class_4783.field_23593);
      this.method_20346(class_4783.field_23520);
      this.method_20346(class_4783.field_23251);
      this.method_20346(class_4783.field_23530);
      this.method_20346(class_4783.field_23570);
      this.method_20346(class_4783.field_23874);
      this.method_20346(class_4783.field_23864);
      this.method_20346(class_4783.field_23596);
      this.method_20346(class_4783.field_23516);
      this.method_20346(class_4783.field_23818);
      this.method_20346(class_4783.field_23728);
      this.method_20346(class_4783.field_23769);
      this.method_20346(class_4783.field_23211);
      this.method_20346(class_4783.field_23161);
      this.method_20346(class_4783.field_23785);
      this.method_20346(class_4783.field_23549);
      this.method_20346(class_4783.field_23214);
      this.method_20346(class_4783.field_23361);
      this.method_20346(class_4783.field_23884);
      this.method_20346(class_4783.field_23388);
      this.method_20346(class_4783.field_23751);
      this.method_20346(class_4783.field_23787);
      this.method_20346(class_4783.field_23534);
      this.method_20346(class_4783.field_23314);
      this.method_20346(class_4783.field_23397);
      this.method_20346(class_4783.field_23381);
      this.method_20346(class_4783.field_23165);
      this.method_20346(class_4783.field_23457);
      this.method_20346(class_4783.field_23560);
      this.method_20346(class_4783.field_23578);
      this.method_20346(class_4783.field_23708);
      this.method_20346(class_4783.field_23826);
      this.method_20346(class_4783.field_23679);
      this.method_20329(class_4783.field_23421, class_4783.field_23592);
      this.method_20329(class_4783.field_23460, class_4897.field_25259);
      this.method_20329(class_4783.field_23608, class_4783.field_23592);
      this.method_20329(class_4783.field_23371, class_4783.field_23325);
      this.method_20329(class_4783.field_23454, class_4783.field_23886);
      this.method_20354(class_4783.field_23644, var0 -> method_20350(var0, class_4783.field_23808));
      this.method_20354(class_4783.field_23259, var0 -> method_20350(var0, class_4783.field_23592));
      this.method_20354(class_4783.field_23201, var0 -> method_20350(var0, class_4783.field_23592));
      this.method_20354(class_4783.field_23162, var0 -> method_20350(var0, class_4783.field_23592));
      this.method_20354(class_4783.field_23664, var0 -> method_20350(var0, class_4783.field_23414));
      this.method_20354(class_4783.field_23324, var0 -> method_20350(var0, class_4783.field_23488));
      this.method_20354(class_4783.field_23801, var0 -> method_20350(var0, class_4783.field_23266));
      this.method_20354(class_4783.field_23240, var0 -> method_20350(var0, class_4783.field_23408));
      this.method_20354(class_4783.field_23590, var0 -> method_20350(var0, class_4783.field_23374));
      this.method_20354(class_4783.field_23598, var0 -> method_20350(var0, class_4783.field_23700));
      this.method_20354(class_4783.field_23209, var0 -> method_20350(var0, class_4783.field_23700));
      this.method_20354(class_4783.field_23313, var0 -> method_20362(var0, class_4897.field_24551, class_2728.method_12260(3)));
      this.method_20354(class_4783.field_23389, var0 -> method_20362(var0, class_4897.field_24789, class_2728.method_12260(4)));
      this.method_20354(class_4783.field_23492, var0 -> method_20362(var0, class_4783.field_23881, class_2728.method_12260(8)));
      this.method_20354(class_4783.field_23813, var0 -> method_20362(var0, class_4897.field_24601, class_2728.method_12260(4)));
      this.method_20355(class_4783.field_23634, method_20344(class_4897.field_24517, class_7986.method_36238(0.0F, 1.0F)));
      this.method_20334(class_4783.field_23232);
      this.method_20334(class_4783.field_23556);
      this.method_20334(class_4783.field_23827);
      this.method_20334(class_4783.field_23745);
      this.method_20334(class_4783.field_23357);
      this.method_20334(class_4783.field_23415);
      this.method_20334(class_4783.field_23278);
      this.method_20334(class_4783.field_23399);
      this.method_20334(class_4783.field_23628);
      this.method_20334(class_4783.field_23283);
      this.method_20334(class_4783.field_23375);
      this.method_20334(class_4783.field_23591);
      this.method_20334(class_4783.field_23210);
      this.method_20334(class_4783.field_23865);
      this.method_20334(class_4783.field_23782);
      this.method_20334(class_4783.field_23482);
      this.method_20334(class_4783.field_23244);
      this.method_20334(class_4783.field_23353);
      this.method_20334(class_4783.field_23668);
      this.method_20334(class_4783.field_23328);
      this.method_20334(class_4783.field_23356);
      this.method_20334(class_4783.field_23913);
      this.method_20334(class_4783.field_23224);
      this.method_20334(class_4783.field_23306);
      this.method_20334(class_4783.field_23180);
      this.method_20334(class_4783.field_23851);
      this.method_20334(class_4783.field_23402);
      this.method_20334(class_4783.field_23542);
      this.method_20334(class_4783.field_23704);
      this.method_20354(class_4783.field_23439, class_4370::method_20365);
      this.method_20354(class_4783.field_23393, class_4370::method_20365);
      this.method_20354(class_4783.field_23676, class_4370::method_20365);
      this.method_20354(class_4783.field_23351, class_4370::method_20365);
      this.method_20354(class_4783.field_23217, class_4370::method_20365);
      this.method_20354(class_4783.field_23687, class_4370::method_20365);
      this.method_20354(class_4783.field_23573, class_4370::method_20365);
      this.method_20354(class_4783.field_23737, class_4370::method_20365);
      this.method_20354(class_4783.field_23205, class_4370::method_20365);
      this.method_20354(class_4783.field_23822, class_4370::method_20365);
      this.method_20354(class_4783.field_23194, class_4370::method_20365);
      this.method_20354(class_4783.field_23398, class_4370::method_20365);
      this.method_20354(class_4783.field_23828, class_4370::method_20365);
      this.method_20354(class_4783.field_23506, class_4370::method_20365);
      this.method_20354(class_4783.field_23911, class_4370::method_20365);
      this.method_20354(class_4783.field_23575, class_4370::method_20365);
      this.method_20354(class_4783.field_23888, class_4370::method_20365);
      this.method_20354(class_4783.field_23532, class_4370::method_20365);
      this.method_20354(class_4783.field_23843, class_4370::method_20365);
      this.method_20354(class_4783.field_23449, class_4370::method_20365);
      this.method_20354(class_4783.field_23326, class_4370::method_20365);
      this.method_20354(class_4783.field_23547, class_4370::method_20365);
      this.method_20354(class_4783.field_23177, class_4370::method_20365);
      this.method_20354(class_4783.field_23849, class_4370::method_20365);
      this.method_20354(class_4783.field_23869, class_4370::method_20365);
      this.method_20354(class_4783.field_23667, class_4370::method_20365);
      this.method_20354(class_4783.field_23550, class_4370::method_20365);
      this.method_20354(class_4783.field_23453, class_4370::method_20365);
      this.method_20354(class_4783.field_23620, class_4370::method_20365);
      this.method_20354(class_4783.field_23451, class_4370::method_20365);
      this.method_20354(class_4783.field_23651, class_4370::method_20365);
      this.method_20354(class_4783.field_23191, class_4370::method_20365);
      this.method_20354(class_4783.field_23354, class_4370::method_20365);
      this.method_20354(class_4783.field_23710, class_4370::method_20365);
      this.method_20354(class_4783.field_23836, class_4370::method_20365);
      this.method_20354(class_4783.field_23479, class_4370::method_20365);
      this.method_20354(class_4783.field_23257, class_4370::method_20365);
      this.method_20354(class_4783.field_23726, class_4370::method_20365);
      this.method_20354(class_4783.field_23512, class_4370::method_20365);
      this.method_20354(class_4783.field_23395, class_4370::method_20365);
      this.method_20354(class_4783.field_23665, class_4370::method_20340);
      this.method_20354(class_4783.field_23382, class_4370::method_20340);
      this.method_20354(class_4783.field_23623, class_4370::method_20340);
      this.method_20354(class_4783.field_23847, class_4370::method_20340);
      this.method_20354(class_4783.field_23653, class_4370::method_20340);
      this.method_20354(class_4783.field_23746, class_4370::method_20340);
      this.method_20354(class_4783.field_23409, class_4370::method_20340);
      this.method_20354(class_4783.field_23253, class_4370::method_20340);
      this.method_20354(class_4783.field_23345, class_4370::method_20340);
      this.method_20354(class_4783.field_23518, var0 -> method_20347(var0, class_3633.field_17729, class_7095.field_36603));
      this.method_20354(class_4783.field_23723, var0 -> method_20347(var0, class_3633.field_17729, class_7095.field_36603));
      this.method_20354(class_4783.field_23342, var0 -> method_20347(var0, class_3633.field_17729, class_7095.field_36603));
      this.method_20354(class_4783.field_23789, var0 -> method_20347(var0, class_3633.field_17729, class_7095.field_36603));
      this.method_20354(class_4783.field_23369, var0 -> method_20347(var0, class_3633.field_17729, class_7095.field_36603));
      this.method_20354(class_4783.field_23303, var0 -> method_20347(var0, class_3633.field_17729, class_7095.field_36603));
      this.method_20354(class_4783.field_23246, var0 -> method_20347(var0, class_3633.field_17729, class_7095.field_36603));
      this.method_20354(class_4783.field_23677, var0 -> method_20347(var0, class_3633.field_17729, class_7095.field_36603));
      this.method_20354(class_4783.field_23226, var0 -> method_20347(var0, class_3633.field_17729, class_7095.field_36603));
      this.method_20354(class_4783.field_23377, var0 -> method_20347(var0, class_3633.field_17729, class_7095.field_36603));
      this.method_20354(class_4783.field_23332, var0 -> method_20347(var0, class_3633.field_17729, class_7095.field_36603));
      this.method_20354(class_4783.field_23158, var0 -> method_20347(var0, class_3633.field_17729, class_7095.field_36603));
      this.method_20354(class_4783.field_23489, var0 -> method_20347(var0, class_3633.field_17729, class_7095.field_36603));
      this.method_20354(class_4783.field_23526, var0 -> method_20347(var0, class_3633.field_17729, class_7095.field_36603));
      this.method_20354(class_4783.field_23346, var0 -> method_20347(var0, class_3633.field_17729, class_7095.field_36603));
      this.method_20354(class_4783.field_23758, var0 -> method_20347(var0, class_3633.field_17729, class_7095.field_36603));
      this.method_20354(class_4783.field_23690, var0 -> method_20347(var0, class_3064.field_15063, class_7422.field_37876));
      this.method_20354(class_4783.field_23554, var0 -> method_20347(var0, class_3064.field_15063, class_7422.field_37876));
      this.method_20354(class_4783.field_23213, var0 -> method_20347(var0, class_3064.field_15063, class_7422.field_37876));
      this.method_20354(class_4783.field_23738, var0 -> method_20347(var0, class_3064.field_15063, class_7422.field_37876));
      this.method_20355(
         class_4783.field_23252,
         class_1758.method_7864()
            .method_40676(
               method_20367(
                  class_4783.field_23252,
                  class_6282.method_28631()
                     .method_1777(class_2728.method_12260(1))
                     .method_1773(
                        class_3399.method_15699(class_4783.field_23252)
                           .method_16196(
                              class_5805.method_26299(class_4783.field_23252)
                                 .method_13828(class_7344.method_33475().method_33477(class_2727.field_13316, false))
                           )
                     )
               )
            )
      );
      this.method_20354(
         class_4783.field_23666,
         var0 -> class_1758.method_7864()
               .method_40676(
                  class_6282.method_28631()
                     .method_1777(class_2728.method_12260(1))
                     .method_1773(
                        (class_3516<?>)method_20360(
                           var0,
                           class_3399.method_15699(class_4897.field_24645)
                              .method_34360(
                                 class_6520.method_29699(class_2728.method_12260(3))
                                    .method_24477(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_2808.field_13783, 2)))
                              )
                        )
                     )
               )
      );
      this.method_20354(
         class_4783.field_23239,
         var0 -> class_1758.method_7864()
               .method_40676(
                  class_6282.method_28631()
                     .method_1777(class_2728.method_12260(1))
                     .method_1773(
                        (class_3516<?>)method_20360(
                           class_4783.field_23239,
                           class_3399.method_15699(var0)
                              .method_34360(
                                 class_6520.method_29699(class_2728.method_12260(2))
                                    .method_24477(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_6001.field_30566, 2)))
                              )
                              .method_34360(
                                 class_6520.method_29699(class_2728.method_12260(3))
                                    .method_24477(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_6001.field_30566, 3)))
                              )
                              .method_34360(
                                 class_6520.method_29699(class_2728.method_12260(4))
                                    .method_24477(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_6001.field_30566, 4)))
                              )
                        )
                     )
               )
      );
      this.method_20354(
         class_4783.field_23274,
         var0 -> class_1758.method_7864()
               .method_40676(class_6282.method_28631().method_1773((class_3516<?>)method_20360(var0, class_3399.method_15699(class_4897.field_24465))))
               .method_40676(
                  class_6282.method_28631()
                     .method_1773(class_3399.method_15699(class_4897.field_24640))
                     .method_1774(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_7689.field_39050, 8)))
               )
      );
      this.method_20354(class_4783.field_23862, class_4370::method_20357);
      this.method_20354(class_4783.field_23504, class_4370::method_20357);
      this.method_20354(class_4783.field_23471, class_4370::method_20357);
      this.method_20354(class_4783.field_23304, class_4370::method_20357);
      this.method_20354(class_4783.field_23914, class_4370::method_20357);
      this.method_20354(class_4783.field_23815, class_4370::method_20357);
      this.method_20354(class_4783.field_23883, class_4370::method_20357);
      this.method_20354(class_4783.field_23698, class_4370::method_20357);
      this.method_20354(class_4783.field_23739, class_4370::method_20357);
      this.method_20354(class_4783.field_23203, class_4370::method_20357);
      this.method_20354(class_4783.field_23557, class_4370::method_20357);
      this.method_20354(class_4783.field_23641, class_4370::method_20357);
      this.method_20354(class_4783.field_23431, class_4370::method_20357);
      this.method_20354(class_4783.field_23280, class_4370::method_20357);
      this.method_20354(class_4783.field_23461, class_4370::method_20357);
      this.method_20354(class_4783.field_23566, class_4370::method_20357);
      this.method_20354(class_4783.field_23646, class_4370::method_20357);
      this.method_20354(class_4783.field_23478, class_4370::method_20357);
      this.method_20354(class_4783.field_23870, class_4370::method_20343);
      this.method_20354(class_4783.field_23754, class_4370::method_20343);
      this.method_20354(class_4783.field_23538, class_4370::method_20343);
      this.method_20354(class_4783.field_23761, class_4370::method_20363);
      this.method_20354(class_4783.field_23169, class_4370::method_20363);
      this.method_20354(class_4783.field_23190, class_4370::method_20363);
      this.method_20354(class_4783.field_23475, class_4370::method_20363);
      this.method_20354(class_4783.field_23352, class_4370::method_20363);
      this.method_20354(class_4783.field_23533, class_4370::method_20363);
      this.method_20354(class_4783.field_23507, class_4370::method_20363);
      this.method_20354(class_4783.field_23564, class_4370::method_20363);
      this.method_20354(class_4783.field_23476, class_4370::method_20363);
      this.method_20354(class_4783.field_23524, class_4370::method_20363);
      this.method_20354(class_4783.field_23858, class_4370::method_20363);
      this.method_20354(class_4783.field_23228, class_4370::method_20363);
      this.method_20354(class_4783.field_23777, class_4370::method_20363);
      this.method_20354(class_4783.field_23293, class_4370::method_20363);
      this.method_20354(class_4783.field_23819, class_4370::method_20363);
      this.method_20354(class_4783.field_23873, class_4370::method_20363);
      this.method_20354(class_4783.field_23400, class_4370::method_20363);
      this.method_20354(class_4783.field_23487, class_4370::method_20331);
      this.method_20354(class_4783.field_23831, class_4370::method_20331);
      this.method_20354(class_4783.field_23447, class_4370::method_20331);
      this.method_20354(class_4783.field_23909, class_4370::method_20331);
      this.method_20354(class_4783.field_23705, class_4370::method_20331);
      this.method_20354(class_4783.field_23772, class_4370::method_20331);
      this.method_20354(class_4783.field_23902, class_4370::method_20331);
      this.method_20354(class_4783.field_23287, class_4370::method_20331);
      this.method_20354(class_4783.field_23775, class_4370::method_20331);
      this.method_20354(class_4783.field_23768, class_4370::method_20331);
      this.method_20354(class_4783.field_23706, class_4370::method_20331);
      this.method_20354(class_4783.field_23821, class_4370::method_20331);
      this.method_20354(class_4783.field_23168, class_4370::method_20331);
      this.method_20354(class_4783.field_23335, class_4370::method_20331);
      this.method_20354(class_4783.field_23597, class_4370::method_20331);
      this.method_20354(class_4783.field_23562, class_4370::method_20331);
      this.method_20354(
         class_4783.field_23525,
         var0 -> class_1758.method_7864()
               .method_40676(
                  method_20367(
                     var0,
                     class_6282.method_28631()
                        .method_1777(class_2728.method_12260(1))
                        .method_1773(
                           class_3399.method_15699(var0).method_34360(class_795.method_3533(class_9397.field_48027).method_15820("SkullOwner", "SkullOwner"))
                        )
                  )
               )
      );
      this.method_20354(class_4783.field_23611, class_4370::method_20338);
      this.method_20354(class_4783.field_23338, class_4370::method_20339);
      this.method_20354(class_4783.field_23467, var0 -> method_20337(var0, class_4783.field_23256, field_21437));
      this.method_20354(class_4783.field_23756, var0 -> method_20337(var0, class_4783.field_23221, field_21437));
      this.method_20354(class_4783.field_23386, var0 -> method_20337(var0, class_4783.field_23469, field_21436));
      this.method_20354(class_4783.field_23493, var0 -> method_20337(var0, class_4783.field_23483, field_21437));
      this.method_20354(class_4783.field_23539, var0 -> method_20368(var0, class_4783.field_23890, field_21437));
      this.method_20354(class_4783.field_23268, var0 -> method_20368(var0, class_4783.field_23725, field_21437));
      class_3029 var4 = class_5805.method_26299(class_4783.field_23310).method_13828(class_7344.method_33475().method_33480(class_1195.field_6691, 3));
      this.method_20355(class_4783.field_23310, method_20328(class_4783.field_23310, class_4897.field_24362, class_4897.field_24883, var4));
      class_3029 var5 = class_5805.method_26299(class_4783.field_23362).method_13828(class_7344.method_33475().method_33480(class_8557.field_43779, 7));
      this.method_20355(class_4783.field_23362, method_20328(class_4783.field_23362, class_4897.field_24813, class_4897.field_24621, var5));
      class_3029 var6 = class_5805.method_26299(class_4783.field_23327).method_13828(class_7344.method_33475().method_33480(class_9463.field_43779, 7));
      this.method_20355(
         class_4783.field_23327,
         method_20360(
            class_4783.field_23327,
            class_1758.method_7864()
               .method_40676(class_6282.method_28631().method_1773(class_3399.method_15699(class_4897.field_25136)))
               .method_40676(
                  class_6282.method_28631()
                     .method_1774(var6)
                     .method_1773(class_3399.method_15699(class_4897.field_25136).method_34360(class_5695.method_25769(class_3668.field_17876, 0.5714286F, 3)))
               )
         )
      );
      class_3029 var7 = class_5805.method_26299(class_4783.field_23638).method_13828(class_7344.method_33475().method_33480(class_8820.field_43779, 7));
      this.method_20355(
         class_4783.field_23638,
         method_20360(
            class_4783.field_23638,
            class_1758.method_7864()
               .method_40676(class_6282.method_28631().method_1773(class_3399.method_15699(class_4897.field_25273)))
               .method_40676(
                  class_6282.method_28631()
                     .method_1774(var7)
                     .method_1773(class_3399.method_15699(class_4897.field_25273).method_34360(class_5695.method_25769(class_3668.field_17876, 0.5714286F, 3)))
               )
               .method_40676(
                  class_6282.method_28631()
                     .method_1774(var7)
                     .method_1773(class_3399.method_15699(class_4897.field_25082).method_16196(class_6332.method_29003(0.02F)))
               )
         )
      );
      this.method_20354(
         class_4783.field_23637,
         var0 -> method_20360(
               var0,
               class_1758.method_7864()
                  .method_40676(
                     class_6282.method_28631()
                        .method_1774(
                           class_5805.method_26299(class_4783.field_23637).method_13828(class_7344.method_33475().method_33480(class_7086.field_36577, 3))
                        )
                        .method_1773(class_3399.method_15699(class_4897.field_25205))
                        .method_1779(class_6520.method_29699(class_7986.method_36238(2.0F, 3.0F)))
                        .method_1779(class_5695.method_25764(class_3668.field_17876))
                  )
                  .method_40676(
                     class_6282.method_28631()
                        .method_1774(
                           class_5805.method_26299(class_4783.field_23637).method_13828(class_7344.method_33475().method_33480(class_7086.field_36577, 2))
                        )
                        .method_1773(class_3399.method_15699(class_4897.field_25205))
                        .method_1779(class_6520.method_29699(class_7986.method_36238(1.0F, 2.0F)))
                        .method_1779(class_5695.method_25764(class_3668.field_17876))
                  )
            )
      );
      this.method_20354(class_4783.field_23682, var0 -> method_20345(var0, class_4783.field_23729));
      this.method_20354(class_4783.field_23714, var0 -> method_20345(var0, class_4783.field_23594));
      this.method_20354(class_4783.field_23867, var0 -> method_20353(var0, class_4897.field_24917));
      this.method_20354(class_4783.field_23463, var0 -> method_20353(var0, class_4897.field_24997));
      this.method_20354(class_4783.field_23196, var0 -> method_20353(var0, class_4897.field_24874));
      this.method_20354(class_4783.field_23681, var0 -> method_20353(var0, class_4897.field_24481));
      this.method_20354(
         class_4783.field_23249,
         var0 -> method_20349(
               var0,
               (class_3516<?>)method_20360(
                  var0,
                  class_3399.method_15699(class_4897.field_24659)
                     .method_34360(class_6520.method_29699(class_7986.method_36238(2.0F, 6.0F)))
                     .method_34360(class_5695.method_25768(class_3668.field_17876))
               )
            )
      );
      this.method_20354(
         class_4783.field_23584,
         var0 -> method_20349(
               var0,
               (class_3516<?>)method_20360(
                  var0,
                  class_3399.method_15699(class_4897.field_25047)
                     .method_34360(class_6520.method_29699(class_7986.method_36238(4.0F, 9.0F)))
                     .method_34360(class_5695.method_25768(class_3668.field_17876))
               )
            )
      );
      this.method_20354(class_4783.field_23718, var0 -> method_20351(var0, (class_3516<?>)method_20367(var0, class_3399.method_15699(class_4897.field_25259))));
      this.method_20354(
         class_4783.field_23254,
         var0 -> method_20356(
               var0,
               (class_3516<?>)method_20360(
                  var0, class_3399.method_15699(class_4897.field_24413).method_34360(class_6520.method_29699(class_7986.method_36238(0.0F, 2.0F)))
               )
            )
      );
      this.method_20354(class_4783.field_23585, class_4370::method_20336);
      this.method_20354(class_4783.field_23563, class_4370::method_20336);
      this.method_20354(class_4783.field_23323, class_4370::method_20336);
      this.method_20355(class_4783.field_23535, method_20359(class_4783.field_23563));
      this.method_20354(class_4783.field_23586, var0 -> method_20335(var0, class_4783.field_23616));
      this.method_20354(class_4783.field_23247, var0 -> method_20335(var0, class_4783.field_23868));
      this.method_20354(class_4783.field_23212, var0 -> method_20361(var0, class_4897.field_24435));
      this.method_20354(class_4783.field_23744, var0 -> method_20352(var0, class_4897.field_24435));
      this.method_20354(class_4783.field_23301, var0 -> method_20361(var0, class_4897.field_24480));
      this.method_20354(class_4783.field_23544, var0 -> method_20352(var0, class_4897.field_24480));
      this.method_20354(
         class_4783.field_23650,
         var0 -> class_1758.method_7864()
               .method_40676(
                  class_6282.method_28631()
                     .method_1777(class_2728.method_12260(1))
                     .method_1773(((class_7550)method_20367(var0, class_3399.method_15699(var0))).method_16196(class_2338.method_10700(class_5848.field_29714)))
               )
      );
      this.method_20354(class_4783.field_23616, class_4370::method_20358);
      this.method_20354(class_4783.field_23868, class_4370::method_20358);
      this.method_20354(
         class_4783.field_23368,
         var0 -> method_20349(
               var0,
               (class_3516<?>)method_20360(
                  var0,
                  class_3399.method_15699(class_4897.field_24777)
                     .method_34360(class_6520.method_29699(class_7986.method_36238(2.0F, 4.0F)))
                     .method_34360(class_5695.method_25764(class_3668.field_17876))
                     .method_34360(class_3098.method_14180(class_595.method_2795(1, 4)))
               )
            )
      );
      this.method_20354(
         class_4783.field_23261,
         var0 -> method_20349(
               var0,
               (class_3516<?>)method_20360(
                  var0,
                  class_3399.method_15699(class_4897.field_24341)
                     .method_34360(class_6520.method_29699(class_7986.method_36238(3.0F, 7.0F)))
                     .method_34360(class_5695.method_25764(class_3668.field_17876))
                     .method_34360(class_3098.method_14180(class_595.method_2793(9)))
               )
            )
      );
      this.method_20354(
         class_4783.field_23515,
         var0 -> method_20349(
               var0,
               (class_3516<?>)method_20360(
                  var0,
                  class_3399.method_15699(class_4897.field_24791)
                     .method_34360(class_6520.method_29699(class_7986.method_36238(4.0F, 5.0F)))
                     .method_34360(class_5695.method_25764(class_3668.field_17876))
               )
            )
      );
      this.method_20354(
         class_4783.field_23329,
         var0 -> method_20349(
               var0,
               (class_3516<?>)method_20360(
                  var0,
                  class_3399.method_15699(class_4897.field_24810)
                     .method_34360(class_6520.method_29699(class_7986.method_36238(2.0F, 3.0F)))
                     .method_34360(class_5695.method_25764(class_3668.field_17876))
                     .method_34360(class_3098.method_14180(class_595.method_2795(1, 5)))
               )
            )
      );
      this.method_20354(
         class_4783.field_23522,
         var0 -> class_1758.method_7864()
               .method_40676(
                  method_20360(
                     var0,
                     class_6282.method_28631()
                        .method_1777(class_2728.method_12260(1))
                        .method_1773(
                           class_3399.method_15699(class_4897.field_24573)
                              .method_34360(
                                 class_6520.method_29699(class_7986.method_36238(2.0F, 4.0F))
                                    .method_24477(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_3331.field_16435, 3)))
                              )
                              .method_34360(
                                 class_5695.method_25764(class_3668.field_17876)
                                    .method_24477(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_3331.field_16435, 3)))
                              )
                        )
                  )
               )
      );
      this.method_20354(
         class_4783.field_23552,
         var0 -> class_1758.method_7864()
               .method_40676(
                  class_6282.method_28631()
                     .method_1774(class_2338.method_10700(class_5848.field_29714))
                     .method_1773(
                        class_4108.method_19035(
                           class_4108.method_19035(
                                 class_3399.method_15699(class_4897.field_24601)
                                    .method_16196(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_163.field_493, 1))),
                                 class_3399.method_15699(class_4897.field_24601)
                                    .method_16196(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_163.field_493, 2)))
                                    .method_34360(class_6520.method_29699(class_2728.method_12260(2))),
                                 class_3399.method_15699(class_4897.field_24601)
                                    .method_16196(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_163.field_493, 3)))
                                    .method_34360(class_6520.method_29699(class_2728.method_12260(3))),
                                 class_3399.method_15699(class_4897.field_24601)
                                    .method_16196(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_163.field_493, 4)))
                                    .method_34360(class_6520.method_29699(class_2728.method_12260(4))),
                                 class_3399.method_15699(class_4897.field_24601)
                                    .method_16196(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_163.field_493, 5)))
                                    .method_34360(class_6520.method_29699(class_2728.method_12260(5))),
                                 class_3399.method_15699(class_4897.field_24601)
                                    .method_16196(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_163.field_493, 6)))
                                    .method_34360(class_6520.method_29699(class_2728.method_12260(6))),
                                 class_3399.method_15699(class_4897.field_24601)
                                    .method_16196(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_163.field_493, 7)))
                                    .method_34360(class_6520.method_29699(class_2728.method_12260(7))),
                                 class_3399.method_15699(class_4897.field_24601).method_34360(class_6520.method_29699(class_2728.method_12260(8)))
                              )
                              .method_16196(field_21435),
                           class_4108.method_19035(
                              class_3399.method_15699(class_4783.field_23552)
                                 .method_16196(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_163.field_493, 1))),
                              class_3399.method_15699(class_4783.field_23552)
                                 .method_34360(class_6520.method_29699(class_2728.method_12260(2)))
                                 .method_16196(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_163.field_493, 2))),
                              class_3399.method_15699(class_4783.field_23552)
                                 .method_34360(class_6520.method_29699(class_2728.method_12260(3)))
                                 .method_16196(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_163.field_493, 3))),
                              class_3399.method_15699(class_4783.field_23552)
                                 .method_34360(class_6520.method_29699(class_2728.method_12260(4)))
                                 .method_16196(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_163.field_493, 4))),
                              class_3399.method_15699(class_4783.field_23552)
                                 .method_34360(class_6520.method_29699(class_2728.method_12260(5)))
                                 .method_16196(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_163.field_493, 5))),
                              class_3399.method_15699(class_4783.field_23552)
                                 .method_34360(class_6520.method_29699(class_2728.method_12260(6)))
                                 .method_16196(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_163.field_493, 6))),
                              class_3399.method_15699(class_4783.field_23552)
                                 .method_34360(class_6520.method_29699(class_2728.method_12260(7)))
                                 .method_16196(class_5805.method_26299(var0).method_13828(class_7344.method_33475().method_33480(class_163.field_493, 7))),
                              class_3399.method_15699(class_4783.field_23813)
                           )
                        )
                     )
               )
      );
      this.method_20354(
         class_4783.field_23709,
         var0 -> method_20349(
               var0,
               method_20367(
                  var0,
                  class_3399.method_15699(class_4897.field_24720)
                     .method_16196(class_6783.method_31099(class_3668.field_17876, 0.1F, 0.14285715F, 0.25F, 1.0F))
                     .method_16199(class_3399.method_15699(var0))
               )
            )
      );
      this.method_20354(
         class_4783.field_23159,
         var0 -> method_20349(
               var0,
               (class_3516<?>)method_20367(
                  var0, class_3399.method_15699(class_4897.field_24862).method_34360(class_6520.method_29699(class_2728.method_12260(2)))
               )
            )
      );
      this.method_20354(
         class_4783.field_23179,
         var0 -> method_20349(
               var0,
               method_20367(
                  var0,
                  class_3399.method_15699(class_4897.field_24659)
                     .method_34360(class_6520.method_29699(class_7986.method_36238(2.0F, 5.0F)))
                     .method_16196(class_6783.method_31099(class_3668.field_17876, 0.1F, 0.14285715F, 0.25F, 1.0F))
                     .method_16199(class_3399.method_15699(var0))
               )
            )
      );
      this.method_20354(
         class_4783.field_23511,
         var0 -> method_20349(
               var0,
               (class_3516<?>)method_20367(
                  var0, class_3399.method_15699(class_4897.field_24762).method_34360(class_6520.method_29699(class_2728.method_12260(1)))
               )
            )
      );
      this.method_20332(class_4783.field_23434);
      this.method_20332(class_4783.field_23627);
      this.method_20332(class_4783.field_23854);
      this.method_20332(class_4783.field_23917);
      this.method_20332(class_4783.field_23426);
      this.method_20332(class_4783.field_23678);
      this.method_20332(class_4783.field_23173);
      this.method_20332(class_4783.field_23647);
      this.method_20332(class_4783.field_23242);
      this.method_20332(class_4783.field_23456);
      this.method_20332(class_4783.field_23804);
      this.method_20332(class_4783.field_23727);
      this.method_20332(class_4783.field_23501);
      this.method_20332(class_4783.field_23895);
      this.method_20332(class_4783.field_23432);
      this.method_20332(class_4783.field_23643);
      this.method_20332(class_4783.field_23750);
      this.method_20332(class_4783.field_23786);
      this.method_20332(class_4783.field_23720);
      this.method_20332(class_4783.field_23683);
      this.method_20332(class_4783.field_23510);
      this.method_20332(class_4783.field_23736);
      this.method_20332(class_4783.field_23856);
      this.method_20332(class_4783.field_23174);
      this.method_20332(class_4783.field_23766);
      this.method_20332(class_4783.field_23551);
      this.method_20332(class_4783.field_23218);
      this.method_20332(class_4783.field_23195);
      this.method_20332(class_4783.field_23776);
      this.method_20332(class_4783.field_23731);
      this.method_20332(class_4783.field_23721);
      this.method_20332(class_4783.field_23904);
      this.method_20332(class_4783.field_23795);
      this.method_20332(class_4783.field_23779);
      this.method_20332(class_4783.field_23496);
      this.method_20332(class_4783.field_23829);
      this.method_20332(class_4783.field_23437);
      this.method_20332(class_4783.field_23741);
      this.method_20332(class_4783.field_23331);
      this.method_20332(class_4783.field_23334);
      this.method_20332(class_4783.field_23238);
      this.method_20332(class_4783.field_23719);
      this.method_20332(class_4783.field_23417);
      this.method_20332(class_4783.field_23446);
      this.method_20332(class_4783.field_23297);
      this.method_20332(class_4783.field_23655);
      this.method_20332(class_4783.field_23879);
      this.method_20332(class_4783.field_23523);
      this.method_20332(class_4783.field_23219);
      this.method_20332(class_4783.field_23558);
      this.method_20332(class_4783.field_23452);
      this.method_20332(class_4783.field_23384);
      this.method_20332(class_4783.field_23245);
      this.method_20332(class_4783.field_23571);
      this.method_20332(class_4783.field_23223);
      this.method_20332(class_4783.field_23380);
      this.method_20332(class_4783.field_23800);
      this.method_20332(class_4783.field_23885);
      this.method_20332(class_4783.field_23733);
      this.method_20333(class_4783.field_23896, class_4783.field_23644);
      this.method_20333(class_4783.field_23835, class_4783.field_23808);
      this.method_20333(class_4783.field_23231, class_4783.field_23355);
      this.method_20333(class_4783.field_23235, class_4783.field_23657);
      this.method_20333(class_4783.field_23648, class_4783.field_23262);
      this.method_20333(class_4783.field_23519, class_4783.field_23543);
      this.method_20364(class_4783.field_23405, class_4783.field_23288);
      this.method_20364(class_4783.field_23175, class_4783.field_23671);
      this.method_20355(class_4783.field_23770, method_20348());
      this.method_20355(class_4783.field_23320, method_20348());
      this.method_20355(class_4783.field_23617, method_20348());
      this.method_20355(class_4783.field_23877, method_20348());
      this.method_20355(class_4783.field_23311, method_20348());
      this.method_20355(class_4783.field_23588, method_20348());
      HashSet var8 = Sets.newHashSet();

      for (class_6414 var10 : class_8669.field_44462) {
         class_4639 var11 = var10.method_10786();
         if (var11 != class_5931.field_30157 && var8.add(var11)) {
            class_8843 var12 = this.field_21438.remove(var11);
            if (var12 == null) {
               throw new IllegalStateException(String.format("Missing loottable '%s' for '%s'", var11, class_8669.field_44462.method_39797(var10)));
            }

            var1.accept(var11, var12);
         }
      }

      if (!this.field_21438.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.field_21438.keySet());
      }
   }

   private void method_20364(class_6414 var1, class_6414 var2) {
      class_8843 var5 = method_20351(
         var1, class_3399.method_15699(var1).method_16196(class_6783.method_31099(class_3668.field_17876, 0.33F, 0.55F, 0.77F, 1.0F))
      );
      this.method_20355(var1, var5);
      this.method_20355(var2, var5);
   }

   public static class_8843 method_20340(class_6414 var0) {
      return method_20347(var0, class_4115.field_20045, class_7422.field_37876);
   }

   public void method_20334(class_6414 var1) {
      this.method_20354(var1, var0 -> method_20330(((class_731)var0).method_3340()));
   }

   public void method_20333(class_6414 var1, class_6414 var2) {
      this.method_20355(var1, method_20366(var2));
   }

   public void method_20329(class_6414 var1, class_8525 var2) {
      this.method_20355(var1, method_20343(var2));
   }

   public void method_20332(class_6414 var1) {
      this.method_20333(var1, var1);
   }

   public void method_20346(class_6414 var1) {
      this.method_20329(var1, var1);
   }

   private void method_20354(class_6414 var1, Function<class_6414, class_8843> var2) {
      this.method_20355(var1, (class_8843)var2.apply(var1));
   }

   private void method_20355(class_6414 var1, class_8843 var2) {
      this.field_21438.put(var1.method_10786(), var2);
   }
}
