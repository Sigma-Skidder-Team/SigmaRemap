package mapped;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import net.minecraft.client.gui.DialogTexts;
import net.minecraft.util.text.*;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$Action;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;

public class Class870 extends Screen {
   public static final Class7502 field4819 = new Class7503();
   public static final ResourceLocation field4820 = new ResourceLocation("textures/gui/book.png");
   private Class7502 field4821;
   private int field4822;
   private List<Class9125> field4823 = Collections.<Class9125>emptyList();
   private int field4824 = -1;
   private ITextComponent field4825 = StringTextComponent.EMPTY;
   private Class1209 field4826;
   private Class1209 field4827;
   private final boolean field4828;

   public Class870(Class7502 var1) {
      this(var1, true);
   }

   public Class870() {
      this(field4819, false);
   }

   private Class870(Class7502 var1, boolean var2) {
      super(NarratorChatListener.field29300);
      this.field4821 = var1;
      this.field4828 = var2;
   }

   public void method2690(Class7502 var1) {
      this.field4821 = var1;
      this.field4822 = MathHelper.method37775(this.field4822, 0, var1.method24459());
      this.method2694();
      this.field4824 = -1;
   }

   public boolean method2691(int var1) {
      int var4 = MathHelper.method37775(var1, 0, this.field4821.method24459() - 1);
      if (var4 == this.field4822) {
         return false;
      } else {
         this.field4822 = var4;
         this.method2694();
         this.field4824 = -1;
         return true;
      }
   }

   public boolean method2682(int var1) {
      return this.method2691(var1);
   }

   @Override
   public void method1921() {
      this.method2679();
      this.method2692();
   }

   public void method2679() {
      this.<Class1206>method2455(new Class1206(this.field4564 / 2 - 100, 196, 200, 20, DialogTexts.field30658, var1 -> this.field4562.displayGuiScreen((Screen)null)));
   }

   public void method2692() {
      int var3 = (this.field4564 - 192) / 2;
      this.field4826 = this.<Class1209>method2455(new Class1209(var3 + 116, 159, true, var1 -> this.method2681(), this.field4828));
      this.field4827 = this.<Class1209>method2455(new Class1209(var3 + 43, 159, false, var1 -> this.method2680(), this.field4828));
      this.method2694();
   }

   private int method2693() {
      return this.field4821.method24459();
   }

   public void method2680() {
      if (this.field4822 > 0) {
         this.field4822--;
      }

      this.method2694();
   }

   public void method2681() {
      if (this.field4822 < this.method2693() - 1) {
         this.field4822++;
      }

      this.method2694();
   }

   private void method2694() {
      this.field4826.field6483 = this.field4822 < this.method2693() - 1;
      this.field4827.field6483 = this.field4822 > 0;
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (super.method1920(var1, var2, var3)) {
         return true;
      } else {
         switch (var1) {
            case 266:
               this.field4827.method5759();
               return true;
            case 267:
               this.field4826.method5759();
               return true;
            default:
               return false;
         }
      }
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      RenderSystem.method27889(1.0F, 1.0F, 1.0F, 1.0F);
      this.field4562.getTextureManager().bindTexture(field4820);
      int var7 = (this.field4564 - 192) / 2;
      this.method5696(var1, var7, 2, 0, 0, 192, 192);
      if (this.field4824 != this.field4822) {
         ITextProperties var9 = this.field4821.method24461(this.field4822);
         this.field4823 = this.field4568.method38828(var9, 114);
         this.field4825 = new TranslationTextComponent("book.pageIndicator", this.field4822 + 1, Math.max(this.method2693(), 1));
      }

      this.field4824 = this.field4822;
      int var13 = this.field4568.method38821(this.field4825);
      this.field4568.method38805(var1, this.field4825, (float)(var7 - var13 + 192 - 44), 18.0F, 0);
      int var10 = Math.min(14, this.field4823.size());

      for (int var11 = 0; var11 < var10; var11++) {
         Class9125 var12 = this.field4823.get(var11);
         this.field4568.method38804(var1, var12, (float)(var7 + 36), (float)(32 + var11 * 9), 0);
      }

      Style var14 = this.method2695((double)var2, (double)var3);
      if (var14 != null) {
         this.method2462(var1, var14, var2, var3);
      }

      super.method1923(var1, var2, var3, var4);
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (var5 == 0) {
         Style var8 = this.method2695(var1, var3);
         if (var8 != null && this.method2464(var8)) {
            return true;
         }
      }

      return super.method1958(var1, var3, var5);
   }

   @Override
   public boolean method2464(Style var1) {
      ClickEvent var4 = var1.getClickEvent();
      if (var4 == null) {
         return false;
      } else if (var4.getAction() == ClickEvent$Action.CHANGE_PAGE) {
         String var8 = var4.getValue();

         try {
            int var6 = Integer.parseInt(var8) - 1;
            return this.method2682(var6);
         } catch (Exception var7) {
            return false;
         }
      } else {
         boolean var5 = super.method2464(var1);
         if (var5 && var4.getAction() == ClickEvent$Action.RUN_COMMAND) {
            this.field4562.displayGuiScreen((Screen)null);
         }

         return var5;
      }
   }

   @Nullable
   public Style method2695(double var1, double var3) {
      if (!this.field4823.isEmpty()) {
         int var7 = MathHelper.floor(var1 - (double)((this.field4564 - 192) / 2) - 36.0);
         int var8 = MathHelper.floor(var3 - 2.0 - 30.0);
         if (var7 >= 0 && var8 >= 0) {
            int var9 = Math.min(14, this.field4823.size());
            if (var7 <= 114 && var8 < 9 * var9 + var9) {
               int var10 = var8 / 9;
               if (var10 >= 0 && var10 < this.field4823.size()) {
                  Class9125 var11 = this.field4823.get(var10);
                  return this.field4562.fontRenderer.method38830().func_243239_a(var11, var7);
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

   public static List<String> method2696(CompoundNBT var0) {
      ListNBT var3 = var0.method131("pages", 8).method79();
      Builder var4 = ImmutableList.builder();

      for (int var5 = 0; var5 < var3.size(); var5++) {
         var4.add(var3.method160(var5));
      }

      return var4.build();
   }
}
