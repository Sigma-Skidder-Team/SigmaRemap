package mapped;

import java.util.Map;

public class Class4104 extends Class4057 {
   public Class4104() {
      super(Class4387.field21435, "head_dragon", 0.0F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2846(0.0F);
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2846) {
         Class2846 var5 = (Class2846)var1;
         if (!var2.equals("head")) {
            return !var2.equals("jaw") ? null : (Class7219)Class9299.method35072(var5, Class9299.field43053);
         } else {
            return (Class7219)Class9299.method35072(var5, Class9299.field43052);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"head", "jaw"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      Class8086 var5 = Class8086.field34743;
      Object var6 = var5.method27968(Class4387.field21435);
      if (var6 instanceof Class5952) {
         if (((Class5942)var6).method18463() == null) {
            var6 = new Class5952(var5);
         }

         Map var7 = (Map)Class9299.field43169.method20234();
         if (var7 != null) {
            var7.put(Class2136.field13994, var1);
            return (Class9492)var6;
         } else {
            Class7944.method26811("Field not found: TileEntitySkullRenderer.MODELS");
            return null;
         }
      } else {
         return null;
      }
   }
}
