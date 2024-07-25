package remapped;

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

public class class_2134 extends class_7186 {
   private static final Logger field_10679 = LogManager.getLogger();
   public int field_10689;
   public int field_10677;
   public class_5621<World> field_10685;
   public boolean field_10681;
   public boolean field_10688;
   public byte field_10678;
   public byte[] field_10691 = new byte[16384];
   public boolean field_10686;
   public final List<class_4986> field_10684 = Lists.newArrayList();
   private final Map<PlayerEntity, class_4986> field_10690 = Maps.newHashMap();
   private final Map<String, class_2001> field_10682 = Maps.newHashMap();
   public final Map<String, class_3245> field_10683 = Maps.newLinkedHashMap();
   private final Map<String, class_869> field_10687 = Maps.newHashMap();

   public class_2134(String var1) {
      super(var1);
   }

   public void method_9965(int var1, int var2, int var3, boolean var4, boolean var5, class_5621<World> var6) {
      this.field_10678 = (byte)var3;
      this.method_9967((double)var1, (double)var2, this.field_10678);
      this.field_10685 = var6;
      this.field_10681 = var4;
      this.field_10688 = var5;
      this.method_32923();
   }

   public void method_9967(double var1, double var3, int var5) {
      int var8 = 128 * (1 << var5);
      int var9 = MathHelper.floor((var1 + 64.0) / (double)var8);
      int var10 = MathHelper.floor((var3 + 64.0) / (double)var8);
      this.field_10689 = var9 * var8 + var8 / 2 - 64;
      this.field_10677 = var10 * var8 + var8 / 2 - 64;
   }

   @Override
   public void method_32924(CompoundNBT var1) {
      this.field_10685 = (class_5621<World>)class_8760.method_40243(new Dynamic(class_3504.field_17178, var1.method_25929("dimension")))
         .resultOrPartial(field_10679::error)
         .orElseThrow(() -> new IllegalArgumentException("Invalid map dimension: " + var1.method_25929("dimension")));
      this.field_10689 = var1.method_25947("xCenter");
      this.field_10677 = var1.method_25947("zCenter");
      this.field_10678 = (byte) MathHelper.clamp(var1.method_25950("scale"), 0, 4);
      this.field_10681 = !var1.contains("trackingPosition", 1) || var1.getBoolean("trackingPosition");
      this.field_10688 = var1.getBoolean("unlimitedTracking");
      this.field_10686 = var1.getBoolean("locked");
      this.field_10691 = var1.method_25930("colors");
      if (this.field_10691.length != 16384) {
         this.field_10691 = new byte[16384];
      }

      class_3416 var4 = var1.method_25927("banners", 10);

      for (int var5 = 0; var5 < var4.size(); var5++) {
         class_2001 var6 = class_2001.method_9288(var4.method_15764(var5));
         this.field_10682.put(var6.method_9294(), var6);
         this.method_9972(
            var6.method_9292(),
            (class_9379)null,
            var6.method_9294(),
            (double)var6.method_9287().getX(),
            (double)var6.method_9287().getZ(),
            180.0,
            var6.method_9291()
         );
      }

      class_3416 var8 = var1.method_25927("frames", 10);

      for (int var9 = 0; var9 < var8.size(); var9++) {
         class_869 var7 = class_869.method_3760(var8.method_15764(var9));
         this.field_10687.put(var7.method_3759(), var7);
         this.method_9972(
            class_8086.field_41416,
            (class_9379)null,
            "frame-" + var7.method_3764(),
            (double)var7.method_3765().getX(),
            (double)var7.method_3765().getZ(),
            (double)var7.method_3763(),
            (ITextComponent)null
         );
      }
   }

   @Override
   public CompoundNBT method_32920(CompoundNBT var1) {
      Identifier.field_22655
         .encodeStart(class_3504.field_17178, this.field_10685.method_25499())
         .resultOrPartial(field_10679::error)
         .ifPresent(var1x -> var1.put("dimension", var1x));
      var1.putInt("xCenter", this.field_10689);
      var1.putInt("zCenter", this.field_10677);
      var1.method_25921("scale", this.field_10678);
      var1.method_25953("colors", this.field_10691);
      var1.putBoolean("trackingPosition", this.field_10681);
      var1.putBoolean("unlimitedTracking", this.field_10688);
      var1.putBoolean("locked", this.field_10686);
      class_3416 var4 = new class_3416();

      for (class_2001 var6 : this.field_10682.values()) {
         var4.add(var6.method_9290());
      }

      var1.put("banners", var4);
      class_3416 var8 = new class_3416();

      for (class_869 var7 : this.field_10687.values()) {
         var8.add(var7.method_3761());
      }

      var1.put("frames", var8);
      return var1;
   }

