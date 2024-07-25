package remapped;

public class class_4477 extends class_1174 {
   private static String[] field_21820;
   private long field_21818 = 0L;
   private class_9371 field_21819 = null;

   public class_4477(class_1455 var1) {
      super(var1);
   }

   public boolean method_20774(int var1) {
      return System.currentTimeMillis() > this.field_21818 + (long)var1;
   }

   public void method_20775() {
      this.field_21818 = System.currentTimeMillis();
   }

   public long method_20777() {
      return this.field_21818;
   }

   public class_9371 method_20776() {
      return this.field_21819;
   }

   public void method_20778(class_9371 var1) {
      this.field_21819 = var1;
   }
}
