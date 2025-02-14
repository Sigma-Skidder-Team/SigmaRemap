package mapped;

import java.util.*;

public class Class4500 extends Class4499 {
   public Map<Class<? extends Object>, Class9545> field21724 = Collections.<Class<? extends Object>, Class9545>emptyMap();

   public Class4500() {
      this.field21711.put(null, new Class6185(this));
   }

   public Class9545 method14207(Class9545 var1) {
      if (Collections.EMPTY_MAP == this.field21724) {
         this.field21724 = new HashMap<Class<? extends Object>, Class9545>();
      }

      if (var1.method36939() != null) {
         this.method14204(var1.method36942(), var1.method36939());
      }

      var1.method36954(this.method14201());
      return this.field21724.put(var1.method36942(), var1);
   }

   @Override
   public void method14200(Class8923 var1) {
      super.method14200(var1);

      for (Class9545 var6 : this.field21724.values()) {
         var6.method36954(var1);
      }
   }

   public Class7254 method14208(Set<Class2013> var1, Object var2) {
      ArrayList var5 = new ArrayList(var1.size());
      Class9757 var6 = this.field21720.get(var2.getClass());
      Class9757 var7 = var6 == null ? new Class9757((Class<? extends Object>)var2.getClass()) : var6;
      Class7254 var8 = new Class7254(var7, var5, Class2214.field14477);
      this.field21716.put(var2, var8);
      Class2214 var9 = Class2214.field14475;

      for (Class2013 var11 : var1) {
         Object var12 = var11.method8543(var2);
         Class9757 var13 = var12 != null ? this.field21720.get(var12.getClass()) : null;
         Class9460 var14 = this.method14209(var2, var11, var12, var13);
         if (var14 != null) {
            if (!((Class7256)var14.method36417()).method22792()) {
               var9 = Class2214.field14476;
            }

            Class7255 var15 = var14.method36418();
            if (!(var15 instanceof Class7256) || !((Class7256)var15).method22792()) {
               var9 = Class2214.field14476;
            }

            var5.add(var14);
         }
      }

      if (this.field21715 == Class2214.field14477) {
         var8.method22773(var9);
      } else {
         var8.method22773(this.field21715);
      }

      return var8;
   }

   public Class9460 method14209(Object var1, Class2013 var2, Object var3, Class9757 var4) {
      Class7256 var7 = (Class7256)this.method14191(var2.method8539());
      boolean var8 = this.field21716.containsKey(var3);
      Class7255 var9 = this.method14191(var3);
      if (var3 != null && !var8) {
         Class2048 var10 = var9.method22769();
         if (var4 == null) {
            if (var10 != Class2048.field13364) {
               if (var10 == Class2048.field13366
                  && var2.method8537() == var3.getClass()
                  && !(var3 instanceof Map)
                  && !var9.method22780().equals(Class9757.field45633)) {
                  var9.method22783(Class9757.field45644);
               }

               this.method14210(var2, var9, var3);
            } else if (var2.method8537() == var3.getClass() && var3 instanceof Enum) {
               var9.method22783(Class9757.field45642);
            }
         }
      }

      return new Class9460(var7, var9);
   }

   public void method14210(Class2013 var1, Class7255 var2, Object var3) {
      if (!var3.getClass().isArray() || !var3.getClass().getComponentType().isPrimitive()) {
         Class[] var6 = var1.method8538();
         if (var6 != null) {
            if (var2.method22769() != Class2048.field13365) {
               if (!(var3 instanceof Set)) {
                  if (var3 instanceof Map) {
                     Class var7 = var6[0];
                     Class var8 = var6[1];
                     Class7254 var9 = (Class7254)var2;

                     for (Class9460 var11 : var9.method22770()) {
                        this.method14211(var7, var11.method36417());
                        this.method14211(var8, var11.method36418());
                     }
                  }
               } else {
                  Class var15 = var6[0];
                  Class7254 var17 = (Class7254)var2;
                  Iterator var19 = var17.method22770().iterator();

                  for (Object var12 : (Set)var3) {
                     Class9460 var13 = (Class9460)var19.next();
                     Class7255 var14 = var13.method36417();
                     if (var15.equals(var12.getClass()) && var14.method22769() == Class2048.field13366) {
                        var14.method22783(Class9757.field45644);
                     }
                  }
               }
            } else {
               Class var16 = var6[0];
               Class7252 var18 = (Class7252)var2;
               List<?> var20 = Collections.EMPTY_LIST;
               if (!var3.getClass().isArray()) {
                  if (var3 instanceof Iterable) {
                     var20 = (List<?>) var3;
                  }
               } else {
                  var20 = Arrays.asList((Object[])var3);
               }

               Iterator<?> var22 = var20.iterator();
               if (var22.hasNext()) {
                  for (Class7255 var25 : var18.method22770()) {
                     Object var26 = var22.next();
                     if (var26 != null && var16.equals(var26.getClass()) && var25.method22769() == Class2048.field13366) {
                        var25.method22783(Class9757.field45644);
                     }
                  }
               }
            }
         }
      }
   }

   private void method14211(Class<? extends Object> var1, Class7255 var2) {
      Class9757 var5 = var2.method22780();
      if (var5.method38343(var1)) {
         if (!Enum.class.isAssignableFrom(var1)) {
            var2.method22783(Class9757.field45644);
         } else {
            var2.method22783(Class9757.field45642);
         }
      }
   }

   public Set<Class2013> method14212(Class<? extends Object> var1) {
      return !this.field21724.containsKey(var1) ? this.method14201().method32614(var1) : this.field21724.get(var1).method36957();
   }
}
