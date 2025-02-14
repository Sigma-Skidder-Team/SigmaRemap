package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class8299 {
   public static final Codec<Class8299> field35673 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.BOOL.fieldOf("cold").forGetter(var0x -> var0x.field35674),
               Codec.FLOAT.fieldOf("mossiness").forGetter(var0x -> var0x.field35675),
               Codec.BOOL.fieldOf("air_pocket").forGetter(var0x -> var0x.field35676),
               Codec.BOOL.fieldOf("overgrown").forGetter(var0x -> var0x.field35677),
               Codec.BOOL.fieldOf("vines").forGetter(var0x -> var0x.field35678),
               Codec.BOOL.fieldOf("replace_with_blackstone").forGetter(var0x -> var0x.field35679)
            )
            .apply(var0, Class8299::new)
   );
   public boolean field35674;
   public float field35675 = 0.2F;
   public boolean field35676;
   public boolean field35677;
   public boolean field35678;
   public boolean field35679;

   public Class8299() {
   }

   public <T> Class8299(boolean var1, float var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      this.field35674 = var1;
      this.field35675 = var2;
      this.field35676 = var3;
      this.field35677 = var4;
      this.field35678 = var5;
      this.field35679 = var6;
   }
}
