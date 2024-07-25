package remapped;

import java.util.List;

public class class_7517 implements class_4625<Object> {
   private List<Object> field_38382;
   private int field_38384;
   private boolean field_38381;

   @Override
   public void method_21420(List<Object> var1) {
      if (this.field_38381) {
         throw new RuntimeException("Iterator still used, oldList: " + this.field_38382 + ", newList: " + var1);
      } else {
         this.field_38382 = var1;
         this.field_38384 = 0;
         this.field_38381 = var1 != null && this.field_38384 < var1.size();
      }
   }

   @Override
   public Object next() {
      if (this.field_38381) {
         Object var3 = this.field_38382.get(this.field_38384);
         this.field_38384++;
         this.field_38381 = this.field_38384 < this.field_38382.size();
         return var3;
      } else {
         return null;
      }
   }

   @Override
   public boolean hasNext() {
      if (this.field_38381) {
         return this.field_38381;
      } else {
         class_4939.method_22643(this);
         return false;
      }
   }
}
