package remapped;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_6901 {
   private static final Logger field_35480 = LogManager.getLogger();
   private final Collection<Path> field_35479;
   private final Path field_35481;
   private final List<class_5998> field_35478 = Lists.newArrayList();

   public class_6901(Path var1, Collection<Path> var2) {
      this.field_35481 = var1;
      this.field_35479 = var2;
   }

   public Collection<Path> method_31601() {
      return this.field_35479;
   }

   public Path method_31600() {
      return this.field_35481;
   }

   public void run() throws IOException {
      class_4162 var3 = new class_4162(this.field_35481, "cache");
      var3.method_19311(this.method_31600().resolve("version.json"));
      Stopwatch var4 = Stopwatch.createStarted();
      Stopwatch var5 = Stopwatch.createUnstarted();

      for (class_5998 var7 : this.field_35478) {
         field_35480.info("Starting provider: {}", var7.method_27387());
         var5.start();
         var7.method_27389(var3);
         var5.stop();
         field_35480.info("{} finished after {} ms", var7.method_27387(), var5.elapsed(TimeUnit.MILLISECONDS));
         var5.reset();
      }

      field_35480.info("All providers took: {} ms", var4.elapsed(TimeUnit.MILLISECONDS));
      var3.method_19316();
   }

   public void method_31599(class_5998 var1) {
      this.field_35478.add(var1);
   }

   static {
      class_2557.method_11618();
   }
}
