package mapped;

import java.util.List;

public final class Class3759 extends Class3758 {
   public final Class6907 field19919;

   public Class3759(Class6907 var1) {
      this.field19919 = var1;
   }

   @Override
   public void method12725() {
      this.map(Class4750.field22544);
      this.map(Class4750.field22541);
      this.map(Class4750.field22528);
      this.map(Class4750.field22528);
      this.map(Class4750.field22528);
      this.map(Class4750.field22518);
      this.map(Class4750.field22518);
      this.method12733(var1 -> {
         int var4 = var1.<Integer>method30555(Class4750.field22544, 0);
         Class1870 var5 = Class1870.field10431;
         var1.method30580().<Class6053>method22438(Class6053.class).method18666(var4, var5);
         List<Class8656> var6 = var1.method30559(Class9218.field42416);
         this.field19919.method21090(var4, var6, var1.method30580());
         Class8563 var7 = var1.method30573(68);
         var7.method30560(Class4750.field22544, var4);
         var7.method30560(Class9218.field42416, var6);
         var7.method30570(Class6384.class);
      });
   }
}
