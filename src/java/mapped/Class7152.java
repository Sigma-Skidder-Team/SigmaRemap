package mapped;

import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;
import java.util.function.Function;

import net.minecraft.block.BlockState;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class7152 implements Class7151 {
   private static final SimpleCommandExceptionType field30723 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.data.block.invalid"));
   public static final Function<String, Class8196> field30724 = var0 -> new Class8197(var0);
   private final TileEntity field30725;
   private final BlockPos field30726;

   public Class7152(TileEntity var1, BlockPos var2) {
      this.field30725 = var1;
      this.field30726 = var2;
   }

   @Override
   public void method22311(CompoundNBT var1) {
      var1.method102("x", this.field30726.getX());
      var1.method102("y", this.field30726.getY());
      var1.method102("z", this.field30726.getZ());
      BlockState var4 = this.field30725.method3734().getBlockState(this.field30726);
      this.field30725.method3645(var4, var1);
      this.field30725.method3622();
      this.field30725.method3734().notifyBlockUpdate(this.field30726, var4, var4, 3);
   }

   @Override
   public CompoundNBT method22312() {
      return this.field30725.write(new CompoundNBT());
   }

   @Override
   public ITextComponent method22313() {
      return new TranslationTextComponent(
         "commands.data.block.modified", this.field30726.getX(), this.field30726.getY(), this.field30726.getZ()
      );
   }

   @Override
   public ITextComponent method22314(Class30 var1) {
      return new TranslationTextComponent(
         "commands.data.block.query", this.field30726.getX(), this.field30726.getY(), this.field30726.getZ(), var1.method82()
      );
   }

   @Override
   public ITextComponent method22315(Class9670 var1, double var2, int var4) {
      return new TranslationTextComponent(
         "commands.data.block.get",
         var1,
         this.field30726.getX(),
         this.field30726.getY(),
         this.field30726.getZ(),
         String.format(Locale.ROOT, "%.2f", var2),
         var4
      );
   }

   // $VF: synthetic method
   public static SimpleCommandExceptionType method22317() {
      return field30723;
   }
}
