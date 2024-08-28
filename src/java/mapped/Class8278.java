package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class8278 implements Class8277 {
   public static final Codec<Class8278> field35569 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Class7380.field31585.fieldOf("top_material").forGetter(var0x -> var0x.field35570),
               Class7380.field31585.fieldOf("under_material").forGetter(var0x -> var0x.field35571),
               Class7380.field31585.fieldOf("underwater_material").forGetter(var0x -> var0x.field35572)
            )
            .apply(var0, Class8278::new)
   );
   private final Class7380 field35570;
   private final Class7380 field35571;
   private final Class7380 field35572;

   public Class8278(Class7380 var1, Class7380 var2, Class7380 var3) {
      this.field35570 = var1;
      this.field35571 = var2;
      this.field35572 = var3;
   }

   @Override
   public Class7380 method28934() {
      return this.field35570;
   }

   @Override
   public Class7380 method28935() {
      return this.field35571;
   }

   public Class7380 method28936() {
      return this.field35572;
   }
}
