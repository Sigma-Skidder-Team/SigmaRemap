package mapped;

import com.google.common.collect.AbstractIterator;

public class Class4555 extends AbstractIterator {
   private static String[] field21965;
   private Class2001 field21966;
   public final Class50 field21967;

   public Class4555(Class50 var1) {
      this.field21967 = var1;
      this.field21966 = null;
   }

   public Object computeNext() {
      if (this.field21966 != null) {
         if (!this.field21966.equals(this.field21967.field105)) {
            int var3 = this.field21966.getX();
            int var4 = this.field21966.getY();
            int var5 = this.field21966.getZ();
            if (var3 >= this.field21967.field105.getX()) {
               if (var5 >= this.field21967.field105.getZ()) {
                  if (var4 < this.field21967.field105.getY()) {
                     var3 = this.field21967.field104.getX();
                     var5 = this.field21967.field104.getZ();
                     var4++;
                  }
               } else {
                  var3 = this.field21967.field104.getX();
                  var5++;
               }
            } else {
               var3++;
            }

            this.field21966.method8384(var3, var4, var5);
            return this.field21966;
         } else {
            return (Class2001)this.endOfData();
         }
      } else {
         this.field21966 = new Class2001(this.field21967.field104.getX(), this.field21967.field104.getY(), this.field21967.field104.getZ(), 3);
         return this.field21966;
      }
   }
}
