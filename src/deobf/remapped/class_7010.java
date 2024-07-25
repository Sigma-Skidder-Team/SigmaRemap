package remapped;

public class class_7010 extends class_6042 {
   private static String[] field_35949;
   public static final class_7010 field_35948 = new class_7010(0, 0);
   public static final class_7010 field_35946 = new class_7010(1, 0);
   public static final class_7010 field_35947 = new class_7010(0, 1);
   public static final class_7010 field_35945 = new class_7010(1, 1);

   public class_7010(class_6042 var1) {
      super(var1);
   }

   public class_7010(int var1, int var2) {
      super(var1, var2);
   }

   public class_7010(float var1, float var2) {
      super(var1, var2);
   }

   public class_7010(double var1, double var3) {
      super(var1, var3);
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof class_6042)) {
         return false;
      } else {
         class_6042 var4 = (class_6042)var1;
         return (int)var4.field_30845 == (int)this.field_30845 && (int)var4.field_30849 == (int)this.field_30849;
      }
   }

   @Override
   public int hashCode() {
      return Integer.valueOf((int)this.field_30845).hashCode() >> 13 ^ Integer.valueOf((int)this.field_30849).hashCode();
   }

   @Override
   public class_7010 method_27569() {
      return this;
   }
}
