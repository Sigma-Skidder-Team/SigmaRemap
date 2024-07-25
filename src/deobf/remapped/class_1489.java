package remapped;

import com.mojang.datafixers.DataFixer;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BooleanSupplier;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class class_1489 extends class_9821<class_4402> {
   private static String[] field_7940;
   private final class_3857 field_7938;
   private final LongSet field_7939 = new LongOpenHashSet();

   public class_1489(File var1, DataFixer var2, boolean var3) {
      super(var1, class_4402::method_20519, class_4402::new, var2, class_5397.field_27549, var3);
      this.field_7938 = new class_3857(this);
   }

   public void method_6878(class_1331 var1, class_236 var2) {
      this.method_45269(class_6979.method_31921(var1).method_31925()).method_20516(var1, var2);
   }

   public void method_6864(class_1331 var1) {
      this.method_45269(class_6979.method_31921(var1).method_31925()).method_20510(var1);
   }

   public long method_6866(Predicate<class_236> var1, class_1331 var2, int var3, class_8122 var4) {
      return this.method_6877(var1, var2, var3, var4).count();
   }

   public boolean method_6868(class_236 var1, class_1331 var2) {
      Optional var5 = this.method_45269(class_6979.method_31921(var2).method_31925()).method_20515(var2);
      return var5.isPresent() && ((class_236)var5.get()).equals(var1);
   }

   public Stream<class_8009> method_6863(Predicate<class_236> var1, class_1331 var2, int var3, class_8122 var4) {
      int var7 = Math.floorDiv(var3, 16) + 1;
      return class_2034.method_9542(new class_2034(var2), var7).<class_8009>flatMap(var3x -> this.method_6872(var1, var3x, var4)).filter(var2x -> {
         class_1331 var5 = var2x.method_36337();
         return Math.abs(var5.method_12173() - var2.method_12173()) <= var3 && Math.abs(var5.method_12185() - var2.method_12185()) <= var3;
      });
   }

   public Stream<class_8009> method_6877(Predicate<class_236> var1, class_1331 var2, int var3, class_8122 var4) {
      int var7 = var3 * var3;
      return this.method_6863(var1, var2, var3, var4).filter(var2x -> var2x.method_36337().method_12180(var2) <= (double)var7);
   }

   public Stream<class_8009> method_6872(Predicate<class_236> var1, class_2034 var2, class_8122 var3) {
      return IntStream.range(0, 16)
         .boxed()
         .<Optional<class_4402>>map(var2x -> this.method_45260(class_6979.method_31922(var2, var2x).method_31925()))
         .filter(Optional::isPresent)
         .<class_8009>flatMap(var2x -> var2x.get().method_20511(var1, var3));
   }

   public Stream<class_1331> method_6867(Predicate<class_236> var1, Predicate<class_1331> var2, class_1331 var3, int var4, class_8122 var5) {
      return this.method_6877(var1, var3, var4, var5).<class_1331>map(class_8009::method_36337).filter(var2);
   }

   public Stream<class_1331> method_6875(Predicate<class_236> var1, Predicate<class_1331> var2, class_1331 var3, int var4, class_8122 var5) {
      return this.method_6867(var1, var2, var3, var4, var5).sorted(Comparator.comparingDouble(var1x -> var1x.method_12180(var3)));
   }

   public Optional<class_1331> method_6876(Predicate<class_236> var1, Predicate<class_1331> var2, class_1331 var3, int var4, class_8122 var5) {
      return this.method_6867(var1, var2, var3, var4, var5).findFirst();
   }

   public Optional<class_1331> method_6880(Predicate<class_236> var1, class_1331 var2, int var3, class_8122 var4) {
      return this.method_6877(var1, var2, var3, var4)
         .<class_1331>map(class_8009::method_36337)
         .min(Comparator.comparingDouble(var1x -> var1x.method_12180(var2)));
   }

   public Optional<class_1331> method_6861(Predicate<class_236> var1, Predicate<class_1331> var2, class_1331 var3, int var4) {
      return this.method_6877(var1, var3, var4, class_8122.field_41617).filter(var1x -> var2.test(var1x.method_36337())).findFirst().<class_1331>map(var0 -> {
         var0.method_36339();
         return var0.method_36337();
      });
   }

   public Optional<class_1331> method_6881(Predicate<class_236> var1, Predicate<class_1331> var2, class_8122 var3, class_1331 var4, int var5, Random var6) {
      List var9 = this.method_6877(var1, var4, var5, var3).collect(Collectors.toList());
      Collections.shuffle(var9, var6);
      return var9.stream().filter(var1x -> var2.test(var1x.method_36337())).findFirst().<class_1331>map(class_8009::method_36337);
   }

   public boolean method_6860(class_1331 var1) {
      return this.method_45269(class_6979.method_31921(var1).method_31925()).method_20512(var1);
   }

   public boolean method_6869(class_1331 var1, Predicate<class_236> var2) {
      return this.method_45260(class_6979.method_31921(var1).method_31925()).<Boolean>map(var2x -> var2x.method_20514(var1, var2)).orElse(false);
   }

   public Optional<class_236> method_6870(class_1331 var1) {
      class_4402 var4 = this.method_45269(class_6979.method_31921(var1).method_31925());
      return var4.method_20515(var1);
   }

   public int method_6871(class_6979 var1) {
      this.field_7938.method_17895();
      return this.field_7938.method_27698(var1.method_31925());
   }

   private boolean method_6874(long var1) {
      Optional var5 = this.method_45266(var1);
      return var5 != null ? var5.<Boolean>map(var0 -> var0.method_20511(class_236.field_768, class_8122.field_41618).count() > 0L).orElse(false) : false;
   }

   @Override
   public void method_45259(BooleanSupplier var1) {
      super.method_45259(var1);
      this.field_7938.method_17895();
   }

   @Override
   public void method_45270(long var1) {
      super.method_45270(var1);
      this.field_7938.method_22640(var1, this.field_7938.method_22639(var1), false);
   }

   @Override
   public void method_45267(long var1) {
      this.field_7938.method_22640(var1, this.field_7938.method_22639(var1), false);
   }

   public void method_6879(class_2034 var1, class_1315 var2) {
      class_6979 var5 = class_6979.method_31922(var1, var2.method_5997() >> 4);
      Util.<class_4402>method_44691(this.method_45260(var5.method_31925()), var3 -> var3.method_20513(var3x -> {
            if (method_6865(var2)) {
               this.method_6882(var2, var5, var3x);
            }
         }), () -> {
         if (method_6865(var2)) {
            class_4402 var5x = this.method_45269(var5.method_31925());
            this.method_6882(var2, var5, var5x::method_20516);
         }
      });
   }

   private static boolean method_6865(class_1315 var0) {
      return var0.method_5993(class_236.field_762::contains);
   }

   private void method_6882(class_1315 var1, class_6979 var2, BiConsumer<class_1331, class_236> var3) {
      var2.method_31902()
         .forEach(
            var2x -> {
               class_2522 var5 = var1.method_5999(
                  class_6979.method_31913(var2x.method_12173()), class_6979.method_31913(var2x.method_12165()), class_6979.method_31913(var2x.method_12185())
               );
               class_236.method_1004(var5).ifPresent(var2xx -> var3.accept(var2x, var2xx));
            }
         );
   }

   public void method_6862(class_4924 var1, class_1331 var2, int var3) {
      class_6979.method_31891(new class_2034(var2), Math.floorDiv(var3, 16))
         .<Pair>map(var1x -> Pair.of(var1x, this.method_45260(var1x.method_31925())))
         .filter(var0 -> !((Optional)var0.getSecond()).<Boolean>map(class_4402::method_20520).orElse(false))
         .<class_2034>map(var0 -> ((class_6979)var0.getFirst()).method_31917())
         .filter(var1x -> this.field_7939.add(var1x.method_9539()))
         .forEach(var1x -> var1.method_22554(var1x.field_10328, var1x.field_10327, class_7335.field_37504));
   }
}
