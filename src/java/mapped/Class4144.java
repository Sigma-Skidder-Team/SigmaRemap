package mapped;

public class Class4144 extends Class4057 {
   public Class4144() {
      super(Class8992.field41036, "guardian", 0.5F);
   }

   @Override
   public Class2828 method12822() {
      return new Class2820();
   }

   @Override
   public Class7219 method12823(Class2828 var1, String var2) {
      if (!(var1 instanceof Class2820)) {
         return null;
      } else {
         Class2820 var5 = (Class2820)var1;
         if (!var2.equals("body")) {
            if (var2.equals("eye")) {
               return (Class7219)Class9299.method35072(var5, Class9299.field43048);
            } else {
               String var6 = "spine";
               if (!var2.startsWith(var6)) {
                  String var11 = "tail";
                  if (!var2.startsWith(var11)) {
                     return null;
                  } else {
                     Class7219[] var12 = (Class7219[])Class9299.method35072(var5, Class9299.field43050);
                     if (var12 == null) {
                        return null;
                     } else {
                        String var14 = var2.substring(var11.length());
                        int var10 = Class7944.method26899(var14, -1);
                        var10--;
                        return var10 >= 0 && var10 < var12.length ? var12[var10] : null;
                     }
                  }
               } else {
                  Class7219[] var7 = (Class7219[])Class9299.method35072(var5, Class9299.field43049);
                  if (var7 == null) {
                     return null;
                  } else {
                     String var8 = var2.substring(var6.length());
                     int var9 = Class7944.method26899(var8, -1);
                     var9--;
                     return var9 >= 0 && var9 < var7.length ? var7[var9] : null;
                  }
               }
            }
         } else {
            return (Class7219)Class9299.method35072(var5, Class9299.field43047);
         }
      }
   }

   @Override
   public String[] method12824() {
      return new String[]{
         "body",
         "eye",
         "spine1",
         "spine2",
         "spine3",
         "spine4",
         "spine5",
         "spine6",
         "spine7",
         "spine8",
         "spine9",
         "spine10",
         "spine11",
         "spine12",
         "tail1",
         "tail2",
         "tail3"
      };
   }

   @Override
   public Class9492 method12825(Class2828 var1, float var2) {
      Class8853 var5 = Minecraft.getInstance().method1554();
      Class5658 var6 = new Class5658(var5);
      var6.field25086 = (Class2820)var1;
      var6.field25098 = var2;
      return (Class9492)var6;
   }
}
