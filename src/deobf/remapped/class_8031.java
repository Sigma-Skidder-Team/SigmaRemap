package remapped;

import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class class_8031 extends class_5467 implements class_9897 {
   private static final class_7821<Byte> field_41107 = class_8073.<Byte>method_36641(class_8031.class, class_2734.field_13361);
   private static final Map<class_9077, class_8525> field_41110 = Util.<Map<class_9077, class_8525>>method_44659(
      Maps.newEnumMap(class_9077.class), var0 -> {
         var0.put(class_9077.field_46493, class_4783.field_23300);
         var0.put(class_9077.field_46486, class_4783.field_23619);
         var0.put(class_9077.field_46480, class_4783.field_23905);
         var0.put(class_9077.field_46491, class_4783.field_23294);
         var0.put(class_9077.field_46477, class_4783.field_23640);
         var0.put(class_9077.field_46489, class_4783.field_23609);
         var0.put(class_9077.field_46495, class_4783.field_23850);
         var0.put(class_9077.field_46498, class_4783.field_23898);
         var0.put(class_9077.field_46503, class_4783.field_23450);
         var0.put(class_9077.field_46501, class_4783.field_23289);
         var0.put(class_9077.field_46499, class_4783.field_23595);
         var0.put(class_9077.field_46487, class_4783.field_23624);
         var0.put(class_9077.field_46479, class_4783.field_23308);
         var0.put(class_9077.field_46497, class_4783.field_23825);
         var0.put(class_9077.field_46494, class_4783.field_23713);
         var0.put(class_9077.field_46496, class_4783.field_23428);
      }
   );
   private static final Map<class_9077, float[]> field_41109 = Maps.newEnumMap(
      Arrays.<class_9077>stream(class_9077.values()).collect(Collectors.toMap(var0 -> (class_9077)var0, class_8031::method_36468))
   );
   private int field_41106;
   private class_5296 field_41105;

   private static float[] method_36468(class_9077 var0) {
      if (var0 != class_9077.field_46493) {
         float[] var3 = var0.method_41792();
         float var4 = 0.75F;
         return new float[]{var3[0] * 0.75F, var3[1] * 0.75F, var3[2] * 0.75F};
      } else {
         return new float[]{0.9019608F, 0.9019608F, 0.9019608F};
      }
   }

   public static float[] method_36477(class_9077 var0) {
      return field_41109.get(var0);
   }

   public class_8031(class_6629<? extends class_8031> var1, World var2) {
      super(var1, var2);
   }

   @Override
   public void method_26851() {
      this.field_41105 = new class_5296(this);
      this.field_29916.method_3485(0, new class_787(this));
      this.field_29916.method_3485(1, new class_518(this, 1.25));
      this.field_29916.method_3485(2, new class_9513(this, 1.0));
      this.field_29916.method_3485(3, new class_7228(this, 1.1, class_8137.method_37019(class_4897.field_24813), false));
      this.field_29916.method_3485(4, new class_8676(this, 1.1));
      this.field_29916.method_3485(5, this.field_41105);
      this.field_29916.method_3485(6, new class_2889(this, 1.0));
      this.field_29916.method_3485(7, new class_4407(this, class_704.class, 6.0F));
      this.field_29916.method_3485(8, new class_9691(this));
   }

   @Override
   public void method_26919() {
      this.field_41106 = this.field_41105.method_24145();
      super.method_26919();
   }

   @Override
   public void method_26606() {
      if (this.field_41768.field_33055) {
         this.field_41106 = Math.max(0, this.field_41106 - 1);
      }

      super.method_26606();
   }

   public static class_1313 method_36475() {
      return class_5886.method_26846().method_5984(class_7331.field_37468, 8.0).method_5984(class_7331.field_37465, 0.23F);
   }

   @Override
   public void method_37329() {
      super.method_37329();
      this.field_41735.method_36634(field_41107, (byte)0);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public Identifier method_26934() {
      if (this.method_36478()) {
         return this.method_37387().method_30480();
      } else {
         switch (this.method_36474()) {
            case field_46493:
            default:
               return class_5931.field_30124;
            case field_46486:
               return class_5931.field_30152;
            case field_46480:
               return class_5931.field_30139;
            case field_46491:
               return class_5931.field_30126;
            case field_46477:
               return class_5931.field_30125;
            case field_46489:
               return class_5931.field_30115;
            case field_46495:
               return class_5931.field_30093;
            case field_46498:
               return class_5931.field_30104;
            case field_46503:
               return class_5931.field_30154;
            case field_46501:
               return class_5931.field_30103;
            case field_46499:
               return class_5931.field_30084;
            case field_46487:
               return class_5931.field_30081;
            case field_46479:
               return class_5931.field_30089;
            case field_46497:
               return class_5931.field_30142;
            case field_46494:
               return class_5931.field_30132;
            case field_46496:
               return class_5931.field_30091;
         }
      }
   }

   @Override
   public void method_37336(byte var1) {
      if (var1 != 10) {
         super.method_37336(var1);
      } else {
         this.field_41106 = 40;
      }
   }

   public float method_36472(float var1) {
      if (this.field_41106 > 0) {
         if (this.field_41106 >= 4 && this.field_41106 <= 36) {
            return 1.0F;
         } else {
            return this.field_41106 >= 4 ? -((float)(this.field_41106 - 40) - var1) / 4.0F : ((float)this.field_41106 - var1) / 4.0F;
         }
      } else {
         return 0.0F;
      }
   }

   public float method_36479(float var1) {
      if (this.field_41106 > 4 && this.field_41106 <= 36) {
         float var4 = ((float)(this.field_41106 - 4) - var1) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * class_9299.method_42818(var4 * 28.7F);
      } else {
         return this.field_41106 <= 0 ? this.field_41755 * (float) (Math.PI / 180.0) : (float) (Math.PI / 5);
      }
   }

   @Override
   public class_6910 method_26857(class_704 var1, class_2584 var2) {
      ItemStack var5 = var1.method_26617(var2);
      if (var5.method_27960() != class_4897.field_24853) {
         return super.method_26857(var1, var2);
      } else if (!this.field_41768.field_33055 && this.method_45584()) {
         this.method_45583(class_562.field_3335);
         var5.method_28003(1, var1, var1x -> var1x.method_26447(var2));
         return class_6910.field_35520;
      } else {
         return class_6910.field_35518;
      }
   }

   @Override
   public void method_45583(class_562 var1) {
      this.field_41768.method_29540((class_704)null, this, class_463.field_2398, var1, 1.0F, 1.0F);
      this.method_36469(true);
      int var4 = 1 + this.field_41717.nextInt(3);

      for (int var5 = 0; var5 < var4; var5++) {
         class_91 var6 = this.method_37313(field_41110.get(this.method_36474()), 1);
         if (var6 != null) {
            var6.method_37215(
               var6.method_37098()
                  .method_6214(
                     (double)((this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.1F),
                     (double)(this.field_41717.nextFloat() * 0.05F),
                     (double)((this.field_41717.nextFloat() - this.field_41717.nextFloat()) * 0.1F)
                  )
            );
         }
      }
   }

   @Override
   public boolean method_45584() {
      return this.method_37330() && !this.method_36478() && !this.method_26449();
   }

   @Override
   public void method_37376(CompoundNBT var1) {
      super.method_37376(var1);
      var1.putBoolean("Sheared", this.method_36478());
      var1.method_25921("Color", (byte)this.method_36474().method_41794());
   }

   @Override
   public void method_37314(CompoundNBT var1) {
      super.method_37314(var1);
      this.method_36469(var1.getBoolean("Sheared"));
      this.method_36471(class_9077.method_41789(var1.method_25950("Color")));
   }

   @Override
   public class_8461 method_26918() {
      return class_463.field_2232;
   }

   @Override
   public class_8461 method_26541(class_6199 var1) {
      return class_463.field_2204;
   }

   @Override
   public class_8461 method_26599() {
      return class_463.field_2288;
   }

   @Override
   public void method_37207(class_1331 var1, class_2522 var2) {
      this.method_37155(class_463.field_2167, 0.15F, 1.0F);
   }

   public class_9077 method_36474() {
      return class_9077.method_41789(this.field_41735.<Byte>method_36640(field_41107) & 15);
   }

   public void method_36471(class_9077 var1) {
      byte var4 = this.field_41735.<Byte>method_36640(field_41107);
      this.field_41735.method_36633(field_41107, (byte)(var4 & 240 | var1.method_41794() & 15));
   }

   public boolean method_36478() {
      return (this.field_41735.<Byte>method_36640(field_41107) & 16) != 0;
   }

   public void method_36469(boolean var1) {
      byte var4 = this.field_41735.<Byte>method_36640(field_41107);
      if (!var1) {
         this.field_41735.method_36633(field_41107, (byte)(var4 & -17));
      } else {
         this.field_41735.method_36633(field_41107, (byte)(var4 | 16));
      }
   }

   public static class_9077 method_36470(Random var0) {
      int var3 = var0.nextInt(100);
      if (var3 >= 5) {
         if (var3 >= 10) {
            if (var3 >= 15) {
               if (var3 >= 18) {
                  return var0.nextInt(500) != 0 ? class_9077.field_46493 : class_9077.field_46495;
               } else {
                  return class_9077.field_46479;
               }
            } else {
               return class_9077.field_46503;
            }
         } else {
            return class_9077.field_46498;
         }
      } else {
         return class_9077.field_46496;
      }
   }

   public class_8031 method_36480(class_6331 var1, class_1899 var2) {
      class_8031 var5 = (class_8031)var2;
      class_8031 var6 = class_6629.field_34321.method_30484(var1);
      var6.method_36471(this.method_36473(this, var5));
      return var6;
   }

   @Override
   public void method_26897() {
      this.method_36469(false);
      if (this.method_26449()) {
         this.method_8632(60);
      }
   }

   @Nullable
   @Override
   public class_8733 method_26864(class_1556 var1, class_9589 var2, class_2417 var3, class_8733 var4, CompoundNBT var5) {
      this.method_36471(method_36470(var1.method_43360()));
      return super.method_26864(var1, var2, var3, var4, var5);
   }

   private class_9077 method_36473(class_5467 var1, class_5467 var2) {
      class_9077 var5 = ((class_8031)var1).method_36474();
      class_9077 var6 = ((class_8031)var2).method_36474();
      class_6946 var7 = method_36476(var5, var6);
      return this.field_41768
         .method_29549()
         .<class_6946, class_1504>method_23138(class_1510.field_7997, var7, this.field_41768)
         .<ItemStack>map(var1x -> var1x.method_41042(var7))
         .<class_2451>map(ItemStack::method_27960)
         .filter(class_239.class::isInstance)
         .<class_239>map(class_239.class::cast)
         .<class_9077>map(class_239::method_1015)
         .orElseGet(() -> !this.field_41768.field_33033.nextBoolean() ? var6 : var5);
   }

   private static class_6946 method_36476(class_9077 var0, class_9077 var1) {
      class_6946 var4 = new class_6946(new class_3783((class_4165)null, -1), 2, 1);
      var4.method_31503(0, new ItemStack(class_239.method_1016(var0)));
      var4.method_31503(1, new ItemStack(class_239.method_1016(var1)));
      return var4;
   }

   @Override
   public float method_26425(class_7653 var1, class_6097 var2) {
      return 0.95F * var2.field_31200;
   }
}
