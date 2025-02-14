package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.storage.MapData;

import javax.annotation.Nullable;
import java.util.Locale;
import java.util.Random;

public class Class5398 implements Class5391 {
   private final int field24069;
   private final Structure<?> field24070;
   private final MapDecorationType field24071;
   private final int field24072;
   private final int field24073;

   public Class5398(int var1, Structure<?> var2, MapDecorationType var3, int var4, int var5) {
      this.field24069 = var1;
      this.field24070 = var2;
      this.field24071 = var3;
      this.field24072 = var4;
      this.field24073 = var5;
   }

   @Nullable
   @Override
   public Class9346 method16977(Entity var1, Random var2) {
      if (var1.world instanceof ServerWorld) {
         ServerWorld var5 = (ServerWorld)var1.world;
         BlockPos var6 = var5.method6943(this.field24070, var1.getPosition(), 100, true);
         if (var6 == null) {
            return null;
         } else {
            ItemStack var7 = Class3316.method11859(var5, var6.getX(), var6.getZ(), (byte)2, true, true);
            Class3316.method11868(var5, var7);
            MapData.method24595(var7, var6, "+", this.field24071);
            var7.method32150(new TranslationTextComponent("filled_map." + this.field24070.method11373().toLowerCase(Locale.ROOT)));
            return new Class9346(
               new ItemStack(Items.EMERALD, this.field24069), new ItemStack(Items.COMPASS), var7, this.field24072, this.field24073, 0.2F
            );
         }
      } else {
         return null;
      }
   }
}
