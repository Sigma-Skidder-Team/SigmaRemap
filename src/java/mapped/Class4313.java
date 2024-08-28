package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.account.Account;
import com.mentalfrostbyte.jello.account.AccountManager;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.Class4307;
import com.mentalfrostbyte.jello.unmapped.Class8603;
import com.mentalfrostbyte.jello.unmapped.ResourcesDecrypter;
import com.mentalfrostbyte.jello.util.ImageUtil;
import com.mentalfrostbyte.jello.util.TextureUtil;
import com.mentalfrostbyte.jello.util.animation.Animation;
import com.mentalfrostbyte.jello.util.animation.Direction;
import org.lwjgl.opengl.GL11;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Class4313 extends Class4307 {
   private int field21005;
   private float field21006;
   private float field21007 = 0.75F;
   private boolean field21008 = true;
   public Class4274 field21009;
   private Class4339 field21010;
   private Class4339 field21011;
   private Class4354 field21012;
   private Class4354 field21013;
   private float field21014 = 0.65F;
   private float field21015 = 1.0F - this.field21014;
   private int field21016 = 30;
   private Class4298 field21017;
   private Class4296 field21018;
   public AccountManager field21019 = Client.getInstance().getAccountManager();
   private Texture field21020;
   private float field21021;
   private Class4274 field21022;
   private Class2209 field21023 = Class2209.field14448;
   private String field21024 = "";
   private boolean field21025 = false;
   private Class4281 field21026;

   public Class4313() {
      super("Alt Manager");
      this.method13300(false);
      ArrayList var3 = new ArrayList();
      var3.add("Alphabetical");
      var3.add("Bans");
      var3.add("Date Added");
      var3.add("Last Used");
      var3.add("Use count");
      ArrayList<String> var4 = new ArrayList();
      Class7970 var5 = new Class7970(Minecraft.getInstance());
      var5.method27094();
      int var6 = var5.method27099();

      for (int var7 = 0; var7 < var6; var7++) {
         Class7730 var8 = var5.method27096(var7);
         if (!var4.contains(var8.field33189)) {
            var4.add(var8.field33189);
         }
      }

      this.method13362();
      this.method13363();
      this.method13230(
         this.field21010 = new Class4339(
            this,
            "alts",
            0,
            114,
            (int)((float) Minecraft.getInstance().mainWindow.method8043() * this.field21014) - 4,
            Minecraft.getInstance().mainWindow.method8044() - 119 - this.field21016
         )
      );
      this.method13230(
         this.field21011 = new Class4339(
            this,
            "altView",
            (int)((float) Minecraft.getInstance().mainWindow.method8043() * this.field21014),
            114,
            (int)((float) Minecraft.getInstance().mainWindow.method8043() * this.field21015) - this.field21016,
            Minecraft.getInstance().mainWindow.method8044() - 119 - this.field21016
         )
      );
      this.field21010.method13300(false);
      this.field21011.method13300(false);
      this.field21010.method13515(false);
      this.field21011
         .method13230(
            this.field21017 = new Class4298(
               this.field21011,
               "",
               (int)(
                        (float) Minecraft.getInstance().mainWindow.method8043() * this.field21015
                           - (float)((int)((float) Minecraft.getInstance().mainWindow.method8043() * this.field21015))
                     )
                     / 2
                  - 10,
               Minecraft.getInstance().mainWindow.method8044() / 12,
               (int)((float) Minecraft.getInstance().mainWindow.method8043() * this.field21015),
               350,
               "steve"
            )
         );
      this.field21011
         .method13230(
            this.field21018 = new Class4296(
               this.field21011,
               "info",
               (int)(
                        (float) Minecraft.getInstance().mainWindow.method8043() * this.field21015
                           - (float)((int)((float) Minecraft.getInstance().mainWindow.method8043() * this.field21015))
                     )
                     / 2
                  - 10,
               this.method13374(),
               (int)((float) Minecraft.getInstance().mainWindow.method8043() * this.field21015),
               500
            )
         );
      Class4363 var9 = new Class4363(this, "drop", (int)((float) Minecraft.getInstance().mainWindow.method8043() * this.field21014) - 220, 44, 200, 32, var3, 0);
      var9.method13643(var4, 1);
      var9.method13656(2);
      this.method13230(var9);
      var9.method13036(var2 -> {
         switch (var9.method13655()) {
            case 0:
               this.field21023 = Class2209.field14446;
               break;
            case 1:
               this.field21023 = Class2209.field14447;
               this.field21024 = var9.method13645(1).method13636().get(var9.method13645(1).method13640());
               break;
            case 2:
               this.field21023 = Class2209.field14448;
               break;
            case 3:
               this.field21023 = Class2209.field14449;
               break;
            case 4:
               this.field21023 = Class2209.field14450;
         }

         this.method13372(false);
      });
      this.method13230(
         this.field21026 = new Class4281(
            this,
            "textbox",
            (int)((float) Minecraft.getInstance().mainWindow.method8043() * this.field21014),
            44,
            150,
            32,
            Class4281.field20741,
            "",
            "Search...",
            ResourceRegistry.JelloLightFont18
         )
      );
      this.field21026.method13306(ResourceRegistry.JelloLightFont18);
      this.field21026.method13151(var1 -> this.method13372(false));
      this.method13230(this.field21022 = new Class4274(this, "btnt", this.method13267() - 90, 43, 70, 30, Class6387.field27961, "Add +", ResourceRegistry.JelloLightFont25));
      this.field21010.method13242();
      this.field21022.method13251((var1, var2) -> {
         if (this.method13369()) {
            this.field21012.method13603(!this.field21012.method13295());
         }
      });
   }

   private void method13360(Account var1, boolean var2) {
      Class4294 var5;
      this.field21010
         .method13230(
            var5 = new Class4294(
               this.field21010,
               var1.method34216(),
               this.field21016,
               (100 + this.field21016 / 2) * this.method13370(),
               this.field21010.method13267() - this.field21016 * 2 + 4,
               100,
               var1
            )
         );
      if (!var2) {
         var5.field20805 = new Animation(0, 0);
      }

      if (this.field21019.method36779(var1)) {
         var5.method13172(true);
      }

      var5.method13247((var2x, var3) -> {
         if (var3 != 0) {
            this.field21013.method13036(var2xx -> {
               this.field21019.method36774(var5.field20798);
               this.field21018.method13178(null);
               this.field21017.method13181(null);
               this.method13372(false);
            });
            this.field21013.method13145(true);
            this.field21013.method13603(true);
         } else {
            if (this.field21017.field20826 == var5.field20798 && var5.method13168()) {
               this.method13361(var5);
            } else {
               this.field21011.method13512(0);
            }

            this.field21017.method13181(var5.field20798);
            this.field21018.method13178(var5.field20798);

            for (Class4305 var7 : this.field21010.method13241()) {
               if (!(var7 instanceof Class4292)) {
                  for (Class4305 var9 : var7.method13241()) {
                     ((Class4294)var9).method13166(false);
                  }
               }
            }

            var5.method13166(true);
         }
      });
      if (Client.getInstance().getAccountManager().method36779(var1)) {
         this.field21017.method13181(var5.field20798);
         this.field21018.method13178(var5.field20798);
         var5.method13167(true, true);
      }
   }

   private void method13361(Class4294 var1) {
      var1.method13174(true);
      new Thread(() -> {
         if (!this.field21019.method36772(var1.field20798)) {
            var1.method13173(114);
            Client.getInstance().getSoundManager().play("error");
         } else {
            this.method13368();
            var1.method13172(true);
            Client.getInstance().getSoundManager().play("connect");
            this.method13372(false);
         }

         var1.method13174(false);
      }).start();
   }

   private void method13362() {
      Class9577 var3 = new Class9577(Class2189.field14314, "Add Alt", 50);
      Class9577 var4 = new Class9577(Class2189.field14311, "Login with your minecraft", 15);
      Class9577 var5 = new Class9577(Class2189.field14311, "account here!", 25);
      Class9577 var6 = new Class9577(Class2189.field14312, "Email", 50);
      Class9577 var7 = new Class9577(Class2189.field14312, "Password", 50);
      Class9577 var8 = new Class9577(Class2189.field14315, "", 15);
      Class9577 var9 = new Class9577(Class2189.field14313, "Add alt", 50);
      this.method13230(this.field21012 = new Class4354(this, "Testt", true, "Add Alt", var3, var4, var5, var6, var7, var8, var9));
      this.field21012.method13036(var1 -> {
         if (!this.field21012.method13600().get("Email").contains(":")) {
            Account var11 = new Account(this.field21012.method13600().get("Email"), this.field21012.method13600().get("Password"));
            if (!this.field21019.method36770(var11)) {
               this.field21019.method36768(var11);
            }

            this.method13372(false);
         } else {
            String[] var4x = this.field21012.method13600().get("Email").replace("\r", "\n").replace("\n\n", "\n").split("\n");

            for (String var8x : var4x) {
               String[] var9x = var8x.split(":");
               if (var9x.length == 2) {
                  Account var10 = new Account(var9x[0], var9x[1]);
                  if (!this.field21019.method36770(var10)) {
                     this.field21019.method36768(var10);
                  }
               }
            }

            this.method13372(false);
         }
      });
   }

   private void method13363() {
      Class9577 var3 = new Class9577(Class2189.field14314, "Delete?", 50);
      Class9577 var4 = new Class9577(Class2189.field14311, "Are you sure you want", 15);
      Class9577 var5 = new Class9577(Class2189.field14311, "to delete this alt?", 40);
      Class9577 var6 = new Class9577(Class2189.field14313, "Delete", 50);
      this.method13230(this.field21013 = new Class4354(this, "delete", true, "Delete", var3, var4, var5, var6));
   }

   @Override
   public void method13027(float var1) {
      this.method13371();
      Class3192.method11465(
         (int)((float) Minecraft.getInstance().mainWindow.method8043() * this.field21014),
         114,
         (int)((float) Minecraft.getInstance().mainWindow.method8043() * this.field21015) - this.field21016,
         Minecraft.getInstance().mainWindow.method8044() - 119 - this.field21016,
         Class1979.field12896.field12910
      );
      this.method13365();
      this.method13367();
      this.method13366();
      super.method13027(var1);
   }

   private void method13364() {
      if (this.field21021 != (float)this.field21010.method13513()) {
         try {
            this.field21020 = TextureUtil.method32933(
               "blur", ImageUtil.method35038(0, 0, (int)((float) Minecraft.getInstance().mainWindow.method8043() * this.field21014) - 15, 114, 4, 40, -921102)
            );
         } catch (IOException var4) {
            var4.printStackTrace();
         }
      }

      float var3 = this.field21021 < 25.0F ? this.field21021 / 25.0F : 1.0F;
      GL11.glTexParameteri(3553, 10241, 9728);
      if (this.field21020 != null) {
         Class3192.method11449(
            0.0F,
            0.0F,
            (float)((int)((float) Minecraft.getInstance().mainWindow.method8043() * this.field21014) - 15),
            114.0F,
            this.field21020,
            Class5628.method17688(Class1979.field12896.field12910, var3)
         );
      }

      this.field21021 = (float)this.field21010.method13513();
   }

   private void method13365() {
   }

   private void method13366() {
      int var3 = this.field20895 + this.field21016;
      int var4 = this.field20896 + this.field21016;
      int var5 = Class5628.method17688(Class1979.field12891.field12910, 0.8F);
      Class3192.method11439(ResourceRegistry.JelloLightFont40, (float)var3, (float)var4, "Jello", var5);
      Class3192.method11439(ResourceRegistry.JelloLightFont25, (float)(var3 + 87), (float)(var4 + 15), "Alt Manager", var5);
   }

   private void method13367() {
      float var3 = 1.0F;

      for (Class4305 var5 : this.field21010.method13241()) {
         if (!(var5 instanceof Class4292)) {
            for (Class4305 var7 : var5.method13241()) {
               if (var7 instanceof Class4294) {
                  Class4294 var8 = (Class4294)var7;
                  if (var7.method13265() <= Minecraft.getInstance().mainWindow.method8044() && this.field21010.method13513() == 0) {
                     if (var3 > 0.2F) {
                        var8.field20805.changeDirection(Direction.FORWARDS);
                     }

                     float var9 = Class8603.method30791(var8.field20805.calcPercent(), 0.51, 0.82, 0.0, 0.99);
                     var8.method13284((int)(-((1.0F - var9) * (float)(var7.method13267() + 30))));
                     var3 = var8.field20805.calcPercent();
                  } else {
                     var8.method13284(0);
                     var8.field20805.changeDirection(Direction.FORWARDS);
                  }
               }
            }
         }
      }
   }

   private void method13368() {
      boolean var3 = false;

      for (Class4305 var5 : this.field21010.method13241()) {
         if (!(var5 instanceof Class4292)) {
            for (Class4305 var7 : var5.method13241()) {
               Class4294 var8 = (Class4294)var7;
               var8.method13172(false);
            }
         }
      }
   }

   private boolean method13369() {
      boolean var3 = false;

      for (Class4305 var5 : this.field21010.method13241()) {
         if (!(var5 instanceof Class4292)) {
            for (Class4305 var7 : var5.method13241()) {
               if (var7.method13280() != 0 && var7.method13263() > this.field20897) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   private int method13370() {
      int var3 = 0;

      for (Class4305 var5 : this.field21010.method13241()) {
         if (!(var5 instanceof Class4292)) {
            for (Class4305 var7 : var5.method13241()) {
               var3++;
            }
         }
      }

      return var3;
   }

   private void method13371() {
      int var3 = this.method13309() * -1;
      float var4 = (float)this.method13310() / (float)this.method13267() * -114.0F;
      if (this.field21008) {
         this.field21006 = (float)((int)var4);
         this.field21005 = var3;
         this.field21008 = false;
      }

      float var5 = var4 - this.field21006;
      float var6 = (float)(var3 - this.field21005);
      Class3192.method11455((float)this.field21005, this.field21006, (float)(this.method13267() * 2), (float)(this.method13269() + 114), ResourcesDecrypter.panoramaPNG);
      float var7 = 0.5F;
      if (var4 != this.field21006) {
         this.field21006 += var5 * var7;
      }

      if (var3 != this.field21005) {
         this.field21005 = (int)((float)this.field21005 + var6 * var7);
      }

      Class3192.method11426(0.0F, 0.0F, (float)this.method13267(), (float)this.method13269(), Class5628.method17688(Class1979.field12896.field12910, 0.95F));
   }

   @Override
   public void method13065(int var1) {
      super.method13065(var1);
      if (var1 == 256) {
         Minecraft.getInstance().displayGuiScreen(new MainMenuScreen());
      }
   }

   @Override
   public JSONObject method13160(JSONObject var1) {
      this.field21019.method36776();
      return var1;
   }

   @Override
   public void method13161(JSONObject var1) {
      for (Class4305 var5 : this.field21010.method13241()) {
         if (!(var5 instanceof Class4292)) {
            for (Class4305 var7 : var5.method13241()) {
               this.field21010.method13234(var7);
            }
         }
      }

      this.method13372(true);
   }

   public void method13372(boolean var1) {
      List<Account> var5 = Class8270.method28878(this.field21019.method36775(), this.field21023, this.field21024, this.field21026.method13303());
      this.method13222(new Class1428(this, this, var5, var1));
   }

   private void method13373(Object var1) {
   }

   public int method13374() {
      return Minecraft.getInstance().mainWindow.method8044() / 12 + 280 + Minecraft.getInstance().mainWindow.method8044() / 12;
   }

   // $VF: synthetic method
   public static Class4339 method13382(Class4313 var0) {
      return var0.field21010;
   }

   // $VF: synthetic method
   public static Class4339 method13383(Class4313 var0, Class4339 var1) {
      return var0.field21010 = var1;
   }

   // $VF: synthetic method
   public static float method13384(Class4313 var0) {
      return var0.field21014;
   }

   // $VF: synthetic method
   public static int method13385(Class4313 var0) {
      return var0.field21016;
   }

   // $VF: synthetic method
   public static void method13386(Class4313 var0, Account var1, boolean var2) {
      var0.method13360(var1, var2);
   }
}