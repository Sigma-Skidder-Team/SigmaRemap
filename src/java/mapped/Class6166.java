package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IWorld;

import java.util.Random;

public abstract class Class6166 {
   public static final Codec<Class6166> field27591 = Registry.field16130.dispatch(Class6166::method19062, Class9269::method34906);

   public abstract void method19061(IWorld var1, BlockPos var2, BlockState var3, Random var4);

   public abstract Class9269<?> method19062();
}
