package mapped;

public class Class8308 extends Class8307 {
   private static String[] field35705;
   private Class5063 field35706;
   private Class6510[] field35707;

   public Class8308(Class5056 var1) {
      this.field35706 = (Class5063)var1;
      this.field35707 = new Class6510[this.field35706.method15487()];

      for (int var4 = 0; var4 < this.field35707.length; var4++) {
         this.field35707[var4] = new Class6510(this, var4);
      }
   }

   public int method29065() {
      return this.field35706.method15486();
   }

   public Class6510[] method29066() {
      return this.field35707;
   }

   // $VF: synthetic method
   public static Class5063 method29067(Class8308 var0) {
      return var0.field35706;
   }
}
