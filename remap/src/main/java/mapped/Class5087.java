// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class5087 extends Class5046
{
    private static final Logger field21962;
    private final Class5046 field21963;
    private final Class5079 field21964;
    private Class7437 field21965;
    private final long field21966;
    private String field21967;
    private final String field21968;
    private int field21969;
    private int field21970;
    private final int field21971 = 80;
    private final int field21972 = 5;
    private static final List<Integer> field21973;
    private static final List<Integer> field21974;
    private static final List<Integer> field21975;
    private static final List<Integer> field21976;
    private final List<Integer> field21977;
    private int field21978;
    
    public Class5087(final Class5046 field21963, final Class5079 field21964, final long field21965) {
        this.field21967 = Class5046.method15438("mco.brokenworld.title");
        this.field21968 = Class5046.method15438("mco.brokenworld.message.line1") + "\\n" + Class5046.method15438("mco.brokenworld.message.line2");
        this.field21977 = Lists.newArrayList();
        this.field21963 = field21963;
        this.field21964 = field21964;
        this.field21966 = field21965;
    }
    
    public void method15930(final String field21967) {
        this.field21967 = field21967;
    }
    
    @Override
    public void method15369() {
        this.field21969 = this.method15421() / 2 - 150;
        this.field21970 = this.method15421() / 2 + 190;
        this.method15431(new Class5657(this, 0, this.field21970 - 80 + 8, Class7869.method25488(13) - 5, 70, 20, Class5046.method15438("gui.back")));
        if (this.field21965 != null) {
            this.method15931();
        }
        else {
            this.method15934(this.field21966);
        }
        this.method15444(true);
    }
    
    public void method15931() {
        for (final Map.Entry<K, Class7424> entry : this.field21965.field28683.entrySet()) {
            final Class7424 class7424 = entry.getValue();
            Class5611 class7425;
            if ((int)entry.getKey() == this.field21965.field28688 && !this.field21965.field28687.equals(Class271.field1472)) {
                class7425 = new Class5660(this, Class5087.field21975.get((int)entry.getKey() - 1), this.method15932((int)entry.getKey()), Class5046.method15438("mco.brokenworld.download"));
            }
            else {
                class7425 = new Class5625(this, Class5087.field21973.get((int)entry.getKey() - 1), this.method15932((int)entry.getKey()), Class5046.method15438("mco.brokenworld.play"));
            }
            if (this.field21977.contains(entry.getKey())) {
                class7425.method16917(false);
                class7425.method16925(Class5046.method15438("mco.brokenworld.downloaded"));
            }
            this.method15431(class7425);
            this.method15431(new Class5667(this, Class5087.field21974.get((int)entry.getKey() - 1), this.method15932((int)entry.getKey()), Class7869.method25488(10), 80, 20, Class5046.method15438("mco.brokenworld.reset")));
        }
    }
    
    @Override
    public void method15375() {
        ++this.field21978;
    }
    
    @Override
    public void method15383(final int n, final int n2, final float n3) {
        this.method15413();
        super.method15383(n, n2, n3);
        this.method15405(this.field21967, this.method15421() / 2, 17, 16777215);
        final String[] split = this.field21968.split("\\\\n");
        for (int i = 0; i < split.length; ++i) {
            this.method15405(split[i], this.method15421() / 2, Class7869.method25488(-1) + 3 + i * 12, 10526880);
        }
        if (this.field21965 != null) {
            for (final Map.Entry<K, Class7424> entry : this.field21965.field28683.entrySet()) {
                if (entry.getValue().field28609 != null && entry.getValue().field28608 != -1L) {
                    this.method15937(this.method15932((int)entry.getKey()), Class7869.method25488(1) + 5, n, n2, this.field21965.field28688 == (int)entry.getKey() && !this.method15936(), entry.getValue().method22842((int)entry.getKey()), (int)entry.getKey(), entry.getValue().field28608, entry.getValue().field28609, entry.getValue().field28611);
                }
                else {
                    this.method15937(this.method15932((int)entry.getKey()), Class7869.method25488(1) + 5, n, n2, this.field21965.field28688 == (int)entry.getKey() && !this.method15936(), entry.getValue().method22842((int)entry.getKey()), (int)entry.getKey(), -1L, null, entry.getValue().field28611);
                }
            }
        }
    }
    
    private int method15932(final int n) {
        return this.field21969 + (n - 1) * 110;
    }
    
    @Override
    public void method15442() {
        this.method15444(false);
    }
    
    @Override
    public boolean method15376(final int n, final int n2, final int n3) {
        if (n != 256) {
            return super.method15376(n, n2, n3);
        }
        this.method15933();
        return true;
    }
    
    private void method15933() {
        Class7847.method25362(this.field21963);
    }
    
    private void method15934(final long n) {
        new Thread(() -> {
            Class9513.method35444();
            try {
                final Class9513 class9513;
                this.field21965 = class9513.method35449(n2);
                this.method15931();
            }
            catch (final Class2330 class9514) {
                Class5087.field21962.error("Couldn't get own world");
                Class7847.method25362(new Class5074(class9514.getMessage(), this.field21963));
            }
            catch (final IOException ex) {
                Class5087.field21962.error("Couldn't parse response getting own world");
            }
        }).start();
    }
    
    @Override
    public void method15437(final boolean b, final int n) {
        if (b) {
            if (n != 13 && n != 14) {
                if (!Class5087.field21975.contains(n)) {
                    if (Class5087.field21976.contains(n)) {
                        this.field21977.add(Class5087.field21976.indexOf(n) + 1);
                        this.method15427();
                        this.method15931();
                    }
                }
                else {
                    this.method15935(Class5087.field21975.indexOf(n) + 1);
                }
            }
            else {
                new Thread(() -> {
                    Class9513.method35444();
                    if (this.field21965.field28679.equals(Class2153.field12791)) {
                        final Class5049 class5049 = new Class5049(this, new Class1342(this.field21965, this, this.field21963, true));
                        class5049.method15466();
                        Class7847.method25362(class5049);
                    }
                    else {
                        try {
                            final Class9513 class5050;
                            this.field21964.method15796().method15781(class5050.method35449(this.field21966), this);
                        }
                        catch (final Class2330 class5051) {
                            Class5087.field21962.error("Couldn't get own world");
                            Class7847.method25362(this.field21963);
                        }
                        catch (final IOException ex) {
                            Class5087.field21962.error("Couldn't parse response getting own world");
                            Class7847.method25362(this.field21963);
                        }
                    }
                }).start();
            }
        }
        else {
            Class7847.method25362(this);
        }
    }
    
    private void method15935(final int i) {
        final Class9513 method35444 = Class9513.method35444();
        try {
            final Class5047 class5047 = new Class5047(this, method35444.method35476(this.field21965.field28675, i), this.field21965.field28677 + " (" + this.field21965.field28683.get(i).method22842(i) + ")");
            class5047.method15449(Class5087.field21976.get(i - 1));
            Class7847.method25362(class5047);
        }
        catch (final Class2330 class5048) {
            Class5087.field21962.error("Couldn't download world data");
            Class7847.method25362(new Class5074(class5048, this));
        }
    }
    
    private boolean method15936() {
        return this.field21965 != null && this.field21965.field28687.equals(Class271.field1472);
    }
    
    private void method15937(final int n, final int n2, final int n3, final int n4, final boolean b, final String s, final int n5, final long l, final String s2, final boolean b2) {
        if (!b2) {
            if (s2 != null && l != -1L) {
                Class8952.method31758(String.valueOf(l), s2);
            }
            else if (n5 != 1) {
                if (n5 != 2) {
                    if (n5 != 3) {
                        Class8952.method31758(String.valueOf(this.field21965.field28690), this.field21965.field28691);
                    }
                    else {
                        Class5046.method15419("textures/gui/title/background/panorama_3.png");
                    }
                }
                else {
                    Class5046.method15419("textures/gui/title/background/panorama_2.png");
                }
            }
            else {
                Class5046.method15419("textures/gui/title/background/panorama_0.png");
            }
        }
        else {
            Class5046.method15419("realms:textures/gui/realms/empty_frame.png");
        }
        if (b) {
            if (b) {
                final float n6 = 0.9f + 0.1f * Class8269.method27478(this.field21978 * 0.2f);
                Class8726.method30068(n6, n6, n6, 1.0f);
            }
        }
        else {
            Class8726.method30068(0.56f, 0.56f, 0.56f, 1.0f);
        }
        Class5046.method15411(n + 3, n2 + 3, 0.0f, 0.0f, 74, 74, 74, 74);
        Class5046.method15419("realms:textures/gui/realms/slot_frame.png");
        if (!b) {
            Class8726.method30068(0.56f, 0.56f, 0.56f, 1.0f);
        }
        else {
            Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        }
        Class5046.method15411(n, n2, 0.0f, 0.0f, 80, 80, 80, 80);
        this.method15405(s, n + 40, n2 + 66, 16777215);
    }
    
    private void method15938(final int n) {
        final Class5049 class5049 = new Class5049(this.field21963, new Class1344(this.field21965.field28675, n, this, 13));
        class5049.method15466();
        Class7847.method25362(class5049);
    }
    
    static {
        field21962 = LogManager.getLogger();
        field21973 = Arrays.asList(1, 2, 3);
        field21974 = Arrays.asList(4, 5, 6);
        field21975 = Arrays.asList(7, 8, 9);
        field21976 = Arrays.asList(10, 11, 12);
    }
}
