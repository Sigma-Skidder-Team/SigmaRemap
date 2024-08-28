package mapped;

import java.io.IOException;
import javax.annotation.Nullable;

public abstract class Class1702 implements Class1704, AutoCloseable {
   @Nullable
   public Class1674 method7342(int var1, int var2, boolean var3) {
      return (Class1674)this.method7346(var1, var2, Class9176.field42145, var3);
   }

   @Nullable
   public Class1674 method7343(int var1, int var2) {
      return this.method7342(var1, var2, false);
   }

   @Nullable
   @Override
   public Class1665 method7344(int var1, int var2) {
      return this.method7346(var1, var2, Class9176.field42133, false);
   }

   public boolean method7345(int var1, int var2) {
      return this.method7346(var1, var2, Class9176.field42145, false) != null;
   }

   @Nullable
   public abstract Class1670 method7346(int var1, int var2, Class9176 var3, boolean var4);

   public abstract String method7347();

   @Override
   public void close() throws IOException {
   }

   public abstract Class196 method7348();

   public void method7349(boolean var1, boolean var2) {
   }

   public void method7350(Class7481 var1, boolean var2) {
   }

   public boolean method7351(Entity var1) {
      return true;
   }

   public boolean method7352(Class7481 var1) {
      return true;
   }

   public boolean method7353(BlockPos var1) {
      return true;
   }
}
