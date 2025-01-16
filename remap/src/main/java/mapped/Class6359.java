// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;

import net.minecraft.util.text.ITextComponent;
import org.apache.logging.log4j.LogManager;
import java.util.Iterator;
import org.apache.logging.log4j.Logger;

public class Class6359 extends Class6354
{
    private static final Logger field25438;
    private Class6516 field25439;
    private CompoundNBT field25440;
    
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
    public void method18901(final CompoundNBT field25440) {
        if (this.field25439 != null) {
            this.method18938(field25440.getList("Objectives", 10));
            this.field25439.method19657(field25440.getList("PlayerScores", 10));
            if (field25440.contains("DisplaySlots", 10)) {
                this.method18937(field25440.getCompound("DisplaySlots"));
            }
            if (field25440.contains("Teams", 9)) {
                this.method18935(field25440.getList("Teams", 10));
            }
        }
        else {
            this.field25440 = field25440;
        }
    }
    
    public void method18935(final ListNBT class52) {
        for (int i = 0; i < class52.size(); ++i) {
            final CompoundNBT method346 = class52.method346(i);
            String s = method346.getString("Name");
            if (s.length() > 16) {
                s = s.substring(0, 16);
            }
            final Class6749 method347 = this.field25439.method19646(s);
            final ITextComponent method348 = Class5953.method17871(method346.getString("DisplayName"));
            if (method348 != null) {
                method347.method20542(method348);
            }
            if (method346.contains("TeamColor", 8)) {
                method347.method20562(TextFormatting.getValueByName(method346.getString("TeamColor")));
            }
            if (method346.contains("AllowFriendlyFire", 99)) {
                method347.method20551(method346.getBoolean("AllowFriendlyFire"));
            }
            if (method346.contains("SeeFriendlyInvisibles", 99)) {
                method347.method20553(method346.getBoolean("SeeFriendlyInvisibles"));
            }
            if (method346.contains("MemberNamePrefix", 8)) {
                final ITextComponent method349 = Class5953.method17871(method346.getString("MemberNamePrefix"));
                if (method349 != null) {
                    method347.method20543(method349);
                }
            }
            if (method346.contains("MemberNameSuffix", 8)) {
                final ITextComponent method350 = Class5953.method17871(method346.getString("MemberNameSuffix"));
                if (method350 != null) {
                    method347.method20545(method350);
                }
            }
            if (method346.contains("NameTagVisibility", 8)) {
                final Class2097 method351 = Class2097.method8218(method346.getString("NameTagVisibility"));
                if (method351 != null) {
                    method347.method20556(method351);
                }
            }
            if (method346.contains("DeathMessageVisibility", 8)) {
                final Class2097 method352 = Class2097.method8218(method346.getString("DeathMessageVisibility"));
                if (method352 != null) {
                    method347.method20557(method352);
                }
            }
            if (method346.contains("CollisionRule", 8)) {
                final Class343 method353 = Class343.method1021(method346.getString("CollisionRule"));
                if (method353 != null) {
                    method347.method20559(method353);
                }
            }
            this.method18936(method347, method346.getList("Players", 8));
        }
    }
    
    public void method18936(final Class6749 class6749, final ListNBT class6750) {
        for (int i = 0; i < class6750.size(); ++i) {
            this.field25439.method19615(class6750.method353(i), class6749);
        }
    }
    
    public void method18937(final CompoundNBT class51) {
        for (int i = 0; i < 19; ++i) {
            if (class51.contains("slot_" + i, 8)) {
                this.field25439.method19614(i, this.field25439.method19632(class51.getString("slot_" + i)));
            }
        }
    }
    
    public void method18938(final ListNBT class52) {
        for (int i = 0; i < class52.size(); ++i) {
            Class9456.method35137(class52.method346(i).getString("CriteriaName")).ifPresent(class54 -> {
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
    public CompoundNBT method18902(final CompoundNBT class51) {
        if (this.field25439 != null) {
            class51.put("Objectives", this.method18941());
            class51.put("PlayerScores", this.field25439.method19656());
            class51.put("Teams", this.method18939());
            this.method18940(class51);
            return class51;
        }
        Class6359.field25438.warn("Tried to save scoreboard without having a scoreboard...");
        return class51;
    }
    
    public ListNBT method18939() {
        final ListNBT class52 = new ListNBT();
        for (final Class6749 class53 : this.field25439.method19650()) {
            final CompoundNBT e = new CompoundNBT();
            e.putString("Name", class53.method20539());
            e.putString("DisplayName", Class5953.method17869(class53.method20540()));
            if (class53.getColor().getColorIndex() >= 0) {
                e.putString("TeamColor", class53.getColor().getFriendlyName());
            }
            e.putBoolean("AllowFriendlyFire", class53.method20550());
            e.putBoolean("SeeFriendlyInvisibles", class53.method20552());
            e.putString("MemberNamePrefix", Class5953.method17869(class53.method20544()));
            e.putString("MemberNameSuffix", Class5953.method17869(class53.method20546()));
            e.putString("NameTagVisibility", class53.method20554().field12152);
            e.putString("DeathMessageVisibility", class53.method20555().field12152);
            e.putString("CollisionRule", class53.method20558().field2117);
            final ListNBT class54 = new ListNBT();
            final Iterator<String> iterator2 = class53.method20547().iterator();
            while (iterator2.hasNext()) {
                ((AbstractList<StringNBT>)class54).add(StringNBT.method290(iterator2.next()));
            }
            e.put("Players", class54);
            ((AbstractList<CompoundNBT>)class52).add(e);
        }
        return class52;
    }
    
    public void method18940(final CompoundNBT class51) {
        final CompoundNBT class52 = new CompoundNBT();
        int n = 0;
        for (int i = 0; i < 19; ++i) {
            final Class9290 method19644 = this.field25439.method19644(i);
            if (method19644 != null) {
                class52.putString("slot_" + i, method19644.method34312());
                n = 1;
            }
        }
        if (n != 0) {
            class51.put("DisplaySlots", class52);
        }
    }
    
    public ListNBT method18941() {
        final ListNBT class52 = new ListNBT();
        for (final Class9290 class53 : this.field25439.method19638()) {
            if (class53.method34313() == null) {
                continue;
            }
            final CompoundNBT e = new CompoundNBT();
            e.putString("Name", class53.method34312());
            e.putString("CriteriaName", class53.method34313().method35139());
            e.putString("DisplayName", Class5953.method17869(class53.method34314()));
            e.putString("RenderType", class53.method34317().method902());
            ((AbstractList<CompoundNBT>)class52).add(e);
        }
        return class52;
    }
    
    static {
        field25438 = LogManager.getLogger();
    }
}
