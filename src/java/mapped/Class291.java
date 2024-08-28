package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;

public class Class291 extends Class290 {
   private static final Logger field1132 = LogManager.getLogger();
   private Class1806 field1133;

   public Class291(Class1806 var1) {
      this.field1133 = var1;
      if (RenderSystem.method27803()) {
         Class8535.method30368(this.method1131(), this.field1133.method7886(), this.field1133.method7887());
         this.method1140();
         if (Class7944.method26921()) {
            Class9336.method35317(this);
         }
      } else {
         RenderSystem.method27810(() -> {
            Class8535.method30368(this.method1131(), this.field1133.method7886(), this.field1133.method7887());
            this.method1140();
            if (Class7944.method26921()) {
               Class9336.method35317(this);
            }
         });
      }
   }

   public Class291(int var1, int var2, boolean var3) {
      RenderSystem.method27808(RenderSystem::method27807);
      this.field1133 = new Class1806(var1, var2, var3);
      Class8535.method30368(this.method1131(), this.field1133.method7886(), this.field1133.method7887());
      if (Class7944.method26921()) {
         Class9336.method35317(this);
      }
   }

   @Override
   public void method1090(Class191 var1) {
   }

   public void method1140() {
      if (this.field1133 == null) {
         field1132.warn("Trying to upload disposed texture {}", this.method1131());
      } else {
         this.method1133();
         this.field1133.method7893(0, 0, 0, false);
      }
   }

   @Nullable
   public Class1806 method1141() {
      return this.field1133;
   }

   public void method1142(Class1806 var1) {
      if (this.field1133 != null) {
         this.field1133.close();
      }

      this.field1133 = var1;
   }

   @Override
   public void close() {
      if (this.field1133 != null) {
         this.field1133.close();
         this.method1132();
         this.field1133 = null;
      }
   }
}
