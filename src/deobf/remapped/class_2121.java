package remapped;

public class class_2121 implements class_7150 {
   private static String[] field_10632;
   private int field_10633;

   public class_2121(int var1) {
      this.field_10633 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof class_2121) ? false : ((class_2121)var1).field_10633 == this.field_10633;
   }

   @Override
   public int hashCode() {
      return this.field_10633;
   }
}
