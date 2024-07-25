package remapped;

import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7736 {
   private static final Logger field_39232 = LogManager.getLogger();
   private final Screen field_39231;
   private volatile boolean field_39228;
   private class_5121 field_39229;

   public class_7736(Screen var1) {
      this.field_39231 = var1;
   }

   public void method_35020(class_7675 var1, String var2, int var3) {
      MinecraftClient var6 = MinecraftClient.getInstance();
      var6.method_8509(true);
      class_7567.method_34410(class_6956.method_31803("mco.connect.success"));
      new class_4029(this, "Realms-connect-task", var2, var3, var6, var1).start();
   }

   public void method_35019() {
      this.field_39228 = true;
      if (this.field_39229 != null && this.field_39229.method_23493()) {
         this.field_39229.method_23482(new TranslationTextComponent("disconnect.genericReason"));
         this.field_39229.method_23480();
      }
   }

   public void method_35026() {
      if (this.field_39229 != null) {
         if (!this.field_39229.method_23493()) {
            this.field_39229.method_23480();
         } else {
            this.field_39229.method_23483();
         }
      }
   }
}
