package remapped;

import java.io.File;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_7186 {
   private static final Logger field_36964 = LogManager.getLogger();
   private final String field_36963;
   private boolean field_36962;

   public class_7186(String var1) {
      this.field_36963 = var1;
   }

   public abstract void method_32924(CompoundNBT var1);

   public abstract CompoundNBT method_32920(CompoundNBT var1);

   public void method_32923() {
      this.method_32922(true);
   }

   public void method_32922(boolean var1) {
      this.field_36962 = var1;
   }

   public boolean method_32925() {
      return this.field_36962;
   }

   public String method_32926() {
      return this.field_36963;
   }

   public void method_32927(File var1) {
      if (this.method_32925()) {
         CompoundNBT var4 = new CompoundNBT();
         var4.put("data", this.method_32920(new CompoundNBT()));
         var4.method_25931("DataVersion", class_7665.method_34674().getWorldVersion());

         try {
            class_5957.method_27218(var4, var1);
         } catch (IOException var6) {
            field_36964.error("Could not save data {}", this, var6);
         }

         this.method_32922(false);
      }
   }
}
