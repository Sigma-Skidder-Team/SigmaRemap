package mapped;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class Class9766 {
   private final Class8474 field45690;
   private final Class7358 field45691;
   private boolean field45692;
   private boolean field45693;
   private Class2148 field45694;
   private Map<String, String> field45695;
   private Set<Class7255> field45696;
   private Map<Class7255, String> field45697;
   private Class7391 field45698;
   private Boolean field45699;
   private Class9757 field45700;

   public Class9766(Class8474 var1, Class7358 var2, Class8324 var3, Class9757 var4) {
      this.field45690 = var1;
      this.field45691 = var2;
      this.field45692 = var3.method29174();
      this.field45693 = var3.method29176();
      if (var3.method29161() != null) {
         this.field45694 = var3.method29161();
      }

      this.field45695 = var3.method29178();
      this.field45696 = new HashSet<Class7255>();
      this.field45697 = new HashMap<Class7255, String>();
      this.field45698 = var3.method29184();
      this.field45699 = null;
      this.field45700 = var4;
   }

   public void method38406() throws IOException {
      if (this.field45699 != null) {
         if (!Boolean.TRUE.equals(this.field45699)) {
            throw new Class2485("serializer is already opened");
         } else {
            throw new Class2485("serializer is closed");
         }
      } else {
         this.field45690.method29888(new Class5933(null, null));
         this.field45699 = Boolean.FALSE;
      }
   }

   public void method38407() throws IOException {
      if (this.field45699 != null) {
         if (!Boolean.TRUE.equals(this.field45699)) {
            this.field45690.method29888(new Class5937(null, null));
            this.field45699 = Boolean.TRUE;
         }
      } else {
         throw new Class2485("serializer is not opened");
      }
   }

   public void method38408(Class7255 var1) throws IOException {
      if (this.field45699 != null) {
         if (!this.field45699) {
            this.field45690.method29888(new Class5938(null, null, this.field45692, this.field45694, this.field45695));
            this.method38409(var1);
            if (this.field45700 != null) {
               var1.method22783(this.field45700);
            }

            this.method38410(var1, null);
            this.field45690.method29888(new Class5932(null, null, this.field45693));
            this.field45696.clear();
            this.field45697.clear();
         } else {
            throw new Class2485("serializer is closed");
         }
      } else {
         throw new Class2485("serializer is not opened");
      }
   }

   private void method38409(Class7255 var1) {
      if (var1.method22769() == Class2048.field13367) {
         var1 = ((Class7257)var1).method22793();
      }

      if (this.field45697.containsKey(var1)) {
         String var4 = this.field45697.get(var1);
         if (null == var4) {
            var4 = this.field45698.method23609(var1);
            this.field45697.put(var1, var4);
         }
      } else {
         this.field45697.put(var1, null);
         switch (Class7715.field33111[var1.method22769().ordinal()]) {
            case 1:
               Class7252 var13 = (Class7252)var1;

               for (Class7255 var15 : var13.method22770()) {
                  this.method38409(var15);
               }
               break;
            case 2:
               Class7254 var6 = (Class7254)var1;

               for (Class9460 var9 : var6.method22770()) {
                  Class7255 var10 = var9.method36417();
                  Class7255 var11 = var9.method36418();
                  this.method38409(var10);
                  this.method38409(var11);
               }
         }
      }
   }

   private void method38410(Class7255 var1, Class7255 var2) throws IOException {
      if (var1.method22769() == Class2048.field13367) {
         var1 = ((Class7257)var1).method22793();
      }

      String var5 = this.field45697.get(var1);
      if (this.field45696.contains(var1)) {
         this.field45690.method29888(new Class5929(var5, null, null));
      } else {
         this.field45696.add(var1);
         switch (Class7715.field33111[var1.method22769().ordinal()]) {
            case 1:
               Class7252 var11 = (Class7252)var1;
               boolean var12 = var1.method22780().equals(this.field45691.method23355(Class2048.field13365, null, true));
               this.field45690.method29888(new Class5927(var5, var1.method22780().method38339(), var12, null, null, var11.method22772()));

               for (Class7255 var23 : var11.method22770()) {
                  this.method38410(var23, var1);
               }

               this.field45690.method29888(new Class5935(null, null));
               break;
            case 3:
               Class7256 var6 = (Class7256)var1;
               Class9757 var7 = this.field45691.method23355(Class2048.field13364, var6.method22791(), true);
               Class9757 var8 = this.field45691.method23355(Class2048.field13364, var6.method22791(), false);
               Class7813 var9 = new Class7813(var1.method22780().equals(var7), var1.method22780().equals(var8));
               Class5930 var10 = new Class5930(var5, var1.method22780().method38339(), var9, var6.method22791(), null, null, var6.method22790());
               this.field45690.method29888(var10);
               break;
            default:
               Class9757 var14 = this.field45691.method23355(Class2048.field13366, null, true);
               boolean var15 = var1.method22780().equals(var14);
               this.field45690.method29888(new Class5939(var5, var1.method22780().method38339(), var15, null, null, ((Class7253)var1).method22772()));
               Class7254 var16 = (Class7254)var1;

               for (Class9460 var19 : var16.method22770()) {
                  Class7255 var20 = var19.method36417();
                  Class7255 var21 = var19.method36418();
                  this.method38410(var20, var16);
                  this.method38410(var21, var16);
               }

               this.field45690.method29888(new Class5936(null, null));
         }
      }
   }
}
