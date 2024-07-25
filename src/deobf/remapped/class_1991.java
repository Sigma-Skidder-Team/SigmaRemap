package remapped;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1991 extends class_1094 {
   private static final Logger field_10098 = LogManager.getLogger();
   private static final class_4639 field_10085 = new class_4639("realms", "textures/gui/realms/link_icons.png");
   private static final class_4639 field_10093 = new class_4639("realms", "textures/gui/realms/trailer_icons.png");
   private static final class_4639 field_10106 = new class_4639("realms", "textures/gui/realms/slot_frame.png");
   private static final ITextComponent field_10086 = new TranslationTextComponent("mco.template.info.tooltip");
   private static final ITextComponent field_10095 = new TranslationTextComponent("mco.template.trailer.tooltip");
   private final class_7875 field_10091;
   private class_6229 field_10090;
   private int field_10101 = -1;
   private ITextComponent field_10102;
   private class_9521 field_10105;
   private class_9521 field_10100;
   private class_9521 field_10103;
   private ITextComponent field_10104;
   private String field_10107;
   private final class_8840 field_10097;
   private int field_10092;
   private ITextComponent[] field_10087;
   private String field_10089;
   private boolean field_10094;
   private boolean field_10096;
   private List<class_3557> field_10088;

   public class_1991(class_7875 var1, class_8840 var2) {
      this(var1, var2, (class_480)null);
   }

   public class_1991(class_7875 var1, class_8840 var2, class_480 var3) {
      this.field_10091 = var1;
      this.field_10097 = var2;
      if (var3 != null) {
         this.field_10090 = new class_6229(this, Lists.newArrayList(var3.field_2981));
         this.method_9218(var3);
      } else {
         this.field_10090 = new class_6229(this);
         this.method_9218(new class_480(10));
      }

      this.field_10102 = new TranslationTextComponent("mco.template.title");
   }

   public void method_9187(ITextComponent var1) {
      this.field_10102 = var1;
   }

   public void method_9190(ITextComponent... var1) {
      this.field_10087 = var1;
      this.field_10094 = true;
   }

   @Override
   public boolean method_26940(double var1, double var3, int var5) {
      if (this.field_10096 && this.field_10089 != null) {
         Util.getOperatingSystem().method_37581("https://www.minecraft.net/realms/adventure-maps-in-1-9");
         return true;
      } else {
         return super.method_26940(var1, var3, var5);
      }
   }

   @Override
   public void method_1163() {
      this.field_943.field_9600.method_38887(true);
      this.field_10090 = new class_6229(this, this.field_10090.method_28463());
      this.field_10100 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 206, this.field_940 - 32, 100, 20, new TranslationTextComponent("mco.template.button.trailer"), var1 -> this.method_9223()
         )
      );
      this.field_10105 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 - 100, this.field_940 - 32, 100, 20, new TranslationTextComponent("mco.template.button.select"), var1 -> this.method_9186()
         )
      );
      ITextComponent var3 = this.field_10097 != class_8840.field_45209 ? class_1402.field_7632 : class_1402.field_7633;
      class_9521 var4 = new class_9521(this.field_941 / 2 + 6, this.field_940 - 32, 100, 20, var3, var1 -> this.method_9182());
      this.<class_9521>method_1186(var4);
      this.field_10103 = this.<class_9521>method_1186(
         new class_9521(
            this.field_941 / 2 + 112, this.field_940 - 32, 100, 20, new TranslationTextComponent("mco.template.button.publisher"), var1 -> this.method_9184()
         )
      );
      this.field_10105.field_36675 = false;
      this.field_10100.field_36677 = false;
      this.field_10103.field_36677 = false;
      this.<class_6229>method_1159(this.field_10090);
      this.method_41184(this.field_10090);
      Stream var5 = Stream.<ITextComponent>of(this.field_10102);
      if (this.field_10087 != null) {
         var5 = Stream.<ITextComponent>concat(Stream.of(this.field_10087), var5);
      }

      class_7567.method_34412(var5.filter(Objects::nonNull).<String>map(ITextComponent::getString).collect(Collectors.<String>toList()));
   }

   private void method_9209() {
      this.field_10103.field_36677 = this.method_9196();
      this.field_10100.field_36677 = this.method_9198();
      this.field_10105.field_36675 = this.method_9211();
   }

   private boolean method_9211() {
      return this.field_10101 != -1;
   }

   private boolean method_9196() {
      return this.field_10101 != -1 && !this.method_9222().field_12422.isEmpty();
   }

   private class_2496 method_9222() {
      return this.field_10090.method_28461(this.field_10101);
   }

   private boolean method_9198() {
      return this.field_10101 != -1 && !this.method_9222().field_12415.isEmpty();
   }

   @Override
   public void method_5312() {
      super.method_5312();
      this.field_10092--;
      if (this.field_10092 < 0) {
         this.field_10092 = 0;
      }
   }

   @Override
   public boolean method_26946(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method_26946(var1, var2, var3);
      } else {
         this.method_9182();
         return true;
      }
   }

   private void method_9182() {
      this.field_10091.method_35633((class_2496)null);
      this.field_943.method_8609(this.field_10091);
   }

   private void method_9186() {
      if (this.method_9192()) {
         this.field_10091.method_35633(this.method_9222());
      }
   }

   private boolean method_9192() {
      return this.field_10101 >= 0 && this.field_10101 < this.field_10090.method_36218();
   }

   private void method_9223() {
      if (this.method_9192()) {
         class_2496 var3 = this.method_9222();
         if (!"".equals(var3.field_12415)) {
            Util.getOperatingSystem().method_37581(var3.field_12415);
         }
      }
   }

   private void method_9184() {
      if (this.method_9192()) {
         class_2496 var3 = this.method_9222();
         if (!"".equals(var3.field_12422)) {
            Util.getOperatingSystem().method_37581(var3.field_12422);
         }
      }
   }

   private void method_9218(class_480 var1) {
      new class_4544(this, "realms-template-fetcher", var1).start();
   }

   private Either<class_480, String> method_9188(class_480 var1, class_176 var2) {
      try {
         return Either.left(var2.method_796(var1.field_2977 + 1, var1.field_2979, this.field_10097));
      } catch (class_3900 var6) {
         return Either.right(var6.getMessage());
      }
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.field_10104 = null;
      this.field_10107 = null;
      this.field_10096 = false;
      this.method_1183(var1);
      this.field_10090.method_6767(var1, var2, var3, var4);
      if (this.field_10088 != null) {
         this.method_9206(var1, var2, var3, this.field_10088);
      }

      method_9788(var1, this.field_948, this.field_10102, this.field_941 / 2, 13, 16777215);
      if (this.field_10094) {
         ITextComponent[] var7 = this.field_10087;

         for (int var8 = 0; var8 < var7.length; var8++) {
            int var9 = this.field_948.method_45379(var7[var8]);
            int var10 = this.field_941 / 2 - var9 / 2;
            int var11 = method_4819(-1 + var8);
            if (var2 >= var10 && var2 <= var10 + var9 && var3 >= var11 && var3 <= var11 + 9) {
               this.field_10096 = true;
            }
         }

         for (int var12 = 0; var12 < var7.length; var12++) {
            Object var13 = var7[var12];
            int var14 = 10526880;
            if (this.field_10089 != null) {
               if (!this.field_10096) {
                  var14 = 3368635;
               } else {
                  var14 = 7107012;
                  var13 = ((ITextComponent)var13).deepCopy().mergeStyle(TextFormatting.STRIKETHROUGH);
               }
            }

            method_9788(var1, this.field_948, (ITextComponent)var13, this.field_941 / 2, method_4819(-1 + var12), var14);
         }
      }

      super.method_6767(var1, var2, var3, var4);
      this.method_9201(var1, this.field_10104, var2, var3);
   }

   private void method_9206(class_7966 var1, int var2, int var3, List<class_3557> var4) {
      for (int var7 = 0; var7 < var4.size(); var7++) {
         class_3557 var8 = (class_3557)var4.get(var7);
         int var9 = method_4819(4 + var7);
         int var10 = var8.field_17435.stream().mapToInt(var1x -> this.field_948.method_45395(var1x.method_2253())).sum();
         int var11 = this.field_941 / 2 - var10 / 2;

         for (class_468 var13 : var8.field_17435) {
            int var14 = !var13.method_2249() ? 16777215 : 3368635;
            int var15 = this.field_948.method_45390(var1, var13.method_2253(), (float)var11, (float)var9, var14);
            if (var13.method_2249() && var2 > var11 && var2 < var15 && var3 > var9 - 3 && var3 < var9 + 8) {
               this.field_10104 = new StringTextComponent(var13.method_2251());
               this.field_10107 = var13.method_2251();
            }

            var11 = var15;
         }
      }
   }

   public void method_9201(class_7966 var1, ITextComponent var2, int var3, int var4) {
      if (var2 != null) {
         int var7 = var3 + 12;
         int var8 = var4 - 12;
         int var9 = this.field_948.method_45379(var2);
         this.method_9772(var1, var7 - 3, var8 - 3, var7 + var9 + 3, var8 + 8 + 3, -1073741824, -1073741824);
         this.field_948.method_45392(var1, var2, (float)var7, (float)var8, 16777215);
      }
   }
}
