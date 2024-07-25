package remapped;

import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7884 extends class_8143 {
   private static final Logger field_40346 = LogManager.getLogger();
   private class_5797 field_40345;

   public class_7884(class_5797 var1) {
      this.field_40345 = var1;
      if (RenderSystem.method_16366()) {
         class_4970.method_22840(this.method_37055(), this.field_40345.method_26228(), this.field_40345.method_26253());
         this.method_35650();
         if (Config.method_14424()) {
            class_7977.method_36175(this);
         }
      } else {
         RenderSystem.method_16474(() -> {
            class_4970.method_22840(this.method_37055(), this.field_40345.method_26228(), this.field_40345.method_26253());
            this.method_35650();
            if (Config.method_14424()) {
               class_7977.method_36175(this);
            }
         });
      }
   }

   public class_7884(int var1, int var2, boolean var3) {
      RenderSystem.method_16431(RenderSystem::method_16363);
      this.field_40345 = new class_5797(var1, var2, var3);
      class_4970.method_22840(this.method_37055(), this.field_40345.method_26228(), this.field_40345.method_26253());
      if (Config.method_14424()) {
         class_7977.method_36175(this);
      }
   }

   @Override
   public void method_37053(class_7832 var1) {
   }

   public void method_35650() {
      if (this.field_40345 == null) {
         field_40346.warn("Trying to upload disposed texture {}", this.method_37055());
      } else {
         this.method_37048();
         this.field_40345.method_26260(0, 0, 0, false);
      }
   }

   @Nullable
   public class_5797 method_35651() {
      return this.field_40345;
   }

   public void method_35652(class_5797 var1) {
      if (this.field_40345 != null) {
         this.field_40345.close();
      }

      this.field_40345 = var1;
   }

   @Override
   public void close() {
      if (this.field_40345 != null) {
         this.field_40345.close();
         this.method_37052();
         this.field_40345 = null;
      }
   }
}
