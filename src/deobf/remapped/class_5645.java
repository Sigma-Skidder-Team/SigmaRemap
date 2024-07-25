package remapped;

import com.mojang.datafixers.DataFixer;
import java.io.File;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_5645 {
   private static final Logger field_28618 = LogManager.getLogger();
   private final File field_28617;
   public final DataFixer field_28616;

   public class_5645(class_3676 var1, DataFixer var2) {
      this.field_28616 = var2;
      this.field_28617 = var1.method_17064(class_263.field_926).toFile();
      this.field_28617.mkdirs();
   }

   public void method_25559(PlayerEntity var1) {
      try {
         CompoundNBT var4 = var1.method_37258(new CompoundNBT());
         File var5 = File.createTempFile(var1.method_37225() + "-", ".dat", this.field_28617);
         class_5957.method_27218(var4, var5);
         File var6 = new File(this.field_28617, var1.method_37225() + ".dat");
         File var7 = new File(this.field_28617, var1.method_37225() + ".dat_old");
         Util.method_44675(var6, var5, var7);
      } catch (Exception var8) {
         field_28618.warn("Failed to save player data for {}", var1.method_45509().getString());
      }
   }

   @Nullable
   public CompoundNBT method_25558(PlayerEntity var1) {
      CompoundNBT var4 = null;

      try {
         File var5 = new File(this.field_28617, var1.method_37225() + ".dat");
         if (var5.exists() && var5.isFile()) {
            var4 = class_5957.method_27227(var5);
         }
      } catch (Exception var6) {
         field_28618.warn("Failed to load player data for {}", var1.method_45509().getString());
      }

      if (var4 != null) {
         int var7 = var4.contains("DataVersion", 3) ? var4.method_25947("DataVersion") : -1;
         var1.method_37393(class_4338.method_20179(this.field_28616, class_5397.field_27553, var4, var7));
      }

      return var4;
   }

   public String[] method_25557() {
      String[] var3 = this.field_28617.list();
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
