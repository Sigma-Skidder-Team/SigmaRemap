package mapped;

import net.minecraft.nbt.CompoundNBT;

public class BeeThingyIdk {
   private final CompoundNBT field43284;
   private int field43285;
   private final int field43286;

   public BeeThingyIdk(CompoundNBT var1, int var2, int var3) {
      var1.remove("UUID");
      this.field43284 = var1;
      this.field43285 = var2;
      this.field43286 = var3;
   }

   // $VF: synthetic method
   public static CompoundNBT method35245(BeeThingyIdk var0) {
      return var0.field43284;
   }

   // $VF: synthetic method
   public static int method35246(BeeThingyIdk var0) {
      return var0.field43285;
   }

   // $VF: synthetic method
   public static int method35247(BeeThingyIdk var0) {
      return var0.field43285++;
   }

   // $VF: synthetic method
   public static int method35248(BeeThingyIdk var0) {
      return var0.field43286;
   }
}
