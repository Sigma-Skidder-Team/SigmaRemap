package mapped;

import java.util.function.IntSupplier;
import java.util.function.LongSupplier;

public class TimeTracker {
   private static String[] field32911;
   private final LongSupplier field32912;
   private final IntSupplier field32913;
   private Class7166 field32914 = EmptyProfiler.INSTANCE;

   public TimeTracker(LongSupplier var1, IntSupplier var2) {
      this.field32912 = var1;
      this.field32913 = var2;
   }

   public boolean func_233505_a_() {
      return this.field32914 != EmptyProfiler.INSTANCE;
   }

   public void func_233506_b_() {
      this.field32914 = EmptyProfiler.INSTANCE;
   }

   public void func_233507_c_() {
      this.field32914 = new Class7168(this.field32912, this.field32913, true);
   }

   public IProfiler func_233508_d_() {
      return this.field32914;
   }

   public IProfileResult func_233509_e_() {
      return this.field32914.method22511();
   }
}
