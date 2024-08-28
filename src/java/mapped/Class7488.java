package mapped;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public class Class7488 extends Class7487 {
   private static final Codec<Either<ResourceLocation, Class8969>> field32185 = Codec.of(Class7488::method24404, ResourceLocation.field13020.map(Either::left));
   public static final Codec<Class7488> field32186 = RecordCodecBuilder.create(
      var0 -> var0.group(method24406(), method24405(), method24379()).apply(var0, Class7488::new)
   );
   public final Either<ResourceLocation, Class8969> field32187;
   public final Supplier<Class3622> field32188;

   private static <T> DataResult<T> method24404(Either<ResourceLocation, Class8969> var0, DynamicOps<T> var1, T var2) {
      Optional<ResourceLocation> var5 = var0.left();
      return var5.isPresent() ? ResourceLocation.field13020.encode(var5.get(), var1, var2) : DataResult.error("Can not serialize a runtime pool element");
   }

   public static <E extends Class7488> RecordCodecBuilder<E, Supplier<Class3622>> method24405() {
      return Class7525.field32306.fieldOf("processors").forGetter(var0 -> var0.field32188);
   }

   public static <E extends Class7488> RecordCodecBuilder<E, Either<ResourceLocation, Class8969>> method24406() {
      return field32185.fieldOf("location").forGetter(var0 -> var0.field32187);
   }

   public Class7488(Either<ResourceLocation, Class8969> var1, Supplier<Class3622> var2, Class109 var3) {
      super(var3);
      this.field32187 = var1;
      this.field32188 = var2;
   }

   public Class7488(Class8969 var1) {
      this(Either.right(var1), () -> Class8523.field38250, Class109.field367);
   }

   private Class8969 method24407(Class8761 var1) {
      return (Class8969)this.field32187.map(var1::method31603, Function.identity());
   }

   public List<Class8266> method24408(Class8761 var1, BlockPos var2, Class80 var3, boolean var4) {
      Class8969 var7 = this.method24407(var1);
      List<Class8266> var8 = var7.method32894(var2, new Class9463().method36426(var3), Blocks.field37113, var4);
      ArrayList var9 = Lists.newArrayList();

      for (Class8266 var11 : var8) {
         if (var11.field35532 != null) {
            Class104 var12 = Class104.valueOf(var11.field35532.method126("mode"));
            if (var12 == Class104.field321) {
               var9.add(var11);
            }
         }
      }

      return var9;
   }

   @Override
   public List<Class8266> method24374(Class8761 var1, BlockPos var2, Class80 var3, Random var4) {
      Class8969 var7 = this.method24407(var1);
      List var8 = var7.method32894(var2, new Class9463().method36426(var3), Blocks.field37114, true);
      Collections.shuffle(var8, var4);
      return var8;
   }

   @Override
   public Class9764 method24375(Class8761 var1, BlockPos var2, Class80 var3) {
      Class8969 var6 = this.method24407(var1);
      return var6.method32909(new Class9463().method36426(var3), var2);
   }

   @Override
   public boolean method24376(
           Class8761 var1, Class1658 var2, Class7480 var3, Class5646 var4, BlockPos var5, BlockPos var6, Class80 var7, Class9764 var8, Random var9, boolean var10
   ) {
      Class8969 var13 = this.method24407(var1);
      Class9463 var14 = this.method24409(var7, var8, var10);
      if (!var13.method32899(var2, var5, var6, var14, var9, 18)) {
         return false;
      } else {
         for (Class8266 var16 : Class8969.method32901(var2, var5, var6, var14, this.method24408(var1, var5, var7, false))) {
            this.method24380(var2, var16, var5, var7, var9, var8);
         }

         return true;
      }
   }

   public Class9463 method24409(Class80 var1, Class9764 var2, boolean var3) {
      Class9463 var6 = new Class9463();
      var6.method36430(var2);
      var6.method36426(var1);
      var6.method36432(true);
      var6.method36428(false);
      var6.method36434(Class7095.field30526);
      var6.method36448(true);
      if (!var3) {
         var6.method36434(Class7099.field30539);
      }

      this.field32188.get().method12261().forEach(var6::method36434);
      this.method24382().method303().forEach(var6::method36434);
      return var6;
   }

   @Override
   public Class8325<?> method24377() {
      return Class8325.field35770;
   }

   @Override
   public String toString() {
      return "Single[" + this.field32187 + "]";
   }
}
