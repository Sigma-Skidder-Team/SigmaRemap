package remapped;

public class class_5945 implements class_7150 {
   private static String[] field_30322;
   private int field_30321;

   public class_5945(int var1) {
      this.field_30321 = var1;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof class_5945) ? false : ((class_5945)var1).field_30321 == this.field_30321;
   }

   @Override
   public int hashCode() {
      return this.field_30321;
   }
}
