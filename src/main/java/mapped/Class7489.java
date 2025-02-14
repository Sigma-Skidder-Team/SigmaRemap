package mapped;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.MutableBoundingBox;

import java.util.function.Supplier;

public class Class7489 extends Class7488 {
   public static final Codec<Class7489> field32189 = RecordCodecBuilder.create(
      var0 -> var0.group(method24406(), method24405(), method24379()).apply(var0, Class7489::new)
   );

   public Class7489(Either<ResourceLocation, Class8969> var1, Supplier<Class3622> var2, Class109 var3) {
      super(var1, var2, var3);
   }

   @Override
   public Class9463 method24409(Rotation var1, MutableBoundingBox var2, boolean var3) {
      Class9463 var6 = super.method24409(var1, var2, var3);
      var6.method36435(Class7095.field30526);
      var6.method36434(Class7095.field30528);
      return var6;
   }

   @Override
   public Class8325<?> method24377() {
      return Class8325.field35774;
   }

   @Override
   public String toString() {
      return "LegacySingle[" + this.field32187 + "]";
   }
}
