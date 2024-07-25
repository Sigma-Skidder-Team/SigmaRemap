package remapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class class_4168 {
   public static final Codec<class_4168> field_20275 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.BOOL.fieldOf("cold").forGetter(var0x -> var0x.field_20278),
               Codec.FLOAT.fieldOf("mossiness").forGetter(var0x -> var0x.field_20271),
               Codec.BOOL.fieldOf("air_pocket").forGetter(var0x -> var0x.field_20274),
               Codec.BOOL.fieldOf("overgrown").forGetter(var0x -> var0x.field_20277),
               Codec.BOOL.fieldOf("vines").forGetter(var0x -> var0x.field_20276),
               Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(var0x -> var0x.field_20273)
            )
            .apply(var0, class_4168::new)
   );
   public boolean field_20278;
   public float field_20271 = 0.2F;
   public boolean field_20274;
   public boolean field_20277;
   public boolean field_20276;
   public boolean field_20273;

   public class_4168() {
   }

   public <T> class_4168(boolean var1, float var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      this.field_20278 = var1;
      this.field_20271 = var2;
      this.field_20274 = var3;
      this.field_20277 = var4;
      this.field_20276 = var5;
      this.field_20273 = var6;
   }
}
