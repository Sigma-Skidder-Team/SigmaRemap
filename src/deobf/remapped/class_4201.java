package remapped;

import com.google.common.collect.ImmutableList;
import java.util.List;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class class_4201 implements class_6406 {
   private final class_200 field_20432;
   private ITextComponent field_20430;
   private List<class_7107> field_20427;
   private long field_20428;
   private boolean field_20431;
   private final int field_20433;

   public class_4201(class_200 var1, ITextComponent var2, ITextComponent var3) {
      this(var1, var2, method_19554(var3), 160);
   }

   public static class_4201 method_19556(MinecraftClient var0, class_200 var1, ITextComponent var2, ITextComponent var3) {
      TextRenderer var6 = var0.textRenderer;
      List var7 = var6.method_45391(var3, 200);
      int var8 = Math.max(200, var7.stream().mapToInt(var6::method_45400).max().orElse(200));
      return new class_4201(var1, var2, var7, var8 + 30);
   }

   private class_4201(class_200 var1, ITextComponent var2, List<class_7107> var3, int var4) {
      this.field_20432 = var1;
      this.field_20430 = var2;
      this.field_20427 = var3;
      this.field_20433 = var4;
   }

   private static ImmutableList<class_7107> method_19554(ITextComponent var0) {
      return var0 != null ? ImmutableList.of(var0.func_241878_f()) : ImmutableList.of();
   }

   @Override
   public int method_29239() {
      return this.field_20433;
   }

   @Override
   public class_5068 method_29236(class_7966 var1, class_9184 var2, long var3) {
      if (this.field_20431) {
         this.field_20428 = var3;
         this.field_20431 = false;
      }

      var2.method_42327().getTextureManager().bindTexture(field_32696);
      RenderSystem.method_16404(1.0F, 1.0F, 1.0F);
      int var7 = this.method_29239();
      byte var8 = 12;
      if (var7 == 160 && this.field_20427.size() <= 1) {
         var2.method_9781(var1, 0, 0, 0, 64, var7, this.method_29238());
      } else {
         int var9 = this.method_29238() + Math.max(0, this.field_20427.size() - 1) * 12;
         byte var10 = 28;
         int var11 = Math.min(4, var9 - 28);
         this.method_19561(var1, var2, var7, 0, 0, 28);

         for (byte var12 = 28; var12 < var9 - var11; var12 += 10) {
            this.method_19561(var1, var2, var7, 16, var12, Math.min(16, var9 - var12 - var11));
         }

         this.method_19561(var1, var2, var7, 32 - var11, var9 - var11, var11);
      }

      if (this.field_20427 != null) {
         var2.method_42327().textRenderer.method_45378(var1, this.field_20430, 18.0F, 7.0F, -256);

         for (int var13 = 0; var13 < this.field_20427.size(); var13++) {
            var2.method_42327().textRenderer.method_45382(var1, this.field_20427.get(var13), 18.0F, (float)(18 + var13 * 12), -1);
         }
      } else {
         var2.method_42327().textRenderer.method_45378(var1, this.field_20430, 18.0F, 12.0F, -256);
      }

      return var3 - this.field_20428 >= 5000L ? class_5068.field_26190 : class_5068.field_26192;
   }

   private void method_19561(class_7966 var1, class_9184 var2, int var3, int var4, int var5, int var6) {
      int var9 = var4 != 0 ? 5 : 20;
      int var10 = Math.min(60, var3 - var9);
      var2.method_9781(var1, 0, var5, 0, 64 + var4, var9, var6);

      for (int var11 = var9; var11 < var3 - var10; var11 += 64) {
         var2.method_9781(var1, var11, var5, 32, 64 + var4, Math.min(64, var3 - var11 - var10), var6);
      }

      var2.method_9781(var1, var3 - var10, var5, 160 - var10, 64 + var4, var10, var6);
   }

   public void method_19557(ITextComponent var1, ITextComponent var2) {
      this.field_20430 = var1;
      this.field_20427 = method_19554(var2);
      this.field_20431 = true;
   }

   public class_200 method_19558() {
      return this.field_20432;
   }

   public static void method_19559(class_9184 var0, class_200 var1, ITextComponent var2, ITextComponent var3) {
      var0.method_42329(new class_4201(var1, var2, var3));
   }

   public static void method_19562(class_9184 var0, class_200 var1, ITextComponent var2, ITextComponent var3) {
      class_4201 var6 = var0.<class_4201>method_42328(class_4201.class, var1);
      if (var6 != null) {
         var6.method_19557(var2, var3);
      } else {
         method_19559(var0, var1, var2, var3);
      }
   }

   public static void method_19563(MinecraftClient var0, String var1) {
      method_19559(var0.method_8519(), class_200.field_670, new TranslationTextComponent("selectWorld.access_failure"), new StringTextComponent(var1));
   }

   public static void method_19560(MinecraftClient var0, String var1) {
      method_19559(var0.method_8519(), class_200.field_670, new TranslationTextComponent("selectWorld.delete_failure"), new StringTextComponent(var1));
   }

   public static void method_19555(MinecraftClient var0, String var1) {
      method_19559(var0.method_8519(), class_200.field_668, new TranslationTextComponent("pack.copyFailure"), new StringTextComponent(var1));
   }
}
