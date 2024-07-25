package remapped;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;
import net.minecraft.util.text.ITextComponent;

public class class_7100 implements class_7912 {
   private static String[] field_36622;
   private final class_3903 field_36624;
   private final Identifier field_36623;
   private final List<class_753> field_36621;

   public class_7100(class_9586 var1, class_3903 var2) {
      this.field_36625 = var1;
      this.field_36624 = var2;
      this.field_36621 = Lists.newArrayList();

      for (String var6 : var2.method_23378()) {
         class_753 var7 = MinecraftClient.getInstance().method_8614().method_4799(var6);
         if (var7 != null) {
            this.field_36621.add(var7);
         }
      }

      if (!this.field_36621.isEmpty()) {
         String var8 = this.field_36621.get(new Random().nextInt(this.field_36621.size())).method_3392().getName();
         this.field_36623 = class_9716.method_44890(var8);
         class_9716.method_44882(this.field_36623, var8);
      } else {
         this.field_36623 = class_1512.method_6922();
      }
   }

   @Override
   public void method_35792(class_3421 var1) {
      var1.method_15807(new class_7817(this.field_36621));
   }

   @Override
   public ITextComponent method_35794() {
      return this.field_36624.method_18066();
   }

   @Override
   public void method_35795(class_7966 var1, float var2, int var3) {
      Integer var6 = this.field_36624.method_23381().getColor();
      if (var6 != null) {
         float var7 = (float)(var6 >> 16 & 0xFF) / 255.0F;
         float var8 = (float)(var6 >> 8 & 0xFF) / 255.0F;
         float var9 = (float)(var6 & 0xFF) / 255.0F;
         AbstractGui.method_9774(var1, 1, 1, 15, 15, class_9299.method_42796(var7 * var2, var8 * var2, var9 * var2) | var3 << 24);
      }

      MinecraftClient.getInstance().getTextureManager().bindTexture(this.field_36623);
      RenderSystem.color4f(var2, var2, var2, (float)var3 / 255.0F);
      AbstractGui.method_9780(var1, 2, 2, 12, 12, 8.0F, 8.0F, 8, 8, 64, 64);
      AbstractGui.method_9780(var1, 2, 2, 12, 12, 40.0F, 8.0F, 8, 8, 64, 64);
   }

   @Override
   public boolean method_35793() {
      return !this.field_36621.isEmpty();
   }
}
