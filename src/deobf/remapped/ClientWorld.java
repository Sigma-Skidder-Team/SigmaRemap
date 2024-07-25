package remapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import net.minecraft.util.text.TranslationTextComponent;

public class ClientWorld extends World {
   public final Int2ObjectMap<Entity> field_568 = new Int2ObjectOpenHashMap();
   private final ClientPlayNetHandler field_576;
   private final WorldRenderer field_567;
   private final class_784 field_572;
   private class_7513 field_579;
   private final MinecraftClient field_578 = MinecraftClient.getInstance();
   private final List<AbstractClientPlayerEntity> field_566 = Lists.newArrayList();
   private class_1097 field_570 = new class_1097();
   private final Map<String, class_2134> field_571 = Maps.newHashMap();
   private int field_573;
   private final Object2ObjectArrayMap<class_6581, class_6530> field_569 = Util.<Object2ObjectArrayMap<class_6581, class_6530>>make(
      new Object2ObjectArrayMap(3), var0 -> {
         var0.put(class_4948.field_25609, new class_6530());
         var0.put(class_4948.field_25610, new class_6530());
         var0.put(class_4948.field_25607, new class_6530());
      }
   );
   private class_5360 field_577;
   private boolean field_574 = false;

   public ClientWorld(
      ClientPlayNetHandler var1,
      class_784 var2,
      class_5621<World> var3,
      class_8760 var4,
      int var5,
      Supplier<class_3492> var6,
      WorldRenderer var7,
      boolean var8,
      long var9
   ) {
      super(var2, var3, var4, var6, true, var8, var9);
      this.field_576 = var1;
      this.field_572 = var2;
      this.field_567 = var7;
      if (var1 != null && var4 != null) {
         this.field_579 = class_7513.method_34250(var4);
         this.field_577 = new class_5360(this, var5);
      }

      this.method_752(new BlockPos(8, 64, 8), 0.0F);
      this.method_29541();
      this.method_29525();
      if (class_7860.field_39863.method_3596()) {
         class_7860.method_35555(this, class_7860.field_39863);
      }

      class_7860.method_35568(class_7860.field_40005, this);
      if (this.field_578.playerController != null && this.field_578.playerController.getClass() == class_9153.class) {
         this.field_578.playerController = new class_4717(this.field_578, this.field_576);
         class_1322.method_6041((class_4717)this.field_578.playerController);
      }
   }

   public class_7513 method_738() {
      return this.field_579;
   }

   public void method_751(BooleanSupplier var1) {
      this.method_6673().method_9805();
      this.method_722();
      this.method_29599().startSection("blocks");
      this.field_577.method_24472(var1);
      this.method_29599().endSection();
   }

   private void method_722() {
      this.method_735(this.field_33035.method_8658() + 1L);
      if (this.field_33035.method_8653().getBoolean(GameRules.DO_DAYLIGHT_CYCLE)) {
         this.method_719(this.field_33035.method_8666() + 1L);
      }
   }

   public void method_735(long var1) {
      this.field_572.method_3500(var1);
   }

   public void method_719(long var1) {
      if (var1 >= 0L) {
         this.getGameRules().<BooleanValue>method_1287(GameRules.DO_DAYLIGHT_CYCLE).method_26684(true, (class_341)null);
      } else {
         var1 = -var1;
         this.getGameRules().<BooleanValue>method_1287(GameRules.DO_DAYLIGHT_CYCLE).method_26684(false, (class_341)null);
      }

      this.field_572.method_3498(var1);
   }

   public Iterable<Entity> method_736() {
      return this.field_568.values();
   }

   public void method_737() {
      class_3492 var3 = this.method_29599();
      var3.startSection("entities");
      ObjectIterator var4 = this.field_568.int2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         Entity var6 = (Entity)var5.getValue();
         if (!var6.isPassenger()) {
            var3.startSection("tick");
            if (!var6.field_41751) {
               this.method_29532(this::method_755, var6);
            }

            var3.endSection();
            var3.startSection("remove");
            if (var6.field_41751) {
               var4.remove();
               this.method_757(var6);
            }

            var3.endSection();
         }
      }

