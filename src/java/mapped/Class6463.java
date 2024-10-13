package mapped;

import com.mentalfrostbyte.jello.module.impl.misc.NoteblockPlayer;
import net.minecraft.state.properties.NoteBlockInstrument;
import net.minecraft.util.math.BlockPos;

public class Class6463 {
   private static String[] field28400;
   public BlockPos field28401;
   public float field28402 = -1.0F;
   public NoteBlockInstrument field28403 = NoteBlockInstrument.field347;

   public Class6463(BlockPos var1) {
      this.field28401 = var1;
      this.field28403 = NoteBlockInstrument.method300(NoteblockPlayer.method16415().world.getBlockState(var1.down()));
   }

   public int method19640() {
      switch (Class7303.field31300[this.field28403.ordinal()]) {
         case 1:
            return 0;
         case 2:
            return 1;
         case 3:
            return 2;
         case 4:
            return 3;
         case 5:
            return 4;
         case 6:
            return 5;
         case 7:
            return 6;
         case 8:
            return 7;
         case 9:
            return 8;
         case 10:
            return 9;
         case 11:
            return 10;
         case 12:
            return 11;
         case 13:
            return 12;
         case 14:
            return 13;
         case 15:
            return 14;
         case 16:
            return 15;
         default:
            return 0;
      }
   }
}
