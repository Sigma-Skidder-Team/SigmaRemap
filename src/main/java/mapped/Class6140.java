package mapped;

import net.minecraft.inventory.IInventory;

import java.util.Optional;

public final class Class6140 implements Class6139<ChestTileEntity, Optional<IInventory>> {
   private static String[] field27537;

   public Optional<IInventory> method19043(ChestTileEntity var1, ChestTileEntity var2) {
      return Optional.<IInventory>of(new Class990(var1, var2));
   }

   public Optional<IInventory> method19042(ChestTileEntity var1) {
      return Optional.<IInventory>of(var1);
   }

   public Optional<IInventory> method19041() {
      return Optional.<IInventory>empty();
   }
}
