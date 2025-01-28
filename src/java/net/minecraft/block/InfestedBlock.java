package net.minecraft.block;

import com.google.common.collect.Maps;
import mapped.Explosion;
import mapped.SilverfishEntity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

import java.util.Map;

public class InfestedBlock extends Block {
   private static String[] field19245;
   private final Block field19246;
   private static final Map<Block, Block> field19247 = Maps.newIdentityHashMap();

   public InfestedBlock(Block var1, Properties var2) {
      super(var2);
      this.field19246 = var1;
      field19247.put(var1, this);
   }

   public Block method12118() {
      return this.field19246;
   }

   public static boolean method12119(BlockState var0) {
      return field19247.containsKey(var0.getBlock());
   }

   private void method12120(ServerWorld var1, BlockPos var2) {
      SilverfishEntity var5 = EntityType.SILVERFISH.create(var1);
      var5.setLocationAndAngles((double)var2.getX() + 0.5, (double)var2.getY(), (double)var2.getZ() + 0.5, 0.0F, 0.0F);
      var1.addEntity(var5);
      var5.method4239();
   }

   @Override
   public void method11965(BlockState var1, ServerWorld var2, BlockPos var3, ItemStack var4) {
      super.method11965(var1, var2, var3, var4);
      if (var2.getGameRules().getBoolean(GameRules.field24228) && EnchantmentHelper.getEnchantmentLevel(Enchantments.SILK_TOUCH, var4) == 0) {
         this.method12120(var2, var3);
      }
   }

   @Override
   public void onExplosionDestroy(World var1, BlockPos var2, Explosion var3) {
      if (var1 instanceof ServerWorld) {
         this.method12120((ServerWorld)var1, var2);
      }
   }

   public static BlockState method12121(Block var0) {
      return field19247.get(var0).getDefaultState();
   }
}
