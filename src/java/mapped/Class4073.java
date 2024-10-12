package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

import java.util.ArrayList;
import java.util.Arrays;

public class Class4073 extends Class4071 {
   public Class4073() {
      super(EntityType.field41019, "donkey", 0.75F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2857(0.87F);
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2857) {
         Class2857 var5 = (Class2857)var1;
         if (!var2.equals("left_chest")) {
            return !var2.equals("right_chest") ? super.method12823(var1, var2) : (ModelRenderer) Reflector.field43057.method36565(var5, 1);
         } else {
            return (ModelRenderer) Reflector.field43057.method36565(var5, 0);
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
      Class5687 var6 = new Class5687(var5, 0.87F);
      var6.mainModel = (Class2827)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