      this.method_29547();
      var3.endSection();
   }

   public void method_755(Entity var1) {
      if (!(var1 instanceof PlayerEntity) && !this.method_745().method_14824(var1)) {
         this.method_728(var1);
      } else {
         var1.method_37306(var1.getPosX(), var1.method_37309(), var1.getPosZ());
         var1.prevRotationYaw = var1.rotationYaw;
         var1.field_41762 = var1.rotationPitch;
         if (var1.field_41727 || var1.method_37221()) {
            var1.field_41697++;
            this.method_29599().method_16057(() -> class_8669.field_44400.method_39797(var1.getType()).toString());
            if (class_8835.method_40648(var1)) {
               var1.method_37123();
            }

            this.method_29599().endSection();
         }

         this.method_728(var1);
         if (var1.field_41727) {
            for (Entity var5 : var1.getPassengers()) {
               this.method_730(var1, var5);
            }
         }
      }
   }

   public void method_730(Entity var1, Entity var2) {
      if (var2.field_41751 || var2.getRidingEntity() != var1) {
         var2.method_37390();
      } else if (var2 instanceof PlayerEntity || this.method_745().method_14824(var2)) {
         var2.method_37306(var2.getPosX(), var2.method_37309(), var2.getPosZ());
         var2.prevRotationYaw = var2.rotationYaw;
         var2.field_41762 = var2.rotationPitch;
         if (var2.field_41727) {
            var2.field_41697++;
            var2.method_37189();
         }

         this.method_728(var2);
         if (var2.field_41727) {
            for (Entity var6 : var2.getPassengers()) {
               this.method_730(var2, var6);
            }
         }
      }
   }

   private void method_728(Entity var1) {
      if (var1.method_37251()) {
         this.method_29599().startSection("chunkCheck");
         int var4 = MathHelper.floor(var1.getPosX() / 16.0);
         int var5 = MathHelper.floor(var1.method_37309() / 16.0);
         int var6 = MathHelper.floor(var1.getPosZ() / 16.0);
         if (!var1.field_41727 || var1.field_41742 != var4 || var1.field_41747 != var5 || var1.field_41714 != var6) {
            if (var1.field_41727 && this.method_22560(var1.field_41742, var1.field_41714)) {
               this.method_29554(var1.field_41742, var1.field_41714).method_12000(var1, var1.field_41747);
            }

            if (!var1.method_37265() && !this.method_22560(var4, var6)) {
               if (var1.field_41727) {
                  field_33046.warn("Entity {} left loaded chunk area", var1);
               }

               var1.field_41727 = false;
            } else {
               this.method_29554(var4, var6).method_27342(var1);
            }
         }

         this.method_29599().endSection();
      }
   }

   public void method_740(class_2654 var1) {
      Object var4;
      if (!class_7860.field_39887.method_7978()) {
         var4 = this.field_33037;
      } else {
         var4 = (Collection)class_7860.method_35557(this, class_7860.field_39887);
      }

      var4.addAll(var1.method_12004().values());
      this.field_577.method_14813().method_21563(var1.method_27352(), false);
   }

   public void method_760(int var1, int var2) {
      this.field_569.forEach((var2x, var3) -> var3.method_29720(var1, var2));
   }

   public void method_753() {
      this.field_569.forEach((var0, var1) -> var1.method_29722());
   }

   @Override
   public boolean method_22560(int var1, int var2) {
      return true;
   }

   public int method_741() {
      return this.field_568.size();
   }

   public void method_762(int var1, AbstractClientPlayerEntity var2) {
      this.method_724(var1, var2);
      this.field_566.add(var2);
   }

   public void method_725(int var1, Entity var2) {
      this.method_724(var1, var2);
   }

   private void method_724(int var1, Entity var2) {
      if (!class_7860.field_40165.method_22501() || !class_7860.method_35568(class_7860.field_40165, var2, this)) {
         this.method_754(var1);
         this.field_568.put(var1, var2);
         this.method_745()
            .method_24468(
               MathHelper.floor(var2.getPosX() / 16.0), MathHelper.floor(var2.getPosZ() / 16.0), class_7335.field_37514, true
            )
            .method_27342(var2);
         if (class_7860.field_40228.method_3596()) {
            class_7860.method_35555(var2, class_7860.field_40228);
         }

         this.method_748(var2);
      }
   }

   public void method_754(int var1) {
      Entity var4 = (Entity)this.field_568.remove(var1);
      if (var4 != null) {
         var4.method_37204();
         this.method_757(var4);
      }
   }

   private void method_757(Entity var1) {
      var1.method_37269();
      if (var1.field_41727) {
         this.method_29554(var1.field_41742, var1.field_41714).method_11995(var1);
      }

      this.field_566.remove(var1);
      if (class_7860.field_40160.method_3596()) {
         class_7860.method_35555(var1, class_7860.field_40160);
      }

      if (class_7860.field_40099.method_22501()) {
         class_7860.method_35568(class_7860.field_40099, var1, this);
      }

      this.method_739(var1);
   }

   public void method_723(class_2654 var1) {
      ObjectIterator var4 = this.field_568.int2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         Entity var6 = (Entity)var5.getValue();
         int var7 = MathHelper.floor(var6.getPosX() / 16.0);
         int var8 = MathHelper.floor(var6.getPosZ() / 16.0);
         if (var7 == var1.method_27352().field_10328 && var8 == var1.method_27352().field_10327) {
            var1.method_27342(var6);
         }
      }
   }

   @Nullable
   @Override
   public Entity method_29534(int var1) {
      return (Entity)this.field_568.get(var1);
   }

   public void method_743(BlockPos var1, class_2522 var2) {
      this.method_7513(var1, var2, 19);
   }

   @Override
   public void method_29519() {
      this.field_576.method_9091().method_23482(new TranslationTextComponent("multiplayer.status.quitting"));
   }

   public void method_732(int var1, int var2, int var3) {
      byte var6 = 32;
      Random var7 = new Random();
      boolean var8 = false;
      if (this.field_578.playerController.getCurrentGameType() == GameType.CREATIVE) {
         for (ItemStack var10 : this.field_578.thePlayer.method_37294()) {
            if (var10.method_27960() == class_4783.field_23207.method_10803()) {
               var8 = true;
               break;
            }
         }
      }

      class_2921 var11 = new class_2921();

      for (int var12 = 0; var12 < 667; var12++) {
         this.method_733(var1, var2, var3, 16, var7, var8, var11);
         this.method_733(var1, var2, var3, 32, var7, var8, var11);
      }
   }

   public void method_733(int var1, int var2, int var3, int var4, Random var5, boolean var6, class_2921 var7) {
      int var10 = var1 + this.field_33033.nextInt(var4) - this.field_33033.nextInt(var4);
      int var11 = var2 + this.field_33033.nextInt(var4) - this.field_33033.nextInt(var4);
      int var12 = var3 + this.field_33033.nextInt(var4) - this.field_33033.nextInt(var4);
      var7.method_13362(var10, var11, var12);
      class_2522 var13 = this.method_28262(var7);
      var13.method_8360().method_29280(var13, this, var7, var5);
      class_4774 var14 = this.method_28258(var7);
      if (!var14.method_22001()) {
         var14.method_22002(this, var7, var5);
         class_5079 var15 = var14.method_22010();
         if (var15 != null && this.field_33033.nextInt(10) == 0) {
            boolean var16 = var13.method_8308(this, var7, Direction.field_802);
            BlockPos var17 = var7.method_6100();
            this.method_746(var17, this.method_28262(var17), var15, var16);
         }
      }

      if (var6 && var13.method_8350(class_4783.field_23207)) {
         this.method_43361(class_3090.field_15327, (double)var10 + 0.5, (double)var11 + 0.5, (double)var12 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!var13.method_8306(this, var7)) {
         this.method_22561(var7)
            .method_28880()
            .ifPresent(
               var2x -> {
                  if (var2x.method_11683(this.field_33033)) {
                     this.method_43361(
                        var2x.method_11682(),
                        (double)var7.getX() + this.field_33033.nextDouble(),
                        (double)var7.getY() + this.field_33033.nextDouble(),
                        (double)var7.getZ() + this.field_33033.nextDouble(),
                        0.0,
                        0.0,
                        0.0
                     );
                  }
               }
            );
      }
   }

   private void method_746(BlockPos var1, class_2522 var2, class_5079 var3, boolean var4) {
      if (var2.method_8364().method_22001()) {
         class_4190 var7 = var2.method_8324(this, var1);
         double var8 = var7.method_19495(class_9249.field_47216);
         if (!(var8 < 1.0)) {
            if (!var2.method_8349(class_2351.field_11735)) {
               double var10 = var7.method_19491(class_9249.field_47216);
               if (!(var10 > 0.0)) {
                  BlockPos var12 = var1.method_6100();
                  class_2522 var13 = this.method_28262(var12);
                  class_4190 var14 = var13.method_8324(this, var12);
                  double var15 = var14.method_19495(class_9249.field_47216);
                  if (var15 < 1.0 && var13.method_8364().method_22001()) {
                     this.method_727(var1, var3, var7, (double)var1.getY() - 0.05);
                  }
               } else {
                  this.method_727(var1, var3, var7, (double)var1.getY() + var10 - 0.05);
               }
            }
         } else if (var4) {
            this.method_726(
               (double)var1.getX(),
               (double)(var1.getX() + 1),
               (double)var1.getZ(),
               (double)(var1.getZ() + 1),
               (double)(var1.getY() + 1) - 0.05,
               var3
            );
         }
      }
   }

   private void method_727(BlockPos var1, class_5079 var2, class_4190 var3, double var4) {
      this.method_726(
         (double)var1.getX() + var3.method_19491(class_9249.field_47215),
         (double)var1.getX() + var3.method_19495(class_9249.field_47215),
         (double)var1.getZ() + var3.method_19491(class_9249.field_47219),
         (double)var1.getZ() + var3.method_19495(class_9249.field_47219),
         var4,
         var2
      );
   }

   private void method_726(double var1, double var3, double var5, double var7, double var9, class_5079 var11) {
      this.method_43361(
         var11,
         MathHelper.lerp(this.field_33033.nextDouble(), var1, var3),
         var9,
         MathHelper.lerp(this.field_33033.nextDouble(), var5, var7),
         0.0,
         0.0,
         0.0
      );
   }

   public void method_718() {
      ObjectIterator var3 = this.field_568.int2ObjectEntrySet().iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         Entity var5 = (Entity)var4.getValue();
         if (var5.field_41751) {
            var3.remove();
            this.method_757(var5);
         }
      }
   }

   @Override
   public class_6544 method_29548(class_159 var1) {
      class_6544 var4 = super.method_29548(var1);
      var4.method_29851("Server brand", () -> this.field_578.thePlayer.method_27309());
      var4.method_29851("Server type", () -> this.field_578.method_8515() != null ? "Integrated singleplayer server" : "Non-integrated multiplayer server");
      return var4;
   }

   @Override
   public void method_29528(PlayerEntity var1, double var2, double var4, double var6, SoundEvent var8, class_562 var9, float var10, float var11) {
      if (class_7860.field_39943.method_3596()) {
         Object var14 = class_7860.field_39943.method_3582(var1, var8, var9, var10, var11);
         if (class_7860.method_35565(var14, class_7860.field_40233) || class_7860.method_35555(var14, class_7860.field_39895) == null) {
            return;
         }

         var8 = (SoundEvent)class_7860.method_35555(var14, class_7860.field_39895);
         var9 = (class_562)class_7860.method_35555(var14, class_7860.field_40154);
         var10 = class_7860.method_35585(var14, class_7860.field_39894);
      }

      if (var1 == this.field_578.thePlayer) {
         this.method_29527(var2, var4, var6, var8, var9, var10, var11, false);
      }
   }

   @Override
   public void method_29540(PlayerEntity var1, Entity var2, SoundEvent var3, class_562 var4, float var5, float var6) {
      if (class_7860.field_39943.method_3596()) {
         Object var9 = class_7860.field_39943.method_3582(var1, var3, var4, var5, var6);
         if (class_7860.method_35565(var9, class_7860.field_40233) || class_7860.method_35555(var9, class_7860.field_39895) == null) {
            return;
         }

         var3 = (SoundEvent)class_7860.method_35555(var9, class_7860.field_39895);
         var4 = (class_562)class_7860.method_35555(var9, class_7860.field_40154);
         var5 = class_7860.method_35585(var9, class_7860.field_39894);
      }

      if (var1 == this.field_578.thePlayer) {
         this.field_578.getSoundHandler().play(new class_569(var3, var4, var2));
      }
   }

   public void method_721(BlockPos var1, SoundEvent var2, class_562 var3, float var4, float var5, boolean var6) {
      this.method_29527((double)var1.getX() + 0.5, (double)var1.getY() + 0.5, (double)var1.getZ() + 0.5, var2, var3, var4, var5, var6);
   }

   @Override
   public void method_29527(double var1, double var3, double var5, SoundEvent var7, class_562 var8, float var9, float var10, boolean var11) {
      double var14 = this.field_578.gameRenderer.method_35949().method_41627().method_6203(var1, var3, var5);
      class_4949 var16 = new class_4949(var7, var8, var9, var10, var1, var3, var5);
      if (var11 && var14 > 100.0) {
         double var17 = Math.sqrt(var14) / 40.0;
         this.field_578.getSoundHandler().method_16342(var16, (int)(var17 * 20.0));
      } else {
         this.field_578.getSoundHandler().play(var16);
      }
   }

   @Override
   public void method_29536(double var1, double var3, double var5, double var7, double var9, double var11, CompoundNBT var13) {
      this.field_578.field_9572.method_43044(new class_4498(this, var1, var3, var5, var7, var9, var11, this.field_578.field_9572, var13));
   }

   @Override
   public void method_29535(Packet<?> var1) {
      this.field_576.sendPacket(var1);
   }

   @Override
   public class_5023 method_29549() {
      return this.field_576.method_4812();
   }

   public void method_756(class_1097 var1) {
      this.field_570 = var1;
   }

   @Override
   public class_3065<class_6414> method_43367() {
      return class_5389.<class_6414>method_24539();
   }

   @Override
   public class_3065<class_2340> method_43362() {
      return class_5389.<class_2340>method_24539();
   }

   public class_5360 method_745() {
      return this.field_577;
   }

   @Override
   public boolean method_7513(BlockPos var1, class_2522 var2, int var3) {
      this.field_574 = this.method_729();
      boolean var6 = super.method_7513(var1, var2, var3);
      this.field_574 = false;
      return var6;
   }

   private boolean method_729() {
      if (!(this.field_578.playerController instanceof class_4717)) {
         return false;
      } else {
         class_4717 var3 = (class_4717)this.field_578.playerController;
         return var3.method_21813();
      }
   }

   public boolean method_747() {
      return this.field_574;
   }

   public void method_748(Entity var1) {
      class_8192.method_37536(var1, this);
      if (Config.method_14326()) {
         class_8421.method_38758(var1, Config.method_14387());
      }
   }

   public void method_739(Entity var1) {
      class_8192.method_37534(var1, this);
      if (Config.method_14326()) {
         class_8421.method_38775(var1, Config.method_14387());
      }
   }

   @Nullable
   @Override
   public class_2134 method_29533(String var1) {
      return this.field_571.get(var1);
   }

   @Override
   public void method_29524(class_2134 var1) {
      this.field_571.put(var1.method_32926(), var1);
   }

   @Override
   public int method_29564() {
      return 0;
   }

   @Override
   public class_1097 method_29562() {
      return this.field_570;
   }

   @Override
   public ITagCollectionSupplier method_29600() {
      return this.field_576.method_4804();
   }

   @Override
   public class_6322 method_2755() {
      return this.field_576.method_4806();
   }

   @Override
   public void method_29572(BlockPos var1, class_2522 var2, class_2522 var3, int var4) {
      this.field_567.method_20066(this, var1, var2, var3, var4);
   }

   @Override
   public void method_29567(BlockPos var1, class_2522 var2, class_2522 var3) {
      this.field_567.method_20094(var1, var2, var3);
   }

   public void method_720(int var1, int var2, int var3) {
      this.field_567.method_20085(var1, var2, var3);
   }

   @Override
   public void method_29568(int var1, BlockPos var2, int var3) {
      this.field_567.method_20073(var1, var2, var3);
   }

   @Override
   public void method_29589(int var1, BlockPos var2, int var3) {
      this.field_567.method_20081(var1, var2, var3);
   }

   @Override
   public void method_43365(PlayerEntity var1, int var2, BlockPos var3, int var4) {
      try {
         this.field_567.method_20038(var1, var2, var3, var4);
      } catch (Throwable var10) {
         class_159 var8 = class_159.method_643(var10, "Playing level event");
         class_6544 var9 = var8.method_639("Level event being played");
         var9.method_29850("Block coordinates", class_6544.method_29846(var3));
         var9.method_29850("Event source", var1);
         var9.method_29850("Event type", var2);
         var9.method_29850("Event data", var4);
         throw new class_3297(var8);
      }
   }

   @Override
   public void method_43361(class_5079 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.field_567.method_20040(var1, var1.method_23357().method_39479(), var2, var4, var6, var8, var10, var12);
   }

   @Override
   public void method_29543(class_5079 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      this.field_567.method_20040(var1, var1.method_23357().method_39479() || var2, var3, var5, var7, var9, var11, var13);
   }

   @Override
   public void method_29551(class_5079 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.field_567.method_20041(var1, false, true, var2, var4, var6, var8, var10, var12);
   }

   @Override
   public void method_29552(class_5079 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      this.field_567.method_20041(var1, var1.method_23357().method_39479() || var2, true, var3, var5, var7, var9, var11, var13);
   }

   @Override
   public List<AbstractClientPlayerEntity> method_25873() {
      return this.field_566;
   }

   @Override
   public class_6325 method_22558(int var1, int var2, int var3) {
      return this.method_2755().<class_6325>method_28813(class_8669.field_44359).method_39807(class_8606.field_44136);
   }

   public float method_731(float var1) {
      float var4 = this.method_13578(var1);
      float var5 = 1.0F - (MathHelper.cos(var4 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      var5 = MathHelper.clamp(var5, 0.0F, 1.0F);
      var5 = 1.0F - var5;
      var5 = (float)((double)var5 * (1.0 - (double)(this.method_29578(var1) * 5.0F) / 16.0));
      var5 = (float)((double)var5 * (1.0 - (double)(this.method_29601(var1) * 5.0F) / 16.0));
      return var5 * 0.8F + 0.2F;
   }

   public class_1343 method_750(BlockPos var1, float var2) {
      float var5 = this.method_13578(var2);
      float var6 = MathHelper.cos(var5 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      var6 = MathHelper.clamp(var6, 0.0F, 1.0F);
      class_6325 var7 = this.method_22561(var1);
      int var8 = var7.method_28873();
      float var9 = (float)(var8 >> 16 & 0xFF) / 255.0F;
      float var10 = (float)(var8 >> 8 & 0xFF) / 255.0F;
      float var11 = (float)(var8 & 0xFF) / 255.0F;
      var9 *= var6;
      var10 *= var6;
      var11 *= var6;
      float var12 = this.method_29578(var2);
      if (var12 > 0.0F) {
         float var13 = (var9 * 0.3F + var10 * 0.59F + var11 * 0.11F) * 0.6F;
         float var14 = 1.0F - var12 * 0.75F;
         var9 = var9 * var14 + var13 * (1.0F - var14);
         var10 = var10 * var14 + var13 * (1.0F - var14);
         var11 = var11 * var14 + var13 * (1.0F - var14);
      }

      float var20 = this.method_29601(var2);
      if (var20 > 0.0F) {
         float var21 = (var9 * 0.3F + var10 * 0.59F + var11 * 0.11F) * 0.2F;
         float var15 = 1.0F - var20 * 0.75F;
         var9 = var9 * var15 + var21 * (1.0F - var15);
         var10 = var10 * var15 + var21 * (1.0F - var15);
         var11 = var11 * var15 + var21 * (1.0F - var15);
      }

      if (this.field_573 > 0) {
         float var22 = (float)this.field_573 - var2;
         if (var22 > 1.0F) {
            var22 = 1.0F;
         }

         var22 *= 0.45F;
         var9 = var9 * (1.0F - var22) + 0.8F * var22;
         var10 = var10 * (1.0F - var22) + 0.8F * var22;
         var11 = var11 * (1.0F - var22) + 1.0F * var22;
      }

      return new class_1343((double)var9, (double)var10, (double)var11);
   }

   public class_1343 method_742(float var1) {
      float var4 = this.method_13578(var1);
      float var5 = MathHelper.cos(var4 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      var5 = MathHelper.clamp(var5, 0.0F, 1.0F);
      float var6 = 1.0F;
      float var7 = 1.0F;
      float var8 = 1.0F;
      float var9 = this.method_29578(var1);
      if (var9 > 0.0F) {
         float var10 = (var6 * 0.3F + var7 * 0.59F + var8 * 0.11F) * 0.6F;
         float var11 = 1.0F - var9 * 0.95F;
         var6 = var6 * var11 + var10 * (1.0F - var11);
         var7 = var7 * var11 + var10 * (1.0F - var11);
         var8 = var8 * var11 + var10 * (1.0F - var11);
      }

      var6 *= var5 * 0.9F + 0.1F;
      var7 *= var5 * 0.9F + 0.1F;
      var8 *= var5 * 0.85F + 0.15F;
      float var17 = this.method_29601(var1);
      if (var17 > 0.0F) {
         float var18 = (var6 * 0.3F + var7 * 0.59F + var8 * 0.11F) * 0.2F;
         float var12 = 1.0F - var17 * 0.95F;
         var6 = var6 * var12 + var18 * (1.0F - var12);
         var7 = var7 * var12 + var18 * (1.0F - var12);
         var8 = var8 * var12 + var18 * (1.0F - var12);
      }

      return new class_1343((double)var6, (double)var7, (double)var8);
   }

   public float method_761(float var1) {
      float var4 = this.method_13578(var1);
      float var5 = 1.0F - (MathHelper.cos(var4 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      var5 = MathHelper.clamp(var5, 0.0F, 1.0F);
      return var5 * var5 * 0.5F;
   }

   public int method_744() {
      return this.field_573;
   }

   @Override
   public void method_29591(int var1) {
      this.field_573 = var1;
   }

   @Override
   public float method_25265(Direction var1, boolean var2) {
      boolean var5 = this.method_738().method_34245();
      boolean var6 = Config.method_14424();
      if (!var2) {
         return var5 ? 0.9F : 1.0F;
      } else {
         switch (var1) {
            case field_802:
               return var5 ? 0.9F : (var6 ? class_6588.field_33971 : 0.5F);
            case field_817:
               return var5 ? 0.9F : 1.0F;
            case field_818:
            case field_800:
               if (Config.method_14424()) {
                  return class_6588.field_33844;
               }

               return 0.8F;
            case field_809:
            case field_804:
               if (Config.method_14424()) {
                  return class_6588.field_33689;
               }

               return 0.6F;
            default:
               return 1.0F;
         }
      }
   }

   @Override
   public int method_25262(BlockPos var1, class_6581 var2) {
      class_6530 var5 = (class_6530)this.field_569.get(var2);
      return var5.method_29721(var1, () -> this.method_759(var1, var2));
   }

   public int method_759(BlockPos var1, class_6581 var2) {
      int var5 = MinecraftClient.getInstance().gameOptions.field_45526;
      if (var5 == 0) {
         return var2.method_30079(this.method_22561(var1), (double)var1.getX(), (double)var1.getZ());
      } else {
         int var6 = (var5 * 2 + 1) * (var5 * 2 + 1);
         int var7 = 0;
         int var8 = 0;
         int var9 = 0;
         class_6281 var10 = new class_6281(
            var1.getX() - var5,
            var1.getY(),
            var1.getZ() - var5,
            var1.getX() + var5,
            var1.getY(),
            var1.getZ() + var5
         );
         class_2921 var11 = new class_2921();

         while (var10.method_28626()) {
            var11.method_13362(var10.method_28624(), var10.method_28628(), var10.method_28623());
            int var12 = var2.method_30079(this.method_22561(var11), (double)var11.getX(), (double)var11.getZ());
            var7 += (var12 & 0xFF0000) >> 16;
            var8 += (var12 & 0xFF00) >> 8;
            var9 += var12 & 0xFF;
         }

         return (var7 / var6 & 0xFF) << 16 | (var8 / var6 & 0xFF) << 8 | var9 / var6 & 0xFF;
      }
   }

   public BlockPos method_758() {
      BlockPos var3 = new BlockPos(this.field_33035.method_8654(), this.field_33035.method_8660(), this.field_33035.method_8655());
      if (!this.method_6673().method_9813(var3)) {
         var3 = this.method_22563(class_3801.field_18595, new BlockPos(this.method_6673().method_9807(), 0.0, this.method_6673().method_9835()));
      }

      return var3;
   }

   public float method_734() {
      return this.field_33035.method_8657();
   }

   public void method_752(BlockPos var1, float var2) {
      this.field_33035.method_4988(var1, var2);
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public class_784 method_749() {
      return this.field_572;
   }
}
