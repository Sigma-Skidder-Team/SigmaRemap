package mapped;

import java.io.IOException;

public abstract class Class1749 implements Class1737 {
   public final Class4921 field9472;
   public boolean field9473;
   public final Class7933 field9474;

   public Class1749(Class7933 var1) {
      this.field9474 = var1;
      this.field9472 = new Class4921(this.field9474.field34014.method7541());
   }

   @Override
   public Class4916 method7541() {
      return this.field9472;
   }

   public final void method7670(boolean var1) throws IOException {
      if (this.field9474.field34016 != 6) {
         if (this.field9474.field34016 == 5) {
            this.field9474.method26683(this.field9472);
            this.field9474.field34016 = 6;
            if (this.field9474.field34013 != null) {
               this.field9474.field34013.method17929(!var1, this.field9474);
            }
         } else {
            throw new IllegalStateException("state: " + this.field9474.field34016);
         }
      }
   }
}
