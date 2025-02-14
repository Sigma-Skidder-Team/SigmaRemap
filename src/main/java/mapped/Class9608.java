package mapped;

public class Class9608<E> {
   private static String[] field44930;
   private E[] field44931;
   private int field44932;

   public Class9608(int var1) {
      this.field44931 = (E[])(new Object[var1]);
   }

   public void method37345(E var1) {
      this.field44931[this.field44932] = (E)var1;
      this.field44932++;
   }

   public E method37346(int var1) {
      return this.field44931[var1];
   }

   public int method37347() {
      return this.field44932;
   }

   public void method37348() {
      this.field44932 = 0;
   }
}
