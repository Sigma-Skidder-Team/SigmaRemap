package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

import java.util.HashMap;
import java.util.Map;

public class Class4110 extends Class4057 {
   private static Map<String, Integer> field20396 = null;

   public Class4110() {
      super(EntityType.field41072, "ravager", 1.1F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2819();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2819) {
         Class2819 var5 = (Class2819)var1;
         Map var6 = method12837();
         if (!var6.containsKey(var2)) {
            return null;
         } else {
            int var7 = (Integer)var6.get(var2);
            return (Class7219) Reflector.method35075(var5, Reflector.field43092, var7);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return method12837().keySet().<String>toArray(new String[0]);
   }

   private static Map<String, Integer> method12837() {
      if (field20396 == null) {
         field20396 = new HashMap<String, Integer>();
         field20396.put("head", 0);
         field20396.put("jaw", 1);
         field20396.put("body", 2);
         field20396.put("leg1", 3);
         field20396.put("leg2", 4);
         field20396.put("leg3", 5);
         field20396.put("leg4", 6);
         field20396.put("neck", 7);
         return field20396;
      } else {
         return field20396;
      }
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5701 var6 = new Class5701(var5);
      var6.field25086 = (Class2819)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
