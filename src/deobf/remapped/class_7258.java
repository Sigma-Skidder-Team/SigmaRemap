package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public class class_7258 extends class_3498 {
   private static final class_985 field_37189 = new class_985(-7, ImmutableList.of(1.0, 1.0));
   public static final MapCodec<class_7258> field_37182 = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               Codec.LONG.fieldOf("seed").forGetter(var0x -> var0x.field_37179),
               RecordCodecBuilder.create(
                     var0x -> var0x.group(
                              class_1428.field_7715.fieldOf("parameters").forGetter(Pair::getFirst),
                              class_6325.field_32303.fieldOf("biome").forGetter(Pair::getSecond)
                           )
                           .apply(var0x, Pair::of)
                  )
                  .listOf()
                  .fieldOf("biomes")
                  .forGetter(var0x -> var0x.field_37180),
               class_985.field_5019.fieldOf("temperature_noise").forGetter(var0x -> var0x.field_37186),
               class_985.field_5019.fieldOf("humidity_noise").forGetter(var0x -> var0x.field_37187),
               class_985.field_5019.fieldOf("altitude_noise").forGetter(var0x -> var0x.field_37191),
               class_985.field_5019.fieldOf("weirdness_noise").forGetter(var0x -> var0x.field_37193)
            )
            .apply(var0, class_7258::new)
   );
   public static final Codec<class_7258> field_37188 = Codec.mapEither(class_8044.field_41202, field_37182)
      .xmap(
         var0 -> (class_7258)var0.map(class_8044::method_36509, Function.identity()),
         var0 -> var0.method_33175().<Either>map(Either::left).orElseGet(() -> Either.right(var0))
      )
      .codec();
   private final class_985 field_37186;
   private final class_985 field_37187;
   private final class_985 field_37191;
   private final class_985 field_37193;
   private final class_7853 field_37190;
   private final class_7853 field_37184;
   private final class_7853 field_37181;
   private final class_7853 field_37183;
   private final List<Pair<class_1428, Supplier<class_6325>>> field_37180;
   private final boolean field_37192;
   private final long field_37179;
   private final Optional<Pair<class_8669<class_6325>, class_8796>> field_37185;

   private class_7258(long var1, List<Pair<class_1428, Supplier<class_6325>>> var3, Optional<Pair<class_8669<class_6325>, class_8796>> var4) {
      this(var1, var3, field_37189, field_37189, field_37189, field_37189, var4);
   }

   private class_7258(long var1, List<Pair<class_1428, Supplier<class_6325>>> var3, class_985 var4, class_985 var5, class_985 var6, class_985 var7) {
      this(var1, var3, var4, var5, var6, var7, Optional.<Pair<class_8669<class_6325>, class_8796>>empty());
   }

   private class_7258(
      long var1,
      List<Pair<class_1428, Supplier<class_6325>>> var3,
      class_985 var4,
      class_985 var5,
      class_985 var6,
      class_985 var7,
      Optional<Pair<class_8669<class_6325>, class_8796>> var8
   ) {
      super(var3.stream().<Supplier<class_6325>>map(Pair::getSecond));
      this.field_37179 = var1;
      this.field_37185 = var8;
      this.field_37186 = var4;
      this.field_37187 = var5;
      this.field_37191 = var6;
      this.field_37193 = var7;
      this.field_37190 = class_7853.method_35530(new class_8679(var1), var4.method_4295(), var4.method_4294());
      this.field_37184 = class_7853.method_35530(new class_8679(var1 + 1L), var5.method_4295(), var5.method_4294());
      this.field_37181 = class_7853.method_35530(new class_8679(var1 + 2L), var6.method_4295(), var6.method_4294());
      this.field_37183 = class_7853.method_35530(new class_8679(var1 + 3L), var7.method_4295(), var7.method_4294());
      this.field_37180 = var3;
      this.field_37192 = false;
   }

   @Override
   public Codec<? extends class_3498> method_16088() {
      return field_37188;
   }

   @Override
   public class_3498 method_16083(long var1) {
      return new class_7258(var1, this.field_37180, this.field_37186, this.field_37187, this.field_37191, this.field_37193, this.field_37185);
   }

   private Optional<class_8044> method_33175() {
      return this.field_37185.<class_8044>map(var1 -> new class_8044((class_8796)var1.getSecond(), (class_8669)var1.getFirst(), this.field_37179, null));
   }

   @Override
   public class_6325 method_28192(int var1, int var2, int var3) {
      int var6 = !this.field_37192 ? 0 : var2;
      class_1428 var7 = new class_1428(
         (float)this.field_37190.method_35528((double)var1, (double)var6, (double)var3),
         (float)this.field_37184.method_35528((double)var1, (double)var6, (double)var3),
         (float)this.field_37181.method_35528((double)var1, (double)var6, (double)var3),
         (float)this.field_37183.method_35528((double)var1, (double)var6, (double)var3),
         0.0F
      );
      return this.field_37180
         .stream()
         .min(Comparator.comparing(var1x -> ((class_1428)var1x.getFirst()).method_6569(var7)))
         .map(Pair::getSecond)
         .<class_6325>map(Supplier::get)
         .orElse(class_6297.field_32178);
   }

   public boolean method_33176(long var1) {
      return this.field_37179 == var1 && this.field_37185.isPresent() && Objects.equals(this.field_37185.get().getSecond(), class_8796.field_45008);
   }
}
