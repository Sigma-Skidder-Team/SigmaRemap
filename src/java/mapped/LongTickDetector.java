package mapped;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.LongSupplier;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LongTickDetector {
   private static final Logger field44099 = LogManager.getLogger();
   private final LongSupplier field44100 = null;
   private final long field44101 = 0L;
   private int field44102;
   private final File field44103 = null;
   private Class7166 field44104;

   public IProfiler method36634() {
      this.field44104 = new Class7168(this.field44100, () -> this.field44102, false);
      this.field44102++;
      return this.field44104;
   }

   public void func_233525_b_() {
      if (this.field44104 != EmptyProfiler.INSTANCE) {
         IProfileResult var3 = this.field44104.method22511();
         this.field44104 = EmptyProfiler.INSTANCE;
         if (var3.method25632() >= 0L) {
            File var4 = new File(this.field44103, "tick-results-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + ".txt");
            var3.method25627(var4);
            field44099.info("Recorded long tick -- wrote info to: {}", var4.getAbsolutePath());
         }
      }
   }

   @Nullable
   public static LongTickDetector method36636(String var0) {
      return null;
   }

   public static IProfiler func_233523_a_(IProfiler var0, LongTickDetector var1) {
      return var1 == null ? var0 : IProfiler.method22510(var1.method36634(), var0);
   }

   private LongTickDetector() {
      throw new RuntimeException("Synthetic constructor added by MCP, do not call");
   }
}
