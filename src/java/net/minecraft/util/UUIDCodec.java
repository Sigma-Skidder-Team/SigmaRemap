package net.minecraft.util;

import com.mojang.serialization.Codec;

import java.util.Arrays;
import java.util.UUID;

public final class UUIDCodec {
   private static String[] field39429;
   public static final Codec<UUID> field39430 = Codec.INT_STREAM
      .comapFlatMap(var0 -> Util.method38530(var0, 4).map(UUIDCodec::decodeUUID), var0 -> Arrays.stream(encodeUUID(var0)));

   public static UUID decodeUUID(int[] var0) {
      return new UUID((long)var0[0] << 32 | (long)var0[1] & 4294967295L, (long)var0[2] << 32 | (long)var0[3] & 4294967295L);
   }

   public static int[] encodeUUID(UUID var0) {
      long var3 = var0.getMostSignificantBits();
      long var5 = var0.getLeastSignificantBits();
      return method31565(var3, var5);
   }

   private static int[] method31565(long var0, long var2) {
      return new int[]{(int)(var0 >> 32), (int)var0, (int)(var2 >> 32), (int)var2};
   }
}
