package remapped;

import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.UUID;

public final class class_5753 {
   private static String[] field_29118;
   public static final Codec<UUID> field_29117 = Codec.INT_STREAM
      .comapFlatMap(var0 -> Util.method_44654(var0, 4).map(class_5753::method_26038), var0 -> Arrays.stream(method_26037(var0)));

   public static UUID method_26038(int[] var0) {
      return new UUID((long)var0[0] << 32 | (long)var0[1] & 4294967295L, (long)var0[2] << 32 | (long)var0[3] & 4294967295L);
   }

   public static int[] method_26037(UUID var0) {
      long var3 = var0.getMostSignificantBits();
      long var5 = var0.getLeastSignificantBits();
      return method_26039(var3, var5);
   }

   private static int[] method_26039(long var0, long var2) {
      return new int[]{(int)(var0 >> 32), (int)var0, (int)(var2 >> 32), (int)var2};
   }
}
