package mapped;

import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import net.minecraft.util.IStringSerializable;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public final class Class8119 implements Keyable {
   private static String[] field34893;
   public final IStringSerializable[] field34894;

   public Class8119(IStringSerializable[] var1) {
      this.field34894 = var1;
   }

   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return !var1.compressMaps()
         ? Arrays.<IStringSerializable>stream(this.field34894).<String>map(IStringSerializable::getString).<T>map(var1::createString)
         : IntStream.range(0, this.field34894.length).<T>mapToObj(var1::createInt);
   }
}
