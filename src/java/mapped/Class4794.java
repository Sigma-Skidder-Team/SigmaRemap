package mapped;

import io.netty.buffer.ByteBuf;
import java.util.UUID;

public class Class4794 extends BruhMotha<UUID> {
   public Class4794() {
      super(UUID.class);
   }

   public UUID method14894(ByteBuf var1) {
      int[] var4 = new int[]{var1.readInt(), var1.readInt(), var1.readInt(), var1.readInt()};
      return method14913(var4);
   }

   public void method14895(ByteBuf var1, UUID var2) {
      int[] var5 = method14914(var2);
      var1.writeInt(var5[0]);
      var1.writeInt(var5[1]);
      var1.writeInt(var5[2]);
      var1.writeInt(var5[3]);
   }

   public static UUID method14913(int[] var0) {
      return new UUID((long)var0[0] << 32 | (long)var0[1] & 4294967295L, (long)var0[2] << 32 | (long)var0[3] & 4294967295L);
   }

   public static int[] method14914(UUID var0) {
      return method14915(var0.getMostSignificantBits(), var0.getLeastSignificantBits());
   }

   public static int[] method14915(long var0, long var2) {
      return new int[]{(int)(var0 >> 32), (int)var0, (int)(var2 >> 32), (int)var2};
   }
}
