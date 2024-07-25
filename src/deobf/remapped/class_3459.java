package remapped;

import com.mojang.datafixers.DataFixer;
import java.io.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_3459 {
   private static final Logger field_16951 = LogManager.getLogger();
   private final File field_16952;
   private final DataFixer field_16948;
   private final class_2024[] field_16950 = new class_2024[9];
   private boolean field_16947;

   public class_3459(File var1, DataFixer var2) {
      this.field_16952 = new File(var1, "hotbar.nbt");
      this.field_16948 = var2;

      for (int var5 = 0; var5 < 9; var5++) {
         this.field_16950[var5] = new class_2024();
      }
   }

   private void method_15916() {
      try {
         CompoundNBT var3 = class_5957.method_27223(this.field_16952);
         if (var3 == null) {
            return;
         }

         if (!var3.method_25939("DataVersion", 99)) {
            var3.method_25931("DataVersion", 1343);
         }

         var3 = class_4338.method_20179(this.field_16948, class_5397.field_27551, var3, var3.method_25947("DataVersion"));

         for (int var4 = 0; var4 < 9; var4++) {
            this.field_16950[var4].method_9444(var3.method_25927(String.valueOf(var4), 10));
         }
      } catch (Exception var5) {
         field_16951.error("Failed to load creative mode options", var5);
      }
   }

   public void method_15917() {
      try {
         CompoundNBT var3 = new CompoundNBT();
         var3.method_25931("DataVersion", class_7665.method_34674().getWorldVersion());

         for (int var4 = 0; var4 < 9; var4++) {
            var3.method_25946(String.valueOf(var4), this.method_15915(var4).method_9442());
         }

         class_5957.method_27225(var3, this.field_16952);
      } catch (Exception var5) {
         field_16951.error("Failed to save creative mode options", var5);
      }
   }

   public class_2024 method_15915(int var1) {
      if (!this.field_16947) {
         this.method_15916();
         this.field_16947 = true;
      }

      return this.field_16950[var1];
   }
}
