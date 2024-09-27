package mapped;

public class Class3054 implements Class2982 {
   private static String[] field18214;
   public final Class3898 field18215;

   public Class3054(Class3898 var1) {
      this.field18215 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      int var4 = var1.<Integer>method30559(BruhMotha.field22544);
      int var5 = var1.<Integer>method30559(BruhMotha.field22544);
      var1.method30578();
      if (var4 != 383) {
         for (int var6 = 0; var6 < 16; var6++) {
            int var7 = this.field18215.field20147.method19376().method18533().get(var4 << 4 | var6);
            if (var7 == -1) {
               break;
            }

            Class8563 var8 = var1.method30573(24);
            var8.method30560(BruhMotha.field22544, var7);
            var8.method30560(BruhMotha.field22544, var5);
            var8.method30570(Class6380.class);
         }
      } else {
         for (int var9 = 0; var9 < 44; var9++) {
            Integer var10 = this.field18215.field20147.method19376().method18533().get(var4 << 16 | var9);
            if (var10 == null) {
               break;
            }

            Class8563 var11 = var1.method30573(24);
            var11.method30560(BruhMotha.field22544, var10);
            var11.method30560(BruhMotha.field22544, var5);
            var11.method30570(Class6380.class);
         }
      }
   }
}
