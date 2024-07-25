package remapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;
import javax.annotation.Nullable;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$class_47;

public class class_8398 extends class_3757 {
   private final ITextComponent[] field_42972 = new ITextComponent[]{
      StringTextComponent.EMPTY, StringTextComponent.EMPTY, StringTextComponent.EMPTY, StringTextComponent.EMPTY
   };
   private boolean field_42973 = true;
   private class_704 field_42971;
   private final class_7107[] field_42974 = new class_7107[4];
   private class_9077 field_42970 = class_9077.field_46496;

   public class_8398() {
      super(class_133.field_349);
   }

   @Override
   public class_5734 method_17396(class_5734 var1) {
      super.method_17396(var1);

      for (int var4 = 0; var4 < 4; var4++) {
         String var5 = ITextComponent$class_40.toJson(this.field_42972[var4]);
         var1.method_25941("Text" + (var4 + 1), var5);
      }

      var1.method_25941("Color", this.field_42970.method_41796());
      return var1;
   }

   @Override
   public void method_17394(class_2522 var1, class_5734 var2) {
      this.field_42973 = false;
      super.method_17394(var1, var2);
      this.field_42970 = class_9077.method_41788(var2.method_25965("Color"), class_9077.field_46496);

      for (int var5 = 0; var5 < 4; var5++) {
         String var6 = var2.method_25965("Text" + (var5 + 1));
         IFormattableTextComponent var7 = ITextComponent$class_40.func_240643_a_(var6.isEmpty() ? "\"\"" : var6);
         if (this.field_18364 instanceof class_6331) {
            try {
               this.field_42972[var5] = TextComponentUtils.func_240645_a_(this.method_38672((class_9359)null), var7, (Entity)null, 0);
            } catch (CommandSyntaxException var9) {
               this.field_42972[var5] = var7;
            }
         } else {
            this.field_42972[var5] = var7;
         }

         this.field_42974[var5] = null;
      }
   }

   public ITextComponent method_38678(int var1) {
      return this.field_42972[var1];
   }

   public void method_38677(int var1, ITextComponent var2) {
      this.field_42972[var1] = var2;
      this.field_42974[var1] = null;
   }

   @Nullable
   public class_7107 method_38680(int var1, Function<ITextComponent, class_7107> var2) {
      if (this.field_42974[var1] == null && this.field_42972[var1] != null) {
         this.field_42974[var1] = (class_7107)var2.apply(this.field_42972[var1]);
      }

      return this.field_42974[var1];
   }

   @Nullable
   @Override
   public class_5029 method_17413() {
      return new class_5029(this.field_18358, 9, this.method_17414());
   }

   @Override
   public class_5734 method_17414() {
      return this.method_17396(new class_5734());
   }

   @Override
   public boolean method_17397() {
      return true;
   }

   public boolean method_38671() {
      return this.field_42973;
   }

   public void method_38676(boolean var1) {
      this.field_42973 = var1;
      if (!var1) {
         this.field_42971 = null;
      }
   }

   public void method_38675(class_704 var1) {
      this.field_42971 = var1;
   }

   public class_704 method_38679() {
      return this.field_42971;
   }

   public boolean method_38674(class_704 var1) {
      for (ITextComponent var7 : this.field_42972) {
         Style var8 = var7 != null ? var7.getStyle() : null;
         if (var8 != null && var8.getClickEvent() != null) {
            ClickEvent var9 = var8.getClickEvent();
            if (var9.getAction() == ClickEvent$class_47.RUN_COMMAND) {
               var1.method_37268().method_1631().method_2232(this.method_38672((class_9359)var1), var9.getValue());
            }
         }
      }

      return true;
   }

   public class_9155 method_38672(class_9359 var1) {
      String var4 = var1 != null ? var1.method_45509().getString() : "Sign";
      Object var5 = var1 != null ? var1.method_19839() : new StringTextComponent("Sign");
      return new class_9155(
         class_5801.field_29295,
         class_1343.method_6216(this.field_18358),
         class_4895.field_24322,
         (class_6331)this.field_18364,
         2,
         var4,
         (ITextComponent)var5,
         this.field_18364.method_29522(),
         var1
      );
   }

   public class_9077 method_38681() {
      return this.field_42970;
   }

   public boolean method_38673(class_9077 var1) {
      if (var1 == this.method_38681()) {
         return false;
      } else {
         this.field_42970 = var1;
         this.method_17407();
         this.field_18364.method_29572(this.method_17399(), this.method_17403(), this.method_17403(), 3);
         return true;
      }
   }
}
