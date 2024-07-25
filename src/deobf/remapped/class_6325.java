package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class class_6325 {
   public static final Logger field_32297 = LogManager.getLogger();
   public static final Codec<class_6325> field_32307 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_1310.field_7241.forGetter(var0x -> var0x.field_32295),
               class_8862.field_45301.fieldOf("category").forGetter(var0x -> var0x.field_32292),
               Codec.FLOAT.fieldOf("depth").forGetter(var0x -> var0x.field_32298),
               Codec.FLOAT.fieldOf("scale").forGetter(var0x -> var0x.field_32299),
               class_2625.field_12952.fieldOf("effects").forGetter(var0x -> var0x.field_32301),
               class_2025.field_10263.forGetter(var0x -> var0x.field_32294),
               class_6068.field_31038.forGetter(var0x -> var0x.field_32293)
            )
            .apply(var0, class_6325::new)
   );
   public static final Codec<class_6325> field_32290 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_1310.field_7241.forGetter(var0x -> var0x.field_32295),
               class_8862.field_45301.fieldOf("category").forGetter(var0x -> var0x.field_32292),
               Codec.FLOAT.fieldOf("depth").forGetter(var0x -> var0x.field_32298),
               Codec.FLOAT.fieldOf("scale").forGetter(var0x -> var0x.field_32299),
               class_2625.field_12952.fieldOf("effects").forGetter(var0x -> var0x.field_32301)
            )
            .apply(var0, (var0x, var1, var2, var3, var4) -> new class_6325(var0x, var1, var2, var3, var4, class_2025.field_10261, class_6068.field_31042))
   );
   public static final Codec<Supplier<class_6325>> field_32303 = class_6833.<Supplier<class_6325>>method_31333(class_8669.field_44359, field_32307);
   public static final Codec<List<Supplier<class_6325>>> field_32306 = class_6833.<class_6325>method_31334(class_8669.field_44359, field_32307);
   private final Map<Integer, List<class_5390<?>>> field_32305 = class_8669.field_44457
      .method_39801()
      .collect(Collectors.<class_5390<?>, Integer>groupingBy(var0 -> var0.method_24546().ordinal()));
   private static final class_6830 field_32300 = new class_6830(new class_8679(1234L), ImmutableList.of(0));
   private static final class_6830 field_32302 = new class_6830(new class_8679(3456L), ImmutableList.of(-2, -1, 0));
   public static final class_6830 field_32304 = new class_6830(new class_8679(2345L), ImmutableList.of(0));
   private final class_1310 field_32295;
   private final class_2025 field_32294;
   private final class_6068 field_32293;
   private final float field_32298;
   private final float field_32299;
   private final class_8862 field_32292;
   private final class_2625 field_32301;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> field_32291 = ThreadLocal.<Long2FloatLinkedOpenHashMap>withInitial(
      () -> Util.method_44660(() -> {
            class_2032 var3x = new class_2032(this, 1024, 0.25F);
            var3x.defaultReturnValue(Float.NaN);
            return var3x;
         })
   );

   private class_6325(class_1310 var1, class_8862 var2, float var3, float var4, class_2625 var5, class_2025 var6, class_6068 var7) {
      this.field_32295 = var1;
      this.field_32294 = var6;
      this.field_32293 = var7;
      this.field_32292 = var2;
      this.field_32298 = var3;
      this.field_32299 = var4;
      this.field_32301 = var5;
   }

   public int method_28873() {
      return this.field_32301.method_11886();
   }

   public class_6068 method_28886() {
      return this.field_32293;
   }

   public class_6750 method_28866() {
      return class_1310.method_5971(this.field_32295);
   }

   public boolean method_28881() {
      return this.method_28870() > 0.85F;
   }

   private float method_28863(class_1331 var1) {
      float var4 = class_1310.method_5970(this.field_32295).method_297(var1, this.method_28861());
      if (var1.method_12165() <= 64) {
         return var4;
      } else {
         float var5 = (float)(field_32300.method_31321((double)((float)var1.method_12173() / 8.0F), (double)((float)var1.method_12185() / 8.0F), false) * 4.0);
         return var4 - (var5 + (float)var1.method_12165() - 64.0F) * 0.05F / 30.0F;
      }
   }

   public final float method_28865(class_1331 var1) {
      long var4 = var1.method_6077();
      Long2FloatLinkedOpenHashMap var6 = this.field_32291.get();
      float var7 = var6.get(var4);
      if (Float.isNaN(var7)) {
         float var8 = this.method_28863(var1);
         if (var6.size() == 1024) {
            var6.removeFirstFloat();
         }

         var6.put(var4, var8);
         return var8;
      } else {
         return var7;
      }
   }

   public boolean method_28858(class_4924 var1, class_1331 var2) {
      return this.method_28859(var1, var2, true);
   }

   public boolean method_28859(class_4924 var1, class_1331 var2, boolean var3) {
      if (this.method_28865(var2) >= 0.15F) {
         return false;
      } else {
         if (var2.method_12165() >= 0 && var2.method_12165() < 256 && var1.method_25266(class_2957.field_14440, var2) < 10) {
            class_2522 var6 = var1.method_28262(var2);
            class_4774 var7 = var1.method_28258(var2);
            if (var7.method_22005() == class_8532.field_43674 && var6.method_8360() instanceof class_7855) {
               if (!var3) {
                  return true;
               }

               boolean var8 = var1.method_22565(var2.method_6108())
                  && var1.method_22565(var2.method_6090())
                  && var1.method_22565(var2.method_6094())
                  && var1.method_22565(var2.method_6073());
               if (!var8) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean method_28882(class_4924 var1, class_1331 var2) {
      if (!(this.method_28865(var2) >= 0.15F)) {
         if (var2.method_12165() >= 0 && var2.method_12165() < 256 && var1.method_25266(class_2957.field_14440, var2) < 10) {
            class_2522 var5 = var1.method_28262(var2);
            if (var5.method_8345() && class_4783.field_23552.method_29260().method_8309(var1, var2)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public class_2025 method_28875() {
      return this.field_32294;
   }

   public void method_28862(class_2033 var1, class_6541 var2, class_702 var3, long var4, class_8679 var6, class_1331 var7) {
      List var10 = this.field_32294.method_9456();
      int var11 = class_1841.values().length;

      for (int var12 = 0; var12 < var11; var12++) {
         int var13 = 0;
         if (var1.method_9532()) {
            for (class_5390 var15 : this.field_32305.getOrDefault(var12, Collections.<class_5390<?>>emptyList())) {
               var6.method_39866(var4, var13, var12);
               int var16 = var7.method_12173() >> 4;
               int var17 = var7.method_12185() >> 4;
               int var18 = var16 << 4;
               int var19 = var17 << 4;

               try {
                  var1.method_9531(class_6979.method_31921(var7), var15)
                     .forEach(
                        var8 -> var8.method_14719(var3, var1, var2, var6, new class_9616(var18, var19, var18 + 15, var19 + 15), new class_2034(var16, var17))
                     );
               } catch (Exception var22) {
                  class_159 var21 = class_159.method_643(var22, "Feature placement");
                  var21.method_639("Feature")
                     .method_29850("Id", class_8669.field_44457.method_39797(var15))
                     .method_29851("Description", () -> var15.toString());
                  throw new class_3297(var21);
               }

               var13++;
            }
         }

         if (var10.size() > var12) {
            for (Supplier var25 : (List)var10.get(var12)) {
               class_5927 var26 = (class_5927)var25.get();
               var6.method_39866(var4, var13, var12);

               try {
                  var26.method_27104(var3, var2, var6, var7);
               } catch (Exception var23) {
                  class_159 var27 = class_159.method_643(var23, "Feature placement");
                  var27.method_639("Feature")
                     .method_29850("Id", class_8669.field_44417.method_39797(var26.field_30065))
                     .method_29850("Config", var26.field_30062)
                     .method_29851("Description", () -> var26.field_30065.toString());
                  throw new class_3297(var27);
               }

               var13++;
            }
         }
      }
   }

   public int method_28874() {
      return this.field_32301.method_11888();
   }

   public int method_28872(double var1, double var3) {
      int var7 = this.field_32301.method_11897().orElseGet(this::method_28871);
      return this.field_32301.method_11892().method_19463(var1, var3, var7);
   }

   private int method_28871() {
      double var3 = (double)class_9299.method_42828(class_1310.method_5972(this.field_32295), 0.0F, 1.0F);
      double var5 = (double)class_9299.method_42828(class_1310.method_5969(this.field_32295), 0.0F, 1.0F);
      return class_640.method_2941(var3, var5);
   }

   public int method_28864() {
      return this.field_32301.method_11893().orElseGet(this::method_28857);
   }

   private int method_28857() {
      double var3 = (double)class_9299.method_42828(class_1310.method_5972(this.field_32295), 0.0F, 1.0F);
      double var5 = (double)class_9299.method_42828(class_1310.method_5969(this.field_32295), 0.0F, 1.0F);
      return class_8400.method_38683(var3, var5);
   }

   public void method_28884(Random var1, class_5990 var2, int var3, int var4, int var5, double var6, class_2522 var8, class_2522 var9, int var10, long var11) {
      class_7929 var15 = this.field_32294.method_9455().get();
      var15.method_35845(var11);
      var15.method_35844(var1, var2, this, var3, var4, var5, var6, var8, var9, var10, var11);
   }

   public final float method_28868() {
      return this.field_32298;
   }

   public final float method_28870() {
      return class_1310.method_5969(this.field_32295);
   }

   public final float method_28856() {
      return this.field_32299;
   }

   public final float method_28861() {
      return class_1310.method_5972(this.field_32295);
   }

   public class_2625 method_28869() {
      return this.field_32301;
   }

   public final int method_28860() {
      return this.field_32301.method_11895();
   }

   public final int method_28883() {
      return this.field_32301.method_11896();
   }

   public Optional<class_2569> method_28880() {
      return this.field_32301.method_11891();
   }

   public Optional<class_8461> method_28876() {
      return this.field_32301.method_11894();
   }

   public Optional<class_3161> method_28878() {
      return this.field_32301.method_11887();
   }

   public Optional<class_3902> method_28885() {
      return this.field_32301.method_11898();
   }

   public Optional<class_75> method_28879() {
      return this.field_32301.method_11890();
   }

   public final class_8862 method_28887() {
      return this.field_32292;
   }

   @Override
   public String toString() {
      Identifier var3 = class_889.field_4582.method_39797(this);
      return var3 != null ? var3.toString() : super.toString();
   }
}
