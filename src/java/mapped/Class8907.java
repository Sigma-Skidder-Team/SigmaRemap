package mapped;

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

public final class Class8907 {
   public static final Logger field40306 = LogManager.getLogger();
   public static final Codec<Class8907> field40307 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Class7035.field30357.forGetter(var0x -> var0x.field40315),
               Class100.field291.fieldOf("category").forGetter(var0x -> var0x.field40320),
               Codec.FLOAT.fieldOf("depth").forGetter(var0x -> var0x.field40318),
               Codec.FLOAT.fieldOf("scale").forGetter(var0x -> var0x.field40319),
               Class7752.field33278.fieldOf("effects").forGetter(var0x -> var0x.field40321),
               Class7478.field32137.forGetter(var0x -> var0x.field40316),
               Class8835.field39900.forGetter(var0x -> var0x.field40317)
            )
            .apply(var0, Class8907::new)
   );
   public static final Codec<Class8907> field40308 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Class7035.field30357.forGetter(var0x -> var0x.field40315),
               Class100.field291.fieldOf("category").forGetter(var0x -> var0x.field40320),
               Codec.FLOAT.fieldOf("depth").forGetter(var0x -> var0x.field40318),
               Codec.FLOAT.fieldOf("scale").forGetter(var0x -> var0x.field40319),
               Class7752.field33278.fieldOf("effects").forGetter(var0x -> var0x.field40321)
            )
            .apply(var0, (var0x, var1, var2, var3, var4) -> new Class8907(var0x, var1, var2, var3, var4, Class7478.field32136, Class8835.field39899))
   );
   public static final Codec<Supplier<Class8907>> field40309 = Class9054.method33671(Class2348.field16106, field40307);
   public static final Codec<List<Supplier<Class8907>>> field40310 = Class9054.<Class8907>method33672(Class2348.field16106, field40307);
   private final Map<Integer, List<Class2961<?>>> field40311 = Class2348.field16114
      .method9192()
      .collect(Collectors.<Class2961<?>, Integer>groupingBy(var0 -> var0.method11364().ordinal()));
   private static final Class7691 field40312 = new Class7691(new Class2420(1234L), ImmutableList.of(0));
   private static final Class7691 field40313 = new Class7691(new Class2420(3456L), ImmutableList.of(-2, -1, 0));
   public static final Class7691 field40314 = new Class7691(new Class2420(2345L), ImmutableList.of(0));
   private final Class7035 field40315;
   private final Class7478 field40316;
   private final Class8835 field40317;
   private final float field40318;
   private final float field40319;
   private final Class100 field40320;
   private final Class7752 field40321;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> field40322 = ThreadLocal.<Long2FloatLinkedOpenHashMap>withInitial(() -> Util.method38507(() -> {
         Class14 var3x = new Class14(this, 1024, 0.25F);
         var3x.defaultReturnValue(Float.NaN);
         return var3x;
      }));

   private Class8907(Class7035 var1, Class100 var2, float var3, float var4, Class7752 var5, Class7478 var6, Class8835 var7) {
      this.field40315 = var1;
      this.field40316 = var6;
      this.field40317 = var7;
      this.field40320 = var2;
      this.field40318 = var3;
      this.field40319 = var4;
      this.field40321 = var5;
   }

   public int method32498() {
      return this.field40321.method25676();
   }

   public Class8835 method32499() {
      return this.field40317;
   }

   public Class87 method32500() {
      return Class7035.method21840(this.field40315);
   }

   public boolean method32501() {
      return this.method32516() > 0.85F;
   }

   private float method32502(BlockPos var1) {
      float var4 = Class7035.method21841(this.field40315).method271(var1, this.method32518());
      if (var1.getY() <= 64) {
         return var4;
      } else {
         float var5 = (float)(field40312.method25315((double)((float)var1.method8304() / 8.0F), (double)((float)var1.method8306() / 8.0F), false) * 4.0);
         return var4 - (var5 + (float)var1.getY() - 64.0F) * 0.05F / 30.0F;
      }
   }

   public final float method32503(BlockPos var1) {
      long var4 = var1.method8332();
      Long2FloatLinkedOpenHashMap var6 = this.field40322.get();
      float var7 = var6.get(var4);
      if (Float.isNaN(var7)) {
         float var8 = this.method32502(var1);
         if (var6.size() == 1024) {
            var6.removeFirstFloat();
         }

         var6.put(var4, var8);
         return var8;
      } else {
         return var7;
      }
   }

   public boolean method32504(Class1662 var1, BlockPos var2) {
      return this.method32505(var1, var2, true);
   }

   public boolean method32505(Class1662 var1, BlockPos var2, boolean var3) {
      if (this.method32503(var2) >= 0.15F) {
         return false;
      } else {
         if (var2.getY() >= 0 && var2.getY() < 256 && var1.method7020(Class1977.field12882, var2) < 10) {
            Class7380 var6 = var1.method6738(var2);
            Class7379 var7 = var1.method6739(var2);
            if (var7.method23472() == Class9479.field44066 && var6.method23383() instanceof Class3404) {
               if (!var3) {
                  return true;
               }

               boolean var8 = var1.method7013(var2.method8345())
                  && var1.method7013(var2.method8347())
                  && var1.method7013(var2.method8341())
                  && var1.method7013(var2.method8343());
               if (!var8) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean method32506(Class1662 var1, BlockPos var2) {
      if (!(this.method32503(var2) >= 0.15F)) {
         if (var2.getY() >= 0 && var2.getY() < 256 && var1.method7020(Class1977.field12882, var2) < 10) {
            Class7380 var5 = var1.method6738(var2);
            if (var5.method23393() && Class8487.field36571.method11579().method23443(var1, var2)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public Class7478 method32507() {
      return this.field40316;
   }

   public void method32508(Class7480 var1, Class5646 var2, Class1691 var3, long var4, Class2420 var6, BlockPos var7) {
      List<List<Supplier<Class7909<?, ?>>>> var10 = this.field40316.method24281();
      int var11 = Class1993.values().length;

      for (int var12 = 0; var12 < var11; var12++) {
         int var13 = 0;
         if (var1.method24344()) {
            for (Class2961 var15 : this.field40311.getOrDefault(var12, Collections.<Class2961<?>>emptyList())) {
               var6.method10372(var4, var13, var12);
               int var16 = var7.method8304() >> 4;
               int var17 = var7.method8306() >> 4;
               int var18 = var16 << 4;
               int var19 = var17 << 4;

               try {
                  var1.method24340(Class2002.method8390(var7), var15)
                     .forEach(
                        var8 -> var8.method17112(var3, var1, var2, var6, new Class9764(var18, var19, var18 + 15, var19 + 15), new Class7481(var16, var17))
                     );
               } catch (Exception var22) {
                  Class4526 var21 = Class4526.method14413(var22, "Feature placement");
                  var21.method14410("Feature").method32807("Id", Class2348.field16114.method9181(var15)).method32806("Description", () -> var15.toString());
                  throw new Class2506(var21);
               }

               var13++;
            }
         }

         if (var10.size() > var12) {
            for (Supplier var25 : var10.get(var12)) {
               Class7909 var26 = (Class7909)var25.get();
               var6.method10372(var4, var13, var12);

               try {
                  var26.method26521(var3, var2, var6, var7);
               } catch (Exception var23) {
                  Class4526 var27 = Class4526.method14413(var23, "Feature placement");
                  var27.method14410("Feature")
                     .method32807("Id", Class2348.field16112.method9181(var26.field33886))
                     .method32807("Config", var26.field33887)
                     .method32806("Description", () -> var26.field33886.toString());
                  throw new Class2506(var27);
               }

               var13++;
            }
         }
      }
   }

   public int method32509() {
      return this.field40321.method25673();
   }

   public int method32510(double var1, double var3) {
      int var7 = this.field40321.method25678().orElseGet(this::method32511);
      return this.field40321.method25679().method265(var1, var3, var7);
   }

   private int method32511() {
      double var3 = (double)Class9679.method37777(Class7035.method21842(this.field40315), 0.0F, 1.0F);
      double var5 = (double)Class9679.method37777(Class7035.method21843(this.field40315), 0.0F, 1.0F);
      return Class6406.method19509(var3, var5);
   }

   public int method32512() {
      return this.field40321.method25677().orElseGet(this::method32513);
   }

   private int method32513() {
      double var3 = (double)Class9679.method37777(Class7035.method21842(this.field40315), 0.0F, 1.0F);
      double var5 = (double)Class9679.method37777(Class7035.method21843(this.field40315), 0.0F, 1.0F);
      return Class9441.method36292(var3, var5);
   }

   public void method32514(Random var1, Class1670 var2, int var3, int var4, int var5, double var6, Class7380 var8, Class7380 var9, int var10, long var11) {
      Class9319 var15 = this.field40316.method24282().get();
      var15.method35210(var11);
      var15.method35209(var1, var2, this, var3, var4, var5, var6, var8, var9, var10, var11);
   }

   public final float method32515() {
      return this.field40318;
   }

   public final float method32516() {
      return Class7035.method21843(this.field40315);
   }

   public final float method32517() {
      return this.field40319;
   }

   public final float method32518() {
      return Class7035.method21842(this.field40315);
   }

   public Class7752 method32519() {
      return this.field40321;
   }

   public final int method32520() {
      return this.field40321.method25674();
   }

   public final int method32521() {
      return this.field40321.method25675();
   }

   public Optional<Class7737> method32522() {
      return this.field40321.method25680();
   }

   public Optional<Class9455> method32523() {
      return this.field40321.method25681();
   }

   public Optional<Class7959> method32524() {
      return this.field40321.method25682();
   }

   public Optional<Class8217> method32525() {
      return this.field40321.method25683();
   }

   public Optional<Class3496> method32526() {
      return this.field40321.method25684();
   }

   public final Class100 method32527() {
      return this.field40320;
   }

   @Override
   public String toString() {
      ResourceLocation var3 = Class6714.field29430.method9181(this);
      return var3 != null ? var3.toString() : super.toString();
   }

   // $VF: synthetic method
   public Class8907(Class7035 var1, Class100 var2, float var3, float var4, Class7752 var5, Class7478 var6, Class8835 var7, Class14 var8) {
      this(var1, var2, var3, var4, var5, var6, var7);
   }

   // $VF: synthetic method
   public static Class7691 method32549() {
      return field40313;
   }
}
