package mapped;

import java.io.IOException;

public class Class1729 extends Class1725 {
   private static String[] field9411;
   public final Class1715 field9412;
   public final Class7163 field9413;
   public final Class6440 field9414;

   public Class1729(Class6440 var1, Sink var2, Class1715 var3, Class7163 var4) {
      super(var2);
      this.field9414 = var1;
      this.field9412 = var3;
      this.field9413 = var4;
   }

   @Override
   public void close() throws IOException {
      synchronized (this.field9414.field28291) {
         if (this.field9414.field28290) {
            return;
         }

         this.field9414.field28290 = true;
         this.field9414.field28291.field9369++;
      }

      super.close();
      this.field9413.method22498();
   }
}
