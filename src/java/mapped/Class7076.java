package mapped;

import java.util.concurrent.ThreadFactory;

public final class Class7076 implements ThreadFactory {
   private static String[] field30462;
   public final String field30463;
   public final boolean field30464;

   public Class7076(String var1, boolean var2) {
      this.field30463 = var1;
      this.field30464 = var2;
   }

   @Override
   public Thread newThread(Runnable var1) {
      Thread var4 = new Thread(var1, this.field30463);
      var4.setDaemon(this.field30464);
      return var4;
   }
}
