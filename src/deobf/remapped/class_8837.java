package remapped;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$class_40;
import net.minecraft.util.text.TranslationTextComponent;

public class class_8837 extends class_3757 implements class_9875 {
   private ITextComponent field_45198;
   private class_9077 field_45200 = class_9077.field_46493;
   private class_3416 field_45199;
   private boolean field_45197;
   private List<Pair<class_8427, class_9077>> field_45196;

   public class_8837() {
      super(class_133.field_382);
   }

   public class_8837(class_9077 var1) {
      this();
      this.field_45200 = var1;
   }

   @Nullable
   public static class_3416 method_40656(class_6098 var0) {
      class_3416 var3 = null;
      class_5734 var4 = var0.method_28021("BlockEntityTag");
      if (var4 != null && var4.method_25939("Patterns", 9)) {
         var3 = var4.method_25927("Patterns", 10).method_15768();
      }

      return var3;
   }

   public void method_40657(class_6098 var1, class_9077 var2) {
      this.field_45199 = method_40656(var1);
      this.field_45200 = var2;
      this.field_45196 = null;
      this.field_45197 = true;
      this.field_45198 = !var1.method_28018() ? null : var1.method_28008();
   }

   @Override
   public ITextComponent method_45509() {
      return (ITextComponent)(this.field_45198 == null ? new TranslationTextComponent("block.minecraft.banner") : this.field_45198);
   }

   @Nullable
   @Override
   public ITextComponent method_45508() {
      return this.field_45198;
   }

   public void method_40654(ITextComponent var1) {
      this.field_45198 = var1;
   }

   @Override
   public class_5734 method_17396(class_5734 var1) {
      super.method_17396(var1);
      if (this.field_45199 != null) {
         var1.method_25946("Patterns", this.field_45199);
      }

      if (this.field_45198 != null) {
         var1.method_25941("CustomName", ITextComponent$class_40.toJson(this.field_45198));
      }

      return var1;
   }

   @Override
   public void method_17394(class_2522 var1, class_5734 var2) {
      super.method_17394(var1, var2);
      if (var2.method_25939("CustomName", 8)) {
         this.field_45198 = ITextComponent$class_40.func_240643_a_(var2.method_25965("CustomName"));
      }

      if (!this.method_17392()) {
         this.field_45200 = null;
      } else {
         this.field_45200 = ((class_764)this.method_17403().method_8360()).method_3443();
      }

      this.field_45199 = var2.method_25927("Patterns", 10);
      this.field_45196 = null;
      this.field_45197 = true;
   }

   @Nullable
   @Override
   public class_5029 method_17413() {
      return new class_5029(this.field_18358, 6, this.method_17414());
   }

   @Override
   public class_5734 method_17414() {
      return this.method_17396(new class_5734());
   }

   public static int method_40660(class_6098 var0) {
      class_5734 var3 = var0.method_28021("BlockEntityTag");
      return var3 != null && var3.method_25938("Patterns") ? var3.method_25927("Patterns", 10).size() : 0;
   }

   public List<Pair<class_8427, class_9077>> method_40655() {
      if (this.field_45196 == null && this.field_45197) {
         this.field_45196 = method_40658(this.method_40659(this::method_17403), this.field_45199);
      }

      return this.field_45196;
   }

   public static List<Pair<class_8427, class_9077>> method_40658(class_9077 var0, class_3416 var1) {
      ArrayList var4 = Lists.newArrayList();
      var4.add(Pair.of(class_8427.field_43111, var0));
      if (var1 != null) {
         for (int var5 = 0; var5 < var1.size(); var5++) {
            class_5734 var6 = var1.method_15764(var5);
            class_8427 var7 = class_8427.method_38788(var6.method_25965("Pattern"));
            if (var7 != null) {
               int var8 = var6.method_25947("Color");
               var4.add(Pair.of(var7, class_9077.method_41789(var8)));
            }
         }
      }

      return var4;
   }

   public static void method_40661(class_6098 var0) {
      class_5734 var3 = var0.method_28021("BlockEntityTag");
      if (var3 != null && var3.method_25939("Patterns", 9)) {
         class_3416 var4 = var3.method_25927("Patterns", 10);
         if (!var4.isEmpty()) {
            var4.remove(var4.size() - 1);
            if (var4.isEmpty()) {
               var0.method_27976("BlockEntityTag");
            }
         }
      }
   }

   public class_6098 method_40662(class_2522 var1) {
      class_6098 var4 = new class_6098(class_9815.method_45242(this.method_40659(() -> var1)));
      if (this.field_45199 != null && !this.field_45199.isEmpty()) {
         var4.method_27978("BlockEntityTag").method_25946("Patterns", this.field_45199.method_15768());
      }

      if (this.field_45198 != null) {
         var4.method_28032(this.field_45198);
      }

      return var4;
   }

   public class_9077 method_40659(Supplier<class_2522> var1) {
      if (this.field_45200 == null) {
         this.field_45200 = ((class_764)((class_2522)var1.get()).method_8360()).method_3443();
      }

      return this.field_45200;
   }
}
