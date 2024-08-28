package mapped;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class4537 implements Iterator<String> {
   public final Iterator<Class1792> field21874;
   public String field21875;
   public boolean field21876;
   public final Class1715 field21877;

   public Class4537(Class1715 var1) throws IOException {
      this.field21877 = var1;
      this.field21874 = this.field21877.field9368.method7699();
   }

   @Override
   public boolean hasNext() {
      if (this.field21875 != null) {
         return true;
      } else {
         this.field21876 = false;

         while (this.field21874.hasNext()) {
            Class1792 var3 = this.field21874.next();

            boolean var5;
            try {
               Class1735 var4 = Class7001.method21696(var3.method7830(0));
               this.field21875 = var4.method7617();
               var5 = true;
            } catch (IOException var9) {
               continue;
            } finally {
               var3.close();
            }

            return var5;
         }

         return false;
      }
   }

   public String next() {
      if (this.hasNext()) {
         String var3 = this.field21875;
         this.field21875 = null;
         this.field21876 = true;
         return var3;
      } else {
         throw new NoSuchElementException();
      }
   }

   @Override
   public void remove() {
      if (this.field21876) {
         this.field21874.remove();
      } else {
         throw new IllegalStateException("remove() before next()");
      }
   }
}
