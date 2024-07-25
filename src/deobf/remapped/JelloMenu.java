package remapped;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JelloMenu extends class_2596 {
   public class_3240 field_4006;
   private static MinecraftClient field_4009 = MinecraftClient.getInstance();
   private static class_2440 field_4000;
   private static boolean field_4008;
   private static boolean field_4001;
   private Map<Category, class_3407> field_4003 = new HashMap<Category, class_3407>();
   public MusicPlayer field_4007;
   public class_5572 field_4010;
   public class_2099 field_4002;
   public class_9107 field_3999;
   public class_9618 field_4004;
   private static boolean field_4005 = true;
   public class_3407 field_4011 = null;

   public JelloMenu() {
      super("JelloScreen");
      field_4001 = field_4001 | !field_4008;
      int var3 = 30;
      int var4 = 30;
      this.method_32148(this.field_4010 = new class_5572(this, "brainFreeze"));
      JelloMenu var5 = this;

      for (Module var7 : SigmaMainClass.getInstance().getModuleManager().getModuleMap().values()) {
         if (!this.field_4003.containsKey(var7.method_42004())) {
            class_3407 var8 = new class_3407(this, var7.method_42004().getCategoryName(), var3, var4, var7.method_42004());
            this.field_4003.put(var7.method_42004(), var8);
            this.method_32148(var8);
            var3 += var8.method_32109() + 10;
            if (this.field_4003.size() == 4) {
               var3 = 30;
               var4 += var8.method_32137() - 20;
            }

            var8.method_15730(var2 -> var5.method_32102(() -> {
                  var5.method_32148(this.field_3999 = new class_9107(var5, "settings", 0, 0, this.field_36278, this.field_36257, var2));
                  this.field_3999.method_32187(true);
               }));
         }
      }

      this.method_32148(this.field_4007 = new MusicPlayer(this, "musicPlayer"));
      this.field_4007.method_1533(true);
      class_122 var9;
      this.method_32148(var9 = new class_122(this, "more", this.method_32109() - 69, this.method_32137() - 55, 55, 41, NotificationIcons.field_11042));
      var9.method_32139().method_2772(class_314.method_1444(class_1255.field_6918.field_6917, 0.3F));
      var9.method_32105(false);
      this.field_4007.method_32104(field_4005);
      var9.method_32100((var1, var2) -> this.method_32102(() -> {
            if (this.field_4002 != null && this.method_32116(this.field_4002)) {
               this.method_32101(this.field_4002);
            } else {
               this.method_32148(this.field_4002 = new class_2099(this, "morepopover", this.method_32109() - 14, this.method_32137() - 14));
               this.field_4002.method_32187(true);
            }
         }));
      field_4000 = new class_2440(450, 125);
      this.field_4006 = new class_3240(this, this, "overlay");
      class_314.method_1403();
      class_314.method_1399(field_4000.method_11123());
   }

   public boolean method_3358() {
      if (SigmaMainClass.getInstance().method_3300().method_9492() && SigmaMainClass.getInstance().method_3300().method_9499()) {
         return false;
      } else if (this.field_4004 == null) {
         this.method_32102(() -> {
            ArrayList var3 = new ArrayList();
            var3.add(new class_8888(class_2880.field_14100, "Music", 40));
            var3.add(new class_8888(class_2880.field_14098, "Jello Music requires:", 20));
            if (!SigmaMainClass.getInstance().method_3300().method_9492()) {
               var3.add(new class_8888(class_2880.field_14098, "- Python 2.7.17", 30));
            }

            if (!SigmaMainClass.getInstance().method_3300().method_9499()) {
               var3.add(new class_8888(class_2880.field_14098, "- Visual C++ 2010 x86", 30));
            }

            var3.add(new class_8888(class_2880.field_14103, "Download", 55));
            this.method_32150(this.field_4004 = new class_9618(this, "music", true, "Dependencies.", var3.<class_8888>toArray(new class_8888[0])));
            this.field_4004.method_8236(var0 -> {
               if (!SigmaMainClass.getInstance().method_3300().method_9492()) {
                  Util.getOperatingSystem().method_37581("https://www.python.org/ftp/python/2.7.17/python-2.7.17-macosx10.9.pkg");
               }

               if (!SigmaMainClass.getInstance().method_3300().method_9499()) {
                  Util.getOperatingSystem().method_37581("https://www.microsoft.com/en-US/download/details.aspx?id=5555");
               }
            });
            this.field_4004.method_44409(var1 -> new Thread(() -> {
                  try {
                     Thread.sleep(114L);
                     this.method_32102(() -> {
                        this.method_32179(this.field_4004);
                        this.field_4004 = null;
                     });
                  } catch (InterruptedException var4) {
                     var4.printStackTrace();
                  }
               }).start());
            this.field_4004.method_44406(true);
         });
         return true;
      } else {
         return true;
      }
   }

   public void method_3356() {
      for (class_3407 var4 : this.field_4003.values()) {
         var4.method_15727();
      }
   }

   @Override
   public void method_32145(int var1, int var2) {
      this.field_4007.method_32104(this.field_4007.method_32109() < this.method_32109() && this.field_4007.method_32137() < this.method_32137());
      super.method_32145(var1, var2);
      class_314.method_1399(Math.min(1.0F, field_4000.method_11123() * 4.0F));
      this.field_4010.method_32104(SigmaMainClass.getInstance().getModuleManager().getModuleByClass(BrainFreezeModule.class).method_42015());
      if (this.field_4002 != null) {
         int var5 = var1 - this.field_4002.method_32155();
         int var6 = var2 - this.field_4002.method_32093();
         boolean var7 = var5 >= -10 && var6 >= -10;
         if (!var7) {
            this.field_4002.method_9844();
         }
      }

      if (this.field_4002 != null && this.field_4002.method_9850()) {
         this.method_32179(this.field_4002);
         this.field_4002 = null;
      }

      if (field_4000.method_11128() == class_4043.field_19618 && this.field_3999 != null && !this.field_3999.field_46621) {
         this.field_3999.field_46621 = true;
      }

      if (this.field_3999 != null && this.field_3999.field_46621 && this.field_3999.field_46631.method_11123() == 0.0F) {
         this.method_32102(() -> {
            this.method_32179(this.field_3999);
            this.field_3999 = null;
         });
      }

      if (field_4001) {
         float var8 = (float)(0.03F * (60.0 / (double)this.method_11773()));
         class_4043 var9 = field_4000.method_11128();
         field_4000.method_11119(!field_4008 ? class_4043.field_19620 : class_4043.field_19618);
         if (field_4000.method_11123() <= 0.0F && field_4008) {
            field_4008 = false;
            this.method_3359(field_4008);
         } else if (field_4000.method_11123() >= 1.0F && field_4000.method_11128() == var9) {
            field_4008 = true;
            this.method_3359(field_4008);
         }
      }

      if (field_4001 && field_4008) {
         class_314.method_1430();
      }
   }

   @Override
   public int method_11773() {
      return MinecraftClient.method_8501();
   }

   @Override
   public JSONObjectImpl method_32180(JSONObjectImpl var1) {
      class_314.method_1430();
      this.method_32101(this.field_4006);
      return super.method_32180(var1);
   }

   @Override
   public void method_32159(JSONObjectImpl var1) {
      super.method_32159(var1);
   }

   private void method_3359(boolean var1) {
      field_4001 = false;
      if (!var1) {
         field_4009.method_8609(null);
      }
   }

   @Override
   public boolean method_29508(int var1, int var2, int var3) {
      if (var3 <= 1) {
         return super.method_29508(var1, var2, var3);
      } else {
         this.method_29509(var3);
         return false;
      }
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      int var4 = SigmaMainClass.getInstance().getModuleManager().getJelloTouch().method_380(ClassicClickGUI.class);
      if (var1 == 256 || var1 == var4 && this.field_3999 == null && !this.method_32121()) {
         if (field_4001) {
            field_4008 = !field_4008;
         }

         field_4001 = true;
      }
   }

   public float method_3357(float var1, float var2) {
      return field_4000.method_11128() != class_4043.field_19618
         ? (float)(Math.pow(2.0, (double)(-10.0F * var1)) * Math.sin((double)(var1 - var2 / 4.0F) * (Math.PI * 2) / (double)var2) + 1.0)
         : class_9681.method_44756(var1, 0.0F, 1.0F, 1.0F);
   }

   @Override
   public void method_32178(float var1) {
      float var4 = field_4001 && !field_4008
         ? this.method_3357(field_4000.method_11123(), 0.8F) * 0.5F + 0.5F
         : (!field_4001 ? 1.0F : this.method_3357(field_4000.method_11123(), 1.0F));
      float var5 = 0.2F * var1 * var4;
      class_73.method_94(
         (float)this.field_36270,
         (float)this.field_36261,
         (float)(this.field_36270 + this.field_36278),
         (float)(this.field_36261 + this.field_36257),
         class_314.method_1444(class_1255.field_6929.field_6917, var5)
      );
      Object var6 = null;
      float var7 = 1.0F;
      if (this.field_3999 != null) {
         float var8 = class_9556.method_44073(this.field_3999.field_46632.method_11123(), 0.0F, 1.0F, 1.0F);
         if (this.field_3999.field_46632.method_11128() == class_4043.field_19618) {
            var8 = class_3483.method_15984(this.field_3999.field_46632.method_11123(), 0.0F, 1.0F, 1.0F);
         }

         var7 -= this.field_3999.field_46632.method_11123() * 0.1F;
         var4 *= 1.0F + var8 * 0.2F;
      }

      if (SigmaMainClass.getInstance().getModuleManager().getConfigManager().method_4301() != null) {
         String var12 = SigmaMainClass.getInstance().getModuleManager().getConfigManager().method_4301().field_8677;
         class_73.method_87(
            class_5320.field_27152,
            (float)(this.field_36278 - class_5320.field_27152.method_18547(var12) - 80),
            (float)(this.field_36257 - 47),
            var12,
            class_314.method_1444(class_1255.field_6918.field_6917, 0.5F * Math.max(0.0F, Math.min(1.0F, var4)))
         );
      }

      for (class_7038 var9 : this.method_32134()) {
         float var10 = (float)(var9.method_32173() + var9.method_32137() / 2 - field_4009.window.method_43163() / 2) * (1.0F - var4) * 0.5F;
         float var11 = (float)(var9.method_32132() + var9.method_32109() / 2 - field_4009.window.method_43166() / 2) * (1.0F - var4) * 0.5F;
         var9.method_32138((int)var11, (int)var10);
         var9.method_32111(1.5F - var4 * 0.5F, 1.5F - var4 * 0.5F);
      }

      super.method_32178(var1 * Math.min(1.0F, var4) * var7);
      if (this.field_4011 != null) {
         this.field_4011.method_32187(false);
      }

      this.field_4006.method_32187(false);
      this.method_32101(this.field_4006);
   }
}
