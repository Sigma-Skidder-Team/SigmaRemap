package mapped;

import java.util.ArrayList;
import java.util.Arrays;

public class Class4127 extends Class4117 {
   public Class4127() {
      super(Class8992.field41065, "piglin", 0.5F);
   }

   public Class4127(Class8992 var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Class2828 method12822() {
      return new Class2895(0.0F, 64, 64);
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2895) {
         Class2895 var5 = (Class2895)var1;
         if (var2.equals("left_ear")) {
            return var5.field17928;
         }

         if (var2.equals("right_ear")) {
            return var5.field17929;
         }
      }

      return super.method12823(var1, var2);
   }

   @Override
   public String[] method12824() {
      ArrayList<String> var3 = new ArrayList<String>(Arrays.asList(super.method12824()));
      var3.add("left_ear");
      var3.add("right_ear");
      return var3.toArray(new String[var3.size()]);
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      Class8853 var5 = Minecraft.getInstance().method1554();
      Class5671 var6 = new Class5671(var5, false);
      var6.field25086 = (Class2895<Class1006>)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
