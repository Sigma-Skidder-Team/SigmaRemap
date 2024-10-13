package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;
import net.optifine.Config;

import java.util.Iterator;
import java.util.List;

public class Class4053 extends Class4051 {
   public Class4053() {
      super(EntityType.SHEEP, "sheep_wool", 0.7F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2868();
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Object var6 = var5.method32232().get(EntityType.SHEEP);
      if (var6 instanceof Class5749) {
         if (((EntityRenderer)var6).method17898() == null) {
            Class5749 var7 = new Class5749(var5);
            var7.field25086 = new Class2869<Class1019>();
            var7.shadowSize = 0.7F;
            var6 = var7;
         }

         Class5749 var11 = (Class5749)var6;
         List var8 = var11.method17886();
         Iterator var9 = var8.iterator();

         while (var9.hasNext()) {
            Class219 var10 = (Class219)var9.next();
            if (var10 instanceof Class249) {
               var9.remove();
            }
         }

         Class249 var12 = new Class249(var11);
         var12.field906 = (Class2868<Class1019>)var1;
         var11.addLayer(var12);
         return (Class9492)var11;
      } else {
         Config.method26811("Not a RenderSheep: " + var6);
         return null;
      }
   }
}
