// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import java.util.HashMap;
import com.google.gson.JsonParser;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import com.google.gson.JsonElement;
import com.google.gson.JsonArray;
import java.util.Locale;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.Map;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class7437 extends Class7422
{
    private static final Logger field28674;
    public long field28675;
    public String field28676;
    public String field28677;
    public String field28678;
    public Class2153 field28679;
    public String field28680;
    public String field28681;
    public List<Class7427> field28682;
    public Map<Integer, Class7424> field28683;
    public boolean field28684;
    public boolean field28685;
    public int field28686;
    public Class271 field28687;
    public int field28688;
    public String field28689;
    public int field28690;
    public String field28691;
    public Class7440 field28692;
    
    public Class7437() {
        this.field28692 = new Class7440();
    }
    
    public String method22871() {
        return this.field28678;
    }
    
    public String method22872() {
        return this.field28677;
    }
    
    public String method22873() {
        return this.field28689;
    }
    
    public void method22874(final String field28677) {
        this.field28677 = field28677;
    }
    
    public void method22875(final String field28678) {
        this.field28678 = field28678;
    }
    
    public void method22876(final Class7429 class7429) {
        final StringBuilder sb = new StringBuilder();
        int i = 0;
        for (final String str : class7429.field28647) {
            if (!str.equals(Class7847.method25357())) {
                String method28146;
                try {
                    method28146 = Class8428.method28146(str);
                }
                catch (final Exception ex) {
                    Class7437.field28674.error("Could not get name for " + str, (Throwable)ex);
                    continue;
                }
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(method28146);
                ++i;
            }
        }
        this.field28692.field28697 = String.valueOf(i);
        this.field28692.field28698 = sb.toString();
    }
    
    public static Class7437 method22877(final JsonObject jsonObject) {
        final Class7437 class7437 = new Class7437();
        try {
            class7437.field28675 = Class7610.method23909("id", jsonObject, -1L);
            class7437.field28676 = Class7610.method23907("remoteSubscriptionId", jsonObject, null);
            class7437.field28677 = Class7610.method23907("name", jsonObject, null);
            class7437.field28678 = Class7610.method23907("motd", jsonObject, null);
            class7437.field28679 = method22883(Class7610.method23907("state", jsonObject, Class2153.field12791.name()));
            class7437.field28680 = Class7610.method23907("owner", jsonObject, null);
            if (jsonObject.get("players") != null && jsonObject.get("players").isJsonArray()) {
                class7437.field28682 = method22879(jsonObject.get("players").getAsJsonArray());
                method22878(class7437);
            }
            else {
                class7437.field28682 = Lists.newArrayList();
            }
            class7437.field28686 = Class7610.method23908("daysLeft", jsonObject, 0);
            class7437.field28684 = Class7610.method23910("expired", jsonObject, false);
            class7437.field28685 = Class7610.method23910("expiredTrial", jsonObject, false);
            class7437.field28687 = method22884(Class7610.method23907("worldType", jsonObject, Class271.field1471.name()));
            class7437.field28681 = Class7610.method23907("ownerUUID", jsonObject, "");
            if (jsonObject.get("slots") != null && jsonObject.get("slots").isJsonArray()) {
                class7437.field28683 = method22880(jsonObject.get("slots").getAsJsonArray());
            }
            else {
                class7437.field28683 = method22881();
            }
            class7437.field28689 = Class7610.method23907("minigameName", jsonObject, null);
            class7437.field28688 = Class7610.method23908("activeSlot", jsonObject, -1);
            class7437.field28690 = Class7610.method23908("minigameId", jsonObject, -1);
            class7437.field28691 = Class7610.method23907("minigameImage", jsonObject, null);
        }
        catch (final Exception ex) {
            Class7437.field28674.error("Could not parse McoServer: " + ex.getMessage());
        }
        return class7437;
    }
    
    private static void method22878(final Class7437 class7437) {
        class7437.field28682.sort((class7438, class7439) -> ComparisonChain.start().compareFalseFirst(class7439.method22856(), class7438.method22856()).compare((Comparable)class7438.method22850().toLowerCase(Locale.ROOT), (Comparable)class7439.method22850().toLowerCase(Locale.ROOT)).result());
    }
    
    private static List<Class7427> method22879(final JsonArray jsonArray) {
        final ArrayList arrayList = Lists.newArrayList();
        for (final JsonElement jsonElement : jsonArray) {
            try {
                final JsonObject asJsonObject = jsonElement.getAsJsonObject();
                final Class7427 class7427 = new Class7427();
                class7427.method22851(Class7610.method23907("name", asJsonObject, null));
                class7427.method22853(Class7610.method23907("uuid", asJsonObject, null));
                class7427.method22855(Class7610.method23910("operator", asJsonObject, false));
                class7427.method22857(Class7610.method23910("accepted", asJsonObject, false));
                class7427.method22859(Class7610.method23910("online", asJsonObject, false));
                arrayList.add(class7427);
            }
            catch (final Exception ex) {}
        }
        return arrayList;
    }
    
    private static Map<Integer, Class7424> method22880(final JsonArray jsonArray) {
        final HashMap hashMap = Maps.newHashMap();
        for (final JsonElement jsonElement : jsonArray) {
            try {
                final JsonObject asJsonObject = jsonElement.getAsJsonObject();
                final JsonElement parse = new JsonParser().parse(asJsonObject.get("options").getAsString());
                Class7424 class7424;
                if (parse == null) {
                    class7424 = Class7424.method22838();
                }
                else {
                    class7424 = Class7424.method22841(parse.getAsJsonObject());
                }
                hashMap.put(Class7610.method23908("slotId", asJsonObject, -1), class7424);
            }
            catch (final Exception ex) {}
        }
        for (int i = 1; i <= 3; ++i) {
            if (!hashMap.containsKey(i)) {
                hashMap.put(i, Class7424.method22839());
            }
        }
        return hashMap;
    }
    
    private static Map<Integer, Class7424> method22881() {
        final HashMap hashMap = Maps.newHashMap();
        hashMap.put(1, Class7424.method22839());
        hashMap.put(2, Class7424.method22839());
        hashMap.put(3, Class7424.method22839());
        return hashMap;
    }
    
    public static Class7437 method22882(final String s) {
        Class7437 method22877 = new Class7437();
        try {
            method22877 = method22877(new JsonParser().parse(s).getAsJsonObject());
        }
        catch (final Exception ex) {
            Class7437.field28674.error("Could not parse McoServer: " + ex.getMessage());
        }
        return method22877;
    }
    
    private static Class2153 method22883(final String s) {
        try {
            return Class2153.valueOf(s);
        }
        catch (final Exception ex) {
            return Class2153.field12791;
        }
    }
    
    private static Class271 method22884(final String s) {
        try {
            return Class271.valueOf(s);
        }
        catch (final Exception ex) {
            return Class271.field1471;
        }
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(this.field28675).append((Object)this.field28677).append((Object)this.field28678).append((Object)this.field28679).append((Object)this.field28680).append(this.field28684).toHashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (o.getClass() == this.getClass()) {
            final Class7437 class7437 = (Class7437)o;
            return new EqualsBuilder().append(this.field28675, class7437.field28675).append((Object)this.field28677, (Object)class7437.field28677).append((Object)this.field28678, (Object)class7437.field28678).append((Object)this.field28679, (Object)class7437.field28679).append((Object)this.field28680, (Object)class7437.field28680).append(this.field28684, class7437.field28684).append((Object)this.field28687, (Object)this.field28687).isEquals();
        }
        return false;
    }
    
    public Class7437 clone() {
        final Class7437 class7437 = new Class7437();
        class7437.field28675 = this.field28675;
        class7437.field28676 = this.field28676;
        class7437.field28677 = this.field28677;
        class7437.field28678 = this.field28678;
        class7437.field28679 = this.field28679;
        class7437.field28680 = this.field28680;
        class7437.field28682 = this.field28682;
        class7437.field28683 = this.method22885(this.field28683);
        class7437.field28684 = this.field28684;
        class7437.field28685 = this.field28685;
        class7437.field28686 = this.field28686;
        class7437.field28692 = new Class7440();
        class7437.field28692.field28697 = this.field28692.field28697;
        class7437.field28692.field28698 = this.field28692.field28698;
        class7437.field28687 = this.field28687;
        class7437.field28681 = this.field28681;
        class7437.field28689 = this.field28689;
        class7437.field28688 = this.field28688;
        class7437.field28690 = this.field28690;
        class7437.field28691 = this.field28691;
        return class7437;
    }
    
    public Map<Integer, Class7424> method22885(final Map<Integer, Class7424> map) {
        final HashMap hashMap = Maps.newHashMap();
        for (final Map.Entry<Object, V> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), ((Class7424)entry.getValue()).clone());
        }
        return hashMap;
    }
    
    static {
        field28674 = LogManager.getLogger();
    }
}
