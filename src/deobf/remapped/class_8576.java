package remapped;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.LongSupplier;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_8576 {
   private static final Logger field_43961 = LogManager.getLogger();
   private final LongSupplier field_43958 = null;
   private final long field_43959 = 0L;
   private int field_43957;
   private final File field_43962 = null;
   private class_3025 field_43963;

   public class_3492 method_39450() {
      this.field_43963 = new class_4929(this.field_43958, () -> this.field_43957, false);
      this.field_43957++;
      return this.field_43963;
   }

   public void method_39451() {
      if (this.field_43963 != class_8677.field_44535) {
         class_2578 var3 = this.field_43963.method_13811();
         this.field_43963 = class_8677.field_44535;
         if (var3.method_11736() >= 0L) {
            File var4 = new File(this.field_43962, "tick-results-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + ".txt");
            var3.method_11740(var4);
            field_43961.info("Recorded long tick -- wrote info to: {}", var4.getAbsolutePath());
         }
      }
   }

   @Nullable
   public static class_8576 method_39452(String var0) {
      return null;
   }

   public static class_3492 method_39453(class_3492 var0, class_8576 var1) {
      return var1 == null ? var0 : class_3492.method_16058(var1.method_39450(), var0);
   }

   private class_8576() {
      throw new RuntimeException("Synthetic constructor added by MCP, do not call");
   }
}
