package mapped;

public class Class3137 implements Class2982 {
   public final Class3991 field18354;

   public Class3137(Class3991 var1) {
      this.field18354 = var1;
   }

   @Override
   public void method11398(Class8563 var1) throws Exception {
      String var4 = var1.<String>method30555(Class4750.field22539, 0);
      if (var4.equalsIgnoreCase("MC|BSign")) {
         Class9738 var5 = var1.<Class9738>method30561(Class4750.field22561);
         if (var5 != null) {
            var5.method38162(387);
            Class8768.method31626(var5);
         }
      }

      if (var4.equalsIgnoreCase("MC|AutoCmd")) {
         var1.method30558(Class4750.field22539, 0, "MC|AdvCdm");
         var1.method30560(Class4750.field22518, (byte)0);
         var1.<Integer>method30561(Class4750.field22526);
         var1.<Integer>method30561(Class4750.field22526);
         var1.<Integer>method30561(Class4750.field22526);
         var1.<String>method30561(Class4750.field22539);
         var1.<Boolean>method30561(Class4750.field22524);
         var1.method30564();
      }

      if (var4.equalsIgnoreCase("MC|AdvCmd")) {
         var1.method30558(Class4750.field22539, 0, "MC|AdvCdm");
      }
   }
}
