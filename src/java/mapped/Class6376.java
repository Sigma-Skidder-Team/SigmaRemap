package mapped;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Level;

public class Class6376 extends Class6373 {
   private List<ViaVersion7> field27941;
   private Class7161 field27942;

   public Class6376(Class7161 var1) {
      this.method19342(var1);
   }

   @Override
   public void method19341() {
      this.field27941 = new CopyOnWriteArrayList<ViaVersion7>();
      this.field27941.add(Class9019.field41257);
   }

   @Override
   public void method19342(Class7161 var1) {
      this.field27942 = var1;
      Class6038 var4 = new Class6038(var1);
      var4.method18684(this);
      var1.method22466(var4);

      for (ViaVersion7 var6 : this.field27941) {
         var6.method19342(var1);
      }
   }

   public void method19388(ViaVersion7 var1) {
      if (this.field27941 == null) {
         throw new NullPointerException("Tried to add protocol too early");
      } else {
         this.field27941.add(var1);
         var1.method19342(this.field27942);
         ArrayList var4 = new ArrayList();

         for (ViaVersion7 var6 : this.field27941) {
            if (Class9019.method33366(var6)) {
               var4.add(var6);
            }
         }

         this.field27941.removeAll(var4);
         this.field27941.addAll(var4);
      }
   }

   @Override
   public void method19369(Class2302 var1, Class187 var2, Class8563 var3) throws Exception {
      int var6 = var3.method30586();
      var3.method30575(var1, var2, 0, this.field27941, var1 == Class2302.field15717);
      super.method19369(var1, var2, var3);
      if (ViaVersion3.getInstance().method34425()) {
         this.method19389(var1, var2, var3, var6);
      }
   }

   private void method19389(Class2302 var1, Class187 var2, Class8563 var3, int var4) {
      int var7 = this.field27942.method22465().method18675();
      Class8006 var8 = ViaVersion3.method27613();
      String var9 = var3.method30580().method22465().method18679();
      String var10 = var9 == null ? "" : var9 + " ";
      var8.getLogger()
         .log(
            Level.INFO,
            "{0}{1} {2}: {3} (0x{4}) -> {5} (0x{6}) [{7}] {8}",
            new Object[]{
               var10, var1, var2, var4, Integer.toHexString(var4), var3.method30586(), Integer.toHexString(var3.method30586()), Integer.toString(var7), var3
            }
         );
   }

   public boolean method19390(Class<? extends ViaVersion7> var1) {
      for (ViaVersion7 var5 : this.field27941) {
         if (var5.getClass().equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public <P extends ViaVersion7> P method19391(Class<P> var1) {
      for (ViaVersion7 var5 : this.field27941) {
         if (var5.getClass() == var1) {
            return (P)var5;
         }
      }

      return null;
   }

   public boolean method19392(Object var1, List var2) throws Exception {
      for (ViaVersion7 var6 : this.field27941) {
         if (var6.method19345(var1.getClass())) {
            var6.method19346(this.field27942, var1, var2);
            return true;
         }
      }

      return false;
   }

   public List<ViaVersion7> method19393() {
      return this.field27941;
   }

   public void method19394() {
      this.method19393().clear();
      this.method19341();
   }
}
