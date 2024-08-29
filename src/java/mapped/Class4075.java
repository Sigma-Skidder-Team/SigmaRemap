package mapped;

import java.util.ArrayList;
import java.util.Arrays;

public class Class4075 extends Class4071 {
   public Class4075() {
      super(EntityType.field41057, "mule", 0.75F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2857(0.92F);
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2857) {
         Class2857 var5 = (Class2857)var1;
         if (!var2.equals("left_chest")) {
            return !var2.equals("right_chest") ? super.method12823(var1, var2) : (Class7219)Class9299.field43057.method36565(var5, 1);
         } else {
            return (Class7219)Class9299.field43057.method36565(var5, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      ArrayList<String> var3 = new ArrayList<String>(Arrays.asList(super.method12824()));
      var3.add("left_chest");
      var3.add("right_chest");
      return var3.toArray(new String[var3.size()]);
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5687 var6 = new Class5687(var5, 0.92F);
      var6.field25086 = (Class2827)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
