package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap.Entry;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import net.minecraft.util.text.TranslationTextComponent;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

public class Class1656 extends Class1655 {
   public final Int2ObjectMap<Entity> field9025 = new Int2ObjectOpenHashMap();
   private final ClientPlayNetHandler field9026;
   private final Class264 field9027;
   private final Class6606 field9028;
   private Class6349 field9029;
   private final Minecraft field9030 = Minecraft.getInstance();
   private final List<AbstractClientPlayerEntity> field9031 = Lists.newArrayList();
   private Class6886 field9032 = new Class6886();
   private final Map<String, Class7529> field9033 = Maps.newHashMap();
   private int field9034;
   private final Object2ObjectArrayMap<Class8980, Class8960> field9035 = Util.<Object2ObjectArrayMap<Class8980, Class8960>>method38508(
      new Object2ObjectArrayMap(3), var0 -> {
         var0.put(Class8527.field38301, new Class8960());
         var0.put(Class8527.field38302, new Class8960());
         var0.put(Class8527.field38303, new Class8960());
      }
   );
   private Class1705 field9036;
   private boolean field9037 = false;

   public Class1656(
           ClientPlayNetHandler var1, Class6606 var2, Class8705<Class1655> var3, Class9535 var4, int var5, Supplier<Class7165> var6, Class264 var7, boolean var8, long var9
   ) {
      super(var2, var3, var4, var6, true, var8, var9);
      this.field9026 = var1;
      this.field9028 = var2;
      this.field9027 = var7;
      if (var1 != null && var4 != null) {
         this.field9029 = Class6349.method19301(var4);
         this.field9036 = new Class1705(this, var5);
      }

      this.method6882(new BlockPos(8, 64, 8), 0.0F);
      this.method6766();
      this.method6768();
      if (Class9299.field42768.method20214()) {
         Class9299.method35070(this, Class9299.field42768);
      }

      Class9299.method35085(Class9299.field43004, this);
      if (this.field9030.field1337 != null && this.field9030.field1337.getClass() == PlayerController.class) {
         this.field9030.field1337 = new Class7316(this.field9030, this.field9026);
         Class7050.method21971((Class7316)this.field9030.field1337);
      }
   }

   public Class6349 method6830() {
      return this.field9029;
   }

   public void method6831(BooleanSupplier var1) {
      this.method6810().method24555();
      this.method6832();
      this.method6820().method22503("blocks");
      this.field9036.method7401(var1);
      this.method6820().method22505();
   }

   private void method6832() {
      this.method6833(this.field9018.method20033() + 1L);
      if (this.field9018.method20046().method17135(Class5462.field24232)) {
         this.method6834(this.field9018.method20034() + 1L);
      }
   }

   public void method6833(long var1) {
      this.field9028.method20039(var1);
   }

   public void method6834(long var1) {
      if (var1 >= 0L) {
         this.method6789().<Class7466>method17128(Class5462.field24232).method24175(true, (Class314)null);
      } else {
         var1 = -var1;
         this.method6789().<Class7466>method17128(Class5462.field24232).method24175(false, (Class314)null);
      }

      this.field9028.method20040(var1);
   }

   public Iterable<Entity> method6835() {
      return this.field9025.values();
   }

   public void method6836() {
      Class7165 var3 = this.method6820();
      var3.method22503("entities");
      ObjectIterator var4 = this.field9025.int2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         Entity var6 = (Entity)var5.getValue();
         if (!var6.method3328()) {
            var3.method22503("tick");
            if (!var6.field5041) {
               this.method6754(this::method6837, var6);
            }

            var3.method22505();
            var3.method22503("remove");
            if (var6.field5041) {
               var4.remove();
               this.method6849(var6);
            }

            var3.method22505();
         }
      }

