package mapped;

import java.io.IOException;

public final class Class1568 extends Class1555 {
   private final Class4232 field8481;
   public final Class2371 field8482;

   public Class1568(Class2371 var1, Class4232 var2) {
      super("OkHttp %s", var1.method9553());
      this.field8482 = var1;
      this.field8481 = var2;
   }

   public String method6485() {
      return this.field8482.field16218.method28612().method22942();
   }

   public Class8223 method6486() {
      return this.field8482.field16218;
   }

   public Class2371 method6487() {
      return this.field8482;
   }

   @Override
   public void method6472() {
      boolean var3 = false;

      try {
         Class1797 var4 = this.field8482.method9554();
         if (this.field8482.field16216.method19071()) {
            var3 = true;
            this.field8481.method13023(this.field8482, new IOException("Canceled"));
         } else {
            var3 = true;
            this.field8481.method13024(this.field8482, var4);
         }
      } catch (IOException var8) {
         if (var3) {
            //Class7596.method24879().method24873(4, "Callback failure for " + this.field8482.method9552(), var8);
         } else {
            this.field8481.method13023(this.field8482, var8);
         }
      } finally {
         this.field8482.field16215.method9822().method22927(this);
      }
   }
}
