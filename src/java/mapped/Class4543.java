package mapped;

import java.util.List;

public class Class4543 implements Class4542<Object> {
   private List<Object> field21891;
   private int field21892;
   private boolean field21893;

   @Override
   public void method14496(List<Object> var1) {
      if (this.field21893) {
         throw new RuntimeException("Iterator still used, oldList: " + this.field21891 + ", newList: " + var1);
      } else {
         this.field21891 = var1;
         this.field21892 = 0;
         this.field21893 = var1 != null && this.field21892 < var1.size();
      }
   }

   @Override
   public Object next() {
      if (this.field21893) {
         Object var3 = this.field21891.get(this.field21892);
         this.field21892++;
         this.field21893 = this.field21892 < this.field21891.size();
         return var3;
      } else {
         return null;
      }
   }

   @Override
   public boolean hasNext() {
      if (this.field21893) {
         return this.field21893;
      } else {
         Class8525.method30229(this);
         return false;
      }
   }
}