      this.method6753();
      var3.method22505();
   }

   public void method6837(Entity var1) {
      if (!(var1 instanceof PlayerEntity) && !this.method6883().method7351(var1)) {
         this.method6839(var1);
      } else {
         var1.method3274(var1.getPosX(), var1.getPosY(), var1.getPosZ());
         var1.field5033 = var1.field5031;
         var1.field5034 = var1.field5032;
         if (var1.field5071 || var1.method2800()) {
            var1.field5055++;
            this.method6820().method22504(() -> Class2348.field16074.method9181(var1.method3204()).toString());
            if (Class9561.method37057(var1)) {
               var1.tick();
            }

            this.method6820().method22505();
         }

         this.method6839(var1);
         if (var1.field5071) {
            for (Entity var5 : var1.method3408()) {
               this.method6838(var1, var5);
            }
         }
      }
   }

   public void method6838(Entity var1, Entity var2) {
      if (var2.field5041 || var2.method3421() != var1) {
         var2.method2759();
      } else if (var2 instanceof PlayerEntity || this.method6883().method7351(var2)) {
         var2.method3274(var2.getPosX(), var2.getPosY(), var2.getPosZ());
         var2.field5033 = var2.field5031;
         var2.field5034 = var2.field5032;
         if (var2.field5071) {
            var2.field5055++;
            var2.method2868();
         }

         this.method6839(var2);
         if (var2.field5071) {
            for (Entity var6 : var2.method3408()) {
               this.method6838(var2, var6);
            }
         }
      }
   }

   private void method6839(Entity var1) {
      if (var1.method3406()) {
         this.method6820().method22503("chunkCheck");
         int var4 = Class9679.method37769(var1.getPosX() / 16.0);
         int var5 = Class9679.method37769(var1.getPosY() / 16.0);
         int var6 = Class9679.method37769(var1.getPosZ() / 16.0);
         if (!var1.field5071 || var1.field5072 != var4 || var1.field5073 != var5 || var1.field5074 != var6) {
            if (var1.field5071 && this.method6843(var1.field5072, var1.field5074)) {
               this.method6824(var1.field5072, var1.field5074).method7133(var1, var1.field5073);
            }

            if (!var1.method3405() && !this.method6843(var4, var6)) {
               if (var1.field5071) {
                  field8997.warn("Entity {} left loaded chunk area", var1);
               }

               var1.field5071 = false;
            } else {
               this.method6824(var4, var6).method7063(var1);
            }
         }

         this.method6820().method22505();
      }
   }

   public void method6840(Class1674 var1) {
      List<Class944> var4;
      if (!Class9299.field42944.method20238()) {
         var4 = this.field9006;
      } else {
         var4 = (List<Class944>) Class9299.method35072(this, Class9299.field42944);
      }

      var4.addAll(var1.method7145().values());
      this.field9036.method7348().method605(var1.method7072(), false);
   }

   public void method6841(int var1, int var2) {
      this.field9035.forEach((var2x, var3) -> var3.method32732(var1, var2));
   }

   public void method6842() {
      this.field9035.forEach((var0, var1) -> var1.method32733());
   }

   @Override
   public boolean method6843(int var1, int var2) {
      return true;
   }

   public int method6844() {
      return this.field9025.size();
   }

   public void method6845(int var1, AbstractClientPlayerEntity var2) {
      this.method6847(var1, var2);
      this.field9031.add(var2);
   }

   public void method6846(int var1, Entity var2) {
      this.method6847(var1, var2);
   }

   private void method6847(int var1, Entity var2) {
      if (!Class9299.field42807.method20241() || !Class9299.method35085(Class9299.field42807, var2, this)) {
         this.method6848(var1);
         this.field9025.put(var1, var2);
         this.method6883()
            .method7346(Class9679.method37769(var2.getPosX() / 16.0), Class9679.method37769(var2.getPosZ() / 16.0), Class9176.field42145, true)
            .method7063(var2);
         if (Class9299.field42836.method20214()) {
            Class9299.method35070(var2, Class9299.field42836);
         }

         this.method6865(var2);
      }
   }

   public void method6848(int var1) {
      Entity var4 = (Entity)this.field9025.remove(var1);
      if (var4 != null) {
         var4.method2904();
         this.method6849(var4);
      }
   }

   private void method6849(Entity var1) {
      var1.method3200();
      if (var1.field5071) {
         this.method6824(var1.field5072, var1.field5074).method7132(var1);
      }

      this.field9031.remove(var1);
      if (Class9299.field42837.method20214()) {
         Class9299.method35070(var1, Class9299.field42837);
      }

      if (Class9299.field42794.method20241()) {
         Class9299.method35085(Class9299.field42794, var1, this);
      }

      this.method6866(var1);
   }

   public void method6850(Class1674 var1) {
      ObjectIterator var4 = this.field9025.int2ObjectEntrySet().iterator();

      while (var4.hasNext()) {
         Entry var5 = (Entry)var4.next();
         Entity var6 = (Entity)var5.getValue();
         int var7 = Class9679.method37769(var6.getPosX() / 16.0);
         int var8 = Class9679.method37769(var6.getPosZ() / 16.0);
         if (var7 == var1.method7072().field32174 && var8 == var1.method7072().field32175) {
            var1.method7063(var6);
         }
      }
   }

   @Nullable
   @Override
   public Entity method6774(int var1) {
      return (Entity)this.field9025.get(var1);
   }

   public void method6851(BlockPos var1, Class7380 var2) {
      this.method6725(var1, var2, 19);
   }

   @Override
   public void method6782() {
      this.field9026.method15589().method30701(new TranslationTextComponent("multiplayer.status.quitting"));
   }

   public void method6852(int var1, int var2, int var3) {
      int var6 = 32;
      Random var7 = new Random();
      boolean var8 = false;
      if (this.field9030.field1337.method23157() == Class1894.field11103) {
         for (Class8848 var10 : this.field9030.field1339.method2946()) {
            if (var10.method32107() == Blocks.field36765.method11581()) {
               var8 = true;
               break;
            }
         }
      }

      Mutable var11 = new Mutable();

      for (int var12 = 0; var12 < 667; var12++) {
         this.method6853(var1, var2, var3, 16, var7, var8, var11);
         this.method6853(var1, var2, var3, 32, var7, var8, var11);
      }
   }

   public void method6853(int var1, int var2, int var3, int var4, Random var5, boolean var6, Mutable var7) {
      int var10 = var1 + this.field9016.nextInt(var4) - this.field9016.nextInt(var4);
      int var11 = var2 + this.field9016.nextInt(var4) - this.field9016.nextInt(var4);
      int var12 = var3 + this.field9016.nextInt(var4) - this.field9016.nextInt(var4);
      var7.method8372(var10, var11, var12);
      Class7380 var13 = this.method6738(var7);
      var13.method23383().method11512(var13, this, var7, var5);
      Class7379 var14 = this.method6739(var7);
      if (!var14.method23474()) {
         var14.method23480(this, var7, var5);
         Class7436 var15 = var14.method23485();
         if (var15 != null && this.field9016.nextInt(10) == 0) {
            boolean var16 = var13.method23454(this, var7, Direction.field672);
            BlockPos var17 = var7.method8313();
            this.method6854(var17, this.method6738(var17), var15, var16);
         }
      }

      if (var6 && var13.method23448(Blocks.field36765)) {
         this.method6746(Class7940.field34050, (double)var10 + 0.5, (double)var11 + 0.5, (double)var12 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!var13.method23456(this, var7)) {
         this.method7003(var7)
            .method32522()
            .ifPresent(
               var2x -> {
                  if (var2x.method25615(this.field9016)) {
                     this.method6746(
                        var2x.method25614(),
                        (double)var7.method8304() + this.field9016.nextDouble(),
                        (double)var7.getY() + this.field9016.nextDouble(),
                        (double)var7.method8306() + this.field9016.nextDouble(),
                        0.0,
                        0.0,
                        0.0
                     );
                  }
               }
            );
      }
   }

   private void method6854(BlockPos var1, Class7380 var2, Class7436 var3, boolean var4) {
      if (var2.method23449().method23474()) {
         Class6408 var7 = var2.method23414(this, var1);
         double var8 = var7.method19513(Class113.field414);
         if (!(var8 < 1.0)) {
            if (!var2.method23446(Class7645.field32781)) {
               double var10 = var7.method19512(Class113.field414);
               if (!(var10 > 0.0)) {
                  BlockPos var12 = var1.method8313();
                  Class7380 var13 = this.method6738(var12);
                  Class6408 var14 = var13.method23414(this, var12);
                  double var15 = var14.method19513(Class113.field414);
                  if (var15 < 1.0 && var13.method23449().method23474()) {
                     this.method6855(var1, var3, var7, (double)var1.getY() - 0.05);
                  }
               } else {
                  this.method6855(var1, var3, var7, (double)var1.getY() + var10 - 0.05);
               }
            }
         } else if (var4) {
            this.method6856(
               (double)var1.method8304(),
               (double)(var1.method8304() + 1),
               (double)var1.method8306(),
               (double)(var1.method8306() + 1),
               (double)(var1.getY() + 1) - 0.05,
               var3
            );
         }
      }
   }

   private void method6855(BlockPos var1, Class7436 var2, Class6408 var3, double var4) {
      this.method6856(
         (double)var1.method8304() + var3.method19512(Class113.field413),
         (double)var1.method8304() + var3.method19513(Class113.field413),
         (double)var1.method8306() + var3.method19512(Class113.field415),
         (double)var1.method8306() + var3.method19513(Class113.field415),
         var4,
         var2
      );
   }

   private void method6856(double var1, double var3, double var5, double var7, double var9, Class7436 var11) {
      this.method6746(
         var11,
         Class9679.method37822(this.field9016.nextDouble(), var1, var3),
         var9,
         Class9679.method37822(this.field9016.nextDouble(), var5, var7),
         0.0,
         0.0,
         0.0
      );
   }

   public void method6857() {
      ObjectIterator var3 = this.field9025.int2ObjectEntrySet().iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         Entity var5 = (Entity)var4.getValue();
         if (var5.field5041) {
            var3.remove();
            this.method6849(var5);
         }
      }
   }

   @Override
   public Class8965 method6802(Class4526 var1) {
      Class8965 var4 = super.method6802(var1);
      var4.method32806("Server brand", () -> this.field9030.field1339.method5395());
      var4.method32806("Server type", () -> this.field9030.method1531() != null ? "Integrated singleplayer server" : "Non-integrated multiplayer server");
      return var4;
   }

   @Override
   public void method6743(PlayerEntity var1, double var2, double var4, double var6, Class9455 var8, Class2266 var9, float var10, float var11) {
      if (Class9299.field42848.method20214()) {
         Object var14 = Class9299.field42848.method20217(var1, var8, var9, var10, var11);
         if (Class9299.method35064(var14, Class9299.field42809) || Class9299.method35070(var14, Class9299.field42980) == null) {
            return;
         }

         var8 = (Class9455)Class9299.method35070(var14, Class9299.field42980);
         var9 = (Class2266)Class9299.method35070(var14, Class9299.field42981);
         var10 = Class9299.method35067(var14, Class9299.field42982);
      }

      if (var1 == this.field9030.field1339) {
         this.method6745(var2, var4, var6, var8, var9, var10, var11, false);
      }
   }

   @Override
   public void method6744(PlayerEntity var1, Entity var2, Class9455 var3, Class2266 var4, float var5, float var6) {
      if (Class9299.field42848.method20214()) {
         Object var9 = Class9299.field42848.method20217(var1, var3, var4, var5, var6);
         if (Class9299.method35064(var9, Class9299.field42809) || Class9299.method35070(var9, Class9299.field42980) == null) {
            return;
         }

         var3 = (Class9455)Class9299.method35070(var9, Class9299.field42980);
         var4 = (Class2266)Class9299.method35070(var9, Class9299.field42981);
         var5 = Class9299.method35067(var9, Class9299.field42982);
      }

      if (var1 == this.field9030.field1339) {
         this.field9030.method1546().method1000(new Class6332(var3, var4, var2));
      }
   }

   public void method6858(BlockPos var1, Class9455 var2, Class2266 var3, float var4, float var5, boolean var6) {
      this.method6745((double)var1.method8304() + 0.5, (double)var1.getY() + 0.5, (double)var1.method8306() + 0.5, var2, var3, var4, var5, var6);
   }

   @Override
   public void method6745(double var1, double var3, double var5, Class9455 var7, Class2266 var8, float var9, float var10, boolean var11) {
      double var14 = this.field9030.field1295.method768().method37504().method11343(var1, var3, var5);
      Class6339 var16 = new Class6339(var7, var8, var9, var10, var1, var3, var5);
      if (var11 && var14 > 100.0) {
         double var17 = Math.sqrt(var14) / 40.0;
         this.field9030.method1546().method1001(var16, (int)(var17 * 20.0));
      } else {
         this.field9030.method1546().method1000(var16);
      }
   }

   @Override
   public void method6804(double var1, double var3, double var5, double var7, double var9, double var11, Class39 var13) {
      this.field9030.field1291.method1199(new Class4591(this, var1, var3, var5, var7, var9, var11, this.field9030.field1291, var13));
   }

   @Override
   public void method6811(Packet<?> var1) {
      this.field9026.sendPacket(var1);
   }

   @Override
   public Class282 method6816() {
      return this.field9026.method15783();
   }

   public void method6859(Class6886 var1) {
      this.field9032 = var1;
   }

   @Override
   public Class6802<Block> method6860() {
      return Class6804.<Block>method20727();
   }

   @Override
   public Class6802<Class7631> method6861() {
      return Class6804.<Class7631>method20727();
   }

   public Class1705 method6883() {
      return this.field9036;
   }

   @Override
   public boolean method6725(BlockPos var1, Class7380 var2, int var3) {
      this.field9037 = this.method6863();
      boolean var6 = super.method6725(var1, var2, var3);
      this.field9037 = false;
      return var6;
   }

   private boolean method6863() {
      if (!(this.field9030.field1337 instanceof Class7316)) {
         return false;
      } else {
         Class7316 var3 = (Class7316)this.field9030.field1337;
         return var3.method23162();
      }
   }

   public boolean method6864() {
      return this.field9037;
   }

   public void method6865(Entity var1) {
      Class9387.method35629(var1, this);
      if (Class7944.method26970()) {
         Class9446.method36307(var1, Class7944.method26874());
      }
   }

   public void method6866(Entity var1) {
      Class9387.method35630(var1, this);
      if (Class7944.method26970()) {
         Class9446.method36308(var1, Class7944.method26874());
      }
   }

   @Nullable
   @Override
   public Class7529 method6798(String var1) {
      return this.field9033.get(var1);
   }

   @Override
   public void method6799(Class7529 var1) {
      this.field9033.put(var1.method24608(), var1);
   }

   @Override
   public int method6800() {
      return 0;
   }

   @Override
   public Class6886 method6805() {
      return this.field9032;
   }

   @Override
   public Class8933 method6817() {
      return this.field9026.method15798();
   }

   @Override
   public Class8904 method6867() {
      return this.field9026.method15802();
   }

   @Override
   public void method6731(BlockPos var1, Class7380 var2, Class7380 var3, int var4) {
      this.field9027.method901(this, var1, var2, var3, var4);
   }

   @Override
   public void method6732(BlockPos var1, Class7380 var2, Class7380 var3) {
      this.field9027.method904(var1, var2, var3);
   }

   public void method6868(int var1, int var2, int var3) {
      this.field9027.method905(var1, var2, var3);
   }

   @Override
   public void method6803(int var1, BlockPos var2, int var3) {
      this.field9027.method920(var1, var2, var3);
   }

   @Override
   public void method6801(int var1, BlockPos var2, int var3) {
      this.field9027.method918(var1, var2, var3);
   }

   @Override
   public void method6869(PlayerEntity var1, int var2, BlockPos var3, int var4) {
      try {
         this.field9027.method919(var1, var2, var3, var4);
      } catch (Throwable var10) {
         Class4526 var8 = Class4526.method14413(var10, "Playing level event");
         Class8965 var9 = var8.method14410("Level event being played");
         var9.method32807("Block coordinates", Class8965.method32804(var3));
         var9.method32807("Event source", var1);
         var9.method32807("Event type", var2);
         var9.method32807("Event data", var4);
         throw new Class2506(var8);
      }
   }

   @Override
   public void method6746(Class7436 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.field9027.method911(var1, var1.method24011().method24006(), var2, var4, var6, var8, var10, var12);
   }

   @Override
   public void method6747(Class7436 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      this.field9027.method911(var1, var1.method24011().method24006() || var2, var3, var5, var7, var9, var11, var13);
   }

   @Override
   public void method6748(Class7436 var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      this.field9027.method912(var1, false, true, var2, var4, var6, var8, var10, var12);
   }

   @Override
   public void method6749(Class7436 var1, boolean var2, double var3, double var5, double var7, double var9, double var11, double var13) {
      this.field9027.method912(var1, var1.method24011().method24006() || var2, true, var3, var5, var7, var9, var11, var13);
   }

   @Override
   public List<AbstractClientPlayerEntity> method6870() {
      return this.field9031;
   }

   @Override
   public Class8907 method6871(int var1, int var2, int var3) {
      return this.method6867().<Class8907>method32453(Class2348.field16106).method9189(Class9495.field44122);
   }

   public float method6872(float var1) {
      float var4 = this.method7001(var1);
      float var5 = 1.0F - (Class9679.method37764(var4 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      var5 = Class9679.method37777(var5, 0.0F, 1.0F);
      var5 = 1.0F - var5;
      var5 = (float)((double)var5 * (1.0 - (double)(this.method6792(var1) * 5.0F) / 16.0));
      var5 = (float)((double)var5 * (1.0 - (double)(this.method6790(var1) * 5.0F) / 16.0));
      return var5 * 0.8F + 0.2F;
   }

   public Vector3d method6873(BlockPos var1, float var2) {
      float var5 = this.method7001(var2);
      float var6 = Class9679.method37764(var5 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      var6 = Class9679.method37777(var6, 0.0F, 1.0F);
      Class8907 var7 = this.method7003(var1);
      int var8 = var7.method32498();
      float var9 = (float)(var8 >> 16 & 0xFF) / 255.0F;
      float var10 = (float)(var8 >> 8 & 0xFF) / 255.0F;
      float var11 = (float)(var8 & 0xFF) / 255.0F;
      var9 *= var6;
      var10 *= var6;
      var11 *= var6;
      float var12 = this.method6792(var2);
      if (var12 > 0.0F) {
         float var13 = (var9 * 0.3F + var10 * 0.59F + var11 * 0.11F) * 0.6F;
         float var14 = 1.0F - var12 * 0.75F;
         var9 = var9 * var14 + var13 * (1.0F - var14);
         var10 = var10 * var14 + var13 * (1.0F - var14);
         var11 = var11 * var14 + var13 * (1.0F - var14);
      }

      float var20 = this.method6790(var2);
      if (var20 > 0.0F) {
         float var21 = (var9 * 0.3F + var10 * 0.59F + var11 * 0.11F) * 0.2F;
         float var15 = 1.0F - var20 * 0.75F;
         var9 = var9 * var15 + var21 * (1.0F - var15);
         var10 = var10 * var15 + var21 * (1.0F - var15);
         var11 = var11 * var15 + var21 * (1.0F - var15);
      }

      if (this.field9034 > 0) {
         float var22 = (float)this.field9034 - var2;
         if (var22 > 1.0F) {
            var22 = 1.0F;
         }

         var22 *= 0.45F;
         var9 = var9 * (1.0F - var22) + 0.8F * var22;
         var10 = var10 * (1.0F - var22) + 0.8F * var22;
         var11 = var11 * (1.0F - var22) + 1.0F * var22;
      }

      return new Vector3d((double)var9, (double)var10, (double)var11);
   }

   public Vector3d method6874(float var1) {
      float var4 = this.method7001(var1);
      float var5 = Class9679.method37764(var4 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      var5 = Class9679.method37777(var5, 0.0F, 1.0F);
      float var6 = 1.0F;
      float var7 = 1.0F;
      float var8 = 1.0F;
      float var9 = this.method6792(var1);
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
      float var17 = this.method6790(var1);
      if (var17 > 0.0F) {
         float var18 = (var6 * 0.3F + var7 * 0.59F + var8 * 0.11F) * 0.2F;
         float var12 = 1.0F - var17 * 0.95F;
         var6 = var6 * var12 + var18 * (1.0F - var12);
         var7 = var7 * var12 + var18 * (1.0F - var12);
         var8 = var8 * var12 + var18 * (1.0F - var12);
      }

      return new Vector3d((double)var6, (double)var7, (double)var8);
   }

   public float method6875(float var1) {
      float var4 = this.method7001(var1);
      float var5 = 1.0F - (Class9679.method37764(var4 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      var5 = Class9679.method37777(var5, 0.0F, 1.0F);
      return var5 * var5 * 0.5F;
   }

   public int method6876() {
      return this.field9034;
   }

   @Override
   public void method6809(int var1) {
      this.field9034 = var1;
   }

   @Override
   public float method6877(Direction var1, boolean var2) {
      boolean var5 = this.method6830().method19307();
      boolean var6 = Class7944.method26921();
      if (!var2) {
         return var5 ? 0.9F : 1.0F;
      } else {
         switch (Class8070.field34651[var1.ordinal()]) {
            case 1:
               return var5 ? 0.9F : (var6 ? Class8981.field40932 : 0.5F);
            case 2:
               return var5 ? 0.9F : 1.0F;
            case 3:
            case 4:
               if (Class7944.method26921()) {
                  return Class8981.field40934;
               }

               return 0.8F;
            case 5:
            case 6:
               if (Class7944.method26921()) {
                  return Class8981.field40933;
               }

               return 0.6F;
            default:
               return 1.0F;
         }
      }
   }

   @Override
   public int method6878(BlockPos var1, Class8980 var2) {
      Class8960 var5 = (Class8960)this.field9035.get(var2);
      return var5.method32731(var1, () -> this.method6879(var1, var2));
   }

   public int method6879(BlockPos var1, Class8980 var2) {
      int var5 = Minecraft.getInstance().field1299.field44606;
      if (var5 == 0) {
         return var2.method32943(this.method7003(var1), (double)var1.method8304(), (double)var1.method8306());
      } else {
         int var6 = (var5 * 2 + 1) * (var5 * 2 + 1);
         int var7 = 0;
         int var8 = 0;
         int var9 = 0;
         Class8893 var10 = new Class8893(
            var1.method8304() - var5, var1.getY(), var1.method8306() - var5, var1.method8304() + var5, var1.getY(), var1.method8306() + var5
         );
         Mutable var11 = new Mutable();

         while (var10.method32365()) {
            var11.method8372(var10.method32366(), var10.method32367(), var10.method32368());
            int var12 = var2.method32943(this.method7003(var11), (double)var11.method8304(), (double)var11.method8306());
            var7 += (var12 & 0xFF0000) >> 16;
            var8 += (var12 & 0xFF00) >> 8;
            var9 += var12 & 0xFF;
         }

         return (var7 / var6 & 0xFF) << 16 | (var8 / var6 & 0xFF) << 8 | var9 / var6 & 0xFF;
      }
   }

   public BlockPos method6880() {
      BlockPos var3 = new BlockPos(this.field9018.method20029(), this.field9018.method20030(), this.field9018.method20031());
      if (!this.method6810().method24523(var3)) {
         var3 = this.method7006(Class101.field299, new BlockPos(this.method6810().method24534(), 0.0, this.method6810().method24535()));
      }

      return var3;
   }

   public float method6881() {
      return this.field9018.method20032();
   }

   public void method6882(BlockPos var1, float var2) {
      this.field9018.method20041(var1, var2);
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public Class6606 method6788() {
      return this.field9028;
   }
}
