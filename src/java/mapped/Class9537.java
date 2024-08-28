package mapped;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class Class9537 {
   public static final Codec<Class9537> field44402 = RecordCodecBuilder.create(
      var0 -> var0.group(
               Codec.intRange(0, 256).fieldOf("height").forGetter(Class9537::method36905),
               Class2348.field16072.fieldOf("block").orElse(Class8487.field36387).forGetter(var0x -> var0x.method36906().method23383())
            )
            .apply(var0, Class9537::new)
   );
   private final Class7380 field44403;
   private final int field44404;
   private int field44405;

   public Class9537(int var1, Class3209 var2) {
      this.field44404 = var1;
      this.field44403 = var2.method11579();
   }

   public int method36905() {
      return this.field44404;
   }

   public Class7380 method36906() {
      return this.field44403;
   }

   public int method36907() {
      return this.field44405;
   }

   public void method36908(int var1) {
      this.field44405 = var1;
   }

   @Override
   public String toString() {
      return (this.field44404 == 1 ? "" : this.field44404 + "*") + Class2348.field16072.method9181(this.field44403.method23383());
   }
}
