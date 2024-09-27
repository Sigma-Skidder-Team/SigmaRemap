package mapped;

import com.google.common.cache.CacheBuilder;
import com.google.common.collect.Sets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class Class6057 extends Class6036 {
   private final Map<Integer, UUID> field26278 = new ConcurrentHashMap<Integer, UUID>();
   private final Map<Integer, List<Class8656>> field26279 = new ConcurrentHashMap<Integer, List<Class8656>>();
   private final Map<Integer, Integer> field26280 = new ConcurrentHashMap<Integer, Integer>();
   private final Map<Integer, Class6852> field26281 = new ConcurrentHashMap<Integer, Class6852>();
   private final Set<Integer> field26282 = Sets.newConcurrentHashSet();
   private final Set<Integer> field26283 = Sets.newConcurrentHashSet();
   private final Set<Class9695> field26284 = Collections.<Class9695>newSetFromMap(
      CacheBuilder.newBuilder().maximumSize(10L).expireAfterAccess(250L, TimeUnit.MILLISECONDS).<Class9695, Boolean>build().asMap()
   );
   private boolean field26285 = false;
   private boolean field26286 = false;
   private Class9695 field26287 = null;
   private boolean field26288 = false;
   private Class2069 field26289;
   private String field26290;

   public Class6057(Class7161 var1) {
      super(var1, Class1872.field10733);
   }

   public UUID method18743(int var1) {
      UUID var4 = this.field26278.get(var1);
      if (var4 == null) {
         var4 = UUID.randomUUID();
         this.field26278.put(var1, var4);
      }

      return var4;
   }

   public void method18744(Class9738 var1) {
      this.method18745(this.method18670(), var1);
   }

   public void method18745(int var1, Class9738 var2) {
      Class8563 var5 = new Class8563(60, null, this.method18672());
      var5.method30560(BruhMotha.field22544, var1);
      var5.method30560(BruhMotha.field22544, 1);
      var5.method30560(BruhMotha.field22561, var2);

      try {
         var5.method30570(Class6363.class);
      } catch (Exception var7) {
         var7.printStackTrace();
      }
   }

   @Override
   public void method18665(int var1) {
      super.method18665(var1);
      this.field26280.remove(var1);
      this.field26278.remove(var1);
      this.field26282.remove(var1);
      this.field26283.remove(var1);
      this.field26279.remove(var1);
      Class6852 var4 = this.field26281.remove(var1);
      if (var4 != null) {
         var4.method20882();
         ViaVersion3.getInstance().method34424().<Class5415>method31084(Class5415.class).method17011(this.method18672(), var4.method20884());
      }
   }

   public boolean method18746(int var1, int var2, int var3) {
      return this.field26284.contains(new Class9695(var1, (short)var2, var3));
   }

   public void method18747(Class9695 var1) {
      this.field26284.add(var1);
   }

   public void method18748(int var1, List<Class8656> var2) {
      Class1867 var5 = this.method18668(var1);
      if (var5 != null) {
         for (Class8656 var7 : new ArrayList<>(var2)) {
            if (var5 == Class1872.field10705 && var7.method31148() == 10) {
               var2.remove(var7);
            }

            if (var5 == Class1872.field10704 && var7.method31148() == 11) {
               var2.remove(var7);
            }

            if (var5 == Class1872.field10692 && this.method18749(var2, 12) == null) {
               var2.add(new Class8656(12, Class1950.field12636, true));
            }

            if (var5 == Class1872.field10721 && var7.method31148() == 16 && (Integer)var7.method31152() == Integer.MIN_VALUE) {
               var7.method31154(0);
            }

            if (var5 == Class1872.field10733) {
               if (var7.method31148() == 0) {
                  byte var8 = (Byte)var7.method31152();
                  if (var1 != this.method18753() && ViaVersion3.method27612().method21895()) {
                     if ((var8 & 16) == 16) {
                        if (this.field26282.contains(var1)) {
                           Class9738 var9 = new Class9738(442, (byte)1, (short)0, null);
                           this.method18745(var1, var9);
                        } else {
                           this.method18745(var1, null);
                        }
                     } else {
                        this.method18745(var1, null);
                     }
                  }
               }

               if (var7.method31148() == 12 && ViaVersion3.method27612().setLeftHandedHandling()) {
                  var2.add(new Class8656(13, Class1950.field12630, (byte)((((byte) var7.method31152()) & 128) != 0 ? 0 : 1)));
               }
            }

            if (var5 == Class1872.field10681 && ViaVersion3.method27612().method21896() && var7.method31148() == 0 && this.method18749(var2, 10) != null) {
               Class8656 var13 = this.method18749(var2, 10);
               byte var18 = (Byte)var7.method31152();
               if ((var18 & 32) == 32
                  && ((Byte)var13.method31152() & 1) == 1
                  && !((String)this.method18749(var2, 2).method31152()).isEmpty()
                  && (Boolean)this.method18749(var2, 3).method31152()
                  && !this.field26283.contains(var1)) {
                  this.field26283.add(var1);

                  try {
                     Class8563 var10 = new Class8563(37, null, this.method18672());
                     var10.method30560(BruhMotha.field22544, var1);
                     var10.method30560(BruhMotha.field22534, (short)0);
                     var10.method30560(BruhMotha.field22534, (short)((int)(128.0 * ViaVersion3.method27612().method21900() * 32.0)));
                     var10.method30560(BruhMotha.field22534, (short)0);
                     var10.method30560(BruhMotha.field22524, true);
                     var10.method30568(Class6363.class, true, false);
                  } catch (Exception var12) {
                  }
               }
            }

            if (ViaVersion3.method27612().method21898() && (var5 == Class1872.field10704 || var5 == Class1872.field10705)) {
               if (var7.method31148() == 2) {
                  Class6852 var14 = this.field26281.get(var1);
                  String var19 = (String)var7.method31152();
                  var19 = var19.isEmpty() ? (var5 == Class1872.field10704 ? "Ender Dragon" : "Wither") : var19;
                  if (var14 == null) {
                     var14 = ViaVersion3.method27611().method33420(var19, Class2080.field13546, Class2326.field15917);
                     this.field26281.put(var1, var14);
                     var14.method20871(this.method18672());
                     var14.method20881();
                     ViaVersion3.getInstance().method34424().<Class5415>method31084(Class5415.class).method17010(this.method18672(), var14.method20884());
                  } else {
                     var14.method20862(var19);
                  }
               } else if (var7.method31148() == 6 && !ViaVersion3.method27612().method21899()) {
                  Class6852 var16 = this.field26281.get(var1);
                  float var21 = var5 == Class1872.field10704 ? 200.0F : 300.0F;
                  float var22 = Math.max(0.0F, Math.min((Float)var7.method31152() / var21, 1.0F));
                  if (var16 == null) {
                     String var11 = var5 == Class1872.field10704 ? "Ender Dragon" : "Wither";
                     var16 = ViaVersion3.method27611().method33421(var11, var22, Class2080.field13546, Class2326.field15917);
                     this.field26281.put(var1, var16);
                     var16.method20871(this.method18672());
                     var16.method20881();
                     ViaVersion3.getInstance().method34424().<Class5415>method31084(Class5415.class).method17010(this.method18672(), var16.method20884());
                  } else {
                     var16.method20864(var22);
                  }
               }
            }
         }
      }
   }

   public Class8656 method18749(List<Class8656> var1, int var2) {
      for (Class8656 var6 : var1) {
         if (var2 == var6.method31148()) {
            return var6;
         }
      }

      return null;
   }

   public void method18750(boolean var1, boolean var2) {
      Class8563 var5 = new Class8563(65, null, this.method18672());
      var5.method30560(BruhMotha.field22539, "viaversion");
      if (var1) {
         if (!this.field26288) {
            var5.method30560(BruhMotha.field22518, (byte)0);
            var5.method30560(BruhMotha.field22539, "viaversion");
            var5.method30560(BruhMotha.field22539, "§f");
            var5.method30560(BruhMotha.field22539, "");
            var5.method30560(BruhMotha.field22518, (byte)0);
            var5.method30560(BruhMotha.field22539, "");
            var5.method30560(BruhMotha.field22539, "never");
            var5.method30560(BruhMotha.field22518, (byte)15);
         } else {
            var5.method30560(BruhMotha.field22518, (byte)3);
         }

         var5.method30560(BruhMotha.field22540, new String[]{this.method18672().method22465().method18679()});
      } else {
         var5.method30560(BruhMotha.field22518, (byte)1);
      }

      this.field26288 = var1;

      try {
         var5.method30568(Class6363.class, true, var2);
      } catch (Exception var7) {
         var7.printStackTrace();
      }
   }

   public void method18751(int var1, List<Class8656> var2) {
      List var5 = this.field26279.get(var1);
      if (var5 == null) {
         this.field26279.put(var1, var2);
      } else {
         var5.addAll(var2);
      }
   }

   public void method18752(int var1) {
      List var4 = this.field26279.get(var1);
      if (var4 != null) {
         Class8563 var5 = new Class8563(57, null, this.method18672());
         var5.method30560(BruhMotha.field22544, var1);
         var5.method30560(Class7593.field32598, var4);
         this.method18672()
            .method22465()
            .method18683()
            .<Class6363>method19391(Class6363.class)
            .<Class6912>method19373(Class6912.class)
            .method21090(var1, var4, this.method18672());
         this.method18748(var1, var4);
         if (!var4.isEmpty()) {
            try {
               var5.method30570(Class6363.class);
            } catch (Exception var7) {
               var7.printStackTrace();
            }
         }

         this.field26279.remove(var1);
      }
   }

   public int method18753() {
      try {
         return ViaVersion3.getInstance().method34424().<Class5401>method31084(Class5401.class).method16982(this.method18672());
      } catch (Exception var4) {
         return this.method18670();
      }
   }

   public Map<Integer, UUID> method18754() {
      return this.field26278;
   }

   public Map<Integer, List<Class8656>> method18755() {
      return this.field26279;
   }

   public Map<Integer, Integer> method18756() {
      return this.field26280;
   }

   public Map<Integer, Class6852> method18757() {
      return this.field26281;
   }

   public Set<Integer> method18758() {
      return this.field26282;
   }

   public Set<Integer> method18759() {
      return this.field26283;
   }

   public Set<Class9695> method18760() {
      return this.field26284;
   }

   public boolean method18761() {
      return this.field26285;
   }

   public void method18762(boolean var1) {
      this.field26285 = var1;
   }

   public boolean method18763() {
      return this.field26286;
   }

   public void method18764(boolean var1) {
      this.field26286 = var1;
   }

   public Class9695 method18765() {
      return this.field26287;
   }

   public void method18766(Class9695 var1) {
      this.field26287 = var1;
   }

   public boolean method18767() {
      return this.field26288;
   }

   public Class2069 method18768() {
      return this.field26289;
   }

   public void method18769(Class2069 var1) {
      this.field26289 = var1;
   }

   public String method18770() {
      return this.field26290;
   }

   public void method18771(String var1) {
      this.field26290 = var1;
   }
}
