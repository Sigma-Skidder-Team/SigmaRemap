package mapped;

import java.io.File;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class Class7530 {
   private static final Logger field32329 = LogManager.getLogger();
   private final String field32330;
   private boolean field32331;

   public Class7530(String var1) {
      this.field32330 = var1;
   }

   public abstract void method24591(Class39 var1);

   public abstract Class39 method24592(Class39 var1);

   public void method24605() {
      this.method24606(true);
   }

   public void method24606(boolean var1) {
      this.field32331 = var1;
   }

   public boolean method24607() {
      return this.field32331;
   }

   public String method24608() {
      return this.field32330;
   }

   public void method24609(File var1) {
      if (this.method24607()) {
         Class39 var4 = new Class39();
         var4.method99("data", this.method24592(new Class39()));
         var4.method102("DataVersion", Class9246.method34773().getWorldVersion());

         try {
            Class8799.method31767(var4, var1);
         } catch (IOException var6) {
            field32329.error("Could not save data {}", this, var6);
         }

         this.method24606(false);
      }
   }
}
