package mapped;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import javax.annotation.Nullable;
import java.util.*;
import java.util.Map.Entry;

public class Class2006 implements Comparable<Class2006> {
   private final Map<String, Class9599> field13061 = Maps.newHashMap();
   private String[][] field13062 = new String[0][];

   public void method8488(Map<String, Class9181> var1, String[][] var2) {
      Set<String> var5 = var1.keySet();
      this.field13061.entrySet().removeIf(var1x -> !var5.contains(var1x.getKey()));

      for (String var7 : var5) {
         if (!this.field13061.containsKey(var7)) {
            this.field13061.put(var7, new Class9599());
         }
      }

      this.field13062 = var2;
   }

   public boolean method8489() {
      if (this.field13062.length == 0) {
         return false;
      } else {
         for (String[] var6 : this.field13062) {
            boolean var7 = false;

            for (String var11 : var6) {
               Class9599 var12 = this.method8495(var11);
               if (var12 != null && var12.method37263()) {
                  var7 = true;
                  break;
               }
            }

            if (!var7) {
               return false;
            }
         }

         return true;
      }
   }

   public boolean method8490() {
      for (Class9599 var4 : this.field13061.values()) {
         if (var4.method37263()) {
            return true;
         }
      }

      return false;
   }

   public boolean method8491(String var1) {
      Class9599 var4 = this.field13061.get(var1);
      if (var4 != null && !var4.method37263()) {
         var4.method37264();
         return true;
      } else {
         return false;
      }
   }

   public boolean method8492(String var1) {
      Class9599 var4 = this.field13061.get(var1);
      if (var4 != null && var4.method37263()) {
         var4.method37265();
         return true;
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "AdvancementProgress{criteria=" + this.field13061 + ", requirements=" + Arrays.deepToString(this.field13062) + '}';
   }

   public void method8493(PacketBuffer var1) {
      var1.writeVarInt(this.field13061.size());

      for (Entry var5 : this.field13061.entrySet()) {
         var1.method35729((String)var5.getKey());
         ((Class9599)var5.getValue()).method37267(var1);
      }
   }

   public static Class2006 method8494(PacketBuffer var0) {
      Class2006 var3 = new Class2006();
      int var4 = var0.method35714();

      for (int var5 = 0; var5 < var4; var5++) {
         var3.field13061.put(var0.method35728(32767), Class9599.method37269(var0));
      }

      return var3;
   }

   @Nullable
   public Class9599 method8495(String var1) {
      return this.field13061.get(var1);
   }

   public float method8496() {
      if (!this.field13061.isEmpty()) {
         float var3 = (float)this.field13062.length;
         float var4 = (float)this.method8498();
         return var4 / var3;
      } else {
         return 0.0F;
      }
   }

   @Nullable
   public String method8497() {
      if (!this.field13061.isEmpty()) {
         int var3 = this.field13062.length;
         if (var3 > 1) {
            int var4 = this.method8498();
            return var4 + "/" + var3;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private int method8498() {
      int var3 = 0;

      for (String[] var7 : this.field13062) {
         boolean var8 = false;

         for (String var12 : var7) {
            Class9599 var13 = this.method8495(var12);
            if (var13 != null && var13.method37263()) {
               var8 = true;
               break;
            }
         }

         if (var8) {
            var3++;
         }
      }

      return var3;
   }

   public Iterable<String> method8499() {
      ArrayList var3 = Lists.newArrayList();

      for (Entry var5 : this.field13061.entrySet()) {
         if (!((Class9599)var5.getValue()).method37263()) {
            var3.add(var5.getKey());
         }
      }

      return var3;
   }

   public Iterable<String> method8500() {
      ArrayList var3 = Lists.newArrayList();

      for (Entry var5 : this.field13061.entrySet()) {
         if (((Class9599)var5.getValue()).method37263()) {
            var3.add(var5.getKey());
         }
      }

      return var3;
   }

   @Nullable
   public Date method8501() {
      Date var3 = null;

      for (Class9599 var5 : this.field13061.values()) {
         if (var5.method37263() && (var3 == null || var5.method37266().before(var3))) {
            var3 = var5.method37266();
         }
      }

      return var3;
   }

   public int compareTo(Class2006 var1) {
      Date var4 = this.method8501();
      Date var5 = var1.method8501();
      if (var4 == null && var5 != null) {
         return 1;
      } else if (var4 != null && var5 == null) {
         return -1;
      } else {
         return var4 == null && var5 == null ? 0 : var4.compareTo(var5);
      }
   }

   // $VF: synthetic method
   public static Map<String, Class9599> method8503(Class2006 var0) {
      return var0.field13061;
   }
}
