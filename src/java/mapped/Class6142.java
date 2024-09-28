package mapped;

import java.util.Optional;

public final class Class6142 implements Class6139<ChestTileEntity, Optional<Class949>> {
   private static String[] field27540;

   public Optional<Class949> method19043(ChestTileEntity var1, ChestTileEntity var2) {
      Class990 var5 = new Class990(var1, var2);
      return Optional.<Class949>of(new Class952(this, var1, var2, var5));
   }

   public Optional<Class949> method19042(ChestTileEntity var1) {
      return Optional.<Class949>of(var1);
   }

   public Optional<Class949> method19041() {
      return Optional.<Class949>empty();
   }
}
