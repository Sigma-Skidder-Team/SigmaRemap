// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import com.mojang.datafixers.util.Either;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Objects;
import java.util.stream.Stream;
import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class5045 extends RealmsScreen
{
    private static final Logger field21607;
    private final Class5075<Class7430> field21608;
    private Class5062 field21609;
    private final int field21610;
    private String field21611;
    private Class5611 field21612;
    private Class5611 field21613;
    private Class5611 field21614;
    private String field21615;
    private String field21616;
    private final Class271 field21617;
    private int field21618;
    private String field21619;
    private String field21620;
    private boolean field21621;
    private boolean field21622;
    private List<Class8578> field21623;
    
    public Class5045(final Class5075<Class7430> class5075, final Class271 class5076) {
        this(class5075, class5076, null);
    }
    
    public Class5045(final Class5075<Class7430> field21608, final Class271 field21609, final WorldTemplatePaginatedList class7445) {
        this.field21610 = -1;
        this.field21608 = field21608;
        this.field21617 = field21609;
        if (class7445 != null) {
            this.field21609 = new Class5062(Lists.newArrayList((Iterable)class7445.field28717));
            this.method15381(class7445);
        }
        else {
            this.field21609 = new Class5062(this);
            this.method15381(new WorldTemplatePaginatedList(10));
        }
        this.field21611 = RealmsScreen.getLocalizedString("mco.template.title");
    }
    
    public void method15366(final String field21611) {
        this.field21611 = field21611;
    }
    
    public void method15367(final String field21619) {
        this.field21619 = field21619;
        this.field21621 = true;
    }
    
    @Override
    public boolean mouseClicked(final double n, final double n2, final int n3) {
        if (this.field21622 && this.field21620 != null) {
            Class8428.method28148("https://beta.minecraft.net/realms/adventure-maps-in-1-9");
            return true;
        }
        return super.mouseClicked(n, n2, n3);
    }
    
    @Override
    public void init() {
        this.method15444(true);
        this.field21609 = new Class5062(this.field21609.method15549());
        this.buttonsAdd(this.field21613 = new Class5650(this, 2, this.width() / 2 - 206, this.height() - 32, 100, 20, RealmsScreen.getLocalizedString("mco.template.button.trailer")));
        this.buttonsAdd(this.field21612 = new Class5651(this, 1, this.width() / 2 - 100, this.height() - 32, 100, 20, RealmsScreen.getLocalizedString("mco.template.button.select")));
        this.buttonsAdd(new Class5658(this, 0, this.width() / 2 + 6, this.height() - 32, 100, 20, RealmsScreen.getLocalizedString((this.field21617 != Class271.field1472) ? "gui.back" : "gui.cancel")));
        this.buttonsAdd(this.field21614 = new Class5644(this, 3, this.width() / 2 + 112, this.height() - 32, 100, 20, RealmsScreen.getLocalizedString("mco.template.button.publisher")));
        this.field21612.method16917(false);
        this.field21613.method16919(false);
        this.field21614.method16919(false);
        this.method15428(this.field21609);
        this.method15434(this.field21609);
        Realms.method25384((Iterable<String>)Stream.of(new String[] { this.field21611, this.field21619 }).filter(Objects::nonNull).collect((Collector<? super String, ?, List<? super String>>)Collectors.toList()));
    }
    
    private void method15370() {
        this.field21614.method16919(this.method15372());
        this.field21613.method16919(this.method15374());
        this.field21612.method16917(this.method15371());
    }
    
    private boolean method15371() {
        return this.field21610 != -1;
    }
    
    private boolean method15372() {
        return this.field21610 != -1 && !this.method15373().field28653.isEmpty();
    }
    
    private Class7430 method15373() {
        return this.field21609.method15548(this.field21610);
    }
    
    private boolean method15374() {
        return this.field21610 != -1 && !this.method15373().field28655.isEmpty();
    }
    
    @Override
    public void tick() {
        super.tick();
        --this.field21618;
        if (this.field21618 < 0) {
            this.field21618 = 0;
        }
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        switch (n) {
            case 256: {
                this.method15377();
                return true;
            }
            default: {
                return super.keyPressed(n, n2, n3);
            }
        }
    }
    
    private void method15377() {
        this.field21608.method15677(null);
        Realms.setScreen(this.field21608);
    }
    
    private void method15378() {
        if (this.field21610 >= 0) {
            if (this.field21610 < this.field21609.method15521()) {
                this.field21608.method15677(this.method15373());
            }
        }
    }
    
    private void method15379() {
        if (this.field21610 >= 0) {
            if (this.field21610 < this.field21609.method15521()) {
                final Class7430 method15373 = this.method15373();
                if (!"".equals(method15373.field28655)) {
                    Class8428.method28148(method15373.field28655);
                }
            }
        }
    }
    
    private void method15380() {
        if (this.field21610 >= 0) {
            if (this.field21610 < this.field21609.method15521()) {
                final Class7430 method15373 = this.method15373();
                if (!"".equals(method15373.field28653)) {
                    Class8428.method28148(method15373.field28653);
                }
            }
        }
    }
    
    private void method15381(final WorldTemplatePaginatedList class7445) {
        new Class928(this, "realms-template-fetcher", class7445).start();
    }
    
    private Either<WorldTemplatePaginatedList, String> method15382(final WorldTemplatePaginatedList class7445, final RealmsClient class7446) {
        try {
            return (Either<WorldTemplatePaginatedList, String>)Either.left((Object)class7446.func_224930_a(class7445.field28718 + 1, class7445.field28719, this.field21617));
        }
        catch (final RealmsServiceException class7447) {
            return (Either<WorldTemplatePaginatedList, String>)Either.right((Object)class7447.getMessage());
        }
    }
    
    @Override
    public void render(final int n, final int n2, final float n3) {
        this.field21615 = null;
        this.field21616 = null;
        this.field21622 = false;
        this.method15413();
        this.field21609.method15510(n, n2, n3);
        if (this.field21623 != null) {
            this.method15384(n, n2, this.field21623);
        }
        this.drawCenteredString(this.field21611, this.width() / 2, 13, 16777215);
        if (this.field21621) {
            final String[] split = this.field21619.split("\\\\n");
            for (int i = 0; i < split.length; ++i) {
                final int method15424 = this.method15424(split[i]);
                final int n4 = this.width() / 2 - method15424 / 2;
                final int method15425 = Class7869.method25488(-1 + i);
                if (n >= n4) {
                    if (n <= n4 + method15424) {
                        if (n2 >= method15425) {
                            if (n2 <= method15425 + this.method15423()) {
                                this.field21622 = true;
                            }
                        }
                    }
                }
            }
            for (int j = 0; j < split.length; ++j) {
                String string = split[j];
                int n5 = 10526880;
                if (this.field21620 != null) {
                    if (!this.field21622) {
                        n5 = 3368635;
                    }
                    else {
                        n5 = 7107012;
                        string = "§n" + string;
                    }
                }
                this.drawCenteredString(string, this.width() / 2, Class7869.method25488(-1 + j), n5);
            }
        }
        super.render(n, n2, n3);
        if (this.field21615 != null) {
            this.method15385(this.field21615, n, n2);
        }
    }
    
    private void method15384(final int n, final int n2, final List<Class8578> list) {
        for (int i = 0; i < list.size(); ++i) {
            final Class8578 class8578 = list.get(i);
            final int method25488 = Class7869.method25488(4 + i);
            int n3 = this.width() / 2 - class8578.field36061.stream().mapToInt(class8580 -> this.method15424(class8580.method19064())).sum() / 2;
            for (final Class6387 class8579 : class8578.field36061) {
                final int method25489 = this.method15406(class8579.method19064(), n3, method25488, class8579.method19065() ? 3368635 : 16777215, true);
                if (class8579.method19065()) {
                    if (n > n3) {
                        if (n < method25489) {
                            if (n2 > method25488 - 3) {
                                if (n2 < method25488 + 8) {
                                    this.field21615 = class8579.method19066();
                                    this.field21616 = class8579.method19066();
                                }
                            }
                        }
                    }
                }
                n3 = method25489;
            }
        }
    }
    
    public void method15385(final String s, final int n, final int n2) {
        if (s != null) {
            final int n3 = n + 12;
            final int n4 = n2 - 12;
            this.method15412(n3 - 3, n4 - 3, n3 + this.method15424(s) + 3, n4 + 8 + 3, -1073741824, -1073741824);
            this.method15425(s, n3, n4, 16777215);
        }
    }
    
    static {
        field21607 = LogManager.getLogger();
    }
}