   public void method_9974(class_2134 var1) {
      this.field_10686 = true;
      this.field_10689 = var1.field_10689;
      this.field_10677 = var1.field_10677;
      this.field_10682.putAll(var1.field_10682);
      this.field_10683.putAll(var1.field_10683);
      System.arraycopy(var1.field_10691, 0, this.field_10691, 0, var1.field_10691.length);
      this.method_32923();
   }

   public void method_9970(PlayerEntity var1, ItemStack var2) {
      if (!this.field_10690.containsKey(var1)) {
         class_4986 var5 = new class_4986(this, var1);
         this.field_10690.put(var1, var5);
         this.field_10684.add(var5);
      }

      if (!var1.inventory.method_32405(var2)) {
         this.field_10683.remove(var1.method_45509().getString());
      }

      for (int var9 = 0; var9 < this.field_10684.size(); var9++) {
         class_4986 var6 = this.field_10684.get(var9);
         String var7 = var6.field_25824.method_45509().getString();
         if (!var6.field_25824.field_41751 && (var6.field_25824.inventory.method_32405(var2) || var2.method_27966())) {
            if (!var2.method_27966() && var6.field_25824.world.method_29545() == this.field_10685 && this.field_10681) {
               this.method_9972(
                  class_8086.field_41393,
                  var6.field_25824.world,
                  var7,
                  var6.field_25824.getPosX(),
                  var6.field_25824.getPosZ(),
                  (double)var6.field_25824.rotationYaw,
                  (ITextComponent)null
               );
            }
         } else {
            this.field_10690.remove(var6.field_25824);
            this.field_10684.remove(var6);
            this.field_10683.remove(var7);
         }
      }

      if (var2.method_27966() && this.field_10681) {
         class_7451 var10 = var2.method_27961();
         BlockPos var12 = var10.method_21469();
         class_869 var14 = this.field_10687.get(class_869.method_3762(var12));
         if (var14 != null && var10.method_37145() != var14.method_3764() && this.field_10687.containsKey(var14.method_3759())) {
            this.field_10683.remove("frame-" + var14.method_3764());
         }

         class_869 var8 = new class_869(var12, var10.method_37365().method_1031() * 90, var10.method_37145());
         this.method_9972(
            class_8086.field_41416,
            var1.world,
            "frame-" + var10.method_37145(),
            (double)var12.getX(),
            (double)var12.getZ(),
            (double)(var10.method_37365().method_1031() * 90),
            (ITextComponent)null
         );
         this.field_10687.put(var8.method_3759(), var8);
      }

      CompoundNBT var11 = var2.method_27990();
      if (var11 != null && var11.contains("Decorations", 9)) {
         class_3416 var13 = var11.method_25927("Decorations", 10);

         for (int var15 = 0; var15 < var13.size(); var15++) {
            CompoundNBT var16 = var13.method_15764(var15);
            if (!this.field_10683.containsKey(var16.method_25965("id"))) {
               this.method_9972(
                  class_8086.method_36718(var16.method_25950("type")),
                  var1.world,
                  var16.method_25965("id"),
                  var16.method_25932("x"),
                  var16.method_25932("z"),
                  var16.method_25932("rot"),
                  (ITextComponent)null
               );
            }
         }
      }
   }

   public static void method_9969(ItemStack var0, BlockPos var1, String var2, class_8086 var3) {
      class_3416 var6;
      if (var0.method_28002() && var0.method_27990().contains("Decorations", 9)) {
         var6 = var0.method_27990().method_25927("Decorations", 10);
      } else {
         var6 = new class_3416();
         var0.method_27954("Decorations", var6);
      }

      CompoundNBT var7 = new CompoundNBT();
      var7.method_25921("type", var3.method_36723());
      var7.method_25941("id", var2);
      var7.method_25923("x", (double)var1.getX());
      var7.method_25923("z", (double)var1.getZ());
      var7.method_25923("rot", 180.0);
      var6.add(var7);
      if (var3.method_36722()) {
         CompoundNBT var8 = var0.method_27978("display");
         var8.putInt("MapColor", var3.method_36720());
      }
   }

