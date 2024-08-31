package mapped;

import java.util.Arrays;

public class Class1288 extends Class1286<Class1165> {
   public final Class811 field6852;

   public Class1288(Class811 var1) {
      super(var1.width, var1.height, Class811.method2229(0), var1.height - 40, 36);
      this.field6852 = var1;
   }

   public void method6113(Class2024 var1) {
      Class811 var10003 = this.field6852;
      this.field6852.getClass();
      this.method6030(new Class1165(var10003, var1));
   }

   @Override
   public int method6036() {
      return Class811.method2223(this.field6852).size() * 36;
   }

   @Override
   public boolean method6057() {
      return this.field6852.method5533() == this;
   }

   @Override
   public void method6039(MatrixStack var1) {
      this.field6852.renderBackground(var1);
   }

   @Override
   public void method6109(int var1) {
      this.method6108(var1);
      if (var1 != -1) {
         Class2024 var4 = (Class2024)Class811.method2223(this.field6852).get(var1);
         String var5 = I18n.format("narrator.select.list.position", var1 + 1, Class811.method2223(this.field6852).size());
         String var6 = Class9229.method34715(Arrays.<String>asList(var4.method8644(), Class811.method2218(var4), Class811.method2221(var4).getString(), var5));
         Class9229.method34711(I18n.format("narrator.select", var6));
      }
   }

   public void method6024(Class1165 var1) {
      super.method6024(var1);
      Class811.method2230(this.field6852, this.method2468().indexOf(var1));
      Class811.method2231(this.field6852).active = Class811.method2232(this.field6852) >= 0
         && Class811.method2232(this.field6852) < this.method6031()
         && !((Class2024)Class811.method2223(this.field6852).get(Class811.method2232(this.field6852))).method8649();
   }
}
