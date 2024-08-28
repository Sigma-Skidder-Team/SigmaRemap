package mapped;

public class Class3782 extends Class3758 {
   private static String[] field19958;
   public final int field19959;
   public final int field19960;
   public final Class9524 field19961;

   public Class3782(Class9524 var1, int var2, int var3) {
      this.field19961 = var1;
      this.field19959 = var2;
      this.field19960 = var3;
   }

   @Override
   public void method12725() {
      this.map(Class4750.field22526);
      this.map(Class9524.method36805(this.field19961));
      this.map(Class4750.field22526);
      this.method12733(class8563 -> {
         int n3 = class8563.method30555(Class4750.field22526, 0);
         int n4 = class8563.method30555(Class4750.field22526, 1);
         if (n3 != this.field19959) {
            if (n3 != this.field19960) {
               return;
            }
         } else {
            class8563.method30558(Class4750.field22526, 1, Class9524.method36806(this.field19961).method19376().method18530(n4));
            return;
         }
         class8563.method30558(Class4750.field22526, 1, Class9524.method36806(this.field19961).method19376().method18528(n4));
      });
   }
}
