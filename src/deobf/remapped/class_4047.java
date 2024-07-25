package remapped;

import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import net.minecraft.util.text.CharacterManager;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.mutable.MutableBoolean;
import org.apache.commons.lang3.mutable.MutableInt;

public class class_4047 extends Screen {
   private static final ITextComponent field_19664 = new TranslationTextComponent("book.editTitle");
   private static final ITextComponent field_19663 = new TranslationTextComponent("book.finalizeWarning");
   private static final class_7107 field_19667 = class_7107.method_32662(field_19658[8], Style.EMPTY.setFormatting(TextFormatting.BLACK));
   private static final class_7107 field_19679 = class_7107.method_32662(field_19658[8], Style.EMPTY.setFormatting(TextFormatting.GRAY));
   private final PlayerEntity field_19681;
   private final ItemStack field_19670;
   private boolean field_19673;
   private boolean field_19676;
   private int field_19678;
   private int field_19662;
   private final List<String> field_19660 = Lists.newArrayList();
   private String field_19680 = "";
   private final class_6935 field_19674 = new class_6935(
      this::method_18665,
      this::method_18666,
      this::method_18672,
      this::method_18668,
      var1x -> var1x.length() < 1024 && this.field_948.method_45387(var1x, 114) <= 128
   );
   private final class_6935 field_19668 = new class_6935(
      () -> this.field_19680, var1x -> this.field_19680 = var1x, this::method_18672, this::method_18668, var0 -> var0.length() < 16
   );
   private long field_19655;
   private int field_19666 = -1;
   private class_6423 field_19677;
   private class_6423 field_19659;
   private class_9521 field_19675;
   private class_9521 field_19661;
   private class_9521 field_19656;
   private class_9521 field_19671;
   private final Hand field_19669;
   private class_4475 field_19657 = class_4475.method_20762();
   private ITextComponent field_19665 = StringTextComponent.EMPTY;
   private final ITextComponent field_19672;

   public class_4047(PlayerEntity var1, ItemStack var2, Hand var3) {
      super(NarratorChatListener.field_38486);
      this.field_19681 = var1;
      this.field_19670 = var2;
      this.field_19669 = var3;
      CompoundNBT var6 = var2.method_27990();
      if (var6 != null) {
         class_3416 var7 = var6.method_25927("pages", 8).method_15768();

         for (int var8 = 0; var8 < var7.size(); var8++) {
            this.field_19660.add(var7.method_15770(var8));
         }
      }

      if (this.field_19660.isEmpty()) {
         this.field_19660.add("");
      }

      this.field_19672 = new TranslationTextComponent("book.byAuthor", var1.method_45509()).mergeStyle(TextFormatting.DARK_GRAY);
   }

   private void method_18668(String var1) {
      if (this.field_943 != null) {
         class_6935.method_31728(this.field_943, var1);
      }
   }

   private String method_18672() {
      return this.field_943 == null ? "" : class_6935.method_31717(this.field_943);
   }

   private int method_18645() {
      return this.field_19660.size();
   }

   @Override
   public void method_5312() {
      super.method_5312();
      this.field_19678++;
   }

