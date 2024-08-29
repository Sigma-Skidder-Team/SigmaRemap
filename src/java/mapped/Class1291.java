package mapped;

import net.minecraft.client.util.Util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Class1291 extends Class1286<Class1177> {
   public final Class804 field6855;

   public Class1291(Class804 var1) {
      this(var1, Collections.emptyList());
   }

   public Class1291(Class804 var1, Iterable<Class6130> var2) {
      super(var1.field4564, var1.field4565, !Class804.method1999(var1) ? 32 : Class804.method2000(1), var1.field4565 - 40, 46);
      this.field6855 = var1;
      var2.forEach(this::method6118);
   }

   public void method6118(Class6130 var1) {
      Class804 var10003 = this.field6855;
      this.field6855.getClass();
      this.method6030(new Class1177(var10003, var1));
   }

   @Override
   public boolean method1958(double var1, double var3, int var5) {
      if (var5 == 0 && var3 >= (double)this.field6787 && var3 <= (double)this.field6788) {
         int var8 = this.field6785 / 2 - 150;
         if (Class804.method2001(this.field6855) != null) {
            Util.getOSType().method8181(Class804.method2001(this.field6855));
         }

         int var9 = (int)Math.floor(var3 - (double)this.field6787) - this.field6795 + (int)this.method6044() - 4;
         int var10 = var9 / this.field6783;
         if (var1 >= (double)var8 && var1 < (double)this.method6048() && var10 >= 0 && var9 >= 0 && var10 < this.method6031()) {
            this.method6109(var10);
            this.method6110(var9, var10, var1, var3, this.field6785);
            if (var10 < Class804.method1981(this.field6855).method6031()) {
               Class804.method2002(this.field6855, Class804.method2003(this.field6855) + 7);
               if (Class804.method2003(this.field6855) >= 10) {
                  Class804.method2004(this.field6855);
               }

               return true;
            }

            return super.method1958(var1, var3, var5);
         }
      }

      return super.method1958(var1, var3, var5);
   }

   @Override
   public void method6109(int var1) {
      this.method6108(var1);
      if (var1 != -1) {
         Class6130 var4 = Class804.method1981(this.field6855).method6120(var1);
         String var5 = I18n.format("narrator.select.list.position", var1 + 1, Class804.method1981(this.field6855).method6031());
         String var6 = I18n.format("mco.template.select.narrate.version", var4.field27466);
         String var7 = I18n.format("mco.template.select.narrate.authors", var4.field27467);
         String var8 = Class9229.method34715(Arrays.<String>asList(var4.field27465, var7, var4.field27471, var6, var5));
         Class9229.method34711(I18n.format("narrator.select", var8));
      }
   }

   public void method6024(Class1177 var1) {
      super.method6024(var1);
      Class804.method2005(this.field6855, this.method2468().indexOf(var1));
      Class804.method2006(this.field6855);
   }

   @Override
   public int method6036() {
      return this.method6031() * 46;
   }

   @Override
   public int method6022() {
      return 300;
   }

   @Override
   public void method6039(MatrixStack var1) {
      this.field6855.method2469(var1);
   }

   @Override
   public boolean method6057() {
      return this.field6855.method5533() == this;
   }

   public boolean method6119() {
      return this.method6031() == 0;
   }

   public Class6130 method6120(int var1) {
      return Class1177.method5606(this.method2468().get(var1));
   }

   public List<Class6130> method6121() {
      return this.method2468().stream().<Class6130>map(var0 -> Class1177.method5606(var0)).collect(Collectors.<Class6130>toList());
   }
}
