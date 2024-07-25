package remapped;

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

public class class_8781 extends class_2609 {
   private static final Codec<Either<class_4639, class_6561>> field_44938 = Codec.of(class_8781::method_40364, class_4639.field_22655.map(Either::left));
   public static final Codec<class_8781> field_44941 = RecordCodecBuilder.create(
      var0 -> var0.group(method_40367(), method_40366(), method_11825()).apply(var0, class_8781::new)
   );
   public final Either<class_4639, class_6561> field_44942;
   public final Supplier<class_86> field_44940;

   private static <T> DataResult<T> method_40364(Either<class_4639, class_6561> var0, DynamicOps<T> var1, T var2) {
      Optional var5 = var0.left();
      return var5.isPresent() ? class_4639.field_22655.encode(var5.get(), var1, var2) : DataResult.error("Can not serialize a runtime pool element");
   }

   public static <E extends class_8781> RecordCodecBuilder<E, Supplier<class_86>> method_40366() {
      return class_2111.field_10583.fieldOf("processors").forGetter(var0 -> var0.field_44940);
   }

   public static <E extends class_8781> RecordCodecBuilder<E, Either<class_4639, class_6561>> method_40367() {
      return field_44938.fieldOf("location").forGetter(var0 -> var0.field_44942);
   }

   public class_8781(Either<class_4639, class_6561> var1, Supplier<class_86> var2, class_7599 var3) {
      super(var3);
      this.field_44942 = var1;
      this.field_44940 = var2;
   }

   public class_8781(class_6561 var1) {
      this(Either.right(var1), () -> class_4932.field_25542, class_7599.field_38708);
   }

   private class_6561 method_40368(class_5799 var1) {
      return (class_6561)this.field_44942.map(var1::method_26279, Function.identity());
   }

   public List<class_4099> method_40369(class_5799 var1, class_1331 var2, class_6631 var3, boolean var4) {
      class_6561 var7 = this.method_40368(var1);
      List var8 = var7.method_29987(var2, new class_8478().method_39053(var3), class_4783.field_23846, var4);
      ArrayList var9 = Lists.newArrayList();

      for (class_4099 var11 : var8) {
         if (var11.field_19968 != null) {
            class_589 var12 = class_589.valueOf(var11.field_19968.method_25965("mode"));
            if (var12 == class_589.field_3411) {
               var9.add(var11);
            }
         }
      }

      return var9;
   }

   @Override
   public List<class_4099> method_11829(class_5799 var1, class_1331 var2, class_6631 var3, Random var4) {
      class_6561 var7 = this.method_40368(var1);
      List var8 = var7.method_29987(var2, new class_8478().method_39053(var3), class_4783.field_23319, true);
      Collections.shuffle(var8, var4);
      return var8;
   }

   @Override
   public class_9616 method_11832(class_5799 var1, class_1331 var2, class_6631 var3) {
      class_6561 var6 = this.method_40368(var1);
      return var6.method_29986(new class_8478().method_39053(var3), var2);
   }

   @Override
   public boolean method_11827(
      class_5799 var1,
      class_700 var2,
      class_2033 var3,
      class_6541 var4,
      class_1331 var5,
      class_1331 var6,
      class_6631 var7,
      class_9616 var8,
      Random var9,
      boolean var10
   ) {
      class_6561 var13 = this.method_40368(var1);
      class_8478 var14 = this.method_40365(var7, var8, var10);
      if (!var13.method_29965(var2, var5, var6, var14, var9, 18)) {
         return false;
      } else {
         for (class_4099 var16 : class_6561.method_29988(var2, var5, var6, var14, this.method_40369(var1, var5, var7, false))) {
            this.method_11837(var2, var16, var5, var7, var9, var8);
         }

         return true;
      }
   }

   public class_8478 method_40365(class_6631 var1, class_9616 var2, boolean var3) {
      class_8478 var6 = new class_8478();
      var6.method_39051(var2);
      var6.method_39053(var1);
      var6.method_39043(true);
      var6.method_39045(false);
      var6.method_39048(class_2010.field_10194);
      var6.method_39044(true);
      if (!var3) {
         var6.method_39048(class_9172.field_46939);
      }

      this.field_44940.get().method_210().forEach(var6::method_39048);
      this.method_11834().method_34508().forEach(var6::method_39048);
      return var6;
   }

   @Override
   public class_4263<?> method_11836() {
      return class_4263.field_20660;
   }

   @Override
   public String toString() {
      return "Single[" + this.field_44942 + "]";
   }
}
