package mapped;

public class Class3870 extends Class3758 {
   public final Class4662 field20104;

   public Class3870(Class4662 var1) {
      this.field20104 = var1;
   }

   @Override
   public void method12725() {
      this.method12733(var1 -> {
         int var4 = var1.<Integer>method30561(Class4750.field22544);

         for (int var5 = 0; var5 < var4; var5++) {
            String var6 = var1.<String>method30561(Class4750.field22539).replace("minecraft:", "");
            String var7 = var1.<String>method30561(Class4750.field22539);
            this.field20104.method14630(var1, var6);
         }
      });
   }
}
