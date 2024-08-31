package mapped;

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
import com.mojang.brigadier.tree.CommandNode;
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

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.AbstractGui;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;

public class Class6850 {
   private static final Pattern field29743 = Pattern.compile("(\\s+)");
   private static final Style field29744 = Style.EMPTY.setFormatting(TextFormatting.RED);
   private static final Style field29745 = Style.EMPTY.setFormatting(TextFormatting.GRAY);
   private static final List<Style> field29746 = Stream.<TextFormatting>of(
         TextFormatting.AQUA, TextFormatting.YELLOW, TextFormatting.GREEN, TextFormatting.LIGHT_PURPLE, TextFormatting.GOLD
      )
      .<Style>map(Style.EMPTY::setFormatting)
      .collect(ImmutableList.toImmutableList());
   private final Minecraft field29747;
   private final Screen field29748;
   private final TextFieldWidget field29749;
   private final FontRenderer field29750;
   private final boolean field29751;
   private final boolean field29752;
   private final int field29753;
   private final int field29754;
   private final boolean field29755;
   private final int field29756;
   private final List<Class9125> field29757 = Lists.newArrayList();
   private int field29758;
   private int field29759;
   private ParseResults<Class6618> field29760;
   private CompletableFuture<Suggestions> field29761;
   private Class8368 field29762;
   private boolean field29763;
   private boolean field29764;

   public Class6850(Minecraft var1, Screen var2, TextFieldWidget var3, FontRenderer var4, boolean var5, boolean var6, int var7, int var8, boolean var9, int var10) {
      this.field29747 = var1;
      this.field29748 = var2;
      this.field29749 = var3;
      this.field29750 = var4;
      this.field29751 = var5;
      this.field29752 = var6;
      this.field29753 = var7;
      this.field29754 = var8;
      this.field29755 = var9;
      this.field29756 = var10;
      var3.method5632(this::method20840);
   }

   public void method20829(boolean var1) {
      this.field29763 = var1;
      if (!var1) {
         this.field29762 = null;
      }
   }

   public boolean method20830(int var1, int var2, int var3) {
      if (this.field29762 != null && this.field29762.method29311(var1, var2, var3)) {
         return true;
      } else if (this.field29748.method5533() == this.field29749 && var1 == 258) {
         this.method20833(true);
         return true;
      } else {
         return false;
      }
   }

   public boolean method20831(double var1) {
      return this.field29762 != null && this.field29762.method29310(MathHelper.method37778(var1, -1.0, 1.0));
   }

   public boolean method20832(double var1, double var3, int var5) {
      return this.field29762 != null && this.field29762.method29309((int)var1, (int)var3, var5);
   }

   public void method20833(boolean var1) {
      if (this.field29761 != null && this.field29761.isDone()) {
         Suggestions var4 = this.field29761.join();
         if (!var4.isEmpty()) {
            int var5 = 0;

            for (Suggestion var7 : var4.getList()) {
               var5 = Math.max(var5, this.field29750.getStringWidth(var7.getText()));
            }

            int var8 = MathHelper.method37775(
               this.field29749.method5673(var4.getRange().getStart()), 0, this.field29749.method5673(0) + this.field29749.method5667() - var5
            );
            int var9 = !this.field29755 ? 72 : this.field29748.height - 12;
            this.field29762 = new Class8368(this, var8, var9, var5, this.method20834(var4), var1);
         }
      }
   }

