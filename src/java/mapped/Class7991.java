package mapped;

import java.util.function.IntSupplier;

public class Class7991 implements IntSupplier {
   private static String[] field34346;
   private int field34347;
   private int field34348;
   public final Class4298 field34349;

   public Class7991(Class4298 var1) {
      this.field34349 = var1;
      this.field34347 = 0;
      this.field34348 = 1;
   }

   @Override
   public int getAsInt() {
      int var3 = this.field34347 + this.field34348;
      this.field34347 = this.field34348;
      this.field34348 = var3;
      return this.field34347;
   }
}
