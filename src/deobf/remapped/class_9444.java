package remapped;

import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.ArrayList;
import java.util.Objects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.commons.lang3.ArrayUtils;

public class class_9444 implements class_8171 {
   private boolean field_48202;
   private boolean field_48201;
   private long field_48197;

   public class_9444(class_7081 var1, class_5121 var2, class_2560 var3, Runnable var4) {
      this.field_48198 = var1;
      this.field_48203 = var2;
      this.field_48199 = var3;
      this.field_48196 = var4;
   }

   @Override
   public void method_37472(class_1184 var1) {
      if (!this.field_48201) {
         this.field_48201 = true;
         class_5880 var4 = var1.method_5233();
         if (var4.method_26817() == null) {
            this.field_48199.field_12672 = StringTextComponent.EMPTY;
         } else {
            this.field_48199.field_12672 = var4.method_26817();
         }

         if (var4.method_26818() == null) {
            this.field_48199.field_12666 = new TranslationTextComponent("multiplayer.status.old");
            this.field_48199.field_12663 = 0;
         } else {
            this.field_48199.field_12666 = new StringTextComponent(var4.method_26818().method_34349());
            this.field_48199.field_12663 = var4.method_26818().method_34351();
         }

         if (var4.method_26816() == null) {
            this.field_48199.field_12671 = new TranslationTextComponent("multiplayer.status.unknown").mergeStyle(TextFormatting.DARK_GRAY);
         } else {
            this.field_48199.field_12671 = class_7081.method_32591(var4.method_26816().method_44362(), var4.method_26816().method_44364());
            ArrayList var5 = Lists.newArrayList();
            if (ArrayUtils.isNotEmpty(var4.method_26816().method_44363())) {
               for (GameProfile var9 : var4.method_26816().method_44363()) {
                  var5.add(new StringTextComponent(var9.getName()));
               }

               if (var4.method_26816().method_44363().length < var4.method_26816().method_44362()) {
                  var5.add(
                     new TranslationTextComponent("multiplayer.status.and_more", var4.method_26816().method_44362() - var4.method_26816().method_44363().length)
                  );
               }

               this.field_48199.field_12664 = var5;
            }
         }

         String var10 = null;
         if (var4.method_26815() != null) {
            String var11 = var4.method_26815();
            if (!var11.startsWith("data:image/png;base64,")) {
               class_7081.method_32588().error("Invalid server icon (unknown format)");
            } else {
               var10 = var11.substring("data:image/png;base64,".length());
            }
         }

         if (!Objects.equals(var10, this.field_48199.method_11622())) {
            this.field_48199.method_11623(var10);
            this.field_48196.run();
         }

         this.field_48197 = class_9665.method_44650();
         this.field_48203.method_23485(new class_1369(this.field_48197));
         this.field_48202 = true;
      } else {
         this.field_48203.method_23482(new TranslationTextComponent("multiplayer.status.unrequested"));
      }
   }

   @Override
   public void method_37473(class_8334 var1) {
      long var4 = this.field_48197;
      long var6 = class_9665.method_44650();
      this.field_48199.field_12674 = var6 - var4;
      this.field_48203.method_23482(new TranslationTextComponent("multiplayer.status.finished"));
   }

   @Override
   public void method_9090(ITextComponent var1) {
      if (!this.field_48202) {
         class_7081.method_32588().error("Can't ping {}: {}", this.field_48199.field_12675, var1.getString());
         this.field_48199.field_12672 = new TranslationTextComponent("multiplayer.status.cannot_connect").mergeStyle(TextFormatting.DARK_RED);
         this.field_48199.field_12671 = StringTextComponent.EMPTY;
         class_7081.method_32587(this.field_48198, this.field_48199);
      }
   }

   @Override
   public class_5121 method_9091() {
      return this.field_48203;
   }
}
