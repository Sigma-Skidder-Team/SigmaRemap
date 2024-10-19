package mapped;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Streams;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.Util;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.ListNBT;
import net.minecraft.nbt.StringNBT;
import net.minecraft.network.DebugPacketSender;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.server.ServerWorld;
import org.apache.commons.lang3.mutable.MutableInt;

public class Class7440 {
   public static Class7493 field32013 = new Class7492();

   public static void method24029(Class8262 var0, BlockPos var1, Class7879 var2) {
      var0.method28803();
      var2.method26415(var0);
      var0.method28816(new Class8406());
      var0.method28817(var1, 2);
   }

   public static Collection<Class8262> method24030(Collection<Class8363> var0, BlockPos var1, Rotation var2, ServerWorld var3, Class7879 var4, int var5) {
      Class6101 var8 = new Class6101(var0, var1, var2, var3, var4, var5);
      var8.method18857();
      return var8.method18856();
   }

   public static Collection<Class8262> method24031(Collection<Class4871> var0, BlockPos var1, Rotation var2, ServerWorld var3, Class7879 var4, int var5) {
      return method24030(method24032(var0), var1, var2, var3, var4, var5);
   }

   public static Collection<Class8363> method24032(Collection<Class4871> var0) {
      Map<String, Collection<Class4871>> var3 = Maps.newHashMap();
      var0.forEach(var1 -> {
         String var4 = var1.method15038();
         Collection<Class4871> var5 = var3.computeIfAbsent(var4, var0xx -> Lists.newArrayList());
         var5.add(var1);
      });
      return var3.keySet().stream().<Class8363>flatMap(var1 -> {
         Collection<Class4871> var4 = var3.get(var1);
         Consumer<ServerWorld> var5 = Class7936.method26707(var1);
         MutableInt var6 = new MutableInt();
         return Streams.stream(Iterables.partition(var4, 100)).map(var4x -> new Class8363(var1 + ":" + var6.incrementAndGet(), var4, var5));
      }).collect(Collectors.toList());
   }

   private static void method24033(Class8262 var0) {
      Throwable var3 = var0.method28815();
      String var4 = (!var0.method28818() ? "(optional) " : "") + var0.method28806() + " failed! " + Util.getMessage(var3);
      method24037(var0.method28808(), !var0.method28818() ? TextFormatting.YELLOW : TextFormatting.RED, var4);
      if (var3 instanceof Class2476) {
         Class2476 var5 = (Class2476)var3;
         method24039(var0.method28808(), var5.method10473(), var5.method10472());
      }

      field32013.method24422(var0);
   }

   private static void method24034(Class8262 var0, Block var1) {
      ServerWorld var4 = var0.method28808();
      BlockPos var5 = var0.method28807();
      BlockPos var6 = new BlockPos(-1, -1, -1);
      BlockPos var7 = Class8969.method32905(var5.method8337(var6), Mirror.field13614, var0.method28821(), var5);
      var4.setBlockState(var7, Blocks.BEACON.getDefaultState().rotate(var0.method28821()));
      BlockPos var8 = var7.add(0, 1, 0);
      var4.setBlockState(var8, var1.getDefaultState());

      for (int var9 = -1; var9 <= 1; var9++) {
         for (int var10 = -1; var10 <= 1; var10++) {
            BlockPos var11 = var7.add(var9, -1, var10);
            var4.setBlockState(var11, Blocks.field36522.getDefaultState());
         }
      }
   }

   private static void method24035(Class8262 var0, String var1) {
      ServerWorld var4 = var0.method28808();
      BlockPos var5 = var0.method28807();
      BlockPos var6 = new BlockPos(-1, 1, -1);
      BlockPos var7 = Class8969.method32905(var5.method8337(var6), Mirror.field13614, var0.method28821(), var5);
      var4.setBlockState(var7, Blocks.LECTERN.getDefaultState().rotate(var0.method28821()));
      BlockState var8 = var4.getBlockState(var7);
      ItemStack var9 = method24036(var0.method28806(), var0.method28818(), var1);
      Class3354.method11919(var4, var7, var8, var9);
   }

   private static ItemStack method24036(String var0, boolean var1, String var2) {
      ItemStack var5 = new ItemStack(Items.field38047);
      ListNBT var6 = new ListNBT();
      StringBuffer var7 = new StringBuffer();
      Arrays.<String>stream(var0.split("\\.")).forEach(var1x -> var7.append(var1x).append('\n'));
      if (!var1) {
         var7.append("(optional)\n");
      }

      var7.append("-------------------\n");
      var6.add(StringNBT.valueOf(var7.toString() + var2));
      var5.setTagInfo("pages", var6);
      return var5;
   }

   private static void method24037(ServerWorld var0, TextFormatting var1, String var2) {
      var0.method6914(var0x -> true).forEach(var2x -> var2x.sendMessage(new StringTextComponent(var2).mergeStyle(var1), Util.DUMMY_UUID));
   }

   public static void method24038(ServerWorld var0) {
      DebugPacketSender.method23611(var0);
   }

   private static void method24039(ServerWorld var0, BlockPos var1, String var2) {
      DebugPacketSender.method23610(var0, var1, var2, -2130771968, Integer.MAX_VALUE);
   }

   public static void method24040(ServerWorld var0, BlockPos var1, Class7879 var2, int var3) {
      var2.method26416();
      BlockPos var6 = var1.add(-var3, 0, -var3);
      BlockPos var7 = var1.add(var3, 0, var3);
      BlockPos.method8360(var6, var7).filter(var1x -> var0.getBlockState(var1x).isIn(Blocks.field37113)).forEach(var1x -> {
         Class964 var4 = (Class964)var0.getTileEntity(var1x);
         BlockPos var5 = var4.getPos();
         MutableBoundingBox var6x = Class7803.method26053(var4);
         Class7803.method26058(var6x, var5.getY(), var0);
      });
   }

   // $VF: synthetic method
   public static void method24050(Class8262 var0, Block var1) {
      method24034(var0, var1);
   }

   // $VF: synthetic method
   public static void method24051(Class8262 var0, String var1) {
      method24035(var0, var1);
   }

   // $VF: synthetic method
   public static void method24052(Class8262 var0) {
      method24033(var0);
   }
}
