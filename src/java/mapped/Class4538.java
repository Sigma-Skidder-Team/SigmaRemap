package mapped;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class4538 implements Iterator<Class1792> {
   public final Iterator<Class8316> field21878;
   public Class1792 field21879;
   public Class1792 field21880;
   public final Class1756 field21881;

   public Class4538(Class1756 var1) {
      this.field21881 = var1;
      this.field21878 = new ArrayList<Class8316>(this.field21881.field9517.values()).iterator();
   }

   @Override
   public boolean hasNext() {
      if (this.field21879 != null) {
         return true;
      } else {
         synchronized (this.field21881) {
            if (this.field21881.field9521) {
               return false;
            } else {
               while (this.field21878.hasNext()) {
                  Class8316 var4 = this.field21878.next();
                  Class1792 var5 = var4.method29099();
                  if (var5 != null) {
                     this.field21879 = var5;
                     return true;
                  }
               }

               return false;
            }
         }
      }
   }

   public Class1792 next() {
      if (this.hasNext()) {
         this.field21880 = this.field21879;
         this.field21879 = null;
         return this.field21880;
      } else {
         throw new NoSuchElementException();
      }
   }

   @Override
   public void remove() {
      if (this.field21880 == null) {
         throw new IllegalStateException("remove() before next()");
      } else {
         try {
            this.field21881.method7691(Class1792.method7832(this.field21880));
         } catch (IOException var7) {
         } finally {
            this.field21880 = null;
         }
      }
   }
}
