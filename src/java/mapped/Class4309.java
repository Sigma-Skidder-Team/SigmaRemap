package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.gui.GuiManager;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.resource.ResourceRegistry;
import com.mentalfrostbyte.jello.unmapped.Class4305;
import com.mentalfrostbyte.jello.unmapped.Class4307;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map.Entry;

public class Class4309 extends Class4307 {
   private static Minecraft field20953 = Minecraft.getInstance();
   private Texture field20954;
   public Date field20955;
   public Class4375 field20956;
   public Class4270 field20957;
   public boolean field20958 = false;
   public boolean field20959;
   public Class4358 field20960;
   public int field20961;
   public boolean field20962;
   private boolean field20963;
   private boolean field20964;

   public Class4309() {
      super("KeybindManager");
      this.field20955 = new Date();
      this.method13230(this.field20957 = new Class4270(this, "keyboard", (this.field20897 - 1060) / 2, (this.field20898 - 357) / 2));
      this.field20957.method13279(0.4F, 0.4F);
      this.field20957
         .method13036(
            var2 -> {
               boolean var5 = false;

               for (Class4305 var7 : this.method13241()) {
                  if (var7 instanceof Class4375) {
                     var5 = true;
                  }
               }

               if (this.field20957.field20696 == this.field20961 && var5) {
                  this.method13333();
               } else {
                  int[] var8 = this.field20957.method13105(this.field20957.field20696);
                  String var9 = Class5628.method17736(this.field20957.field20696);
                  this.field20956 = new Class4375(
                     this, "popover", this.field20957.method13263() + var8[0], this.field20957.method13265() + var8[1], this.field20957.field20696, var9
                  );
                  this.field20956.method13036(var1x -> this.method13329(this.field20957));
                  this.field20956.method13713(var1x -> {
                     var1x.method13292(false);
                     this.method13331();
                  });
                  this.field20961 = this.field20957.field20696;
               }
            }
         );
      Class5628.method17739();
   }

   public static ArrayList<Class6984> method13328() {
      ArrayList var2 = new ArrayList();

      for (Module var4 : Client.getInstance().getModuleManager().method14664().values()) {
         var2.add(new Class6984(var4));
      }

      for (Entry var6 : GuiManager.field41338.entrySet()) {
         var2.add(new Class6984((Class<? extends Screen>)var6.getKey()));
      }

      return var2;
   }

   private void method13329(Class4270 var1) {
      this.method13222(new Class635(this, var1));
   }

   private void method13330() {
      this.method13222(new Class544(this, this));
   }

   private void method13331() {
      this.method13222(new Class1533(this, this));
   }

   private void method13332() {
      this.method13222(new Class543(this, this));
   }

   private void method13333() {
      this.method13222(new Class1376(this, this));
   }

   @Override
   public void method13028(int var1, int var2) {
      if (this.method13212()) {
         this.field20957.method13242();
         this.method13244();
         this.field20961 = 0;
         this.field20956 = null;
      }

      if (this.field20956 != null) {
         this.field20957.method13242();
         this.method13244();
         this.method13230(this.field20956);
         this.field20956 = null;
      }

      super.method13028(var1, var2);
      this.method13300(false);
   }

   @Override
   public int method13313() {
      return 60;
   }

   @Override
   public void method13065(int var1) {
      super.method13065(var1);
      if (var1 == 256) {
         Class5628.method17742();
         field20953.displayGuiScreen(null);
      }
   }

   @Override
   public void method13027(float var1) {
      var1 = (float)Math.min(200L, new Date().getTime() - this.field20955.getTime()) / 200.0F;
      float var4 = Class9747.method38214(var1, 0.0F, 1.0F, 1.0F);
      this.method13279(0.8F + var4 * 0.2F, 0.8F + var4 * 0.2F);
      float var5 = 0.25F * var1;
      Class3192.method11426(
         (float)this.field20895,
         (float)this.field20896,
         (float)(this.field20895 + this.field20897),
         (float)(this.field20896 + this.field20898),
         Class5628.method17688(Class1979.field12891.field12910, var5)
      );
      super.method13224();
      Class3192.method11439(
         ResourceRegistry.field38866,
         (float)((this.field20897 - 1060) / 2),
         (float)((this.field20898 - 357) / 2 - 90),
         "Keybind Manager",
         Class1979.field12896.field12910
      );
      super.method13027(var1);
   }

   // $VF: synthetic method
   public static int method13337(Class4309 var0) {
      return var0.field20897;
   }

   // $VF: synthetic method
   public static int method13338(Class4309 var0) {
      return var0.field20898;
   }

   // $VF: synthetic method
   public static void method13339(Class4309 var0) {
      var0.method13332();
   }
}
