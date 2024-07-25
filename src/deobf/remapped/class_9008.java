package remapped;

public class class_9008<E> {
   private static String[] field_46099;
   private E[] field_46101;
   private int field_46100;

   public class_9008(int var1) {
      this.field_46101 = (E[])(new Object[var1]);
   }

   public void method_41329(E var1) {
      this.field_46101[this.field_46100] = (E)var1;
      this.field_46100++;
   }

   public E method_41331(int var1) {
      return this.field_46101[var1];
   }

   public int method_41330() {
      return this.field_46100;
   }

   public void method_41332() {
      this.field_46100 = 0;
   }
}
