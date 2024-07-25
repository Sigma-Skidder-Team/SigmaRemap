package remapped;

import io.netty.buffer.ByteBuf;
import java.util.UUID;

public class class_8326 extends class_8039<UUID> {
   public class_8326() {
      super(UUID.class);
   }

   public UUID method_38361(ByteBuf var1) {
      int[] var4 = new int[]{var1.readInt(), var1.readInt(), var1.readInt(), var1.readInt()};
      return method_38362(var4);
   }

   public void method_38358(ByteBuf var1, UUID var2) {
      int[] var5 = method_38360(var2);
      var1.writeInt(var5[0]);
      var1.writeInt(var5[1]);
      var1.writeInt(var5[2]);
      var1.writeInt(var5[3]);
   }

   public static UUID method_38362(int[] var0) {
      return new UUID((long)var0[0] << 32 | (long)var0[1] & 4294967295L, (long)var0[2] << 32 | (long)var0[3] & 4294967295L);
   }

   public static int[] method_38360(UUID var0) {
      return method_38359(var0.getMostSignificantBits(), var0.getLeastSignificantBits());
   }

   public static int[] method_38359(long var0, long var2) {
      return new int[]{(int)(var0 >> 32), (int)var0, (int)(var2 >> 32), (int)var2};
   }
}
