package mapped;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Class4921 extends Class4916 {
   private Class4916 field22823;

   public Class4921(Class4916 var1) {
      if (var1 != null) {
         this.field22823 = var1;
      } else {
         throw new IllegalArgumentException("delegate == null");
      }
   }

   public final Class4916 method15232() {
      return this.field22823;
   }

   public final Class4921 method15233(Class4916 var1) {
      if (var1 != null) {
         this.field22823 = var1;
         return this;
      } else {
         throw new IllegalArgumentException("delegate == null");
      }
   }

   @Override
   public Class4916 method15209(long var1, TimeUnit var3) {
      return this.field22823.method15209(var1, var3);
   }

   @Override
   public long method15210() {
      return this.field22823.method15210();
   }

   @Override
   public boolean method15211() {
      return this.field22823.method15211();
   }

   @Override
   public long method15212() {
      return this.field22823.method15212();
   }

   @Override
   public Class4916 method15213(long var1) {
      return this.field22823.method15213(var1);
   }

   @Override
   public Class4916 method15215() {
      return this.field22823.method15215();
   }

   @Override
   public Class4916 method15216() {
      return this.field22823.method15216();
   }

   @Override
   public void method15217() throws IOException {
      this.field22823.method15217();
   }
}
