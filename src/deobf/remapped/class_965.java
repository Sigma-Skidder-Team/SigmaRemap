package remapped;

import org.lwjgl.glfw.GLFW;

public class class_965 extends class_2596 {
   public class_9486 field_4950;
   public class_9486 field_4946;
   public class_4636 field_4952;
   public class_4636 field_4948;
   public class_4636 field_4947;
   public class_8691 field_4953 = SigmaMainClass.method_3328().method_3303();
   private String field_4949 = "§7Idle...";

   public class_965() {
      super("Alt Manager");
      this.method_32105(false);
      short var3 = 400;
      int var4 = 114;
      int var5 = (this.method_32109() - var3) / 2;
      this.method_32148(
         this.field_4950 = new class_9486(this, "username", var5, var4, var3, 45, class_9486.field_14738, "", "Username / E-Mail", class_5320.field_27156)
      );
      var4 += 80;
      this.method_32148(
         this.field_4946 = new class_9486(this, "password", var5, var4, var3, 45, class_9486.field_14738, "", "Password", class_5320.field_27156)
      );
      var4 += 190;
      this.method_32148(this.field_4952 = new class_4636(this, "login", var5, var4, var3, 40, "Login", class_1255.field_6920.field_6917));
      var4 += 50;
      this.method_32148(this.field_4948 = new class_4636(this, "back", var5, var4, var3, 40, "Back", class_1255.field_6920.field_6917));
      var4 += 50;
      this.method_32148(this.field_4947 = new class_4636(this, "import", var5, var4, var3, 40, "Import user:pass", class_1255.field_6920.field_6917));
      this.field_4946.method_13726(true);
      this.field_4946.method_13729("*");
      this.field_4952.method_32100((var1, var2) -> {
         this.field_4949 = "§bLogging in...";
         new Thread(() -> {
            class_7309 var3x = new class_7309(this.field_4950.method_32165(), this.field_4946.method_32165());
            if (!this.field_4953.method_39906(var3x)) {
               this.field_4949 = "§cLogin failed!";
            } else {
               this.field_4949 = "Logged in. (" + var3x.method_33344() + (!var3x.method_33338() ? "" : " - offline name") + ")";
            }
         }).start();
      });
      this.field_4948.method_32100((var0, var1) -> SigmaMainClass.method_3328().method_3299().method_30990(new class_2135()));
      this.field_4947.method_32100((var1, var2) -> {
         String var5x = "";

         try {
            var5x = GLFW.glfwGetClipboardString(class_1893.method_8510().field_9602.method_43181());
         } catch (Exception var7x) {
         }

         if (var5x != "" && var5x.contains(":")) {
            String[] var6x = var5x.split(":");
            if (var6x.length == 2) {
               this.field_4950.method_32186(var6x[0].replace("\n", ""));
               this.field_4946.method_32186(var6x[1].replace("\n", ""));
            }
         }
      });
   }

   @Override
   public void method_32178(float var1) {
      class_73.method_96(0.0F, 0.0F, (float)this.method_32109(), (float)this.method_32137(), class_3054.field_15004);
      class_73.method_94(0.0F, 0.0F, (float)this.method_32109(), (float)this.method_32137(), class_314.method_1444(class_1255.field_6912.field_6917, 0.1F));
      class_73.method_94(0.0F, 0.0F, (float)this.method_32109(), (float)this.method_32137(), class_314.method_1444(class_1255.field_6929.field_6917, 0.95F));
      class_73.method_88(
         class_5320.field_27156,
         (float)(this.method_32109() / 2),
         38.0F,
         "Add Login",
         class_1255.field_6918.field_6917,
         class_6206.field_31726,
         class_6206.field_31724
      );
      class_73.method_89(
         class_5320.field_27156,
         (float)(this.method_32109() / 2),
         58.0F,
         this.field_4949,
         class_1255.field_6918.field_6917,
         class_6206.field_31726,
         class_6206.field_31724,
         true
      );
      super.method_32178(var1);
   }

   @Override
   public void method_29509(int var1) {
      super.method_29509(var1);
      if (var1 == 256) {
         SigmaMainClass.method_3328().method_3299().method_30990(new class_2135());
      }
   }
}
