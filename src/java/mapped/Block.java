package mapped;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;
import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.impl.Class4424;
import it.unimi.dsi.fastutil.objects.Object2ByteLinkedOpenHashMap;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Block extends Class3390 implements Class3303 {
   public static final Logger field18609 = LogManager.getLogger();
   public static final Class2352<Class7380> field18610 = new Class2352<Class7380>();
   private static final LoadingCache<Class6408, Boolean> field18611 = CacheBuilder.newBuilder().maximumSize(512L).weakKeys().build(new Class4562());
   public final Class9348<Block, Class7380> field18612;
   private Class7380 field18613;
   private String field18614;
   private Class3257 field18615;
   private static final ThreadLocal<Object2ByteLinkedOpenHashMap<Class8570>> field18616 = ThreadLocal.<Object2ByteLinkedOpenHashMap<Class8570>>withInitial(
      () -> {
         Class2360 var2 = new Class2360(2048, 0.25F);
         var2.defaultReturnValue((byte)127);
         return var2;
      }
   );

   public static int method11535(Class7380 var0) {
      if (var0 != null) {
         int var3 = field18610.method9171(var0);
         return var3 != -1 ? var3 : 0;
      } else {
         return 0;
      }
   }

   public static Class7380 method11536(int var0) {
      Class7380 var3 = field18610.method9172(var0);
      return var3 != null ? var3 : Blocks.AIR.method11579();
   }

   public static Block method11537(Class3257 var0) {
      return !(var0 instanceof Class3292) ? Blocks.AIR : ((Class3292)var0).method11845();
   }

   public static Class7380 method11538(Class7380 var0, Class7380 var1, World var2, BlockPos var3) {
      Class6408 var6 = Class8022.method27434(var0.method23414(var2, var3), var1.method23414(var2, var3), Class9477.field44039)
         .method19517((double)var3.method8304(), (double)var3.getY(), (double)var3.method8306());

      for (Entity var8 : var2.method7181((Entity)null, var6.method19514())) {
         double var9 = Class8022.method27437(Class113.field414, var8.method3389().method19667(0.0, 1.0, 0.0), Stream.<Class6408>of(var6), -1.0);
         var8.method2793(var8.getPosX(), var8.getPosY() + 1.0 + var9, var8.getPosZ());
      }

      return var1;
   }

   public static Class6408 method11539(double var0, double var2, double var4, double var6, double var8, double var10) {
      return Class8022.method27427(var0 / 16.0, var2 / 16.0, var4 / 16.0, var6 / 16.0, var8 / 16.0, var10 / 16.0);
   }

   public boolean method11540(Class7608<Block> var1) {
      return var1.method24917(this);
   }

   public boolean method11541(Block var1) {
      return this == var1;
   }

   public static Class7380 method11542(Class7380 var0, Class1660 var1, BlockPos var2) {
      Class7380 var5 = var0;
      Mutable var6 = new Mutable();

      for (Direction var10 : field19003) {
         var6.method8377(var2, var10);
         var5 = var5.method23439(var10, var1.method6738(var6), var1, var2, var6);
      }

      return var5;
   }

   public static void method11543(Class7380 var0, Class7380 var1, Class1660 var2, BlockPos var3, int var4) {
      method11544(var0, var1, var2, var3, var4, 512);
   }

   public static void method11544(Class7380 var0, Class7380 var1, Class1660 var2, BlockPos var3, int var4, int var5) {
      if (var1 != var0) {
         if (!var1.method23393()) {
            var2.method6726(var3, var1, var4 & -33, var5);
         } else if (!var2.method6714()) {
            var2.method6729(var3, (var4 & 32) == 0, (Entity)null, var5);
         }
      }
   }

   public Block(AbstractBlock var1) {
      super(var1);
      Class7558<Block, Class7380> var4 = new Class7558<>(this);
      this.method11489(var4);
      this.field18612 = var4.method24739(Block::method11579, Class7380::new);
      this.method11578(this.field18612.method35393());
   }

   public static boolean method11545(Block var0) {
      return var0 instanceof Class3465
         || var0 == Blocks.field36765
         || var0 == Blocks.field36589
         || var0 == Blocks.field36590
         || var0 == Blocks.MELON
         || var0 == Blocks.PUMPKIN
         || var0.method11540(Class7645.field32805);
   }

   public boolean method11499(Class7380 var1) {
      return this.field19007;
   }

   public static boolean method11546(Class7380 var0, Class1665 var1, BlockPos var2, Direction var3) {
      BlockPos var6 = var2.method8349(var3);
      Class7380 var7 = var1.method6738(var6);
      Class4424 var8 = new Class4424(var0);
      Client.getInstance().getEventManager().call(var8);
      if (!var8.isCancelled()) {
         if (!var8.method13971()) {
            if (!var0.method23411(var7, var3)) {
               if (!var7.method23410()) {
                  return true;
               } else {
                  Class8570 var9 = new Class8570(var0, var7, var3);
                  Object2ByteLinkedOpenHashMap var10 = field18616.get();
                  byte var11 = var10.getAndMoveToFirst(var9);
                  if (var11 == 127) {
                     Class6408 var12 = var0.method23388(var1, var2, var3);
                     Class6408 var13 = var7.method23388(var1, var6, var3.method536());
                     boolean var14 = Class8022.method27435(var12, var13, Class9477.field44041);
                     if (var10.size() == 2048) {
                        var10.removeLastByte();
                     }

                     var10.putAndMoveToFirst(var9, (byte)(!var14 ? 0 : 1));
                     return var14;
                  } else {
                     return var11 != 0;
                  }
               }
            } else {
               return false;
            }
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public static boolean method11547(Class1665 var0, BlockPos var1) {
      return var0.method6738(var1).method23455(var0, var1, Direction.field673, Class2156.field14142);
   }

   public static boolean method11548(Class1662 var0, BlockPos var1, Direction var2) {
      Class7380 var5 = var0.method6738(var1);
      return var2 == Direction.field672 && var5.method23446(Class7645.field32813) ? false : var5.method23455(var0, var1, var2, Class2156.field14141);
   }

   public static boolean method11549(Class6408 var0, Direction var1) {
      Class6408 var4 = var0.method19526(var1);
      return method11550(var4);
   }

   public static boolean method11550(Class6408 var0) {
      return (Boolean)field18611.getUnchecked(var0);
   }

   public boolean method11493(Class7380 var1, Class1665 var2, BlockPos var3) {
      return !method11550(var1.method23412(var2, var3)) && var1.method23449().method23474();
   }

   public void method11512(Class7380 var1, World var2, BlockPos var3, Random var4) {
   }

   public void method11551(Class1660 var1, BlockPos var2, Class7380 var3) {
   }

   public static List<ItemStack> method11552(Class7380 var0, ServerWorld var1, BlockPos var2, Class944 var3) {
      Class9464 var6 = new Class9464(var1)
         .method36450(var1.field9016)
         .method36454(Class9525.field44335, Vector3d.method11328(var2))
         .method36454(Class9525.field44338, ItemStack.EMPTY)
         .method36455(Class9525.field44337, var3);
      return var0.method23434(var6);
   }

   public static List<ItemStack> method11553(Class7380 var0, ServerWorld var1, BlockPos var2, Class944 var3, Entity var4, ItemStack var5) {
      Class9464 var8 = new Class9464(var1)
         .method36450(var1.field9016)
         .method36454(Class9525.field44335, Vector3d.method11328(var2))
         .method36454(Class9525.field44338, var5)
         .method36455(Class9525.field44330, var4)
         .method36455(Class9525.field44337, var3);
      return var0.method23434(var8);
   }

   public static void method11554(Class7380 var0, World var1, BlockPos var2) {
      if (var1 instanceof ServerWorld) {
         method11552(var0, (ServerWorld)var1, var2, (Class944)null).forEach(var2x -> method11557(var1, var2, var2x));
         var0.method23433((ServerWorld)var1, var2, ItemStack.EMPTY);
      }
   }

   public static void method11555(Class7380 var0, Class1660 var1, BlockPos var2, Class944 var3) {
      if (var1 instanceof ServerWorld) {
         method11552(var0, (ServerWorld)var1, var2, var3).forEach(var2x -> method11557((ServerWorld)var1, var2, var2x));
         var0.method23433((ServerWorld)var1, var2, ItemStack.EMPTY);
      }
   }

   public static void method11556(Class7380 var0, World var1, BlockPos var2, Class944 var3, Entity var4, ItemStack var5) {
      if (var1 instanceof ServerWorld) {
         method11553(var0, (ServerWorld)var1, var2, var3, var4, var5).forEach(var2x -> method11557(var1, var2, var2x));
         var0.method23433((ServerWorld)var1, var2, var5);
      }
   }

   public static void method11557(World var0, BlockPos var1, ItemStack var2) {
      if (!var0.field9020 && !var2.method32105() && var0.method6789().method17135(Class5462.field24228)) {
         float var5 = 0.5F;
         double var6 = (double)(var0.field9016.nextFloat() * 0.5F) + 0.25;
         double var8 = (double)(var0.field9016.nextFloat() * 0.5F) + 0.25;
         double var10 = (double)(var0.field9016.nextFloat() * 0.5F) + 0.25;
         ItemEntity var12 = new ItemEntity(var0, (double)var1.method8304() + var6, (double)var1.getY() + var8, (double)var1.method8306() + var10, var2);
         var12.method4131();
         var0.method6916(var12);
      }
   }

   public void method11558(ServerWorld var1, BlockPos var2, int var3) {
      if (var1.method6789().method17135(Class5462.field24228)) {
         while (var3 > 0) {
            int var6 = ExperienceOrbEntity.method4179(var3);
            var3 -= var6;
            var1.method6916(new ExperienceOrbEntity(var1, (double)var2.method8304() + 0.5, (double)var2.getY() + 0.5, (double)var2.method8306() + 0.5, var6));
         }
      }
   }

   public float method11559() {
      return this.field19006;
   }

   public void method11560(World var1, BlockPos var2, Class7782 var3) {
   }

   public void method11561(World var1, BlockPos var2, Entity var3) {
   }

   @Nullable
   public Class7380 method11495(Class5909 var1) {
      return this.method11579();
   }

   public void method11562(World var1, PlayerEntity var2, BlockPos var3, Class7380 var4, Class944 var5, ItemStack var6) {
      var2.method2913(Class8876.field40096.method172(this));
      var2.method2931(0.005F);
      method11556(var4, var1, var3, var5, var2, var6);
   }

   public void method11563(World var1, BlockPos var2, Class7380 var3, Class880 var4, ItemStack var5) {
   }

   public boolean method11564() {
      return !this.field19004.method31086() && !this.field19004.method31085();
   }

   public IFormattableTextComponent method11565() {
      return new TranslationTextComponent(this.method11566());
   }

   public String method11566() {
      if (this.field18614 == null) {
         this.field18614 = Util.method38486("block", Class2348.field16072.method9181(this));
      }

      return this.field18614;
   }

   public void method11567(World var1, BlockPos var2, Entity var3, float var4) {
      var3.method2921(var4, 1.0F);
   }

   public void method11568(Class1665 var1, Entity var2) {
      var2.method3434(var2.method3433().method11347(1.0, 0.0, 1.0));
   }

   public ItemStack method11569(Class1665 var1, BlockPos var2, Class7380 var3) {
      return new ItemStack(this);
   }

   public void method11570(Class7401 var1, Class25<ItemStack> var2) {
      var2.add(new ItemStack(this));
   }

   public float method11571() {
      return this.field19009;
   }

   public float method11572() {
      return this.field19010;
   }

   public float method11573() {
      return this.field19011;
   }

   public void method11574(World var1, BlockPos var2, Class7380 var3, PlayerEntity var4) {
      var1.method6869(var4, 2001, var2, method11535(var3));
      if (this.method11540(Class7645.field32810)) {
         Class4388.method13832(var4, false);
      }
   }

   public void method11575(World var1, BlockPos var2) {
   }

   public boolean method11576(Class7782 var1) {
      return true;
   }

   public void method11489(Class7558<Block, Class7380> var1) {
   }

   public Class9348<Block, Class7380> method11577() {
      return this.field18612;
   }

   public final void method11578(Class7380 var1) {
      this.field18613 = var1;
   }

   public final Class7380 method11579() {
      return this.field18613;
   }

   public Class8447 method11580(Class7380 var1) {
      return this.field19008;
   }

   @Override
   public Class3257 method11581() {
      if (this.field18615 == null) {
         this.field18615 = Class3257.method11703(this);
      }

      return this.field18615;
   }

   public boolean method11582() {
      return this.field19012;
   }

   @Override
   public String toString() {
      return "Block{" + Class2348.field16072.method9181(this) + "}";
   }

   public void method11583(ItemStack var1, Class1665 var2, List<ITextComponent> var3, Class2216 var4) {
   }

   @Override
   public Block method11584() {
      return this;
   }
}
