package mapped;

import net.minecraft.util.text.TextFormatting;

public class Class5656 extends Class5651<Class1094, Class2876<Class1094>> {
   private static final ResourceLocation field25010 = new ResourceLocation("textures/entity/rabbit/brown.png");
   private static final ResourceLocation field25011 = new ResourceLocation("textures/entity/rabbit/white.png");
   private static final ResourceLocation field25012 = new ResourceLocation("textures/entity/rabbit/black.png");
   private static final ResourceLocation field25013 = new ResourceLocation("textures/entity/rabbit/gold.png");
   private static final ResourceLocation field25014 = new ResourceLocation("textures/entity/rabbit/salt.png");
   private static final ResourceLocation field25015 = new ResourceLocation("textures/entity/rabbit/white_splotched.png");
   private static final ResourceLocation field25016 = new ResourceLocation("textures/entity/rabbit/toast.png");
   private static final ResourceLocation field25017 = new ResourceLocation("textures/entity/rabbit/caerbannog.png");

   public Class5656(EntityRendererManager var1) {
      super(var1, new Class2876<Class1094>(), 0.3F);
   }

   public ResourceLocation method17843(Class1094 var1) {
      String var4 = TextFormatting.getTextWithoutFormattingCodes(var1.getName().getString());
      if (var4 != null && "Toast".equals(var4)) {
         return field25016;
      } else {
         switch (var1.method5114()) {
            case 0:
            default:
               return field25010;
            case 1:
               return field25011;
            case 2:
               return field25012;
            case 3:
               return field25015;
            case 4:
               return field25013;
            case 5:
               return field25014;
            case 99:
               return field25017;
         }
      }
   }
}
