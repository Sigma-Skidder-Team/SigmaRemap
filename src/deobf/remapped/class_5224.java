package remapped;

import com.mojang.authlib.exceptions.InvalidCredentialsException;
import java.math.BigInteger;
import java.net.URI;
import java.util.Random;
import net.minecraft.util.text.StringTextComponent;

public class class_5224 extends class_4232 {
   private final Screen field_26813;
   private String field_26815;
   private long field_26816;
   private String field_26814;
   private class_5932 field_26818;

   public class_5224(Screen var1) {
      super(new StringTextComponent(class_6956.method_31803("of.options.capeOF.title")));
      this.field_26813 = var1;
   }

   @Override
   public void method_1163() {
      int var3 = 0;
      var3 += 2;
      this.<class_5932>method_1186(
         new class_5932(210, this.field_941 / 2 - 155, this.field_940 / 6 + 24 * (var3 >> 1), 150, 20, class_6956.method_31803("of.options.capeOF.openEditor"))
      );
      this.<class_5932>method_1186(
         new class_5932(
            220, this.field_941 / 2 - 155 + 160, this.field_940 / 6 + 24 * (var3 >> 1), 150, 20, class_6956.method_31803("of.options.capeOF.reloadCape")
         )
      );
      var3 += 6;
      this.field_26818 = new class_5932(
         230, this.field_941 / 2 - 100, this.field_940 / 6 + 24 * (var3 >> 1), 200, 20, class_6956.method_31803("of.options.capeOF.copyEditorLink")
      );
      this.field_26818.field_36677 = this.field_26814 != null;
      this.<class_5932>method_1186(this.field_26818);
      var3 += 4;
      this.<class_5932>method_1186(new class_5932(200, this.field_941 / 2 - 100, this.field_940 / 6 + 24 * (var3 >> 1), class_6956.method_31803("gui.done")));
   }

   @Override
   public void method_19728(class_7114 var1) {
      if (var1 instanceof class_5932) {
         class_5932 var4 = (class_5932)var1;
         if (var4.field_36675) {
            if (var4.field_30159 == 200) {
               this.field_943.method_8609(this.field_26813);
            }

            if (var4.field_30159 == 210) {
               try {
                  String var5 = this.field_943.method_8502().method_5370().getName();
                  String var6 = this.field_943.method_8502().method_5370().getId().toString().replace("-", "");
                  String var7 = this.field_943.method_8502().method_5365();
                  Random var8 = new Random();
                  Random var9 = new Random((long)System.identityHashCode(new Object()));
                  BigInteger var10 = new BigInteger(128, var8);
                  BigInteger var11 = new BigInteger(128, var9);
                  BigInteger var12 = var10.xor(var11);
                  String var13 = var12.toString(16);
                  this.field_943.method_8517().joinServer(this.field_943.method_8502().method_5370(), var7, var13);
                  String var14 = "https://optifine.net/capeChange?u=" + var6 + "&n=" + var5 + "&s=" + var13;
                  boolean var15 = Config.method_14359(new URI(var14));
                  if (var15) {
                     this.method_23910(class_3458.method_15912("of.message.capeOF.openEditor"), 10000L);
                  } else {
                     this.method_23910(class_3458.method_15912("of.message.capeOF.openEditorError"), 10000L);
                     this.method_23911(var14);
                  }
               } catch (InvalidCredentialsException var20) {
                  Config.method_14428(
                     class_6956.method_31803("of.message.capeOF.error1"), class_6956.method_31803("of.message.capeOF.error2", var20.getMessage())
                  );
                  Config.method_14317("Mojang authentication failed");
                  Config.method_14317(var20.getClass().getName() + ": " + var20.getMessage());
               } catch (Exception var21) {
                  Config.method_14317("Error opening OptiFine cape link");
                  Config.method_14317(var21.getClass().getName() + ": " + var21.getMessage());
               }
            }

            if (var4.field_30159 == 220) {
               this.method_23910(class_3458.method_15912("of.message.capeOF.reloadCape"), 15000L);
               if (this.field_943.thePlayer != null) {
                  long var16 = 15000L;
                  long var18 = System.currentTimeMillis() + var16;
                  this.field_943.thePlayer.method_44879(var18);
               }
            }

            if (var4.field_30159 == 230 && this.field_26814 != null) {
               this.field_943.field_9600.method_38891(this.field_26814);
            }
         }
      }
   }

   private void method_23910(String var1, long var2) {
      this.field_26815 = var1;
      this.field_26816 = System.currentTimeMillis() + var2;
      this.method_23911((String)null);
   }

   @Override
   public void method_6767(class_7966 var1, int var2, int var3, float var4) {
      this.method_1183(var1);
      method_9788(var1, this.field_20538, this.field_947, this.field_941 / 2, 20, 16777215);
      if (this.field_26815 != null) {
         method_9787(var1, this.field_20538, this.field_26815, this.field_941 / 2, this.field_940 / 6 + 60, 16777215);
         if (System.currentTimeMillis() > this.field_26816) {
            this.field_26815 = null;
            this.method_23911((String)null);
         }
      }

      super.method_6767(var1, var2, var3, var4);
   }

   public void method_23911(String var1) {
      this.field_26814 = var1;
      this.field_26818.field_36677 = var1 != null;
   }
}
