package mapped;

import java.util.ArrayList;
import java.util.HashMap;

public class Class7710 {
   private ArrayList field33097 = new ArrayList();
   private HashMap field33098 = new HashMap();
   private HashMap field33099 = new HashMap();
   private HashMap field33100 = new HashMap();
   private float field33101;
   private float field33102;

   public Class7710(float var1, float var2) {
      this.field33101 = var1;
      this.field33102 = var2;
   }

   public float method25468() {
      return this.field33101;
   }

   public float method25469() {
      return this.field33102;
   }

   public void method25470(String var1, String var2) {
      this.field33098.put(var1, var2);
   }

   public void method25471(String var1, Class7462 var2) {
      this.field33099.put(var1, var2);
   }

   public String method25472(String var1) {
      return (String)this.field33098.get(var1);
   }

   public Class7462 method25473(String var1) {
      return (Class7462)this.field33099.get(var1);
   }

   public String[] method25474() {
      return (String[]) this.field33098.keySet().toArray(new String[0]);
   }

   public Class5967 method25475(String var1) {
      return (Class5967)this.field33100.get(var1);
   }

   public void method25476(Class5967 var1) {
      this.field33097.add(var1);
      this.field33100.put(var1.method18496().method20117("id"), var1);
      String var4 = var1.method18496().method20119("fill");
      Class7462 var5 = this.method25473(var4);
      if (var5 != null && var5.method24133()) {
         for (int var6 = 0; var6 < Class6969.field30177; var6++) {
            var1.method18495().method10608();
         }
      }
   }

   public int method25466() {
      return this.field33097.size();
   }

   public Class5967 method25467(int var1) {
      return (Class5967)this.field33097.get(var1);
   }

   public void method25477(Class5967 var1) {
      this.field33097.remove(var1);
      this.field33100.remove(var1.method18496().method20117("id"));
   }
}
