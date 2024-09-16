package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import net.minecraft.util.IStringSerializable;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public enum Class109 implements IStringSerializable {
   field366("terrain_matching", ImmutableList.of(new Class7098(Heightmap.Type.field295, -1))),
   field367("rigid", ImmutableList.of());

   public static final Codec<Class109> field368 = IStringSerializable.<Class109>method258(Class109::values, Class109::method302);
   private static final Map<String, Class109> field369 = Arrays.<Class109>stream(values())
      .collect(Collectors.toMap(Class109::method301, var0 -> (Class109)var0));
   private final String field370;
   private final ImmutableList<Class7092> field371;
   private static final Class109[] field372 = new Class109[]{field366, field367};

   private Class109(String var3, ImmutableList<Class7092> var4) {
      this.field370 = var3;
      this.field371 = var4;
   }

   public String method301() {
      return this.field370;
   }

   public static Class109 method302(String var0) {
      return field369.get(var0);
   }

   public ImmutableList<Class7092> method303() {
      return this.field371;
   }

   @Override
   public String getString() {
      return this.field370;
   }
}
