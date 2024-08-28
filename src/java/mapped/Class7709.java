package mapped;

import java.util.ArrayList;

public class Class7709 extends Class7710 {
   private ArrayList field33096 = new ArrayList();

   public Class7709(Class7710 var1) {
      super(var1.method25468(), var1.method25469());

      for (int var4 = 0; var4 < var1.method25466(); var4++) {
         Class5967 var5 = var1.method25467(var4);
         Class5967 var6 = new Class5967(var5.method18494(), new Class2524(var5.method18495()), var5.method18496(), var5.method18493());
         this.field33096.add(var6);
      }
   }

   public void method25462(Class7710 var1) {
      if (var1.method25466() != this.field33096.size()) {
         throw new RuntimeException("Mismatched diagrams, missing ids");
      } else {
         for (int var4 = 0; var4 < var1.method25466(); var4++) {
            Class5967 var5 = var1.method25467(var4);
            String var6 = var5.method18496().method20116();

            for (int var7 = 0; var7 < this.field33096.size(); var7++) {
               Class5967 var8 = (Class5967)this.field33096.get(var7);
               if (var8.method18496().method20116().equals(var6)) {
                  Class2524 var9 = (Class2524)var8.method18495();
                  var9.method10628(var5.method18495());
                  break;
               }
            }
         }
      }
   }

   public void method25463(Class7710 var1) {
      for (int var4 = 0; var4 < this.field33096.size(); var4++) {
         Class5967 var5 = (Class5967)this.field33096.get(var4);

         for (int var6 = 0; var6 < var1.method25466(); var6++) {
            Class5967 var7 = var1.method25467(var6);
            if (var7.method18496().method20116().equals(var5.method18496().method20116())) {
               Class2524 var8 = (Class2524)var5.method18495();
               var8.method10632(var7.method18495());
               break;
            }
         }
      }
   }

   public void method25464(float var1) {
      for (int var4 = 0; var4 < this.field33096.size(); var4++) {
         Class5967 var5 = (Class5967)this.field33096.get(var4);
         Class2524 var6 = (Class2524)var5.method18495();
         var6.method10631(var1);
      }
   }

   public void method25465(float var1) {
      for (int var4 = 0; var4 < this.field33096.size(); var4++) {
         Class5967 var5 = (Class5967)this.field33096.get(var4);
         Class2524 var6 = (Class2524)var5.method18495();
         var6.method10630(var1);
      }
   }

   @Override
   public int method25466() {
      return this.field33096.size();
   }

   @Override
   public Class5967 method25467(int var1) {
      return (Class5967)this.field33096.get(var1);
   }
}
