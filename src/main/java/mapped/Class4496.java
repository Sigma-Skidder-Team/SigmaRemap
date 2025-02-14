package mapped;

import net.minecraft.client.network.play.ClientPlayNetHandler;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.client.CQueryEntityNBTPacket;
import net.minecraft.network.play.client.CQueryTileEntityNBTPacket;
import net.minecraft.util.math.BlockPos;

import java.util.function.Consumer;

public class Class4496 {
   private static String[] field21704;
   private final ClientPlayNetHandler field21705;
   private int field21706 = -1;
   private Consumer<CompoundNBT> field21707;

   public Class4496(ClientPlayNetHandler var1) {
      this.field21705 = var1;
   }

   public boolean method14176(int var1, CompoundNBT var2) {
      if (this.field21706 == var1 && this.field21707 != null) {
         this.field21707.accept(var2);
         this.field21707 = null;
         return true;
      } else {
         return false;
      }
   }

   private int method14177(Consumer<CompoundNBT> var1) {
      this.field21707 = var1;
      return ++this.field21706;
   }

   public void method14178(int var1, Consumer<CompoundNBT> var2) {
      int var5 = this.method14177(var2);
      this.field21705.sendPacket(new CQueryEntityNBTPacket(var5, var1));
   }

   public void method14179(BlockPos var1, Consumer<CompoundNBT> var2) {
      int var5 = this.method14177(var2);
      this.field21705.sendPacket(new CQueryTileEntityNBTPacket(var5, var1));
   }
}
