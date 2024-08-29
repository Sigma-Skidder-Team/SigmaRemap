package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

import java.util.HashMap;
import java.util.Map;

public class Class4071 extends Class4057 {
   private static Map<String, Integer> field20391 = method12832();
   private static Map<String, Integer> field20392 = method12833();
   private static Map<String, Integer> field20393 = method12834();

   public Class4071() {
      super(EntityType.field41038, "horse", 0.75F);
   }

   public Class4071(EntityType var1, String var2, float var3) {
      super(var1, var2, var3);
   }

   @Override
   public Class2828 method12822() {
      return new Class2856(0.0F);
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2856) {
         Class2856 var5 = (Class2856)var1;
         if (!field20391.containsKey(var2)) {
            if (!field20392.containsKey(var2)) {
               if (!field20393.containsKey(var2)) {
                  return null;
               } else {
                  Class7219 var9 = this.method12823(var5, "body");
                  int var10 = field20393.get(var2);
                  return var9.method22692(var10);
               }
            } else {
               Class7219 var8 = this.method12823(var5, "neck");
               int var7 = field20392.get(var2);
               return var8.method22692(var7);
            }
         } else {
            int var6 = field20391.get(var2);
            return (Class7219)Class9299.method35075(var5, Class9299.field43055, var6);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{
         "body",
         "neck",
         "back_left_leg",
         "back_right_leg",
         "front_left_leg",
         "front_right_leg",
         "child_back_left_leg",
         "child_back_right_leg",
         "child_front_left_leg",
         "child_front_right_leg",
         "tail",
         "saddle",
         "head",
         "mane",
         "mouth",
         "left_ear",
         "right_ear",
         "left_bit",
         "right_bit",
         "left_rein",
         "right_rein",
         "headpiece",
         "noseband"
      };
   }

   private static Map<String, Integer> method12832() {
      HashMap var2 = new HashMap();
      var2.put("body", 0);
      var2.put("neck", 1);
      var2.put("back_left_leg", 2);
      var2.put("back_right_leg", 3);
      var2.put("front_left_leg", 4);
      var2.put("front_right_leg", 5);
      var2.put("child_back_left_leg", 6);
      var2.put("child_back_right_leg", 7);
      var2.put("child_front_left_leg", 8);
      var2.put("child_front_right_leg", 9);
      return var2;
   }

   private static Map<String, Integer> method12833() {
      HashMap var2 = new HashMap();
      var2.put("head", 0);
      var2.put("mane", 1);
      var2.put("mouth", 2);
      var2.put("left_ear", 3);
      var2.put("right_ear", 4);
      var2.put("left_bit", 5);
      var2.put("right_bit", 6);
      var2.put("left_rein", 7);
      var2.put("right_rein", 8);
      var2.put("headpiece", 9);
      var2.put("noseband", 10);
      return var2;
   }

   private static Map<String, Integer> method12834() {
      HashMap var2 = new HashMap();
      var2.put("tail", 0);
      var2.put("saddle", 1);
      return var2;
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5688 var6 = new Class5688(var5);
      var6.field25086 = (Class2856<Class1074>)var1;
      var6.field25098 = var2;
      return (Class9492)((Object)var6);
   }
}
