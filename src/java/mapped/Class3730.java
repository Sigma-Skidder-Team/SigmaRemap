package mapped;

import com.google.common.collect.ImmutableMap;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

import java.util.Optional;

public class Class3730 extends Class3676<MobEntity> {
   private static String[] field19833;
   private final float field19834;
   private BlockPos field19835;
   private int field19836;
   private int field19837;
   private int field19838;

   public Class3730(float var1) {
      super(ImmutableMap.of(Class8830.field39834, Class2217.field14484, Class8830.field39824, Class2217.field14485));
      this.field19834 = var1;
   }

   public boolean method12508(ServerWorld var1, MobEntity var2) {
      return var2.isChild() && this.method12648(var1, var2);
   }

   public void method12502(ServerWorld var1, MobEntity var2, long var3) {
      super.method12502(var1, var2, var3);
      this.method12652(var2).ifPresent(var3x -> {
         this.field19835 = var3x;
         this.field19836 = 100;
         this.field19837 = 3 + var1.rand.nextInt(4);
         this.field19838 = 0;
         this.method12647(var2, var3x);
      });
   }

   public void method12506(ServerWorld var1, MobEntity var2, long var3) {
      super.method12506(var1, var2, var3);
      this.field19835 = null;
      this.field19836 = 0;
      this.field19837 = 0;
      this.field19838 = 0;
   }

   public boolean method12499(ServerWorld var1, MobEntity var2, long var3) {
      return var2.isChild()
         && this.field19835 != null
         && this.method12651(var1, this.field19835)
         && !this.method12653(var1, var2)
         && !this.method12654(var1, var2);
   }

   @Override
   public boolean method12507(long var1) {
      return false;
   }

   public void method12504(ServerWorld var1, MobEntity var2, long var3) {
      if (this.method12649(var1, var2)) {
         if (this.field19838 <= 0) {
            if (this.method12650(var1, var2)) {
               var2.method4229().method27049();
               this.field19837--;
               this.field19838 = 5;
            }
         } else {
            this.field19838--;
         }
      } else {
         this.field19836--;
      }
   }

   private void method12647(MobEntity var1, BlockPos var2) {
      var1.getBrain().method21406(Class8830.field39824, new Class8999(var2, this.field19834, 0));
   }

   private boolean method12648(ServerWorld var1, MobEntity var2) {
      return this.method12649(var1, var2) || this.method12652(var2).isPresent();
   }

   private boolean method12649(ServerWorld var1, MobEntity var2) {
      BlockPos var5 = var2.getPosition();
      BlockPos var6 = var5.down();
      return this.method12651(var1, var5) || this.method12651(var1, var6);
   }

   private boolean method12650(ServerWorld var1, MobEntity var2) {
      return this.method12651(var1, var2.getPosition());
   }

   private boolean method12651(ServerWorld var1, BlockPos var2) {
      return var1.getBlockState(var2).method23446(BlockTags.field32770);
   }

   private Optional<BlockPos> method12652(MobEntity var1) {
      return var1.getBrain().<BlockPos>method21410(Class8830.field39834);
   }

   private boolean method12653(ServerWorld var1, MobEntity var2) {
      return !this.method12649(var1, var2) && this.field19836 <= 0;
   }

   private boolean method12654(ServerWorld var1, MobEntity var2) {
      return this.method12649(var1, var2) && this.field19837 <= 0;
   }
}
