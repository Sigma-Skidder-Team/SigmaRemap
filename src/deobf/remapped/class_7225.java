package remapped;

public class class_7225 {
   private static String[] field_37080;
   private int field_37081;
   private int field_37082;

   public class_7225(int var1) {
      this.field_37081 = var1;
      this.field_37082 = var1;
   }

   public synchronized int method_33083() {
      return this.field_37082++;
   }

   public synchronized void method_33084() {
      this.field_37082 = this.field_37081;
   }

   public int method_33085() {
      return this.field_37082;
   }
}
