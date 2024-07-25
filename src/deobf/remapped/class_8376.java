package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Queues;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.tree.ArgumentCommandNode;
import com.mojang.brigadier.tree.CommandNode;
import com.mojang.brigadier.tree.LiteralCommandNode;
import com.mojang.brigadier.tree.RootCommandNode;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntMaps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.Nullable;

public class class_8376 implements class_6310<class_392> {
   private RootCommandNode<class_8773> field_42875;

   public class_8376() {
   }

   public class_8376(RootCommandNode<class_8773> var1) {
      this.field_42875 = var1;
   }

   @Override
   public void method_28775(class_8248 var1) throws IOException {
      class_3675[] var4 = new class_3675[var1.method_37778()];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = method_38588(var1);
      }

      method_38589(var4);
      this.field_42875 = (RootCommandNode<class_8773>)class_3675.method_17051(var4[var1.method_37778()]);
   }

   @Override
   public void method_28776(class_8248 var1) throws IOException {
      Object2IntMap var4 = method_38584(this.field_42875);
      CommandNode[] var5 = method_38590(var4);
      var1.method_37743(var5.length);

      for (CommandNode var9 : var5) {
         method_38591(var1, var9, var4);
      }

      var1.method_37743(var4.get(this.field_42875));
   }

   private static void method_38589(class_3675[] var0) {
      ArrayList var3 = Lists.newArrayList(var0);

      while (!var3.isEmpty()) {
         boolean var4 = var3.removeIf(var1 -> var1.method_17052(var0));
         if (!var4) {
            throw new IllegalStateException("Server sent an impossible command tree");
         }
      }
   }

   private static Object2IntMap<CommandNode<class_8773>> method_38584(RootCommandNode<class_8773> var0) {
      Object2IntOpenHashMap var3 = new Object2IntOpenHashMap();
      ArrayDeque var4 = Queues.newArrayDeque();
      var4.add(var0);

      CommandNode var5;
      while ((var5 = (CommandNode)var4.poll()) != null) {
         if (!var3.containsKey(var5)) {
            int var6 = var3.size();
            var3.put(var5, var6);
            var4.addAll(var5.getChildren());
            if (var5.getRedirect() != null) {
               var4.add(var5.getRedirect());
            }
         }
      }

      return var3;
   }

   private static CommandNode<class_8773>[] method_38590(Object2IntMap<CommandNode<class_8773>> var0) {
      CommandNode[] var3 = new CommandNode[var0.size()];
      ObjectIterator var4 = Object2IntMaps.fastIterable(var0).iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         var3[var5.getIntValue()] = (CommandNode)var5.getKey();
      }

      return var3;
   }

   private static class_3675 method_38588(class_8248 var0) {
      byte var3 = var0.readByte();
      int[] var4 = var0.method_37762();
      byte var5 = 0;
      ArgumentBuilder var6 = method_38586(var0, var3);
      return new class_3675(var6, var3, var5, var4, null);
   }

   @Nullable
   private static ArgumentBuilder<class_8773, ?> method_38586(class_8248 var0, byte var1) {
      int var4 = var1 & 3;
      if (var4 != 2) {
         return var4 != 1 ? null : LiteralArgumentBuilder.literal(var0.method_37784(32767));
      } else {
         String var5 = var0.method_37784(32767);
         ArgumentType var6 = class_5398.method_24574(var0);
         if (var6 != null) {
            RequiredArgumentBuilder var7 = RequiredArgumentBuilder.argument(var5, var6);
            if ((var1 & 16) != 0) {
               var7.suggests(class_7510.method_34237(var0.method_37768()));
            }

            return var7;
         } else {
            return null;
         }
      }
   }

   private static void method_38591(class_8248 var0, CommandNode<class_8773> var1, Map<CommandNode<class_8773>, Integer> var2) {
      byte var5 = 0;
      if (var1.getRedirect() != null) {
         var5 = (byte)(var5 | 8);
      }

      if (var1.getCommand() != null) {
         var5 = (byte)(var5 | 4);
      }

      if (!(var1 instanceof RootCommandNode)) {
         if (!(var1 instanceof ArgumentCommandNode)) {
            if (!(var1 instanceof LiteralCommandNode)) {
               throw new UnsupportedOperationException("Unknown node type " + var1);
            }

            var5 = (byte)(var5 | 1);
         } else {
            var5 = (byte)(var5 | 2);
            if (((ArgumentCommandNode)var1).getCustomSuggestions() != null) {
               var5 = (byte)(var5 | 16);
            }
         }
      } else {
         var5 = (byte)(var5 | 0);
      }

      var0.writeByte(var5);
      var0.method_37743(var1.getChildren().size());

      for (CommandNode var7 : var1.getChildren()) {
         var0.method_37743((Integer)var2.get(var7));
      }

      if (var1.getRedirect() != null) {
         var0.method_37743((Integer)var2.get(var1.getRedirect()));
      }

      if (!(var1 instanceof ArgumentCommandNode)) {
         if (var1 instanceof LiteralCommandNode) {
            var0.method_37760(((LiteralCommandNode)var1).getLiteral());
         }
      } else {
         ArgumentCommandNode var9 = (ArgumentCommandNode)var1;
         var0.method_37760(var9.getName());
         class_5398.method_24577(var0, var9.getType());
         if (var9.getCustomSuggestions() != null) {
            var0.method_37780(class_7510.method_34234(var9.getCustomSuggestions()));
         }
      }
   }

   public void method_38592(class_392 var1) {
      var1.method_1922(this);
   }

   public RootCommandNode<class_8773> method_38585() {
      return this.field_42875;
   }
}
