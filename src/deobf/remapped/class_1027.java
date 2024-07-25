package remapped;

import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.context.CommandContextBuilder;
import com.mojang.brigadier.context.ParsedArgument;
import com.mojang.brigadier.context.SuggestionContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class class_1027 {
   private static final Pattern field_5690 = Pattern.compile("(\\s+)");
   private static final Style field_5687 = Style.EMPTY.setFormatting(TextFormatting.RED);
   private static final Style field_5693 = Style.EMPTY.setFormatting(TextFormatting.GRAY);
   private static final List<Style> field_5681 = Stream.<TextFormatting>of(
         TextFormatting.AQUA, TextFormatting.YELLOW, TextFormatting.GREEN, TextFormatting.LIGHT_PURPLE, TextFormatting.GOLD
      )
      .<Style>map(Style.EMPTY::setFormatting)
      .collect(ImmutableList.toImmutableList());
   private final MinecraftClient field_5692;
   private final Screen field_5699;
   private final class_1863 field_5698;
   private final TextRenderer field_5697;
   private final boolean field_5689;
   private final boolean field_5702;
   private final int field_5700;
   private final int field_5701;
   private final boolean field_5680;
   private final int field_5684;
   private final List<class_7107> field_5694 = Lists.newArrayList();
   private int field_5682;
   private int field_5683;
   private ParseResults<class_8773> field_5685;
   private CompletableFuture<Suggestions> field_5688;
   private class_4374 field_5686;
   private boolean field_5691;
   private boolean field_5696;

   public class_1027(MinecraftClient var1, Screen var2, class_1863 var3, TextRenderer var4, boolean var5, boolean var6, int var7, int var8, boolean var9, int var10) {
      this.field_5692 = var1;
      this.field_5699 = var2;
      this.field_5698 = var3;
      this.field_5697 = var4;
      this.field_5689 = var5;
      this.field_5702 = var6;
      this.field_5700 = var7;
      this.field_5701 = var8;
      this.field_5680 = var9;
      this.field_5684 = var10;
      var3.method_8262(this::method_4535);
   }

   public void method_4552(boolean var1) {
      this.field_5691 = var1;
      if (!var1) {
         this.field_5686 = null;
      }
   }

   public boolean method_4541(int var1, int var2, int var3) {
      if (this.field_5686 != null && this.field_5686.method_20383(var1, var2, var3)) {
         return true;
      } else if (this.field_5699.method_41185() == this.field_5698 && var1 == 258) {
         this.method_4553(true);
         return true;
      } else {
         return false;
      }
   }

   public boolean method_4532(double var1) {
      return this.field_5686 != null && this.field_5686.method_20377(class_9299.method_42827(var1, -1.0, 1.0));
   }

   public boolean method_4549(double var1, double var3, int var5) {
      return this.field_5686 != null && this.field_5686.method_20382((int)var1, (int)var3, var5);
   }

   public void method_4553(boolean var1) {
      if (this.field_5688 != null && this.field_5688.isDone()) {
         Suggestions var4 = this.field_5688.join();
         if (!var4.isEmpty()) {
            int var5 = 0;

            for (Suggestion var7 : var4.getList()) {
               var5 = Math.max(var5, this.field_5697.method_45395(var7.getText()));
            }

            int var8 = class_9299.method_42829(
               this.field_5698.method_8276(var4.getRange().getStart()), 0, this.field_5698.method_8276(0) + this.field_5698.method_8267() - var5
            );
            int var9 = !this.field_5680 ? 72 : this.field_5699.field_940 - 12;
            this.field_5686 = new class_4374(this, var8, var9, var5, this.method_4531(var4), var1, null);
         }
      }
   }

   private List<Suggestion> method_4531(Suggestions var1) {
      String var4 = this.field_5698.method_8246().substring(0, this.field_5698.method_8283());
      int var5 = method_4542(var4);
      String var6 = var4.substring(var5).toLowerCase(Locale.ROOT);
      ArrayList var7 = Lists.newArrayList();
      ArrayList var8 = Lists.newArrayList();

      for (Suggestion var10 : var1.getList()) {
         if (!var10.getText().startsWith(var6) && !var10.getText().startsWith("minecraft:" + var6)) {
            var8.add(var10);
         } else {
            var7.add(var10);
         }
      }

      var7.addAll(var8);
      return var7;
   }

   public void method_4526() {
      String var3 = this.field_5698.method_8246();
      if (this.field_5685 != null && !this.field_5685.getReader().getString().equals(var3)) {
         this.field_5685 = null;
      }

      if (!this.field_5696) {
         this.field_5698.method_8251((String)null);
         this.field_5686 = null;
      }

      this.field_5694.clear();
      StringReader var4 = new StringReader(var3);
      boolean var5 = var4.canRead() && var4.peek() == '/';
      if (var5) {
         var4.skip();
      }

      boolean var6 = this.field_5689 || var5;
      int var7 = this.field_5698.method_8283();
      if (!var6) {
         String var8 = var3.substring(0, var7);
         int var9 = method_4542(var8);
         Collection var10 = this.field_5692.thePlayer.connection.method_4797().method_40307();
         this.field_5688 = class_8773.method_40319(var10, new SuggestionsBuilder(var8, var9));
      } else {
         CommandDispatcher var11 = this.field_5692.thePlayer.connection.method_4811();
         if (this.field_5685 == null) {
            this.field_5685 = var11.parse(var4, this.field_5692.thePlayer.connection.method_4797());
         }

         int var12 = !this.field_5702 ? 1 : var4.getCursor();
         if (var7 >= var12 && (this.field_5686 == null || !this.field_5696)) {
            this.field_5688 = var11.getCompletionSuggestions(this.field_5685, var7);
            this.field_5688.thenRun(() -> {
               if (this.field_5688.isDone()) {
                  this.method_4539();
               }
            });
         }
      }
   }

   private static int method_4542(String var0) {
      if (Strings.isNullOrEmpty(var0)) {
         return 0;
      } else {
         int var3 = 0;
         Matcher var4 = field_5690.matcher(var0);

         while (var4.find()) {
            var3 = var4.end();
         }

         return var3;
      }
   }

   private static class_7107 method_4527(CommandSyntaxException var0) {
      ITextComponent var3 = TextComponentUtils.toTextComponent(var0.getRawMessage());
      String var4 = var0.getContext();
      return var4 != null ? new TranslationTextComponent("command.context.parse_error", var3, var0.getCursor(), var4).func_241878_f() : var3.func_241878_f();
   }

   private void method_4539() {
      if (this.field_5698.method_8283() == this.field_5698.method_8246().length()) {
         if (this.field_5688.join().isEmpty() && !this.field_5685.getExceptions().isEmpty()) {
            int var3 = 0;

            for (Entry var5 : this.field_5685.getExceptions().entrySet()) {
               CommandSyntaxException var6 = (CommandSyntaxException)var5.getValue();
               if (var6.getType() != CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect()) {
                  this.field_5694.add(method_4527(var6));
               } else {
                  var3++;
               }
            }

            if (var3 > 0) {
               this.field_5694.add(method_4527(CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().create()));
            }
         } else if (this.field_5685.getReader().canRead()) {
            this.field_5694.add(method_4527(class_465.method_2234(this.field_5685)));
         }
      }

      this.field_5682 = 0;
      this.field_5683 = this.field_5699.field_941;
      if (this.field_5694.isEmpty()) {
         this.method_4546(TextFormatting.GRAY);
      }

      this.field_5686 = null;
      if (this.field_5691 && this.field_5692.gameOptions.field_45493) {
         this.method_4553(false);
      }
   }

   private void method_4546(TextFormatting var1) {
      CommandContextBuilder var4 = this.field_5685.getContext();
      SuggestionContext var5 = var4.findSuggestionContext(this.field_5698.method_8283());
      Map var6 = this.field_5692.thePlayer.connection.method_4811().getSmartUsage(var5.parent, this.field_5692.thePlayer.connection.method_4797());
      ArrayList var7 = Lists.newArrayList();
      int var8 = 0;
      Style var9 = Style.EMPTY.setFormatting(var1);

      for (Entry var11 : var6.entrySet()) {
         if (!(var11.getKey() instanceof LiteralCommandNode)) {
            var7.add(class_7107.method_32662((String)var11.getValue(), var9));
            var8 = Math.max(var8, this.field_5697.method_45395((String)var11.getValue()));
         }
      }

      if (!var7.isEmpty()) {
         this.field_5694.addAll(var7);
         this.field_5682 = class_9299.method_42829(
            this.field_5698.method_8276(var5.startPos), 0, this.field_5698.method_8276(0) + this.field_5698.method_8267() - var8
         );
         this.field_5683 = var8;
      }
   }

   private class_7107 method_4535(String var1, int var2) {
      return this.field_5685 == null ? class_7107.method_32662(var1, Style.EMPTY) : method_4545(this.field_5685, var1, var2);
   }

   @Nullable
   private static String method_4540(String var0, String var1) {
      return !var1.startsWith(var0) ? null : var1.substring(var0.length());
   }

   private static class_7107 method_4545(ParseResults<class_8773> var0, String var1, int var2) {
      ArrayList var5 = Lists.newArrayList();
      int var6 = 0;
      int var7 = -1;
      CommandContextBuilder var8 = var0.getContext().getLastChild();

      for (ParsedArgument var10 : var8.getArguments().values()) {
         if (++var7 >= field_5681.size()) {
            var7 = 0;
         }

         int var11 = Math.max(var10.getRange().getStart() - var2, 0);
         if (var11 >= var1.length()) {
            break;
         }

         int var12 = Math.min(var10.getRange().getEnd() - var2, var1.length());
         if (var12 > 0) {
            var5.add(class_7107.method_32662(var1.substring(var6, var11), field_5693));
            var5.add(class_7107.method_32662(var1.substring(var11, var12), field_5681.get(var7)));
            var6 = var12;
         }
      }

      if (var0.getReader().canRead()) {
         int var13 = Math.max(var0.getReader().getCursor() - var2, 0);
         if (var13 < var1.length()) {
            int var14 = Math.min(var13 + var0.getReader().getRemainingLength(), var1.length());
            var5.add(class_7107.method_32662(var1.substring(var6, var13), field_5693));
            var5.add(class_7107.method_32662(var1.substring(var13, var14), field_5687));
            var6 = var14;
         }
      }

      var5.add(class_7107.method_32662(var1.substring(var6), field_5693));
      return class_7107.method_32660(var5);
   }

   public void method_4547(class_7966 var1, int var2, int var3) {
      if (this.field_5686 == null) {
         int var6 = 0;

         for (class_7107 var8 : this.field_5694) {
            int var9 = !this.field_5680 ? 72 + 12 * var6 : this.field_5699.field_940 - 14 - 13 - 12 * var6;
            AbstractGui.method_9774(var1, this.field_5682 - 1, var9, this.field_5682 + this.field_5683 + 1, var9 + 12, this.field_5684);
            this.field_5697.method_45402(var1, var8, (float)this.field_5682, (float)(var9 + 2), -1);
            var6++;
         }
      } else {
         this.field_5686.method_20379(var1, var2, var3);
      }
   }

   public String method_4533() {
      return this.field_5686 == null ? "" : "\n" + class_4374.method_20384(this.field_5686);
   }
}
