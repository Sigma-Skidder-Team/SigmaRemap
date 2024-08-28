package mapped;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.LongSupplier;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9487 {
   private static final Logger field44099 = LogManager.getLogger();
   private final LongSupplier field44100 = null;
   private final long field44101 = 0L;
   private int field44102;
   private final File field44103 = null;
   private Class7166 field44104;

   public Class7165 method36634() {
      this.field44104 = new Class7168(this.field44100, () -> this.field44102, false);
      this.field44102++;
      return this.field44104;
   }

   public void method36635() {
      if (this.field44104 != Class7167.field30819) {
         Class7740 var3 = this.field44104.method22511();
         this.field44104 = Class7167.field30819;
         if (var3.method25632() >= 0L) {
            File var4 = new File(this.field44103, "tick-results-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + ".txt");
            var3.method25627(var4);
            field44099.info("Recorded long tick -- wrote info to: {}", var4.getAbsolutePath());
         }
      }
   }

   @Nullable
   public static Class9487 method36636(String var0) {
      return null;
   }

   public static Class7165 method36637(Class7165 var0, Class9487 var1) {
      return var1 == null ? var0 : Class7165.method22510(var1.method36634(), var0);
   }

   private Class9487() {
      throw new RuntimeException("Synthetic constructor added by MCP, do not call");
   }
}