   private void method_9972(class_8086 var1, class_9379 var2, String var3, double var4, double var6, double var8, ITextComponent var10) {
      int var13 = 1 << this.field_10678;
      float var14 = (float)(var4 - (double)this.field_10689) / (float)var13;
      float var15 = (float)(var6 - (double)this.field_10677) / (float)var13;
      byte var16 = (byte)((int)((double)(var14 * 2.0F) + 0.5));
      byte var17 = (byte)((int)((double)(var15 * 2.0F) + 0.5));
      byte var18 = 63;
      byte var20;
      if (var14 >= -63.0F && var15 >= -63.0F && var14 <= 63.0F && var15 <= 63.0F) {
         var8 += !(var8 < 0.0) ? 8.0 : -8.0;
         var20 = (byte)((int)(var8 * 16.0 / 360.0));
         if (this.field_10685 == World.field_33029 && var2 != null) {
            int var22 = (int)(var2.method_43366().method_8666() / 10L);
            var20 = (byte)(var22 * var22 * 34187121 + var22 * 121 >> 15 & 15);
         }
      } else {
         if (var1 != class_8086.field_41393) {
            this.field_10683.remove(var3);
            return;
         }

         short var19 = 320;
         if (Math.abs(var14) < 320.0F && Math.abs(var15) < 320.0F) {
            var1 = class_8086.field_41412;
         } else {
            if (!this.field_10688) {
               this.field_10683.remove(var3);
               return;
            }

            var1 = class_8086.field_41397;
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

      this.field_10683.put(var3, new class_3245(var1, var16, var17, var20, var10));
   }

   @Nullable
   public Packet<?> method_9973(ItemStack var1, class_6163 var2, PlayerEntity var3) {
      class_4986 var6 = this.field_10690.get(var3);
      return var6 != null ? var6.method_22949(var1) : null;
   }

   public void method_9966(int var1, int var2) {
      this.method_32923();

      for (class_4986 var6 : this.field_10684) {
         var6.method_22948(var1, var2);
      }
   }

   public class_4986 method_9968(PlayerEntity var1) {
      class_4986 var4 = this.field_10690.get(var1);
      if (var4 == null) {
         var4 = new class_4986(this, var1);
         this.field_10690.put(var1, var4);
         this.field_10684.add(var4);
      }

      return var4;
   }

   public void method_9971(class_9379 var1, BlockPos var2) {
      double var5 = (double)var2.getX() + 0.5;
      double var7 = (double)var2.getZ() + 0.5;
      int var9 = 1 << this.field_10678;
      double var10 = (var5 - (double)this.field_10689) / (double)var9;
      double var12 = (var7 - (double)this.field_10677) / (double)var9;
      byte var14 = 63;
      boolean var15 = false;
      if (var10 >= -63.0 && var12 >= -63.0 && var10 <= 63.0 && var12 <= 63.0) {
         class_2001 var16 = class_2001.method_9293(var1, var2);
         if (var16 == null) {
            return;
         }

         boolean var17 = true;
         if (this.field_10682.containsKey(var16.method_9294()) && this.field_10682.get(var16.method_9294()).equals(var16)) {
            this.field_10682.remove(var16.method_9294());
            this.field_10683.remove(var16.method_9294());
            var17 = false;
            var15 = true;
         }

         if (var17) {
            this.field_10682.put(var16.method_9294(), var16);
            this.method_9972(var16.method_9292(), var1, var16.method_9294(), var5, var7, 180.0, var16.method_9291());
            var15 = true;
         }

         if (var15) {
            this.method_32923();
         }
      }
   }

   public void method_9975(class_6163 var1, int var2, int var3) {
      Iterator var6 = this.field_10682.values().iterator();

      while (var6.hasNext()) {
         class_2001 var7 = (class_2001)var6.next();
         if (var7.method_9287().getX() == var2 && var7.method_9287().getZ() == var3) {
            class_2001 var8 = class_2001.method_9293(var1, var7.method_9287());
            if (!var7.equals(var8)) {
               var6.remove();
               this.field_10683.remove(var7.method_9294());
            }
         }
      }
   }

   public void method_9964(BlockPos var1, int var2) {
      this.field_10683.remove("frame-" + var2);
      this.field_10687.remove(class_869.method_3762(var1));
   }
}
