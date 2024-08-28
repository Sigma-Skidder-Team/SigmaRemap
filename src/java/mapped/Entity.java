package mapped;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.Class4432;
import com.mentalfrostbyte.jello.event.impl.Class4434;
import it.unimi.dsi.fastutil.objects.Object2DoubleArrayMap;
import it.unimi.dsi.fastutil.objects.Object2DoubleMap;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.ITextComponent$Serializer;
import net.minecraft.util.text.event.ClickEvent;
import net.minecraft.util.text.event.HoverEvent;
import net.minecraft.util.text.event.HoverEvent$Action;
import net.minecraft.util.text.event.HoverEvent$EntityHover;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public abstract class Entity implements Class933, Class909 {
   public static final Logger field5012 = LogManager.getLogger();
   private static final AtomicInteger field5013 = new AtomicInteger();
   private static final List<ItemStack> field5014 = Collections.<ItemStack>emptyList();
   private static final Class6488 field5015 = new Class6488(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static double field5016 = 1.0;
   private final Class8992<?> field5017;
   private int field5018 = field5013.incrementAndGet();
   public boolean field5019;
   private final List<Entity> field5020 = Lists.newArrayList();
   public int field5021;
   private Entity field5022;
   public boolean field5023;
   public World field5024;
   public double field5025;
   public double field5026;
   public double field5027;
   public Vector3d field5028;
   public BlockPos field5029;
   private Vector3d field5030 = Vector3d.field18047;
   public float field5031;
   public float field5032;
   public float field5033;
   public float field5034;
   public Class6488 field5035 = field5015;
   public boolean field5036;
   public boolean field5037;
   public boolean field5038;
   public boolean field5039;
   public Vector3d field5040 = Vector3d.field18047;
   public boolean field5041;
   public float field5042;
   public float field5043;
   public float field5044;
   public float field5045;
   private float field5046 = 1.0F;
   private float field5047 = 1.0F;
   public double field5048;
   public double field5049;
   public double field5050;
   public float field5051;
   public boolean field5052;
   public float field5053;
   public final Random field5054 = new Random();
   public int field5055;
   private int field5056 = -this.method2865();
   public boolean field5057;
   public Object2DoubleMap<Class7608<Class7631>> field5058 = new Object2DoubleArrayMap(2);
   public boolean field5059;
   public Class7608<Class7631> field5060;
   public int field5061;
   public boolean field5062 = true;
   public final Class9361 field5063;
   public static final Class9289<Byte> field5064 = Class9361.<Byte>method35441(Entity.class, Class7784.field33390);
   private static final Class9289<Integer> field5065 = Class9361.<Integer>method35441(Entity.class, Class7784.field33391);
   private static final Class9289<Optional<ITextComponent>> field5066 = Class9361.<Optional<ITextComponent>>method35441(Entity.class, Class7784.field33395);
   public static final Class9289<Boolean> field5067 = Class9361.<Boolean>method35441(Entity.class, Class7784.field33398);
   private static final Class9289<Boolean> field5068 = Class9361.<Boolean>method35441(Entity.class, Class7784.field33398);
   private static final Class9289<Boolean> field5069 = Class9361.<Boolean>method35441(Entity.class, Class7784.field33398);
   public static final Class9289<Class2090> field5070 = Class9361.<Class2090>method35441(Entity.class, Class7784.field33408);
   public boolean field5071;
   public int field5072;
   public int field5073;
   public int field5074;
   private boolean field5075;
   public Vector3d field5076;
   public boolean field5077;
   public boolean field5078;
   private int field5079;
   public boolean field5080;
   public int field5081;
   public BlockPos field5082;
   private boolean field5083;
   public UUID field5084 = MathHelper.method37811(this.field5054);
   public String field5085 = this.field5084.toString();
   public boolean field5086;
   private final Set<String> field5087 = Sets.newHashSet();
   private boolean field5088;
   private final double[] field5089 = new double[]{0.0, 0.0, 0.0};
   private long field5090;
   private Class8847 field5091;
   public float field5092;

   public Entity(Class8992<?> var1, World var2) {
      this.field5017 = var1;
      this.field5024 = var2;
      this.field5091 = var1.method33221();
      this.field5028 = Vector3d.field18047;
      this.field5029 = BlockPos.field13032;
      this.field5076 = Vector3d.field18047;
      this.method3215(0.0, 0.0, 0.0);
      this.field5063 = new Class9361(this);
      this.field5063.method35442(field5064, (byte)0);
      this.field5063.method35442(field5065, this.method3350());
      this.field5063.method35442(field5067, false);
      this.field5063.method35442(field5066, Optional.<ITextComponent>empty());
      this.field5063.method35442(field5068, false);
      this.field5063.method35442(field5069, false);
      this.field5063.method35442(field5070, Class2090.field13619);
      this.method2850();
      this.field5092 = this.method3181(Class2090.field13619, this.field5091);
   }

   public boolean method3198(BlockPos var1, Class7380 var2) {
      Class6408 var5 = var2.method23415(this.field5024, var1, Class4832.method14948(this));
      Class6408 var6 = var5.method19517((double)var1.method8304(), (double)var1.getY(), (double)var1.method8306());
      return Class8022.method27435(var6, Class8022.method27428(this.method3389()), Class9477.field44045);
   }

   public int method3199() {
      Class8219 var3 = this.method3344();
      return var3 != null && var3.method28591().getColor() != null ? var3.method28591().getColor() : 16777215;
   }

   public boolean method2800() {
      return false;
   }

   public final void method3200() {
      if (this.method3329()) {
         this.method3315();
      }

      if (this.method3328()) {
         this.method2759();
      }
   }

   public void method3201(double var1, double var3, double var5) {
      this.method3202(new Vector3d(var1, var3, var5));
   }

   public void method3202(Vector3d var1) {
      this.field5076 = var1;
   }

   public Vector3d method3203() {
      return this.field5076;
   }

   public Class8992<?> method3204() {
      return this.field5017;
   }

   public int method3205() {
      return this.field5018;
   }

   public void method3206(int var1) {
      this.field5018 = var1;
   }

   public Set<String> method3207() {
      return this.field5087;
   }

   public boolean method3208(String var1) {
      return this.field5087.size() < 1024 ? this.field5087.add(var1) : false;
   }

   public boolean method3209(String var1) {
      return this.field5087.remove(var1);
   }

   public void method2995() {
      this.method2904();
   }

   public abstract void method2850();

   public Class9361 method3210() {
      return this.field5063;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof Entity) ? false : ((Entity)var1).field5018 == this.field5018;
   }

   @Override
   public int hashCode() {
      return this.field5018;
   }

   public void method2869() {
      if (this.field5024 != null) {
         for (double var3 = this.getPosY(); var3 > 0.0 && var3 < 256.0; var3++) {
            this.method3215(this.getPosX(), var3, this.getPosZ());
            if (this.field5024.method7052(this)) {
               break;
            }
         }

         this.method3434(Vector3d.field18047);
         this.field5032 = 0.0F;
      }
   }

   public void method2904() {
      this.field5041 = true;
   }

   public void method3211(Class2090 var1) {
      this.field5063.method35446(field5070, var1);
   }

   public Class2090 method3212() {
      return this.field5063.<Class2090>method35445(field5070);
   }

   public boolean method3213(Entity var1, double var2) {
      double var6 = var1.field5028.field18048 - this.field5028.field18048;
      double var8 = var1.field5028.field18049 - this.field5028.field18049;
      double var10 = var1.field5028.field18050 - this.field5028.field18050;
      return var6 * var6 + var8 * var8 + var10 * var10 < var2 * var2;
   }

   public void method3214(float var1, float var2) {
      this.field5031 = var1 % 360.0F;
      this.field5032 = var2 % 360.0F;
   }

   public void method3215(double var1, double var3, double var5) {
      this.method3446(var1, var3, var5);
      this.method3391(this.field5091.method32098(var1, var3, var5));
   }

   public void method3216() {
      this.method3215(this.field5028.field18048, this.field5028.field18049, this.field5028.field18050);
   }

   public void method3217(double var1, double var3) {
      double var7 = var3 * 0.15;
      double var9 = var1 * 0.15;
      this.field5032 = (float)((double)this.field5032 + var7);
      this.field5031 = (float)((double)this.field5031 + var9);
      this.field5032 = MathHelper.method37777(this.field5032, -90.0F, 90.0F);
      this.field5034 = (float)((double)this.field5034 + var7);
      this.field5033 = (float)((double)this.field5033 + var9);
      this.field5034 = MathHelper.method37777(this.field5034, -90.0F, 90.0F);
      if (this.field5022 != null) {
         this.field5022.method3309(this);
      }
   }

   public void tick() {
      if (!this.field5024.field9020) {
         this.method3349(6, this.method3340());
      }

      this.method3000();
   }

   public void method3000() {
      this.field5024.method6820().startSection("entityBaseTick");
      if (this.method3328() && this.getRidingEntity().field5041) {
         this.method2759();
      }

      if (this.field5021 > 0) {
         this.field5021--;
      }

      this.field5042 = this.field5043;
      this.field5034 = this.field5032;
      this.field5033 = this.field5031;
      this.method3324();
      if (this.method3261()) {
         this.method3262();
      }

      this.method3257();
      this.method3259();
      this.method2916();
      if (!this.field5024.field9020) {
         if (this.field5056 > 0) {
            if (!this.method3249()) {
               if (this.field5056 % 20 == 0 && !this.method3264()) {
                  this.method2741(Class8654.field38994, 1.0F);
               }

               this.method2966(this.field5056 - 1);
            } else {
               this.method2966(this.field5056 - 4);
               if (this.field5056 < 0) {
                  this.method3223();
               }
            }
         }
      } else {
         this.method3223();
      }

      if (this.method3264()) {
         this.method3220();
         this.field5045 *= 0.5F;
      }

      if (this.getPosY() < -64.0) {
         this.method3083();
      }

      if (!this.field5024.field9020) {
         this.method3349(0, this.field5056 > 0);
      }

      this.field5062 = false;
      this.field5024.method6820().endSection();
   }

   public void method3218() {
      this.field5079 = this.method2862();
   }

   public boolean method3219() {
      return this.field5079 > 0;
   }

   public void method2816() {
      if (this.method3219()) {
         this.field5079--;
      }
   }

   public int method2858() {
      return 0;
   }

   public void method3220() {
      if (!this.method3249()) {
         this.method3221(15);
         this.method2741(Class8654.field38995, 4.0F);
      }
   }

   public void method3221(int var1) {
      int var4 = var1 * 20;
      if (this instanceof Class880) {
         var4 = Class6096.method18834((Class880)this, var4);
      }

      if (this.field5056 < var4) {
         this.method2966(var4);
      }
   }

   public void method2966(int var1) {
      this.field5056 = var1;
   }

   public int method3222() {
      return this.field5056;
   }

   public void method3223() {
      this.method2966(0);
   }

   public void method3083() {
      this.method2904();
   }

   public boolean method3224(double var1, double var3, double var5) {
      return this.method3225(this.method3389().method19667(var1, var3, var5));
   }

   private boolean method3225(Class6488 var1) {
      return this.field5024.method7053(this, var1) && !this.field5024.method7014(var1);
   }

   public void method3061(boolean var1) {
      this.field5036 = var1;
   }

   public boolean method3226() {
      return this.field5036;
   }

   public void move(Class2107 var1, Vector3d var2) {
      if (Minecraft.getInstance().player != null
         && Minecraft.getInstance().player.getRidingEntity() != null
         && Minecraft.getInstance().player.getRidingEntity().method3205() == this.method3205()) {
         Class4432 var5 = new Class4432(var2.field18048, var2.field18049, var2.field18050);
         Client.getInstance().getEventManager().call(var5);
         if (var5.isCancelled()) {
            return;
         }

         var2 = new Vector3d(var5.method13981(), var5.method13983(), var5.method13985());
      }

      if (this.field5052) {
         this.method3391(this.method3389().method19669(var2));
         this.method3239();
      } else {
         if (var1 == Class2107.field13744) {
            var2 = this.method3231(var2);
            if (var2.equals(Vector3d.field18047)) {
               return;
            }
         }

         this.field5024.method6820().startSection("move");
         if (this.field5040.method11349() > 1.0E-7) {
            var2 = var2.method11346(this.field5040);
            this.field5040 = Vector3d.field18047;
            this.method3434(Vector3d.field18047);
         }

         var2 = this.method2898(var2, var1);
         Vector3d var25 = this.method3233(var2);
         if (var25.method11349() > 1.0E-7) {
            this.method3391(this.method3389().method19669(var25));
            this.method3239();
         }

         this.field5024.method6820().endSection();
         this.field5024.method6820().startSection("rest");
         this.field5037 = !MathHelper.method37787(var2.field18048, var25.field18048) || !MathHelper.method37787(var2.field18050, var25.field18050);
         this.field5038 = var2.field18049 != var25.field18049;
         this.field5036 = this.field5038 && var2.field18049 < 0.0;
         BlockPos var6 = this.method3228();
         Class7380 var7 = this.field5024.method6738(var6);
         this.method2761(var25.field18049, this.field5036, var7, var6);
         Vector3d var8 = this.method3433();
         if (var2.field18048 != var25.field18048) {
            this.method3435(0.0, var8.field18049, var8.field18050);
         }

         if (var2.field18050 != var25.field18050) {
            this.method3435(var8.field18048, var8.field18049, 0.0);
         }

         Block var9 = var7.method23383();
         if (var2.field18049 != var25.field18049) {
            var9.method11568(this.field5024, this);
         }

         if (this.field5036 && !this.method3332()) {
            var9.method11561(this.field5024, var6, this);
         }

         if (this.method2940() && !this.method3328()) {
            double var10 = var25.field18048;
            double var12 = var25.field18049;
            double var14 = var25.field18050;
            if (!var9.method11540(Class7645.field32804)) {
               var12 = 0.0;
            }

            this.field5043 = (float)((double)this.field5043 + (double) MathHelper.method37766(method3234(var25)) * 0.6);
            this.field5044 = (float)((double)this.field5044 + (double) MathHelper.method37766(var10 * var10 + var12 * var12 + var14 * var14) * 0.6);
            if (this.field5044 > this.field5046 && !var7.method23393()) {
               this.field5046 = this.method3238();
               if (!this.method3250()) {
                  this.method3241(var6, var7);
               } else {
                  Entity var16 = this.method3329() && this.method3407() != null ? this.method3407() : this;
                  float var17 = var16 == this ? 0.35F : 0.4F;
                  Vector3d var18 = var16.method3433();
                  float var19 = MathHelper.method37766(
                        var18.field18048 * var18.field18048 * 0.2F + var18.field18049 * var18.field18049 + var18.field18050 * var18.field18050 * 0.2F
                     )
                     * var17;
                  if (var19 > 1.0F) {
                     var19 = 1.0F;
                  }

                  this.method3242(var19);
               }
            } else if (this.field5044 > this.field5047 && this.method3244() && var7.method23393()) {
               this.field5047 = this.method3243(this.field5044);
            }
         }

         try {
            this.method3240();
         } catch (Throwable var23) {
            Class4526 var21 = Class4526.method14413(var23, "Checking entity block collision");
            Class8965 var22 = var21.method14410("Entity being checked for collision");
            this.method3372(var22);
            throw new Class2506(var21);
         }

         float var20 = this.method2977();
         this.method3434(this.method3433().method11347((double)var20, 1.0, (double)var20));
         if (this.field5024
               .method7004(this.method3389().method19679(0.001))
               .noneMatch(var0 -> var0.method23446(Class7645.field32798) || var0.method23448(Blocks.LAVA))
            && this.field5056 <= 0) {
            this.method2966(-this.method2865());
         }

         if (this.method3254() && this.method3327()) {
            this.method2863(Class6067.field26611, 0.7F, 1.6F + (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.4F);
            this.method2966(-this.method2865());
         }

         this.field5024.method6820().endSection();
      }
   }

   public BlockPos method3228() {
      int var3 = MathHelper.method37769(this.field5028.field18048);
      int var4 = MathHelper.method37769(this.field5028.field18049 - 0.2F);
      int var5 = MathHelper.method37769(this.field5028.field18050);
      BlockPos var6 = new BlockPos(var3, var4, var5);
      if (this.field5024.method6738(var6).method23393()) {
         BlockPos var7 = var6.method8313();
         Class7380 var8 = this.field5024.method6738(var7);
         Block var9 = var8.method23383();
         if (var9.method11540(Class7645.field32771) || var9.method11540(Class7645.field32764) || var9 instanceof Class3199) {
            return var7;
         }
      }

      return var6;
   }

   public float method3229() {
      float var3 = this.field5024.method6738(this.method3432()).method23383().method11573();
      float var4 = this.field5024.method6738(this.method3230()).method23383().method11573();
      return (double)var3 != 1.0 ? var3 : var4;
   }

   public float method2977() {
      Block var3 = this.field5024.method6738(this.method3432()).method23383();
      float var4 = var3.method11572();
      if (var3 != Blocks.WATER && var3 != Blocks.field37013) {
         return (double)var4 != 1.0 ? var4 : this.field5024.method6738(this.method3230()).method23383().method11572();
      } else {
         return var4;
      }
   }

   public BlockPos method3230() {
      return new BlockPos(this.field5028.field18048, this.method3389().field28450 - 0.5000001, this.field5028.field18050);
   }

   public Vector3d method2898(Vector3d var1, Class2107 var2) {
      return var1;
   }

   public Vector3d method3231(Vector3d var1) {
      if (!(var1.method11349() <= 1.0E-7)) {
         long var4 = this.field5024.method6783();
         if (var4 != this.field5090) {
            Arrays.fill(this.field5089, 0.0);
            this.field5090 = var4;
         }

         if (var1.field18048 == 0.0) {
            if (var1.field18049 == 0.0) {
               if (var1.field18050 == 0.0) {
                  return Vector3d.field18047;
               } else {
                  double var9 = this.method3232(Class113.field415, var1.field18050);
                  return !(Math.abs(var9) <= 1.0E-5F) ? new Vector3d(0.0, 0.0, var9) : Vector3d.field18047;
               }
            } else {
               double var8 = this.method3232(Class113.field414, var1.field18049);
               return !(Math.abs(var8) <= 1.0E-5F) ? new Vector3d(0.0, var8, 0.0) : Vector3d.field18047;
            }
         } else {
            double var6 = this.method3232(Class113.field413, var1.field18048);
            return !(Math.abs(var6) <= 1.0E-5F) ? new Vector3d(var6, 0.0, 0.0) : Vector3d.field18047;
         }
      } else {
         return var1;
      }
   }

   private double method3232(Class113 var1, double var2) {
      int var6 = var1.ordinal();
      double var7 = MathHelper.method37778(var2 + this.field5089[var6], -0.51, 0.51);
      var2 = var7 - this.field5089[var6];
      this.field5089[var6] = var7;
      return var2;
   }

   public Vector3d method3233(Vector3d var1) {
      Class6488 var4 = this.method3389();
      Class4832 var5 = Class4832.method14948(this);
      Class6408 var6 = this.field5024.method6810().method24527();
      Stream var7 = !Class8022.method27435(var6, Class8022.method27428(var4.method19679(1.0E-7)), Class9477.field44045)
         ? Stream.<Class6408>of(var6)
         : Stream.empty();
      Stream var8 = this.field5024.method7046(this, var4.method19661(var1), var0 -> true);
      Class8544 var9 = new Class8544(Stream.concat(var8, var7));
      Vector3d var10 = var1.method11349() != 0.0 ? method3235(this, var1, var4, this.field5024, var5, var9) : var1;
      boolean var11 = var1.field18048 != var10.field18048;
      boolean var12 = var1.field18049 != var10.field18049;
      boolean var13 = var1.field18050 != var10.field18050;
      boolean var14 = this.field5036 || var12 && var1.field18049 < 0.0;
      if (this.field5051 > 0.0F && var14 && (var11 || var13)) {
         Vector3d var15 = method3235(this, new Vector3d(var1.field18048, (double)this.field5051, var1.field18050), var4, this.field5024, var5, var9);
         Vector3d var16 = method3235(
            this, new Vector3d(0.0, (double)this.field5051, 0.0), var4.method19662(var1.field18048, 0.0, var1.field18050), this.field5024, var5, var9
         );
         if (var16.field18049 < (double)this.field5051) {
            Vector3d var17 = method3235(this, new Vector3d(var1.field18048, 0.0, var1.field18050), var4.method19669(var16), this.field5024, var5, var9)
               .method11338(var16);
            if (method3234(var17) > method3234(var15)) {
               var15 = var17;
            }
         }

         double var18 = !(this instanceof ClientPlayerEntity)
            ? 0.0
            : method3235(this, new Vector3d(0.0, -var15.field18049, 0.0), var4.method19669(var15), this.field5024, var5, var9).field18049 + var15.field18049;
         boolean var20 = false;
         if (var18 != 0.0) {
            Class4434 var21 = new Class4434(var18, var10);
            Client.getInstance().getEventManager().call(var21);
            var20 = var21.isCancelled();
         }

         if (method3234(var15) > method3234(var10) && !var20) {
            return var15.method11338(
               method3235(this, new Vector3d(0.0, -var15.field18049 + var1.field18049, 0.0), var4.method19669(var15), this.field5024, var5, var9)
            );
         }
      }

      return var10;
   }

   public static double method3234(Vector3d var0) {
      return var0.field18048 * var0.field18048 + var0.field18050 * var0.field18050;
   }

   public static Vector3d method3235(Entity var0, Vector3d var1, Class6488 var2, World var3, Class4832 var4, Class8544<Class6408> var5) {
      boolean var8 = var1.field18048 == 0.0;
      boolean var9 = var1.field18049 == 0.0;
      boolean var10 = var1.field18050 == 0.0;
      if (var8 && var9 || var8 && var10 || var9 && var10) {
         boolean var12 = var0 != null && var0 instanceof ClientPlayerEntity;
         return method3237(var1, var2, var3, var4, var5, var12);
      } else {
         Class8544 var11 = new Class8544<Class6408>(Stream.<Class6408>concat(var5.method30440(), var3.method7055(var0, var2.method19661(var1))));
         return method3236(var1, var2, var11);
      }
   }

   public static Vector3d method3236(Vector3d var0, Class6488 var1, Class8544<Class6408> var2) {
      double var5 = var0.field18048;
      double var7 = var0.field18049;
      double var9 = var0.field18050;
      if (var7 != 0.0) {
         var7 = Class8022.method27437(Class113.field414, var1, var2.method30440(), var7);
         if (var7 != 0.0) {
            var1 = var1.method19667(0.0, var7, 0.0);
         }
      }

      boolean var11 = Math.abs(var5) < Math.abs(var9);
      if (var11 && var9 != 0.0) {
         var9 = Class8022.method27437(Class113.field415, var1, var2.method30440(), var9);
         if (var9 != 0.0) {
            var1 = var1.method19667(0.0, 0.0, var9);
         }
      }

      if (var5 != 0.0) {
         var5 = Class8022.method27437(Class113.field413, var1, var2.method30440(), var5);
         if (!var11 && var5 != 0.0) {
            var1 = var1.method19667(var5, 0.0, 0.0);
         }
      }

      if (!var11 && var9 != 0.0) {
         var9 = Class8022.method27437(Class113.field415, var1, var2.method30440(), var9);
      }

      return new Vector3d(var5, var7, var9);
   }

   public static Vector3d method3237(Vector3d var0, Class6488 var1, Class1662 var2, Class4832 var3, Class8544<Class6408> var4, boolean var5) {
      double var8 = var0.field18048;
      double var10 = var0.field18049;
      double var12 = var0.field18050;
      if (var10 != 0.0) {
         var10 = Class8022.method27438(Class113.field414, var1, var2, var10, var3, var4.method30440(), var5);
         if (var10 != 0.0) {
            var1 = var1.method19667(0.0, var10, 0.0);
         }
      }

      boolean var14 = Math.abs(var8) < Math.abs(var12);
      if (var14 && var12 != 0.0) {
         var12 = Class8022.method27438(Class113.field415, var1, var2, var12, var3, var4.method30440(), var5);
         if (var12 != 0.0) {
            var1 = var1.method19667(0.0, 0.0, var12);
         }
      }

      if (var8 != 0.0) {
         var8 = Class8022.method27438(Class113.field413, var1, var2, var8, var3, var4.method30440(), var5);
         if (!var14 && var8 != 0.0) {
            var1 = var1.method19667(var8, 0.0, 0.0);
         }
      }

      if (!var14 && var12 != 0.0) {
         var12 = Class8022.method27438(Class113.field415, var1, var2, var12, var3, var4.method30440(), var5);
      }

      return new Vector3d(var8, var10, var12);
   }

   public float method3238() {
      return (float)((int)this.field5044 + 1);
   }

   public void method3239() {
      Class6488 var3 = this.method3389();
      this.method3446((var3.field28449 + var3.field28452) / 2.0, var3.field28450, (var3.field28451 + var3.field28454) / 2.0);
   }

   public Class9455 method2859() {
      return Class6067.field26615;
   }

   public Class9455 method2860() {
      return Class6067.field26614;
   }

   public Class9455 method2861() {
      return Class6067.field26614;
   }

   public void method3240() {
      Class6488 var3 = this.method3389();
      BlockPos var4 = new BlockPos(var3.field28449 + 0.001, var3.field28450 + 0.001, var3.field28451 + 0.001);
      BlockPos var5 = new BlockPos(var3.field28452 - 0.001, var3.field28453 - 0.001, var3.field28454 - 0.001);
      Mutable var6 = new Mutable();
      if (this.field5024.method7018(var4, var5)) {
         for (int var7 = var4.method8304(); var7 <= var5.method8304(); var7++) {
            for (int var8 = var4.getY(); var8 <= var5.getY(); var8++) {
               for (int var9 = var4.method8306(); var9 <= var5.method8306(); var9++) {
                  var6.method8372(var7, var8, var9);
                  Class7380 var10 = this.field5024.method6738(var6);

                  try {
                     var10.method23432(this.field5024, var6, this);
                     this.method2732(var10);
                  } catch (Throwable var14) {
                     Class4526 var12 = Class4526.method14413(var14, "Colliding entity with block");
                     Class8965 var13 = var12.method14410("Block being collided with");
                     Class8965.method32814(var13, var6, var10);
                     throw new Class2506(var12);
                  }
               }
            }
         }
      }
   }

   public void method2732(Class7380 var1) {
   }

   public void method3241(BlockPos var1, Class7380 var2) {
      if (!var2.method23384().method31085()) {
         Class7380 var5 = this.field5024.method6738(var1.method8311());
         Class8447 var6 = !var5.method23448(Blocks.SNOW) ? var2.method23452() : var5.method23452();
         this.method2863(var6.method29713(), var6.method29710() * 0.15F, var6.method29711());
      }
   }

   public void method3242(float var1) {
      this.method2863(this.method2859(), var1, 1.0F + (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.4F);
   }

   public float method3243(float var1) {
      return 0.0F;
   }

   public boolean method3244() {
      return false;
   }

   public void method2863(Class9455 var1, float var2, float var3) {
      if (!this.method3245()) {
         this.field5024.method6743((PlayerEntity)null, this.getPosX(), this.getPosY(), this.getPosZ(), var1, this.method2864(), var2, var3);
      }
   }

   public boolean method3245() {
      return this.field5063.<Boolean>method35445(field5068);
   }

   public void method3246(boolean var1) {
      this.field5063.method35446(field5068, var1);
   }

   public boolean method3247() {
      return this.field5063.<Boolean>method35445(field5069);
   }

   public void method3248(boolean var1) {
      this.field5063.method35446(field5069, var1);
   }

   public boolean method2940() {
      return true;
   }

   public void method2761(double var1, boolean var3, Class7380 var4, BlockPos var5) {
      if (!var3) {
         if (var1 < 0.0) {
            this.field5045 = (float)((double)this.field5045 - var1);
         }
      } else {
         if (this.field5045 > 0.0F) {
            var4.method23383().method11567(this.field5024, var5, this, this.field5045);
         }

         this.field5045 = 0.0F;
      }
   }

   public boolean method3249() {
      return this.method3204().method33207();
   }

   public boolean method2921(float var1, float var2) {
      if (this.method3329()) {
         for (Entity var6 : this.method3408()) {
            var6.method2921(var1, var2);
         }
      }

      return false;
   }

   public boolean method3250() {
      return this.field5057;
   }

   private boolean method3251() {
      BlockPos var3 = this.method3432();
      return this.field5024.method6796(var3)
         || this.field5024.method6796(new BlockPos((double)var3.method8304(), this.method3389().field28453, (double)var3.method8306()));
   }

   private boolean method3252() {
      return this.field5024.method6738(this.method3432()).method23448(Blocks.field37013);
   }

   public boolean method3253() {
      return this.method3250() || this.method3251();
   }

   public boolean method3254() {
      return this.method3250() || this.method3251() || this.method3252();
   }

   public boolean method3255() {
      return this.method3250() || this.method3252();
   }

   public boolean method3256() {
      return this.field5059 && this.method3250();
   }

   public void method2916() {
      if (!this.method2951()) {
         this.method3339(this.method3337() && this.method3256() && !this.method3328());
      } else {
         this.method3339(this.method3337() && this.method3250() && !this.method3328());
      }
   }

   public boolean method3257() {
      this.field5058.clear();
      this.method3258();
      double var3 = !this.field5024.method6812().method36877() ? 0.0023333333333333335 : 0.007;
      boolean var5 = this.method3426(Class8953.field40470, var3);
      return this.method3250() || var5;
   }

   public void method3258() {
      if (!(this.getRidingEntity() instanceof Class1002)) {
         if (!this.method3426(Class8953.field40469, 0.014)) {
            this.field5057 = false;
         } else {
            if (!this.field5057 && !this.field5062) {
               this.method2925();
            }

            this.field5045 = 0.0F;
            this.field5057 = true;
            this.method3223();
         }
      } else {
         this.field5057 = false;
      }
   }

   private void method3259() {
      this.field5059 = this.method3263(Class8953.field40469);
      this.field5060 = null;
      double var3 = this.method3442() - 0.11111111F;
      Entity var5 = this.getRidingEntity();
      if (var5 instanceof Class1002) {
         Class1002 var6 = (Class1002)var5;
         if (!var6.method3256() && var6.method3389().field28453 >= var3 && var6.method3389().field28450 <= var3) {
            return;
         }
      }

      BlockPos var12 = new BlockPos(this.getPosX(), var3, this.getPosZ());
      Class7379 var7 = this.field5024.method6739(var12);

      for (Class7608 var9 : Class8953.method32717()) {
         if (var7.method23486(var9)) {
            double var10 = (double)((float)var12.getY() + var7.method23475(this.field5024, var12));
            if (var10 > var3) {
               this.field5060 = var9;
            }

            return;
         }
      }
   }

   public void method2925() {
      Entity var3 = this.method3329() && this.method3407() != null ? this.method3407() : this;
      float var4 = var3 != this ? 0.9F : 0.2F;
      Vector3d var5 = var3.method3433();
      float var6 = MathHelper.method37766(
            var5.field18048 * var5.field18048 * 0.2F + var5.field18049 * var5.field18049 + var5.field18050 * var5.field18050 * 0.2F
         )
         * var4;
      if (var6 > 1.0F) {
         var6 = 1.0F;
      }

      if (!((double)var6 < 0.25)) {
         this.method2863(this.method2861(), var6, 1.0F + (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.4F);
      } else {
         this.method2863(this.method2860(), var6, 1.0F + (this.field5054.nextFloat() - this.field5054.nextFloat()) * 0.4F);
      }

      float var7 = (float) MathHelper.method37769(this.getPosY());

      for (int var8 = 0; (float)var8 < 1.0F + this.field5091.field39968 * 20.0F; var8++) {
         double var9 = (this.field5054.nextDouble() * 2.0 - 1.0) * (double)this.field5091.field39968;
         double var11 = (this.field5054.nextDouble() * 2.0 - 1.0) * (double)this.field5091.field39968;
         this.field5024
            .method6746(
               Class7940.field34052,
               this.getPosX() + var9,
               (double)(var7 + 1.0F),
               this.getPosZ() + var11,
               var5.field18048,
               var5.field18049 - this.field5054.nextDouble() * 0.2F,
               var5.field18050
            );
      }

      for (int var13 = 0; (float)var13 < 1.0F + this.field5091.field39968 * 20.0F; var13++) {
         double var14 = (this.field5054.nextDouble() * 2.0 - 1.0) * (double)this.field5091.field39968;
         double var15 = (this.field5054.nextDouble() * 2.0 - 1.0) * (double)this.field5091.field39968;
         this.field5024
            .method6746(
               Class7940.field34099,
               this.getPosX() + var14,
               (double)(var7 + 1.0F),
               this.getPosZ() + var15,
               var5.field18048,
               var5.field18049,
               var5.field18050
            );
      }
   }

   public Class7380 method3260() {
      return this.field5024.method6738(this.method3228());
   }

   public boolean method3261() {
      return this.method3337() && !this.method3250() && !this.method2800() && !this.method3336() && !this.method3264() && this.method3066();
   }

   public void method3262() {
      int var3 = MathHelper.method37769(this.getPosX());
      int var4 = MathHelper.method37769(this.getPosY() - 0.2F);
      int var5 = MathHelper.method37769(this.getPosZ());
      BlockPos var6 = new BlockPos(var3, var4, var5);
      Class7380 var7 = this.field5024.method6738(var6);
      if (var7.method23397() != Class1855.field9885) {
         Vector3d var8 = this.method3433();
         this.field5024
            .method6746(
               new Class7439(Class7940.field34051, var7),
               this.getPosX() + (this.field5054.nextDouble() - 0.5) * (double)this.field5091.field39968,
               this.getPosY() + 0.1,
               this.getPosZ() + (this.field5054.nextDouble() - 0.5) * (double)this.field5091.field39968,
               var8.field18048 * -4.0,
               1.5,
               var8.field18050 * -4.0
            );
      }
   }

   public boolean method3263(Class7608<Class7631> var1) {
      return this.field5060 == var1;
   }

   public boolean method3264() {
      return !this.field5062 && this.field5058.getDouble(Class8953.field40470) > 0.0;
   }

   public void method3265(float var1, Vector3d var2) {
      Vector3d var5 = method3266(var2, var1, this.field5031);
      this.method3434(this.method3433().method11338(var5));
   }

   private static Vector3d method3266(Vector3d var0, float var1, float var2) {
      double var5 = var0.method11349();
      if (!(var5 < 1.0E-7)) {
         Vector3d var7 = (!(var5 > 1.0) ? var0 : var0.method11333()).method11344((double)var1);
         float var8 = MathHelper.method37763(var2 * (float) (Math.PI / 180.0));
         float var9 = MathHelper.method37764(var2 * (float) (Math.PI / 180.0));
         return new Vector3d(
            var7.field18048 * (double)var9 - var7.field18050 * (double)var8, var7.field18049, var7.field18050 * (double)var9 + var7.field18048 * (double)var8
         );
      } else {
         return Vector3d.field18047;
      }
   }

   public float method3267() {
      Mutable var3 = new Mutable(this.getPosX(), 0.0, this.getPosZ());
      if (!this.field5024.method7017(var3)) {
         return 0.0F;
      } else {
         var3.method8308(MathHelper.method37769(this.method3442()));
         return this.field5024.method7009(var3);
      }
   }

   public void method3268(World var1) {
      this.field5024 = var1;
   }

   public void method3269(double var1, double var3, double var5, float var7, float var8) {
      this.method3270(var1, var3, var5);
      this.field5031 = var7 % 360.0F;
      this.field5032 = MathHelper.method37777(var8, -90.0F, 90.0F) % 360.0F;
      this.field5033 = this.field5031;
      this.field5034 = this.field5032;
   }

   public void method3270(double var1, double var3, double var5) {
      double var9 = MathHelper.method37778(var1, -3.0E7, 3.0E7);
      double var11 = MathHelper.method37778(var5, -3.0E7, 3.0E7);
      this.field5025 = var9;
      this.field5026 = var3;
      this.field5027 = var11;
      this.method3215(var9, var3, var11);
   }

   public void method3271(Vector3d var1) {
      this.method2794(var1.field18048, var1.field18049, var1.field18050);
   }

   public void method2794(double var1, double var3, double var5) {
      this.method3273(var1, var3, var5, this.field5031, this.field5032);
   }

   public void method3272(BlockPos var1, float var2, float var3) {
      this.method3273((double)var1.method8304() + 0.5, (double)var1.getY(), (double)var1.method8306() + 0.5, var2, var3);
   }

   public void method3273(double var1, double var3, double var5, float var7, float var8) {
      this.method3274(var1, var3, var5);
      this.field5031 = var7;
      this.field5032 = var8;
      this.method3216();
   }

   public void method3274(double var1, double var3, double var5) {
      this.method3446(var1, var3, var5);
      this.field5025 = var1;
      this.field5026 = var3;
      this.field5027 = var5;
      this.field5048 = var1;
      this.field5049 = var3;
      this.field5050 = var5;
   }

   public float method3275(Entity var1) {
      float var4 = (float)(this.getPosX() - var1.getPosX());
      float var5 = (float)(this.getPosY() - var1.getPosY());
      float var6 = (float)(this.getPosZ() - var1.getPosZ());
      return MathHelper.method37765(var4 * var4 + var5 * var5 + var6 * var6);
   }

   public double method3276(double var1, double var3, double var5) {
      double var9 = this.getPosX() - var1;
      double var11 = this.getPosY() - var3;
      double var13 = this.getPosZ() - var5;
      return var9 * var9 + var11 * var11 + var13 * var13;
   }

   public double getDistanceSq(Entity var1) {
      return this.method3278(var1.getPositionVec());
   }

   public double method3278(Vector3d var1) {
      double var4 = this.getPosX() - var1.field18048;
      double var6 = this.getPosY() - var1.field18049;
      double var8 = this.getPosZ() - var1.field18050;
      return var4 * var4 + var6 * var6 + var8 * var8;
   }

   public void method3279(PlayerEntity var1) {
   }

   public void method3101(Entity var1) {
      if (!this.method3416(var1) && !var1.field5052 && !this.field5052) {
         double var4 = var1.getPosX() - this.getPosX();
         double var6 = var1.getPosZ() - this.getPosZ();
         double var8 = MathHelper.method37780(var4, var6);
         if (var8 >= 0.01F) {
            var8 = (double) MathHelper.method37766(var8);
            var4 /= var8;
            var6 /= var8;
            double var10 = 1.0 / var8;
            if (var10 > 1.0) {
               var10 = 1.0;
            }

            var4 *= var10;
            var6 *= var10;
            var4 *= 0.05F;
            var6 *= 0.05F;
            var4 *= (double)(1.0F - this.field5053);
            var6 *= (double)(1.0F - this.field5053);
            if (!this.method3329()) {
               this.method3280(-var4, 0.0, -var6);
            }

            if (!var1.method3329()) {
               var1.method3280(var4, 0.0, var6);
            }
         }
      }
   }

   public void method3280(double var1, double var3, double var5) {
      this.method3434(this.method3433().method11339(var1, var3, var5));
      this.field5078 = true;
   }

   public void method3141() {
      this.field5039 = true;
   }

   public boolean method2741(Class8654 var1, float var2) {
      if (!this.method2760(var1)) {
         this.method3141();
         return false;
      } else {
         return false;
      }
   }

   public final Vector3d method3281(float var1) {
      return this.method3283(this.method3282(var1), this.method3136(var1));
   }

   public float method3282(float var1) {
      return var1 != 1.0F ? MathHelper.method37821(var1, this.field5034, this.field5032) : this.field5032;
   }

   public float method3136(float var1) {
      return var1 != 1.0F ? MathHelper.method37821(var1, this.field5033, this.field5031) : this.field5031;
   }

   public final Vector3d method3283(float var1, float var2) {
      float var5 = var1 * (float) (Math.PI / 180.0);
      float var6 = -var2 * (float) (Math.PI / 180.0);
      float var7 = MathHelper.method37764(var6);
      float var8 = MathHelper.method37763(var6);
      float var9 = MathHelper.method37764(var5);
      float var10 = MathHelper.method37763(var5);
      return new Vector3d((double)(var8 * var9), (double)(-var10), (double)(var7 * var9));
   }

   public final Vector3d method3284(float var1) {
      return this.method3285(this.method3282(var1), this.method3136(var1));
   }

   public final Vector3d method3285(float var1, float var2) {
      return this.method3283(var1 - 90.0F, var2);
   }

   public final Vector3d method3286(float var1) {
      if (var1 != 1.0F) {
         double var4 = MathHelper.method37822((double)var1, this.field5025, this.getPosX());
         double var6 = MathHelper.method37822((double)var1, this.field5026, this.getPosY()) + (double)this.method3393();
         double var8 = MathHelper.method37822((double)var1, this.field5027, this.getPosZ());
         return new Vector3d(var4, var6, var8);
      } else {
         return new Vector3d(this.getPosX(), this.method3442(), this.getPosZ());
      }
   }

   public Vector3d method3287(float var1) {
      return this.method3286(var1);
   }

   public final Vector3d method3288(float var1) {
      double var4 = MathHelper.method37822((double)var1, this.field5025, this.getPosX());
      double var6 = MathHelper.method37822((double)var1, this.field5026, this.getPosY());
      double var8 = MathHelper.method37822((double)var1, this.field5027, this.getPosZ());
      return new Vector3d(var4, var6, var8);
   }

   public Class8710 method3289(double var1, float var3, boolean var4) {
      Vector3d var7 = this.method3286(var3);
      Vector3d var8 = this.method3281(var3);
      Vector3d var9 = var7.method11339(var8.field18048 * var1, var8.field18049 * var1, var8.field18050 * var1);
      return this.field5024.method7036(new Class6809(var7, var9, Class2271.field14775, !var4 ? Class1985.field12962 : Class1985.field12964, this));
   }

   public boolean method3139() {
      return false;
   }

   public boolean method3140() {
      return false;
   }

   public void method2739(Entity var1, int var2, Class8654 var3) {
      if (var1 instanceof ServerPlayerEntity) {
         CriteriaTriggers.field44467.method15158((ServerPlayerEntity)var1, this, var3);
      }
   }

   public boolean method3290(double var1, double var3, double var5) {
      double var9 = this.getPosX() - var1;
      double var11 = this.getPosY() - var3;
      double var13 = this.getPosZ() - var5;
      double var15 = var9 * var9 + var11 * var11 + var13 * var13;
      return this.method3291(var15);
   }

   public boolean method3291(double var1) {
      double var5 = this.method3389().method19675();
      if (Double.isNaN(var5)) {
         var5 = 1.0;
      }

      var5 = var5 * 64.0 * field5016;
      return var1 < var5 * var5;
   }

   public boolean method3292(Class39 var1) {
      String var4 = this.method3297();
      if (!this.field5041 && var4 != null) {
         var1.method109("id", var4);
         this.method3294(var1);
         return true;
      } else {
         return false;
      }
   }

   public boolean method3293(Class39 var1) {
      return !this.method3328() ? this.method3292(var1) : false;
   }

   public Class39 method3294(Class39 var1) {
      try {
         if (this.field5022 != null) {
            var1.method99("Pos", this.method3298(this.field5022.getPosX(), this.getPosY(), this.field5022.getPosZ()));
         } else {
            var1.method99("Pos", this.method3298(this.getPosX(), this.getPosY(), this.getPosZ()));
         }

         Vector3d var4 = this.method3433();
         var1.method99("Motion", this.method3298(var4.field18048, var4.field18049, var4.field18050));
         var1.method99("Rotation", this.method3299(this.field5031, this.field5032));
         var1.method107("FallDistance", this.field5045);
         var1.method101("Fire", (short)this.field5056);
         var1.method101("Air", (short)this.method3351());
         var1.method115("OnGround", this.field5036);
         var1.method115("Invulnerable", this.field5083);
         var1.method102("PortalCooldown", this.field5079);
         var1.method104("UUID", this.getUniqueID());
         ITextComponent var11 = this.method3380();
         if (var11 != null) {
            var1.method109("CustomName", ITextComponent$Serializer.toJson(var11));
         }

         if (this.method3383()) {
            var1.method115("CustomNameVisible", this.method3383());
         }

         if (this.method3245()) {
            var1.method115("Silent", this.method3245());
         }

         if (this.method3247()) {
            var1.method115("NoGravity", this.method3247());
         }

         if (this.field5086) {
            var1.method115("Glowing", this.field5086);
         }

         if (!this.field5087.isEmpty()) {
            Class41 var12 = new Class41();

            for (String var8 : this.field5087) {
               var12.add(Class40.method150(var8));
            }

            var1.method99("Tags", var12);
         }

         this.method2724(var1);
         if (this.method3329()) {
            Class41 var13 = new Class41();

            for (Entity var15 : this.method3408()) {
               Class39 var9 = new Class39();
               if (var15.method3292(var9)) {
                  var13.add(var9);
               }
            }

            if (!var13.isEmpty()) {
               var1.method99("Passengers", var13);
            }
         }

         return var1;
      } catch (Throwable var10) {
         Class4526 var5 = Class4526.method14413(var10, "Saving entity NBT");
         Class8965 var6 = var5.method14410("Entity being saved");
         this.method3372(var6);
         throw new Class2506(var5);
      }
   }

   public void method3295(Class39 var1) {
      try {
         Class41 var4 = var1.method131("Pos", 6);
         Class41 var18 = var1.method131("Motion", 6);
         Class41 var19 = var1.method131("Rotation", 5);
         double var7 = var18.method158(0);
         double var9 = var18.method158(1);
         double var11 = var18.method158(2);
         this.method3435(Math.abs(var7) > 10.0 ? 0.0 : var7, Math.abs(var9) > 10.0 ? 0.0 : var9, Math.abs(var11) > 10.0 ? 0.0 : var11);
         this.method3274(var4.method158(0), var4.method158(1), var4.method158(2));
         this.field5031 = var19.method159(0);
         this.field5032 = var19.method159(1);
         this.field5033 = this.field5031;
         this.field5034 = this.field5032;
         this.method3143(this.field5031);
         this.method3144(this.field5031);
         this.field5045 = var1.method124("FallDistance");
         this.field5056 = var1.method121("Fire");
         this.method3352(var1.method121("Air"));
         this.field5036 = var1.method132("OnGround");
         this.field5083 = var1.method132("Invulnerable");
         this.field5079 = var1.method122("PortalCooldown");
         if (var1.method106("UUID")) {
            this.field5084 = var1.method105("UUID");
            this.field5085 = this.field5084.toString();
         }

         if (!Double.isFinite(this.getPosX()) || !Double.isFinite(this.getPosY()) || !Double.isFinite(this.getPosZ())) {
            throw new IllegalStateException("Entity has invalid position");
         } else if (Double.isFinite((double)this.field5031) && Double.isFinite((double)this.field5032)) {
            this.method3216();
            this.method3214(this.field5031, this.field5032);
            if (var1.method119("CustomName", 8)) {
               String var13 = var1.method126("CustomName");

               try {
                  this.method3379(ITextComponent$Serializer.func_240643_a_(var13));
               } catch (Exception var16) {
                  field5012.warn("Failed to parse entity custom name {}", var13, var16);
               }
            }

            this.method3382(var1.method132("CustomNameVisible"));
            this.method3246(var1.method132("Silent"));
            this.method3248(var1.method132("NoGravity"));
            this.method3341(var1.method132("Glowing"));
            if (var1.method119("Tags", 9)) {
               this.field5087.clear();
               Class41 var20 = var1.method131("Tags", 8);
               int var14 = Math.min(var20.size(), 1024);

               for (int var15 = 0; var15 < var14; var15++) {
                  this.field5087.add(var20.method160(var15));
               }
            }

            this.method2723(var1);
            if (this.method3296()) {
               this.method3216();
            }
         } else {
            throw new IllegalStateException("Entity has invalid rotation");
         }
      } catch (Throwable var17) {
         Class4526 var5 = Class4526.method14413(var17, "Loading entity NBT");
         Class8965 var6 = var5.method14410("Entity being loaded");
         this.method3372(var6);
         throw new Class2506(var5);
      }
   }

   public boolean method3296() {
      return true;
   }

   @Nullable
   public final String method3297() {
      Class8992 var3 = this.method3204();
      ResourceLocation var4 = Class8992.method33198(var3);
      return var3.method33205() && var4 != null ? var4.toString() : null;
   }

   public abstract void method2723(Class39 var1);

   public abstract void method2724(Class39 var1);

   public Class41 method3298(double... var1) {
      Class41 var4 = new Class41();

      for (double var8 : var1) {
         var4.add(Class34.method93(var8));
      }

      return var4;
   }

   public Class41 method3299(float... var1) {
      Class41 var4 = new Class41();

      for (float var8 : var1) {
         var4.add(Class32.method90(var8));
      }

      return var4;
   }

   @Nullable
   public ItemEntity method3300(Class3303 var1) {
      return this.method3301(var1, 0);
   }

   @Nullable
   public ItemEntity method3301(Class3303 var1, int var2) {
      return this.method3303(new ItemStack(var1), (float)var2);
   }

   @Nullable
   public ItemEntity method3302(ItemStack var1) {
      return this.method3303(var1, 0.0F);
   }

   @Nullable
   public ItemEntity method3303(ItemStack var1, float var2) {
      if (!var1.method32105()) {
         if (!this.field5024.field9020) {
            ItemEntity var5 = new ItemEntity(this.field5024, this.getPosX(), this.getPosY() + (double)var2, this.getPosZ(), var1);
            var5.method4131();
            this.field5024.method6916(var5);
            return var5;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public boolean method3066() {
      return !this.field5041;
   }

   public boolean method3180() {
      if (!this.field5052) {
         float var3 = 0.1F;
         float var4 = this.field5091.field39968 * 0.8F;
         Class6488 var5 = Class6488.method19686((double)var4, 0.1F, (double)var4).method19667(this.getPosX(), this.method3442(), this.getPosZ());
         return this.field5024.method7057(this, var5, (var1, var2) -> var1.method23437(this.field5024, var2)).findAny().isPresent();
      } else {
         return false;
      }
   }

   public ActionResultType method3304(PlayerEntity var1, Hand var2) {
      return ActionResultType.field14820;
   }

   public boolean method3305(Entity var1) {
      return var1.method3306() && !this.method3416(var1);
   }

   public boolean method3306() {
      return false;
   }

   public void method2868() {
      this.method3434(Vector3d.field18047);
      this.tick();
      if (this.method3328()) {
         this.getRidingEntity().method3307(this);
      }
   }

   public void method3307(Entity var1) {
      this.method3308(var1, Entity::method3215);
   }

   private void method3308(Entity var1, Class9347 var2) {
      if (this.method3409(var1)) {
         double var5 = this.getPosY() + this.method3310() + var1.method2894();
         var2.method35390(var1, this.getPosX(), var5, this.getPosZ());
      }
   }

   public void method3309(Entity var1) {
   }

   public double method2894() {
      return 0.0;
   }

   public double method3310() {
      return (double)this.field5091.field39969 * 0.75;
   }

   public boolean method3311(Entity var1) {
      return this.method2758(var1, false);
   }

   public boolean method3312() {
      return this instanceof Class880;
   }

   public boolean method2758(Entity var1, boolean var2) {
      for (Entity var5 = var1; var5.field5022 != null; var5 = var5.field5022) {
         if (var5.field5022 == this) {
            return false;
         }
      }

      if (var2 || this.method3313(var1) && var1.method3318(this)) {
         if (this.method3328()) {
            this.method2759();
         }

         this.method3211(Class2090.field13619);
         this.field5022 = var1;
         this.field5022.method3316(this);
         return true;
      } else {
         return false;
      }
   }

   public boolean method3313(Entity var1) {
      return !this.method3331() && this.field5021 <= 0;
   }

   public boolean method3314(Class2090 var1) {
      return this.field5024.method7053(this, this.method3390(var1).method19679(1.0E-7));
   }

   public void method3315() {
      for (int var3 = this.field5020.size() - 1; var3 >= 0; var3--) {
         this.field5020.get(var3).method2759();
      }
   }

   public void method2895() {
      if (this.field5022 != null) {
         Entity var3 = this.field5022;
         this.field5022 = null;
         var3.method3317(this);
      }
   }

   public void method2759() {
      this.method2895();
   }

   public void method3316(Entity var1) {
      if (var1.getRidingEntity() != this) {
         throw new IllegalStateException("Use x.startRiding(y), not y.addPassenger(x)");
      } else {
         if (!this.field5024.field9020 && var1 instanceof PlayerEntity && !(this.method3407() instanceof PlayerEntity)) {
            this.field5020.add(0, var1);
         } else {
            this.field5020.add(var1);
         }
      }
   }

   public void method3317(Entity var1) {
      if (var1.getRidingEntity() != this) {
         this.field5020.remove(var1);
         var1.field5021 = 60;
      } else {
         throw new IllegalStateException("Use x.stopRiding(y), not y.removePassenger(x)");
      }
   }

   public boolean method3318(Entity var1) {
      return this.method3408().size() < 1;
   }

   public void method3131(double var1, double var3, double var5, float var7, float var8, int var9, boolean var10) {
      this.method3215(var1, var3, var5);
      this.method3214(var7, var8);
   }

   public void method3132(float var1, int var2) {
      this.method3143(var1);
   }

   public float method3319() {
      return 0.0F;
   }

   public Vector3d method3320() {
      return this.method3283(this.field5032, this.field5031);
   }

   public Class8513 method3321() {
      return new Class8513(this.field5032, this.field5031);
   }

   public Vector3d method3322() {
      return Vector3d.method11353(this.method3321());
   }

   public void method3323(BlockPos var1) {
      if (!this.method3219()) {
         if (!this.field5024.field9020 && !var1.equals(this.field5082)) {
            this.field5082 = var1.method8353();
         }

         this.field5080 = true;
      } else {
         this.method3218();
      }
   }

   public void method3324() {
      if (this.field5024 instanceof ServerWorld) {
         int var3 = this.method2858();
         ServerWorld var4 = (ServerWorld)this.field5024;
         if (!this.field5080) {
            if (this.field5081 > 0) {
               this.field5081 -= 4;
            }

            if (this.field5081 < 0) {
               this.field5081 = 0;
            }
         } else {
            MinecraftServer var5 = var4.method6715();
            Class8705 var6 = this.field5024.method6813() != World.field9000 ? World.field9000 : World.field8999;
            ServerWorld var7 = var5.method1318(var6);
            if (var7 != null && var5.method1312() && !this.method3328() && this.field5081++ >= var3) {
               this.field5024.method6820().startSection("portal");
               this.field5081 = var3;
               this.method3218();
               this.method2745(var7);
               this.field5024.method6820().endSection();
            }

            this.field5080 = false;
         }

         this.method2816();
      }
   }

   public int method2862() {
      return 300;
   }

   public void method3325(double var1, double var3, double var5) {
      this.method3435(var1, var3, var5);
   }

   public void method2866(byte var1) {
      switch (var1) {
         case 53:
            Class3379.method11976(this);
      }
   }

   public void method3069() {
   }

   public Iterable<ItemStack> method2946() {
      return field5014;
   }

   public Iterable<ItemStack> method2947() {
      return field5014;
   }

   public Iterable<ItemStack> method3326() {
      return Iterables.concat(this.method2946(), this.method2947());
   }

   public void method2944(Class2106 var1, ItemStack var2) {
   }

   public boolean method3327() {
      boolean var3 = this.field5024 != null && this.field5024.field9020;
      return !this.method3249() && (this.field5056 > 0 || var3 && this.method3348(0));
   }

   public boolean method3328() {
      return this.getRidingEntity() != null;
   }

   public boolean method3329() {
      return !this.method3408().isEmpty();
   }

   public boolean method3007() {
      return true;
   }

   public void setSneaking(boolean var1) {
      this.method3349(1, var1);
   }

   public boolean method3331() {
      return this.method3348(1);
   }

   public boolean method3332() {
      return this.method3331();
   }

   public boolean method3333() {
      return this.method3331();
   }

   public boolean method3334() {
      return this.method3331();
   }

   public boolean method3335() {
      return this.method3331();
   }

   public boolean method3336() {
      return this.method3212() == Class2090.field13624;
   }

   public boolean method3337() {
      return this.method3348(3);
   }

   public void setSprinting(boolean var1) {
      this.method3349(3, var1);
   }

   public boolean method2951() {
      return this.method3348(4);
   }

   public boolean method3166() {
      return this.method3212() == Class2090.field13622;
   }

   public boolean method3338() {
      return this.method3166() && !this.method3250();
   }

   public void method3339(boolean var1) {
      this.method3349(4, var1);
   }

   public boolean method3340() {
      return this.field5086 || this.field5024.field9020 && this.method3348(6);
   }

   public void method3341(boolean var1) {
      this.field5086 = var1;
      if (!this.field5024.field9020) {
         this.method3349(6, this.field5086);
      }
   }

   public boolean method3342() {
      return this.method3348(5);
   }

   public boolean method3343(PlayerEntity var1) {
      if (var1.method2800()) {
         return false;
      } else {
         Class8219 var4 = this.method3344();
         return var4 != null && var1 != null && var1.method3344() == var4 && var4.method28580() ? false : this.method3342();
      }
   }

   @Nullable
   public Class8219 method3344() {
      return this.field5024.method6805().method20998(this.method2956());
   }

   public boolean method3345(Entity var1) {
      return this.method3346(var1.method3344());
   }

   public boolean method3346(Class8219 var1) {
      return this.method3344() == null ? false : this.method3344().method28592(var1);
   }

   public void method3347(boolean var1) {
      this.method3349(5, var1);
   }

   public boolean method3348(int var1) {
      return (this.field5063.<Byte>method35445(field5064) & 1 << var1) != 0;
   }

   public void method3349(int var1, boolean var2) {
      byte var5 = this.field5063.<Byte>method35445(field5064);
      if (!var2) {
         this.field5063.method35446(field5064, (byte)(var5 & ~(1 << var1)));
      } else {
         this.field5063.method35446(field5064, (byte)(var5 | 1 << var1));
      }
   }

   public int method3350() {
      return 300;
   }

   public int method3351() {
      return this.field5063.<Integer>method35445(field5065);
   }

   public void method3352(int var1) {
      this.field5063.method35446(field5065, var1);
   }

   public void method3353(ServerWorld var1, Class906 var2) {
      this.method2966(this.field5056 + 1);
      if (this.field5056 == 0) {
         this.method3221(8);
      }

      this.method2741(Class8654.field38993, 5.0F);
   }

   public void method3354(boolean var1) {
      Vector3d var4 = this.method3433();
      double var5;
      if (!var1) {
         var5 = Math.min(1.8, var4.field18049 + 0.1);
      } else {
         var5 = Math.max(-0.9, var4.field18049 - 0.03);
      }

      this.method3435(var4.field18048, var5, var4.field18050);
   }

   public void method3355(boolean var1) {
      Vector3d var4 = this.method3433();
      double var5;
      if (!var1) {
         var5 = Math.min(0.7, var4.field18049 + 0.06);
      } else {
         var5 = Math.max(-0.3, var4.field18049 - 0.03);
      }

      this.method3435(var4.field18048, var5, var4.field18050);
      this.field5045 = 0.0F;
   }

   public void method2927(ServerWorld var1, Class880 var2) {
   }

   public void pushOutOfBlocks(double var1, double var3, double var5) {
      BlockPos var9 = new BlockPos(var1, var3, var5);
      Vector3d var10 = new Vector3d(var1 - (double)var9.method8304(), var3 - (double)var9.getY(), var5 - (double)var9.method8306());
      Mutable var11 = new Mutable();
      Direction var12 = Direction.field673;
      double var13 = Double.MAX_VALUE;

      for (Direction var18 : new Direction[]{Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST, Direction.field673}) {
         var11.method8377(var9, var18);
         if (!this.field5024.method6738(var11).method23456(this.field5024, var11)) {
            double var19 = var10.method11356(var18.method544());
            double var21 = var18.method535() != Class1892.field11092 ? var19 : 1.0 - var19;
            if (var21 < var13) {
               var13 = var21;
               var12 = var18;
            }
         }
      }

      float var23 = this.field5054.nextFloat() * 0.2F + 0.1F;
      float var24 = (float)var12.method535().method8150();
      Vector3d var25 = this.method3433().method11344(0.75);
      if (var12.method544() != Class113.field413) {
         if (var12.method544() != Class113.field414) {
            if (var12.method544() == Class113.field415) {
               this.method3435(var25.field18048, var25.field18049, (double)(var24 * var23));
            }
         } else {
            this.method3435(var25.field18048, (double)(var24 * var23), var25.field18050);
         }
      } else {
         this.method3435((double)(var24 * var23), var25.field18049, var25.field18050);
      }
   }

   public void method2928(Class7380 var1, Vector3d var2) {
      this.field5045 = 0.0F;
      this.field5040 = var2;
   }

   private static ITextComponent method3357(ITextComponent var0) {
      IFormattableTextComponent var3 = var0.copyRaw().setStyle(var0.getStyle().setClickEvent((ClickEvent)null));

      for (ITextComponent var5 : var0.getSiblings()) {
         var3.append(method3357(var5));
      }

      return var3;
   }

   @Override
   public ITextComponent getName() {
      ITextComponent var3 = this.method3380();
      return var3 == null ? this.method3358() : method3357(var3);
   }

   public ITextComponent method3358() {
      return this.field5017.method33211();
   }

   public boolean method3359(Entity var1) {
      return this == var1;
   }

   public float method3142() {
      return 0.0F;
   }

   public void method3143(float var1) {
   }

   public void method3144(float var1) {
   }

   public boolean method3360() {
      return true;
   }

   public boolean method3361(Entity var1) {
      return false;
   }

   @Override
   public String toString() {
      return String.format(
         Locale.ROOT,
         "%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]",
         this.getClass().getSimpleName(),
         this.getName().getString(),
         this.field5018,
         this.field5024 != null ? this.field5024.toString() : "~NULL~",
         this.getPosX(),
         this.getPosY(),
         this.getPosZ()
      );
   }

   public boolean method2760(Class8654 var1) {
      return this.field5083 && var1 != Class8654.field39004 && !var1.method31146();
   }

   public boolean method3362() {
      return this.field5083;
   }

   public void method3363(boolean var1) {
      this.field5083 = var1;
   }

   public void method3364(Entity var1) {
      this.method3273(var1.getPosX(), var1.getPosY(), var1.getPosZ(), var1.field5031, var1.field5032);
   }

   public void method3365(Entity var1) {
      Class39 var4 = var1.method3294(new Class39());
      var4.method133("Dimension");
      this.method3295(var4);
      this.field5079 = var1.field5079;
      this.field5082 = var1.field5082;
   }

   @Nullable
   public Entity method2745(ServerWorld var1) {
      if (this.field5024 instanceof ServerWorld && !this.field5041) {
         this.field5024.method6820().startSection("changeDimension");
         this.method3200();
         this.field5024.method6820().startSection("reposition");
         Class9761 var4 = this.method2744(var1);
         if (var4 != null) {
            this.field5024.method6820().endStartSection("reloading");
            Entity var5 = this.method3204().method33215(var1);
            if (var5 != null) {
               var5.method3365(this);
               var5.method3273(var4.field45665.field18048, var4.field45665.field18049, var4.field45665.field18050, var4.field45667, var5.field5032);
               var5.method3434(var4.field45666);
               var1.method6918(var5);
               if (var1.method6813() == World.THE_END) {
                  ServerWorld.method6973(var1);
               }
            }

            this.method3366();
            this.field5024.method6820().endSection();
            ((ServerWorld)this.field5024).method6904();
            var1.method6904();
            this.field5024.method6820().endSection();
            return var5;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public void method3366() {
      this.field5041 = true;
   }

   @Nullable
   public Class9761 method2744(ServerWorld var1) {
      boolean var4 = this.field5024.method6813() == World.THE_END && var1.method6813() == World.field8999;
      boolean var5 = var1.method6813() == World.THE_END;
      if (!var4 && !var5) {
         boolean var19 = var1.method6813() == World.field9000;
         if (this.field5024.method6813() != World.field9000 && !var19) {
            return null;
         } else {
            Class7522 var7 = var1.method6810();
            double var8 = Math.max(-2.9999872E7, var7.method24530() + 16.0);
            double var10 = Math.max(-2.9999872E7, var7.method24531() + 16.0);
            double var12 = Math.min(2.9999872E7, var7.method24532() - 16.0);
            double var14 = Math.min(2.9999872E7, var7.method24533() - 16.0);
            double var16 = Class9535.method36872(this.field5024.method6812(), var1.method6812());
            BlockPos var18 = new BlockPos(
               MathHelper.method37778(this.getPosX() * var16, var8, var12), this.getPosY(), MathHelper.method37778(this.getPosZ() * var16, var10, var14)
            );
            return this.method2747(var1, var18, var19).<Class9761>map(var2 -> {
               Class7380 var5x = this.field5024.method6738(this.field5082);
               Class113 var6x;
               Vector3d var7x;
               if (!var5x.method23462(Class8820.field39712)) {
                  var6x = Class113.field413;
                  var7x = new Vector3d(0.5, 0.0, 0.0);
               } else {
                  var6x = var5x.<Class113>method23463(Class8820.field39712);
                  Class9502 var8x = Class7215.method22658(this.field5082, var6x, 21, Class113.field414, 21, var2x -> this.field5024.method6738(var2x) == var5x);
                  var7x = this.method3145(var6x, var8x);
               }

               return Class7473.method24207(var1, var2, var6x, var7x, this.method2981(this.method3212()), this.method3433(), this.field5031, this.field5032);
            }).orElse((Class9761)null);
         }
      } else {
         BlockPos var6;
         if (!var5) {
            var6 = var1.method7006(Class101.field300, var1.method6947());
         } else {
            var6 = ServerWorld.field9038;
         }

         return new Class9761(
            new Vector3d((double)var6.method8304() + 0.5, (double)var6.getY(), (double)var6.method8306() + 0.5),
            this.method3433(),
            this.field5031,
            this.field5032
         );
      }
   }

   public Vector3d method3145(Class113 var1, Class9502 var2) {
      return Class7473.method24206(var2, var1, this.getPositionVec(), this.method2981(this.method3212()));
   }

   public Optional<Class9502> method2747(ServerWorld var1, BlockPos var2, boolean var3) {
      return var1.method6937().method12331(var2, var3);
   }

   public boolean method3367() {
      return true;
   }

   public float method3368(Class7782 var1, Class1665 var2, BlockPos var3, Class7380 var4, Class7379 var5, float var6) {
      return var6;
   }

   public boolean method3369(Class7782 var1, Class1665 var2, BlockPos var3, Class7380 var4, float var5) {
      return true;
   }

   public int method3370() {
      return 3;
   }

   public boolean method3371() {
      return false;
   }

   public void method3372(Class8965 var1) {
      var1.method32806("Entity Type", () -> Class8992.method33198(this.method3204()) + " (" + this.getClass().getCanonicalName() + ")");
      var1.method32807("Entity ID", this.field5018);
      var1.method32806("Entity Name", () -> this.getName().getString());
      var1.method32807("Entity's Exact location", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", this.getPosX(), this.getPosY(), this.getPosZ()));
      var1.method32807(
         "Entity's Block location",
         Class8965.method32805(MathHelper.method37769(this.getPosX()), MathHelper.method37769(this.getPosY()), MathHelper.method37769(this.getPosZ()))
      );
      Vector3d var4 = this.method3433();
      var1.method32807("Entity's Momentum", String.format(Locale.ROOT, "%.2f, %.2f, %.2f", var4.field18048, var4.field18049, var4.field18050));
      var1.method32806("Entity's Passengers", () -> this.method3408().toString());
      var1.method32806("Entity's Vehicle", () -> this.getRidingEntity().toString());
   }

   public boolean method3373() {
      return this.method3327() && !this.method2800();
   }

   public void method3374(UUID var1) {
      this.field5084 = var1;
      this.field5085 = this.field5084.toString();
   }

   public UUID getUniqueID() {
      return this.field5084;
   }

   public String method3376() {
      return this.field5085;
   }

   public String method2956() {
      return this.field5085;
   }

   public boolean method2952() {
      return true;
   }

   public static double method3377() {
      return field5016;
   }

   public static void method3378(double var0) {
      field5016 = var0;
   }

   @Override
   public ITextComponent getDisplayName() {
      return Class8218.method28577(this.method3344(), this.getName())
         .modifyStyle(var1 -> var1.setHoverEvent(this.method3388()).setInsertion(this.method3376()));
   }

   public void method3379(ITextComponent var1) {
      this.field5063.method35446(field5066, Optional.<ITextComponent>ofNullable(var1));
   }

   @Nullable
   @Override
   public ITextComponent method3380() {
      return this.field5063.<Optional<ITextComponent>>method35445(field5066).orElse((ITextComponent)null);
   }

   @Override
   public boolean method3381() {
      return this.field5063.<Optional<ITextComponent>>method35445(field5066).isPresent();
   }

   public void method3382(boolean var1) {
      this.field5063.method35446(field5067, var1);
   }

   public boolean method3383() {
      return this.field5063.<Boolean>method35445(field5067);
   }

   public final void method3384(double var1, double var3, double var5) {
      if (this.field5024 instanceof ServerWorld) {
         Class7481 var9 = new Class7481(new BlockPos(var1, var3, var5));
         ((ServerWorld)this.field5024).method6883().method7374(Class8561.field38486, var9, 0, this.method3205());
         this.field5024.method6824(var9.field32174, var9.field32175);
         this.method2793(var1, var3, var5);
      }
   }

   public void method2793(double var1, double var3, double var5) {
      if (this.field5024 instanceof ServerWorld) {
         ServerWorld var9 = (ServerWorld)this.field5024;
         this.method3273(var1, var3, var5, this.field5031, this.field5032);
         this.method3412().forEach(var1x -> {
            var9.method6909(var1x);
            var1x.field5088 = true;

            for (Entity var5x : var1x.field5020) {
               var1x.method3308(var5x, Entity::method2794);
            }
         });
      }
   }

   public boolean method2939() {
      return this.method3383();
   }

   public void method3155(Class9289<?> var1) {
      if (field5070.equals(var1)) {
         this.method3385();
      }
   }

   public void method3385() {
      Class8847 var3 = this.field5091;
      Class2090 var4 = this.method3212();
      Class8847 var5 = this.method2981(var4);
      this.field5091 = var5;
      this.field5092 = this.method3181(var4, var5);
      if (!(var5.field39968 < var3.field39968)) {
         Class6488 var6 = this.method3389();
         this.method3391(
            new Class6488(
               var6.field28449,
               var6.field28450,
               var6.field28451,
               var6.field28449 + (double)var5.field39968,
               var6.field28450 + (double)var5.field39969,
               var6.field28451 + (double)var5.field39968
            )
         );
         if (var5.field39968 > var3.field39968 && !this.field5062 && !this.field5024.field9020) {
            float var9 = var3.field39968 - var5.field39968;
            this.move(Class2107.field13742, new Vector3d((double)var9, 0.0, (double)var9));
         }
      } else {
         double var7 = (double)var5.field39968 / 2.0;
         this.method3391(
            new Class6488(
               this.getPosX() - var7,
               this.getPosY(),
               this.getPosZ() - var7,
               this.getPosX() + var7,
               this.getPosY() + (double)var5.field39969,
               this.getPosZ() + var7
            )
         );
      }
   }

   public Direction method3386() {
      return Direction.method549((double)this.field5031);
   }

   public Direction method3387() {
      return this.method3386();
   }

   public HoverEvent method3388() {
      return new HoverEvent(HoverEvent$Action.SHOW_ENTITY, new HoverEvent$EntityHover(this.method3204(), this.getUniqueID(), this.getName()));
   }

   public boolean method2749(ServerPlayerEntity var1) {
      return true;
   }

   public Class6488 method3389() {
      return this.field5035;
   }

   public Class6488 method3186() {
      return this.method3389();
   }

   public Class6488 method3390(Class2090 var1) {
      Class8847 var4 = this.method2981(var1);
      float var5 = var4.field39968 / 2.0F;
      Vector3d var6 = new Vector3d(this.getPosX() - (double)var5, this.getPosY(), this.getPosZ() - (double)var5);
      Vector3d var7 = new Vector3d(this.getPosX() + (double)var5, this.getPosY() + (double)var4.field39969, this.getPosZ() + (double)var5);
      return new Class6488(var6, var7);
   }

   public void method3391(Class6488 var1) {
      this.field5035 = var1;
   }

   public float method3181(Class2090 var1, Class8847 var2) {
      return var2.field39969 * 0.85F;
   }

   public float method3392(Class2090 var1) {
      return this.method3181(var1, this.method2981(var1));
   }

   public final float method3393() {
      return this.field5092;
   }

   public Vector3d method3394() {
      return new Vector3d(0.0, (double)this.method3393(), (double)(this.method3429() * 0.4F));
   }

   public boolean method2963(int var1, ItemStack var2) {
      return false;
   }

   @Override
   public void sendMessage(ITextComponent var1, UUID var2) {
   }

   public World method3395() {
      return this.field5024;
   }

   @Nullable
   public MinecraftServer method3396() {
      return this.field5024.method6715();
   }

   public ActionResultType applyPlayerInteraction(PlayerEntity var1, Vector3d var2, Hand var3) {
      return ActionResultType.field14820;
   }

   public boolean method3398() {
      return false;
   }

   public void method3399(Class880 var1, Entity var2) {
      if (var2 instanceof Class880) {
         Class7858.method26320((Class880)var2, var1);
      }

      Class7858.method26321(var1, var2);
   }

   public void method3400(ServerPlayerEntity var1) {
   }

   public void method3401(ServerPlayerEntity var1) {
   }

   public float method3402(Class80 var1) {
      float var4 = MathHelper.method37792(this.field5031);
      switch (Class9228.field42477[var1.ordinal()]) {
         case 1:
            return var4 + 180.0F;
         case 2:
            return var4 + 270.0F;
         case 3:
            return var4 + 90.0F;
         default:
            return var4;
      }
   }

   public float method3403(Class2089 var1) {
      float var4 = MathHelper.method37792(this.field5031);
      switch (Class9228.field42478[var1.ordinal()]) {
         case 1:
            return -var4;
         case 2:
            return 180.0F - var4;
         default:
            return var4;
      }
   }

   public boolean method3404() {
      return false;
   }

   public boolean method3405() {
      boolean var3 = this.field5088;
      this.field5088 = false;
      return var3;
   }

   public boolean method3406() {
      boolean var3 = this.field5075;
      this.field5075 = false;
      return var3;
   }

   @Nullable
   public Entity method3407() {
      return null;
   }

   public List<Entity> method3408() {
      return (List<Entity>)(!this.field5020.isEmpty() ? Lists.newArrayList(this.field5020) : Collections.<Entity>emptyList());
   }

   public boolean method3409(Entity var1) {
      for (Entity var5 : this.method3408()) {
         if (var5.equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public boolean method3410(Class<? extends Entity> var1) {
      for (Entity var5 : this.method3408()) {
         if (var1.isAssignableFrom(var5.getClass())) {
            return true;
         }
      }

      return false;
   }

   public Collection<Entity> method3411() {
      HashSet var3 = Sets.newHashSet();

      for (Entity var5 : this.method3408()) {
         var3.add(var5);
         var5.method3414(false, var3);
      }

      return var3;
   }

   public Stream<Entity> method3412() {
      return Stream.<Entity>concat(Stream.of(this), this.field5020.stream().flatMap(Entity::method3412));
   }

   public boolean method3413() {
      HashSet var3 = Sets.newHashSet();
      this.method3414(true, var3);
      return var3.size() == 1;
   }

   private void method3414(boolean var1, Set<Entity> var2) {
      for (Entity var6 : this.method3408()) {
         if (!var1 || ServerPlayerEntity.class.isAssignableFrom(var6.getClass())) {
            var2.add(var6);
         }

         var6.method3414(var1, var2);
      }
   }

   public Entity method3415() {
      Entity var3 = this;

      while (var3.method3328()) {
         var3 = var3.getRidingEntity();
      }

      return var3;
   }

   public boolean method3416(Entity var1) {
      return this.method3415() == var1.method3415();
   }

   public boolean method3417(Entity var1) {
      for (Entity var5 : this.method3408()) {
         if (var5.equals(var1)) {
            return true;
         }

         if (var5.method3417(var1)) {
            return true;
         }
      }

      return false;
   }

   public boolean method3418() {
      Entity var3 = this.method3407();
      return !(var3 instanceof PlayerEntity) ? !this.field5024.field9020 : ((PlayerEntity)var3).method2905();
   }

   public static Vector3d method3419(double var0, double var2, float var4) {
      double var7 = (var0 + var2 + 1.0E-5F) / 2.0;
      float var9 = -MathHelper.method37763(var4 * (float) (Math.PI / 180.0));
      float var10 = MathHelper.method37764(var4 * (float) (Math.PI / 180.0));
      float var11 = Math.max(Math.abs(var9), Math.abs(var10));
      return new Vector3d((double)var9 * var7 / (double)var11, 0.0, (double)var10 * var7 / (double)var11);
   }

   public Vector3d method3420(Class880 var1) {
      return new Vector3d(this.getPosX(), this.method3389().field28453, this.getPosZ());
   }

   @Nullable
   public Entity getRidingEntity() {
      return this.field5022;
   }

   public Class2315 method3422() {
      return Class2315.field15862;
   }

   public Class2266 method2864() {
      return Class2266.field14734;
   }

   public int method2865() {
      return 1;
   }

   public Class6619 getCommandSource() {
      return new Class6619(
         this,
         this.getPositionVec(),
         this.method3321(),
         !(this.field5024 instanceof ServerWorld) ? null : (ServerWorld)this.field5024,
         this.method2807(),
         this.getName().getString(),
         this.getDisplayName(),
         this.field5024.method6715(),
         this
      );
   }

   public int method2807() {
      return 0;
   }

   public boolean method3424(int var1) {
      return this.method2807() >= var1;
   }

   @Override
   public boolean method1405() {
      return this.field5024.method6789().method17135(Class5462.field24236);
   }

   @Override
   public boolean method1406() {
      return true;
   }

   @Override
   public boolean method3425() {
      return true;
   }

   public void method2787(Class2062 var1, Vector3d var2) {
      Vector3d var5 = var1.method8711(this);
      double var6 = var2.field18048 - var5.field18048;
      double var8 = var2.field18049 - var5.field18049;
      double var10 = var2.field18050 - var5.field18050;
      double var12 = (double) MathHelper.method37766(var6 * var6 + var10 * var10);
      this.field5032 = MathHelper.method37792((float)(-(MathHelper.method37814(var8, var12) * 180.0F / (float)Math.PI)));
      this.field5031 = MathHelper.method37792((float)(MathHelper.method37814(var10, var6) * 180.0F / (float)Math.PI) - 90.0F);
      this.method3143(this.field5031);
      this.field5034 = this.field5032;
      this.field5033 = this.field5031;
   }

   public boolean method3426(Class7608<Class7631> var1, double var2) {
      Class6488 var6 = this.method3389().method19679(0.001);
      int var7 = MathHelper.method37769(var6.field28449);
      int var8 = MathHelper.method37774(var6.field28452);
      int var9 = MathHelper.method37769(var6.field28450);
      int var10 = MathHelper.method37774(var6.field28453);
      int var11 = MathHelper.method37769(var6.field28451);
      int var12 = MathHelper.method37774(var6.field28454);
      if (!this.field5024.method7019(var7, var9, var11, var8, var10, var12)) {
         return false;
      } else {
         double var13 = 0.0;
         boolean var15 = this.method2952();
         boolean var16 = false;
         Vector3d var17 = Vector3d.field18047;
         int var18 = 0;
         Mutable var19 = new Mutable();

         for (int var20 = var7; var20 < var8; var20++) {
            for (int var21 = var9; var21 < var10; var21++) {
               for (int var22 = var11; var22 < var12; var22++) {
                  var19.method8372(var20, var21, var22);
                  Class7379 var23 = this.field5024.method6739(var19);
                  if (var23.method23486(var1)) {
                     double var24 = (double)((float)var21 + var23.method23475(this.field5024, var19));
                     if (var24 >= var6.field28450) {
                        var16 = true;
                        var13 = Math.max(var24 - var6.field28450, var13);
                        if (var15) {
                           Vector3d var26 = var23.method23483(this.field5024, var19);
                           if (var13 < 0.4) {
                              var26 = var26.method11344(var13);
                           }

                           var17 = var17.method11338(var26);
                           var18++;
                        }
                     }
                  }
               }
            }
         }

         if (var17.method11348() > 0.0) {
            if (var18 > 0) {
               var17 = var17.method11344(1.0 / (double)var18);
            }

            if (!(this instanceof PlayerEntity)) {
               var17 = var17.method11333();
            }

            Vector3d var30 = this.method3433();
            var17 = var17.method11344(var2 * 1.0);
            double var27 = 0.003;
            if (Math.abs(var30.field18048) < 0.003 && Math.abs(var30.field18050) < 0.003 && var17.method11348() < 0.0045000000000000005) {
               var17 = var17.method11333().method11344(0.0045000000000000005);
            }

            this.method3434(this.method3433().method11338(var17));
         }

         this.field5058.put(var1, var13);
         return var16;
      }
   }

   public double method3427(Class7608<Class7631> var1) {
      return this.field5058.getDouble(var1);
   }

   public double method3428() {
      return !((double)this.method3393() < 0.4) ? 0.4 : 0.0;
   }

   public final float method3429() {
      return this.field5091.field39968;
   }

   public final float method3430() {
      return this.field5091.field39969;
   }

   public abstract Packet<?> method2835();

   public Class8847 method2981(Class2090 var1) {
      return this.field5017.method33221();
   }

   public Vector3d getPositionVec() {
      return this.field5028;
   }

   public BlockPos method3432() {
      return this.field5029;
   }

   public Vector3d method3433() {
      return this.field5030;
   }

   public void method3434(Vector3d var1) {
      this.field5030 = var1;
   }

   public void method3435(double var1, double var3, double var5) {
      this.method3434(new Vector3d(var1, var3, var5));
   }

   public final double getPosX() {
      return this.field5028.field18048;
   }

   public double method3437(double var1) {
      return this.field5028.field18048 + (double)this.method3429() * var1;
   }

   public double method3438(double var1) {
      return this.method3437((2.0 * this.field5054.nextDouble() - 1.0) * var1);
   }

   public final double getPosY() {
      return this.field5028.field18049;
   }

   public double method3440(double var1) {
      return this.field5028.field18049 + (double)this.method3430() * var1;
   }

   public double method3441() {
      return this.method3440(this.field5054.nextDouble());
   }

   public double method3442() {
      return this.field5028.field18049 + (double)this.field5092;
   }

   public final double getPosZ() {
      return this.field5028.field18050;
   }

   public double method3444(double var1) {
      return this.field5028.field18050 + (double)this.method3429() * var1;
   }

   public double method3445(double var1) {
      return this.method3444((2.0 * this.field5054.nextDouble() - 1.0) * var1);
   }

   public void method3446(double var1, double var3, double var5) {
      if (this.field5028.field18048 != var1 || this.field5028.field18049 != var3 || this.field5028.field18050 != var5) {
         this.field5028 = new Vector3d(var1, var3, var5);
         int var9 = MathHelper.method37769(var1);
         int var10 = MathHelper.method37769(var3);
         int var11 = MathHelper.method37769(var5);
         if (var9 != this.field5029.method8304() || var10 != this.field5029.getY() || var11 != this.field5029.method8306()) {
            this.field5029 = new BlockPos(var9, var10, var11);
         }

         this.field5075 = true;
      }
   }

   public void method3447() {
   }

   public Vector3d method2986(float var1) {
      return this.method3288(var1).method11339(0.0, (double)this.field5092 * 0.7, 0.0);
   }
}
