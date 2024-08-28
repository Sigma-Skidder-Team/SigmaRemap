package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class7150 {
   public static final Codec<Class7150> field30717 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.floatRange(-2.0F, 2.0F).fieldOf("temperature").forGetter(var0x -> var0x.field30718),
               Codec.floatRange(-2.0F, 2.0F).fieldOf("humidity").forGetter(var0x -> var0x.field30719),
               Codec.floatRange(-2.0F, 2.0F).fieldOf("altitude").forGetter(var0x -> var0x.field30720),
               Codec.floatRange(-2.0F, 2.0F).fieldOf("weirdness").forGetter(var0x -> var0x.field30721),
               Codec.floatRange(0.0F, 1.0F).fieldOf("offset").forGetter(var0x -> var0x.field30722)
            )
            .apply(var0, Class7150::new)
   );
   private final float field30718;
   private final float field30719;
   private final float field30720;
   private final float field30721;
   private final float field30722;

   public Class7150(float var1, float var2, float var3, float var4, float var5) {
      this.field30718 = var1;
      this.field30719 = var2;
      this.field30720 = var3;
      this.field30721 = var4;
      this.field30722 = var5;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            Class7150 var4 = (Class7150)var1;
            if (Float.compare(var4.field30718, this.field30718) != 0) {
               return false;
            } else if (Float.compare(var4.field30719, this.field30719) != 0) {
               return false;
            } else {
               return Float.compare(var4.field30720, this.field30720) == 0 ? Float.compare(var4.field30721, this.field30721) == 0 : false;
            }
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   @Override
   public int hashCode() {
      int var3 = this.field30718 == 0.0F ? 0 : Float.floatToIntBits(this.field30718);
      var3 = 31 * var3 + (this.field30719 == 0.0F ? 0 : Float.floatToIntBits(this.field30719));
      var3 = 31 * var3 + (this.field30720 == 0.0F ? 0 : Float.floatToIntBits(this.field30720));
      return 31 * var3 + (this.field30721 == 0.0F ? 0 : Float.floatToIntBits(this.field30721));
   }

   public float method22304(Class7150 var1) {
      return (this.field30718 - var1.field30718) * (this.field30718 - var1.field30718)
         + (this.field30719 - var1.field30719) * (this.field30719 - var1.field30719)
         + (this.field30720 - var1.field30720) * (this.field30720 - var1.field30720)
         + (this.field30721 - var1.field30721) * (this.field30721 - var1.field30721)
         + (this.field30722 - var1.field30722) * (this.field30722 - var1.field30722);
   }
}
