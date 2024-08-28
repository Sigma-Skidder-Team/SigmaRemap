package mapped;

import java.io.IOException;

public class Class6430 implements Class6415 {
   public final Class8475 field28266;

   public Class6430(Class8475 var1) {
      this.field28266 = var1;
   }

   @Override
   public void method19539() throws IOException {
      if (!(Class8475.method29928(this.field28266) instanceof Class5933)) {
         throw new Class2487("expected StreamStartEvent, but got " + Class8475.method29928(this.field28266));
      } else {
         this.field28266.method29914();
         Class8475.method29929(this.field28266, new Class6422(this.field28266));
      }
   }
}
