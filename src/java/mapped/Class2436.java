package mapped;

import com.mojang.realmsclient.exception.RealmsServiceException;

public class Class2436 extends RealmsServiceException {
   public final int field16476;

   public Class2436(int var1, int var2) {
      super(var2, "Retry operation", -1, "");
      if (var1 >= 0 && var1 <= 120) {
         this.field16476 = var1;
      } else {
         this.field16476 = 5;
      }
   }
}
