package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class8942 {
   private static final Logger field40436 = LogManager.getLogger();
   private final Class1007 field40437;
   private final Class7373[] field40438 = new Class7373[Class9598.method37261()];
   private Class7373 field40439;

   public Class8942(Class1007 var1) {
      this.field40437 = var1;
      this.method32671(Class9598.field44906);
   }

   public void method32671(Class9598<?> var1) {
      if (this.field40439 == null || var1 != this.field40439.method23368()) {
         if (this.field40439 != null) {
            this.field40439.method23363();
         }

         this.field40439 = this.method32673(var1);
         if (!this.field40437.world.isRemote) {
            this.field40437.getDataManager().method35446(Class1007.field5619, var1.method37259());
         }

         field40436.debug("Dragon is now in phase {} on the {}", var1, !this.field40437.world.isRemote ? "server" : "client");
         this.field40439.method23362();
      }
   }

   public Class7373 method32672() {
      return this.field40439;
   }

   public <T extends Class7373> T method32673(Class9598<T> var1) {
      int var4 = var1.method37259();
      if (this.field40438[var4] == null) {
         this.field40438[var4] = var1.method37257(this.field40437);
      }

      return (T)this.field40438[var4];
   }
}
