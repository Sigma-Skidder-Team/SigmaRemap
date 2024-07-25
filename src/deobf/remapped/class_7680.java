package remapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextProperties;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$class_47;

public class class_7680 extends class_266 {
   public static final class_8668 field_39032 = new class_9531();
   public static final class_4639 field_39030 = new class_4639("textures/gui/book.png");
   private class_8668 field_39029;
   private int field_39035;
   private List<class_7107> field_39033 = Collections.<class_7107>emptyList();
   private int field_39031 = -1;
   private ITextComponent field_39027 = StringTextComponent.EMPTY;
   private class_6423 field_39037;
   private class_6423 field_39028;
   private final boolean field_39034;

   public class_7680(class_8668 var1) {
      this(var1, true);
   }

   public class_7680() {
      this(field_39032, false);
   }

   private class_7680(class_8668 var1, boolean var2) {
      super(class_7542.field_38486);
      this.field_39029 = var1;
      this.field_39034 = var2;
   }

   public void method_34809(class_8668 var1) {
      this.field_39029 = var1;
      this.field_39035 = class_9299.method_42829(this.field_39035, 0, var1.method_39737());
      this.method_34803();
      this.field_39031 = -1;
   }

   public boolean method_34804(int var1) {
      int var4 = class_9299.method_42829(var1, 0, this.field_39029.method_39737() - 1);
      if (var4 == this.field_39035) {
         return false;
      } else {
         this.field_39035 = var4;
         this.method_34803();
         this.field_39031 = -1;
         return true;
      }
   }

   public boolean method_34808(int var1) {
      return this.method_34804(var1);
   }

   @Override
   public void method_1163() {
      this.method_34807();
      this.method_34811();
   }

   public void method_34807() {
      this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 100, 196, 200, 20, class_1402.field_7625, var1 -> this.field_943.method_8609((class_266)null))
      );
   }

   public void method_34811() {
      int var3 = (this.field_941 - 192) / 2;
      byte var4 = 2;
      this.field_39037 = this.<class_6423>method_1186(new class_6423(var3 + 116, 159, true, var1 -> this.method_34802(), this.field_39034));
      this.field_39028 = this.<class_6423>method_1186(new class_6423(var3 + 43, 159, false, var1 -> this.method_34806(), this.field_39034));
      this.method_34803();
   }

   private int method_34810() {
      return this.field_39029.method_39737();
   }

   public void method_34806() {
      if (this.field_39035 > 0) {
         this.field_39035--;
      }

      this.method_34803();
   }

   public void method_34802() {
      if (this.field_39035 < this.method_34810() - 1) {
         this.field_39035++;
      }

      this.method_34803();
   }

   private void method_34803() {
      this.field_39037.field_36677 = this.field_39035 < this.method_34810() - 1;
      this.field_39028.field_36677 = this.field_39035 > 0;
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (super.method_26946(var1, var2, var3)) {
         return true;
      } else {
         switch (var1) {
            case 266:
               this.field_39028.method_33827();
               return true;
            case 267:
               this.field_39037.method_33827();
               return true;
            default:
               return false;
         }
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      class_3542.method_16480(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_943.method_8577().method_35674(field_39030);
      int var7 = (this.field_941 - 192) / 2;
      byte var8 = 2;
      this.method_9781(var1, var7, 2, 0, 0, 192, 192);
      if (this.field_39031 != this.field_39035) {
         ITextProperties var9 = this.field_39029.method_39735(this.field_39035);
         this.field_39033 = this.field_948.method_45391(var9, 114);
         this.field_39027 = new TranslationTextComponent("book.pageIndicator", this.field_39035 + 1, Math.max(this.method_34810(), 1));
      }

      this.field_39031 = this.field_39035;
      int var13 = this.field_948.method_45379(this.field_39027);
      this.field_948.method_45378(var1, this.field_39027, (float)(var7 - var13 + 192 - 44), 18.0F, 0);
      int var10 = Math.min(14, this.field_39033.size());

      for (int var11 = 0; var11 < var10; var11++) {
         class_7107 var12 = this.field_39033.get(var11);
         this.field_948.method_45382(var1, var12, (float)(var7 + 36), (float)(32 + var11 * 9), 0);
      }

      Style var14 = this.method_34812((double)var2, (double)var3);
      if (var14 != null) {
         this.method_1180(var1, var14, var2, var3);
      }

      super.method_6767(var1, var2, var3, var4);
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (var5 == 0) {
         Style var8 = this.method_34812(var1, var3);
         if (var8 != null && this.method_1187(var8)) {
            return true;
         }
      }

      return super.method_26940(var1, var3, var5);
   }

   @Override
   public boolean method_1187(Style var1) {
      ClickEvent var4 = var1.getClickEvent();
      if (var4 == null) {
         return false;
      } else if (var4.getAction() == ClickEvent$class_47.CHANGE_PAGE) {
         String var8 = var4.getValue();

         try {
            int var6 = Integer.parseInt(var8) - 1;
            return this.method_34808(var6);
         } catch (Exception var7) {
            return false;
         }
      } else {
         boolean var5 = super.method_1187(var1);
         if (var5 && var4.getAction() == ClickEvent$class_47.RUN_COMMAND) {
            this.field_943.method_8609((class_266)null);
         }

         return var5;
      }
   }

   @Nullable
   public Style method_34812(double var1, double var3) {
      if (!this.field_39033.isEmpty()) {
         int var7 = class_9299.method_42847(var1 - (double)((this.field_941 - 192) / 2) - 36.0);
         int var8 = class_9299.method_42847(var3 - 2.0 - 30.0);
         if (var7 >= 0 && var8 >= 0) {
            int var9 = Math.min(14, this.field_39033.size());
            if (var7 <= 114 && var8 < 9 * var9 + var9) {
               int var10 = var8 / 9;
               if (var10 >= 0 && var10 < this.field_39033.size()) {
                  class_7107 var11 = this.field_39033.get(var10);
                  return this.field_943.textRenderer.method_45381().func_243239_a(var11, var7);
               } else {
                  return null;
               }
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static List<String> method_34805(class_5734 var0) {
      class_3416 var3 = var0.method_25927("pages", 8).method_15768();
      Builder var4 = ImmutableList.builder();

      for (int var5 = 0; var5 < var3.size(); var5++) {
         var4.add(var3.method_15770(var5));
      }

      return var4.build();
   }
}
