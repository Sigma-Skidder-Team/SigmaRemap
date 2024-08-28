package mapped;

import com.mentalfrostbyte.jello.unmapped.Class8603;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.util.HashMap;
import java.util.UUID;

public class Class5743<T extends Entity> extends Class5712<AbstractClientPlayerEntity, Class2894<AbstractClientPlayerEntity>> {
   public static HashMap<UUID, ResourceLocation> field25166 = new HashMap<UUID, ResourceLocation>();

   public Class5743(Class8853 var1) {
      this(var1, false);
   }

   public Class5743(Class8853 var1, boolean var2) {
      super(var1, new Class2894<AbstractClientPlayerEntity>(0.0F, var2), 0.5F);
      this.method17880(new Class235<AbstractClientPlayerEntity, Class2894<AbstractClientPlayerEntity>>(this));
   }

   public void method17924(AbstractClientPlayerEntity var1, float var2, float var3, Class9332 var4, Class7733 var5, int var6, float var7, float var8) {
      Class2797 var11 = this.field25086;
      var11.method11009(false);
      var11.field17432.field31039 = true;
      float var12 = var1.field4967;
      float var13 = var1.field5032;
      float var14 = Class8603.method30791(var8, 0.15, 0.84, 0.34, 1.0);
      float var15 = ((float) Minecraft.getInstance().field1339.field5055 + Minecraft.getInstance().method1562()) * 3.0F + var14 * 160.0F;
      var1.field4967 = var15;
      var1.field5032 = -10.0F;
      this.field25096 = var7;
      super.method17853(var1, var2, 1.0F, var4, var5, var6);
      var1.field4967 = var12;
      var1.field5032 = var13;
   }

   public Vector3d method17867(AbstractClientPlayerEntity var1, float var2) {
      return super.method17867(var1, var2);
   }

   public ResourceLocation method17843(AbstractClientPlayerEntity var1) {
      boolean var4 = field25166.containsKey(var1.method2906().getId()) && field25166.get(var1.method2906().getId()).equals(new ResourceLocation(""));
      if (!var4 && field25166.containsKey(var1.method2906().getId())) {
         return field25166.get(var1.method2906().getId());
      } else {
         if (!var1.method5368() && !var4) {
            field25166.put(var1.method2906().getId(), new ResourceLocation(""));
            Minecraft.getInstance().method1549().method38346(var1.method2906(), (var1x, var2, var3) -> {
               if (var1x == Type.SKIN) {
                  field25166.put(var1.method2906().getId(), var2);
               }
            }, true);
         }

         return var1.method5371();
      }
   }
}
