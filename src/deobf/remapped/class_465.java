package remapped;

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
import net.minecraft.util.text.event.ClickEvent$class_47;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$class_48;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_465 {
   private static final Logger field_2916 = LogManager.getLogger();
   private final CommandDispatcher<class_9155> field_2914 = new CommandDispatcher();

   public class_465(class_9019 var1) {
      class_2915.method_13341(this.field_2914);
      class_1239.method_5526(this.field_2914);
      class_488.method_2378(this.field_2914);
      class_1367.method_6325(this.field_2914);
      class_4147.method_19254(this.field_2914);
      class_654.method_3008(this.field_2914);
      class_3781.method_17537(this.field_2914);
      class_9773.method_45103(this.field_2914);
      class_4665.method_21582(this.field_2914);
      class_7216.method_33054(this.field_2914);
      class_5842.method_26649(this.field_2914);
      class_8803.method_40470(this.field_2914);
      class_8271.method_38129(this.field_2914);
      class_959.method_4224(this.field_2914);
      class_6348.method_29038(this.field_2914);
      class_3411.method_15748(this.field_2914);
      class_9562.method_44204(this.field_2914);
      class_530.method_2575(this.field_2914);
      class_744.method_3378(this.field_2914);
      class_9173.method_42280(this.field_2914);
      class_6328.method_28895(this.field_2914);
      class_6085.method_27863(this.field_2914);
      class_2425.method_11053(this.field_2914);
      class_8436.method_38813(this.field_2914);
      class_7586.method_34473(this.field_2914);
      class_8295.method_38266(this.field_2914);
      class_60.method_36(this.field_2914);
      class_9209.method_42515(this.field_2914);
      class_2067.method_9660(this.field_2914);
      class_3497.method_16077(this.field_2914);
      class_5268.method_24043(this.field_2914);
      class_8552.method_39341(this.field_2914);
      class_3864.method_17912(this.field_2914);
      class_7427.method_33818(this.field_2914);
      class_8641.method_39647(this.field_2914);
      class_2085.method_9732(this.field_2914);
      class_8992.method_41245(this.field_2914);
      class_8819.method_40505(this.field_2914, var1 != class_9019.field_46137);
      class_5534.method_25137(this.field_2914);
      class_7277.method_33259(this.field_2914);
      class_5762.method_26057(this.field_2914);
      class_165.method_661(this.field_2914);
      class_7744.method_35062(this.field_2914);
      class_1321.method_6034(this.field_2914);
      class_3338.method_15316(this.field_2914);
      class_5227.method_23924(this.field_2914);
      class_2445.method_11171(this.field_2914);
      class_7334.method_33424(this.field_2914);
      class_9202.method_42457(this.field_2914);
      class_6515.method_29691(this.field_2914);
      class_3532.method_16313(this.field_2914);
      class_9576.method_44252(this.field_2914);
      class_4238.method_19767(this.field_2914);
      class_4158.method_19296(this.field_2914);
      class_4022.method_18532(this.field_2914);
      if (class_7665.field_38958) {
         class_6769.method_31066(this.field_2914);
      }

      if (class_9019.method_41382(var1)) {
         class_4322.method_20113(this.field_2914);
         class_5411.method_24622(this.field_2914);
         class_4861.method_22359(this.field_2914);
         class_9427.method_43638(this.field_2914);
         class_921.method_4039(this.field_2914);
         class_4395.method_20470(this.field_2914);
         class_7197.method_32952(this.field_2914);
         class_6565.method_30008(this.field_2914);
         class_7177.method_32890(this.field_2914);
         class_6607.method_30395(this.field_2914);
         class_8747.method_40151(this.field_2914);
         class_5699.method_25775(this.field_2914);
         class_2414.method_11001(this.field_2914);
      }

      if (class_9019.method_41384(var1)) {
         class_6253.method_28546(this.field_2914);
      }

      this.field_2914
         .findAmbiguities(
            (var1x, var2, var3, var4) -> field_2916.warn(
                  "Ambiguity between arguments {} and {} with inputs: {}", this.field_2914.getPath(var2), this.field_2914.getPath(var3), var4
               )
         );
      this.field_2914.setConsumer((var0, var1x, var2) -> ((class_9155)var0.getSource()).method_42188(var0, var1x, var2));
   }

   public int method_2232(class_9155 var1, String var2) {
      StringReader var5 = new StringReader(var2);
      if (var5.canRead() && var5.peek() == '/') {
         var5.skip();
      }

      var1.method_42177().method_1704().method_16056(var2);

      byte var22;
      try {
         return this.field_2914.execute(var5, var1);
      } catch (class_720 var15) {
         var1.method_42175(var15.method_3276());
         return 0;
      } catch (CommandSyntaxException var16) {
         var1.method_42175(TextComponentUtils.toTextComponent(var16.getRawMessage()));
         if (var16.getInput() != null && var16.getCursor() >= 0) {
            int var20 = Math.min(var16.getInput().length(), var16.getCursor());
            IFormattableTextComponent var23 = new StringTextComponent("")
               .mergeStyle(TextFormatting.GRAY)
               .modifyStyle(var1x -> var1x.setClickEvent(new ClickEvent(ClickEvent$class_47.SUGGEST_COMMAND, var2)));
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
            var1.method_42175(var23);
         }

         return 0;
      } catch (Exception var17) {
         StringTextComponent var7 = new StringTextComponent(var17.getMessage() == null ? var17.getClass().getName() : var17.getMessage());
         if (field_2916.isDebugEnabled()) {
            field_2916.error("Command exception: {}", var2, var17);
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

         var1.method_42175(
            new TranslationTextComponent("command.failed").modifyStyle(var1x -> var1x.setHoverEvent(new HoverEvent(HoverEvent$class_48.SHOW_TEXT, var7)))
         );
         if (class_7665.field_38958) {
            var1.method_42175(new StringTextComponent(Util.method_44664(var17)));
            field_2916.error("'" + var2 + "' threw an exception", var17);
         }

         var22 = 0;
      } finally {
         var1.method_42177().method_1704().method_16054();
      }

      return var22;
   }

   public void method_2233(class_9359 var1) {
      HashMap var4 = Maps.newHashMap();
      RootCommandNode var5 = new RootCommandNode();
      var4.put(this.field_2914.getRoot(), var5);
      this.method_2230(this.field_2914.getRoot(), var5, var1.method_37320(), var4);
      var1.field_47794.method_4156(new class_8376(var5));
   }

   private void method_2230(
      CommandNode<class_9155> var1, CommandNode<class_8773> var2, class_9155 var3, Map<CommandNode<class_9155>, CommandNode<class_8773>> var4
   ) {
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
                  var10.suggests(class_7510.method_34238(var10.getSuggestionsProvider()));
               }
            }

            if (var9.getRedirect() != null) {
               var9.redirect((CommandNode)var4.get(var9.getRedirect()));
            }

            CommandNode var11 = var9.build();
            var4.put(var8, var11);
            var2.addChild(var11);
            if (!var8.getChildren().isEmpty()) {
               this.method_2230(var8, var11, var3, var4);
            }
         }
      }
   }

   public static LiteralArgumentBuilder<class_9155> method_2231(String var0) {
      return LiteralArgumentBuilder.literal(var0);
   }

   public static <T> RequiredArgumentBuilder<class_9155, T> method_2236(String var0, ArgumentType<T> var1) {
      return RequiredArgumentBuilder.argument(var0, var1);
   }

   public static Predicate<String> method_2235(class_1852 var0) {
      return var1 -> {
         try {
            var0.method_8192(new StringReader(var1));
            return true;
         } catch (CommandSyntaxException var5) {
            return false;
         }
      };
   }

   public CommandDispatcher<class_9155> method_2229() {
      return this.field_2914;
   }

   @Nullable
   public static <S> CommandSyntaxException method_2234(ParseResults<S> var0) {
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

   public static void method_2227() {
      RootCommandNode var2 = new class_465(class_9019.field_46138).method_2229().getRoot();
      Set var3 = class_5398.method_24578(var2);
      Set var4 = var3.stream().filter(var0 -> !class_5398.method_24579((ArgumentType<?>)var0)).collect(Collectors.toSet());
      if (!var4.isEmpty()) {
         field_2916.warn(
            "Missing type registration for following arguments:\n {}", var4.stream().<CharSequence>map(var0 -> "\t" + var0).collect(Collectors.joining(",\n"))
         );
         throw new IllegalStateException("Unregistered argument types");
      }
   }
}
