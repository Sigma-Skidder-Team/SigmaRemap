package mapped;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public class Class9306 extends Class9307 {
   private static String[] field43202;
   public final Class1649 field43203;

   public Class9306(Class1649 var1, Executor var2, Executor var3) {
      super(var2, var3);
      this.field43203 = var1;
   }

   @Override
   public boolean method35120(long var1) {
      return Class1649.method6636(this.field43203).contains(var1);
   }

   @Nullable
   @Override
   public Class8641 method35121(long var1) {
      return this.field43203.method6538(var1);
   }

   @Nullable
   @Override
   public Class8641 method35122(long var1, int var3, Class8641 var4, int var5) {
      return Class1649.method6637(this.field43203, var1, var3, var4, var5);
   }
}
