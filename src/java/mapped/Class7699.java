package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.play.server.SPlaySoundEffectPacket;
import net.minecraft.potion.EffectInstance;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class Class7699 {
   private static final ITextComponent field32968 = new TranslationTextComponent("event.minecraft.raid");
   private static final ITextComponent field32969 = new TranslationTextComponent("event.minecraft.raid.victory");
   private static final ITextComponent field32970 = new TranslationTextComponent("event.minecraft.raid.defeat");
   private static final ITextComponent field32971 = field32968.deepCopy().appendString(" - ").append(field32969);
   private static final ITextComponent field32972 = field32968.deepCopy().appendString(" - ").append(field32970);
   private final Map<Integer, Class1026> field32973 = Maps.newHashMap();
   private final Map<Integer, Set<Class1026>> field32974 = Maps.newHashMap();
   private final Set<UUID> field32975 = Sets.newHashSet();
   private long field32976;
   private BlockPos field32977;
   private final ServerWorld field32978;
   private boolean field32979;
   private final int field32980;
   private float field32981;
   private int field32982;
   private boolean field32983;
   private int field32984;
   private final Class3624 field32985 = new Class3624(field32968, Class2303.field15722, Class2300.field15705);
   private int field32986;
   private int field32987;
   private final Random field32988 = new Random();
   private final int field32989;
   private Class2305 field32990;
   private int field32991;
   private Optional<BlockPos> field32992 = Optional.<BlockPos>empty();

   public Class7699(int var1, ServerWorld var2, BlockPos var3) {
      this.field32980 = var1;
      this.field32978 = var2;
      this.field32983 = true;
      this.field32987 = 300;
      this.field32985.method12278(0.0F);
      this.field32977 = var3;
      this.field32989 = this.method25435(var2.method6997());
      this.field32990 = Class2305.field15739;
   }

   public Class7699(ServerWorld var1, CompoundNBT var2) {
      this.field32978 = var1;
      this.field32980 = var2.getInt("Id");
      this.field32979 = var2.getBoolean("Started");
      this.field32983 = var2.getBoolean("Active");
      this.field32976 = var2.getLong("TicksActive");
      this.field32982 = var2.getInt("BadOmenLevel");
      this.field32984 = var2.getInt("GroupsSpawned");
      this.field32987 = var2.getInt("PreRaidTicks");
      this.field32986 = var2.getInt("PostRaidTicks");
      this.field32981 = var2.getFloat("TotalHealth");
      this.field32977 = new BlockPos(var2.getInt("CX"), var2.getInt("CY"), var2.getInt("CZ"));
      this.field32989 = var2.getInt("NumGroups");
      this.field32990 = Class2305.method9075(var2.getString("Status"));
      this.field32975.clear();
      if (var2.contains("HeroesOfTheVillage", 9)) {
         ListNBT var5 = var2.method131("HeroesOfTheVillage", 11);

         for (int var6 = 0; var6 < var5.size(); var6++) {
            this.field32975.add(Class8354.method29282(var5.get(var6)));
         }
      }
   }

   public boolean method25388() {
      return this.method25392() || this.method25393();
   }

   public boolean method25389() {
      return this.method25390() && this.method25418() == 0 && this.field32987 > 0;
   }

   public boolean method25390() {
      return this.field32984 > 0;
   }

   public boolean method25391() {
      return this.field32990 == Class2305.field15742;
   }

   public boolean method25392() {
      return this.field32990 == Class2305.field15740;
   }

   public boolean method25393() {
      return this.field32990 == Class2305.field15741;
   }

   public World method25394() {
      return this.field32978;
   }

   public boolean method25395() {
      return this.field32979;
   }

   public int method25396() {
      return this.field32984;
   }

   private Predicate<ServerPlayerEntity> method25397() {
      return var1 -> {
         BlockPos var4 = var1.getPosition();
         return var1.isAlive() && this.field32978.method6957(var4) == this;
      };
   }

   private void method25398() {
      Set<ServerPlayerEntity> var3 = Sets.newHashSet(this.field32985.method12288());
      List<ServerPlayerEntity> var4 = this.field32978.method6914(this.method25397());

      for (ServerPlayerEntity var6 : var4) {
         if (!var3.contains(var6)) {
            this.field32985.method12263(var6);
         }
      }

      for (ServerPlayerEntity var8 : var3) {
         if (!var4.contains(var8)) {
            this.field32985.method12265(var8);
         }
      }
   }

   public int method25399() {
      return 5;
   }

   public int method25400() {
      return this.field32982;
   }

   public void method25401(PlayerEntity var1) {
      if (var1.isPotionActive(Effects.BAD_OMEN)) {
         this.field32982 = this.field32982 + var1.getActivePotionEffect(Effects.BAD_OMEN).method8629() + 1;
         this.field32982 = MathHelper.method37775(this.field32982, 0, this.method25399());
      }

      var1.removeEffects(Effects.BAD_OMEN);
   }

   public void method25402() {
      this.field32983 = false;
      this.field32985.method12266();
      this.field32990 = Class2305.field15742;
   }

   public void method25403() {
      if (!this.method25391()) {
         if (this.field32990 != Class2305.field15739) {
            if (this.method25388()) {
               this.field32991++;
               if (this.field32991 >= 600) {
                  this.method25402();
                  return;
               }

               if (this.field32991 % 20 == 0) {
                  this.method25398();
                  this.field32985.method12287(true);
                  if (!this.method25392()) {
                     this.field32985.method12284(field32972);
                  } else {
                     this.field32985.method12278(0.0F);
                     this.field32985.method12284(field32971);
                  }
               }
            }
         } else {
            boolean var3 = this.field32983;
            this.field32983 = this.field32978.method7017(this.field32977);
            if (this.field32978.method6997() == Difficulty.field14351) {
               this.method25402();
               return;
            }

            if (var3 != this.field32983) {
               this.field32985.method12287(this.field32983);
            }

            if (!this.field32983) {
               return;
            }

            if (!this.field32978.method6952(this.field32977)) {
               this.method25404();
            }

            if (!this.field32978.method6952(this.field32977)) {
               if (this.field32984 <= 0) {
                  this.method25402();
               } else {
                  this.field32990 = Class2305.field15741;
               }
            }

            this.field32976++;
            if (this.field32976 >= 48000L) {
               this.method25402();
               return;
            }

            int var4 = this.method25418();
            if (var4 == 0 && this.method25406()) {
               if (this.field32987 <= 0) {
                  if (this.field32987 == 0 && this.field32984 > 0) {
                     this.field32987 = 300;
                     this.field32985.method12284(field32968);
                     return;
                  }
               } else {
                  boolean var5 = this.field32992.isPresent();
                  boolean var6 = !var5 && this.field32987 % 5 == 0;
                  if (var5 && !this.field32978.getChunkProvider().method7352(new ChunkPos(this.field32992.get()))) {
                     var6 = true;
                  }

                  if (var6) {
                     byte var7 = 0;
                     if (this.field32987 >= 100) {
                        if (this.field32987 < 40) {
                           var7 = 2;
                        }
                     } else {
                        var7 = 1;
                     }

                     this.field32992 = this.method25405(var7);
                  }

                  if (this.field32987 == 300 || this.field32987 % 20 == 0) {
                     this.method25398();
                  }

                  this.field32987--;
                  this.field32985.method12278(MathHelper.clamp((float)(300 - this.field32987) / 300.0F, 0.0F, 1.0F));
               }
            }

            if (this.field32976 % 20L == 0L) {
               this.method25398();
               this.method25411();
               if (var4 <= 0) {
                  this.field32985.method12284(field32968);
               } else if (var4 > 2) {
                  this.field32985.method12284(field32968);
               } else {
                  this.field32985
                     .method12284(
                        field32968.deepCopy().appendString(" - ").append(new TranslationTextComponent("event.minecraft.raid.raiders_remaining", var4))
                     );
               }
            }

            boolean var12 = false;
            int var13 = 0;

            while (this.method25417()) {
               BlockPos var14 = !this.field32992.isPresent() ? this.method25423(var13, 20) : this.field32992.get();
               if (var14 == null) {
                  var13++;
               } else {
                  this.field32979 = true;
                  this.method25413(var14);
                  if (!var12) {
                     this.method25412(var14);
                     var12 = true;
                  }
               }

               if (var13 > 3) {
                  this.method25402();
                  break;
               }
            }

            if (this.method25395() && !this.method25406() && var4 == 0) {
               if (this.field32986 >= 40) {
                  this.field32990 = Class2305.field15740;

                  for (UUID var8 : this.field32975) {
                     Entity var9 = this.field32978.getEntityByUuid(var8);
                     if (var9 instanceof LivingEntity && !var9.isSpectator()) {
                        LivingEntity var10 = (LivingEntity)var9;
                        var10.addPotionEffect(new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 48000, this.field32982 - 1, false, false, true));
                        if (var10 instanceof ServerPlayerEntity) {
                           ServerPlayerEntity var11 = (ServerPlayerEntity)var10;
                           var11.method2911(Stats.field40174);
                           CriteriaTriggers.field44498.method15062(var11);
                        }
                     }
                  }
               } else {
                  this.field32986++;
               }
            }

            this.method25420();
         }
      }
   }

   private void method25404() {
      Stream<Class2002> var3 = Class2002.method8427(Class2002.method8390(this.field32977), 2);
      var3.filter(this.field32978::method6953)
         .map(Class2002::method8422)
         .min(Comparator.comparingDouble(var1 -> var1.method8318(this.field32977)))
         .ifPresent(this::method25429);
   }

   private Optional<BlockPos> method25405(int var1) {
      for (int var4 = 0; var4 < 3; var4++) {
         BlockPos var5 = this.method25423(var1, 1);
         if (var5 != null) {
            return Optional.<BlockPos>of(var5);
         }
      }

      return Optional.<BlockPos>empty();
   }

   private boolean method25406() {
      return !this.method25408() ? !this.method25407() : !this.method25409();
   }

   private boolean method25407() {
      return this.method25396() == this.field32989;
   }

   private boolean method25408() {
      return this.field32982 > 1;
   }

   private boolean method25409() {
      return this.method25396() > this.field32989;
   }

   private boolean method25410() {
      return this.method25407() && this.method25418() == 0 && this.method25408();
   }

   private void method25411() {
      Iterator<Set<Class1026>> var3 = this.field32974.values().iterator();
      Set<Class1026> var4 = Sets.newHashSet();

      while (var3.hasNext()) {
         Set<Class1026> var5 = var3.next();

         for (Class1026 var7 : var5) {
            BlockPos var8 = var7.getPosition();
            if (var7.removed || var7.world.getDimensionKey() != this.field32978.getDimensionKey() || this.field32977.method8318(var8) >= 12544.0) {
               var4.add(var7);
            } else if (var7.ticksExisted > 600) {
               if (this.field32978.getEntityByUuid(var7.getUniqueID()) == null) {
                  var4.add(var7);
               }

               if (!this.field32978.method6952(var8) && var7.method3021() > 2400) {
                  var7.method4558(var7.method4557() + 1);
               }

               if (var7.method4557() >= 30) {
                  var4.add(var7);
               }
            }
         }
      }

      for (Class1026 var10 : var4) {
         this.method25419(var10, true);
      }
   }

   private void method25412(BlockPos var1) {
      float var4 = 13.0F;
      byte var5 = 64;
      Collection var6 = this.field32985.method12288();

      for (ServerPlayerEntity var8 : this.field32978.method6870()) {
         Vector3d var9 = var8.getPositionVec();
         Vector3d var10 = Vector3d.method11328(var1);
         float var11 = MathHelper.sqrt(
            (var10.x - var9.x) * (var10.x - var9.x)
               + (var10.z - var9.z) * (var10.z - var9.z)
         );
         double var12 = var9.x + (double)(13.0F / var11) * (var10.x - var9.x);
         double var14 = var9.z + (double)(13.0F / var11) * (var10.z - var9.z);
         if (var11 <= 64.0F || var6.contains(var8)) {
            var8.field4855.sendPacket(new SPlaySoundEffectPacket(SoundEvents.field26992, Class2266.field14734, var12, var8.getPosY(), var14, 64.0F, 1.0F));
         }
      }
   }

   private void method25413(BlockPos var1) {
      boolean var4 = false;
      int var5 = this.field32984 + 1;
      this.field32981 = 0.0F;
      Class9755 var6 = this.field32978.method6807(var1);
      boolean var7 = this.method25410();

      for (Class2127 var11 : Class2127.method8808()) {
         int var12 = this.method25431(var11, var5, var7) + this.method25432(var11, this.field32988, var5, var6, var7);
         int var13 = 0;

         for (int var14 = 0; var14 < var12; var14++) {
            Class1026 var15 = (Class1026)Class2127.method8809(var11).create(this.field32978);
            if (!var4 && var15.method4570()) {
               var15.method4576(true);
               this.method25426(var5, var15);
               var4 = true;
            }

            this.method25414(var5, var15, var1, false);
            if (Class2127.method8809(var11) == EntityType.field41072) {
               Class1026 var16 = null;
               if (var5 != this.method25435(Difficulty.field14353)) {
                  if (var5 >= this.method25435(Difficulty.field14354)) {
                     if (var13 != 0) {
                        var16 = EntityType.field41099.create(this.field32978);
                     } else {
                        var16 = EntityType.field41027.create(this.field32978);
                     }
                  }
               } else {
                  var16 = EntityType.field41067.create(this.field32978);
               }

               var13++;
               if (var16 != null) {
                  this.method25414(var5, var16, var1, false);
                  var16.moveToBlockPosAndAngles(var1, 0.0F, 0.0F);
                  var16.method3311(var15);
               }
            }
         }
      }

      this.field32992 = Optional.<BlockPos>empty();
      this.field32984++;
      this.method25415();
      this.method25420();
   }

   public void method25414(int var1, Class1026 var2, BlockPos var3, boolean var4) {
      boolean var7 = this.method25424(var1, var2);
      if (var7) {
         var2.method4550(this);
         var2.method4553(var1);
         var2.method4548(true);
         var2.method4558(0);
         if (!var4 && var3 != null) {
            var2.setPosition((double)var3.getX() + 0.5, (double)var3.getY() + 1.0, (double)var3.getZ() + 0.5);
            var2.method4276(this.field32978, this.field32978.method6807(var3), Class2202.field14398, (Class5093)null, (CompoundNBT)null);
            var2.method4545(var1, false);
            var2.setOnGround(true);
            this.field32978.method6995(var2);
         }
      }
   }

   public void method25415() {
      this.field32985.method12278(MathHelper.clamp(this.method25416() / this.field32981, 0.0F, 1.0F));
   }

   public float method25416() {
      float var3 = 0.0F;

      for (Set<Class1026> var5 : this.field32974.values()) {
         for (Class1026 var7 : var5) {
            var3 += var7.getHealth();
         }
      }

      return var3;
   }

   private boolean method25417() {
      return this.field32987 == 0 && (this.field32984 < this.field32989 || this.method25410()) && this.method25418() == 0;
   }

   public int method25418() {
      return this.field32974.values().stream().mapToInt(Set::size).sum();
   }

   public void method25419(Class1026 var1, boolean var2) {
      Set var5 = this.field32974.get(var1.method4554());
      if (var5 != null) {
         boolean var6 = var5.remove(var1);
         if (var6) {
            if (var2) {
               this.field32981 = this.field32981 - var1.getHealth();
            }

            var1.method4550((Class7699)null);
            this.method25415();
            this.method25420();
         }
      }
   }

   private void method25420() {
      this.field32978.method6956().method24605();
   }

   public static ItemStack method25421() {
      ItemStack var2 = new ItemStack(Items.field38092);
      CompoundNBT var3 = var2.method32144("BlockEntityTag");
      ListNBT var4 = new Class7291()
         .method23058(Class2154.field14107, Class112.field395)
         .method23058(Class2154.field14087, Class112.field394)
         .method23058(Class2154.field14091, Class112.field393)
         .method23058(Class2154.field14112, Class112.field394)
         .method23058(Class2154.field14092, Class112.field401)
         .method23058(Class2154.field14109, Class112.field394)
         .method23058(Class2154.field14106, Class112.field394)
         .method23058(Class2154.field14112, Class112.field401)
         .method23059();
      var3.put("Patterns", var4);
      var2.method32156(Class2304.field15735);
      var2.method32150(new TranslationTextComponent("block.minecraft.ominous_banner").mergeStyle(TextFormatting.GOLD));
      return var2;
   }

   @Nullable
   public Class1026 method25422(int var1) {
      return this.field32973.get(var1);
   }

   @Nullable
   private BlockPos method25423(int var1, int var2) {
      int var5 = var1 != 0 ? 2 - var1 : 2;
      BlockPos.Mutable var6 = new BlockPos.Mutable();

      for (int var7 = 0; var7 < var2; var7++) {
         float var8 = this.field32978.rand.nextFloat() * (float) (Math.PI * 2);
         int var9 = this.field32977.getX()
            + MathHelper.method37767(MathHelper.cos(var8) * 32.0F * (float)var5)
            + this.field32978.rand.nextInt(5);
         int var10 = this.field32977.getZ()
            + MathHelper.method37767(MathHelper.sin(var8) * 32.0F * (float)var5)
            + this.field32978.rand.nextInt(5);
         int var11 = this.field32978.method6736(Heightmap.Type.field296, var9, var10);
         var6.method8372(var9, var11, var10);
         if ((!this.field32978.method6952(var6) || var1 >= 2)
            && this.field32978
               .method7019(
                  var6.getX() - 10,
                  var6.getY() - 10,
                  var6.getZ() - 10,
                  var6.getX() + 10,
                  var6.getY() + 10,
                  var6.getZ() + 10
               )
            && this.field32978.getChunkProvider().method7352(new ChunkPos(var6))
            && (
               Class8170.method28429(Class2068.field13472, this.field32978, var6, EntityType.field41072)
                  || this.field32978.getBlockState(var6.down()).isIn(Blocks.SNOW) && this.field32978.getBlockState(var6).isAir()
            )) {
            return var6;
         }
      }

      return null;
   }

   private boolean method25424(int var1, Class1026 var2) {
      return this.method25425(var1, var2, true);
   }

   public boolean method25425(int var1, Class1026 var2, boolean var3) {
      this.field32974.computeIfAbsent(var1, var0 -> Sets.newHashSet());
      Set<Class1026> var6 = this.field32974.get(var1);
      Class1026 var7 = null;

      for (Class1026 var9 : var6) {
         if (var9.getUniqueID().equals(var2.getUniqueID())) {
            var7 = var9;
            break;
         }
      }

      if (var7 != null) {
         var6.remove(var7);
         var6.add(var2);
      }

      var6.add(var2);
      if (var3) {
         this.field32981 = this.field32981 + var2.getHealth();
      }

      this.method25415();
      this.method25420();
      return true;
   }

   public void method25426(int var1, Class1026 var2) {
      this.field32973.put(var1, var2);
      var2.setItemStackToSlot(EquipmentSlotType.HEAD, method25421());
      var2.method4279(EquipmentSlotType.HEAD, 2.0F);
   }

   public void method25427(int var1) {
      this.field32973.remove(var1);
   }

   public BlockPos method25428() {
      return this.field32977;
   }

   private void method25429(BlockPos var1) {
      this.field32977 = var1;
   }

   public int method25430() {
      return this.field32980;
   }

   private int method25431(Class2127 var1, int var2, boolean var3) {
      return !var3 ? Class2127.method8810(var1)[var2] : Class2127.method8810(var1)[this.field32989];
   }

   private int method25432(Class2127 var1, Random var2, int var3, Class9755 var4, boolean var5) {
      Difficulty var8 = var4.method38327();
      boolean var9 = var8 == Difficulty.field14352;
      boolean var10 = var8 == Difficulty.field14353;
      int var11;
      switch (Class8994.field41134[var1.ordinal()]) {
         case 1:
            if (var9 || var3 <= 2 || var3 == 4) {
               return 0;
            }

            var11 = 1;
            break;
         case 2:
         case 3:
            if (var9) {
               var11 = var2.nextInt(2);
            } else if (var10) {
               var11 = 1;
            } else {
               var11 = 2;
            }
            break;
         case 4:
            var11 = !var9 && var5 ? 1 : 0;
            break;
         default:
            return 0;
      }

      return var11 > 0 ? var2.nextInt(var11 + 1) : 0;
   }

   public boolean method25433() {
      return this.field32983;
   }

   public CompoundNBT method25434(CompoundNBT var1) {
      var1.putInt("Id", this.field32980);
      var1.putBoolean("Started", this.field32979);
      var1.putBoolean("Active", this.field32983);
      var1.method103("TicksActive", this.field32976);
      var1.putInt("BadOmenLevel", this.field32982);
      var1.putInt("GroupsSpawned", this.field32984);
      var1.putInt("PreRaidTicks", this.field32987);
      var1.putInt("PostRaidTicks", this.field32986);
      var1.putFloat("TotalHealth", this.field32981);
      var1.putInt("NumGroups", this.field32989);
      var1.method109("Status", this.field32990.method9074());
      var1.putInt("CX", this.field32977.getX());
      var1.putInt("CY", this.field32977.getY());
      var1.putInt("CZ", this.field32977.getZ());
      ListNBT var4 = new ListNBT();

      for (UUID var6 : this.field32975) {
         var4.add(Class8354.method29281(var6));
      }

      var1.put("HeroesOfTheVillage", var4);
      return var1;
   }

   public int method25435(Difficulty var1) {
      switch (Class8994.field41135[var1.ordinal()]) {
         case 1:
            return 3;
         case 2:
            return 5;
         case 3:
            return 7;
         default:
            return 0;
      }
   }

   public float method25436() {
      int var3 = this.method25400();
      if (var3 != 2) {
         if (var3 != 3) {
            if (var3 != 4) {
               return var3 != 5 ? 0.0F : 0.75F;
            } else {
               return 0.5F;
            }
         } else {
            return 0.25F;
         }
      } else {
         return 0.1F;
      }
   }

   public void method25437(Entity var1) {
      this.field32975.add(var1.getUniqueID());
   }
}
