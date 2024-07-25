package remapped;

import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_9153 {
   private static final Logger field_46824 = LogManager.getLogger();
   public final MinecraftClient field_46835;
   public final ClientPlayNetHandler field_46837;
   private BlockPos field_46836 = new BlockPos(-1, -1, -1);
   private ItemStack field_46827 = ItemStack.EMPTY;
   public float field_46832;
   private float field_46825;
   public int field_46831;
   private boolean field_46829;
   private GameType field_46833 = GameType.SURVIVAL;
   private GameType field_46828 = GameType.NOT_SET;
   private final Object2ObjectLinkedOpenHashMap<Pair<BlockPos, class_7500>, class_1343> field_46830 = new Object2ObjectLinkedOpenHashMap();
   private int field_46834;

   public class_9153(MinecraftClient var1, ClientPlayNetHandler var2) {
      this.field_46835 = var1;
      this.field_46837 = var2;
   }

   public void method_42136(PlayerEntity var1) {
      this.field_46833.configurePlayerCapabilities(var1.playerAbilities);
   }

   public void method_42141(GameType var1) {
      this.field_46828 = var1;
   }

   public void method_42126(GameType var1) {
      if (var1 != this.field_46833) {
         this.field_46828 = this.field_46833;
      }

      this.field_46833 = var1;
      this.field_46833.configurePlayerCapabilities(this.field_46835.thePlayer.playerAbilities);
   }

   public boolean shouldDrawHUD() {
      return this.field_46833.method_21593();
   }

   public boolean method_42152(BlockPos var1) {
      if (!this.field_46835.thePlayer.method_3228(this.field_46835.theWorld, var1, this.field_46833)) {
         ClientWorld var4 = this.field_46835.theWorld;
         class_2522 var5 = var4.method_28262(var1);
         if (!this.field_46835.thePlayer.method_26446().method_27960().method_11203(var5, var4, var1, this.field_46835.thePlayer)) {
            return false;
         } else {
            class_6414 var6 = var5.method_8360();
            if ((var6 instanceof class_8151 || var6 instanceof class_7297 || var6 instanceof class_195) && !this.field_46835.thePlayer.method_3184()) {
               return false;
            } else if (!var5.method_8345()) {
               var6.method_29265(var4, var1, var5, this.field_46835.thePlayer);
               class_4774 var7 = var4.method_28258(var1);
               boolean var8 = var4.method_7513(var1, var7.method_22006(), 11);
               if (var8) {
                  var6.method_29290(var4, var1, var5);
               }

               return var8;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public boolean method_42142(BlockPos var1, Direction var2) {
      if (!this.field_46835.thePlayer.method_3228(this.field_46835.theWorld, var1, this.field_46833)) {
         if (!this.field_46835.theWorld.method_6673().method_9813(var1)) {
            return false;
         } else {
            if (!this.field_46833.method_21587()) {
               if (!this.field_46829 || !this.method_42160(var1)) {
                  if (this.field_46829) {
                     this.method_42127(class_7500.field_38264, this.field_46836, var2);
                  }

                  class_2522 var5 = this.field_46835.theWorld.method_28262(var1);
                  this.field_46835.method_8531().method_40533(this.field_46835.theWorld, var1, var5, 0.0F);
                  this.method_42127(class_7500.field_38263, var1, var2);
                  boolean var6 = !var5.method_8345();
                  if (var6 && this.field_46832 == 0.0F) {
                     var5.method_8307(this.field_46835.theWorld, var1, this.field_46835.thePlayer);
                  }

                  if (var6 && var5.method_8311(this.field_46835.thePlayer, this.field_46835.thePlayer.world, var1) >= 1.0F) {
                     this.method_42152(var1);
                  } else {
                     this.field_46829 = true;
                     this.field_46836 = var1;
                     this.field_46827 = this.field_46835.thePlayer.method_26446();
                     this.field_46832 = 0.0F;
                     this.field_46825 = 0.0F;
                     this.field_46835
                        .theWorld
                        .method_29568(this.field_46835.thePlayer.method_37145(), this.field_46836, (int)(this.field_46832 * 10.0F) - 1);
                  }
               }
            } else {
               class_2522 var7 = this.field_46835.theWorld.method_28262(var1);
               this.field_46835.method_8531().method_40533(this.field_46835.theWorld, var1, var7, 1.0F);
               this.method_42127(class_7500.field_38263, var1, var2);
               this.method_42152(var1);
               this.field_46831 = 5;
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public void method_42135() {
      if (this.field_46829) {
         class_2522 var3 = this.field_46835.theWorld.method_28262(this.field_46836);
         this.field_46835.method_8531().method_40533(this.field_46835.theWorld, this.field_46836, var3, -1.0F);
         this.method_42127(class_7500.field_38264, this.field_46836, Direction.field_802);
         this.field_46829 = false;
         this.field_46832 = 0.0F;
         this.field_46835.theWorld.method_29568(this.field_46835.thePlayer.method_37145(), this.field_46836, -1);
         this.field_46835.thePlayer.method_3164();
      }
   }

   public boolean method_42163(BlockPos var1, Direction var2) {
      this.method_42129();
      if (this.field_46831 <= 0) {
         if (this.field_46833.method_21587() && this.field_46835.theWorld.method_6673().method_9813(var1)) {
            this.field_46831 = 5;
            class_2522 var7 = this.field_46835.theWorld.method_28262(var1);
            this.field_46835.method_8531().method_40533(this.field_46835.theWorld, var1, var7, 1.0F);
            this.method_42127(class_7500.field_38263, var1, var2);
            this.method_42152(var1);
            return true;
         } else if (!this.method_42160(var1)) {
            return this.method_42142(var1, var2);
         } else {
            class_2522 var5 = this.field_46835.theWorld.method_28262(var1);
            if (!var5.method_8345()) {
               this.field_46832 = this.field_46832 + var5.method_8311(this.field_46835.thePlayer, this.field_46835.thePlayer.world, var1);
               if (this.field_46825 % 4.0F == 0.0F) {
                  class_4618 var6 = var5.method_8316();
                  this.field_46835
                     .getSoundHandler()
                     .play(
                        new class_4949(var6.method_21392(), class_562.field_3322, (var6.method_21395() + 1.0F) / 8.0F, var6.method_21393() * 0.5F, var1)
                     );
               }

               this.field_46825++;
               this.field_46835.method_8531().method_40533(this.field_46835.theWorld, var1, var5, class_9299.method_42828(this.field_46832, 0.0F, 1.0F));
               if (this.field_46832 >= 1.0F) {
                  this.field_46829 = false;
                  this.method_42127(class_7500.field_38258, var1, var2);
                  this.method_42152(var1);
                  this.field_46832 = 0.0F;
                  this.field_46825 = 0.0F;
                  this.field_46831 = 5;
               }

               this.field_46835.theWorld.method_29568(this.field_46835.thePlayer.method_37145(), this.field_46836, (int)(this.field_46832 * 10.0F) - 1);
               return true;
            } else {
               this.field_46829 = false;
               return false;
            }
         }
      } else {
         this.field_46831--;
         return true;
      }
   }

   public float method_42146() {
      return !this.field_46833.method_21587() ? 4.5F : 5.0F;
   }

   public void method_42137() {
      this.method_42129();
      if (!this.field_46837.method_9091().method_23493()) {
         this.field_46837.method_9091().method_23480();
      } else {
         this.field_46837.method_9091().method_23483();
      }
   }

   private boolean method_42160(BlockPos var1) {
      ItemStack var4 = this.field_46835.thePlayer.method_26446();
      boolean var5 = this.field_46827.method_28022() && var4.method_28022();
      if (!this.field_46827.method_28022() && !var4.method_28022()) {
         var5 = var4.method_27960() == this.field_46827.method_27960()
            && ItemStack.method_27956(var4, this.field_46827)
            && (var4.method_27959() || var4.method_28026() == this.field_46827.method_28026());
      }

      return var1.equals(this.field_46836) && var5;
   }

   public void method_42129() {
      int var3 = this.field_46835.thePlayer.inventory.field_36404;
      if (var3 != this.field_46834) {
         this.field_46834 = var3;
         this.field_46837.sendPacket(new class_7371(this.field_46834));
      }
   }

   public class_6910 method_42147(ClientPlayerEntity var1, ClientWorld var2, Hand var3, class_9529 var4) {
      this.method_42129();
      BlockPos var7 = var4.method_43955();
      if (this.field_46835.theWorld.method_6673().method_9813(var7)) {
         ItemStack var8 = var1.method_26617(var3);
         if (this.field_46833 == GameType.SPECTATOR) {
            this.field_46837.sendPacket(new class_8585(var3, var4));
            return class_6910.field_35520;
         } else {
            boolean var9 = !var1.method_26446().method_28022() || !var1.method_26568().method_28022();
            boolean var10 = var1.method_3236() && var9;
            if (!var10) {
               class_6910 var11 = var2.method_28262(var7).method_8322(var2, var1, var3, var4);
               if (var11.method_31662()) {
                  this.field_46837.sendPacket(new class_8585(var3, var4));
                  return var11;
               }
            }

            this.field_46837.sendPacket(new class_8585(var3, var4));
            if (!var8.method_28022() && !var1.method_3173().method_32954(var8.method_27960())) {
               class_4734 var14 = new class_4734(var1, var3, var4);
               class_6910 var12;
               if (!this.field_46833.method_21587()) {
                  var12 = var8.method_27972(var14);
               } else {
                  int var13 = var8.method_27997();
                  var12 = var8.method_27972(var14);
                  var8.method_28017(var13);
               }

               return var12;
            } else {
               return class_6910.field_35521;
            }
         }
      } else {
         return class_6910.field_35517;
      }
   }

   public class_6910 method_42155(PlayerEntity var1, World var2, Hand var3) {
      if (this.field_46833 != GameType.SPECTATOR) {
         this.method_42129();
         this.field_46837.sendPacket(new class_1022(var3));
         ItemStack var6 = var1.method_26617(var3);
         if (!var1.method_3173().method_32954(var6.method_27960())) {
            int var7 = var6.method_27997();
            class_954 var8 = var6.method_28006(var2, var1, var3);
            ItemStack var9 = (ItemStack)var8.method_4203();
            if (var9 != var6) {
               var1.method_26615(var3, var9);
            }

            return var8.method_4204();
         } else {
            return class_6910.field_35521;
         }
      } else {
         return class_6910.field_35521;
      }
   }

   public ClientPlayerEntity method_42131(ClientWorld var1, StatisticsManager var2, ClientRecipeBook var3) {
      return this.method_42130(var1, var2, var3, false, false);
   }

   public ClientPlayerEntity method_42130(ClientWorld var1, StatisticsManager var2, ClientRecipeBook var3, boolean var4, boolean var5) {
      return new ClientPlayerEntity(this.field_46835, var1, this.field_46837, var2, var3, var4, var5);
   }

   public void method_42138(PlayerEntity var1, Entity var2) {
      this.method_42129();
      this.field_46837.sendPacket(new class_3398(var2, var1.isSneaking()));
      if (this.field_46833 != GameType.SPECTATOR) {
         var1.method_3158(var2);
         var1.method_3164();
      }
   }

   public class_6910 method_42144(PlayerEntity var1, Entity var2, Hand var3) {
      this.method_42129();
      this.field_46837.sendPacket(new class_3398(var2, var3, var1.isSneaking()));
      return this.field_46833 != GameType.SPECTATOR ? var1.method_3204(var2, var3) : class_6910.field_35521;
   }

   public class_6910 method_42145(PlayerEntity var1, Entity var2, class_5631 var3, Hand var4) {
      this.method_42129();
      class_1343 var7 = var3.method_33993().method_6193(var2.getPosX(), var2.method_37309(), var2.getPosZ());
      this.field_46837.sendPacket(new class_3398(var2, var4, var7, var1.isSneaking()));
      return this.field_46833 != GameType.SPECTATOR ? var2.method_37227(var1, var7, var4) : class_6910.field_35521;
   }

   public ItemStack method_42134(int var1, int var2, int var3, class_6269 var4, PlayerEntity var5) {
      return class_2740.method_12355(var1, var2, var3, var4, var5);
   }

   public void method_42151(int var1, class_8932<?> var2, boolean var3) {
      this.field_46837.sendPacket(new class_6072(var1, var2, var3));
   }

   public void method_42154(int var1, int var2) {
      this.field_46837.sendPacket(new class_8635(var1, var2));
   }

   public void method_42148(ItemStack var1, int var2) {
      if (this.field_46833.method_21587()) {
         this.field_46837.sendPacket(new class_6362(var2, var1));
      }
   }

   public void method_42157(ItemStack var1) {
      if (this.field_46833.method_21587() && !var1.method_28022()) {
         this.field_46837.sendPacket(new class_6362(-1, var1));
      }
   }

   public void method_42139(PlayerEntity var1) {
      this.method_42129();
      this.field_46837.sendPacket(new class_1586(class_7500.field_38259, BlockPos.field_7306, Direction.field_802));
      var1.method_26474();
   }

   public boolean gameIsSurvivalOrAdventure() {
      return this.field_46833.method_21593();
   }

   public boolean method_42149() {
      return !this.field_46833.method_21587();
   }

   public boolean method_42140() {
      return this.field_46833.method_21587();
   }

   public boolean method_42143() {
      return this.field_46833.method_21587();
   }

   public boolean method_42161() {
      return this.field_46835.thePlayer.isPassenger() && this.field_46835.thePlayer.getRidingEntity() instanceof class_4109;
   }

   public boolean method_42153() {
      return this.field_46833 == GameType.SPECTATOR;
   }

   public GameType method_42132() {
      return this.field_46828;
   }

   public GameType getCurrentGameType() {
      return this.field_46833;
   }

   public boolean method_42156() {
      return this.field_46829;
   }

   public void method_42128(int var1) {
      this.field_46837.sendPacket(new class_4006(var1));
   }

   private void method_42127(class_7500 var1, BlockPos var2, Direction var3) {
      ClientPlayerEntity var6 = this.field_46835.thePlayer;
      this.field_46830.put(Pair.of(var2, var1), var6.method_37245());
      this.field_46837.sendPacket(new class_1586(var1, var2, var3));
   }

   public void method_42159(ClientWorld var1, BlockPos var2, class_2522 var3, class_7500 var4, boolean var5) {
      class_1343 var8 = (class_1343)this.field_46830.remove(Pair.of(var2, var4));
      class_2522 var9 = var1.method_28262(var2);
      if ((var8 == null || !var5 || var4 != class_7500.field_38263 && var9 != var3) && var9 != var3) {
         var1.method_743(var2, var3);
         ClientPlayerEntity var10 = this.field_46835.thePlayer;
         if (var8 != null && var1 == var10.world && var10.method_37381(var2, var3)) {
            var10.method_37165(var8.field_7336, var8.field_7333, var8.field_7334);
         }
      }

      while (this.field_46830.size() >= 50) {
         Pair var11 = (Pair)this.field_46830.firstKey();
         this.field_46830.removeFirst();
         field_46824.error("Too many unacked block actions, dropping " + var11);
      }
   }
}
