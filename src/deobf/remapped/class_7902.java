package remapped;

import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Supplier;

public final class class_7902 {
   public static final Codec<class_7902> field_40409 = RecordCodecBuilder.create(
      var0 -> var0.group(
               class_9610.field_48974.fieldOf("structures").forGetter(class_7902::method_35726),
               class_8822.field_45121.fieldOf("noise").forGetter(class_7902::method_35723),
               class_2522.field_12489.fieldOf("default_block").forGetter(class_7902::method_35722),
               class_2522.field_12489.fieldOf("default_fluid").forGetter(class_7902::method_35728),
               Codec.intRange(-20, 276).fieldOf("bedrock_roof_position").forGetter(class_7902::method_35717),
               Codec.intRange(-20, 276).fieldOf("bedrock_floor_position").forGetter(class_7902::method_35727),
               Codec.intRange(0, 255).fieldOf("sea_level").forGetter(class_7902::method_35724),
               Codec.BOOL.fieldOf("disable_mob_generation").forGetter(class_7902::method_35725)
            )
            .apply(var0, class_7902::new)
   );
   public static final Codec<Supplier<class_7902>> field_40400 = class_6833.<Supplier<class_7902>>method_31333(class_8669.field_44360, field_40409);
   private final class_9610 field_40406;
   private final class_8822 field_40415;
   private final class_2522 field_40412;
   private final class_2522 field_40404;
   private final int field_40405;
   private final int field_40414;
   private final int field_40403;
   private final boolean field_40399;
   public static final class_5621<class_7902> field_40411 = class_5621.<class_7902>method_25497(class_8669.field_44360, new Identifier("overworld"));
   public static final class_5621<class_7902> field_40407 = class_5621.<class_7902>method_25497(class_8669.field_44360, new Identifier("amplified"));
   public static final class_5621<class_7902> field_40413 = class_5621.<class_7902>method_25497(class_8669.field_44360, new Identifier("nether"));
   public static final class_5621<class_7902> field_40410 = class_5621.<class_7902>method_25497(class_8669.field_44360, new Identifier("end"));
   public static final class_5621<class_7902> field_40408 = class_5621.<class_7902>method_25497(class_8669.field_44360, new Identifier("caves"));
   public static final class_5621<class_7902> field_40402 = class_5621.<class_7902>method_25497(class_8669.field_44360, new Identifier("floating_islands"));
   private static final class_7902 field_40401 = method_35720(field_40411, method_35718(new class_9610(true), false, field_40411.method_25499()));

   private class_7902(class_9610 var1, class_8822 var2, class_2522 var3, class_2522 var4, int var5, int var6, int var7, boolean var8) {
      this.field_40406 = var1;
      this.field_40415 = var2;
      this.field_40412 = var3;
      this.field_40404 = var4;
      this.field_40405 = var5;
      this.field_40414 = var6;
      this.field_40403 = var7;
      this.field_40399 = var8;
   }

   public class_9610 method_35726() {
      return this.field_40406;
   }

   public class_8822 method_35723() {
      return this.field_40415;
   }

   public class_2522 method_35722() {
      return this.field_40412;
   }

   public class_2522 method_35728() {
      return this.field_40404;
   }

   public int method_35717() {
      return this.field_40405;
   }

   public int method_35727() {
      return this.field_40414;
   }

   public int method_35724() {
      return this.field_40403;
   }

   @Deprecated
   public boolean method_35725() {
      return this.field_40399;
   }

   public boolean method_35714(class_5621<class_7902> var1) {
      return Objects.equals(this, class_889.field_4575.method_39799(var1));
   }

   private static class_7902 method_35720(class_5621<class_7902> var0, class_7902 var1) {
      class_889.<class_7902, class_7902>method_3844(class_889.field_4575, var0.method_25499(), var1);
      return var1;
   }

   public static class_7902 method_35719() {
      return field_40401;
   }

   private static class_7902 method_35716(class_9610 var0, class_2522 var1, class_2522 var2, Identifier var3, boolean var4, boolean var5) {
      return new class_7902(
         var0,
         new class_8822(
            128, new class_5049(2.0, 1.0, 80.0, 160.0), new class_3881(-3000, 64, -46), new class_3881(-30, 7, 1), 2, 1, 0.0, 0.0, true, false, var5, false
         ),
         var1,
         var2,
         -10,
         -10,
         0,
         var4
      );
   }

   private static class_7902 method_35715(class_9610 var0, class_2522 var1, class_2522 var2, Identifier var3) {
      HashMap var6 = Maps.newHashMap(class_9610.field_48975);
      var6.put(class_5390.field_27512, new class_4757(25, 10, 34222645));
      return new class_7902(
         new class_9610(Optional.<class_7655>ofNullable(var0.method_44375()), var6),
         new class_8822(
            128,
            new class_5049(1.0, 3.0, 80.0, 60.0),
            new class_3881(120, 3, 0),
            new class_3881(320, 4, -1),
            1,
            2,
            0.0,
            0.019921875,
            false,
            false,
            false,
            false
         ),
         var1,
         var2,
         0,
         0,
         32,
         false
      );
   }

   private static class_7902 method_35718(class_9610 var0, boolean var1, Identifier var2) {
      double var5 = 0.9999999814507745;
      return new class_7902(
         var0,
         new class_8822(
            256,
            new class_5049(0.9999999814507745, 0.9999999814507745, 80.0, 160.0),
            new class_3881(-10, 3, 0),
            new class_3881(-30, 0, 0),
            1,
            2,
            1.0,
            -0.46875,
            true,
            true,
            false,
            var1
         ),
         class_4783.field_23644.method_29260(),
         class_4783.field_23900.method_29260(),
         -10,
         0,
         63,
         false
      );
   }

   static {
      method_35720(field_40407, method_35718(new class_9610(true), true, field_40407.method_25499()));
      method_35720(
         field_40413,
         method_35715(new class_9610(false), class_4783.field_23700.method_29260(), class_4783.field_23811.method_29260(), field_40413.method_25499())
      );
      method_35720(
         field_40410,
         method_35716(
            new class_9610(false), class_4783.field_23894.method_29260(), class_4783.field_23184.method_29260(), field_40410.method_25499(), true, true
         )
      );
      method_35720(
         field_40408,
         method_35715(new class_9610(true), class_4783.field_23644.method_29260(), class_4783.field_23900.method_29260(), field_40408.method_25499())
      );
      method_35720(
         field_40402,
         method_35716(
            new class_9610(true), class_4783.field_23644.method_29260(), class_4783.field_23900.method_29260(), field_40402.method_25499(), false, false
         )
      );
   }
}
