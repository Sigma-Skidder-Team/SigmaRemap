package remapped;

import com.google.common.collect.ImmutableList;
import com.google.gson.JsonElement;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class class_8261 {
   private final Consumer<class_8740> field_42380;
   private final BiConsumer<Identifier, Supplier<JsonElement>> field_42378;
   private final Consumer<class_2451> field_42377;

   public class_8261(Consumer<class_8740> var1, BiConsumer<Identifier, Supplier<JsonElement>> var2, Consumer<class_2451> var3) {
      this.field_42380 = var1;
      this.field_42378 = var2;
      this.field_42377 = var3;
   }

   private void method_37946(class_6414 var1) {
      this.field_42377.accept(var1.method_10803());
   }

   private void method_37966(class_6414 var1, Identifier var2) {
      this.field_42378.accept(class_6856.method_31450(var1.method_10803()), new class_7503(var2));
   }

   private void method_38020(class_2451 var1, Identifier var2) {
      this.field_42378.accept(class_6856.method_31450(var1), new class_7503(var2));
   }

   private void method_38060(class_2451 var1) {
      class_9590.field_48797.method_34878(class_6856.method_31450(var1), class_1685.method_7577(var1), this.field_42378);
   }

   private void method_37914(class_6414 var1) {
      class_2451 var4 = var1.method_10803();
      if (var4 != class_4897.field_25302) {
         class_9590.field_48797.method_34878(class_6856.method_31450(var4), class_1685.method_7578(var1), this.field_42378);
      }
   }

   private void method_38057(class_6414 var1, String var2) {
      class_2451 var5 = var1.method_10803();
      class_9590.field_48797.method_34878(class_6856.method_31450(var5), class_1685.method_7544(class_1685.method_7533(var1, var2)), this.field_42378);
   }

   private static class_121 method_37994() {
      return class_121.<Direction>method_360(class_6023.field_30701)
         .method_45275(Direction.field_804, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32954))
         .method_45275(Direction.field_800, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32953))
         .method_45275(Direction.field_809, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32950))
         .method_45275(Direction.field_818, class_265.method_1150());
   }

   private static class_121 method_38015() {
      return class_121.<Direction>method_360(class_6023.field_30701)
         .method_45275(Direction.field_800, class_265.method_1150())
         .method_45275(Direction.field_809, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32954))
         .method_45275(Direction.field_818, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32953))
         .method_45275(Direction.field_804, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32950));
   }

   private static class_121 method_38034() {
      return class_121.<Direction>method_360(class_6023.field_30701)
         .method_45275(Direction.field_804, class_265.method_1150())
         .method_45275(Direction.field_800, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32954))
         .method_45275(Direction.field_809, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32953))
         .method_45275(Direction.field_818, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32950));
   }

   private static class_121 method_37913() {
      return class_121.<Direction>method_360(class_6023.field_30674)
         .method_45275(Direction.field_802, class_265.method_1150().method_1151(class_1120.field_6400, class_6466.field_32954))
         .method_45275(Direction.field_817, class_265.method_1150().method_1151(class_1120.field_6400, class_6466.field_32950))
         .method_45275(Direction.field_818, class_265.method_1150())
         .method_45275(Direction.field_800, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32953))
         .method_45275(Direction.field_809, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32950))
         .method_45275(Direction.field_804, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32954));
   }

   private static class_6065 method_38071(class_6414 var0, Identifier var1) {
      return class_6065.method_27777(var0, method_38037(var1));
   }

   private static class_265[] method_38037(Identifier var0) {
      return new class_265[]{
         class_265.method_1150().method_1151(class_1120.field_6404, var0),
         class_265.method_1150().method_1151(class_1120.field_6404, var0).method_1151(class_1120.field_6402, class_6466.field_32954),
         class_265.method_1150().method_1151(class_1120.field_6404, var0).method_1151(class_1120.field_6402, class_6466.field_32953),
         class_265.method_1150().method_1151(class_1120.field_6404, var0).method_1151(class_1120.field_6402, class_6466.field_32950)
      };
   }

   private static class_6065 method_37968(class_6414 var0, Identifier var1, Identifier var2) {
      return class_6065.method_27777(
         var0,
         class_265.method_1150().method_1151(class_1120.field_6404, var1),
         class_265.method_1150().method_1151(class_1120.field_6404, var2),
         class_265.method_1150().method_1151(class_1120.field_6404, var1).method_1151(class_1120.field_6402, class_6466.field_32953),
         class_265.method_1150().method_1151(class_1120.field_6404, var2).method_1151(class_1120.field_6402, class_6466.field_32953)
      );
   }

   private static class_121 method_37981(class_6720 var0, Identifier var1, Identifier var2) {
      return class_121.<Boolean>method_360(var0)
         .method_45275(true, class_265.method_1150().method_1151(class_1120.field_6404, var1))
         .method_45275(false, class_265.method_1150().method_1151(class_1120.field_6404, var2));
   }

   private void method_38033(class_6414 var1) {
      Identifier var4 = class_2109.field_10567.method_11640(var1, this.field_42378);
      Identifier var5 = class_2109.field_10561.method_11640(var1, this.field_42378);
      this.field_42380.accept(method_37968(var1, var4, var5));
   }

   private void method_38052(class_6414 var1) {
      Identifier var4 = class_2109.field_10567.method_11640(var1, this.field_42378);
      this.field_42380.accept(method_38071(var1, var4));
   }

   private static class_8740 method_37924(class_6414 var0, Identifier var1, Identifier var2) {
      return class_6065.method_27776(var0)
         .method_27775(
            class_121.<Boolean>method_360(class_6023.field_30696)
               .method_45275(false, class_265.method_1150().method_1151(class_1120.field_6404, var1))
               .method_45275(true, class_265.method_1150().method_1151(class_1120.field_6404, var2))
         )
         .method_27775(
            class_121.<class_1895, Direction>method_357(class_6023.field_30757, class_6023.field_30701)
               .method_231(class_1895.field_9677, Direction.field_804, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32954))
               .method_231(class_1895.field_9677, Direction.field_809, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32950))
               .method_231(class_1895.field_9677, Direction.field_800, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32953))
               .method_231(class_1895.field_9677, Direction.field_818, class_265.method_1150())
               .method_231(
                  class_1895.field_9680,
                  Direction.field_804,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6402, class_6466.field_32954)
                     .method_1151(class_1120.field_6400, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_231(
                  class_1895.field_9680,
                  Direction.field_809,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
                     .method_1151(class_1120.field_6400, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_231(
                  class_1895.field_9680,
                  Direction.field_800,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6402, class_6466.field_32953)
                     .method_1151(class_1120.field_6400, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_231(
                  class_1895.field_9680,
                  Direction.field_818,
                  class_265.method_1150().method_1151(class_1120.field_6400, class_6466.field_32954).method_1151(class_1120.field_6403, true)
               )
               .method_231(
                  class_1895.field_9679,
                  Direction.field_804,
                  class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32950).method_1151(class_1120.field_6400, class_6466.field_32953)
               )
               .method_231(
                  class_1895.field_9679,
                  Direction.field_809,
                  class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32954).method_1151(class_1120.field_6400, class_6466.field_32953)
               )
               .method_231(class_1895.field_9679, Direction.field_800, class_265.method_1150().method_1151(class_1120.field_6400, class_6466.field_32953))
               .method_231(
                  class_1895.field_9679,
                  Direction.field_818,
                  class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32953).method_1151(class_1120.field_6400, class_6466.field_32953)
               )
         );
   }

   private static class_544<Direction, class_7422, class_4340, Boolean> method_38054(
           class_544<Direction, class_7422, class_4340, Boolean> var0, class_7422 var1, Identifier var2, Identifier var3
   ) {
      return var0.method_2630(Direction.field_804, var1, class_4340.field_21090, false, class_265.method_1150().method_1151(class_1120.field_6404, var2))
         .method_2630(
            Direction.field_800,
            var1,
            class_4340.field_21090,
            false,
            class_265.method_1150().method_1151(class_1120.field_6404, var2).method_1151(class_1120.field_6402, class_6466.field_32954)
         )
         .method_2630(
            Direction.field_809,
            var1,
            class_4340.field_21090,
            false,
            class_265.method_1150().method_1151(class_1120.field_6404, var2).method_1151(class_1120.field_6402, class_6466.field_32953)
         )
         .method_2630(
            Direction.field_818,
            var1,
            class_4340.field_21090,
            false,
            class_265.method_1150().method_1151(class_1120.field_6404, var2).method_1151(class_1120.field_6402, class_6466.field_32950)
         )
         .method_2630(Direction.field_804, var1, class_4340.field_21091, false, class_265.method_1150().method_1151(class_1120.field_6404, var3))
         .method_2630(
            Direction.field_800,
            var1,
            class_4340.field_21091,
            false,
            class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6402, class_6466.field_32954)
         )
         .method_2630(
            Direction.field_809,
            var1,
            class_4340.field_21091,
            false,
            class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6402, class_6466.field_32953)
         )
         .method_2630(
            Direction.field_818,
            var1,
            class_4340.field_21091,
            false,
            class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6402, class_6466.field_32950)
         )
         .method_2630(
            Direction.field_804,
            var1,
            class_4340.field_21090,
            true,
            class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6402, class_6466.field_32954)
         )
         .method_2630(
            Direction.field_800,
            var1,
            class_4340.field_21090,
            true,
            class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6402, class_6466.field_32953)
         )
         .method_2630(
            Direction.field_809,
            var1,
            class_4340.field_21090,
            true,
            class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6402, class_6466.field_32950)
         )
         .method_2630(Direction.field_818, var1, class_4340.field_21090, true, class_265.method_1150().method_1151(class_1120.field_6404, var3))
         .method_2630(
            Direction.field_804,
            var1,
            class_4340.field_21091,
            true,
            class_265.method_1150().method_1151(class_1120.field_6404, var2).method_1151(class_1120.field_6402, class_6466.field_32950)
         )
         .method_2630(Direction.field_800, var1, class_4340.field_21091, true, class_265.method_1150().method_1151(class_1120.field_6404, var2))
         .method_2630(
            Direction.field_809,
            var1,
            class_4340.field_21091,
            true,
            class_265.method_1150().method_1151(class_1120.field_6404, var2).method_1151(class_1120.field_6402, class_6466.field_32954)
         )
         .method_2630(
            Direction.field_818,
            var1,
            class_4340.field_21091,
            true,
            class_265.method_1150().method_1151(class_1120.field_6404, var2).method_1151(class_1120.field_6402, class_6466.field_32953)
         );
   }

   private static class_8740 method_38050(class_6414 var0, Identifier var1, Identifier var2, Identifier var3, Identifier var4) {
      return class_6065.method_27776(var0)
         .method_27775(
            method_38054(
               method_38054(
                  class_121.<Direction, class_7422, class_4340, Boolean>method_359(
                     class_6023.field_30701, class_6023.field_30754, class_6023.field_30721, class_6023.field_30688
                  ),
                  class_7422.field_37876,
                  var1,
                  var2
               ),
               class_7422.field_37874,
               var3,
               var4
            )
         );
   }

   private static class_8740 method_37991(class_6414 var0, Identifier var1, Identifier var2) {
      return class_1744.method_7785(var0)
         .method_7787(class_265.method_1150().method_1151(class_1120.field_6404, var1))
         .method_7786(
            class_5496.method_24962().method_6792(class_6023.field_30734, true),
            class_265.method_1150().method_1151(class_1120.field_6404, var2).method_1151(class_1120.field_6403, true)
         )
         .method_7786(
            class_5496.method_24962().method_6792(class_6023.field_30669, true),
            class_265.method_1150()
               .method_1151(class_1120.field_6404, var2)
               .method_1151(class_1120.field_6402, class_6466.field_32954)
               .method_1151(class_1120.field_6403, true)
         )
         .method_7786(
            class_5496.method_24962().method_6792(class_6023.field_30730, true),
            class_265.method_1150()
               .method_1151(class_1120.field_6404, var2)
               .method_1151(class_1120.field_6402, class_6466.field_32953)
               .method_1151(class_1120.field_6403, true)
         )
         .method_7786(
            class_5496.method_24962().method_6792(class_6023.field_30675, true),
            class_265.method_1150()
               .method_1151(class_1120.field_6404, var2)
               .method_1151(class_1120.field_6402, class_6466.field_32950)
               .method_1151(class_1120.field_6403, true)
         );
   }

   private static class_8740 method_37989(class_6414 var0, Identifier var1, Identifier var2, Identifier var3) {
      return class_1744.method_7785(var0)
         .method_7786(class_5496.method_24962().method_6792(class_6023.field_30711, true), class_265.method_1150().method_1151(class_1120.field_6404, var1))
         .method_7786(
            class_5496.method_24962().method_6792(class_6023.field_30737, class_8506.field_43547),
            class_265.method_1150().method_1151(class_1120.field_6404, var2).method_1151(class_1120.field_6403, true)
         )
         .method_7786(
            class_5496.method_24962().method_6792(class_6023.field_30706, class_8506.field_43547),
            class_265.method_1150()
               .method_1151(class_1120.field_6404, var2)
               .method_1151(class_1120.field_6402, class_6466.field_32954)
               .method_1151(class_1120.field_6403, true)
         )
         .method_7786(
            class_5496.method_24962().method_6792(class_6023.field_30679, class_8506.field_43547),
            class_265.method_1150()
               .method_1151(class_1120.field_6404, var2)
               .method_1151(class_1120.field_6402, class_6466.field_32953)
               .method_1151(class_1120.field_6403, true)
         )
         .method_7786(
            class_5496.method_24962().method_6792(class_6023.field_30752, class_8506.field_43547),
            class_265.method_1150()
               .method_1151(class_1120.field_6404, var2)
               .method_1151(class_1120.field_6402, class_6466.field_32950)
               .method_1151(class_1120.field_6403, true)
         )
         .method_7786(
            class_5496.method_24962().method_6792(class_6023.field_30737, class_8506.field_43543),
            class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6403, true)
         )
         .method_7786(
            class_5496.method_24962().method_6792(class_6023.field_30706, class_8506.field_43543),
            class_265.method_1150()
               .method_1151(class_1120.field_6404, var3)
               .method_1151(class_1120.field_6402, class_6466.field_32954)
               .method_1151(class_1120.field_6403, true)
         )
         .method_7786(
            class_5496.method_24962().method_6792(class_6023.field_30679, class_8506.field_43543),
            class_265.method_1150()
               .method_1151(class_1120.field_6404, var3)
               .method_1151(class_1120.field_6402, class_6466.field_32953)
               .method_1151(class_1120.field_6403, true)
         )
         .method_7786(
            class_5496.method_24962().method_6792(class_6023.field_30752, class_8506.field_43543),
            class_265.method_1150()
               .method_1151(class_1120.field_6404, var3)
               .method_1151(class_1120.field_6402, class_6466.field_32950)
               .method_1151(class_1120.field_6403, true)
         );
   }

   private static class_8740 method_38069(class_6414 var0, Identifier var1, Identifier var2, Identifier var3, Identifier var4) {
      return class_6065.method_27778(var0, class_265.method_1150().method_1151(class_1120.field_6403, true))
         .method_27775(method_38015())
         .method_27775(
            class_121.<Boolean, Boolean>method_357(class_6023.field_30744, class_6023.field_30688)
               .method_231(false, false, class_265.method_1150().method_1151(class_1120.field_6404, var2))
               .method_231(true, false, class_265.method_1150().method_1151(class_1120.field_6404, var4))
               .method_231(false, true, class_265.method_1150().method_1151(class_1120.field_6404, var1))
               .method_231(true, true, class_265.method_1150().method_1151(class_1120.field_6404, var3))
         );
   }

   private static class_8740 method_37922(class_6414 var0, Identifier var1, Identifier var2, Identifier var3) {
      return class_6065.method_27776(var0)
         .method_27775(
            class_121.<Direction, class_5122, class_476>method_363(class_6023.field_30701, class_6023.field_30709, class_6023.field_30756)
               .method_24325(
                  Direction.field_804, class_5122.field_26439, class_476.field_2961, class_265.method_1150().method_1151(class_1120.field_6404, var2)
               )
               .method_24325(
                  Direction.field_809,
                  class_5122.field_26439,
                  class_476.field_2961,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var2)
                     .method_1151(class_1120.field_6402, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_800,
                  class_5122.field_26439,
                  class_476.field_2961,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var2)
                     .method_1151(class_1120.field_6402, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_818,
                  class_5122.field_26439,
                  class_476.field_2961,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var2)
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_804, class_5122.field_26439, class_476.field_2960, class_265.method_1150().method_1151(class_1120.field_6404, var3)
               )
               .method_24325(
                  Direction.field_809,
                  class_5122.field_26439,
                  class_476.field_2960,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6402, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_800,
                  class_5122.field_26439,
                  class_476.field_2960,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6402, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_818,
                  class_5122.field_26439,
                  class_476.field_2960,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_804,
                  class_5122.field_26439,
                  class_476.field_2964,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_809,
                  class_5122.field_26439,
                  class_476.field_2964,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6402, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_800, class_5122.field_26439, class_476.field_2964, class_265.method_1150().method_1151(class_1120.field_6404, var3)
               )
               .method_24325(
                  Direction.field_818,
                  class_5122.field_26439,
                  class_476.field_2964,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6402, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_804, class_5122.field_26439, class_476.field_2963, class_265.method_1150().method_1151(class_1120.field_6404, var1)
               )
               .method_24325(
                  Direction.field_809,
                  class_5122.field_26439,
                  class_476.field_2963,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var1)
                     .method_1151(class_1120.field_6402, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_800,
                  class_5122.field_26439,
                  class_476.field_2963,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var1)
                     .method_1151(class_1120.field_6402, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_818,
                  class_5122.field_26439,
                  class_476.field_2963,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var1)
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_804,
                  class_5122.field_26439,
                  class_476.field_2962,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var1)
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_809,
                  class_5122.field_26439,
                  class_476.field_2962,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var1)
                     .method_1151(class_1120.field_6402, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_800, class_5122.field_26439, class_476.field_2962, class_265.method_1150().method_1151(class_1120.field_6404, var1)
               )
               .method_24325(
                  Direction.field_818,
                  class_5122.field_26439,
                  class_476.field_2962,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var1)
                     .method_1151(class_1120.field_6402, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_804,
                  class_5122.field_26440,
                  class_476.field_2961,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var2)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_809,
                  class_5122.field_26440,
                  class_476.field_2961,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var2)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6402, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_800,
                  class_5122.field_26440,
                  class_476.field_2961,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var2)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6402, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_818,
                  class_5122.field_26440,
                  class_476.field_2961,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var2)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_804,
                  class_5122.field_26440,
                  class_476.field_2960,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6402, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_809,
                  class_5122.field_26440,
                  class_476.field_2960,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_800,
                  class_5122.field_26440,
                  class_476.field_2960,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6402, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_818,
                  class_5122.field_26440,
                  class_476.field_2960,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_804,
                  class_5122.field_26440,
                  class_476.field_2964,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_809,
                  class_5122.field_26440,
                  class_476.field_2964,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6402, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_800,
                  class_5122.field_26440,
                  class_476.field_2964,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6402, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_818,
                  class_5122.field_26440,
                  class_476.field_2964,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_804,
                  class_5122.field_26440,
                  class_476.field_2963,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var1)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6402, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_809,
                  class_5122.field_26440,
                  class_476.field_2963,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var1)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_800,
                  class_5122.field_26440,
                  class_476.field_2963,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var1)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6402, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_818,
                  class_5122.field_26440,
                  class_476.field_2963,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var1)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_804,
                  class_5122.field_26440,
                  class_476.field_2962,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var1)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_809,
                  class_5122.field_26440,
                  class_476.field_2962,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var1)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6402, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_800,
                  class_5122.field_26440,
                  class_476.field_2962,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var1)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6402, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_24325(
                  Direction.field_818,
                  class_5122.field_26440,
                  class_476.field_2962,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var1)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true)
               )
         );
   }

   private static class_8740 method_38044(class_6414 var0, Identifier var1, Identifier var2, Identifier var3) {
      return class_6065.method_27776(var0)
         .method_27775(
            class_121.<Direction, class_5122, Boolean>method_363(class_6023.field_30701, class_6023.field_30709, class_6023.field_30688)
               .method_24325(Direction.field_818, class_5122.field_26439, false, class_265.method_1150().method_1151(class_1120.field_6404, var2))
               .method_24325(
                  Direction.field_800,
                  class_5122.field_26439,
                  false,
                  class_265.method_1150().method_1151(class_1120.field_6404, var2).method_1151(class_1120.field_6402, class_6466.field_32953)
               )
               .method_24325(
                  Direction.field_804,
                  class_5122.field_26439,
                  false,
                  class_265.method_1150().method_1151(class_1120.field_6404, var2).method_1151(class_1120.field_6402, class_6466.field_32954)
               )
               .method_24325(
                  Direction.field_809,
                  class_5122.field_26439,
                  false,
                  class_265.method_1150().method_1151(class_1120.field_6404, var2).method_1151(class_1120.field_6402, class_6466.field_32950)
               )
               .method_24325(Direction.field_818, class_5122.field_26440, false, class_265.method_1150().method_1151(class_1120.field_6404, var1))
               .method_24325(
                  Direction.field_800,
                  class_5122.field_26440,
                  false,
                  class_265.method_1150().method_1151(class_1120.field_6404, var1).method_1151(class_1120.field_6402, class_6466.field_32953)
               )
               .method_24325(
                  Direction.field_804,
                  class_5122.field_26440,
                  false,
                  class_265.method_1150().method_1151(class_1120.field_6404, var1).method_1151(class_1120.field_6402, class_6466.field_32954)
               )
               .method_24325(
                  Direction.field_809,
                  class_5122.field_26440,
                  false,
                  class_265.method_1150().method_1151(class_1120.field_6404, var1).method_1151(class_1120.field_6402, class_6466.field_32950)
               )
               .method_24325(Direction.field_818, class_5122.field_26439, true, class_265.method_1150().method_1151(class_1120.field_6404, var3))
               .method_24325(
                  Direction.field_800,
                  class_5122.field_26439,
                  true,
                  class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6402, class_6466.field_32953)
               )
               .method_24325(
                  Direction.field_804,
                  class_5122.field_26439,
                  true,
                  class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6402, class_6466.field_32954)
               )
               .method_24325(
                  Direction.field_809,
                  class_5122.field_26439,
                  true,
                  class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6402, class_6466.field_32950)
               )
               .method_24325(
                  Direction.field_818,
                  class_5122.field_26440,
                  true,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6402, class_6466.field_32953)
               )
               .method_24325(
                  Direction.field_800,
                  class_5122.field_26440,
                  true,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6402, class_6466.field_32948)
               )
               .method_24325(
                  Direction.field_804,
                  class_5122.field_26440,
                  true,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
               )
               .method_24325(
                  Direction.field_809,
                  class_5122.field_26440,
                  true,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6400, class_6466.field_32953)
                     .method_1151(class_1120.field_6402, class_6466.field_32954)
               )
         );
   }

   private static class_8740 method_37927(class_6414 var0, Identifier var1, Identifier var2, Identifier var3) {
      return class_6065.method_27776(var0)
         .method_27775(
            class_121.<Direction, class_5122, Boolean>method_363(class_6023.field_30701, class_6023.field_30709, class_6023.field_30688)
               .method_24325(Direction.field_818, class_5122.field_26439, false, class_265.method_1150().method_1151(class_1120.field_6404, var2))
               .method_24325(Direction.field_800, class_5122.field_26439, false, class_265.method_1150().method_1151(class_1120.field_6404, var2))
               .method_24325(Direction.field_804, class_5122.field_26439, false, class_265.method_1150().method_1151(class_1120.field_6404, var2))
               .method_24325(Direction.field_809, class_5122.field_26439, false, class_265.method_1150().method_1151(class_1120.field_6404, var2))
               .method_24325(Direction.field_818, class_5122.field_26440, false, class_265.method_1150().method_1151(class_1120.field_6404, var1))
               .method_24325(Direction.field_800, class_5122.field_26440, false, class_265.method_1150().method_1151(class_1120.field_6404, var1))
               .method_24325(Direction.field_804, class_5122.field_26440, false, class_265.method_1150().method_1151(class_1120.field_6404, var1))
               .method_24325(Direction.field_809, class_5122.field_26440, false, class_265.method_1150().method_1151(class_1120.field_6404, var1))
               .method_24325(Direction.field_818, class_5122.field_26439, true, class_265.method_1150().method_1151(class_1120.field_6404, var3))
               .method_24325(
                  Direction.field_800,
                  class_5122.field_26439,
                  true,
                  class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6402, class_6466.field_32953)
               )
               .method_24325(
                  Direction.field_804,
                  class_5122.field_26439,
                  true,
                  class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6402, class_6466.field_32954)
               )
               .method_24325(
                  Direction.field_809,
                  class_5122.field_26439,
                  true,
                  class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6402, class_6466.field_32950)
               )
               .method_24325(Direction.field_818, class_5122.field_26440, true, class_265.method_1150().method_1151(class_1120.field_6404, var3))
               .method_24325(
                  Direction.field_800,
                  class_5122.field_26440,
                  true,
                  class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6402, class_6466.field_32953)
               )
               .method_24325(
                  Direction.field_804,
                  class_5122.field_26440,
                  true,
                  class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6402, class_6466.field_32954)
               )
               .method_24325(
                  Direction.field_809,
                  class_5122.field_26440,
                  true,
                  class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6402, class_6466.field_32950)
               )
         );
   }

   private static class_6065 method_38073(class_6414 var0, Identifier var1) {
      return class_6065.method_27778(var0, class_265.method_1150().method_1151(class_1120.field_6404, var1));
   }

   private static class_121 method_37979() {
      return class_121.<class_9249>method_360(class_6023.field_30682)
         .method_45275(class_9249.field_47216, class_265.method_1150())
         .method_45275(class_9249.field_47219, class_265.method_1150().method_1151(class_1120.field_6400, class_6466.field_32954))
         .method_45275(
            class_9249.field_47215,
            class_265.method_1150().method_1151(class_1120.field_6400, class_6466.field_32954).method_1151(class_1120.field_6402, class_6466.field_32954)
         );
   }

   private static class_8740 method_37937(class_6414 var0, Identifier var1) {
      return class_6065.method_27778(var0, class_265.method_1150().method_1151(class_1120.field_6404, var1)).method_27775(method_37979());
   }

   private void method_37957(class_6414 var1, Identifier var2) {
      this.field_42380.accept(method_37937(var1, var2));
   }

   private void method_37976(class_6414 var1, class_2562 var2) {
      Identifier var5 = var2.method_11640(var1, this.field_42378);
      this.field_42380.accept(method_37937(var1, var5));
   }

   private void method_37911(class_6414 var1, class_2562 var2) {
      Identifier var5 = var2.method_11640(var1, this.field_42378);
      this.field_42380.accept(class_6065.method_27778(var1, class_265.method_1150().method_1151(class_1120.field_6404, var5)).method_27775(method_37994()));
   }

   private static class_8740 method_37920(class_6414 var0, Identifier var1, Identifier var2) {
      return class_6065.method_27776(var0)
         .method_27775(
            class_121.<class_9249>method_360(class_6023.field_30682)
               .method_45275(class_9249.field_47216, class_265.method_1150().method_1151(class_1120.field_6404, var1))
               .method_45275(
                  class_9249.field_47219,
                  class_265.method_1150().method_1151(class_1120.field_6404, var2).method_1151(class_1120.field_6400, class_6466.field_32954)
               )
               .method_45275(
                  class_9249.field_47215,
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var2)
                     .method_1151(class_1120.field_6400, class_6466.field_32954)
                     .method_1151(class_1120.field_6402, class_6466.field_32954)
               )
         );
   }

   private void method_37934(class_6414 var1, class_2562 var2, class_2562 var3) {
      Identifier var6 = var2.method_11640(var1, this.field_42378);
      Identifier var7 = var3.method_11640(var1, this.field_42378);
      this.field_42380.accept(method_37920(var1, var6, var7));
   }

   private Identifier method_37910(class_6414 var1, String var2, class_7701 var3, Function<Identifier, class_1685> var4) {
      return var3.method_34882(var1, var2, (class_1685)var4.apply(class_1685.method_7533(var1, var2)), this.field_42378);
   }

   private static class_8740 method_38058(class_6414 var0, Identifier var1, Identifier var2) {
      return class_6065.method_27776(var0).method_27775(method_37981(class_6023.field_30696, var2, var1));
   }

   private static class_8740 method_38026(class_6414 var0, Identifier var1, Identifier var2, Identifier var3) {
      return class_6065.method_27776(var0)
         .method_27775(
            class_121.<class_6666>method_360(class_6023.field_30748)
               .method_45275(class_6666.field_34465, class_265.method_1150().method_1151(class_1120.field_6404, var1))
               .method_45275(class_6666.field_34466, class_265.method_1150().method_1151(class_1120.field_6404, var2))
               .method_45275(class_6666.field_34469, class_265.method_1150().method_1151(class_1120.field_6404, var3))
         );
   }

   private void method_38023(class_6414 var1) {
      this.method_38068(var1, class_2109.field_10567);
   }

   private void method_38068(class_6414 var1, class_2562 var2) {
      this.field_42380.accept(method_38073(var1, var2.method_11640(var1, this.field_42378)));
   }

   private void method_37949(class_6414 var1, class_1685 var2, class_7701 var3) {
      Identifier var6 = var3.method_34883(var1, var2, this.field_42378);
      this.field_42380.accept(method_38073(var1, var6));
   }

   private class_5418 method_38038(class_6414 var1, class_2109 var2) {
      return new class_5418(this, var2.method_9870()).method_24630(var1, var2.method_9868());
   }

   private class_5418 method_37960(class_6414 var1, class_2562 var2) {
      class_2109 var5 = var2.method_11639(var1);
      return new class_5418(this, var5.method_9870()).method_24630(var1, var5.method_9868());
   }

   private class_5418 method_37912(class_6414 var1) {
      return this.method_37960(var1, class_2109.field_10567);
   }

   private class_5418 method_37985(class_1685 var1) {
      return new class_5418(this, var1);
   }

   private void method_38043(class_6414 var1) {
      class_1685 var4 = class_1685.method_7536(var1);
      Identifier var5 = class_9590.field_48838.method_34883(var1, var4, this.field_42378);
      Identifier var6 = class_9590.field_48848.method_34883(var1, var4, this.field_42378);
      Identifier var7 = class_9590.field_48782.method_34883(var1, var4, this.field_42378);
      Identifier var8 = class_9590.field_48822.method_34883(var1, var4, this.field_42378);
      this.method_38060(var1.method_10803());
      this.field_42380.accept(method_38050(var1, var5, var6, var7, var8));
   }

   private void method_38039(class_6414 var1) {
      class_1685 var4 = class_1685.method_7552(var1);
      Identifier var5 = class_9590.field_48779.method_34883(var1, var4, this.field_42378);
      Identifier var6 = class_9590.field_48788.method_34883(var1, var4, this.field_42378);
      Identifier var7 = class_9590.field_48842.method_34883(var1, var4, this.field_42378);
      this.field_42380.accept(method_38044(var1, var5, var6, var7));
      this.method_37966(var1, var6);
   }

   private void method_37953(class_6414 var1) {
      class_1685 var4 = class_1685.method_7552(var1);
      Identifier var5 = class_9590.field_48816.method_34883(var1, var4, this.field_42378);
      Identifier var6 = class_9590.field_48832.method_34883(var1, var4, this.field_42378);
      Identifier var7 = class_9590.field_48795.method_34883(var1, var4, this.field_42378);
      this.field_42380.accept(method_37927(var1, var5, var6, var7));
      this.method_37966(var1, var6);
   }

   private class_8560 method_37909(class_6414 var1) {
      return new class_8560(this, class_1685.method_7554(var1));
   }

   private void method_37941(class_6414 var1) {
      this.method_38047(var1, var1);
   }

   private void method_38047(class_6414 var1, class_6414 var2) {
      this.field_42380.accept(method_38073(var1, class_6856.method_31446(var2)));
   }

   private void method_37936(class_6414 var1, class_933 var2) {
      this.method_37914(var1);
      this.method_37940(var1, var2);
   }

   private void method_37997(class_6414 var1, class_933 var2, class_1685 var3) {
      this.method_37914(var1);
      this.method_37978(var1, var2, var3);
   }

   private void method_37940(class_6414 var1, class_933 var2) {
      class_1685 var5 = class_1685.method_7575(var1);
      this.method_37978(var1, var2, var5);
   }

   private void method_37978(class_6414 var1, class_933 var2, class_1685 var3) {
      Identifier var6 = var2.method_4054().method_34883(var1, var3, this.field_42378);
      this.field_42380.accept(method_38073(var1, var6));
   }

   private void method_38035(class_6414 var1, class_6414 var2, class_933 var3) {
      this.method_37936(var1, var3);
      class_1685 var6 = class_1685.method_7573(var1);
      Identifier var7 = var3.method_4055().method_34883(var2, var6, this.field_42378);
      this.field_42380.accept(method_38073(var2, var7));
   }

   private void method_38011(class_6414 var1, class_6414 var2) {
      class_2109 var5 = class_2109.field_10559.method_11639(var1);
      Identifier var6 = var5.method_9873(var1, this.field_42378);
      this.field_42380.accept(method_38073(var1, var6));
      Identifier var7 = class_9590.field_48823.method_34883(var2, var5.method_9870(), this.field_42378);
      this.field_42380.accept(class_6065.method_27778(var2, class_265.method_1150().method_1151(class_1120.field_6404, var7)).method_27775(method_37994()));
      this.method_37914(var1);
   }

   private void method_38070(class_6414 var1, class_6414 var2) {
      this.method_38060(var1.method_10803());
      class_1685 var5 = class_1685.method_7550(var1);
      class_1685 var6 = class_1685.method_7553(var1, var2);
      Identifier var7 = class_9590.field_48809.method_34883(var2, var6, this.field_42378);
      this.field_42380
         .accept(
            class_6065.method_27778(var2, class_265.method_1150().method_1151(class_1120.field_6404, var7))
               .method_27775(
                  class_121.<Direction>method_360(class_6023.field_30701)
                     .method_45275(Direction.field_809, class_265.method_1150())
                     .method_45275(Direction.field_800, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32950))
                     .method_45275(Direction.field_818, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32954))
                     .method_45275(Direction.field_804, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32953))
               )
         );
      this.field_42380
         .accept(
            class_6065.method_27776(var1)
               .method_27775(
                  class_121.<Integer>method_360(class_6023.field_30676)
                     .method_45276(
                        var3 -> class_265.method_1150()
                              .method_1151(class_1120.field_6404, class_9590.field_48808[var3].method_34883(var1, var5, this.field_42378))
                     )
               )
         );
   }

   private void method_37948(
      class_6414 var1, class_6414 var2, class_6414 var3, class_6414 var4, class_6414 var5, class_6414 var6, class_6414 var7, class_6414 var8
   ) {
      this.method_37936(var1, class_933.field_4774);
      this.method_37936(var2, class_933.field_4774);
      this.method_38023(var3);
      this.method_38023(var4);
      this.method_38011(var5, var7);
      this.method_38011(var6, var8);
   }

   private void method_38018(class_6414 var1, class_933 var2) {
      this.method_38057(var1, "_top");
      Identifier var5 = this.method_37910(var1, "_top", var2.method_4054(), class_1685::method_7560);
      Identifier var6 = this.method_37910(var1, "_bottom", var2.method_4054(), class_1685::method_7560);
      this.method_37930(var1, var5, var6);
   }

   private void method_38030() {
      this.method_38057(class_4783.field_23554, "_front");
      Identifier var3 = class_6856.method_31445(class_4783.field_23554, "_top");
      Identifier var4 = this.method_37910(class_4783.field_23554, "_bottom", class_933.field_4774.method_4054(), class_1685::method_7560);
      this.method_37930(class_4783.field_23554, var3, var4);
   }

   private void method_38000() {
      Identifier var3 = this.method_37910(class_4783.field_23535, "_top", class_9590.field_48821, class_1685::method_7542);
      Identifier var4 = this.method_37910(class_4783.field_23535, "_bottom", class_9590.field_48821, class_1685::method_7542);
      this.method_37930(class_4783.field_23535, var3, var4);
   }

   private void method_37930(class_6414 var1, Identifier var2, Identifier var3) {
      this.field_42380
         .accept(
            class_6065.method_27776(var1)
               .method_27775(
                  class_121.<class_7422>method_360(class_6023.field_30754)
                     .method_45275(class_7422.field_37876, class_265.method_1150().method_1151(class_1120.field_6404, var3))
                     .method_45275(class_7422.field_37874, class_265.method_1150().method_1151(class_1120.field_6404, var2))
               )
         );
   }

   private void method_38002(class_6414 var1) {
      class_1685 var4 = class_1685.method_7581(var1);
      class_1685 var5 = class_1685.method_7568(class_1685.method_7533(var1, "_corner"));
      Identifier var6 = class_9590.field_48793.method_34883(var1, var4, this.field_42378);
      Identifier var7 = class_9590.field_48851.method_34883(var1, var5, this.field_42378);
      Identifier var8 = class_9590.field_48820.method_34883(var1, var4, this.field_42378);
      Identifier var9 = class_9590.field_48812.method_34883(var1, var4, this.field_42378);
      this.method_37914(var1);
      this.field_42380
         .accept(
            class_6065.method_27776(var1)
               .method_27775(
                  class_121.<class_3665>method_360(class_6023.field_30726)
                     .method_45275(class_3665.field_17829, class_265.method_1150().method_1151(class_1120.field_6404, var6))
                     .method_45275(
                        class_3665.field_17831,
                        class_265.method_1150().method_1151(class_1120.field_6404, var6).method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_45275(
                        class_3665.field_17835,
                        class_265.method_1150().method_1151(class_1120.field_6404, var8).method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_45275(
                        class_3665.field_17826,
                        class_265.method_1150().method_1151(class_1120.field_6404, var9).method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_45275(class_3665.field_17833, class_265.method_1150().method_1151(class_1120.field_6404, var8))
                     .method_45275(class_3665.field_17836, class_265.method_1150().method_1151(class_1120.field_6404, var9))
                     .method_45275(class_3665.field_17830, class_265.method_1150().method_1151(class_1120.field_6404, var7))
                     .method_45275(
                        class_3665.field_17825,
                        class_265.method_1150().method_1151(class_1120.field_6404, var7).method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_45275(
                        class_3665.field_17837,
                        class_265.method_1150().method_1151(class_1120.field_6404, var7).method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_45275(
                        class_3665.field_17832,
                        class_265.method_1150().method_1151(class_1120.field_6404, var7).method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
               )
         );
   }

   private void method_37938(class_6414 var1) {
      Identifier var4 = this.method_37910(var1, "", class_9590.field_48793, class_1685::method_7568);
      Identifier var5 = this.method_37910(var1, "", class_9590.field_48820, class_1685::method_7568);
      Identifier var6 = this.method_37910(var1, "", class_9590.field_48812, class_1685::method_7568);
      Identifier var7 = this.method_37910(var1, "_on", class_9590.field_48793, class_1685::method_7568);
      Identifier var8 = this.method_37910(var1, "_on", class_9590.field_48820, class_1685::method_7568);
      Identifier var9 = this.method_37910(var1, "_on", class_9590.field_48812, class_1685::method_7568);
      class_121 var10 = class_121.<Boolean, class_3665>method_357(class_6023.field_30696, class_6023.field_30760)
         .method_232(
            (var6x, var7x) -> {
               switch (var7x) {
                  case field_17829:
                     return class_265.method_1150().method_1151(class_1120.field_6404, var6x ? var7 : var4);
                  case field_17831:
                     return class_265.method_1150()
                        .method_1151(class_1120.field_6404, var6x ? var7 : var4)
                        .method_1151(class_1120.field_6402, class_6466.field_32954);
                  case field_17835:
                     return class_265.method_1150()
                        .method_1151(class_1120.field_6404, var6x ? var8 : var5)
                        .method_1151(class_1120.field_6402, class_6466.field_32954);
                  case field_17826:
                     return class_265.method_1150()
                        .method_1151(class_1120.field_6404, var6x ? var9 : var6)
                        .method_1151(class_1120.field_6402, class_6466.field_32954);
                  case field_17833:
                     return class_265.method_1150().method_1151(class_1120.field_6404, var6x ? var8 : var5);
                  case field_17836:
                     return class_265.method_1150().method_1151(class_1120.field_6404, var6x ? var9 : var6);
                  default:
                     throw new UnsupportedOperationException("Fix you generator!");
               }
            }
         );
      this.method_37914(var1);
      this.field_42380.accept(class_6065.method_27776(var1).method_27775(var10));
   }

   private class_3070 method_37928(Identifier var1, class_6414 var2) {
      return new class_3070(this, var1, var2);
   }

   private class_3070 method_37944(class_6414 var1, class_6414 var2) {
      return new class_3070(this, class_6856.method_31446(var1), var2);
   }

   private void method_37933(class_6414 var1, class_2451 var2) {
      Identifier var5 = class_9590.field_48844.method_34883(var1, class_1685.method_7571(var2), this.field_42378);
      this.field_42380.accept(method_38073(var1, var5));
   }

   private void method_38045(class_6414 var1, Identifier var2) {
      Identifier var5 = class_9590.field_48844.method_34883(var1, class_1685.method_7567(var2), this.field_42378);
      this.field_42380.accept(method_38073(var1, var5));
   }

   private void method_38019(class_6414 var1, class_6414 var2) {
      this.method_38068(var1, class_2109.field_10567);
      Identifier var5 = class_2109.field_10558.method_11639(var1).method_9873(var2, this.field_42378);
      this.field_42380.accept(method_38073(var2, var5));
   }

   private void method_38009(class_2562 var1, class_6414... var2) {
      for (class_6414 var8 : var2) {
         Identifier var9 = var1.method_11640(var8, this.field_42378);
         this.field_42380.accept(method_38071(var8, var9));
      }
   }

   private void method_37955(class_2562 var1, class_6414... var2) {
      for (class_6414 var8 : var2) {
         Identifier var9 = var1.method_11640(var8, this.field_42378);
         this.field_42380.accept(class_6065.method_27778(var8, class_265.method_1150().method_1151(class_1120.field_6404, var9)).method_27775(method_38015()));
      }
   }

   private void method_38014(class_6414 var1, class_6414 var2) {
      this.method_38023(var1);
      class_1685 var5 = class_1685.method_7532(var1, var2);
      Identifier var6 = class_9590.field_48792.method_34883(var2, var5, this.field_42378);
      Identifier var7 = class_9590.field_48856.method_34883(var2, var5, this.field_42378);
      Identifier var8 = class_9590.field_48813.method_34883(var2, var5, this.field_42378);
      Identifier var9 = class_9590.field_48780.method_34883(var2, var5, this.field_42378);
      Identifier var10 = class_9590.field_48850.method_34883(var2, var5, this.field_42378);
      class_2451 var11 = var2.method_10803();
      class_9590.field_48797.method_34878(class_6856.method_31450(var11), class_1685.method_7578(var1), this.field_42378);
      this.field_42380
         .accept(
            class_1744.method_7785(var2)
               .method_7787(class_265.method_1150().method_1151(class_1120.field_6404, var6))
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30734, true), class_265.method_1150().method_1151(class_1120.field_6404, var7)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30669, true),
                  class_265.method_1150().method_1151(class_1120.field_6404, var7).method_1151(class_1120.field_6402, class_6466.field_32954)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30730, true), class_265.method_1150().method_1151(class_1120.field_6404, var8)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30675, true),
                  class_265.method_1150().method_1151(class_1120.field_6404, var8).method_1151(class_1120.field_6402, class_6466.field_32954)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30734, false), class_265.method_1150().method_1151(class_1120.field_6404, var9)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30669, false), class_265.method_1150().method_1151(class_1120.field_6404, var10)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30730, false),
                  class_265.method_1150().method_1151(class_1120.field_6404, var10).method_1151(class_1120.field_6402, class_6466.field_32954)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30675, false),
                  class_265.method_1150().method_1151(class_1120.field_6404, var9).method_1151(class_1120.field_6402, class_6466.field_32950)
               )
         );
   }

   private void method_37919(class_6414 var1) {
      class_1685 var4 = class_1685.method_7534(var1);
      Identifier var5 = class_9590.field_48826.method_34883(var1, var4, this.field_42378);
      Identifier var6 = this.method_37910(var1, "_conditional", class_9590.field_48826, var1x -> var4.method_7531(class_8940.field_45813, var1x));
      this.field_42380.accept(class_6065.method_27776(var1).method_27775(method_37981(class_6023.field_30715, var6, var5)).method_27775(method_37913()));
   }

   private void method_37970(class_6414 var1) {
      Identifier var4 = class_2109.field_10562.method_11640(var1, this.field_42378);
      this.field_42380.accept(method_38073(var1, var4).method_27775(method_38015()));
   }

   private List<class_265> method_37990(int var1) {
      String var4 = "_age" + var1;
      return IntStream.range(1, 5)
         .<class_265>mapToObj(
            var1x -> class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23886, var1x + var4))
         )
         .collect(Collectors.<class_265>toList());
   }

   private void method_37932() {
      this.method_37946(class_4783.field_23886);
      this.field_42380
         .accept(
            class_1744.method_7785(class_4783.field_23886)
               .method_7790(class_5496.method_24962().method_6792(class_6023.field_30736, 0), this.method_37990(0))
               .method_7790(class_5496.method_24962().method_6792(class_6023.field_30736, 1), this.method_37990(1))
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30685, class_6546.field_33277),
                  class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23886, "_small_leaves"))
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30685, class_6546.field_33280),
                  class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23886, "_large_leaves"))
               )
         );
   }

   private class_121 method_37977() {
      return class_121.<Direction>method_360(class_6023.field_30674)
         .method_45275(Direction.field_802, class_265.method_1150().method_1151(class_1120.field_6400, class_6466.field_32953))
         .method_45275(Direction.field_817, class_265.method_1150())
         .method_45275(Direction.field_818, class_265.method_1150().method_1151(class_1120.field_6400, class_6466.field_32954))
         .method_45275(
            Direction.field_800,
            class_265.method_1150().method_1151(class_1120.field_6400, class_6466.field_32954).method_1151(class_1120.field_6402, class_6466.field_32953)
         )
         .method_45275(
            Direction.field_809,
            class_265.method_1150().method_1151(class_1120.field_6400, class_6466.field_32954).method_1151(class_1120.field_6402, class_6466.field_32950)
         )
         .method_45275(
            Direction.field_804,
            class_265.method_1150().method_1151(class_1120.field_6400, class_6466.field_32954).method_1151(class_1120.field_6402, class_6466.field_32954)
         );
   }

   private void method_38029() {
      Identifier var3 = class_1685.method_7533(class_4783.field_23641, "_top_open");
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23641)
               .method_27775(this.method_37977())
               .method_27775(
                  class_121.<Boolean>method_360(class_6023.field_30688)
                     .method_45275(
                        false,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_2109.field_10580.method_11640(class_4783.field_23641, this.field_42378))
                     )
                     .method_45275(
                        true,
                        class_265.method_1150()
                           .method_1151(
                              class_1120.field_6404,
                              class_2109.field_10580
                                 .method_11639(class_4783.field_23641)
                                 .method_9874(var1 -> var1.method_7551(class_8940.field_45810, var3))
                                 .method_9867(class_4783.field_23641, "_open", this.field_42378)
                           )
                     )
               )
         );
   }

   private static <T extends Comparable<T>> class_121 method_38048(class_5019<T> var0, T var1, Identifier var2, Identifier var3) {
      class_265 var6 = class_265.method_1150().method_1151(class_1120.field_6404, var2);
      class_265 var7 = class_265.method_1150().method_1151(class_1120.field_6404, var3);
      return class_121.method_360(var0).method_45276(var3x -> {
         boolean var6x = var3x.compareTo(var1) >= 0;
         return !var6x ? var7 : var6;
      });
   }

   private void method_37926(class_6414 var1, Function<class_6414, class_1685> var2) {
      class_1685 var5 = ((class_1685)var2.apply(var1)).method_7548(class_8940.field_45813, class_8940.field_45832);
      class_1685 var6 = var5.method_7531(class_8940.field_45833, class_1685.method_7533(var1, "_front_honey"));
      Identifier var7 = class_9590.field_48817.method_34883(var1, var5, this.field_42378);
      Identifier var8 = class_9590.field_48817.method_34882(var1, "_honey", var6, this.field_42378);
      this.field_42380.accept(class_6065.method_27776(var1).method_27775(method_37994()).method_27775(method_38048(class_6023.field_30749, 5, var8, var7)));
   }

   private void method_37962(class_6414 var1, class_5019<Integer> var2, int... var3) {
      if (var2.method_23105().size() == var3.length) {
         Int2ObjectOpenHashMap var6 = new Int2ObjectOpenHashMap();
         class_121 var7 = class_121.<Integer>method_360(var2)
            .method_45276(
               var4 -> {
                  int var7x = var3[var4];
                  Identifier var8 = (Identifier)var6.computeIfAbsent(
                     var7x, var3xx -> this.method_37910(var1, "_stage" + var7x, class_9590.field_48804, class_1685::method_7541)
                  );
                  return class_265.method_1150().method_1151(class_1120.field_6404, var8);
               }
            );
         this.method_38060(var1.method_10803());
         this.field_42380.accept(class_6065.method_27776(var1).method_27775(var7));
      } else {
         throw new IllegalArgumentException();
      }
   }

   private void method_38072() {
      Identifier var3 = class_6856.method_31445(class_4783.field_23870, "_floor");
      Identifier var4 = class_6856.method_31445(class_4783.field_23870, "_ceiling");
      Identifier var5 = class_6856.method_31445(class_4783.field_23870, "_wall");
      Identifier var6 = class_6856.method_31445(class_4783.field_23870, "_between_walls");
      this.method_38060(class_4897.field_24737);
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23870)
               .method_27775(
                  class_121.<Direction, class_7048>method_357(class_6023.field_30701, class_6023.field_30710)
                     .method_231(Direction.field_818, class_7048.field_36394, class_265.method_1150().method_1151(class_1120.field_6404, var3))
                     .method_231(
                        Direction.field_800,
                        class_7048.field_36394,
                        class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_231(
                        Direction.field_804,
                        class_7048.field_36394,
                        class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_231(
                        Direction.field_809,
                        class_7048.field_36394,
                        class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
                     .method_231(Direction.field_818, class_7048.field_36399, class_265.method_1150().method_1151(class_1120.field_6404, var4))
                     .method_231(
                        Direction.field_800,
                        class_7048.field_36399,
                        class_265.method_1150().method_1151(class_1120.field_6404, var4).method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_231(
                        Direction.field_804,
                        class_7048.field_36399,
                        class_265.method_1150().method_1151(class_1120.field_6404, var4).method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_231(
                        Direction.field_809,
                        class_7048.field_36399,
                        class_265.method_1150().method_1151(class_1120.field_6404, var4).method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
                     .method_231(
                        Direction.field_818,
                        class_7048.field_36397,
                        class_265.method_1150().method_1151(class_1120.field_6404, var5).method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
                     .method_231(
                        Direction.field_800,
                        class_7048.field_36397,
                        class_265.method_1150().method_1151(class_1120.field_6404, var5).method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_231(Direction.field_804, class_7048.field_36397, class_265.method_1150().method_1151(class_1120.field_6404, var5))
                     .method_231(
                        Direction.field_809,
                        class_7048.field_36397,
                        class_265.method_1150().method_1151(class_1120.field_6404, var5).method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_231(
                        Direction.field_800,
                        class_7048.field_36395,
                        class_265.method_1150().method_1151(class_1120.field_6404, var6).method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_231(
                        Direction.field_818,
                        class_7048.field_36395,
                        class_265.method_1150().method_1151(class_1120.field_6404, var6).method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
                     .method_231(Direction.field_804, class_7048.field_36395, class_265.method_1150().method_1151(class_1120.field_6404, var6))
                     .method_231(
                        Direction.field_809,
                        class_7048.field_36395,
                        class_265.method_1150().method_1151(class_1120.field_6404, var6).method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
               )
         );
   }

   private void method_38076() {
      this.field_42380
         .accept(
            class_6065.method_27778(
                  class_4783.field_23461, class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31446(class_4783.field_23461))
               )
               .method_27775(
                  class_121.<class_1895, Direction>method_357(class_6023.field_30757, class_6023.field_30701)
                     .method_231(class_1895.field_9677, Direction.field_818, class_265.method_1150())
                     .method_231(class_1895.field_9677, Direction.field_804, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32954))
                     .method_231(class_1895.field_9677, Direction.field_800, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32953))
                     .method_231(class_1895.field_9677, Direction.field_809, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32950))
                     .method_231(class_1895.field_9680, Direction.field_818, class_265.method_1150().method_1151(class_1120.field_6400, class_6466.field_32954))
                     .method_231(
                        class_1895.field_9680,
                        Direction.field_804,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6400, class_6466.field_32954)
                           .method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_231(
                        class_1895.field_9680,
                        Direction.field_800,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6400, class_6466.field_32954)
                           .method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_231(
                        class_1895.field_9680,
                        Direction.field_809,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6400, class_6466.field_32954)
                           .method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
                     .method_231(class_1895.field_9679, Direction.field_800, class_265.method_1150().method_1151(class_1120.field_6400, class_6466.field_32953))
                     .method_231(
                        class_1895.field_9679,
                        Direction.field_809,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6400, class_6466.field_32953)
                           .method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_231(
                        class_1895.field_9679,
                        Direction.field_818,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6400, class_6466.field_32953)
                           .method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_231(
                        class_1895.field_9679,
                        Direction.field_804,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6400, class_6466.field_32953)
                           .method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
               )
         );
   }

   private void method_38053(class_6414 var1, class_2562 var2) {
      Identifier var5 = var2.method_11640(var1, this.field_42378);
      Identifier var6 = class_1685.method_7533(var1, "_front_on");
      Identifier var7 = var2.method_11639(var1)
         .method_9874(var1x -> var1x.method_7551(class_8940.field_45833, var6))
         .method_9867(var1, "_on", this.field_42378);
      this.field_42380.accept(class_6065.method_27776(var1).method_27775(method_37981(class_6023.field_30732, var7, var5)).method_27775(method_37994()));
   }

   private void method_37974(class_6414... var1) {
      Identifier var4 = class_6856.method_31449("campfire_off");

      for (class_6414 var8 : var1) {
         Identifier var9 = class_9590.field_48772.method_34883(var8, class_1685.method_7572(var8), this.field_42378);
         this.method_38060(var8.method_10803());
         this.field_42380.accept(class_6065.method_27776(var8).method_27775(method_37981(class_6023.field_30732, var9, var4)).method_27775(method_38015()));
      }
   }

   private void method_38065() {
      class_1685 var3 = class_1685.method_7569(class_1685.method_7540(class_4783.field_23313), class_1685.method_7540(class_4783.field_23893));
      Identifier var4 = class_9590.field_48862.method_34883(class_4783.field_23313, var3, this.field_42378);
      this.field_42380.accept(method_38073(class_4783.field_23313, var4));
   }

   private void method_37998() {
      this.method_38060(class_4897.field_24791);
      this.field_42380
         .accept(
            class_1744.method_7785(class_4783.field_23349)
               .method_7786(
                  class_5496.method_24961(
                     class_5496.method_24962()
                        .method_6792(class_6023.field_30741, class_4379.field_21485)
                        .method_6792(class_6023.field_30713, class_4379.field_21485)
                        .method_6792(class_6023.field_30695, class_4379.field_21485)
                        .method_6792(class_6023.field_30720, class_4379.field_21485),
                     class_5496.method_24962()
                        .method_6797(class_6023.field_30741, class_4379.field_21487, class_4379.field_21482)
                        .method_6797(class_6023.field_30713, class_4379.field_21487, class_4379.field_21482),
                     class_5496.method_24962()
                        .method_6797(class_6023.field_30713, class_4379.field_21487, class_4379.field_21482)
                        .method_6797(class_6023.field_30695, class_4379.field_21487, class_4379.field_21482),
                     class_5496.method_24962()
                        .method_6797(class_6023.field_30695, class_4379.field_21487, class_4379.field_21482)
                        .method_6797(class_6023.field_30720, class_4379.field_21487, class_4379.field_21482),
                     class_5496.method_24962()
                        .method_6797(class_6023.field_30720, class_4379.field_21487, class_4379.field_21482)
                        .method_6797(class_6023.field_30741, class_4379.field_21487, class_4379.field_21482)
                  ),
                  class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31449("redstone_dust_dot"))
               )
               .method_7786(
                  class_5496.method_24962().method_6797(class_6023.field_30741, class_4379.field_21487, class_4379.field_21482),
                  class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31449("redstone_dust_side0"))
               )
               .method_7786(
                  class_5496.method_24962().method_6797(class_6023.field_30695, class_4379.field_21487, class_4379.field_21482),
                  class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31449("redstone_dust_side_alt0"))
               )
               .method_7786(
                  class_5496.method_24962().method_6797(class_6023.field_30713, class_4379.field_21487, class_4379.field_21482),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, class_6856.method_31449("redstone_dust_side_alt1"))
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
               )
               .method_7786(
                  class_5496.method_24962().method_6797(class_6023.field_30720, class_4379.field_21487, class_4379.field_21482),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, class_6856.method_31449("redstone_dust_side1"))
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30741, class_4379.field_21482),
                  class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31449("redstone_dust_up"))
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30713, class_4379.field_21482),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, class_6856.method_31449("redstone_dust_up"))
                     .method_1151(class_1120.field_6402, class_6466.field_32954)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30695, class_4379.field_21482),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, class_6856.method_31449("redstone_dust_up"))
                     .method_1151(class_1120.field_6402, class_6466.field_32953)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30720, class_4379.field_21482),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, class_6856.method_31449("redstone_dust_up"))
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
               )
         );
   }

   private void method_37965() {
      this.method_38060(class_4897.field_24350);
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23166)
               .method_27775(method_38015())
               .method_27775(
                  class_121.<class_9607, Boolean>method_357(class_6023.field_30683, class_6023.field_30696)
                     .method_231(
                        class_9607.field_48961,
                        false,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31446(class_4783.field_23166))
                     )
                     .method_231(
                        class_9607.field_48961,
                        true,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23166, "_on"))
                     )
                     .method_231(
                        class_9607.field_48960,
                        false,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23166, "_subtract"))
                     )
                     .method_231(
                        class_9607.field_48960,
                        true,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23166, "_on_subtract"))
                     )
               )
         );
   }

   private void method_37951() {
      class_1685 var3 = class_1685.method_7564(class_4783.field_23468);
      class_1685 var4 = class_1685.method_7569(class_1685.method_7533(class_4783.field_23547, "_side"), var3.method_7556(class_8940.field_45810));
      Identifier var5 = class_9590.field_48803.method_34883(class_4783.field_23547, var4, this.field_42378);
      Identifier var6 = class_9590.field_48861.method_34883(class_4783.field_23547, var4, this.field_42378);
      Identifier var7 = class_9590.field_48862.method_34881(class_4783.field_23547, "_double", var4, this.field_42378);
      this.field_42380.accept(method_38026(class_4783.field_23547, var5, var6, var7));
      this.field_42380.accept(method_38073(class_4783.field_23468, class_9590.field_48833.method_34883(class_4783.field_23468, var3, this.field_42378)));
   }

   private void method_37921() {
      this.method_38060(class_4897.field_24872);
      this.field_42380
         .accept(
            class_1744.method_7785(class_4783.field_23504)
               .method_7787(class_265.method_1150().method_1151(class_1120.field_6404, class_1685.method_7540(class_4783.field_23504)))
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30697, true),
                  class_265.method_1150().method_1151(class_1120.field_6404, class_1685.method_7533(class_4783.field_23504, "_bottle0"))
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30700, true),
                  class_265.method_1150().method_1151(class_1120.field_6404, class_1685.method_7533(class_4783.field_23504, "_bottle1"))
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30727, true),
                  class_265.method_1150().method_1151(class_1120.field_6404, class_1685.method_7533(class_4783.field_23504, "_bottle2"))
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30697, false),
                  class_265.method_1150().method_1151(class_1120.field_6404, class_1685.method_7533(class_4783.field_23504, "_empty0"))
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30700, false),
                  class_265.method_1150().method_1151(class_1120.field_6404, class_1685.method_7533(class_4783.field_23504, "_empty1"))
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30727, false),
                  class_265.method_1150().method_1151(class_1120.field_6404, class_1685.method_7533(class_4783.field_23504, "_empty2"))
               )
         );
   }

   private void method_38017(class_6414 var1) {
      Identifier var4 = class_9590.field_48814.method_34883(var1, class_1685.method_7552(var1), this.field_42378);
      Identifier var5 = class_6856.method_31449("mushroom_block_inside");
      this.field_42380
         .accept(
            class_1744.method_7785(var1)
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30734, true), class_265.method_1150().method_1151(class_1120.field_6404, var4)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30669, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var4)
                     .method_1151(class_1120.field_6402, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30730, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var4)
                     .method_1151(class_1120.field_6402, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30675, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var4)
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30711, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var4)
                     .method_1151(class_1120.field_6400, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30740, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var4)
                     .method_1151(class_1120.field_6400, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30734, false), class_265.method_1150().method_1151(class_1120.field_6404, var5)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30669, false),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var5)
                     .method_1151(class_1120.field_6402, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, false)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30730, false),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var5)
                     .method_1151(class_1120.field_6402, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, false)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30675, false),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var5)
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, false)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30711, false),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var5)
                     .method_1151(class_1120.field_6400, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, false)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30740, false),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var5)
                     .method_1151(class_1120.field_6400, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, false)
               )
         );
      this.method_37966(var1, class_2109.field_10567.method_11642(var1, "_inventory", this.field_42378));
   }

   private void method_38061() {
      this.method_38060(class_4897.field_25240);
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23770)
               .method_27775(
                  class_121.<Integer>method_360(class_6023.field_30684)
                     .method_45275(0, class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31446(class_4783.field_23770)))
                     .method_45275(1, class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23770, "_slice1")))
                     .method_45275(2, class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23770, "_slice2")))
                     .method_45275(3, class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23770, "_slice3")))
                     .method_45275(4, class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23770, "_slice4")))
                     .method_45275(5, class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23770, "_slice5")))
                     .method_45275(6, class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23770, "_slice6")))
               )
         );
   }

   private void method_37915() {
      class_1685 var3 = new class_1685()
         .method_7551(class_8940.field_45832, class_1685.method_7533(class_4783.field_23431, "_side3"))
         .method_7551(class_8940.field_45839, class_1685.method_7540(class_4783.field_23916))
         .method_7551(class_8940.field_45817, class_1685.method_7533(class_4783.field_23431, "_top"))
         .method_7551(class_8940.field_45825, class_1685.method_7533(class_4783.field_23431, "_side3"))
         .method_7551(class_8940.field_45824, class_1685.method_7533(class_4783.field_23431, "_side3"))
         .method_7551(class_8940.field_45840, class_1685.method_7533(class_4783.field_23431, "_side1"))
         .method_7551(class_8940.field_45836, class_1685.method_7533(class_4783.field_23431, "_side2"));
      this.field_42380.accept(method_38073(class_4783.field_23431, class_9590.field_48841.method_34883(class_4783.field_23431, var3, this.field_42378)));
   }

   private void method_37971() {
      class_1685 var3 = new class_1685()
         .method_7551(class_8940.field_45832, class_1685.method_7533(class_4783.field_23646, "_front"))
         .method_7551(class_8940.field_45839, class_1685.method_7533(class_4783.field_23646, "_bottom"))
         .method_7551(class_8940.field_45817, class_1685.method_7533(class_4783.field_23646, "_top"))
         .method_7551(class_8940.field_45825, class_1685.method_7533(class_4783.field_23646, "_front"))
         .method_7551(class_8940.field_45840, class_1685.method_7533(class_4783.field_23646, "_front"))
         .method_7551(class_8940.field_45824, class_1685.method_7533(class_4783.field_23646, "_side"))
         .method_7551(class_8940.field_45836, class_1685.method_7533(class_4783.field_23646, "_side"));
      this.field_42380.accept(method_38073(class_4783.field_23646, class_9590.field_48841.method_34883(class_4783.field_23646, var3, this.field_42378)));
   }

   private void method_38028(class_6414 var1, class_6414 var2, BiFunction<class_6414, class_6414, class_1685> var3) {
      class_1685 var6 = (class_1685)var3.apply(var1, var2);
      this.field_42380.accept(method_38073(var1, class_9590.field_48841.method_34883(var1, var6, this.field_42378)));
   }

   private void method_37935() {
      class_1685 var3 = class_1685.method_7545(class_4783.field_23871);
      this.field_42380.accept(method_38073(class_4783.field_23871, class_6856.method_31446(class_4783.field_23871)));
      this.method_37952(class_4783.field_23281, var3);
      this.method_37952(class_4783.field_23855, var3);
   }

   private void method_37952(class_6414 var1, class_1685 var2) {
      Identifier var5 = class_9590.field_48837.method_34883(var1, var2.method_7531(class_8940.field_45833, class_1685.method_7540(var1)), this.field_42378);
      this.field_42380.accept(class_6065.method_27778(var1, class_265.method_1150().method_1151(class_1120.field_6404, var5)).method_27775(method_37994()));
   }

   private void method_38025() {
      this.method_38060(class_4897.field_25283);
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23673)
               .method_27775(
                  class_121.<Integer>method_360(class_6023.field_30733)
                     .method_45275(0, class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31446(class_4783.field_23673)))
                     .method_45275(1, class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23673, "_level1")))
                     .method_45275(2, class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23673, "_level2")))
                     .method_45275(3, class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23673, "_level3")))
               )
         );
   }

   private void method_38022(class_6414 var1, class_6414 var2) {
      class_1685 var5 = new class_1685()
         .method_7551(class_8940.field_45830, class_1685.method_7533(var2, "_top"))
         .method_7551(class_8940.field_45813, class_1685.method_7540(var1));
      this.method_37949(var1, var5, class_9590.field_48862);
   }

   private void method_37947() {
      class_1685 var3 = class_1685.method_7552(class_4783.field_23650);
      Identifier var4 = class_9590.field_48785.method_34883(class_4783.field_23650, var3, this.field_42378);
      Identifier var5 = this.method_37910(class_4783.field_23650, "_dead", class_9590.field_48785, var1 -> var3.method_7531(class_8940.field_45837, var1));
      this.field_42380.accept(class_6065.method_27776(class_4783.field_23650).method_27775(method_38048(class_6023.field_30708, 5, var5, var4)));
   }

   private void method_37999(class_6414 var1) {
      class_1685 var4 = new class_1685()
         .method_7551(class_8940.field_45810, class_1685.method_7533(class_4783.field_23883, "_top"))
         .method_7551(class_8940.field_45813, class_1685.method_7533(class_4783.field_23883, "_side"))
         .method_7551(class_8940.field_45833, class_1685.method_7533(var1, "_front"));
      class_1685 var5 = new class_1685()
         .method_7551(class_8940.field_45813, class_1685.method_7533(class_4783.field_23883, "_top"))
         .method_7551(class_8940.field_45833, class_1685.method_7533(var1, "_front_vertical"));
      Identifier var6 = class_9590.field_48837.method_34883(var1, var4, this.field_42378);
      Identifier var7 = class_9590.field_48778.method_34883(var1, var5, this.field_42378);
      this.field_42380
         .accept(
            class_6065.method_27776(var1)
               .method_27775(
                  class_121.<Direction>method_360(class_6023.field_30674)
                     .method_45275(
                        Direction.field_802,
                        class_265.method_1150().method_1151(class_1120.field_6404, var7).method_1151(class_1120.field_6400, class_6466.field_32953)
                     )
                     .method_45275(Direction.field_817, class_265.method_1150().method_1151(class_1120.field_6404, var7))
                     .method_45275(Direction.field_818, class_265.method_1150().method_1151(class_1120.field_6404, var6))
                     .method_45275(
                        Direction.field_804,
                        class_265.method_1150().method_1151(class_1120.field_6404, var6).method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_45275(
                        Direction.field_800,
                        class_265.method_1150().method_1151(class_1120.field_6404, var6).method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_45275(
                        Direction.field_809,
                        class_265.method_1150().method_1151(class_1120.field_6404, var6).method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
               )
         );
   }

   private void method_38051() {
      Identifier var3 = class_6856.method_31446(class_4783.field_23491);
      Identifier var4 = class_6856.method_31445(class_4783.field_23491, "_filled");
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23491)
               .method_27775(
                  class_121.<Boolean>method_360(class_6023.field_30718)
                     .method_45275(false, class_265.method_1150().method_1151(class_1120.field_6404, var3))
                     .method_45275(true, class_265.method_1150().method_1151(class_1120.field_6404, var4))
               )
               .method_27775(method_38015())
         );
   }

   private void method_37983() {
      Identifier var3 = class_6856.method_31445(class_4783.field_23634, "_side");
      Identifier var4 = class_6856.method_31445(class_4783.field_23634, "_noside");
      Identifier var5 = class_6856.method_31445(class_4783.field_23634, "_noside1");
      Identifier var6 = class_6856.method_31445(class_4783.field_23634, "_noside2");
      Identifier var7 = class_6856.method_31445(class_4783.field_23634, "_noside3");
      this.field_42380
         .accept(
            class_1744.method_7785(class_4783.field_23634)
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30734, true), class_265.method_1150().method_1151(class_1120.field_6404, var3)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30669, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6402, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30730, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6402, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30675, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30711, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6400, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30740, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var3)
                     .method_1151(class_1120.field_6400, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_7789(
                  class_5496.method_24962().method_6792(class_6023.field_30734, false),
                  class_265.method_1150().method_1151(class_1120.field_6404, var4).method_1151(class_1120.field_6401, 2),
                  class_265.method_1150().method_1151(class_1120.field_6404, var5),
                  class_265.method_1150().method_1151(class_1120.field_6404, var6),
                  class_265.method_1150().method_1151(class_1120.field_6404, var7)
               )
               .method_7789(
                  class_5496.method_24962().method_6792(class_6023.field_30669, false),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var5)
                     .method_1151(class_1120.field_6402, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var6)
                     .method_1151(class_1120.field_6402, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var7)
                     .method_1151(class_1120.field_6402, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var4)
                     .method_1151(class_1120.field_6401, 2)
                     .method_1151(class_1120.field_6402, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_7789(
                  class_5496.method_24962().method_6792(class_6023.field_30730, false),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var6)
                     .method_1151(class_1120.field_6402, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var7)
                     .method_1151(class_1120.field_6402, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var4)
                     .method_1151(class_1120.field_6401, 2)
                     .method_1151(class_1120.field_6402, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var5)
                     .method_1151(class_1120.field_6402, class_6466.field_32953)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_7789(
                  class_5496.method_24962().method_6792(class_6023.field_30675, false),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var7)
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var4)
                     .method_1151(class_1120.field_6401, 2)
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var5)
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var6)
                     .method_1151(class_1120.field_6402, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_7789(
                  class_5496.method_24962().method_6792(class_6023.field_30711, false),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var4)
                     .method_1151(class_1120.field_6401, 2)
                     .method_1151(class_1120.field_6400, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var7)
                     .method_1151(class_1120.field_6400, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var5)
                     .method_1151(class_1120.field_6400, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var6)
                     .method_1151(class_1120.field_6400, class_6466.field_32950)
                     .method_1151(class_1120.field_6403, true)
               )
               .method_7789(
                  class_5496.method_24962().method_6792(class_6023.field_30740, false),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var7)
                     .method_1151(class_1120.field_6400, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var6)
                     .method_1151(class_1120.field_6400, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var5)
                     .method_1151(class_1120.field_6400, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true),
                  class_265.method_1150()
                     .method_1151(class_1120.field_6404, var4)
                     .method_1151(class_1120.field_6401, 2)
                     .method_1151(class_1120.field_6400, class_6466.field_32954)
                     .method_1151(class_1120.field_6403, true)
               )
         );
   }

   private void method_38013() {
      this.field_42380
         .accept(
            class_1744.method_7785(class_4783.field_23274)
               .method_7787(class_265.method_1150().method_1151(class_1120.field_6404, class_1685.method_7540(class_4783.field_23274)))
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30755, 1),
                  class_265.method_1150().method_1151(class_1120.field_6404, class_1685.method_7533(class_4783.field_23274, "_contents1"))
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30755, 2),
                  class_265.method_1150().method_1151(class_1120.field_6404, class_1685.method_7533(class_4783.field_23274, "_contents2"))
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30755, 3),
                  class_265.method_1150().method_1151(class_1120.field_6404, class_1685.method_7533(class_4783.field_23274, "_contents3"))
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30755, 4),
                  class_265.method_1150().method_1151(class_1120.field_6404, class_1685.method_7533(class_4783.field_23274, "_contents4"))
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30755, 5),
                  class_265.method_1150().method_1151(class_1120.field_6404, class_1685.method_7533(class_4783.field_23274, "_contents5"))
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30755, 6),
                  class_265.method_1150().method_1151(class_1120.field_6404, class_1685.method_7533(class_4783.field_23274, "_contents6"))
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30755, 7),
                  class_265.method_1150().method_1151(class_1120.field_6404, class_1685.method_7533(class_4783.field_23274, "_contents7"))
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30755, 8),
                  class_265.method_1150().method_1151(class_1120.field_6404, class_1685.method_7533(class_4783.field_23274, "_contents_ready"))
               )
         );
   }

   private void method_38016(class_6414 var1) {
      class_1685 var4 = new class_1685()
         .method_7551(class_8940.field_45822, class_1685.method_7540(class_4783.field_23700))
         .method_7551(class_8940.field_45810, class_1685.method_7540(var1))
         .method_7551(class_8940.field_45813, class_1685.method_7533(var1, "_side"));
      this.field_42380.accept(method_38073(var1, class_9590.field_48789.method_34883(var1, var4, this.field_42378)));
   }

   private void method_37995() {
      Identifier var3 = class_1685.method_7533(class_4783.field_23220, "_side");
      class_1685 var4 = new class_1685()
         .method_7551(class_8940.field_45810, class_1685.method_7533(class_4783.field_23220, "_top"))
         .method_7551(class_8940.field_45813, var3);
      class_1685 var5 = new class_1685()
         .method_7551(class_8940.field_45810, class_1685.method_7533(class_4783.field_23220, "_inverted_top"))
         .method_7551(class_8940.field_45813, var3);
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23220)
               .method_27775(
                  class_121.<Boolean>method_360(class_6023.field_30739)
                     .method_45275(
                        false,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_9590.field_48796.method_34883(class_4783.field_23220, var4, this.field_42378))
                     )
                     .method_45275(
                        true,
                        class_265.method_1150()
                           .method_1151(
                              class_1120.field_6404,
                              class_9590.field_48796.method_34878(class_6856.method_31445(class_4783.field_23220, "_inverted"), var5, this.field_42378)
                           )
                     )
               )
         );
   }

   private void method_38032(class_6414 var1) {
      this.field_42380
         .accept(
            class_6065.method_27778(var1, class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31446(var1)))
               .method_27775(this.method_37977())
         );
   }

   private void method_38005() {
      class_1685 var3 = new class_1685()
         .method_7551(class_8940.field_45815, class_1685.method_7540(class_4783.field_23592))
         .method_7551(class_8940.field_45810, class_1685.method_7540(class_4783.field_23421));
      class_1685 var4 = new class_1685()
         .method_7551(class_8940.field_45815, class_1685.method_7540(class_4783.field_23592))
         .method_7551(class_8940.field_45810, class_1685.method_7533(class_4783.field_23421, "_moist"));
      Identifier var5 = class_9590.field_48834.method_34883(class_4783.field_23421, var3, this.field_42378);
      Identifier var6 = class_9590.field_48834.method_34878(class_1685.method_7533(class_4783.field_23421, "_moist"), var4, this.field_42378);
      this.field_42380.accept(class_6065.method_27776(class_4783.field_23421).method_27775(method_38048(class_6023.field_30702, 7, var6, var5)));
   }

   private List<Identifier> method_38059(class_6414 var1) {
      Identifier var4 = class_9590.field_48824.method_34878(class_6856.method_31445(var1, "_floor0"), class_1685.method_7555(var1), this.field_42378);
      Identifier var5 = class_9590.field_48824.method_34878(class_6856.method_31445(var1, "_floor1"), class_1685.method_7582(var1), this.field_42378);
      return ImmutableList.of(var4, var5);
   }

   private List<Identifier> method_38010(class_6414 var1) {
      Identifier var4 = class_9590.field_48811.method_34878(class_6856.method_31445(var1, "_side0"), class_1685.method_7555(var1), this.field_42378);
      Identifier var5 = class_9590.field_48811.method_34878(class_6856.method_31445(var1, "_side1"), class_1685.method_7582(var1), this.field_42378);
      Identifier var6 = class_9590.field_48829.method_34878(class_6856.method_31445(var1, "_side_alt0"), class_1685.method_7555(var1), this.field_42378);
      Identifier var7 = class_9590.field_48829.method_34878(class_6856.method_31445(var1, "_side_alt1"), class_1685.method_7582(var1), this.field_42378);
      return ImmutableList.of(var4, var5, var6, var7);
   }

   private List<Identifier> method_38031(class_6414 var1) {
      Identifier var4 = class_9590.field_48840.method_34878(class_6856.method_31445(var1, "_up0"), class_1685.method_7555(var1), this.field_42378);
      Identifier var5 = class_9590.field_48840.method_34878(class_6856.method_31445(var1, "_up1"), class_1685.method_7582(var1), this.field_42378);
      Identifier var6 = class_9590.field_48846.method_34878(class_6856.method_31445(var1, "_up_alt0"), class_1685.method_7555(var1), this.field_42378);
      Identifier var7 = class_9590.field_48846.method_34878(class_6856.method_31445(var1, "_up_alt1"), class_1685.method_7582(var1), this.field_42378);
      return ImmutableList.of(var4, var5, var6, var7);
   }

   private static List<class_265> method_37984(List<Identifier> var0, UnaryOperator<class_265> var1) {
      return var0.stream()
         .<class_265>map(var0x -> class_265.method_1150().method_1151(class_1120.field_6404, var0x))
         .<class_265>map(var1)
         .collect(Collectors.<class_265>toList());
   }

   private void method_37975() {
      class_1470 var3 = class_5496.method_24962()
         .method_6792(class_6023.field_30734, false)
         .method_6792(class_6023.field_30669, false)
         .method_6792(class_6023.field_30730, false)
         .method_6792(class_6023.field_30675, false)
         .method_6792(class_6023.field_30711, false);
      List var4 = this.method_38059(class_4783.field_23877);
      List var5 = this.method_38010(class_4783.field_23877);
      List var6 = this.method_38031(class_4783.field_23877);
      this.field_42380
         .accept(
            class_1744.method_7785(class_4783.field_23877)
               .method_7790(var3, method_37984(var4, var0 -> var0))
               .method_7790(
                  class_5496.method_24961(class_5496.method_24962().method_6792(class_6023.field_30734, true), var3), method_37984(var5, var0 -> var0)
               )
               .method_7790(
                  class_5496.method_24961(class_5496.method_24962().method_6792(class_6023.field_30669, true), var3),
                  method_37984(var5, var0 -> var0.method_1151(class_1120.field_6402, class_6466.field_32954))
               )
               .method_7790(
                  class_5496.method_24961(class_5496.method_24962().method_6792(class_6023.field_30730, true), var3),
                  method_37984(var5, var0 -> var0.method_1151(class_1120.field_6402, class_6466.field_32953))
               )
               .method_7790(
                  class_5496.method_24961(class_5496.method_24962().method_6792(class_6023.field_30675, true), var3),
                  method_37984(var5, var0 -> var0.method_1151(class_1120.field_6402, class_6466.field_32950))
               )
               .method_7790(class_5496.method_24962().method_6792(class_6023.field_30711, true), method_37984(var6, var0 -> var0))
         );
   }

   private void method_38001() {
      List var3 = this.method_38059(class_4783.field_23311);
      List var4 = this.method_38010(class_4783.field_23311);
      this.field_42380
         .accept(
            class_1744.method_7785(class_4783.field_23311)
               .method_7788(method_37984(var3, var0 -> var0))
               .method_7788(method_37984(var4, var0 -> var0))
               .method_7788(method_37984(var4, var0 -> var0.method_1151(class_1120.field_6402, class_6466.field_32954)))
               .method_7788(method_37984(var4, var0 -> var0.method_1151(class_1120.field_6402, class_6466.field_32953)))
               .method_7788(method_37984(var4, var0 -> var0.method_1151(class_1120.field_6402, class_6466.field_32950)))
         );
   }

   private void method_38062(class_6414 var1) {
      Identifier var4 = class_2109.field_10566.method_11640(var1, this.field_42378);
      Identifier var5 = class_2109.field_10570.method_11640(var1, this.field_42378);
      this.method_38060(var1.method_10803());
      this.field_42380.accept(class_6065.method_27776(var1).method_27775(method_37981(class_6023.field_30742, var5, var4)));
   }

   private void method_38064() {
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23320)
               .method_27775(
                  class_121.<Integer>method_360(class_6023.field_30750)
                     .method_45275(
                        0,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, this.method_37910(class_4783.field_23320, "_0", class_9590.field_48833, class_1685::method_7574))
                     )
                     .method_45275(
                        1,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, this.method_37910(class_4783.field_23320, "_1", class_9590.field_48833, class_1685::method_7574))
                     )
                     .method_45275(
                        2,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, this.method_37910(class_4783.field_23320, "_2", class_9590.field_48833, class_1685::method_7574))
                     )
                     .method_45275(
                        3,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, this.method_37910(class_4783.field_23320, "_3", class_9590.field_48833, class_1685::method_7574))
                     )
               )
         );
   }

   private void method_37982() {
      Identifier var3 = class_1685.method_7540(class_4783.field_23592);
      class_1685 var4 = new class_1685()
         .method_7551(class_8940.field_45822, var3)
         .method_7548(class_8940.field_45822, class_8940.field_45832)
         .method_7551(class_8940.field_45810, class_1685.method_7533(class_4783.field_23259, "_top"))
         .method_7551(class_8940.field_45813, class_1685.method_7533(class_4783.field_23259, "_snow"));
      class_265 var5 = class_265.method_1150()
         .method_1151(class_1120.field_6404, class_9590.field_48789.method_34882(class_4783.field_23259, "_snow", var4, this.field_42378));
      this.method_37943(class_4783.field_23259, class_6856.method_31446(class_4783.field_23259), var5);
      Identifier var6 = class_2109.field_10580
         .method_11639(class_4783.field_23162)
         .method_9874(var1 -> var1.method_7551(class_8940.field_45822, var3))
         .method_9873(class_4783.field_23162, this.field_42378);
      this.method_37943(class_4783.field_23162, var6, var5);
      Identifier var7 = class_2109.field_10580
         .method_11639(class_4783.field_23201)
         .method_9874(var1 -> var1.method_7551(class_8940.field_45822, var3))
         .method_9873(class_4783.field_23201, this.field_42378);
      this.method_37943(class_4783.field_23201, var7, var5);
   }

   private void method_37943(class_6414 var1, Identifier var2, class_265 var3) {
      List var6 = Arrays.<class_265>asList(method_38037(var2));
      this.field_42380
         .accept(
            class_6065.method_27776(var1)
               .method_27775(class_121.<Boolean>method_360(class_6023.field_30728).method_45275(true, var3).method_45274(false, var6))
         );
   }

   private void method_38024() {
      this.method_38060(class_4897.field_24645);
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23666)
               .method_27775(
                  class_121.<Integer>method_360(class_6023.field_30723)
                     .method_45275(0, class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23666, "_stage0")))
                     .method_45275(1, class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23666, "_stage1")))
                     .method_45275(2, class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23666, "_stage2")))
               )
               .method_27775(method_38015())
         );
   }

   private void method_38078() {
      this.field_42380.accept(method_38071(class_4783.field_23608, class_6856.method_31446(class_4783.field_23608)));
   }

   private void method_37925(class_6414 var1, class_6414 var2) {
      class_1685 var5 = class_1685.method_7552(var2);
      Identifier var6 = class_9590.field_48857.method_34883(var1, var5, this.field_42378);
      Identifier var7 = class_9590.field_48818.method_34883(var1, var5, this.field_42378);
      this.field_42380.accept(class_6065.method_27776(var1).method_27775(method_38048(class_6023.field_30758, 1, var7, var6)));
   }

   private void method_38007() {
      Identifier var3 = class_6856.method_31446(class_4783.field_23698);
      Identifier var4 = class_6856.method_31445(class_4783.field_23698, "_side");
      this.method_38060(class_4897.field_25087);
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23698)
               .method_27775(
                  class_121.<Direction>method_360(class_6023.field_30743)
                     .method_45275(Direction.field_802, class_265.method_1150().method_1151(class_1120.field_6404, var3))
                     .method_45275(Direction.field_818, class_265.method_1150().method_1151(class_1120.field_6404, var4))
                     .method_45275(
                        Direction.field_804,
                        class_265.method_1150().method_1151(class_1120.field_6404, var4).method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_45275(
                        Direction.field_800,
                        class_265.method_1150().method_1151(class_1120.field_6404, var4).method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_45275(
                        Direction.field_809,
                        class_265.method_1150().method_1151(class_1120.field_6404, var4).method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
               )
         );
   }

   private void method_38021(class_6414 var1, class_6414 var2) {
      Identifier var5 = class_6856.method_31446(var1);
      this.field_42380.accept(class_6065.method_27778(var2, class_265.method_1150().method_1151(class_1120.field_6404, var5)));
      this.method_37966(var2, var5);
   }

   private void method_37939() {
      Identifier var3 = class_6856.method_31445(class_4783.field_23817, "_post_ends");
      Identifier var4 = class_6856.method_31445(class_4783.field_23817, "_post");
      Identifier var5 = class_6856.method_31445(class_4783.field_23817, "_cap");
      Identifier var6 = class_6856.method_31445(class_4783.field_23817, "_cap_alt");
      Identifier var7 = class_6856.method_31445(class_4783.field_23817, "_side");
      Identifier var8 = class_6856.method_31445(class_4783.field_23817, "_side_alt");
      this.field_42380
         .accept(
            class_1744.method_7785(class_4783.field_23817)
               .method_7787(class_265.method_1150().method_1151(class_1120.field_6404, var3))
               .method_7786(
                  class_5496.method_24962()
                     .method_6792(class_6023.field_30734, false)
                     .method_6792(class_6023.field_30669, false)
                     .method_6792(class_6023.field_30730, false)
                     .method_6792(class_6023.field_30675, false),
                  class_265.method_1150().method_1151(class_1120.field_6404, var4)
               )
               .method_7786(
                  class_5496.method_24962()
                     .method_6792(class_6023.field_30734, true)
                     .method_6792(class_6023.field_30669, false)
                     .method_6792(class_6023.field_30730, false)
                     .method_6792(class_6023.field_30675, false),
                  class_265.method_1150().method_1151(class_1120.field_6404, var5)
               )
               .method_7786(
                  class_5496.method_24962()
                     .method_6792(class_6023.field_30734, false)
                     .method_6792(class_6023.field_30669, true)
                     .method_6792(class_6023.field_30730, false)
                     .method_6792(class_6023.field_30675, false),
                  class_265.method_1150().method_1151(class_1120.field_6404, var5).method_1151(class_1120.field_6402, class_6466.field_32954)
               )
               .method_7786(
                  class_5496.method_24962()
                     .method_6792(class_6023.field_30734, false)
                     .method_6792(class_6023.field_30669, false)
                     .method_6792(class_6023.field_30730, true)
                     .method_6792(class_6023.field_30675, false),
                  class_265.method_1150().method_1151(class_1120.field_6404, var6)
               )
               .method_7786(
                  class_5496.method_24962()
                     .method_6792(class_6023.field_30734, false)
                     .method_6792(class_6023.field_30669, false)
                     .method_6792(class_6023.field_30730, false)
                     .method_6792(class_6023.field_30675, true),
                  class_265.method_1150().method_1151(class_1120.field_6404, var6).method_1151(class_1120.field_6402, class_6466.field_32954)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30734, true), class_265.method_1150().method_1151(class_1120.field_6404, var7)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30669, true),
                  class_265.method_1150().method_1151(class_1120.field_6404, var7).method_1151(class_1120.field_6402, class_6466.field_32954)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30730, true), class_265.method_1150().method_1151(class_1120.field_6404, var8)
               )
               .method_7786(
                  class_5496.method_24962().method_6792(class_6023.field_30675, true),
                  class_265.method_1150().method_1151(class_1120.field_6404, var8).method_1151(class_1120.field_6402, class_6466.field_32954)
               )
         );
      this.method_37914(class_4783.field_23817);
   }

   private void method_37945(class_6414 var1) {
      this.field_42380
         .accept(
            class_6065.method_27778(var1, class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31446(var1)))
               .method_27775(method_37994())
         );
   }

   private void method_38081() {
      Identifier var3 = class_6856.method_31446(class_4783.field_23806);
      Identifier var4 = class_6856.method_31445(class_4783.field_23806, "_on");
      this.method_37914(class_4783.field_23806);
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23806)
               .method_27775(method_37981(class_6023.field_30696, var3, var4))
               .method_27775(
                  class_121.<class_1895, Direction>method_357(class_6023.field_30757, class_6023.field_30701)
                     .method_231(
                        class_1895.field_9679,
                        Direction.field_818,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6400, class_6466.field_32953)
                           .method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_231(
                        class_1895.field_9679,
                        Direction.field_804,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6400, class_6466.field_32953)
                           .method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
                     .method_231(class_1895.field_9679, Direction.field_800, class_265.method_1150().method_1151(class_1120.field_6400, class_6466.field_32953))
                     .method_231(
                        class_1895.field_9679,
                        Direction.field_809,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6400, class_6466.field_32953)
                           .method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_231(class_1895.field_9677, Direction.field_818, class_265.method_1150())
                     .method_231(class_1895.field_9677, Direction.field_804, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32954))
                     .method_231(class_1895.field_9677, Direction.field_800, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32953))
                     .method_231(class_1895.field_9677, Direction.field_809, class_265.method_1150().method_1151(class_1120.field_6402, class_6466.field_32950))
                     .method_231(class_1895.field_9680, Direction.field_818, class_265.method_1150().method_1151(class_1120.field_6400, class_6466.field_32954))
                     .method_231(
                        class_1895.field_9680,
                        Direction.field_804,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6400, class_6466.field_32954)
                           .method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_231(
                        class_1895.field_9680,
                        Direction.field_800,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6400, class_6466.field_32954)
                           .method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_231(
                        class_1895.field_9680,
                        Direction.field_809,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6400, class_6466.field_32954)
                           .method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
               )
         );
   }

   private void method_38075() {
      this.method_37914(class_4783.field_23860);
      this.field_42380.accept(method_38071(class_4783.field_23860, class_6856.method_31446(class_4783.field_23860)));
   }

   private void method_38063() {
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23588)
               .method_27775(
                  class_121.<class_9249>method_360(class_6023.field_30670)
                     .method_45275(
                        class_9249.field_47215,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23588, "_ns"))
                     )
                     .method_45275(
                        class_9249.field_47219,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23588, "_ew"))
                     )
               )
         );
   }

   private void method_38008() {
      Identifier var3 = class_2109.field_10567.method_11640(class_4783.field_23700, this.field_42378);
      this.field_42380
         .accept(
            class_6065.method_27777(
               class_4783.field_23700,
               class_265.method_1150().method_1151(class_1120.field_6404, var3),
               class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6400, class_6466.field_32954),
               class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6400, class_6466.field_32953),
               class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6400, class_6466.field_32950),
               class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6402, class_6466.field_32954),
               class_265.method_1150()
                  .method_1151(class_1120.field_6404, var3)
                  .method_1151(class_1120.field_6402, class_6466.field_32954)
                  .method_1151(class_1120.field_6400, class_6466.field_32954),
               class_265.method_1150()
                  .method_1151(class_1120.field_6404, var3)
                  .method_1151(class_1120.field_6402, class_6466.field_32954)
                  .method_1151(class_1120.field_6400, class_6466.field_32953),
               class_265.method_1150()
                  .method_1151(class_1120.field_6404, var3)
                  .method_1151(class_1120.field_6402, class_6466.field_32954)
                  .method_1151(class_1120.field_6400, class_6466.field_32950),
               class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6402, class_6466.field_32953),
               class_265.method_1150()
                  .method_1151(class_1120.field_6404, var3)
                  .method_1151(class_1120.field_6402, class_6466.field_32953)
                  .method_1151(class_1120.field_6400, class_6466.field_32954),
               class_265.method_1150()
                  .method_1151(class_1120.field_6404, var3)
                  .method_1151(class_1120.field_6402, class_6466.field_32953)
                  .method_1151(class_1120.field_6400, class_6466.field_32953),
               class_265.method_1150()
                  .method_1151(class_1120.field_6404, var3)
                  .method_1151(class_1120.field_6402, class_6466.field_32953)
                  .method_1151(class_1120.field_6400, class_6466.field_32950),
               class_265.method_1150().method_1151(class_1120.field_6404, var3).method_1151(class_1120.field_6402, class_6466.field_32950),
               class_265.method_1150()
                  .method_1151(class_1120.field_6404, var3)
                  .method_1151(class_1120.field_6402, class_6466.field_32950)
                  .method_1151(class_1120.field_6400, class_6466.field_32954),
               class_265.method_1150()
                  .method_1151(class_1120.field_6404, var3)
                  .method_1151(class_1120.field_6402, class_6466.field_32950)
                  .method_1151(class_1120.field_6400, class_6466.field_32953),
               class_265.method_1150()
                  .method_1151(class_1120.field_6404, var3)
                  .method_1151(class_1120.field_6402, class_6466.field_32950)
                  .method_1151(class_1120.field_6400, class_6466.field_32950)
            )
         );
   }

   private void method_38077() {
      Identifier var3 = class_6856.method_31446(class_4783.field_23367);
      Identifier var4 = class_6856.method_31445(class_4783.field_23367, "_on");
      this.field_42380
         .accept(class_6065.method_27776(class_4783.field_23367).method_27775(method_37981(class_6023.field_30696, var4, var3)).method_27775(method_37913()));
   }

   private void method_37908() {
      class_1685 var3 = new class_1685()
         .method_7551(class_8940.field_45822, class_1685.method_7533(class_4783.field_23649, "_bottom"))
         .method_7551(class_8940.field_45813, class_1685.method_7533(class_4783.field_23649, "_side"));
      Identifier var4 = class_1685.method_7533(class_4783.field_23649, "_top_sticky");
      Identifier var5 = class_1685.method_7533(class_4783.field_23649, "_top");
      class_1685 var6 = var3.method_7531(class_8940.field_45812, var4);
      class_1685 var7 = var3.method_7531(class_8940.field_45812, var5);
      Identifier var8 = class_6856.method_31445(class_4783.field_23649, "_base");
      this.method_37969(class_4783.field_23649, var8, var7);
      this.method_37969(class_4783.field_23861, var8, var6);
      Identifier var9 = class_9590.field_48789
         .method_34882(class_4783.field_23649, "_inventory", var3.method_7531(class_8940.field_45810, var5), this.field_42378);
      Identifier var10 = class_9590.field_48789
         .method_34882(class_4783.field_23861, "_inventory", var3.method_7531(class_8940.field_45810, var4), this.field_42378);
      this.method_37966(class_4783.field_23649, var9);
      this.method_37966(class_4783.field_23861, var10);
   }

   private void method_37969(class_6414 var1, Identifier var2, class_1685 var3) {
      Identifier var6 = class_9590.field_48853.method_34883(var1, var3, this.field_42378);
      this.field_42380.accept(class_6065.method_27776(var1).method_27775(method_37981(class_6023.field_30672, var2, var6)).method_27775(method_37913()));
   }

   private void method_37950() {
      class_1685 var3 = new class_1685()
         .method_7551(class_8940.field_45842, class_1685.method_7533(class_4783.field_23649, "_top"))
         .method_7551(class_8940.field_45813, class_1685.method_7533(class_4783.field_23649, "_side"));
      class_1685 var4 = var3.method_7531(class_8940.field_45812, class_1685.method_7533(class_4783.field_23649, "_top_sticky"));
      class_1685 var5 = var3.method_7531(class_8940.field_45812, class_1685.method_7533(class_4783.field_23649, "_top"));
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23336)
               .method_27775(
                  class_121.<Boolean, class_989>method_357(class_6023.field_30678, class_6023.field_30671)
                     .method_231(
                        false,
                        class_989.field_5039,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_9590.field_48802.method_34882(class_4783.field_23649, "_head", var5, this.field_42378))
                     )
                     .method_231(
                        false,
                        class_989.field_5035,
                        class_265.method_1150()
                           .method_1151(
                              class_1120.field_6404, class_9590.field_48802.method_34882(class_4783.field_23649, "_head_sticky", var4, this.field_42378)
                           )
                     )
                     .method_231(
                        true,
                        class_989.field_5039,
                        class_265.method_1150()
                           .method_1151(
                              class_1120.field_6404, class_9590.field_48798.method_34882(class_4783.field_23649, "_head_short", var5, this.field_42378)
                           )
                     )
                     .method_231(
                        true,
                        class_989.field_5035,
                        class_265.method_1150()
                           .method_1151(
                              class_1120.field_6404, class_9590.field_48798.method_34882(class_4783.field_23649, "_head_short_sticky", var4, this.field_42378)
                           )
                     )
               )
               .method_27775(method_37913())
         );
   }

   private void method_37931() {
      Identifier var3 = class_6856.method_31445(class_4783.field_23348, "_stable");
      Identifier var4 = class_6856.method_31445(class_4783.field_23348, "_unstable");
      this.method_37966(class_4783.field_23348, var3);
      this.field_42380.accept(class_6065.method_27776(class_4783.field_23348).method_27775(method_37981(class_6023.field_30712, var4, var3)));
   }

   private void method_38042() {
      Identifier var3 = class_2109.field_10567.method_11640(class_4783.field_23541, this.field_42378);
      Identifier var4 = this.method_37910(class_4783.field_23541, "_on", class_9590.field_48833, class_1685::method_7574);
      this.field_42380.accept(class_6065.method_27776(class_4783.field_23541).method_27775(method_37981(class_6023.field_30732, var4, var3)));
   }

   private void method_37923(class_6414 var1, class_6414 var2) {
      class_1685 var5 = class_1685.method_7565(var1);
      this.field_42380.accept(method_38073(var1, class_9590.field_48845.method_34883(var1, var5, this.field_42378)));
      this.field_42380
         .accept(
            class_6065.method_27778(
                  var2, class_265.method_1150().method_1151(class_1120.field_6404, class_9590.field_48859.method_34883(var2, var5, this.field_42378))
               )
               .method_27775(method_38034())
         );
      this.method_37914(var1);
      this.method_37946(var2);
   }

   private void method_37980() {
      class_1685 var3 = class_1685.method_7565(class_4783.field_23834);
      class_1685 var4 = class_1685.method_7584(class_1685.method_7533(class_4783.field_23834, "_off"));
      Identifier var5 = class_9590.field_48845.method_34883(class_4783.field_23834, var3, this.field_42378);
      Identifier var6 = class_9590.field_48845.method_34882(class_4783.field_23834, "_off", var4, this.field_42378);
      this.field_42380.accept(class_6065.method_27776(class_4783.field_23834).method_27775(method_37981(class_6023.field_30732, var5, var6)));
      Identifier var7 = class_9590.field_48859.method_34883(class_4783.field_23366, var3, this.field_42378);
      Identifier var8 = class_9590.field_48859.method_34882(class_4783.field_23366, "_off", var4, this.field_42378);
      this.field_42380
         .accept(class_6065.method_27776(class_4783.field_23366).method_27775(method_37981(class_6023.field_30732, var7, var8)).method_27775(method_38034()));
      this.method_37914(class_4783.field_23834);
      this.method_37946(class_4783.field_23366);
   }

   private void method_37961() {
      this.method_38060(class_4897.field_24833);
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23350)
               .method_27775(
                  class_121.<Integer, Boolean, Boolean>method_363(class_6023.field_30707, class_6023.field_30668, class_6023.field_30696)
                     .method_24327((var0, var1, var2) -> {
                        StringBuilder var5 = new StringBuilder();
                        var5.append('_').append(var0).append("tick");
                        if (var2) {
                           var5.append("_on");
                        }

                        if (var1) {
                           var5.append("_locked");
                        }

                        return class_265.method_1150().method_1151(class_1120.field_6404, class_1685.method_7533(class_4783.field_23350, var5.toString()));
                     })
               )
               .method_27775(method_38015())
         );
   }

   private void method_37973() {
      this.method_38060(class_4897.field_24333);
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23239)
               .method_27775(
                  class_121.<Integer, Boolean>method_357(class_6023.field_30692, class_6023.field_30719)
                     .method_229(1, false, Arrays.<class_265>asList(method_38037(class_6856.method_31449("dead_sea_pickle"))))
                     .method_229(2, false, Arrays.<class_265>asList(method_38037(class_6856.method_31449("two_dead_sea_pickles"))))
                     .method_229(3, false, Arrays.<class_265>asList(method_38037(class_6856.method_31449("three_dead_sea_pickles"))))
                     .method_229(4, false, Arrays.<class_265>asList(method_38037(class_6856.method_31449("four_dead_sea_pickles"))))
                     .method_229(1, true, Arrays.<class_265>asList(method_38037(class_6856.method_31449("sea_pickle"))))
                     .method_229(2, true, Arrays.<class_265>asList(method_38037(class_6856.method_31449("two_sea_pickles"))))
                     .method_229(3, true, Arrays.<class_265>asList(method_38037(class_6856.method_31449("three_sea_pickles"))))
                     .method_229(4, true, Arrays.<class_265>asList(method_38037(class_6856.method_31449("four_sea_pickles"))))
               )
         );
   }

   private void method_37958() {
      class_1685 var3 = class_1685.method_7564(class_4783.field_23552);
      Identifier var4 = class_9590.field_48833.method_34883(class_4783.field_23813, var3, this.field_42378);
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23552)
               .method_27775(
                  class_121.<Integer>method_360(class_6023.field_30759)
                     .method_45276(
                        var1 -> class_265.method_1150()
                              .method_1151(class_1120.field_6404, var1 >= 8 ? var4 : class_6856.method_31445(class_4783.field_23552, "_height" + var1 * 2))
                     )
               )
         );
      this.method_37966(class_4783.field_23552, class_6856.method_31445(class_4783.field_23552, "_height2"));
      this.field_42380.accept(method_38073(class_4783.field_23813, var4));
   }

   private void method_37996() {
      this.field_42380
         .accept(
            class_6065.method_27778(
                  class_4783.field_23478, class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31446(class_4783.field_23478))
               )
               .method_27775(method_37994())
         );
   }

   private void method_37954() {
      Identifier var3 = class_2109.field_10567.method_11640(class_4783.field_23846, this.field_42378);
      this.method_37966(class_4783.field_23846, var3);
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23846)
               .method_27775(
                  class_121.<class_589>method_360(class_6023.field_30698)
                     .method_45276(
                        var1 -> class_265.method_1150()
                              .method_1151(
                                 class_1120.field_6404,
                                 this.method_37910(class_4783.field_23846, "_" + var1.method_21049(), class_9590.field_48833, class_1685::method_7574)
                              )
                     )
               )
         );
   }

   private void method_38056() {
      this.method_38060(class_4897.field_25205);
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23637)
               .method_27775(
                  class_121.<Integer>method_360(class_6023.field_30750)
                     .method_45276(
                        var1 -> class_265.method_1150()
                              .method_1151(
                                 class_1120.field_6404,
                                 this.method_37910(class_4783.field_23637, "_stage" + var1, class_9590.field_48847, class_1685::method_7560)
                              )
                     )
               )
         );
   }

   private void method_38055() {
      this.method_38060(class_4897.field_25259);
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23460)
               .method_27775(
                  class_121.<Boolean, Boolean, Boolean, Boolean, Boolean>method_355(
                        class_6023.field_30716, class_6023.field_30669, class_6023.field_30734, class_6023.field_30730, class_6023.field_30675
                     )
                     .method_32087(
                        false,
                        false,
                        false,
                        false,
                        false,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_ns"))
                     )
                     .method_32087(
                        false,
                        true,
                        false,
                        false,
                        false,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_n"))
                           .method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_32087(
                        false,
                        false,
                        true,
                        false,
                        false,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_n"))
                     )
                     .method_32087(
                        false,
                        false,
                        false,
                        true,
                        false,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_n"))
                           .method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_32087(
                        false,
                        false,
                        false,
                        false,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_n"))
                           .method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
                     .method_32087(
                        false,
                        true,
                        true,
                        false,
                        false,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_ne"))
                     )
                     .method_32087(
                        false,
                        true,
                        false,
                        true,
                        false,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_ne"))
                           .method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_32087(
                        false,
                        false,
                        false,
                        true,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_ne"))
                           .method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_32087(
                        false,
                        false,
                        true,
                        false,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_ne"))
                           .method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
                     .method_32087(
                        false,
                        false,
                        true,
                        true,
                        false,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_ns"))
                     )
                     .method_32087(
                        false,
                        true,
                        false,
                        false,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_ns"))
                           .method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_32087(
                        false,
                        true,
                        true,
                        true,
                        false,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_nse"))
                     )
                     .method_32087(
                        false,
                        true,
                        false,
                        true,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_nse"))
                           .method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_32087(
                        false,
                        false,
                        true,
                        true,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_nse"))
                           .method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_32087(
                        false,
                        true,
                        true,
                        false,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_nse"))
                           .method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
                     .method_32087(
                        false,
                        true,
                        true,
                        true,
                        true,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_nsew"))
                     )
                     .method_32087(
                        true,
                        false,
                        false,
                        false,
                        false,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_attached_ns"))
                     )
                     .method_32087(
                        true,
                        false,
                        true,
                        false,
                        false,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_attached_n"))
                     )
                     .method_32087(
                        true,
                        false,
                        false,
                        true,
                        false,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_attached_n"))
                           .method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_32087(
                        true,
                        true,
                        false,
                        false,
                        false,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_attached_n"))
                           .method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_32087(
                        true,
                        false,
                        false,
                        false,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_attached_n"))
                           .method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
                     .method_32087(
                        true,
                        true,
                        true,
                        false,
                        false,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_attached_ne"))
                     )
                     .method_32087(
                        true,
                        true,
                        false,
                        true,
                        false,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_attached_ne"))
                           .method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_32087(
                        true,
                        false,
                        false,
                        true,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_attached_ne"))
                           .method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_32087(
                        true,
                        false,
                        true,
                        false,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_attached_ne"))
                           .method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
                     .method_32087(
                        true,
                        false,
                        true,
                        true,
                        false,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_attached_ns"))
                     )
                     .method_32087(
                        true,
                        true,
                        false,
                        false,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_attached_ns"))
                           .method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_32087(
                        true,
                        true,
                        true,
                        true,
                        false,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_attached_nse"))
                     )
                     .method_32087(
                        true,
                        true,
                        false,
                        true,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_attached_nse"))
                           .method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_32087(
                        true,
                        false,
                        true,
                        true,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_attached_nse"))
                           .method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_32087(
                        true,
                        true,
                        true,
                        false,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_attached_nse"))
                           .method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
                     .method_32087(
                        true,
                        true,
                        true,
                        true,
                        true,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23460, "_attached_nsew"))
                     )
               )
         );
   }

   private void method_37917() {
      this.method_37914(class_4783.field_23812);
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23812)
               .method_27775(
                  class_121.<Boolean, Boolean>method_357(class_6023.field_30716, class_6023.field_30696)
                     .method_232(
                        (var0, var1) -> class_265.method_1150()
                              .method_1151(
                                 class_1120.field_6404, class_1685.method_7533(class_4783.field_23812, (!var0 ? "" : "_attached") + (!var1 ? "" : "_on"))
                              )
                     )
               )
               .method_27775(method_37994())
         );
   }

   private Identifier method_37942(int var1, String var2, class_1685 var3) {
      switch (var1) {
         case 1:
            return class_9590.field_48794.method_34878(class_6856.method_31449(var2 + "turtle_egg"), var3, this.field_42378);
         case 2:
            return class_9590.field_48863.method_34878(class_6856.method_31449("two_" + var2 + "turtle_eggs"), var3, this.field_42378);
         case 3:
            return class_9590.field_48801.method_34878(class_6856.method_31449("three_" + var2 + "turtle_eggs"), var3, this.field_42378);
         case 4:
            return class_9590.field_48790.method_34878(class_6856.method_31449("four_" + var2 + "turtle_eggs"), var3, this.field_42378);
         default:
            throw new UnsupportedOperationException();
      }
   }

   private Identifier method_37964(Integer var1, Integer var2) {
      switch (var2) {
         case 0:
            return this.method_37942(var1, "", class_1685.method_7574(class_1685.method_7540(class_4783.field_23741)));
         case 1:
            return this.method_37942(var1, "slightly_cracked_", class_1685.method_7574(class_1685.method_7533(class_4783.field_23741, "_slightly_cracked")));
         case 2:
            return this.method_37942(var1, "very_cracked_", class_1685.method_7574(class_1685.method_7533(class_4783.field_23741, "_very_cracked")));
         default:
            throw new UnsupportedOperationException();
      }
   }

   private void method_37963() {
      this.method_38060(class_4897.field_24959);
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23741)
               .method_27775(
                  class_121.<Integer, Integer>method_357(class_6023.field_30753, class_6023.field_30745)
                     .method_230((var1, var2) -> Arrays.<class_265>asList(method_38037(this.method_37964(var1, var2))))
               )
         );
   }

   private void method_37992() {
      this.method_37914(class_4783.field_23323);
      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23323)
               .method_27775(
                  class_121.<Boolean, Boolean, Boolean, Boolean, Boolean>method_355(
                        class_6023.field_30669, class_6023.field_30734, class_6023.field_30730, class_6023.field_30711, class_6023.field_30675
                     )
                     .method_32087(
                        false,
                        false,
                        false,
                        false,
                        false,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_1"))
                     )
                     .method_32087(
                        false,
                        false,
                        true,
                        false,
                        false,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_1"))
                     )
                     .method_32087(
                        false,
                        false,
                        false,
                        false,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_1"))
                           .method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_32087(
                        false,
                        true,
                        false,
                        false,
                        false,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_1"))
                           .method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_32087(
                        true,
                        false,
                        false,
                        false,
                        false,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_1"))
                           .method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
                     .method_32087(
                        true,
                        true,
                        false,
                        false,
                        false,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_2"))
                     )
                     .method_32087(
                        true,
                        false,
                        true,
                        false,
                        false,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_2"))
                           .method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_32087(
                        false,
                        false,
                        true,
                        false,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_2"))
                           .method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_32087(
                        false,
                        true,
                        false,
                        false,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_2"))
                           .method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
                     .method_32087(
                        true,
                        false,
                        false,
                        false,
                        true,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_2_opposite"))
                     )
                     .method_32087(
                        false,
                        true,
                        true,
                        false,
                        false,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_2_opposite"))
                           .method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_32087(
                        true,
                        true,
                        true,
                        false,
                        false,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_3"))
                     )
                     .method_32087(
                        true,
                        false,
                        true,
                        false,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_3"))
                           .method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_32087(
                        false,
                        true,
                        true,
                        false,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_3"))
                           .method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_32087(
                        true,
                        true,
                        false,
                        false,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_3"))
                           .method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
                     .method_32087(
                        true,
                        true,
                        true,
                        false,
                        true,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_4"))
                     )
                     .method_32087(
                        false,
                        false,
                        false,
                        true,
                        false,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_u"))
                     )
                     .method_32087(
                        false,
                        false,
                        true,
                        true,
                        false,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_1u"))
                     )
                     .method_32087(
                        false,
                        false,
                        false,
                        true,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_1u"))
                           .method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_32087(
                        false,
                        true,
                        false,
                        true,
                        false,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_1u"))
                           .method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_32087(
                        true,
                        false,
                        false,
                        true,
                        false,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_1u"))
                           .method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
                     .method_32087(
                        true,
                        true,
                        false,
                        true,
                        false,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_2u"))
                     )
                     .method_32087(
                        true,
                        false,
                        true,
                        true,
                        false,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_2u"))
                           .method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_32087(
                        false,
                        false,
                        true,
                        true,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_2u"))
                           .method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_32087(
                        false,
                        true,
                        false,
                        true,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_2u"))
                           .method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
                     .method_32087(
                        true,
                        false,
                        false,
                        true,
                        true,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_2u_opposite"))
                     )
                     .method_32087(
                        false,
                        true,
                        true,
                        true,
                        false,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_2u_opposite"))
                           .method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_32087(
                        true,
                        true,
                        true,
                        true,
                        false,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_3u"))
                     )
                     .method_32087(
                        true,
                        false,
                        true,
                        true,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_3u"))
                           .method_1151(class_1120.field_6402, class_6466.field_32954)
                     )
                     .method_32087(
                        false,
                        true,
                        true,
                        true,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_3u"))
                           .method_1151(class_1120.field_6402, class_6466.field_32953)
                     )
                     .method_32087(
                        true,
                        true,
                        false,
                        true,
                        true,
                        class_265.method_1150()
                           .method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_3u"))
                           .method_1151(class_1120.field_6402, class_6466.field_32950)
                     )
                     .method_32087(
                        true,
                        true,
                        true,
                        true,
                        true,
                        class_265.method_1150().method_1151(class_1120.field_6404, class_6856.method_31445(class_4783.field_23323, "_4u"))
                     )
               )
         );
   }

   private void method_37959() {
      this.field_42380
         .accept(
            method_38073(
               class_4783.field_23215,
               class_9590.field_48833.method_34883(class_4783.field_23215, class_1685.method_7574(class_6856.method_31449("magma")), this.field_42378)
            )
         );
   }

   private void method_38040(class_6414 var1) {
      this.method_38068(var1, class_2109.field_10579);
      class_9590.field_48806.method_34878(class_6856.method_31450(var1.method_10803()), class_1685.method_7543(var1), this.field_42378);
   }

   private void method_37972(class_6414 var1, class_6414 var2, class_933 var3) {
      this.method_37940(var1, var3);
      this.method_37940(var2, var3);
   }

   private void method_37987(class_6414 var1, class_6414 var2) {
      class_9590.field_48854.method_34878(class_6856.method_31450(var1.method_10803()), class_1685.method_7543(var2), this.field_42378);
   }

   private void method_38046() {
      Identifier var3 = class_6856.method_31446(class_4783.field_23644);
      Identifier var4 = class_6856.method_31445(class_4783.field_23644, "_mirrored");
      this.field_42380.accept(method_37968(class_4783.field_23896, var3, var4));
      this.method_37966(class_4783.field_23896, var3);
   }

   private void method_37988(class_6414 var1, class_6414 var2) {
      this.method_37936(var1, class_933.field_4774);
      class_1685 var5 = class_1685.method_7535(class_1685.method_7533(var1, "_pot"));
      Identifier var6 = class_933.field_4774.method_4055().method_34883(var2, var5, this.field_42378);
      this.field_42380.accept(method_38073(var2, var6));
   }

   private void method_37986() {
      Identifier var3 = class_1685.method_7533(class_4783.field_23807, "_bottom");
      Identifier var4 = class_1685.method_7533(class_4783.field_23807, "_top_off");
      Identifier var5 = class_1685.method_7533(class_4783.field_23807, "_top");
      Identifier[] var6 = new Identifier[5];

      for (int var7 = 0; var7 < 5; var7++) {
         class_1685 var8 = new class_1685()
            .method_7551(class_8940.field_45822, var3)
            .method_7551(class_8940.field_45810, var7 != 0 ? var5 : var4)
            .method_7551(class_8940.field_45813, class_1685.method_7533(class_4783.field_23807, "_side" + var7));
         var6[var7] = class_9590.field_48789.method_34882(class_4783.field_23807, "_" + var7, var8, this.field_42378);
      }

      this.field_42380
         .accept(
            class_6065.method_27776(class_4783.field_23807)
               .method_27775(
                  class_121.<Integer>method_360(class_6023.field_30724)
                     .method_45276(var1 -> class_265.method_1150().method_1151(class_1120.field_6404, var6[var1]))
               )
         );
      this.method_38020(class_4897.field_24371, var6[0]);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private class_265 method_38006(class_7660 var1, class_265 var2) {
      switch (var1) {
         case field_38919:
            return var2.method_1151(class_1120.field_6400, class_6466.field_32954);
         case field_38925:
            return var2.method_1151(class_1120.field_6400, class_6466.field_32954).method_1151(class_1120.field_6402, class_6466.field_32953);
         case field_38915:
            return var2.method_1151(class_1120.field_6400, class_6466.field_32954).method_1151(class_1120.field_6402, class_6466.field_32950);
         case field_38913:
            return var2.method_1151(class_1120.field_6400, class_6466.field_32954).method_1151(class_1120.field_6402, class_6466.field_32954);
         case field_38917:
            return var2.method_1151(class_1120.field_6400, class_6466.field_32950).method_1151(class_1120.field_6402, class_6466.field_32953);
         case field_38923:
            return var2.method_1151(class_1120.field_6400, class_6466.field_32950);
         case field_38920:
            return var2.method_1151(class_1120.field_6400, class_6466.field_32950).method_1151(class_1120.field_6402, class_6466.field_32954);
         case field_38911:
            return var2.method_1151(class_1120.field_6400, class_6466.field_32950).method_1151(class_1120.field_6402, class_6466.field_32950);
         case field_38921:
            return var2;
         case field_38912:
            return var2.method_1151(class_1120.field_6402, class_6466.field_32953);
         case field_38918:
            return var2.method_1151(class_1120.field_6402, class_6466.field_32950);
         case field_38914:
            return var2.method_1151(class_1120.field_6402, class_6466.field_32954);
         default:
            throw new UnsupportedOperationException("Rotation " + var1 + " can't be expressed with existing x and y values");
      }
   }

   private void method_37967() {
      Identifier var3 = class_1685.method_7533(class_4783.field_23319, "_top");
      Identifier var4 = class_1685.method_7533(class_4783.field_23319, "_bottom");
      Identifier var5 = class_1685.method_7533(class_4783.field_23319, "_side");
      Identifier var6 = class_1685.method_7533(class_4783.field_23319, "_lock");
      class_1685 var7 = new class_1685()
         .method_7551(class_8940.field_45839, var5)
         .method_7551(class_8940.field_45836, var5)
         .method_7551(class_8940.field_45824, var5)
         .method_7551(class_8940.field_45832, var3)
         .method_7551(class_8940.field_45825, var3)
         .method_7551(class_8940.field_45840, var4)
         .method_7551(class_8940.field_45817, var6);
      Identifier var8 = class_9590.field_48866.method_34883(class_4783.field_23319, var7, this.field_42378);
      this.field_42380
         .accept(
            class_6065.method_27778(class_4783.field_23319, class_265.method_1150().method_1151(class_1120.field_6404, var8))
               .method_27775(class_121.<class_7660>method_360(class_6023.field_30677).method_45276(var1 -> this.method_38006(var1, class_265.method_1150())))
         );
   }

   public void method_37916() {
      this.method_37941(class_4783.field_23184);
      this.method_38047(class_4783.field_23765, class_4783.field_23184);
      this.method_38047(class_4783.field_23424, class_4783.field_23184);
      this.method_37941(class_4783.field_23862);
      this.method_37941(class_4783.field_23500);
      this.method_38047(class_4783.field_23269, class_4783.field_23900);
      this.method_37941(class_4783.field_23615);
      this.method_37941(class_4783.field_23848);
      this.method_37941(class_4783.field_23815);
      this.method_37941(class_4783.field_23660);
      this.method_38060(class_4897.field_25145);
      this.method_37941(class_4783.field_23899);
      this.method_37941(class_4783.field_23900);
      this.method_37941(class_4783.field_23811);
      this.method_37941(class_4783.field_23498);
      this.method_38060(class_4897.field_24952);
      this.method_37941(class_4783.field_23180);
      this.method_37941(class_4783.field_23306);
      this.method_37933(class_4783.field_23207, class_4897.field_24360);
      this.method_38060(class_4897.field_24360);
      this.method_37933(class_4783.field_23227, class_4897.field_24596);
      this.method_38060(class_4897.field_24596);
      this.method_38045(class_4783.field_23833, class_1685.method_7533(class_4783.field_23649, "_side"));
      this.method_38068(class_4783.field_23867, class_2109.field_10567);
      this.method_38068(class_4783.field_23580, class_2109.field_10567);
      this.method_38068(class_4783.field_23681, class_2109.field_10567);
      this.method_38068(class_4783.field_23527, class_2109.field_10567);
      this.method_38068(class_4783.field_23463, class_2109.field_10567);
      this.method_38068(class_4783.field_23897, class_2109.field_10567);
      this.method_38068(class_4783.field_23481, class_2109.field_10567);
      this.method_38068(class_4783.field_23249, class_2109.field_10567);
      this.method_38068(class_4783.field_23692, class_2109.field_10567);
      this.method_38068(class_4783.field_23272, class_2109.field_10567);
      this.method_38068(class_4783.field_23810, class_2109.field_10567);
      this.method_38068(class_4783.field_23161, class_2109.field_10569);
      this.method_38068(class_4783.field_23211, class_2109.field_10567);
      this.method_38068(class_4783.field_23584, class_2109.field_10567);
      this.method_38068(class_4783.field_23803, class_2109.field_10567);
      this.method_38068(class_4783.field_23196, class_2109.field_10567);
      this.method_38068(class_4783.field_23515, class_2109.field_10567);
      this.method_38068(class_4783.field_23658, class_2109.field_10567);
      this.method_38068(class_4783.field_23179, class_2109.field_10567);
      this.method_38068(class_4783.field_23437, class_2109.field_10567);
      this.method_38068(class_4783.field_23457, class_2109.field_10567);
      this.method_38068(class_4783.field_23389, class_2109.field_10567);
      this.method_38068(class_4783.field_23577, class_2109.field_10567);
      this.method_38068(class_4783.field_23560, class_2109.field_10567);
      this.method_38068(class_4783.field_23262, class_2109.field_10567);
      this.method_38068(class_4783.field_23222, class_2109.field_10567);
      this.method_38068(class_4783.field_23894, class_2109.field_10567);
      this.method_38068(class_4783.field_23368, class_2109.field_10567);
      this.method_38068(class_4783.field_23709, class_2109.field_10567);
      this.method_38068(class_4783.field_23574, class_2109.field_10567);
      this.method_38068(class_4783.field_23496, class_2109.field_10567);
      this.method_38068(class_4783.field_23312, class_2109.field_10576);
      this.method_38068(class_4783.field_23852, class_2109.field_10569);
      this.method_38068(class_4783.field_23261, class_2109.field_10569);
      this.method_38068(class_4783.field_23273, class_2109.field_10567);
      this.method_38068(class_4783.field_23472, class_2109.field_10567);
      this.method_38068(class_4783.field_23829, class_2109.field_10567);
      this.method_38068(class_4783.field_23881, class_2109.field_10567);
      this.method_38068(class_4783.field_23578, class_2109.field_10567);
      this.method_38068(class_4783.field_23329, class_2109.field_10567);
      this.method_38068(class_4783.field_23752, class_2109.field_10567);
      this.method_38068(class_4783.field_23784, class_2109.field_10567);
      this.method_38068(class_4783.field_23531, class_2109.field_10567);
      this.method_38068(class_4783.field_23617, class_2109.field_10567);
      this.method_38068(class_4783.field_23626, class_2109.field_10567);
      this.method_38068(class_4783.field_23563, class_2109.field_10568);
      this.method_38060(class_4897.field_24788);
      this.method_38068(class_4783.field_23252, class_2109.field_10580);
      this.method_38068(class_4783.field_23302, class_2109.field_10569);
      this.method_38068(class_4783.field_23490, class_2109.field_10567);
      this.method_38068(class_4783.field_23172, class_2109.field_10567);
      this.method_38068(class_4783.field_23787, class_2109.field_10567);
      this.method_38068(
         class_4783.field_23614,
         class_2109.field_10569.method_11641(var0 -> var0.method_7551(class_8940.field_45813, class_1685.method_7540(class_4783.field_23614)))
      );
      this.method_38068(class_4783.field_23543, class_2109.field_10567);
      this.method_38022(class_4783.field_23250, class_4783.field_23459);
      this.method_38022(class_4783.field_23236, class_4783.field_23160);
      this.method_38068(class_4783.field_23751, class_2109.field_10567);
      this.method_37925(class_4783.field_23919, class_4783.field_23692);
      this.method_37925(class_4783.field_23347, class_4783.field_23810);
      this.method_38065();
      this.method_37921();
      this.method_38061();
      this.method_37974(class_4783.field_23159, class_4783.field_23511);
      this.method_37915();
      this.method_38025();
      this.method_37947();
      this.method_37983();
      this.method_38013();
      this.method_37995();
      this.method_38051();
      this.method_38032(class_4783.field_23654);
      this.method_38005();
      this.method_37975();
      this.method_38001();
      this.method_38064();
      this.method_37982();
      this.method_38024();
      this.method_38078();
      this.method_38076();
      this.method_38007();
      this.method_37939();
      this.method_38081();
      this.method_38075();
      this.method_38063();
      this.method_38008();
      this.method_38077();
      this.method_37908();
      this.method_37950();
      this.method_37931();
      this.method_37980();
      this.method_38042();
      this.method_37961();
      this.method_37973();
      this.method_37971();
      this.method_37958();
      this.method_37996();
      this.method_37954();
      this.method_38056();
      this.method_38055();
      this.method_37917();
      this.method_37963();
      this.method_37992();
      this.method_37959();
      this.method_37967();
      this.method_37945(class_4783.field_23748);
      this.method_37914(class_4783.field_23748);
      this.method_37945(class_4783.field_23566);
      this.method_37923(class_4783.field_23521, class_4783.field_23740);
      this.method_37923(class_4783.field_23749, class_4783.field_23742);
      this.method_38028(class_4783.field_23794, class_4783.field_23893, class_1685::method_7538);
      this.method_38028(class_4783.field_23280, class_4783.field_23503, class_1685::method_7570);
      this.method_38016(class_4783.field_23598);
      this.method_38016(class_4783.field_23209);
      this.method_37999(class_4783.field_23304);
      this.method_37999(class_4783.field_23914);
      this.method_38062(class_4783.field_23754);
      this.method_38062(class_4783.field_23538);
      this.method_37957(class_4783.field_23708, class_6856.method_31446(class_4783.field_23708));
      this.method_37976(class_4783.field_23788, class_2109.field_10569);
      this.method_37976(class_4783.field_23642, class_2109.field_10569);
      this.method_37976(class_4783.field_23889, class_2109.field_10569);
      this.method_38052(class_4783.field_23592);
      this.method_38052(class_4783.field_23216);
      this.method_38052(class_4783.field_23814);
      this.method_38033(class_4783.field_23433);
      this.method_37934(class_4783.field_23429, class_2109.field_10569, class_2109.field_10563);
      this.method_37934(class_4783.field_23724, class_2109.field_10572, class_2109.field_10571);
      this.method_37934(class_4783.field_23735, class_2109.field_10572, class_2109.field_10571);
      this.method_37911(class_4783.field_23853, class_2109.field_10578);
      this.method_37935();
      this.method_37926(class_4783.field_23611, class_1685::method_7561);
      this.method_37926(class_4783.field_23338, class_1685::method_7562);
      this.method_37962(class_4783.field_23310, class_6023.field_30750, 0, 1, 2, 3);
      this.method_37962(class_4783.field_23327, class_6023.field_30676, 0, 0, 1, 1, 2, 2, 2, 3);
      this.method_37962(class_4783.field_23522, class_6023.field_30750, 0, 1, 1, 2);
      this.method_37962(class_4783.field_23638, class_6023.field_30676, 0, 0, 1, 1, 2, 2, 2, 3);
      this.method_37962(class_4783.field_23362, class_6023.field_30676, 0, 1, 2, 3, 4, 5, 6, 7);
      this.method_37928(class_6856.method_31449("banner"), class_4783.field_23893)
         .method_14031(
            class_9590.field_48805,
            class_4783.field_23597,
            class_4783.field_23706,
            class_4783.field_23768,
            class_4783.field_23902,
            class_4783.field_23562,
            class_4783.field_23775,
            class_4783.field_23821,
            class_4783.field_23705,
            class_4783.field_23287,
            class_4783.field_23909,
            class_4783.field_23168,
            class_4783.field_23831,
            class_4783.field_23447,
            class_4783.field_23772,
            class_4783.field_23335,
            class_4783.field_23487
         )
         .method_14032(
            class_4783.field_23316,
            class_4783.field_23633,
            class_4783.field_23176,
            class_4783.field_23436,
            class_4783.field_23318,
            class_4783.field_23837,
            class_4783.field_23413,
            class_4783.field_23645,
            class_4783.field_23875,
            class_4783.field_23629,
            class_4783.field_23470,
            class_4783.field_23411,
            class_4783.field_23208,
            class_4783.field_23823,
            class_4783.field_23707,
            class_4783.field_23747
         );
      this.method_37928(class_6856.method_31449("bed"), class_4783.field_23893)
         .method_14032(
            class_4783.field_23346,
            class_4783.field_23158,
            class_4783.field_23377,
            class_4783.field_23246,
            class_4783.field_23758,
            class_4783.field_23226,
            class_4783.field_23489,
            class_4783.field_23369,
            class_4783.field_23677,
            class_4783.field_23789,
            class_4783.field_23332,
            class_4783.field_23723,
            class_4783.field_23342,
            class_4783.field_23303,
            class_4783.field_23526,
            class_4783.field_23518
         );
      this.method_37987(class_4783.field_23346, class_4783.field_23300);
      this.method_37987(class_4783.field_23158, class_4783.field_23619);
      this.method_37987(class_4783.field_23377, class_4783.field_23905);
      this.method_37987(class_4783.field_23246, class_4783.field_23294);
      this.method_37987(class_4783.field_23758, class_4783.field_23640);
      this.method_37987(class_4783.field_23226, class_4783.field_23609);
      this.method_37987(class_4783.field_23489, class_4783.field_23850);
      this.method_37987(class_4783.field_23369, class_4783.field_23898);
      this.method_37987(class_4783.field_23677, class_4783.field_23450);
      this.method_37987(class_4783.field_23789, class_4783.field_23289);
      this.method_37987(class_4783.field_23332, class_4783.field_23595);
      this.method_37987(class_4783.field_23723, class_4783.field_23624);
      this.method_37987(class_4783.field_23342, class_4783.field_23308);
      this.method_37987(class_4783.field_23303, class_4783.field_23825);
      this.method_37987(class_4783.field_23526, class_4783.field_23713);
      this.method_37987(class_4783.field_23518, class_4783.field_23428);
      this.method_37928(class_6856.method_31449("skull"), class_4783.field_23784)
         .method_14031(
            class_9590.field_48784, class_4783.field_23445, class_4783.field_23525, class_4783.field_23635, class_4783.field_23878, class_4783.field_23444
         )
         .method_14030(class_4783.field_23363)
         .method_14032(
            class_4783.field_23799, class_4783.field_23376, class_4783.field_23423, class_4783.field_23474, class_4783.field_23702, class_4783.field_23279
         );
      this.method_38040(class_4783.field_23761);
      this.method_38040(class_4783.field_23873);
      this.method_38040(class_4783.field_23228);
      this.method_38040(class_4783.field_23858);
      this.method_38040(class_4783.field_23564);
      this.method_38040(class_4783.field_23400);
      this.method_38040(class_4783.field_23524);
      this.method_38040(class_4783.field_23777);
      this.method_38040(class_4783.field_23533);
      this.method_38040(class_4783.field_23476);
      this.method_38040(class_4783.field_23352);
      this.method_38040(class_4783.field_23293);
      this.method_38040(class_4783.field_23190);
      this.method_38040(class_4783.field_23475);
      this.method_38040(class_4783.field_23507);
      this.method_38040(class_4783.field_23819);
      this.method_38040(class_4783.field_23169);
      this.method_38068(class_4783.field_23906, class_2109.field_10579);
      this.method_37946(class_4783.field_23906);
      this.method_37928(class_6856.method_31449("chest"), class_4783.field_23893).method_14032(class_4783.field_23471, class_4783.field_23739);
      this.method_37928(class_6856.method_31449("ender_chest"), class_4783.field_23881).method_14032(class_4783.field_23492);
      this.method_37944(class_4783.field_23258, class_4783.field_23881).method_14030(class_4783.field_23258, class_4783.field_23824);
      this.method_38023(class_4783.field_23315);
      this.method_38023(class_4783.field_23407);
      this.method_38023(class_4783.field_23685);
      this.method_38023(class_4783.field_23781);
      this.method_38023(class_4783.field_23418);
      this.method_38023(class_4783.field_23717);
      this.method_38023(class_4783.field_23305);
      this.method_38023(class_4783.field_23508);
      this.method_38023(class_4783.field_23887);
      this.method_38023(class_4783.field_23605);
      this.method_38023(class_4783.field_23842);
      this.method_38023(class_4783.field_23686);
      this.method_38023(class_4783.field_23621);
      this.method_38023(class_4783.field_23317);
      this.method_38023(class_4783.field_23791);
      this.method_38023(class_4783.field_23639);
      this.method_38009(
         class_2109.field_10567,
         class_4783.field_23891,
         class_4783.field_23339,
         class_4783.field_23307,
         class_4783.field_23187,
         class_4783.field_23572,
         class_4783.field_23295,
         class_4783.field_23167,
         class_4783.field_23602,
         class_4783.field_23529,
         class_4783.field_23652,
         class_4783.field_23458,
         class_4783.field_23182,
         class_4783.field_23606,
         class_4783.field_23383,
         class_4783.field_23715,
         class_4783.field_23378
      );
      this.method_38023(class_4783.field_23344);
      this.method_38023(class_4783.field_23264);
      this.method_38023(class_4783.field_23486);
      this.method_38023(class_4783.field_23908);
      this.method_38023(class_4783.field_23840);
      this.method_38023(class_4783.field_23243);
      this.method_38023(class_4783.field_23857);
      this.method_38023(class_4783.field_23625);
      this.method_38023(class_4783.field_23198);
      this.method_38023(class_4783.field_23229);
      this.method_38023(class_4783.field_23387);
      this.method_38023(class_4783.field_23816);
      this.method_38023(class_4783.field_23793);
      this.method_38023(class_4783.field_23330);
      this.method_38023(class_4783.field_23773);
      this.method_38023(class_4783.field_23659);
      this.method_38023(class_4783.field_23711);
      this.method_38014(class_4783.field_23434, class_4783.field_23786);
      this.method_38014(class_4783.field_23627, class_4783.field_23720);
      this.method_38014(class_4783.field_23854, class_4783.field_23683);
      this.method_38014(class_4783.field_23917, class_4783.field_23510);
      this.method_38014(class_4783.field_23426, class_4783.field_23736);
      this.method_38014(class_4783.field_23678, class_4783.field_23856);
      this.method_38014(class_4783.field_23173, class_4783.field_23174);
      this.method_38014(class_4783.field_23647, class_4783.field_23766);
      this.method_38014(class_4783.field_23242, class_4783.field_23551);
      this.method_38014(class_4783.field_23456, class_4783.field_23218);
      this.method_38014(class_4783.field_23804, class_4783.field_23195);
      this.method_38014(class_4783.field_23727, class_4783.field_23776);
      this.method_38014(class_4783.field_23501, class_4783.field_23731);
      this.method_38014(class_4783.field_23895, class_4783.field_23721);
      this.method_38014(class_4783.field_23432, class_4783.field_23904);
      this.method_38014(class_4783.field_23643, class_4783.field_23795);
      this.method_38014(class_4783.field_23750, class_4783.field_23779);
      this.method_37955(
         class_2109.field_10565,
         class_4783.field_23416,
         class_4783.field_23178,
         class_4783.field_23404,
         class_4783.field_23722,
         class_4783.field_23548,
         class_4783.field_23701,
         class_4783.field_23277,
         class_4783.field_23901,
         class_4783.field_23603,
         class_4783.field_23263,
         class_4783.field_23581,
         class_4783.field_23340,
         class_4783.field_23360,
         class_4783.field_23202,
         class_4783.field_23477,
         class_4783.field_23225
      );
      this.method_38019(class_4783.field_23300, class_4783.field_23509);
      this.method_38019(class_4783.field_23619, class_4783.field_23920);
      this.method_38019(class_4783.field_23905, class_4783.field_23688);
      this.method_38019(class_4783.field_23294, class_4783.field_23298);
      this.method_38019(class_4783.field_23640, class_4783.field_23693);
      this.method_38019(class_4783.field_23609, class_4783.field_23359);
      this.method_38019(class_4783.field_23850, class_4783.field_23546);
      this.method_38019(class_4783.field_23898, class_4783.field_23497);
      this.method_38019(class_4783.field_23450, class_4783.field_23689);
      this.method_38019(class_4783.field_23289, class_4783.field_23662);
      this.method_38019(class_4783.field_23595, class_4783.field_23296);
      this.method_38019(class_4783.field_23624, class_4783.field_23841);
      this.method_38019(class_4783.field_23308, class_4783.field_23170);
      this.method_38019(class_4783.field_23825, class_4783.field_23569);
      this.method_38019(class_4783.field_23713, class_4783.field_23188);
      this.method_38019(class_4783.field_23428, class_4783.field_23656);
      this.method_38035(class_4783.field_23616, class_4783.field_23278, class_933.field_4772);
      this.method_38035(class_4783.field_23410, class_4783.field_23399, class_933.field_4774);
      this.method_38035(class_4783.field_23762, class_4783.field_23628, class_933.field_4774);
      this.method_38035(class_4783.field_23379, class_4783.field_23283, class_933.field_4774);
      this.method_38035(class_4783.field_23275, class_4783.field_23375, class_933.field_4774);
      this.method_38035(class_4783.field_23797, class_4783.field_23591, class_933.field_4774);
      this.method_38035(class_4783.field_23181, class_4783.field_23210, class_933.field_4774);
      this.method_38035(class_4783.field_23260, class_4783.field_23865, class_933.field_4774);
      this.method_38035(class_4783.field_23528, class_4783.field_23782, class_933.field_4774);
      this.method_38035(class_4783.field_23390, class_4783.field_23482, class_933.field_4774);
      this.method_38035(class_4783.field_23282, class_4783.field_23244, class_933.field_4774);
      this.method_38035(class_4783.field_23892, class_4783.field_23353, class_933.field_4774);
      this.method_38035(class_4783.field_23553, class_4783.field_23668, class_933.field_4774);
      this.method_38035(class_4783.field_23401, class_4783.field_23328, class_933.field_4774);
      this.method_38035(class_4783.field_23594, class_4783.field_23356, class_933.field_4774);
      this.method_38035(class_4783.field_23729, class_4783.field_23913, class_933.field_4774);
      this.method_38035(class_4783.field_23254, class_4783.field_23224, class_933.field_4774);
      this.method_38017(class_4783.field_23682);
      this.method_38017(class_4783.field_23714);
      this.method_38017(class_4783.field_23331);
      this.method_37936(class_4783.field_23868, class_933.field_4772);
      this.method_37940(class_4783.field_23337, class_933.field_4772);
      this.method_38060(class_4897.field_25275);
      this.method_37972(class_4783.field_23325, class_4783.field_23371, class_933.field_4772);
      this.method_38060(class_4897.field_24523);
      this.method_37946(class_4783.field_23371);
      this.method_37972(class_4783.field_23405, class_4783.field_23288, class_933.field_4774);
      this.method_37972(class_4783.field_23175, class_4783.field_23671, class_933.field_4774);
      this.method_38057(class_4783.field_23405, "_plant");
      this.method_37946(class_4783.field_23288);
      this.method_38057(class_4783.field_23175, "_plant");
      this.method_37946(class_4783.field_23671);
      this.method_37997(class_4783.field_23454, class_933.field_4772, class_1685.method_7560(class_1685.method_7533(class_4783.field_23886, "_stage0")));
      this.method_37932();
      this.method_37936(class_4783.field_23718, class_933.field_4774);
      this.method_38018(class_4783.field_23690, class_933.field_4774);
      this.method_38018(class_4783.field_23738, class_933.field_4774);
      this.method_38018(class_4783.field_23213, class_933.field_4774);
      this.method_38018(class_4783.field_23247, class_933.field_4772);
      this.method_38018(class_4783.field_23586, class_933.field_4772);
      this.method_38030();
      this.method_38000();
      this.method_37948(
         class_4783.field_23297,
         class_4783.field_23334,
         class_4783.field_23664,
         class_4783.field_23414,
         class_4783.field_23223,
         class_4783.field_23558,
         class_4783.field_23565,
         class_4783.field_23427
      );
      this.method_37948(
         class_4783.field_23655,
         class_4783.field_23238,
         class_4783.field_23324,
         class_4783.field_23488,
         class_4783.field_23380,
         class_4783.field_23452,
         class_4783.field_23674,
         class_4783.field_23291
      );
      this.method_37948(
         class_4783.field_23879,
         class_4783.field_23719,
         class_4783.field_23801,
         class_4783.field_23266,
         class_4783.field_23800,
         class_4783.field_23384,
         class_4783.field_23358,
         class_4783.field_23284
      );
      this.method_37948(
         class_4783.field_23523,
         class_4783.field_23417,
         class_4783.field_23240,
         class_4783.field_23408,
         class_4783.field_23885,
         class_4783.field_23245,
         class_4783.field_23790,
         class_4783.field_23430
      );
      this.method_37948(
         class_4783.field_23219,
         class_4783.field_23446,
         class_4783.field_23590,
         class_4783.field_23374,
         class_4783.field_23733,
         class_4783.field_23571,
         class_4783.field_23802,
         class_4783.field_23299
      );
      this.method_38070(class_4783.field_23212, class_4783.field_23744);
      this.method_38070(class_4783.field_23301, class_4783.field_23544);
      this.method_37912(class_4783.field_23545)
         .method_24634(class_4783.field_23494)
         .method_24629(class_4783.field_23915)
         .method_24633(class_4783.field_23618)
         .method_24628(class_4783.field_23555)
         .method_24637(class_4783.field_23734, class_4783.field_23462)
         .method_24635(class_4783.field_23439)
         .method_24638(class_4783.field_23636);
      this.method_38043(class_4783.field_23665);
      this.method_38039(class_4783.field_23513);
      this.method_37909(class_4783.field_23189).method_39396(class_4783.field_23189).method_39393(class_4783.field_23882);
      this.method_37909(class_4783.field_23185).method_39396(class_4783.field_23185).method_39393(class_4783.field_23798);
      this.method_38035(class_4783.field_23221, class_4783.field_23357, class_933.field_4774);
      this.method_38068(class_4783.field_23756, class_2109.field_10577);
      this.method_37912(class_4783.field_23503)
         .method_24634(class_4783.field_23672)
         .method_24629(class_4783.field_23703)
         .method_24633(class_4783.field_23391)
         .method_24628(class_4783.field_23309)
         .method_24637(class_4783.field_23600, class_4783.field_23392)
         .method_24635(class_4783.field_23393)
         .method_24638(class_4783.field_23757);
      this.method_38043(class_4783.field_23382);
      this.method_38039(class_4783.field_23684);
      this.method_37909(class_4783.field_23764).method_39396(class_4783.field_23764).method_39393(class_4783.field_23241);
      this.method_37909(class_4783.field_23872).method_39396(class_4783.field_23872).method_39393(class_4783.field_23631);
      this.method_38035(class_4783.field_23256, class_4783.field_23827, class_933.field_4774);
      this.method_38068(class_4783.field_23467, class_2109.field_10577);
      this.method_37912(class_4783.field_23893)
         .method_24634(class_4783.field_23200)
         .method_24629(class_4783.field_23778)
         .method_24633(class_4783.field_23753)
         .method_24628(class_4783.field_23233)
         .method_24637(class_4783.field_23760, class_4783.field_23771)
         .method_24635(class_4783.field_23205)
         .method_24635(class_4783.field_23822)
         .method_24638(class_4783.field_23696);
      this.method_38043(class_4783.field_23746);
      this.method_37953(class_4783.field_23567);
      this.method_37909(class_4783.field_23365).method_39396(class_4783.field_23365).method_39393(class_4783.field_23732);
      this.method_37909(class_4783.field_23903).method_39396(class_4783.field_23903).method_39393(class_4783.field_23237);
      this.method_38035(class_4783.field_23890, class_4783.field_23232, class_933.field_4774);
      this.method_38068(class_4783.field_23539, class_2109.field_10577);
      this.method_37912(class_4783.field_23464)
         .method_24634(class_4783.field_23699)
         .method_24629(class_4783.field_23792)
         .method_24633(class_4783.field_23322)
         .method_24628(class_4783.field_23438)
         .method_24637(class_4783.field_23589, class_4783.field_23163)
         .method_24635(class_4783.field_23843)
         .method_24638(class_4783.field_23759);
      this.method_38043(class_4783.field_23409);
      this.method_38039(class_4783.field_23164);
      this.method_37909(class_4783.field_23579).method_39396(class_4783.field_23579).method_39393(class_4783.field_23270);
      this.method_37909(class_4783.field_23691).method_39396(class_4783.field_23691).method_39393(class_4783.field_23443);
      this.method_38035(class_4783.field_23483, class_4783.field_23556, class_933.field_4774);
      this.method_38068(class_4783.field_23493, class_2109.field_10577);
      this.method_37912(class_4783.field_23916)
         .method_24634(class_4783.field_23669)
         .method_24629(class_4783.field_23499)
         .method_24633(class_4783.field_23697)
         .method_24628(class_4783.field_23783)
         .method_24637(class_4783.field_23918, class_4783.field_23663)
         .method_24635(class_4783.field_23217)
         .method_24638(class_4783.field_23290);
      this.method_38043(class_4783.field_23623);
      this.method_37953(class_4783.field_23680);
      this.method_37909(class_4783.field_23197).method_39396(class_4783.field_23197).method_39393(class_4783.field_23171);
      this.method_37909(class_4783.field_23832).method_39396(class_4783.field_23832).method_39393(class_4783.field_23805);
      this.method_38035(class_4783.field_23725, class_4783.field_23415, class_933.field_4774);
      this.method_38068(class_4783.field_23268, class_2109.field_10577);
      this.method_37912(class_4783.field_23373)
         .method_24634(class_4783.field_23630)
         .method_24629(class_4783.field_23694)
         .method_24633(class_4783.field_23234)
         .method_24628(class_4783.field_23670)
         .method_24637(class_4783.field_23267, class_4783.field_23192)
         .method_24635(class_4783.field_23573)
         .method_24638(class_4783.field_23568);
      this.method_38043(class_4783.field_23653);
      this.method_38039(class_4783.field_23622);
      this.method_37909(class_4783.field_23876).method_39396(class_4783.field_23876).method_39393(class_4783.field_23199);
      this.method_37909(class_4783.field_23599).method_39396(class_4783.field_23599).method_39393(class_4783.field_23907);
      this.method_38035(class_4783.field_23469, class_4783.field_23745, class_933.field_4774);
      this.method_38068(class_4783.field_23386, class_2109.field_10577);
      this.method_37912(class_4783.field_23830)
         .method_24634(class_4783.field_23728)
         .method_24629(class_4783.field_23864)
         .method_24633(class_4783.field_23516)
         .method_24628(class_4783.field_23874)
         .method_24637(class_4783.field_23769, class_4783.field_23394)
         .method_24635(class_4783.field_23479)
         .method_24638(class_4783.field_23818);
      this.method_38043(class_4783.field_23345);
      this.method_38039(class_4783.field_23596);
      this.method_37909(class_4783.field_23912).method_39394(class_4783.field_23912).method_39393(class_4783.field_23780);
      this.method_37909(class_4783.field_23880).method_39394(class_4783.field_23880).method_39393(class_4783.field_23473);
      this.method_38035(class_4783.field_23435, class_4783.field_23851, class_933.field_4774);
      this.method_37988(class_4783.field_23679, class_4783.field_23542);
      this.method_37912(class_4783.field_23248)
         .method_24634(class_4783.field_23530)
         .method_24629(class_4783.field_23425)
         .method_24633(class_4783.field_23520)
         .method_24628(class_4783.field_23661)
         .method_24637(class_4783.field_23570, class_4783.field_23321)
         .method_24635(class_4783.field_23257)
         .method_24638(class_4783.field_23251);
      this.method_38043(class_4783.field_23253);
      this.method_38039(class_4783.field_23593);
      this.method_37909(class_4783.field_23442).method_39394(class_4783.field_23442).method_39393(class_4783.field_23537);
      this.method_37909(class_4783.field_23612).method_39394(class_4783.field_23612).method_39393(class_4783.field_23844);
      this.method_38035(class_4783.field_23809, class_4783.field_23402, class_933.field_4774);
      this.method_37988(class_4783.field_23826, class_4783.field_23704);
      this.method_37940(class_4783.field_23585, class_933.field_4774);
      this.method_38060(class_4897.field_24950);
      this.method_37985(class_1685.method_7564(class_4783.field_23644)).method_24632(var1 -> {
         Identifier var4 = class_9590.field_48833.method_34883(class_4783.field_23644, var1, this.field_42378);
         Identifier var5 = class_9590.field_48781.method_34883(class_4783.field_23644, var1, this.field_42378);
         this.field_42380.accept(method_37968(class_4783.field_23644, var4, var5));
         return var4;
      }).method_24635(class_4783.field_23326).method_24628(class_4783.field_23820).method_24634(class_4783.field_23448).method_24638(class_4783.field_23502);
      this.method_38043(class_4783.field_23847);
      this.method_37953(class_4783.field_23763);
      this.method_37912(class_4783.field_23355).method_24631(class_4783.field_23333).method_24638(class_4783.field_23712).method_24635(class_4783.field_23449);
      this.method_37912(class_4783.field_23657).method_24631(class_4783.field_23561).method_24638(class_4783.field_23276).method_24635(class_4783.field_23869);
      this.method_37912(class_4783.field_23808).method_24631(class_4783.field_23406).method_24638(class_4783.field_23364).method_24635(class_4783.field_23351);
      this.method_37912(class_4783.field_23774).method_24631(class_4783.field_23755).method_24638(class_4783.field_23675).method_24635(class_4783.field_23550);
      this.method_37912(class_4783.field_23186).method_24631(class_4783.field_23292).method_24638(class_4783.field_23921).method_24635(class_4783.field_23398);
      this.method_37912(class_4783.field_23536).method_24638(class_4783.field_23341).method_24635(class_4783.field_23194);
      this.method_37912(class_4783.field_23441).method_24638(class_4783.field_23607).method_24635(class_4783.field_23687);
      this.method_37960(class_4783.field_23459, class_2109.field_10557)
         .method_24631(class_4783.field_23838)
         .method_24638(class_4783.field_23859)
         .method_24635(class_4783.field_23575);
      this.method_38038(class_4783.field_23505, class_2109.method_9869(class_1685.method_7533(class_4783.field_23459, "_top")))
         .method_24635(class_4783.field_23620)
         .method_24638(class_4783.field_23466);
      this.method_38038(
            class_4783.field_23863,
            class_2109.field_10569
               .method_11639(class_4783.field_23459)
               .method_9874(var0 -> var0.method_7551(class_8940.field_45813, class_1685.method_7540(class_4783.field_23863)))
         )
         .method_24635(class_4783.field_23532);
      this.method_37960(class_4783.field_23160, class_2109.field_10557)
         .method_24631(class_4783.field_23193)
         .method_24638(class_4783.field_23455)
         .method_24635(class_4783.field_23911);
      this.method_38038(class_4783.field_23743, class_2109.method_9869(class_1685.method_7533(class_4783.field_23160, "_top")))
         .method_24635(class_4783.field_23849)
         .method_24638(class_4783.field_23559);
      this.method_38038(
            class_4783.field_23610,
            class_2109.field_10569
               .method_11639(class_4783.field_23160)
               .method_9874(var0 -> var0.method_7551(class_8940.field_45813, class_1685.method_7540(class_4783.field_23610)))
         )
         .method_24635(class_4783.field_23888);
      this.method_37912(class_4783.field_23422).method_24631(class_4783.field_23480).method_24638(class_4783.field_23613).method_24635(class_4783.field_23676);
      this.method_37912(class_4783.field_23484)
         .method_24629(class_4783.field_23587)
         .method_24631(class_4783.field_23230)
         .method_24638(class_4783.field_23204)
         .method_24635(class_4783.field_23737);
      this.method_37912(class_4783.field_23403).method_24638(class_4783.field_23183).method_24635(class_4783.field_23828);
      this.method_37912(class_4783.field_23440).method_24631(class_4783.field_23485).method_24638(class_4783.field_23576).method_24635(class_4783.field_23836);
      this.method_37912(class_4783.field_23514).method_24638(class_4783.field_23465).method_24635(class_4783.field_23667);
      this.method_37912(class_4783.field_23695).method_24631(class_4783.field_23420).method_24638(class_4783.field_23583).method_24635(class_4783.field_23651);
      this.method_37912(class_4783.field_23716).method_24638(class_4783.field_23286).method_24635(class_4783.field_23177);
      this.method_37912(class_4783.field_23271).method_24631(class_4783.field_23604).method_24638(class_4783.field_23632).method_24635(class_4783.field_23191);
      this.method_37912(class_4783.field_23582).method_24638(class_4783.field_23396).method_24635(class_4783.field_23710);
      this.method_37912(class_4783.field_23370).method_24631(class_4783.field_23866).method_24638(class_4783.field_23495).method_24635(class_4783.field_23453);
      this.method_37960(class_4783.field_23206, class_2109.field_10569).method_24638(class_4783.field_23343).method_24635(class_4783.field_23506);
      this.method_38038(class_4783.field_23412, class_2109.method_9869(class_1685.method_7533(class_4783.field_23206, "_bottom")))
         .method_24638(class_4783.field_23255)
         .method_24635(class_4783.field_23451);
      this.method_37912(class_4783.field_23419).method_24635(class_4783.field_23354).method_24638(class_4783.field_23910).method_24631(class_4783.field_23767);
      this.method_37960(class_4783.field_23785, class_2109.field_10575)
         .method_24631(class_4783.field_23884)
         .method_24638(class_4783.field_23361)
         .method_24635(class_4783.field_23726);
      this.method_37912(class_4783.field_23549).method_24631(class_4783.field_23388).method_24638(class_4783.field_23214).method_24635(class_4783.field_23512);
      this.method_37912(class_4783.field_23534)
         .method_24631(class_4783.field_23165)
         .method_24628(class_4783.field_23397)
         .method_24634(class_4783.field_23381)
         .method_24638(class_4783.field_23314)
         .method_24635(class_4783.field_23395);
      this.method_37951();
      this.method_38002(class_4783.field_23540);
      this.method_37938(class_4783.field_23385);
      this.method_37938(class_4783.field_23517);
      this.method_37938(class_4783.field_23285);
      this.method_37965();
      this.method_37919(class_4783.field_23730);
      this.method_37919(class_4783.field_23265);
      this.method_37919(class_4783.field_23601);
      this.method_37970(class_4783.field_23796);
      this.method_37970(class_4783.field_23839);
      this.method_37970(class_4783.field_23845);
      this.method_38029();
      this.method_38072();
      this.method_38053(class_4783.field_23883, class_2109.field_10573);
      this.method_38053(class_4783.field_23557, class_2109.field_10573);
      this.method_38053(class_4783.field_23203, class_2109.field_10578);
      this.method_37998();
      this.method_37986();
      this.method_38021(class_4783.field_23543, class_4783.field_23519);
      this.method_38021(class_4783.field_23808, class_4783.field_23835);
      this.method_38021(class_4783.field_23262, class_4783.field_23648);
      this.method_38021(class_4783.field_23657, class_4783.field_23235);
      this.method_38046();
      this.method_38021(class_4783.field_23355, class_4783.field_23231);
      class_3003.method_13716().forEach(var1 -> this.method_38020(var1, class_6856.method_31447("template_spawn_egg")));
   }
}
