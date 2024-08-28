package mapped;

public class Class3916 extends Class3758 {
   private static String[] field20177;
   public final Class9524 field20178;

   public Class3916(Class9524 var1) {
      this.field20178 = var1;
   }

   @Override
   public void method12725() {
      this.map(Class9524.method36805(this.field20178));
      this.map(Class4750.field22522);
      this.map(Class4750.field22522);
      this.map(Class4750.field22544);
      this.method12733(var1 -> {
         int var4 = var1.<Integer>method30555(Class4750.field22544, 0);
         int var5 = Class9524.method36806(this.field20178).method19376().method18529(var4);
         if (var5 != -1) {
            var1.method30558(Class4750.field22544, 0, var5);
         } else {
            var1.method30578();
         }
      });
   }
}
