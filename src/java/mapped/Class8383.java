package mapped;

import net.minecraft.nbt.ByteNBT;

public class Class8383 {
   private static String[] field35955;
   private static final ByteNBT[] field35956 = new ByteNBT[256];

   // $VF: synthetic method
   public static ByteNBT[] method29376() {
      return field35956;
   }

   static {
      for (int var2 = 0; var2 < field35956.length; var2++) {
         field35956[var2] = new ByteNBT((byte)(var2 - 128), null);
      }
   }
}
