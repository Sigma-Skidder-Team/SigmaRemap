package remapped;

import java.io.File;
import java.io.FileFilter;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class class_8936 implements class_3026 {
   private static final FileFilter field_45786 = var0 -> {
      boolean var3 = var0.isFile() && var0.getName().endsWith(".zip");
      boolean var4 = var0.isDirectory() && new File(var0, "pack.mcmeta").isFile();
      return var3 || var4;
   };
   private final File field_45787;
   private final class_2541 field_45785;

   public class_8936(File var1, class_2541 var2) {
      this.field_45787 = var1;
      this.field_45785 = var2;
   }

   @Override
   public void method_13812(Consumer<class_5522> var1, class_7953 var2) {
      if (!this.field_45787.isDirectory()) {
         this.field_45787.mkdirs();
      }

      File[] var5 = this.field_45787.listFiles(field_45786);
      if (var5 != null) {
         for (File var9 : var5) {
            String var10 = "file/" + var9.getName();
            class_5522 var11 = class_5522.method_25028(var10, false, this.method_41062(var9), var2, class_1154.field_6565, this.field_45785);
            if (var11 != null) {
               var1.accept(var11);
            }
         }
      }
   }

   private Supplier<class_8169> method_41062(File var1) {
      return !var1.isDirectory() ? () -> new class_2140(var1) : () -> new class_4968(var1);
   }
}
