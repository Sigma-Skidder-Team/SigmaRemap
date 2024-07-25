package remapped;

public final class class_4266 implements AutoCloseable {
   private static String[] field_20674;
   private final class_6354 field_20673;
   private final class_6298 field_20675;
   private final class_5684 field_20672;

   private class_4266(class_6354 var1, class_6298 var2, class_5684 var3) {
      this.field_20673 = var1;
      this.field_20675 = var2;
      this.field_20672 = var3;
   }

   public class_6354 method_19862() {
      return this.field_20673;
   }

   public class_6298 method_19863() {
      return this.field_20675;
   }

   public class_5684 method_19864() {
      return this.field_20672;
   }

   @Override
   public void close() {
      this.field_20673.close();
      this.field_20675.close();
   }
}
