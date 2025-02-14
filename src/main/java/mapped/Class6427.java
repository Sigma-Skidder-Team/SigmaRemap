package mapped;

import java.io.IOException;

public class Class6427 implements Class6415 {
   public final Class8475 field28262;

   public Class6427(Class8475 var1) {
      this.field28262 = var1;
   }

   @Override
   public void method19539() throws IOException {
      if (!(Class8475.method29928(this.field28262) instanceof Class5932)) {
         throw new Class2487("expected DocumentEndEvent, but got " + Class8475.method29928(this.field28262));
      } else {
         this.field28262.method29917();
         if (((Class5932)Class8475.method29928(this.field28262)).method18440()) {
            this.field28262.method29916("...", true, false, false);
            this.field28262.method29917();
         }

         this.field28262.method29913();
         Class8475.method29929(this.field28262, new Class6429(this.field28262, false));
      }
   }
}
