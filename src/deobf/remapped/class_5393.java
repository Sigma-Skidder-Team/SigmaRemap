package remapped;

import java.util.Iterator;

public final class class_5393 implements Iterable {
   private static String[] field_27528;

   public class_5393(BlockPos var1, BlockPos var2) {
      this.field_27527 = var1;
      this.field_27526 = var2;
   }

   @Override
   public Iterator iterator() {
      return new class_732(this);
   }
}
