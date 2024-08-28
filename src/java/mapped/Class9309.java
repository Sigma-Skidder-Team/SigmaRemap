package mapped;

import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

public final class Class9309 {
   public static final Codec<Class9309> field43220 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Class9763.field45673.fieldOf("structures").forGetter(Class9309::method35160),
               Class9556.field44510.fieldOf("noise").forGetter(Class9309::method35161),
               Class7380.field31585.fieldOf("default_block").forGetter(Class9309::method35162),
               Class7380.field31585.fieldOf("default_fluid").forGetter(Class9309::method35163),
               Codec.intRange(-20, 276).fieldOf("bedrock_roof_position").forGetter(Class9309::method35164),
               Codec.intRange(-20, 276).fieldOf("bedrock_floor_position").forGetter(Class9309::method35165),
               Codec.intRange(0, 255).fieldOf("sea_level").forGetter(Class9309::method35166),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(Class9309::method35167)
            )
            .apply(var0, Class9309::new)
   );
   public static final Codec<Supplier<Class9309>> field43221 = Class9054.method33671(Class2348.field16099, field43220);
   private final Class9763 field43222;
   private final Class9556 field43223;
   private final Class7380 field43224;
   private final Class7380 field43225;
   private final int field43226;
   private final int field43227;
   private final int field43228;
   private final boolean field43229;
   public static final Class8705<Class9309> field43230 = Class8705.<Class9309>method31395(Class2348.field16099, new ResourceLocation("overworld"));
   public static final Class8705<Class9309> field43231 = Class8705.<Class9309>method31395(Class2348.field16099, new ResourceLocation("amplified"));
   public static final Class8705<Class9309> field43232 = Class8705.<Class9309>method31395(Class2348.field16099, new ResourceLocation("nether"));
   public static final Class8705<Class9309> field43233 = Class8705.<Class9309>method31395(Class2348.field16099, new ResourceLocation("end"));
   public static final Class8705<Class9309> field43234 = Class8705.<Class9309>method31395(Class2348.field16099, new ResourceLocation("caves"));
   public static final Class8705<Class9309> field43235 = Class8705.<Class9309>method31395(Class2348.field16099, new ResourceLocation("floating_islands"));
   private static final Class9309 field43236 = method35169(field43230, method35173(new Class9763(true), false, field43230.method31399()));

   private Class9309(Class9763 var1, Class9556 var2, Class7380 var3, Class7380 var4, int var5, int var6, int var7, boolean var8) {
      this.field43222 = var1;
      this.field43223 = var2;
      this.field43224 = var3;
      this.field43225 = var4;
      this.field43226 = var5;
      this.field43227 = var6;
      this.field43228 = var7;
      this.field43229 = var8;
   }

   public Class9763 method35160() {
      return this.field43222;
   }

   public Class9556 method35161() {
      return this.field43223;
   }

   public Class7380 method35162() {
      return this.field43224;
   }

   public Class7380 method35163() {
      return this.field43225;
   }

   public int method35164() {
      return this.field43226;
   }

   public int method35165() {
      return this.field43227;
   }

   public int method35166() {
      return this.field43228;
   }

   @Deprecated
   public boolean method35167() {
      return this.field43229;
   }

   public boolean method35168(Class8705<Class9309> var1) {
      return Objects.equals(this, Class6714.field29431.method9183(var1));
   }

   private static Class9309 method35169(Class8705<Class9309> var0, Class9309 var1) {
      Class6714.<Class9309, Class9309>method20497(Class6714.field29431, var0.method31399(), var1);
      return var1;
   }

   public static Class9309 method35170() {
      return field43236;
   }

   private static Class9309 method35171(Class9763 var0, Class7380 var1, Class7380 var2, ResourceLocation var3, boolean var4, boolean var5) {
      return new Class9309(
         var0,
         new Class9556(
            128, new Class8562(2.0, 1.0, 80.0, 160.0), new Class8208(-3000, 64, -46), new Class8208(-30, 7, 1), 2, 1, 0.0, 0.0, true, false, var5, false
         ),
         var1,
         var2,
         -10,
         -10,
         0,
         var4
      );
   }

   private static Class9309 method35172(Class9763 var0, Class7380 var1, Class7380 var2, ResourceLocation var3) {
      HashMap var6 = Maps.newHashMap(Class9763.field45674);
      var6.put(Class2961.field18064, new Class8483(25, 10, 34222645));
      return new Class9309(
         new Class9763(Optional.<Class9245>ofNullable(var0.method38382()), var6),
         new Class9556(
            128, new Class8562(1.0, 3.0, 80.0, 60.0), new Class8208(120, 3, 0), new Class8208(320, 4, -1), 1, 2, 0.0, 0.019921875, false, false, false, false
         ),
         var1,
         var2,
         0,
         0,
         32,
         false
      );
   }

   private static Class9309 method35173(Class9763 var0, boolean var1, ResourceLocation var2) {
      double var5 = 0.9999999814507745;
      return new Class9309(
         var0,
         new Class9556(
            256,
            new Class8562(0.9999999814507745, 0.9999999814507745, 80.0, 160.0),
            new Class8208(-10, 3, 0),
            new Class8208(-30, 0, 0),
            1,
            2,
            1.0,
            -0.46875,
            true,
            true,
            false,
            var1
         ),
         Blocks.STONE.method11579(),
         Blocks.WATER.method11579(),
         -10,
         0,
         63,
         false
      );
   }

   static {
      method35169(field43231, method35173(new Class9763(true), true, field43231.method31399()));
      method35169(
         field43232, method35172(new Class9763(false), Blocks.NETHERRACK.method11579(), Blocks.LAVA.method11579(), field43232.method31399())
      );
      method35169(
         field43233,
         method35171(new Class9763(false), Blocks.field36651.method11579(), Blocks.AIR.method11579(), field43233.method31399(), true, true)
      );
      method35169(
         field43234, method35172(new Class9763(true), Blocks.STONE.method11579(), Blocks.WATER.method11579(), field43234.method31399())
      );
      method35169(
         field43235,
         method35171(new Class9763(true), Blocks.STONE.method11579(), Blocks.WATER.method11579(), field43235.method31399(), false, false)
      );
   }
}
