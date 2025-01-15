// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import org.apache.logging.log4j.Logger;

public class Class6359 extends Class6354
{
    private static final Logger field25438;
    private Class6516 field25439;
    private Class51 field25440;
    
    public Class6359() {
        super("scoreboard");
    }
    
    public void method18934(final Class6516 field25439) {
        this.field25439 = field25439;
        if (this.field25440 != null) {
            this.method18901(this.field25440);
        }
    }
    
    @Override
    public void method18901(final Class51 field25440) {
        if (this.field25439 != null) {
            this.method18938(field25440.method328("Objectives", 10));
            this.field25439.method19657(field25440.method328("PlayerScores", 10));
            if (field25440.method316("DisplaySlots", 10)) {
                this.method18937(field25440.method327("DisplaySlots"));
            }
            if (field25440.method316("Teams", 9)) {
                this.method18935(field25440.method328("Teams", 10));
            }
        }
        else {
            this.field25440 = field25440;
        }
    }
    
    public void method18935(final Class52 class52) {
        for (int i = 0; i < class52.size(); ++i) {
            final Class51 method346 = class52.method346(i);
            String s = method346.method323("Name");
            if (s.length() > 16) {
                s = s.substring(0, 16);
            }
            final Class6749 method347 = this.field25439.method19646(s);
            final Class2250 method348 = Class5953.method17871(method346.method323("DisplayName"));
            if (method348 != null) {
                method347.method20542(method348);
            }
            if (method346.method316("TeamColor", 8)) {
                method347.method20562(Class2116.method8260(method346.method323("TeamColor")));
            }
            if (method346.method316("AllowFriendlyFire", 99)) {
                method347.method20551(method346.method329("AllowFriendlyFire"));
            }
            if (method346.method316("SeeFriendlyInvisibles", 99)) {
                method347.method20553(method346.method329("SeeFriendlyInvisibles"));
            }
            if (method346.method316("MemberNamePrefix", 8)) {
                final Class2250 method349 = Class5953.method17871(method346.method323("MemberNamePrefix"));
                if (method349 != null) {
                    method347.method20543(method349);
                }
            }
            if (method346.method316("MemberNameSuffix", 8)) {
                final Class2250 method350 = Class5953.method17871(method346.method323("MemberNameSuffix"));
                if (method350 != null) {
                    method347.method20545(method350);
                }
            }
            if (method346.method316("NameTagVisibility", 8)) {
                final Class2097 method351 = Class2097.method8218(method346.method323("NameTagVisibility"));
                if (method351 != null) {
                    method347.method20556(method351);
                }
            }
            if (method346.method316("DeathMessageVisibility", 8)) {
                final Class2097 method352 = Class2097.method8218(method346.method323("DeathMessageVisibility"));
                if (method352 != null) {
                    method347.method20557(method352);
                }
            }
            if (method346.method316("CollisionRule", 8)) {
                final Class343 method353 = Class343.method1021(method346.method323("CollisionRule"));
                if (method353 != null) {
                    method347.method20559(method353);
                }
            }
            this.method18936(method347, method346.method328("Players", 8));
        }
    }
    
    public void method18936(final Class6749 class6749, final Class52 class6750) {
        for (int i = 0; i < class6750.size(); ++i) {
            this.field25439.method19615(class6750.method353(i), class6749);
        }
    }
    
    public void method18937(final Class51 class51) {
        for (int i = 0; i < 19; ++i) {
            if (class51.method316("slot_" + i, 8)) {
                this.field25439.method19614(i, this.field25439.method19632(class51.method323("slot_" + i)));
            }
        }
    }
    
    public void method18938(final Class52 class52) {
        for (int i = 0; i < class52.size(); ++i) {
            Class9456.method35137(class52.method346(i).method323("CriteriaName")).ifPresent(class54 -> {
                class53.method323("Name");
                String substring = null;
                if (substring.length() > 16) {
                    substring = substring.substring(0, 16);
                }
                this.field25439.method19633(substring, class54, Class5953.method17871(class53.method323("DisplayName")), Class263.method903(class53.method323("RenderType")));
                return;
            });
        }
    }
    
    @Override
    public Class51 method18902(final Class51 class51) {
        if (this.field25439 != null) {
            class51.method295("Objectives", this.method18941());
            class51.method295("PlayerScores", this.field25439.method19656());
            class51.method295("Teams", this.method18939());
            this.method18940(class51);
            return class51;
        }
        Class6359.field25438.warn("Tried to save scoreboard without having a scoreboard...");
        return class51;
    }
    
    public Class52 method18939() {
        final Class52 class52 = new Class52();
        for (final Class6749 class53 : this.field25439.method19650()) {
            final Class51 e = new Class51();
            e.method306("Name", class53.method20539());
            e.method306("DisplayName", Class5953.method17869(class53.method20540()));
            if (class53.method20563().method8253() >= 0) {
                e.method306("TeamColor", class53.method20563().method8258());
            }
            e.method312("AllowFriendlyFire", class53.method20550());
            e.method312("SeeFriendlyInvisibles", class53.method20552());
            e.method306("MemberNamePrefix", Class5953.method17869(class53.method20544()));
            e.method306("MemberNameSuffix", Class5953.method17869(class53.method20546()));
            e.method306("NameTagVisibility", class53.method20554().field12152);
            e.method306("DeathMessageVisibility", class53.method20555().field12152);
            e.method306("CollisionRule", class53.method20558().field2117);
            final Class52 class54 = new Class52();
            final Iterator<String> iterator2 = class53.method20547().iterator();
            while (iterator2.hasNext()) {
                ((AbstractList<Class50>)class54).add(Class50.method290(iterator2.next()));
            }
            e.method295("Players", class54);
            ((AbstractList<Class51>)class52).add(e);
        }
        return class52;
    }
    
    public void method18940(final Class51 class51) {
        final Class51 class52 = new Class51();
        int n = 0;
        for (int i = 0; i < 19; ++i) {
            final Class9290 method19644 = this.field25439.method19644(i);
            if (method19644 != null) {
                class52.method306("slot_" + i, method19644.method34312());
                n = 1;
            }
        }
        if (n != 0) {
            class51.method295("DisplaySlots", class52);
        }
    }
    
    public Class52 method18941() {
        final Class52 class52 = new Class52();
        for (final Class9290 class53 : this.field25439.method19638()) {
            if (class53.method34313() == null) {
                continue;
            }
            final Class51 e = new Class51();
            e.method306("Name", class53.method34312());
            e.method306("CriteriaName", class53.method34313().method35139());
            e.method306("DisplayName", Class5953.method17869(class53.method34314()));
            e.method306("RenderType", class53.method34317().method902());
            ((AbstractList<Class51>)class52).add(e);
        }
        return class52;
    }
    
    static {
        field25438 = LogManager.getLogger();
    }
}
