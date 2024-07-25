package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_1428 {
   public static final Codec<class_1428> field_7715 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.floatRange(-2.0F, 2.0F).fieldOf("temperature").forGetter(var0x -> var0x.field_7710),
               Codec.floatRange(-2.0F, 2.0F).fieldOf("humidity").forGetter(var0x -> var0x.field_7716),
               Codec.floatRange(-2.0F, 2.0F).fieldOf("altitude").forGetter(var0x -> var0x.field_7714),
               Codec.floatRange(-2.0F, 2.0F).fieldOf("weirdness").forGetter(var0x -> var0x.field_7712),
               Codec.floatRange(0.0F, 1.0F).fieldOf("offset").forGetter(var0x -> var0x.field_7713)
            )
            .apply(var0, class_1428::new)
   );
   private final float field_7710;
   private final float field_7716;
   private final float field_7714;
   private final float field_7712;
   private final float field_7713;

   public class_1428(float var1, float var2, float var3, float var4, float var5) {
      this.field_7710 = var1;
      this.field_7716 = var2;
      this.field_7714 = var3;
      this.field_7712 = var4;
      this.field_7713 = var5;
   }

   @Override
   public boolean equals(Object var1) {
      if (this != var1) {
         if (var1 != null && this.getClass() == var1.getClass()) {
            class_1428 var4 = (class_1428)var1;
            if (Float.compare(var4.field_7710, this.field_7710) != 0) {
               return false;
            } else if (Float.compare(var4.field_7716, this.field_7716) != 0) {
               return false;
            } else {
               return Float.compare(var4.field_7714, this.field_7714) == 0 ? Float.compare(var4.field_7712, this.field_7712) == 0 : false;
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
      int var3 = this.field_7710 == 0.0F ? 0 : Float.floatToIntBits(this.field_7710);
      var3 = 31 * var3 + (this.field_7716 == 0.0F ? 0 : Float.floatToIntBits(this.field_7716));
      var3 = 31 * var3 + (this.field_7714 == 0.0F ? 0 : Float.floatToIntBits(this.field_7714));
      return 31 * var3 + (this.field_7712 == 0.0F ? 0 : Float.floatToIntBits(this.field_7712));
   }

   public float method_6569(class_1428 var1) {
      return (this.field_7710 - var1.field_7710) * (this.field_7710 - var1.field_7710)
         + (this.field_7716 - var1.field_7716) * (this.field_7716 - var1.field_7716)
         + (this.field_7714 - var1.field_7714) * (this.field_7714 - var1.field_7714)
         + (this.field_7712 - var1.field_7712) * (this.field_7712 - var1.field_7712)
         + (this.field_7713 - var1.field_7713) * (this.field_7713 - var1.field_7713);
   }
}
