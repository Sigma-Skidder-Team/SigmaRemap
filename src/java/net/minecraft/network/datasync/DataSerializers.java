package net.minecraft.network.datasync;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.UUID;
import javax.annotation.Nullable;

import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Pose;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.particles.IParticleData;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;

public class DataSerializers {
   private static String[] field33388;
   private static final Class2353<Class6466<?>> field33389 = new Class2353<Class6466<?>>(16);
   public static final Class6466<Byte> field33390 = new Class6465();
   public static final Class6466<Integer> VARINT = new Class6468();
   public static final Class6466<Float> FLOAT = new Class6467();
   public static final Class6466<String> field33393 = new Class6479();
   public static final Class6466<ITextComponent> field33394 = new Class6481();
   public static final Class6466<Optional<ITextComponent>> field33395 = new Class6484();
   public static final Class6466<ItemStack> field33396 = new Class6471();
   public static final Class6466<Optional<BlockState>> field33397 = new Class6470();
   public static final Class6466<Boolean> field33398 = new Class6478();
   public static final Class6466<IParticleData> field33399 = new Class6482();
   public static final Class6466<Class7087> field33400 = new Class6476();
   public static final Class6466<BlockPos> field33401 = new Class6483();
   public static final Class6466<Optional<BlockPos>> field33402 = new Class6474();
   public static final Class6466<Direction> field33403 = new Class6469();
   public static final Class6466<Optional<UUID>> field33404 = new Class6477();
   public static final Class6466<CompoundNBT> field33405 = new Class6480();
   public static final Class6466<Class7921> field33406 = new Class6472();
   public static final Class6466<OptionalInt> field33407 = new Class6473();
   public static final Class6466<Pose> field33408 = new Class6475();

   public static void method25804(Class6466<?> var0) {
      field33389.method9272(var0);
   }

   @Nullable
   public static Class6466<?> method25805(int var0) {
      return field33389.getByValue(var0);
   }

   public static int method25806(Class6466<?> var0) {
      return field33389.getId(var0);
   }

   static {
      method25804(field33390);
      method25804(VARINT);
      method25804(FLOAT);
      method25804(field33393);
      method25804(field33394);
      method25804(field33395);
      method25804(field33396);
      method25804(field33398);
      method25804(field33400);
      method25804(field33401);
      method25804(field33402);
      method25804(field33403);
      method25804(field33404);
      method25804(field33397);
      method25804(field33405);
      method25804(field33399);
      method25804(field33406);
      method25804(field33407);
      method25804(field33408);
   }
}
