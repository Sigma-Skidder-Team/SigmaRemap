package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

import java.util.HashMap;
import java.util.Map;

public class Class4105 extends Class4057 {
   private static Map<String, Integer> field20395 = null;

   public Class4105() {
      super(EntityType.PHANTOM, "phantom", 0.75F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2806();
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2806) {
         Class2806 var5 = (Class2806)var1;
         Map var6 = method12836();
         if (!var6.containsKey(var2)) {
            if (var2.equals("head")) {
               int var9 = (Integer)var6.get("body");
               ModelRenderer var8 = (ModelRenderer) Reflector.method35075(var5, Reflector.field43078, var9);
               if (var8 != null) {
                  return var8.method22692(1);
               }
            }

            return null;
         } else {
            int var7 = (Integer)var6.get(var2);
            return (ModelRenderer) Reflector.method35075(var5, Reflector.field43078, var7);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return method12836().keySet().<String>toArray(new String[0]);
   }

   private static Map<String, Integer> method12836() {
      if (field20395 == null) {
         field20395 = new HashMap<String, Integer>();
         field20395.put("body", 0);
         field20395.put("left_wing", 1);
         field20395.put("left_wing_tip", 2);
         field20395.put("right_wing", 3);
         field20395.put("right_wing_tip", 4);
         field20395.put("tail", 5);
         field20395.put("tail2", 6);
         return field20395;
      } else {
         return field20395;
      }
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5681 var6 = new Class5681(var5);
      var6.entityModel = (Class2806<PhantomEntity>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
