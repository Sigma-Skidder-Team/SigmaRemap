package mapped;

import java.util.ArrayList;
import java.util.List;

public class Class4151 extends Class4148 {
   private final int field20404 = Class9322.method35234("minecraft:end_stone");

   public static List<Class8097> method12852() {
      ArrayList var2 = new ArrayList(2);
      Class4151 var3 = new Class4151();
      var2.add(var3.method12841("minecraft:chorus_plant"));
      var2.add(var3.method12853());
      return var2;
   }

   public Class4151() {
      super(null);
   }

   public Class8097 method12853() {
      return var1 -> {
         if (var1.method37757().equals("minecraft:chorus_flower")) {
            this.method12845().add(var1.method37758());
         }
      };
   }

   @Override
   public byte method12842(Class9678 var1) {
      byte var4 = super.method12842(var1);
      if (var1.method37761("up").equals("true")) {
         var4 = (byte)(var4 | 16);
      }

      if (var1.method37761("down").equals("true")) {
         var4 = (byte)(var4 | 32);
      }

      return var4;
   }

   @Override
   public byte method12843(Class7161 var1, Class9695 var2, int var3) {
      byte var6 = super.method12843(var1, var2, var3);
      if (this.method12844(Class1983.field12948, this.method12840(var1, var2.method37961(Class1983.field12948)), false)) {
         var6 = (byte)(var6 | 16);
      }

      if (this.method12844(Class1983.field12949, this.method12840(var1, var2.method37961(Class1983.field12949)), false)) {
         var6 = (byte)(var6 | 32);
      }

      return var6;
   }

   @Override
   public boolean method12844(Class1983 var1, int var2, boolean var3) {
      return this.method12845().contains(var2) || var1 == Class1983.field12949 && var2 == this.field20404;
   }
}
