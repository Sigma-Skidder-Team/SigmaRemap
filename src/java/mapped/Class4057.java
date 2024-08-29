package mapped;

import net.minecraft.entity.EntityType;

import java.util.ArrayList;

public abstract class Class4057 {
   private Class4862<EntityType, Class4387> field20386;
   private String field20387;
   private float field20388;
   private String[] field20389;

   public Class4057(EntityType var1, String var2, float var3) {
      this(Class4862.<EntityType, Class4387>method15005(var1), var2, var3, (String[])null);
   }

   public Class4057(EntityType var1, String var2, float var3, String[] var4) {
      this(Class4862.<EntityType, Class4387>method15005(var1), var2, var3, var4);
   }

   public Class4057(Class4387 var1, String var2, float var3) {
      this(Class4862.method15006(var1), var2, var3, (String[])null);
   }

   public Class4057(Class4862<EntityType, Class4387> var1, String var2, float var3, String[] var4) {
      this.field20386 = var1;
      this.field20387 = var2;
      this.field20388 = var3;
      this.field20389 = var4;
   }

   public Class4862<EntityType, Class4387> method12826() {
      return this.field20386;
   }

   public String method12827() {
      return this.field20387;
   }

   public String[] method12828() {
      return this.field20389;
   }

   public float method12829() {
      return this.field20388;
   }

   public abstract Class2828 method12822();

   public abstract Class7219 method12823(Class2828 var1, String var2);

   public abstract String[] method12824();

   public abstract Class9492 method12825(Class2828 var1, float var2);

   public Class7219[] method12830(Class2828 var1) {
      String[] var4 = this.method12824();
      ArrayList<Class7219> var5 = new ArrayList();

      for (int var6 = 0; var6 < var4.length; var6++) {
         String var7 = var4[var6];
         Class7219 var8 = this.method12823(var1, var7);
         if (var8 != null) {
            var5.add(var8);
         }
      }

      return var5.toArray(new Class7219[var5.size()]);
   }
}
