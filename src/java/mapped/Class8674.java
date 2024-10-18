package mapped;

import net.optifine.ChunkOF;

public class Class8674 {
   private static String[] field39098;

   public static boolean method31216(Chunk var0) {
      if (!(var0 instanceof ChunkOF)) {
         return true;
      } else {
         ChunkOF var3 = (ChunkOF)var0;
         return var3.method7169();
      }
   }

   public static boolean method31217(Chunk var0) {
      if (!(var0 instanceof ChunkOF)) {
         return false;
      } else {
         ChunkOF var3 = (ChunkOF)var0;
         return var3.method7170();
      }
   }
}
