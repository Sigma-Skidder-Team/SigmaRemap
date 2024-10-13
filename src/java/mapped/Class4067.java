package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityType;

import java.util.Iterator;

public class Class4067 extends Class4057 {
   public Class4067() {
      super(EntityType.field41018, "dolphin", 0.7F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2805();
   }

   @Override
   public ModelRenderer method12823(Class2828 var1, String var2) {
      if (var1 instanceof Class2805) {
         Class2805 var5 = (Class2805)var1;
         Iterator var6 = var5.method11015().iterator();
         ModelRenderer var7 = Class8542.method30390(var6, 0);
         if (var7 != null) {
            if (!var2.equals("body")) {
               if (!var2.equals("back_fin")) {
                  if (!var2.equals("left_fin")) {
                     if (!var2.equals("right_fin")) {
                        if (!var2.equals("tail")) {
                           if (!var2.equals("tail_fin")) {
                              return !var2.equals("head") ? null : var7.method22692(4);
                           } else {
                              return var7.method22692(3).method22692(0);
                           }
                        } else {
                           return var7.method22692(3);
                        }
                     } else {
                        return var7.method22692(2);
                     }
                  } else {
                     return var7.method22692(1);
                  }
               } else {
                  return var7.method22692(0);
               }
            } else {
               return var7;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{"body", "back_fin", "left_fin", "right_fin", "tail", "tail_fin", "head"};
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      EntityRendererManager var5 = Minecraft.getInstance().getRenderManager();
      Class5654 var6 = new Class5654(var5);
      var6.entityModel = (Class2805<Class1048>)var1;
      var6.shadowSize = var2;
      return (Class9492)var6;
   }
}
