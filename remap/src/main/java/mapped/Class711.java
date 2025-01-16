// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import com.google.common.collect.Lists;

public class Class711 extends Class703
{
    private Class616 field3885;
    private Class617 field3886;
    private boolean field3887;
    
    public Class711(final Screen class527, final Class5760 class528) {
        super(class527, class528, new Class2259("resourcePack.title", new Object[0]));
    }
    
    @Override
    public void init() {
        this.method3029(new Class654(this.width / 2 - 154, this.height - 48, 150, 20, Class8822.method30773("resourcePack.openFolder", new Object[0]), class654 -> Util.method27845().method978(this.minecraft.method5294())));
        this.method3029(new Class654(this.width / 2 + 4, this.height - 48, 150, 20, Class8822.method30773("gui.done", new Object[0]), class654 -> {
            if (!this.field3887) {
                this.minecraft.method5244(this.field3868);
            }
            else {
                final ArrayList arrayList = Lists.newArrayList();
                final Iterator<Class632> iterator = this.field3886.children().iterator();
                while (iterator.hasNext()) {
                    arrayList.add(iterator.next().method3645());
                }
                Collections.reverse(arrayList);
                this.minecraft.method5292().method7608(arrayList);
                this.field3869.field23387.clear();
                this.field3869.field23388.clear();
                for (final Class1922 class655 : arrayList) {
                    if (class655.method7623()) {
                        continue;
                    }
                    this.field3869.field23387.add(class655.method7621());
                    if (class655.method7619().method8043()) {
                        continue;
                    }
                    this.field3869.field23388.add(class655.method7621());
                }
                this.field3869.method17121();
                this.minecraft.method5244(this.field3868);
                this.minecraft.method5241();
            }
        }));
        final Class616 field3885 = this.field3885;
        final Class617 field3886 = this.field3886;
        (this.field3885 = new Class616(this.minecraft, 200, this.height)).method3541(this.width / 2 - 4 - 200);
        if (field3885 != null) {
            this.field3885.children().addAll(field3885.children());
        }
        this.children.add(this.field3885);
        (this.field3886 = new Class617(this.minecraft, 200, this.height)).method3541(this.width / 2 + 4);
        if (field3886 != null) {
            field3886.children().forEach(class632 -> {
                this.field3886.children().add(class632);
                class632.method3640(this.field3886);
                return;
            });
        }
        this.children.add(this.field3886);
        if (!this.field3887) {
            this.field3885.children().clear();
            this.field3886.children().clear();
            final Class1920<Class1922> method5292 = this.minecraft.method5292();
            method5292.method7606();
            final ArrayList arrayList = Lists.newArrayList((Iterable)method5292.method7609());
            arrayList.removeAll(method5292.method7611());
            final Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                this.field3885.method3590(new Class632(this.field3885, this, (Class1922)iterator.next()));
            }
            final Iterator iterator2 = Lists.reverse((List)Lists.newArrayList((Iterable)method5292.method7611())).iterator();
            while (iterator2.hasNext()) {
                this.field3886.method3590(new Class632(this.field3886, this, (Class1922)iterator2.next()));
            }
        }
    }
    
    public void method3924(final Class632 class632) {
        this.field3885.children().remove(class632);
        class632.method3639(this.field3886);
        this.method3927();
    }
    
    public void method3925(final Class632 class632) {
        this.field3886.children().remove(class632);
        this.field3885.method3590(class632);
        this.method3927();
    }
    
    public boolean method3926(final Class632 class632) {
        return this.field3886.children().contains(class632);
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3043(0);
        this.field3885.method2975(n, n2, n3);
        this.field3886.method2975(n, n2, n3);
        this.method3295(this.font, this.field3148.getFormattedText(), this.width / 2, 16, 16777215);
        this.method3295(this.font, Class8822.method30773("resourcePack.folderInfo", new Object[0]), this.width / 2 - 77, this.height - 26, 8421504);
        super.method2975(n, n2, n3);
    }
    
    public void method3927() {
        this.field3887 = true;
    }
}
