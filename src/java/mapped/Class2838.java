package mapped;

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

public class Class2838 implements Consumer<BiConsumer<ResourceLocation, Class5888>> {
   private static final Class7519 field17628 = Class159.method480(
      Class9735.method38146().method38150(new Class8605(Class8122.field34916, Class8840.method32014(1)))
   );
   private static final Class7519 field17629 = field17628.method24518();
   private static final Class7519 field17630 = Class159.method480(Class9735.method38146().method38147(Class8514.field37956));
   private static final Class7519 field17631 = field17630.method24516(field17628);
   private static final Class7519 field17632 = field17631.method24518();
   private static final Set<Class3257> field17633 = Stream.<Class3209>of(
         Class8487.field36652,
         Class8487.field36665,
         Class8487.field37007,
         Class8487.field36701,
         Class8487.field36703,
         Class8487.field36707,
         Class8487.field36705,
         Class8487.field36709,
         Class8487.field36711,
         Class8487.field36896,
         Class8487.field36912,
         Class8487.field36908,
         Class8487.field36909,
         Class8487.field36906,
         Class8487.field36904,
         Class8487.field36910,
         Class8487.field36900,
         Class8487.field36905,
         Class8487.field36902,
         Class8487.field36899,
         Class8487.field36898,
         Class8487.field36903,
         Class8487.field36907,
         Class8487.field36911,
         Class8487.field36897,
         Class8487.field36901
      )
      .<Class3257>map(Class3303::method11581)
      .collect(ImmutableSet.toImmutableSet());
   private static final float[] field17634 = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};
   private static final float[] field17635 = new float[]{0.025F, 0.027777778F, 0.03125F, 0.041666668F, 0.1F};
   private final Map<ResourceLocation, Class5888> field17636 = Maps.newHashMap();

   private static <T> T method11059(Class3303 var0, Class5871<T> var1) {
      return (T)(field17633.contains(var0.method11581()) ? var1.method18295() : var1.method18296(Class144.method442()));
   }

   private static <T> T method11060(Class3303 var0, Class5875<T> var1) {
      return (T)(field17633.contains(var0.method11581()) ? var1.method18295() : var1.method18297(Class162.method489()));
   }

   private static Class5888 method11061(Class3303 var0) {
      return Class7318.method23188()
         .method18320(method11060(var0, Class8894.method32373().method18289(Class6871.method20919(1)).method18291(Class4695.method14724(var0))));
   }

   private static Class5888 method11062(Class3209 var0, Class7519 var1, Class5873<?> var2) {
      return Class7318.method23188()
         .method18320(
            Class8894.method32373().method18289(Class6871.method20919(1)).method18291(Class4695.method14724(var0).method18297(var1).method18303(var2))
         );
   }

   private static Class5888 method11063(Class3209 var0, Class5873<?> var1) {
      return method11062(var0, field17628, var1);
   }

   private static Class5888 method11064(Class3209 var0, Class5873<?> var1) {
      return method11062(var0, field17630, var1);
   }

   private static Class5888 method11065(Class3209 var0, Class5873<?> var1) {
      return method11062(var0, field17631, var1);
   }

   private static Class5888 method11066(Class3209 var0, Class3303 var1) {
      return method11063(var0, (Class5873<?>)method11060(var0, Class4695.method14724(var1)));
   }

   private static Class5888 method11067(Class3303 var0, Class6870 var1) {
      return Class7318.method23188()
         .method18320(
            Class8894.method32373()
               .method18289(Class6871.method20919(1))
               .method18291((Class5873<?>)method11059(var0, Class4695.method14724(var0).method18296(Class140.method420(var1))))
         );
   }

   private static Class5888 method11068(Class3209 var0, Class3303 var1, Class6870 var2) {
      return method11063(var0, (Class5873<?>)method11059(var0, Class4695.method14724(var1).method18296(Class140.method420(var2))));
   }

   private static Class5888 method11069(Class3303 var0) {
      return Class7318.method23188()
         .method18320(Class8894.method32373().method18297(field17628).method18289(Class6871.method20919(1)).method18291(Class4695.method14724(var0)));
   }

   private static Class5888 method11070(Class3303 var0) {
      return Class7318.method23188()
         .method18320(
            method11060(
               Class8487.field36668, Class8894.method32373().method18289(Class6871.method20919(1)).method18291(Class4695.method14724(Class8487.field36668))
            )
         )
         .method18320(method11060(var0, Class8894.method32373().method18289(Class6871.method20919(1)).method18291(Class4695.method14724(var0))));
   }

   private static Class5888 method11071(Class3209 var0) {
      return Class7318.method23188()
         .method18320(
            Class8894.method32373()
               .method18289(Class6871.method20919(1))
               .method18291(
                  (Class5873<?>)method11059(
                     var0,
                     Class4695.method14724(var0)
                        .method18296(
                           Class140.method420(Class6871.method20919(2))
                              .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34329(Class3208.field18605, Class86.field220)))
                        )
                  )
               )
         );
   }

   private static <T extends Comparable<T> & Class83> Class5888 method11072(Class3209 var0, Class8550<T> var1, T var2) {
      return Class7318.method23188()
         .method18320(
            method11060(
               var0,
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(var0).method18297(Class161.method486(var0).method24519(Class9178.method34325().method34329(var1, (T)var2)))
                  )
            )
         );
   }

   private static Class5888 method11073(Class3209 var0) {
      return Class7318.method23188()
         .method18320(
            method11060(
               var0,
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(var0).method18296(Class139.method417(Class2138.field13999)))
            )
         );
   }

   private static Class5888 method11074(Class3209 var0) {
      return Class7318.method23188()
         .method18320(
            method11060(
               var0,
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(var0)
                        .method18296(Class139.method417(Class2138.field13999))
                        .method18296(
                           Class142.method431(Class2343.field16021)
                              .method18308("Lock", "BlockEntityTag.Lock")
                              .method18308("LootTable", "BlockEntityTag.LootTable")
                              .method18308("LootTableSeed", "BlockEntityTag.LootTableSeed")
                        )
                        .method18296(Class146.method446().method18319(Class4696.method14727(Class3368.field18940)))
                  )
            )
         );
   }

   private static Class5888 method11075(Class3209 var0) {
      return Class7318.method23188()
         .method18320(
            method11060(
               var0,
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(var0)
                        .method18296(Class139.method417(Class2138.field13999))
                        .method18296(Class142.method431(Class2343.field16021).method18308("Patterns", "BlockEntityTag.Patterns"))
                  )
            )
         );
   }

   private static Class5888 method11076(Class3209 var0) {
      return Class7318.method23188()
         .method18320(
            Class8894.method32373()
               .method18297(field17628)
               .method18289(Class6871.method20919(1))
               .method18291(
                  Class4695.method14724(var0)
                     .method18296(Class142.method431(Class2343.field16021).method18308("Bees", "BlockEntityTag.Bees"))
                     .method18296(Class129.method373(var0).method18312(Class3366.field18936))
               )
         );
   }

   private static Class5888 method11077(Class3209 var0) {
      return Class7318.method23188()
         .method18320(
            Class8894.method32373()
               .method18289(Class6871.method20919(1))
               .method18291(
                  Class4695.method14724(var0)
                     .method18297(field17628)
                     .method18296(Class142.method431(Class2343.field16021).method18308("Bees", "BlockEntityTag.Bees"))
                     .method18296(Class129.method373(var0).method18312(Class3366.field18936))
                     .method18303(Class4695.method14724(var0))
               )
         );
   }

   private static Class5888 method11078(Class3209 var0, Class3257 var1) {
      return method11063(var0, (Class5873<?>)method11059(var0, Class4695.method14724(var1).method18296(Class138.method407(Class8122.field34918))));
   }

   private static Class5888 method11079(Class3209 var0, Class3303 var1) {
      return method11063(
         var0,
         (Class5873<?>)method11059(
            var0,
            Class4695.method14724(var1)
               .method18296(Class140.method420(Class6872.method20921(-6.0F, 2.0F)))
               .method18296(Class135.method396(Class12.method59(0)))
         )
      );
   }

   private static Class5888 method11080(Class3209 var0) {
      return method11064(
         var0,
         (Class5873<?>)method11059(
            var0, Class4695.method14724(Class8514.field37841).method18297(Class151.method456(0.125F)).method18296(Class138.method409(Class8122.field34918, 2))
         )
      );
   }

   private static Class5888 method11081(Class3209 var0, Class3257 var1) {
      return Class7318.method23188()
         .method18320(
            method11059(
               var0,
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(
                     Class4695.method14724(var1)
                        .method18296(
                           Class140.method420(Class6869.method20915(3, 0.06666667F))
                              .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3486.field19347, 0)))
                        )
                        .method18296(
                           Class140.method420(Class6869.method20915(3, 0.13333334F))
                              .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3486.field19347, 1)))
                        )
                        .method18296(
                           Class140.method420(Class6869.method20915(3, 0.2F))
                              .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3486.field19347, 2)))
                        )
                        .method18296(
                           Class140.method420(Class6869.method20915(3, 0.26666668F))
                              .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3486.field19347, 3)))
                        )
                        .method18296(
                           Class140.method420(Class6869.method20915(3, 0.33333334F))
                              .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3486.field19347, 4)))
                        )
                        .method18296(
                           Class140.method420(Class6869.method20915(3, 0.4F))
                              .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3486.field19347, 5)))
                        )
                        .method18296(
                           Class140.method420(Class6869.method20915(3, 0.46666667F))
                              .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3486.field19347, 6)))
                        )
                        .method18296(
                           Class140.method420(Class6869.method20915(3, 0.53333336F))
                              .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3486.field19347, 7)))
                        )
                  )
            )
         );
   }

   private static Class5888 method11082(Class3209 var0, Class3257 var1) {
      return Class7318.method23188()
         .method18320(
            method11059(
               var0,
               Class8894.method32373()
                  .method18289(Class6871.method20919(1))
                  .method18291(Class4695.method14724(var1).method18296(Class140.method420(Class6869.method20915(3, 0.53333336F))))
            )
         );
   }

   private static Class5888 method11083(Class3303 var0) {
      return Class7318.method23188()
         .method18320(Class8894.method32373().method18289(Class6871.method20919(1)).method18297(field17630).method18291(Class4695.method14724(var0)));
   }

   private static Class5888 method11084(Class3209 var0, Class3209 var1, float... var2) {
      return method11065(var0, ((Class5872)method11060(var0, Class4695.method14724(var1))).method18297(Class158.method476(Class8122.field34918, var2)))
         .method18320(
            Class8894.method32373()
               .method18289(Class6871.method20919(1))
               .method18297(field17632)
               .method18291(
                  ((Class5872)method11059(var0, Class4695.method14724(Class8514.field37835).method18296(Class140.method420(Class6872.method20921(1.0F, 2.0F)))))
                     .method18297(Class158.method476(Class8122.field34918, 0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F))
               )
         );
   }

   private static Class5888 method11085(Class3209 var0, Class3209 var1, float... var2) {
      return method11084(var0, var1, var2)
         .method18320(
            Class8894.method32373()
               .method18289(Class6871.method20919(1))
               .method18297(field17632)
               .method18291(
                  ((Class5872)method11060(var0, Class4695.method14724(Class8514.field37795)))
                     .method18297(Class158.method476(Class8122.field34918, 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))
               )
         );
   }

   private static Class5888 method11086(Class3209 var0, Class3257 var1, Class3257 var2, Class7519 var3) {
      return method11059(
         var0,
         Class7318.method23188()
            .method18320(Class8894.method32373().method18291(Class4695.method14724(var1).method18297(var3).method18303(Class4695.method14724(var2))))
            .method18320(
               Class8894.method32373()
                  .method18297(var3)
                  .method18291(Class4695.method14724(var2).method18296(Class138.method406(Class8122.field34918, 0.5714286F, 3)))
            )
      );
   }

   private static Class5888 method11087(Class3209 var0) {
      return Class7318.method23188()
         .method18320(
            Class8894.method32373().method18297(field17630).method18291(Class4695.method14724(var0).method18296(Class140.method420(Class6871.method20919(2))))
         );
   }

   private static Class5888 method11088(Class3209 var0, Class3209 var1) {
      Class5874 var4 = Class4695.method14724(var1)
         .method18296(Class140.method420(Class6871.method20919(2)))
         .method18297(field17630)
         .method18303(((Class5872)method11060(var0, Class4695.method14724(Class8514.field37841))).method18297(Class151.method456(0.125F)));
      return Class7318.method23188()
         .method18320(
            Class8894.method32373()
               .method18291(var4)
               .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34329(Class3456.field19276, Class84.field210)))
               .method18297(
                  Class155.method468(
                     Class8912.method32576()
                        .method32578(
                           Class8831.method31929()
                              .method31930(var0)
                              .method31932(Class9178.method34325().method34329(Class3456.field19276, Class84.field209).method34330())
                              .method31933()
                        ),
                     new BlockPos(0, 1, 0)
                  )
               )
         )
         .method18320(
            Class8894.method32373()
               .method18291(var4)
               .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34329(Class3456.field19276, Class84.field209)))
               .method18297(
                  Class155.method468(
                     Class8912.method32576()
                        .method32578(
                           Class8831.method31929()
                              .method31930(var0)
                              .method31932(Class9178.method34325().method34329(Class3456.field19276, Class84.field210).method34330())
                              .method31933()
                        ),
                     new BlockPos(0, -1, 0)
                  )
               )
         );
   }

   public static Class5888 method11089() {
      return Class7318.method23188();
   }

   public void accept(BiConsumer<ResourceLocation, Class5888> var1) {
      this.method11096(Class8487.field36389);
      this.method11096(Class8487.field36390);
      this.method11096(Class8487.field36391);
      this.method11096(Class8487.field36392);
      this.method11096(Class8487.field36393);
      this.method11096(Class8487.field36394);
      this.method11096(Class8487.field36396);
      this.method11096(Class8487.field36397);
      this.method11096(Class8487.field36399);
      this.method11096(Class8487.field36400);
      this.method11096(Class8487.field36401);
      this.method11096(Class8487.field36402);
      this.method11096(Class8487.field36403);
      this.method11096(Class8487.field36404);
      this.method11096(Class8487.field36405);
      this.method11096(Class8487.field36406);
      this.method11096(Class8487.field36407);
      this.method11096(Class8487.field36408);
      this.method11096(Class8487.field36409);
      this.method11096(Class8487.field36410);
      this.method11096(Class8487.field36411);
      this.method11096(Class8487.field36415);
      this.method11096(Class8487.field36416);
      this.method11096(Class8487.field36418);
      this.method11096(Class8487.field36419);
      this.method11096(Class8487.field36422);
      this.method11096(Class8487.field36423);
      this.method11096(Class8487.field36424);
      this.method11096(Class8487.field36425);
      this.method11096(Class8487.field36426);
      this.method11096(Class8487.field36427);
      this.method11096(Class8487.field36428);
      this.method11096(Class8487.field36429);
      this.method11096(Class8487.field36430);
      this.method11096(Class8487.field36431);
      this.method11096(Class8487.field36432);
      this.method11096(Class8487.field36433);
      this.method11096(Class8487.field37071);
      this.method11096(Class8487.field37080);
      this.method11096(Class8487.field36434);
      this.method11096(Class8487.field36435);
      this.method11096(Class8487.field36436);
      this.method11096(Class8487.field36437);
      this.method11096(Class8487.field36438);
      this.method11096(Class8487.field36439);
      this.method11096(Class8487.field36440);
      this.method11096(Class8487.field36441);
      this.method11096(Class8487.field36442);
      this.method11096(Class8487.field36443);
      this.method11096(Class8487.field36444);
      this.method11096(Class8487.field36445);
      this.method11096(Class8487.field37082);
      this.method11096(Class8487.field37073);
      this.method11096(Class8487.field36452);
      this.method11096(Class8487.field36453);
      this.method11096(Class8487.field36456);
      this.method11096(Class8487.field36458);
      this.method11096(Class8487.field36459);
      this.method11096(Class8487.field36460);
      this.method11096(Class8487.field36461);
      this.method11096(Class8487.field36478);
      this.method11096(Class8487.field36479);
      this.method11096(Class8487.field36480);
      this.method11096(Class8487.field36487);
      this.method11096(Class8487.field36489);
      this.method11096(Class8487.field36490);
      this.method11096(Class8487.field36491);
      this.method11096(Class8487.field36492);
      this.method11096(Class8487.field36493);
      this.method11096(Class8487.field36494);
      this.method11096(Class8487.field36495);
      this.method11096(Class8487.field36496);
      this.method11096(Class8487.field36497);
      this.method11096(Class8487.field36498);
      this.method11096(Class8487.field36499);
      this.method11096(Class8487.field36500);
      this.method11096(Class8487.field36501);
      this.method11096(Class8487.field36502);
      this.method11096(Class8487.field36503);
      this.method11096(Class8487.field36504);
      this.method11096(Class8487.field36506);
      this.method11096(Class8487.field36507);
      this.method11096(Class8487.field36508);
      this.method11096(Class8487.field36509);
      this.method11096(Class8487.field36510);
      this.method11096(Class8487.field36511);
      this.method11096(Class8487.field36512);
      this.method11096(Class8487.field36513);
      this.method11096(Class8487.field36514);
      this.method11096(Class8487.field36515);
      this.method11096(Class8487.field36516);
      this.method11096(Class8487.field36517);
      this.method11096(Class8487.field36518);
      this.method11096(Class8487.field36519);
      this.method11096(Class8487.field36520);
      this.method11096(Class8487.field36521);
      this.method11096(Class8487.field36522);
      this.method11096(Class8487.field36523);
      this.method11096(Class8487.field36526);
      this.method11096(Class8487.field36527);
      this.method11096(Class8487.field37123);
      this.method11096(Class8487.field36528);
      this.method11096(Class8487.field36533);
      this.method11096(Class8487.field36535);
      this.method11096(Class8487.field36537);
      this.method11096(Class8487.field36538);
      this.method11096(Class8487.field36542);
      this.method11096(Class8487.field36543);
      this.method11096(Class8487.field36544);
      this.method11096(Class8487.field36545);
      this.method11096(Class8487.field36546);
      this.method11096(Class8487.field36547);
      this.method11096(Class8487.field36549);
      this.method11096(Class8487.field36550);
      this.method11096(Class8487.field36551);
      this.method11096(Class8487.field36558);
      this.method11096(Class8487.field36559);
      this.method11096(Class8487.field36561);
      this.method11096(Class8487.field36562);
      this.method11096(Class8487.field36563);
      this.method11096(Class8487.field36564);
      this.method11096(Class8487.field36565);
      this.method11096(Class8487.field36566);
      this.method11096(Class8487.field36568);
      this.method11096(Class8487.field36570);
      this.method11096(Class8487.field36574);
      this.method11096(Class8487.field36576);
      this.method11096(Class8487.field36577);
      this.method11096(Class8487.field36578);
      this.method11096(Class8487.field36579);
      this.method11096(Class8487.field36580);
      this.method11096(Class8487.field36581);
      this.method11096(Class8487.field36582);
      this.method11096(Class8487.field36583);
      this.method11096(Class8487.field36584);
      this.method11096(Class8487.field36585);
      this.method11096(Class8487.field36589);
      this.method11096(Class8487.field36590);
      this.method11096(Class8487.field36592);
      this.method11096(Class8487.field36609);
      this.method11096(Class8487.field36610);
      this.method11096(Class8487.field36611);
      this.method11096(Class8487.field36612);
      this.method11096(Class8487.field36613);
      this.method11096(Class8487.field36614);
      this.method11096(Class8487.field36615);
      this.method11096(Class8487.field36616);
      this.method11096(Class8487.field36617);
      this.method11096(Class8487.field36618);
      this.method11096(Class8487.field36628);
      this.method11096(Class8487.field36637);
      this.method11096(Class8487.field36638);
      this.method11096(Class8487.field36639);
      this.method11096(Class8487.field36641);
      this.method11096(Class8487.field36642);
      this.method11096(Class8487.field36643);
      this.method11096(Class8487.field36644);
      this.method11096(Class8487.field36648);
      this.method11096(Class8487.field36651);
      this.method11096(Class8487.field36653);
      this.method11096(Class8487.field36655);
      this.method11096(Class8487.field36658);
      this.method11096(Class8487.field36660);
      this.method11096(Class8487.field36661);
      this.method11096(Class8487.field36662);
      this.method11096(Class8487.field36663);
      this.method11096(Class8487.field36666);
      this.method11096(Class8487.field36667);
      this.method11096(Class8487.field36668);
      this.method11096(Class8487.field36695);
      this.method11096(Class8487.field36696);
      this.method11096(Class8487.field36697);
      this.method11096(Class8487.field36698);
      this.method11096(Class8487.field36699);
      this.method11096(Class8487.field36700);
      this.method11096(Class8487.field36701);
      this.method11096(Class8487.field36703);
      this.method11096(Class8487.field36705);
      this.method11096(Class8487.field36709);
      this.method11096(Class8487.field36711);
      this.method11096(Class8487.field36713);
      this.method11096(Class8487.field36714);
      this.method11096(Class8487.field36715);
      this.method11096(Class8487.field36717);
      this.method11096(Class8487.field36718);
      this.method11096(Class8487.field36719);
      this.method11096(Class8487.field36720);
      this.method11096(Class8487.field36721);
      this.method11096(Class8487.field36724);
      this.method11096(Class8487.field36725);
      this.method11096(Class8487.field36726);
      this.method11096(Class8487.field36727);
      this.method11096(Class8487.field36728);
      this.method11096(Class8487.field36730);
      this.method11096(Class8487.field36731);
      this.method11096(Class8487.field36732);
      this.method11096(Class8487.field36733);
      this.method11096(Class8487.field36734);
      this.method11096(Class8487.field36735);
      this.method11096(Class8487.field36736);
      this.method11096(Class8487.field36737);
      this.method11096(Class8487.field36738);
      this.method11096(Class8487.field36739);
      this.method11096(Class8487.field36740);
      this.method11096(Class8487.field36741);
      this.method11096(Class8487.field36742);
      this.method11096(Class8487.field36743);
      this.method11096(Class8487.field36744);
      this.method11096(Class8487.field36745);
      this.method11096(Class8487.field36762);
      this.method11096(Class8487.field36763);
      this.method11096(Class8487.field36764);
      this.method11096(Class8487.field36766);
      this.method11096(Class8487.field36767);
      this.method11096(Class8487.field36768);
      this.method11096(Class8487.field36769);
      this.method11096(Class8487.field36770);
      this.method11096(Class8487.field36771);
      this.method11096(Class8487.field36772);
      this.method11096(Class8487.field36777);
      this.method11096(Class8487.field36778);
      this.method11096(Class8487.field36779);
      this.method11096(Class8487.field36780);
      this.method11096(Class8487.field36781);
      this.method11096(Class8487.field36782);
      this.method11096(Class8487.field36783);
      this.method11096(Class8487.field36784);
      this.method11096(Class8487.field36785);
      this.method11096(Class8487.field36786);
      this.method11096(Class8487.field36787);
      this.method11096(Class8487.field36788);
      this.method11096(Class8487.field36789);
      this.method11096(Class8487.field36790);
      this.method11096(Class8487.field36791);
      this.method11096(Class8487.field36792);
      this.method11096(Class8487.field36793);
      this.method11096(Class8487.field36794);
      this.method11096(Class8487.field36795);
      this.method11096(Class8487.field36835);
      this.method11096(Class8487.field36836);
      this.method11096(Class8487.field36837);
      this.method11096(Class8487.field36838);
      this.method11096(Class8487.field36858);
      this.method11096(Class8487.field36859);
      this.method11096(Class8487.field36860);
      this.method11096(Class8487.field36861);
      this.method11096(Class8487.field36862);
      this.method11096(Class8487.field36863);
      this.method11096(Class8487.field36864);
      this.method11096(Class8487.field36865);
      this.method11096(Class8487.field36866);
      this.method11096(Class8487.field36867);
      this.method11096(Class8487.field36868);
      this.method11096(Class8487.field36869);
      this.method11096(Class8487.field36870);
      this.method11096(Class8487.field36871);
      this.method11096(Class8487.field36877);
      this.method11096(Class8487.field36880);
      this.method11096(Class8487.field36881);
      this.method11096(Class8487.field36882);
      this.method11096(Class8487.field36883);
      this.method11096(Class8487.field36890);
      this.method11096(Class8487.field36891);
      this.method11096(Class8487.field36892);
      this.method11096(Class8487.field36893);
      this.method11096(Class8487.field36895);
      this.method11096(Class8487.field37116);
      this.method11096(Class8487.field36913);
      this.method11096(Class8487.field36914);
      this.method11096(Class8487.field36915);
      this.method11096(Class8487.field36916);
      this.method11096(Class8487.field36917);
      this.method11096(Class8487.field36918);
      this.method11096(Class8487.field36919);
      this.method11096(Class8487.field36920);
      this.method11096(Class8487.field36921);
      this.method11096(Class8487.field36922);
      this.method11096(Class8487.field36923);
      this.method11096(Class8487.field36924);
      this.method11096(Class8487.field36925);
      this.method11096(Class8487.field36926);
      this.method11096(Class8487.field36927);
      this.method11096(Class8487.field36928);
      this.method11096(Class8487.field36929);
      this.method11096(Class8487.field36930);
      this.method11096(Class8487.field36931);
      this.method11096(Class8487.field36932);
      this.method11096(Class8487.field36933);
      this.method11096(Class8487.field36934);
      this.method11096(Class8487.field36935);
      this.method11096(Class8487.field36936);
      this.method11096(Class8487.field36937);
      this.method11096(Class8487.field36938);
      this.method11096(Class8487.field36939);
      this.method11096(Class8487.field36940);
      this.method11096(Class8487.field36941);
      this.method11096(Class8487.field36942);
      this.method11096(Class8487.field36943);
      this.method11096(Class8487.field36944);
      this.method11096(Class8487.field36945);
      this.method11096(Class8487.field36946);
      this.method11096(Class8487.field36947);
      this.method11096(Class8487.field36948);
      this.method11096(Class8487.field36949);
      this.method11096(Class8487.field36950);
      this.method11096(Class8487.field36951);
      this.method11096(Class8487.field36952);
      this.method11096(Class8487.field36953);
      this.method11096(Class8487.field36954);
      this.method11096(Class8487.field36955);
      this.method11096(Class8487.field36956);
      this.method11096(Class8487.field36957);
      this.method11096(Class8487.field36958);
      this.method11096(Class8487.field36959);
      this.method11096(Class8487.field36960);
      this.method11096(Class8487.field36961);
      this.method11096(Class8487.field36963);
      this.method11096(Class8487.field36965);
      this.method11096(Class8487.field36966);
      this.method11096(Class8487.field36967);
      this.method11096(Class8487.field36968);
      this.method11096(Class8487.field36969);
      this.method11096(Class8487.field37007);
      this.method11096(Class8487.field36652);
      this.method11096(Class8487.field37009);
      this.method11096(Class8487.field37014);
      this.method11096(Class8487.field37015);
      this.method11096(Class8487.field37016);
      this.method11096(Class8487.field37017);
      this.method11096(Class8487.field37018);
      this.method11096(Class8487.field37019);
      this.method11096(Class8487.field37020);
      this.method11096(Class8487.field37021);
      this.method11096(Class8487.field37022);
      this.method11096(Class8487.field37023);
      this.method11096(Class8487.field37024);
      this.method11096(Class8487.field37025);
      this.method11096(Class8487.field37026);
      this.method11096(Class8487.field37027);
      this.method11096(Class8487.field37041);
      this.method11096(Class8487.field37042);
      this.method11096(Class8487.field37043);
      this.method11096(Class8487.field37044);
      this.method11096(Class8487.field37045);
      this.method11096(Class8487.field37046);
      this.method11096(Class8487.field37047);
      this.method11096(Class8487.field37048);
      this.method11096(Class8487.field37049);
      this.method11096(Class8487.field37050);
      this.method11096(Class8487.field37051);
      this.method11096(Class8487.field37052);
      this.method11096(Class8487.field37054);
      this.method11096(Class8487.field37053);
      this.method11096(Class8487.field37119);
      this.method11096(Class8487.field37120);
      this.method11096(Class8487.field37124);
      this.method11096(Class8487.field37129);
      this.method11096(Class8487.field37070);
      this.method11096(Class8487.field37072);
      this.method11096(Class8487.field37075);
      this.method11096(Class8487.field37076);
      this.method11096(Class8487.field37079);
      this.method11096(Class8487.field37081);
      this.method11096(Class8487.field37084);
      this.method11096(Class8487.field37085);
      this.method11096(Class8487.field37091);
      this.method11096(Class8487.field37092);
      this.method11096(Class8487.field37096);
      this.method11096(Class8487.field37098);
      this.method11096(Class8487.field37100);
      this.method11096(Class8487.field37102);
      this.method11096(Class8487.field37104);
      this.method11096(Class8487.field37106);
      this.method11096(Class8487.field37110);
      this.method11096(Class8487.field37095);
      this.method11096(Class8487.field37097);
      this.method11096(Class8487.field37099);
      this.method11096(Class8487.field37101);
      this.method11096(Class8487.field37103);
      this.method11096(Class8487.field37105);
      this.method11096(Class8487.field37109);
      this.method11096(Class8487.field37121);
      this.method11096(Class8487.field37122);
      this.method11096(Class8487.field37130);
      this.method11096(Class8487.field37135);
      this.method11096(Class8487.field37139);
      this.method11096(Class8487.field37131);
      this.method11096(Class8487.field37132);
      this.method11096(Class8487.field37140);
      this.method11096(Class8487.field37137);
      this.method11096(Class8487.field37136);
      this.method11096(Class8487.field37134);
      this.method11096(Class8487.field37142);
      this.method11096(Class8487.field37144);
      this.method11096(Class8487.field37145);
      this.method11096(Class8487.field37146);
      this.method11096(Class8487.field37147);
      this.method11096(Class8487.field37148);
      this.method11096(Class8487.field37149);
      this.method11096(Class8487.field36629);
      this.method11096(Class8487.field37077);
      this.method11096(Class8487.field37090);
      this.method11094(Class8487.field36540, Class8487.field36396);
      this.method11094(Class8487.field36659, Class8514.field37838);
      this.method11094(Class8487.field36885, Class8487.field36396);
      this.method11094(Class8487.field36962, Class8487.field36961);
      this.method11094(Class8487.field37008, Class8487.field37009);
      this.method11097(Class8487.field36388, var0 -> method11066(var0, Class8487.field36399));
      this.method11097(Class8487.field36395, var0 -> method11066(var0, Class8487.field36396));
      this.method11097(Class8487.field36398, var0 -> method11066(var0, Class8487.field36396));
      this.method11097(Class8487.field36640, var0 -> method11066(var0, Class8487.field36396));
      this.method11097(Class8487.field36970, var0 -> method11066(var0, Class8487.field36965));
      this.method11097(Class8487.field36971, var0 -> method11066(var0, Class8487.field36966));
      this.method11097(Class8487.field36972, var0 -> method11066(var0, Class8487.field36967));
      this.method11097(Class8487.field36973, var0 -> method11066(var0, Class8487.field36968));
      this.method11097(Class8487.field36974, var0 -> method11066(var0, Class8487.field36969));
      this.method11097(Class8487.field37083, var0 -> method11066(var0, Class8487.field36580));
      this.method11097(Class8487.field37074, var0 -> method11066(var0, Class8487.field36580));
      this.method11097(Class8487.field36525, var0 -> method11068(var0, Class8514.field37900, Class6871.method20919(3)));
      this.method11097(Class8487.field36575, var0 -> method11068(var0, Class8514.field37897, Class6871.method20919(4)));
      this.method11097(Class8487.field36657, var0 -> method11068(var0, Class8487.field36527, Class6871.method20919(8)));
      this.method11097(Class8487.field36573, var0 -> method11068(var0, Class8514.field37888, Class6871.method20919(4)));
      this.method11098(Class8487.field36878, method11067(Class8514.field38109, Class6872.method20921(0.0F, 1.0F)));
      this.method11092(Class8487.field36669);
      this.method11092(Class8487.field36670);
      this.method11092(Class8487.field36671);
      this.method11092(Class8487.field36672);
      this.method11092(Class8487.field36673);
      this.method11092(Class8487.field36674);
      this.method11092(Class8487.field36675);
      this.method11092(Class8487.field36676);
      this.method11092(Class8487.field36677);
      this.method11092(Class8487.field36678);
      this.method11092(Class8487.field36679);
      this.method11092(Class8487.field36680);
      this.method11092(Class8487.field36681);
      this.method11092(Class8487.field36682);
      this.method11092(Class8487.field36683);
      this.method11092(Class8487.field36684);
      this.method11092(Class8487.field36685);
      this.method11092(Class8487.field36686);
      this.method11092(Class8487.field36687);
      this.method11092(Class8487.field36688);
      this.method11092(Class8487.field36689);
      this.method11092(Class8487.field36690);
      this.method11092(Class8487.field36691);
      this.method11092(Class8487.field36692);
      this.method11092(Class8487.field37010);
      this.method11092(Class8487.field37125);
      this.method11092(Class8487.field37126);
      this.method11092(Class8487.field37127);
      this.method11092(Class8487.field37128);
      this.method11097(Class8487.field36843, Class2838::method11071);
      this.method11097(Class8487.field36841, Class2838::method11071);
      this.method11097(Class8487.field36851, Class2838::method11071);
      this.method11097(Class8487.field36850, Class2838::method11071);
      this.method11097(Class8487.field36844, Class2838::method11071);
      this.method11097(Class8487.field36775, Class2838::method11071);
      this.method11097(Class8487.field36842, Class2838::method11071);
      this.method11097(Class8487.field36853, Class2838::method11071);
      this.method11097(Class8487.field36839, Class2838::method11071);
      this.method11097(Class8487.field36849, Class2838::method11071);
      this.method11097(Class8487.field36774, Class2838::method11071);
      this.method11097(Class8487.field36773, Class2838::method11071);
      this.method11097(Class8487.field36857, Class2838::method11071);
      this.method11097(Class8487.field36854, Class2838::method11071);
      this.method11097(Class8487.field36855, Class2838::method11071);
      this.method11097(Class8487.field36847, Class2838::method11071);
      this.method11097(Class8487.field36856, Class2838::method11071);
      this.method11097(Class8487.field36848, Class2838::method11071);
      this.method11097(Class8487.field36840, Class2838::method11071);
      this.method11097(Class8487.field36852, Class2838::method11071);
      this.method11097(Class8487.field36845, Class2838::method11071);
      this.method11097(Class8487.field36846, Class2838::method11071);
      this.method11097(Class8487.field37028, Class2838::method11071);
      this.method11097(Class8487.field37029, Class2838::method11071);
      this.method11097(Class8487.field37030, Class2838::method11071);
      this.method11097(Class8487.field37031, Class2838::method11071);
      this.method11097(Class8487.field37032, Class2838::method11071);
      this.method11097(Class8487.field37033, Class2838::method11071);
      this.method11097(Class8487.field37034, Class2838::method11071);
      this.method11097(Class8487.field37035, Class2838::method11071);
      this.method11097(Class8487.field37036, Class2838::method11071);
      this.method11097(Class8487.field37037, Class2838::method11071);
      this.method11097(Class8487.field37038, Class2838::method11071);
      this.method11097(Class8487.field37039, Class2838::method11071);
      this.method11097(Class8487.field37040, Class2838::method11071);
      this.method11097(Class8487.field37093, Class2838::method11071);
      this.method11097(Class8487.field37094, Class2838::method11071);
      this.method11097(Class8487.field37133, Class2838::method11071);
      this.method11097(Class8487.field37138, Class2838::method11071);
      this.method11097(Class8487.field37143, Class2838::method11071);
      this.method11097(Class8487.field36875, Class2838::method11091);
      this.method11097(Class8487.field36873, Class2838::method11091);
      this.method11097(Class8487.field36876, Class2838::method11091);
      this.method11097(Class8487.field36560, Class2838::method11091);
      this.method11097(Class8487.field36874, Class2838::method11091);
      this.method11097(Class8487.field36548, Class2838::method11091);
      this.method11097(Class8487.field36872, Class2838::method11091);
      this.method11097(Class8487.field37108, Class2838::method11091);
      this.method11097(Class8487.field37107, Class2838::method11091);
      this.method11097(Class8487.field36477, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Class8487.field36473, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Class8487.field36474, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Class8487.field36471, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Class8487.field36469, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Class8487.field36475, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Class8487.field36465, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Class8487.field36470, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Class8487.field36467, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Class8487.field36464, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Class8487.field36472, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Class8487.field36463, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Class8487.field36468, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Class8487.field36476, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Class8487.field36462, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Class8487.field36466, var0 -> method11072(var0, Class3250.field18713, Class82.field205));
      this.method11097(Class8487.field36798, var0 -> method11072(var0, Class3456.field19276, Class84.field210));
      this.method11097(Class8487.field36797, var0 -> method11072(var0, Class3456.field19276, Class84.field210));
      this.method11097(Class8487.field36800, var0 -> method11072(var0, Class3456.field19276, Class84.field210));
      this.method11097(Class8487.field36799, var0 -> method11072(var0, Class3456.field19276, Class84.field210));
      this.method11098(
         Class8487.field36524,
         Class7318.method23188()
            .method18320(
               method11060(
                  Class8487.field36524,
                  Class8894.method32373()
                     .method18289(Class6871.method20919(1))
                     .method18291(
                        Class4695.method14724(Class8487.field36524)
                           .method18297(Class161.method486(Class8487.field36524).method24519(Class9178.method34325().method34328(Class3458.field19279, false)))
                     )
               )
            )
      );
      this.method11097(
         Class8487.field36654,
         var0 -> Class7318.method23188()
               .method18320(
                  Class8894.method32373()
                     .method18289(Class6871.method20919(1))
                     .method18291(
                        (Class5873<?>)method11059(
                           var0,
                           Class4695.method14724(Class8514.field37916)
                              .method18296(
                                 Class140.method420(Class6871.method20919(3))
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3197.field18479, 2)))
                              )
                        )
                     )
               )
      );
      this.method11097(
         Class8487.field37005,
         var0 -> Class7318.method23188()
               .method18320(
                  Class8894.method32373()
                     .method18289(Class6871.method20919(1))
                     .method18291(
                        (Class5873<?>)method11059(
                           Class8487.field37005,
                           Class4695.method14724(var0)
                              .method18296(
                                 Class140.method420(Class6871.method20919(2))
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3195.field18472, 2)))
                              )
                              .method18296(
                                 Class140.method420(Class6871.method20919(3))
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3195.field18472, 3)))
                              )
                              .method18296(
                                 Class140.method420(Class6871.method20919(4))
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3195.field18472, 4)))
                              )
                        )
                     )
               )
      );
      this.method11097(
         Class8487.field37115,
         var0 -> Class7318.method23188()
               .method18320(Class8894.method32373().method18291((Class5873<?>)method11059(var0, Class4695.method14724(Class8514.field38157))))
               .method18320(
                  Class8894.method32373()
                     .method18291(Class4695.method14724(Class8514.field37934))
                     .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3475.field19326, 8)))
               )
      );
      this.method11097(Class8487.field36665, Class2838::method11073);
      this.method11097(Class8487.field36647, Class2838::method11073);
      this.method11097(Class8487.field36534, Class2838::method11073);
      this.method11097(Class8487.field36457, Class2838::method11073);
      this.method11097(Class8487.field36729, Class2838::method11073);
      this.method11097(Class8487.field36646, Class2838::method11073);
      this.method11097(Class8487.field36541, Class2838::method11073);
      this.method11097(Class8487.field36723, Class2838::method11073);
      this.method11097(Class8487.field36716, Class2838::method11073);
      this.method11097(Class8487.field37056, Class2838::method11073);
      this.method11097(Class8487.field37057, Class2838::method11073);
      this.method11097(Class8487.field37055, Class2838::method11073);
      this.method11097(Class8487.field37058, Class2838::method11073);
      this.method11097(Class8487.field37059, Class2838::method11073);
      this.method11097(Class8487.field37060, Class2838::method11073);
      this.method11097(Class8487.field37061, Class2838::method11073);
      this.method11097(Class8487.field37062, Class2838::method11073);
      this.method11097(Class8487.field37063, Class2838::method11073);
      this.method11097(Class8487.field37064, Class2838::method11061);
      this.method11097(Class8487.field37065, Class2838::method11061);
      this.method11097(Class8487.field37066, Class2838::method11061);
      this.method11097(Class8487.field36896, Class2838::method11074);
      this.method11097(Class8487.field36912, Class2838::method11074);
      this.method11097(Class8487.field36908, Class2838::method11074);
      this.method11097(Class8487.field36909, Class2838::method11074);
      this.method11097(Class8487.field36906, Class2838::method11074);
      this.method11097(Class8487.field36904, Class2838::method11074);
      this.method11097(Class8487.field36910, Class2838::method11074);
      this.method11097(Class8487.field36900, Class2838::method11074);
      this.method11097(Class8487.field36905, Class2838::method11074);
      this.method11097(Class8487.field36902, Class2838::method11074);
      this.method11097(Class8487.field36899, Class2838::method11074);
      this.method11097(Class8487.field36898, Class2838::method11074);
      this.method11097(Class8487.field36903, Class2838::method11074);
      this.method11097(Class8487.field36907, Class2838::method11074);
      this.method11097(Class8487.field36911, Class2838::method11074);
      this.method11097(Class8487.field36897, Class2838::method11074);
      this.method11097(Class8487.field36901, Class2838::method11074);
      this.method11097(Class8487.field36818, Class2838::method11075);
      this.method11097(Class8487.field36814, Class2838::method11075);
      this.method11097(Class8487.field36815, Class2838::method11075);
      this.method11097(Class8487.field36812, Class2838::method11075);
      this.method11097(Class8487.field36810, Class2838::method11075);
      this.method11097(Class8487.field36816, Class2838::method11075);
      this.method11097(Class8487.field36806, Class2838::method11075);
      this.method11097(Class8487.field36811, Class2838::method11075);
      this.method11097(Class8487.field36808, Class2838::method11075);
      this.method11097(Class8487.field36805, Class2838::method11075);
      this.method11097(Class8487.field36804, Class2838::method11075);
      this.method11097(Class8487.field36809, Class2838::method11075);
      this.method11097(Class8487.field36813, Class2838::method11075);
      this.method11097(Class8487.field36817, Class2838::method11075);
      this.method11097(Class8487.field36803, Class2838::method11075);
      this.method11097(Class8487.field36807, Class2838::method11075);
      this.method11097(
         Class8487.field36707,
         var0 -> Class7318.method23188()
               .method18320(
                  method11060(
                     var0,
                     Class8894.method32373()
                        .method18289(Class6871.method20919(1))
                        .method18291(Class4695.method14724(var0).method18296(Class142.method431(Class2343.field16021).method18308("SkullOwner", "SkullOwner")))
                  )
               )
      );
      this.method11097(Class8487.field37117, Class2838::method11076);
      this.method11097(Class8487.field37118, Class2838::method11077);
      this.method11097(Class8487.field36448, var0 -> method11084(var0, Class8487.field36408, field17634));
      this.method11097(Class8487.field36450, var0 -> method11084(var0, Class8487.field36410, field17634));
      this.method11097(Class8487.field36449, var0 -> method11084(var0, Class8487.field36409, field17635));
      this.method11097(Class8487.field36447, var0 -> method11084(var0, Class8487.field36407, field17634));
      this.method11097(Class8487.field36446, var0 -> method11085(var0, Class8487.field36406, field17634));
      this.method11097(Class8487.field36451, var0 -> method11085(var0, Class8487.field36411, field17634));
      Class7520 var4 = Class161.method486(Class8487.field36884).method24519(Class9178.method34325().method34327(Class3482.field19337, 3));
      this.method11098(Class8487.field36884, method11086(Class8487.field36884, Class8514.field38111, Class8514.field38112, var4));
      Class7520 var5 = Class161.method486(Class8487.field36539).method24519(Class9178.method34325().method34327(Class3480.field19334, 7));
      this.method11098(Class8487.field36539, method11086(Class8487.field36539, Class8514.field37842, Class8514.field37841, var5));
      Class7520 var6 = Class161.method486(Class8487.field36693).method24519(Class9178.method34325().method34327(Class3483.field19334, 7));
      this.method11098(
         Class8487.field36693,
         method11059(
            Class8487.field36693,
            Class7318.method23188()
               .method18320(Class8894.method32373().method18291(Class4695.method14724(Class8514.field38052)))
               .method18320(
                  Class8894.method32373()
                     .method18297(var6)
                     .method18291(Class4695.method14724(Class8514.field38052).method18296(Class138.method406(Class8122.field34918, 0.5714286F, 3)))
               )
         )
      );
      Class7520 var7 = Class161.method486(Class8487.field36694).method24519(Class9178.method34325().method34327(Class3481.field19334, 7));
      this.method11098(
         Class8487.field36694,
         method11059(
            Class8487.field36694,
            Class7318.method23188()
               .method18320(Class8894.method32373().method18291(Class4695.method14724(Class8514.field38053)))
               .method18320(
                  Class8894.method32373()
                     .method18297(var7)
                     .method18291(Class4695.method14724(Class8514.field38053).method18296(Class138.method406(Class8122.field34918, 0.5714286F, 3)))
               )
               .method18320(
                  Class8894.method32373().method18297(var7).method18291(Class4695.method14724(Class8514.field38055).method18297(Class151.method456(0.02F)))
               )
         )
      );
      this.method11097(
         Class8487.field37069,
         var0 -> method11059(
               var0,
               Class7318.method23188()
                  .method18320(
                     Class8894.method32373()
                        .method18297(Class161.method486(Class8487.field37069).method24519(Class9178.method34325().method34327(Class3484.field19342, 3)))
                        .method18291(Class4695.method14724(Class8514.field38170))
                        .method18296(Class140.method420(Class6872.method20921(2.0F, 3.0F)))
                        .method18296(Class138.method408(Class8122.field34918))
                  )
                  .method18320(
                     Class8894.method32373()
                        .method18297(Class161.method486(Class8487.field37069).method24519(Class9178.method34325().method34327(Class3484.field19342, 2)))
                        .method18291(Class4695.method14724(Class8514.field38170))
                        .method18296(Class140.method420(Class6872.method20921(1.0F, 2.0F)))
                        .method18296(Class138.method408(Class8122.field34918))
                  )
            )
      );
      this.method11097(Class8487.field36625, var0 -> method11079(var0, Class8487.field36519));
      this.method11097(Class8487.field36626, var0 -> method11079(var0, Class8487.field36520));
      this.method11097(Class8487.field36420, var0 -> method11078(var0, Class8514.field37798));
      this.method11097(Class8487.field36656, var0 -> method11078(var0, Class8514.field38049));
      this.method11097(Class8487.field36722, var0 -> method11078(var0, Class8514.field38072));
      this.method11097(Class8487.field36536, var0 -> method11078(var0, Class8514.field37800));
      this.method11097(
         Class8487.field36421,
         var0 -> method11063(
               var0,
               (Class5873<?>)method11059(
                  var0,
                  Class4695.method14724(Class8514.field37969)
                     .method18296(Class140.method420(Class6872.method20921(2.0F, 6.0F)))
                     .method18296(Class138.method407(Class8122.field34918))
               )
            )
      );
      this.method11097(
         Class8487.field36455,
         var0 -> method11063(
               var0,
               (Class5873<?>)method11059(
                  var0,
                  Class4695.method14724(Class8514.field37917)
                     .method18296(Class140.method420(Class6872.method20921(4.0F, 9.0F)))
                     .method18296(Class138.method407(Class8122.field34918))
               )
            )
      );
      this.method11097(Class8487.field36481, var0 -> method11065(var0, (Class5873<?>)method11060(var0, Class4695.method14724(Class8514.field37838))));
      this.method11097(
         Class8487.field36484,
         var0 -> method11064(
               var0,
               (Class5873<?>)method11059(var0, Class4695.method14724(Class8514.field37835).method18296(Class140.method420(Class6872.method20921(0.0F, 2.0F))))
            )
      );
      this.method11097(Class8487.field37078, Class2838::method11083);
      this.method11097(Class8487.field36485, Class2838::method11083);
      this.method11097(Class8487.field36636, Class2838::method11083);
      this.method11098(Class8487.field36486, method11087(Class8487.field36485));
      this.method11097(Class8487.field36802, var0 -> method11088(var0, Class8487.field36483));
      this.method11097(Class8487.field36801, var0 -> method11088(var0, Class8487.field36482));
      this.method11097(Class8487.field36635, var0 -> method11081(var0, Class8514.field37960));
      this.method11097(Class8487.field36633, var0 -> method11082(var0, Class8514.field37960));
      this.method11097(Class8487.field36634, var0 -> method11081(var0, Class8514.field37959));
      this.method11097(Class8487.field36632, var0 -> method11082(var0, Class8514.field37959));
      this.method11097(
         Class8487.field36879,
         var0 -> Class7318.method23188()
               .method18320(
                  Class8894.method32373()
                     .method18289(Class6871.method20919(1))
                     .method18291(((Class5872)method11060(var0, Class4695.method14724(var0))).method18297(Class123.method356(Class2063.field13447)))
               )
      );
      this.method11097(Class8487.field36483, Class2838::method11080);
      this.method11097(Class8487.field36482, Class2838::method11080);
      this.method11097(
         Class8487.field36587,
         var0 -> method11063(
               var0,
               (Class5873<?>)method11059(
                  var0,
                  Class4695.method14724(Class8514.field37908)
                     .method18296(Class140.method420(Class6872.method20921(2.0F, 4.0F)))
                     .method18296(Class138.method408(Class8122.field34918))
                     .method18296(Class135.method396(Class12.method58(1, 4)))
               )
            )
      );
      this.method11097(
         Class8487.field36631,
         var0 -> method11063(
               var0,
               (Class5873<?>)method11059(
                  var0,
                  Class4695.method14724(Class8514.field37957)
                     .method18296(Class140.method420(Class6872.method20921(3.0F, 7.0F)))
                     .method18296(Class138.method408(Class8122.field34918))
                     .method18296(Class135.method396(Class12.method60(9)))
               )
            )
      );
      this.method11097(
         Class8487.field36567,
         var0 -> method11063(
               var0,
               (Class5873<?>)method11059(
                  var0,
                  Class4695.method14724(Class8514.field37887)
                     .method18296(Class140.method420(Class6872.method20921(4.0F, 5.0F)))
                     .method18296(Class138.method408(Class8122.field34918))
               )
            )
      );
      this.method11097(
         Class8487.field36776,
         var0 -> method11063(
               var0,
               (Class5873<?>)method11059(
                  var0,
                  Class4695.method14724(Class8514.field38076)
                     .method18296(Class140.method420(Class6872.method20921(2.0F, 3.0F)))
                     .method18296(Class138.method408(Class8122.field34918))
                     .method18296(Class135.method396(Class12.method58(1, 5)))
               )
            )
      );
      this.method11097(
         Class8487.field36645,
         var0 -> Class7318.method23188()
               .method18320(
                  method11059(
                     var0,
                     Class8894.method32373()
                        .method18289(Class6871.method20919(1))
                        .method18291(
                           Class4695.method14724(Class8514.field37970)
                              .method18296(
                                 Class140.method420(Class6872.method20921(2.0F, 4.0F))
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3489.field19354, 3)))
                              )
                              .method18296(
                                 Class138.method408(Class8122.field34918)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3489.field19354, 3)))
                              )
                        )
                  )
               )
      );
      this.method11097(
         Class8487.field36571,
         var0 -> Class7318.method23188()
               .method18320(
                  Class8894.method32373()
                     .method18297(Class123.method356(Class2063.field13447))
                     .method18291(
                        Class4690.method14712(
                           Class4690.method14712(
                                 Class4695.method14724(Class8514.field37888)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 1))),
                                 Class4695.method14724(Class8514.field37888)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 2)))
                                    .method18296(Class140.method420(Class6871.method20919(2))),
                                 Class4695.method14724(Class8514.field37888)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 3)))
                                    .method18296(Class140.method420(Class6871.method20919(3))),
                                 Class4695.method14724(Class8514.field37888)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 4)))
                                    .method18296(Class140.method420(Class6871.method20919(4))),
                                 Class4695.method14724(Class8514.field37888)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 5)))
                                    .method18296(Class140.method420(Class6871.method20919(5))),
                                 Class4695.method14724(Class8514.field37888)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 6)))
                                    .method18296(Class140.method420(Class6871.method20919(6))),
                                 Class4695.method14724(Class8514.field37888)
                                    .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 7)))
                                    .method18296(Class140.method420(Class6871.method20919(7))),
                                 Class4695.method14724(Class8514.field37888).method18296(Class140.method420(Class6871.method20919(8)))
                              )
                              .method18297(field17629),
                           Class4690.method14712(
                              Class4695.method14724(Class8487.field36571)
                                 .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 1))),
                              Class4695.method14724(Class8487.field36571)
                                 .method18296(Class140.method420(Class6871.method20919(2)))
                                 .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 2))),
                              Class4695.method14724(Class8487.field36571)
                                 .method18296(Class140.method420(Class6871.method20919(3)))
                                 .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 3))),
                              Class4695.method14724(Class8487.field36571)
                                 .method18296(Class140.method420(Class6871.method20919(4)))
                                 .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 4))),
                              Class4695.method14724(Class8487.field36571)
                                 .method18296(Class140.method420(Class6871.method20919(5)))
                                 .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 5))),
                              Class4695.method14724(Class8487.field36571)
                                 .method18296(Class140.method420(Class6871.method20919(6)))
                                 .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 6))),
                              Class4695.method14724(Class8487.field36571)
                                 .method18296(Class140.method420(Class6871.method20919(7)))
                                 .method18297(Class161.method486(var0).method24519(Class9178.method34325().method34327(Class3410.field19092, 7))),
                              Class4695.method14724(Class8487.field36573)
                           )
                        )
                     )
               )
      );
      this.method11097(
         Class8487.field36417,
         var0 -> method11063(
               var0,
               method11060(
                  var0,
                  Class4695.method14724(Class8514.field37868)
                     .method18297(Class158.method476(Class8122.field34918, 0.1F, 0.14285715F, 0.25F, 1.0F))
                     .method18303(Class4695.method14724(var0))
               )
            )
      );
      this.method11097(
         Class8487.field37067,
         var0 -> method11063(
               var0, (Class5873<?>)method11060(var0, Class4695.method14724(Class8514.field37799).method18296(Class140.method420(Class6871.method20919(2))))
            )
      );
      this.method11097(
         Class8487.field37141,
         var0 -> method11063(
               var0,
               method11060(
                  var0,
                  Class4695.method14724(Class8514.field37969)
                     .method18296(Class140.method420(Class6872.method20921(2.0F, 5.0F)))
                     .method18297(Class158.method476(Class8122.field34918, 0.1F, 0.14285715F, 0.25F, 1.0F))
                     .method18303(Class4695.method14724(var0))
               )
            )
      );
      this.method11097(
         Class8487.field37068,
         var0 -> method11063(
               var0, (Class5873<?>)method11060(var0, Class4695.method14724(Class8514.field37442).method18296(Class140.method420(Class6871.method20919(1))))
            )
      );
      this.method11095(Class8487.field36454);
      this.method11095(Class8487.field36593);
      this.method11095(Class8487.field36594);
      this.method11095(Class8487.field36595);
      this.method11095(Class8487.field36596);
      this.method11095(Class8487.field36597);
      this.method11095(Class8487.field36598);
      this.method11095(Class8487.field36599);
      this.method11095(Class8487.field36600);
      this.method11095(Class8487.field36601);
      this.method11095(Class8487.field36602);
      this.method11095(Class8487.field36603);
      this.method11095(Class8487.field36604);
      this.method11095(Class8487.field36605);
      this.method11095(Class8487.field36606);
      this.method11095(Class8487.field36607);
      this.method11095(Class8487.field36608);
      this.method11095(Class8487.field36630);
      this.method11095(Class8487.field36746);
      this.method11095(Class8487.field36747);
      this.method11095(Class8487.field36748);
      this.method11095(Class8487.field36749);
      this.method11095(Class8487.field36750);
      this.method11095(Class8487.field36751);
      this.method11095(Class8487.field36752);
      this.method11095(Class8487.field36753);
      this.method11095(Class8487.field36754);
      this.method11095(Class8487.field36755);
      this.method11095(Class8487.field36756);
      this.method11095(Class8487.field36757);
      this.method11095(Class8487.field36758);
      this.method11095(Class8487.field36759);
      this.method11095(Class8487.field36760);
      this.method11095(Class8487.field36761);
      this.method11095(Class8487.field36572);
      this.method11095(Class8487.field36796);
      this.method11095(Class8487.field37006);
      this.method11095(Class8487.field36964);
      this.method11095(Class8487.field36627);
      this.method11095(Class8487.field36975);
      this.method11095(Class8487.field36976);
      this.method11095(Class8487.field36977);
      this.method11095(Class8487.field36978);
      this.method11095(Class8487.field36979);
      this.method11095(Class8487.field36980);
      this.method11095(Class8487.field36981);
      this.method11095(Class8487.field36982);
      this.method11095(Class8487.field36983);
      this.method11095(Class8487.field36984);
      this.method11095(Class8487.field36985);
      this.method11095(Class8487.field36986);
      this.method11095(Class8487.field36987);
      this.method11095(Class8487.field36988);
      this.method11095(Class8487.field36989);
      this.method11095(Class8487.field36990);
      this.method11095(Class8487.field36991);
      this.method11095(Class8487.field36992);
      this.method11095(Class8487.field36993);
      this.method11095(Class8487.field36994);
      this.method11093(Class8487.field36619, Class8487.field36388);
      this.method11093(Class8487.field36620, Class8487.field36399);
      this.method11093(Class8487.field36621, Class8487.field36615);
      this.method11093(Class8487.field36622, Class8487.field36616);
      this.method11093(Class8487.field36623, Class8487.field36617);
      this.method11093(Class8487.field36624, Class8487.field36618);
      this.method11090(Class8487.field37086, Class8487.field37087);
      this.method11090(Class8487.field37088, Class8487.field37089);
      this.method11098(Class8487.field36591, method11089());
      this.method11098(Class8487.field36889, method11089());
      this.method11098(Class8487.field36532, method11089());
      this.method11098(Class8487.field36530, method11089());
      this.method11098(Class8487.field36531, method11089());
      this.method11098(Class8487.field36588, method11089());
      HashSet var8 = Sets.newHashSet();

      for (Class3209 var10 : Class2348.field16072) {
         ResourceLocation var11 = var10.method11999();
         if (var11 != Class8793.field39533 && var8.add(var11)) {
            Class5888 var12 = this.field17636.remove(var11);
            if (var12 == null) {
               throw new IllegalStateException(String.format("Missing loottable '%s' for '%s'", var11, Class2348.field16072.method9181(var10)));
            }

            var1.accept(var11, var12);
         }
      }

      if (!this.field17636.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.field17636.keySet());
      }
   }

   private void method11090(Class3209 var1, Class3209 var2) {
      Class5888 var5 = method11065(var1, Class4695.method14724(var1).method18297(Class158.method476(Class8122.field34918, 0.33F, 0.55F, 0.77F, 1.0F)));
      this.method11098(var1, var5);
      this.method11098(var2, var5);
   }

   public static Class5888 method11091(Class3209 var0) {
      return method11072(var0, Class3461.field19297, Class84.field210);
   }

   public void method11092(Class3209 var1) {
      this.method11097(var1, var0 -> method11070(((Class3460)var0).method12137()));
   }

   public void method11093(Class3209 var1, Class3209 var2) {
      this.method11098(var1, method11069(var2));
   }

   public void method11094(Class3209 var1, Class3303 var2) {
      this.method11098(var1, method11061(var2));
   }

   public void method11095(Class3209 var1) {
      this.method11093(var1, var1);
   }

   public void method11096(Class3209 var1) {
      this.method11094(var1, var1);
   }

   private void method11097(Class3209 var1, Function<Class3209, Class5888> var2) {
      this.method11098(var1, (Class5888)var2.apply(var1));
   }

   private void method11098(Class3209 var1, Class5888 var2) {
      this.field17636.put(var1.method11999(), var2);
   }
}
