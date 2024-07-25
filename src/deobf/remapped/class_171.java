package remapped;

import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class class_171 implements Iterator<String> {
   public final Iterator<class_8748> field_561;
   public String field_557;
   public boolean field_560;

   public class_171(class_8555 var1) throws IOException {
      this.field_558 = var1;
      this.field_561 = this.field_558.field_43762.method_13846();
   }

   @Override
   public boolean hasNext() {
      if (this.field_557 != null) {
         return true;
      } else {
         this.field_560 = false;

         while (this.field_561.hasNext()) {
            class_8748 var3 = this.field_561.next();

            boolean var5;
            try {
               class_8067 var4 = class_1259.method_5671(var3.method_40153(0));
               this.field_557 = var4.method_36584();
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
         String var3 = this.field_557;
         this.field_557 = null;
         this.field_560 = true;
         return var3;
      } else {
         throw new NoSuchElementException();
      }
   }

   @Override
   public void remove() {
      if (this.field_560) {
         this.field_561.remove();
      } else {
         throw new IllegalStateException("remove() before next()");
      }
   }
}
