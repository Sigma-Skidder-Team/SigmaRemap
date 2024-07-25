package remapped;

import java.util.AbstractList;
import java.util.RandomAccess;

public final class class_5780 extends AbstractList<class_9091> implements RandomAccess {
   private static String[] field_29197;
   public final class_9091[] field_29196;

   private class_5780(class_9091[] var1) {
      this.field_29196 = var1;
   }

   public static class_5780 of(class_9091... var0) {
      return new class_5780((class_9091[])var0.clone());
   }

   public class_9091 get(int var1) {
      return this.field_29196[var1];
   }

   @Override
   public int size() {
      return this.field_29196.length;
   }
}
