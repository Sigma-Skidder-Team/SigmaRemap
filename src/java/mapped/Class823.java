package mapped;

import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class823 extends Class798 {
   private static final Logger field4503 = LogManager.getLogger();
   private static final ResourceLocation field4504 = new ResourceLocation("realms", "textures/gui/realms/accept_icon.png");
   private static final ResourceLocation field4505 = new ResourceLocation("realms", "textures/gui/realms/reject_icon.png");
   private static final ITextComponent field4506 = new TranslationTextComponent("mco.invites.nopending");
   private static final ITextComponent field4507 =  new TranslationTextComponent("mco.invites.button.accept");
   private static final ITextComponent field4508 = new TranslationTextComponent("mco.invites.button.reject");
   private final Screen field4509;
   private ITextComponent field4510;
   private boolean field4511;
   private Class1292 field4512;
   private Class1153 field4513;
   private int field4514 = -1;
   private Class1206 field4515;
   private Class1206 field4516;

   public Class823(Screen var1) {
      this.field4509 = var1;
   }

   @Override
   public void method1921() {
      this.field4562.field1302.method36347(true);
      this.field4512 = new Class1292(this);
      new Class376(this, "Realms-pending-invitations-fetcher").start();
      this.<Class1292>method2456(this.field4512);
      this.field4515 = this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 - 174, this.field4565 - 32, 100, 20, new TranslationTextComponent("mco.invites.button.accept"), var1 -> {
            this.method2380(this.field4514);
            this.field4514 = -1;
            this.method2382();
         })
      );
      this.<Class1206>method2455(
         new Class1206(
            this.field4564 / 2 - 50, this.field4565 - 32, 100, 20, Class7127.field30658, var1 -> this.field4562.displayGuiScreen(new Class806(this.field4509))
         )
      );
      this.field4516 = this.<Class1206>method2455(
         new Class1206(this.field4564 / 2 + 74, this.field4565 - 32, 100, 20, new TranslationTextComponent("mco.invites.button.reject"), var1 -> {
            this.method2379(this.field4514);
            this.field4514 = -1;
            this.method2382();
         })
      );
      this.field4513 = new Class1153(new TranslationTextComponent("mco.invites.title"), this.field4564 / 2, 12, 16777215);
      this.<Class1153>method2456(this.field4513);
      this.method1930();
      this.method2382();
   }

   @Override
   public boolean method1920(int var1, int var2, int var3) {
      if (var1 != 256) {
         return super.method1920(var1, var2, var3);
      } else {
         this.field4562.displayGuiScreen(new Class806(this.field4509));
         return true;
      }
   }

   private void method2378(int var1) {
      this.field4512.method6123(var1);
   }

   private void method2379(int var1) {
      if (var1 < this.field4512.method6031()) {
         new Class389(this, "Realms-reject-invitation", var1).start();
      }
   }

   private void method2380(int var1) {
      if (var1 < this.field4512.method6031()) {
         new Class382(this, "Realms-accept-invitation", var1).start();
      }
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.field4510 = null;
      this.method2469(var1);
      this.field4512.method1923(var1, var2, var3, var4);
      this.field4513.method5542(this, var1);
      if (this.field4510 != null) {
         this.method2381(var1, this.field4510, var2, var3);
      }

      if (this.field4512.method6031() == 0 && this.field4511) {
         method5691(var1, this.field4568, field4506, this.field4564 / 2, this.field4565 / 2 - 20, 16777215);
      }

      super.method1923(var1, var2, var3, var4);
   }

   public void method2381(MatrixStack var1, ITextComponent var2, int var3, int var4) {
      if (var2 != null) {
         int var7 = var3 + 12;
         int var8 = var4 - 12;
         int var9 = this.field4568.method38821(var2);
         this.method5688(var1, var7 - 3, var8 - 3, var7 + var9 + 3, var8 + 8 + 3, -1073741824, -1073741824);
         this.field4568.method38803(var1, var2, (float)var7, (float)var8, 16777215);
      }
   }

   private void method2382() {
      this.field4515.field6483 = this.method2383(this.field4514);
      this.field4516.field6483 = this.method2383(this.field4514);
   }

   private boolean method2383(int var1) {
      return var1 != -1;
   }

   // $VF: synthetic method
   public static Minecraft method2387(Class823 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static Logger method2388() {
      return field4503;
   }

   // $VF: synthetic method
   public static boolean method2389(Class823 var0, boolean var1) {
      return var0.field4511 = var1;
   }

   // $VF: synthetic method
   public static Class1292 method2390(Class823 var0) {
      return var0.field4512;
   }

   // $VF: synthetic method
   public static Minecraft method2391(Class823 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static void method2392(Class823 var0, int var1) {
      var0.method2378(var1);
   }

   // $VF: synthetic method
   public static Minecraft method2393(Class823 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static Class9834 method2394(Class823 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static Class9834 method2395(Class823 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static Class9834 method2396(Class823 var0) {
      return var0.field4568;
   }

   // $VF: synthetic method
   public static ResourceLocation method2397() {
      return field4504;
   }

   // $VF: synthetic method
   public static Minecraft method2398(Class823 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static ITextComponent method2399(Class823 var0, ITextComponent var1) {
      return var0.field4510 = var1;
   }

   // $VF: synthetic method
   public static ITextComponent method2400() {
      return field4507;
   }

   // $VF: synthetic method
   public static void method2401(Class823 var0, int var1) {
      var0.method2380(var1);
   }

   // $VF: synthetic method
   public static ResourceLocation method2402() {
      return field4505;
   }

   // $VF: synthetic method
   public static Minecraft method2403(Class823 var0) {
      return var0.field4562;
   }

   // $VF: synthetic method
   public static ITextComponent method2404() {
      return field4508;
   }

   // $VF: synthetic method
   public static void method2405(Class823 var0, int var1) {
      var0.method2379(var1);
   }

   // $VF: synthetic method
   public static int method2406(Class823 var0, int var1) {
      return var0.field4514 = var1;
   }

   // $VF: synthetic method
   public static void method2407(Class823 var0) {
      var0.method2382();
   }
}
