package mapped;

import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlayerController {
   private static final Logger field31357 = LogManager.getLogger();
   public final Minecraft field31358;
   public final ClientPlayNetHandler field31359;
   private BlockPos field31360 = new BlockPos(-1, -1, -1);
   private ItemStack field31361 = ItemStack.EMPTY;
   public float field31362;
   private float field31363;
   public int field31364;
   private boolean field31365;
   private Class1894 field31366 = Class1894.field11102;
   private Class1894 field31367 = Class1894.field11101;
   private final Object2ObjectLinkedOpenHashMap<Pair<BlockPos, Class2070>, Vector3d> field31368 = new Object2ObjectLinkedOpenHashMap();
   private int field31369;

   public PlayerController(Minecraft var1, ClientPlayNetHandler var2) {
      this.field31358 = var1;
      this.field31359 = var2;
   }

   public void method23127(PlayerEntity var1) {
      this.field31366.method8155(var1.field4919);
   }

   public void method23128(Class1894 var1) {
      this.field31367 = var1;
   }

   public void method23129(Class1894 var1) {
      if (var1 != this.field31366) {
         this.field31367 = this.field31366;
      }

      this.field31366 = var1;
      this.field31366.method8155(this.field31358.player.field4919);
   }

   public boolean method23130() {
      return this.field31366.method8158();
   }

   public boolean method23131(BlockPos var1) {
      if (!this.field31358.player.method2848(this.field31358.world, var1, this.field31366)) {
         Class1656 var4 = this.field31358.world;
         Class7380 var5 = var4.method6738(var1);
         if (!this.field31358.player.method3090().method32107().method11706(var5, var4, var1, this.field31358.player)) {
            return false;
         } else {
            Block var6 = var5.method23383();
            if ((var6 instanceof Class3355 || var6 instanceof Class3367 || var6 instanceof Class3249) && !this.field31358.player.method2979()) {
               return false;
            } else if (!var5.method23393()) {
               var6.method11574(var4, var1, var5, this.field31358.player);
               Class7379 var7 = var4.method6739(var1);
               boolean var8 = var4.method6725(var1, var7.method23484(), 11);
               if (var8) {
                  var6.method11551(var4, var1, var5);
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

   public boolean method23132(BlockPos var1, Direction var2) {
      if (!this.field31358.player.method2848(this.field31358.world, var1, this.field31366)) {
         if (!this.field31358.world.method6810().method24523(var1)) {
            return false;
         } else {
            if (!this.field31366.method8157()) {
               if (!this.field31365 || !this.method23137(var1)) {
                  if (this.field31365) {
                     this.method23160(Class2070.field13485, this.field31360, var2);
                  }

                  Class7380 var5 = this.field31358.world.method6738(var1);
                  this.field31358.method1567().method37026(this.field31358.world, var1, var5, 0.0F);
                  this.method23160(Class2070.field13484, var1, var2);
                  boolean var6 = !var5.method23393();
                  if (var6 && this.field31362 == 0.0F) {
                     var5.method23436(this.field31358.world, var1, this.field31358.player);
                  }

                  if (var6 && var5.method23406(this.field31358.player, this.field31358.player.field5024, var1) >= 1.0F) {
                     this.method23131(var1);
                  } else {
                     this.field31365 = true;
                     this.field31360 = var1;
                     this.field31361 = this.field31358.player.method3090();
                     this.field31362 = 0.0F;
                     this.field31363 = 0.0F;
                     this.field31358.world.method6803(this.field31358.player.method3205(), this.field31360, (int)(this.field31362 * 10.0F) - 1);
                  }
               }
            } else {
               Class7380 var7 = this.field31358.world.method6738(var1);
               this.field31358.method1567().method37026(this.field31358.world, var1, var7, 1.0F);
               this.method23160(Class2070.field13484, var1, var2);
               this.method23131(var1);
               this.field31364 = 5;
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public void method23133() {
      if (this.field31365) {
         Class7380 var3 = this.field31358.world.method6738(this.field31360);
         this.field31358.method1567().method37026(this.field31358.world, this.field31360, var3, -1.0F);
         this.method23160(Class2070.field13485, this.field31360, Direction.field672);
         this.field31365 = false;
         this.field31362 = 0.0F;
         this.field31358.world.method6803(this.field31358.player.method3205(), this.field31360, -1);
         this.field31358.player.method2975();
      }
   }

   public boolean method23134(BlockPos var1, Direction var2) {
      this.method23138();
      if (this.field31364 <= 0) {
         if (this.field31366.method8157() && this.field31358.world.method6810().method24523(var1)) {
            this.field31364 = 5;
            Class7380 var7 = this.field31358.world.method6738(var1);
            this.field31358.method1567().method37026(this.field31358.world, var1, var7, 1.0F);
            this.method23160(Class2070.field13484, var1, var2);
            this.method23131(var1);
            return true;
         } else if (!this.method23137(var1)) {
            return this.method23132(var1, var2);
         } else {
            Class7380 var5 = this.field31358.world.method6738(var1);
            if (!var5.method23393()) {
               this.field31362 = this.field31362 + var5.method23406(this.field31358.player, this.field31358.player.field5024, var1);
               if (this.field31363 % 4.0F == 0.0F) {
                  Class8447 var6 = var5.method23452();
                  this.field31358
                     .method1546()
                     .method1000(new Class6339(var6.method29715(), Class2266.field14732, (var6.method29710() + 1.0F) / 8.0F, var6.method29711() * 0.5F, var1));
               }

               this.field31363++;
               this.field31358.method1567().method37026(this.field31358.world, var1, var5, MathHelper.method37777(this.field31362, 0.0F, 1.0F));
               if (this.field31362 >= 1.0F) {
                  this.field31365 = false;
                  this.method23160(Class2070.field13486, var1, var2);
                  this.method23131(var1);
                  this.field31362 = 0.0F;
                  this.field31363 = 0.0F;
                  this.field31364 = 5;
               }

               this.field31358.world.method6803(this.field31358.player.method3205(), this.field31360, (int)(this.field31362 * 10.0F) - 1);
               return true;
            } else {
               this.field31365 = false;
               return false;
            }
         }
      } else {
         this.field31364--;
         return true;
      }
   }

   public float method23135() {
      return !this.field31366.method8157() ? 4.5F : 5.0F;
   }

   public void method23136() {
      this.method23138();
      if (!this.field31359.method15589().method30707()) {
         this.field31359.method15589().method30713();
      } else {
         this.field31359.method15589().method30698();
      }
   }

   private boolean method23137(BlockPos var1) {
      ItemStack var4 = this.field31358.player.method3090();
      boolean var5 = this.field31361.method32105() && var4.method32105();
      if (!this.field31361.method32105() && !var4.method32105()) {
         var5 = var4.method32107() == this.field31361.method32107()
            && ItemStack.method32127(var4, this.field31361)
            && (var4.method32115() || var4.method32117() == this.field31361.method32117());
      }

      return var1.equals(this.field31360) && var5;
   }

   public void method23138() {
      int var3 = this.field31358.player.field4902.field5443;
      if (var3 != this.field31369) {
         this.field31369 = var3;
         this.field31359.sendPacket(new Class5539(this.field31369));
      }
   }

   public ActionResultType method23139(ClientPlayerEntity var1, Class1656 var2, Hand var3, Class8711 var4) {
      this.method23138();
      BlockPos var7 = var4.method31423();
      if (this.field31358.world.method6810().method24523(var7)) {
         ItemStack var8 = var1.getHeldItem(var3);
         if (this.field31366 == Class1894.field11105) {
            this.field31359.sendPacket(new Class5570(var3, var4));
            return ActionResultType.field14818;
         } else {
            boolean var9 = !var1.method3090().method32105() || !var1.method3091().method32105();
            boolean var10 = var1.method2851() && var9;
            if (!var10) {
               ActionResultType var11 = var2.method6738(var7).method23435(var2, var1, var3, var4);
               if (var11.isSuccessOrConsume()) {
                  this.field31359.sendPacket(new Class5570(var3, var4));
                  return var11;
               }
            }

            this.field31359.sendPacket(new Class5570(var3, var4));
            if (!var8.method32105() && !var1.method2976().method19635(var8.method32107())) {
               Class5911 var14 = new Class5911(var1, var3, var4);
               ActionResultType var12;
               if (!this.field31366.method8157()) {
                  var12 = var8.method32108(var14);
               } else {
                  int var13 = var8.method32179();
                  var12 = var8.method32108(var14);
                  var8.method32180(var13);
               }

               return var12;
            } else {
               return ActionResultType.field14820;
            }
         }
      } else {
         return ActionResultType.field14821;
      }
   }

   public ActionResultType method23140(PlayerEntity var1, World var2, Hand var3) {
      if (this.field31366 != Class1894.field11105) {
         this.method23138();
         this.field31359.sendPacket(new Class5555(var3));
         ItemStack var6 = var1.getHeldItem(var3);
         if (!var1.method2976().method19635(var6.method32107())) {
            int var7 = var6.method32179();
            Class6794 var8 = var6.method32110(var2, var1, var3);
            ItemStack var9 = (ItemStack)var8.method20695();
            if (var9 != var6) {
               var1.method3095(var3, var9);
            }

            return var8.method20694();
         } else {
            return ActionResultType.field14820;
         }
      } else {
         return ActionResultType.field14820;
      }
   }

   public ClientPlayerEntity createPlayer(Class1656 var1, Class8286 var2, Class6943 var3) {
      return this.func_239167_a_(var1, var2, var3, false, false);
   }

   public ClientPlayerEntity func_239167_a_(Class1656 var1, Class8286 var2, Class6943 var3, boolean var4, boolean var5) {
      return new ClientPlayerEntity(this.field31358, var1, this.field31359, var2, var3, var4, var5);
   }

   public void method23141(PlayerEntity var1, Entity var2) {
      this.method23138();
      this.field31359.sendPacket(new CUseEntityPacket(var2, var1.method3331()));
      if (this.field31366 != Class1894.field11105) {
         var1.method2817(var2);
         var1.method2975();
      }
   }

   public ActionResultType method23142(PlayerEntity var1, Entity var2, Hand var3) {
      this.method23138();
      this.field31359.sendPacket(new CUseEntityPacket(var2, var3, var1.method3331()));
      return this.field31366 != Class1894.field11105 ? var1.interactOn(var2, var3) : ActionResultType.field14820;
   }

   public ActionResultType method23143(PlayerEntity var1, Entity var2, Class8709 var3, Hand var4) {
      this.method23138();
      Vector3d var7 = var3.method31419().method11337(var2.getPosX(), var2.getPosY(), var2.getPosZ());
      this.field31359.sendPacket(new CUseEntityPacket(var2, var4, var7, var1.method3331()));
      return this.field31366 != Class1894.field11105 ? var2.applyPlayerInteraction(var1, var7, var4) : ActionResultType.field14820;
   }

   public ItemStack method23144(int var1, int var2, int var3, Class2259 var4, PlayerEntity var5) {
      return Class7789.method25869(var1, var2, var3, var4, var5);
   }

   public void method23145(int var1, Class4843<?> var2, boolean var3) {
      this.field31359.sendPacket(new Class5613(var1, var2, var3));
   }

   public void method23146(int var1, int var2) {
      this.field31359.sendPacket(new Class5533(var1, var2));
   }

   public void method23147(ItemStack var1, int var2) {
      if (this.field31366.method8157()) {
         this.field31359.sendPacket(new Class5514(var2, var1));
      }
   }

   public void method23148(ItemStack var1) {
      if (this.field31366.method8157() && !var1.method32105()) {
         this.field31359.sendPacket(new Class5514(-1, var1));
      }
   }

   public void method23149(PlayerEntity var1) {
      this.method23138();
      this.field31359.sendPacket(new Class5492(Class2070.field13489, BlockPos.field13032, Direction.field672));
      var1.method3161();
   }

   public boolean method23150() {
      return this.field31366.method8158();
   }

   public boolean method23151() {
      return !this.field31366.method8157();
   }

   public boolean method23152() {
      return this.field31366.method8157();
   }

   public boolean method23153() {
      return this.field31366.method8157();
   }

   public boolean method23154() {
      return this.field31358.player.method3328() && this.field31358.player.getRidingEntity() instanceof AbstractHorseEntity;
   }

   public boolean method23155() {
      return this.field31366 == Class1894.field11105;
   }

   public Class1894 method23156() {
      return this.field31367;
   }

   public Class1894 method23157() {
      return this.field31366;
   }

   public boolean method23158() {
      return this.field31365;
   }

   public void method23159(int var1) {
      this.field31359.sendPacket(new Class5568(var1));
   }

   private void method23160(Class2070 var1, BlockPos var2, Direction var3) {
      ClientPlayerEntity var6 = this.field31358.player;
      this.field31368.put(Pair.of(var2, var1), var6.getPositionVec());
      this.field31359.sendPacket(new Class5492(var1, var2, var3));
   }

   public void method23161(Class1656 var1, BlockPos var2, Class7380 var3, Class2070 var4, boolean var5) {
      Vector3d var8 = (Vector3d)this.field31368.remove(Pair.of(var2, var4));
      Class7380 var9 = var1.method6738(var2);
      if ((var8 == null || !var5 || var4 != Class2070.field13484 && var9 != var3) && var9 != var3) {
         var1.method6851(var2, var3);
         ClientPlayerEntity var10 = this.field31358.player;
         if (var8 != null && var1 == var10.field5024 && var10.method3198(var2, var3)) {
            var10.method3270(var8.field18048, var8.field18049, var8.field18050);
         }
      }

      while (this.field31368.size() >= 50) {
         Pair var11 = (Pair)this.field31368.firstKey();
         this.field31368.removeFirst();
         field31357.error("Too many unacked block actions, dropping " + var11);
      }
   }
}
