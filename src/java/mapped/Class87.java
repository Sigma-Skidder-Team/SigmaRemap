package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.IStringSerializable;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Class87 implements IStringSerializable {
   field223("none"),
   field224("rain"),
   field225("snow");

   public static final Codec<Class87> field226 = IStringSerializable.<Class87>method258(Class87::values, Class87::method263);
   private static final Map<String, Class87> field227 = Arrays.<Class87>stream(values()).collect(Collectors.toMap(Class87::method262, var0 -> (Class87)var0));
   private final String field228;
   private static final Class87[] field229 = new Class87[]{field223, field224, field225};

   private Class87(String var3) {
      this.field228 = var3;
   }

   public String method262() {
      return this.field228;
   }

   public static Class87 method263(String var0) {
      return field227.get(var0);
   }

   @Override
   public String getString() {
      return this.field228;
   }
}
