package mapped;

import com.mojang.authlib.exceptions.InvalidCredentialsException;
import net.minecraft.util.text.StringTextComponent;

import java.math.BigInteger;
import java.net.URI;
import java.util.Random;

public class Class845 extends Class838 {
   private final Screen field4681;
   private String field4682;
   private long field4683;
   private String field4684;
   private Class1210 field4685;

   public Class845(Screen var1) {
      super(new StringTextComponent(Class9088.method33883("of.options.capeOF.title")));
      this.field4681 = var1;
   }

   @Override
   public void method1921() {
      int var3 = 0;
      var3 += 2;
      this.<Class1210>method2455(
         new Class1210(210, this.field4564 / 2 - 155, this.field4565 / 6 + 24 * (var3 >> 1), 150, 20, Class9088.method33883("of.options.capeOF.openEditor"))
      );
      this.<Class1210>method2455(
         new Class1210(
            220, this.field4564 / 2 - 155 + 160, this.field4565 / 6 + 24 * (var3 >> 1), 150, 20, Class9088.method33883("of.options.capeOF.reloadCape")
         )
      );
      var3 += 6;
      this.field4685 = new Class1210(
         230, this.field4564 / 2 - 100, this.field4565 / 6 + 24 * (var3 >> 1), 200, 20, Class9088.method33883("of.options.capeOF.copyEditorLink")
      );
      this.field4685.field6483 = this.field4684 != null;
      this.<Class1210>method2455(this.field4685);
      var3 += 4;
      this.<Class1210>method2455(new Class1210(200, this.field4564 / 2 - 100, this.field4565 / 6 + 24 * (var3 >> 1), Class9088.method33883("gui.done")));
   }

   @Override
   public void method2563(Class1197 var1) {
      if (var1 instanceof Class1210) {
         Class1210 var4 = (Class1210)var1;
         if (var4.field6482) {
            if (var4.field6523 == 200) {
               this.field4562.displayGuiScreen(this.field4681);
            }

            if (var4.field6523 == 210) {
               try {
                  String var5 = this.field4562.method1533().getProfile().getName();
                  String var6 = this.field4562.method1533().getProfile().getId().toString().replace("-", "");
                  String var7 = this.field4562.method1533().getToken();
                  Random var8 = new Random();
                  Random var9 = new Random((long)System.identityHashCode(new Object()));
                  BigInteger var10 = new BigInteger(128, var8);
                  BigInteger var11 = new BigInteger(128, var9);
                  BigInteger var12 = var10.xor(var11);
                  String var13 = var12.toString(16);
                  this.field4562.method1548().joinServer(this.field4562.method1533().getProfile(), var7, var13);
                  String var14 = "https://optifine.net/capeChange?u=" + var6 + "&n=" + var5 + "&s=" + var13;
                  boolean var15 = Class7944.method26980(new URI(var14));
                  if (var15) {
                     this.method2590(Class8043.method27619("of.message.capeOF.openEditor"), 10000L);
                  } else {
                     this.method2590(Class8043.method27619("of.message.capeOF.openEditorError"), 10000L);
                     this.method2591(var14);
                  }
               } catch (InvalidCredentialsException var20) {
                  Class7944.method26964(
                     Class9088.method33883("of.message.capeOF.error1"), Class9088.method33883("of.message.capeOF.error2", var20.getMessage())
                  );
                  Class7944.method26811("Mojang authentication failed");
                  Class7944.method26811(var20.getClass().getName() + ": " + var20.getMessage());
               } catch (Exception var21) {
                  Class7944.method26811("Error opening OptiFine cape link");
                  Class7944.method26811(var21.getClass().getName() + ": " + var21.getMessage());
               }
            }

            if (var4.field6523 == 220) {
               this.method2590(Class8043.method27619("of.message.capeOF.reloadCape"), 15000L);
               if (this.field4562.player != null) {
                  long var16 = 15000L;
                  long var18 = System.currentTimeMillis() + var16;
                  this.field4562.player.method5386(var18);
               }
            }

            if (var4.field6523 == 230 && this.field4684 != null) {
               this.field4562.field1302.method36350(this.field4684);
            }
         }
      }
   }

   private void method2590(String var1, long var2) {
      this.field4682 = var1;
      this.field4683 = System.currentTimeMillis() + var2;
      this.method2591((String)null);
   }

   @Override
   public void method1923(MatrixStack var1, int var2, int var3, float var4) {
      this.method2469(var1);
      method5691(var1, this.field4630, this.field4560, this.field4564 / 2, 20, 16777215);
      if (this.field4682 != null) {
         method5690(var1, this.field4630, this.field4682, this.field4564 / 2, this.field4565 / 6 + 60, 16777215);
         if (System.currentTimeMillis() > this.field4683) {
            this.field4682 = null;
            this.method2591((String)null);
         }
      }

      super.method1923(var1, var2, var3, var4);
   }

   public void method2591(String var1) {
      this.field4684 = var1;
      this.field4685.field6483 = var1 != null;
   }
}
