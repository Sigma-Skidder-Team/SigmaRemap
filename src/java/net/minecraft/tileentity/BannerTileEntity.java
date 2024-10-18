package net.minecraft.tileentity;

import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.server.SUpdateTileEntityPacket;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class BannerTileEntity extends TileEntity implements INameable {
   private ITextComponent field5376;
   private Class112 field5377 = Class112.field386;
   private ListNBT field5378;
   private boolean field5379;
   private List<Pair<Class2154, Class112>> field5380;

   public BannerTileEntity() {
      super(TileEntityType.field21439);
   }

   public BannerTileEntity(Class112 var1) {
      this();
      this.field5377 = var1;
   }

   @Nullable
   public static ListNBT method3886(ItemStack var0) {
      ListNBT var3 = null;
      CompoundNBT var4 = var0.method32145("BlockEntityTag");
      if (var4 != null && var4.contains("Patterns", 9)) {
         var3 = var4.method131("Patterns", 10).method79();
      }

      return var3;
   }

   public void method3887(ItemStack var1, Class112 var2) {
      this.field5378 = method3886(var1);
      this.field5377 = var2;
      this.field5380 = null;
      this.field5379 = true;
      this.field5376 = !var1.method32152() ? null : var1.method32149();
   }

   @Override
   public ITextComponent getName() {
      return (ITextComponent)(this.field5376 == null ? new TranslationTextComponent("block.minecraft.banner") : this.field5376);
   }

   @Nullable
   @Override
   public ITextComponent method3380() {
      return this.field5376;
   }

   public void method3888(ITextComponent var1) {
      this.field5376 = var1;
   }

   @Override
   public CompoundNBT write(CompoundNBT var1) {
      super.write(var1);
      if (this.field5378 != null) {
         var1.put("Patterns", this.field5378);
      }

      if (this.field5376 != null) {
         var1.method109("CustomName", ITextComponent$Serializer.toJson(this.field5376));
      }

      return var1;
   }

   @Override
   public void read(BlockState var1, CompoundNBT var2) {
      super.read(var1, var2);
      if (var2.contains("CustomName", 8)) {
         this.field5376 = ITextComponent$Serializer.getComponentFromJson(var2.getString("CustomName"));
      }

      if (!this.method3770()) {
         this.field5377 = null;
      } else {
         this.field5377 = ((Class3359)this.getBlockState().getBlock()).method11936();
      }

      this.field5378 = var2.method131("Patterns", 10);
      this.field5380 = null;
      this.field5379 = true;
   }

   @Nullable
   @Override
   public SUpdateTileEntityPacket method3776() {
      return new SUpdateTileEntityPacket(this.pos, 6, this.method3777());
   }

   @Override
   public CompoundNBT method3777() {
      return this.write(new CompoundNBT());
   }

   public static int method3889(ItemStack var0) {
      CompoundNBT var3 = var0.method32145("BlockEntityTag");
      return var3 != null && var3.contains("Patterns") ? var3.method131("Patterns", 10).size() : 0;
   }

   public List<Pair<Class2154, Class112>> method3890() {
      if (this.field5380 == null && this.field5379) {
         this.field5380 = getPatternColorData(this.method3894(this::getBlockState), this.field5378);
      }

      return this.field5380;
   }

   public static List<Pair<Class2154, Class112>> getPatternColorData(Class112 var0, ListNBT var1) {
      ArrayList var4 = Lists.newArrayList();
      var4.add(Pair.of(Class2154.field14082, var0));
      if (var1 != null) {
         for (int var5 = 0; var5 < var1.size(); var5++) {
            CompoundNBT var6 = var1.method153(var5);
            Class2154 var7 = Class2154.method8872(var6.getString("Pattern"));
            if (var7 != null) {
               int var8 = var6.getInt("Color");
               var4.add(Pair.of(var7, Class112.method315(var8)));
            }
         }
      }

      return var4;
   }

   public static void method3892(ItemStack var0) {
      CompoundNBT var3 = var0.method32145("BlockEntityTag");
      if (var3 != null && var3.contains("Patterns", 9)) {
         ListNBT var4 = var3.method131("Patterns", 10);
         if (!var4.isEmpty()) {
            var4.remove(var4.size() - 1);
            if (var4.isEmpty()) {
               var0.method32146("BlockEntityTag");
            }
         }
      }
   }

   public ItemStack method3893(BlockState var1) {
      ItemStack var4 = new ItemStack(Class3360.method11937(this.method3894(() -> var1)));
      if (this.field5378 != null && !this.field5378.isEmpty()) {
         var4.method32144("BlockEntityTag").put("Patterns", this.field5378.method79());
      }

      if (this.field5376 != null) {
         var4.method32150(this.field5376);
      }

      return var4;
   }

   public Class112 method3894(Supplier<BlockState> var1) {
      if (this.field5377 == null) {
         this.field5377 = ((Class3359)((BlockState)var1.get()).getBlock()).method11936();
      }

      return this.field5377;
   }
}
