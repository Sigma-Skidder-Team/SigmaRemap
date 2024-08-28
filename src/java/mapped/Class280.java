package mapped;

import it.unimi.dsi.fastutil.objects.Object2IntMap;

import java.util.Map;

public class Class280 extends Class269<Class8968> implements AutoCloseable {
   private Map<ResourceLocation, Class7202> field1062;
   private Class1694 field1063;
   private final Class9736 field1064;
   private final TextureManager field1065;
   private final Class8396 field1066;
   private int field1067;
   private Class7202 field1068;
   private Object2IntMap<Class7380> field1069;

   public Class280(TextureManager var1, Class8396 var2, int var3) {
      this.field1065 = var1;
      this.field1066 = var2;
      this.field1067 = var3;
      this.field1064 = new Class9736(this);
   }

   public Class7202 method1023(Class1997 var1) {
      return this.field1062.getOrDefault(var1, this.field1068);
   }

   public Class7202 method1024() {
      return this.field1068;
   }

   public Class9736 method1025() {
      return this.field1064;
   }

   public Class8968 method970(Class191 var1, Class7165 var2) {
      var2.method22501();
      Class8968 var5 = new Class8968(var1, this.field1066, var2, this.field1067);
      var2.method22502();
      return var5;
   }

   public void method971(Class8968 var1, Class191 var2, Class7165 var3) {
      var3.method22501();
      var3.method22503("upload");
      if (this.field1063 != null) {
         this.field1063.close();
      }

      this.field1063 = var1.method32838(this.field1065, var3);
      this.field1062 = var1.method32850();
      this.field1069 = var1.method32851();
      this.field1068 = this.field1062.get(Class8968.field40521);
      var3.method22506("cache");
      this.field1064.method38155();
      var3.method22505();
      var3.method22502();
   }

   public boolean method1026(Class7380 var1, Class7380 var2) {
      if (var1 != var2) {
         int var5 = this.field1069.getInt(var1);
         if (var5 != -1) {
            int var6 = this.field1069.getInt(var2);
            if (var5 == var6) {
               Class7379 var7 = var1.method23449();
               Class7379 var8 = var2.method23449();
               return var7 != var8;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public Class289 method1027(ResourceLocation var1) {
      return this.field1063.method7288(var1);
   }

   @Override
   public void close() {
      if (this.field1063 != null) {
         this.field1063.close();
      }
   }

   public void method1028(int var1) {
      this.field1067 = var1;
   }
}
