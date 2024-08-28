package mapped;

import java.io.IOException;

public final class Class6440 implements Class6441 {
   private static String[] field28286;
   private final Class7163 field28287;
   private Class1716 field28288;
   private Class1716 field28289;
   public boolean field28290;
   public final Class1715 field28291;

   public Class6440(Class1715 var1, Class7163 var2) {
      this.field28291 = var1;
      this.field28287 = var2;
      this.field28288 = var2.method22497(1);
      this.field28289 = new Class1729(this, this.field28288, var1, var2);
   }

   @Override
   public void method19553() {
      synchronized (this.field28291) {
         if (this.field28290) {
            return;
         }

         this.field28290 = true;
         this.field28291.field9370++;
      }

      Class9474.method36535(this.field28288);

      try {
         this.field28287.method22499();
      } catch (IOException var5) {
      }
   }

   @Override
   public Class1716 method19554() {
      return this.field28289;
   }
}
