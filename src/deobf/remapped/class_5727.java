package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class class_5727 implements class_5079 {
   public static final class_5727 field_28937 = new class_5727(1.0F, 0.0F, 0.0F, 1.0F);
   public static final Codec<class_5727> field_28940 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.FLOAT.fieldOf("r").forGetter(var0x -> var0x.field_28936),
               Codec.FLOAT.fieldOf("g").forGetter(var0x -> var0x.field_28942),
               Codec.FLOAT.fieldOf("b").forGetter(var0x -> var0x.field_28938),
               Codec.FLOAT.fieldOf("scale").forGetter(var0x -> var0x.field_28943)
            )
            .apply(var0, class_5727::new)
   );
   public static final class_7981<class_5727> field_28939 = new class_1064();
   private final float field_28936;
   private final float field_28942;
   private final float field_28938;
   private final float field_28943;

   public class_5727(float var1, float var2, float var3, float var4) {
      this.field_28936 = var1;
      this.field_28942 = var2;
      this.field_28938 = var3;
      this.field_28943 = MathHelper.clamp(var4, 0.01F, 4.0F);
   }

   @Override
   public void method_23359(class_8248 var1) {
      var1.writeFloat(this.field_28936);
      var1.writeFloat(this.field_28942);
      var1.writeFloat(this.field_28938);
      var1.writeFloat(this.field_28943);
   }

   @Override
   public String method_23358() {
      return String.format(
         Locale.ROOT,
         "%s %.2f %.2f %.2f %.2f",
         class_8669.field_44387.method_39797(this.method_23357()),
         this.field_28936,
         this.field_28942,
         this.field_28938,
         this.field_28943
      );
   }

   @Override
   public class_8583<class_5727> method_23357() {
      return class_3090.field_15317;
   }

   public float method_25910() {
      return this.field_28936;
   }

   public float method_25907() {
      return this.field_28942;
   }

   public float method_25909() {
      return this.field_28938;
   }

   public float method_25906() {
      return this.field_28943;
   }
}
