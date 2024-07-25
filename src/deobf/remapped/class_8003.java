package remapped;

public class class_8003 extends class_4215 {
   private static String[] field_41015;
   public static final class_8003 field_41014 = new class_8003(0, 0, 0);
   public static final class_8003 field_41011 = new class_8003(1, 0, 0);
   public static final class_8003 field_41016 = new class_8003(0, 1, 0);
   public static final class_8003 field_41013 = new class_8003(0, 0, 1);
   public static final class_8003 field_41012 = new class_8003(1, 1, 1);

   public class_8003(class_4215 var1) {
      super(var1);
   }

   public class_8003(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public class_8003(float var1, float var2, float var3) {
      super(var1, var2, var3);
   }

   public class_8003(double var1, double var3, double var5) {
      super(var1, var3, var5);
   }

   @Override
   public boolean equals(Object var1) {
      if (!(var1 instanceof class_4215)) {
         return false;
      } else {
         class_4215 var4 = (class_4215)var1;
         return (int)var4.method_19594() == (int)this.field_20470
            && (int)var4.method_19634() == (int)this.field_20473
            && (int)var4.method_19612() == (int)this.field_20468;
      }
   }

   @Override
   public int hashCode() {
      return (int)this.field_20470 << 19 ^ (int)this.field_20473 << 12 ^ (int)this.field_20468;
   }

   @Override
   public class_8003 method_19640() {
      return this;
   }
}
