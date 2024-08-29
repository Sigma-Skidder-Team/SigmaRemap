package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class4143 extends Class4057 {
   private static Map<String, Integer> field20397 = null;

   public Class4143() {
      super(EntityType.field41071, "rabbit", 0.3F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2876();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2876) {
         Class2876 var5 = (Class2876)var1;
         Map var6 = method12838();
         if (!var6.containsKey(var2)) {
            return null;
         } else {
            int var7 = (Integer)var6.get(var2);
            return (Class7219)Class9299.method35075(var5, Class9299.field43090, var7);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{
         "left_foot", "right_foot", "left_thigh", "right_thigh", "body", "left_arm", "right_arm", "head", "right_ear", "left_ear", "tail", "nose"
      };
   }

   private static Map<String, Integer> method12838() {
      if (field20397 == null) {
         field20397 = new HashMap<String, Integer>();
         field20397.put("left_foot", 0);
         field20397.put("right_foot", 1);
         field20397.put("left_thigh", 2);
         field20397.put("right_thigh", 3);
         field20397.put("body", 4);
         field20397.put("left_arm", 5);
         field20397.put("right_arm", 6);
         field20397.put("head", 7);
         field20397.put("right_ear", 8);
         field20397.put("left_ear", 9);
         field20397.put("tail", 10);
         field20397.put("nose", 11);
         return field20397;
      } else {
         return field20397;
      }
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5656 var6 = new Class5656(var5);
      var6.field25086 = (Class2876<Class1094>)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
