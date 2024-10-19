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

import net.minecraft.command.ISuggestionProvider;
import net.minecraft.command.impl.BossBarCommand;
import net.minecraft.util.Util;
import net.minecraft.command.CommandSource;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.play.server.SCommandListPacket;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextComponentUtils;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.ClickEvent$Action;
import net.minecraft.util.text.event.HoverEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Commands {
   private static final Logger LOGGER = LogManager.getLogger();
   private final CommandDispatcher<CommandSource> dispatcher = new CommandDispatcher<>();

   public Commands(EnvironmentType envType) {
      Class7848.method26285(this.dispatcher);
      Class6987.method21610(this.dispatcher);
      Class6137.method18958(this.dispatcher);
      BossBarCommand.register(this.dispatcher);
      Class8284.method28947(this.dispatcher);
      Class6450.method19588(this.dispatcher);
      Class8158.method28315(this.dispatcher);
      Class9813.method38700(this.dispatcher);
      Class8456.method29738(this.dispatcher);
      Class9145.method34158(this.dispatcher);
      Class8773.method31643(this.dispatcher);
      Class9548.method36984(this.dispatcher);
      Class9410.method36043(this.dispatcher);
      Class6795.method20701(this.dispatcher);
      Class8910.method32556(this.dispatcher);
      Class8031.method27540(this.dispatcher);
      Class9749.method38286(this.dispatcher);
      Class6206.method19111(this.dispatcher);
      Class6587.method19960(this.dispatcher);
      Class9643.method37594(this.dispatcher);
      Class8909.method32551(this.dispatcher);
      Class8842.method32029(this.dispatcher);
      Class7679.method25264(this.dispatcher);
      Class9450.method36331(this.dispatcher);
      Class9234.method34726(this.dispatcher);
      Class9417.method36131(this.dispatcher);
      Class2791.method10982(this.dispatcher);
      Class9653.method37658(this.dispatcher);
      Class7508.method24477(this.dispatcher);
      Class8061.method27671(this.dispatcher);
      Class8621.method30876(this.dispatcher);
      Class9482.method36607(this.dispatcher);
      Class8194.method28495(this.dispatcher);
      Class9195.method34454(this.dispatcher);
      Class9504.method36698(this.dispatcher);
      Class7517.method24504(this.dispatcher);
      Class9601.method37271(this.dispatcher);
      Class9554.method37005(this.dispatcher, envType != EnvironmentType.INTEGRATED);
      Class8686.method31294(this.dispatcher);
      Class9160.method34194(this.dispatcher);
      Class8751.method31569(this.dispatcher);
      Class4533.method14453(this.dispatcher);
      Class9271.method34922(this.dispatcher);
      Class7049.method21956(this.dispatcher);
      Class8002.method27335(this.dispatcher);
      Class8615.method30863(this.dispatcher);
      Class7697.method25326(this.dispatcher);
      Class9175.method34285(this.dispatcher);
      Class9651.method37644(this.dispatcher);
      Class8957.method32725(this.dispatcher);
      Class8071.method27787(this.dispatcher);
      Class9752.method38309(this.dispatcher);
      Class8322.method29142(this.dispatcher);
      Class8295.method28988(this.dispatcher);
      Class8243.method28741(this.dispatcher);
      if (SharedConstants.developmentMode) {
         Class9037.method33489(this.dispatcher);
      }

     // if (EnvironmentType.method8739(envType))
      {
         Class8345.method29252(this.dispatcher);
         Class8658.method31159(this.dispatcher);
         Class8508.method30139(this.dispatcher);
         Class9707.method38035(this.dispatcher);
         Class6752.method20581(this.dispatcher);
         Class8373.method29330(this.dispatcher);
         Class9141.method34130(this.dispatcher);
         Class8971.method32923(this.dispatcher);
         Class9136.method34112(this.dispatcher);
         Class8987.method33189(this.dispatcher);
         Class9531.method36833(this.dispatcher);
         Class8734.method31520(this.dispatcher);
         Class7676.method25217(this.dispatcher);
      }

      //if (EnvironmentType.method8740(envType))
      {
         Class8883.method32320(this.dispatcher);
      }

      this.dispatcher
         .findAmbiguities(
            (var1x, var2, var3, var4) -> LOGGER.warn(
                  "Ambiguity between arguments {} and {} with inputs: {}", this.dispatcher.getPath(var2), this.dispatcher.getPath(var3), var4
               )
         );
      this.dispatcher.setConsumer((var0, var1x, var2) -> ((CommandSource)var0.getSource()).method20182(var0, var1x, var2));
   }

   public int handleCommand(CommandSource var1, String var2) {
      StringReader var5 = new StringReader(var2);
      if (var5.canRead() && var5.peek() == '/') {
         var5.skip();
      }

      var1.getServer().method1420().startSection(var2);

      byte var22;
      try {
         return this.dispatcher.execute(var5, var1);
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
         if (LOGGER.isDebugEnabled()) {
            LOGGER.error("Command exception: {}", var2, var17);
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
            new TranslationTextComponent("command.failed").modifyStyle(var1x -> var1x.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, var7)))
         );
         if (SharedConstants.developmentMode) {
            var1.method20181(new StringTextComponent(Util.getMessage(var17)));
            LOGGER.error("'" + var2 + "' threw an exception", var17);
         }

         var22 = 0;
      } finally {
         var1.getServer().method1420().endSection();
      }

      return var22;
   }

   public void method18837(ServerPlayerEntity var1) {
      HashMap var4 = Maps.newHashMap();
      RootCommandNode var5 = new RootCommandNode();
      var4.put(this.dispatcher.getRoot(), var5);
      this.method18838(this.dispatcher.getRoot(), var5, var1.getCommandSource(), var4);
      var1.connection.sendPacket(new SCommandListPacket(var5));
   }

   private void method18838(CommandNode<CommandSource> var1, CommandNode<ISuggestionProvider> var2, CommandSource var3, Map<CommandNode<CommandSource>, CommandNode<ISuggestionProvider>> var4) {
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

   public static LiteralArgumentBuilder<CommandSource> method18839(String var0) {
      return LiteralArgumentBuilder.literal(var0);
   }

   public static <T> RequiredArgumentBuilder<CommandSource, T> method18840(String var0, ArgumentType<T> var1) {
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

   public CommandDispatcher<CommandSource> method18842() {
      return this.dispatcher;
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
      RootCommandNode<CommandSource> var2 = new Commands(EnvironmentType.field13575).method18842().getRoot();
      Set<ArgumentType<?>> var3 = Class8651.method31104(var2);
      Set<ArgumentType<?>> var4 = var3.stream().filter(var0 -> !Class8651.method31103(var0)).collect(Collectors.toSet());
      if (!var4.isEmpty()) {
         LOGGER.warn(
            "Missing type registration for following arguments:\n {}", var4.stream().<CharSequence>map(var0 -> "\t" + var0).collect(Collectors.joining(",\n"))
         );
         throw new IllegalStateException("Unregistered argument types");
      }
   }

   public enum EnvironmentType {
      field13575(true, true),
      DEDICATED(false, true),
      INTEGRATED(true, false);

      private final boolean field13578;
      private final boolean field13579;
      private static final EnvironmentType[] field13580 = new EnvironmentType[]{field13575, DEDICATED, INTEGRATED};

      private EnvironmentType(boolean var3, boolean var4) {
         this.field13578 = var3;
         this.field13579 = var4;
      }

   }
}
