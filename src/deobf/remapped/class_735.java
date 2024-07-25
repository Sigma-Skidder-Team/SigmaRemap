package remapped;

import java.util.Iterator;
import java.util.List;

public class class_735 extends class_7398 {
   public class_735() {
      super(class_6629.field_34321, "sheep_wool", 0.7F);
   }

   @Override
   public class_9873 method_12295() {
      return new class_1286();
   }

   @Override
   public class_8599 method_12293(class_9873 var1, float var2) {
      EntityRenderDispatcher var5 = MinecraftClient.getInstance().method_8587();
      Object var6 = var5.method_28130().get(class_6629.field_34321);
      if (var6 instanceof class_5058) {
         if (((class_7067)var6).method_32557() == null) {
            class_5058 var7 = new class_5058(var5);
            var7.field_32487 = new class_8216<class_8031>();
            var7.field_36492 = 0.7F;
            var6 = var7;
         }

         class_5058 var11 = (class_5058)var6;
         List var8 = var11.method_29102();
         Iterator var9 = var8.iterator();

         while (var9.hasNext()) {
            class_4171 var10 = (class_4171)var9.next();
            if (var10 instanceof class_1506) {
               var9.remove();
            }
         }

         class_1506 var12 = new class_1506(var11);
         var12.field_7980 = (class_1286<class_8031>)var1;
         var11.method_29100(var12);
         return (class_8599)var11;
      } else {
         Config.method_14317("Not a RenderSheep: " + var6);
         return null;
      }
   }
}
