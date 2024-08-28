package mapped;

import com.google.common.collect.Lists;
import net.minecraft.util.text.StringTextComponent;

import java.util.Iterator;
import java.util.List;

public class Class1251 extends Class1197 implements Class1253<Class120> {
   private static String[] field6623;
   private final Class4843<?> field6624;
   private final boolean field6625;
   public final List<Class8834> field6626;
   public final Class1263 field6627;

   public Class1251(Class1263 var0, int var1, int var2, Class4843<?> var3, boolean var4) {
      super(var1, var2, 200, 20, StringTextComponent.EMPTY);
      this.field6627 = var0;
      this.field6626 = Lists.newArrayList();
      this.field6475 = 24;
      this.field6476 = 24;
      this.field6624 = var3;
      this.field6625 = var4;
      this.method5829(var3);
   }

   public void method5829(Class4843<?> var1) {
      this.method5832(3, 3, -1, var1, var1.method14969().iterator(), 0);
   }

   @Override
   public void method5830(Iterator<Class120> var1, int var2, int var3, int var4, int var5) {
      Class8848[] var8 = ((Class120)var1.next()).method332();
      if (var8.length != 0) {
         this.field6626.add(new Class8834(this, 3 + var5 * 7, 3 + var4 * 7, var8));
      }
   }

   @Override
   public void method5655(Class9332 var1, int var2, int var3, float var4) {
      RenderSystem.disableAlphaTest();
      Class1263.method5908(this.field6627).getTextureManager().bindTexture(Class1263.method5907());
      short var7 = 152;
      if (!this.field6625) {
         var7 += 26;
      }

      int var8 = !Class1263.method5909(this.field6627) ? 78 : 130;
      if (this.method5737()) {
         var8 += 26;
      }

      this.method5696(var1, this.field6477, this.field6478, var7, var8, this.field6475, this.field6476);

      for (Class8834 var10 : this.field6626) {
         RenderSystem.pushMatrix();
         float var11 = 0.42F;
         int var12 = (int)((float)(this.field6477 + var10.field39895) / 0.42F - 3.0F);
         int var13 = (int)((float)(this.field6478 + var10.field39896) / 0.42F - 3.0F);
         RenderSystem.scalef(0.42F, 0.42F, 1.0F);
         Class1263.method5908(this.field6627)
            .method1555()
            .method793(var10.field39894[Class9679.method37767(Class1263.method5910(this.field6627) / 30.0F) % var10.field39894.length], var12, var13);
         RenderSystem.popMatrix();
      }

      RenderSystem.method27817();
   }

   // $VF: synthetic method
   public static Class4843 method5831(Class1251 var0) {
      return var0.field6624;
   }
}
