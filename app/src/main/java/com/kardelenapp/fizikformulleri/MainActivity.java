package com.kardelenapp.fizikformulleri;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.webkit.WebViewFragment;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.google.android.gms.ads.AdView;
import com.mikepenz.materialdrawer.Drawer;
import com.mikepenz.materialdrawer.DrawerBuilder;
import com.mikepenz.materialdrawer.holder.BadgeStyle;
import com.mikepenz.materialdrawer.model.DividerDrawerItem;
import com.mikepenz.materialdrawer.model.ExpandableBadgeDrawerItem;
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem;
import com.mikepenz.materialdrawer.model.SecondaryDrawerItem;
import com.mikepenz.materialdrawer.model.interfaces.IDrawerItem;



public class MainActivity extends AppCompatActivity {
    Toolbar toolbar;
    LinearLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar =  (Toolbar) findViewById(R.id.toolbar_item);

        AdsController adsController = new AdsController(this);
        layout = (LinearLayout) findViewById(R.id.adsContainer);
        adsController.loadBanner(layout);

        final AnaSayfaFragment newFragment = new AnaSayfaFragment();
        final HakkindaFragment hakkindaFragment = new HakkindaFragment();
        final VektorlerFragment vektorlerFragment = new VektorlerFragment();
        final VektorlerOzelFragment vektorlerOzelFragment = new VektorlerOzelFragment();
        final KuvvetDengeFragment kuvvetDengeFragment = new KuvvetDengeFragment();
        final TorkFragment torkFragment = new TorkFragment();
        final MaddeOzellikleriFragment maddeOzellikleriFragment = new MaddeOzellikleriFragment();
        final MomentFragment momentFragment = new MomentFragment();
        final AgirlikMerkeziFragment agirlikMerkeziFragment = new AgirlikMerkeziFragment();
        final BasitMakinelerFragment basitMakinelerFragment = new BasitMakinelerFragment();
        final BasincFragment basincFragment = new BasincFragment();
        final OptikFragment optikFragment = new OptikFragment();
        final DinamikFragment dinamikFragment = new DinamikFragment();
        final AtislarFragment atislarFragment = new AtislarFragment();
        final IsGucEnerjiFragment isGucEnerjiFragment = new IsGucEnerjiFragment();
        final EnerjininKorunumuFragment enerjininKorunumuFragment = new EnerjininKorunumuFragment();
        final DuzgunDaireselFragment duzgunDaireselFragment = new DuzgunDaireselFragment();
        final BasitHarmonikHareketler basitHarmonikHareketler = new BasitHarmonikHareketler();
        final ItmeVeMomentumFragment itmeVeMomentumfragment = new ItmeVeMomentumFragment();
        final CarpismalarFragment carpismalarFragment = new CarpismalarFragment();
        final ElektrostatikFragment elektrostatikFragment = new ElektrostatikFragment();
        final MagnetizmaFragment magnetizmaFragment = new MagnetizmaFragment();
        final KondansatorlerFragment kondansatorlerFragment = new KondansatorlerFragment();
        final ElektrikFragment elektrikFragment = new ElektrikFragment();
        final ElektromotorKuvvetiFragment elektromotorKuvvetiFragment = new ElektromotorKuvvetiFragment();
        final DalgaFragment dalgaFragment = new DalgaFragment();
        final FotoelektrikFragment fotoelektrikFragment = new FotoelektrikFragment();
        final ComptonFragment comptonFragment = new ComptonFragment();
        final DeBroglieFragment deBroglieFragment = new DeBroglieFragment();
        final AtomModeliFragment atomModeliFragment = new AtomModeliFragment();
        final AtomEnerjisiFragment atomEnerjisiFragment = new AtomEnerjisiFragment();
        final AtomCekirdegiFragment atomCekirdegiFragment = new AtomCekirdegiFragment();



        final FragmentManager fragmentManager = getFragmentManager();
        final FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.add(R.id.fragment, newFragment, "Ana Sayfa");
        fragmentTransaction.commit();

