// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Locale;
import com.google.common.base.Preconditions;
import java.util.HashMap;
import java.util.Map;

public abstract class Class6791 implements Class6792
{
    private final Map<String, Class5009> field26706;
    
    public Class6791() {
        this.field26706 = new HashMap<String, Class5009>();
        try {
            this.method20781();
        }
        catch (final Exception ex) {}
    }
    
    @Override
    public void method20773(final Class5009 class5009) throws Exception {
        if (class5009 == null) {
            throw new NullPointerException("command is marked non-null but is null");
        }
        Preconditions.checkArgument(class5009.method15225().matches("^[a-z0-9_-]{3,15}$"), (Object)(class5009.method15225() + " is not a valid sub-command name."));
        if (!this.method20774(class5009.method15225())) {
            this.field26706.put(class5009.method15225().toLowerCase(Locale.ROOT), class5009);
            return;
        }
        throw new Exception("ViaSubCommand " + class5009.method15225() + " does already exists!");
    }
    
    @Override
    public boolean method20774(final String s) {
        return this.field26706.containsKey(s.toLowerCase(Locale.ROOT));
    }
    
    @Override
    public Class5009 method20775(final String s) {
        return this.field26706.get(s.toLowerCase(Locale.ROOT));
    }
    
    @Override
    public boolean method20776(final Class7671 class7671, final String[] original) {
        if (original.length == 0) {
            this.method20778(class7671);
            return false;
        }
        if (!this.method20774(original[0])) {
            class7671.method24351(method20782("&cThis command does not exist."));
            this.method20778(class7671);
            return false;
        }
        final Class5009 method20775 = this.method20775(original[0]);
        if (this.method20780(class7671, method20775.method15231())) {
            final boolean method20776 = method20775.method15227(class7671, Arrays.copyOfRange(original, 1, original.length));
            if (!method20776) {
                class7671.method24351("Usage: /viaversion " + method20775.method15230());
            }
            return method20776;
        }
        class7671.method24351(method20782("&cYou are not allowed to use this command!"));
        return false;
    }
    
    @Override
    public List<String> method20777(final Class7671 class7671, final String[] original) {
        final Set<Class5009> method20779 = this.method20779(class7671);
        final ArrayList list = new ArrayList();
        if (original.length != 1) {
            if (original.length >= 2) {
                if (this.method20775(original[0]) != null) {
                    final Class5009 method20780 = this.method20775(original[0]);
                    if (method20779.contains(method20780)) {
                        final List<String> method20781 = method20780.method15232(class7671, Arrays.copyOfRange(original, 1, original.length));
                        Collections.sort((List<Comparable>)method20781);
                        return method20781;
                    }
                    return list;
                }
            }
        }
        else if (original[0].isEmpty()) {
            final Iterator iterator = method20779.iterator();
            while (iterator.hasNext()) {
                list.add(((Class5009)iterator.next()).method15225());
            }
        }
        else {
            for (final Class5009 class7672 : method20779) {
                if (!class7672.method15225().toLowerCase().startsWith(original[0].toLowerCase(Locale.ROOT))) {
                    continue;
                }
                list.add(class7672.method15225());
            }
        }
        return list;
    }
    
    public void method20778(final Class7671 class7671) {
        final Set<Class5009> method20779 = this.method20779(class7671);
        if (method20779.size() != 0) {
            class7671.method24351(method20782("&aViaVersion &c" + Class8563.method28793().method34745()));
            class7671.method24351(method20782("&6Commands:"));
            for (final Class5009 class7672 : method20779) {
                class7671.method24351(method20782(String.format("&2/viaversion %s &7- &6%s", class7672.method15230(), class7672.method15226())));
            }
            method20779.clear();
            return;
        }
        class7671.method24351(method20782("&cYou are not allowed to use these commands!"));
    }
    
    private Set<Class5009> method20779(final Class7671 class7671) {
        final HashSet set = new HashSet();
        for (final Class5009 class7672 : this.field26706.values()) {
            if (!this.method20780(class7671, class7672.method15231())) {
                continue;
            }
            set.add(class7672);
        }
        return set;
    }
    
    private boolean method20780(final Class7671 class7671, final String s) {
        return s == null || class7671.method24350(s);
    }
    
    private void method20781() throws Exception {
        this.method20773(new Class5010());
        this.method20773(new Class5017());
        this.method20773(new Class5014());
        this.method20773(new Class5008());
        this.method20773(new Class5016());
        this.method20773(new Class5012());
        this.method20773(new Class5011());
        this.method20773(new Class5015());
        this.method20773(new Class5013());
    }
    
    public static String method20782(String method955) {
        try {
            method955 = Class300.method955('&', method955);
        }
        catch (final Exception ex) {}
        return method955;
    }
    
    public static void method20783(final Class7671 class7671, final String format, final Object... args) {
        if (class7671 != null) {
            class7671.method24351(method20782((args != null) ? String.format(format, args) : format));
            return;
        }
        throw new NullPointerException("sender is marked non-null but is null");
    }
}
