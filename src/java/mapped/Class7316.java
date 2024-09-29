package mapped;

import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.PlayerController;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class Class7316 extends PlayerController {
   private static String[] field31370;
   private boolean field31371 = false;
   private BlockPos field31372 = null;
   private Entity field31373 = null;

   public Class7316(Minecraft var1, ClientPlayNetHandler var2) {
      super(var1, var2);
   }

   @Override
   public boolean clickBlock(BlockPos var1, Direction var2) {
      this.field31371 = true;
      this.field31372 = var1;
      boolean var5 = super.clickBlock(var1, var2);
      this.field31371 = false;
      return var5;
   }

   @Override
   public boolean onPlayerDamageBlock(BlockPos var1, Direction var2) {
      this.field31371 = true;
      this.field31372 = var1;
      boolean var5 = super.onPlayerDamageBlock(var1, var2);
      this.field31371 = false;
      return var5;
   }

   @Override
   public ActionResultType processRightClick(PlayerEntity var1, World var2, Hand var3) {
      this.field31371 = true;
      ActionResultType var6 = super.processRightClick(var1, var2, var3);
      this.field31371 = false;
      return var6;
   }

   @Override
   public ActionResultType func_217292_a(ClientPlayerEntity var1, ClientWorld var2, Hand var3, BlockRayTraceResult var4) {
      this.field31371 = true;
      this.field31372 = var4.getPos();
      ActionResultType var7 = super.func_217292_a(var1, var2, var3, var4);
      this.field31371 = false;
      return var7;
   }

   @Override
   public ActionResultType interactWithEntity(PlayerEntity var1, Entity var2, Hand var3) {
      this.field31373 = var2;
      return super.interactWithEntity(var1, var2, var3);
   }

   @Override
   public ActionResultType interactWithEntity(PlayerEntity var1, Entity var2, EntityRayTraceResult var3, Hand var4) {
      this.field31373 = var2;
      return super.interactWithEntity(var1, var2, var3, var4);
   }

   public boolean method23162() {
      return this.field31371;
   }

   public BlockPos method23163() {
      return this.field31372;
   }

   public Entity method23164() {
      return this.field31373;
   }
}
