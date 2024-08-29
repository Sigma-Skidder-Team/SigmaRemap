package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.serialization.Dynamic;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class7529 extends Class7530 {
   private static final Logger field32315 = LogManager.getLogger();
   public int field32316;
   public int field32317;
   public RegistryKey<World> field32318;
   public boolean field32319;
   public boolean field32320;
   public byte field32321;
   public byte[] field32322 = new byte[16384];
   public boolean field32323;
   public final List<Class8541> field32324 = Lists.newArrayList();
   private final Map<PlayerEntity, Class8541> field32325 = Maps.newHashMap();
   private final Map<String, Class7468> field32326 = Maps.newHashMap();
   public final Map<String, Class7982> field32327 = Maps.newLinkedHashMap();
   private final Map<String, Class6674> field32328 = Maps.newHashMap();

   public Class7529(String var1) {
      super(var1);
   }

   public void method24589(int var1, int var2, int var3, boolean var4, boolean var5, RegistryKey<World> var6) {
      this.field32321 = (byte)var3;
      this.method24590((double)var1, (double)var2, this.field32321);
      this.field32318 = var6;
      this.field32319 = var4;
      this.field32320 = var5;
      this.method24605();
   }

   public void method24590(double var1, double var3, int var5) {
      int var8 = 128 * (1 << var5);
      int var9 = MathHelper.floor((var1 + 64.0) / (double)var8);
      int var10 = MathHelper.floor((var3 + 64.0) / (double)var8);
      this.field32316 = var9 * var8 + var8 / 2 - 64;
      this.field32317 = var10 * var8 + var8 / 2 - 64;
   }

   @Override
   public void method24591(CompoundNBT var1) {
      this.field32318 = (RegistryKey<World>) DimensionType.decodeWorldKey(new Dynamic(NBTDynamicOps.INSTANCE, var1.method116("dimension")))
         .resultOrPartial(field32315::error)
         .orElseThrow(() -> new IllegalArgumentException("Invalid map dimension: " + var1.method116("dimension")));
      this.field32316 = var1.method122("xCenter");
      this.field32317 = var1.method122("zCenter");
      this.field32321 = (byte) MathHelper.method37775(var1.method120("scale"), 0, 4);
      this.field32319 = !var1.method119("trackingPosition", 1) || var1.method132("trackingPosition");
      this.field32320 = var1.method132("unlimitedTracking");
      this.field32323 = var1.method132("locked");
      this.field32322 = var1.method127("colors");
      if (this.field32322.length != 16384) {
         this.field32322 = new byte[16384];
      }

      ListNBT var4 = var1.method131("banners", 10);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         Class7468 var6 = Class7468.method24183(var4.method153(var5));
         this.field32326.put(var6.method24189(), var6);
         this.method24596(
            var6.method24186(),
            (Class1660)null,
            var6.method24189(),
            (double)var6.method24185().getX(),
            (double)var6.method24185().getZ(),
            180.0,
            var6.method24187()
         );
      }

      ListNBT var8 = var1.method131("frames", 10);

      for (int var9 = 0; var9 < var8.size(); var9++) {
         Class6674 var7 = Class6674.method20349(var8.method153(var9));
         this.field32328.put(var7.method20354(), var7);
         this.method24596(
            MapDecorationType.field14517,
            (Class1660)null,
            "frame-" + var7.method20353(),
            (double)var7.method20351().getX(),
            (double)var7.method20351().getZ(),
            (double)var7.method20352(),
            (ITextComponent)null
         );
      }
   }

   @Override
   public CompoundNBT method24592(CompoundNBT var1) {
      ResourceLocation.CODEC
         .encodeStart(NBTDynamicOps.INSTANCE, this.field32318.getLocation())
         .resultOrPartial(field32315::error)
         .ifPresent(var1x -> var1.put("dimension", var1x));
      var1.method102("xCenter", this.field32316);
      var1.method102("zCenter", this.field32317);
      var1.method100("scale", this.field32321);
      var1.method110("colors", this.field32322);
      var1.method115("trackingPosition", this.field32319);
      var1.method115("unlimitedTracking", this.field32320);
      var1.method115("locked", this.field32323);
      ListNBT var4 = new ListNBT();

      for (Class7468 var6 : this.field32326.values()) {
         var4.add(var6.method24188());
      }

      var1.put("banners", var4);
      ListNBT var8 = new ListNBT();

      for (Class6674 var7 : this.field32328.values()) {
         var8.add(var7.method20350());
      }

      var1.put("frames", var8);
      return var1;
   }

   public void method24593(Class7529 var1) {
      this.field32323 = true;
      this.field32316 = var1.field32316;
      this.field32317 = var1.field32317;
      this.field32326.putAll(var1.field32326);
      this.field32327.putAll(var1.field32327);
      System.arraycopy(var1.field32322, 0, this.field32322, 0, var1.field32322.length);
      this.method24605();
   }

   public void method24594(PlayerEntity var1, ItemStack var2) {
      if (!this.field32325.containsKey(var1)) {
         Class8541 var5 = new Class8541(this, var1);
         this.field32325.put(var1, var5);
         this.field32324.add(var5);
      }

      if (!var1.inventory.method4058(var2)) {
         this.field32327.remove(var1.getName().getString());
      }

      for (int var9 = 0; var9 < this.field32324.size(); var9++) {
         Class8541 var6 = this.field32324.get(var9);
         String var7 = var6.field38390.getName().getString();
         if (!var6.field38390.removed && (var6.field38390.inventory.method4058(var2) || var2.method32165())) {
            if (!var2.method32165() && var6.field38390.world.getDimensionKey() == this.field32318 && this.field32319) {
               this.method24596(
                  MapDecorationType.field14516,
                  var6.field38390.world,
                  var7,
                  var6.field38390.getPosX(),
                  var6.field38390.getPosZ(),
                  (double)var6.field38390.rotationYaw,
                  (ITextComponent)null
               );
            }
         } else {
            this.field32325.remove(var6.field38390);
            this.field32324.remove(var6);
            this.field32327.remove(var7);
         }
      }

      if (var2.method32165() && this.field32319) {
         ItemFrameEntity var10 = var2.method32167();
         BlockPos var12 = var10.method4085();
         Class6674 var14 = this.field32328.get(Class6674.method20355(var12));
         if (var14 != null && var10.method3205() != var14.method20353() && this.field32328.containsKey(var14.method20354())) {
            this.field32327.remove("frame-" + var14.method20353());
         }

         Class6674 var8 = new Class6674(var12, var10.method3386().method534() * 90, var10.method3205());
         this.method24596(
            MapDecorationType.field14517,
            var1.world,
            "frame-" + var10.method3205(),
            (double)var12.getX(),
            (double)var12.getZ(),
            (double)(var10.method3386().method534() * 90),
            (ITextComponent)null
         );
         this.field32328.put(var8.method20354(), var8);
      }

      CompoundNBT var11 = var2.method32142();
      if (var11 != null && var11.method119("Decorations", 9)) {
         ListNBT var13 = var11.method131("Decorations", 10);

         for (int var15 = 0; var15 < var13.size(); var15++) {
            CompoundNBT var16 = var13.method153(var15);
            if (!this.field32327.containsKey(var16.method126("id"))) {
               this.method24596(
                  MapDecorationType.method8957(var16.method120("type")),
                  var1.world,
                  var16.method126("id"),
                  var16.method125("x"),
                  var16.method125("z"),
                  var16.method125("rot"),
                  (ITextComponent)null
               );
            }
         }
      }
   }

   public static void method24595(ItemStack var0, BlockPos var1, String var2, MapDecorationType var3) {
      ListNBT var6;
      if (var0.method32141() && var0.method32142().method119("Decorations", 9)) {
         var6 = var0.method32142().method131("Decorations", 10);
      } else {
         var6 = new ListNBT();
         var0.setTagInfo("Decorations", var6);
      }

      CompoundNBT var7 = new CompoundNBT();
      var7.method100("type", var3.method8953());
      var7.method109("id", var2);
      var7.method108("x", (double)var1.getX());
      var7.method108("z", (double)var1.getZ());
      var7.method108("rot", 180.0);
      var6.add(var7);
      if (var3.method8955()) {
         CompoundNBT var8 = var0.method32144("display");
         var8.method102("MapColor", var3.method8956());
      }
   }

   private void method24596(MapDecorationType var1, Class1660 var2, String var3, double var4, double var6, double var8, ITextComponent var10) {
      int var13 = 1 << this.field32321;
      float var14 = (float)(var4 - (double)this.field32316) / (float)var13;
      float var15 = (float)(var6 - (double)this.field32317) / (float)var13;
      byte var16 = (byte)((int)((double)(var14 * 2.0F) + 0.5));
      byte var17 = (byte)((int)((double)(var15 * 2.0F) + 0.5));
      byte var18 = 63;
      byte var20;
      if (var14 >= -63.0F && var15 >= -63.0F && var14 <= 63.0F && var15 <= 63.0F) {
         var8 += !(var8 < 0.0) ? 8.0 : -8.0;
         var20 = (byte)((int)(var8 * 16.0 / 360.0));
         if (this.field32318 == World.THE_NETHER && var2 != null) {
            int var22 = (int)(var2.getWorldInfo().method20034() / 10L);
            var20 = (byte)(var22 * var22 * 34187121 + var22 * 121 >> 15 & 15);
         }
      } else {
         if (var1 != MapDecorationType.field14516) {
            this.field32327.remove(var3);
            return;
         }

         short var19 = 320;
         if (Math.abs(var14) < 320.0F && Math.abs(var15) < 320.0F) {
            var1 = MapDecorationType.field14522;
         } else {
            if (!this.field32320) {
               this.field32327.remove(var3);
               return;
            }

            var1 = MapDecorationType.field14523;
         }

         var20 = 0;
         if (var14 <= -63.0F) {
            var16 = -128;
         }

         if (var15 <= -63.0F) {
            var17 = -128;
         }

         if (var14 >= 63.0F) {
            var16 = 127;
         }

         if (var15 >= 63.0F) {
            var17 = 127;
         }
      }

      this.field32327.put(var3, new Class7982(var1, var16, var17, var20, var10));
   }

   @Nullable
   public Packet<?> method24597(ItemStack var1, Class1665 var2, PlayerEntity var3) {
      Class8541 var6 = this.field32325.get(var3);
      return var6 != null ? var6.method30388(var1) : null;
   }

   public void method24598(int var1, int var2) {
      this.method24605();

      for (Class8541 var6 : this.field32324) {
         var6.method30389(var1, var2);
      }
   }

   public Class8541 method24599(PlayerEntity var1) {
      Class8541 var4 = this.field32325.get(var1);
      if (var4 == null) {
         var4 = new Class8541(this, var1);
         this.field32325.put(var1, var4);
         this.field32324.add(var4);
      }

      return var4;
   }

   public void method24600(Class1660 var1, BlockPos var2) {
      double var5 = (double)var2.getX() + 0.5;
      double var7 = (double)var2.getZ() + 0.5;
      int var9 = 1 << this.field32321;
      double var10 = (var5 - (double)this.field32316) / (double)var9;
      double var12 = (var7 - (double)this.field32317) / (double)var9;
      byte var14 = 63;
      boolean var15 = false;
      if (var10 >= -63.0 && var12 >= -63.0 && var10 <= 63.0 && var12 <= 63.0) {
         Class7468 var16 = Class7468.method24184(var1, var2);
         if (var16 == null) {
            return;
         }

         boolean var17 = true;
         if (this.field32326.containsKey(var16.method24189()) && this.field32326.get(var16.method24189()).equals(var16)) {
            this.field32326.remove(var16.method24189());
            this.field32327.remove(var16.method24189());
            var17 = false;
            var15 = true;
         }

         if (var17) {
            this.field32326.put(var16.method24189(), var16);
            this.method24596(var16.method24186(), var1, var16.method24189(), var5, var7, 180.0, var16.method24187());
            var15 = true;
         }

         if (var15) {
            this.method24605();
         }
      }
   }

   public void method24601(Class1665 var1, int var2, int var3) {
      Iterator var6 = this.field32326.values().iterator();

      while (var6.hasNext()) {
         Class7468 var7 = (Class7468)var6.next();
         if (var7.method24185().getX() == var2 && var7.method24185().getZ() == var3) {
            Class7468 var8 = Class7468.method24184(var1, var7.method24185());
            if (!var7.equals(var8)) {
               var6.remove();
               this.field32327.remove(var7.method24189());
            }
         }
      }
   }

   public void method24602(BlockPos var1, int var2) {
      this.field32327.remove("frame-" + var2);
      this.field32328.remove(Class6674.method20355(var1));
   }
}
