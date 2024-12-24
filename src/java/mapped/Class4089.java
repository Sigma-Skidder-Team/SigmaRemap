package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

import java.util.HashMap;
import java.util.Map;

public class Class4089 extends Class4057 {
   private static Map<String, Integer> field20394 = null;

   public Class4089() {
      super(EntityType.OCELOT, "ocelot", 0.4F);
   }

   public Class4089(EntityType var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Class2828 method12822() {
      return new Class2860(0.0F);
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2860) {
         Class2860 var5 = (Class2860)var1;
         Map var6 = method12835();
         if (!var6.containsKey(var2)) {
            return null;
         } else {
            int var7 = (Integer)var6.get(var2);
            return (ModelRenderer) Reflector.method35075(var5, Reflector.field43076, var7);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"back_left_leg", "back_right_leg", "front_left_leg", "front_right_leg", "tail", "tail2", "head", "body"};
   }

   private static Map<String, Integer> method12835() {
      if (field20394 == null) {
         field20394 = new HashMap<String, Integer>();
         field20394.put("back_left_leg", 0);
         field20394.put("back_right_leg", 1);
         field20394.put("front_left_leg", 2);
         field20394.put("front_right_leg", 3);
         field20394.put("tail", 4);
         field20394.put("tail2", 5);
         field20394.put("head", 6);
         field20394.put("body", 7);
         return field20394;
      } else {
         return field20394;
      }
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5711 var6 = new Class5711(var5);
      var6.entityModel = (Class2860<OcelotEntity>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
