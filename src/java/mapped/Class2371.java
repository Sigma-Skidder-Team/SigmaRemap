package mapped;

import java.io.IOException;
import java.util.ArrayList;

public final class Class2371 implements Class2370 {
   public final Class2391 field16215;
   public final Class6171 field16216;
   public final Class4830 field16217;
   public final Class8223 field16218;
   public final boolean field16219;
   private boolean field16220;

   public Class2371(Class2391 var1, Class8223 var2, boolean var3) {
      Class8774 var6 = var1.method9827();
      this.field16215 = var1;
      this.field16218 = var2;
      this.field16219 = var3;
      this.field16216 = new Class6171(var1, var3);
      this.field16217 = var6.method31649(this);
   }

   @Override
   public Class8223 method9544() {
      return this.field16218;
   }

   @Override
   public Class1797 method9545() throws IOException {
      synchronized (this) {
         if (this.field16220) {
            throw new IllegalStateException("Already Executed");
         }

         this.field16220 = true;
      }

      this.method9550();

      Class1797 var4;
      try {
         this.field16215.method9822().method22926(this);
         Class1797 var3 = this.method9554();
         if (var3 == null) {
            throw new IOException("Canceled");
         }

         var4 = var3;
      } finally {
         this.field16215.method9822().method22928(this);
      }

      return var4;
   }

   private void method9550() {
      
   }

   @Override
   public void method9546(Class4232 var1) {
      synchronized (this) {
         if (this.field16220) {
            throw new IllegalStateException("Already Executed");
         }

         this.field16220 = true;
      }

      this.method9550();
      this.field16215.method9822().method22922(new Class1568(this, var1));
   }

   @Override
   public void method9547() {
      this.field16216.method19070();
   }

   @Override
   public synchronized boolean method9548() {
      return this.field16220;
   }

   @Override
   public boolean method9549() {
      return this.field16216.method19071();
   }

   public Class2371 clone() {
      return new Class2371(this.field16215, this.field16218, this.field16219);
   }

   public Class5751 method9551() {
      return this.field16216.method19073();
   }

   public String method9552() {
      return (!this.method9549() ? "" : "canceled ") + (!this.field16219 ? "call" : "web socket") + " to " + this.method9553();
   }

   public String method9553() {
      return this.field16218.method28612().method22962();
   }

   public Class1797 method9554() throws IOException {
      ArrayList var3 = new ArrayList();
      var3.addAll(this.field16215.method9825());
      var3.add(this.field16216);
      var3.add(new Class6175(this.field16215.method9808()));
      var3.add(new Class6174(this.field16215.method9810()));
      var3.add(new Class6176(this.field16215));
      if (!this.field16219) {
         var3.addAll(this.field16215.method9826());
      }

      var3.add(new Class6173(this.field16219));
      Class8164 var4 = new Class8164(var3, null, null, null, 0, this.field16218);
      return var4.method28409(this.field16218);
   }
}