        final PrimaryDrawerItem hakkinda = new PrimaryDrawerItem().withIdentifier(1).withName("Hakkında");
        final PrimaryDrawerItem home = new PrimaryDrawerItem().withIdentifier(1).withName("Ana Ekran");
        final SecondaryDrawerItem vektorler = new SecondaryDrawerItem().withIdentifier(2).withName("Vektörler");
        final SecondaryDrawerItem vektorler_ozel = new SecondaryDrawerItem().withIdentifier(1).withName("Vektörlerde Özel Durumlar ");
        final SecondaryDrawerItem kuvvetDenge = new SecondaryDrawerItem().withIdentifier(2).withName("Kuvvet ve Denge");
        final SecondaryDrawerItem torkDenge = new SecondaryDrawerItem().withIdentifier(2).withName("Tork ve Denge");
        final SecondaryDrawerItem madde = new SecondaryDrawerItem().withIdentifier(2).withName("Madde ve Özellikleri");
        final SecondaryDrawerItem moment = new SecondaryDrawerItem().withIdentifier(2).withName("Moment");
        final SecondaryDrawerItem agirlik_merkezi = new SecondaryDrawerItem().withIdentifier(2).withName("Ağırlık Merkezi");
        final SecondaryDrawerItem basit_makinalar = new SecondaryDrawerItem().withIdentifier(2).withName("Basit Makinalar");
        final SecondaryDrawerItem basinc = new SecondaryDrawerItem().withIdentifier(2).withName("Basınç");
        final SecondaryDrawerItem optik = new SecondaryDrawerItem().withIdentifier(2).withName("Optik").withIcon(R.drawable.optik_icon);
        final SecondaryDrawerItem dinamik = new SecondaryDrawerItem().withIdentifier(2).withName("Dinamik");
        final SecondaryDrawerItem atislar = new SecondaryDrawerItem().withIdentifier(2).withName("Atışlar");
        final SecondaryDrawerItem is_guc_enerji = new SecondaryDrawerItem().withIdentifier(2).withName("İş Güç Enerji");
        final SecondaryDrawerItem enerjinin_korunumu = new SecondaryDrawerItem().withIdentifier(2).withName("Enerjinin Korunumu");
        final SecondaryDrawerItem duzgun_dairesel_harket = new SecondaryDrawerItem().withIdentifier(2).withName("Düzgün Dairesel Hareket");
        final SecondaryDrawerItem basit_harmonik_hareket = new SecondaryDrawerItem().withIdentifier(2).withName("Basit Harmonik Hareket");
        final SecondaryDrawerItem itme_momentum = new SecondaryDrawerItem().withIdentifier(2).withName("İtme ve Momentum");
        final SecondaryDrawerItem carpismalar = new SecondaryDrawerItem().withIdentifier(2).withName("Çarpışmalar");
        final SecondaryDrawerItem elektrostatik = new SecondaryDrawerItem().withIdentifier(2).withName("Elektrostatik");
        final SecondaryDrawerItem magnetizma = new SecondaryDrawerItem().withIdentifier(2).withName("Magnetizma");
        final SecondaryDrawerItem kondansatorler = new SecondaryDrawerItem().withIdentifier(2).withName("Kondansatörler");
        final SecondaryDrawerItem elektrik = new SecondaryDrawerItem().withIdentifier(2).withName("Elektrik");
        final SecondaryDrawerItem emk = new SecondaryDrawerItem().withIdentifier(2).withName("EMK");
        final SecondaryDrawerItem dalgalar = new SecondaryDrawerItem().withIdentifier(2).withName("Dalgalar");
        final SecondaryDrawerItem fotoelektrik_olay = new SecondaryDrawerItem().withIdentifier(2).withName("Fotoelektrik Olay");
        final SecondaryDrawerItem compton_olay = new SecondaryDrawerItem().withIdentifier(2).withName("Compton Olay");
        final SecondaryDrawerItem de_brogle_dalgaboyu = new SecondaryDrawerItem().withIdentifier(2).withName("de Brogle Dalgaboyu");
        final SecondaryDrawerItem atom_modeli = new SecondaryDrawerItem().withIdentifier(2).withName("Atom Modeli");
        final SecondaryDrawerItem atom_enerji_seviyeleri = new SecondaryDrawerItem().withIdentifier(2).withName("Atom Enerji Seviyeleri");
        final SecondaryDrawerItem atom_cekrdegi_yapisi = new SecondaryDrawerItem().withIdentifier(2).withName("Atom Çekirdeği Yapısı");

        ExpandableBadgeDrawerItem Vektorler =  new ExpandableBadgeDrawerItem().withName("Vektorler").withIdentifier(1).withSelectable(false).withBadgeStyle(new BadgeStyle().withTextColor(Color.WHITE).withColorRes(R.color.md_red_700)).withBadge("2").withIcon(R.drawable.vektor_icon);
        ExpandableBadgeDrawerItem Mekanik =  new ExpandableBadgeDrawerItem().withName("Mekanik").withIdentifier(2).withSelectable(false).withBadgeStyle(new BadgeStyle().withTextColor(Color.WHITE).withColorRes(R.color.md_red_700)).withBadge("12").withIcon(R.drawable.mekanik_icon);;
        ExpandableBadgeDrawerItem Elektromanyetizma =  new ExpandableBadgeDrawerItem().withName("Elektromanyetizma").withIdentifier(2).withSelectable(false).withBadgeStyle(new BadgeStyle().withTextColor(Color.WHITE).withColorRes(R.color.md_red_700)).withBadge("5").withIcon(R.drawable.magnetizma_icon);;
        ExpandableBadgeDrawerItem AtomFizigi =  new ExpandableBadgeDrawerItem().withName("Atom fiziği").withIdentifier(2).withSelectable(false).withBadgeStyle(new BadgeStyle().withTextColor(Color.WHITE).withColorRes(R.color.md_red_700)).withBadge("3").withIcon(R.drawable.atom_icon);;
        ExpandableBadgeDrawerItem Enerji =  new ExpandableBadgeDrawerItem().withName("Enerji").withIdentifier(2).withSelectable(false).withBadgeStyle(new BadgeStyle().withTextColor(Color.WHITE).withColorRes(R.color.md_red_700)).withBadge("2").withIcon(R.drawable.enerji_icon);;
        ExpandableBadgeDrawerItem Dalgalar =  new ExpandableBadgeDrawerItem().withName("Dalgalar").withIdentifier(2).withSelectable(false).withBadgeStyle(new BadgeStyle().withTextColor(Color.WHITE).withColorRes(R.color.md_red_700)).withBadge("3").withIcon(R.drawable.dalga_icon);;

