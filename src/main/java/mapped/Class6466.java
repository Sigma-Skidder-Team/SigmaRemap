package mapped;

import net.minecraft.network.PacketBuffer;
import net.minecraft.network.datasync.DataParameter;

public interface Class6466<T> {
   void method19646(PacketBuffer var1, T var2);

   T method19645(PacketBuffer var1);

   default DataParameter<T> method19647(int var1) {
      return new DataParameter<T>(var1, this);
   }

   T method19644(T var1);
}
