package remapped;

public class class_8594 {
   private static String[] field_44022;
   private long field_44021;

   public class_8594(long var1) {
      this.field_44021 = System.currentTimeMillis() + var1;
   }

   public boolean method_39510() {
      return this.field_44021 - System.currentTimeMillis() < 0L;
   }
}
