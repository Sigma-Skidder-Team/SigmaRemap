package mapped;

public class Class3824 extends Class3758 {
   private static String[] field20029;
   public final Class7310 field20030;

   public Class3824(Class7310 var1) {
      this.field20030 = var1;
   }

   @Override
   public void method12725() {
      this.method12733(var1 -> {
         int var4 = var1.<Integer>method30561(Class4750.field22544);
         int var5 = var4;

         for (int var6 = 0; var6 < var4; var6++) {
            int var7 = var1.<Integer>method30559(Class4750.field22544);
            int var8 = var1.<Integer>method30559(Class4750.field22544);
            int var9 = var1.<Integer>method30559(Class4750.field22544);
            if (var7 == 8 && Class7310.method23101(this.field20030).method19376().method18538() != null) {
               var8 = Class7310.method23101(this.field20030).method19376().method18538().method22147(var8);
               if (var8 == -1) {
                  var5--;
                  continue;
               }
            } else {
               Class2165 var10 = this.field20030.method23098(var7);
               Class7981 var11;
               if (var10 != null && (var11 = this.field20030.method23097(var10)) != null) {
                  var8 = var11.method27124(var8);
               }
            }

            var1.method30560(Class4750.field22544, var7);
            var1.method30560(Class4750.field22544, var8);
            var1.method30560(Class4750.field22544, var9);
         }

         if (var5 != var4) {
            var1.method30558(Class4750.field22544, 0, var5);
         }
      });
   }
}
