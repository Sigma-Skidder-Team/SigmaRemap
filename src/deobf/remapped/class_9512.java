package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_9512 {
   private static final Logger field_48433 = LogManager.getLogger();
   public static final Codec<class_9512> field_48429 = RecordCodecBuilder.create(
         var0 -> var0.group(
                  class_5203.<class_6325>method_23878(class_8669.field_44359).forGetter(var0x -> var0x.field_48432),
                  class_9610.field_48974.fieldOf("structures").forGetter(class_9512::method_43898),
                  class_8764.field_44867.listOf().fieldOf("layers").forGetter(class_9512::method_43905),
                  Codec.BOOL.fieldOf("lakes").orElse(false).forGetter(var0x -> var0x.field_48424),
                  Codec.BOOL.fieldOf("features").orElse(false).forGetter(var0x -> var0x.field_48426),
                  class_6325.field_32303
                     .optionalFieldOf("biome")
                     .orElseGet(Optional::empty)
                     .forGetter(var0x -> Optional.<Supplier<class_6325>>of(var0x.field_48422))
               )
               .apply(var0, class_9512::new)
      )
      .stable();
   private static final Map<class_5390<?>, class_7865<?, ?>> field_48430 = class_9665.<Map<class_5390<?>, class_7865<?, ?>>>method_44659(
      Maps.newHashMap(), var0 -> {
         var0.put(class_5390.field_27498, class_8390.field_42923);
         var0.put(class_5390.field_27516, class_8390.field_42937);
         var0.put(class_5390.field_27511, class_8390.field_42914);
         var0.put(class_5390.field_27515, class_8390.field_42940);
         var0.put(class_5390.field_27506, class_8390.field_42945);
         var0.put(class_5390.field_27517, class_8390.field_42936);
         var0.put(class_5390.field_27519, class_8390.field_42929);
         var0.put(class_5390.field_27495, class_8390.field_42944);
         var0.put(class_5390.field_27508, class_8390.field_42943);
         var0.put(class_5390.field_27509, class_8390.field_42922);
         var0.put(class_5390.field_27504, class_8390.field_42942);
         var0.put(class_5390.field_27513, class_8390.field_42931);
         var0.put(class_5390.field_27510, class_8390.field_42924);
         var0.put(class_5390.field_27518, class_8390.field_42917);
         var0.put(class_5390.field_27512, class_8390.field_42933);
         var0.put(class_5390.field_27514, class_8390.field_42938);
      }
   );
   private final class_8669<class_6325> field_48432;
   private final class_9610 field_48427;
   private final List<class_8764> field_48425 = Lists.newArrayList();
   private Supplier<class_6325> field_48422;
   private final class_2522[] field_48431 = new class_2522[256];
   private boolean field_48428;
   private boolean field_48426 = false;
   private boolean field_48424 = false;

   public class_9512(class_8669<class_6325> var1, class_9610 var2, List<class_8764> var3, boolean var4, boolean var5, Optional<Supplier<class_6325>> var6) {
      this(var2, var1);
      if (var4) {
         this.method_43904();
      }

      if (var5) {
         this.method_43894();
      }

      this.field_48425.addAll(var3);
      this.method_43901();
      if (var6.isPresent()) {
         this.field_48422 = (Supplier<class_6325>)var6.get();
      } else {
         field_48433.error("Unknown biome, defaulting to plains");
         this.field_48422 = () -> var1.method_39807(class_8606.field_44136);
      }
   }

   public class_9512(class_9610 var1, class_8669<class_6325> var2) {
      this.field_48432 = var2;
      this.field_48427 = var1;
      this.field_48422 = () -> var2.method_39807(class_8606.field_44136);
   }

   public class_9512 method_43897(class_9610 var1) {
      return this.method_43895(this.field_48425, var1);
   }

   public class_9512 method_43895(List<class_8764> var1, class_9610 var2) {
      class_9512 var5 = new class_9512(var2, this.field_48432);

      for (class_8764 var7 : var1) {
         var5.field_48425.add(new class_8764(var7.method_40252(), var7.method_40255().method_8360()));
         var5.method_43901();
      }

      var5.method_43899(this.field_48422);
      if (this.field_48426) {
         var5.method_43894();
      }

      if (this.field_48424) {
         var5.method_43904();
      }

      return var5;
   }

   public void method_43894() {
      this.field_48426 = true;
   }

   public void method_43904() {
      this.field_48424 = true;
   }

   public class_6325 method_43896() {
      class_6325 var3 = this.method_43893();
      class_2025 var4 = var3.method_28875();
      class_3082 var5 = new class_3082().method_14127(var4.method_9455());
      if (this.field_48424) {
         var5.method_14130(class_1841.field_9347, class_7024.field_36136);
         var5.method_14130(class_1841.field_9347, class_7024.field_36057);
      }

      for (Entry var7 : this.field_48427.method_44377().entrySet()) {
         var5.method_14126(var4.method_9457(field_48430.get(var7.getKey())));
      }

      boolean var11 = (!this.field_48428 || this.field_48432.method_39800(var3).equals(Optional.<class_5621<class_6325>>of(class_8606.field_44126)))
         && this.field_48426;
      if (var11) {
         List var12 = var4.method_9456();

         for (int var8 = 0; var8 < var12.size(); var8++) {
            if (var8 != class_1841.field_9353.ordinal() && var8 != class_1841.field_9349.ordinal()) {
               for (Supplier var10 : (List)var12.get(var8)) {
                  var5.method_14128(var8, var10);
               }
            }
         }
      }

      class_2522[] var13 = this.method_43902();

      for (int var14 = 0; var14 < var13.length; var14++) {
         class_2522 var15 = var13[var14];
         if (var15 != null && !class_3801.field_18595.method_17675().test(var15)) {
            this.field_48431[var14] = null;
            var5.method_14130(class_1841.field_9348, class_4285.field_20776.method_19909(new class_3878(var14, var15)));
         }
      }

      return new class_9315()
         .method_42998(var3.method_28866())
         .method_43005(var3.method_28887())
         .method_43007(var3.method_28868())
         .method_43003(var3.method_28856())
         .method_42999(var3.method_28861())
         .method_43008(var3.method_28870())
         .method_43002(var3.method_28869())
         .method_43001(var5.method_14124())
         .method_43004(var3.method_28886())
         .method_42997();
   }

   public class_9610 method_43898() {
      return this.field_48427;
   }

   public class_6325 method_43893() {
      return this.field_48422.get();
   }

   public void method_43899(Supplier<class_6325> var1) {
      this.field_48422 = var1;
   }

   public List<class_8764> method_43905() {
      return this.field_48425;
   }

   public class_2522[] method_43902() {
      return this.field_48431;
   }

   public void method_43901() {
      Arrays.fill(this.field_48431, 0, this.field_48431.length, null);
      int var3 = 0;

      for (class_8764 var5 : this.field_48425) {
         var5.method_40253(var3);
         var3 += var5.method_40252();
      }

      this.field_48428 = true;

      for (class_8764 var9 : this.field_48425) {
         for (int var6 = var9.method_40254(); var6 < var9.method_40254() + var9.method_40252(); var6++) {
            class_2522 var7 = var9.method_40255();
            if (!var7.method_8350(class_4783.field_23184)) {
               this.field_48428 = false;
               this.field_48431[var6] = var7;
            }
         }
      }
   }

   public static class_9512 method_43900(class_8669<class_6325> var0) {
      class_9610 var3 = new class_9610(
         Optional.<class_7655>of(class_9610.field_48972),
         Maps.newHashMap(ImmutableMap.of(class_5390.field_27516, class_9610.field_48975.get(class_5390.field_27516)))
      );
      class_9512 var4 = new class_9512(var3, var0);
      var4.field_48422 = () -> var0.method_39807(class_8606.field_44136);
      var4.method_43905().add(new class_8764(1, class_4783.field_23433));
      var4.method_43905().add(new class_8764(2, class_4783.field_23592));
      var4.method_43905().add(new class_8764(1, class_4783.field_23259));
      var4.method_43901();
      return var4;
   }
}
