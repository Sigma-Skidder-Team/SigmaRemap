package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

import java.util.Iterator;

public class Class4068 extends Class4057 {
   public Class4068() {
      super(EntityType.field41034, "ghast", 0.5F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2817();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2817) {
         Class2817 var5 = (Class2817)var1;
         Iterator var6 = var5.method11015().iterator();
         if (!var2.equals("body")) {
            String var7 = "tentacle";
            if (!var2.startsWith(var7)) {
               return null;
            } else {
               String var8 = var2.substring(var7.length());
               int var9 = Class7944.method26899(var8, -1);
               return Class8542.method30390(var6, var9);
            }
         } else {
            return Class8542.method30390(var6, 0);
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"body", "tentacle1", "tentacle2", "tentacle3", "tentacle4", "tentacle5", "tentacle6", "tentacle7", "tentacle8", "tentacle9"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5684 var6 = new Class5684(var5);
      var6.field25086 = (Class2817<Class1112>)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
