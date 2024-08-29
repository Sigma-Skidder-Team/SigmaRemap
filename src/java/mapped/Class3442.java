package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class Class3442 extends Block {
   private static String[] field19245;
   private final Block field19246;
   private static final Map<Block, Block> field19247 = Maps.newIdentityHashMap();

   public Class3442(Block var1, AbstractBlock var2) {
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
      Class1107 var5 = EntityType.field41077.method33215(var1);
      var5.method3273((double)var2.getX() + 0.5, (double)var2.getY(), (double)var2.getZ() + 0.5, 0.0F, 0.0F);
      var1.method6916(var5);
      var5.method4239();
   }

   @Override
   public void method11965(BlockState var1, ServerWorld var2, BlockPos var3, ItemStack var4) {
      super.method11965(var1, var2, var3, var4);
      if (var2.method6789().method17135(Class5462.field24228) && Class7858.method26311(Class8122.field34916, var4) == 0) {
         this.method12120(var2, var3);
      }
   }

   @Override
   public void method11560(World var1, BlockPos var2, Class7782 var3) {
      if (var1 instanceof ServerWorld) {
         this.method12120((ServerWorld)var1, var2);
      }
   }

   public static BlockState method12121(Block var0) {
      return field19247.get(var0).method11579();
   }
}
