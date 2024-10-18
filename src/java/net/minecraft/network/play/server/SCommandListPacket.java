package net.minecraft.network.play.server;

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
import mapped.*;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.network.IPacket;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class SCommandListPacket implements IPacket<IClientPlayNetHandler> {
   private RootCommandNode<Class6618> field24922;

   public SCommandListPacket() {
   }

   public SCommandListPacket(RootCommandNode<Class6618> var1) {
      this.field24922 = var1;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      Class8125[] var4 = new Class8125[var1.readVarInt()];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = method17655(var1);
      }

      method17652(var4);
      this.field24922 = (RootCommandNode<Class6618>)Class8125.method28147(var4[var1.readVarInt()]);
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      Object2IntMap var4 = method17653(this.field24922);
      CommandNode[] var5 = method17654(var4);
      var1.writeVarInt(var5.length);

      for (CommandNode var9 : var5) {
         method17657(var1, var9, var4);
      }

      var1.writeVarInt(var4.get(this.field24922));
   }

   private static void method17652(Class8125[] var0) {
      List<Class8125> var3 = Lists.newArrayList(var0);

      while (!var3.isEmpty()) {
         boolean var4 = var3.removeIf(var1 -> var1.method28145(var0));
         if (!var4) {
            throw new IllegalStateException("Server sent an impossible command tree");
         }
      }
   }

   private static Object2IntMap<CommandNode<Class6618>> method17653(RootCommandNode<Class6618> var0) {
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

   private static CommandNode<Class6618>[] method17654(Object2IntMap<CommandNode<Class6618>> var0) {
      CommandNode[] var3 = new CommandNode[var0.size()];
      ObjectIterator var4 = Object2IntMaps.fastIterable(var0).iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         var3[var5.getIntValue()] = (CommandNode)var5.getKey();
      }

      return var3;
   }

   private static Class8125 method17655(PacketBuffer var0) {
      byte var3 = var0.readByte();
      int[] var4 = var0.readVarIntArray();
      int bruhZero = 0;
      ArgumentBuilder var6 = method17656(var0, var3);
      return new Class8125(var6, var3, bruhZero, var4);
   }

   @Nullable
   private static ArgumentBuilder<Class6618, ?> method17656(PacketBuffer var0, byte var1) {
      int var4 = var1 & 3;
      if (var4 != 2) {
         return var4 != 1 ? null : LiteralArgumentBuilder.literal(var0.readString(32767));
      } else {
         String var5 = var0.readString(32767);
         ArgumentType var6 = Class8651.method31100(var0);
         if (var6 != null) {
            RequiredArgumentBuilder var7 = RequiredArgumentBuilder.argument(var5, var6);
            if ((var1 & 16) != 0) {
               var7.suggests(Class9222.method34677(var0.readResourceLocation()));
            }

            return var7;
         } else {
            return null;
         }
      }
   }

   private static void method17657(PacketBuffer var0, CommandNode<Class6618> var1, Map<CommandNode<Class6618>, Integer> var2) {
      int var5 = 0;
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
      var0.writeVarInt(var1.getChildren().size());

      for (CommandNode var7 : var1.getChildren()) {
         var0.writeVarInt((Integer)var2.get(var7));
      }

      if (var1.getRedirect() != null) {
         var0.writeVarInt((Integer)var2.get(var1.getRedirect()));
      }

      if (!(var1 instanceof ArgumentCommandNode)) {
         if (var1 instanceof LiteralCommandNode) {
            var0.writeString(((LiteralCommandNode)var1).getLiteral());
         }
      } else {
         ArgumentCommandNode var9 = (ArgumentCommandNode)var1;
         var0.writeString(var9.getName());
         Class8651.method31099(var0, var9.getType());
         if (var9.getCustomSuggestions() != null) {
            var0.writeResourceLocation(Class9222.method34678(var9.getCustomSuggestions()));
         }
      }
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleCommandList(this);
   }

   public RootCommandNode<Class6618> method17658() {
      return this.field24922;
   }
}
