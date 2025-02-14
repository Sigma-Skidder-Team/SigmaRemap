package mapped;

import java.io.IOException;

public class Class1726 extends Class1725 {
   private static String[] field9406;
   private boolean field9407;

   public Class1726(Sink var1) {
      super(var1);
   }

   @Override
   public void method7540(Class1734 var1, long var2) throws IOException {
      if (this.field9407) {
         var1.method7627(var2);
      } else {
         try {
            super.method7540(var1, var2);
         } catch (IOException var7) {
            this.field9407 = true;
            this.method7550(var7);
         }
      }
   }

   @Override
   public void flush() throws IOException {
      if (!this.field9407) {
         try {
            super.flush();
         } catch (IOException var4) {
            this.field9407 = true;
            this.method7550(var4);
         }
      }
   }

   @Override
   public void close() throws IOException {
      if (!this.field9407) {
         try {
            super.close();
         } catch (IOException var4) {
            this.field9407 = true;
            this.method7550(var4);
         }
      }
   }

   public void method7550(IOException var1) {
   }
}
