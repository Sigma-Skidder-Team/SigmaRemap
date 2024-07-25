package remapped;

import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import net.minecraft.util.text.StringTextComponent;

public class class_2285 extends class_7114 implements class_2855<class_8137> {
   private static String[] field_11416;
   private final class_8932<?> field_11414;
   private final boolean field_11413;
   public final List<class_6061> field_11417;

   public class_2285(int var1, int var2, class_8932<?> var3, boolean var4, boolean var5) {
      super(var2, var3, 200, 20, StringTextComponent.EMPTY);
      this.field_11415 = var1;
      this.field_11417 = Lists.newArrayList();
      this.field_36671 = 24;
      this.field_36681 = 24;
      this.field_11414 = var4;
      this.field_11413 = var5;
      this.method_10532(var4);
   }

   public void method_10532(class_8932<?> var1) {
      this.method_12972(3, 3, -1, var1, var1.method_41043().iterator(), 0);
   }

   @Override
   public void method_12971(Iterator<class_8137> var1, int var2, int var3, int var4, int var5) {
      ItemStack[] var8 = ((class_8137)var1.next()).method_37020();
      if (var8.length != 0) {
         this.field_11417.add(new class_6061(this, 3 + var5 * 7, 3 + var4 * 7, var8));
      }
   }

   @Override
   public void method_32686(class_7966 var1, int var2, int var3, float var4) {
      RenderSystem.enableAlphaTest();
      class_9205.method_42467(this.field_11415).method_8577().method_35674(class_9205.method_42470());
      short var7 = 152;
      if (!this.field_11413) {
         var7 += 26;
      }

      int var8 = !class_9205.method_42472(this.field_11415) ? 78 : 130;
      if (this.method_32703()) {
         var8 += 26;
      }

      this.method_9781(var1, this.field_36670, this.field_36674, var7, var8, this.field_36671, this.field_36681);

      for (class_6061 var10 : this.field_11417) {
         RenderSystem.method_16438();
         float var11 = 0.42F;
         int var12 = (int)((float)(this.field_36670 + var10.field_31001) / 0.42F - 3.0F);
         int var13 = (int)((float)(this.field_36674 + var10.field_30998) / 0.42F - 3.0F);
         RenderSystem.method_16403(0.42F, 0.42F, 1.0F);
         class_9205.method_42467(this.field_11415)
            .method_8511()
            .method_40274(
               var10.field_31002[MathHelper.floor(class_9205.method_42473(this.field_11415) / 30.0F) % var10.field_31002.length], var12, var13
            );
         RenderSystem.method_16489();
      }

      RenderSystem.method_16458();
   }
}
