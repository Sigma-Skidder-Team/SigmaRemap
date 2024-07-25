package remapped;

import java.io.IOException;

public class class_3809 extends class_6619 {
   private static String[] field_18651;
   private boolean field_18652;

   public class_3809(class_4131 var1) {
      super(var1);
   }

   @Override
   public void method_19191(class_7059 var1, long var2) throws IOException {
      if (this.field_18652) {
         var1.method_36583(var2);
      } else {
         try {
            super.method_19191(var1, var2);
         } catch (IOException var7) {
            this.field_18652 = true;
            this.method_17750(var7);
         }
      }
   }

   @Override
   public void flush() throws IOException {
      if (!this.field_18652) {
         try {
            super.flush();
         } catch (IOException var4) {
            this.field_18652 = true;
            this.method_17750(var4);
         }
      }
   }

   @Override
   public void close() throws IOException {
      if (!this.field_18652) {
         try {
            super.close();
         } catch (IOException var4) {
            this.field_18652 = true;
            this.method_17750(var4);
         }
      }
   }

   public void method_17750(IOException var1) {
   }
}
