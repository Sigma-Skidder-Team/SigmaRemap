package mapped;

import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class9068 {
   private static final Logger field41495 = LogManager.getLogger();
   private final Collection<Path> field41496;
   private final Path field41497;
   private final List<Class4442> field41498 = Lists.newArrayList();

   public Class9068(Path var1, Collection<Path> var2) {
      this.field41497 = var1;
      this.field41496 = var2;
   }

   public Collection<Path> method33775() {
      return this.field41496;
   }

   public Path method33776() {
      return this.field41497;
   }

   public void run() throws IOException {
      Class8297 var3 = new Class8297(this.field41497, "cache");
      var3.method29004(this.method33776().resolve("version.json"));
      Stopwatch var4 = Stopwatch.createStarted();
      Stopwatch var5 = Stopwatch.createUnstarted();

      for (Class4442 var7 : this.field41498) {
         field41495.info("Starting provider: {}", var7.method14012());
         var5.start();
         var7.method14013(var3);
         var5.stop();
         field41495.info("{} finished after {} ms", var7.method14012(), var5.elapsed(TimeUnit.MILLISECONDS));
         var5.reset();
      }

      field41495.info("All providers took: {} ms", var4.elapsed(TimeUnit.MILLISECONDS));
      var3.method29000();
   }

   public void method33777(Class4442 var1) {
      this.field41498.add(var1);
   }

   static {
      Class7729.method25566();
   }
}
