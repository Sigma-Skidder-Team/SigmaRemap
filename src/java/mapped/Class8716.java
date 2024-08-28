package mapped;

import com.mojang.datafixers.DataFixer;
import java.io.File;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8716 {
   private static final Logger field39329 = LogManager.getLogger();
   private final File field39330;
   public final DataFixer field39331;

   public Class8716(Class1814 var1, DataFixer var2) {
      this.field39331 = var2;
      this.field39330 = var1.method7991(Class5137.field23348).toFile();
      this.field39330.mkdirs();
   }

   public void method31441(PlayerEntity var1) {
      try {
         Class39 var4 = var1.method3294(new Class39());
         File var5 = File.createTempFile(var1.method3376() + "-", ".dat", this.field39330);
         Class8799.method31767(var4, var5);
         File var6 = new File(this.field39330, var1.method3376() + ".dat");
         File var7 = new File(this.field39330, var1.method3376() + ".dat_old");
         Util.method38526(var6, var5, var7);
      } catch (Exception var8) {
         field39329.warn("Failed to save player data for {}", var1.method2941().getString());
      }
   }

   @Nullable
   public Class39 method31442(PlayerEntity var1) {
      Class39 var4 = null;

      try {
         File var5 = new File(this.field39330, var1.method3376() + ".dat");
         if (var5.exists() && var5.isFile()) {
            var4 = Class8799.method31765(var5);
         }
      } catch (Exception var6) {
         field39329.warn("Failed to load player data for {}", var1.method2941().getString());
      }

      if (var4 != null) {
         int var7 = var4.method119("DataVersion", 3) ? var4.method122("DataVersion") : -1;
         var1.method3295(Class8354.method29289(this.field39331, Class2108.field13749, var4, var7));
      }

      return var4;
   }

   public String[] method31443() {
      String[] var3 = this.field39330.list();
      if (var3 == null) {
         var3 = new String[0];
      }

      for (int var4 = 0; var4 < var3.length; var4++) {
         if (var3[var4].endsWith(".dat")) {
            var3[var4] = var3[var4].substring(0, var3[var4].length() - 4);
         }
      }

      return var3;
   }
}
