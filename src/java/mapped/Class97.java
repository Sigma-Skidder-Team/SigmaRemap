package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.IStringSerializable;

import javax.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Class97 implements IStringSerializable {
   field259("air"),
   field260("liquid");

   public static final Codec<Class97> field261 = IStringSerializable.<Class97>method258(Class97::values, Class97::method277);
   private static final Map<String, Class97> field262 = Arrays.<Class97>stream(values()).collect(Collectors.toMap(Class97::method276, var0 -> (Class97)var0));
   private final String field263;
   private static final Class97[] field264 = new Class97[]{field259, field260};

   private Class97(String var3) {
      this.field263 = var3;
   }

   public String method276() {
      return this.field263;
   }

   @Nullable
   public static Class97 method277(String var0) {
      return field262.get(var0);
   }

   @Override
   public String getString() {
      return this.field263;
   }
}
