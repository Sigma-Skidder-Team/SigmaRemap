package remapped;

public class class_9529 extends class_7474 {
   private static String[] field_48503;
   private final Direction field_48502;
   private final class_1331 field_48499;
   private final boolean field_48500;
   private final boolean field_48501;

   public static class_9529 method_43958(class_1343 var0, Direction var1, class_1331 var2) {
      return new class_9529(true, var0, var1, var2, false);
   }

   public class_9529(class_1343 var1, Direction var2, class_1331 var3, boolean var4) {
      this(false, var1, var2, var3, var4);
   }

   private class_9529(boolean var1, class_1343 var2, Direction var3, class_1331 var4, boolean var5) {
      super(var2);
      this.field_48500 = var1;
      this.field_48502 = var3;
      this.field_48499 = var4;
      this.field_48501 = var5;
   }

   public class_9529 method_43954(Direction var1) {
      return new class_9529(this.field_48500, this.field_38155, var1, this.field_48499, this.field_48501);
   }

   public class_9529 method_43957(class_1331 var1) {
      return new class_9529(this.field_48500, this.field_38155, this.field_48502, var1, this.field_48501);
   }

   public class_1331 method_43955() {
      return this.field_48499;
   }

   public Direction method_43956() {
      return this.field_48502;
   }

   @Override
   public class_1430 method_33990() {
      return !this.field_48500 ? class_1430.field_7717 : class_1430.field_7721;
   }

   public boolean method_43953() {
      return this.field_48501;
   }
}