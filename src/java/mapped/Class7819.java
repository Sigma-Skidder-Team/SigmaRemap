package mapped;

import com.google.common.collect.ContiguousSet;
import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Lists;
import com.google.common.collect.Range;
import com.google.common.collect.Sets;

import java.util.*;
import java.util.function.Predicate;
import javax.annotation.Nullable;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Direction;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.server.ServerWorld;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7819 {
   private static final Logger field33535 = LogManager.getLogger();
   private static final Predicate<Entity> field33536 = Class8088.field34757.and(Class8088.method27980(0.0, 128.0, 0.0, 192.0));
   private final Class3624 field33537 = (Class3624)new Class3624(
         new TranslationTextComponent("entity.minecraft.ender_dragon"), Class2303.field15720, Class2300.field15703
      )
      .method12282(true)
      .method12283(true);
   private final ServerWorld field33538;
   private final List<Integer> field33539 = Lists.newArrayList();
   private final Class9803 field33540;
   private int field33541;
   private int field33542;
   private int field33543;
   private int field33544;
   private boolean field33545;
   private boolean field33546;
   private UUID field33547;
   private boolean field33548 = true;
   private BlockPos field33549;
   private Class1940 field33550;
   private int field33551;
   private List<EnderCrystalEntity> field33552;

   public Class7819(ServerWorld var1, long var2, CompoundNBT var4) {
      this.field33538 = var1;
      if (!var4.contains("DragonKilled", 99)) {
         this.field33545 = true;
         this.field33546 = true;
      } else {
         if (var4.method106("Dragon")) {
            this.field33547 = var4.method105("Dragon");
         }

         this.field33545 = var4.getBoolean("DragonKilled");
         this.field33546 = var4.getBoolean("PreviouslyKilled");
         if (var4.getBoolean("IsRespawning")) {
            this.field33550 = Class1940.field12604;
         }

         if (var4.contains("ExitPortalLocation", 10)) {
            this.field33549 = Class8354.method29283(var4.getCompound("ExitPortalLocation"));
         }
      }

      if (!var4.contains("Gateways", 9)) {
         this.field33539.addAll(ContiguousSet.create(Range.closedOpen(0, 20), DiscreteDomain.integers()));
         Collections.shuffle(this.field33539, new Random(var2));
      } else {
         ListNBT var7 = var4.method131("Gateways", 3);

         for (int var8 = 0; var8 < var7.size(); var8++) {
            this.field33539.add(var7.method156(var8));
         }
      }

      this.field33540 = Class9659.method37706()
         .method37705("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .method37705("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .method37705("       ", "       ", "       ", "   #   ", "       ", "       ", "       ")
         .method37705("  ###  ", " #   # ", "#     #", "#  #  #", "#     #", " #   # ", "  ###  ")
         .method37705("       ", "  ###  ", " ##### ", " ##### ", " ##### ", "  ###  ", "       ")
         .method37707('#', Class9632.method37552(Class118.method331(Blocks.BEDROCK)))
         .method37708();
   }

   public CompoundNBT method26109() {
      CompoundNBT var3 = new CompoundNBT();
      if (this.field33547 != null) {
         var3.method104("Dragon", this.field33547);
      }

      var3.putBoolean("DragonKilled", this.field33545);
      var3.putBoolean("PreviouslyKilled", this.field33546);
      if (this.field33549 != null) {
         var3.put("ExitPortalLocation", Class8354.method29284(this.field33549));
      }

      ListNBT var4 = new ListNBT();

      for (int var6 : this.field33539) {
         var4.add(Class36.method95(var6));
      }

      var3.put("Gateways", var4);
      return var3;
   }

   public void method26110() {
      this.field33537.method12287(!this.field33545);
      if (++this.field33544 >= 20) {
         this.method26117();
         this.field33544 = 0;
      }

      if (this.field33537.method12288().isEmpty()) {
         this.field33538.getChunkProvider().method7375(Class8561.field38481, new ChunkPos(0, 0), 9, Class2341.field16010);
      } else {
         this.field33538.getChunkProvider().registerTicket(Class8561.field38481, new ChunkPos(0, 0), 9, Class2341.field16010);
         boolean var3 = this.method26116();
         if (this.field33548 && var3) {
            this.method26111();
            this.field33548 = false;
         }

         if (this.field33550 != null) {
            if (this.field33552 == null && var3) {
               this.field33550 = null;
               this.method26128();
            }

            this.field33550.method8204(this.field33538, this, this.field33552, this.field33551++, this.field33549);
         }

         if (!this.field33545) {
            if ((this.field33547 == null || ++this.field33541 >= 1200) && var3) {
               this.method26112();
               this.field33541 = 0;
            }

            if (++this.field33543 >= 100 && var3) {
               this.method26118();
               this.field33543 = 0;
            }
         }
      }
   }

   private void method26111() {
      field33535.info("Scanning for legacy world dragon fight...");
      boolean var3 = this.method26114();
      if (!var3) {
         field33535.info("Found that the dragon has not yet been killed in this world.");
         this.field33546 = false;
         if (this.method26115() == null) {
            this.method26122(false);
         }
      } else {
         field33535.info("Found that the dragon has been killed in this world already.");
         this.field33546 = true;
      }

      List var4 = this.field33538.method6913();
      if (!var4.isEmpty()) {
         Class1007 var5 = (Class1007)var4.get(0);
         this.field33547 = var5.getUniqueID();
         field33535.info("Found that there's a dragon still alive ({})", var5);
         this.field33545 = false;
         if (!var3) {
            field33535.info("But we didn't have a portal, let's remove it.");
            var5.remove();
            this.field33547 = null;
         }
      } else {
         this.field33545 = true;
      }

      if (!this.field33546 && this.field33545) {
         this.field33545 = false;
      }
   }

   private void method26112() {
      List var3 = this.field33538.method6913();
      if (!var3.isEmpty()) {
         field33535.debug("Haven't seen our dragon, but found another one to use.");
         this.field33547 = ((Class1007)var3.get(0)).getUniqueID();
      } else {
         field33535.debug("Haven't seen the dragon, respawning it");
         this.method26123();
      }
   }

   public void method26113(Class1940 var1) {
      if (this.field33550 == null) {
         throw new IllegalStateException("Dragon respawn isn't in progress, can't skip ahead in the animation.");
      } else {
         this.field33551 = 0;
         if (var1 != Class1940.field12608) {
            this.field33550 = var1;
         } else {
            this.field33550 = null;
            this.field33545 = false;
            Class1007 var4 = this.method26123();

            for (ServerPlayerEntity var6 : this.field33537.method12288()) {
               CriteriaTriggers.field44478.method15080(var6, var4);
            }
         }
      }
   }

   private boolean method26114() {
      for (int var3 = -8; var3 <= 8; var3++) {
         for (int var4 = -8; var4 <= 8; var4++) {
            Chunk var5 = this.field33538.getChunk(var3, var4);

            for (TileEntity var7 : var5.method7145().values()) {
               if (var7 instanceof Class956) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   @Nullable
   private Class9086 method26115() {
      for (int var3 = -8; var3 <= 8; var3++) {
         for (int var4 = -8; var4 <= 8; var4++) {
            Chunk var5 = this.field33538.getChunk(var3, var4);

            for (TileEntity var7 : var5.method7145().values()) {
               if (var7 instanceof Class956) {
                  Class9086 var8 = this.field33540.method38656(this.field33538, var7.getPos());
                  if (var8 != null) {
                     BlockPos var9 = var8.method33881(3, 3, 3).method37551();
                     if (this.field33549 == null && var9.getX() == 0 && var9.getZ() == 0) {
                        this.field33549 = var9;
                     }

                     return var8;
                  }
               }
            }
         }
      }

      int var10 = this.field33538.method7006(Heightmap.Type.field299, Class2909.field17994).getY();

      for (int var11 = var10; var11 >= 0; var11--) {
         Class9086 var12 = this.field33540
            .method38656(this.field33538, new BlockPos(Class2909.field17994.getX(), var11, Class2909.field17994.getZ()));
         if (var12 != null) {
            if (this.field33549 == null) {
               this.field33549 = var12.method33881(3, 3, 3).method37551();
            }

            return var12;
         }
      }

      return null;
   }

   private boolean method26116() {
      for (int var3 = -8; var3 <= 8; var3++) {
         for (int var4 = 8; var4 <= 8; var4++) {
            IChunk var5 = this.field33538.getChunk(var3, var4, ChunkStatus.FULL, false);
            if (!(var5 instanceof Chunk)) {
               return false;
            }

            ChunkHolderLocationType var6 = ((Chunk)var5).getLocationType();
            if (!var6.isAtLeast(ChunkHolderLocationType.TICKING)) {
               return false;
            }
         }
      }

      return true;
   }

   private void method26117() {
      HashSet var3 = Sets.newHashSet();

      for (ServerPlayerEntity var5 : this.field33538.method6914(field33536)) {
         this.field33537.method12263(var5);
         var3.add(var5);
      }

      Set<ServerPlayerEntity> var7 = Sets.newHashSet(this.field33537.method12288());
      var7.removeAll(var3);

      for (ServerPlayerEntity var6 : var7) {
         this.field33537.method12265(var6);
      }
   }

   private void method26118() {
      this.field33543 = 0;
      this.field33542 = 0;

      for (Class9648 var4 : Class2944.method11286(this.field33538)) {
         this.field33542 = this.field33542 + this.field33538.<EnderCrystalEntity>method7182(EnderCrystalEntity.class, var4.method37631()).size();
      }

      field33535.debug("Found {} end crystals still alive", this.field33542);
   }

   public void method26119(Class1007 var1) {
      if (var1.getUniqueID().equals(this.field33547)) {
         this.field33537.method12278(0.0F);
         this.field33537.method12287(false);
         this.method26122(true);
         this.method26120();
         if (!this.field33546) {
            this.field33538.setBlockState(this.field33538.method7006(Heightmap.Type.field299, Class2909.field17994), Blocks.field36652.method11579());
         }

         this.field33546 = true;
         this.field33545 = true;
      }
   }

   private void method26120() {
      if (!this.field33539.isEmpty()) {
         int var3 = this.field33539.remove(this.field33539.size() - 1);
         int var4 = MathHelper.floor(96.0 * Math.cos(2.0 * (-Math.PI + (Math.PI / 20) * (double)var3)));
         int var5 = MathHelper.floor(96.0 * Math.sin(2.0 * (-Math.PI + (Math.PI / 20) * (double)var3)));
         this.method26121(new BlockPos(var4, 75, var5));
      }
   }

   private void method26121(BlockPos var1) {
      this.field33538.playEvent(3000, var1, 0);
      Class9104.field41635.method26521(this.field33538, this.field33538.getChunkProvider().method7370(), new Random(), var1);
   }

   private void method26122(boolean var1) {
      Class2909 var4 = new Class2909(var1);
      if (this.field33549 == null) {
         this.field33549 = this.field33538.method7006(Heightmap.Type.field300, Class2909.field17994).down();

         while (this.field33538.getBlockState(this.field33549).isIn(Blocks.BEDROCK) && this.field33549.getY() > this.field33538.method6776()) {
            this.field33549 = this.field33549.down();
         }
      }

      var4.method11216(Class4698.field22290).method26521(this.field33538, this.field33538.getChunkProvider().method7370(), new Random(), this.field33549);
   }

   private Class1007 method26123() {
      this.field33538.getChunkAt(new BlockPos(0, 128, 0));
      Class1007 var3 = EntityType.field41024.create(this.field33538);
      var3.method4336().method32671(Class9598.field44896);
      var3.setLocationAndAngles(0.0, 128.0, 0.0, this.field33538.rand.nextFloat() * 360.0F, 0.0F);
      this.field33538.addEntity(var3);
      this.field33547 = var3.getUniqueID();
      return var3;
   }

   public void method26124(Class1007 var1) {
      if (var1.getUniqueID().equals(this.field33547)) {
         this.field33537.method12278(var1.getHealth() / var1.method3075());
         this.field33541 = 0;
         if (var1.method3381()) {
            this.field33537.method12284(var1.getDisplayName());
         }
      }
   }

   public int method26125() {
      return this.field33542;
   }

   public void method26126(EnderCrystalEntity var1, DamageSource var2) {
      if (this.field33550 != null && this.field33552.contains(var1)) {
         field33535.debug("Aborting respawn sequence");
         this.field33550 = null;
         this.field33551 = 0;
         this.method26130();
         this.method26122(true);
      } else {
         this.method26118();
         Entity var5 = this.field33538.getEntityByUuid(this.field33547);
         if (var5 instanceof Class1007) {
            ((Class1007)var5).method4335(var1, var1.getPosition(), var2);
         }
      }
   }

   public boolean method26127() {
      return this.field33546;
   }

   public void method26128() {
      if (this.field33545 && this.field33550 == null) {
         BlockPos var3 = this.field33549;
         if (var3 == null) {
            field33535.debug("Tried to respawn, but need to find the portal first.");
            Class9086 var4 = this.method26115();
            if (var4 != null) {
               field33535.debug("Found the exit portal & temporarily using it.");
            } else {
               field33535.debug("Couldn't find a portal, so we made one.");
               this.method26122(true);
            }

            var3 = this.field33549;
         }

         ArrayList var9 = Lists.newArrayList();
         BlockPos var5 = var3.method8339(1);

         for (Direction var7 : Class76.field161) {
            List var8 = this.field33538.<EnderCrystalEntity>method7182(EnderCrystalEntity.class, new AxisAlignedBB(var5.method8350(var7, 2)));
            if (var8.isEmpty()) {
               return;
            }

            var9.addAll(var8);
         }

         field33535.debug("Found all crystals, respawning dragon.");
         this.method26129(var9);
      }
   }

   private void method26129(List<EnderCrystalEntity> var1) {
      if (this.field33545 && this.field33550 == null) {
         for (Class9086 var4 = this.method26115(); var4 != null; var4 = this.method26115()) {
            for (int var5 = 0; var5 < this.field33540.method38654(); var5++) {
               for (int var6 = 0; var6 < this.field33540.method38653(); var6++) {
                  for (int var7 = 0; var7 < this.field33540.method38652(); var7++) {
                     Class9632 var8 = var4.method33881(var5, var6, var7);
                     if (var8.method37548().isIn(Blocks.BEDROCK) || var8.method37548().isIn(Blocks.field36649)) {
                        this.field33538.setBlockState(var8.method37551(), Blocks.field36651.method11579());
                     }
                  }
               }
            }
         }

         this.field33550 = Class1940.field12604;
         this.field33551 = 0;
         this.method26122(false);
         this.field33552 = var1;
      }
   }

   public void method26130() {
      for (Class9648 var4 : Class2944.method11286(this.field33538)) {
         for (EnderCrystalEntity var6 : this.field33538.<EnderCrystalEntity>method7182(EnderCrystalEntity.class, var4.method37631())) {
            var6.method3363(false);
            var6.method4142((BlockPos)null);
         }
      }
   }
}
