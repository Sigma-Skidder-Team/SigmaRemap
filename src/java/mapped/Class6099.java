package mapped;

import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.ParseResults;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$Action;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$Action;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6099 {
   private static final Logger field27344 = LogManager.getLogger();
   private final CommandDispatcher<Class6619> field27345 = new CommandDispatcher();

   public Class6099(Class2085 var1) {
      Class7848.method26285(this.field27345);
      Class6987.method21610(this.field27345);
      Class6137.method18958(this.field27345);
      Class7088.method22016(this.field27345);
      Class8284.method28947(this.field27345);
      Class6450.method19588(this.field27345);
      Class8158.method28315(this.field27345);
      Class9813.method38700(this.field27345);
      Class8456.method29738(this.field27345);
      Class9145.method34158(this.field27345);
      Class8773.method31643(this.field27345);
      Class9548.method36984(this.field27345);
      Class9410.method36043(this.field27345);
      Class6795.method20701(this.field27345);
      Class8910.method32556(this.field27345);
      Class8031.method27540(this.field27345);
      Class9749.method38286(this.field27345);
      Class6206.method19111(this.field27345);
      Class6587.method19960(this.field27345);
      Class9643.method37594(this.field27345);
      Class8909.method32551(this.field27345);
      Class8842.method32029(this.field27345);
      Class7679.method25264(this.field27345);
      Class9450.method36331(this.field27345);
      Class9234.method34726(this.field27345);
      Class9417.method36131(this.field27345);
      Class2791.method10982(this.field27345);
      Class9653.method37658(this.field27345);
      Class7508.method24477(this.field27345);
      Class8061.method27671(this.field27345);
      Class8621.method30876(this.field27345);
      Class9482.method36607(this.field27345);
      Class8194.method28495(this.field27345);
      Class9195.method34454(this.field27345);
      Class9504.method36698(this.field27345);
      Class7517.method24504(this.field27345);
      Class9601.method37271(this.field27345);
      Class9554.method37005(this.field27345, var1 != Class2085.INTEGRATED);
      Class8686.method31294(this.field27345);
      Class9160.method34194(this.field27345);
      Class8751.method31569(this.field27345);
      Class4533.method14453(this.field27345);
      Class9271.method34922(this.field27345);
      Class7049.method21956(this.field27345);
      Class8002.method27335(this.field27345);
      Class8615.method30863(this.field27345);
      Class7697.method25326(this.field27345);
      Class9175.method34285(this.field27345);
      Class9651.method37644(this.field27345);
      Class8957.method32725(this.field27345);
      Class8071.method27787(this.field27345);
      Class9752.method38309(this.field27345);
      Class8322.method29142(this.field27345);
      Class8295.method28988(this.field27345);
      Class8243.method28741(this.field27345);
      if (SharedConstants.developmentMode) {
         Class9037.method33489(this.field27345);
      }

      if (Class2085.method8739(var1)) {
         Class8345.method29252(this.field27345);
         Class8658.method31159(this.field27345);
         Class8508.method30139(this.field27345);
         Class9707.method38035(this.field27345);
         Class6752.method20581(this.field27345);
         Class8373.method29330(this.field27345);
         Class9141.method34130(this.field27345);
         Class8971.method32923(this.field27345);
         Class9136.method34112(this.field27345);
         Class8987.method33189(this.field27345);
         Class9531.method36833(this.field27345);
         Class8734.method31520(this.field27345);
         Class7676.method25217(this.field27345);
      }

      if (Class2085.method8740(var1)) {
         Class8883.method32320(this.field27345);
      }

      this.field27345
         .findAmbiguities(
            (var1x, var2, var3, var4) -> field27344.warn(
                  "Ambiguity between arguments {} and {} with inputs: {}", this.field27345.getPath(var2), this.field27345.getPath(var3), var4
               )
         );
      this.field27345.setConsumer((var0, var1x, var2) -> ((Class6619)var0.getSource()).method20182(var0, var1x, var2));
   }

   public int handleCommand(Class6619 var1, String var2) {
      StringReader var5 = new StringReader(var2);
      if (var5.canRead() && var5.peek() == '/') {
         var5.skip();
      }

      var1.method20177().method1420().startSection(var2);

      byte var22;
      try {
         return this.field27345.execute(var5, var1);
      } catch (Class2468 var15) {
         var1.method20181(var15.method10468());
         return 0;
      } catch (CommandSyntaxException var16) {
         var1.method20181(TextComponentUtils.toTextComponent(var16.getRawMessage()));
         if (var16.getInput() != null && var16.getCursor() >= 0) {
            int var20 = Math.min(var16.getInput().length(), var16.getCursor());
            IFormattableTextComponent var23 = new StringTextComponent("")
               .mergeStyle(TextFormatting.GRAY)
               .modifyStyle(var1x -> var1x.setClickEvent(new ClickEvent(ClickEvent$Action.SUGGEST_COMMAND, var2)));
            if (var20 > 10) {
               var23.appendString("...");
            }

            var23.appendString(var16.getInput().substring(Math.max(0, var20 - 10), var20));
            if (var20 < var16.getInput().length()) {
               IFormattableTextComponent var24 = new StringTextComponent(var16.getInput().substring(var20))
                  .mergeStyle(new TextFormatting[]{TextFormatting.RED, TextFormatting.UNDERLINE});
               var23.append(var24);
            }

            var23.append(new TranslationTextComponent("command.context.here").mergeStyle(new TextFormatting[]{TextFormatting.RED, TextFormatting.ITALIC}));
            var1.method20181(var23);
         }

         return 0;
      } catch (Exception var17) {
         StringTextComponent var7 = new StringTextComponent(var17.getMessage() == null ? var17.getClass().getName() : var17.getMessage());
         if (field27344.isDebugEnabled()) {
            field27344.error("Command exception: {}", var2, var17);
            StackTraceElement[] var8 = var17.getStackTrace();

            for (int var9 = 0; var9 < Math.min(var8.length, 3); var9++) {
               var7.appendString("\n\n")
                  .appendString(var8[var9].getMethodName())
                  .appendString("\n ")
                  .appendString(var8[var9].getFileName())
                  .appendString(":")
                  .appendString(String.valueOf(var8[var9].getLineNumber()));
            }
         }

         var1.method20181(
            new TranslationTextComponent("command.failed").modifyStyle(var1x -> var1x.setHoverEvent(new HoverEvent(HoverEvent$Action.SHOW_TEXT, var7)))
         );
         if (SharedConstants.developmentMode) {
            var1.method20181(new StringTextComponent(Util.method38517(var17)));
            field27344.error("'" + var2 + "' threw an exception", var17);
         }

         var22 = 0;
      } finally {
         var1.method20177().method1420().endSection();
      }

      return var22;
   }

   public void method18837(ServerPlayerEntity var1) {
      HashMap var4 = Maps.newHashMap();
      RootCommandNode var5 = new RootCommandNode();
      var4.put(this.field27345.getRoot(), var5);
      this.method18838(this.field27345.getRoot(), var5, var1.getCommandSource(), var4);
      var1.field4855.sendPacket(new Class5617(var5));
   }

   private void method18838(CommandNode<Class6619> var1, CommandNode<Class6618> var2, Class6619 var3, Map<CommandNode<Class6619>, CommandNode<Class6618>> var4) {
      for (CommandNode var8 : var1.getChildren()) {
         if (var8.canUse(var3)) {
            ArgumentBuilder var9 = var8.createBuilder();
            var9.requires(var0 -> true);
            if (var9.getCommand() != null) {
               var9.executes(var0 -> 0);
            }

            if (var9 instanceof RequiredArgumentBuilder) {
               RequiredArgumentBuilder var10 = (RequiredArgumentBuilder)var9;
               if (var10.getSuggestionsProvider() != null) {
                  var10.suggests(Class9222.method34679(var10.getSuggestionsProvider()));
               }
            }

            if (var9.getRedirect() != null) {
               var9.redirect((CommandNode)var4.get(var9.getRedirect()));
            }

            CommandNode var11 = var9.build();
            var4.put(var8, var11);
            var2.addChild(var11);
            if (!var8.getChildren().isEmpty()) {
               this.method18838(var8, var11, var3, var4);
            }
         }
      }
   }

   public static LiteralArgumentBuilder<Class6619> method18839(String var0) {
      return LiteralArgumentBuilder.literal(var0);
   }

   public static <T> RequiredArgumentBuilder<Class6619, T> method18840(String var0, ArgumentType<T> var1) {
      return RequiredArgumentBuilder.argument(var0, var1);
   }

   public static Predicate<String> method18841(Class7350 var0) {
      return var1 -> {
         try {
            var0.method23304(new StringReader(var1));
            return true;
         } catch (CommandSyntaxException var5) {
            return false;
         }
      };
   }

   public CommandDispatcher<Class6619> method18842() {
      return this.field27345;
   }

   @Nullable
   public static <S> CommandSyntaxException method18843(ParseResults<S> var0) {
      if (var0.getReader().canRead()) {
         if (var0.getExceptions().size() != 1) {
            return !var0.getContext().getRange().isEmpty()
               ? CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownArgument().createWithContext(var0.getReader())
               : CommandSyntaxException.BUILT_IN_EXCEPTIONS.dispatcherUnknownCommand().createWithContext(var0.getReader());
         } else {
            return (CommandSyntaxException)var0.getExceptions().values().iterator().next();
         }
      } else {
         return null;
      }
   }

   public static void method18844() {
      RootCommandNode<Class6619> var2 = new Class6099(Class2085.field13575).method18842().getRoot();
      Set<ArgumentType<?>> var3 = Class8651.method31104(var2);
      Set<ArgumentType<?>> var4 = var3.stream().filter(var0 -> !Class8651.method31103(var0)).collect(Collectors.toSet());
      if (!var4.isEmpty()) {
         field27344.warn(
            "Missing type registration for following arguments:\n {}", var4.stream().<CharSequence>map(var0 -> "\t" + var0).collect(Collectors.joining(",\n"))
         );
         throw new IllegalStateException("Unregistered argument types");
      }
   }
}