   private List<Suggestion> method20834(Suggestions var1) {
      String var4 = this.field29749.getText().substring(0, this.field29749.method5659());
      int var5 = method20836(var4);
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

   public void method20835() {
      String var3 = this.field29749.getText();
      if (this.field29760 != null && !this.field29760.getReader().getString().equals(var3)) {
         this.field29760 = null;
      }

      if (!this.field29764) {
         this.field29749.method5672((String)null);
         this.field29762 = null;
      }

      this.field29757.clear();
      StringReader var4 = new StringReader(var3);
      boolean var5 = var4.canRead() && var4.peek() == '/';
      if (var5) {
         var4.skip();
      }

      boolean var6 = this.field29751 || var5;
      int var7 = this.field29749.method5659();
      if (!var6) {
         String var8 = var3.substring(0, var7);
         int var9 = method20836(var8);
         Collection var10 = this.field29747.player.connection.method15781().method20124();
         this.field29761 = Class6618.method20147(var10, new SuggestionsBuilder(var8, var9));
      } else {
         CommandDispatcher var11 = this.field29747.player.connection.method15796();
         if (this.field29760 == null) {
            this.field29760 = var11.parse(var4, this.field29747.player.connection.method15781());
         }

         int var12 = !this.field29752 ? 1 : var4.getCursor();
         if (var7 >= var12 && (this.field29762 == null || !this.field29764)) {
            this.field29761 = var11.getCompletionSuggestions(this.field29760, var7);
            this.field29761.thenRun(() -> {
               if (this.field29761.isDone()) {
                  this.method20838();
               }
            });
         }
      }
   }

   private static int method20836(String var0) {
      if (Strings.isNullOrEmpty(var0)) {
         return 0;
      } else {
         int var3 = 0;
         Matcher var4 = field29743.matcher(var0);

         while (var4.find()) {
            var3 = var4.end();
         }

         return var3;
      }
   }

   private static Class9125 method20837(CommandSyntaxException var0) {
      ITextComponent var3 = TextComponentUtils.toTextComponent(var0.getRawMessage());
      String var4 = var0.getContext();
      return var4 != null ? new TranslationTextComponent("command.context.parse_error", var3, var0.getCursor(), var4).func_241878_f() : var3.func_241878_f();
   }

   private void method20838() {
      if (this.field29749.method5659() == this.field29749.getText().length()) {
         if (this.field29761.join().isEmpty() && !this.field29760.getExceptions().isEmpty()) {
            int var3 = 0;

            for (Entry var5 : this.field29760.getExceptions().entrySet()) {
               CommandSyntaxException var6 = (CommandSyntaxException)var5.getValue();
               if (var6.getType() != CommandSyntaxException.BUILT_IN_EXCEPTIONS.literalIncorrect()) {
                  this.field29757.add(method20837(var6));
               } else {
                  var3++;
               }
            }

            if (var3 > 0) {
               this.field29757.add(method20837(CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().create()));
            }
         } else if (this.field29760.getReader().canRead()) {
            this.field29757.add(method20837(Class6099.method18843(this.field29760)));
         }
      }

      this.field29758 = 0;
      this.field29759 = this.field29748.width;
      if (this.field29757.isEmpty()) {
         this.method20839(TextFormatting.GRAY);
      }

      this.field29762 = null;
      if (this.field29763 && this.field29747.gameSettings.field44611) {
         this.method20833(false);
      }
   }

   private void method20839(TextFormatting var1) {
      CommandContextBuilder<Class6618> var4 = this.field29760.getContext();
      SuggestionContext<Class6618> var5 = var4.findSuggestionContext(this.field29749.method5659());
      Map<CommandNode<Class6618>, String> var6 = this.field29747.player.connection.method15796().getSmartUsage(var5.parent, this.field29747.player.connection.method15781());
      ArrayList var7 = Lists.newArrayList();
      int var8 = 0;
      Style var9 = Style.EMPTY.setFormatting(var1);

      for (Entry<CommandNode<Class6618>, String> var11 : var6.entrySet()) {
         if (!(var11.getKey() instanceof LiteralCommandNode)) {
            var7.add(Class9125.method34038((String)var11.getValue(), var9));
            var8 = Math.max(var8, this.field29750.getStringWidth((String)var11.getValue()));
         }
      }

      if (!var7.isEmpty()) {
         this.field29757.addAll(var7);
         this.field29758 = MathHelper.method37775(
            this.field29749.method5673(var5.startPos), 0, this.field29749.method5673(0) + this.field29749.method5667() - var8
         );
         this.field29759 = var8;
      }
   }

   private Class9125 method20840(String var1, int var2) {
      return this.field29760 == null ? Class9125.method34038(var1, Style.EMPTY) : method20842(this.field29760, var1, var2);
   }

   @Nullable
   private static String method20841(String var0, String var1) {
      return !var1.startsWith(var0) ? null : var1.substring(var0.length());
   }

   private static Class9125 method20842(ParseResults<Class6618> var0, String var1, int var2) {
      ArrayList var5 = Lists.newArrayList();
      int var6 = 0;
      int var7 = -1;
      CommandContextBuilder<Class6618> var8 = var0.getContext().getLastChild();

      for (ParsedArgument var10 : var8.getArguments().values()) {
         if (++var7 >= field29746.size()) {
            var7 = 0;
         }

         int var11 = Math.max(var10.getRange().getStart() - var2, 0);
         if (var11 >= var1.length()) {
            break;
         }

         int var12 = Math.min(var10.getRange().getEnd() - var2, var1.length());
         if (var12 > 0) {
            var5.add(Class9125.method34038(var1.substring(var6, var11), field29745));
            var5.add(Class9125.method34038(var1.substring(var11, var12), field29746.get(var7)));
            var6 = var12;
         }
      }

      if (var0.getReader().canRead()) {
         int var13 = Math.max(var0.getReader().getCursor() - var2, 0);
         if (var13 < var1.length()) {
            int var14 = Math.min(var13 + var0.getReader().getRemainingLength(), var1.length());
            var5.add(Class9125.method34038(var1.substring(var6, var13), field29745));
            var5.add(Class9125.method34038(var1.substring(var13, var14), field29744));
            var6 = var14;
         }
      }

      var5.add(Class9125.method34038(var1.substring(var6), field29745));
      return Class9125.method34042(var5);
   }

   public void method20843(MatrixStack var1, int var2, int var3) {
      if (this.field29762 == null) {
         int var6 = 0;

         for (Class9125 var8 : this.field29757) {
            int var9 = !this.field29755 ? 72 + 12 * var6 : this.field29748.height - 14 - 13 - 12 * var6;
            AbstractGui.method5686(var1, this.field29758 - 1, var9, this.field29758 + this.field29759 + 1, var9 + 12, this.field29756);
            this.field29750.method38802(var1, var8, (float)this.field29758, (float)(var9 + 2), -1);
            var6++;
         }
      } else {
         this.field29762.method29308(var1, var2, var3);
      }
   }

   public String method20844() {
      return this.field29762 == null ? "" : "\n" + Class8368.method29317(this.field29762);
   }

   // $VF: synthetic method
   public static boolean method20846(Class6850 var0) {
      return var0.field29755;
   }

   // $VF: synthetic method
   public static int method20847(Class6850 var0) {
      return var0.field29754;
   }

   // $VF: synthetic method
   public static TextFieldWidget method20848(Class6850 var0) {
      return var0.field29749;
   }

   // $VF: synthetic method
   public static int method20849(Class6850 var0) {
      return var0.field29756;
   }

   // $VF: synthetic method
   public static FontRenderer method20850(Class6850 var0) {
      return var0.field29750;
   }

   // $VF: synthetic method
   public static Screen method20851(Class6850 var0) {
      return var0.field29748;
   }

   // $VF: synthetic method
   public static Minecraft method20852(Class6850 var0) {
      return var0.field29747;
   }

   // $VF: synthetic method
   public static int method20853(Class6850 var0) {
      return var0.field29753;
   }

   // $VF: synthetic method
   public static String method20854(String var0, String var1) {
      return method20841(var0, var1);
   }

   // $VF: synthetic method
   public static boolean method20855(Class6850 var0, boolean var1) {
      return var0.field29764 = var1;
   }

   // $VF: synthetic method
   public static Class8368 method20856(Class6850 var0, Class8368 var1) {
      return var0.field29762 = var1;
   }
}
