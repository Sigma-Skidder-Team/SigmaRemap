package net.minecraft.world.storage;

import com.google.common.collect.Maps;
import mapped.Class7534;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.ResourceLocation;

import java.util.Map;
import java.util.stream.Stream;

public class CommandStorage {
   private final Map<String, Class7534> field40484 = Maps.newHashMap();
   private final DimensionSavedDataManager field40485;

   public CommandStorage(DimensionSavedDataManager var1) {
      this.field40485 = var1;
   }

   private Class7534 method32747(String var1, String var2) {
      Class7534 var5 = new Class7534(var2);
      this.field40484.put(var1, var5);
      return var5;
   }

   public CompoundNBT method32748(ResourceLocation var1) {
      String var4 = var1.getNamespace();
      String var5 = method32751(var4);
      Class7534 var6 = this.field40485.<Class7534>get(() -> this.method32747(var4, var5), var5);
      return var6 == null ? new CompoundNBT() : var6.method24624(var1.getPath());
   }

   public void method32749(ResourceLocation var1, CompoundNBT var2) {
      String var5 = var1.getNamespace();
      String var6 = method32751(var5);
      this.field40485.<Class7534>getOrCreate(() -> this.method32747(var5, var6), var6).method24625(var1.getPath(), var2);
   }

   public Stream<ResourceLocation> method32750() {
      return this.field40484.entrySet().stream().<ResourceLocation>flatMap(var0 -> var0.getValue().method24626(var0.getKey()));
   }

   private static String method32751(String var0) {
      return "command_storage_" + var0;
   }
}
