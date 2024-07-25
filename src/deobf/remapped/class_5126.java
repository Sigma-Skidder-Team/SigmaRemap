package remapped;

import java.util.Iterator;

public class class_5126 implements Iterator<class_3511> {
   private class_7626 field_26453;
   private class_4274 field_26454;
   private class_523 field_26455 = new class_523(0, 0, 0);

   public class_5126(class_7626 var1, BlockPos var2, BlockPos var3, int var4, int var5) {
      this.field_26453 = var1;
      this.field_26454 = new class_4274(var2, var3, var4, var5);
   }

   @Override
   public boolean hasNext() {
      return this.field_26454.hasNext();
   }

   public class_3511 next() {
      BlockPos var3 = this.field_26454.next();
      this.field_26455.method_2548(var3.method_12173() << 4, var3.method_12165() << 4, var3.method_12185() << 4);
      return this.field_26453.method_34563(this.field_26455);
   }

   @Override
   public void remove() {
      throw new RuntimeException("Not implemented");
   }
}