        final DrawerBuilder result = new DrawerBuilder();
        final Drawer drawer = result.withActivity(this)
                .withToolbar(toolbar)
                .withTranslucentStatusBar(false)
                .withActionBarDrawerToggle(true)
                .withActionBarDrawerToggleAnimated(true)
                .withFullscreen(false)
                .withHeaderPadding(true)
                .withCloseOnClick(true)
                .withRootView(R.id.relative)
                .withDrawerLayout(R.layout.material_drawer_fits_not)
                .withDisplayBelowStatusBar(false).build();


          result.addDrawerItems(
                  home,
                  Vektorler.withSubItems(
                              vektorler,
                              vektorler_ozel
                      ),
                  AtomFizigi.withSubItems(
                          atom_modeli,
                          atom_enerji_seviyeleri,
                          atom_cekrdegi_yapisi
                  ),
                  Elektromanyetizma.withSubItems(
                          magnetizma,
                          elektrostatik,
                          kondansatorler,
                          elektrik,
                          emk
                  ),
                  Mekanik.withSubItems(
                          kuvvetDenge,
                          torkDenge,
                          agirlik_merkezi,
                          basit_makinalar,
                          madde,
                          dinamik,
                          moment,
                          carpismalar,
                          itme_momentum,
                          duzgun_dairesel_harket,
                          basit_harmonik_hareket,
                          basinc
                  ),
                  Enerji.withSubItems(
                          is_guc_enerji,
                          enerjinin_korunumu
                  ),
                  Dalgalar.withSubItems(
                          dalgalar,
                          compton_olay,
                          de_brogle_dalgaboyu
                  ),
                  optik,
                  hakkinda
                )
                .withOnDrawerItemClickListener(new Drawer.OnDrawerItemClickListener() {
                    @Override
                    public boolean onItemClick(View view, int position, IDrawerItem drawerItem) {
                        if(drawerItem==home){
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, newFragment, "Ana Sayfa");
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();

                        }
                        else if (drawerItem == vektorler) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, vektorlerFragment    );
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                            Log.v("normal vek","girdi");
                        }else if (drawerItem == vektorler_ozel) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, vektorlerOzelFragment    );
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == kuvvetDenge) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, kuvvetDengeFragment    );
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == hakkinda) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, hakkindaFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == torkDenge) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, torkFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == madde) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, maddeOzellikleriFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == moment) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, momentFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == agirlik_merkezi) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, agirlikMerkeziFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == basit_makinalar) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, basitMakinelerFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == basinc) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, basincFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == optik) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, optikFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == dinamik) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, dinamikFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == atislar) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, atislarFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == is_guc_enerji) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, isGucEnerjiFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == enerjinin_korunumu) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, enerjininKorunumuFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == duzgun_dairesel_harket) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, duzgunDaireselFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == basit_harmonik_hareket) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, basitHarmonikHareketler);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == itme_momentum) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, itmeVeMomentumfragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == carpismalar) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, carpismalarFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == elektrostatik) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, elektrostatikFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == magnetizma) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, magnetizmaFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == kondansatorler) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, kondansatorlerFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == elektrik) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, elektrikFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == emk) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, elektromotorKuvvetiFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == dalgalar) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, dalgaFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == fotoelektrik_olay) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, fotoelektrikFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == compton_olay) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, comptonFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == de_brogle_dalgaboyu) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, deBroglieFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == atom_modeli) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, atomModeliFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == atom_enerji_seviyeleri) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, atomEnerjisiFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }else if (drawerItem == atom_cekrdegi_yapisi) {
                            FragmentTransaction fragmentTransaction =getFragmentManager().beginTransaction();

                            fragmentTransaction.replace(R.id.fragment, atomCekirdegiFragment);
                            fragmentTransaction.addToBackStack(null);

                            fragmentTransaction.commit();
                            drawer.closeDrawer();
                        }
                        return  true;
                    }
                }) ;

    }


}