   @Override
   public void method_1163() {
      this.method_18669();
      this.field_943.field_9600.method_38887(true);
      this.field_19661 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 100, 196, 98, 20, new TranslationTextComponent("book.signButton"), var1 -> {
            this.field_19676 = true;
            this.method_18657();
         })
      );
      this.field_19675 = this.<class_9521>method_1186(new class_9521(this.field_941 / 2 + 2, 196, 98, 20, class_1402.field_7625, var1 -> {
         this.field_943.method_8609((Screen)null);
         this.method_18649(false);
      }));
      this.field_19656 = this.<class_9521>method_1186(
         new class_9521(this.field_941 / 2 - 100, 196, 98, 20, new TranslationTextComponent("book.finalizeButton"), var1 -> {
            if (this.field_19676) {
               this.method_18649(true);
               this.field_943.method_8609((Screen)null);
            }
         })
      );
      this.field_19671 = this.<class_9521>method_1186(new class_9521(this.field_941 / 2 + 2, 196, 98, 20, class_1402.field_7633, var1 -> {
         if (this.field_19676) {
            this.field_19676 = false;
         }

         this.method_18657();
      }));
      int var3 = (this.field_941 - 192) / 2;
      byte var4 = 2;
      this.field_19677 = this.<class_6423>method_1186(new class_6423(var3 + 116, 159, true, var1 -> this.method_18663(), true));
      this.field_19659 = this.<class_6423>method_1186(new class_6423(var3 + 43, 159, false, var1 -> this.method_18650(), true));
      this.method_18657();
   }

   private void method_18650() {
      if (this.field_19662 > 0) {
         this.field_19662--;
      }

      this.method_18657();
      this.method_18643();
   }

   private void method_18663() {
      if (this.field_19662 >= this.method_18645() - 1) {
         this.method_18644();
         if (this.field_19662 < this.method_18645() - 1) {
            this.field_19662++;
         }
      } else {
         this.field_19662++;
      }

      this.method_18657();
      this.method_18643();
   }

   @Override
   public void method_1162() {
      this.field_943.field_9600.method_38887(false);
   }

   private void method_18657() {
      this.field_19659.field_36677 = !this.field_19676 && this.field_19662 > 0;
      this.field_19677.field_36677 = !this.field_19676;
      this.field_19675.field_36677 = !this.field_19676;
      this.field_19661.field_36677 = !this.field_19676;
      this.field_19671.field_36677 = this.field_19676;
      this.field_19656.field_36677 = this.field_19676;
      this.field_19656.field_36675 = !this.field_19680.trim().isEmpty();
   }

   private void method_18652() {
      ListIterator var3 = this.field_19660.listIterator(this.field_19660.size());

      while (var3.hasPrevious() && ((String)var3.previous()).isEmpty()) {
         var3.remove();
      }
   }

   private void method_18649(boolean var1) {
      if (this.field_19673) {
         this.method_18652();
         class_3416 var4 = new class_3416();
         this.field_19660.stream().<class_473>map(class_473::method_2261).forEach(var4::add);
         if (!this.field_19660.isEmpty()) {
            this.field_19670.method_27954("pages", var4);
         }

         if (var1) {
            this.field_19670.method_27954("author", class_473.method_2261(this.field_19681.method_3247().getName()));
            this.field_19670.method_27954("title", class_473.method_2261(this.field_19680.trim()));
         }

         int var5 = this.field_19669 != Hand.MAIN_HAND ? 40 : this.field_19681.inventory.field_36404;
         this.field_943.method_8614().sendPacket(new class_703(this.field_19670, var1, var5));
      }
   }

   private void method_18644() {
      if (this.method_18645() < 100) {
         this.field_19660.add("");
         this.field_19673 = true;
      }
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (!super.method_26946(var1, var2, var3)) {
         if (!this.field_19676) {
            boolean var6 = this.method_18667(var1, var2, var3);
            if (!var6) {
               return false;
            } else {
               this.method_18669();
               return true;
            }
         } else {
            return this.method_18654(var1, var2, var3);
         }
      } else {
         return true;
      }
   }

   @Override
   public boolean method_26938(char var1, int var2) {
      if (!super.method_26938(var1, var2)) {
         if (!this.field_19676) {
            if (!class_7665.method_34675(var1)) {
               return false;
            } else {
               this.field_19674.method_31705(Character.toString(var1));
               this.method_18669();
               return true;
            }
         } else {
            boolean var5 = this.field_19668.method_31714(var1);
            if (!var5) {
               return false;
            } else {
               this.method_18657();
               this.field_19673 = true;
               return true;
            }
         }
      } else {
         return true;
      }
   }

   private boolean method_18667(int var1, int var2, int var3) {
      if (Screen.method_1174(var1)) {
         this.field_19674.method_31724();
         return true;
      } else if (Screen.method_1182(var1)) {
         this.field_19674.method_31707();
         return true;
      } else if (Screen.method_1173(var1)) {
         this.field_19674.method_31727();
         return true;
      } else if (Screen.method_1166(var1)) {
         this.field_19674.method_31709();
         return true;
      } else {
         switch (var1) {
            case 257:
            case 335:
               this.field_19674.method_31705("\n");
               return true;
            case 259:
               this.field_19674.method_31726(-1);
               return true;
            case 261:
               this.field_19674.method_31726(1);
               return true;
            case 262:
               this.field_19674.method_31706(1, Screen.method_1190());
               return true;
            case 263:
               this.field_19674.method_31706(-1, Screen.method_1190());
               return true;
            case 264:
               this.method_18648();
               return true;
            case 265:
               this.method_18656();
               return true;
            case 266:
               this.field_19659.method_33827();
               return true;
            case 267:
               this.field_19677.method_33827();
               return true;
            case 268:
               this.method_18673();
               return true;
            case 269:
               this.method_18660();
               return true;
            default:
               return false;
         }
      }
   }

   private void method_18656() {
      this.method_18646(-1);
   }

   private void method_18648() {
      this.method_18646(1);
   }

   private void method_18646(int var1) {
      int var4 = this.field_19674.method_31729();
      int var5 = this.method_18670().method_20763(var4, var1);
      this.field_19674.method_31731(var5, Screen.method_1190());
   }

   private void method_18673() {
      int var3 = this.field_19674.method_31729();
      int var4 = this.method_18670().method_20768(var3);
      this.field_19674.method_31731(var4, Screen.method_1190());
   }

   private void method_18660() {
      class_4475 var3 = this.method_18670();
      int var4 = this.field_19674.method_31729();
      int var5 = var3.method_20760(var4);
      this.field_19674.method_31731(var5, Screen.method_1190());
   }

   private boolean method_18654(int var1, int var2, int var3) {
      switch (var1) {
         case 257:
         case 335:
            if (!this.field_19680.isEmpty()) {
               this.method_18649(true);
               this.field_943.method_8609((Screen)null);
            }

            return true;
         case 259:
            this.field_19668.method_31726(-1);
            this.method_18657();
            this.field_19673 = true;
            return true;
         default:
            return false;
      }
   }

   private String method_18665() {
      return this.field_19662 >= 0 && this.field_19662 < this.field_19660.size() ? this.field_19660.get(this.field_19662) : "";
   }

   private void method_18666(String var1) {
      if (this.field_19662 >= 0 && this.field_19662 < this.field_19660.size()) {
         this.field_19660.set(this.field_19662, var1);
         this.field_19673 = true;
         this.method_18669();
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      this.method_41180((class_5888)null);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.field_943.getTextureManager().bindTexture(class_7680.field_39030);
      int var7 = (this.field_941 - 192) / 2;
      byte var8 = 2;
      this.method_9781(var1, var7, 2, 0, 0, 192, 192);
      if (!this.field_19676) {
         int var9 = this.field_948.method_45379(this.field_19665);
         this.field_948.method_45378(var1, this.field_19665, (float)(var7 - var9 + 192 - 44), 18.0F, 0);
         class_4475 var10 = this.method_18670();

         for (class_3520 var14 : class_4475.method_20764(var10)) {
            this.field_948
               .method_45378(var1, class_3520.method_16245(var14), (float)class_3520.method_16248(var14), (float)class_3520.method_16250(var14), -16777216);
         }

         this.method_18647(class_4475.method_20765(var10));
         this.method_18659(var1, class_4475.method_20759(var10), class_4475.method_20766(var10));
      } else {
         boolean var15 = this.field_19678 / 6 % 2 == 0;
         class_7107 var16 = class_7107.method_32659(class_7107.method_32662(this.field_19680, Style.EMPTY), !var15 ? field_19679 : field_19667);
         int var17 = this.field_948.method_45379(field_19664);
         this.field_948.method_45378(var1, field_19664, (float)(var7 + 36 + (114 - var17) / 2), 34.0F, 0);
         int var18 = this.field_948.method_45400(var16);
         this.field_948.method_45382(var1, var16, (float)(var7 + 36 + (114 - var18) / 2), 50.0F, 0);
         int var19 = this.field_948.method_45379(this.field_19672);
         this.field_948.method_45378(var1, this.field_19672, (float)(var7 + 36 + (114 - var19) / 2), 60.0F, 0);
         this.field_948.method_45407(field_19663, var7 + 36, 82, 114, 0);
      }

      super.method_6767(var1, var2, var3, var4);
   }

   private void method_18659(class_7966 var1, class_511 var2, boolean var3) {
      if (this.field_19678 / 6 % 2 == 0) {
         var2 = this.method_18651(var2);
         if (var3) {
            this.field_948.method_45385(var1, "_", (float)var2.field_3149, (float)var2.field_3150, 0);
         } else {
            AbstractGui.method_9774(var1, var2.field_3149, var2.field_3150 - 1, var2.field_3149 + 1, var2.field_3150 + 9, -16777216);
         }
      }
   }

   private void method_18647(class_8697[] var1) {
      class_8042 var4 = class_8042.method_36499();
      class_9633 var5 = var4.method_36501();
      RenderSystem.color4f(0.0F, 0.0F, 255.0F, 255.0F);
      RenderSystem.method_16354();
      RenderSystem.method_16466();
      RenderSystem.method_16407(class_2603.field_12871);
      var5.method_44471(7, class_7985.field_40915);

      for (class_8697 var9 : var1) {
         int var10 = var9.method_39928();
         int var11 = var9.method_39924();
         int var12 = var10 + var9.method_39926();
         int var13 = var11 + var9.method_39927();
         var5.method_35761((double)var10, (double)var13, 0.0).method_35735();
         var5.method_35761((double)var12, (double)var13, 0.0).method_35735();
         var5.method_35761((double)var12, (double)var11, 0.0).method_35735();
         var5.method_35761((double)var10, (double)var11, 0.0).method_35735();
      }

      var4.method_36500();
      RenderSystem.method_16409();
      RenderSystem.method_16432();
   }

   private class_511 method_18658(class_511 var1) {
      return new class_511(var1.field_3149 - (this.field_941 - 192) / 2 - 36, var1.field_3150 - 32);
   }

   private class_511 method_18651(class_511 var1) {
      return new class_511(var1.field_3149 + (this.field_941 - 192) / 2 + 36, var1.field_3150 + 32);
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (super.method_26940(var1, var3, var5)) {
         return true;
      } else {
         if (var5 == 0) {
            long var8 = Util.getMeasuringTimeMs();
            class_4475 var10 = this.method_18670();
            int var11 = var10.method_20761(this.field_948, this.method_18658(new class_511((int)var1, (int)var3)));
            if (var11 >= 0) {
               if (var11 != this.field_19666 || var8 - this.field_19655 >= 250L) {
                  this.field_19674.method_31731(var11, Screen.method_1190());
               } else if (this.field_19674.method_31720()) {
                  this.field_19674.method_31724();
               } else {
                  this.method_18655(var11);
               }

               this.method_18669();
            }

            this.field_19666 = var11;
            this.field_19655 = var8;
         }

         return true;
      }
   }

   private void method_18655(int var1) {
      String var4 = this.method_18665();
      this.field_19674.method_31730(CharacterManager.func_238351_a_(var4, -1, var1, false), CharacterManager.func_238351_a_(var4, 1, var1, false));
   }

   @Override
   public boolean method_26944(double var1, double var3, int var5, double var6, double var8) {
      if (!super.method_26944(var1, var3, var5, var6, var8)) {
         if (var5 == 0) {
            class_4475 var12 = this.method_18670();
            int var13 = var12.method_20761(this.field_948, this.method_18658(new class_511((int)var1, (int)var3)));
            this.field_19674.method_31731(var13, true);
            this.method_18669();
         }

         return true;
      } else {
         return true;
      }
   }

   private class_4475 method_18670() {
      if (this.field_19657 == null) {
         this.field_19657 = this.method_18662();
         this.field_19665 = new TranslationTextComponent("book.pageIndicator", this.field_19662 + 1, this.method_18645());
      }

      return this.field_19657;
   }

   private void method_18669() {
      this.field_19657 = null;
   }

   private void method_18643() {
      this.field_19674.method_31721();
      this.method_18669();
   }

   private class_4475 method_18662() {
      String var3 = this.method_18665();
      if (!var3.isEmpty()) {
         int var4 = this.field_19674.method_31729();
         int var5 = this.field_19674.method_31716();
         IntArrayList var6 = new IntArrayList();
         ArrayList var7 = Lists.newArrayList();
         MutableInt var8 = new MutableInt();
         MutableBoolean var9 = new MutableBoolean();
         CharacterManager var10 = this.field_948.method_45381();
         var10.func_238353_a_(var3, 114, Style.EMPTY, true, (var6x, var7x, var8x) -> {
            int var11x = var8.getAndIncrement();
            String var12x = var3.substring(var7x, var8x);
            var9.setValue(var12x.endsWith("\n"));
            String var13x = StringUtils.stripEnd(var12x, " \n");
            int var14x = var11x * 9;
            class_511 var15x = this.method_18651(new class_511(0, var14x));
            var6.add(var7x);
            var7.add(new class_3520(var6x, var13x, var15x.field_3149, var15x.field_3150));
         });
         int[] var11 = var6.toIntArray();
         boolean var12 = var4 == var3.length();
         class_511 var15;
         if (var12 && var9.isTrue()) {
            var15 = new class_511(0, var7.size() * 9);
         } else {
            int var13 = method_18671(var11, var4);
            int var14 = this.field_948.method_45395(var3.substring(var11[var13], var4));
            var15 = new class_511(var14, var13 * 9);
         }

         ArrayList var24 = Lists.newArrayList();
         if (var4 != var5) {
            int var25 = Math.min(var4, var5);
            int var16 = Math.max(var4, var5);
            int var17 = method_18671(var11, var25);
            int var18 = method_18671(var11, var16);
            if (var17 != var18) {
               int var19 = var17 + 1 <= var11.length ? var11[var17 + 1] : var3.length();
               var24.add(this.method_18661(var3, var10, var25, var19, var17 * 9, var11[var17]));

               for (int var20 = var17 + 1; var20 < var18; var20++) {
                  int var21 = var20 * 9;
                  String var22 = var3.substring(var11[var20], var11[var20 + 1]);
                  int var23 = (int)var10.func_238350_a_(var22);
                  var24.add(this.method_18653(new class_511(0, var21), new class_511(var23, var21 + 9)));
               }

               var24.add(this.method_18661(var3, var10, var11[var18], var16, var18 * 9, var11[var18]));
            } else {
               int var26 = var17 * 9;
               int var27 = var11[var17];
               var24.add(this.method_18661(var3, var10, var25, var16, var26, var27));
            }
         }

         return new class_4475(var3, var15, var12, var11, var7.<class_3520>toArray(new class_3520[0]), var24.<class_8697>toArray(new class_8697[0]));
      } else {
         return class_4475.method_20762();
      }
   }

   private static int method_18671(int[] var0, int var1) {
      int var4 = Arrays.binarySearch(var0, var1);
      return var4 >= 0 ? var4 : -(var4 + 2);
   }

   private class_8697 method_18661(String var1, CharacterManager var2, int var3, int var4, int var5, int var6) {
      String var9 = var1.substring(var6, var3);
      String var10 = var1.substring(var6, var4);
      class_511 var11 = new class_511((int)var2.func_238350_a_(var9), var5);
      class_511 var12 = new class_511((int)var2.func_238350_a_(var10), var5 + 9);
      return this.method_18653(var11, var12);
   }

   private class_8697 method_18653(class_511 var1, class_511 var2) {
      class_511 var5 = this.method_18651(var1);
      class_511 var6 = this.method_18651(var2);
      int var7 = Math.min(var5.field_3149, var6.field_3149);
      int var8 = Math.max(var5.field_3149, var6.field_3149);
      int var9 = Math.min(var5.field_3150, var6.field_3150);
      int var10 = Math.max(var5.field_3150, var6.field_3150);
      return new class_8697(var7, var9, var8 - var7, var10 - var9);
   }
}
