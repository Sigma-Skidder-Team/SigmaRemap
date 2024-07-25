package remapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class class_8291 implements Iterator<class_8748> {
   public final Iterator<class_4203> field_42496;
   public class_8748 field_42493;
   public class_8748 field_42495;

   public class_8291(class_3034 var1) {
      this.field_42494 = var1;
      this.field_42496 = new ArrayList<class_4203>(this.field_42494.field_14868.values()).iterator();
   }

   @Override
   public boolean hasNext() {
      if (this.field_42493 != null) {
         return true;
      } else {
         synchronized (this.field_42494) {
            if (this.field_42494.field_14875) {
               return false;
            } else {
               while (this.field_42496.hasNext()) {
                  class_4203 var4 = this.field_42496.next();
                  class_8748 var5 = var4.method_19565();
                  if (var5 != null) {
                     this.field_42493 = var5;
                     return true;
                  }
               }

               return false;
            }
         }
      }
   }

   public class_8748 next() {
      if (this.hasNext()) {
         this.field_42495 = this.field_42493;
         this.field_42493 = null;
         return this.field_42495;
      } else {
         throw new NoSuchElementException();
      }
   }

   @Override
   public void remove() {
      if (this.field_42495 == null) {
         throw new IllegalStateException("remove() before next()");
      } else {
         try {
            this.field_42494.method_13860(class_8748.method_40156(this.field_42495));
         } catch (IOException var7) {
         } finally {
            this.field_42495 = null;
         }
      }
   }
}
