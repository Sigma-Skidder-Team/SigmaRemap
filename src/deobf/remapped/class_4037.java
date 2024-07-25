package remapped;

import com.mojang.datafixers.DataFixer;
import java.io.File;
import java.io.IOException;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class class_4037 implements AutoCloseable {
   private final class_1983 field_19599;
   public final DataFixer field_19601;
   private class_4527 field_19600;

   public class_4037(File var1, DataFixer var2, boolean var3) {
      this.field_19601 = var2;
      this.field_19599 = new class_1983(var1, var3, "chunk");
   }

   public CompoundNBT method_18573(class_5621<World> var1, Supplier<class_4050> var2, CompoundNBT var3) {
      int var6 = method_18574(var3);
      short var7 = 1493;
      if (var6 < 1493) {
         var3 = class_4338.method_20180(this.field_19601, class_5397.field_27558, var3, var6, 1493);
         if (var3.method_25937("Level").method_25933("hasLegacyStructureData")) {
            if (this.field_19600 == null) {
               this.field_19600 = class_4527.method_21032(var1, (class_4050)var2.get());
            }

            var3 = this.field_19600.method_21033(var3);
         }
      }

      var3 = class_4338.method_20179(this.field_19601, class_5397.field_27558, var3, Math.max(1493, var6));
      if (var6 < class_7665.method_34674().getWorldVersion()) {
         var3.method_25931("DataVersion", class_7665.method_34674().getWorldVersion());
      }

      return var3;
   }

   public static int method_18574(CompoundNBT var0) {
      return !var0.method_25939("DataVersion", 99) ? -1 : var0.method_25947("DataVersion");
   }

   @Nullable
   public CompoundNBT method_18575(class_2034 var1) throws IOException {
      return this.field_19599.method_9148(var1);
   }

   public void method_18571(class_2034 var1, CompoundNBT var2) {
      this.field_19599.method_9152(var1, var2);
      if (this.field_19600 != null) {
         this.field_19600.method_21035(var1.method_9539());
      }
   }

   public void method_18570() {
      this.field_19599.method_9154().join();
   }

   @Override
   public void close() throws IOException {
      this.field_19599.close();
   }
}
