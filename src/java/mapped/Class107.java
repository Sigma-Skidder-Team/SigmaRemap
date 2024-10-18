package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.IStringSerializable;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Class107 implements IStringSerializable {
   STANDARD("standard"),
   DESERT("desert"),
   JUNGLE("jungle"),
   SWAMP("swamp"),
   MOUNTAIN("mountain"),
   OCEAN("ocean"),
   NETHER("nether");

   public static final Codec<Class107> field343 = IStringSerializable.<Class107>createEnumCodec(Class107::values, Class107::method297);
   private static final Map<String, Class107> field344 = Arrays.<Class107>stream(values())
      .collect(Collectors.toMap(Class107::method296, var0 -> (Class107)var0));
   private final String field345;

   private Class107(String var3) {
      this.field345 = var3;
   }

   public String method296() {
      return this.field345;
   }

   public static Class107 method297(String var0) {
      return field344.get(var0);
   }

   @Override
   public String getString() {
      return this.field345;
   }
}
