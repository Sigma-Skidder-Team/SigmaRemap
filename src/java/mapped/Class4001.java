package mapped;

import java.util.List;

public final class Class4001 extends Class3758 {
   private static String[] field20309;
   public final Class6907 field20310;

   public Class4001(Class6907 var1) {
      this.field20310 = var1;
   }

   @Override
   public void method12725() {
      this.map(Class4750.field22544);
      this.map(Class4750.field22541);
      this.map(Class4750.field22544);
      this.map(Class4750.field22528);
      this.map(Class4750.field22528);
      this.map(Class4750.field22528);
      this.map(Class4750.field22518);
      this.map(Class4750.field22518);
      this.map(Class4750.field22518);
      this.map(Class4750.field22534);
      this.map(Class4750.field22534);
      this.map(Class4750.field22534);
      this.method12733(this.field20310.method21101());
      this.method12733(var1 -> {
         int var4 = var1.<Integer>method30555(Class4750.field22544, 0);
         List<Class8656> var5 = var1.method30559(Class9218.field42416);
         this.field20310.method21090(var4, var5, var1.method30580());
         Class8563 var6 = var1.method30573(68);
         var6.method30560(Class4750.field22544, var4);
         var6.method30560(Class9218.field42416, var5);
         var6.method30570(Class6384.class);
      });
   }
}
